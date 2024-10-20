package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ep")
public final class class137 implements KeyListener, FocusListener {

    @ObfuscatedName("ep.d")
    public static class137 field2107 = new class137();

    @ObfuscatedName("ep.cq")
    public static boolean[] field2093 = new boolean[112];

    @ObfuscatedName("ep.ci")
    public static int[] field2094 = new int[128];

    @ObfuscatedName("ep.cm")
    public static int field2095 = 0;

    @ObfuscatedName("ep.cr")
    public static int field2096 = 0;

    @ObfuscatedName("ep.cb")
    public static char[] field2097 = new char[128];

    @ObfuscatedName("ep.cj")
    public static int[] field2098 = new int[128];

    @ObfuscatedName("ep.cn")
    public static int[] field2085 = new int[128];

    @ObfuscatedName("ep.cd")
    public static int field2105 = 0;

    @ObfuscatedName("ep.cw")
    public static int field2101 = 0;

    @ObfuscatedName("ep.ct")
    public static int field2083 = 0;

    @ObfuscatedName("ep.cz")
    public static int field2103 = 0;

    @ObfuscatedName("ep.ca")
    public static volatile int field2104 = 0;

    @ObfuscatedName("ep.cy")
    public static int[] field2081 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("ap.d(I)V")
    public static void method725() {
        if (Statics.field2069.toLowerCase().indexOf("microsoft") != -1) {
            field2081[186] = 57;
            field2081[187] = 27;
            field2081[188] = 71;
            field2081[189] = 26;
            field2081[190] = 72;
            field2081[191] = 73;
            field2081[192] = 58;
            field2081[219] = 42;
            field2081[220] = 74;
            field2081[221] = 43;
            field2081[222] = 59;
            field2081[223] = 28;
            return;
        }
        field2081[44] = 71;
        field2081[45] = 26;
        field2081[46] = 72;
        field2081[47] = 73;
        field2081[59] = 57;
        field2081[61] = 27;
        field2081[91] = 42;
        field2081[92] = 74;
        field2081[93] = 43;
        field2081[192] = 28;
        field2081[222] = 58;
        field2081[520] = 59;
    }

    @ObfuscatedName("ay.p(Ljava/awt/Component;I)V")
    public static void method966(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field2107);
        arg0.addFocusListener(field2107);
    }

    @ObfuscatedName("ey.v(Ljava/awt/Component;I)V")
    public static void method2709(Component arg0) {
        arg0.removeKeyListener(field2107);
        arg0.removeFocusListener(field2107);
        field2096 = -1;
    }

    @ObfuscatedName("cp.l(B)V")
    public static void method1957() {
        class137 var0 = field2107;
        synchronized (field2107) {
            field2104++;
            field2101 = field2103;
            field2105 = 0;
            if (field2096 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field2093[var1] = false;
                }
                field2096 = field2095;
            } else {
                while (field2096 != field2095) {
                    int var2 = field2094[field2095];
                    field2095 = field2095 + 1 & 0x7F;
                    if (var2 < 0) {
                        field2093[~var2] = false;
                    } else {
                        if (!field2093[var2] && field2105 < field2085.length - 1) {
                            field2085[++field2105 - 1] = var2;
                        }
                        field2093[var2] = true;
                    }
                }
            }
            field2103 = field2083;
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2107 == null) {
            return;
        }
        field2104 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2081.length) {
            var3 = field2081[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2096 >= 0 && var3 >= 0) {
            field2094[field2096] = var3;
            field2096 = field2096 + 1 & 0x7F;
            if (field2096 == field2095) {
                field2096 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2083 + 1 & 0x7F;
            if (field2101 != var4) {
                field2098[field2083] = var3;
                field2097[field2083] = 0;
                field2083 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2107 != null) {
            field2104 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2081.length) {
                var3 = field2081[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2096 >= 0 && var3 >= 0) {
                field2094[field2096] = ~var3;
                field2096 = field2096 + 1 & 0x7F;
                if (field2096 == field2095) {
                    field2096 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2107 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class165.field2635;
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
                    int var7 = field2083 + 1 & 0x7F;
                    if (field2101 != var7) {
                        field2098[field2083] = -1;
                        field2097[field2083] = var2;
                        field2083 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2107 != null) {
            field2096 = -1;
        }
    }
}
