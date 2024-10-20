package deob;

import java.applet.Applet;
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

@ObfuscatedName("ef")
public abstract class class136 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ef.pm")
    public static class136 field2119 = null;

    @ObfuscatedName("ef.py")
    public static int field2124 = 0;

    @ObfuscatedName("ef.pi")
    public static long field2121 = 0L;

    @ObfuscatedName("ef.pb")
    public static boolean field2131 = false;

    @ObfuscatedName("ef.ph")
    public static int field2118 = 20;

    @ObfuscatedName("ef.qs")
    public static int field2114 = 1;

    @ObfuscatedName("ef.qo")
    public static int field2120 = 0;

    @ObfuscatedName("ef.qy")
    public static long[] field2122 = new long[32];

    @ObfuscatedName("ef.ql")
    public static long[] field2116 = new long[32];

    @ObfuscatedName("ef.qe")
    public static int field2123 = 0;

    @ObfuscatedName("ef.qb")
    public static int field2113 = 0;

    @ObfuscatedName("ef.qa")
    public static volatile boolean field2126 = true;

    @ObfuscatedName("ef.qk")
    public static int field2127 = 500;

    @ObfuscatedName("ef.qd")
    public static boolean field2128 = false;

    @ObfuscatedName("ef.qc")
    public static volatile boolean field2129 = false;

    @ObfuscatedName("ef.qp")
    public static volatile long field2130 = 0L;

    @ObfuscatedName("ef.rn")
    public static volatile boolean field2115 = true;

    @ObfuscatedName("ef.pa")
    public boolean field2117 = false;

    @ObfuscatedName("ef.qu(IIII)V")
    public final void method2683(int arg0, int arg1, int arg2) {
        try {
            if (field2119 != null) {
                field2124++;
                if (field2124 >= 3) {
                    this.method2678("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field2119 = this;
            Statics.field178 = arg0;
            Statics.field2125 = arg1;
            Statics.field2145 = arg2;
            Statics.field2147 = this;
            if (Statics.field1483 == null) {
                Statics.field1483 = new class128();
            }
            Statics.field1483.method2541(this, 1);
        } catch (Exception var5) {
            class140.method793((String) null, var5);
            this.method2678("crash");
        }
    }

    @ObfuscatedName("ef.qi(I)V")
    public final synchronized void method2666() {
        Container var1 = this.method2728();
        if (Statics.field1094 != null) {
            Statics.field1094.removeFocusListener(this);
            var1.remove(Statics.field1094);
        }
        Statics.field178 = Math.max(var1.getWidth(), Statics.field1148);
        Statics.field2125 = Math.max(var1.getHeight(), Statics.field2562);
        if (Statics.field2058 != null) {
            Insets var2 = Statics.field2058.getInsets();
            Statics.field178 -= var2.right + var2.left;
            Statics.field2125 -= var2.top + var2.bottom;
        }
        Statics.field1094 = new class131(this);
        var1.add(Statics.field1094);
        Statics.field1094.setSize(Statics.field178, Statics.field2125);
        Statics.field1094.setVisible(true);
        if (Statics.field2058 == var1) {
            Insets var3 = Statics.field2058.getInsets();
            Statics.field1094.setLocation(field2123 + var3.left, field2113 + var3.top);
        } else {
            Statics.field1094.setLocation(field2123, field2113);
        }
        Statics.field1094.addFocusListener(this);
        Statics.field1094.requestFocus();
        field2126 = true;
        class73 var4 = class73.method1363(Statics.field178, Statics.field2125, Statics.field1094);
        if (Statics.field1376 != null) {
            Statics.field1376.method1393(var4.field1322.getGraphics(), 0, 0);
        }
        Statics.field1376 = var4;
        field2129 = false;
        field2130 = class107.method78();
    }

    @ObfuscatedName("ef.qx(I)Z")
    public final boolean method2667() {
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
                this.method2678("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2018 != null) {
                String var1 = Statics.field2018.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2013;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method2678("wrongjava");
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
                            label184: {
                                char var12 = var6.charAt(var11);
                                if (var11 == 0) {
                                    if (var12 == '-') {
                                        var7 = true;
                                        break label184;
                                    }
                                    if (var12 == '+') {
                                        break label184;
                                    }
                                }
                                int var22;
                                if (var12 >= '0' && var12 <= '9') {
                                    var22 = var12 - '0';
                                } else if (var12 >= 'A' && var12 <= 'Z') {
                                    var22 = var12 - '7';
                                } else {
                                    if (var12 < 'a' || var12 > 'z') {
                                        var13 = false;
                                        break;
                                    }
                                    var22 = var12 - 'W';
                                }
                                if (var22 >= 10) {
                                    var13 = false;
                                    break;
                                }
                                if (var7) {
                                    var22 = -var22;
                                }
                                int var14 = var9 * 10 + var22;
                                if (var14 / 10 != var9) {
                                    var13 = false;
                                    break;
                                }
                                var9 = var14;
                                var8 = true;
                            }
                            var11++;
                        }
                        if (var13 && class154.method2589(var6) < 10) {
                            this.method2678("wrongjava");
                            return;
                        }
                    }
                    field2114 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method2666();
            this.method172();
            class125 var16;
            try {
                var16 = new class139();
            } catch (Throwable var20) {
                var16 = new class133();
            }
            Statics.field954 = var16;
            while (field2121 == 0L || class107.method78() < field2121) {
                Statics.field68 = Statics.field954.method2513(field2118, field2114);
                for (int var18 = 0; var18 < Statics.field68; var18++) {
                    this.method2712();
                }
                this.method2681();
                class134.method1387(Statics.field1483, Statics.field1094);
            }
        } catch (Exception var21) {
            class140.method793((String) null, var21);
            this.method2678("crash");
        }
        this.method2732();
    }

    @ObfuscatedName("ef.qg(I)V")
    public void method2712() {
        long var1 = class107.method78();
        long var3 = field2116[Statics.field1845];
        field2116[Statics.field1845] = var1;
        Statics.field1845 = Statics.field1845 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2081 = field2115;
        }
        this.method232();
    }

    @ObfuscatedName("ef.qr(S)V")
    public void method2681() {
        Container var1 = this.method2728();
        long var2 = class107.method78();
        long var4 = field2122[Statics.field1732];
        field2122[Statics.field1732] = var2;
        Statics.field1732 = Statics.field1732 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field2120 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field2127 - 1 > 50) {
            field2127 -= 50;
            field2126 = true;
            Statics.field1094.setSize(Statics.field178, Statics.field2125);
            Statics.field1094.setVisible(true);
            if (Statics.field2058 == var1) {
                Insets var7 = Statics.field2058.getInsets();
                Statics.field1094.setLocation(field2123 + var7.left, field2113 + var7.top);
            } else {
                Statics.field1094.setLocation(field2123, field2113);
            }
        }
        this.method260();
    }

    @ObfuscatedName("ef.qz(I)V")
    public final synchronized void method2732() {
        if (field2131) {
            return;
        }
        field2131 = true;
        try {
            Statics.field1094.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method175();
        } catch (Exception var7) {
        }
        if (Statics.field2058 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field1483 != null) {
            try {
                Statics.field1483.method2538();
            } catch (Exception var5) {
            }
        }
        this.method350();
    }

    @ObfuscatedName("i.qa(I)V")
    public static final void method124() {
        Statics.field954.method2512();
        for (int var0 = 0; var0 < 32; var0++) {
            field2122[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field2116[var1] = 0L;
        }
        Statics.field68 = 0;
    }

    public void start() {
        if (field2119 == this && !field2131) {
            field2121 = 0L;
        }
    }

    public void stop() {
        if (field2119 == this && !field2131) {
            field2121 = class107.method78() + 4000L;
        }
    }

    public void destroy() {
        if (field2119 == this && !field2131) {
            field2121 = class107.method78();
            class119.method488(5000L);
            this.method2732();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field2119 != this || field2131) {
            return;
        }
        field2126 = true;
        if (Statics.field2013 != null && Statics.field2013.startsWith("1.5") && class107.method78() - field2130 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field178 && var2.height >= Statics.field2125) {
                field2129 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field2115 = true;
        field2126 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field2115 = false;
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

    @ObfuscatedName("ef.qw(Ljava/lang/String;I)V")
    public void method2678(String arg0) {
        if (this.field2117) {
            return;
        }
        this.field2117 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ef.qk(I)Ljava/awt/Container;")
    public Container method2728() {
        return Statics.field2058 == null ? this : Statics.field2058;
    }

    @ObfuscatedName("ef.qd(I)Ljava/awt/Dimension;")
    public Dimension method2729() {
        Container var1 = this.method2728();
        int var2 = Math.max(var1.getWidth(), Statics.field1148);
        int var3 = Math.max(var1.getHeight(), Statics.field2562);
        if (Statics.field2058 != null) {
            Insets var4 = Statics.field2058.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new Dimension(var2, var3);
    }

    public abstract void init();

    @ObfuscatedName("ef.e(I)V")
    public abstract void method172();

    @ObfuscatedName("ef.z(I)V")
    public abstract void method260();

    @ObfuscatedName("ef.v(I)V")
    public abstract void method175();

    @ObfuscatedName("ef.g(B)V")
    public abstract void method350();

    @ObfuscatedName("ef.q(I)V")
    public abstract void method232();
}
