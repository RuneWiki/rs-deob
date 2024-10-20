package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("en")
public final class class137 implements KeyListener, FocusListener {

    @ObfuscatedName("en.y")
    public static class137 field2096 = new class137();

    @ObfuscatedName("en.co")
    public static boolean[] field2094 = new boolean[112];

    @ObfuscatedName("en.ck")
    public static int[] field2082 = new int[128];

    @ObfuscatedName("en.cj")
    public static int field2105 = 0;

    @ObfuscatedName("en.cb")
    public static int field2097 = 0;

    @ObfuscatedName("en.cq")
    public static char[] field2098 = new char[128];

    @ObfuscatedName("en.cv")
    public static int[] field2099 = new int[128];

    @ObfuscatedName("en.cd")
    public static int[] field2100 = new int[128];

    @ObfuscatedName("en.cf")
    public static int field2101 = 0;

    @ObfuscatedName("en.ce")
    public static int field2102 = 0;

    @ObfuscatedName("en.cw")
    public static int field2090 = 0;

    @ObfuscatedName("en.cx")
    public static int field2086 = 0;

    @ObfuscatedName("en.cl")
    public static volatile int field2103 = 0;

    @ObfuscatedName("en.cg")
    public static int[] field2106 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("p.y(I)V")
    public static void method190() {
        if (Statics.field2074.toLowerCase().indexOf("microsoft") != -1) {
            field2106[186] = 57;
            field2106[187] = 27;
            field2106[188] = 71;
            field2106[189] = 26;
            field2106[190] = 72;
            field2106[191] = 73;
            field2106[192] = 58;
            field2106[219] = 42;
            field2106[220] = 74;
            field2106[221] = 43;
            field2106[222] = 59;
            field2106[223] = 28;
            return;
        }
        field2106[44] = 71;
        field2106[45] = 26;
        field2106[46] = 72;
        field2106[47] = 73;
        field2106[59] = 57;
        field2106[61] = 27;
        field2106[91] = 42;
        field2106[92] = 74;
        field2106[93] = 43;
        field2106[192] = 28;
        field2106[222] = 58;
        field2106[520] = 59;
    }

    @ObfuscatedName("cq.g(B)Z")
    public static final boolean method2009() {
        class137 var0 = field2096;
        synchronized (field2096) {
            if (field2102 == field2086) {
                return false;
            } else {
                Statics.field2016 = field2099[field2102];
                Statics.field183 = field2098[field2102];
                field2102 = field2102 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2096 == null) {
            return;
        }
        field2103 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2106.length) {
            var3 = field2106[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2097 >= 0 && var3 >= 0) {
            field2082[field2097] = var3;
            field2097 = field2097 + 1 & 0x7F;
            if (field2105 == field2097) {
                field2097 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2090 + 1 & 0x7F;
            if (field2102 != var4) {
                field2099[field2090] = var3;
                field2098[field2090] = 0;
                field2090 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2096 != null) {
            field2103 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2106.length) {
                var3 = field2106[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2097 >= 0 && var3 >= 0) {
                field2082[field2097] = ~var3;
                field2097 = field2097 + 1 & 0x7F;
                if (field2105 == field2097) {
                    field2097 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2096 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class165.field2640;
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
                    int var7 = field2090 + 1 & 0x7F;
                    if (field2102 != var7) {
                        field2099[field2090] = -1;
                        field2098[field2090] = var2;
                        field2090 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2096 != null) {
            field2097 = -1;
        }
    }
}
