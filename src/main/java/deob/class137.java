package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("er")
public final class class137 implements KeyListener, FocusListener {

    @ObfuscatedName("er.o")
    public static class137 field2109 = new class137();

    @ObfuscatedName("er.cv")
    public static boolean[] field2112 = new boolean[112];

    @ObfuscatedName("er.cy")
    public static int[] field2104 = new int[128];

    @ObfuscatedName("er.cl")
    public static int field2105 = 0;

    @ObfuscatedName("er.cg")
    public static int field2106 = 0;

    @ObfuscatedName("er.cu")
    public static char[] field2117 = new char[128];

    @ObfuscatedName("er.cr")
    public static int[] field2108 = new int[128];

    @ObfuscatedName("er.ca")
    public static int[] field2116 = new int[128];

    @ObfuscatedName("er.cs")
    public static int field2110 = 0;

    @ObfuscatedName("er.cm")
    public static int field2098 = 0;

    @ObfuscatedName("er.cz")
    public static int field2114 = 0;

    @ObfuscatedName("er.cc")
    public static int field2113 = 0;

    @ObfuscatedName("er.ck")
    public static volatile int field2086 = 0;

    @ObfuscatedName("er.cf")
    public static int[] field2115 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("dh.o(I)Z")
    public static final boolean method2213() {
        class137 var0 = field2109;
        synchronized (field2109) {
            if (field2113 == field2098) {
                return false;
            } else {
                Statics.field2103 = field2108[field2098];
                Statics.field2265 = field2117[field2098];
                field2098 = field2098 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2109 == null) {
            return;
        }
        field2086 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2115.length) {
            var3 = field2115[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2106 >= 0 && var3 >= 0) {
            field2104[field2106] = var3;
            field2106 = field2106 + 1 & 0x7F;
            if (field2106 == field2105) {
                field2106 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2114 + 1 & 0x7F;
            if (field2098 != var4) {
                field2108[field2114] = var3;
                field2117[field2114] = 0;
                field2114 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2109 != null) {
            field2086 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2115.length) {
                var3 = field2115[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2106 >= 0 && var3 >= 0) {
                field2104[field2106] = ~var3;
                field2106 = field2106 + 1 & 0x7F;
                if (field2106 == field2105) {
                    field2106 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2109 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class165.method552(var2)) {
                int var3 = field2114 + 1 & 0x7F;
                if (field2098 != var3) {
                    field2108[field2114] = -1;
                    field2117[field2114] = var2;
                    field2114 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2109 != null) {
            field2106 = -1;
        }
    }
}
