package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

@ObfuscatedName("ep")
public abstract class class133 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ep.oc")
    public static class133 field2074 = null;

    @ObfuscatedName("ep.ow")
    public static int field2075 = 0;

    @ObfuscatedName("ep.pm")
    public static long field2071 = 0L;

    @ObfuscatedName("ep.pd")
    public static boolean field2072 = false;

    @ObfuscatedName("ep.pj")
    public static int field2070 = 20;

    @ObfuscatedName("ep.pg")
    public static int field2083 = 1;

    @ObfuscatedName("ep.pv")
    public static int field2076 = 0;

    @ObfuscatedName("ep.pf")
    public static long[] field2077 = new long[32];

    @ObfuscatedName("ep.pz")
    public static long[] field2078 = new long[32];

    @ObfuscatedName("ep.ph")
    public static volatile boolean field2080 = true;

    @ObfuscatedName("ep.pb")
    public static int field2081 = 500;

    @ObfuscatedName("ep.pc")
    public static volatile boolean field2082 = false;

    @ObfuscatedName("ep.pk")
    public static volatile long field2069 = 0L;

    @ObfuscatedName("ep.po")
    public static volatile boolean field2084 = true;

    @ObfuscatedName("ep.px")
    public boolean field2073 = false;

    @ObfuscatedName("ep.pd(IIII)V")
    public final void method2640(int arg0, int arg1, int arg2) {
        try {
            if (field2074 != null) {
                field2075++;
                if (field2075 >= 3) {
                    this.method2699("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2074 = this;
            Statics.field1775 = arg0;
            Statics.field2079 = arg1;
            Statics.field2099 = arg2;
            Statics.field2105 = this;
            if (Statics.field29 == null) {
                Statics.field29 = new class125();
            }
            Statics.field29.method2526(this, 1);
        } catch (Exception var5) {
            class137.method94((String) null, var5);
            this.method2699("crash");
        }
    }

    @ObfuscatedName("ep.px(B)V")
    public final synchronized void method2649() {
        Container var1;
        if (Statics.field2028 == null) {
            var1 = this;
        } else {
            var1 = Statics.field2028;
        }
        if (Statics.field543 != null) {
            Statics.field543.removeFocusListener(this);
            var1.remove(Statics.field543);
        }
        Statics.field543 = new class128(this);
        var1.add(Statics.field543);
        Statics.field543.setSize(Statics.field1775, Statics.field2079);
        Statics.field543.setVisible(true);
        if (Statics.field2028 == null) {
            Statics.field543.setLocation(0, 0);
        } else {
            Insets var2 = Statics.field2028.getInsets();
            Statics.field543.setLocation(var2.left, var2.top);
        }
        Statics.field543.addFocusListener(this);
        Statics.field543.requestFocus();
        field2080 = true;
        field2082 = false;
        field2069 = class104.method1417();
    }

    @ObfuscatedName("ep.ps(B)Z")
    public final boolean method2639() {
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
                this.method2699("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1959 != null) {
                String var1 = Statics.field1959.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1960;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2699("wrongjava");
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
                        boolean var7 = false;
                        boolean var8 = false;
                        int var9 = 0;
                        int var10 = var6.length();
                        int var11 = 0;
                        boolean var13;
                        while (true) {
                            if (var11 >= var10) {
                                var13 = var8;
                                break;
                            }
                            label192: {
                                char var12 = var6.charAt(var11);
                                if (var11 == 0) {
                                    if (var12 == '-') {
                                        var7 = true;
                                        break label192;
                                    }
                                    if (var12 == '+') {
                                        break label192;
                                    }
                                }
                                int var31;
                                if (var12 >= '0' && var12 <= '9') {
                                    var31 = var12 - '0';
                                } else if (var12 >= 'A' && var12 <= 'Z') {
                                    var31 = var12 - '7';
                                } else {
                                    if (var12 < 'a' || var12 > 'z') {
                                        var13 = false;
                                        break;
                                    }
                                    var31 = var12 - 'W';
                                }
                                if (var31 >= 10) {
                                    var13 = false;
                                    break;
                                }
                                if (var7) {
                                    var31 = -var31;
                                }
                                int var14 = var9 * 10 + var31;
                                if (var14 / 10 != var9) {
                                    var13 = false;
                                    break;
                                }
                                var9 = var14;
                                var8 = true;
                            }
                            var11++;
                        }
                        if (var13) {
                            int var16 = class211.method98(var6, 10, true);
                            if (var16 < 10) {
                                this.method2699("wrongjava");
                                return;
                            }
                        }
                    }
                    field2083 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2649();
            int var17 = Statics.field1775;
            int var18 = Statics.field2079;
            Canvas var19 = Statics.field543;
            class72 var21;
            try {
                class76 var20 = new class76();
                var20.method1390(var17, var18, var19);
                var21 = var20;
            } catch (Throwable var29) {
                class70 var23 = new class70();
                var23.method1390(var17, var18, var19);
                var21 = var23;
            }
            Statics.field1824 = var21;
            this.method189();
            class122 var24;
            try {
                var24 = new class136();
            } catch (Throwable var28) {
                var24 = new class130();
            }
            Statics.field243 = var24;
            while (field2071 == 0L || class104.method1417() < field2071) {
                Statics.field1076 = Statics.field243.method2493(field2070, field2083);
                for (int var26 = 0; var26 < Statics.field1076; var26++) {
                    this.method2641();
                }
                this.method2642();
                class131.method3376(Statics.field29, Statics.field543);
            }
        } catch (Exception var30) {
            class137.method94((String) null, var30);
            this.method2699("crash");
        }
        this.method2645();
    }

    @ObfuscatedName("ep.pj(B)V")
    public void method2641() {
        long var1 = class104.method1417();
        long var3 = field2078[Statics.field1947];
        field2078[Statics.field1947] = var1;
        Statics.field1947 = Statics.field1947 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field652 = field2084;
        }
        this.method190();
    }

    @ObfuscatedName("ep.pg(I)V")
    public void method2642() {
        long var1 = class104.method1417();
        long var3 = field2077[Statics.field204];
        field2077[Statics.field204] = var1;
        Statics.field204 = Statics.field204 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
            int var5 = (int) (var1 - var3);
            field2076 = ((var5 >> 1) + 32000) / var5;
        }
        if (++field2081 - 1 > 50) {
            field2081 -= 50;
            field2080 = true;
            Statics.field543.setSize(Statics.field1775, Statics.field2079);
            Statics.field543.setVisible(true);
            if (Statics.field2028 == null) {
                Statics.field543.setLocation(0, 0);
            } else {
                Insets var6 = Statics.field2028.getInsets();
                Statics.field543.setLocation(var6.left, var6.top);
            }
        }
        this.method191();
    }

    @ObfuscatedName("ep.pv(B)V")
    public final synchronized void method2645() {
        if (field2072) {
            return;
        }
        field2072 = true;
        try {
            Statics.field543.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method192();
        } catch (Exception var7) {
        }
        if (Statics.field2028 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field29 != null) {
            try {
                Statics.field29.method2522();
            } catch (Exception var5) {
            }
        }
        this.method442();
    }

    @ObfuscatedName("am.pr(I)V")
    public static final void method872() {
        Statics.field243.method2505();
        for (int var0 = 0; var0 < 32; var0++) {
            field2077[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2078[var1] = 0L;
        }
        Statics.field1076 = 0;
    }

    public void start() {
        if (field2074 == this && !field2072) {
            field2071 = 0L;
        }
    }

    public void stop() {
        if (field2074 == this && !field2072) {
            field2071 = class104.method1417() + 4000L;
        }
    }

    public void destroy() {
        if (field2074 == this && !field2072) {
            field2071 = class104.method1417();
            class116.method557(5000L);
            this.method2645();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2074 != this || field2072) {
            return;
        }
        field2080 = true;
        if (Statics.field1960 != null && Statics.field1960.startsWith("1.5") && class104.method1417() - field2069 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1775 && var2.height >= Statics.field2079) {
                field2082 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2084 = true;
        field2080 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2084 = false;
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

    @ObfuscatedName("bl.py(I)V")
    public static final void method1384() {
        Statics.field693 = null;
        Statics.field564 = null;
        Statics.field800 = null;
    }

    @ObfuscatedName("ep.pf(Ljava/lang/String;I)V")
    public void method2699(String arg0) {
        if (this.field2073) {
            return;
        }
        this.field2073 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ep.n(B)V")
    public abstract void method189();

    @ObfuscatedName("ep.x(I)V")
    public abstract void method190();

    @ObfuscatedName("ep.g(B)V")
    public abstract void method191();

    @ObfuscatedName("ep.o(B)V")
    public abstract void method192();

    @ObfuscatedName("ep.e(B)V")
    public abstract void method442();

    public abstract void init();
}
