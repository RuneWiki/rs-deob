package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ew")
public final class class137 implements KeyListener, FocusListener {

    @ObfuscatedName("ew.h")
    public static class137 field2107 = new class137();

    @ObfuscatedName("ew.cn")
    public static boolean[] field2102 = new boolean[112];

    @ObfuscatedName("ew.ca")
    public static int[] field2101 = new int[128];

    @ObfuscatedName("ew.ce")
    public static int field2104 = 0;

    @ObfuscatedName("ew.cq")
    public static int field2103 = 0;

    @ObfuscatedName("ew.cf")
    public static char[] field2105 = new char[128];

    @ObfuscatedName("ew.ct")
    public static int[] field2097 = new int[128];

    @ObfuscatedName("ew.cr")
    public static int[] field2106 = new int[128];

    @ObfuscatedName("ew.cs")
    public static int field2091 = 0;

    @ObfuscatedName("ew.cz")
    public static int field2087 = 0;

    @ObfuscatedName("ew.cb")
    public static int field2109 = 0;

    @ObfuscatedName("ew.cx")
    public static int field2110 = 0;

    @ObfuscatedName("ew.ch")
    public static volatile int field2111 = 0;

    @ObfuscatedName("ew.cg")
    public static int[] field2108 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("em.h(Ljava/awt/Component;I)V")
    public static void method2754(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field2107);
        arg0.addFocusListener(field2107);
    }

    @ObfuscatedName("g.q(Ljava/awt/Component;B)V")
    public static void method92(Component arg0) {
        arg0.removeKeyListener(field2107);
        arg0.removeFocusListener(field2107);
        field2103 = -1;
    }

    @ObfuscatedName("ar.v(I)V")
    public static void method703() {
        class137 var0 = field2107;
        synchronized (field2107) {
            field2111++;
            field2087 = field2110;
            field2091 = 0;
            if (field2103 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field2102[var1] = false;
                }
                field2103 = field2104;
            } else {
                while (field2104 != field2103) {
                    int var2 = field2101[field2104];
                    field2104 = field2104 + 1 & 0x7F;
                    if (var2 < 0) {
                        field2102[~var2] = false;
                    } else {
                        if (!field2102[var2] && field2091 < field2106.length - 1) {
                            field2106[++field2091 - 1] = var2;
                        }
                        field2102[var2] = true;
                    }
                }
            }
            field2110 = field2109;
        }
    }

    @ObfuscatedName("dw.n(I)Z")
    public static final boolean method2692() {
        class137 var0 = field2107;
        synchronized (field2107) {
            if (field2110 == field2087) {
                return false;
            } else {
                Statics.field802 = field2097[field2087];
                Statics.field590 = field2105[field2087];
                field2087 = field2087 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("bs.f(I)I")
    public static int method1072() {
        return field2111;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2107 == null) {
            return;
        }
        field2111 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2108.length) {
            var3 = field2108[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2103 >= 0 && var3 >= 0) {
            field2101[field2103] = var3;
            field2103 = field2103 + 1 & 0x7F;
            if (field2104 == field2103) {
                field2103 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2109 + 1 & 0x7F;
            if (field2087 != var4) {
                field2097[field2109] = var3;
                field2105[field2109] = 0;
                field2109 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2107 != null) {
            field2111 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2108.length) {
                var3 = field2108[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2103 >= 0 && var3 >= 0) {
                field2101[field2103] = ~var3;
                field2103 = field2103 + 1 & 0x7F;
                if (field2104 == field2103) {
                    field2103 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2107 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class165.method3532(var2)) {
                int var3 = field2109 + 1 & 0x7F;
                if (field2087 != var3) {
                    field2097[field2109] = -1;
                    field2105[field2109] = var2;
                    field2109 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2107 != null) {
            field2103 = -1;
        }
    }
}
