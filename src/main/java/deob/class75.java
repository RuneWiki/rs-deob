package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("bh")
public final class class75 implements KeyListener, FocusListener {

    @ObfuscatedName("bh.g")
    public static class75 field1361 = new class75();

    @ObfuscatedName("bh.cp")
    public static boolean[] field1340 = new boolean[112];

    @ObfuscatedName("bh.cr")
    public static int[] field1355 = new int[128];

    @ObfuscatedName("bh.ci")
    public static int field1346 = 0;

    @ObfuscatedName("bh.cj")
    public static int field1357 = 0;

    @ObfuscatedName("bh.cb")
    public static char[] field1358 = new char[128];

    @ObfuscatedName("bh.cy")
    public static int[] field1359 = new int[128];

    @ObfuscatedName("bh.cn")
    public static int[] field1360 = new int[128];

    @ObfuscatedName("bh.cl")
    public static int field1353 = 0;

    @ObfuscatedName("bh.cv")
    public static int field1362 = 0;

    @ObfuscatedName("bh.cd")
    public static int field1366 = 0;

    @ObfuscatedName("bh.cz")
    public static int field1364 = 0;

    @ObfuscatedName("bh.cx")
    public static volatile int field1365 = 0;

    @ObfuscatedName("bh.ck")
    public static int[] field1339 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("dh.g(Ljava/awt/Component;I)V")
    public static void method2322(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1361);
        arg0.addFocusListener(field1361);
    }

    @ObfuscatedName("du.m(I)Z")
    public static final boolean method2640() {
        class75 var0 = field1361;
        synchronized (field1361) {
            if (field1364 == field1362) {
                return false;
            } else {
                Statics.field1354 = field1359[field1362];
                Statics.field1257 = field1358[field1362];
                field1362 = field1362 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1361 == null) {
            return;
        }
        field1365 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1339.length) {
            var3 = field1339[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1357 >= 0 && var3 >= 0) {
            field1355[field1357] = var3;
            field1357 = field1357 + 1 & 0x7F;
            if (field1357 == field1346) {
                field1357 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1366 + 1 & 0x7F;
            if (field1362 != var4) {
                field1359[field1366] = var3;
                field1358[field1366] = 0;
                field1366 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1361 != null) {
            field1365 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1339.length) {
                var3 = field1339[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1357 >= 0 && var3 >= 0) {
                field1355[field1357] = ~var3;
                field1357 = field1357 + 1 & 0x7F;
                if (field1357 == field1346) {
                    field1357 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1361 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class149.field2452;
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
                    int var7 = field1366 + 1 & 0x7F;
                    if (field1362 != var7) {
                        field1359[field1366] = -1;
                        field1358[field1366] = var2;
                        field1366 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1361 != null) {
            field1357 = -1;
        }
    }
}
