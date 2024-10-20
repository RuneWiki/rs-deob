package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ao")
public final class class51 implements KeyListener, FocusListener {

    @ObfuscatedName("ao.i")
    public static class51 field647 = new class51();

    @ObfuscatedName("ao.co")
    public static boolean[] field646 = new boolean[112];

    @ObfuscatedName("ao.cl")
    public static int[] field648 = new int[128];

    @ObfuscatedName("ao.cg")
    public static int field649 = 0;

    @ObfuscatedName("ao.cb")
    public static int field651 = 0;

    @ObfuscatedName("ao.ci")
    public static char[] field638 = new char[128];

    @ObfuscatedName("ao.cu")
    public static int[] field652 = new int[128];

    @ObfuscatedName("ao.cx")
    public static int[] field653 = new int[128];

    @ObfuscatedName("ao.cm")
    public static int field654 = 0;

    @ObfuscatedName("ao.cv")
    public static int field636 = 0;

    @ObfuscatedName("ao.cq")
    public static int field650 = 0;

    @ObfuscatedName("ao.cd")
    public static int field645 = 0;

    @ObfuscatedName("ao.cz")
    public static volatile int field641 = 0;

    @ObfuscatedName("ao.ct")
    public static int[] field659 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("fm.i(I)V")
    public static void method2811() {
        class51 var0 = field647;
        synchronized (field647) {
            field641++;
            field636 = field645;
            field654 = 0;
            if (field651 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field646[var1] = false;
                }
                field651 = field649;
            } else {
                while (field651 != field649) {
                    int var2 = field648[field649];
                    field649 = field649 + 1 & 0x7F;
                    if (var2 < 0) {
                        field646[~var2] = false;
                    } else {
                        if (!field646[var2] && field654 < field653.length - 1) {
                            field653[++field654 - 1] = var2;
                        }
                        field646[var2] = true;
                    }
                }
            }
            if (field654 > 0) {
                field641 = 0;
            }
            field645 = field650;
        }
    }

    @ObfuscatedName("ck.c(I)Z")
    public static final boolean method1416() {
        class51 var0 = field647;
        synchronized (field647) {
            if (field645 == field636) {
                return false;
            } else {
                Statics.field28 = field652[field636];
                Statics.field643 = field638[field636];
                field636 = field636 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("ai.e(I)I")
    public static int method234() {
        return field641;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field647 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field659.length) {
            var3 = field659[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field651 >= 0 && var3 >= 0) {
            field648[field651] = var3;
            field651 = field651 + 1 & 0x7F;
            if (field651 == field649) {
                field651 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field650 + 1 & 0x7F;
            if (field636 != var4) {
                field652[field650] = var3;
                field638[field650] = 0;
                field650 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field647 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field659.length) {
                var3 = field659[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field651 >= 0 && var3 >= 0) {
                field648[field651] = ~var3;
                field651 = field651 + 1 & 0x7F;
                if (field651 == field649) {
                    field651 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field647 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class267.field3662;
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
                    if (field636 != var7) {
                        field652[field650] = -1;
                        field638[field650] = var2;
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
        if (field647 != null) {
            field651 = -1;
        }
    }
}
