package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("az")
public final class class36 implements KeyListener, FocusListener {

    @ObfuscatedName("az.q")
    public static class36 field458 = new class36();

    @ObfuscatedName("az.cv")
    public static boolean[] field478 = new boolean[112];

    @ObfuscatedName("az.cy")
    public static int[] field479 = new int[128];

    @ObfuscatedName("az.cd")
    public static int field480 = 0;

    @ObfuscatedName("az.cp")
    public static int field406 = 0;

    @ObfuscatedName("az.ce")
    public static char[] field407 = new char[128];

    @ObfuscatedName("az.ct")
    public static int[] field483 = new int[128];

    @ObfuscatedName("az.cx")
    public static int field486 = 0;

    @ObfuscatedName("az.cn")
    public static int field424 = 0;

    @ObfuscatedName("az.cj")
    public static int field459 = 0;

    @ObfuscatedName("az.co")
    public static volatile int field487 = 0;

    @ObfuscatedName("az.ck")
    public static int[] field445 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("aa.q(B)V")
    public static void method345() {
        if (Statics.field387.toLowerCase().indexOf("microsoft") != -1) {
            field445[186] = 57;
            field445[187] = 27;
            field445[188] = 71;
            field445[189] = 26;
            field445[190] = 72;
            field445[191] = 73;
            field445[192] = 58;
            field445[219] = 42;
            field445[220] = 74;
            field445[221] = 43;
            field445[222] = 59;
            field445[223] = 28;
            return;
        }
        field445[44] = 71;
        field445[45] = 26;
        field445[46] = 72;
        field445[47] = 73;
        field445[59] = 57;
        field445[61] = 27;
        field445[91] = 42;
        field445[92] = 74;
        field445[93] = 43;
        field445[192] = 28;
        field445[222] = 58;
        field445[520] = 59;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field458 == null) {
            return;
        }
        field487 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field445.length) {
            var3 = field445[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field406 >= 0 && var3 >= 0) {
            field479[field406] = var3;
            field406 = field406 + 1 & 0x7F;
            if (field480 == field406) {
                field406 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field424 + 1 & 0x7F;
            if (field486 != var4) {
                field483[field424] = var3;
                field407[field424] = 0;
                field424 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field458 != null) {
            field487 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field445.length) {
                var3 = field445[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field406 >= 0 && var3 >= 0) {
                field479[field406] = ~var3;
                field406 = field406 + 1 & 0x7F;
                if (field480 == field406) {
                    field406 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field458 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class85.field1167;
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
                    int var7 = field424 + 1 & 0x7F;
                    if (field486 != var7) {
                        field483[field424] = -1;
                        field407[field424] = var2;
                        field424 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field458 != null) {
            field406 = -1;
        }
    }
}
