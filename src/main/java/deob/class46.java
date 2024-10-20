package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ar")
public final class class46 implements KeyListener, FocusListener {

    @ObfuscatedName("ar.c")
    public static class46 field387 = new class46();

    @ObfuscatedName("ar.ck")
    public static boolean[] field374 = new boolean[112];

    @ObfuscatedName("ar.cn")
    public static int[] field370 = new int[128];

    @ObfuscatedName("ar.cj")
    public static int field376 = 0;

    @ObfuscatedName("ar.cw")
    public static int field367 = 0;

    @ObfuscatedName("ar.cu")
    public static char[] field378 = new char[128];

    @ObfuscatedName("ar.cd")
    public static int[] field379 = new int[128];

    @ObfuscatedName("ar.cs")
    public static int[] field380 = new int[128];

    @ObfuscatedName("ar.cx")
    public static int field381 = 0;

    @ObfuscatedName("ar.ci")
    public static int field382 = 0;

    @ObfuscatedName("ar.cf")
    public static int field383 = 0;

    @ObfuscatedName("ar.cq")
    public static int field384 = 0;

    @ObfuscatedName("ar.co")
    public static volatile int field385 = 0;

    @ObfuscatedName("ar.cz")
    public static int[] field386 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("g.c(I)V")
    public static void method29() {
        if (Statics.field2005.toLowerCase().indexOf("microsoft") != -1) {
            field386[186] = 57;
            field386[187] = 27;
            field386[188] = 71;
            field386[189] = 26;
            field386[190] = 72;
            field386[191] = 73;
            field386[192] = 58;
            field386[219] = 42;
            field386[220] = 74;
            field386[221] = 43;
            field386[222] = 59;
            field386[223] = 28;
            return;
        }
        field386[44] = 71;
        field386[45] = 26;
        field386[46] = 72;
        field386[47] = 73;
        field386[59] = 57;
        field386[61] = 27;
        field386[91] = 42;
        field386[92] = 74;
        field386[93] = 43;
        field386[192] = 28;
        field386[222] = 58;
        field386[520] = 59;
    }

    @ObfuscatedName("ir.x(Ljava/awt/Component;B)V")
    public static void method3992(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field387);
        arg0.addFocusListener(field387);
    }

    @ObfuscatedName("bc.t(I)V")
    public static void method1740() {
        if (field387 != null) {
            class46 var0 = field387;
            synchronized (field387) {
                field387 = null;
            }
        }
    }

    @ObfuscatedName("k.g(B)V")
    public static void method205() {
        class46 var0 = field387;
        synchronized (field387) {
            field385++;
            field382 = field384;
            field381 = 0;
            if (field367 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field374[var1] = false;
                }
                field367 = field376;
            } else {
                while (field376 != field367) {
                    int var2 = field370[field376];
                    field376 = field376 + 1 & 0x7F;
                    if (var2 < 0) {
                        field374[~var2] = false;
                    } else {
                        if (!field374[var2] && field381 < field380.length - 1) {
                            field380[++field381 - 1] = var2;
                        }
                        field374[var2] = true;
                    }
                }
            }
            if (field381 > 0) {
                field385 = 0;
            }
            field384 = field383;
        }
    }

    @ObfuscatedName("jq.l(B)Z")
    public static final boolean method4702() {
        class46 var0 = field387;
        synchronized (field387) {
            if (field384 == field382) {
                return false;
            } else {
                Statics.field362 = field379[field382];
                Statics.field127 = field378[field382];
                field382 = field382 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field387 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field386.length) {
            var3 = field386[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field367 >= 0 && var3 >= 0) {
            field370[field367] = var3;
            field367 = field367 + 1 & 0x7F;
            if (field376 == field367) {
                field367 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field383 + 1 & 0x7F;
            if (field382 != var4) {
                field379[field383] = var3;
                field378[field383] = 0;
                field383 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field387 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field386.length) {
                var3 = field386[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field367 >= 0 && var3 >= 0) {
                field370[field367] = ~var3;
                field367 = field367 + 1 & 0x7F;
                if (field376 == field367) {
                    field367 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field387 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class288.method1888(var2)) {
                int var3 = field383 + 1 & 0x7F;
                if (field382 != var3) {
                    field379[field383] = -1;
                    field378[field383] = var2;
                    field383 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field387 != null) {
            field367 = -1;
        }
    }
}
