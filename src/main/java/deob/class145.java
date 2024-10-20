package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

@ObfuscatedName("ec")
public abstract class class145 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ec.pl")
    public static class145 field2202 = null;

    @ObfuscatedName("ec.pf")
    public static int field2204 = 0;

    @ObfuscatedName("ec.py")
    public static long field2189 = 0L;

    @ObfuscatedName("ec.pu")
    public static boolean field2193 = false;

    @ObfuscatedName("ec.qu")
    public static int field2194 = 20;

    @ObfuscatedName("ec.qe")
    public static int field2195 = 1;

    @ObfuscatedName("ec.qm")
    public static int field2196 = 0;

    @ObfuscatedName("ec.qj")
    public static long[] field2197 = new long[32];

    @ObfuscatedName("ec.qq")
    public static long[] field2198 = new long[32];

    @ObfuscatedName("ec.qy")
    public static int field2199 = 0;

    @ObfuscatedName("ec.qv")
    public static int field2201 = 0;

    @ObfuscatedName("ec.qh")
    public static volatile boolean field2205 = true;

    @ObfuscatedName("ec.qb")
    public static int field2190 = 500;

    @ObfuscatedName("ec.qz")
    public static boolean field2203 = false;

    @ObfuscatedName("ec.qi")
    public static volatile boolean field2191 = false;

    @ObfuscatedName("ec.rg")
    public static volatile long field2192 = 0L;

    @ObfuscatedName("ec.rr")
    public static volatile boolean field2206 = true;

    @ObfuscatedName("ec.pc")
    public boolean field2200 = false;

    @ObfuscatedName("ec.rp(IIII)V")
    public final void method2864(int arg0, int arg1, int arg2) {
        try {
            if (field2202 != null) {
                field2204++;
                if (field2204 >= 3) {
                    this.method2895("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2202 = this;
            Statics.field763 = arg0;
            Statics.field576 = arg1;
            Statics.field1542 = arg2;
            Statics.field2221 = this;
            if (Statics.field2029 == null) {
                Statics.field2029 = new class137();
            }
            Statics.field2029.method2715(this, 1);
        } catch (Exception var5) {
            class149.method17((String) null, var5);
            this.method2895("crash");
        }
    }

    @ObfuscatedName("ec.ro(I)V")
    public final synchronized void method2870() {
        Container var1 = this.method2840();
        if (Statics.field193 != null) {
            Statics.field193.removeFocusListener(this);
            var1.remove(Statics.field193);
        }
        Statics.field763 = Math.max(var1.getWidth(), Statics.field849);
        Statics.field576 = Math.max(var1.getHeight(), Statics.field1962);
        if (Statics.field62 != null) {
            Insets var2 = Statics.field62.getInsets();
            Statics.field763 -= var2.right + var2.left;
            Statics.field576 -= var2.top + var2.bottom;
        }
        Statics.field193 = new class140(this);
        var1.add(Statics.field193);
        Statics.field193.setSize(Statics.field763, Statics.field576);
        Statics.field193.setVisible(true);
        if (Statics.field62 == var1) {
            Insets var3 = Statics.field62.getInsets();
            Statics.field193.setLocation(field2199 + var3.left, field2201 + var3.top);
        } else {
            Statics.field193.setLocation(field2199, field2201);
        }
        Statics.field193.addFocusListener(this);
        Statics.field193.requestFocus();
        field2205 = true;
        class78 var4 = class78.method162(Statics.field763, Statics.field576, Statics.field193);
        if (Statics.field2071 != null) {
            Statics.field2071.method1497(var4.field1361.getGraphics(), 0, 0);
        }
        Statics.field2071 = var4;
        field2191 = false;
        field2192 = class116.method2794();
    }

    @ObfuscatedName("ec.rk(I)Z")
    public final boolean method2826() {
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
                this.method2895("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field3213 != null) {
                String var1 = Statics.field3213.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2093;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2895("wrongjava");
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
                        if (class164.method2305(var6) && class164.method2756(var6) < 10) {
                            this.method2895("wrongjava");
                            return;
                        }
                    }
                    field2195 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2870();
            this.method223();
            class134 var7;
            try {
                var7 = new class148();
            } catch (Throwable var14) {
                var7 = new class142();
            }
            Statics.field76 = var7;
            label91: while (true) {
                class137 var10;
                Canvas var11;
                do {
                    if (field2189 != 0L && class116.method2794() >= field2189) {
                        break label91;
                    }
                    Statics.field2186 = Statics.field76.method2674(field2194, field2195);
                    for (int var9 = 0; var9 < Statics.field2186; var9++) {
                        this.method2823();
                    }
                    this.method2852();
                    var10 = Statics.field2029;
                    var11 = Statics.field193;
                } while (var10.field2088 == null);
                for (int var12 = 0; var12 < 50 && var10.field2088.peekEvent() != null; var12++) {
                    class128.method2645(1L);
                }
                if (var11 != null) {
                    var10.field2088.postEvent(new ActionEvent(var11, 1001, "dummy"));
                }
            }
        } catch (Exception var15) {
            class149.method17((String) null, var15);
            this.method2895("crash");
        }
        this.method2894();
    }

    @ObfuscatedName("ec.rq(B)V")
    public void method2823() {
        long var1 = class116.method2794();
        long var3 = field2198[Statics.field1072];
        field2198[Statics.field1072] = var1;
        Statics.field1072 = Statics.field1072 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1949 = field2206;
        }
        this.method348();
    }

    @ObfuscatedName("ec.rf(I)V")
    public void method2852() {
        Container var1 = this.method2840();
        long var2 = class116.method2794();
        long var4 = field2197[Statics.field2056];
        field2197[Statics.field2056] = var2;
        Statics.field2056 = Statics.field2056 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2196 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2190 - 1 > 50) {
            field2190 -= 50;
            field2205 = true;
            Statics.field193.setSize(Statics.field763, Statics.field576);
            Statics.field193.setVisible(true);
            if (Statics.field62 == var1) {
                Insets var7 = Statics.field62.getInsets();
                Statics.field193.setLocation(field2199 + var7.left, field2201 + var7.top);
            } else {
                Statics.field193.setLocation(field2199, field2201);
            }
        }
        this.method225();
    }

    @ObfuscatedName("ec.rl(S)V")
    public final synchronized void method2894() {
        if (field2193) {
            return;
        }
        field2193 = true;
        try {
            Statics.field193.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method438();
        } catch (Exception var7) {
        }
        if (Statics.field62 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field2029 != null) {
            try {
                Statics.field2029.method2712();
            } catch (Exception var5) {
            }
        }
        this.method233();
    }

    public void start() {
        if (field2202 == this && !field2193) {
            field2189 = 0L;
        }
    }

    public void stop() {
        if (field2202 == this && !field2193) {
            field2189 = class116.method2794() + 4000L;
        }
    }

    public void destroy() {
        if (field2202 == this && !field2193) {
            field2189 = class116.method2794();
            class128.method2645(5000L);
            this.method2894();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2202 != this || field2193) {
            return;
        }
        field2205 = true;
        if (Statics.field2093 != null && Statics.field2093.startsWith("1.5") && class116.method2794() - field2192 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field763 && var2.height >= Statics.field576) {
                field2191 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2206 = true;
        field2205 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2206 = false;
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

    @ObfuscatedName("ec.ru(Ljava/lang/String;B)V")
    public void method2895(String arg0) {
        if (this.field2200) {
            return;
        }
        this.field2200 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ec.rj(I)Ljava/awt/Container;")
    public Container method2840() {
        return Statics.field62 == null ? this : Statics.field62;
    }

    @ObfuscatedName("ec.ry(B)Ljava/awt/Dimension;")
    public Dimension method2841() {
        Container var1 = this.method2840();
        int var2 = Math.max(var1.getWidth(), Statics.field849);
        int var3 = Math.max(var1.getHeight(), Statics.field1962);
        if (Statics.field62 != null) {
            Insets var4 = Statics.field62.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    public abstract void init();

    @ObfuscatedName("ec.p(B)V")
    public abstract void method223();

    @ObfuscatedName("ec.h(S)V")
    public abstract void method348();

    @ObfuscatedName("ec.g(I)V")
    public abstract void method225();

    @ObfuscatedName("ec.w(I)V")
    public abstract void method233();

    @ObfuscatedName("ec.a(B)V")
    public abstract void method438();
}
