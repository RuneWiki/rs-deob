package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("aa")
public final class class40 implements KeyListener, FocusListener {

    @ObfuscatedName("aa.g")
    public static class40 field387 = new class40();

    @ObfuscatedName("aa.cx")
    public static boolean[] field381 = new boolean[112];

    @ObfuscatedName("aa.cf")
    public static int[] field382 = new int[128];

    @ObfuscatedName("aa.cn")
    public static int field375 = 0;

    @ObfuscatedName("aa.co")
    public static int field384 = 0;

    @ObfuscatedName("aa.ck")
    public static char[] field385 = new char[128];

    @ObfuscatedName("aa.cp")
    public static int[] field370 = new int[128];

    @ObfuscatedName("aa.ch")
    public static int[] field378 = new int[128];

    @ObfuscatedName("aa.ct")
    public static int field388 = 0;

    @ObfuscatedName("aa.cs")
    public static int field389 = 0;

    @ObfuscatedName("aa.cq")
    public static int field390 = 0;

    @ObfuscatedName("aa.cj")
    public static int field391 = 0;

    @ObfuscatedName("aa.cu")
    public static volatile int field392 = 0;

    @ObfuscatedName("aa.ci")
    public static int[] field393 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("bm.g(I)V")
    public static void method1842() {
        if (Statics.field2018.toLowerCase().indexOf("microsoft") != -1) {
            field393[186] = 57;
            field393[187] = 27;
            field393[188] = 71;
            field393[189] = 26;
            field393[190] = 72;
            field393[191] = 73;
            field393[192] = 58;
            field393[219] = 42;
            field393[220] = 74;
            field393[221] = 43;
            field393[222] = 59;
            field393[223] = 28;
            return;
        }
        field393[44] = 71;
        field393[45] = 26;
        field393[46] = 72;
        field393[47] = 73;
        field393[59] = 57;
        field393[61] = 27;
        field393[91] = 42;
        field393[92] = 74;
        field393[93] = 43;
        field393[192] = 28;
        field393[222] = 58;
        field393[520] = 59;
    }

    @ObfuscatedName("ae.r(Ljava/awt/Component;I)V")
    public static void method535(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field387);
        arg0.addFocusListener(field387);
    }

    @ObfuscatedName("cc.e(Ljava/awt/Component;I)V")
    public static void method2014(Component arg0) {
        arg0.removeKeyListener(field387);
        arg0.removeFocusListener(field387);
        field384 = -1;
    }

    @ObfuscatedName("ig.q(I)V")
    public static void method4410() {
        if (field387 != null) {
            class40 var0 = field387;
            synchronized (field387) {
                field387 = null;
            }
        }
    }

    @ObfuscatedName("jm.c(I)Z")
    public static final boolean method5126() {
        class40 var0 = field387;
        synchronized (field387) {
            if (field391 == field389) {
                return false;
            } else {
                Statics.field599 = field370[field389];
                Statics.field1857 = field385[field389];
                field389 = field389 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field387 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field393.length) {
            var3 = field393[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field384 >= 0 && var3 >= 0) {
            field382[field384] = var3;
            field384 = field384 + 1 & 0x7F;
            if (field384 == field375) {
                field384 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field390 + 1 & 0x7F;
            if (field389 != var4) {
                field370[field390] = var3;
                field385[field390] = 0;
                field390 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field387 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field393.length) {
                var3 = field393[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field384 >= 0 && var3 >= 0) {
                field382[field384] = ~var3;
                field384 = field384 + 1 & 0x7F;
                if (field384 == field375) {
                    field384 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field387 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class304.field3786;
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
                    int var7 = field390 + 1 & 0x7F;
                    if (field389 != var7) {
                        field370[field390] = -1;
                        field385[field390] = var2;
                        field390 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field387 != null) {
            field384 = -1;
        }
    }
}
