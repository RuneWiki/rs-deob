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

@ObfuscatedName("bz")
public abstract class class73 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bz.oy")
    public static class73 field1316 = null;

    @ObfuscatedName("bz.or")
    public static int field1310 = 0;

    @ObfuscatedName("bz.oj")
    public static long field1311 = 0L;

    @ObfuscatedName("bz.oi")
    public static boolean field1322 = false;

    @ObfuscatedName("bz.op")
    public static int field1314 = 20;

    @ObfuscatedName("bz.oc")
    public static int field1315 = 1;

    @ObfuscatedName("bz.ot")
    public static int field1309 = 0;

    @ObfuscatedName("bz.pw")
    public static long[] field1317 = new long[32];

    @ObfuscatedName("bz.pc")
    public static long[] field1320 = new long[32];

    @ObfuscatedName("bz.pf")
    public static volatile boolean field1319 = true;

    @ObfuscatedName("bz.py")
    public static int field1312 = 500;

    @ObfuscatedName("bz.pp")
    public static volatile boolean field1323 = false;

    @ObfuscatedName("bz.pe")
    public static volatile long field1321 = 0L;

    @ObfuscatedName("bz.pi")
    public static volatile boolean field1318 = true;

    @ObfuscatedName("bz.of")
    public boolean field1313 = false;

    @ObfuscatedName("bz.or(IIII)V")
    public final void method1446(int arg0, int arg1, int arg2) {
        try {
            if (field1316 != null) {
                field1310++;
                if (field1310 >= 3) {
                    this.method1458("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1316 = this;
            Statics.field281 = arg0;
            Statics.field94 = arg1;
            Statics.field189 = arg2;
            Statics.field1422 = this;
            if (Statics.field1325 == null) {
                Statics.field1325 = new class74();
            }
            Statics.field1325.method1525(this, 1);
        } catch (Exception var5) {
            class80.method562((String) null, var5);
            this.method1458("crash");
        }
    }

    @ObfuscatedName("bz.of(B)V")
    public final synchronized void method1459() {
        Container var1;
        if (Statics.field1339 == null) {
            var1 = this;
        } else {
            var1 = Statics.field1339;
        }
        if (Statics.field310 != null) {
            Statics.field310.removeFocusListener(this);
            var1.remove(Statics.field310);
        }
        Statics.field310 = new class76(this);
        var1.add(Statics.field310);
        Statics.field310.setSize(Statics.field281, Statics.field94);
        Statics.field310.setVisible(true);
        if (Statics.field1339 == null) {
            Statics.field310.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field1339.getInsets();
            Statics.field310.setLocation(var2.left, var2.top);
        }
        Statics.field310.addFocusListener(this);
        Statics.field310.requestFocus();
        field1319 = true;
        field1323 = false;
        field1321 = class121.method142();
    }

    @ObfuscatedName("bz.om(I)Z")
    public final boolean method1448() {
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
                this.method1458("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1338 != null) {
                String var1 = Statics.field1338.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1331;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1458("wrongjava");
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
                        boolean var7 = class147.method222(var6, 10, true);
                        if (var7 && class147.method2752(var6) < 10) {
                            this.method1458("wrongjava");
                            return;
                        }
                    }
                    field1315 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1459();
            int var8 = Statics.field281;
            int var9 = Statics.field94;
            Canvas var10 = Statics.field310;
            class85 var12;
            try {
                class88 var11 = new class88();
                var11.method1629(var8, var9, var10);
                var12 = var11;
            } catch (Throwable var17) {
                class83 var14 = new class83();
                var14.method1629(var8, var9, var10);
                var12 = var14;
            }
            Statics.field819 = var12;
            this.method264();
            Statics.field1684 = class68.method1684();
            while (field1311 == 0L || class121.method142() < field1311) {
                Statics.field112 = Statics.field1684.method1373(field1314, field1315);
                for (int var15 = 0; var15 < Statics.field112; var15++) {
                    this.method1449();
                }
                this.method1450();
                class69.method589(Statics.field1325, Statics.field310);
            }
        } catch (Exception var18) {
            class80.method562((String) null, var18);
            this.method1458("crash");
        }
        this.method1451();
    }

    @ObfuscatedName("bz.op(B)V")
    public void method1449() {
        long var1 = class121.method142();
        long var3 = field1320[Statics.field1118];
        field1320[Statics.field1118] = var1;
        Statics.field1118 = Statics.field1118 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field373 = field1318;
        }
        this.method265();
    }

    @ObfuscatedName("bz.oc(B)V")
    public void method1450() {
        long var1 = class121.method142();
        long var3 = field1317[Statics.field755];
        field1317[Statics.field755] = var1;
        Statics.field755 = Statics.field755 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field1309 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field1312 - 1 > 50) {
            field1312 -= 50;
            field1319 = true;
            Statics.field310.setSize(Statics.field281, Statics.field94);
            Statics.field310.setVisible(true);
            if (Statics.field1339 == null) {
                Statics.field310.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field1339.getInsets();
                Statics.field310.setLocation(var6.left, var6.top);
            }
        }
        this.method440();
    }

    @ObfuscatedName("bz.ot(B)V")
    public final synchronized void method1451() {
        if (field1322) {
            return;
        }
        field1322 = true;
        try {
            Statics.field310.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method346();
        } catch (Exception var7) {
        }
        if (Statics.field1339 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1325 != null) {
            try {
                Statics.field1325.method1506();
            } catch (Exception var5) {
            }
        }
        this.method393();
    }

    public void start() {
        if (field1316 == this && !field1322) {
            field1311 = 0L;
        }
    }

    public void stop() {
        if (field1316 == this && !field1322) {
            field1311 = class121.method142() + 4000L;
        }
    }

    public void destroy() {
        if (field1316 == this && !field1322) {
            field1311 = class121.method142();
            class126.method1440(5000L);
            this.method1451();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1316 != this || field1322) {
            return;
        }
        field1319 = true;
        if (Statics.field1331 != null && Statics.field1331.startsWith("1.5") && class121.method142() - field1321 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field281 && var2.height >= Statics.field94) {
                field1323 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1318 = true;
        field1319 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1318 = false;
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

    @ObfuscatedName("t.od(ILjava/lang/String;Ljava/awt/Color;I)V")
    public static final void method237(int arg0, String arg1, Color arg2) {
        try {
            Graphics var3 = Statics.field310.getGraphics();
            if (Statics.field945 == null) {
                Statics.field945 = new Font("Helvetica", 1, 13);
                Statics.field391 = Statics.field310.getFontMetrics(Statics.field945);
            }
            if (field1319) {
                field1319 = false;
                var3.setColor(Color.black);
                var3.fillRect(0, 0, Statics.field281, Statics.field94);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field1405 == null) {
                    Statics.field1405 = Statics.field310.createImage(304, 34);
                }
                Graphics var4 = Statics.field1405.getGraphics();
                var4.setColor(arg2);
                var4.drawRect(0, 0, 303, 33);
                var4.fillRect(2, 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(1, 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field945);
                var4.setColor(Color.white);
                var4.drawString(arg1, (304 - Statics.field391.stringWidth(arg1)) / 2, 22);
                var3.drawImage(Statics.field1405, Statics.field281 / 2 - 152, Statics.field94 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var6 = Statics.field281 / 2 - 152;
                int var7 = Statics.field94 / 2 - 18;
                var3.setColor(arg2);
                var3.drawRect(var6, var7, 303, 33);
                var3.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var3.setColor(Color.black);
                var3.drawRect(var6 + 1, var7 + 1, 301, 31);
                var3.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var3.setFont(Statics.field945);
                var3.setColor(Color.white);
                var3.drawString(arg1, var6 + (304 - Statics.field391.stringWidth(arg1)) / 2, var7 + 22);
            }
        } catch (Exception var10) {
            Statics.field310.repaint();
        }
    }

    @ObfuscatedName("bz.pa(Ljava/lang/String;B)V")
    public void method1458(String arg0) {
        if (this.field1313) {
            return;
        }
        this.field1313 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    public abstract void init();

    @ObfuscatedName("bz.o(I)V")
    public abstract void method264();

    @ObfuscatedName("bz.g(I)V")
    public abstract void method440();

    @ObfuscatedName("bz.w(I)V")
    public abstract void method346();

    @ObfuscatedName("bz.m(I)V")
    public abstract void method393();

    @ObfuscatedName("bz.l(I)V")
    public abstract void method265();
}
