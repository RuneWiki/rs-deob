package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("eh")
public final class class137 implements KeyListener, FocusListener {

    @ObfuscatedName("eh.i")
    public static class137 field2106 = new class137();

    @ObfuscatedName("eh.ct")
    public static boolean[] field2107 = new boolean[112];

    @ObfuscatedName("eh.cp")
    public static int[] field2115 = new int[128];

    @ObfuscatedName("eh.cq")
    public static int field2109 = 0;

    @ObfuscatedName("eh.cm")
    public static int field2110 = 0;

    @ObfuscatedName("eh.cv")
    public static char[] field2114 = new char[128];

    @ObfuscatedName("eh.cj")
    public static int[] field2111 = new int[128];

    @ObfuscatedName("eh.cb")
    public static int[] field2113 = new int[128];

    @ObfuscatedName("eh.cc")
    public static int field2112 = 0;

    @ObfuscatedName("eh.cw")
    public static int field2118 = 0;

    @ObfuscatedName("eh.cz")
    public static int field2116 = 0;

    @ObfuscatedName("eh.cl")
    public static int field2117 = 0;

    @ObfuscatedName("eh.cx")
    public static volatile int field2101 = 0;

    @ObfuscatedName("eh.ci")
    public static int[] field2119 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("z.i(B)V")
    public static void method142() {
        if (Statics.field2091.toLowerCase().indexOf("microsoft") != -1) {
            field2119[186] = 57;
            field2119[187] = 27;
            field2119[188] = 71;
            field2119[189] = 26;
            field2119[190] = 72;
            field2119[191] = 73;
            field2119[192] = 58;
            field2119[219] = 42;
            field2119[220] = 74;
            field2119[221] = 43;
            field2119[222] = 59;
            field2119[223] = 28;
            return;
        }
        field2119[44] = 71;
        field2119[45] = 26;
        field2119[46] = 72;
        field2119[47] = 73;
        field2119[59] = 57;
        field2119[61] = 27;
        field2119[91] = 42;
        field2119[92] = 74;
        field2119[93] = 43;
        field2119[192] = 28;
        field2119[222] = 58;
        field2119[520] = 59;
    }

    @ObfuscatedName("by.v(Ljava/awt/Component;I)V")
    public static void method1267(Component arg0) {
        arg0.removeKeyListener(field2106);
        arg0.removeFocusListener(field2106);
        field2110 = -1;
    }

    @ObfuscatedName("am.r(I)V")
    public static void method936() {
        if (field2106 != null) {
            class137 var0 = field2106;
            synchronized (field2106) {
                field2106 = null;
            }
        }
    }

    @ObfuscatedName("ac.n(I)Z")
    public static final boolean method741() {
        class137 var0 = field2106;
        synchronized (field2106) {
            if (field2118 == field2117) {
                return false;
            } else {
                Statics.field584 = field2111[field2118];
                Statics.field770 = field2114[field2118];
                field2118 = field2118 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("l.x(B)I")
    public static int method159() {
        return field2101;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2106 == null) {
            return;
        }
        field2101 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2119.length) {
            var3 = field2119[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2110 >= 0 && var3 >= 0) {
            field2115[field2110] = var3;
            field2110 = field2110 + 1 & 0x7F;
            if (field2110 == field2109) {
                field2110 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2116 + 1 & 0x7F;
            if (field2118 != var4) {
                field2111[field2116] = var3;
                field2114[field2116] = 0;
                field2116 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2106 != null) {
            field2101 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2119.length) {
                var3 = field2119[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2110 >= 0 && var3 >= 0) {
                field2115[field2110] = ~var3;
                field2110 = field2110 + 1 & 0x7F;
                if (field2110 == field2109) {
                    field2110 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2106 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class165.method798(var2)) {
                int var3 = field2116 + 1 & 0x7F;
                if (field2118 != var3) {
                    field2111[field2116] = -1;
                    field2114[field2116] = var2;
                    field2116 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2106 != null) {
            field2110 = -1;
        }
    }
}
