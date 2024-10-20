package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ao")
public final class class40 implements KeyListener, FocusListener {

    @ObfuscatedName("ao.f")
    public static class40 field390 = new class40();

    @ObfuscatedName("ao.cz")
    public static boolean[] field373 = new boolean[112];

    @ObfuscatedName("ao.cq")
    public static int[] field386 = new int[128];

    @ObfuscatedName("ao.cw")
    public static int field375 = 0;

    @ObfuscatedName("ao.ck")
    public static int field363 = 0;

    @ObfuscatedName("ao.cb")
    public static char[] field377 = new char[128];

    @ObfuscatedName("ao.cs")
    public static int[] field378 = new int[128];

    @ObfuscatedName("ao.ce")
    public static int[] field379 = new int[128];

    @ObfuscatedName("ao.cr")
    public static int field380 = 0;

    @ObfuscatedName("ao.cd")
    public static int field388 = 0;

    @ObfuscatedName("ao.ch")
    public static int field382 = 0;

    @ObfuscatedName("ao.cl")
    public static int field370 = 0;

    @ObfuscatedName("ao.cn")
    public static volatile int field384 = 0;

    @ObfuscatedName("ao.ct")
    public static int[] field385 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("x.f(I)V")
    public static void method117() {
        if (Statics.field4012.toLowerCase().indexOf("microsoft") != -1) {
            field385[186] = 57;
            field385[187] = 27;
            field385[188] = 71;
            field385[189] = 26;
            field385[190] = 72;
            field385[191] = 73;
            field385[192] = 58;
            field385[219] = 42;
            field385[220] = 74;
            field385[221] = 43;
            field385[222] = 59;
            field385[223] = 28;
            return;
        }
        field385[44] = 71;
        field385[45] = 26;
        field385[46] = 72;
        field385[47] = 73;
        field385[59] = 57;
        field385[61] = 27;
        field385[91] = 42;
        field385[92] = 74;
        field385[93] = 43;
        field385[192] = 28;
        field385[222] = 58;
        field385[520] = 59;
    }

    @ObfuscatedName("em.l(Ljava/awt/Component;I)V")
    public static void method3022(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field390);
        arg0.addFocusListener(field390);
    }

    @ObfuscatedName("fw.w(B)Z")
    public static final boolean method3233() {
        class40 var0 = field390;
        synchronized (field390) {
            if (field388 == field370) {
                return false;
            } else {
                Statics.field241 = field378[field388];
                Statics.field3345 = field377[field388];
                field388 = field388 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("hc.s(I)I")
    public static int method4036() {
        return field384;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field390 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field385.length) {
            var3 = field385[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field363 >= 0 && var3 >= 0) {
            field386[field363] = var3;
            field363 = field363 + 1 & 0x7F;
            if (field375 == field363) {
                field363 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field382 + 1 & 0x7F;
            if (field388 != var4) {
                field378[field382] = var3;
                field377[field382] = 0;
                field382 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field390 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field385.length) {
                var3 = field385[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field363 >= 0 && var3 >= 0) {
                field386[field363] = ~var3;
                field363 = field363 + 1 & 0x7F;
                if (field375 == field363) {
                    field363 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field390 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class304.method2956(var2)) {
                int var3 = field382 + 1 & 0x7F;
                if (field388 != var3) {
                    field378[field382] = -1;
                    field377[field382] = var2;
                    field382 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field390 != null) {
            field363 = -1;
        }
    }
}
