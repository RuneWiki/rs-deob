package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("eu")
public final class class137 implements KeyListener, FocusListener {

    @ObfuscatedName("eu.n")
    public static class137 field2112 = new class137();

    @ObfuscatedName("eu.ct")
    public static boolean[] field2100 = new boolean[112];

    @ObfuscatedName("eu.cm")
    public static int[] field2103 = new int[128];

    @ObfuscatedName("eu.cp")
    public static int field2102 = 0;

    @ObfuscatedName("eu.cf")
    public static int field2106 = 0;

    @ObfuscatedName("eu.cq")
    public static char[] field2104 = new char[128];

    @ObfuscatedName("eu.ci")
    public static int[] field2105 = new int[128];

    @ObfuscatedName("eu.cs")
    public static int[] field2085 = new int[128];

    @ObfuscatedName("eu.cr")
    public static int field2107 = 0;

    @ObfuscatedName("eu.ca")
    public static int field2108 = 0;

    @ObfuscatedName("eu.cc")
    public static int field2109 = 0;

    @ObfuscatedName("eu.co")
    public static int field2110 = 0;

    @ObfuscatedName("eu.cg")
    public static volatile int field2111 = 0;

    @ObfuscatedName("eu.cd")
    public static int[] field2094 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("aq.n(I)V")
    public static void method1019() {
        if (Statics.field2080.toLowerCase().indexOf("microsoft") != -1) {
            field2094[186] = 57;
            field2094[187] = 27;
            field2094[188] = 71;
            field2094[189] = 26;
            field2094[190] = 72;
            field2094[191] = 73;
            field2094[192] = 58;
            field2094[219] = 42;
            field2094[220] = 74;
            field2094[221] = 43;
            field2094[222] = 59;
            field2094[223] = 28;
            return;
        }
        field2094[44] = 71;
        field2094[45] = 26;
        field2094[46] = 72;
        field2094[47] = 73;
        field2094[59] = 57;
        field2094[61] = 27;
        field2094[91] = 42;
        field2094[92] = 74;
        field2094[93] = 43;
        field2094[192] = 28;
        field2094[222] = 58;
        field2094[520] = 59;
    }

    @ObfuscatedName("ea.q(S)V")
    public static void method2786() {
        if (field2112 != null) {
            class137 var0 = field2112;
            synchronized (field2112) {
                field2112 = null;
            }
        }
    }

    @ObfuscatedName("di.c(B)V")
    public static void method2309() {
        class137 var0 = field2112;
        synchronized (field2112) {
            field2111++;
            field2108 = field2110;
            field2107 = 0;
            if (field2106 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field2100[var1] = false;
                }
                field2106 = field2102;
            } else {
                while (field2106 != field2102) {
                    int var2 = field2103[field2102];
                    field2102 = field2102 + 1 & 0x7F;
                    if (var2 < 0) {
                        field2100[~var2] = false;
                    } else {
                        if (!field2100[var2] && field2107 < field2085.length - 1) {
                            field2085[++field2107 - 1] = var2;
                        }
                        field2100[var2] = true;
                    }
                }
            }
            field2110 = field2109;
        }
    }

    @ObfuscatedName("c.l(B)Z")
    public static final boolean method36() {
        class137 var0 = field2112;
        synchronized (field2112) {
            if (field2110 == field2108) {
                return false;
            } else {
                Statics.field2030 = field2105[field2108];
                Statics.field1864 = field2104[field2108];
                field2108 = field2108 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2112 == null) {
            return;
        }
        field2111 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2094.length) {
            var3 = field2094[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2106 >= 0 && var3 >= 0) {
            field2103[field2106] = var3;
            field2106 = field2106 + 1 & 0x7F;
            if (field2106 == field2102) {
                field2106 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2109 + 1 & 0x7F;
            if (field2108 != var4) {
                field2105[field2109] = var3;
                field2104[field2109] = 0;
                field2109 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2112 != null) {
            field2111 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2094.length) {
                var3 = field2094[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2106 >= 0 && var3 >= 0) {
                field2103[field2106] = ~var3;
                field2106 = field2106 + 1 & 0x7F;
                if (field2106 == field2102) {
                    field2106 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2112 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class165.method2954(var2)) {
                int var3 = field2109 + 1 & 0x7F;
                if (field2108 != var3) {
                    field2105[field2109] = -1;
                    field2104[field2109] = var2;
                    field2109 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2112 != null) {
            field2106 = -1;
        }
    }
}
