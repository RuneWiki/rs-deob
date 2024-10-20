package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("bo")
public final class class75 implements KeyListener, FocusListener {

    @ObfuscatedName("bo.p")
    public static class75 field1371 = new class75();

    @ObfuscatedName("bo.cu")
    public static boolean[] field1363 = new boolean[112];

    @ObfuscatedName("bo.cs")
    public static int[] field1364 = new int[128];

    @ObfuscatedName("bo.cb")
    public static int field1369 = 0;

    @ObfuscatedName("bo.cy")
    public static int field1366 = 0;

    @ObfuscatedName("bo.cm")
    public static char[] field1362 = new char[128];

    @ObfuscatedName("bo.cx")
    public static int[] field1368 = new int[128];

    @ObfuscatedName("bo.cq")
    public static int[] field1376 = new int[128];

    @ObfuscatedName("bo.cz")
    public static int field1370 = 0;

    @ObfuscatedName("bo.ct")
    public static int field1367 = 0;

    @ObfuscatedName("bo.ck")
    public static int field1372 = 0;

    @ObfuscatedName("bo.cr")
    public static int field1355 = 0;

    @ObfuscatedName("bo.ca")
    public static volatile int field1374 = 0;

    @ObfuscatedName("bo.cf")
    public static int[] field1375 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("bz.p(Ljava/awt/Component;I)V")
    public static void method1613(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1371);
        arg0.addFocusListener(field1371);
    }

    @ObfuscatedName("y.i(Ljava/awt/Component;B)V")
    public static void method215(Component arg0) {
        arg0.removeKeyListener(field1371);
        arg0.removeFocusListener(field1371);
        field1366 = -1;
    }

    @ObfuscatedName("q.o(B)V")
    public static void method146() {
        if (field1371 != null) {
            class75 var0 = field1371;
            synchronized (field1371) {
                field1371 = null;
            }
        }
    }

    @ObfuscatedName("ao.n(B)V")
    public static void method663() {
        class75 var0 = field1371;
        synchronized (field1371) {
            field1374++;
            field1367 = field1355;
            field1370 = 0;
            if (field1366 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1363[var1] = false;
                }
                field1366 = field1369;
            } else {
                while (field1369 != field1366) {
                    int var2 = field1364[field1369];
                    field1369 = field1369 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1363[~var2] = false;
                    } else {
                        if (!field1363[var2] && field1370 < field1376.length - 1) {
                            field1376[++field1370 - 1] = var2;
                        }
                        field1363[var2] = true;
                    }
                }
            }
            field1355 = field1372;
        }
    }

    @ObfuscatedName("ef.l(B)Z")
    public static final boolean method2730() {
        class75 var0 = field1371;
        synchronized (field1371) {
            if (field1367 == field1355) {
                return false;
            } else {
                Statics.field1178 = field1368[field1367];
                Statics.field384 = field1362[field1367];
                field1367 = field1367 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("d.v(B)I")
    public static int method128() {
        return field1374;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1371 == null) {
            return;
        }
        field1374 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1375.length) {
            var3 = field1375[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1366 >= 0 && var3 >= 0) {
            field1364[field1366] = var3;
            field1366 = field1366 + 1 & 0x7F;
            if (field1369 == field1366) {
                field1366 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1372 + 1 & 0x7F;
            if (field1367 != var4) {
                field1368[field1372] = var3;
                field1362[field1372] = 0;
                field1372 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1371 != null) {
            field1374 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1375.length) {
                var3 = field1375[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1366 >= 0 && var3 >= 0) {
                field1364[field1366] = ~var3;
                field1366 = field1366 + 1 & 0x7F;
                if (field1369 == field1366) {
                    field1366 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1371 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class149.field2471;
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
                    if (field1367 != var7) {
                        field1368[field1372] = -1;
                        field1362[field1372] = var2;
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
        if (field1371 != null) {
            field1366 = -1;
        }
    }
}
