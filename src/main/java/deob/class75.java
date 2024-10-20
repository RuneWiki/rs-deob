package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ba")
public final class class75 implements KeyListener, FocusListener {

    @ObfuscatedName("ba.d")
    public static class75 field1351 = new class75();

    @ObfuscatedName("ba.ck")
    public static boolean[] field1359 = new boolean[112];

    @ObfuscatedName("ba.cx")
    public static int[] field1361 = new int[128];

    @ObfuscatedName("ba.cd")
    public static int field1362 = 0;

    @ObfuscatedName("ba.cm")
    public static int field1350 = 0;

    @ObfuscatedName("ba.cc")
    public static char[] field1364 = new char[128];

    @ObfuscatedName("ba.cg")
    public static int[] field1365 = new int[128];

    @ObfuscatedName("ba.cq")
    public static int[] field1353 = new int[128];

    @ObfuscatedName("ba.cw")
    public static int field1367 = 0;

    @ObfuscatedName("ba.cz")
    public static int field1368 = 0;

    @ObfuscatedName("ba.cn")
    public static int field1372 = 0;

    @ObfuscatedName("ba.ch")
    public static int field1363 = 0;

    @ObfuscatedName("ba.ct")
    public static volatile int field1346 = 0;

    @ObfuscatedName("ba.cr")
    public static int[] field1357 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("ay.d(Ljava/awt/Component;I)V")
    public static void method860(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1351);
        arg0.addFocusListener(field1351);
    }

    @ObfuscatedName("ae.g(B)V")
    public static void method239() {
        class75 var0 = field1351;
        synchronized (field1351) {
            field1346++;
            field1368 = field1363;
            field1367 = 0;
            if (field1350 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1359[var1] = false;
                }
                field1350 = field1362;
            } else {
                while (field1362 != field1350) {
                    int var2 = field1361[field1362];
                    field1362 = field1362 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1359[~var2] = false;
                    } else {
                        if (!field1359[var2] && field1367 < field1353.length - 1) {
                            field1353[++field1367 - 1] = var2;
                        }
                        field1359[var2] = true;
                    }
                }
            }
            field1363 = field1372;
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1351 == null) {
            return;
        }
        field1346 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1357.length) {
            var3 = field1357[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1350 >= 0 && var3 >= 0) {
            field1361[field1350] = var3;
            field1350 = field1350 + 1 & 0x7F;
            if (field1362 == field1350) {
                field1350 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1372 + 1 & 0x7F;
            if (field1368 != var4) {
                field1365[field1372] = var3;
                field1364[field1372] = 0;
                field1372 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1351 != null) {
            field1346 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1357.length) {
                var3 = field1357[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1350 >= 0 && var3 >= 0) {
                field1361[field1350] = ~var3;
                field1350 = field1350 + 1 & 0x7F;
                if (field1362 == field1350) {
                    field1350 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1351 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class149.field2468;
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
                    if (field1368 != var7) {
                        field1365[field1372] = -1;
                        field1364[field1372] = var2;
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
        if (field1351 != null) {
            field1350 = -1;
        }
    }
}
