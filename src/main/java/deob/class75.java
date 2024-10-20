package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("bd")
public final class class75 implements KeyListener, FocusListener {

    @ObfuscatedName("bd.q")
    public static class75 field1381 = new class75();

    @ObfuscatedName("bd.cq")
    public static boolean[] field1361 = new boolean[112];

    @ObfuscatedName("bd.cd")
    public static int[] field1362 = new int[128];

    @ObfuscatedName("bd.cs")
    public static int field1363 = 0;

    @ObfuscatedName("bd.ck")
    public static int field1364 = 0;

    @ObfuscatedName("bd.ci")
    public static char[] field1365 = new char[128];

    @ObfuscatedName("bd.cx")
    public static int[] field1369 = new int[128];

    @ObfuscatedName("bd.cn")
    public static int[] field1355 = new int[128];

    @ObfuscatedName("bd.ca")
    public static int field1368 = 0;

    @ObfuscatedName("bd.cz")
    public static int field1377 = 0;

    @ObfuscatedName("bd.cv")
    public static int field1352 = 0;

    @ObfuscatedName("bd.ce")
    public static int field1371 = 0;

    @ObfuscatedName("bd.cw")
    public static volatile int field1358 = 0;

    @ObfuscatedName("bd.cy")
    public static int[] field1373 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("g.q(Ljava/awt/Component;I)V")
    public static void method142(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1381);
        arg0.addFocusListener(field1381);
    }

    @ObfuscatedName("r.c(I)V")
    public static void method116() {
        if (field1381 != null) {
            class75 var0 = field1381;
            synchronized (field1381) {
                field1381 = null;
            }
        }
    }

    @ObfuscatedName("o.p(I)I")
    public static int method164() {
        return field1358;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1381 == null) {
            return;
        }
        field1358 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1373.length) {
            var3 = field1373[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1364 >= 0 && var3 >= 0) {
            field1362[field1364] = var3;
            field1364 = field1364 + 1 & 0x7F;
            if (field1364 == field1363) {
                field1364 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1352 + 1 & 0x7F;
            if (field1377 != var4) {
                field1369[field1352] = var3;
                field1365[field1352] = 0;
                field1352 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1381 != null) {
            field1358 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1373.length) {
                var3 = field1373[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1364 >= 0 && var3 >= 0) {
                field1362[field1364] = ~var3;
                field1364 = field1364 + 1 & 0x7F;
                if (field1364 == field1363) {
                    field1364 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1381 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class150.field2488;
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
                    int var7 = field1352 + 1 & 0x7F;
                    if (field1377 != var7) {
                        field1369[field1352] = -1;
                        field1365[field1352] = var2;
                        field1352 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1381 != null) {
            field1364 = -1;
        }
    }
}
