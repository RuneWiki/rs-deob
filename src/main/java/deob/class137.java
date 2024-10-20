package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("el")
public final class class137 implements KeyListener, FocusListener {

    @ObfuscatedName("el.v")
    public static class137 field2117 = new class137();

    @ObfuscatedName("el.cg")
    public static boolean[] field2118 = new boolean[112];

    @ObfuscatedName("el.cd")
    public static int[] field2121 = new int[128];

    @ObfuscatedName("el.co")
    public static int field2122 = 0;

    @ObfuscatedName("el.cx")
    public static int field2123 = 0;

    @ObfuscatedName("el.ce")
    public static char[] field2124 = new char[128];

    @ObfuscatedName("el.cv")
    public static int[] field2125 = new int[128];

    @ObfuscatedName("el.ct")
    public static int[] field2126 = new int[128];

    @ObfuscatedName("el.cb")
    public static int field2132 = 0;

    @ObfuscatedName("el.cc")
    public static int field2128 = 0;

    @ObfuscatedName("el.cz")
    public static int field2129 = 0;

    @ObfuscatedName("el.cn")
    public static int field2130 = 0;

    @ObfuscatedName("el.ca")
    public static volatile int field2106 = 0;

    @ObfuscatedName("el.ci")
    public static int[] field2114 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("fc.v(Ljava/awt/Component;I)V")
    public static void method2965(Component arg0) {
        arg0.removeKeyListener(field2117);
        arg0.removeFocusListener(field2117);
        field2123 = -1;
    }

    @ObfuscatedName("b.f(I)Z")
    public static final boolean method564() {
        class137 var0 = field2117;
        synchronized (field2117) {
            if (field2130 == field2128) {
                return false;
            } else {
                Statics.field2120 = field2125[field2128];
                Statics.field2111 = field2124[field2128];
                field2128 = field2128 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("ei.i(I)I")
    public static int method2891() {
        return field2106;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2117 == null) {
            return;
        }
        field2106 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2114.length) {
            var3 = field2114[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2123 >= 0 && var3 >= 0) {
            field2121[field2123] = var3;
            field2123 = field2123 + 1 & 0x7F;
            if (field2123 == field2122) {
                field2123 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2129 + 1 & 0x7F;
            if (field2128 != var4) {
                field2125[field2129] = var3;
                field2124[field2129] = 0;
                field2129 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2117 != null) {
            field2106 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2114.length) {
                var3 = field2114[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2123 >= 0 && var3 >= 0) {
                field2121[field2123] = ~var3;
                field2123 = field2123 + 1 & 0x7F;
                if (field2123 == field2122) {
                    field2123 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2117 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class165.field2669;
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
                    int var7 = field2129 + 1 & 0x7F;
                    if (field2128 != var7) {
                        field2125[field2129] = -1;
                        field2124[field2129] = var2;
                        field2129 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2117 != null) {
            field2123 = -1;
        }
    }
}
