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

@ObfuscatedName("eo")
public abstract class class136 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("eo.pi")
    public static class136 field2092 = null;

    @ObfuscatedName("eo.pg")
    public static int field2078 = 0;

    @ObfuscatedName("eo.px")
    public static long field2079 = 0L;

    @ObfuscatedName("eo.pu")
    public static boolean field2080 = false;

    @ObfuscatedName("eo.pb")
    public static int field2082 = 20;

    @ObfuscatedName("eo.pk")
    public static int field2085 = 1;

    @ObfuscatedName("eo.qw")
    public static int field2084 = 0;

    @ObfuscatedName("eo.qh")
    public static long[] field2083 = new long[32];

    @ObfuscatedName("eo.qa")
    public static long[] field2086 = new long[32];

    @ObfuscatedName("eo.ql")
    public static int field2088 = 0;

    @ObfuscatedName("eo.qr")
    public static int field2090 = 0;

    @ObfuscatedName("eo.qx")
    public static volatile boolean field2089 = true;

    @ObfuscatedName("eo.qu")
    public static int field2087 = 500;

    @ObfuscatedName("eo.qe")
    public static boolean field2077 = false;

    @ObfuscatedName("eo.qi")
    public static volatile boolean field2091 = false;

    @ObfuscatedName("eo.qg")
    public static volatile long field2093 = 0L;

    @ObfuscatedName("eo.rg")
    public static volatile boolean field2094 = true;

    @ObfuscatedName("eo.pz")
    public boolean field2081 = false;

    @ObfuscatedName("eo.qx(IIII)V")
    public final void method2663(int arg0, int arg1, int arg2) {
        try {
            if (field2092 != null) {
                field2078++;
                if (field2078 >= 3) {
                    this.method2671("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2092 = this;
            Statics.field1984 = arg0;
            Statics.field1384 = arg1;
            Statics.field3060 = arg2;
            Statics.field2114 = this;
            if (Statics.field813 == null) {
                Statics.field813 = new class128();
            }
            Statics.field813.method2523(this, 1);
        } catch (Exception var5) {
            class140.method1403((String) null, var5);
            this.method2671("crash");
        }
    }

    @ObfuscatedName("eo.qk(I)V")
    public final synchronized void method2674() {
        Container var1 = this.method2672();
        if (Statics.field1869 != null) {
            Statics.field1869.removeFocusListener(this);
            var1.remove(Statics.field1869);
        }
        Statics.field1984 = Math.max(var1.getWidth(), Statics.field560);
        Statics.field1384 = Math.max(var1.getHeight(), Statics.field1936);
        if (Statics.field1864 != null) {
            Insets var2 = Statics.field1864.getInsets();
            Statics.field1984 -= var2.right + var2.left;
            Statics.field1384 -= var2.top + var2.bottom;
        }
        Statics.field1869 = new class131(this);
        var1.add(Statics.field1869);
        Statics.field1869.setSize(Statics.field1984, Statics.field1384);
        Statics.field1869.setVisible(true);
        if (Statics.field1864 == var1) {
            Insets var3 = Statics.field1864.getInsets();
            Statics.field1869.setLocation(field2088 + var3.left, field2090 + var3.top);
        } else {
            Statics.field1869.setLocation(field2088, field2090);
        }
        Statics.field1869.addFocusListener(this);
        Statics.field1869.requestFocus();
        field2089 = true;
        class73 var4 = class73.method1903(Statics.field1984, Statics.field1384, Statics.field1869);
        if (Statics.field999 != null) {
            Statics.field999.method1367(var4.field1324.getGraphics(), 0, 0);
        }
        Statics.field999 = var4;
        field2091 = false;
        field2093 = class107.method2784();
    }

    @ObfuscatedName("eo.qu(I)Z")
    public final boolean method2665() {
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
                this.method2671("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1931 != null) {
                String var1 = Statics.field1931.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field3028;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2671("wrongjava");
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
                        if (class154.method3(var6) && class154.method3040(var6) < 10) {
                            this.method2671("wrongjava");
                            return;
                        }
                    }
                    field2085 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2674();
            this.method205();
            class125 var7;
            try {
                var7 = new class139();
            } catch (Throwable var14) {
                var7 = new class133();
            }
            Statics.field681 = var7;
            label91: while (true) {
                class128 var10;
                Canvas var11;
                do {
                    if (field2079 != 0L && class107.method2784() >= field2079) {
                        break label91;
                    }
                    Statics.field143 = Statics.field681.method2496(field2082, field2085);
                    for (int var9 = 0; var9 < Statics.field143; var9++) {
                        this.method2703();
                    }
                    this.method2666();
                    var10 = Statics.field813;
                    var11 = Statics.field1869;
                } while (var10.field1983 == null);
                for (int var12 = 0; var12 < 50 && var10.field1983.peekEvent() != null; var12++) {
                    Statics.method849(1L);
                }
                if (var11 != null) {
                    var10.field1983.postEvent(new ActionEvent(var11, 1001, "dummy"));
                }
            }
        } catch (Exception var15) {
            class140.method1403((String) null, var15);
            this.method2671("crash");
        }
        this.method2667();
    }

    @ObfuscatedName("eo.qe(I)V")
    public void method2703() {
        long var1 = class107.method2784();
        long var3 = field2086[Statics.field640];
        field2086[Statics.field640] = var1;
        Statics.field640 = Statics.field640 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2076 = field2094;
        }
        this.method172();
    }

    @ObfuscatedName("eo.qi(I)V")
    public void method2666() {
        Container var1 = this.method2672();
        long var2 = class107.method2784();
        long var4 = field2083[Statics.field1306];
        field2083[Statics.field1306] = var2;
        Statics.field1306 = Statics.field1306 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2084 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2087 - 1 > 50) {
            field2087 -= 50;
            field2089 = true;
            Statics.field1869.setSize(Statics.field1984, Statics.field1384);
            Statics.field1869.setVisible(true);
            if (Statics.field1864 == var1) {
                Insets var7 = Statics.field1864.getInsets();
                Statics.field1869.setLocation(field2088 + var7.left, field2090 + var7.top);
            } else {
                Statics.field1869.setLocation(field2088, field2090);
            }
        }
        this.method173();
    }

    @ObfuscatedName("eo.qg(I)V")
    public final synchronized void method2667() {
        if (field2080) {
            return;
        }
        field2080 = true;
        try {
            Statics.field1869.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method174();
        } catch (Exception var7) {
        }
        if (Statics.field1864 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field813 != null) {
            try {
                Statics.field813.method2531();
            } catch (Exception var5) {
            }
        }
        this.method431();
    }

    @ObfuscatedName("bs.qz(I)V")
    public static final void method1452() {
        Statics.field681.method2494();
        for (int var0 = 0; var0 < 32; var0++) {
            field2083[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2086[var1] = 0L;
        }
        Statics.field143 = 0;
    }

    public void start() {
        if (field2092 == this && !field2080) {
            field2079 = 0L;
        }
    }

    public void stop() {
        if (field2092 == this && !field2080) {
            field2079 = class107.method2784() + 4000L;
        }
    }

    public void destroy() {
        if (field2092 == this && !field2080) {
            field2079 = class107.method2784();
            Statics.method849(5000L);
            this.method2667();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2092 != this || field2080) {
            return;
        }
        field2089 = true;
        if (Statics.field3028 != null && Statics.field3028.startsWith("1.5") && class107.method2784() - field2093 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1984 && var2.height >= Statics.field1384) {
                field2091 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2094 = true;
        field2089 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2094 = false;
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

    @ObfuscatedName("j.rg(I)V")
    public static final void method553() {
        Statics.field1020 = null;
        Statics.field871 = null;
        Statics.field1325 = null;
    }

    @ObfuscatedName("eo.re(Ljava/lang/String;I)V")
    public void method2671(String arg0) {
        if (this.field2081) {
            return;
        }
        this.field2081 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("eo.rz(B)Ljava/awt/Container;")
    public Container method2672() {
        return Statics.field1864 == null ? this : Statics.field1864;
    }

    @ObfuscatedName("eo.rq(I)Ljava/awt/Dimension;")
    public Dimension method2673() {
        Container var1 = this.method2672();
        int var2 = Math.max(var1.getWidth(), Statics.field560);
        int var3 = Math.max(var1.getHeight(), Statics.field1936);
        if (Statics.field1864 != null) {
            Insets var4 = Statics.field1864.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    @ObfuscatedName("eo.h(I)V")
    public abstract void method431();

    public abstract void init();

    @ObfuscatedName("eo.l(B)V")
    public abstract void method205();

    @ObfuscatedName("eo.f(I)V")
    public abstract void method173();

    @ObfuscatedName("eo.s(I)V")
    public abstract void method174();

    @ObfuscatedName("eo.c(I)V")
    public abstract void method172();
}
