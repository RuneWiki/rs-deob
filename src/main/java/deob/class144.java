package deob;

import java.applet.Applet;
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

@ObfuscatedName("ea")
public abstract class class144 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ea.pf")
    public static class144 field2170 = null;

    @ObfuscatedName("ea.pd")
    public static int field2163 = 0;

    @ObfuscatedName("ea.pl")
    public static long field2164 = 0L;

    @ObfuscatedName("ea.pi")
    public static boolean field2165 = false;

    @ObfuscatedName("ea.pg")
    public static int field2180 = 20;

    @ObfuscatedName("ea.qk")
    public static int field2167 = 1;

    @ObfuscatedName("ea.qn")
    public static int field2169 = 0;

    @ObfuscatedName("ea.qh")
    public static long[] field2174 = new long[32];

    @ObfuscatedName("ea.qi")
    public static long[] field2173 = new long[32];

    @ObfuscatedName("ea.qw")
    public static int field2172 = 0;

    @ObfuscatedName("ea.qa")
    public static int field2171 = 0;

    @ObfuscatedName("ea.qo")
    public static volatile boolean field2162 = true;

    @ObfuscatedName("ea.qm")
    public static int field2168 = 500;

    @ObfuscatedName("ea.qb")
    public static boolean field2176 = false;

    @ObfuscatedName("ea.qe")
    public static volatile boolean field2177 = false;

    @ObfuscatedName("ea.qc")
    public static volatile long field2178 = 0L;

    @ObfuscatedName("ea.rg")
    public static volatile boolean field2179 = true;

    @ObfuscatedName("ea.pv")
    public boolean field2166 = false;

    @ObfuscatedName("ea.rr(IIII)V")
    public final void method2886(int arg0, int arg1, int arg2) {
        try {
            if (field2170 != null) {
                field2163++;
                if (field2163 >= 3) {
                    this.method2896("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2170 = this;
            Statics.field942 = arg0;
            Statics.field2210 = arg1;
            Statics.field65 = arg2;
            Statics.field2197 = this;
            if (Statics.field2048 == null) {
                Statics.field2048 = new class136();
            }
            Statics.field2048.method2756(this, 1);
        } catch (Exception var5) {
            class148.method1554((String) null, var5);
            this.method2896("crash");
        }
    }

    @ObfuscatedName("ea.rd(I)V")
    public final synchronized void method2887() {
        Container var1 = this.method2906();
        if (Statics.field1559 != null) {
            Statics.field1559.removeFocusListener(this);
            var1.remove(Statics.field1559);
        }
        Statics.field942 = Math.max(var1.getWidth(), Statics.field1311);
        Statics.field2210 = Math.max(var1.getHeight(), Statics.field2006);
        if (Statics.field1914 != null) {
            Insets var2 = Statics.field1914.getInsets();
            Statics.field942 -= var2.right + var2.left;
            Statics.field2210 -= var2.top + var2.bottom;
        }
        Statics.field1559 = new class139(this);
        var1.add(Statics.field1559);
        Statics.field1559.setSize(Statics.field942, Statics.field2210);
        Statics.field1559.setVisible(true);
        if (Statics.field1914 == var1) {
            Insets var3 = Statics.field1914.getInsets();
            Statics.field1559.setLocation(field2172 + var3.left, field2171 + var3.top);
        } else {
            Statics.field1559.setLocation(field2172, field2171);
        }
        Statics.field1559.addFocusListener(this);
        Statics.field1559.requestFocus();
        field2162 = true;
        class78 var4 = class78.method43(Statics.field942, Statics.field2210, Statics.field1559);
        if (Statics.field2145 != null) {
            Statics.field2145.method1557(var4.field1351.getGraphics(), 0, 0);
        }
        Statics.field2145 = var4;
        field2177 = false;
        field2178 = class115.method2177();
    }

    @ObfuscatedName("ea.ry(I)Z")
    public final boolean method2888() {
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
                this.method2896("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2069 != null) {
                String var1 = Statics.field2069.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2062;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2896("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class163.method96(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        boolean var5 = false;
                        boolean var6 = false;
                        int var7 = 0;
                        int var8 = var4.length();
                        int var9 = 0;
                        boolean var11;
                        while (true) {
                            if (var9 >= var8) {
                                var11 = var6;
                                break;
                            }
                            label162: {
                                char var10 = var4.charAt(var9);
                                if (var9 == 0) {
                                    if (var10 == '-') {
                                        var5 = true;
                                        break label162;
                                    }
                                    if (var10 == '+') {
                                        break label162;
                                    }
                                }
                                int var17;
                                if (var10 >= '0' && var10 <= '9') {
                                    var17 = var10 - '0';
                                } else if (var10 >= 'A' && var10 <= 'Z') {
                                    var17 = var10 - '7';
                                } else {
                                    if (var10 < 'a' || var10 > 'z') {
                                        var11 = false;
                                        break;
                                    }
                                    var17 = var10 - 'W';
                                }
                                if (var17 >= 10) {
                                    var11 = false;
                                    break;
                                }
                                if (var5) {
                                    var17 = -var17;
                                }
                                int var12 = var7 * 10 + var17;
                                if (var12 / 10 != var7) {
                                    var11 = false;
                                    break;
                                }
                                var7 = var12;
                                var6 = true;
                            }
                            var9++;
                        }
                        if (var11 && class163.method2984(var4) < 10) {
                            this.method2896("wrongjava");
                            return;
                        }
                    }
                    field2167 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2887();
            this.method386();
            Statics.field2109 = Statics.method584();
            while (field2164 == 0L || class115.method2177() < field2164) {
                Statics.field1712 = Statics.field2109.method2721(field2180, field2167);
                for (int var14 = 0; var14 < Statics.field1712; var14++) {
                    this.method2957();
                }
                this.method2956();
                class142.method600(Statics.field2048, Statics.field1559);
            }
        } catch (Exception var16) {
            class148.method1554((String) null, var16);
            this.method2896("crash");
        }
        this.method2890();
    }

    @ObfuscatedName("ea.rt(I)V")
    public void method2957() {
        long var1 = class115.method2177();
        long var3 = field2173[Statics.field1410];
        field2173[Statics.field1410] = var1;
        Statics.field1410 = Statics.field1410 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2024 = field2179;
        }
        this.method424();
    }

    @ObfuscatedName("ea.rv(I)V")
    public void method2956() {
        Container var1 = this.method2906();
        long var2 = class115.method2177();
        long var4 = field2174[Statics.field545];
        field2174[Statics.field545] = var2;
        Statics.field545 = Statics.field545 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2169 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2168 - 1 > 50) {
            field2168 -= 50;
            field2162 = true;
            Statics.field1559.setSize(Statics.field942, Statics.field2210);
            Statics.field1559.setVisible(true);
            if (Statics.field1914 == var1) {
                Insets var7 = Statics.field1914.getInsets();
                Statics.field1559.setLocation(field2172 + var7.left, field2171 + var7.top);
            } else {
                Statics.field1559.setLocation(field2172, field2171);
            }
        }
        this.method247();
    }

    @ObfuscatedName("ea.ri(I)V")
    public final synchronized void method2890() {
        if (field2165) {
            return;
        }
        field2165 = true;
        try {
            Statics.field1559.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method248();
        } catch (Exception var7) {
        }
        if (Statics.field1914 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field2048 != null) {
            try {
                Statics.field2048.method2755();
            } catch (Exception var5) {
            }
        }
        this.method243();
    }

    @ObfuscatedName("ad.rc(I)V")
    public static final void method1014() {
        Statics.field2109.method2726();
        for (int var0 = 0; var0 < 32; var0++) {
            field2174[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2173[var1] = 0L;
        }
        Statics.field1712 = 0;
    }

    public void start() {
        if (field2170 == this && !field2165) {
            field2164 = 0L;
        }
    }

    public void stop() {
        if (field2170 == this && !field2165) {
            field2164 = class115.method2177() + 4000L;
        }
    }

    public void destroy() {
        if (field2170 == this && !field2165) {
            field2164 = class115.method2177();
            class127.method3199(5000L);
            this.method2890();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2170 != this || field2165) {
            return;
        }
        field2162 = true;
        if (Statics.field2062 != null && Statics.field2062.startsWith("1.5") && class115.method2177() - field2178 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field942 && var2.height >= Statics.field2210) {
                field2177 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2179 = true;
        field2162 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2179 = false;
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

    @ObfuscatedName("ea.rw(Ljava/lang/String;I)V")
    public void method2896(String arg0) {
        if (this.field2166) {
            return;
        }
        this.field2166 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ea.rn(B)Ljava/awt/Container;")
    public Container method2906() {
        return Statics.field1914 == null ? this : Statics.field1914;
    }

    @ObfuscatedName("ea.rl(I)Ljava/awt/Dimension;")
    public Dimension method2900() {
        Container var1 = this.method2906();
        int var2 = Math.max(var1.getWidth(), Statics.field1311);
        int var3 = Math.max(var1.getHeight(), Statics.field2006);
        if (Statics.field1914 != null) {
            Insets var4 = Statics.field1914.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("ea.e(I)V")
    public abstract void method247();

    public abstract void init();

    @ObfuscatedName("ea.x(I)V")
    public abstract void method386();

    @ObfuscatedName("ea.g(B)V")
    public abstract void method424();

    @ObfuscatedName("ea.p(B)V")
    public abstract void method248();

    @ObfuscatedName("ea.k(I)V")
    public abstract void method243();
}
