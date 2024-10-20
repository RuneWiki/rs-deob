package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ah")
public final class class46 implements KeyListener, FocusListener {

    @ObfuscatedName("ah.z")
    public static class46 field358 = new class46();

    @ObfuscatedName("ah.cy")
    public static boolean[] field370 = new boolean[112];

    @ObfuscatedName("ah.cr")
    public static int[] field366 = new int[128];

    @ObfuscatedName("ah.ct")
    public static int field373 = 0;

    @ObfuscatedName("ah.ci")
    public static int field374 = 0;

    @ObfuscatedName("ah.cu")
    public static char[] field375 = new char[128];

    @ObfuscatedName("ah.ce")
    public static int[] field376 = new int[128];

    @ObfuscatedName("ah.cc")
    public static int[] field377 = new int[128];

    @ObfuscatedName("ah.cl")
    public static int field362 = 0;

    @ObfuscatedName("ah.cw")
    public static int field379 = 0;

    @ObfuscatedName("ah.cq")
    public static int field372 = 0;

    @ObfuscatedName("ah.ca")
    public static int field381 = 0;

    @ObfuscatedName("ah.cf")
    public static volatile int field385 = 0;

    @ObfuscatedName("ah.cx")
    public static int[] field378 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("hm.z(S)V")
    public static void method3706() {
        if (Statics.field2019.toLowerCase().indexOf("microsoft") != -1) {
            field378[186] = 57;
            field378[187] = 27;
            field378[188] = 71;
            field378[189] = 26;
            field378[190] = 72;
            field378[191] = 73;
            field378[192] = 58;
            field378[219] = 42;
            field378[220] = 74;
            field378[221] = 43;
            field378[222] = 59;
            field378[223] = 28;
            return;
        }
        field378[44] = 71;
        field378[45] = 26;
        field378[46] = 72;
        field378[47] = 73;
        field378[59] = 57;
        field378[61] = 27;
        field378[91] = 42;
        field378[92] = 74;
        field378[93] = 43;
        field378[192] = 28;
        field378[222] = 58;
        field378[520] = 59;
    }

    @ObfuscatedName("cg.n(Ljava/awt/Component;I)V")
    public static void method1876(Component arg0) {
        arg0.removeKeyListener(field358);
        arg0.removeFocusListener(field358);
        field374 = -1;
    }

    @ObfuscatedName("gl.v(I)V")
    public static void method3313() {
        if (field358 != null) {
            class46 var0 = field358;
            synchronized (field358) {
                field358 = null;
            }
        }
    }

    @ObfuscatedName("ce.u(I)Z")
    public static final boolean method2020() {
        class46 var0 = field358;
        synchronized (field358) {
            if (field381 == field379) {
                return false;
            } else {
                Statics.field1231 = field376[field379];
                Statics.field382 = field375[field379];
                field379 = field379 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("bj.r(S)I")
    public static int method1010() {
        return field385;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field358 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field378.length) {
            var3 = field378[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field374 >= 0 && var3 >= 0) {
            field366[field374] = var3;
            field374 = field374 + 1 & 0x7F;
            if (field374 == field373) {
                field374 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field372 + 1 & 0x7F;
            if (field379 != var4) {
                field376[field372] = var3;
                field375[field372] = 0;
                field372 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field358 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field378.length) {
                var3 = field378[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field374 >= 0 && var3 >= 0) {
                field366[field374] = ~var3;
                field374 = field374 + 1 & 0x7F;
                if (field374 == field373) {
                    field374 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field358 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class288.method1658(var2)) {
                int var3 = field372 + 1 & 0x7F;
                if (field379 != var3) {
                    field376[field372] = -1;
                    field375[field372] = var2;
                    field372 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field358 != null) {
            field374 = -1;
        }
    }
}
