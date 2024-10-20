package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("az")
public final class class39 implements KeyListener, FocusListener {

    @ObfuscatedName("az.v")
    public static class39 field292 = new class39();

    @ObfuscatedName("az.cn")
    public static boolean[] field286 = new boolean[112];

    @ObfuscatedName("az.co")
    public static int[] field288 = new int[128];

    @ObfuscatedName("az.ck")
    public static int field297 = 0;

    @ObfuscatedName("az.cj")
    public static int field289 = 0;

    @ObfuscatedName("az.cc")
    public static char[] field287 = new char[128];

    @ObfuscatedName("az.cu")
    public static int[] field290 = new int[128];

    @ObfuscatedName("az.cz")
    public static int[] field275 = new int[128];

    @ObfuscatedName("az.cb")
    public static int field293 = 0;

    @ObfuscatedName("az.ce")
    public static int field294 = 0;

    @ObfuscatedName("az.ch")
    public static int field295 = 0;

    @ObfuscatedName("az.cy")
    public static int field296 = 0;

    @ObfuscatedName("az.cx")
    public static volatile int field291 = 0;

    @ObfuscatedName("az.ca")
    public static int[] field298 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("ca.n(Ljava/awt/Component;I)V")
    public static void method2035(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field292);
        arg0.addFocusListener(field292);
    }

    @ObfuscatedName("bq.f(Ljava/awt/Component;B)V")
    public static void method681(Component arg0) {
        arg0.removeKeyListener(field292);
        arg0.removeFocusListener(field292);
        field289 = -1;
    }

    @ObfuscatedName("fp.p(B)I")
    public static int method2961() {
        return field291;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field292 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field298.length) {
            var3 = field298[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field289 >= 0 && var3 >= 0) {
            field288[field289] = var3;
            field289 = field289 + 1 & 0x7F;
            if (field297 == field289) {
                field289 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field295 + 1 & 0x7F;
            if (field294 != var4) {
                field290[field295] = var3;
                field287[field295] = 0;
                field295 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field292 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field298.length) {
                var3 = field298[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field289 >= 0 && var3 >= 0) {
                field288[field289] = ~var3;
                field289 = field289 + 1 & 0x7F;
                if (field297 == field289) {
                    field289 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field292 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class302.method5141(var2)) {
                int var3 = field295 + 1 & 0x7F;
                if (field294 != var3) {
                    field290[field295] = -1;
                    field287[field295] = var2;
                    field295 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field292 != null) {
            field289 = -1;
        }
    }
}
