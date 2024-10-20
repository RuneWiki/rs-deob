package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ew")
public final class class141 implements KeyListener, FocusListener {

    @ObfuscatedName("ew.l")
    public static class141 field2158 = new class141();

    @ObfuscatedName("ew.cy")
    public static boolean[] field2172 = new boolean[112];

    @ObfuscatedName("ew.cs")
    public static int[] field2182 = new int[128];

    @ObfuscatedName("ew.cb")
    public static int field2174 = 0;

    @ObfuscatedName("ew.ci")
    public static int field2169 = 0;

    @ObfuscatedName("ew.cj")
    public static char[] field2176 = new char[128];

    @ObfuscatedName("ew.co")
    public static int[] field2156 = new int[128];

    @ObfuscatedName("ew.ct")
    public static int[] field2162 = new int[128];

    @ObfuscatedName("ew.cp")
    public static int field2179 = 0;

    @ObfuscatedName("ew.cx")
    public static int field2180 = 0;

    @ObfuscatedName("ew.cn")
    public static int field2181 = 0;

    @ObfuscatedName("ew.cr")
    public static int field2160 = 0;

    @ObfuscatedName("ew.cu")
    public static volatile int field2183 = 0;

    @ObfuscatedName("ew.cd")
    public static int[] field2184 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("ed.l(I)V")
    public static void method2883() {
        if (Statics.field2153.toLowerCase().indexOf("microsoft") != -1) {
            field2184[186] = 57;
            field2184[187] = 27;
            field2184[188] = 71;
            field2184[189] = 26;
            field2184[190] = 72;
            field2184[191] = 73;
            field2184[192] = 58;
            field2184[219] = 42;
            field2184[220] = 74;
            field2184[221] = 43;
            field2184[222] = 59;
            field2184[223] = 28;
            return;
        }
        field2184[44] = 71;
        field2184[45] = 26;
        field2184[46] = 72;
        field2184[47] = 73;
        field2184[59] = 57;
        field2184[61] = 27;
        field2184[91] = 42;
        field2184[92] = 74;
        field2184[93] = 43;
        field2184[192] = 28;
        field2184[222] = 58;
        field2184[520] = 59;
    }

    @ObfuscatedName("x.g(Ljava/awt/Component;I)V")
    public static void method575(Component arg0) {
        arg0.removeKeyListener(field2158);
        arg0.removeFocusListener(field2158);
        field2169 = -1;
    }

    @ObfuscatedName("ee.r(I)Z")
    public static final boolean method3086() {
        class141 var0 = field2158;
        synchronized (field2158) {
            if (field2180 == field2160) {
                return false;
            } else {
                Statics.field644 = field2156[field2180];
                Statics.field1147 = field2176[field2180];
                field2180 = field2180 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("r.e(I)I")
    public static int method42() {
        return field2183;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2158 == null) {
            return;
        }
        field2183 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2184.length) {
            var3 = field2184[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2169 >= 0 && var3 >= 0) {
            field2182[field2169] = var3;
            field2169 = field2169 + 1 & 0x7F;
            if (field2174 == field2169) {
                field2169 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2181 + 1 & 0x7F;
            if (field2180 != var4) {
                field2156[field2181] = var3;
                field2176[field2181] = 0;
                field2181 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2158 != null) {
            field2183 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2184.length) {
                var3 = field2184[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2169 >= 0 && var3 >= 0) {
                field2182[field2169] = ~var3;
                field2169 = field2169 + 1 & 0x7F;
                if (field2174 == field2169) {
                    field2169 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2158 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class169.field2719;
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
                    int var7 = field2181 + 1 & 0x7F;
                    if (field2180 != var7) {
                        field2156[field2181] = -1;
                        field2176[field2181] = var2;
                        field2181 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2158 != null) {
            field2169 = -1;
        }
    }
}
