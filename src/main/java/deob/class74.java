package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("bm")
public final class class74 implements KeyListener, FocusListener {

    @ObfuscatedName("bm.u")
    public static class74 field1335 = new class74();

    @ObfuscatedName("bm.ci")
    public static boolean[] field1356 = new boolean[112];

    @ObfuscatedName("bm.cs")
    public static int[] field1336 = new int[128];

    @ObfuscatedName("bm.cf")
    public static int field1346 = 0;

    @ObfuscatedName("bm.cr")
    public static int field1347 = 0;

    @ObfuscatedName("bm.ch")
    public static char[] field1331 = new char[128];

    @ObfuscatedName("bm.ca")
    public static int[] field1349 = new int[128];

    @ObfuscatedName("bm.ce")
    public static int field1350 = 0;

    @ObfuscatedName("bm.cb")
    public static int field1338 = 0;

    @ObfuscatedName("bm.cq")
    public static int field1352 = 0;

    @ObfuscatedName("bm.cy")
    public static volatile int field1333 = 0;

    @ObfuscatedName("bm.cx")
    public static int[] field1354 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("ao.u(I)V")
    public static void method781() {
        if (Statics.field1327.toLowerCase().indexOf("microsoft") != -1) {
            field1354[186] = 57;
            field1354[187] = 27;
            field1354[188] = 71;
            field1354[189] = 26;
            field1354[190] = 72;
            field1354[191] = 73;
            field1354[192] = 58;
            field1354[219] = 42;
            field1354[220] = 74;
            field1354[221] = 43;
            field1354[222] = 59;
            field1354[223] = 28;
            return;
        }
        field1354[44] = 71;
        field1354[45] = 26;
        field1354[46] = 72;
        field1354[47] = 73;
        field1354[59] = 57;
        field1354[61] = 27;
        field1354[91] = 42;
        field1354[92] = 74;
        field1354[93] = 43;
        field1354[192] = 28;
        field1354[222] = 58;
        field1354[520] = 59;
    }

    @ObfuscatedName("i.k(Ljava/awt/Component;I)V")
    public static void method164(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1335);
        arg0.addFocusListener(field1335);
    }

    @ObfuscatedName("bx.x(Ljava/awt/Component;I)V")
    public static void method1473(Component arg0) {
        arg0.removeKeyListener(field1335);
        arg0.removeFocusListener(field1335);
        field1347 = -1;
    }

    @ObfuscatedName("cq.m(I)V")
    public static void method2036() {
        if (field1335 != null) {
            class74 var0 = field1335;
            synchronized (field1335) {
                field1335 = null;
            }
        }
    }

    @ObfuscatedName("dl.n(I)V")
    public static void method2643() {
        class74 var0 = field1335;
        synchronized (field1335) {
            field1333++;
            field1350 = field1352;
            if (field1347 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1356[var1] = false;
                }
                field1347 = field1346;
            } else {
                while (field1347 != field1346) {
                    int var2 = field1336[field1346];
                    field1346 = field1346 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1356[~var2] = false;
                    } else {
                        field1356[var2] = true;
                    }
                }
            }
            field1352 = field1338;
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1335 == null) {
            return;
        }
        field1333 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1354.length) {
            var3 = field1354[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1347 >= 0 && var3 >= 0) {
            field1336[field1347] = var3;
            field1347 = field1347 + 1 & 0x7F;
            if (field1347 == field1346) {
                field1347 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1338 + 1 & 0x7F;
            if (field1350 != var4) {
                field1349[field1338] = var3;
                field1331[field1338] = 0;
                field1338 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1335 != null) {
            field1333 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1354.length) {
                var3 = field1354[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1347 >= 0 && var3 >= 0) {
                field1336[field1347] = ~var3;
                field1347 = field1347 + 1 & 0x7F;
                if (field1347 == field1346) {
                    field1347 = -1;
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
                            char[] var4 = class148.field2450;
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
                    int var7 = field1338 + 1 & 0x7F;
                    if (field1350 != var7) {
                        field1349[field1338] = -1;
                        field1331[field1338] = var2;
                        field1338 = var7;
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
            field1347 = -1;
        }
    }
}
