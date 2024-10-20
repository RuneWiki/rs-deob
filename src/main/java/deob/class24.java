package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("o")
public final class class24 implements KeyListener, FocusListener {

    @ObfuscatedName("o.c")
    public static class24 field130 = new class24();

    @ObfuscatedName("o.cp")
    public static boolean[] field136 = new boolean[112];

    @ObfuscatedName("o.cf")
    public static boolean[] field137 = new boolean[112];

    @ObfuscatedName("o.cv")
    public static boolean[] field142 = new boolean[112];

    @ObfuscatedName("o.cz")
    public static int[] field139 = new int[128];

    @ObfuscatedName("o.cu")
    public static int field140 = 0;

    @ObfuscatedName("o.ce")
    public static int field141 = 0;

    @ObfuscatedName("o.cy")
    public static char[] field150 = new char[128];

    @ObfuscatedName("o.ca")
    public static int[] field149 = new int[128];

    @ObfuscatedName("o.ck")
    public static int[] field135 = new int[128];

    @ObfuscatedName("o.cb")
    public static int field145 = 0;

    @ObfuscatedName("o.cs")
    public static int[] field143 = new int[128];

    @ObfuscatedName("o.cd")
    public static int field147 = 0;

    @ObfuscatedName("o.cl")
    public static int field148 = 0;

    @ObfuscatedName("o.ct")
    public static int field144 = 0;

    @ObfuscatedName("o.ch")
    public static int field128 = 0;

    @ObfuscatedName("o.dm")
    public static volatile int field151 = 0;

    @ObfuscatedName("o.dd")
    public static int[] field152 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("pv.c(I)V")
    public static void method6894() {
        if (Statics.field4267.toLowerCase().indexOf("microsoft") != -1) {
            field152[186] = 57;
            field152[187] = 27;
            field152[188] = 71;
            field152[189] = 26;
            field152[190] = 72;
            field152[191] = 73;
            field152[192] = 58;
            field152[219] = 42;
            field152[220] = 74;
            field152[221] = 43;
            field152[222] = 59;
            field152[223] = 28;
            return;
        }
        field152[44] = 71;
        field152[45] = 26;
        field152[46] = 72;
        field152[47] = 73;
        field152[59] = 57;
        field152[61] = 27;
        field152[91] = 42;
        field152[92] = 74;
        field152[93] = 43;
        field152[192] = 28;
        field152[222] = 58;
        field152[520] = 59;
    }

    @ObfuscatedName("cv.v(Ljava/awt/Component;I)V")
    public static void method2236(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field130);
        arg0.addFocusListener(field130);
    }

    @ObfuscatedName("gk.q(Ljava/awt/Component;I)V")
    public static void method3384(Component arg0) {
        arg0.removeKeyListener(field130);
        arg0.removeFocusListener(field130);
        field141 = -1;
    }

    @ObfuscatedName("cm.f(I)V")
    public static void method2020() {
        if (field130 != null) {
            class24 var0 = field130;
            synchronized (field130) {
                field130 = null;
            }
        }
    }

    @ObfuscatedName("l.j(B)Z")
    public static final boolean method235() {
        class24 var0 = field130;
        synchronized (field130) {
            if (field148 == field128) {
                return false;
            } else {
                Statics.field3197 = field149[field148];
                Statics.field1259 = field150[field148];
                field148 = field148 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field130 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field152.length) {
            var3 = field152[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field141 >= 0 && var3 >= 0) {
            field139[field141] = var3;
            field141 = field141 + 1 & 0x7F;
            if (field141 == field140) {
                field141 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field144 + 1 & 0x7F;
            if (field148 != var4) {
                field149[field144] = var3;
                field150[field144] = 0;
                field144 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field130 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field152.length) {
                var3 = field152[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field141 >= 0 && var3 >= 0) {
                field139[field141] = ~var3;
                field141 = field141 + 1 & 0x7F;
                if (field141 == field140) {
                    field141 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field130 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class341.method4758(var2)) {
                int var3 = field144 + 1 & 0x7F;
                if (field148 != var3) {
                    field149[field144] = -1;
                    field150[field144] = var2;
                    field144 = var3;
                }
            }
        }
        arg0.consume();
    }

    @ObfuscatedName("hj.e(II)Z")
    public static boolean method4192(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? field137[arg0] : false;
    }

    @ObfuscatedName("kp.y(B)[I")
    public static int[] method4993() {
        int[] var0 = new int[field145];
        for (int var1 = 0; var1 < field145; var1++) {
            var0[var1] = field135[var1];
        }
        return var0;
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field130 != null) {
            field141 = -1;
        }
    }
}
