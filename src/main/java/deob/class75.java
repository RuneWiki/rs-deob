package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("by")
public final class class75 implements KeyListener, FocusListener {

    @ObfuscatedName("by.b")
    public static class75 field1385 = new class75();

    @ObfuscatedName("by.cq")
    public static boolean[] field1386 = new boolean[112];

    @ObfuscatedName("by.cw")
    public static int[] field1388 = new int[128];

    @ObfuscatedName("by.cz")
    public static int field1389 = 0;

    @ObfuscatedName("by.ch")
    public static int field1390 = 0;

    @ObfuscatedName("by.cv")
    public static char[] field1391 = new char[128];

    @ObfuscatedName("by.cm")
    public static int[] field1392 = new int[128];

    @ObfuscatedName("by.ck")
    public static int[] field1393 = new int[128];

    @ObfuscatedName("by.cd")
    public static int field1380 = 0;

    @ObfuscatedName("by.cn")
    public static int field1395 = 0;

    @ObfuscatedName("by.cf")
    public static int field1396 = 0;

    @ObfuscatedName("by.co")
    public static int field1397 = 0;

    @ObfuscatedName("by.cp")
    public static volatile int field1398 = 0;

    @ObfuscatedName("by.cu")
    public static int[] field1384 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("bg.b(I)V")
    public static void method1486() {
        if (Statics.field1365.toLowerCase().indexOf("microsoft") != -1) {
            field1384[186] = 57;
            field1384[187] = 27;
            field1384[188] = 71;
            field1384[189] = 26;
            field1384[190] = 72;
            field1384[191] = 73;
            field1384[192] = 58;
            field1384[219] = 42;
            field1384[220] = 74;
            field1384[221] = 43;
            field1384[222] = 59;
            field1384[223] = 28;
            return;
        }
        field1384[44] = 71;
        field1384[45] = 26;
        field1384[46] = 72;
        field1384[47] = 73;
        field1384[59] = 57;
        field1384[61] = 27;
        field1384[91] = 42;
        field1384[92] = 74;
        field1384[93] = 43;
        field1384[192] = 28;
        field1384[222] = 58;
        field1384[520] = 59;
    }

    @ObfuscatedName("b.c(Ljava/awt/Component;I)V")
    public static void method1(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1385);
        arg0.addFocusListener(field1385);
    }

    @ObfuscatedName("w.j(Ljava/awt/Component;I)V")
    public static void method120(Component arg0) {
        arg0.removeKeyListener(field1385);
        arg0.removeFocusListener(field1385);
        field1390 = -1;
    }

    @ObfuscatedName("ay.i(B)V")
    public static void method816() {
        if (field1385 != null) {
            class75 var0 = field1385;
            synchronized (field1385) {
                field1385 = null;
            }
        }
    }

    @ObfuscatedName("eu.k(I)V")
    public static void method3075() {
        class75 var0 = field1385;
        synchronized (field1385) {
            field1398++;
            field1395 = field1397;
            field1380 = 0;
            if (field1390 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1386[var1] = false;
                }
                field1390 = field1389;
            } else {
                while (field1390 != field1389) {
                    int var2 = field1388[field1389];
                    field1389 = field1389 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1386[~var2] = false;
                    } else {
                        if (!field1386[var2] && field1380 < field1393.length - 1) {
                            field1393[++field1380 - 1] = var2;
                        }
                        field1386[var2] = true;
                    }
                }
            }
            field1397 = field1396;
        }
    }

    @ObfuscatedName("ce.q(S)Z")
    public static final boolean method1644() {
        class75 var0 = field1385;
        synchronized (field1385) {
            if (field1397 == field1395) {
                return false;
            } else {
                Statics.field1938 = field1392[field1395];
                Statics.field398 = field1391[field1395];
                field1395 = field1395 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1385 == null) {
            return;
        }
        field1398 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1384.length) {
            var3 = field1384[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1390 >= 0 && var3 >= 0) {
            field1388[field1390] = var3;
            field1390 = field1390 + 1 & 0x7F;
            if (field1390 == field1389) {
                field1390 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1396 + 1 & 0x7F;
            if (field1395 != var4) {
                field1392[field1396] = var3;
                field1391[field1396] = 0;
                field1396 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1385 != null) {
            field1398 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1384.length) {
                var3 = field1384[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1390 >= 0 && var3 >= 0) {
                field1388[field1390] = ~var3;
                field1390 = field1390 + 1 & 0x7F;
                if (field1390 == field1389) {
                    field1390 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1385 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class150.field2499;
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
                    int var7 = field1396 + 1 & 0x7F;
                    if (field1395 != var7) {
                        field1392[field1396] = -1;
                        field1391[field1396] = var2;
                        field1396 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1385 != null) {
            field1390 = -1;
        }
    }
}
