package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("bv")
public final class class75 implements KeyListener, FocusListener {

    @ObfuscatedName("bv.a")
    public static class75 field1368 = new class75();

    @ObfuscatedName("bv.cf")
    public static boolean[] field1364 = new boolean[112];

    @ObfuscatedName("bv.cu")
    public static int[] field1370 = new int[128];

    @ObfuscatedName("bv.cp")
    public static int field1371 = 0;

    @ObfuscatedName("bv.cb")
    public static int field1384 = 0;

    @ObfuscatedName("bv.cy")
    public static char[] field1373 = new char[128];

    @ObfuscatedName("bv.ci")
    public static int[] field1380 = new int[128];

    @ObfuscatedName("bv.cx")
    public static int[] field1382 = new int[128];

    @ObfuscatedName("bv.cz")
    public static int field1376 = 0;

    @ObfuscatedName("bv.ca")
    public static int field1377 = 0;

    @ObfuscatedName("bv.cn")
    public static int field1378 = 0;

    @ObfuscatedName("bv.cs")
    public static int field1379 = 0;

    @ObfuscatedName("bv.cg")
    public static volatile int field1357 = 0;

    @ObfuscatedName("bv.cc")
    public static int[] field1381 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("av.a(I)V")
    public static void method748() {
        if (Statics.field1351.toLowerCase().indexOf("microsoft") != -1) {
            field1381[186] = 57;
            field1381[187] = 27;
            field1381[188] = 71;
            field1381[189] = 26;
            field1381[190] = 72;
            field1381[191] = 73;
            field1381[192] = 58;
            field1381[219] = 42;
            field1381[220] = 74;
            field1381[221] = 43;
            field1381[222] = 59;
            field1381[223] = 28;
            return;
        }
        field1381[44] = 71;
        field1381[45] = 26;
        field1381[46] = 72;
        field1381[47] = 73;
        field1381[59] = 57;
        field1381[61] = 27;
        field1381[91] = 42;
        field1381[92] = 74;
        field1381[93] = 43;
        field1381[192] = 28;
        field1381[222] = 58;
        field1381[520] = 59;
    }

    @ObfuscatedName("d.x(I)V")
    public static void method180() {
        if (field1368 != null) {
            class75 var0 = field1368;
            synchronized (field1368) {
                field1368 = null;
            }
        }
    }

    @ObfuscatedName("bc.e(I)V")
    public static void method1334() {
        class75 var0 = field1368;
        synchronized (field1368) {
            field1357++;
            field1377 = field1379;
            field1376 = 0;
            if (field1384 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1364[var1] = false;
                }
                field1384 = field1371;
            } else {
                while (field1384 != field1371) {
                    int var2 = field1370[field1371];
                    field1371 = field1371 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1364[~var2] = false;
                    } else {
                        if (!field1364[var2] && field1376 < field1382.length - 1) {
                            field1382[++field1376 - 1] = var2;
                        }
                        field1364[var2] = true;
                    }
                }
            }
            field1379 = field1378;
        }
    }

    @ObfuscatedName("bs.r(I)Z")
    public static final boolean method1331() {
        class75 var0 = field1368;
        synchronized (field1368) {
            if (field1379 == field1377) {
                return false;
            } else {
                Statics.field1369 = field1380[field1377];
                Statics.field271 = field1373[field1377];
                field1377 = field1377 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1368 == null) {
            return;
        }
        field1357 = 0;
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
        if (field1384 >= 0 && var3 >= 0) {
            field1370[field1384] = var3;
            field1384 = field1384 + 1 & 0x7F;
            if (field1384 == field1371) {
                field1384 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1378 + 1 & 0x7F;
            if (field1377 != var4) {
                field1380[field1378] = var3;
                field1373[field1378] = 0;
                field1378 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1368 != null) {
            field1357 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1381.length) {
                var3 = field1381[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1384 >= 0 && var3 >= 0) {
                field1370[field1384] = ~var3;
                field1384 = field1384 + 1 & 0x7F;
                if (field1384 == field1371) {
                    field1384 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1368 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class149.method17(var2)) {
                int var3 = field1378 + 1 & 0x7F;
                if (field1377 != var3) {
                    field1380[field1378] = -1;
                    field1373[field1378] = var2;
                    field1378 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1368 != null) {
            field1384 = -1;
        }
    }
}
