package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("an")
public final class class51 implements KeyListener, FocusListener {

    @ObfuscatedName("an.w")
    public static class51 field671 = new class51();

    @ObfuscatedName("an.cn")
    public static boolean[] field660 = new boolean[112];

    @ObfuscatedName("an.cw")
    public static int[] field661 = new int[128];

    @ObfuscatedName("an.ch")
    public static int field654 = 0;

    @ObfuscatedName("an.cx")
    public static int field663 = 0;

    @ObfuscatedName("an.cd")
    public static char[] field647 = new char[128];

    @ObfuscatedName("an.cc")
    public static int[] field665 = new int[128];

    @ObfuscatedName("an.cq")
    public static int[] field672 = new int[128];

    @ObfuscatedName("an.ca")
    public static int field667 = 0;

    @ObfuscatedName("an.cz")
    public static int field668 = 0;

    @ObfuscatedName("an.ct")
    public static int field662 = 0;

    @ObfuscatedName("an.ci")
    public static int field640 = 0;

    @ObfuscatedName("an.cv")
    public static volatile int field643 = 0;

    @ObfuscatedName("an.cy")
    public static int[] field670 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("r.w(B)V")
    public static void method157() {
        if (Statics.field2229.toLowerCase().indexOf("microsoft") != -1) {
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

    @ObfuscatedName("cp.s(Ljava/awt/Component;I)V")
    public static void method1488(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field671);
        arg0.addFocusListener(field671);
    }

    @ObfuscatedName("ef.q(I)V")
    public static void method2692() {
        if (field671 != null) {
            class51 var0 = field671;
            synchronized (field671) {
                field671 = null;
            }
        }
    }

    @ObfuscatedName("fp.o(B)Z")
    public static final boolean method2946() {
        class51 var0 = field671;
        synchronized (field671) {
            if (field668 == field640) {
                return false;
            } else {
                Statics.field3631 = field665[field668];
                Statics.field619 = field647[field668];
                field668 = field668 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field671 == null) {
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
        if (field663 >= 0 && var3 >= 0) {
            field661[field663] = var3;
            field663 = field663 + 1 & 0x7F;
            if (field663 == field654) {
                field663 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field662 + 1 & 0x7F;
            if (field668 != var4) {
                field665[field662] = var3;
                field647[field662] = 0;
                field662 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field671 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field670.length) {
                var3 = field670[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field663 >= 0 && var3 >= 0) {
                field661[field663] = ~var3;
                field663 = field663 + 1 & 0x7F;
                if (field663 == field654) {
                    field663 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field671 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class267.field3667;
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
                    int var7 = field662 + 1 & 0x7F;
                    if (field668 != var7) {
                        field665[field662] = -1;
                        field647[field662] = var2;
                        field662 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field671 != null) {
            field663 = -1;
        }
    }
}
