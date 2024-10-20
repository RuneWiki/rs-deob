package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("bn")
public final class class75 implements KeyListener, FocusListener {

    @ObfuscatedName("bn.y")
    public static class75 field1367 = new class75();

    @ObfuscatedName("bn.cj")
    public static boolean[] field1344 = new boolean[112];

    @ObfuscatedName("bn.cu")
    public static int[] field1356 = new int[128];

    @ObfuscatedName("bn.ct")
    public static int field1342 = 0;

    @ObfuscatedName("bn.cw")
    public static int field1366 = 0;

    @ObfuscatedName("bn.ch")
    public static char[] field1375 = new char[128];

    @ObfuscatedName("bn.cg")
    public static int[] field1368 = new int[128];

    @ObfuscatedName("bn.ce")
    public static int[] field1360 = new int[128];

    @ObfuscatedName("bn.cy")
    public static int field1370 = 0;

    @ObfuscatedName("bn.cl")
    public static int field1365 = 0;

    @ObfuscatedName("bn.cc")
    public static int field1372 = 0;

    @ObfuscatedName("bn.cf")
    public static int field1373 = 0;

    @ObfuscatedName("bn.ci")
    public static volatile int field1374 = 0;

    @ObfuscatedName("bn.cq")
    public static int[] field1354 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("ac.y(Ljava/awt/Component;B)V")
    public static void method766(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1367);
        arg0.addFocusListener(field1367);
    }

    @ObfuscatedName("c.m(I)V")
    public static void method132() {
        class75 var0 = field1367;
        synchronized (field1367) {
            field1374++;
            field1365 = field1373;
            field1370 = 0;
            if (field1366 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1344[var1] = false;
                }
                field1366 = field1342;
            } else {
                while (field1366 != field1342) {
                    int var2 = field1356[field1342];
                    field1342 = field1342 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1344[~var2] = false;
                    } else {
                        if (!field1344[var2] && field1370 < field1360.length - 1) {
                            field1360[++field1370 - 1] = var2;
                        }
                        field1344[var2] = true;
                    }
                }
            }
            field1373 = field1372;
        }
    }

    @ObfuscatedName("bz.d(S)Z")
    public static final boolean method1365() {
        class75 var0 = field1367;
        synchronized (field1367) {
            if (field1373 == field1365) {
                return false;
            } else {
                Statics.field358 = field1368[field1365];
                Statics.field81 = field1375[field1365];
                field1365 = field1365 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("ei.k(I)I")
    public static int method2700() {
        return field1374;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1367 == null) {
            return;
        }
        field1374 = 0;
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
        if (field1366 >= 0 && var3 >= 0) {
            field1356[field1366] = var3;
            field1366 = field1366 + 1 & 0x7F;
            if (field1366 == field1342) {
                field1366 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1372 + 1 & 0x7F;
            if (field1365 != var4) {
                field1368[field1372] = var3;
                field1375[field1372] = 0;
                field1372 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1367 != null) {
            field1374 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1354.length) {
                var3 = field1354[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1366 >= 0 && var3 >= 0) {
                field1356[field1366] = ~var3;
                field1366 = field1366 + 1 & 0x7F;
                if (field1366 == field1342) {
                    field1366 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1367 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class149.field2453;
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
                    int var7 = field1372 + 1 & 0x7F;
                    if (field1365 != var7) {
                        field1368[field1372] = -1;
                        field1375[field1372] = var2;
                        field1372 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1367 != null) {
            field1366 = -1;
        }
    }
}
