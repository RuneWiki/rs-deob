package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.net.URL;

@ObfuscatedName("bx")
public abstract class class74 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bx.ow")
    public static class74 field1345 = null;

    @ObfuscatedName("bx.ok")
    public static int field1330 = 0;

    @ObfuscatedName("bx.oo")
    public static long field1331 = 0L;

    @ObfuscatedName("bx.ot")
    public static boolean field1332 = false;

    @ObfuscatedName("bx.on")
    public static int field1342 = 20;

    @ObfuscatedName("bx.oe")
    public static int field1335 = 1;

    @ObfuscatedName("bx.ob")
    public static int field1337 = 0;

    @ObfuscatedName("bx.pi")
    public static long[] field1329 = new long[32];

    @ObfuscatedName("bx.pq")
    public static long[] field1338 = new long[32];

    @ObfuscatedName("bx.pn")
    public static volatile boolean field1339 = true;

    @ObfuscatedName("bx.pl")
    public static int field1340 = 500;

    @ObfuscatedName("bx.ps")
    public static volatile boolean field1341 = false;

    @ObfuscatedName("bx.pp")
    public static volatile long field1336 = 0L;

    @ObfuscatedName("bx.pj")
    public static volatile boolean field1343 = true;

    @ObfuscatedName("bx.oa")
    public boolean field1333 = false;

    @ObfuscatedName("bx.oc(IIIB)V")
    public final void method1422(int arg0, int arg1, int arg2) {
        try {
            if (field1345 != null) {
                field1330++;
                if (field1330 >= 3) {
                    this.method1431("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1345 = this;
            Statics.field376 = arg0;
            Statics.field805 = arg1;
            Statics.field227 = arg2;
            Statics.field1436 = this;
            if (Statics.field1483 == null) {
                Statics.field1483 = new class75();
            }
            Statics.field1483.method1495(this, 1);
        } catch (Exception var5) {
            class81.method3159((String) null, var5);
            this.method1431("crash");
        }
    }

    @ObfuscatedName("bx.ov(I)V")
    public final synchronized void method1423() {
        Container var1;
        if (Statics.field1295 == null) {
            var1 = this;
        } else {
            var1 = Statics.field1295;
        }
        if (Statics.field1230 != null) {
            Statics.field1230.removeFocusListener(this);
            var1.remove(Statics.field1230);
        }
        Statics.field1230 = new class77(this);
        var1.add(Statics.field1230);
        Statics.field1230.setSize(Statics.field376, Statics.field805);
        Statics.field1230.setVisible(true);
        if (Statics.field1295 == null) {
            Statics.field1230.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field1295.getInsets();
            Statics.field1230.setLocation(var2.left, var2.top);
        }
        Statics.field1230.addFocusListener(this);
        Statics.field1230.requestFocus();
        field1339 = true;
        field1341 = false;
        field1336 = class122.method195();
    }

    @ObfuscatedName("bx.os(S)Z")
    public final boolean method1479() {
        String var1 = this.getDocumentBase().getHost().toLowerCase();
        if (var1.equals("jagex.com") || var1.endsWith(".jagex.com")) {
            return true;
        } else if (var1.equals("runescape.com") || var1.endsWith(".runescape.com")) {
            return true;
        } else if (var1.equals("mechscape.com") || var1.endsWith(".mechscape.com")) {
            return true;
        } else if (var1.endsWith("127.0.0.1")) {
            return true;
        } else {
            while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
                var1 = var1.substring(0, var1.length() - 1);
            }
            if (var1.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method1431("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1360 != null) {
                String var1 = Statics.field1360.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1347;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1431("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length(); var3++) {
                            char var4 = var2.charAt(var3);
                            boolean var5 = var4 >= '0' && var4 <= '9';
                            if (!var5) {
                                break;
                            }
                        }
                        String var6 = var2.substring(6, var3);
                        boolean var7 = class150.method2993(var6, 10, true);
                        if (var7) {
                            int var8 = class150.method1561(var6, 10, true);
                            if (var8 < 10) {
                                this.method1431("wrongjava");
                                return;
                            }
                        }
                    }
                    field1335 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1423();
            int var9 = Statics.field376;
            int var10 = Statics.field805;
            Canvas var11 = Statics.field1230;
            class86 var13;
            try {
                class89 var12 = new class89();
                var12.method1617(var9, var10, var11);
                var13 = var12;
            } catch (Throwable var18) {
                class84 var15 = new class84();
                var15.method1617(var9, var10, var11);
                var13 = var15;
            }
            Statics.field200 = var13;
            this.method281();
            Statics.field399 = class69.method191();
            while (field1331 == 0L || class122.method195() < field1331) {
                Statics.field907 = Statics.field399.method1338(field1342, field1335);
                for (int var16 = 0; var16 < Statics.field907; var16++) {
                    this.method1424();
                }
                this.method1425();
                class70.method53(Statics.field1483, Statics.field1230);
            }
        } catch (Exception var19) {
            class81.method3159((String) null, var19);
            this.method1431("crash");
        }
        this.method1429();
    }

    @ObfuscatedName("bx.of(I)V")
    public void method1424() {
        long var1 = class122.method195();
        long var3 = field1338[Statics.field1462];
        field1338[Statics.field1462] = var1;
        Statics.field1462 = Statics.field1462 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field217 = field1343;
        }
        this.method282();
    }

    @ObfuscatedName("bx.ou(I)V")
    public void method1425() {
        long var1 = class122.method195();
        long var3 = field1329[Statics.field1211];
        field1329[Statics.field1211] = var1;
        Statics.field1211 = Statics.field1211 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field1337 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field1340 - 1 > 50) {
            field1340 -= 50;
            field1339 = true;
            Statics.field1230.setSize(Statics.field376, Statics.field805);
            Statics.field1230.setVisible(true);
            if (Statics.field1295 == null) {
                Statics.field1230.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field1295.getInsets();
                Statics.field1230.setLocation(var6.left, var6.top);
            }
        }
        this.method283();
    }

    @ObfuscatedName("bx.oq(B)V")
    public final synchronized void method1429() {
        if (field1332) {
            return;
        }
        field1332 = true;
        try {
            Statics.field1230.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method284();
        } catch (Exception var7) {
        }
        if (Statics.field1295 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1483 != null) {
            try {
                Statics.field1483.method1492();
            } catch (Exception var5) {
            }
        }
        this.method278();
    }

    public void start() {
        if (field1345 == this && !field1332) {
            field1331 = 0L;
        }
    }

    public void stop() {
        if (field1345 == this && !field1332) {
            field1331 = class122.method195() + 4000L;
        }
    }

    public void destroy() {
        if (field1345 == this && !field1332) {
            field1331 = class122.method195();
            class127.method1642(5000L);
            this.method1429();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1345 != this || field1332) {
            return;
        }
        field1339 = true;
        if (Statics.field1347 != null && Statics.field1347.startsWith("1.5") && class122.method195() - field1336 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field376 && var2.height >= Statics.field805) {
                field1341 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1343 = true;
        field1339 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1343 = false;
    }

    public final void windowActivated(WindowEvent arg0) {
    }

    public final void windowClosed(WindowEvent arg0) {
    }

    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    public final void windowDeactivated(WindowEvent arg0) {
    }

    public final void windowDeiconified(WindowEvent arg0) {
    }

    public final void windowIconified(WindowEvent arg0) {
    }

    public final void windowOpened(WindowEvent arg0) {
    }

    @ObfuscatedName("aw.or(ILjava/lang/String;Ljava/awt/Color;I)V")
    public static final void method769(int arg0, String arg1, Color arg2) {
        try {
            Graphics var3 = Statics.field1230.getGraphics();
            if (Statics.field417 == null) {
                Statics.field417 = new Font("Helvetica", 1, 13);
                Statics.field387 = Statics.field1230.getFontMetrics(Statics.field417);
            }
            if (field1339) {
                field1339 = false;
                var3.setColor(Color.black);
                var3.fillRect(0, 0, Statics.field376, Statics.field805);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field1637 == null) {
                    Statics.field1637 = Statics.field1230.createImage(304, 34);
                }
                Graphics var4 = Statics.field1637.getGraphics();
                var4.setColor(arg2);
                var4.drawRect(0, 0, 303, 33);
                var4.fillRect(2, 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(1, 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field417);
                var4.setColor(Color.white);
                var4.drawString(arg1, (304 - Statics.field387.stringWidth(arg1)) / 2, 22);
                var3.drawImage(Statics.field1637, Statics.field376 / 2 - 152, Statics.field805 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var6 = Statics.field376 / 2 - 152;
                int var7 = Statics.field805 / 2 - 18;
                var3.setColor(arg2);
                var3.drawRect(var6, var7, 303, 33);
                var3.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var3.setColor(Color.black);
                var3.drawRect(var6 + 1, var7 + 1, 301, 31);
                var3.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var3.setFont(Statics.field417);
                var3.setColor(Color.white);
                var3.drawString(arg1, var6 + (304 - Statics.field387.stringWidth(arg1)) / 2, var7 + 22);
            }
        } catch (Exception var10) {
            Statics.field1230.repaint();
        }
    }

    @ObfuscatedName("bx.oj(Ljava/lang/String;I)V")
    public void method1431(String arg0) {
        if (this.field1333) {
            return;
        }
        this.field1333 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bx.s(B)V")
    public abstract void method278();

    @ObfuscatedName("bx.u(I)V")
    public abstract void method282();

    public abstract void init();

    @ObfuscatedName("bx.e(B)V")
    public abstract void method281();

    @ObfuscatedName("bx.q(B)V")
    public abstract void method283();

    @ObfuscatedName("bx.o(I)V")
    public abstract void method284();
}
