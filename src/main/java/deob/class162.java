package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ba")
public final class class162 implements KeyListener, FocusListener {

    @ObfuscatedName("ba.j")
    public static class162 field2423 = new class162();

    @ObfuscatedName("ba.cb")
    public static int field2440 = 0;

    @ObfuscatedName("ba.cv")
    public static volatile int field2441 = 0;

    @ObfuscatedName("ba.cu")
    public static int[] field2436 = new int[128];

    @ObfuscatedName("ba.ct")
    public static int[] field2433 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("ba.cq")
    public static int[] field2427 = new int[128];

    @ObfuscatedName("ba.cr")
    public static boolean[] field2430 = new boolean[112];

    @ObfuscatedName("ba.cp")
    public static int field2432 = 0;

    @ObfuscatedName("ba.cn")
    public static int[] field2431 = new int[128];

    @ObfuscatedName("ba.ci")
    public static int field2439 = 0;

    @ObfuscatedName("ba.cj")
    public static char[] field2434 = new char[128];

    @ObfuscatedName("ba.cg")
    public static int field2420 = 0;

    @ObfuscatedName("ba.cc")
    public static int field2444 = 0;

    @ObfuscatedName("ba.cd")
    public static int field2437 = 0;

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2423 != null) {
            field2441 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2433.length) {
                var3 = field2433[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2444 >= 0 && var3 >= 0) {
                field2431[field2444] = ~var3;
                field2444 = field2444 + 1 & 0x7F;
                if (field2444 == field2432) {
                    field2444 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2423 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class89.method3572(var2)) {
                int var3 = field2439 + 1 & 0x7F;
                if (field2420 != var3) {
                    field2427[field2439] = -1;
                    field2434[field2439] = var2;
                    field2439 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2423 != null) {
            field2444 = -1;
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2423 == null) {
            return;
        }
        field2441 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2433.length) {
            var3 = field2433[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2444 >= 0 && var3 >= 0) {
            field2431[field2444] = var3;
            field2444 = field2444 + 1 & 0x7F;
            if (field2444 == field2432) {
                field2444 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2439 + 1 & 0x7F;
            if (field2420 != var4) {
                field2427[field2439] = var3;
                field2434[field2439] = 0;
                field2439 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @ObfuscatedName("p.h(I)I")
    public static int method1346() {
        return field2441;
    }

    @ObfuscatedName("ax.p(Ljava/awt/Component;I)V")
    public static void method3233(Component arg0) {
        arg0.removeKeyListener(field2423);
        arg0.removeFocusListener(field2423);
        field2444 = -1;
    }

    @ObfuscatedName("ac.j(I)V")
    public static void method3403() {
        if (Statics.field1761.toLowerCase().indexOf("microsoft") != -1) {
            field2433[186] = 57;
            field2433[187] = 27;
            field2433[188] = 71;
            field2433[189] = 26;
            field2433[190] = 72;
            field2433[191] = 73;
            field2433[192] = 58;
            field2433[219] = 42;
            field2433[220] = 74;
            field2433[221] = 43;
            field2433[222] = 59;
            field2433[223] = 28;
            return;
        }
        field2433[44] = 71;
        field2433[45] = 26;
        field2433[46] = 72;
        field2433[47] = 73;
        field2433[59] = 57;
        field2433[61] = 27;
        field2433[91] = 42;
        field2433[92] = 74;
        field2433[93] = 43;
        field2433[192] = 28;
        field2433[222] = 58;
        field2433[520] = 59;
    }

    @ObfuscatedName("ad.o(B)V")
    public static void method3431() {
        if (field2423 != null) {
            class162 var0 = field2423;
            synchronized (field2423) {
                field2423 = null;
            }
        }
    }

    @ObfuscatedName("ag.t(B)V")
    public static void method3490() {
        class162 var0 = field2423;
        synchronized (field2423) {
            field2441++;
            field2420 = field2440;
            field2437 = 0;
            if (field2444 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field2430[var1] = false;
                }
                field2444 = field2432;
            } else {
                while (field2444 != field2432) {
                    int var2 = field2431[field2432];
                    field2432 = field2432 + 1 & 0x7F;
                    if (var2 < 0) {
                        field2430[~var2] = false;
                    } else {
                        if (!field2430[var2] && field2437 < field2436.length - 1) {
                            field2436[++field2437 - 1] = var2;
                        }
                        field2430[var2] = true;
                    }
                }
            }
            field2440 = field2439;
        }
    }
}
