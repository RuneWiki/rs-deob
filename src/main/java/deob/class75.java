package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("by")
public final class class75 implements KeyListener, FocusListener {

    @ObfuscatedName("by.b")
    public static class75 field1352 = new class75();

    @ObfuscatedName("by.cy")
    public static boolean[] field1343 = new boolean[112];

    @ObfuscatedName("by.cx")
    public static int[] field1351 = new int[128];

    @ObfuscatedName("by.cl")
    public static int field1367 = 0;

    @ObfuscatedName("by.cg")
    public static int field1353 = 0;

    @ObfuscatedName("by.cj")
    public static char[] field1337 = new char[128];

    @ObfuscatedName("by.cf")
    public static int[] field1355 = new int[128];

    @ObfuscatedName("by.cq")
    public static int[] field1348 = new int[128];

    @ObfuscatedName("by.cc")
    public static int field1357 = 0;

    @ObfuscatedName("by.ci")
    public static int field1359 = 0;

    @ObfuscatedName("by.co")
    public static int field1350 = 0;

    @ObfuscatedName("by.cd")
    public static int field1347 = 0;

    @ObfuscatedName("by.cm")
    public static volatile int field1361 = 0;

    @ObfuscatedName("by.cu")
    public static int[] field1362 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("aa.b(I)V")
    public static void method785() {
        if (Statics.field1326.toLowerCase().indexOf("microsoft") != -1) {
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

    @ObfuscatedName("p.e(I)V")
    public static void method206() {
        if (field1352 != null) {
            class75 var0 = field1352;
            synchronized (field1352) {
                field1352 = null;
            }
        }
    }

    @ObfuscatedName("aa.g(I)V")
    public static void method789() {
        class75 var0 = field1352;
        synchronized (field1352) {
            field1361++;
            field1359 = field1347;
            field1357 = 0;
            if (field1353 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1343[var1] = false;
                }
                field1353 = field1367;
            } else {
                while (field1367 != field1353) {
                    int var2 = field1351[field1367];
                    field1367 = field1367 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1343[~var2] = false;
                    } else {
                        if (!field1343[var2] && field1357 < field1348.length - 1) {
                            field1348[++field1357 - 1] = var2;
                        }
                        field1343[var2] = true;
                    }
                }
            }
            field1347 = field1350;
        }
    }

    @ObfuscatedName("ax.o(B)Z")
    public static final boolean method556() {
        class75 var0 = field1352;
        synchronized (field1352) {
            if (field1359 == field1347) {
                return false;
            } else {
                Statics.field1496 = field1355[field1359];
                Statics.field1248 = field1337[field1359];
                field1359 = field1359 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("d.a(B)I")
    public static int method99() {
        return field1361;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1352 == null) {
            return;
        }
        field1361 = 0;
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
        if (field1353 >= 0 && var3 >= 0) {
            field1351[field1353] = var3;
            field1353 = field1353 + 1 & 0x7F;
            if (field1367 == field1353) {
                field1353 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1350 + 1 & 0x7F;
            if (field1359 != var4) {
                field1355[field1350] = var3;
                field1337[field1350] = 0;
                field1350 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1352 != null) {
            field1361 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1362.length) {
                var3 = field1362[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1353 >= 0 && var3 >= 0) {
                field1351[field1353] = ~var3;
                field1353 = field1353 + 1 & 0x7F;
                if (field1367 == field1353) {
                    field1353 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1352 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class150.field2474;
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
                    int var7 = field1350 + 1 & 0x7F;
                    if (field1359 != var7) {
                        field1355[field1350] = -1;
                        field1337[field1350] = var2;
                        field1350 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1352 != null) {
            field1353 = -1;
        }
    }
}
