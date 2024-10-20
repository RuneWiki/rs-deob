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

@ObfuscatedName("bc")
public abstract class class74 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bc.oo")
    public static class74 field1336 = null;

    @ObfuscatedName("bc.oc")
    public static int field1329 = 0;

    @ObfuscatedName("bc.ov")
    public static long field1330 = 0L;

    @ObfuscatedName("bc.oq")
    public static boolean field1331 = false;

    @ObfuscatedName("bc.ol")
    public static int field1333 = 20;

    @ObfuscatedName("bc.os")
    public static int field1334 = 1;

    @ObfuscatedName("bc.ow")
    public static int field1335 = 0;

    @ObfuscatedName("bc.pb")
    public static long[] field1344 = new long[32];

    @ObfuscatedName("bc.pp")
    public static long[] field1339 = new long[32];

    @ObfuscatedName("bc.py")
    public static volatile boolean field1343 = true;

    @ObfuscatedName("bc.pd")
    public static int field1328 = 500;

    @ObfuscatedName("bc.pr")
    public static volatile boolean field1340 = false;

    @ObfuscatedName("bc.pz")
    public static volatile long field1341 = 0L;

    @ObfuscatedName("bc.pg")
    public static volatile boolean field1342 = true;

    @ObfuscatedName("bc.od")
    public boolean field1332 = false;

    @ObfuscatedName("bc.pn(IIII)V")
    public final void method1515(int arg0, int arg1, int arg2) {
        try {
            if (field1336 != null) {
                field1329++;
                if (field1329 >= 3) {
                    this.method1482("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field1336 = this;
            Statics.field2510 = arg0;
            Statics.field368 = arg1;
            Statics.field2488 = arg2;
            Statics.field1423 = this;
            if (Statics.field200 == null) {
                Statics.field200 = new class75();
            }
            Statics.field200.method1546(this, 1);
        } catch (Exception var5) {
            class81.method1452((String) null, var5);
            this.method1482("crash");
        }
    }

    @ObfuscatedName("bc.pw(S)V")
    public final synchronized void method1472() {
        Container var1;
        if (Statics.field1289 == null) {
            var1 = this;
        } else {
            var1 = Statics.field1289;
        }
        if (Statics.field1817 != null) {
            Statics.field1817.removeFocusListener(this);
            var1.remove(Statics.field1817);
        }
        Statics.field1817 = new class77(this);
        var1.add(Statics.field1817);
        Statics.field1817.setSize(Statics.field2510, Statics.field368);
        Statics.field1817.setVisible(true);
        if (Statics.field1289 == null) {
            Statics.field1817.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field1289.getInsets();
            Statics.field1817.setLocation(var2.left, var2.top);
        }
        Statics.field1817.addFocusListener(this);
        Statics.field1817.requestFocus();
        field1343 = true;
        field1340 = false;
        field1341 = class122.method37();
    }

    @ObfuscatedName("bc.pf(I)Z")
    public final boolean method1473() {
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
                this.method1482("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1349 != null) {
                String var1 = Statics.field1349.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1351;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method1482("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class150.method2722(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class150.method2392(var4)) {
                            int var5 = class150.method2723(var4, 10, true);
                            if (var5 < 10) {
                                this.method1482("wrongjava");
                                return;
                            }
                        }
                    }
                    field1334 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method1472();
            Statics.field313 = class86.method5(Statics.field2510, Statics.field368, Statics.field1817);
            this.method426();
            Statics.field2441 = class69.method241();
            while (field1330 == 0L || class122.method37() < field1330) {
                Statics.field936 = Statics.field2441.method1399(field1333, field1334);
                for (int var6 = 0; var6 < Statics.field936; var6++) {
                    this.method1474();
                }
                this.method1475();
                class70.method793(Statics.field200, Statics.field1817);
            }
        } catch (Exception var8) {
            class81.method1452((String) null, var8);
            this.method1482("crash");
        }
        this.method1476();
    }

    @ObfuscatedName("bc.pe(B)V")
    public void method1474() {
        long var1 = class122.method37();
        long var3 = field1339[Statics.field1202];
        field1339[Statics.field1202] = var1;
        Statics.field1202 = Statics.field1202 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field8 = field1342;
        }
        this.method317();
    }

    @ObfuscatedName("bc.py(I)V")
    public void method1475() {
        long var1 = class122.method37();
        long var3 = field1344[Statics.field231];
        field1344[Statics.field231] = var1;
        Statics.field231 = Statics.field231 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field1335 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field1328 - 1 > 50) {
            field1328 -= 50;
            field1343 = true;
            Statics.field1817.setSize(Statics.field2510, Statics.field368);
            Statics.field1817.setVisible(true);
            if (Statics.field1289 == null) {
                Statics.field1817.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field1289.getInsets();
                Statics.field1817.setLocation(var6.left, var6.top);
            }
        }
        this.method291();
    }

    @ObfuscatedName("bc.pj(I)V")
    public final synchronized void method1476() {
        if (field1331) {
            return;
        }
        field1331 = true;
        try {
            Statics.field1817.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method292();
        } catch (Exception var7) {
        }
        if (Statics.field1289 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field200 != null) {
            try {
                Statics.field200.method1542();
            } catch (Exception var5) {
            }
        }
        this.method287();
    }

    @ObfuscatedName("w.pd(I)V")
    public static final void method53() {
        Statics.field2441.method1402();
        for (int var0 = 0; var0 < 32; var0++) {
            field1344[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field1339[var1] = 0L;
        }
        Statics.field936 = 0;
    }

    public void start() {
        if (field1336 == this && !field1331) {
            field1330 = 0L;
        }
    }

    public void stop() {
        if (field1336 == this && !field1331) {
            field1330 = class122.method37() + 4000L;
        }
    }

    public void destroy() {
        if (field1336 == this && !field1331) {
            field1330 = class122.method37();
            class127.method2200(5000L);
            this.method1476();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field1336 != this || field1331) {
            return;
        }
        field1343 = true;
        if (Statics.field1351 != null && Statics.field1351.startsWith("1.5") && class122.method37() - field1341 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field2510 && var2.height >= Statics.field368) {
                field1340 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field1342 = true;
        field1343 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field1342 = false;
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

    @ObfuscatedName("bc.pr(Ljava/lang/String;B)V")
    public void method1482(String arg0) {
        if (this.field1332) {
            return;
        }
        this.field1332 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    public abstract void init();

    @ObfuscatedName("bc.m(B)V")
    public abstract void method426();

    @ObfuscatedName("bc.w(I)V")
    public abstract void method317();

    @ObfuscatedName("bc.a(I)V")
    public abstract void method291();

    @ObfuscatedName("bc.d(I)V")
    public abstract void method292();

    @ObfuscatedName("bc.q(I)V")
    public abstract void method287();
}
