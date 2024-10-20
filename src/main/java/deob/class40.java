package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("an")
public final class class40 implements KeyListener, FocusListener {

    @ObfuscatedName("an.c")
    public static class40 field359 = new class40();

    @ObfuscatedName("an.cb")
    public static boolean[] field363 = new boolean[112];

    @ObfuscatedName("an.cr")
    public static int[] field364 = new int[128];

    @ObfuscatedName("an.ck")
    public static int field374 = 0;

    @ObfuscatedName("an.ch")
    public static int field366 = 0;

    @ObfuscatedName("an.cp")
    public static char[] field367 = new char[128];

    @ObfuscatedName("an.cj")
    public static int[] field379 = new int[128];

    @ObfuscatedName("an.co")
    public static int[] field369 = new int[128];

    @ObfuscatedName("an.cz")
    public static int field372 = 0;

    @ObfuscatedName("an.cx")
    public static int field371 = 0;

    @ObfuscatedName("an.cy")
    public static int field381 = 0;

    @ObfuscatedName("an.ca")
    public static int field373 = 0;

    @ObfuscatedName("an.cw")
    public static volatile int field368 = 0;

    @ObfuscatedName("an.cs")
    public static int[] field375 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("ey.c(Ljava/awt/Component;B)V")
    public static void method2829(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field359);
        arg0.addFocusListener(field359);
    }

    @ObfuscatedName("ao.q(Ljava/awt/Component;I)V")
    public static void method882(Component arg0) {
        arg0.removeKeyListener(field359);
        arg0.removeFocusListener(field359);
        field366 = -1;
    }

    @ObfuscatedName("db.m(I)V")
    public static void method2316() {
        class40 var0 = field359;
        synchronized (field359) {
            field368++;
            field371 = field373;
            field372 = 0;
            if (field366 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field363[var1] = false;
                }
                field366 = field374;
            } else {
                while (field374 != field366) {
                    int var2 = field364[field374];
                    field374 = field374 + 1 & 0x7F;
                    if (var2 < 0) {
                        field363[~var2] = false;
                    } else {
                        if (!field363[var2] && field372 < field369.length - 1) {
                            field369[++field372 - 1] = var2;
                        }
                        field363[var2] = true;
                    }
                }
            }
            if (field372 > 0) {
                field368 = 0;
            }
            field373 = field381;
        }
    }

    @ObfuscatedName("ao.j(B)Z")
    public static final boolean method903() {
        class40 var0 = field359;
        synchronized (field359) {
            if (field373 == field371) {
                return false;
            } else {
                Statics.field3164 = field379[field371];
                Statics.field1996 = field367[field371];
                field371 = field371 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field359 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field375.length) {
            var3 = field375[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field366 >= 0 && var3 >= 0) {
            field364[field366] = var3;
            field366 = field366 + 1 & 0x7F;
            if (field374 == field366) {
                field366 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field381 + 1 & 0x7F;
            if (field371 != var4) {
                field379[field381] = var3;
                field367[field381] = 0;
                field381 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field359 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field375.length) {
                var3 = field375[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field366 >= 0 && var3 >= 0) {
                field364[field366] = ~var3;
                field366 = field366 + 1 & 0x7F;
                if (field374 == field366) {
                    field366 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field359 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class304.field3756;
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
                    int var7 = field381 + 1 & 0x7F;
                    if (field371 != var7) {
                        field379[field381] = -1;
                        field367[field381] = var2;
                        field381 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field359 != null) {
            field366 = -1;
        }
    }
}
