package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

@ObfuscatedName("eq")
public abstract class class145 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("eq.pw")
    public static class145 field2193 = null;

    @ObfuscatedName("eq.pg")
    public static int field2176 = 0;

    @ObfuscatedName("eq.pl")
    public static long field2177 = 0L;

    @ObfuscatedName("eq.pa")
    public static boolean field2178 = false;

    @ObfuscatedName("eq.qb")
    public static int field2191 = 20;

    @ObfuscatedName("eq.qt")
    public static int field2181 = 1;

    @ObfuscatedName("eq.qx")
    public static int field2182 = 0;

    @ObfuscatedName("eq.qf")
    public static long[] field2179 = new long[32];

    @ObfuscatedName("eq.qj")
    public static long[] field2184 = new long[32];

    @ObfuscatedName("eq.qr")
    public static int field2185 = 0;

    @ObfuscatedName("eq.qy")
    public static int field2183 = 0;

    @ObfuscatedName("eq.qd")
    public static volatile boolean field2187 = true;

    @ObfuscatedName("eq.qo")
    public static int field2188 = 500;

    @ObfuscatedName("eq.ql")
    public static boolean field2189 = false;

    @ObfuscatedName("eq.qn")
    public static volatile boolean field2190 = false;

    @ObfuscatedName("eq.rl")
    public static volatile long field2180 = 0L;

    @ObfuscatedName("eq.rj")
    public static volatile boolean field2192 = true;

    @ObfuscatedName("eq.pp")
    public boolean field2175 = false;

    @ObfuscatedName("eq.qj(IIII)V")
    public final void method2907(int arg0, int arg1, int arg2) {
        try {
            if (field2193 != null) {
                field2176++;
                if (field2176 >= 3) {
                    this.method2869("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2193 = this;
            Statics.field1027 = arg0;
            Statics.field2170 = arg1;
            Statics.field2207 = arg2;
            Statics.field2211 = this;
            if (Statics.field925 == null) {
                Statics.field925 = new class137();
            }
            Statics.field925.method2741(this, 1);
        } catch (Exception var5) {
            class149.method93((String) null, var5);
            this.method2869("crash");
        }
    }

    @ObfuscatedName("eq.qs(I)V")
    public final synchronized void method2882() {
        Container var1 = this.method2870();
        if (Statics.field1041 != null) {
            Statics.field1041.removeFocusListener(this);
            var1.remove(Statics.field1041);
        }
        Statics.field1027 = Math.max(var1.getWidth(), Statics.field1783);
        Statics.field2170 = Math.max(var1.getHeight(), Statics.field151);
        if (Statics.field1347 != null) {
            Insets var2 = Statics.field1347.getInsets();
            Statics.field1027 -= var2.right + var2.left;
            Statics.field2170 -= var2.top + var2.bottom;
        }
        Statics.field1041 = new class140(this);
        var1.add(Statics.field1041);
        Statics.field1041.setSize(Statics.field1027, Statics.field2170);
        Statics.field1041.setVisible(true);
        if (Statics.field1347 == var1) {
            Insets var3 = Statics.field1347.getInsets();
            Statics.field1041.setLocation(field2185 + var3.left, field2183 + var3.top);
        } else {
            Statics.field1041.setLocation(field2185, field2183);
        }
        Statics.field1041.addFocusListener(this);
        Statics.field1041.requestFocus();
        field2187 = true;
        int var4 = Statics.field1027;
        int var5 = Statics.field2170;
        Canvas var6 = Statics.field1041;
        class78 var8;
        try {
            class82 var7 = new class82();
            var7.method1515(var4, var5, var6);
            var8 = var7;
        } catch (Throwable var12) {
            class76 var10 = new class76();
            var10.method1515(var4, var5, var6);
            var8 = var10;
        }
        if (Statics.field1050 != null) {
            Statics.field1050.method1516(var8.field1363.getGraphics(), 0, 0);
        }
        Statics.field1050 = var8;
        field2190 = false;
        field2180 = class116.method1946();
    }

    @ObfuscatedName("eq.qc(B)Z")
    public final boolean method2901() {
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
                this.method2869("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field660 != null) {
                String var1 = Statics.field660.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2080;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2869("wrongjava");
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
                        if (class164.method2948(var6)) {
                            int var7 = class164.method116(var6, 10, true);
                            if (var7 < 10) {
                                this.method2869("wrongjava");
                                return;
                            }
                        }
                    }
                    field2181 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2882();
            this.method227();
            class134 var8;
            try {
                var8 = new class148();
            } catch (Throwable var12) {
                var8 = new class142();
            }
            Statics.field1889 = var8;
            while (field2177 == 0L || class116.method1946() < field2177) {
                Statics.field254 = Statics.field1889.method2719(field2191, field2181);
                for (int var10 = 0; var10 < Statics.field254; var10++) {
                    this.method2861();
                }
                this.method2862();
                class143.method2681(Statics.field925, Statics.field1041);
            }
        } catch (Exception var13) {
            class149.method93((String) null, var13);
            this.method2869("crash");
        }
        this.method2863();
    }

    @ObfuscatedName("eq.qa(S)V")
    public void method2861() {
        long var1 = class116.method1946();
        long var3 = field2184[Statics.field898];
        field2184[Statics.field898] = var1;
        Statics.field898 = Statics.field898 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1872 = field2192;
        }
        this.method298();
    }

    @ObfuscatedName("eq.qr(I)V")
    public void method2862() {
        Container var1 = this.method2870();
        long var2 = class116.method1946();
        long var4 = field2179[Statics.field1740];
        field2179[Statics.field1740] = var2;
        Statics.field1740 = Statics.field1740 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2182 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2188 - 1 > 50) {
            field2188 -= 50;
            field2187 = true;
            Statics.field1041.setSize(Statics.field1027, Statics.field2170);
            Statics.field1041.setVisible(true);
            if (Statics.field1347 == var1) {
                Insets var7 = Statics.field1347.getInsets();
                Statics.field1041.setLocation(field2185 + var7.left, field2183 + var7.top);
            } else {
                Statics.field1041.setLocation(field2185, field2183);
            }
        }
        this.method229();
    }

    @ObfuscatedName("eq.qy(B)V")
    public final synchronized void method2863() {
        if (field2178) {
            return;
        }
        field2178 = true;
        try {
            Statics.field1041.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method230();
        } catch (Exception var7) {
        }
        if (Statics.field1347 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field925 != null) {
            try {
                Statics.field925.method2738();
            } catch (Exception var5) {
            }
        }
        this.method323();
    }

    public void start() {
        if (field2193 == this && !field2178) {
            field2177 = 0L;
        }
    }

    public void stop() {
        if (field2193 == this && !field2178) {
            field2177 = class116.method1946() + 4000L;
        }
    }

    public void destroy() {
        if (field2193 == this && !field2178) {
            field2177 = class116.method1946();
            class128.method2289(5000L);
            this.method2863();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2193 != this || field2178) {
            return;
        }
        field2187 = true;
        if (Statics.field2080 != null && Statics.field2080.startsWith("1.5") && class116.method1946() - field2180 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1027 && var2.height >= Statics.field2170) {
                field2190 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2192 = true;
        field2187 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2192 = false;
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

    @ObfuscatedName("eq.qh(Ljava/lang/String;B)V")
    public void method2869(String arg0) {
        if (this.field2175) {
            return;
        }
        this.field2175 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("eq.qv(I)Ljava/awt/Container;")
    public Container method2870() {
        return Statics.field1347 == null ? this : Statics.field1347;
    }

    @ObfuscatedName("eq.qi(B)Ljava/awt/Dimension;")
    public Dimension method2871() {
        Container var1 = this.method2870();
        int var2 = Math.max(var1.getWidth(), Statics.field1783);
        int var3 = Math.max(var1.getHeight(), Statics.field151);
        if (Statics.field1347 != null) {
            Insets var4 = Statics.field1347.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    public abstract void init();

    @ObfuscatedName("eq.y(I)V")
    public abstract void method227();

    @ObfuscatedName("eq.r(I)V")
    public abstract void method298();

    @ObfuscatedName("eq.c(B)V")
    public abstract void method229();

    @ObfuscatedName("eq.d(B)V")
    public abstract void method323();

    @ObfuscatedName("eq.l(B)V")
    public abstract void method230();
}
