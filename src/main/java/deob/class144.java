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

@ObfuscatedName("ef")
public abstract class class144 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ef.pj")
    public static class144 field2180 = null;

    @ObfuscatedName("ef.pq")
    public static int field2186 = 0;

    @ObfuscatedName("ef.px")
    public static long field2179 = 0L;

    @ObfuscatedName("ef.pm")
    public static boolean field2182 = false;

    @ObfuscatedName("ef.qb")
    public static int field2178 = 20;

    @ObfuscatedName("ef.qs")
    public static int field2183 = 1;

    @ObfuscatedName("ef.qz")
    public static int field2184 = 0;

    @ObfuscatedName("ef.qg")
    public static long[] field2185 = new long[32];

    @ObfuscatedName("ef.qe")
    public static long[] field2197 = new long[32];

    @ObfuscatedName("ef.qq")
    public static int field2187 = 0;

    @ObfuscatedName("ef.qc")
    public static int field2188 = 0;

    @ObfuscatedName("ef.qd")
    public static volatile boolean field2190 = true;

    @ObfuscatedName("ef.qp")
    public static int field2191 = 500;

    @ObfuscatedName("ef.qi")
    public static boolean field2192 = false;

    @ObfuscatedName("ef.qk")
    public static volatile boolean field2193 = false;

    @ObfuscatedName("ef.ru")
    public static volatile long field2194 = 0L;

    @ObfuscatedName("ef.rp")
    public static volatile boolean field2177 = true;

    @ObfuscatedName("ef.ph")
    public boolean field2181 = false;

    @ObfuscatedName("ef.qf(IIII)V")
    public final void method2878(int arg0, int arg1, int arg2) {
        try {
            if (field2180 != null) {
                field2186++;
                if (field2186 >= 3) {
                    this.method2839("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2180 = this;
            Statics.field882 = arg0;
            Statics.field158 = arg1;
            Statics.field2211 = arg2;
            Statics.field2213 = this;
            if (Statics.field2245 == null) {
                Statics.field2245 = new class136();
            }
            Statics.field2245.method2714(this, 1);
        } catch (Exception var5) {
            class148.method1532((String) null, var5);
            this.method2839("crash");
        }
    }

    @ObfuscatedName("ef.qx(B)V")
    public final synchronized void method2854() {
        Container var1 = this.method2840();
        if (Statics.field176 != null) {
            Statics.field176.removeFocusListener(this);
            var1.remove(Statics.field176);
        }
        Statics.field882 = Math.max(var1.getWidth(), Statics.field1103);
        Statics.field158 = Math.max(var1.getHeight(), Statics.field791);
        if (Statics.field2189 != null) {
            Insets var2 = Statics.field2189.getInsets();
            Statics.field882 -= var2.right + var2.left;
            Statics.field158 -= var2.top + var2.bottom;
        }
        Statics.field176 = new class139(this);
        var1.add(Statics.field176);
        Statics.field176.setSize(Statics.field882, Statics.field158);
        Statics.field176.setVisible(true);
        if (Statics.field2189 == var1) {
            Insets var3 = Statics.field2189.getInsets();
            Statics.field176.setLocation(field2187 + var3.left, field2188 + var3.top);
        } else {
            Statics.field176.setLocation(field2187, field2188);
        }
        Statics.field176.addFocusListener(this);
        Statics.field176.requestFocus();
        field2190 = true;
        int var4 = Statics.field882;
        int var5 = Statics.field158;
        Canvas var6 = Statics.field176;
        class78 var8;
        try {
            class82 var7 = new class82();
            var7.method1536(var4, var5, var6);
            var8 = var7;
        } catch (Throwable var12) {
            class76 var10 = new class76();
            var10.method1536(var4, var5, var6);
            var8 = var10;
        }
        if (Statics.field2056 != null) {
            Statics.field2056.method1541(var8.field1405.getGraphics(), 0, 0);
        }
        Statics.field2056 = var8;
        field2193 = false;
        field2194 = class115.method645();
    }

    @ObfuscatedName("ef.qd(I)Z")
    public final boolean method2830() {
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
                this.method2839("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2102 != null) {
                String var1 = Statics.field2102.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2097;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2839("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class163.method1575(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class163.method737(var4)) {
                            int var5 = class163.method2287(var4, 10, true);
                            if (var5 < 10) {
                                this.method2839("wrongjava");
                                return;
                            }
                        }
                    }
                    field2183 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2854();
            this.method386();
            Statics.field2062 = class133.method1786();
            label77: while (true) {
                class136 var7;
                Canvas var8;
                do {
                    if (field2179 != 0L && class115.method645() >= field2179) {
                        break label77;
                    }
                    Statics.field788 = Statics.field2062.method2680(field2178, field2183);
                    for (int var6 = 0; var6 < Statics.field788; var6++) {
                        this.method2831();
                    }
                    this.method2832();
                    var7 = Statics.field2245;
                    var8 = Statics.field176;
                } while (var7.field2091 == null);
                for (int var9 = 0; var9 < 50 && var7.field2091.peekEvent() != null; var9++) {
                    class127.method1962(1L);
                }
                if (var8 != null) {
                    var7.field2091.postEvent(new ActionEvent(var8, 1001, "dummy"));
                }
            }
        } catch (Exception var11) {
            class148.method1532((String) null, var11);
            this.method2839("crash");
        }
        this.method2833();
    }

    @ObfuscatedName("ef.qt(I)V")
    public void method2831() {
        long var1 = class115.method645();
        long var3 = field2197[Statics.field976];
        field2197[Statics.field976] = var1;
        Statics.field976 = Statics.field976 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1969 = field2177;
        }
        this.method234();
    }

    @ObfuscatedName("ef.qp(B)V")
    public void method2832() {
        Container var1 = this.method2840();
        long var2 = class115.method645();
        long var4 = field2185[Statics.field1956];
        field2185[Statics.field1956] = var2;
        Statics.field1956 = Statics.field1956 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2184 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2191 - 1 > 50) {
            field2191 -= 50;
            field2190 = true;
            Statics.field176.setSize(Statics.field882, Statics.field158);
            Statics.field176.setVisible(true);
            if (Statics.field2189 == var1) {
                Insets var7 = Statics.field2189.getInsets();
                Statics.field176.setLocation(field2187 + var7.left, field2188 + var7.top);
            } else {
                Statics.field176.setLocation(field2187, field2188);
            }
        }
        this.method235();
    }

    @ObfuscatedName("ef.qi(I)V")
    public final synchronized void method2833() {
        if (field2182) {
            return;
        }
        field2182 = true;
        try {
            Statics.field176.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method236();
        } catch (Exception var7) {
        }
        if (Statics.field2189 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field2245 != null) {
            try {
                Statics.field2245.method2711();
            } catch (Exception var5) {
            }
        }
        this.method230();
    }

    public void start() {
        if (field2180 == this && !field2182) {
            field2179 = 0L;
        }
    }

    public void stop() {
        if (field2180 == this && !field2182) {
            field2179 = class115.method645() + 4000L;
        }
    }

    public void destroy() {
        if (field2180 == this && !field2182) {
            field2179 = class115.method645();
            class127.method1962(5000L);
            this.method2833();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2180 != this || field2182) {
            return;
        }
        field2190 = true;
        if (Statics.field2097 != null && Statics.field2097.startsWith("1.5") && class115.method645() - field2194 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field882 && var2.height >= Statics.field158) {
                field2193 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2177 = true;
        field2190 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2177 = false;
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

    @ObfuscatedName("dc.qk(B)V")
    public static final void method2238() {
        Statics.field1678 = null;
        Statics.field2165 = null;
        Statics.field598 = null;
    }

    @ObfuscatedName("ef.ru(Ljava/lang/String;I)V")
    public void method2839(String arg0) {
        if (this.field2181) {
            return;
        }
        this.field2181 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ef.rf(I)Ljava/awt/Container;")
    public Container method2840() {
        return Statics.field2189 == null ? this : Statics.field2189;
    }

    @ObfuscatedName("ef.rp(B)Ljava/awt/Dimension;")
    public Dimension method2841() {
        Container var1 = this.method2840();
        int var2 = Math.max(var1.getWidth(), Statics.field1103);
        int var3 = Math.max(var1.getHeight(), Statics.field791);
        if (Statics.field2189 != null) {
            Insets var4 = Statics.field2189.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("ef.j(I)V")
    public abstract void method386();

    @ObfuscatedName("ef.l(I)V")
    public abstract void method235();

    public abstract void init();

    @ObfuscatedName("ef.m(I)V")
    public abstract void method230();

    @ObfuscatedName("ef.n(I)V")
    public abstract void method234();

    @ObfuscatedName("ef.i(I)V")
    public abstract void method236();
}
