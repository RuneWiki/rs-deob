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
public abstract class class136 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ea.pu")
    public static class136 field2082 = null;

    @ObfuscatedName("ea.pc")
    public static int field2083 = 0;

    @ObfuscatedName("ea.pi")
    public static long field2089 = 0L;

    @ObfuscatedName("ea.pd")
    public static boolean field2085 = false;

    @ObfuscatedName("ea.pp")
    public static int field2094 = 20;

    @ObfuscatedName("ea.pm")
    public static int field2099 = 1;

    @ObfuscatedName("ea.qc")
    public static int field2093 = 0;

    @ObfuscatedName("ea.qm")
    public static long[] field2090 = new long[32];

    @ObfuscatedName("ea.qg")
    public static long[] field2091 = new long[32];

    @ObfuscatedName("ea.qi")
    public static int field2092 = 0;

    @ObfuscatedName("ea.qh")
    public static int field2087 = 0;

    @ObfuscatedName("ea.qb")
    public static volatile boolean field2088 = true;

    @ObfuscatedName("ea.qf")
    public static int field2084 = 500;

    @ObfuscatedName("ea.qt")
    public static boolean field2096 = false;

    @ObfuscatedName("ea.qv")
    public static volatile boolean field2097 = false;

    @ObfuscatedName("ea.qa")
    public static volatile long field2098 = 0L;

    @ObfuscatedName("ea.ro")
    public static volatile boolean field2095 = true;

    @ObfuscatedName("ea.pg")
    public boolean field2086 = false;

    @ObfuscatedName("ea.ri(IIII)V")
    public final void method2731(int arg0, int arg1, int arg2) {
        try {
            if (field2082 != null) {
                field2083++;
                if (field2083 >= 3) {
                    this.method2740("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2082 = this;
            Statics.field3047 = arg0;
            Statics.field187 = arg1;
            Statics.field2112 = arg2;
            Statics.field2118 = this;
            if (Statics.field1007 == null) {
                Statics.field1007 = new class128();
            }
            Statics.field1007.method2607(this, 1);
        } catch (Exception var5) {
            class140.method530((String) null, var5);
            this.method2740("crash");
        }
    }

    @ObfuscatedName("ea.rp(B)V")
    public final synchronized void method2783() {
        Container var1 = this.method2784();
        if (Statics.field594 != null) {
            Statics.field594.removeFocusListener(this);
            var1.remove(Statics.field594);
        }
        Statics.field3047 = Math.max(var1.getWidth(), Statics.field212);
        Statics.field187 = Math.max(var1.getHeight(), Statics.field1958);
        if (Statics.field732 != null) {
            Insets var2 = Statics.field732.getInsets();
            Statics.field3047 -= var2.right + var2.left;
            Statics.field187 -= var2.top + var2.bottom;
        }
        Statics.field594 = new class131(this);
        var1.add(Statics.field594);
        Statics.field594.setSize(Statics.field3047, Statics.field187);
        Statics.field594.setVisible(true);
        if (Statics.field732 == var1) {
            Insets var3 = Statics.field732.getInsets();
            Statics.field594.setLocation(field2092 + var3.left, field2087 + var3.top);
        } else {
            Statics.field594.setLocation(field2092, field2087);
        }
        Statics.field594.addFocusListener(this);
        Statics.field594.requestFocus();
        field2088 = true;
        class73 var4 = class73.method813(Statics.field3047, Statics.field187, Statics.field594);
        if (Statics.field816 != null) {
            Statics.field816.method1408(var4.field1323.getGraphics(), 0, 0);
        }
        Statics.field816 = var4;
        field2097 = false;
        field2098 = class107.method2661();
    }

    @ObfuscatedName("ea.rs(I)Z")
    public final boolean method2733() {
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
                this.method2740("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1984 != null) {
                String var1 = Statics.field1984.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1976;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2740("wrongjava");
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
                        if (class154.method537(var6)) {
                            int var7 = class154.method1937(var6, 10, true);
                            if (var7 < 10) {
                                this.method2740("wrongjava");
                                return;
                            }
                        }
                    }
                    field2099 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2783();
            this.method185();
            Statics.field642 = class125.method38();
            while (field2089 == 0L || class107.method2661() < field2089) {
                Statics.field1859 = Statics.field642.method2581(field2094, field2099);
                for (int var8 = 0; var8 < Statics.field1859; var8++) {
                    this.method2734();
                }
                this.method2735();
                class134.method911(Statics.field1007, Statics.field594);
            }
        } catch (Exception var10) {
            class140.method530((String) null, var10);
            this.method2740("crash");
        }
        this.method2736();
    }

    @ObfuscatedName("ea.rv(I)V")
    public void method2734() {
        long var1 = class107.method2661();
        long var3 = field2091[Statics.field2153];
        field2091[Statics.field2153] = var1;
        Statics.field2153 = Statics.field2153 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2162 = field2095;
        }
        this.method186();
    }

    @ObfuscatedName("ea.rr(I)V")
    public void method2735() {
        Container var1 = this.method2784();
        long var2 = class107.method2661();
        long var4 = field2090[Statics.field909];
        field2090[Statics.field909] = var2;
        Statics.field909 = Statics.field909 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2093 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2084 - 1 > 50) {
            field2084 -= 50;
            field2088 = true;
            Statics.field594.setSize(Statics.field3047, Statics.field187);
            Statics.field594.setVisible(true);
            if (Statics.field732 == var1) {
                Insets var7 = Statics.field732.getInsets();
                Statics.field594.setLocation(field2092 + var7.left, field2087 + var7.top);
            } else {
                Statics.field594.setLocation(field2092, field2087);
            }
        }
        this.method436();
    }

    @ObfuscatedName("ea.rc(I)V")
    public final synchronized void method2736() {
        if (field2085) {
            return;
        }
        field2085 = true;
        try {
            Statics.field594.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method188();
        } catch (Exception var7) {
        }
        if (Statics.field732 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1007 != null) {
            try {
                Statics.field1007.method2624();
            } catch (Exception var5) {
            }
        }
        this.method209();
    }

    @ObfuscatedName("g.rl(I)V")
    public static final void method26() {
        Statics.field642.method2586();
        for (int var0 = 0; var0 < 32; var0++) {
            field2090[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2091[var1] = 0L;
        }
        Statics.field1859 = 0;
    }

    public void start() {
        if (field2082 == this && !field2085) {
            field2089 = 0L;
        }
    }

    public void stop() {
        if (field2082 == this && !field2085) {
            field2089 = class107.method2661() + 4000L;
        }
    }

    public void destroy() {
        if (field2082 == this && !field2085) {
            field2089 = class107.method2661();
            Statics.method832(5000L);
            this.method2736();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2082 != this || field2085) {
            return;
        }
        field2088 = true;
        if (Statics.field1976 != null && Statics.field1976.startsWith("1.5") && class107.method2661() - field2098 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field3047 && var2.height >= Statics.field187) {
                field2097 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2095 = true;
        field2088 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2095 = false;
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

    @ObfuscatedName("ax.rd(I)V")
    public static final void method831() {
        Statics.field200 = null;
        Statics.field998 = null;
        Statics.field1678 = null;
    }

    @ObfuscatedName("ea.sk(Ljava/lang/String;I)V")
    public void method2740(String arg0) {
        if (this.field2086) {
            return;
        }
        this.field2086 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ea.sd(I)Ljava/awt/Container;")
    public Container method2784() {
        return Statics.field732 == null ? this : Statics.field732;
    }

    @ObfuscatedName("ea.sg(B)Ljava/awt/Dimension;")
    public Dimension method2742() {
        Container var1 = this.method2784();
        int var2 = Math.max(var1.getWidth(), Statics.field212);
        int var3 = Math.max(var1.getHeight(), Statics.field1958);
        if (Statics.field732 != null) {
            Insets var4 = Statics.field732.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    public abstract void init();

    @ObfuscatedName("ea.r(I)V")
    public abstract void method185();

    @ObfuscatedName("ea.y(I)V")
    public abstract void method436();

    @ObfuscatedName("ea.k(I)V")
    public abstract void method188();

    @ObfuscatedName("ea.v(I)V")
    public abstract void method186();

    @ObfuscatedName("ea.g(I)V")
    public abstract void method209();
}
