package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("bz")
public final class class55 implements KeyListener, FocusListener {

    @ObfuscatedName("bz.z")
    public static class55 field402 = new class55();

    @ObfuscatedName("bz.cu")
    public static boolean[] field416 = new boolean[112];

    @ObfuscatedName("bz.cc")
    public static int[] field410 = new int[128];

    @ObfuscatedName("bz.cf")
    public static int field418 = 0;

    @ObfuscatedName("bz.cj")
    public static int field419 = 0;

    @ObfuscatedName("bz.cd")
    public static char[] field420 = new char[128];

    @ObfuscatedName("bz.cx")
    public static int[] field421 = new int[128];

    @ObfuscatedName("bz.cp")
    public static int[] field422 = new int[128];

    @ObfuscatedName("bz.ch")
    public static int field423 = 0;

    @ObfuscatedName("bz.cs")
    public static int field424 = 0;

    @ObfuscatedName("bz.ck")
    public static int field425 = 0;

    @ObfuscatedName("bz.co")
    public static int field400 = 0;

    @ObfuscatedName("bz.cz")
    public static volatile int field427 = 0;

    @ObfuscatedName("bz.cy")
    public static int[] field415 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("g.z(I)V")
    public static void method73() {
        if (Statics.field2071.toLowerCase().indexOf("microsoft") != -1) {
            field415[186] = 57;
            field415[187] = 27;
            field415[188] = 71;
            field415[189] = 26;
            field415[190] = 72;
            field415[191] = 73;
            field415[192] = 58;
            field415[219] = 42;
            field415[220] = 74;
            field415[221] = 43;
            field415[222] = 59;
            field415[223] = 28;
            return;
        }
        field415[44] = 71;
        field415[45] = 26;
        field415[46] = 72;
        field415[47] = 73;
        field415[59] = 57;
        field415[61] = 27;
        field415[91] = 42;
        field415[92] = 74;
        field415[93] = 43;
        field415[192] = 28;
        field415[222] = 58;
        field415[520] = 59;
    }

    @ObfuscatedName("gx.k(Ljava/awt/Component;I)V")
    public static void method3392(Component arg0) {
        arg0.removeKeyListener(field402);
        arg0.removeFocusListener(field402);
        field419 = -1;
    }

    @ObfuscatedName("gz.s(B)V")
    public static void method3420() {
        if (field402 != null) {
            class55 var0 = field402;
            synchronized (field402) {
                field402 = null;
            }
        }
    }

    @ObfuscatedName("bp.t(B)Z")
    public static final boolean method801() {
        class55 var0 = field402;
        synchronized (field402) {
            if (field424 == field400) {
                return false;
            } else {
                Statics.field2582 = field421[field424];
                Statics.field1351 = field420[field424];
                field424 = field424 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("ax.i(I)I")
    public static int method548() {
        return field427;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field402 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field415.length) {
            var3 = field415[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field419 >= 0 && var3 >= 0) {
            field410[field419] = var3;
            field419 = field419 + 1 & 0x7F;
            if (field419 == field418) {
                field419 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field425 + 1 & 0x7F;
            if (field424 != var4) {
                field421[field425] = var3;
                field420[field425] = 0;
                field425 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field402 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field415.length) {
                var3 = field415[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field419 >= 0 && var3 >= 0) {
                field410[field419] = ~var3;
                field419 = field419 + 1 & 0x7F;
                if (field419 == field418) {
                    field419 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field402 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class298.method4756(var2)) {
                int var3 = field425 + 1 & 0x7F;
                if (field424 != var3) {
                    field421[field425] = -1;
                    field420[field425] = var2;
                    field425 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field402 != null) {
            field419 = -1;
        }
    }
}
