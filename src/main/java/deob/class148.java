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

@ObfuscatedName("er")
public abstract class class148 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("er.ps")
    public static class148 field2242 = null;

    @ObfuscatedName("er.pa")
    public static int field2240 = 0;

    @ObfuscatedName("er.pq")
    public static long field2246 = 0L;

    @ObfuscatedName("er.pe")
    public static boolean field2248 = false;

    @ObfuscatedName("er.pz")
    public static int field2245 = 20;

    @ObfuscatedName("er.qa")
    public static int field2253 = 1;

    @ObfuscatedName("er.qe")
    public static int field2247 = 0;

    @ObfuscatedName("er.qk")
    public static long[] field2256 = new long[32];

    @ObfuscatedName("er.qp")
    public static long[] field2249 = new long[32];

    @ObfuscatedName("er.qj")
    public static int field2250 = 0;

    @ObfuscatedName("er.qx")
    public static int field2251 = 0;

    @ObfuscatedName("er.qc")
    public static volatile boolean field2252 = true;

    @ObfuscatedName("er.qo")
    public static int field2243 = 500;

    @ObfuscatedName("er.qu")
    public static boolean field2254 = false;

    @ObfuscatedName("er.qr")
    public static volatile boolean field2255 = false;

    @ObfuscatedName("er.qq")
    public static volatile long field2257 = 0L;

    @ObfuscatedName("er.rq")
    public static volatile boolean field2241 = true;

    @ObfuscatedName("er.pn")
    public boolean field2244 = false;

    @ObfuscatedName("er.qc(IIII)V")
    public final void method3012(int arg0, int arg1, int arg2) {
        try {
            if (field2242 != null) {
                field2240++;
                if (field2240 >= 3) {
                    this.method2959("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2242 = this;
            Statics.field2192 = arg0;
            Statics.field2110 = arg1;
            Statics.field2272 = arg2;
            Statics.field2271 = this;
            if (Statics.field1870 == null) {
                Statics.field1870 = new class140();
            }
            Statics.field1870.method2852(this, 1);
        } catch (Exception var5) {
            class152.method976((String) null, var5);
            this.method2959("crash");
        }
    }

    @ObfuscatedName("er.qh(B)V")
    public final synchronized void method2950() {
        Container var1 = this.method2960();
        if (Statics.field2347 != null) {
            Statics.field2347.removeFocusListener(this);
            var1.remove(Statics.field2347);
        }
        Statics.field2192 = Math.max(var1.getWidth(), Statics.field2020);
        Statics.field2110 = Math.max(var1.getHeight(), Statics.field1077);
        if (Statics.field1846 != null) {
            Insets var2 = Statics.field1846.getInsets();
            Statics.field2192 -= var2.right + var2.left;
            Statics.field2110 -= var2.top + var2.bottom;
        }
        Statics.field2347 = new class143(this);
        var1.add(Statics.field2347);
        Statics.field2347.setSize(Statics.field2192, Statics.field2110);
        Statics.field2347.setVisible(true);
        if (Statics.field1846 == var1) {
            Insets var3 = Statics.field1846.getInsets();
            Statics.field2347.setLocation(field2250 + var3.left, field2251 + var3.top);
        } else {
            Statics.field2347.setLocation(field2250, field2251);
        }
        Statics.field2347.addFocusListener(this);
        Statics.field2347.requestFocus();
        field2252 = true;
        int var4 = Statics.field2192;
        int var5 = Statics.field2110;
        Canvas var6 = Statics.field2347;
        class81 var8;
        try {
            class85 var7 = new class85();
            var7.method1609(var4, var5, var6);
            var8 = var7;
        } catch (Throwable var12) {
            class79 var10 = new class79();
            var10.method1609(var4, var5, var6);
            var8 = var10;
        }
        if (Statics.field1040 != null) {
            Statics.field1040.method1610(var8.field1463.getGraphics(), 0, 0);
        }
        Statics.field1040 = var8;
        field2255 = false;
        field2257 = class119.method415();
    }

    @ObfuscatedName("er.qo(S)Z")
    public final boolean method2970() {
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
                this.method2959("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2144 != null) {
                String var1 = Statics.field2144.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field3191;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2959("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class167.method2871(var2.charAt(var3)); var3++) {
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
                            label193: {
                                char var10 = var4.charAt(var9);
                                if (var9 == 0) {
                                    if (var10 == '-') {
                                        var5 = true;
                                        break label193;
                                    }
                                    if (var10 == '+') {
                                        break label193;
                                    }
                                }
                                int var23;
                                if (var10 >= '0' && var10 <= '9') {
                                    var23 = var10 - '0';
                                } else if (var10 >= 'A' && var10 <= 'Z') {
                                    var23 = var10 - '7';
                                } else {
                                    if (var10 < 'a' || var10 > 'z') {
                                        var11 = false;
                                        break;
                                    }
                                    var23 = var10 - 'W';
                                }
                                if (var23 >= 10) {
                                    var11 = false;
                                    break;
                                }
                                if (var5) {
                                    var23 = -var23;
                                }
                                int var12 = var7 * 10 + var23;
                                if (var12 / 10 != var7) {
                                    var11 = false;
                                    break;
                                }
                                var7 = var12;
                                var6 = true;
                            }
                            var9++;
                        }
                        if (var11 && class167.method1014(var4) < 10) {
                            this.method2959("wrongjava");
                            return;
                        }
                    }
                    field2253 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2950();
            this.method206();
            class137 var14;
            try {
                var14 = new class151();
            } catch (Throwable var21) {
                var14 = new class145();
            }
            Statics.field2348 = var14;
            label112: while (true) {
                class140 var17;
                Canvas var18;
                do {
                    if (field2246 != 0L && class119.method415() >= field2246) {
                        break label112;
                    }
                    Statics.field1975 = Statics.field2348.method2821(field2245, field2253);
                    for (int var16 = 0; var16 < Statics.field1975; var16++) {
                        this.method2952();
                    }
                    this.method2989();
                    var17 = Statics.field1870;
                    var18 = Statics.field2347;
                } while (var17.field2145 == null);
                for (int var19 = 0; var19 < 50 && var17.field2145.peekEvent() != null; var19++) {
                    class131.method2735(1L);
                }
                if (var18 != null) {
                    var17.field2145.postEvent(new ActionEvent(var18, 1001, "dummy"));
                }
            }
        } catch (Exception var22) {
            class152.method976((String) null, var22);
            this.method2959("crash");
        }
        this.method2954();
    }

    @ObfuscatedName("er.qu(I)V")
    public void method2952() {
        long var1 = class119.method415();
        long var3 = field2249[Statics.field623];
        field2249[Statics.field623] = var1;
        Statics.field623 = Statics.field623 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1264 = field2241;
        }
        this.method209();
    }

    @ObfuscatedName("er.qr(I)V")
    public void method2989() {
        Container var1 = this.method2960();
        long var2 = class119.method415();
        long var4 = field2256[Statics.field126];
        field2256[Statics.field126] = var2;
        Statics.field126 = Statics.field126 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2247 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2243 - 1 > 50) {
            field2243 -= 50;
            field2252 = true;
            Statics.field2347.setSize(Statics.field2192, Statics.field2110);
            Statics.field2347.setVisible(true);
            if (Statics.field1846 == var1) {
                Insets var7 = Statics.field1846.getInsets();
                Statics.field2347.setLocation(field2250 + var7.left, field2251 + var7.top);
            } else {
                Statics.field2347.setLocation(field2250, field2251);
            }
        }
        this.method434();
    }

    @ObfuscatedName("er.qq(I)V")
    public final synchronized void method2954() {
        if (field2248) {
            return;
        }
        field2248 = true;
        try {
            Statics.field2347.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method211();
        } catch (Exception var7) {
        }
        if (Statics.field1846 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1870 != null) {
            try {
                Statics.field1870.method2863();
            } catch (Exception var5) {
            }
        }
        this.method215();
    }

    public void start() {
        if (field2242 == this && !field2248) {
            field2246 = 0L;
        }
    }

    public void stop() {
        if (field2242 == this && !field2248) {
            field2246 = class119.method415() + 4000L;
        }
    }

    public void destroy() {
        if (field2242 == this && !field2248) {
            field2246 = class119.method415();
            class131.method2735(5000L);
            this.method2954();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2242 != this || field2248) {
            return;
        }
        field2252 = true;
        if (Statics.field3191 != null && Statics.field3191.startsWith("1.5") && class119.method415() - field2257 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field2192 && var2.height >= Statics.field2110) {
                field2255 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2241 = true;
        field2252 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2241 = false;
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

    @ObfuscatedName("dh.rd(B)V")
    public static final void method2705() {
        Statics.field1172 = null;
        Statics.field2237 = null;
        Statics.field663 = null;
    }

    @ObfuscatedName("er.rq(Ljava/lang/String;I)V")
    public void method2959(String arg0) {
        if (this.field2244) {
            return;
        }
        this.field2244 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("er.rf(I)Ljava/awt/Container;")
    public Container method2960() {
        return Statics.field1846 == null ? this : Statics.field1846;
    }

    @ObfuscatedName("er.rg(I)Ljava/awt/Dimension;")
    public Dimension method2948() {
        Container var1 = this.method2960();
        int var2 = Math.max(var1.getWidth(), Statics.field2020);
        int var3 = Math.max(var1.getHeight(), Statics.field1077);
        if (Statics.field1846 != null) {
            Insets var4 = Statics.field1846.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    public abstract void init();

    @ObfuscatedName("er.u(B)V")
    public abstract void method209();

    @ObfuscatedName("er.o(B)V")
    public abstract void method434();

    @ObfuscatedName("er.p(B)V")
    public abstract void method211();

    @ObfuscatedName("er.r(I)V")
    public abstract void method215();

    @ObfuscatedName("er.b(B)V")
    public abstract void method206();
}
