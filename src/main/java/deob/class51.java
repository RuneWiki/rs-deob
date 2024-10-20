package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("af")
public final class class51 implements KeyListener, FocusListener {

    @ObfuscatedName("af.e")
    public static class51 field653 = new class51();

    @ObfuscatedName("af.cb")
    public static boolean[] field641 = new boolean[112];

    @ObfuscatedName("af.cg")
    public static int[] field642 = new int[128];

    @ObfuscatedName("af.cc")
    public static int field643 = 0;

    @ObfuscatedName("af.cu")
    public static int field644 = 0;

    @ObfuscatedName("af.cw")
    public static char[] field645 = new char[128];

    @ObfuscatedName("af.ce")
    public static int[] field626 = new int[128];

    @ObfuscatedName("af.cn")
    public static int[] field639 = new int[128];

    @ObfuscatedName("af.cm")
    public static int field648 = 0;

    @ObfuscatedName("af.cl")
    public static int field649 = 0;

    @ObfuscatedName("af.ca")
    public static int field650 = 0;

    @ObfuscatedName("af.cz")
    public static int field636 = 0;

    @ObfuscatedName("af.cr")
    public static volatile int field655 = 0;

    @ObfuscatedName("af.ck")
    public static int[] field628 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("x.e(I)V")
    public static void method130() {
        if (Statics.field2222.toLowerCase().indexOf("microsoft") != -1) {
            field628[186] = 57;
            field628[187] = 27;
            field628[188] = 71;
            field628[189] = 26;
            field628[190] = 72;
            field628[191] = 73;
            field628[192] = 58;
            field628[219] = 42;
            field628[220] = 74;
            field628[221] = 43;
            field628[222] = 59;
            field628[223] = 28;
            return;
        }
        field628[44] = 71;
        field628[45] = 26;
        field628[46] = 72;
        field628[47] = 73;
        field628[59] = 57;
        field628[61] = 27;
        field628[91] = 42;
        field628[92] = 74;
        field628[93] = 43;
        field628[192] = 28;
        field628[222] = 58;
        field628[520] = 59;
    }

    @ObfuscatedName("bt.o(Ljava/awt/Component;B)V")
    public static void method977(Component arg0) {
        arg0.removeKeyListener(field653);
        arg0.removeFocusListener(field653);
        field644 = -1;
    }

    @ObfuscatedName("cd.m(B)Z")
    public static final boolean method1521() {
        class51 var0 = field653;
        synchronized (field653) {
            if (field649 == field636) {
                return false;
            } else {
                Statics.field3360 = field626[field649];
                Statics.field593 = field645[field649];
                field649 = field649 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("fw.g(I)I")
    public static int method3090() {
        return field655;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field653 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field628.length) {
            var3 = field628[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field644 >= 0 && var3 >= 0) {
            field642[field644] = var3;
            field644 = field644 + 1 & 0x7F;
            if (field644 == field643) {
                field644 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field650 + 1 & 0x7F;
            if (field649 != var4) {
                field626[field650] = var3;
                field645[field650] = 0;
                field650 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field653 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field628.length) {
                var3 = field628[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field644 >= 0 && var3 >= 0) {
                field642[field644] = ~var3;
                field644 = field644 + 1 & 0x7F;
                if (field644 == field643) {
                    field644 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field653 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class267.field3650;
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
                    int var7 = field650 + 1 & 0x7F;
                    if (field649 != var7) {
                        field626[field650] = -1;
                        field645[field650] = var2;
                        field650 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field653 != null) {
            field644 = -1;
        }
    }
}
