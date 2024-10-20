package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ac")
public final class class51 implements KeyListener, FocusListener {

    @ObfuscatedName("ac.j")
    public static class51 field649 = new class51();

    @ObfuscatedName("ac.ci")
    public static boolean[] field643 = new boolean[112];

    @ObfuscatedName("ac.cv")
    public static int[] field636 = new int[128];

    @ObfuscatedName("ac.ce")
    public static int field651 = 0;

    @ObfuscatedName("ac.ca")
    public static int field646 = 0;

    @ObfuscatedName("ac.cq")
    public static char[] field632 = new char[128];

    @ObfuscatedName("ac.cx")
    public static int[] field634 = new int[128];

    @ObfuscatedName("ac.cw")
    public static int[] field638 = new int[128];

    @ObfuscatedName("ac.cy")
    public static int field650 = 0;

    @ObfuscatedName("ac.cb")
    public static int field660 = 0;

    @ObfuscatedName("ac.co")
    public static int field652 = 0;

    @ObfuscatedName("ac.cd")
    public static int field653 = 0;

    @ObfuscatedName("ac.cl")
    public static volatile int field647 = 0;

    @ObfuscatedName("ac.cj")
    public static int[] field654 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("m.j(B)V")
    public static void method42() {
        if (Statics.field2237.toLowerCase().indexOf("microsoft") != -1) {
            field654[186] = 57;
            field654[187] = 27;
            field654[188] = 71;
            field654[189] = 26;
            field654[190] = 72;
            field654[191] = 73;
            field654[192] = 58;
            field654[219] = 42;
            field654[220] = 74;
            field654[221] = 43;
            field654[222] = 59;
            field654[223] = 28;
            return;
        }
        field654[44] = 71;
        field654[45] = 26;
        field654[46] = 72;
        field654[47] = 73;
        field654[59] = 57;
        field654[61] = 27;
        field654[91] = 42;
        field654[92] = 74;
        field654[93] = 43;
        field654[192] = 28;
        field654[222] = 58;
        field654[520] = 59;
    }

    @ObfuscatedName("ax.h(I)V")
    public static void method202() {
        if (field649 != null) {
            class51 var0 = field649;
            synchronized (field649) {
                field649 = null;
            }
        }
    }

    @ObfuscatedName("hw.f(B)V")
    public static void method3762() {
        class51 var0 = field649;
        synchronized (field649) {
            field647++;
            field660 = field653;
            field650 = 0;
            if (field646 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field643[var1] = false;
                }
                field646 = field651;
            } else {
                while (field651 != field646) {
                    int var2 = field636[field651];
                    field651 = field651 + 1 & 0x7F;
                    if (var2 < 0) {
                        field643[~var2] = false;
                    } else {
                        if (!field643[var2] && field650 < field638.length - 1) {
                            field638[++field650 - 1] = var2;
                        }
                        field643[var2] = true;
                    }
                }
            }
            if (field650 > 0) {
                field647 = 0;
            }
            field653 = field652;
        }
    }

    @ObfuscatedName("br.p(S)Z")
    public static final boolean method1096() {
        class51 var0 = field649;
        synchronized (field649) {
            if (field660 == field653) {
                return false;
            } else {
                Statics.field626 = field634[field660];
                Statics.field2808 = field632[field660];
                field660 = field660 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field649 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field654.length) {
            var3 = field654[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field646 >= 0 && var3 >= 0) {
            field636[field646] = var3;
            field646 = field646 + 1 & 0x7F;
            if (field651 == field646) {
                field646 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field652 + 1 & 0x7F;
            if (field660 != var4) {
                field634[field652] = var3;
                field632[field652] = 0;
                field652 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field649 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field654.length) {
                var3 = field654[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field646 >= 0 && var3 >= 0) {
                field636[field646] = ~var3;
                field646 = field646 + 1 & 0x7F;
                if (field651 == field646) {
                    field646 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field649 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class268.method2870(var2)) {
                int var3 = field652 + 1 & 0x7F;
                if (field660 != var3) {
                    field634[field652] = -1;
                    field632[field652] = var2;
                    field652 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field649 != null) {
            field646 = -1;
        }
    }
}
