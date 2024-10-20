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

@ObfuscatedName("eb")
public abstract class class144 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("eb.pj")
    public static class144 field2185 = null;

    @ObfuscatedName("eb.px")
    public static int field2176 = 0;

    @ObfuscatedName("eb.pb")
    public static long field2177 = 0L;

    @ObfuscatedName("eb.ps")
    public static boolean field2180 = false;

    @ObfuscatedName("eb.qc")
    public static int field2188 = 20;

    @ObfuscatedName("eb.qt")
    public static int field2181 = 1;

    @ObfuscatedName("eb.qw")
    public static int field2182 = 0;

    @ObfuscatedName("eb.qr")
    public static long[] field2183 = new long[32];

    @ObfuscatedName("eb.qy")
    public static long[] field2184 = new long[32];

    @ObfuscatedName("eb.qg")
    public static int field2189 = 0;

    @ObfuscatedName("eb.qq")
    public static int field2186 = 0;

    @ObfuscatedName("eb.qh")
    public static volatile boolean field2187 = true;

    @ObfuscatedName("eb.qn")
    public static int field2193 = 500;

    @ObfuscatedName("eb.qs")
    public static boolean field2192 = false;

    @ObfuscatedName("eb.ql")
    public static volatile boolean field2190 = false;

    @ObfuscatedName("eb.rf")
    public static volatile long field2191 = 0L;

    @ObfuscatedName("eb.rx")
    public static volatile boolean field2195 = true;

    @ObfuscatedName("eb.pp")
    public boolean field2179 = false;

    @ObfuscatedName("eb.qg(IIIB)V")
    public final void method2936(int arg0, int arg1, int arg2) {
        try {
            if (field2185 != null) {
                field2176++;
                if (field2176 >= 3) {
                    this.method2876("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2185 = this;
            Statics.field2049 = arg0;
            Statics.field2102 = arg1;
            Statics.field2208 = arg2;
            Statics.field2209 = this;
            if (Statics.field631 == null) {
                Statics.field631 = new class136();
            }
            Statics.field631.method2747(this, 1);
        } catch (Exception var5) {
            class148.method769((String) null, var5);
            this.method2876("crash");
        }
    }

    @ObfuscatedName("eb.qq(I)V")
    public final synchronized void method2871() {
        Container var1 = this.method2877();
        if (Statics.field245 != null) {
            Statics.field245.removeFocusListener(this);
            var1.remove(Statics.field245);
        }
        Statics.field2049 = Math.max(var1.getWidth(), Statics.field144);
        Statics.field2102 = Math.max(var1.getHeight(), Statics.field1886);
        if (Statics.field903 != null) {
            Insets var2 = Statics.field903.getInsets();
            Statics.field2049 -= var2.right + var2.left;
            Statics.field2102 -= var2.top + var2.bottom;
        }
        Statics.field245 = new class139(this);
        var1.add(Statics.field245);
        Statics.field245.setSize(Statics.field2049, Statics.field2102);
        Statics.field245.setVisible(true);
        if (Statics.field903 == var1) {
            Insets var3 = Statics.field903.getInsets();
            Statics.field245.setLocation(field2189 + var3.left, field2186 + var3.top);
        } else {
            Statics.field245.setLocation(field2189, field2186);
        }
        Statics.field245.addFocusListener(this);
        Statics.field245.requestFocus();
        field2187 = true;
        int var4 = Statics.field2049;
        int var5 = Statics.field2102;
        Canvas var6 = Statics.field245;
        class78 var8;
        try {
            class82 var7 = new class82();
            var7.method1520(var4, var5, var6);
            var8 = var7;
        } catch (Throwable var12) {
            class76 var10 = new class76();
            var10.method1520(var4, var5, var6);
            var8 = var10;
        }
        if (Statics.field1441 != null) {
            Statics.field1441.method1516(var8.field1383.getGraphics(), 0, 0);
        }
        Statics.field1441 = var8;
        field2190 = false;
        field2191 = class115.method2038();
    }

    @ObfuscatedName("eb.qp(I)Z")
    public final boolean method2866() {
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
                this.method2876("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2090 != null) {
                String var1 = Statics.field2090.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2081;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2876("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class163.method909(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class163.method213(var4)) {
                            int var5 = class163.method576(var4, 10, true);
                            if (var5 < 10) {
                                this.method2876("wrongjava");
                                return;
                            }
                        }
                    }
                    field2181 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2871();
            this.method531();
            class133 var6;
            try {
                var6 = new class147();
            } catch (Throwable var10) {
                var6 = new class141();
            }
            Statics.field1027 = var6;
            while (field2177 == 0L || class115.method2038() < field2177) {
                Statics.field1752 = Statics.field1027.method2714(field2188, field2181);
                for (int var8 = 0; var8 < Statics.field1752; var8++) {
                    this.method2867();
                }
                this.method2927();
                class142.method683(Statics.field631, Statics.field245);
            }
        } catch (Exception var11) {
            class148.method769((String) null, var11);
            this.method2876("crash");
        }
        this.method2869();
    }

    @ObfuscatedName("eb.qu(I)V")
    public void method2867() {
        long var1 = class115.method2038();
        long var3 = field2184[Statics.field672];
        field2184[Statics.field672] = var1;
        Statics.field672 = Statics.field672 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1517 = field2195;
        }
        this.method539();
    }

    @ObfuscatedName("eb.qz(B)V")
    public void method2927() {
        Container var1 = this.method2877();
        long var2 = class115.method2038();
        long var4 = field2183[Statics.field989];
        field2183[Statics.field989] = var2;
        Statics.field989 = Statics.field989 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2182 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2193 - 1 > 50) {
            field2193 -= 50;
            field2187 = true;
            Statics.field245.setSize(Statics.field2049, Statics.field2102);
            Statics.field245.setVisible(true);
            if (Statics.field903 == var1) {
                Insets var7 = Statics.field903.getInsets();
                Statics.field245.setLocation(field2189 + var7.left, field2186 + var7.top);
            } else {
                Statics.field245.setLocation(field2189, field2186);
            }
        }
        this.method309();
    }

    @ObfuscatedName("eb.qb(I)V")
    public final synchronized void method2869() {
        if (field2180) {
            return;
        }
        field2180 = true;
        try {
            Statics.field245.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method263();
        } catch (Exception var7) {
        }
        if (Statics.field903 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field631 != null) {
            try {
                Statics.field631.method2740();
            } catch (Exception var5) {
            }
        }
        this.method379();
    }

    @ObfuscatedName("bi.qa(I)V")
    public static final void method1250() {
        Statics.field1027.method2712();
        for (int var0 = 0; var0 < 32; var0++) {
            field2183[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2184[var1] = 0L;
        }
        Statics.field1752 = 0;
    }

    public void start() {
        if (field2185 == this && !field2180) {
            field2177 = 0L;
        }
    }

    public void stop() {
        if (field2185 == this && !field2180) {
            field2177 = class115.method2038() + 4000L;
        }
    }

    public void destroy() {
        if (field2185 == this && !field2180) {
            field2177 = class115.method2038();
            class127.method692(5000L);
            this.method2869();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2185 != this || field2180) {
            return;
        }
        field2187 = true;
        if (Statics.field2081 != null && Statics.field2081.startsWith("1.5") && class115.method2038() - field2191 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field2049 && var2.height >= Statics.field2102) {
                field2190 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2195 = true;
        field2187 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2195 = false;
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

    @ObfuscatedName("eb.qm(Ljava/lang/String;I)V")
    public void method2876(String arg0) {
        if (this.field2179) {
            return;
        }
        this.field2179 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("eb.qi(S)Ljava/awt/Container;")
    public Container method2877() {
        return Statics.field903 == null ? this : Statics.field903;
    }

    @ObfuscatedName("eb.qd(S)Ljava/awt/Dimension;")
    public Dimension method2878() {
        Container var1 = this.method2877();
        int var2 = Math.max(var1.getWidth(), Statics.field144);
        int var3 = Math.max(var1.getHeight(), Statics.field1886);
        if (Statics.field903 != null) {
            Insets var4 = Statics.field903.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("eb.i(B)V")
    public abstract void method263();

    public abstract void init();

    @ObfuscatedName("eb.u(I)V")
    public abstract void method531();

    @ObfuscatedName("eb.h(B)V")
    public abstract void method309();

    @ObfuscatedName("eb.m(I)V")
    public abstract void method379();

    @ObfuscatedName("eb.a(I)V")
    public abstract void method539();
}
