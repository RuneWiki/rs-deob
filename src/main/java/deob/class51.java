package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ad")
public final class class51 implements KeyListener, FocusListener {

    @ObfuscatedName("ad.p")
    public static class51 field648 = new class51();

    @ObfuscatedName("ad.cp")
    public static boolean[] field661 = new boolean[112];

    @ObfuscatedName("ad.cb")
    public static int[] field635 = new int[128];

    @ObfuscatedName("ad.cl")
    public static int field653 = 0;

    @ObfuscatedName("ad.ck")
    public static int field654 = 0;

    @ObfuscatedName("ad.ct")
    public static char[] field655 = new char[128];

    @ObfuscatedName("ad.cy")
    public static int[] field656 = new int[128];

    @ObfuscatedName("ad.cr")
    public static int[] field657 = new int[128];

    @ObfuscatedName("ad.cd")
    public static int field658 = 0;

    @ObfuscatedName("ad.cu")
    public static int field659 = 0;

    @ObfuscatedName("ad.cs")
    public static int field660 = 0;

    @ObfuscatedName("ad.cm")
    public static int field666 = 0;

    @ObfuscatedName("ad.cq")
    public static volatile int field639 = 0;

    @ObfuscatedName("ad.cc")
    public static int[] field663 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("v.p(Ljava/awt/Component;I)V")
    public static void method93(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field648);
        arg0.addFocusListener(field648);
    }

    @ObfuscatedName("dx.m(B)V")
    public static void method1889() {
        if (field648 != null) {
            class51 var0 = field648;
            synchronized (field648) {
                field648 = null;
            }
        }
    }

    @ObfuscatedName("i.e(I)Z")
    public static final boolean method31() {
        class51 var0 = field648;
        synchronized (field648) {
            if (field666 == field659) {
                return false;
            } else {
                Statics.field2172 = field656[field659];
                Statics.field377 = field655[field659];
                field659 = field659 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field648 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field663.length) {
            var3 = field663[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field654 >= 0 && var3 >= 0) {
            field635[field654] = var3;
            field654 = field654 + 1 & 0x7F;
            if (field654 == field653) {
                field654 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field660 + 1 & 0x7F;
            if (field659 != var4) {
                field656[field660] = var3;
                field655[field660] = 0;
                field660 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field648 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field663.length) {
                var3 = field663[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field654 >= 0 && var3 >= 0) {
                field635[field654] = ~var3;
                field654 = field654 + 1 & 0x7F;
                if (field654 == field653) {
                    field654 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field648 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class267.field3666;
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
                    int var7 = field660 + 1 & 0x7F;
                    if (field659 != var7) {
                        field656[field660] = -1;
                        field655[field660] = var2;
                        field660 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field648 != null) {
            field654 = -1;
        }
    }
}
