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

@ObfuscatedName("ej")
public abstract class class136 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ej.pd")
    public static class136 field2111 = null;

    @ObfuscatedName("ej.pg")
    public static int field2095 = 0;

    @ObfuscatedName("ej.pq")
    public static long field2096 = 0L;

    @ObfuscatedName("ej.pi")
    public static boolean field2098 = false;

    @ObfuscatedName("ej.ph")
    public static int field2099 = 20;

    @ObfuscatedName("ej.px")
    public static int field2100 = 1;

    @ObfuscatedName("ej.qd")
    public static int field2101 = 0;

    @ObfuscatedName("ej.qo")
    public static long[] field2094 = new long[32];

    @ObfuscatedName("ej.qh")
    public static long[] field2103 = new long[32];

    @ObfuscatedName("ej.qw")
    public static int field2108 = 0;

    @ObfuscatedName("ej.qs")
    public static int field2102 = 0;

    @ObfuscatedName("ej.qq")
    public static volatile boolean field2106 = true;

    @ObfuscatedName("ej.qy")
    public static int field2107 = 500;

    @ObfuscatedName("ej.qt")
    public static boolean field2097 = false;

    @ObfuscatedName("ej.qr")
    public static volatile boolean field2109 = false;

    @ObfuscatedName("ej.qi")
    public static volatile long field2105 = 0L;

    @ObfuscatedName("ej.rf")
    public static volatile boolean field2110 = true;

    @ObfuscatedName("ej.pc")
    public boolean field2104 = false;

    @ObfuscatedName("ej.ru(IIII)V")
    public final void method2751(int arg0, int arg1, int arg2) {
        try {
            if (field2111 != null) {
                field2095++;
                if (field2095 >= 3) {
                    this.method2753("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2111 = this;
            Statics.field1461 = arg0;
            Statics.field118 = arg1;
            Statics.field2128 = arg2;
            Statics.field2124 = this;
            if (Statics.field969 == null) {
                Statics.field969 = new class128();
            }
            Statics.field969.method2624(this, 1);
        } catch (Exception var5) {
            class140.method1864((String) null, var5);
            this.method2753("crash");
        }
    }

    @ObfuscatedName("ej.ry(B)V")
    public final synchronized void method2748() {
        Container var1 = this.method2754();
        if (Statics.field910 != null) {
            Statics.field910.removeFocusListener(this);
            var1.remove(Statics.field910);
        }
        Statics.field1461 = Math.max(var1.getWidth(), Statics.field1615);
        Statics.field118 = Math.max(var1.getHeight(), Statics.field1488);
        if (Statics.field1702 != null) {
            Insets var2 = Statics.field1702.getInsets();
            Statics.field1461 -= var2.right + var2.left;
            Statics.field118 -= var2.top + var2.bottom;
        }
        Statics.field910 = new class131(this);
        var1.add(Statics.field910);
        Statics.field910.setSize(Statics.field1461, Statics.field118);
        Statics.field910.setVisible(true);
        if (Statics.field1702 == var1) {
            Insets var3 = Statics.field1702.getInsets();
            Statics.field910.setLocation(field2108 + var3.left, field2102 + var3.top);
        } else {
            Statics.field910.setLocation(field2108, field2102);
        }
        Statics.field910.addFocusListener(this);
        Statics.field910.requestFocus();
        field2106 = true;
        class73 var4 = class73.method2658(Statics.field1461, Statics.field118, Statics.field910);
        if (Statics.field233 != null) {
            Statics.field233.method1419(var4.field1328.getGraphics(), 0, 0);
        }
        Statics.field233 = var4;
        field2109 = false;
        field2105 = class107.method1670();
    }

    @ObfuscatedName("ej.rc(I)Z")
    public final boolean method2744() {
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
                this.method2753("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2000 != null) {
                String var1 = Statics.field2000.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field3140;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2753("wrongjava");
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
                        if (class154.method92(var6)) {
                            int var7 = class154.method590(var6, 10, true);
                            if (var7 < 10) {
                                this.method2753("wrongjava");
                                return;
                            }
                        }
                    }
                    field2100 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2748();
            this.method180();
            Statics.field1730 = class125.method2612();
            label83: while (true) {
                class128 var9;
                Canvas var10;
                do {
                    if (field2096 != 0L && class107.method1670() >= field2096) {
                        break label83;
                    }
                    Statics.field1605 = Statics.field1730.method2590(field2099, field2100);
                    for (int var8 = 0; var8 < Statics.field1605; var8++) {
                        this.method2745();
                    }
                    this.method2746();
                    var9 = Statics.field969;
                    var10 = Statics.field910;
                } while (var9.field2006 == null);
                for (int var11 = 0; var11 < 50 && var9.field2006.peekEvent() != null; var11++) {
                    class119.method3147(1L);
                }
                if (var10 != null) {
                    var9.field2006.postEvent(new ActionEvent(var10, 1001, "dummy"));
                }
            }
        } catch (Exception var13) {
            class140.method1864((String) null, var13);
            this.method2753("crash");
        }
        this.method2743();
    }

    @ObfuscatedName("ej.ra(I)V")
    public void method2745() {
        long var1 = class107.method1670();
        long var3 = field2103[Statics.field235];
        field2103[Statics.field235] = var1;
        Statics.field235 = Statics.field235 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field3029 = field2110;
        }
        this.method368();
    }

    @ObfuscatedName("ej.rt(I)V")
    public void method2746() {
        Container var1 = this.method2754();
        long var2 = class107.method1670();
        long var4 = field2094[Statics.field1979];
        field2094[Statics.field1979] = var2;
        Statics.field1979 = Statics.field1979 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2101 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2107 - 1 > 50) {
            field2107 -= 50;
            field2106 = true;
            Statics.field910.setSize(Statics.field1461, Statics.field118);
            Statics.field910.setVisible(true);
            if (Statics.field1702 == var1) {
                Insets var7 = Statics.field1702.getInsets();
                Statics.field910.setLocation(field2108 + var7.left, field2102 + var7.top);
            } else {
                Statics.field910.setLocation(field2108, field2102);
            }
        }
        this.method182();
    }

    @ObfuscatedName("ej.rk(I)V")
    public final synchronized void method2743() {
        if (field2098) {
            return;
        }
        field2098 = true;
        try {
            Statics.field910.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method183();
        } catch (Exception var7) {
        }
        if (Statics.field1702 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field969 != null) {
            try {
                Statics.field969.method2627();
            } catch (Exception var5) {
            }
        }
        this.method178();
    }

    @ObfuscatedName("cw.rn(I)V")
    public static final void method1867() {
        Statics.field1730.method2589();
        for (int var0 = 0; var0 < 32; var0++) {
            field2094[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2103[var1] = 0L;
        }
        Statics.field1605 = 0;
    }

    public void start() {
        if (field2111 == this && !field2098) {
            field2096 = 0L;
        }
    }

    public void stop() {
        if (field2111 == this && !field2098) {
            field2096 = class107.method1670() + 4000L;
        }
    }

    public void destroy() {
        if (field2111 == this && !field2098) {
            field2096 = class107.method1670();
            class119.method3147(5000L);
            this.method2743();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2111 != this || field2098) {
            return;
        }
        field2106 = true;
        if (Statics.field3140 != null && Statics.field3140.startsWith("1.5") && class107.method1670() - field2105 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1461 && var2.height >= Statics.field118) {
                field2109 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2110 = true;
        field2106 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2110 = false;
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

    @ObfuscatedName("c.ro(I)V")
    public static final void method521() {
        Statics.field569 = null;
        Statics.field149 = null;
        Statics.field1604 = null;
    }

    @ObfuscatedName("ej.rv(Ljava/lang/String;I)V")
    public void method2753(String arg0) {
        if (this.field2104) {
            return;
        }
        this.field2104 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ej.rm(I)Ljava/awt/Container;")
    public Container method2754() {
        return Statics.field1702 == null ? this : Statics.field1702;
    }

    @ObfuscatedName("ej.rl(I)Ljava/awt/Dimension;")
    public Dimension method2755() {
        Container var1 = this.method2754();
        int var2 = Math.max(var1.getWidth(), Statics.field1615);
        int var3 = Math.max(var1.getHeight(), Statics.field1488);
        if (Statics.field1702 != null) {
            Insets var4 = Statics.field1702.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("ej.g(I)V")
    public abstract void method180();

    public abstract void init();

    @ObfuscatedName("ej.f(I)V")
    public abstract void method368();

    @ObfuscatedName("ej.m(I)V")
    public abstract void method182();

    @ObfuscatedName("ej.a(B)V")
    public abstract void method183();

    @ObfuscatedName("ej.z(B)V")
    public abstract void method178();
}
