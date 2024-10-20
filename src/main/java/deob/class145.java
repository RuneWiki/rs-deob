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

@ObfuscatedName("ek")
public abstract class class145 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ek.pc")
    public static class145 field2220 = null;

    @ObfuscatedName("ek.pi")
    public static int field2213 = 0;

    @ObfuscatedName("ek.pk")
    public static long field2214 = 0L;

    @ObfuscatedName("ek.pz")
    public static boolean field2215 = false;

    @ObfuscatedName("ek.qa")
    public static int field2217 = 20;

    @ObfuscatedName("ek.qr")
    public static int field2218 = 1;

    @ObfuscatedName("ek.qb")
    public static int field2219 = 0;

    @ObfuscatedName("ek.qc")
    public static long[] field2223 = new long[32];

    @ObfuscatedName("ek.qw")
    public static long[] field2221 = new long[32];

    @ObfuscatedName("ek.qt")
    public static int field2227 = 0;

    @ObfuscatedName("ek.qx")
    public static int field2222 = 0;

    @ObfuscatedName("ek.qi")
    public static volatile boolean field2224 = true;

    @ObfuscatedName("ek.qu")
    public static int field2225 = 500;

    @ObfuscatedName("ek.qv")
    public static boolean field2226 = false;

    @ObfuscatedName("ek.qy")
    public static volatile boolean field2230 = false;

    @ObfuscatedName("ek.rc")
    public static volatile long field2228 = 0L;

    @ObfuscatedName("ek.rl")
    public static volatile boolean field2229 = true;

    @ObfuscatedName("ek.pw")
    public boolean field2216 = false;

    @ObfuscatedName("ek.rk(IIII)V")
    public final void method2905(int arg0, int arg1, int arg2) {
        try {
            if (field2220 != null) {
                field2213++;
                if (field2213 >= 3) {
                    this.method2918("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2220 = this;
            Statics.field236 = arg0;
            Statics.field234 = arg1;
            Statics.field2244 = arg2;
            Statics.field2252 = this;
            if (Statics.field2037 == null) {
                Statics.field2037 = new class137();
            }
            Statics.field2037.method2739(this, 1);
        } catch (Exception var5) {
            class149.method1((String) null, var5);
            this.method2918("crash");
        }
    }

    @ObfuscatedName("ek.ru(I)V")
    public final synchronized void method2866() {
        Container var1 = this.method2876();
        if (Statics.field1538 != null) {
            Statics.field1538.removeFocusListener(this);
            var1.remove(Statics.field1538);
        }
        Statics.field236 = Math.max(var1.getWidth(), Statics.field712);
        Statics.field234 = Math.max(var1.getHeight(), Statics.field602);
        if (Statics.field774 != null) {
            Insets var2 = Statics.field774.getInsets();
            Statics.field236 -= var2.right + var2.left;
            Statics.field234 -= var2.top + var2.bottom;
        }
        Statics.field1538 = new class140(this);
        var1.add(Statics.field1538);
        Statics.field1538.setSize(Statics.field236, Statics.field234);
        Statics.field1538.setVisible(true);
        if (Statics.field774 == var1) {
            Insets var3 = Statics.field774.getInsets();
            Statics.field1538.setLocation(field2227 + var3.left, field2222 + var3.top);
        } else {
            Statics.field1538.setLocation(field2227, field2222);
        }
        Statics.field1538.addFocusListener(this);
        Statics.field1538.requestFocus();
        field2224 = true;
        class78 var4 = class78.method607(Statics.field236, Statics.field234, Statics.field1538);
        if (Statics.field992 != null) {
            Statics.field992.method1503(var4.field1399.getGraphics(), 0, 0);
        }
        Statics.field992 = var4;
        field2230 = false;
        field2228 = Statics.method162();
    }

    @ObfuscatedName("ek.rs(B)Z")
    public final boolean method2926() {
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
                this.method2918("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2113 != null) {
                String var1 = Statics.field2113.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field787;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2918("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class164.method172(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        boolean var5 = class164.method2970(var4, 10, true);
                        if (var5 && class164.method2833(var4) < 10) {
                            this.method2918("wrongjava");
                            return;
                        }
                    }
                    field2218 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2866();
            this.method468();
            class134 var6;
            try {
                var6 = new class148();
            } catch (Throwable var13) {
                var6 = new class142();
            }
            Statics.field680 = var6;
            label85: while (true) {
                class137 var9;
                Canvas var10;
                do {
                    if (field2214 != 0L && Statics.method162() >= field2214) {
                        break label85;
                    }
                    Statics.field2040 = Statics.field680.method2708(field2217, field2218);
                    for (int var8 = 0; var8 < Statics.field2040; var8++) {
                        this.method2878();
                    }
                    this.method2869();
                    var9 = Statics.field2037;
                    var10 = Statics.field1538;
                } while (var9.field2110 == null);
                for (int var11 = 0; var11 < 50 && var9.field2110.peekEvent() != null; var11++) {
                    class128.method2158(1L);
                }
                if (var10 != null) {
                    var9.field2110.postEvent(new ActionEvent(var10, 1001, "dummy"));
                }
            }
        } catch (Exception var14) {
            class149.method1((String) null, var14);
            this.method2918("crash");
        }
        this.method2864();
    }

    @ObfuscatedName("ek.rt(I)V")
    public void method2878() {
        long var1 = Statics.method162();
        long var3 = field2221[Statics.field1074];
        field2221[Statics.field1074] = var1;
        Statics.field1074 = Statics.field1074 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2104 = field2229;
        }
        this.method234();
    }

    @ObfuscatedName("ek.rm(I)V")
    public void method2869() {
        Container var1 = this.method2876();
        long var2 = Statics.method162();
        long var4 = field2223[Statics.field1920];
        field2223[Statics.field1920] = var2;
        Statics.field1920 = Statics.field1920 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2219 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2225 - 1 > 50) {
            field2225 -= 50;
            field2224 = true;
            Statics.field1538.setSize(Statics.field236, Statics.field234);
            Statics.field1538.setVisible(true);
            if (Statics.field774 == var1) {
                Insets var7 = Statics.field774.getInsets();
                Statics.field1538.setLocation(field2227 + var7.left, field2222 + var7.top);
            } else {
                Statics.field1538.setLocation(field2227, field2222);
            }
        }
        this.method235();
    }

    @ObfuscatedName("ek.ro(I)V")
    public final synchronized void method2864() {
        if (field2215) {
            return;
        }
        field2215 = true;
        try {
            Statics.field1538.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method562();
        } catch (Exception var7) {
        }
        if (Statics.field774 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field2037 != null) {
            try {
                Statics.field2037.method2736();
            } catch (Exception var5) {
            }
        }
        this.method570();
    }

    public void start() {
        if (field2220 == this && !field2215) {
            field2214 = 0L;
        }
    }

    public void stop() {
        if (field2220 == this && !field2215) {
            field2214 = Statics.method162() + 4000L;
        }
    }

    public void destroy() {
        if (field2220 == this && !field2215) {
            field2214 = Statics.method162();
            class128.method2158(5000L);
            this.method2864();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2220 != this || field2215) {
            return;
        }
        field2224 = true;
        if (Statics.field787 != null && Statics.field787.startsWith("1.5") && Statics.method162() - field2228 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field236 && var2.height >= Statics.field234) {
                field2230 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2229 = true;
        field2224 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2229 = false;
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

    @ObfuscatedName("ek.rb(Ljava/lang/String;I)V")
    public void method2918(String arg0) {
        if (this.field2216) {
            return;
        }
        this.field2216 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ek.ry(I)Ljava/awt/Container;")
    public Container method2876() {
        return Statics.field774 == null ? this : Statics.field774;
    }

    @ObfuscatedName("ek.rq(I)Ljava/awt/Dimension;")
    public Dimension method2877() {
        Container var1 = this.method2876();
        int var2 = Math.max(var1.getWidth(), Statics.field712);
        int var3 = Math.max(var1.getHeight(), Statics.field602);
        if (Statics.field774 != null) {
            Insets var4 = Statics.field774.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("ek.p(I)V")
    public abstract void method468();

    @ObfuscatedName("ek.e(B)V")
    public abstract void method234();

    @ObfuscatedName("ek.m(B)V")
    public abstract void method562();

    public abstract void init();

    @ObfuscatedName("ek.y(I)V")
    public abstract void method235();

    @ObfuscatedName("ek.x(B)V")
    public abstract void method570();
}
