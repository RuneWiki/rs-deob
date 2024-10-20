package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("az")
public final class class45 implements KeyListener, FocusListener {

    @ObfuscatedName("az.a")
    public static class45 field399 = new class45();

    @ObfuscatedName("az.cb")
    public static boolean[] field391 = new boolean[112];

    @ObfuscatedName("az.cq")
    public static int[] field389 = new int[128];

    @ObfuscatedName("az.cf")
    public static int field401 = 0;

    @ObfuscatedName("az.cs")
    public static int field400 = 0;

    @ObfuscatedName("az.co")
    public static char[] field403 = new char[128];

    @ObfuscatedName("az.cr")
    public static int[] field404 = new int[128];

    @ObfuscatedName("az.ck")
    public static int[] field405 = new int[128];

    @ObfuscatedName("az.cn")
    public static int field411 = 0;

    @ObfuscatedName("az.cw")
    public static int field407 = 0;

    @ObfuscatedName("az.cv")
    public static int field383 = 0;

    @ObfuscatedName("az.cu")
    public static int field409 = 0;

    @ObfuscatedName("az.ci")
    public static volatile int field410 = 0;

    @ObfuscatedName("az.ce")
    public static int[] field406 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("bn.a(Ljava/awt/Component;I)V")
    public static void method1071(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field399);
        arg0.addFocusListener(field399);
    }

    @ObfuscatedName("k.s(Ljava/awt/Component;I)V")
    public static void method213(Component arg0) {
        arg0.removeKeyListener(field399);
        arg0.removeFocusListener(field399);
        field400 = -1;
    }

    @ObfuscatedName("jp.g(I)Z")
    public static final boolean method4722() {
        class45 var0 = field399;
        synchronized (field399) {
            if (field409 == field407) {
                return false;
            } else {
                Statics.field3716 = field404[field407];
                Statics.field280 = field403[field407];
                field407 = field407 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field399 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field406.length) {
            var3 = field406[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field400 >= 0 && var3 >= 0) {
            field389[field400] = var3;
            field400 = field400 + 1 & 0x7F;
            if (field401 == field400) {
                field400 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field383 + 1 & 0x7F;
            if (field407 != var4) {
                field404[field383] = var3;
                field403[field383] = 0;
                field383 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field399 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field406.length) {
                var3 = field406[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field400 >= 0 && var3 >= 0) {
                field389[field400] = ~var3;
                field400 = field400 + 1 & 0x7F;
                if (field401 == field400) {
                    field400 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field399 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class308.method288(var2)) {
                int var3 = field383 + 1 & 0x7F;
                if (field407 != var3) {
                    field404[field383] = -1;
                    field403[field383] = var2;
                    field383 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field399 != null) {
            field400 = -1;
        }
    }
}
