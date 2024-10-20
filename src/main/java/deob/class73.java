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

@ObfuscatedName("bv")
public abstract class class73 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bv.oi")
    public static class73 field1297 = null;

    @ObfuscatedName("bv.oc")
    public static int field1298 = 0;

    @ObfuscatedName("bv.ob")
    public static long field1299 = 0L;

    @ObfuscatedName("bv.od")
    public static boolean field1300 = false;

    @ObfuscatedName("bv.ow")
    public static int field1302 = 20;

    @ObfuscatedName("bv.ot")
    public static int field1303 = 1;

    @ObfuscatedName("bv.oz")
    public static int field1304 = 0;

    @ObfuscatedName("bv.pi")
    public static long[] field1307 = new long[32];

    @ObfuscatedName("bv.pg")
    public static long[] field1306 = new long[32];

    @ObfuscatedName("bv.pq")
    public static volatile boolean field1313 = true;

    @ObfuscatedName("bv.pa")
    public static int field1308 = 500;

    @ObfuscatedName("bv.pv")
    public static volatile boolean field1309 = false;

    @ObfuscatedName("bv.pj")
    public static volatile long field1310 = 0L;

    @ObfuscatedName("bv.pb")
    public static volatile boolean field1305 = true;

    @ObfuscatedName("bv.ox")
    public boolean field1301 = false;

    @ObfuscatedName("bv.ni(IIIB)V")
    public final void method1439(int arg0, int arg1, int arg2) {
        try {
            if (field1297 != null) {
                field1298++;
                if (field1298 >= 3) {
                    this.method1460("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1297 = this;
            Statics.field182 = arg0;
            Statics.field15 = arg1;
            Statics.field1398 = arg2;
            Statics.field1403 = this;
            if (Statics.field2333 == null) {
                Statics.field2333 = new class74();
            }
            Statics.field2333.method1479(this, 1);
        } catch (Exception var5) {
            class80.method2830((String) null, var5);
            this.method1460("crash");
        }
    }

    @ObfuscatedName("bv.np(I)V")
    public final synchronized void method1423() {
        Container var1;
        if (Statics.field359 == null) {
            var1 = this;
        } else {
            var1 = Statics.field359;
        }
        if (Statics.field1494 != null) {
            Statics.field1494.removeFocusListener(this);
            var1.remove(Statics.field1494);
        }
        Statics.field1494 = new class76(this);
        var1.add(Statics.field1494);
        Statics.field1494.setSize(Statics.field182, Statics.field15);
        Statics.field1494.setVisible(true);
        if (Statics.field359 == null) {
            Statics.field1494.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field359.getInsets();
            Statics.field1494.setLocation(var2.left, var2.top);
        }
        Statics.field1494.addFocusListener(this);
        Statics.field1494.requestFocus();
        field1313 = true;
        field1309 = false;
        field1310 = Statics.method2045();
    }

    @ObfuscatedName("bv.nf(B)Z")
    public final boolean method1419() {
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
                this.method1460("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1314 != null) {
                String var1 = Statics.field1314.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1315;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1460("wrongjava");
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
                        boolean var7 = class147.method64(var6, 10, true);
                        if (var7) {
                            int var8 = class147.method532(var6, 10, true);
                            if (var8 < 10) {
                                this.method1460("wrongjava");
                                return;
                            }
                        }
                    }
                    field1303 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1423();
            Statics.field468 = class85.method2917(Statics.field182, Statics.field15, Statics.field1494);
            this.method365();
            class68 var9;
            try {
                var9 = new class81();
            } catch (Throwable var13) {
                var9 = new class65();
            }
            Statics.field737 = var9;
            while (field1299 == 0L || Statics.method2045() < field1299) {
                Statics.field1231 = Statics.field737.method1340(field1302, field1303);
                for (int var11 = 0; var11 < Statics.field1231; var11++) {
                    this.method1420();
                }
                this.method1464();
                class69.method240(Statics.field2333, Statics.field1494);
            }
        } catch (Exception var14) {
            class80.method2830((String) null, var14);
            this.method1460("crash");
        }
        this.method1418();
    }

    @ObfuscatedName("bv.nw(I)V")
    public void method1420() {
        long var1 = Statics.method2045();
        long var3 = field1306[Statics.field406];
        field1306[Statics.field406] = var1;
        Statics.field406 = Statics.field406 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1029 = field1305;
        }
        this.method273();
    }

    @ObfuscatedName("bv.nz(I)V")
    public void method1464() {
        long var1 = Statics.method2045();
        long var3 = field1307[Statics.field277];
        field1307[Statics.field277] = var1;
        Statics.field277 = Statics.field277 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field1304 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field1308 - 1 > 50) {
            field1308 -= 50;
            field1313 = true;
            Statics.field1494.setSize(Statics.field182, Statics.field15);
            Statics.field1494.setVisible(true);
            if (Statics.field359 == null) {
                Statics.field1494.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field359.getInsets();
                Statics.field1494.setLocation(var6.left, var6.top);
            }
        }
        this.method511();
    }

    @ObfuscatedName("bv.ns(I)V")
    public final synchronized void method1418() {
        if (field1300) {
            return;
        }
        field1300 = true;
        try {
            Statics.field1494.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method275();
        } catch (Exception var7) {
        }
        if (Statics.field359 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field2333 != null) {
            try {
                Statics.field2333.method1495();
            } catch (Exception var5) {
            }
        }
        this.method269();
    }

    public void start() {
        if (field1297 == this && !field1300) {
            field1299 = 0L;
        }
    }

    public void stop() {
        if (field1297 == this && !field1300) {
            field1299 = Statics.method2045() + 4000L;
        }
    }

    public void destroy() {
        if (field1297 == this && !field1300) {
            field1299 = Statics.method2045();
            class126.method1316(5000L);
            this.method1418();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1297 != this || field1300) {
            return;
        }
        field1313 = true;
        if (Statics.field1315 != null && Statics.field1315.startsWith("1.5") && Statics.method2045() - field1310 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field182 && var2.height >= Statics.field15) {
                field1309 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1305 = true;
        field1313 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1305 = false;
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

    @ObfuscatedName("bv.nx(Ljava/lang/String;I)V")
    public void method1460(String arg0) {
        if (this.field1301) {
            return;
        }
        this.field1301 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bv.t(I)V")
    public abstract void method275();

    public abstract void init();

    @ObfuscatedName("bv.d(B)V")
    public abstract void method365();

    @ObfuscatedName("bv.y(I)V")
    public abstract void method273();

    @ObfuscatedName("bv.v(I)V")
    public abstract void method269();

    @ObfuscatedName("bv.x(B)V")
    public abstract void method511();
}
