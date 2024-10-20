package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("br")
public final class class75 implements KeyListener, FocusListener {

    @ObfuscatedName("br.c")
    public static class75 field1387 = new class75();

    @ObfuscatedName("br.cw")
    public static boolean[] field1370 = new boolean[112];

    @ObfuscatedName("br.cx")
    public static int[] field1377 = new int[128];

    @ObfuscatedName("br.ct")
    public static int field1375 = 0;

    @ObfuscatedName("br.cm")
    public static int field1379 = 0;

    @ObfuscatedName("br.cc")
    public static char[] field1380 = new char[128];

    @ObfuscatedName("br.cn")
    public static int[] field1381 = new int[128];

    @ObfuscatedName("br.ck")
    public static int[] field1374 = new int[128];

    @ObfuscatedName("br.ca")
    public static int field1383 = 0;

    @ObfuscatedName("br.cl")
    public static int field1384 = 0;

    @ObfuscatedName("br.cs")
    public static int field1385 = 0;

    @ObfuscatedName("br.cb")
    public static int field1386 = 0;

    @ObfuscatedName("br.cv")
    public static volatile int field1391 = 0;

    @ObfuscatedName("br.cz")
    public static int[] field1360 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("bt.c(I)V")
    public static void method1327() {
        if (Statics.field1355.toLowerCase().indexOf("microsoft") != -1) {
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

    @ObfuscatedName("q.q(Ljava/awt/Component;I)V")
    public static void method5(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1387);
        arg0.addFocusListener(field1387);
    }

    @ObfuscatedName("f.y(Ljava/awt/Component;I)V")
    public static void method155(Component arg0) {
        arg0.removeKeyListener(field1387);
        arg0.removeFocusListener(field1387);
        field1379 = -1;
    }

    @ObfuscatedName("ap.v(I)V")
    public static void method243() {
        if (field1387 != null) {
            class75 var0 = field1387;
            synchronized (field1387) {
                field1387 = null;
            }
        }
    }

    @ObfuscatedName("ej.g(I)Z")
    public static final boolean method2733() {
        class75 var0 = field1387;
        synchronized (field1387) {
            if (field1386 == field1384) {
                return false;
            } else {
                Statics.field879 = field1381[field1384];
                Statics.field783 = field1380[field1384];
                field1384 = field1384 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("bk.x(I)I")
    public static int method1336() {
        return field1391;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1387 == null) {
            return;
        }
        field1391 = 0;
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
        if (field1379 >= 0 && var3 >= 0) {
            field1377[field1379] = var3;
            field1379 = field1379 + 1 & 0x7F;
            if (field1379 == field1375) {
                field1379 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1385 + 1 & 0x7F;
            if (field1384 != var4) {
                field1381[field1385] = var3;
                field1380[field1385] = 0;
                field1385 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1387 != null) {
            field1391 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1360.length) {
                var3 = field1360[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1379 >= 0 && var3 >= 0) {
                field1377[field1379] = ~var3;
                field1379 = field1379 + 1 & 0x7F;
                if (field1379 == field1375) {
                    field1379 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1387 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class150.field2494;
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
                    int var7 = field1385 + 1 & 0x7F;
                    if (field1384 != var7) {
                        field1381[field1385] = -1;
                        field1380[field1385] = var2;
                        field1385 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1387 != null) {
            field1379 = -1;
        }
    }
}
