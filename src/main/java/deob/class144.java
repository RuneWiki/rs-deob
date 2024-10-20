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
public abstract class class144 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("er.pb")
    public static class144 field2216 = null;

    @ObfuscatedName("er.pa")
    public static int field2200 = 0;

    @ObfuscatedName("er.pf")
    public static long field2205 = 0L;

    @ObfuscatedName("er.pu")
    public static boolean field2202 = false;

    @ObfuscatedName("er.qb")
    public static int field2204 = 20;

    @ObfuscatedName("er.qo")
    public static int field2201 = 1;

    @ObfuscatedName("er.qv")
    public static int field2206 = 0;

    @ObfuscatedName("er.qu")
    public static long[] field2207 = new long[32];

    @ObfuscatedName("er.qm")
    public static long[] field2208 = new long[32];

    @ObfuscatedName("er.qr")
    public static int field2209 = 0;

    @ObfuscatedName("er.qq")
    public static int field2210 = 0;

    @ObfuscatedName("er.qw")
    public static volatile boolean field2211 = true;

    @ObfuscatedName("er.qa")
    public static int field2212 = 500;

    @ObfuscatedName("er.qp")
    public static boolean field2213 = false;

    @ObfuscatedName("er.qd")
    public static volatile boolean field2214 = false;

    @ObfuscatedName("er.ri")
    public static volatile long field2199 = 0L;

    @ObfuscatedName("er.rc")
    public static volatile boolean field2215 = true;

    @ObfuscatedName("er.pi")
    public boolean field2203 = false;

    @ObfuscatedName("er.qk(IIII)V")
    public final void method2805(int arg0, int arg1, int arg2) {
        try {
            if (field2216 != null) {
                field2200++;
                if (field2200 >= 3) {
                    this.method2813("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2216 = this;
            Statics.field2191 = arg0;
            Statics.field1567 = arg1;
            Statics.field2233 = arg2;
            Statics.field3159 = this;
            if (Statics.field649 == null) {
                Statics.field649 = new class136();
            }
            Statics.field649.method2689(this, 1);
        } catch (Exception var5) {
            class148.method181((String) null, var5);
            this.method2813("crash");
        }
    }

    @ObfuscatedName("er.qc(B)V")
    public final synchronized void method2806() {
        Container var1 = this.method2814();
        if (Statics.field2040 != null) {
            Statics.field2040.removeFocusListener(this);
            var1.remove(Statics.field2040);
        }
        Statics.field2191 = Math.max(var1.getWidth(), Statics.field1535);
        Statics.field1567 = Math.max(var1.getHeight(), Statics.field1045);
        if (Statics.field575 != null) {
            Insets var2 = Statics.field575.getInsets();
            Statics.field2191 -= var2.right + var2.left;
            Statics.field1567 -= var2.top + var2.bottom;
        }
        Statics.field2040 = new class139(this);
        var1.add(Statics.field2040);
        Statics.field2040.setSize(Statics.field2191, Statics.field1567);
        Statics.field2040.setVisible(true);
        if (Statics.field575 == var1) {
            Insets var3 = Statics.field575.getInsets();
            Statics.field2040.setLocation(field2209 + var3.left, field2210 + var3.top);
        } else {
            Statics.field2040.setLocation(field2209, field2210);
        }
        Statics.field2040.addFocusListener(this);
        Statics.field2040.requestFocus();
        field2211 = true;
        class78 var4 = class78.method1939(Statics.field2191, Statics.field1567, Statics.field2040);
        if (Statics.field1386 != null) {
            Statics.field1386.method1518(var4.field1400.getGraphics(), 0, 0);
        }
        Statics.field1386 = var4;
        field2214 = false;
        field2199 = class115.method2249();
    }

    @ObfuscatedName("er.qx(I)Z")
    public final boolean method2807() {
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
                this.method2813("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2092 != null) {
                String var1 = Statics.field2092.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2091;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2813("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class163.method965(var2.charAt(var3)); var3++) {
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
                            label186: {
                                char var10 = var4.charAt(var9);
                                if (var9 == 0) {
                                    if (var10 == '-') {
                                        var5 = true;
                                        break label186;
                                    }
                                    if (var10 == '+') {
                                        break label186;
                                    }
                                }
                                int var20;
                                if (var10 >= '0' && var10 <= '9') {
                                    var20 = var10 - '0';
                                } else if (var10 >= 'A' && var10 <= 'Z') {
                                    var20 = var10 - '7';
                                } else {
                                    if (var10 < 'a' || var10 > 'z') {
                                        var11 = false;
                                        break;
                                    }
                                    var20 = var10 - 'W';
                                }
                                if (var20 >= 10) {
                                    var11 = false;
                                    break;
                                }
                                if (var5) {
                                    var20 = -var20;
                                }
                                int var12 = var7 * 10 + var20;
                                if (var12 / 10 != var7) {
                                    var11 = false;
                                    break;
                                }
                                var7 = var12;
                                var6 = true;
                            }
                            var9++;
                        }
                        if (var11 && class163.method2207(var4) < 10) {
                            this.method2813("wrongjava");
                            return;
                        }
                    }
                    field2201 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2806();
            this.method234();
            Statics.field704 = class133.method2563();
            label104: while (true) {
                class136 var15;
                Canvas var16;
                do {
                    if (field2205 != 0L && class115.method2249() >= field2205) {
                        break label104;
                    }
                    Statics.field2110 = Statics.field704.method2644(field2204, field2201);
                    for (int var14 = 0; var14 < Statics.field2110; var14++) {
                        this.method2826();
                    }
                    this.method2823();
                    var15 = Statics.field649;
                    var16 = Statics.field2040;
                } while (var15.field2098 == null);
                for (int var17 = 0; var17 < 50 && var15.field2098.peekEvent() != null; var17++) {
                    class127.method2202(1L);
                }
                if (var16 != null) {
                    var15.field2098.postEvent(new ActionEvent(var16, 1001, "dummy"));
                }
            }
        } catch (Exception var19) {
            class148.method181((String) null, var19);
            this.method2813("crash");
        }
        this.method2822();
    }

    @ObfuscatedName("er.qt(I)V")
    public void method2826() {
        long var1 = class115.method2249();
        long var3 = field2208[Statics.field1628];
        field2208[Statics.field1628] = var1;
        Statics.field1628 = Statics.field1628 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1107 = field2215;
        }
        this.method235();
    }

    @ObfuscatedName("er.qy(I)V")
    public void method2823() {
        Container var1 = this.method2814();
        long var2 = class115.method2249();
        long var4 = field2207[Statics.field3162];
        field2207[Statics.field3162] = var2;
        Statics.field3162 = Statics.field3162 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2206 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2212 - 1 > 50) {
            field2212 -= 50;
            field2211 = true;
            Statics.field2040.setSize(Statics.field2191, Statics.field1567);
            Statics.field2040.setVisible(true);
            if (Statics.field575 == var1) {
                Insets var7 = Statics.field575.getInsets();
                Statics.field2040.setLocation(field2209 + var7.left, field2210 + var7.top);
            } else {
                Statics.field2040.setLocation(field2209, field2210);
            }
        }
        this.method236();
    }

    @ObfuscatedName("er.qw(I)V")
    public final synchronized void method2822() {
        if (field2202) {
            return;
        }
        field2202 = true;
        try {
            Statics.field2040.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method292();
        } catch (Exception var7) {
        }
        if (Statics.field575 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field649 != null) {
            try {
                Statics.field649.method2665();
            } catch (Exception var5) {
            }
        }
        this.method232();
    }

    @ObfuscatedName("m.qz(B)V")
    public static final void method81() {
        Statics.field704.method2636();
        for (int var0 = 0; var0 < 32; var0++) {
            field2207[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2208[var1] = 0L;
        }
        Statics.field2110 = 0;
    }

    public void start() {
        if (field2216 == this && !field2202) {
            field2205 = 0L;
        }
    }

    public void stop() {
        if (field2216 == this && !field2202) {
            field2205 = class115.method2249() + 4000L;
        }
    }

    public void destroy() {
        if (field2216 == this && !field2202) {
            field2205 = class115.method2249();
            class127.method2202(5000L);
            this.method2822();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2216 != this || field2202) {
            return;
        }
        field2211 = true;
        if (Statics.field2091 != null && Statics.field2091.startsWith("1.5") && class115.method2249() - field2199 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field2191 && var2.height >= Statics.field1567) {
                field2214 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2215 = true;
        field2211 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2215 = false;
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

    @ObfuscatedName("ci.qa(I)V")
    public static final void method2035() {
        Statics.field873 = null;
        Statics.field709 = null;
        Statics.field2071 = null;
    }

    @ObfuscatedName("er.qp(Ljava/lang/String;B)V")
    public void method2813(String arg0) {
        if (this.field2203) {
            return;
        }
        this.field2203 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("er.qd(I)Ljava/awt/Container;")
    public Container method2814() {
        return Statics.field575 == null ? this : Statics.field575;
    }

    @ObfuscatedName("er.ri(I)Ljava/awt/Dimension;")
    public Dimension method2812() {
        Container var1 = this.method2814();
        int var2 = Math.max(var1.getWidth(), Statics.field1535);
        int var3 = Math.max(var1.getHeight(), Statics.field1045);
        if (Statics.field575 != null) {
            Insets var4 = Statics.field575.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("er.i(I)V")
    public abstract void method232();

    @ObfuscatedName("er.o(I)V")
    public abstract void method234();

    @ObfuscatedName("er.h(I)V")
    public abstract void method235();

    @ObfuscatedName("er.k(I)V")
    public abstract void method292();

    @ObfuscatedName("er.n(I)V")
    public abstract void method236();

    public abstract void init();
}
