package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ai")
public final class class51 implements KeyListener, FocusListener {

    @ObfuscatedName("ai.n")
    public static class51 field627 = new class51();

    @ObfuscatedName("ai.cp")
    public static boolean[] field625 = new boolean[112];

    @ObfuscatedName("ai.cf")
    public static int[] field620 = new int[128];

    @ObfuscatedName("ai.cd")
    public static int field631 = 0;

    @ObfuscatedName("ai.ce")
    public static int field628 = 0;

    @ObfuscatedName("ai.ci")
    public static char[] field629 = new char[128];

    @ObfuscatedName("ai.cu")
    public static int[] field635 = new int[128];

    @ObfuscatedName("ai.cc")
    public static int[] field630 = new int[128];

    @ObfuscatedName("ai.cm")
    public static int field632 = 0;

    @ObfuscatedName("ai.cr")
    public static int field633 = 0;

    @ObfuscatedName("ai.cq")
    public static int field639 = 0;

    @ObfuscatedName("ai.ca")
    public static int field634 = 0;

    @ObfuscatedName("ai.ch")
    public static volatile int field636 = 0;

    @ObfuscatedName("ai.cx")
    public static int[] field637 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("y.p(Ljava/awt/Component;I)V")
    public static void method89(Component arg0) {
        arg0.removeKeyListener(field627);
        arg0.removeFocusListener(field627);
        field628 = -1;
    }

    @ObfuscatedName("s.i(I)V")
    public static void method133() {
        if (field627 != null) {
            class51 var0 = field627;
            synchronized (field627) {
                field627 = null;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field627 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field637.length) {
            var3 = field637[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field628 >= 0 && var3 >= 0) {
            field620[field628] = var3;
            field628 = field628 + 1 & 0x7F;
            if (field631 == field628) {
                field628 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field639 + 1 & 0x7F;
            if (field633 != var4) {
                field635[field639] = var3;
                field629[field639] = 0;
                field639 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field627 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field637.length) {
                var3 = field637[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field628 >= 0 && var3 >= 0) {
                field620[field628] = ~var3;
                field628 = field628 + 1 & 0x7F;
                if (field631 == field628) {
                    field628 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field627 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class267.field3674;
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
                    int var7 = field639 + 1 & 0x7F;
                    if (field633 != var7) {
                        field635[field639] = -1;
                        field629[field639] = var2;
                        field639 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field627 != null) {
            field628 = -1;
        }
    }
}
