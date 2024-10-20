package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("an")
public final class class51 implements KeyListener, FocusListener {

    @ObfuscatedName("an.s")
    public static class51 field637 = new class51();

    @ObfuscatedName("an.cz")
    public static boolean[] field629 = new boolean[112];

    @ObfuscatedName("an.cw")
    public static int[] field638 = new int[128];

    @ObfuscatedName("an.cl")
    public static int field636 = 0;

    @ObfuscatedName("an.cs")
    public static int field648 = 0;

    @ObfuscatedName("an.cb")
    public static char[] field645 = new char[128];

    @ObfuscatedName("an.ck")
    public static int[] field639 = new int[128];

    @ObfuscatedName("an.cx")
    public static int[] field640 = new int[128];

    @ObfuscatedName("an.ce")
    public static int field641 = 0;

    @ObfuscatedName("an.cm")
    public static int field642 = 0;

    @ObfuscatedName("an.cp")
    public static int field646 = 0;

    @ObfuscatedName("an.ch")
    public static int field644 = 0;

    @ObfuscatedName("an.cq")
    public static volatile int field634 = 0;

    @ObfuscatedName("an.cn")
    public static int[] field620 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("a.s(Ljava/awt/Component;I)V")
    public static void method153(Component arg0) {
        arg0.removeKeyListener(field637);
        arg0.removeFocusListener(field637);
        field648 = -1;
    }

    @ObfuscatedName("h.c(I)V")
    public static void method8() {
        class51 var0 = field637;
        synchronized (field637) {
            field634++;
            field642 = field644;
            field641 = 0;
            if (field648 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field629[var1] = false;
                }
                field648 = field636;
            } else {
                while (field648 != field636) {
                    int var2 = field638[field636];
                    field636 = field636 + 1 & 0x7F;
                    if (var2 < 0) {
                        field629[~var2] = false;
                    } else {
                        if (!field629[var2] && field641 < field640.length - 1) {
                            field640[++field641 - 1] = var2;
                        }
                        field629[var2] = true;
                    }
                }
            }
            if (field641 > 0) {
                field634 = 0;
            }
            field644 = field646;
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field637 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field620.length) {
            var3 = field620[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field648 >= 0 && var3 >= 0) {
            field638[field648] = var3;
            field648 = field648 + 1 & 0x7F;
            if (field648 == field636) {
                field648 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field646 + 1 & 0x7F;
            if (field642 != var4) {
                field639[field646] = var3;
                field645[field646] = 0;
                field646 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field637 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field620.length) {
                var3 = field620[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field648 >= 0 && var3 >= 0) {
                field638[field648] = ~var3;
                field648 = field648 + 1 & 0x7F;
                if (field648 == field636) {
                    field648 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field637 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class270.method2936(var2)) {
                int var3 = field646 + 1 & 0x7F;
                if (field642 != var3) {
                    field639[field646] = -1;
                    field645[field646] = var2;
                    field646 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field637 != null) {
            field648 = -1;
        }
    }
}
