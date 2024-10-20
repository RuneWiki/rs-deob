package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("k")
public final class class24 implements KeyListener, FocusListener {

    @ObfuscatedName("k.c")
    public static class24 field144 = new class24();

    @ObfuscatedName("k.cs")
    public static boolean[] field131 = new boolean[112];

    @ObfuscatedName("k.cl")
    public static boolean[] field132 = new boolean[112];

    @ObfuscatedName("k.ck")
    public static boolean[] field139 = new boolean[112];

    @ObfuscatedName("k.cr")
    public static int[] field134 = new int[128];

    @ObfuscatedName("k.co")
    public static int field146 = 0;

    @ObfuscatedName("k.cj")
    public static int field149 = 0;

    @ObfuscatedName("k.ci")
    public static char[] field137 = new char[128];

    @ObfuscatedName("k.ct")
    public static int[] field133 = new int[128];

    @ObfuscatedName("k.ca")
    public static int[] field136 = new int[128];

    @ObfuscatedName("k.cx")
    public static int field140 = 0;

    @ObfuscatedName("k.cz")
    public static int[] field126 = new int[128];

    @ObfuscatedName("k.cm")
    public static int field142 = 0;

    @ObfuscatedName("k.cp")
    public static int field141 = 0;

    @ObfuscatedName("k.ce")
    public static int field147 = 0;

    @ObfuscatedName("k.cv")
    public static int field145 = 0;

    @ObfuscatedName("k.ds")
    public static volatile int field138 = 0;

    @ObfuscatedName("k.de")
    public static int[] field143 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("df.c(I)V")
    public static void method2371() {
        if (Statics.field1687.toLowerCase().indexOf("microsoft") != -1) {
            field143[186] = 57;
            field143[187] = 27;
            field143[188] = 71;
            field143[189] = 26;
            field143[190] = 72;
            field143[191] = 73;
            field143[192] = 58;
            field143[219] = 42;
            field143[220] = 74;
            field143[221] = 43;
            field143[222] = 59;
            field143[223] = 28;
            return;
        }
        field143[44] = 71;
        field143[45] = 26;
        field143[46] = 72;
        field143[47] = 73;
        field143[59] = 57;
        field143[61] = 27;
        field143[91] = 42;
        field143[92] = 74;
        field143[93] = 43;
        field143[192] = 28;
        field143[222] = 58;
        field143[520] = 59;
    }

    @ObfuscatedName("cj.l(Ljava/awt/Component;B)V")
    public static void method2176(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field144);
        arg0.addFocusListener(field144);
    }

    @ObfuscatedName("nq.s(B)Z")
    public static final boolean method6010() {
        class24 var0 = field144;
        synchronized (field144) {
            if (field145 == field141) {
                return false;
            } else {
                Statics.field1750 = field133[field141];
                Statics.field1611 = field137[field141];
                field141 = field141 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("ev.e(S)I")
    public static int method2631() {
        return field138;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field144 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field143.length) {
            var3 = field143[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field149 >= 0 && var3 >= 0) {
            field134[field149] = var3;
            field149 = field149 + 1 & 0x7F;
            if (field149 == field146) {
                field149 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field147 + 1 & 0x7F;
            if (field141 != var4) {
                field133[field147] = var3;
                field137[field147] = 0;
                field147 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field144 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field143.length) {
                var3 = field143[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field149 >= 0 && var3 >= 0) {
                field134[field149] = ~var3;
                field149 = field149 + 1 & 0x7F;
                if (field149 == field146) {
                    field149 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field144 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class334.field4049;
                            for (int var5 = 0; var5 < var4.length; var5++) {
                                char var6 = var4[var5];
                                if (var2 == var6) {
                                    var3 = true;
                                    break label56;
                                }
                            }
                        }
                        var3 = false;
                    }
                }
                if (var3) {
                    int var7 = field147 + 1 & 0x7F;
                    if (field141 != var7) {
                        field133[field147] = -1;
                        field137[field147] = var2;
                        field147 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    @ObfuscatedName("jq.r(IB)Z")
    public static boolean method4794(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? field132[arg0] : false;
    }

    @ObfuscatedName("cf.o(IB)Z")
    public static boolean method1985(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? field131[arg0] : false;
    }

    @ObfuscatedName("em.i(II)Z")
    public static boolean method2733(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? field139[arg0] : false;
    }

    @ObfuscatedName("dy.w(B)[I")
    public static int[] method2581() {
        int[] var0 = new int[field140];
        for (int var1 = 0; var1 < field140; var1++) {
            var0[var1] = field136[var1];
        }
        return var0;
    }

    @ObfuscatedName("hq.v(I)[I")
    public static int[] method3949() {
        int[] var0 = new int[field142];
        for (int var1 = 0; var1 < field142; var1++) {
            var0[var1] = field126[var1];
        }
        return var0;
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field144 != null) {
            field149 = -1;
        }
    }
}
