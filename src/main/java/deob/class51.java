package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("aa")
public final class class51 implements KeyListener, FocusListener {

    @ObfuscatedName("aa.w")
    public static class51 field666 = new class51();

    @ObfuscatedName("aa.ce")
    public static boolean[] field661 = new boolean[112];

    @ObfuscatedName("aa.ct")
    public static int[] field672 = new int[128];

    @ObfuscatedName("aa.cs")
    public static int field663 = 0;

    @ObfuscatedName("aa.cc")
    public static int field664 = 0;

    @ObfuscatedName("aa.cw")
    public static char[] field665 = new char[128];

    @ObfuscatedName("aa.cy")
    public static int[] field659 = new int[128];

    @ObfuscatedName("aa.cn")
    public static int[] field667 = new int[128];

    @ObfuscatedName("aa.co")
    public static int field654 = 0;

    @ObfuscatedName("aa.ch")
    public static int field652 = 0;

    @ObfuscatedName("aa.cp")
    public static int field668 = 0;

    @ObfuscatedName("aa.cj")
    public static int field671 = 0;

    @ObfuscatedName("aa.cm")
    public static volatile int field669 = 0;

    @ObfuscatedName("aa.cr")
    public static int[] field670 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("cf.w(B)V")
    public static void method1445() {
        if (Statics.field2248.toLowerCase().indexOf("microsoft") != -1) {
            field670[186] = 57;
            field670[187] = 27;
            field670[188] = 71;
            field670[189] = 26;
            field670[190] = 72;
            field670[191] = 73;
            field670[192] = 58;
            field670[219] = 42;
            field670[220] = 74;
            field670[221] = 43;
            field670[222] = 59;
            field670[223] = 28;
            return;
        }
        field670[44] = 71;
        field670[45] = 26;
        field670[46] = 72;
        field670[47] = 73;
        field670[59] = 57;
        field670[61] = 27;
        field670[91] = 42;
        field670[92] = 74;
        field670[93] = 43;
        field670[192] = 28;
        field670[222] = 58;
        field670[520] = 59;
    }

    @ObfuscatedName("ay.o(Ljava/awt/Component;I)V")
    public static void method481(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field666);
        arg0.addFocusListener(field666);
    }

    @ObfuscatedName("gs.x(Ljava/awt/Component;I)V")
    public static void method3380(Component arg0) {
        arg0.removeKeyListener(field666);
        arg0.removeFocusListener(field666);
        field664 = -1;
    }

    @ObfuscatedName("j.k(I)Z")
    public static final boolean method24() {
        class51 var0 = field666;
        synchronized (field666) {
            if (field671 == field652) {
                return false;
            } else {
                Statics.field2153 = field659[field652];
                Statics.field3693 = field665[field652];
                field652 = field652 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("bx.f(I)I")
    public static int method1032() {
        return field669;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field666 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field670.length) {
            var3 = field670[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field664 >= 0 && var3 >= 0) {
            field672[field664] = var3;
            field664 = field664 + 1 & 0x7F;
            if (field664 == field663) {
                field664 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field668 + 1 & 0x7F;
            if (field652 != var4) {
                field659[field668] = var3;
                field665[field668] = 0;
                field668 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field666 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field670.length) {
                var3 = field670[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field664 >= 0 && var3 >= 0) {
                field672[field664] = ~var3;
                field664 = field664 + 1 & 0x7F;
                if (field664 == field663) {
                    field664 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field666 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class270.field3676;
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
                    int var7 = field668 + 1 & 0x7F;
                    if (field652 != var7) {
                        field659[field668] = -1;
                        field665[field668] = var2;
                        field668 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field666 != null) {
            field664 = -1;
        }
    }
}
