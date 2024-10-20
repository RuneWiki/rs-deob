package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ay")
public final class class46 implements KeyListener, FocusListener {

    @ObfuscatedName("ay.s")
    public static class46 field367 = new class46();

    @ObfuscatedName("ay.cp")
    public static boolean[] field374 = new boolean[112];

    @ObfuscatedName("ay.cb")
    public static int[] field375 = new int[128];

    @ObfuscatedName("ay.ch")
    public static int field376 = 0;

    @ObfuscatedName("ay.cn")
    public static int field379 = 0;

    @ObfuscatedName("ay.cr")
    public static char[] field378 = new char[128];

    @ObfuscatedName("ay.cl")
    public static int[] field377 = new int[128];

    @ObfuscatedName("ay.cg")
    public static int[] field380 = new int[128];

    @ObfuscatedName("ay.cy")
    public static int field381 = 0;

    @ObfuscatedName("ay.cz")
    public static int field386 = 0;

    @ObfuscatedName("ay.cv")
    public static int field383 = 0;

    @ObfuscatedName("ay.cq")
    public static int field384 = 0;

    @ObfuscatedName("ay.ct")
    public static volatile int field385 = 0;

    @ObfuscatedName("ay.cx")
    public static int[] field368 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("is.s(Ljava/awt/Component;S)V")
    public static void method4107(Component arg0) {
        arg0.removeKeyListener(field367);
        arg0.removeFocusListener(field367);
        field379 = -1;
    }

    @ObfuscatedName("kz.j(B)Z")
    public static final boolean method4883() {
        class46 var0 = field367;
        synchronized (field367) {
            if (field386 == field384) {
                return false;
            } else {
                Statics.field1308 = field377[field386];
                Statics.field2500 = field378[field386];
                field386 = field386 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("ex.i(I)I")
    public static int method2826() {
        return field385;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field367 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field368.length) {
            var3 = field368[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field379 >= 0 && var3 >= 0) {
            field375[field379] = var3;
            field379 = field379 + 1 & 0x7F;
            if (field379 == field376) {
                field379 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field383 + 1 & 0x7F;
            if (field386 != var4) {
                field377[field383] = var3;
                field378[field383] = 0;
                field383 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field367 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field368.length) {
                var3 = field368[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field379 >= 0 && var3 >= 0) {
                field375[field379] = ~var3;
                field379 = field379 + 1 & 0x7F;
                if (field379 == field376) {
                    field379 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field367 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class288.method3733(var2)) {
                int var3 = field383 + 1 & 0x7F;
                if (field386 != var3) {
                    field377[field383] = -1;
                    field378[field383] = var2;
                    field383 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field367 != null) {
            field379 = -1;
        }
    }
}
