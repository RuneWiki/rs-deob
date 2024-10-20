package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("e")
public final class class24 implements KeyListener, FocusListener {

    @ObfuscatedName("e.v")
    public static class24 field126 = new class24();

    @ObfuscatedName("e.cp")
    public static boolean[] field130 = new boolean[112];

    @ObfuscatedName("e.co")
    public static boolean[] field141 = new boolean[112];

    @ObfuscatedName("e.ca")
    public static boolean[] field132 = new boolean[112];

    @ObfuscatedName("e.cr")
    public static int[] field146 = new int[128];

    @ObfuscatedName("e.cq")
    public static int field134 = 0;

    @ObfuscatedName("e.cn")
    public static int field129 = 0;

    @ObfuscatedName("e.cu")
    public static char[] field136 = new char[128];

    @ObfuscatedName("e.cg")
    public static int[] field137 = new int[128];

    @ObfuscatedName("e.cj")
    public static int[] field144 = new int[128];

    @ObfuscatedName("e.ce")
    public static int field119 = 0;

    @ObfuscatedName("e.cl")
    public static int[] field140 = new int[128];

    @ObfuscatedName("e.ck")
    public static int field133 = 0;

    @ObfuscatedName("e.cd")
    public static int field142 = 0;

    @ObfuscatedName("e.cw")
    public static int field143 = 0;

    @ObfuscatedName("e.cx")
    public static int field139 = 0;

    @ObfuscatedName("e.dr")
    public static volatile int field145 = 0;

    @ObfuscatedName("e.dj")
    public static int[] field138 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("kt.v(I)V")
    public static void method5218() {
        if (Statics.field1718.toLowerCase().indexOf("microsoft") != -1) {
            field138[186] = 57;
            field138[187] = 27;
            field138[188] = 71;
            field138[189] = 26;
            field138[190] = 72;
            field138[191] = 73;
            field138[192] = 58;
            field138[219] = 42;
            field138[220] = 74;
            field138[221] = 43;
            field138[222] = 59;
            field138[223] = 28;
            return;
        }
        field138[44] = 71;
        field138[45] = 26;
        field138[46] = 72;
        field138[47] = 73;
        field138[59] = 57;
        field138[61] = 27;
        field138[91] = 42;
        field138[92] = 74;
        field138[93] = 43;
        field138[192] = 28;
        field138[222] = 58;
        field138[520] = 59;
    }

    @ObfuscatedName("ix.c(Ljava/awt/Component;B)V")
    public static void method4446(Component arg0) {
        arg0.removeKeyListener(field126);
        arg0.removeFocusListener(field126);
        field129 = -1;
    }

    @ObfuscatedName("gz.i(B)V")
    public static void method3887() {
        if (field126 != null) {
            class24 var0 = field126;
            synchronized (field126) {
                field126 = null;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field126 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field138.length) {
            var3 = field138[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field129 >= 0 && var3 >= 0) {
            field146[field129] = var3;
            field129 = field129 + 1 & 0x7F;
            if (field134 == field129) {
                field129 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field143 + 1 & 0x7F;
            if (field142 != var4) {
                field137[field143] = var3;
                field136[field143] = 0;
                field143 = var4;
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
            if (var2 >= 0 && var2 < field138.length) {
                var3 = field138[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field129 >= 0 && var3 >= 0) {
                field146[field129] = ~var3;
                field129 = field129 + 1 & 0x7F;
                if (field134 == field129) {
                    field129 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field126 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class346.method2714(var2)) {
                int var3 = field143 + 1 & 0x7F;
                if (field142 != var3) {
                    field137[field143] = -1;
                    field136[field143] = var2;
                    field143 = var3;
                }
            }
        }
        arg0.consume();
    }

    @ObfuscatedName("bf.b(II)Z")
    public static boolean method1067(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? field141[arg0] : false;
    }

    @ObfuscatedName("jd.n(II)Z")
    public static boolean method4675(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? field130[arg0] : false;
    }

    @ObfuscatedName("bf.s(IB)Z")
    public static boolean method1075(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? field132[arg0] : false;
    }

    @ObfuscatedName("ow.l(I)[I")
    public static int[] method6742() {
        int[] var0 = new int[field119];
        for (int var1 = 0; var1 < field119; var1++) {
            var0[var1] = field144[var1];
        }
        return var0;
    }

    @ObfuscatedName("df.q(I)[I")
    public static int[] method2620() {
        int[] var0 = new int[field133];
        for (int var1 = 0; var1 < field133; var1++) {
            var0[var1] = field140[var1];
        }
        return var0;
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field126 != null) {
            field129 = -1;
        }
    }
}
