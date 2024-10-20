package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("bl")
public final class class75 implements KeyListener, FocusListener {

    @ObfuscatedName("bl.i")
    public static class75 field1356 = new class75();

    @ObfuscatedName("bl.cu")
    public static boolean[] field1358 = new boolean[112];

    @ObfuscatedName("bl.cm")
    public static int[] field1371 = new int[128];

    @ObfuscatedName("bl.ch")
    public static int field1364 = 0;

    @ObfuscatedName("bl.cz")
    public static int field1361 = 0;

    @ObfuscatedName("bl.cw")
    public static char[] field1362 = new char[128];

    @ObfuscatedName("bl.cr")
    public static int[] field1363 = new int[128];

    @ObfuscatedName("bl.cy")
    public static int[] field1349 = new int[128];

    @ObfuscatedName("bl.cs")
    public static int field1365 = 0;

    @ObfuscatedName("bl.cf")
    public static int field1366 = 0;

    @ObfuscatedName("bl.ci")
    public static int field1357 = 0;

    @ObfuscatedName("bl.cb")
    public static int field1344 = 0;

    @ObfuscatedName("bl.cl")
    public static volatile int field1368 = 0;

    @ObfuscatedName("bl.co")
    public static int[] field1360 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("client.i(Ljava/awt/Component;B)V")
    public static void method536(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1356);
        arg0.addFocusListener(field1356);
    }

    @ObfuscatedName("v.w(S)V")
    public static void method173() {
        if (field1356 != null) {
            class75 var0 = field1356;
            synchronized (field1356) {
                field1356 = null;
            }
        }
    }

    @ObfuscatedName("ea.f(S)V")
    public static void method3054() {
        class75 var0 = field1356;
        synchronized (field1356) {
            field1368++;
            field1366 = field1344;
            field1365 = 0;
            if (field1361 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1358[var1] = false;
                }
                field1361 = field1364;
            } else {
                while (field1364 != field1361) {
                    int var2 = field1371[field1364];
                    field1364 = field1364 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1358[~var2] = false;
                    } else {
                        if (!field1358[var2] && field1365 < field1349.length - 1) {
                            field1349[++field1365 - 1] = var2;
                        }
                        field1358[var2] = true;
                    }
                }
            }
            field1344 = field1357;
        }
    }

    @ObfuscatedName("client.e(I)Z")
    public static final boolean method507() {
        class75 var0 = field1356;
        synchronized (field1356) {
            if (field1366 == field1344) {
                return false;
            } else {
                Statics.field967 = field1363[field1366];
                Statics.field2001 = field1362[field1366];
                field1366 = field1366 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1356 == null) {
            return;
        }
        field1368 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1360.length) {
            var3 = field1360[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1361 >= 0 && var3 >= 0) {
            field1371[field1361] = var3;
            field1361 = field1361 + 1 & 0x7F;
            if (field1364 == field1361) {
                field1361 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1357 + 1 & 0x7F;
            if (field1366 != var4) {
                field1363[field1357] = var3;
                field1362[field1357] = 0;
                field1357 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1356 != null) {
            field1368 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1360.length) {
                var3 = field1360[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1361 >= 0 && var3 >= 0) {
                field1371[field1361] = ~var3;
                field1361 = field1361 + 1 & 0x7F;
                if (field1364 == field1361) {
                    field1361 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1356 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class149.field2460;
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
                    int var7 = field1357 + 1 & 0x7F;
                    if (field1366 != var7) {
                        field1363[field1357] = -1;
                        field1362[field1357] = var2;
                        field1357 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1356 != null) {
            field1361 = -1;
        }
    }
}
