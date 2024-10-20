package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ba")
public final class class76 implements KeyListener, FocusListener {

    @ObfuscatedName("ba.e")
    public static class76 field1379 = new class76();

    @ObfuscatedName("ba.cw")
    public static boolean[] field1369 = new boolean[112];

    @ObfuscatedName("ba.ce")
    public static int[] field1370 = new int[128];

    @ObfuscatedName("ba.cv")
    public static int field1371 = 0;

    @ObfuscatedName("ba.cz")
    public static int field1360 = 0;

    @ObfuscatedName("ba.cs")
    public static char[] field1372 = new char[128];

    @ObfuscatedName("ba.ck")
    public static int[] field1374 = new int[128];

    @ObfuscatedName("ba.co")
    public static int[] field1375 = new int[128];

    @ObfuscatedName("ba.ci")
    public static int field1380 = 0;

    @ObfuscatedName("ba.ct")
    public static int field1377 = 0;

    @ObfuscatedName("ba.cj")
    public static int field1378 = 0;

    @ObfuscatedName("ba.cy")
    public static int field1376 = 0;

    @ObfuscatedName("ba.ca")
    public static volatile int field1364 = 0;

    @ObfuscatedName("ba.cu")
    public static int[] field1381 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("ao.e(Ljava/awt/Component;I)V")
    public static void method284(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1379);
        arg0.addFocusListener(field1379);
    }

    @ObfuscatedName("bh.i(Ljava/awt/Component;I)V")
    public static void method1428(Component arg0) {
        arg0.removeKeyListener(field1379);
        arg0.removeFocusListener(field1379);
        field1360 = -1;
    }

    @ObfuscatedName("bc.k(B)Z")
    public static final boolean method1483() {
        class76 var0 = field1379;
        synchronized (field1379) {
            if (field1377 == field1376) {
                return false;
            } else {
                Statics.field91 = field1374[field1377];
                Statics.field1050 = field1372[field1377];
                field1377 = field1377 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1379 == null) {
            return;
        }
        field1364 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1381.length) {
            var3 = field1381[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1360 >= 0 && var3 >= 0) {
            field1370[field1360] = var3;
            field1360 = field1360 + 1 & 0x7F;
            if (field1371 == field1360) {
                field1360 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1378 + 1 & 0x7F;
            if (field1377 != var4) {
                field1374[field1378] = var3;
                field1372[field1378] = 0;
                field1378 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1379 != null) {
            field1364 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1381.length) {
                var3 = field1381[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1360 >= 0 && var3 >= 0) {
                field1370[field1360] = ~var3;
                field1360 = field1360 + 1 & 0x7F;
                if (field1371 == field1360) {
                    field1360 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1379 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && Statics.method2047(var2)) {
                int var3 = field1378 + 1 & 0x7F;
                if (field1377 != var3) {
                    field1374[field1378] = -1;
                    field1372[field1378] = var2;
                    field1378 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1379 != null) {
            field1360 = -1;
        }
    }
}
