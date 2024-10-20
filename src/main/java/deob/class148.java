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

@ObfuscatedName("ek")
public abstract class class148 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ek.pn")
    public static class148 field2238 = null;

    @ObfuscatedName("ek.pq")
    public static int field2246 = 0;

    @ObfuscatedName("ek.pa")
    public static long field2232 = 0L;

    @ObfuscatedName("ek.pp")
    public static boolean field2234 = false;

    @ObfuscatedName("ek.pu")
    public static int field2235 = 20;

    @ObfuscatedName("ek.qz")
    public static int field2236 = 1;

    @ObfuscatedName("ek.qc")
    public static int field2237 = 0;

    @ObfuscatedName("ek.qw")
    public static long[] field2252 = new long[32];

    @ObfuscatedName("ek.qo")
    public static long[] field2239 = new long[32];

    @ObfuscatedName("ek.qy")
    public static int field2240 = 0;

    @ObfuscatedName("ek.qr")
    public static int field2241 = 0;

    @ObfuscatedName("ek.qp")
    public static volatile boolean field2230 = true;

    @ObfuscatedName("ek.qh")
    public static int field2243 = 500;

    @ObfuscatedName("ek.qx")
    public static boolean field2231 = false;

    @ObfuscatedName("ek.qf")
    public static volatile boolean field2245 = false;

    @ObfuscatedName("ek.qs")
    public static volatile long field2242 = 0L;

    @ObfuscatedName("ek.rn")
    public static volatile boolean field2247 = true;

    @ObfuscatedName("ek.pc")
    public boolean field2244 = false;

    @ObfuscatedName("ek.ps(IIII)V")
    public final void method2879(int arg0, int arg1, int arg2) {
        try {
            if (field2238 != null) {
                field2246++;
                if (field2246 >= 3) {
                    this.method2886("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2238 = this;
            Statics.field1070 = arg0;
            Statics.field2144 = arg1;
            Statics.field1986 = arg2;
            Statics.field2267 = this;
            if (Statics.field122 == null) {
                Statics.field122 = new class140();
            }
            Statics.field122.method2755(this, 1);
        } catch (Exception var5) {
            class152.method2846((String) null, var5);
            this.method2886("crash");
        }
    }

    @ObfuscatedName("ek.pm(B)V")
    public final synchronized void method2877() {
        Container var1 = this.method2915();
        if (Statics.field1812 != null) {
            Statics.field1812.removeFocusListener(this);
            var1.remove(Statics.field1812);
        }
        Statics.field1070 = Math.max(var1.getWidth(), Statics.field2335);
        Statics.field2144 = Math.max(var1.getHeight(), Statics.field614);
        if (Statics.field2009 != null) {
            Insets var2 = Statics.field2009.getInsets();
            Statics.field1070 -= var2.right + var2.left;
            Statics.field2144 -= var2.top + var2.bottom;
        }
        Statics.field1812 = new class143(this);
        var1.add(Statics.field1812);
        Statics.field1812.setSize(Statics.field1070, Statics.field2144);
        Statics.field1812.setVisible(true);
        if (Statics.field2009 == var1) {
            Insets var3 = Statics.field2009.getInsets();
            Statics.field1812.setLocation(field2240 + var3.left, field2241 + var3.top);
        } else {
            Statics.field1812.setLocation(field2240, field2241);
        }
        Statics.field1812.addFocusListener(this);
        Statics.field1812.requestFocus();
        field2230 = true;
        int var4 = Statics.field1070;
        int var5 = Statics.field2144;
        Canvas var6 = Statics.field1812;
        class81 var8;
        try {
            class85 var7 = new class85();
            var7.method1571(var4, var5, var6);
            var8 = var7;
        } catch (Throwable var12) {
            class79 var10 = new class79();
            var10.method1571(var4, var5, var6);
            var8 = var10;
        }
        if (Statics.field50 != null) {
            Statics.field50.method1547(var8.field1434.getGraphics(), 0, 0);
        }
        Statics.field50 = var8;
        field2245 = false;
        field2242 = class119.method2280();
    }

    @ObfuscatedName("ek.pt(I)Z")
    public final boolean method2943() {
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
                this.method2886("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2138 != null) {
                String var1 = Statics.field2138.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2137;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2886("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class167.method1981(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        boolean var5 = class167.method1213(var4, 10, true);
                        if (var5 && class167.method116(var4) < 10) {
                            this.method2886("wrongjava");
                            return;
                        }
                    }
                    field2236 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2877();
            this.method307();
            Statics.field200 = class137.method2625();
            while (field2232 == 0L || class119.method2280() < field2232) {
                Statics.field753 = Statics.field200.method2729(field2235, field2236);
                for (int var6 = 0; var6 < Statics.field753; var6++) {
                    this.method2904();
                }
                this.method2880();
                class146.method220(Statics.field122, Statics.field1812);
            }
        } catch (Exception var8) {
            class152.method2846((String) null, var8);
            this.method2886("crash");
        }
        this.method2881();
    }

    @ObfuscatedName("ek.pb(I)V")
    public void method2904() {
        long var1 = class119.method2280();
        long var3 = field2239[Statics.field2980];
        field2239[Statics.field2980] = var1;
        Statics.field2980 = Statics.field2980 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1476 = field2247;
        }
        this.method226();
    }

    @ObfuscatedName("ek.pn(I)V")
    public void method2880() {
        Container var1 = this.method2915();
        long var2 = class119.method2280();
        long var4 = field2252[Statics.field156];
        field2252[Statics.field156] = var2;
        Statics.field156 = Statics.field156 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2237 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2243 - 1 > 50) {
            field2243 -= 50;
            field2230 = true;
            Statics.field1812.setSize(Statics.field1070, Statics.field2144);
            Statics.field1812.setVisible(true);
            if (Statics.field2009 == var1) {
                Insets var7 = Statics.field2009.getInsets();
                Statics.field1812.setLocation(field2240 + var7.left, field2241 + var7.top);
            } else {
                Statics.field1812.setLocation(field2240, field2241);
            }
        }
        this.method227();
    }

    @ObfuscatedName("ek.pq(I)V")
    public final synchronized void method2881() {
        if (field2234) {
            return;
        }
        field2234 = true;
        try {
            Statics.field1812.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method228();
        } catch (Exception var7) {
        }
        if (Statics.field2009 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field122 != null) {
            try {
                Statics.field122.method2754();
            } catch (Exception var5) {
            }
        }
        this.method260();
    }

    @ObfuscatedName("cs.pa(I)V")
    public static final void method2075() {
        Statics.field200.method2732();
        for (int var0 = 0; var0 < 32; var0++) {
            field2252[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2239[var1] = 0L;
        }
        Statics.field753 = 0;
    }

    public void start() {
        if (field2238 == this && !field2234) {
            field2232 = 0L;
        }
    }

    public void stop() {
        if (field2238 == this && !field2234) {
            field2232 = class119.method2280() + 4000L;
        }
    }

    public void destroy() {
        if (field2238 == this && !field2234) {
            field2232 = class119.method2280();
            class131.method182(5000L);
            this.method2881();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2238 != this || field2234) {
            return;
        }
        field2230 = true;
        if (Statics.field2137 != null && Statics.field2137.startsWith("1.5") && class119.method2280() - field2242 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1070 && var2.height >= Statics.field2144) {
                field2245 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2247 = true;
        field2230 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2247 = false;
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

    @ObfuscatedName("at.pp(I)V")
    public static final void method908() {
        Statics.field1237 = null;
        Statics.field132 = null;
        Statics.field1029 = null;
    }

    @ObfuscatedName("ek.pc(Ljava/lang/String;I)V")
    public void method2886(String arg0) {
        if (this.field2244) {
            return;
        }
        this.field2244 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ek.py(I)Ljava/awt/Container;")
    public Container method2915() {
        return Statics.field2009 == null ? this : Statics.field2009;
    }

    @ObfuscatedName("ek.pu(I)Ljava/awt/Dimension;")
    public Dimension method2892() {
        Container var1 = this.method2915();
        int var2 = Math.max(var1.getWidth(), Statics.field2335);
        int var3 = Math.max(var1.getHeight(), Statics.field614);
        if (Statics.field2009 != null) {
            Insets var4 = Statics.field2009.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("ek.p(B)V")
    public abstract void method307();

    @ObfuscatedName("ek.g(B)V")
    public abstract void method226();

    @ObfuscatedName("ek.m(B)V")
    public abstract void method227();

    @ObfuscatedName("ek.f(B)V")
    public abstract void method228();

    @ObfuscatedName("ek.t(I)V")
    public abstract void method260();

    public abstract void init();
}
