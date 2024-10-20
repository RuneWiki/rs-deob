package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("bk")
public final class class74 implements KeyListener, FocusListener {

    @ObfuscatedName("bk.j")
    public static class74 field1335 = new class74();

    @ObfuscatedName("bk.cd")
    public static boolean[] field1341 = new boolean[112];

    @ObfuscatedName("bk.cp")
    public static int[] field1345 = new int[128];

    @ObfuscatedName("bk.cw")
    public static int field1352 = 0;

    @ObfuscatedName("bk.cj")
    public static int field1354 = 0;

    @ObfuscatedName("bk.co")
    public static char[] field1353 = new char[128];

    @ObfuscatedName("bk.cn")
    public static int[] field1350 = new int[128];

    @ObfuscatedName("bk.ce")
    public static int field1333 = 0;

    @ObfuscatedName("bk.ca")
    public static int field1356 = 0;

    @ObfuscatedName("bk.cy")
    public static int field1357 = 0;

    @ObfuscatedName("bk.cq")
    public static volatile int field1358 = 0;

    @ObfuscatedName("bk.cz")
    public static int[] field1351 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("d.j(I)V")
    public static void method157() {
        if (field1335 != null) {
            class74 var0 = field1335;
            synchronized (field1335) {
                field1335 = null;
            }
        }
    }

    @ObfuscatedName("e.y(I)V")
    public static void method37() {
        class74 var0 = field1335;
        synchronized (field1335) {
            field1358++;
            field1333 = field1357;
            if (field1354 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1341[var1] = false;
                }
                field1354 = field1352;
            } else {
                while (field1354 != field1352) {
                    int var2 = field1345[field1352];
                    field1352 = field1352 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1341[~var2] = false;
                    } else {
                        field1341[var2] = true;
                    }
                }
            }
            field1357 = field1356;
        }
    }

    @ObfuscatedName("client.x(I)Z")
    public static final boolean method504() {
        class74 var0 = field1335;
        synchronized (field1335) {
            if (field1357 == field1333) {
                return false;
            } else {
                Statics.field2319 = field1350[field1333];
                Statics.field1957 = field1353[field1333];
                field1333 = field1333 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1335 == null) {
            return;
        }
        field1358 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1351.length) {
            var3 = field1351[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1354 >= 0 && var3 >= 0) {
            field1345[field1354] = var3;
            field1354 = field1354 + 1 & 0x7F;
            if (field1354 == field1352) {
                field1354 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1356 + 1 & 0x7F;
            if (field1333 != var4) {
                field1350[field1356] = var3;
                field1353[field1356] = 0;
                field1356 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1335 != null) {
            field1358 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1351.length) {
                var3 = field1351[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1354 >= 0 && var3 >= 0) {
                field1345[field1354] = ~var3;
                field1354 = field1354 + 1 & 0x7F;
                if (field1354 == field1352) {
                    field1354 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1335 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class148.method2894(var2)) {
                int var3 = field1356 + 1 & 0x7F;
                if (field1333 != var3) {
                    field1350[field1356] = -1;
                    field1353[field1356] = var2;
                    field1356 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1335 != null) {
            field1354 = -1;
        }
    }
}
