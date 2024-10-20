package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("bo")
public final class class75 implements KeyListener, FocusListener {

    @ObfuscatedName("bo.i")
    public static class75 field1367 = new class75();

    @ObfuscatedName("bo.cn")
    public static boolean[] field1384 = new boolean[112];

    @ObfuscatedName("bo.cc")
    public static int[] field1377 = new int[128];

    @ObfuscatedName("bo.cd")
    public static int field1380 = 0;

    @ObfuscatedName("bo.cz")
    public static int field1366 = 0;

    @ObfuscatedName("bo.ct")
    public static char[] field1382 = new char[128];

    @ObfuscatedName("bo.cv")
    public static int[] field1383 = new int[128];

    @ObfuscatedName("bo.cl")
    public static int[] field1379 = new int[128];

    @ObfuscatedName("bo.cx")
    public static int field1385 = 0;

    @ObfuscatedName("bo.cu")
    public static int field1386 = 0;

    @ObfuscatedName("bo.ck")
    public static int field1387 = 0;

    @ObfuscatedName("bo.cg")
    public static int field1388 = 0;

    @ObfuscatedName("bo.cb")
    public static volatile int field1376 = 0;

    @ObfuscatedName("bo.cm")
    public static int[] field1390 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("a.i(B)V")
    public static void method29() {
        if (Statics.field1762.toLowerCase().indexOf("microsoft") != -1) {
            field1390[186] = 57;
            field1390[187] = 27;
            field1390[188] = 71;
            field1390[189] = 26;
            field1390[190] = 72;
            field1390[191] = 73;
            field1390[192] = 58;
            field1390[219] = 42;
            field1390[220] = 74;
            field1390[221] = 43;
            field1390[222] = 59;
            field1390[223] = 28;
            return;
        }
        field1390[44] = 71;
        field1390[45] = 26;
        field1390[46] = 72;
        field1390[47] = 73;
        field1390[59] = 57;
        field1390[61] = 27;
        field1390[91] = 42;
        field1390[92] = 74;
        field1390[93] = 43;
        field1390[192] = 28;
        field1390[222] = 58;
        field1390[520] = 59;
    }

    @ObfuscatedName("ey.p(Ljava/awt/Component;I)V")
    public static void method2818(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1367);
        arg0.addFocusListener(field1367);
    }

    @ObfuscatedName("be.a(Ljava/awt/Component;I)V")
    public static void method1376(Component arg0) {
        arg0.removeKeyListener(field1367);
        arg0.removeFocusListener(field1367);
        field1366 = -1;
    }

    @ObfuscatedName("dm.l(B)Z")
    public static final boolean method2256() {
        class75 var0 = field1367;
        synchronized (field1367) {
            if (field1388 == field1386) {
                return false;
            } else {
                Statics.field430 = field1383[field1386];
                Statics.field2071 = field1382[field1386];
                field1386 = field1386 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("d.q(I)I")
    public static int method68() {
        return field1376;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1367 == null) {
            return;
        }
        field1376 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1390.length) {
            var3 = field1390[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1366 >= 0 && var3 >= 0) {
            field1377[field1366] = var3;
            field1366 = field1366 + 1 & 0x7F;
            if (field1380 == field1366) {
                field1366 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1387 + 1 & 0x7F;
            if (field1386 != var4) {
                field1383[field1387] = var3;
                field1382[field1387] = 0;
                field1387 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1367 != null) {
            field1376 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1390.length) {
                var3 = field1390[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1366 >= 0 && var3 >= 0) {
                field1377[field1366] = ~var3;
                field1366 = field1366 + 1 & 0x7F;
                if (field1380 == field1366) {
                    field1366 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1367 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class149.field2464;
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
                    int var7 = field1387 + 1 & 0x7F;
                    if (field1386 != var7) {
                        field1383[field1387] = -1;
                        field1382[field1387] = var2;
                        field1387 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1367 != null) {
            field1366 = -1;
        }
    }
}
