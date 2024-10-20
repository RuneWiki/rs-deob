package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ac")
public final class class35 implements KeyListener, FocusListener {

    @ObfuscatedName("ac.t")
    public static class35 field455 = new class35();

    @ObfuscatedName("ac.ck")
    public static boolean[] field464 = new boolean[112];

    @ObfuscatedName("ac.cx")
    public static int[] field469 = new int[128];

    @ObfuscatedName("ac.cs")
    public static int field470 = 0;

    @ObfuscatedName("ac.cc")
    public static int field471 = 0;

    @ObfuscatedName("ac.ca")
    public static char[] field419 = new char[128];

    @ObfuscatedName("ac.cf")
    public static int[] field473 = new int[128];

    @ObfuscatedName("ac.ch")
    public static int field474 = 0;

    @ObfuscatedName("ac.cg")
    public static int field475 = 0;

    @ObfuscatedName("ac.co")
    public static int field476 = 0;

    @ObfuscatedName("ac.ci")
    public static volatile int field477 = 0;

    @ObfuscatedName("ac.ce")
    public static int[] field478 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("by.t(I)V")
    public static void method877() {
        if (Statics.field2494.toLowerCase().indexOf("microsoft") != -1) {
            field478[186] = 57;
            field478[187] = 27;
            field478[188] = 71;
            field478[189] = 26;
            field478[190] = 72;
            field478[191] = 73;
            field478[192] = 58;
            field478[219] = 42;
            field478[220] = 74;
            field478[221] = 43;
            field478[222] = 59;
            field478[223] = 28;
            return;
        }
        field478[44] = 71;
        field478[45] = 26;
        field478[46] = 72;
        field478[47] = 73;
        field478[59] = 57;
        field478[61] = 27;
        field478[91] = 42;
        field478[92] = 74;
        field478[93] = 43;
        field478[192] = 28;
        field478[222] = 58;
        field478[520] = 59;
    }

    @ObfuscatedName("br.q(Ljava/awt/Component;I)V")
    public static void method852(Component arg0) {
        arg0.removeKeyListener(field455);
        arg0.removeFocusListener(field455);
        field471 = -1;
    }

    @ObfuscatedName("bs.h(I)V")
    public static void method741() {
        if (field455 != null) {
            class35 var0 = field455;
            synchronized (field455) {
                field455 = null;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field455 == null) {
            return;
        }
        field477 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field478.length) {
            var3 = field478[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field471 >= 0 && var3 >= 0) {
            field469[field471] = var3;
            field471 = field471 + 1 & 0x7F;
            if (field471 == field470) {
                field471 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field475 + 1 & 0x7F;
            if (field474 != var4) {
                field473[field475] = var3;
                field419[field475] = 0;
                field475 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field455 != null) {
            field477 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field478.length) {
                var3 = field478[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field471 >= 0 && var3 >= 0) {
                field469[field471] = ~var3;
                field471 = field471 + 1 & 0x7F;
                if (field471 == field470) {
                    field471 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field455 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class84.method411(var2)) {
                int var3 = field475 + 1 & 0x7F;
                if (field474 != var3) {
                    field473[field475] = -1;
                    field419[field475] = var2;
                    field475 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field455 != null) {
            field471 = -1;
        }
    }
}
