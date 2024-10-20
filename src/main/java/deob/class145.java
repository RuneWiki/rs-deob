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

@ObfuscatedName("eh")
public abstract class class145 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("eh.pr")
    public static class145 field2224 = null;

    @ObfuscatedName("eh.ph")
    public static int field2239 = 0;

    @ObfuscatedName("eh.pp")
    public static long field2226 = 0L;

    @ObfuscatedName("eh.pl")
    public static boolean field2234 = false;

    @ObfuscatedName("eh.qe")
    public static int field2229 = 20;

    @ObfuscatedName("eh.qy")
    public static int field2230 = 1;

    @ObfuscatedName("eh.qd")
    public static int field2225 = 0;

    @ObfuscatedName("eh.qt")
    public static long[] field2232 = new long[32];

    @ObfuscatedName("eh.qo")
    public static long[] field2233 = new long[32];

    @ObfuscatedName("eh.qw")
    public static int field2227 = 0;

    @ObfuscatedName("eh.qq")
    public static int field2243 = 0;

    @ObfuscatedName("eh.qg")
    public static volatile boolean field2236 = true;

    @ObfuscatedName("eh.ql")
    public static int field2237 = 500;

    @ObfuscatedName("eh.qn")
    public static boolean field2238 = false;

    @ObfuscatedName("eh.qi")
    public static volatile boolean field2235 = false;

    @ObfuscatedName("eh.rb")
    public static volatile long field2240 = 0L;

    @ObfuscatedName("eh.re")
    public static volatile boolean field2241 = true;

    @ObfuscatedName("eh.pd")
    public boolean field2228 = false;

    @ObfuscatedName("eh.qn(IIIB)V")
    public final void method2814(int arg0, int arg1, int arg2) {
        try {
            if (field2224 != null) {
                field2239++;
                if (field2239 >= 3) {
                    this.method2817("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2224 = this;
            Statics.field163 = arg0;
            Statics.field967 = arg1;
            Statics.field2681 = arg2;
            Statics.field2258 = this;
            if (Statics.field1401 == null) {
                Statics.field1401 = new class137();
            }
            Statics.field1401.method2701(this, 1);
        } catch (Exception var5) {
            class149.method635((String) null, var5);
            this.method2817("crash");
        }
    }

    @ObfuscatedName("eh.qi(B)V")
    public final synchronized void method2815() {
        Container var1 = this.method2860();
        if (Statics.field1222 != null) {
            Statics.field1222.removeFocusListener(this);
            var1.remove(Statics.field1222);
        }
        Statics.field163 = Math.max(var1.getWidth(), Statics.field1017);
        Statics.field967 = Math.max(var1.getHeight(), Statics.field691);
        if (Statics.field1023 != null) {
            Insets var2 = Statics.field1023.getInsets();
            Statics.field163 -= var2.right + var2.left;
            Statics.field967 -= var2.top + var2.bottom;
        }
        Statics.field1222 = new class140(this);
        var1.add(Statics.field1222);
        Statics.field1222.setSize(Statics.field163, Statics.field967);
        Statics.field1222.setVisible(true);
        if (Statics.field1023 == var1) {
            Insets var3 = Statics.field1023.getInsets();
            Statics.field1222.setLocation(field2227 + var3.left, field2243 + var3.top);
        } else {
            Statics.field1222.setLocation(field2227, field2243);
        }
        Statics.field1222.addFocusListener(this);
        Statics.field1222.requestFocus();
        field2236 = true;
        class78 var4 = class78.method129(Statics.field163, Statics.field967, Statics.field1222);
        if (Statics.field1647 != null) {
            Statics.field1647.method1459(var4.field1396.getGraphics(), 0, 0);
        }
        Statics.field1647 = var4;
        field2235 = false;
        field2240 = class116.method2586();
    }

    @ObfuscatedName("eh.rb(B)Z")
    public final boolean method2807() {
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
                this.method2817("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2115 != null) {
                String var1 = Statics.field2115.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2125;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2817("wrongjava");
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
                            label184: {
                                char var12 = var6.charAt(var11);
                                if (var11 == 0) {
                                    if (var12 == '-') {
                                        var7 = true;
                                        break label184;
                                    }
                                    if (var12 == '+') {
                                        break label184;
                                    }
                                }
                                int var22;
                                if (var12 >= '0' && var12 <= '9') {
                                    var22 = var12 - '0';
                                } else if (var12 >= 'A' && var12 <= 'Z') {
                                    var22 = var12 - '7';
                                } else {
                                    if (var12 < 'a' || var12 > 'z') {
                                        var13 = false;
                                        break;
                                    }
                                    var22 = var12 - 'W';
                                }
                                if (var22 >= 10) {
                                    var13 = false;
                                    break;
                                }
                                if (var7) {
                                    var22 = -var22;
                                }
                                int var14 = var9 * 10 + var22;
                                if (var14 / 10 != var9) {
                                    var13 = false;
                                    break;
                                }
                                var9 = var14;
                                var8 = true;
                            }
                            var11++;
                        }
                        if (var13 && class164.method1541(var6) < 10) {
                            this.method2817("wrongjava");
                            return;
                        }
                    }
                    field2230 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2815();
            this.method418();
            class134 var16;
            try {
                var16 = new class148();
            } catch (Throwable var20) {
                var16 = new class142();
            }
            Statics.field3082 = var16;
            while (field2226 == 0L || class116.method2586() < field2226) {
                Statics.field1039 = Statics.field3082.method2658(field2229, field2230);
                for (int var18 = 0; var18 < Statics.field1039; var18++) {
                    this.method2839();
                }
                this.method2809();
                class143.method2558(Statics.field1401, Statics.field1222);
            }
        } catch (Exception var21) {
            class149.method635((String) null, var21);
            this.method2817("crash");
        }
        this.method2823();
    }

    @ObfuscatedName("eh.rz(I)V")
    public void method2839() {
        long var1 = class116.method2586();
        long var3 = field2233[Statics.field2087];
        field2233[Statics.field2087] = var1;
        Statics.field2087 = Statics.field2087 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field671 = field2241;
        }
        this.method210();
    }

    @ObfuscatedName("eh.re(B)V")
    public void method2809() {
        Container var1 = this.method2860();
        long var2 = class116.method2586();
        long var4 = field2232[Statics.field2078];
        field2232[Statics.field2078] = var2;
        Statics.field2078 = Statics.field2078 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2225 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2237 - 1 > 50) {
            field2237 -= 50;
            field2236 = true;
            Statics.field1222.setSize(Statics.field163, Statics.field967);
            Statics.field1222.setVisible(true);
            if (Statics.field1023 == var1) {
                Insets var7 = Statics.field1023.getInsets();
                Statics.field1222.setLocation(field2227 + var7.left, field2243 + var7.top);
            } else {
                Statics.field1222.setLocation(field2227, field2243);
            }
        }
        this.method459();
    }

    @ObfuscatedName("eh.rn(B)V")
    public final synchronized void method2823() {
        if (field2234) {
            return;
        }
        field2234 = true;
        try {
            Statics.field1222.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method212();
        } catch (Exception var7) {
        }
        if (Statics.field1023 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1401 != null) {
            try {
                Statics.field1401.method2694();
            } catch (Exception var5) {
            }
        }
        this.method207();
    }

    @ObfuscatedName("hp.rx(B)V")
    public static final void method3640() {
        Statics.field3082.method2657();
        for (int var0 = 0; var0 < 32; var0++) {
            field2232[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2233[var1] = 0L;
        }
        Statics.field1039 = 0;
    }

    public void start() {
        if (field2224 == this && !field2234) {
            field2226 = 0L;
        }
    }

    public void stop() {
        if (field2224 == this && !field2234) {
            field2226 = class116.method2586() + 4000L;
        }
    }

    public void destroy() {
        if (field2224 == this && !field2234) {
            field2226 = class116.method2586();
            class128.method894(5000L);
            this.method2823();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2224 != this || field2234) {
            return;
        }
        field2236 = true;
        if (Statics.field2125 != null && Statics.field2125.startsWith("1.5") && class116.method2586() - field2240 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field163 && var2.height >= Statics.field967) {
                field2235 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2241 = true;
        field2236 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2241 = false;
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

    @ObfuscatedName("eh.ri(Ljava/lang/String;I)V")
    public void method2817(String arg0) {
        if (this.field2228) {
            return;
        }
        this.field2228 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("eh.ru(B)Ljava/awt/Container;")
    public Container method2860() {
        return Statics.field1023 == null ? this : Statics.field1023;
    }

    @ObfuscatedName("eh.rd(I)Ljava/awt/Dimension;")
    public Dimension method2819() {
        Container var1 = this.method2860();
        int var2 = Math.max(var1.getWidth(), Statics.field1017);
        int var3 = Math.max(var1.getHeight(), Statics.field691);
        if (Statics.field1023 != null) {
            Insets var4 = Statics.field1023.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("eh.g(I)V")
    public abstract void method207();

    @ObfuscatedName("eh.z(I)V")
    public abstract void method418();

    @ObfuscatedName("eh.r(B)V")
    public abstract void method210();

    @ObfuscatedName("eh.f(I)V")
    public abstract void method459();

    public abstract void init();

    @ObfuscatedName("eh.s(I)V")
    public abstract void method212();
}
