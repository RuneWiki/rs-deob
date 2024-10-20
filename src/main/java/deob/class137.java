package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("eu")
public final class class137 implements KeyListener, FocusListener {

    @ObfuscatedName("eu.j")
    public static class137 field2114 = new class137();

    @ObfuscatedName("eu.cv")
    public static boolean[] field2122 = new boolean[112];

    @ObfuscatedName("eu.cd")
    public static int[] field2135 = new int[128];

    @ObfuscatedName("eu.cu")
    public static int field2124 = 0;

    @ObfuscatedName("eu.cl")
    public static int field2125 = 0;

    @ObfuscatedName("eu.ct")
    public static char[] field2126 = new char[128];

    @ObfuscatedName("eu.cj")
    public static int[] field2127 = new int[128];

    @ObfuscatedName("eu.cy")
    public static int[] field2128 = new int[128];

    @ObfuscatedName("eu.ci")
    public static int field2129 = 0;

    @ObfuscatedName("eu.ca")
    public static int field2130 = 0;

    @ObfuscatedName("eu.cz")
    public static int field2131 = 0;

    @ObfuscatedName("eu.cf")
    public static int field2132 = 0;

    @ObfuscatedName("eu.cb")
    public static volatile int field2133 = 0;

    @ObfuscatedName("eu.ck")
    public static int[] field2134 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("b.j(B)V")
    public static void method146() {
        if (Statics.field2092.toLowerCase().indexOf("microsoft") != -1) {
            field2134[186] = 57;
            field2134[187] = 27;
            field2134[188] = 71;
            field2134[189] = 26;
            field2134[190] = 72;
            field2134[191] = 73;
            field2134[192] = 58;
            field2134[219] = 42;
            field2134[220] = 74;
            field2134[221] = 43;
            field2134[222] = 59;
            field2134[223] = 28;
            return;
        }
        field2134[44] = 71;
        field2134[45] = 26;
        field2134[46] = 72;
        field2134[47] = 73;
        field2134[59] = 57;
        field2134[61] = 27;
        field2134[91] = 42;
        field2134[92] = 74;
        field2134[93] = 43;
        field2134[192] = 28;
        field2134[222] = 58;
        field2134[520] = 59;
    }

    @ObfuscatedName("aj.l(Ljava/awt/Component;B)V")
    public static void method1009(Component arg0) {
        arg0.removeKeyListener(field2114);
        arg0.removeFocusListener(field2114);
        field2125 = -1;
    }

    @ObfuscatedName("az.a(I)V")
    public static void method657() {
        class137 var0 = field2114;
        synchronized (field2114) {
            field2133++;
            field2130 = field2132;
            field2129 = 0;
            if (field2125 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field2122[var1] = false;
                }
                field2125 = field2124;
            } else {
                while (field2125 != field2124) {
                    int var2 = field2135[field2124];
                    field2124 = field2124 + 1 & 0x7F;
                    if (var2 < 0) {
                        field2122[~var2] = false;
                    } else {
                        if (!field2122[var2] && field2129 < field2128.length - 1) {
                            field2128[++field2129 - 1] = var2;
                        }
                        field2122[var2] = true;
                    }
                }
            }
            field2132 = field2131;
        }
    }

    @ObfuscatedName("gy.i(I)Z")
    public static final boolean method3458() {
        class137 var0 = field2114;
        synchronized (field2114) {
            if (field2132 == field2130) {
                return false;
            } else {
                Statics.field71 = field2127[field2130];
                Statics.field255 = field2126[field2130];
                field2130 = field2130 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2114 == null) {
            return;
        }
        field2133 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2134.length) {
            var3 = field2134[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2125 >= 0 && var3 >= 0) {
            field2135[field2125] = var3;
            field2125 = field2125 + 1 & 0x7F;
            if (field2125 == field2124) {
                field2125 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2131 + 1 & 0x7F;
            if (field2130 != var4) {
                field2127[field2131] = var3;
                field2126[field2131] = 0;
                field2131 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2114 != null) {
            field2133 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2134.length) {
                var3 = field2134[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2125 >= 0 && var3 >= 0) {
                field2135[field2125] = ~var3;
                field2125 = field2125 + 1 & 0x7F;
                if (field2125 == field2124) {
                    field2125 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2114 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class165.method993(var2)) {
                int var3 = field2131 + 1 & 0x7F;
                if (field2130 != var3) {
                    field2127[field2131] = -1;
                    field2126[field2131] = var2;
                    field2131 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2114 != null) {
            field2125 = -1;
        }
    }
}
