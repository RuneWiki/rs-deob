package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ev")
public final class class141 implements KeyListener, FocusListener {

    @ObfuscatedName("ev.i")
    public static class141 field2174 = new class141();

    @ObfuscatedName("ev.cl")
    public static boolean[] field2166 = new boolean[112];

    @ObfuscatedName("ev.cx")
    public static int[] field2161 = new int[128];

    @ObfuscatedName("ev.cr")
    public static int field2168 = 0;

    @ObfuscatedName("ev.cq")
    public static int field2169 = 0;

    @ObfuscatedName("ev.cn")
    public static char[] field2170 = new char[128];

    @ObfuscatedName("ev.cf")
    public static int[] field2171 = new int[128];

    @ObfuscatedName("ev.cv")
    public static int[] field2157 = new int[128];

    @ObfuscatedName("ev.cb")
    public static int field2173 = 0;

    @ObfuscatedName("ev.cg")
    public static int field2160 = 0;

    @ObfuscatedName("ev.cz")
    public static int field2175 = 0;

    @ObfuscatedName("ev.cd")
    public static int field2176 = 0;

    @ObfuscatedName("ev.ce")
    public static volatile int field2183 = 0;

    @ObfuscatedName("ev.ct")
    public static int[] field2177 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("cp.i(Ljava/awt/Component;B)V")
    public static void method1832(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field2174);
        arg0.addFocusListener(field2174);
    }

    @ObfuscatedName("ar.h(S)Z")
    public static final boolean method730() {
        class141 var0 = field2174;
        synchronized (field2174) {
            if (field2176 == field2160) {
                return false;
            } else {
                Statics.field598 = field2171[field2160];
                Statics.field2094 = field2170[field2160];
                field2160 = field2160 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2174 == null) {
            return;
        }
        field2183 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2177.length) {
            var3 = field2177[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2169 >= 0 && var3 >= 0) {
            field2161[field2169] = var3;
            field2169 = field2169 + 1 & 0x7F;
            if (field2169 == field2168) {
                field2169 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2175 + 1 & 0x7F;
            if (field2160 != var4) {
                field2171[field2175] = var3;
                field2170[field2175] = 0;
                field2175 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2174 != null) {
            field2183 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2177.length) {
                var3 = field2177[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2169 >= 0 && var3 >= 0) {
                field2161[field2169] = ~var3;
                field2169 = field2169 + 1 & 0x7F;
                if (field2169 == field2168) {
                    field2169 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2174 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class169.method2919(var2)) {
                int var3 = field2175 + 1 & 0x7F;
                if (field2160 != var3) {
                    field2171[field2175] = -1;
                    field2170[field2175] = var2;
                    field2175 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2174 != null) {
            field2169 = -1;
        }
    }
}
