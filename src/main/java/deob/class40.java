package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("aw")
public final class class40 implements KeyListener, FocusListener {

    @ObfuscatedName("aw.v")
    public static class40 field376 = new class40();

    @ObfuscatedName("aw.ce")
    public static boolean[] field362 = new boolean[112];

    @ObfuscatedName("aw.cn")
    public static int[] field363 = new int[128];

    @ObfuscatedName("aw.cg")
    public static int field364 = 0;

    @ObfuscatedName("aw.cl")
    public static int field365 = 0;

    @ObfuscatedName("aw.cr")
    public static char[] field366 = new char[128];

    @ObfuscatedName("aw.co")
    public static int[] field373 = new int[128];

    @ObfuscatedName("aw.cy")
    public static int[] field367 = new int[128];

    @ObfuscatedName("aw.cq")
    public static int field369 = 0;

    @ObfuscatedName("aw.cm")
    public static int field370 = 0;

    @ObfuscatedName("aw.ct")
    public static int field355 = 0;

    @ObfuscatedName("aw.cv")
    public static int field350 = 0;

    @ObfuscatedName("aw.cj")
    public static volatile int field356 = 0;

    @ObfuscatedName("aw.cc")
    public static int[] field374 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("ew.v(Ljava/awt/Component;I)V")
    public static void method2948(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field376);
        arg0.addFocusListener(field376);
    }

    @ObfuscatedName("cc.s(B)Z")
    public static final boolean method2091() {
        class40 var0 = field376;
        synchronized (field376) {
            if (field370 == field350) {
                return false;
            } else {
                Statics.field334 = field373[field370];
                Statics.field1081 = field366[field370];
                field370 = field370 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field376 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field374.length) {
            var3 = field374[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field365 >= 0 && var3 >= 0) {
            field363[field365] = var3;
            field365 = field365 + 1 & 0x7F;
            if (field365 == field364) {
                field365 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field355 + 1 & 0x7F;
            if (field370 != var4) {
                field373[field355] = var3;
                field366[field355] = 0;
                field355 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field376 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field374.length) {
                var3 = field374[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field365 >= 0 && var3 >= 0) {
                field363[field365] = ~var3;
                field365 = field365 + 1 & 0x7F;
                if (field365 == field364) {
                    field365 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field376 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class304.method4168(var2)) {
                int var3 = field355 + 1 & 0x7F;
                if (field370 != var3) {
                    field373[field355] = -1;
                    field366[field355] = var2;
                    field355 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field376 != null) {
            field365 = -1;
        }
    }
}
