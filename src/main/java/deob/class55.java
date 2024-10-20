package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("bi")
public final class class55 implements KeyListener, FocusListener {

    @ObfuscatedName("bi.n")
    public static class55 field409 = new class55();

    @ObfuscatedName("bi.cr")
    public static boolean[] field416 = new boolean[112];

    @ObfuscatedName("bi.cs")
    public static int[] field408 = new int[128];

    @ObfuscatedName("bi.ce")
    public static int field417 = 0;

    @ObfuscatedName("bi.cu")
    public static int field418 = 0;

    @ObfuscatedName("bi.ci")
    public static char[] field423 = new char[128];

    @ObfuscatedName("bi.cy")
    public static int[] field429 = new int[128];

    @ObfuscatedName("bi.cm")
    public static int[] field421 = new int[128];

    @ObfuscatedName("bi.cc")
    public static int field422 = 0;

    @ObfuscatedName("bi.co")
    public static int field419 = 0;

    @ObfuscatedName("bi.cx")
    public static int field424 = 0;

    @ObfuscatedName("bi.cg")
    public static int field425 = 0;

    @ObfuscatedName("bi.ch")
    public static volatile int field426 = 0;

    @ObfuscatedName("bi.cl")
    public static int[] field427 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("iv.n(Ljava/awt/Component;I)V")
    public static void method3970(Component arg0) {
        arg0.removeKeyListener(field409);
        arg0.removeFocusListener(field409);
        field418 = -1;
    }

    @ObfuscatedName("cg.v(B)Z")
    public static final boolean method2169() {
        class55 var0 = field409;
        synchronized (field409) {
            if (field425 == field419) {
                return false;
            } else {
                Statics.field2418 = field429[field419];
                Statics.field300 = field423[field419];
                field419 = field419 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field409 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field427.length) {
            var3 = field427[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field418 >= 0 && var3 >= 0) {
            field408[field418] = var3;
            field418 = field418 + 1 & 0x7F;
            if (field418 == field417) {
                field418 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field424 + 1 & 0x7F;
            if (field419 != var4) {
                field429[field424] = var3;
                field423[field424] = 0;
                field424 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field409 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field427.length) {
                var3 = field427[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field418 >= 0 && var3 >= 0) {
                field408[field418] = ~var3;
                field418 = field418 + 1 & 0x7F;
                if (field418 == field417) {
                    field418 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field409 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class299.method3176(var2)) {
                int var3 = field424 + 1 & 0x7F;
                if (field419 != var3) {
                    field429[field424] = -1;
                    field423[field424] = var2;
                    field424 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field409 != null) {
            field418 = -1;
        }
    }
}
