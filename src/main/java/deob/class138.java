package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ea")
public final class class138 implements KeyListener, FocusListener {

    @ObfuscatedName("ea.e")
    public static class138 field2105 = new class138();

    @ObfuscatedName("ea.cr")
    public static boolean[] field2104 = new boolean[112];

    @ObfuscatedName("ea.cw")
    public static int[] field2100 = new int[128];

    @ObfuscatedName("ea.cd")
    public static int field2117 = 0;

    @ObfuscatedName("ea.cg")
    public static int field2112 = 0;

    @ObfuscatedName("ea.cc")
    public static char[] field2108 = new char[128];

    @ObfuscatedName("ea.cu")
    public static int[] field2109 = new int[128];

    @ObfuscatedName("ea.cs")
    public static int[] field2103 = new int[128];

    @ObfuscatedName("ea.cn")
    public static int field2120 = 0;

    @ObfuscatedName("ea.cx")
    public static int field2094 = 0;

    @ObfuscatedName("ea.cv")
    public static int field2113 = 0;

    @ObfuscatedName("ea.co")
    public static int field2110 = 0;

    @ObfuscatedName("ea.cj")
    public static volatile int field2115 = 0;

    @ObfuscatedName("ea.cp")
    public static int[] field2116 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("cq.e(Ljava/awt/Component;I)V")
    public static void method1759(Component arg0) {
        arg0.removeKeyListener(field2105);
        arg0.removeFocusListener(field2105);
        field2112 = -1;
    }

    @ObfuscatedName("er.w(B)V")
    public static void method2666() {
        if (field2105 != null) {
            class138 var0 = field2105;
            synchronized (field2105) {
                field2105 = null;
            }
        }
    }

    @ObfuscatedName("dx.f(I)Z")
    public static final boolean method2622() {
        class138 var0 = field2105;
        synchronized (field2105) {
            if (field2110 == field2094) {
                return false;
            } else {
                Statics.field2159 = field2109[field2094];
                Statics.field1884 = field2108[field2094];
                field2094 = field2094 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("dj.s(I)I")
    public static int method2236() {
        return field2115;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2105 == null) {
            return;
        }
        field2115 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2116.length) {
            var3 = field2116[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2112 >= 0 && var3 >= 0) {
            field2100[field2112] = var3;
            field2112 = field2112 + 1 & 0x7F;
            if (field2117 == field2112) {
                field2112 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2113 + 1 & 0x7F;
            if (field2094 != var4) {
                field2109[field2113] = var3;
                field2108[field2113] = 0;
                field2113 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2105 != null) {
            field2115 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2116.length) {
                var3 = field2116[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2112 >= 0 && var3 >= 0) {
                field2100[field2112] = ~var3;
                field2112 = field2112 + 1 & 0x7F;
                if (field2117 == field2112) {
                    field2112 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2105 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class166.field2660;
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
                    int var7 = field2113 + 1 & 0x7F;
                    if (field2094 != var7) {
                        field2109[field2113] = -1;
                        field2108[field2113] = var2;
                        field2113 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2105 != null) {
            field2112 = -1;
        }
    }
}
