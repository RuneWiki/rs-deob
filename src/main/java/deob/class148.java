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

@ObfuscatedName("ez")
public abstract class class148 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ez.pf")
    public static class148 field2247 = null;

    @ObfuscatedName("ez.px")
    public static int field2246 = 0;

    @ObfuscatedName("ez.pb")
    public static long field2244 = 0L;

    @ObfuscatedName("ez.py")
    public static boolean field2245 = false;

    @ObfuscatedName("ez.pz")
    public static int field2242 = 20;

    @ObfuscatedName("ez.qd")
    public static int field2248 = 1;

    @ObfuscatedName("ez.qt")
    public static int field2249 = 0;

    @ObfuscatedName("ez.qn")
    public static long[] field2250 = new long[32];

    @ObfuscatedName("ez.qv")
    public static long[] field2251 = new long[32];

    @ObfuscatedName("ez.qg")
    public static int field2252 = 0;

    @ObfuscatedName("ez.qx")
    public static int field2243 = 0;

    @ObfuscatedName("ez.qy")
    public static volatile boolean field2254 = true;

    @ObfuscatedName("ez.qz")
    public static int field2253 = 500;

    @ObfuscatedName("ez.qi")
    public static boolean field2256 = false;

    @ObfuscatedName("ez.qr")
    public static volatile boolean field2257 = false;

    @ObfuscatedName("ez.qq")
    public static volatile long field2258 = 0L;

    @ObfuscatedName("ez.rk")
    public static volatile boolean field2259 = true;

    @ObfuscatedName("ez.pw")
    public boolean field2255 = false;

    @ObfuscatedName("ez.rg(IIII)V")
    public final void method2886(int arg0, int arg1, int arg2) {
        try {
            if (field2247 != null) {
                field2246++;
                if (field2246 >= 3) {
                    this.method2897("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2247 = this;
            Statics.field1653 = arg0;
            Statics.field1690 = arg1;
            Statics.field2272 = arg2;
            Statics.field2271 = this;
            if (Statics.field700 == null) {
                Statics.field700 = new class140();
            }
            Statics.field700.method2766(this, 1);
        } catch (Exception var5) {
            class152.method2817((String) null, var5);
            this.method2897("crash");
        }
    }

    @ObfuscatedName("ez.ry(S)V")
    public final synchronized void method2893() {
        Container var1 = this.method2898();
        if (Statics.field1697 != null) {
            Statics.field1697.removeFocusListener(this);
            var1.remove(Statics.field1697);
        }
        Statics.field1653 = Math.max(var1.getWidth(), Statics.field807);
        Statics.field1690 = Math.max(var1.getHeight(), Statics.field2345);
        if (Statics.field189 != null) {
            Insets var2 = Statics.field189.getInsets();
            Statics.field1653 -= var2.right + var2.left;
            Statics.field1690 -= var2.top + var2.bottom;
        }
        Statics.field1697 = new class143(this);
        var1.add(Statics.field1697);
        Statics.field1697.setSize(Statics.field1653, Statics.field1690);
        Statics.field1697.setVisible(true);
        if (Statics.field189 == var1) {
            Insets var3 = Statics.field189.getInsets();
            Statics.field1697.setLocation(field2252 + var3.left, field2243 + var3.top);
        } else {
            Statics.field1697.setLocation(field2252, field2243);
        }
        Statics.field1697.addFocusListener(this);
        Statics.field1697.requestFocus();
        field2254 = true;
        class81 var4 = class81.method174(Statics.field1653, Statics.field1690, Statics.field1697);
        if (Statics.field1028 != null) {
            Statics.field1028.method1588(var4.field1447.getGraphics(), 0, 0);
        }
        Statics.field1028 = var4;
        field2257 = false;
        field2258 = class119.method3068();
    }

    @ObfuscatedName("ez.rn(B)Z")
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
                this.method2897("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2145 != null) {
                String var1 = Statics.field2145.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2149;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2897("wrongjava");
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
                        boolean var7 = false;
                        boolean var8 = false;
                        int var9 = 0;
                        int var10 = var6.length();
                        int var11 = 0;
                        boolean var13;
                        while (true) {
                            if (var11 >= var10) {
                                var13 = var8;
                                break;
                            }
                            label177: {
                                char var12 = var6.charAt(var11);
                                if (var11 == 0) {
                                    if (var12 == '-') {
                                        var7 = true;
                                        break label177;
                                    }
                                    if (var12 == '+') {
                                        break label177;
                                    }
                                }
                                int var19;
                                if (var12 >= '0' && var12 <= '9') {
                                    var19 = var12 - '0';
                                } else if (var12 >= 'A' && var12 <= 'Z') {
                                    var19 = var12 - '7';
                                } else {
                                    if (var12 < 'a' || var12 > 'z') {
                                        var13 = false;
                                        break;
                                    }
                                    var19 = var12 - 'W';
                                }
                                if (var19 >= 10) {
                                    var13 = false;
                                    break;
                                }
                                if (var7) {
                                    var19 = -var19;
                                }
                                int var14 = var9 * 10 + var19;
                                if (var14 / 10 != var9) {
                                    var13 = false;
                                    break;
                                }
                                var9 = var14;
                                var8 = true;
                            }
                            var11++;
                        }
                        if (var13 && class167.method2851(var6) < 10) {
                            this.method2897("wrongjava");
                            return;
                        }
                    }
                    field2248 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2893();
            this.method222();
            Statics.field1964 = class137.method7();
            while (field2244 == 0L || class119.method3068() < field2244) {
                Statics.field1616 = Statics.field1964.method2739(field2242, field2248);
                for (int var16 = 0; var16 < Statics.field1616; var16++) {
                    this.method2889();
                }
                this.method2890();
                class146.method205(Statics.field700, Statics.field1697);
            }
        } catch (Exception var18) {
            class152.method2817((String) null, var18);
            this.method2897("crash");
        }
        this.method2917();
    }

    @ObfuscatedName("ez.rz(I)V")
    public void method2889() {
        long var1 = class119.method3068();
        long var3 = field2251[Statics.field637];
        field2251[Statics.field637] = var1;
        Statics.field637 = Statics.field637 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1855 = field2259;
        }
        this.method444();
    }

    @ObfuscatedName("ez.ro(I)V")
    public void method2890() {
        Container var1 = this.method2898();
        long var2 = class119.method3068();
        long var4 = field2250[Statics.field1005];
        field2250[Statics.field1005] = var2;
        Statics.field1005 = Statics.field1005 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2249 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2253 - 1 > 50) {
            field2253 -= 50;
            field2254 = true;
            Statics.field1697.setSize(Statics.field1653, Statics.field1690);
            Statics.field1697.setVisible(true);
            if (Statics.field189 == var1) {
                Insets var7 = Statics.field189.getInsets();
                Statics.field1697.setLocation(field2252 + var7.left, field2243 + var7.top);
            } else {
                Statics.field1697.setLocation(field2252, field2243);
            }
        }
        this.method256();
    }

    @ObfuscatedName("ez.rd(I)V")
    public final synchronized void method2917() {
        if (field2245) {
            return;
        }
        field2245 = true;
        try {
            Statics.field1697.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method225();
        } catch (Exception var7) {
        }
        if (Statics.field189 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field700 != null) {
            try {
                Statics.field700.method2785();
            } catch (Exception var5) {
            }
        }
        this.method385();
    }

    @ObfuscatedName("ej.rq(B)V")
    public static final void method2724() {
        Statics.field1964.method2738();
        for (int var0 = 0; var0 < 32; var0++) {
            field2250[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2251[var1] = 0L;
        }
        Statics.field1616 = 0;
    }

    public void start() {
        if (field2247 == this && !field2245) {
            field2244 = 0L;
        }
    }

    public void stop() {
        if (field2247 == this && !field2245) {
            field2244 = class119.method3068() + 4000L;
        }
    }

    public void destroy() {
        if (field2247 == this && !field2245) {
            field2244 = class119.method3068();
            class131.method2702(5000L);
            this.method2917();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2247 != this || field2245) {
            return;
        }
        field2254 = true;
        if (Statics.field2149 != null && Statics.field2149.startsWith("1.5") && class119.method3068() - field2258 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1653 && var2.height >= Statics.field1690) {
                field2257 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2259 = true;
        field2254 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2259 = false;
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

    @ObfuscatedName("ds.rr(I)V")
    public static final void method2362() {
        Statics.field1257 = null;
        Statics.field1001 = null;
        Statics.field1065 = null;
    }

    @ObfuscatedName("ez.re(Ljava/lang/String;I)V")
    public void method2897(String arg0) {
        if (this.field2255) {
            return;
        }
        this.field2255 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ez.rv(I)Ljava/awt/Container;")
    public Container method2898() {
        return Statics.field189 == null ? this : Statics.field189;
    }

    @ObfuscatedName("ez.rl(I)Ljava/awt/Dimension;")
    public Dimension method2931() {
        Container var1 = this.method2898();
        int var2 = Math.max(var1.getWidth(), Statics.field807);
        int var3 = Math.max(var1.getHeight(), Statics.field2345);
        if (Statics.field189 != null) {
            Insets var4 = Statics.field189.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("ez.u(I)V")
    public abstract void method225();

    public abstract void init();

    @ObfuscatedName("ez.j(I)V")
    public abstract void method222();

    @ObfuscatedName("ez.m(I)V")
    public abstract void method444();

    @ObfuscatedName("ez.y(I)V")
    public abstract void method256();

    @ObfuscatedName("ez.f(I)V")
    public abstract void method385();
}
