package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("er")
public final class class138 implements KeyListener, FocusListener {

    @ObfuscatedName("er.a")
    public static class138 field2118 = new class138();

    @ObfuscatedName("er.cp")
    public static boolean[] field2116 = new boolean[112];

    @ObfuscatedName("er.cj")
    public static int[] field2122 = new int[128];

    @ObfuscatedName("er.cy")
    public static int field2131 = 0;

    @ObfuscatedName("er.cm")
    public static int field2120 = 0;

    @ObfuscatedName("er.cb")
    public static char[] field2121 = new char[128];

    @ObfuscatedName("er.ci")
    public static int[] field2132 = new int[128];

    @ObfuscatedName("er.ch")
    public static int[] field2123 = new int[128];

    @ObfuscatedName("er.co")
    public static int field2124 = 0;

    @ObfuscatedName("er.cq")
    public static int field2125 = 0;

    @ObfuscatedName("er.cc")
    public static int field2126 = 0;

    @ObfuscatedName("er.ck")
    public static int field2127 = 0;

    @ObfuscatedName("er.cf")
    public static volatile int field2128 = 0;

    @ObfuscatedName("er.cx")
    public static int[] field2106 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("dk.a(B)V")
    public static void method2392() {
        if (Statics.field2097.toLowerCase().indexOf("microsoft") != -1) {
            field2106[186] = 57;
            field2106[187] = 27;
            field2106[188] = 71;
            field2106[189] = 26;
            field2106[190] = 72;
            field2106[191] = 73;
            field2106[192] = 58;
            field2106[219] = 42;
            field2106[220] = 74;
            field2106[221] = 43;
            field2106[222] = 59;
            field2106[223] = 28;
            return;
        }
        field2106[44] = 71;
        field2106[45] = 26;
        field2106[46] = 72;
        field2106[47] = 73;
        field2106[59] = 57;
        field2106[61] = 27;
        field2106[91] = 42;
        field2106[92] = 74;
        field2106[93] = 43;
        field2106[192] = 28;
        field2106[222] = 58;
        field2106[520] = 59;
    }

    @ObfuscatedName("dk.w(S)Z")
    public static final boolean method2394() {
        class138 var0 = field2118;
        synchronized (field2118) {
            if (field2127 == field2125) {
                return false;
            } else {
                Statics.field278 = field2132[field2125];
                Statics.field2129 = field2121[field2125];
                field2125 = field2125 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("ft.d(I)I")
    public static int method3222() {
        return field2128;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2118 == null) {
            return;
        }
        field2128 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2106.length) {
            var3 = field2106[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2120 >= 0 && var3 >= 0) {
            field2122[field2120] = var3;
            field2120 = field2120 + 1 & 0x7F;
            if (field2131 == field2120) {
                field2120 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2126 + 1 & 0x7F;
            if (field2125 != var4) {
                field2132[field2126] = var3;
                field2121[field2126] = 0;
                field2126 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2118 != null) {
            field2128 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2106.length) {
                var3 = field2106[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2120 >= 0 && var3 >= 0) {
                field2122[field2120] = ~var3;
                field2120 = field2120 + 1 & 0x7F;
                if (field2131 == field2120) {
                    field2120 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2118 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class166.field2655;
                            for (int var5 = 0; var5 < var4.length; var5++) {
                                char var6 = var4[var5];
                                if (var2 == var6) {
                                    var3 = true;
                                    break label56;
                                }
                            }
                        }
                        var3 = false;
                    }
                }
                if (var3) {
                    int var7 = field2126 + 1 & 0x7F;
                    if (field2125 != var7) {
                        field2132[field2126] = -1;
                        field2121[field2126] = var2;
                        field2126 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2118 != null) {
            field2120 = -1;
        }
    }
}
