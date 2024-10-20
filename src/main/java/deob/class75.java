package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("bk")
public final class class75 implements KeyListener, FocusListener {

    @ObfuscatedName("bk.x")
    public static class75 field1338 = new class75();

    @ObfuscatedName("bk.ci")
    public static boolean[] field1331 = new boolean[112];

    @ObfuscatedName("bk.cp")
    public static int[] field1336 = new int[128];

    @ObfuscatedName("bk.cj")
    public static int field1337 = 0;

    @ObfuscatedName("bk.cg")
    public static int field1342 = 0;

    @ObfuscatedName("bk.ch")
    public static char[] field1339 = new char[128];

    @ObfuscatedName("bk.ct")
    public static int[] field1341 = new int[128];

    @ObfuscatedName("bk.cz")
    public static int[] field1328 = new int[128];

    @ObfuscatedName("bk.cd")
    public static int field1335 = 0;

    @ObfuscatedName("bk.cf")
    public static int field1343 = 0;

    @ObfuscatedName("bk.cv")
    public static int field1344 = 0;

    @ObfuscatedName("bk.cx")
    public static int field1345 = 0;

    @ObfuscatedName("bk.cw")
    public static volatile int field1346 = 0;

    @ObfuscatedName("bk.cy")
    public static int[] field1320 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("am.x(B)V")
    public static void method652() {
        if (Statics.field1311.toLowerCase().indexOf("microsoft") != -1) {
            field1320[186] = 57;
            field1320[187] = 27;
            field1320[188] = 71;
            field1320[189] = 26;
            field1320[190] = 72;
            field1320[191] = 73;
            field1320[192] = 58;
            field1320[219] = 42;
            field1320[220] = 74;
            field1320[221] = 43;
            field1320[222] = 59;
            field1320[223] = 28;
            return;
        }
        field1320[44] = 71;
        field1320[45] = 26;
        field1320[46] = 72;
        field1320[47] = 73;
        field1320[59] = 57;
        field1320[61] = 27;
        field1320[91] = 42;
        field1320[92] = 74;
        field1320[93] = 43;
        field1320[192] = 28;
        field1320[222] = 58;
        field1320[520] = 59;
    }

    @ObfuscatedName("cw.p(I)V")
    public static void method2001() {
        if (field1338 != null) {
            class75 var0 = field1338;
            synchronized (field1338) {
                field1338 = null;
            }
        }
    }

    @ObfuscatedName("al.k(I)V")
    public static void method560() {
        class75 var0 = field1338;
        synchronized (field1338) {
            field1346++;
            field1343 = field1345;
            field1335 = 0;
            if (field1342 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1331[var1] = false;
                }
                field1342 = field1337;
            } else {
                while (field1342 != field1337) {
                    int var2 = field1336[field1337];
                    field1337 = field1337 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1331[~var2] = false;
                    } else {
                        if (!field1331[var2] && field1335 < field1328.length - 1) {
                            field1328[++field1335 - 1] = var2;
                        }
                        field1331[var2] = true;
                    }
                }
            }
            field1345 = field1344;
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1338 == null) {
            return;
        }
        field1346 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1320.length) {
            var3 = field1320[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1342 >= 0 && var3 >= 0) {
            field1336[field1342] = var3;
            field1342 = field1342 + 1 & 0x7F;
            if (field1342 == field1337) {
                field1342 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1344 + 1 & 0x7F;
            if (field1343 != var4) {
                field1341[field1344] = var3;
                field1339[field1344] = 0;
                field1344 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1338 != null) {
            field1346 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1320.length) {
                var3 = field1320[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1342 >= 0 && var3 >= 0) {
                field1336[field1342] = ~var3;
                field1342 = field1342 + 1 & 0x7F;
                if (field1342 == field1337) {
                    field1342 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1338 != null) {
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
                    int var7 = field1344 + 1 & 0x7F;
                    if (field1343 != var7) {
                        field1341[field1344] = -1;
                        field1339[field1344] = var2;
                        field1344 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1338 != null) {
            field1342 = -1;
        }
    }
}
