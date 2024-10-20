package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ep")
public final class class138 implements KeyListener, FocusListener {

    @ObfuscatedName("ep.j")
    public static class138 field2090 = new class138();

    @ObfuscatedName("ep.cj")
    public static boolean[] field2096 = new boolean[112];

    @ObfuscatedName("ep.cp")
    public static int[] field2098 = new int[128];

    @ObfuscatedName("ep.cx")
    public static int field2099 = 0;

    @ObfuscatedName("ep.co")
    public static int field2100 = 0;

    @ObfuscatedName("ep.cm")
    public static char[] field2101 = new char[128];

    @ObfuscatedName("ep.cy")
    public static int[] field2102 = new int[128];

    @ObfuscatedName("ep.cc")
    public static int[] field2103 = new int[128];

    @ObfuscatedName("ep.cb")
    public static int field2089 = 0;

    @ObfuscatedName("ep.ct")
    public static int field2093 = 0;

    @ObfuscatedName("ep.cg")
    public static int field2106 = 0;

    @ObfuscatedName("ep.ci")
    public static int field2107 = 0;

    @ObfuscatedName("ep.cq")
    public static volatile int field2105 = 0;

    @ObfuscatedName("ep.cd")
    public static int[] field2109 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("et.j(I)V")
    public static void method2693() {
        if (Statics.field2077.toLowerCase().indexOf("microsoft") != -1) {
            field2109[186] = 57;
            field2109[187] = 27;
            field2109[188] = 71;
            field2109[189] = 26;
            field2109[190] = 72;
            field2109[191] = 73;
            field2109[192] = 58;
            field2109[219] = 42;
            field2109[220] = 74;
            field2109[221] = 43;
            field2109[222] = 59;
            field2109[223] = 28;
            return;
        }
        field2109[44] = 71;
        field2109[45] = 26;
        field2109[46] = 72;
        field2109[47] = 73;
        field2109[59] = 57;
        field2109[61] = 27;
        field2109[91] = 42;
        field2109[92] = 74;
        field2109[93] = 43;
        field2109[192] = 28;
        field2109[222] = 58;
        field2109[520] = 59;
    }

    @ObfuscatedName("d.h(I)V")
    public static void method165() {
        if (field2090 != null) {
            class138 var0 = field2090;
            synchronized (field2090) {
                field2090 = null;
            }
        }
    }

    @ObfuscatedName("ds.m(I)V")
    public static void method2646() {
        class138 var0 = field2090;
        synchronized (field2090) {
            field2105++;
            field2093 = field2107;
            field2089 = 0;
            if (field2100 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field2096[var1] = false;
                }
                field2100 = field2099;
            } else {
                while (field2100 != field2099) {
                    int var2 = field2098[field2099];
                    field2099 = field2099 + 1 & 0x7F;
                    if (var2 < 0) {
                        field2096[~var2] = false;
                    } else {
                        if (!field2096[var2] && field2089 < field2103.length - 1) {
                            field2103[++field2089 - 1] = var2;
                        }
                        field2096[var2] = true;
                    }
                }
            }
            field2107 = field2106;
        }
    }

    @ObfuscatedName("m.z(I)Z")
    public static final boolean method30() {
        class138 var0 = field2090;
        synchronized (field2090) {
            if (field2107 == field2093) {
                return false;
            } else {
                Statics.field3057 = field2102[field2093];
                Statics.field2082 = field2101[field2093];
                field2093 = field2093 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("c.x(I)I")
    public static int method107() {
        return field2105;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2090 == null) {
            return;
        }
        field2105 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2109.length) {
            var3 = field2109[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2100 >= 0 && var3 >= 0) {
            field2098[field2100] = var3;
            field2100 = field2100 + 1 & 0x7F;
            if (field2100 == field2099) {
                field2100 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2106 + 1 & 0x7F;
            if (field2093 != var4) {
                field2102[field2106] = var3;
                field2101[field2106] = 0;
                field2106 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2090 != null) {
            field2105 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2109.length) {
                var3 = field2109[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2100 >= 0 && var3 >= 0) {
                field2098[field2100] = ~var3;
                field2100 = field2100 + 1 & 0x7F;
                if (field2100 == field2099) {
                    field2100 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2090 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class166.field2656;
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
                    int var7 = field2106 + 1 & 0x7F;
                    if (field2093 != var7) {
                        field2102[field2106] = -1;
                        field2101[field2106] = var2;
                        field2106 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2090 != null) {
            field2100 = -1;
        }
    }
}
