package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ed")
public final class class137 implements KeyListener, FocusListener {

    @ObfuscatedName("ed.n")
    public static class137 field2108 = new class137();

    @ObfuscatedName("ed.cm")
    public static boolean[] field2098 = new boolean[112];

    @ObfuscatedName("ed.cp")
    public static int[] field2102 = new int[128];

    @ObfuscatedName("ed.cn")
    public static int field2100 = 0;

    @ObfuscatedName("ed.cc")
    public static int field2099 = 0;

    @ObfuscatedName("ed.ct")
    public static char[] field2086 = new char[128];

    @ObfuscatedName("ed.cz")
    public static int[] field2090 = new int[128];

    @ObfuscatedName("ed.ca")
    public static int[] field2104 = new int[128];

    @ObfuscatedName("ed.cj")
    public static int field2105 = 0;

    @ObfuscatedName("ed.cf")
    public static int field2106 = 0;

    @ObfuscatedName("ed.ck")
    public static int field2107 = 0;

    @ObfuscatedName("ed.cb")
    public static int field2101 = 0;

    @ObfuscatedName("ed.cl")
    public static volatile int field2109 = 0;

    @ObfuscatedName("ed.cq")
    public static int[] field2087 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("df.n(I)V")
    public static void method2611() {
        if (Statics.field2078.toLowerCase().indexOf("microsoft") != -1) {
            field2087[186] = 57;
            field2087[187] = 27;
            field2087[188] = 71;
            field2087[189] = 26;
            field2087[190] = 72;
            field2087[191] = 73;
            field2087[192] = 58;
            field2087[219] = 42;
            field2087[220] = 74;
            field2087[221] = 43;
            field2087[222] = 59;
            field2087[223] = 28;
            return;
        }
        field2087[44] = 71;
        field2087[45] = 26;
        field2087[46] = 72;
        field2087[47] = 73;
        field2087[59] = 57;
        field2087[61] = 27;
        field2087[91] = 42;
        field2087[92] = 74;
        field2087[93] = 43;
        field2087[192] = 28;
        field2087[222] = 58;
        field2087[520] = 59;
    }

    @ObfuscatedName("cj.d(Ljava/awt/Component;B)V")
    public static void method2019(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field2108);
        arg0.addFocusListener(field2108);
    }

    @ObfuscatedName("du.s(Ljava/awt/Component;B)V")
    public static void method2281(Component arg0) {
        arg0.removeKeyListener(field2108);
        arg0.removeFocusListener(field2108);
        field2099 = -1;
    }

    @ObfuscatedName("ej.q(B)V")
    public static void method2910() {
        class137 var0 = field2108;
        synchronized (field2108) {
            field2109++;
            field2106 = field2101;
            field2105 = 0;
            if (field2099 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field2098[var1] = false;
                }
                field2099 = field2100;
            } else {
                while (field2100 != field2099) {
                    int var2 = field2102[field2100];
                    field2100 = field2100 + 1 & 0x7F;
                    if (var2 < 0) {
                        field2098[~var2] = false;
                    } else {
                        if (!field2098[var2] && field2105 < field2104.length - 1) {
                            field2104[++field2105 - 1] = var2;
                        }
                        field2098[var2] = true;
                    }
                }
            }
            field2101 = field2107;
        }
    }

    @ObfuscatedName("di.j(I)Z")
    public static final boolean method2593() {
        class137 var0 = field2108;
        synchronized (field2108) {
            if (field2106 == field2101) {
                return false;
            } else {
                Statics.field1581 = field2090[field2106];
                Statics.field1516 = field2086[field2106];
                field2106 = field2106 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2108 == null) {
            return;
        }
        field2109 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2087.length) {
            var3 = field2087[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2099 >= 0 && var3 >= 0) {
            field2102[field2099] = var3;
            field2099 = field2099 + 1 & 0x7F;
            if (field2100 == field2099) {
                field2099 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2107 + 1 & 0x7F;
            if (field2106 != var4) {
                field2090[field2107] = var3;
                field2086[field2107] = 0;
                field2107 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2108 != null) {
            field2109 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2087.length) {
                var3 = field2087[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2099 >= 0 && var3 >= 0) {
                field2102[field2099] = ~var3;
                field2099 = field2099 + 1 & 0x7F;
                if (field2100 == field2099) {
                    field2099 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2108 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class165.field2646;
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
                    int var7 = field2107 + 1 & 0x7F;
                    if (field2106 != var7) {
                        field2090[field2107] = -1;
                        field2086[field2107] = var2;
                        field2107 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2108 != null) {
            field2099 = -1;
        }
    }
}
