package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("r")
public final class class24 implements KeyListener, FocusListener {

    @ObfuscatedName("r.c")
    public static class24 field133 = new class24();

    @ObfuscatedName("r.cg")
    public static boolean[] field123 = new boolean[112];

    @ObfuscatedName("r.cu")
    public static boolean[] field134 = new boolean[112];

    @ObfuscatedName("r.cz")
    public static boolean[] field135 = new boolean[112];

    @ObfuscatedName("r.ca")
    public static int[] field136 = new int[128];

    @ObfuscatedName("r.cx")
    public static int field137 = 0;

    @ObfuscatedName("r.cq")
    public static int field132 = 0;

    @ObfuscatedName("r.cp")
    public static char[] field125 = new char[128];

    @ObfuscatedName("r.ck")
    public static int[] field138 = new int[128];

    @ObfuscatedName("r.ci")
    public static int[] field141 = new int[128];

    @ObfuscatedName("r.cb")
    public static int field142 = 0;

    @ObfuscatedName("r.cd")
    public static int[] field144 = new int[128];

    @ObfuscatedName("r.cs")
    public static int field124 = 0;

    @ObfuscatedName("r.ch")
    public static int field145 = 0;

    @ObfuscatedName("r.cc")
    public static int field146 = 0;

    @ObfuscatedName("r.cm")
    public static int field147 = 0;

    @ObfuscatedName("r.db")
    public static volatile int field148 = 0;

    @ObfuscatedName("r.df")
    public static int[] field149 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("y.c(I)V")
    public static void method317() {
        if (Statics.field1760.toLowerCase().indexOf("microsoft") != -1) {
            field149[186] = 57;
            field149[187] = 27;
            field149[188] = 71;
            field149[189] = 26;
            field149[190] = 72;
            field149[191] = 73;
            field149[192] = 58;
            field149[219] = 42;
            field149[220] = 74;
            field149[221] = 43;
            field149[222] = 59;
            field149[223] = 28;
            return;
        }
        field149[44] = 71;
        field149[45] = 26;
        field149[46] = 72;
        field149[47] = 73;
        field149[59] = 57;
        field149[61] = 27;
        field149[91] = 42;
        field149[92] = 74;
        field149[93] = 43;
        field149[192] = 28;
        field149[222] = 58;
        field149[520] = 59;
    }

    @ObfuscatedName("ck.p(Ljava/awt/Component;I)V")
    public static void method2448(Component arg0) {
        arg0.removeKeyListener(field133);
        arg0.removeFocusListener(field133);
        field132 = -1;
    }

    @ObfuscatedName("ao.f(B)Z")
    public static final boolean method402() {
        class24 var0 = field133;
        synchronized (field133) {
            if (field147 == field145) {
                return false;
            } else {
                Statics.field1666 = field138[field145];
                Statics.field2795 = field125[field145];
                field145 = field145 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("eq.n(I)I")
    public static int method2991() {
        return field148;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field133 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field149.length) {
            var3 = field149[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field132 >= 0 && var3 >= 0) {
            field136[field132] = var3;
            field132 = field132 + 1 & 0x7F;
            if (field137 == field132) {
                field132 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field146 + 1 & 0x7F;
            if (field145 != var4) {
                field138[field146] = var3;
                field125[field146] = 0;
                field146 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field133 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field149.length) {
                var3 = field149[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field132 >= 0 && var3 >= 0) {
                field136[field132] = ~var3;
                field132 = field132 + 1 & 0x7F;
                if (field137 == field132) {
                    field132 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field133 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class343.method5340(var2)) {
                int var3 = field146 + 1 & 0x7F;
                if (field145 != var3) {
                    field138[field146] = -1;
                    field125[field146] = var2;
                    field146 = var3;
                }
            }
        }
        arg0.consume();
    }

    @ObfuscatedName("dz.k(IB)Z")
    public static boolean method2682(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? field134[arg0] : false;
    }

    @ObfuscatedName("kd.w(II)Z")
    public static boolean method5189(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? field123[arg0] : false;
    }

    @ObfuscatedName("hd.s(IB)Z")
    public static boolean method4273(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? field135[arg0] : false;
    }

    @ObfuscatedName("fw.q(B)[I")
    public static int[] method3300() {
        int[] var0 = new int[field142];
        for (int var1 = 0; var1 < field142; var1++) {
            var0[var1] = field141[var1];
        }
        return var0;
    }

    @ObfuscatedName("jf.m(I)[I")
    public static int[] method4801() {
        int[] var0 = new int[field124];
        for (int var1 = 0; var1 < field124; var1++) {
            var0[var1] = field144[var1];
        }
        return var0;
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field133 != null) {
            field132 = -1;
        }
    }
}
