package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("bg")
public final class class75 implements KeyListener, FocusListener {

    @ObfuscatedName("bg.j")
    public static class75 field1384 = new class75();

    @ObfuscatedName("bg.ca")
    public static boolean[] field1372 = new boolean[112];

    @ObfuscatedName("bg.cg")
    public static int[] field1375 = new int[128];

    @ObfuscatedName("bg.ct")
    public static int field1388 = 0;

    @ObfuscatedName("bg.cw")
    public static int field1374 = 0;

    @ObfuscatedName("bg.ck")
    public static char[] field1376 = new char[128];

    @ObfuscatedName("bg.cx")
    public static int[] field1357 = new int[128];

    @ObfuscatedName("bg.cv")
    public static int[] field1378 = new int[128];

    @ObfuscatedName("bg.cp")
    public static int field1379 = 0;

    @ObfuscatedName("bg.cs")
    public static int field1380 = 0;

    @ObfuscatedName("bg.cy")
    public static int field1381 = 0;

    @ObfuscatedName("bg.cn")
    public static int field1382 = 0;

    @ObfuscatedName("bg.cb")
    public static volatile int field1363 = 0;

    @ObfuscatedName("bg.ch")
    public static int[] field1377 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("m.j(B)V")
    public static void method135() {
        if (Statics.field1347.toLowerCase().indexOf("microsoft") != -1) {
            field1377[186] = 57;
            field1377[187] = 27;
            field1377[188] = 71;
            field1377[189] = 26;
            field1377[190] = 72;
            field1377[191] = 73;
            field1377[192] = 58;
            field1377[219] = 42;
            field1377[220] = 74;
            field1377[221] = 43;
            field1377[222] = 59;
            field1377[223] = 28;
            return;
        }
        field1377[44] = 71;
        field1377[45] = 26;
        field1377[46] = 72;
        field1377[47] = 73;
        field1377[59] = 57;
        field1377[61] = 27;
        field1377[91] = 42;
        field1377[92] = 74;
        field1377[93] = 43;
        field1377[192] = 28;
        field1377[222] = 58;
        field1377[520] = 59;
    }

    @ObfuscatedName("as.f(Ljava/awt/Component;B)V")
    public static void method827(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1384);
        arg0.addFocusListener(field1384);
    }

    @ObfuscatedName("da.o(Ljava/awt/Component;I)V")
    public static void method2446(Component arg0) {
        arg0.removeKeyListener(field1384);
        arg0.removeFocusListener(field1384);
        field1374 = -1;
    }

    @ObfuscatedName("bu.h(I)I")
    public static int method1322() {
        return field1363;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1384 == null) {
            return;
        }
        field1363 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1377.length) {
            var3 = field1377[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1374 >= 0 && var3 >= 0) {
            field1375[field1374] = var3;
            field1374 = field1374 + 1 & 0x7F;
            if (field1388 == field1374) {
                field1374 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1381 + 1 & 0x7F;
            if (field1380 != var4) {
                field1357[field1381] = var3;
                field1376[field1381] = 0;
                field1381 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1384 != null) {
            field1363 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1377.length) {
                var3 = field1377[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1374 >= 0 && var3 >= 0) {
                field1375[field1374] = ~var3;
                field1374 = field1374 + 1 & 0x7F;
                if (field1388 == field1374) {
                    field1374 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1384 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class150.field2468;
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
                    int var7 = field1381 + 1 & 0x7F;
                    if (field1380 != var7) {
                        field1357[field1381] = -1;
                        field1376[field1381] = var2;
                        field1381 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1384 != null) {
            field1374 = -1;
        }
    }
}
