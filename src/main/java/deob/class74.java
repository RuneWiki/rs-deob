package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("bn")
public final class class74 implements KeyListener, FocusListener {

    @ObfuscatedName("bn.c")
    public static class74 field1335 = new class74();

    @ObfuscatedName("bn.cb")
    public static boolean[] field1326 = new boolean[112];

    @ObfuscatedName("bn.ct")
    public static int[] field1341 = new int[128];

    @ObfuscatedName("bn.ce")
    public static int field1342 = 0;

    @ObfuscatedName("bn.cm")
    public static int field1344 = 0;

    @ObfuscatedName("bn.ca")
    public static char[] field1350 = new char[128];

    @ObfuscatedName("bn.cg")
    public static int[] field1345 = new int[128];

    @ObfuscatedName("bn.ch")
    public static int field1346 = 0;

    @ObfuscatedName("bn.cj")
    public static int field1347 = 0;

    @ObfuscatedName("bn.cw")
    public static int field1336 = 0;

    @ObfuscatedName("bn.cx")
    public static volatile int field1349 = 0;

    @ObfuscatedName("bn.co")
    public static int[] field1332 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("ej.c(I)V")
    public static void method2973() {
        if (Statics.field1320.toLowerCase().indexOf("microsoft") != -1) {
            field1332[186] = 57;
            field1332[187] = 27;
            field1332[188] = 71;
            field1332[189] = 26;
            field1332[190] = 72;
            field1332[191] = 73;
            field1332[192] = 58;
            field1332[219] = 42;
            field1332[220] = 74;
            field1332[221] = 43;
            field1332[222] = 59;
            field1332[223] = 28;
            return;
        }
        field1332[44] = 71;
        field1332[45] = 26;
        field1332[46] = 72;
        field1332[47] = 73;
        field1332[59] = 57;
        field1332[61] = 27;
        field1332[91] = 42;
        field1332[92] = 74;
        field1332[93] = 43;
        field1332[192] = 28;
        field1332[222] = 58;
        field1332[520] = 59;
    }

    @ObfuscatedName("ae.j(Ljava/awt/Component;S)V")
    public static void method654(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1335);
        arg0.addFocusListener(field1335);
    }

    @ObfuscatedName("client.f(Ljava/awt/Component;I)V")
    public static void method503(Component arg0) {
        arg0.removeKeyListener(field1335);
        arg0.removeFocusListener(field1335);
        field1344 = -1;
    }

    @ObfuscatedName("c.y(B)V")
    public static void method1() {
        if (field1335 != null) {
            class74 var0 = field1335;
            synchronized (field1335) {
                field1335 = null;
            }
        }
    }

    @ObfuscatedName("bx.x(I)V")
    public static void method1232() {
        class74 var0 = field1335;
        synchronized (field1335) {
            field1349++;
            field1346 = field1336;
            if (field1344 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1326[var1] = false;
                }
                field1344 = field1342;
            } else {
                while (field1344 != field1342) {
                    int var2 = field1341[field1342];
                    field1342 = field1342 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1326[~var2] = false;
                    } else {
                        field1326[var2] = true;
                    }
                }
            }
            field1336 = field1347;
        }
    }

    @ObfuscatedName("a.e(S)Z")
    public static final boolean method203() {
        class74 var0 = field1335;
        synchronized (field1335) {
            if (field1346 == field1336) {
                return false;
            } else {
                Statics.field1643 = field1345[field1346];
                Statics.field1957 = field1350[field1346];
                field1346 = field1346 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("be.m(I)I")
    public static int method1400() {
        return field1349;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1335 == null) {
            return;
        }
        field1349 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1332.length) {
            var3 = field1332[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1344 >= 0 && var3 >= 0) {
            field1341[field1344] = var3;
            field1344 = field1344 + 1 & 0x7F;
            if (field1344 == field1342) {
                field1344 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1347 + 1 & 0x7F;
            if (field1346 != var4) {
                field1345[field1347] = var3;
                field1350[field1347] = 0;
                field1347 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1335 != null) {
            field1349 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1332.length) {
                var3 = field1332[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1344 >= 0 && var3 >= 0) {
                field1341[field1344] = ~var3;
                field1344 = field1344 + 1 & 0x7F;
                if (field1344 == field1342) {
                    field1344 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1335 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class148.field2441;
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
                    int var7 = field1347 + 1 & 0x7F;
                    if (field1346 != var7) {
                        field1345[field1347] = -1;
                        field1350[field1347] = var2;
                        field1347 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1335 != null) {
            field1344 = -1;
        }
    }
}
