package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("bm")
public final class class75 implements KeyListener, FocusListener {

    @ObfuscatedName("bm.p")
    public static class75 field1363 = new class75();

    @ObfuscatedName("bm.ct")
    public static boolean[] field1348 = new boolean[112];

    @ObfuscatedName("bm.ca")
    public static int[] field1355 = new int[128];

    @ObfuscatedName("bm.cx")
    public static int field1350 = 0;

    @ObfuscatedName("bm.ck")
    public static int field1351 = 0;

    @ObfuscatedName("bm.cc")
    public static char[] field1333 = new char[128];

    @ObfuscatedName("bm.cy")
    public static int[] field1353 = new int[128];

    @ObfuscatedName("bm.cr")
    public static int[] field1354 = new int[128];

    @ObfuscatedName("bm.cf")
    public static int field1352 = 0;

    @ObfuscatedName("bm.cs")
    public static int field1356 = 0;

    @ObfuscatedName("bm.cq")
    public static int field1357 = 0;

    @ObfuscatedName("bm.cp")
    public static int field1345 = 0;

    @ObfuscatedName("bm.cn")
    public static volatile int field1359 = 0;

    @ObfuscatedName("bm.cm")
    public static int[] field1360 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("y.p(I)V")
    public static void method65() {
        if (Statics.field1330.toLowerCase().indexOf("microsoft") != -1) {
            field1360[186] = 57;
            field1360[187] = 27;
            field1360[188] = 71;
            field1360[189] = 26;
            field1360[190] = 72;
            field1360[191] = 73;
            field1360[192] = 58;
            field1360[219] = 42;
            field1360[220] = 74;
            field1360[221] = 43;
            field1360[222] = 59;
            field1360[223] = 28;
            return;
        }
        field1360[44] = 71;
        field1360[45] = 26;
        field1360[46] = 72;
        field1360[47] = 73;
        field1360[59] = 57;
        field1360[61] = 27;
        field1360[91] = 42;
        field1360[92] = 74;
        field1360[93] = 43;
        field1360[192] = 28;
        field1360[222] = 58;
        field1360[520] = 59;
    }

    @ObfuscatedName("dc.l(Ljava/awt/Component;I)V")
    public static void method2726(Component arg0) {
        arg0.removeKeyListener(field1363);
        arg0.removeFocusListener(field1363);
        field1351 = -1;
    }

    @ObfuscatedName("ao.d(B)V")
    public static void method1203() {
        if (field1363 != null) {
            class75 var0 = field1363;
            synchronized (field1363) {
                field1363 = null;
            }
        }
    }

    @ObfuscatedName("q.x(I)V")
    public static void method209() {
        class75 var0 = field1363;
        synchronized (field1363) {
            field1359++;
            field1356 = field1345;
            field1352 = 0;
            if (field1351 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1348[var1] = false;
                }
                field1351 = field1350;
            } else {
                while (field1351 != field1350) {
                    int var2 = field1355[field1350];
                    field1350 = field1350 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1348[~var2] = false;
                    } else {
                        if (!field1348[var2] && field1352 < field1354.length - 1) {
                            field1354[++field1352 - 1] = var2;
                        }
                        field1348[var2] = true;
                    }
                }
            }
            field1345 = field1357;
        }
    }

    @ObfuscatedName("aq.o(B)I")
    public static int method919() {
        return field1359;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1363 == null) {
            return;
        }
        field1359 = 0;
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
        if (field1351 >= 0 && var3 >= 0) {
            field1355[field1351] = var3;
            field1351 = field1351 + 1 & 0x7F;
            if (field1351 == field1350) {
                field1351 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1357 + 1 & 0x7F;
            if (field1356 != var4) {
                field1353[field1357] = var3;
                field1333[field1357] = 0;
                field1357 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1363 != null) {
            field1359 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1360.length) {
                var3 = field1360[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1351 >= 0 && var3 >= 0) {
                field1355[field1351] = ~var3;
                field1351 = field1351 + 1 & 0x7F;
                if (field1351 == field1350) {
                    field1351 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1363 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class150.method1714(var2)) {
                int var3 = field1357 + 1 & 0x7F;
                if (field1356 != var3) {
                    field1353[field1357] = -1;
                    field1333[field1357] = var2;
                    field1357 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1363 != null) {
            field1351 = -1;
        }
    }
}
