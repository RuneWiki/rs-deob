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

@ObfuscatedName("ex")
public abstract class class148 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ex.pw")
    public static class148 field2252 = null;

    @ObfuscatedName("ex.pl")
    public static int field2240 = 0;

    @ObfuscatedName("ex.pa")
    public static long field2241 = 0L;

    @ObfuscatedName("ex.pr")
    public static boolean field2239 = false;

    @ObfuscatedName("ex.px")
    public static int field2242 = 20;

    @ObfuscatedName("ex.ql")
    public static int field2245 = 1;

    @ObfuscatedName("ex.qv")
    public static int field2253 = 0;

    @ObfuscatedName("ex.qq")
    public static long[] field2247 = new long[32];

    @ObfuscatedName("ex.qf")
    public static long[] field2248 = new long[32];

    @ObfuscatedName("ex.qh")
    public static int field2249 = 0;

    @ObfuscatedName("ex.qb")
    public static int field2246 = 0;

    @ObfuscatedName("ex.qj")
    public static volatile boolean field2251 = true;

    @ObfuscatedName("ex.qo")
    public static int field2250 = 500;

    @ObfuscatedName("ex.qe")
    public static boolean field2244 = false;

    @ObfuscatedName("ex.qa")
    public static volatile boolean field2254 = false;

    @ObfuscatedName("ex.qd")
    public static volatile long field2255 = 0L;

    @ObfuscatedName("ex.rp")
    public static volatile boolean field2256 = true;

    @ObfuscatedName("ex.pi")
    public boolean field2243 = false;

    @ObfuscatedName("ex.qj(IIIB)V")
    public final void method2881(int arg0, int arg1, int arg2) {
        try {
            if (field2252 != null) {
                field2240++;
                if (field2240 >= 3) {
                    this.method2892("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2252 = this;
            Statics.field2297 = arg0;
            Statics.field1617 = arg1;
            Statics.field2270 = arg2;
            Statics.field2269 = this;
            if (Statics.field1147 == null) {
                Statics.field1147 = new class140();
            }
            Statics.field1147.method2768(this, 1);
        } catch (Exception var5) {
            class152.method2194((String) null, var5);
            this.method2892("crash");
        }
    }

    @ObfuscatedName("ex.qg(I)V")
    public final synchronized void method2882() {
        Container var1 = this.method2893();
        if (Statics.field1722 != null) {
            Statics.field1722.removeFocusListener(this);
            var1.remove(Statics.field1722);
        }
        Statics.field2297 = Math.max(var1.getWidth(), Statics.field126);
        Statics.field1617 = Math.max(var1.getHeight(), Statics.field2023);
        if (Statics.field1957 != null) {
            Insets var2 = Statics.field1957.getInsets();
            Statics.field2297 -= var2.right + var2.left;
            Statics.field1617 -= var2.top + var2.bottom;
        }
        Statics.field1722 = new class143(this);
        var1.add(Statics.field1722);
        Statics.field1722.setSize(Statics.field2297, Statics.field1617);
        Statics.field1722.setVisible(true);
        if (Statics.field1957 == var1) {
            Insets var3 = Statics.field1957.getInsets();
            Statics.field1722.setLocation(field2249 + var3.left, field2246 + var3.top);
        } else {
            Statics.field1722.setLocation(field2249, field2246);
        }
        Statics.field1722.addFocusListener(this);
        Statics.field1722.requestFocus();
        field2251 = true;
        int var4 = Statics.field2297;
        int var5 = Statics.field1617;
        Canvas var6 = Statics.field1722;
        class81 var8;
        try {
            class85 var7 = new class85();
            var7.method1577(var4, var5, var6);
            var8 = var7;
        } catch (Throwable var12) {
            class79 var10 = new class79();
            var10.method1577(var4, var5, var6);
            var8 = var10;
        }
        if (Statics.field636 != null) {
            Statics.field636.method1610(var8.field1446.getGraphics(), 0, 0);
        }
        Statics.field636 = var8;
        field2254 = false;
        field2255 = class119.method137();
    }

    @ObfuscatedName("ex.qo(I)Z")
    public final boolean method2883() {
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
                this.method2892("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2147 != null) {
                String var1 = Statics.field2147.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2141;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2892("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class167.method3062(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class167.method180(var4)) {
                            int var5 = class167.method2020(var4, 10, true);
                            if (var5 < 10) {
                                this.method2892("wrongjava");
                                return;
                            }
                        }
                    }
                    field2245 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2882();
            this.method230();
            Statics.field1149 = class137.method770();
            label77: while (true) {
                class140 var7;
                Canvas var8;
                do {
                    if (field2241 != 0L && class119.method137() >= field2241) {
                        break label77;
                    }
                    Statics.field1808 = Statics.field1149.method2733(field2242, field2245);
                    for (int var6 = 0; var6 < Statics.field1808; var6++) {
                        this.method2955();
                    }
                    this.method2886();
                    var7 = Statics.field1147;
                    var8 = Statics.field1722;
                } while (var7.field2142 == null);
                for (int var9 = 0; var9 < 50 && var7.field2142.peekEvent() != null; var9++) {
                    class131.method2276(1L);
                }
                if (var8 != null) {
                    var7.field2142.postEvent(new ActionEvent(var8, 1001, "dummy"));
                }
            }
        } catch (Exception var11) {
            class152.method2194((String) null, var11);
            this.method2892("crash");
        }
        this.method2887();
    }

    @ObfuscatedName("ex.qe(I)V")
    public void method2955() {
        long var1 = class119.method137();
        long var3 = field2248[Statics.field2772];
        field2248[Statics.field2772] = var1;
        Statics.field2772 = Statics.field2772 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field666 = field2256;
        }
        this.method303();
    }

    @ObfuscatedName("ex.qa(S)V")
    public void method2886() {
        Container var1 = this.method2893();
        long var2 = class119.method137();
        long var4 = field2247[Statics.field688];
        field2247[Statics.field688] = var2;
        Statics.field688 = Statics.field688 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2253 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2250 - 1 > 50) {
            field2250 -= 50;
            field2251 = true;
            Statics.field1722.setSize(Statics.field2297, Statics.field1617);
            Statics.field1722.setVisible(true);
            if (Statics.field1957 == var1) {
                Insets var7 = Statics.field1957.getInsets();
                Statics.field1722.setLocation(field2249 + var7.left, field2246 + var7.top);
            } else {
                Statics.field1722.setLocation(field2249, field2246);
            }
        }
        this.method418();
    }

    @ObfuscatedName("ex.qd(I)V")
    public final synchronized void method2887() {
        if (field2239) {
            return;
        }
        field2239 = true;
        try {
            Statics.field1722.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method233();
        } catch (Exception var7) {
        }
        if (Statics.field1957 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1147 != null) {
            try {
                Statics.field1147.method2764();
            } catch (Exception var5) {
            }
        }
        this.method479();
    }

    public void start() {
        if (field2252 == this && !field2239) {
            field2241 = 0L;
        }
    }

    public void stop() {
        if (field2252 == this && !field2239) {
            field2241 = class119.method137() + 4000L;
        }
    }

    public void destroy() {
        if (field2252 == this && !field2239) {
            field2241 = class119.method137();
            class131.method2276(5000L);
            this.method2887();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2252 != this || field2239) {
            return;
        }
        field2251 = true;
        if (Statics.field2141 != null && Statics.field2141.startsWith("1.5") && class119.method137() - field2255 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field2297 && var2.height >= Statics.field1617) {
                field2254 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2256 = true;
        field2251 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2256 = false;
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

    @ObfuscatedName("ex.rl(Ljava/lang/String;I)V")
    public void method2892(String arg0) {
        if (this.field2243) {
            return;
        }
        this.field2243 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ex.rp(I)Ljava/awt/Container;")
    public Container method2893() {
        return Statics.field1957 == null ? this : Statics.field1957;
    }

    @ObfuscatedName("ex.ra(I)Ljava/awt/Dimension;")
    public Dimension method2894() {
        Container var1 = this.method2893();
        int var2 = Math.max(var1.getWidth(), Statics.field126);
        int var3 = Math.max(var1.getHeight(), Statics.field2023);
        if (Statics.field1957 != null) {
            Insets var4 = Statics.field1957.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("ex.m(B)V")
    public abstract void method230();

    public abstract void init();

    @ObfuscatedName("ex.k(B)V")
    public abstract void method303();

    @ObfuscatedName("ex.w(I)V")
    public abstract void method233();

    @ObfuscatedName("ex.t(I)V")
    public abstract void method479();

    @ObfuscatedName("ex.c(I)V")
    public abstract void method418();
}
