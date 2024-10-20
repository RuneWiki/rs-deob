package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("au")
public final class class51 implements KeyListener, FocusListener {

    @ObfuscatedName("au.i")
    public static class51 field634 = new class51();

    @ObfuscatedName("au.cl")
    public static boolean[] field625 = new boolean[112];

    @ObfuscatedName("au.cx")
    public static int[] field618 = new int[128];

    @ObfuscatedName("au.cw")
    public static int field632 = 0;

    @ObfuscatedName("au.co")
    public static int field629 = 0;

    @ObfuscatedName("au.cr")
    public static char[] field640 = new char[128];

    @ObfuscatedName("au.ce")
    public static int[] field631 = new int[128];

    @ObfuscatedName("au.cf")
    public static int[] field630 = new int[128];

    @ObfuscatedName("au.cj")
    public static int field642 = 0;

    @ObfuscatedName("au.cm")
    public static int field622 = 0;

    @ObfuscatedName("au.ci")
    public static int field635 = 0;

    @ObfuscatedName("au.cu")
    public static int field636 = 0;

    @ObfuscatedName("au.cc")
    public static volatile int field637 = 0;

    @ObfuscatedName("au.cy")
    public static int[] field638 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("em.i(B)V")
    public static void method2314() {
        if (field634 != null) {
            class51 var0 = field634;
            synchronized (field634) {
                field634 = null;
            }
        }
    }

    @ObfuscatedName("ez.h(I)V")
    public static void method2687() {
        class51 var0 = field634;
        synchronized (field634) {
            field637++;
            field622 = field636;
            field642 = 0;
            if (field629 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field625[var1] = false;
                }
                field629 = field632;
            } else {
                while (field632 != field629) {
                    int var2 = field618[field632];
                    field632 = field632 + 1 & 0x7F;
                    if (var2 < 0) {
                        field625[~var2] = false;
                    } else {
                        if (!field625[var2] && field642 < field630.length - 1) {
                            field630[++field642 - 1] = var2;
                        }
                        field625[var2] = true;
                    }
                }
            }
            if (field642 > 0) {
                field637 = 0;
            }
            field636 = field635;
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field634 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field638.length) {
            var3 = field638[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field629 >= 0 && var3 >= 0) {
            field618[field629] = var3;
            field629 = field629 + 1 & 0x7F;
            if (field632 == field629) {
                field629 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field635 + 1 & 0x7F;
            if (field622 != var4) {
                field631[field635] = var3;
                field640[field635] = 0;
                field635 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field634 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field638.length) {
                var3 = field638[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field629 >= 0 && var3 >= 0) {
                field618[field629] = ~var3;
                field629 = field629 + 1 & 0x7F;
                if (field632 == field629) {
                    field629 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field634 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class267.method98(var2)) {
                int var3 = field635 + 1 & 0x7F;
                if (field622 != var3) {
                    field631[field635] = -1;
                    field640[field635] = var2;
                    field635 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field634 != null) {
            field629 = -1;
        }
    }
}
