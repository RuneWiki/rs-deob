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

@ObfuscatedName("ea")
public abstract class class144 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ea.pv")
    public static class144 field2166 = null;

    @ObfuscatedName("ea.po")
    public static int field2167 = 0;

    @ObfuscatedName("ea.pl")
    public static long field2171 = 0L;

    @ObfuscatedName("ea.pr")
    public static boolean field2169 = false;

    @ObfuscatedName("ea.qk")
    public static int field2173 = 20;

    @ObfuscatedName("ea.qf")
    public static int field2172 = 1;

    @ObfuscatedName("ea.qd")
    public static int field2175 = 0;

    @ObfuscatedName("ea.qu")
    public static long[] field2174 = new long[32];

    @ObfuscatedName("ea.qw")
    public static long[] field2176 = new long[32];

    @ObfuscatedName("ea.qj")
    public static int field2182 = 0;

    @ObfuscatedName("ea.qi")
    public static int field2177 = 0;

    @ObfuscatedName("ea.ql")
    public static volatile boolean field2178 = true;

    @ObfuscatedName("ea.qn")
    public static int field2179 = 500;

    @ObfuscatedName("ea.qb")
    public static boolean field2180 = false;

    @ObfuscatedName("ea.qh")
    public static volatile boolean field2181 = false;

    @ObfuscatedName("ea.rc")
    public static volatile long field2184 = 0L;

    @ObfuscatedName("ea.rm")
    public static volatile boolean field2183 = true;

    @ObfuscatedName("ea.pu")
    public boolean field2170 = false;

    @ObfuscatedName("ea.pi(IIII)V")
    public final void method2892(int arg0, int arg1, int arg2) {
        try {
            if (field2166 != null) {
                field2167++;
                if (field2167 >= 3) {
                    this.method2889("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2166 = this;
            Statics.field1778 = arg0;
            Statics.field2681 = arg1;
            Statics.field3197 = arg2;
            Statics.field1880 = this;
            if (Statics.field2001 == null) {
                Statics.field2001 = new class136();
            }
            Statics.field2001.method2762(this, 1);
        } catch (Exception var5) {
            class148.method2734((String) null, var5);
            this.method2889("crash");
        }
    }

    @ObfuscatedName("ea.pz(I)V")
    public final synchronized void method2879() {
        Container var1 = this.method2890();
        if (Statics.field1745 != null) {
            Statics.field1745.removeFocusListener(this);
            var1.remove(Statics.field1745);
        }
        Statics.field1778 = Math.max(var1.getWidth(), Statics.field3201);
        Statics.field2681 = Math.max(var1.getHeight(), Statics.field629);
        if (Statics.field1053 != null) {
            Insets var2 = Statics.field1053.getInsets();
            Statics.field1778 -= var2.right + var2.left;
            Statics.field2681 -= var2.top + var2.bottom;
        }
        Statics.field1745 = new class139(this);
        var1.add(Statics.field1745);
        Statics.field1745.setSize(Statics.field1778, Statics.field2681);
        Statics.field1745.setVisible(true);
        if (Statics.field1053 == var1) {
            Insets var3 = Statics.field1053.getInsets();
            Statics.field1745.setLocation(field2182 + var3.left, field2177 + var3.top);
        } else {
            Statics.field1745.setLocation(field2182, field2177);
        }
        Statics.field1745.addFocusListener(this);
        Statics.field1745.requestFocus();
        field2178 = true;
        int var4 = Statics.field1778;
        int var5 = Statics.field2681;
        Canvas var6 = Statics.field1745;
        class78 var8;
        try {
            class82 var7 = new class82();
            var7.method1506(var4, var5, var6);
            var8 = var7;
        } catch (Throwable var12) {
            class76 var10 = new class76();
            var10.method1506(var4, var5, var6);
            var8 = var10;
        }
        if (Statics.field2052 != null) {
            Statics.field2052.method1507(var8.field1396.getGraphics(), 0, 0);
        }
        Statics.field2052 = var8;
        field2181 = false;
        field2184 = class115.method2142();
    }

    @ObfuscatedName("ea.pv(I)Z")
    public final boolean method2880() {
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
                this.method2889("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2069 != null) {
                String var1 = Statics.field2069.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2065;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2889("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class163.method2840(var2.charAt(var3)); var3++) {
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
                                int var18;
                                if (var10 >= '0' && var10 <= '9') {
                                    var18 = var10 - '0';
                                } else if (var10 >= 'A' && var10 <= 'Z') {
                                    var18 = var10 - '7';
                                } else {
                                    if (var10 < 'a' || var10 > 'z') {
                                        var11 = false;
                                        break;
                                    }
                                    var18 = var10 - 'W';
                                }
                                if (var18 >= 10) {
                                    var11 = false;
                                    break;
                                }
                                if (var5) {
                                    var18 = -var18;
                                }
                                int var12 = var7 * 10 + var18;
                                if (var12 / 10 != var7) {
                                    var11 = false;
                                    break;
                                }
                                var7 = var12;
                                var6 = true;
                            }
                            var9++;
                        }
                        if (var11) {
                            int var14 = class163.method2145(var4, 10, true);
                            if (var14 < 10) {
                                this.method2889("wrongjava");
                                return;
                            }
                        }
                    }
                    field2172 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2879();
            this.method468();
            Statics.field2689 = class133.method2150();
            while (field2171 == 0L || class115.method2142() < field2171) {
                Statics.field228 = Statics.field2689.method2715(field2173, field2172);
                for (int var15 = 0; var15 < Statics.field228; var15++) {
                    this.method2881();
                }
                this.method2910();
                class142.method629(Statics.field2001, Statics.field1745);
            }
        } catch (Exception var17) {
            class148.method2734((String) null, var17);
            this.method2889("crash");
        }
        this.method2883();
    }

    @ObfuscatedName("ea.po(I)V")
    public void method2881() {
        long var1 = class115.method2142();
        long var3 = field2176[Statics.field2042];
        field2176[Statics.field2042] = var1;
        Statics.field2042 = Statics.field2042 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1449 = field2183;
        }
        this.method247();
    }

    @ObfuscatedName("ea.pl(B)V")
    public void method2910() {
        Container var1 = this.method2890();
        long var2 = class115.method2142();
        long var4 = field2174[Statics.field1996];
        field2174[Statics.field1996] = var2;
        Statics.field1996 = Statics.field1996 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2175 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2179 - 1 > 50) {
            field2179 -= 50;
            field2178 = true;
            Statics.field1745.setSize(Statics.field1778, Statics.field2681);
            Statics.field1745.setVisible(true);
            if (Statics.field1053 == var1) {
                Insets var7 = Statics.field1053.getInsets();
                Statics.field1745.setLocation(field2182 + var7.left, field2177 + var7.top);
            } else {
                Statics.field1745.setLocation(field2182, field2177);
            }
        }
        this.method498();
    }

    @ObfuscatedName("ea.pr(I)V")
    public final synchronized void method2883() {
        if (field2169) {
            return;
        }
        field2169 = true;
        try {
            Statics.field1745.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method466();
        } catch (Exception var7) {
        }
        if (Statics.field1053 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field2001 != null) {
            try {
                Statics.field2001.method2760();
            } catch (Exception var5) {
            }
        }
        this.method263();
    }

    @ObfuscatedName("ae.pu(S)V")
    public static final void method614() {
        Statics.field2689.method2713();
        for (int var0 = 0; var0 < 32; var0++) {
            field2174[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2176[var1] = 0L;
        }
        Statics.field228 = 0;
    }

    public void start() {
        if (field2166 == this && !field2169) {
            field2171 = 0L;
        }
    }

    public void stop() {
        if (field2166 == this && !field2169) {
            field2171 = class115.method2142() + 4000L;
        }
    }

    public void destroy() {
        if (field2166 == this && !field2169) {
            field2171 = class115.method2142();
            class127.method724(5000L);
            this.method2883();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2166 != this || field2169) {
            return;
        }
        field2178 = true;
        if (Statics.field2065 != null && Statics.field2065.startsWith("1.5") && class115.method2142() - field2184 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1778 && var2.height >= Statics.field2681) {
                field2181 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2183 = true;
        field2178 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2183 = false;
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

    @ObfuscatedName("bs.ph(I)V")
    public static final void method1503() {
        Statics.field2054 = null;
        Statics.field1389 = null;
        Statics.field1997 = null;
    }

    @ObfuscatedName("ea.qk(Ljava/lang/String;B)V")
    public void method2889(String arg0) {
        if (this.field2170) {
            return;
        }
        this.field2170 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ea.qf(I)Ljava/awt/Container;")
    public Container method2890() {
        return Statics.field1053 == null ? this : Statics.field1053;
    }

    @ObfuscatedName("ea.qd(B)Ljava/awt/Dimension;")
    public Dimension method2891() {
        Container var1 = this.method2890();
        int var2 = Math.max(var1.getWidth(), Statics.field3201);
        int var3 = Math.max(var1.getHeight(), Statics.field629);
        if (Statics.field1053 != null) {
            Insets var4 = Statics.field1053.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    public abstract void init();

    @ObfuscatedName("ea.u(I)V")
    public abstract void method468();

    @ObfuscatedName("ea.l(B)V")
    public abstract void method263();

    @ObfuscatedName("ea.e(S)V")
    public abstract void method498();

    @ObfuscatedName("ea.a(I)V")
    public abstract void method247();

    @ObfuscatedName("ea.b(I)V")
    public abstract void method466();
}
