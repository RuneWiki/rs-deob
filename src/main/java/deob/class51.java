package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("aj")
public final class class51 implements KeyListener, FocusListener {

    @ObfuscatedName("aj.p")
    public static class51 field584 = new class51();

    @ObfuscatedName("aj.cl")
    public static boolean[] field586 = new boolean[112];

    @ObfuscatedName("aj.co")
    public static int[] field587 = new int[128];

    @ObfuscatedName("aj.cy")
    public static int field588 = 0;

    @ObfuscatedName("aj.cm")
    public static int field589 = 0;

    @ObfuscatedName("aj.cn")
    public static char[] field583 = new char[128];

    @ObfuscatedName("aj.cb")
    public static int[] field577 = new int[128];

    @ObfuscatedName("aj.cq")
    public static int[] field592 = new int[128];

    @ObfuscatedName("aj.cd")
    public static int field593 = 0;

    @ObfuscatedName("aj.cs")
    public static int field594 = 0;

    @ObfuscatedName("aj.ck")
    public static int field591 = 0;

    @ObfuscatedName("aj.cj")
    public static int field596 = 0;

    @ObfuscatedName("aj.cz")
    public static volatile int field571 = 0;

    @ObfuscatedName("aj.ce")
    public static int[] field598 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("d.p(I)V")
    public static void method117() {
        if (Statics.field2532.toLowerCase().indexOf("microsoft") != -1) {
            field598[186] = 57;
            field598[187] = 27;
            field598[188] = 71;
            field598[189] = 26;
            field598[190] = 72;
            field598[191] = 73;
            field598[192] = 58;
            field598[219] = 42;
            field598[220] = 74;
            field598[221] = 43;
            field598[222] = 59;
            field598[223] = 28;
            return;
        }
        field598[44] = 71;
        field598[45] = 26;
        field598[46] = 72;
        field598[47] = 73;
        field598[59] = 57;
        field598[61] = 27;
        field598[91] = 42;
        field598[92] = 74;
        field598[93] = 43;
        field598[192] = 28;
        field598[222] = 58;
        field598[520] = 59;
    }

    @ObfuscatedName("s.i(I)V")
    public static void method8() {
        if (field584 != null) {
            class51 var0 = field584;
            synchronized (field584) {
                field584 = null;
            }
        }
    }

    @ObfuscatedName("jf.w(B)Z")
    public static final boolean method4333() {
        class51 var0 = field584;
        synchronized (field584) {
            if (field596 == field594) {
                return false;
            } else {
                Statics.field428 = field577[field594];
                Statics.field723 = field583[field594];
                field594 = field594 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("bg.s(B)I")
    public static int method935() {
        return field571;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field584 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field598.length) {
            var3 = field598[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field589 >= 0 && var3 >= 0) {
            field587[field589] = var3;
            field589 = field589 + 1 & 0x7F;
            if (field589 == field588) {
                field589 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field591 + 1 & 0x7F;
            if (field594 != var4) {
                field577[field591] = var3;
                field583[field591] = 0;
                field591 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field584 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field598.length) {
                var3 = field598[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field589 >= 0 && var3 >= 0) {
                field587[field589] = ~var3;
                field589 = field589 + 1 & 0x7F;
                if (field589 == field588) {
                    field589 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field584 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class290.method1481(var2)) {
                int var3 = field591 + 1 & 0x7F;
                if (field594 != var3) {
                    field577[field591] = -1;
                    field583[field591] = var2;
                    field591 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field584 != null) {
            field589 = -1;
        }
    }
}
