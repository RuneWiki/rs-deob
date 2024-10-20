package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("bj")
public final class class76 implements KeyListener, FocusListener {

    @ObfuscatedName("bj.i")
    public static class76 field1391 = new class76();

    @ObfuscatedName("bj.cz")
    public static boolean[] field1390 = new boolean[112];

    @ObfuscatedName("bj.cr")
    public static int[] field1364 = new int[128];

    @ObfuscatedName("bj.cu")
    public static int field1363 = 0;

    @ObfuscatedName("bj.ce")
    public static int field1374 = 0;

    @ObfuscatedName("bj.ci")
    public static char[] field1361 = new char[128];

    @ObfuscatedName("bj.cf")
    public static int[] field1383 = new int[128];

    @ObfuscatedName("bj.cx")
    public static int[] field1384 = new int[128];

    @ObfuscatedName("bj.ca")
    public static int field1385 = 0;

    @ObfuscatedName("bj.ct")
    public static int field1386 = 0;

    @ObfuscatedName("bj.cp")
    public static int field1387 = 0;

    @ObfuscatedName("bj.cc")
    public static int field1388 = 0;

    @ObfuscatedName("bj.cq")
    public static volatile int field1389 = 0;

    @ObfuscatedName("bj.cw")
    public static int[] field1370 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("bv.i(Ljava/awt/Component;I)V")
    public static void method1399(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1391);
        arg0.addFocusListener(field1391);
    }

    @ObfuscatedName("cj.b(Ljava/awt/Component;B)V")
    public static void method1619(Component arg0) {
        arg0.removeKeyListener(field1391);
        arg0.removeFocusListener(field1391);
        field1374 = -1;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1391 == null) {
            return;
        }
        field1389 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1370.length) {
            var3 = field1370[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1374 >= 0 && var3 >= 0) {
            field1364[field1374] = var3;
            field1374 = field1374 + 1 & 0x7F;
            if (field1374 == field1363) {
                field1374 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1387 + 1 & 0x7F;
            if (field1386 != var4) {
                field1383[field1387] = var3;
                field1361[field1387] = 0;
                field1387 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1391 != null) {
            field1389 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1370.length) {
                var3 = field1370[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1374 >= 0 && var3 >= 0) {
                field1364[field1374] = ~var3;
                field1374 = field1374 + 1 & 0x7F;
                if (field1374 == field1363) {
                    field1374 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1391 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class152.method2806(var2)) {
                int var3 = field1387 + 1 & 0x7F;
                if (field1386 != var3) {
                    field1383[field1387] = -1;
                    field1361[field1387] = var2;
                    field1387 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1391 != null) {
            field1374 = -1;
        }
    }
}
