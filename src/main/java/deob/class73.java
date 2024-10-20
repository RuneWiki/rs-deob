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

@ObfuscatedName("bs")
public abstract class class73 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bs.oi")
    public static class73 field1313 = null;

    @ObfuscatedName("bs.oy")
    public static int field1311 = 0;

    @ObfuscatedName("bs.ot")
    public static long field1312 = 0L;

    @ObfuscatedName("bs.ou")
    public static boolean field1318 = false;

    @ObfuscatedName("bs.op")
    public static int field1315 = 20;

    @ObfuscatedName("bs.oh")
    public static int field1316 = 1;

    @ObfuscatedName("bs.ov")
    public static int field1317 = 0;

    @ObfuscatedName("bs.pg")
    public static long[] field1322 = new long[32];

    @ObfuscatedName("bs.pa")
    public static long[] field1319 = new long[32];

    @ObfuscatedName("bs.pm")
    public static volatile boolean field1320 = true;

    @ObfuscatedName("bs.py")
    public static int field1321 = 500;

    @ObfuscatedName("bs.pu")
    public static volatile boolean field1314 = false;

    @ObfuscatedName("bs.pe")
    public static volatile long field1324 = 0L;

    @ObfuscatedName("bs.ph")
    public static volatile boolean field1310 = true;

    @ObfuscatedName("bs.of")
    public boolean field1323 = false;

    @ObfuscatedName("bs.ov(IIIB)V")
    public final void method1426(int arg0, int arg1, int arg2) {
        try {
            if (field1313 != null) {
                field1311++;
                if (field1311 >= 3) {
                    this.method1440("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1313 = this;
            Statics.field311 = arg0;
            Statics.field1506 = arg1;
            Statics.field2015 = arg2;
            Statics.field1742 = this;
            if (Statics.field1637 == null) {
                Statics.field1637 = new class74();
            }
            Statics.field1637.method1495(this, 1);
        } catch (Exception var5) {
            class80.method210((String) null, var5);
            this.method1440("crash");
        }
    }

    @ObfuscatedName("bs.ow(I)V")
    public final synchronized void method1427() {
        Container var1;
        if (Statics.field1809 == null) {
            var1 = this;
        } else {
            var1 = Statics.field1809;
        }
        if (Statics.field850 != null) {
            Statics.field850.removeFocusListener(this);
            var1.remove(Statics.field850);
        }
        Statics.field850 = new class76(this);
        var1.add(Statics.field850);
        Statics.field850.setSize(Statics.field311, Statics.field1506);
        Statics.field850.setVisible(true);
        if (Statics.field1809 == null) {
            Statics.field850.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field1809.getInsets();
            Statics.field850.setLocation(var2.left, var2.top);
        }
        Statics.field850.addFocusListener(this);
        Statics.field850.requestFocus();
        field1320 = true;
        field1314 = false;
        field1324 = class121.method1389();
    }

    @ObfuscatedName("bs.pf(I)Z")
    public final boolean method1428() {
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
                this.method1440("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1339 != null) {
                String var1 = Statics.field1339.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1326;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1440("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class147.method1614(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class147.method2699(var4) && class147.method2698(var4) < 10) {
                            this.method1440("wrongjava");
                            return;
                        }
                    }
                    field1316 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1427();
            Statics.field1301 = class85.method896(Statics.field311, Statics.field1506, Statics.field850);
            this.method263();
            class68 var5;
            try {
                var5 = new class81();
            } catch (Throwable var9) {
                var5 = new class65();
            }
            Statics.field729 = var5;
            while (field1312 == 0L || class121.method1389() < field1312) {
                Statics.field1294 = Statics.field729.method1350(field1315, field1316);
                for (int var7 = 0; var7 < Statics.field1294; var7++) {
                    this.method1430();
                }
                this.method1432();
                class69.method1875(Statics.field1637, Statics.field850);
            }
        } catch (Exception var10) {
            class80.method210((String) null, var10);
            this.method1440("crash");
        }
        this.method1431();
    }

    @ObfuscatedName("bs.pg(I)V")
    public void method1430() {
        long var1 = class121.method1389();
        long var3 = field1319[Statics.field167];
        field1319[Statics.field167] = var1;
        Statics.field167 = Statics.field167 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1265 = field1310;
        }
        this.method245();
    }

    @ObfuscatedName("bs.pp(I)V")
    public void method1432() {
        long var1 = class121.method1389();
        long var3 = field1322[Statics.field168];
        field1322[Statics.field168] = var1;
        Statics.field168 = Statics.field168 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field1317 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field1321 - 1 > 50) {
            field1321 -= 50;
            field1320 = true;
            Statics.field850.setSize(Statics.field311, Statics.field1506);
            Statics.field850.setVisible(true);
            if (Statics.field1809 == null) {
                Statics.field850.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field1809.getInsets();
                Statics.field850.setLocation(var6.left, var6.top);
            }
        }
        this.method350();
    }

    @ObfuscatedName("bs.pa(I)V")
    public final synchronized void method1431() {
        if (field1318) {
            return;
        }
        field1318 = true;
        try {
            Statics.field850.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method329();
        } catch (Exception var7) {
        }
        if (Statics.field1809 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1637 != null) {
            try {
                Statics.field1637.method1492();
            } catch (Exception var5) {
            }
        }
        this.method237();
    }

    public void start() {
        if (field1313 == this && !field1318) {
            field1312 = 0L;
        }
    }

    public void stop() {
        if (field1313 == this && !field1318) {
            field1312 = class121.method1389() + 4000L;
        }
    }

    public void destroy() {
        if (field1313 == this && !field1318) {
            field1312 = class121.method1389();
            class126.method1326(5000L);
            this.method1431();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1313 != this || field1318) {
            return;
        }
        field1320 = true;
        if (Statics.field1326 != null && Statics.field1326.startsWith("1.5") && class121.method1389() - field1324 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field311 && var2.height >= Statics.field1506) {
                field1314 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1310 = true;
        field1320 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1310 = false;
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

    @ObfuscatedName("o.pn(ILjava/lang/String;Ljava/awt/Color;I)V")
    public static final void method127(int arg0, String arg1, Color arg2) {
        try {
            Graphics var3 = Statics.field850.getGraphics();
            if (Statics.field394 == null) {
                Statics.field394 = new Font("Helvetica", 1, 13);
                Statics.field215 = Statics.field850.getFontMetrics(Statics.field394);
            }
            if (field1320) {
                field1320 = false;
                var3.setColor(Color.black);
                var3.fillRect(0, 0, Statics.field311, Statics.field1506);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (Statics.field108 == null) {
                    Statics.field108 = Statics.field850.createImage(304, 34);
                }
                Graphics var4 = Statics.field108.getGraphics();
                var4.setColor(arg2);
                var4.drawRect(0, 0, 303, 33);
                var4.fillRect(2, 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(1, 1, 301, 31);
                var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field394);
                var4.setColor(Color.white);
                var4.drawString(arg1, (304 - Statics.field215.stringWidth(arg1)) / 2, 22);
                var3.drawImage(Statics.field108, Statics.field311 / 2 - 152, Statics.field1506 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var6 = Statics.field311 / 2 - 152;
                int var7 = Statics.field1506 / 2 - 18;
                var3.setColor(arg2);
                var3.drawRect(var6, var7, 303, 33);
                var3.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var3.setColor(Color.black);
                var3.drawRect(var6 + 1, var7 + 1, 301, 31);
                var3.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var3.setFont(Statics.field394);
                var3.setColor(Color.white);
                var3.drawString(arg1, var6 + (304 - Statics.field215.stringWidth(arg1)) / 2, var7 + 22);
            }
        } catch (Exception var10) {
            Statics.field850.repaint();
        }
    }

    @ObfuscatedName("bz.pv(B)V")
    public static final void method1366() {
        Statics.field108 = null;
        Statics.field394 = null;
        Statics.field215 = null;
    }

    @ObfuscatedName("bs.pj(Ljava/lang/String;B)V")
    public void method1440(String arg0) {
        if (this.field1323) {
            return;
        }
        this.field1323 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bs.b(B)V")
    public abstract void method245();

    public abstract void init();

    @ObfuscatedName("bs.x(I)V")
    public abstract void method263();

    @ObfuscatedName("bs.p(I)V")
    public abstract void method329();

    @ObfuscatedName("bs.k(I)V")
    public abstract void method237();

    @ObfuscatedName("bs.j(I)V")
    public abstract void method350();
}
