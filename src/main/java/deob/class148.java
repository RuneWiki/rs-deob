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

@ObfuscatedName("ep")
public abstract class class148 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ep.px")
    public static class148 field2255 = null;

    @ObfuscatedName("ep.pc")
    public static int field2246 = 0;

    @ObfuscatedName("ep.py")
    public static long field2248 = 0L;

    @ObfuscatedName("ep.pd")
    public static boolean field2252 = false;

    @ObfuscatedName("ep.pi")
    public static int field2251 = 20;

    @ObfuscatedName("ep.qu")
    public static int field2259 = 1;

    @ObfuscatedName("ep.qc")
    public static int field2253 = 0;

    @ObfuscatedName("ep.qd")
    public static long[] field2249 = new long[32];

    @ObfuscatedName("ep.qt")
    public static long[] field2247 = new long[32];

    @ObfuscatedName("ep.qo")
    public static int field2256 = 0;

    @ObfuscatedName("ep.ql")
    public static int field2257 = 0;

    @ObfuscatedName("ep.qp")
    public static volatile boolean field2258 = true;

    @ObfuscatedName("ep.qa")
    public static int field2264 = 500;

    @ObfuscatedName("ep.qj")
    public static boolean field2260 = false;

    @ObfuscatedName("ep.qb")
    public static volatile boolean field2261 = false;

    @ObfuscatedName("ep.qr")
    public static volatile long field2262 = 0L;

    @ObfuscatedName("ep.ry")
    public static volatile boolean field2263 = true;

    @ObfuscatedName("ep.pg")
    public boolean field2250 = false;

    @ObfuscatedName("ep.pt(IIII)V")
    public final void method2899(int arg0, int arg1, int arg2) {
        try {
            if (field2255 != null) {
                field2246++;
                if (field2246 >= 3) {
                    this.method2911("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2255 = this;
            Statics.field1500 = arg0;
            Statics.field3176 = arg1;
            Statics.field3105 = arg2;
            Statics.field2281 = this;
            if (Statics.field2087 == null) {
                Statics.field2087 = new class140();
            }
            Statics.field2087.method2772(this, 1);
        } catch (Exception var5) {
            class152.method2217((String) null, var5);
            this.method2911("crash");
        }
    }

    @ObfuscatedName("ep.pj(I)V")
    public final synchronized void method2900() {
        Container var1 = this.method2912();
        if (Statics.field2094 != null) {
            Statics.field2094.removeFocusListener(this);
            var1.remove(Statics.field2094);
        }
        Statics.field1500 = Math.max(var1.getWidth(), Statics.field936);
        Statics.field3176 = Math.max(var1.getHeight(), Statics.field1739);
        if (Statics.field1497 != null) {
            Insets var2 = Statics.field1497.getInsets();
            Statics.field1500 -= var2.right + var2.left;
            Statics.field3176 -= var2.top + var2.bottom;
        }
        Statics.field2094 = new class143(this);
        var1.add(Statics.field2094);
        Statics.field2094.setSize(Statics.field1500, Statics.field3176);
        Statics.field2094.setVisible(true);
        if (Statics.field1497 == var1) {
            Insets var3 = Statics.field1497.getInsets();
            Statics.field2094.setLocation(field2256 + var3.left, field2257 + var3.top);
        } else {
            Statics.field2094.setLocation(field2256, field2257);
        }
        Statics.field2094.addFocusListener(this);
        Statics.field2094.requestFocus();
        field2258 = true;
        int var4 = Statics.field1500;
        int var5 = Statics.field3176;
        Canvas var6 = Statics.field2094;
        class81 var8;
        try {
            class85 var7 = new class85();
            var7.method1549(var4, var5, var6);
            var8 = var7;
        } catch (Throwable var12) {
            class79 var10 = new class79();
            var10.method1549(var4, var5, var6);
            var8 = var10;
        }
        if (Statics.field883 != null) {
            Statics.field883.method1550(var8.field1432.getGraphics(), 0, 0);
        }
        Statics.field883 = var8;
        field2261 = false;
        field2262 = class119.method698();
    }

    @ObfuscatedName("ep.pl(I)Z")
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
                this.method2911("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2142 != null) {
                String var1 = Statics.field2142.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2139;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2911("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class167.method3012(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class167.method2113(var4)) {
                            int var5 = class167.method1581(var4, 10, true);
                            if (var5 < 10) {
                                this.method2911("wrongjava");
                                return;
                            }
                        }
                    }
                    field2259 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2900();
            this.method364();
            class137 var6;
            try {
                var6 = new class151();
            } catch (Throwable var10) {
                var6 = new class145();
            }
            Statics.field2134 = var6;
            while (field2248 == 0L || class119.method698() < field2248) {
                Statics.field14 = Statics.field2134.method2749(field2251, field2259);
                for (int var8 = 0; var8 < Statics.field14; var8++) {
                    this.method2905();
                }
                this.method2903();
                class146.method2706(Statics.field2087, Statics.field2094);
            }
        } catch (Exception var11) {
            class152.method2217((String) null, var11);
            this.method2911("crash");
        }
        this.method2904();
    }

    @ObfuscatedName("ep.pq(I)V")
    public void method2905() {
        long var1 = class119.method698();
        long var3 = field2247[Statics.field2117];
        field2247[Statics.field2117] = var1;
        Statics.field2117 = Statics.field2117 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2992 = field2263;
        }
        this.method242();
    }

    @ObfuscatedName("ep.px(S)V")
    public void method2903() {
        Container var1 = this.method2912();
        long var2 = class119.method698();
        long var4 = field2249[Statics.field1966];
        field2249[Statics.field1966] = var2;
        Statics.field1966 = Statics.field1966 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2253 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2264 - 1 > 50) {
            field2264 -= 50;
            field2258 = true;
            Statics.field2094.setSize(Statics.field1500, Statics.field3176);
            Statics.field2094.setVisible(true);
            if (Statics.field1497 == var1) {
                Insets var7 = Statics.field1497.getInsets();
                Statics.field2094.setLocation(field2256 + var7.left, field2257 + var7.top);
            } else {
                Statics.field2094.setLocation(field2256, field2257);
            }
        }
        this.method243();
    }

    @ObfuscatedName("ep.pc(I)V")
    public final synchronized void method2904() {
        if (field2252) {
            return;
        }
        field2252 = true;
        try {
            Statics.field2094.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method244();
        } catch (Exception var7) {
        }
        if (Statics.field1497 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field2087 != null) {
            try {
                Statics.field2087.method2768();
            } catch (Exception var5) {
            }
        }
        this.method238();
    }

    @ObfuscatedName("av.py(I)V")
    public static final void method939() {
        Statics.field2134.method2748();
        for (int var0 = 0; var0 < 32; var0++) {
            field2249[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2247[var1] = 0L;
        }
        Statics.field14 = 0;
    }

    public void start() {
        if (field2255 == this && !field2252) {
            field2248 = 0L;
        }
    }

    public void stop() {
        if (field2255 == this && !field2252) {
            field2248 = class119.method698() + 4000L;
        }
    }

    public void destroy() {
        if (field2255 == this && !field2252) {
            field2248 = class119.method698();
            class131.method2672(5000L);
            this.method2904();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2255 != this || field2252) {
            return;
        }
        field2258 = true;
        if (Statics.field2139 != null && Statics.field2139.startsWith("1.5") && class119.method698() - field2262 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1500 && var2.height >= Statics.field3176) {
                field2261 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2263 = true;
        field2258 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2263 = false;
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

    @ObfuscatedName("ep.pd(Ljava/lang/String;I)V")
    public void method2911(String arg0) {
        if (this.field2250) {
            return;
        }
        this.field2250 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ep.pg(I)Ljava/awt/Container;")
    public Container method2912() {
        return Statics.field1497 == null ? this : Statics.field1497;
    }

    @ObfuscatedName("ep.pw(I)Ljava/awt/Dimension;")
    public Dimension method2913() {
        Container var1 = this.method2912();
        int var2 = Math.max(var1.getWidth(), Statics.field936);
        int var3 = Math.max(var1.getHeight(), Statics.field1739);
        if (Statics.field1497 != null) {
            Insets var4 = Statics.field1497.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("ep.j(I)V")
    public abstract void method238();

    public abstract void init();

    @ObfuscatedName("ep.l(I)V")
    public abstract void method242();

    @ObfuscatedName("ep.p(I)V")
    public abstract void method244();

    @ObfuscatedName("ep.m(I)V")
    public abstract void method243();

    @ObfuscatedName("ep.b(I)V")
    public abstract void method364();
}
