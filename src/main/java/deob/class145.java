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

@ObfuscatedName("ed")
public abstract class class145 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ed.pr")
    public static class145 field2175 = null;

    @ObfuscatedName("ed.pg")
    public static int field2174 = 0;

    @ObfuscatedName("ed.pz")
    public static long field2179 = 0L;

    @ObfuscatedName("ed.pc")
    public static boolean field2187 = false;

    @ObfuscatedName("ed.qr")
    public static int field2177 = 20;

    @ObfuscatedName("ed.qk")
    public static int field2178 = 1;

    @ObfuscatedName("ed.qa")
    public static int field2185 = 0;

    @ObfuscatedName("ed.qi")
    public static long[] field2180 = new long[32];

    @ObfuscatedName("ed.qb")
    public static long[] field2182 = new long[32];

    @ObfuscatedName("ed.qd")
    public static int field2173 = 0;

    @ObfuscatedName("ed.qy")
    public static int field2183 = 0;

    @ObfuscatedName("ed.qt")
    public static volatile boolean field2184 = true;

    @ObfuscatedName("ed.qn")
    public static int field2172 = 500;

    @ObfuscatedName("ed.qe")
    public static boolean field2186 = false;

    @ObfuscatedName("ed.qx")
    public static volatile boolean field2190 = false;

    @ObfuscatedName("ed.rq")
    public static volatile long field2188 = 0L;

    @ObfuscatedName("ed.rk")
    public static volatile boolean field2189 = true;

    @ObfuscatedName("ed.pt")
    public boolean field2176 = false;

    @ObfuscatedName("ed.pd(IIII)V")
    public final void method2849(int arg0, int arg1, int arg2) {
        try {
            if (field2175 != null) {
                field2174++;
                if (field2174 >= 3) {
                    this.method2839("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2175 = this;
            Statics.field103 = arg0;
            Statics.field902 = arg1;
            Statics.field2206 = arg2;
            Statics.field2203 = this;
            if (Statics.field2154 == null) {
                Statics.field2154 = new class137();
            }
            Statics.field2154.method2706(this, 1);
        } catch (Exception var5) {
            class149.method101((String) null, var5);
            this.method2839("crash");
        }
    }

    @ObfuscatedName("ed.po(I)V")
    public final synchronized void method2831() {
        Container var1 = this.method2840();
        if (Statics.field67 != null) {
            Statics.field67.removeFocusListener(this);
            var1.remove(Statics.field67);
        }
        Statics.field103 = Math.max(var1.getWidth(), Statics.field966);
        Statics.field902 = Math.max(var1.getHeight(), Statics.field725);
        if (Statics.field83 != null) {
            Insets var2 = Statics.field83.getInsets();
            Statics.field103 -= var2.right + var2.left;
            Statics.field902 -= var2.top + var2.bottom;
        }
        Statics.field67 = new class140(this);
        var1.add(Statics.field67);
        Statics.field67.setSize(Statics.field103, Statics.field902);
        Statics.field67.setVisible(true);
        if (Statics.field83 == var1) {
            Insets var3 = Statics.field83.getInsets();
            Statics.field67.setLocation(field2173 + var3.left, field2183 + var3.top);
        } else {
            Statics.field67.setLocation(field2173, field2183);
        }
        Statics.field67.addFocusListener(this);
        Statics.field67.requestFocus();
        field2184 = true;
        int var4 = Statics.field103;
        int var5 = Statics.field902;
        Canvas var6 = Statics.field67;
        class78 var8;
        try {
            class82 var7 = new class82();
            var7.method1504(var4, var5, var6);
            var8 = var7;
        } catch (Throwable var12) {
            class76 var10 = new class76();
            var10.method1504(var4, var5, var6);
            var8 = var10;
        }
        if (Statics.field1364 != null) {
            Statics.field1364.method1515(var8.field1381.getGraphics(), 0, 0);
        }
        Statics.field1364 = var8;
        field2190 = false;
        field2188 = class116.method1579();
    }

    @ObfuscatedName("ed.pr(I)Z")
    public final boolean method2832() {
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
                this.method2839("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2077 != null) {
                String var1 = Statics.field2077.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2072;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2839("wrongjava");
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
                        if (class164.method1769(var6) && class164.method2047(var6) < 10) {
                            this.method2839("wrongjava");
                            return;
                        }
                    }
                    field2178 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2831();
            this.method245();
            class134 var7;
            try {
                var7 = new class148();
            } catch (Throwable var11) {
                var7 = new class142();
            }
            Statics.field1935 = var7;
            while (field2179 == 0L || class116.method1579() < field2179) {
                Statics.field2696 = Statics.field1935.method2678(field2177, field2178);
                for (int var9 = 0; var9 < Statics.field2696; var9++) {
                    this.method2876();
                }
                this.method2879();
                class143.method635(Statics.field2154, Statics.field67);
            }
        } catch (Exception var12) {
            class149.method101((String) null, var12);
            this.method2839("crash");
        }
        this.method2837();
    }

    @ObfuscatedName("ed.pg(B)V")
    public void method2876() {
        long var1 = class116.method1579();
        long var3 = field2182[Statics.field1990];
        field2182[Statics.field1990] = var1;
        Statics.field1990 = Statics.field1990 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1865 = field2189;
        }
        this.method246();
    }

    @ObfuscatedName("ed.pz(S)V")
    public void method2879() {
        Container var1 = this.method2840();
        long var2 = class116.method1579();
        long var4 = field2180[Statics.field141];
        field2180[Statics.field141] = var2;
        Statics.field141 = Statics.field141 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2185 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2172 - 1 > 50) {
            field2172 -= 50;
            field2184 = true;
            Statics.field67.setSize(Statics.field103, Statics.field902);
            Statics.field67.setVisible(true);
            if (Statics.field83 == var1) {
                Insets var7 = Statics.field83.getInsets();
                Statics.field67.setLocation(field2173 + var7.left, field2183 + var7.top);
            } else {
                Statics.field67.setLocation(field2173, field2183);
            }
        }
        this.method247();
    }

    @ObfuscatedName("ed.pc(B)V")
    public final synchronized void method2837() {
        if (field2187) {
            return;
        }
        field2187 = true;
        try {
            Statics.field67.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method268();
        } catch (Exception var7) {
        }
        if (Statics.field83 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field2154 != null) {
            try {
                Statics.field2154.method2703();
            } catch (Exception var5) {
            }
        }
        this.method243();
    }

    public void start() {
        if (field2175 == this && !field2187) {
            field2179 = 0L;
        }
    }

    public void stop() {
        if (field2175 == this && !field2187) {
            field2179 = class116.method1579() + 4000L;
        }
    }

    public void destroy() {
        if (field2175 == this && !field2187) {
            field2179 = class116.method1579();
            class128.method167(5000L);
            this.method2837();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2175 != this || field2187) {
            return;
        }
        field2184 = true;
        if (Statics.field2072 != null && Statics.field2072.startsWith("1.5") && class116.method1579() - field2188 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field103 && var2.height >= Statics.field902) {
                field2190 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2189 = true;
        field2184 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2189 = false;
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

    @ObfuscatedName("ed.pt(Ljava/lang/String;B)V")
    public void method2839(String arg0) {
        if (this.field2176) {
            return;
        }
        this.field2176 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ed.pm(I)Ljava/awt/Container;")
    public Container method2840() {
        return Statics.field83 == null ? this : Statics.field83;
    }

    @ObfuscatedName("ed.qr(I)Ljava/awt/Dimension;")
    public Dimension method2833() {
        Container var1 = this.method2840();
        int var2 = Math.max(var1.getWidth(), Statics.field966);
        int var3 = Math.max(var1.getHeight(), Statics.field725);
        if (Statics.field83 != null) {
            Insets var4 = Statics.field83.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("ed.i(I)V")
    public abstract void method247();

    @ObfuscatedName("ed.x(I)V")
    public abstract void method245();

    @ObfuscatedName("ed.e(I)V")
    public abstract void method246();

    @ObfuscatedName("ed.c(I)V")
    public abstract void method268();

    @ObfuscatedName("ed.m(B)V")
    public abstract void method243();

    public abstract void init();
}
