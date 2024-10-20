package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ay")
public final class class51 implements KeyListener, FocusListener {

    @ObfuscatedName("ay.d")
    public static class51 field664 = new class51();

    @ObfuscatedName("ay.cq")
    public static boolean[] field656 = new boolean[112];

    @ObfuscatedName("ay.cl")
    public static int[] field657 = new int[128];

    @ObfuscatedName("ay.ct")
    public static int field658 = 0;

    @ObfuscatedName("ay.cp")
    public static int field655 = 0;

    @ObfuscatedName("ay.ch")
    public static char[] field660 = new char[128];

    @ObfuscatedName("ay.ca")
    public static int[] field644 = new int[128];

    @ObfuscatedName("ay.ci")
    public static int[] field659 = new int[128];

    @ObfuscatedName("ay.cj")
    public static int field663 = 0;

    @ObfuscatedName("ay.cm")
    public static int field667 = 0;

    @ObfuscatedName("ay.cv")
    public static int field665 = 0;

    @ObfuscatedName("ay.cc")
    public static int field666 = 0;

    @ObfuscatedName("ay.cw")
    public static volatile int field662 = 0;

    @ObfuscatedName("ay.cr")
    public static int[] field668 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("if.d(Ljava/awt/Component;I)V")
    public static void method4160(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field664);
        arg0.addFocusListener(field664);
    }

    @ObfuscatedName("cy.k(Ljava/awt/Component;I)V")
    public static void method1590(Component arg0) {
        arg0.removeKeyListener(field664);
        arg0.removeFocusListener(field664);
        field655 = -1;
    }

    @ObfuscatedName("k.e(B)Z")
    public static final boolean method1() {
        class51 var0 = field664;
        synchronized (field664) {
            if (field667 == field666) {
                return false;
            } else {
                Statics.field1492 = field644[field667];
                Statics.field1547 = field660[field667];
                field667 = field667 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("ag.p(B)I")
    public static int method235() {
        return field662;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field664 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field668.length) {
            var3 = field668[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field655 >= 0 && var3 >= 0) {
            field657[field655] = var3;
            field655 = field655 + 1 & 0x7F;
            if (field658 == field655) {
                field655 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field665 + 1 & 0x7F;
            if (field667 != var4) {
                field644[field665] = var3;
                field660[field665] = 0;
                field665 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field664 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field668.length) {
                var3 = field668[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field655 >= 0 && var3 >= 0) {
                field657[field655] = ~var3;
                field655 = field655 + 1 & 0x7F;
                if (field658 == field655) {
                    field655 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field664 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class267.method4127(var2)) {
                int var3 = field665 + 1 & 0x7F;
                if (field667 != var3) {
                    field644[field665] = -1;
                    field660[field665] = var2;
                    field665 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field664 != null) {
            field655 = -1;
        }
    }
}
