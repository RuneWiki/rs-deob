package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("bo")
public final class class55 implements KeyListener, FocusListener {

    @ObfuscatedName("bo.x")
    public static class55 field414 = new class55();

    @ObfuscatedName("bo.cg")
    public static boolean[] field427 = new boolean[112];

    @ObfuscatedName("bo.cn")
    public static int[] field428 = new int[128];

    @ObfuscatedName("bo.ci")
    public static int field440 = 0;

    @ObfuscatedName("bo.cz")
    public static int field430 = 0;

    @ObfuscatedName("bo.cb")
    public static char[] field425 = new char[128];

    @ObfuscatedName("bo.cy")
    public static int[] field415 = new int[128];

    @ObfuscatedName("bo.ct")
    public static int[] field433 = new int[128];

    @ObfuscatedName("bo.cf")
    public static int field418 = 0;

    @ObfuscatedName("bo.ca")
    public static int field435 = 0;

    @ObfuscatedName("bo.cj")
    public static int field434 = 0;

    @ObfuscatedName("bo.cp")
    public static int field437 = 0;

    @ObfuscatedName("bo.ck")
    public static volatile int field438 = 0;

    @ObfuscatedName("bo.ce")
    public static int[] field439 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("gl.x(B)V")
    public static void method3421() {
        if (Statics.field2040.toLowerCase().indexOf("microsoft") != -1) {
            field439[186] = 57;
            field439[187] = 27;
            field439[188] = 71;
            field439[189] = 26;
            field439[190] = 72;
            field439[191] = 73;
            field439[192] = 58;
            field439[219] = 42;
            field439[220] = 74;
            field439[221] = 43;
            field439[222] = 59;
            field439[223] = 28;
            return;
        }
        field439[44] = 71;
        field439[45] = 26;
        field439[46] = 72;
        field439[47] = 73;
        field439[59] = 57;
        field439[61] = 27;
        field439[91] = 42;
        field439[92] = 74;
        field439[93] = 43;
        field439[192] = 28;
        field439[222] = 58;
        field439[520] = 59;
    }

    @ObfuscatedName("c.m(I)Z")
    public static final boolean method225() {
        class55 var0 = field414;
        synchronized (field414) {
            if (field437 == field435) {
                return false;
            } else {
                Statics.field17 = field415[field435];
                Statics.field2532 = field425[field435];
                field435 = field435 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field414 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field439.length) {
            var3 = field439[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field430 >= 0 && var3 >= 0) {
            field428[field430] = var3;
            field430 = field430 + 1 & 0x7F;
            if (field440 == field430) {
                field430 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field434 + 1 & 0x7F;
            if (field435 != var4) {
                field415[field434] = var3;
                field425[field434] = 0;
                field434 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field414 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field439.length) {
                var3 = field439[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field430 >= 0 && var3 >= 0) {
                field428[field430] = ~var3;
                field430 = field430 + 1 & 0x7F;
                if (field440 == field430) {
                    field430 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field414 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class298.field3642;
                            for (int var5 = 0; var5 < var4.length; var5++) {
                                char var6 = var4[var5];
                                if (var2 == var6) {
                                    var3 = true;
                                    break label56;
                                }
                            }
                        }
                        var3 = false;
                    }
                }
                if (var3) {
                    int var7 = field434 + 1 & 0x7F;
                    if (field435 != var7) {
                        field415[field434] = -1;
                        field425[field434] = var2;
                        field434 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field414 != null) {
            field430 = -1;
        }
    }
}
