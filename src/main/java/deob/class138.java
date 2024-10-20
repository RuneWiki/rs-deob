package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ek")
public final class class138 implements KeyListener, FocusListener {

    @ObfuscatedName("ek.f")
    public static class138 field2119 = new class138();

    @ObfuscatedName("ek.co")
    public static boolean[] field2115 = new boolean[112];

    @ObfuscatedName("ek.ck")
    public static int[] field2123 = new int[128];

    @ObfuscatedName("ek.cv")
    public static int field2126 = 0;

    @ObfuscatedName("ek.cc")
    public static int field2114 = 0;

    @ObfuscatedName("ek.cf")
    public static char[] field2120 = new char[128];

    @ObfuscatedName("ek.cb")
    public static int[] field2121 = new int[128];

    @ObfuscatedName("ek.cs")
    public static int[] field2118 = new int[128];

    @ObfuscatedName("ek.cp")
    public static int field2124 = 0;

    @ObfuscatedName("ek.cd")
    public static int field2117 = 0;

    @ObfuscatedName("ek.cq")
    public static int field2125 = 0;

    @ObfuscatedName("ek.cy")
    public static int field2128 = 0;

    @ObfuscatedName("ek.cn")
    public static volatile int field2127 = 0;

    @ObfuscatedName("ek.ct")
    public static int[] field2104 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("i.f(Ljava/awt/Component;I)V")
    public static void method614(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field2119);
        arg0.addFocusListener(field2119);
    }

    @ObfuscatedName("at.u(Ljava/awt/Component;B)V")
    public static void method1036(Component arg0) {
        arg0.removeKeyListener(field2119);
        arg0.removeFocusListener(field2119);
        field2114 = -1;
    }

    @ObfuscatedName("ah.x(B)V")
    public static void method810() {
        if (field2119 != null) {
            class138 var0 = field2119;
            synchronized (field2119) {
                field2119 = null;
            }
        }
    }

    @ObfuscatedName("cx.b(B)Z")
    public static final boolean method1821() {
        class138 var0 = field2119;
        synchronized (field2119) {
            if (field2128 == field2117) {
                return false;
            } else {
                Statics.field1757 = field2121[field2117];
                Statics.field199 = field2120[field2117];
                field2117 = field2117 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2119 == null) {
            return;
        }
        field2127 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2104.length) {
            var3 = field2104[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2114 >= 0 && var3 >= 0) {
            field2123[field2114] = var3;
            field2114 = field2114 + 1 & 0x7F;
            if (field2126 == field2114) {
                field2114 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2125 + 1 & 0x7F;
            if (field2117 != var4) {
                field2121[field2125] = var3;
                field2120[field2125] = 0;
                field2125 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2119 != null) {
            field2127 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2104.length) {
                var3 = field2104[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2114 >= 0 && var3 >= 0) {
                field2123[field2114] = ~var3;
                field2114 = field2114 + 1 & 0x7F;
                if (field2126 == field2114) {
                    field2114 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2119 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class166.method2313(var2)) {
                int var3 = field2125 + 1 & 0x7F;
                if (field2117 != var3) {
                    field2121[field2125] = -1;
                    field2120[field2125] = var2;
                    field2125 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2119 != null) {
            field2114 = -1;
        }
    }
}
