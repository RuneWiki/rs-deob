package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ei")
public final class class137 implements KeyListener, FocusListener {

    @ObfuscatedName("ei.j")
    public static class137 field2101 = new class137();

    @ObfuscatedName("ei.cx")
    public static boolean[] field2115 = new boolean[112];

    @ObfuscatedName("ei.cg")
    public static int[] field2106 = new int[128];

    @ObfuscatedName("ei.cr")
    public static int field2104 = 0;

    @ObfuscatedName("ei.cj")
    public static int field2105 = 0;

    @ObfuscatedName("ei.cd")
    public static char[] field2114 = new char[128];

    @ObfuscatedName("ei.cl")
    public static int[] field2092 = new int[128];

    @ObfuscatedName("ei.ce")
    public static int[] field2108 = new int[128];

    @ObfuscatedName("ei.ct")
    public static int field2109 = 0;

    @ObfuscatedName("ei.cc")
    public static int field2110 = 0;

    @ObfuscatedName("ei.ck")
    public static int field2111 = 0;

    @ObfuscatedName("ei.cn")
    public static int field2112 = 0;

    @ObfuscatedName("ei.cy")
    public static volatile int field2095 = 0;

    @ObfuscatedName("ei.cu")
    public static int[] field2099 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("el.j(I)V")
    public static void method2975() {
        if (Statics.field2090.toLowerCase().indexOf("microsoft") != -1) {
            field2099[186] = 57;
            field2099[187] = 27;
            field2099[188] = 71;
            field2099[189] = 26;
            field2099[190] = 72;
            field2099[191] = 73;
            field2099[192] = 58;
            field2099[219] = 42;
            field2099[220] = 74;
            field2099[221] = 43;
            field2099[222] = 59;
            field2099[223] = 28;
            return;
        }
        field2099[44] = 71;
        field2099[45] = 26;
        field2099[46] = 72;
        field2099[47] = 73;
        field2099[59] = 57;
        field2099[61] = 27;
        field2099[91] = 42;
        field2099[92] = 74;
        field2099[93] = 43;
        field2099[192] = 28;
        field2099[222] = 58;
        field2099[520] = 59;
    }

    @ObfuscatedName("cl.m(B)V")
    public static void method2042() {
        if (field2101 != null) {
            class137 var0 = field2101;
            synchronized (field2101) {
                field2101 = null;
            }
        }
    }

    @ObfuscatedName("fq.f(I)V")
    public static void method2994() {
        class137 var0 = field2101;
        synchronized (field2101) {
            field2095++;
            field2110 = field2112;
            field2109 = 0;
            if (field2105 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field2115[var1] = false;
                }
                field2105 = field2104;
            } else {
                while (field2105 != field2104) {
                    int var2 = field2106[field2104];
                    field2104 = field2104 + 1 & 0x7F;
                    if (var2 < 0) {
                        field2115[~var2] = false;
                    } else {
                        if (!field2115[var2] && field2109 < field2108.length - 1) {
                            field2108[++field2109 - 1] = var2;
                        }
                        field2115[var2] = true;
                    }
                }
            }
            field2112 = field2111;
        }
    }

    @ObfuscatedName("w.l(B)Z")
    public static final boolean method176() {
        class137 var0 = field2101;
        synchronized (field2101) {
            if (field2112 == field2110) {
                return false;
            } else {
                Statics.field2096 = field2092[field2110];
                Statics.field209 = field2114[field2110];
                field2110 = field2110 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2101 == null) {
            return;
        }
        field2095 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2099.length) {
            var3 = field2099[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2105 >= 0 && var3 >= 0) {
            field2106[field2105] = var3;
            field2105 = field2105 + 1 & 0x7F;
            if (field2105 == field2104) {
                field2105 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2111 + 1 & 0x7F;
            if (field2110 != var4) {
                field2092[field2111] = var3;
                field2114[field2111] = 0;
                field2111 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2101 != null) {
            field2095 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2099.length) {
                var3 = field2099[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2105 >= 0 && var3 >= 0) {
                field2106[field2105] = ~var3;
                field2105 = field2105 + 1 & 0x7F;
                if (field2105 == field2104) {
                    field2105 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2101 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class165.method660(var2)) {
                int var3 = field2111 + 1 & 0x7F;
                if (field2110 != var3) {
                    field2092[field2111] = -1;
                    field2114[field2111] = var2;
                    field2111 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2101 != null) {
            field2105 = -1;
        }
    }
}
