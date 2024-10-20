package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("bm")
public final class class75 implements KeyListener, FocusListener {

    @ObfuscatedName("bm.a")
    public static class75 field1335 = new class75();

    @ObfuscatedName("bm.cb")
    public static boolean[] field1339 = new boolean[112];

    @ObfuscatedName("bm.cq")
    public static int[] field1340 = new int[128];

    @ObfuscatedName("bm.cz")
    public static int field1354 = 0;

    @ObfuscatedName("bm.cx")
    public static int field1342 = 0;

    @ObfuscatedName("bm.cg")
    public static char[] field1343 = new char[128];

    @ObfuscatedName("bm.cv")
    public static int[] field1344 = new int[128];

    @ObfuscatedName("bm.ch")
    public static int[] field1345 = new int[128];

    @ObfuscatedName("bm.cf")
    public static int field1346 = 0;

    @ObfuscatedName("bm.cu")
    public static int field1355 = 0;

    @ObfuscatedName("bm.cs")
    public static int field1322 = 0;

    @ObfuscatedName("bm.cc")
    public static int field1349 = 0;

    @ObfuscatedName("bm.cd")
    public static volatile int field1350 = 0;

    @ObfuscatedName("bm.ck")
    public static int[] field1351 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("dz.a(Ljava/awt/Component;B)V")
    public static void method2253(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1335);
        arg0.addFocusListener(field1335);
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1335 == null) {
            return;
        }
        field1350 = 0;
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
        if (field1342 >= 0 && var3 >= 0) {
            field1340[field1342] = var3;
            field1342 = field1342 + 1 & 0x7F;
            if (field1354 == field1342) {
                field1342 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1322 + 1 & 0x7F;
            if (field1355 != var4) {
                field1344[field1322] = var3;
                field1343[field1322] = 0;
                field1322 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1335 != null) {
            field1350 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1351.length) {
                var3 = field1351[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1342 >= 0 && var3 >= 0) {
                field1340[field1342] = ~var3;
                field1342 = field1342 + 1 & 0x7F;
                if (field1354 == field1342) {
                    field1342 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1335 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class149.method2619(var2)) {
                int var3 = field1322 + 1 & 0x7F;
                if (field1355 != var3) {
                    field1344[field1322] = -1;
                    field1343[field1322] = var2;
                    field1322 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1335 != null) {
            field1342 = -1;
        }
    }
}
