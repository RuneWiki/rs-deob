package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("by")
public final class class74 implements KeyListener, FocusListener {

    @ObfuscatedName("by.p")
    public static class74 field1336 = new class74();

    @ObfuscatedName("by.cl")
    public static boolean[] field1344 = new boolean[112];

    @ObfuscatedName("by.cy")
    public static int[] field1361 = new int[128];

    @ObfuscatedName("by.co")
    public static int field1362 = 0;

    @ObfuscatedName("by.ci")
    public static int field1345 = 0;

    @ObfuscatedName("by.ca")
    public static char[] field1360 = new char[128];

    @ObfuscatedName("by.cp")
    public static int[] field1365 = new int[128];

    @ObfuscatedName("by.cn")
    public static int[] field1366 = new int[128];

    @ObfuscatedName("by.cr")
    public static int field1367 = 0;

    @ObfuscatedName("by.cg")
    public static int field1368 = 0;

    @ObfuscatedName("by.ce")
    public static int field1369 = 0;

    @ObfuscatedName("by.ch")
    public static int field1370 = 0;

    @ObfuscatedName("by.cu")
    public static volatile int field1337 = 0;

    @ObfuscatedName("by.cm")
    public static int[] field1372 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("be.p(Ljava/awt/Component;I)V")
    public static void method1381(Component arg0) {
        arg0.removeKeyListener(field1336);
        arg0.removeFocusListener(field1336);
        field1345 = -1;
    }

    @ObfuscatedName("k.w(I)V")
    public static void method50() {
        class74 var0 = field1336;
        synchronized (field1336) {
            field1337++;
            field1368 = field1370;
            field1367 = 0;
            if (field1345 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1344[var1] = false;
                }
                field1345 = field1362;
            } else {
                while (field1362 != field1345) {
                    int var2 = field1361[field1362];
                    field1362 = field1362 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1344[~var2] = false;
                    } else {
                        if (!field1344[var2] && field1367 < field1366.length - 1) {
                            field1366[++field1367 - 1] = var2;
                        }
                        field1344[var2] = true;
                    }
                }
            }
            field1370 = field1369;
        }
    }

    @ObfuscatedName("ab.h(I)I")
    public static int method793() {
        return field1337;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1336 == null) {
            return;
        }
        field1337 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1372.length) {
            var3 = field1372[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1345 >= 0 && var3 >= 0) {
            field1361[field1345] = var3;
            field1345 = field1345 + 1 & 0x7F;
            if (field1362 == field1345) {
                field1345 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1369 + 1 & 0x7F;
            if (field1368 != var4) {
                field1365[field1369] = var3;
                field1360[field1369] = 0;
                field1369 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1336 != null) {
            field1337 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1372.length) {
                var3 = field1372[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1345 >= 0 && var3 >= 0) {
                field1361[field1345] = ~var3;
                field1345 = field1345 + 1 & 0x7F;
                if (field1362 == field1345) {
                    field1345 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1336 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class148.field2459;
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
                    int var7 = field1369 + 1 & 0x7F;
                    if (field1368 != var7) {
                        field1365[field1369] = -1;
                        field1360[field1369] = var2;
                        field1369 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1336 != null) {
            field1345 = -1;
        }
    }
}
