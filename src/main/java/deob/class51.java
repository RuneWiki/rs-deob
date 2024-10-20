package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ay")
public final class class51 implements KeyListener, FocusListener {

    @ObfuscatedName("ay.c")
    public static class51 field638 = new class51();

    @ObfuscatedName("ay.cj")
    public static boolean[] field637 = new boolean[112];

    @ObfuscatedName("ay.cb")
    public static int[] field644 = new int[128];

    @ObfuscatedName("ay.cz")
    public static int field645 = 0;

    @ObfuscatedName("ay.cr")
    public static int field640 = 0;

    @ObfuscatedName("ay.cu")
    public static char[] field630 = new char[128];

    @ObfuscatedName("ay.cg")
    public static int[] field642 = new int[128];

    @ObfuscatedName("ay.cl")
    public static int[] field643 = new int[128];

    @ObfuscatedName("ay.cd")
    public static int field628 = 0;

    @ObfuscatedName("ay.cs")
    public static int field639 = 0;

    @ObfuscatedName("ay.cn")
    public static int field646 = 0;

    @ObfuscatedName("ay.co")
    public static int field647 = 0;

    @ObfuscatedName("ay.cv")
    public static volatile int field653 = 0;

    @ObfuscatedName("ay.ce")
    public static int[] field649 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("em.c(I)V")
    public static void method2421() {
        if (Statics.field2198.toLowerCase().indexOf("microsoft") != -1) {
            field649[186] = 57;
            field649[187] = 27;
            field649[188] = 71;
            field649[189] = 26;
            field649[190] = 72;
            field649[191] = 73;
            field649[192] = 58;
            field649[219] = 42;
            field649[220] = 74;
            field649[221] = 43;
            field649[222] = 59;
            field649[223] = 28;
            return;
        }
        field649[44] = 71;
        field649[45] = 26;
        field649[46] = 72;
        field649[47] = 73;
        field649[59] = 57;
        field649[61] = 27;
        field649[91] = 42;
        field649[92] = 74;
        field649[93] = 43;
        field649[192] = 28;
        field649[222] = 58;
        field649[520] = 59;
    }

    @ObfuscatedName("z.o(Ljava/awt/Component;B)V")
    public static void method160(Component arg0) {
        arg0.removeKeyListener(field638);
        arg0.removeFocusListener(field638);
        field640 = -1;
    }

    @ObfuscatedName("ao.i(B)V")
    public static void method652() {
        if (field638 != null) {
            class51 var0 = field638;
            synchronized (field638) {
                field638 = null;
            }
        }
    }

    @ObfuscatedName("ai.u(I)V")
    public static void method530() {
        class51 var0 = field638;
        synchronized (field638) {
            field653++;
            field639 = field647;
            field628 = 0;
            if (field640 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field637[var1] = false;
                }
                field640 = field645;
            } else {
                while (field645 != field640) {
                    int var2 = field644[field645];
                    field645 = field645 + 1 & 0x7F;
                    if (var2 < 0) {
                        field637[~var2] = false;
                    } else {
                        if (!field637[var2] && field628 < field643.length - 1) {
                            field643[++field628 - 1] = var2;
                        }
                        field637[var2] = true;
                    }
                }
            }
            if (field628 > 0) {
                field653 = 0;
            }
            field647 = field646;
        }
    }

    @ObfuscatedName("an.g(I)Z")
    public static final boolean method455() {
        class51 var0 = field638;
        synchronized (field638) {
            if (field647 == field639) {
                return false;
            } else {
                Statics.field2772 = field642[field639];
                Statics.field3119 = field630[field639];
                field639 = field639 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("ce.m(B)I")
    public static int method1657() {
        return field653;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field638 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field649.length) {
            var3 = field649[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field640 >= 0 && var3 >= 0) {
            field644[field640] = var3;
            field640 = field640 + 1 & 0x7F;
            if (field645 == field640) {
                field640 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field646 + 1 & 0x7F;
            if (field639 != var4) {
                field642[field646] = var3;
                field630[field646] = 0;
                field646 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field638 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field649.length) {
                var3 = field649[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field640 >= 0 && var3 >= 0) {
                field644[field640] = ~var3;
                field640 = field640 + 1 & 0x7F;
                if (field645 == field640) {
                    field640 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field638 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class267.field3646;
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
                    int var7 = field646 + 1 & 0x7F;
                    if (field639 != var7) {
                        field642[field646] = -1;
                        field630[field646] = var2;
                        field646 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field638 != null) {
            field640 = -1;
        }
    }
}
