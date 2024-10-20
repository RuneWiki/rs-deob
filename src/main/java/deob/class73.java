package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

@ObfuscatedName("bw")
public abstract class class73 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bw.ol")
    public static class73 field1338 = null;

    @ObfuscatedName("bw.ow")
    public static int field1326 = 0;

    @ObfuscatedName("bw.oo")
    public static long field1342 = 0L;

    @ObfuscatedName("bw.oz")
    public static boolean field1328 = false;

    @ObfuscatedName("bw.ot")
    public static int field1330 = 20;

    @ObfuscatedName("bw.oe")
    public static int field1331 = 1;

    @ObfuscatedName("bw.oh")
    public static int field1336 = 0;

    @ObfuscatedName("bw.pc")
    public static long[] field1333 = new long[32];

    @ObfuscatedName("bw.pa")
    public static long[] field1334 = new long[32];

    @ObfuscatedName("bw.pe")
    public static volatile boolean field1335 = true;

    @ObfuscatedName("bw.pm")
    public static int field1329 = 500;

    @ObfuscatedName("bw.pt")
    public static volatile boolean field1337 = false;

    @ObfuscatedName("bw.pq")
    public static volatile long field1327 = 0L;

    @ObfuscatedName("bw.pn")
    public static volatile boolean field1332 = true;

    @ObfuscatedName("bw.op")
    public boolean field1325 = false;

    @ObfuscatedName("bw.nx(IIIB)V")
    public final void method1414(int arg0, int arg1, int arg2) {
        try {
            if (field1338 != null) {
                field1326++;
                if (field1326 >= 3) {
                    this.method1417("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1338 = this;
            Statics.field991 = arg0;
            Statics.field91 = arg1;
            Statics.field2013 = arg2;
            Statics.field977 = this;
            if (Statics.field271 == null) {
                Statics.field271 = new class74();
            }
            Statics.field271.method1433(this, 1);
        } catch (Exception var5) {
            class80.method789((String) null, var5);
            this.method1417("crash");
        }
    }

    @ObfuscatedName("bw.ny(B)V")
    public final synchronized void method1368() {
        Container var1;
        if (Statics.field2782 == null) {
            var1 = this;
        } else {
            var1 = Statics.field2782;
        }
        if (Statics.field1394 != null) {
            Statics.field1394.removeFocusListener(this);
            var1.remove(Statics.field1394);
        }
        Statics.field1394 = new class76(this);
        var1.add(Statics.field1394);
        Statics.field1394.setSize(Statics.field991, Statics.field91);
        Statics.field1394.setVisible(true);
        if (Statics.field2782 == null) {
            Statics.field1394.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field2782.getInsets();
            Statics.field1394.setLocation(var2.left, var2.top);
        }
        Statics.field1394.addFocusListener(this);
        Statics.field1394.requestFocus();
        field1335 = true;
        field1337 = false;
        field1327 = class121.method2119();
    }

    @ObfuscatedName("bw.nf(I)Z")
    public final boolean method1369() {
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
                this.method1417("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1355 != null) {
                String var1 = Statics.field1355.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1344;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1417("wrongjava");
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
                        if (class148.method2117(var6)) {
                            int var7 = class148.method863(var6, 10, true);
                            if (var7 < 10) {
                                this.method1417("wrongjava");
                                return;
                            }
                        }
                    }
                    field1331 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1368();
            int var8 = Statics.field991;
            int var9 = Statics.field91;
            Canvas var10 = Statics.field1394;
            class85 var12;
            try {
                class88 var11 = new class88();
                var11.method1532(var8, var9, var10);
                var12 = var11;
            } catch (Throwable var17) {
                class83 var14 = new class83();
                var14.method1532(var8, var9, var10);
                var12 = var14;
            }
            Statics.field1197 = var12;
            this.method249();
            Statics.field1542 = Statics.method208();
            while (field1342 == 0L || class121.method2119() < field1342) {
                Statics.field2761 = Statics.field1542.method1294(field1330, field1331);
                for (int var15 = 0; var15 < Statics.field2761; var15++) {
                    this.method1370();
                }
                this.method1371();
                class69.method1179(Statics.field271, Statics.field1394);
            }
        } catch (Exception var18) {
            class80.method789((String) null, var18);
            this.method1417("crash");
        }
        this.method1382();
    }

    @ObfuscatedName("bw.nw(I)V")
    public void method1370() {
        long var1 = class121.method2119();
        long var3 = field1334[Statics.field380];
        field1334[Statics.field380] = var1;
        Statics.field380 = Statics.field380 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field112 = field1332;
        }
        this.method290();
    }

    @ObfuscatedName("bw.no(I)V")
    public void method1371() {
        long var1 = class121.method2119();
        long var3 = field1333[Statics.field1279];
        field1333[Statics.field1279] = var1;
        Statics.field1279 = Statics.field1279 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field1336 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field1329 - 1 > 50) {
            field1329 -= 50;
            field1335 = true;
            Statics.field1394.setSize(Statics.field991, Statics.field91);
            Statics.field1394.setVisible(true);
            if (Statics.field2782 == null) {
                Statics.field1394.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field2782.getInsets();
                Statics.field1394.setLocation(var6.left, var6.top);
            }
        }
        this.method279();
    }

    @ObfuscatedName("bw.ni(I)V")
    public final synchronized void method1382() {
        if (field1328) {
            return;
        }
        field1328 = true;
        try {
            Statics.field1394.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method479();
        } catch (Exception var7) {
        }
        if (Statics.field2782 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field271 != null) {
            try {
                Statics.field271.method1424();
            } catch (Exception var5) {
            }
        }
        this.method247();
    }

    @ObfuscatedName("fz.np(B)V")
    public static final void method3049() {
        Statics.field1542.method1295();
        for (int var0 = 0; var0 < 32; var0++) {
            field1333[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field1334[var1] = 0L;
        }
        Statics.field2761 = 0;
    }

    public void start() {
        if (field1338 == this && !field1328) {
            field1342 = 0L;
        }
    }

    public void stop() {
        if (field1338 == this && !field1328) {
            field1342 = class121.method2119() + 4000L;
        }
    }

    public void destroy() {
        if (field1338 == this && !field1328) {
            field1342 = class121.method2119();
            class126.method577(5000L);
            this.method1382();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1338 != this || field1328) {
            return;
        }
        field1335 = true;
        if (Statics.field1344 != null && Statics.field1344.startsWith("1.5") && class121.method2119() - field1327 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field991 && var2.height >= Statics.field91) {
                field1337 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1332 = true;
        field1335 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1332 = false;
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

    @ObfuscatedName("dn.nl(I)V")
    public static final void method2257() {
        Statics.field247 = null;
        Statics.field279 = null;
        Statics.field56 = null;
    }

    @ObfuscatedName("bw.nc(Ljava/lang/String;I)V")
    public void method1417(String arg0) {
        if (this.field1325) {
            return;
        }
        this.field1325 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    public abstract void init();

    @ObfuscatedName("bw.v(I)V")
    public abstract void method249();

    @ObfuscatedName("bw.g(B)V")
    public abstract void method290();

    @ObfuscatedName("bw.q(I)V")
    public abstract void method247();

    @ObfuscatedName("bw.u(I)V")
    public abstract void method479();

    @ObfuscatedName("bw.x(I)V")
    public abstract void method279();
}
