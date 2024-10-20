package deob;

import java.applet.Applet;
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

@ObfuscatedName("bb")
public abstract class class73 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bb.oe")
    public static class73 field1320 = null;

    @ObfuscatedName("bb.or")
    public static int field1311 = 0;

    @ObfuscatedName("bb.oz")
    public static long field1313 = 0L;

    @ObfuscatedName("bb.os")
    public static boolean field1314 = false;

    @ObfuscatedName("bb.og")
    public static int field1316 = 20;

    @ObfuscatedName("bb.ok")
    public static int field1324 = 1;

    @ObfuscatedName("bb.ol")
    public static int field1317 = 0;

    @ObfuscatedName("bb.pe")
    public static long[] field1327 = new long[32];

    @ObfuscatedName("bb.pt")
    public static long[] field1319 = new long[32];

    @ObfuscatedName("bb.pj")
    public static volatile boolean field1321 = true;

    @ObfuscatedName("bb.pu")
    public static int field1322 = 500;

    @ObfuscatedName("bb.py")
    public static volatile boolean field1323 = false;

    @ObfuscatedName("bb.pa")
    public static volatile long field1312 = 0L;

    @ObfuscatedName("bb.pk")
    public static volatile boolean field1325 = true;

    @ObfuscatedName("bb.of")
    public boolean field1315 = false;

    @ObfuscatedName("bb.ny(IIIS)V")
    public final void method1395(int arg0, int arg1, int arg2) {
        try {
            if (field1320 != null) {
                field1311++;
                if (field1311 >= 3) {
                    this.method1414("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1320 = this;
            Statics.field748 = arg0;
            Statics.field1373 = arg1;
            Statics.field1422 = arg2;
            Statics.field1417 = this;
            if (Statics.field1652 == null) {
                Statics.field1652 = new class74();
            }
            Statics.field1652.method1460(this, 1);
        } catch (Exception var5) {
            class80.method2305((String) null, var5);
            this.method1414("crash");
        }
    }

    @ObfuscatedName("bb.nd(I)V")
    public final synchronized void method1396() {
        Container var1;
        if (Statics.field2455 == null) {
            var1 = this;
        } else {
            var1 = Statics.field2455;
        }
        if (Statics.field1272 != null) {
            Statics.field1272.removeFocusListener(this);
            var1.remove(Statics.field1272);
        }
        Statics.field1272 = new class76(this);
        var1.add(Statics.field1272);
        Statics.field1272.setSize(Statics.field748, Statics.field1373);
        Statics.field1272.setVisible(true);
        if (Statics.field2455 == null) {
            Statics.field1272.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field2455.getInsets();
            Statics.field1272.setLocation(var2.left, var2.top);
        }
        Statics.field1272.addFocusListener(this);
        Statics.field1272.requestFocus();
        field1321 = true;
        field1323 = false;
        field1312 = class121.method1250();
    }

    @ObfuscatedName("bb.od(I)Z")
    public final boolean method1411() {
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
                this.method1414("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1332 != null) {
                String var1 = Statics.field1332.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2472;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1414("wrongjava");
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
                        if (class147.method2853(var6) && class147.method1253(var6) < 10) {
                            this.method1414("wrongjava");
                            return;
                        }
                    }
                    field1324 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1396();
            Statics.field1022 = class85.method1318(Statics.field748, Statics.field1373, Statics.field1272);
            this.method250();
            Statics.field2323 = class68.method2624();
            while (field1313 == 0L || class121.method1250() < field1313) {
                Statics.field906 = Statics.field2323.method1310(field1316, field1324);
                for (int var7 = 0; var7 < Statics.field906; var7++) {
                    this.method1397();
                }
                this.method1398();
                Statics.method60(Statics.field1652, Statics.field1272);
            }
        } catch (Exception var9) {
            class80.method2305((String) null, var9);
            this.method1414("crash");
        }
        this.method1399();
    }

    @ObfuscatedName("bb.ox(B)V")
    public void method1397() {
        long var1 = class121.method1250();
        long var3 = field1319[Statics.field1108];
        field1319[Statics.field1108] = var1;
        Statics.field1108 = Statics.field1108 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1100 = field1325;
        }
        this.method251();
    }

    @ObfuscatedName("bb.oc(I)V")
    public void method1398() {
        long var1 = class121.method1250();
        long var3 = field1327[Statics.field333];
        field1327[Statics.field333] = var1;
        Statics.field333 = Statics.field333 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field1317 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field1322 - 1 > 50) {
            field1322 -= 50;
            field1321 = true;
            Statics.field1272.setSize(Statics.field748, Statics.field1373);
            Statics.field1272.setVisible(true);
            if (Statics.field2455 == null) {
                Statics.field1272.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field2455.getInsets();
                Statics.field1272.setLocation(var6.left, var6.top);
            }
        }
        this.method266();
    }

    @ObfuscatedName("bb.oo(I)V")
    public final synchronized void method1399() {
        if (field1314) {
            return;
        }
        field1314 = true;
        try {
            Statics.field1272.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method253();
        } catch (Exception var7) {
        }
        if (Statics.field2455 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1652 != null) {
            try {
                Statics.field1652.method1467();
            } catch (Exception var5) {
            }
        }
        this.method248();
    }

    public void start() {
        if (field1320 == this && !field1314) {
            field1313 = 0L;
        }
    }

    public void stop() {
        if (field1320 == this && !field1314) {
            field1313 = class121.method1250() + 4000L;
        }
    }

    public void destroy() {
        if (field1320 == this && !field1314) {
            field1313 = class121.method1250();
            class126.method112(5000L);
            this.method1399();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1320 != this || field1314) {
            return;
        }
        field1321 = true;
        if (Statics.field2472 != null && Statics.field2472.startsWith("1.5") && class121.method1250() - field1312 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field748 && var2.height >= Statics.field1373) {
                field1323 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1325 = true;
        field1321 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1325 = false;
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

    @ObfuscatedName("ce.ob(ILjava/lang/String;Ljava/awt/Color;B)V")
    public static final void method2084(int arg0, String arg1, Color arg2) {
        try {
            Graphics var3 = Statics.field1272.getGraphics();
            if (Statics.field70 == null) {
                Statics.field70 = new Font("Helvetica", 1, 13);
                Statics.field34 = Statics.field1272.getFontMetrics(Statics.field70);
            }
            if (field1321) {
                field1321 = false;
                var3.setColor(Color.black);
                var3.fillRect(0, 0, Statics.field748, Statics.field1373);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field885 == null) {
                    Statics.field885 = Statics.field1272.createImage(304, 34);
                }
                Graphics var4 = Statics.field885.getGraphics();
                var4.setColor(arg2);
                var4.drawRect(0, 0, 303, 33);
                var4.fillRect(2, 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(1, 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field70);
                var4.setColor(Color.white);
                var4.drawString(arg1, (304 - Statics.field34.stringWidth(arg1)) / 2, 22);
                var3.drawImage(Statics.field885, Statics.field748 / 2 - 152, Statics.field1373 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var6 = Statics.field748 / 2 - 152;
                int var7 = Statics.field1373 / 2 - 18;
                var3.setColor(arg2);
                var3.drawRect(var6, var7, 303, 33);
                var3.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var3.setColor(Color.black);
                var3.drawRect(var6 + 1, var7 + 1, 301, 31);
                var3.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var3.setFont(Statics.field70);
                var3.setColor(Color.white);
                var3.drawString(arg1, var6 + (304 - Statics.field34.stringWidth(arg1)) / 2, var7 + 22);
            }
        } catch (Exception var10) {
            Statics.field1272.repaint();
        }
    }

    @ObfuscatedName("bu.oq(I)V")
    public static final void method1343() {
        Statics.field885 = null;
        Statics.field70 = null;
        Statics.field34 = null;
    }

    @ObfuscatedName("bb.on(Ljava/lang/String;I)V")
    public void method1414(String arg0) {
        if (this.field1315) {
            return;
        }
        this.field1315 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    public abstract void init();

    @ObfuscatedName("bb.s(I)V")
    public abstract void method266();

    @ObfuscatedName("bb.c(I)V")
    public abstract void method250();

    @ObfuscatedName("bb.k(B)V")
    public abstract void method253();

    @ObfuscatedName("bb.a(I)V")
    public abstract void method248();

    @ObfuscatedName("bb.p(I)V")
    public abstract void method251();
}
