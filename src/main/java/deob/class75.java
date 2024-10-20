package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("bs")
public final class class75 implements KeyListener, FocusListener {

    @ObfuscatedName("bs.p")
    public static class75 field1360 = new class75();

    @ObfuscatedName("bs.cw")
    public static boolean[] field1366 = new boolean[112];

    @ObfuscatedName("bs.cj")
    public static int[] field1373 = new int[128];

    @ObfuscatedName("bs.cg")
    public static int field1368 = 0;

    @ObfuscatedName("bs.cm")
    public static int field1369 = 0;

    @ObfuscatedName("bs.cl")
    public static char[] field1375 = new char[128];

    @ObfuscatedName("bs.cx")
    public static int[] field1371 = new int[128];

    @ObfuscatedName("bs.cv")
    public static int[] field1372 = new int[128];

    @ObfuscatedName("bs.cc")
    public static int field1352 = 0;

    @ObfuscatedName("bs.ci")
    public static int field1374 = 0;

    @ObfuscatedName("bs.cn")
    public static int field1364 = 0;

    @ObfuscatedName("bs.co")
    public static int field1376 = 0;

    @ObfuscatedName("bs.cr")
    public static volatile int field1377 = 0;

    @ObfuscatedName("bs.ch")
    public static int[] field1367 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("bs.e(I)V")
    public static void method1570() {
        if (field1360 != null) {
            class75 var0 = field1360;
            synchronized (field1360) {
                field1360 = null;
            }
        }
    }

    @ObfuscatedName("u.a(I)V")
    public static void method159() {
        class75 var0 = field1360;
        synchronized (field1360) {
            field1377++;
            field1374 = field1376;
            field1352 = 0;
            if (field1369 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1366[var1] = false;
                }
                field1369 = field1368;
            } else {
                while (field1369 != field1368) {
                    int var2 = field1373[field1368];
                    field1368 = field1368 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1366[~var2] = false;
                    } else {
                        if (!field1366[var2] && field1352 < field1372.length - 1) {
                            field1372[++field1352 - 1] = var2;
                        }
                        field1366[var2] = true;
                    }
                }
            }
            field1376 = field1364;
        }
    }

    @ObfuscatedName("y.h(S)Z")
    public static final boolean method37() {
        class75 var0 = field1360;
        synchronized (field1360) {
            if (field1376 == field1374) {
                return false;
            } else {
                Statics.field2045 = field1371[field1374];
                Statics.field1848 = field1375[field1374];
                field1374 = field1374 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("u.y(I)I")
    public static int method158() {
        return field1377;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1360 == null) {
            return;
        }
        field1377 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1367.length) {
            var3 = field1367[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1369 >= 0 && var3 >= 0) {
            field1373[field1369] = var3;
            field1369 = field1369 + 1 & 0x7F;
            if (field1369 == field1368) {
                field1369 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1364 + 1 & 0x7F;
            if (field1374 != var4) {
                field1371[field1364] = var3;
                field1375[field1364] = 0;
                field1364 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1360 != null) {
            field1377 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1367.length) {
                var3 = field1367[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1369 >= 0 && var3 >= 0) {
                field1373[field1369] = ~var3;
                field1369 = field1369 + 1 & 0x7F;
                if (field1369 == field1368) {
                    field1369 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1360 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class150.field2467;
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
                    int var7 = field1364 + 1 & 0x7F;
                    if (field1374 != var7) {
                        field1371[field1364] = -1;
                        field1375[field1364] = var2;
                        field1364 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1360 != null) {
            field1369 = -1;
        }
    }
}
