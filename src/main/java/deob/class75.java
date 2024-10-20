package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("bf")
public final class class75 implements KeyListener, FocusListener {

    @ObfuscatedName("bf.f")
    public static class75 field1346 = new class75();

    @ObfuscatedName("bf.cy")
    public static boolean[] field1347 = new boolean[112];

    @ObfuscatedName("bf.cx")
    public static int[] field1348 = new int[128];

    @ObfuscatedName("bf.co")
    public static int field1349 = 0;

    @ObfuscatedName("bf.ck")
    public static int field1336 = 0;

    @ObfuscatedName("bf.cq")
    public static char[] field1351 = new char[128];

    @ObfuscatedName("bf.cd")
    public static int[] field1352 = new int[128];

    @ObfuscatedName("bf.cr")
    public static int[] field1359 = new int[128];

    @ObfuscatedName("bf.cg")
    public static int field1354 = 0;

    @ObfuscatedName("bf.cw")
    public static int field1355 = 0;

    @ObfuscatedName("bf.cl")
    public static int field1333 = 0;

    @ObfuscatedName("bf.ch")
    public static int field1338 = 0;

    @ObfuscatedName("bf.cs")
    public static volatile int field1358 = 0;

    @ObfuscatedName("bf.cz")
    public static int[] field1361 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("ak.f(I)V")
    public static void method1174() {
        if (Statics.field2458.toLowerCase().indexOf("microsoft") != -1) {
            field1361[186] = 57;
            field1361[187] = 27;
            field1361[188] = 71;
            field1361[189] = 26;
            field1361[190] = 72;
            field1361[191] = 73;
            field1361[192] = 58;
            field1361[219] = 42;
            field1361[220] = 74;
            field1361[221] = 43;
            field1361[222] = 59;
            field1361[223] = 28;
            return;
        }
        field1361[44] = 71;
        field1361[45] = 26;
        field1361[46] = 72;
        field1361[47] = 73;
        field1361[59] = 57;
        field1361[61] = 27;
        field1361[91] = 42;
        field1361[92] = 74;
        field1361[93] = 43;
        field1361[192] = 28;
        field1361[222] = 58;
        field1361[520] = 59;
    }

    @ObfuscatedName("b.t(Ljava/awt/Component;I)V")
    public static void method142(Component arg0) {
        arg0.removeKeyListener(field1346);
        arg0.removeFocusListener(field1346);
        field1336 = -1;
    }

    @ObfuscatedName("db.n(I)V")
    public static void method2368() {
        class75 var0 = field1346;
        synchronized (field1346) {
            field1358++;
            field1355 = field1338;
            field1354 = 0;
            if (field1336 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1347[var1] = false;
                }
                field1336 = field1349;
            } else {
                while (field1349 != field1336) {
                    int var2 = field1348[field1349];
                    field1349 = field1349 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1347[~var2] = false;
                    } else {
                        if (!field1347[var2] && field1354 < field1359.length - 1) {
                            field1359[++field1354 - 1] = var2;
                        }
                        field1347[var2] = true;
                    }
                }
            }
            field1338 = field1333;
        }
    }

    @ObfuscatedName("dq.e(I)I")
    public static int method2650() {
        return field1358;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1346 == null) {
            return;
        }
        field1358 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1361.length) {
            var3 = field1361[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1336 >= 0 && var3 >= 0) {
            field1348[field1336] = var3;
            field1336 = field1336 + 1 & 0x7F;
            if (field1349 == field1336) {
                field1336 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1333 + 1 & 0x7F;
            if (field1355 != var4) {
                field1352[field1333] = var3;
                field1351[field1333] = 0;
                field1333 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1346 != null) {
            field1358 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1361.length) {
                var3 = field1361[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1336 >= 0 && var3 >= 0) {
                field1348[field1336] = ~var3;
                field1336 = field1336 + 1 & 0x7F;
                if (field1349 == field1336) {
                    field1336 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1346 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class150.field2472;
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
                    int var7 = field1333 + 1 & 0x7F;
                    if (field1355 != var7) {
                        field1352[field1333] = -1;
                        field1351[field1333] = var2;
                        field1333 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1346 != null) {
            field1336 = -1;
        }
    }
}
