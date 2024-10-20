package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("bo")
public final class class75 implements KeyListener, FocusListener {

    @ObfuscatedName("bo.i")
    public static class75 field1374 = new class75();

    @ObfuscatedName("bo.cj")
    public static boolean[] field1362 = new boolean[112];

    @ObfuscatedName("bo.cp")
    public static int[] field1363 = new int[128];

    @ObfuscatedName("bo.ci")
    public static int field1364 = 0;

    @ObfuscatedName("bo.cn")
    public static int field1365 = 0;

    @ObfuscatedName("bo.cr")
    public static char[] field1366 = new char[128];

    @ObfuscatedName("bo.cy")
    public static int[] field1367 = new int[128];

    @ObfuscatedName("bo.ct")
    public static int[] field1368 = new int[128];

    @ObfuscatedName("bo.ch")
    public static int field1369 = 0;

    @ObfuscatedName("bo.ck")
    public static int field1370 = 0;

    @ObfuscatedName("bo.cb")
    public static int field1371 = 0;

    @ObfuscatedName("bo.cg")
    public static int field1355 = 0;

    @ObfuscatedName("bo.cm")
    public static volatile int field1373 = 0;

    @ObfuscatedName("bo.cw")
    public static int[] field1349 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("bp.i(Ljava/awt/Component;B)V")
    public static void method1444(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1374);
        arg0.addFocusListener(field1374);
    }

    @ObfuscatedName("ay.v(Ljava/awt/Component;I)V")
    public static void method931(Component arg0) {
        arg0.removeKeyListener(field1374);
        arg0.removeFocusListener(field1374);
        field1365 = -1;
    }

    @ObfuscatedName("ci.m(B)V")
    public static void method1881() {
        if (field1374 != null) {
            class75 var0 = field1374;
            synchronized (field1374) {
                field1374 = null;
            }
        }
    }

    @ObfuscatedName("dt.j(B)V")
    public static void method2392() {
        class75 var0 = field1374;
        synchronized (field1374) {
            field1373++;
            field1370 = field1355;
            field1369 = 0;
            if (field1365 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1362[var1] = false;
                }
                field1365 = field1364;
            } else {
                while (field1365 != field1364) {
                    int var2 = field1363[field1364];
                    field1364 = field1364 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1362[~var2] = false;
                    } else {
                        if (!field1362[var2] && field1369 < field1368.length - 1) {
                            field1368[++field1369 - 1] = var2;
                        }
                        field1362[var2] = true;
                    }
                }
            }
            field1355 = field1371;
        }
    }

    @ObfuscatedName("bt.o(I)Z")
    public static final boolean method1438() {
        class75 var0 = field1374;
        synchronized (field1374) {
            if (field1370 == field1355) {
                return false;
            } else {
                Statics.field1555 = field1367[field1370];
                Statics.field1187 = field1366[field1370];
                field1370 = field1370 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("br.l(I)I")
    public static int method1266() {
        return field1373;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1374 == null) {
            return;
        }
        field1373 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1349.length) {
            var3 = field1349[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1365 >= 0 && var3 >= 0) {
            field1363[field1365] = var3;
            field1365 = field1365 + 1 & 0x7F;
            if (field1365 == field1364) {
                field1365 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1371 + 1 & 0x7F;
            if (field1370 != var4) {
                field1367[field1371] = var3;
                field1366[field1371] = 0;
                field1371 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1374 != null) {
            field1373 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1349.length) {
                var3 = field1349[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1365 >= 0 && var3 >= 0) {
                field1363[field1365] = ~var3;
                field1365 = field1365 + 1 & 0x7F;
                if (field1365 == field1364) {
                    field1365 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1374 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class149.field2456;
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
                    int var7 = field1371 + 1 & 0x7F;
                    if (field1370 != var7) {
                        field1367[field1371] = -1;
                        field1366[field1371] = var2;
                        field1371 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1374 != null) {
            field1365 = -1;
        }
    }
}
