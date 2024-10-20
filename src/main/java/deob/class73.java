package deob;

import java.applet.Applet;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

@ObfuscatedName("bs")
public abstract class class73 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bs.ob")
    public static class73 field1293 = null;

    @ObfuscatedName("bs.ow")
    public static int field1294 = 0;

    @ObfuscatedName("bs.ox")
    public static long field1304 = 0L;

    @ObfuscatedName("bs.ov")
    public static boolean field1296 = false;

    @ObfuscatedName("bs.oi")
    public static int field1298 = 20;

    @ObfuscatedName("bs.ol")
    public static int field1299 = 1;

    @ObfuscatedName("bs.or")
    public static int field1303 = 0;

    @ObfuscatedName("bs.pn")
    public static long[] field1301 = new long[32];

    @ObfuscatedName("bs.pk")
    public static long[] field1302 = new long[32];

    @ObfuscatedName("bs.pq")
    public static volatile boolean field1300 = true;

    @ObfuscatedName("bs.ps")
    public static int field1295 = 500;

    @ObfuscatedName("bs.pl")
    public static volatile boolean field1305 = false;

    @ObfuscatedName("bs.py")
    public static volatile long field1306 = 0L;

    @ObfuscatedName("bs.pg")
    public static volatile boolean field1307 = true;

    @ObfuscatedName("bs.oa")
    public boolean field1297 = false;

    @ObfuscatedName("bs.ny(IIIB)V")
    public final void method1357(int arg0, int arg1, int arg2) {
        try {
            if (field1293 != null) {
                field1294++;
                if (field1294 >= 3) {
                    this.method1368("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1293 = this;
            Statics.field1715 = arg0;
            Statics.field23 = arg1;
            Statics.field1390 = arg2;
            Statics.field1394 = this;
            if (Statics.field156 == null) {
                Statics.field156 = new class74();
            }
            Statics.field156.method1424(this, 1);
        } catch (Exception var5) {
            class80.method184((String) null, var5);
            this.method1368("crash");
        }
    }

    @ObfuscatedName("bs.nk(I)V")
    public final synchronized void method1358() {
        Container var1;
        if (Statics.field1241 == null) {
            var1 = this;
        } else {
            var1 = Statics.field1241;
        }
        if (Statics.field1830 != null) {
            Statics.field1830.removeFocusListener(this);
            var1.remove(Statics.field1830);
        }
        Statics.field1830 = new class76(this);
        var1.add(Statics.field1830);
        Statics.field1830.setSize(Statics.field1715, Statics.field23);
        Statics.field1830.setVisible(true);
        if (Statics.field1241 == null) {
            Statics.field1830.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field1241.getInsets();
            Statics.field1830.setLocation(var2.left, var2.top);
        }
        Statics.field1830.addFocusListener(this);
        Statics.field1830.requestFocus();
        field1300 = true;
        field1305 = false;
        field1306 = class121.method1471();
    }

    @ObfuscatedName("bs.nl(I)Z")
    public final boolean method1359() {
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
                this.method1368("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1317 != null) {
                String var1 = Statics.field1317.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1309;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1368("wrongjava");
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
                        if (class147.method844(var6)) {
                            int var7 = class147.method1989(var6, 10, true);
                            if (var7 < 10) {
                                this.method1368("wrongjava");
                                return;
                            }
                        }
                    }
                    field1299 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1358();
            Statics.field322 = class85.method2305(Statics.field1715, Statics.field23, Statics.field1830);
            this.method479();
            Statics.field270 = class68.method111();
            while (field1304 == 0L || class121.method1471() < field1304) {
                Statics.field1009 = Statics.field270.method1281(field1298, field1299);
                for (int var8 = 0; var8 < Statics.field1009; var8++) {
                    this.method1411();
                }
                this.method1363();
                class69.method696(Statics.field156, Statics.field1830);
            }
        } catch (Exception var10) {
            class80.method184((String) null, var10);
            this.method1368("crash");
        }
        this.method1376();
    }

    @ObfuscatedName("bs.nz(B)V")
    public void method1411() {
        long var1 = class121.method1471();
        long var3 = field1302[Statics.field432];
        field1302[Statics.field432] = var1;
        Statics.field432 = Statics.field432 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field341 = field1307;
        }
        this.method410();
    }

    @ObfuscatedName("bs.na(B)V")
    public void method1363() {
        long var1 = class121.method1471();
        long var3 = field1301[Statics.field2697];
        field1301[Statics.field2697] = var1;
        Statics.field2697 = Statics.field2697 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field1303 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field1295 - 1 > 50) {
            field1295 -= 50;
            field1300 = true;
            Statics.field1830.setSize(Statics.field1715, Statics.field23);
            Statics.field1830.setVisible(true);
            if (Statics.field1241 == null) {
                Statics.field1830.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field1241.getInsets();
                Statics.field1830.setLocation(var6.left, var6.top);
            }
        }
        this.method233();
    }

    @ObfuscatedName("bs.nt(B)V")
    public final synchronized void method1376() {
        if (field1296) {
            return;
        }
        field1296 = true;
        try {
            Statics.field1830.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method386();
        } catch (Exception var7) {
        }
        if (Statics.field1241 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field156 != null) {
            try {
                Statics.field156.method1418();
            } catch (Exception var5) {
            }
        }
        this.method276();
    }

    public void start() {
        if (field1293 == this && !field1296) {
            field1304 = 0L;
        }
    }

    public void stop() {
        if (field1293 == this && !field1296) {
            field1304 = class121.method1471() + 4000L;
        }
    }

    public void destroy() {
        if (field1293 == this && !field1296) {
            field1304 = class121.method1471();
            class127.method1598(5000L);
            this.method1376();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1293 != this || field1296) {
            return;
        }
        field1300 = true;
        if (Statics.field1309 != null && Statics.field1309.startsWith("1.5") && class121.method1471() - field1306 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1715 && var2.height >= Statics.field23) {
                field1305 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1307 = true;
        field1300 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1307 = false;
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

    @ObfuscatedName("bs.ne(Ljava/lang/String;S)V")
    public void method1368(String arg0) {
        if (this.field1297) {
            return;
        }
        this.field1297 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bs.k(I)V")
    public abstract void method479();

    @ObfuscatedName("bs.x(I)V")
    public abstract void method410();

    @ObfuscatedName("bs.v(I)V")
    public abstract void method233();

    @ObfuscatedName("bs.g(I)V")
    public abstract void method386();

    @ObfuscatedName("bs.r(B)V")
    public abstract void method276();

    public abstract void init();
}
