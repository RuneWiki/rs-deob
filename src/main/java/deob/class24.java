package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("z")
public final class class24 implements KeyListener, FocusListener {

    @ObfuscatedName("z.c")
    public static class24 field126 = new class24();

    @ObfuscatedName("z.co")
    public static boolean[] field156 = new boolean[112];

    @ObfuscatedName("z.cc")
    public static boolean[] field133 = new boolean[112];

    @ObfuscatedName("z.cs")
    public static boolean[] field131 = new boolean[112];

    @ObfuscatedName("z.cj")
    public static int[] field135 = new int[128];

    @ObfuscatedName("z.ca")
    public static int field136 = 0;

    @ObfuscatedName("z.cz")
    public static int field121 = 0;

    @ObfuscatedName("z.cw")
    public static char[] field138 = new char[128];

    @ObfuscatedName("z.ct")
    public static int[] field132 = new int[128];

    @ObfuscatedName("z.ci")
    public static int[] field140 = new int[128];

    @ObfuscatedName("z.ch")
    public static int field141 = 0;

    @ObfuscatedName("z.cq")
    public static int[] field142 = new int[128];

    @ObfuscatedName("z.cf")
    public static int field143 = 0;

    @ObfuscatedName("z.cu")
    public static int field144 = 0;

    @ObfuscatedName("z.cx")
    public static int field145 = 0;

    @ObfuscatedName("z.cm")
    public static int field146 = 0;

    @ObfuscatedName("z.dm")
    public static volatile int field151 = 0;

    @ObfuscatedName("z.dr")
    public static int[] field148 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("eg.c(I)V")
    public static void method2626() {
        if (Statics.field1673.toLowerCase().indexOf("microsoft") != -1) {
            field148[186] = 57;
            field148[187] = 27;
            field148[188] = 71;
            field148[189] = 26;
            field148[190] = 72;
            field148[191] = 73;
            field148[192] = 58;
            field148[219] = 42;
            field148[220] = 74;
            field148[221] = 43;
            field148[222] = 59;
            field148[223] = 28;
            return;
        }
        field148[44] = 71;
        field148[45] = 26;
        field148[46] = 72;
        field148[47] = 73;
        field148[59] = 57;
        field148[61] = 27;
        field148[91] = 42;
        field148[92] = 74;
        field148[93] = 43;
        field148[192] = 28;
        field148[222] = 58;
        field148[520] = 59;
    }

    @ObfuscatedName("i.b(Ljava/awt/Component;B)V")
    public static void method385(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field126);
        arg0.addFocusListener(field126);
    }

    @ObfuscatedName("ka.p(B)V")
    public static void method5168() {
        if (field126 != null) {
            class24 var0 = field126;
            synchronized (field126) {
                field126 = null;
            }
        }
    }

    @ObfuscatedName("fi.m(I)Z")
    public static final boolean method3026() {
        class24 var0 = field126;
        synchronized (field126) {
            if (field146 == field144) {
                return false;
            } else {
                Statics.field1248 = field132[field144];
                Statics.field3955 = field138[field144];
                field144 = field144 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field126 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field148.length) {
            var3 = field148[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field121 >= 0 && var3 >= 0) {
            field135[field121] = var3;
            field121 = field121 + 1 & 0x7F;
            if (field136 == field121) {
                field121 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field145 + 1 & 0x7F;
            if (field144 != var4) {
                field132[field145] = var3;
                field138[field145] = 0;
                field145 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field126 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field148.length) {
                var3 = field148[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field121 >= 0 && var3 >= 0) {
                field135[field121] = ~var3;
                field121 = field121 + 1 & 0x7F;
                if (field136 == field121) {
                    field121 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field126 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class329.method2633(var2)) {
                int var3 = field145 + 1 & 0x7F;
                if (field144 != var3) {
                    field132[field145] = -1;
                    field138[field145] = var2;
                    field145 = var3;
                }
            }
        }
        arg0.consume();
    }

    @ObfuscatedName("fp.t(IB)Z")
    public static boolean method3115(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? field133[arg0] : false;
    }

    @ObfuscatedName("i.s(II)Z")
    public static boolean method390(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? field156[arg0] : false;
    }

    @ObfuscatedName("dp.j(IB)Z")
    public static boolean method2540(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? field131[arg0] : false;
    }

    @ObfuscatedName("ce.w(B)[I")
    public static int[] method2043() {
        int[] var0 = new int[field141];
        for (int var1 = 0; var1 < field141; var1++) {
            var0[var1] = field140[var1];
        }
        return var0;
    }

    @ObfuscatedName("lf.n(I)[I")
    public static int[] method5282() {
        int[] var0 = new int[field143];
        for (int var1 = 0; var1 < field143; var1++) {
            var0[var1] = field142[var1];
        }
        return var0;
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field126 != null) {
            field121 = -1;
        }
    }
}
