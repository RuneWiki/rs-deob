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

@ObfuscatedName("ez")
public abstract class class136 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ez.pz")
    public static class136 field2096 = null;

    @ObfuscatedName("ez.pp")
    public static int field2075 = 0;

    @ObfuscatedName("ez.pl")
    public static long field2076 = 0L;

    @ObfuscatedName("ez.ph")
    public static boolean field2077 = false;

    @ObfuscatedName("ez.pv")
    public static int field2074 = 20;

    @ObfuscatedName("ez.qw")
    public static int field2088 = 1;

    @ObfuscatedName("ez.qh")
    public static int field2081 = 0;

    @ObfuscatedName("ez.qp")
    public static long[] field2082 = new long[32];

    @ObfuscatedName("ez.qx")
    public static long[] field2083 = new long[32];

    @ObfuscatedName("ez.ql")
    public static int field2084 = 0;

    @ObfuscatedName("ez.qf")
    public static int field2085 = 0;

    @ObfuscatedName("ez.qt")
    public static volatile boolean field2086 = true;

    @ObfuscatedName("ez.qs")
    public static int field2087 = 500;

    @ObfuscatedName("ez.qi")
    public static boolean field2080 = false;

    @ObfuscatedName("ez.qd")
    public static volatile boolean field2089 = false;

    @ObfuscatedName("ez.qn")
    public static volatile long field2090 = 0L;

    @ObfuscatedName("ez.rt")
    public static volatile boolean field2091 = true;

    @ObfuscatedName("ez.pn")
    public boolean field2078 = false;

    @ObfuscatedName("ez.re(IIIB)V")
    public final void method2749(int arg0, int arg1, int arg2) {
        try {
            if (field2096 != null) {
                field2075++;
                if (field2075 >= 3) {
                    this.method2688("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2096 = this;
            Statics.field1015 = arg0;
            Statics.field1957 = arg1;
            Statics.field2108 = arg2;
            Statics.field2111 = this;
            if (Statics.field957 == null) {
                Statics.field957 = new class128();
            }
            Statics.field957.method2551(this, 1);
        } catch (Exception var5) {
            class140.method2756((String) null, var5);
            this.method2688("crash");
        }
    }

    @ObfuscatedName("ez.rz(I)V")
    public final synchronized void method2716() {
        Container var1 = this.method2744();
        if (Statics.field1309 != null) {
            Statics.field1309.removeFocusListener(this);
            var1.remove(Statics.field1309);
        }
        Statics.field1015 = Math.max(var1.getWidth(), Statics.field711);
        Statics.field1957 = Math.max(var1.getHeight(), Statics.field2524);
        if (Statics.field2132 != null) {
            Insets var2 = Statics.field2132.getInsets();
            Statics.field1015 -= var2.right + var2.left;
            Statics.field1957 -= var2.top + var2.bottom;
        }
        Statics.field1309 = new class131(this);
        var1.add(Statics.field1309);
        Statics.field1309.setSize(Statics.field1015, Statics.field1957);
        Statics.field1309.setVisible(true);
        if (Statics.field2132 == var1) {
            Insets var3 = Statics.field2132.getInsets();
            Statics.field1309.setLocation(field2084 + var3.left, field2085 + var3.top);
        } else {
            Statics.field1309.setLocation(field2084, field2085);
        }
        Statics.field1309.addFocusListener(this);
        Statics.field1309.requestFocus();
        field2086 = true;
        class73 var4 = class73.method93(Statics.field1015, Statics.field1957, Statics.field1309);
        if (Statics.field2888 != null) {
            Statics.field2888.method1419(var4.field1303.getGraphics(), 0, 0);
        }
        Statics.field2888 = var4;
        field2089 = false;
        field2090 = class107.method591();
    }

    @ObfuscatedName("ez.rq(I)Z")
    public final boolean method2686() {
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
                this.method2688("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field3060 != null) {
                String var1 = Statics.field3060.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1969;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2688("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class154.method32(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        boolean var5 = class154.method551(var4, 10, true);
                        if (var5 && class154.method975(var4) < 10) {
                            this.method2688("wrongjava");
                            return;
                        }
                    }
                    field2088 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2716();
            this.method185();
            class125 var6;
            try {
                var6 = new class139();
            } catch (Throwable var13) {
                var6 = new class133();
            }
            Statics.field1475 = var6;
            label85: while (true) {
                class128 var9;
                Canvas var10;
                do {
                    if (field2076 != 0L && class107.method591() >= field2076) {
                        break label85;
                    }
                    Statics.field2900 = Statics.field1475.method2520(field2074, field2088);
                    for (int var8 = 0; var8 < Statics.field2900; var8++) {
                        this.method2682();
                    }
                    this.method2732();
                    var9 = Statics.field957;
                    var10 = Statics.field1309;
                } while (var9.field1970 == null);
                for (int var11 = 0; var11 < 50 && var9.field1970.peekEvent() != null; var11++) {
                    class119.method172(1L);
                }
                if (var10 != null) {
                    var9.field1970.postEvent(new ActionEvent(var10, 1001, "dummy"));
                }
            }
        } catch (Exception var14) {
            class140.method2756((String) null, var14);
            this.method2688("crash");
        }
        this.method2704();
    }

    @ObfuscatedName("ez.rl(B)V")
    public void method2682() {
        long var1 = class107.method591();
        long var3 = field2083[Statics.field802];
        field2083[Statics.field802] = var1;
        Statics.field802 = Statics.field802 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2461 = field2091;
        }
        this.method459();
    }

    @ObfuscatedName("ez.rc(I)V")
    public void method2732() {
        Container var1 = this.method2744();
        long var2 = class107.method591();
        long var4 = field2082[Statics.field2946];
        field2082[Statics.field2946] = var2;
        Statics.field2946 = Statics.field2946 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2081 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2087 - 1 > 50) {
            field2087 -= 50;
            field2086 = true;
            Statics.field1309.setSize(Statics.field1015, Statics.field1957);
            Statics.field1309.setVisible(true);
            if (Statics.field2132 == var1) {
                Insets var7 = Statics.field2132.getInsets();
                Statics.field1309.setLocation(field2084 + var7.left, field2085 + var7.top);
            } else {
                Statics.field1309.setLocation(field2084, field2085);
            }
        }
        this.method187();
    }

    @ObfuscatedName("ez.ru(I)V")
    public final synchronized void method2704() {
        if (field2077) {
            return;
        }
        field2077 = true;
        try {
            Statics.field1309.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method188();
        } catch (Exception var7) {
        }
        if (Statics.field2132 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field957 != null) {
            try {
                Statics.field957.method2548();
            } catch (Exception var5) {
            }
        }
        this.method183();
    }

    @ObfuscatedName("cd.rj(B)V")
    public static final void method2013() {
        Statics.field1475.method2523();
        for (int var0 = 0; var0 < 32; var0++) {
            field2082[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2083[var1] = 0L;
        }
        Statics.field2900 = 0;
    }

    public void start() {
        if (field2096 == this && !field2077) {
            field2076 = 0L;
        }
    }

    public void stop() {
        if (field2096 == this && !field2077) {
            field2076 = class107.method591() + 4000L;
        }
    }

    public void destroy() {
        if (field2096 == this && !field2077) {
            field2076 = class107.method591();
            class119.method172(5000L);
            this.method2704();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2096 != this || field2077) {
            return;
        }
        field2086 = true;
        if (Statics.field1969 != null && Statics.field1969.startsWith("1.5") && class107.method591() - field2090 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1015 && var2.height >= Statics.field1957) {
                field2089 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2091 = true;
        field2086 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2091 = false;
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

    @ObfuscatedName("ci.ri(I)V")
    public static final void method1924() {
        Statics.field736 = null;
        Statics.field2011 = null;
        Statics.field2059 = null;
    }

    @ObfuscatedName("ez.rf(Ljava/lang/String;I)V")
    public void method2688(String arg0) {
        if (this.field2078) {
            return;
        }
        this.field2078 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ez.rb(B)Ljava/awt/Container;")
    public Container method2744() {
        return Statics.field2132 == null ? this : Statics.field2132;
    }

    @ObfuscatedName("ez.rv(I)Ljava/awt/Dimension;")
    public Dimension method2690() {
        Container var1 = this.method2744();
        int var2 = Math.max(var1.getWidth(), Statics.field711);
        int var3 = Math.max(var1.getHeight(), Statics.field2524);
        if (Statics.field2132 != null) {
            Insets var4 = Statics.field2132.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("ez.e(I)V")
    public abstract void method185();

    @ObfuscatedName("ez.i(I)V")
    public abstract void method459();

    @ObfuscatedName("ez.f(I)V")
    public abstract void method188();

    @ObfuscatedName("ez.b(B)V")
    public abstract void method183();

    @ObfuscatedName("ez.o(I)V")
    public abstract void method187();

    public abstract void init();
}
