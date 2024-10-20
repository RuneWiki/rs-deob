package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ex")
public final class class138 implements KeyListener, FocusListener {

    @ObfuscatedName("ex.w")
    public static class138 field2132 = new class138();

    @ObfuscatedName("ex.cy")
    public static boolean[] field2136 = new boolean[112];

    @ObfuscatedName("ex.cd")
    public static int[] field2122 = new int[128];

    @ObfuscatedName("ex.cn")
    public static int field2126 = 0;

    @ObfuscatedName("ex.ck")
    public static int field2134 = 0;

    @ObfuscatedName("ex.ct")
    public static char[] field2135 = new char[128];

    @ObfuscatedName("ex.cx")
    public static int[] field2123 = new int[128];

    @ObfuscatedName("ex.cr")
    public static int[] field2131 = new int[128];

    @ObfuscatedName("ex.cp")
    public static int field2138 = 0;

    @ObfuscatedName("ex.ce")
    public static int field2139 = 0;

    @ObfuscatedName("ex.cq")
    public static int field2117 = 0;

    @ObfuscatedName("ex.cg")
    public static int field2141 = 0;

    @ObfuscatedName("ex.cj")
    public static volatile int field2142 = 0;

    @ObfuscatedName("ex.cu")
    public static int[] field2140 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("az.w(B)V")
    public static void method762() {
        if (field2132 != null) {
            class138 var0 = field2132;
            synchronized (field2132) {
                field2132 = null;
            }
        }
    }

    @ObfuscatedName("l.x(B)V")
    public static void method120() {
        class138 var0 = field2132;
        synchronized (field2132) {
            field2142++;
            field2139 = field2141;
            field2138 = 0;
            if (field2134 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field2136[var1] = false;
                }
                field2134 = field2126;
            } else {
                while (field2134 != field2126) {
                    int var2 = field2122[field2126];
                    field2126 = field2126 + 1 & 0x7F;
                    if (var2 < 0) {
                        field2136[~var2] = false;
                    } else {
                        if (!field2136[var2] && field2138 < field2131.length - 1) {
                            field2131[++field2138 - 1] = var2;
                        }
                        field2136[var2] = true;
                    }
                }
            }
            field2141 = field2117;
        }
    }

    @ObfuscatedName("dl.t(I)Z")
    public static final boolean method2647() {
        class138 var0 = field2132;
        synchronized (field2132) {
            if (field2141 == field2139) {
                return false;
            } else {
                Statics.field2119 = field2123[field2139];
                Statics.field773 = field2135[field2139];
                field2139 = field2139 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2132 == null) {
            return;
        }
        field2142 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2140.length) {
            var3 = field2140[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2134 >= 0 && var3 >= 0) {
            field2122[field2134] = var3;
            field2134 = field2134 + 1 & 0x7F;
            if (field2134 == field2126) {
                field2134 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2117 + 1 & 0x7F;
            if (field2139 != var4) {
                field2123[field2117] = var3;
                field2135[field2117] = 0;
                field2117 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2132 != null) {
            field2142 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2140.length) {
                var3 = field2140[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2134 >= 0 && var3 >= 0) {
                field2122[field2134] = ~var3;
                field2134 = field2134 + 1 & 0x7F;
                if (field2134 == field2126) {
                    field2134 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2132 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class166.field2682;
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
                    int var7 = field2117 + 1 & 0x7F;
                    if (field2139 != var7) {
                        field2123[field2117] = -1;
                        field2135[field2117] = var2;
                        field2117 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2132 != null) {
            field2134 = -1;
        }
    }
}
