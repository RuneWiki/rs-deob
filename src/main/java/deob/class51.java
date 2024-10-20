package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ac")
public final class class51 implements KeyListener, FocusListener {

    @ObfuscatedName("ac.a")
    public static class51 field637 = new class51();

    @ObfuscatedName("ac.ch")
    public static boolean[] field627 = new boolean[112];

    @ObfuscatedName("ac.cf")
    public static int[] field640 = new int[128];

    @ObfuscatedName("ac.cl")
    public static int field630 = 0;

    @ObfuscatedName("ac.cd")
    public static int field626 = 0;

    @ObfuscatedName("ac.cb")
    public static char[] field632 = new char[128];

    @ObfuscatedName("ac.ci")
    public static int[] field629 = new int[128];

    @ObfuscatedName("ac.co")
    public static int[] field634 = new int[128];

    @ObfuscatedName("ac.cj")
    public static int field635 = 0;

    @ObfuscatedName("ac.cp")
    public static int field636 = 0;

    @ObfuscatedName("ac.cw")
    public static int field621 = 0;

    @ObfuscatedName("ac.cq")
    public static int field638 = 0;

    @ObfuscatedName("ac.cg")
    public static volatile int field639 = 0;

    @ObfuscatedName("ac.cr")
    public static int[] field644 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("c.a(I)V")
    public static void method85() {
        if (Statics.field2228.toLowerCase().indexOf("microsoft") != -1) {
            field644[186] = 57;
            field644[187] = 27;
            field644[188] = 71;
            field644[189] = 26;
            field644[190] = 72;
            field644[191] = 73;
            field644[192] = 58;
            field644[219] = 42;
            field644[220] = 74;
            field644[221] = 43;
            field644[222] = 59;
            field644[223] = 28;
            return;
        }
        field644[44] = 71;
        field644[45] = 26;
        field644[46] = 72;
        field644[47] = 73;
        field644[59] = 57;
        field644[61] = 27;
        field644[91] = 42;
        field644[92] = 74;
        field644[93] = 43;
        field644[192] = 28;
        field644[222] = 58;
        field644[520] = 59;
    }

    @ObfuscatedName("du.n(I)Z")
    public static final boolean method1893() {
        class51 var0 = field637;
        synchronized (field637) {
            if (field638 == field636) {
                return false;
            } else {
                Statics.field628 = field629[field636];
                Statics.field2511 = field632[field636];
                field636 = field636 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field637 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field644.length) {
            var3 = field644[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field626 >= 0 && var3 >= 0) {
            field640[field626] = var3;
            field626 = field626 + 1 & 0x7F;
            if (field630 == field626) {
                field626 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field621 + 1 & 0x7F;
            if (field636 != var4) {
                field629[field621] = var3;
                field632[field621] = 0;
                field621 = var4;
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
            if (var2 >= 0 && var2 < field644.length) {
                var3 = field644[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field626 >= 0 && var3 >= 0) {
                field640[field626] = ~var3;
                field626 = field626 + 1 & 0x7F;
                if (field630 == field626) {
                    field626 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field637 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class267.field3664;
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
                    int var7 = field621 + 1 & 0x7F;
                    if (field636 != var7) {
                        field629[field621] = -1;
                        field632[field621] = var2;
                        field621 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field637 != null) {
            field626 = -1;
        }
    }
}
