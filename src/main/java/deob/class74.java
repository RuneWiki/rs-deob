package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("bq")
public final class class74 implements KeyListener, FocusListener {

    @ObfuscatedName("bq.g")
    public static class74 field1360 = new class74();

    @ObfuscatedName("bq.cg")
    public static boolean[] field1352 = new boolean[112];

    @ObfuscatedName("bq.cv")
    public static int[] field1353 = new int[128];

    @ObfuscatedName("bq.cn")
    public static int field1354 = 0;

    @ObfuscatedName("bq.cc")
    public static int field1338 = 0;

    @ObfuscatedName("bq.co")
    public static char[] field1356 = new char[128];

    @ObfuscatedName("bq.cs")
    public static int[] field1344 = new int[128];

    @ObfuscatedName("bq.ca")
    public static int field1358 = 0;

    @ObfuscatedName("bq.cu")
    public static int field1359 = 0;

    @ObfuscatedName("bq.cp")
    public static int field1346 = 0;

    @ObfuscatedName("bq.cr")
    public static volatile int field1337 = 0;

    @ObfuscatedName("bq.ch")
    public static int[] field1362 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("bz.g(B)V")
    public static void method1411() {
        if (Statics.field1335.toLowerCase().indexOf("microsoft") != -1) {
            field1362[186] = 57;
            field1362[187] = 27;
            field1362[188] = 71;
            field1362[189] = 26;
            field1362[190] = 72;
            field1362[191] = 73;
            field1362[192] = 58;
            field1362[219] = 42;
            field1362[220] = 74;
            field1362[221] = 43;
            field1362[222] = 59;
            field1362[223] = 28;
            return;
        }
        field1362[44] = 71;
        field1362[45] = 26;
        field1362[46] = 72;
        field1362[47] = 73;
        field1362[59] = 57;
        field1362[61] = 27;
        field1362[91] = 42;
        field1362[92] = 74;
        field1362[93] = 43;
        field1362[192] = 28;
        field1362[222] = 58;
        field1362[520] = 59;
    }

    @ObfuscatedName("f.e(Ljava/awt/Component;I)V")
    public static void method202(Component arg0) {
        arg0.removeKeyListener(field1360);
        arg0.removeFocusListener(field1360);
        field1338 = -1;
    }

    @ObfuscatedName("u.n(I)V")
    public static void method212() {
        if (field1360 != null) {
            class74 var0 = field1360;
            synchronized (field1360) {
                field1360 = null;
            }
        }
    }

    @ObfuscatedName("bv.j(I)V")
    public static void method1343() {
        class74 var0 = field1360;
        synchronized (field1360) {
            field1337++;
            field1358 = field1346;
            if (field1338 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1352[var1] = false;
                }
                field1338 = field1354;
            } else {
                while (field1354 != field1338) {
                    int var2 = field1353[field1354];
                    field1354 = field1354 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1352[~var2] = false;
                    } else {
                        field1352[var2] = true;
                    }
                }
            }
            field1346 = field1359;
        }
    }

    @ObfuscatedName("q.i(I)Z")
    public static final boolean method114() {
        class74 var0 = field1360;
        synchronized (field1360) {
            if (field1358 == field1346) {
                return false;
            } else {
                Statics.field1798 = field1344[field1358];
                Statics.field201 = field1356[field1358];
                field1358 = field1358 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1360 == null) {
            return;
        }
        field1337 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1362.length) {
            var3 = field1362[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1338 >= 0 && var3 >= 0) {
            field1353[field1338] = var3;
            field1338 = field1338 + 1 & 0x7F;
            if (field1354 == field1338) {
                field1338 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1359 + 1 & 0x7F;
            if (field1358 != var4) {
                field1344[field1359] = var3;
                field1356[field1359] = 0;
                field1359 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1360 != null) {
            field1337 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1362.length) {
                var3 = field1362[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1338 >= 0 && var3 >= 0) {
                field1353[field1338] = ~var3;
                field1338 = field1338 + 1 & 0x7F;
                if (field1354 == field1338) {
                    field1338 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1360 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class148.method38(var2)) {
                int var3 = field1359 + 1 & 0x7F;
                if (field1358 != var3) {
                    field1344[field1359] = -1;
                    field1356[field1359] = var2;
                    field1359 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1360 != null) {
            field1338 = -1;
        }
    }
}
