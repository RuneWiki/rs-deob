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

@ObfuscatedName("ey")
public abstract class class144 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ey.pc")
    public static class144 field2166 = null;

    @ObfuscatedName("ey.ph")
    public static int field2178 = 0;

    @ObfuscatedName("ey.pg")
    public static long field2167 = 0L;

    @ObfuscatedName("ey.pz")
    public static boolean field2168 = false;

    @ObfuscatedName("ey.qn")
    public static int field2170 = 20;

    @ObfuscatedName("ey.qd")
    public static int field2171 = 1;

    @ObfuscatedName("ey.qf")
    public static int field2185 = 0;

    @ObfuscatedName("ey.qr")
    public static long[] field2173 = new long[32];

    @ObfuscatedName("ey.ql")
    public static long[] field2174 = new long[32];

    @ObfuscatedName("ey.qb")
    public static int field2175 = 0;

    @ObfuscatedName("ey.qc")
    public static int field2187 = 0;

    @ObfuscatedName("ey.qv")
    public static volatile boolean field2179 = true;

    @ObfuscatedName("ey.qw")
    public static int field2169 = 500;

    @ObfuscatedName("ey.qa")
    public static boolean field2183 = false;

    @ObfuscatedName("ey.qu")
    public static volatile boolean field2181 = false;

    @ObfuscatedName("ey.rg")
    public static volatile long field2182 = 0L;

    @ObfuscatedName("ey.rl")
    public static volatile boolean field2180 = true;

    @ObfuscatedName("ey.pa")
    public boolean field2172 = false;

    @ObfuscatedName("ey.pi(IIIS)V")
    public final void method2852(int arg0, int arg1, int arg2) {
        try {
            if (field2166 != null) {
                field2178++;
                if (field2178 >= 3) {
                    this.method2903("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2166 = this;
            Statics.field2038 = arg0;
            Statics.field1160 = arg1;
            Statics.field1345 = arg2;
            Statics.field2201 = this;
            if (Statics.field675 == null) {
                Statics.field675 = new class136();
            }
            Statics.field675.method2702(this, 1);
        } catch (Exception var5) {
            class148.method725((String) null, var5);
            this.method2903("crash");
        }
    }

    @ObfuscatedName("ey.px(B)V")
    public final synchronized void method2896() {
        Container var1 = this.method2865();
        if (Statics.field268 != null) {
            Statics.field268.removeFocusListener(this);
            var1.remove(Statics.field268);
        }
        Statics.field2038 = Math.max(var1.getWidth(), Statics.field1084);
        Statics.field1160 = Math.max(var1.getHeight(), Statics.field752);
        if (Statics.field1071 != null) {
            Insets var2 = Statics.field1071.getInsets();
            Statics.field2038 -= var2.right + var2.left;
            Statics.field1160 -= var2.top + var2.bottom;
        }
        Statics.field268 = new class139(this);
        var1.add(Statics.field268);
        Statics.field268.setSize(Statics.field2038, Statics.field1160);
        Statics.field268.setVisible(true);
        if (Statics.field1071 == var1) {
            Insets var3 = Statics.field1071.getInsets();
            Statics.field268.setLocation(field2175 + var3.left, field2187 + var3.top);
        } else {
            Statics.field268.setLocation(field2175, field2187);
        }
        Statics.field268.addFocusListener(this);
        Statics.field268.requestFocus();
        field2179 = true;
        int var4 = Statics.field2038;
        int var5 = Statics.field1160;
        Canvas var6 = Statics.field268;
        class78 var8;
        try {
            class82 var7 = new class82();
            var7.method1490(var4, var5, var6);
            var8 = var7;
        } catch (Throwable var12) {
            class76 var10 = new class76();
            var10.method1490(var4, var5, var6);
            var8 = var10;
        }
        if (Statics.field693 != null) {
            Statics.field693.method1525(var8.field1364.getGraphics(), 0, 0);
        }
        Statics.field693 = var8;
        field2181 = false;
        field2182 = class115.method124();
    }

    @ObfuscatedName("ey.pb(B)Z")
    public final boolean method2854() {
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
                this.method2903("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2053 != null) {
                String var1 = Statics.field2053.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2054;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2903("wrongjava");
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
                        boolean var7 = class163.method2045(var6, 10, true);
                        if (var7) {
                            int var8 = class163.method2767(var6, 10, true);
                            if (var8 < 10) {
                                this.method2903("wrongjava");
                                return;
                            }
                        }
                    }
                    field2171 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2896();
            this.method233();
            Statics.field1497 = class133.method614();
            while (field2167 == 0L || class115.method124() < field2167) {
                Statics.field1512 = Statics.field1497.method2673(field2170, field2171);
                for (int var9 = 0; var9 < Statics.field1512; var9++) {
                    this.method2855();
                }
                this.method2856();
                class142.method2214(Statics.field675, Statics.field268);
            }
        } catch (Exception var11) {
            class148.method725((String) null, var11);
            this.method2903("crash");
        }
        this.method2900();
    }

    @ObfuscatedName("ey.py(B)V")
    public void method2855() {
        long var1 = class115.method124();
        long var3 = field2174[Statics.field1722];
        field2174[Statics.field1722] = var1;
        Statics.field1722 = Statics.field1722 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1059 = field2180;
        }
        this.method234();
    }

    @ObfuscatedName("ey.pp(I)V")
    public void method2856() {
        Container var1 = this.method2865();
        long var2 = class115.method124();
        long var4 = field2173[Statics.field743];
        field2173[Statics.field743] = var2;
        Statics.field743 = Statics.field743 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2185 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2169 - 1 > 50) {
            field2169 -= 50;
            field2179 = true;
            Statics.field268.setSize(Statics.field2038, Statics.field1160);
            Statics.field268.setVisible(true);
            if (Statics.field1071 == var1) {
                Insets var7 = Statics.field1071.getInsets();
                Statics.field268.setLocation(field2175 + var7.left, field2187 + var7.top);
            } else {
                Statics.field268.setLocation(field2175, field2187);
            }
        }
        this.method235();
    }

    @ObfuscatedName("ey.pd(I)V")
    public final synchronized void method2900() {
        if (field2168) {
            return;
        }
        field2168 = true;
        try {
            Statics.field268.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method236();
        } catch (Exception var7) {
        }
        if (Statics.field1071 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field675 != null) {
            try {
                Statics.field675.method2698();
            } catch (Exception var5) {
            }
        }
        this.method230();
    }

    @ObfuscatedName("dk.pf(I)V")
    public static final void method2520() {
        Statics.field1497.method2672();
        for (int var0 = 0; var0 < 32; var0++) {
            field2173[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2174[var1] = 0L;
        }
        Statics.field1512 = 0;
    }

    public void start() {
        if (field2166 == this && !field2168) {
            field2167 = 0L;
        }
    }

    public void stop() {
        if (field2166 == this && !field2168) {
            field2167 = class115.method124() + 4000L;
        }
    }

    public void destroy() {
        if (field2166 == this && !field2168) {
            field2167 = class115.method124();
            class127.method890(5000L);
            this.method2900();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2166 != this || field2168) {
            return;
        }
        field2179 = true;
        if (Statics.field2054 != null && Statics.field2054.startsWith("1.5") && class115.method124() - field2182 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field2038 && var2.height >= Statics.field1160) {
                field2181 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2180 = true;
        field2179 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2180 = false;
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

    @ObfuscatedName("ey.pc(Ljava/lang/String;I)V")
    public void method2903(String arg0) {
        if (this.field2172) {
            return;
        }
        this.field2172 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ey.ph(B)Ljava/awt/Container;")
    public Container method2865() {
        return Statics.field1071 == null ? this : Statics.field1071;
    }

    @ObfuscatedName("ey.pg(I)Ljava/awt/Dimension;")
    public Dimension method2866() {
        Container var1 = this.method2865();
        int var2 = Math.max(var1.getWidth(), Statics.field1084);
        int var3 = Math.max(var1.getHeight(), Statics.field752);
        if (Statics.field1071 != null) {
            Insets var4 = Statics.field1071.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("ey.c(I)V")
    public abstract void method233();

    @ObfuscatedName("ey.d(I)V")
    public abstract void method234();

    @ObfuscatedName("ey.b(I)V")
    public abstract void method236();

    @ObfuscatedName("ey.o(I)V")
    public abstract void method230();

    @ObfuscatedName("ey.l(B)V")
    public abstract void method235();

    public abstract void init();
}
