package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ei")
public final class class141 implements KeyListener, FocusListener {

    @ObfuscatedName("ei.f")
    public static class141 field2178 = new class141();

    @ObfuscatedName("ei.co")
    public static boolean[] field2154 = new boolean[112];

    @ObfuscatedName("ei.ct")
    public static int[] field2159 = new int[128];

    @ObfuscatedName("ei.ch")
    public static int field2168 = 0;

    @ObfuscatedName("ei.ck")
    public static int field2169 = 0;

    @ObfuscatedName("ei.cq")
    public static char[] field2163 = new char[128];

    @ObfuscatedName("ei.ce")
    public static int[] field2171 = new int[128];

    @ObfuscatedName("ei.cs")
    public static int[] field2172 = new int[128];

    @ObfuscatedName("ei.cy")
    public static int field2173 = 0;

    @ObfuscatedName("ei.cm")
    public static int field2174 = 0;

    @ObfuscatedName("ei.cu")
    public static int field2175 = 0;

    @ObfuscatedName("ei.cf")
    public static int field2176 = 0;

    @ObfuscatedName("ei.cc")
    public static volatile int field2177 = 0;

    @ObfuscatedName("ei.cr")
    public static int[] field2166 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("ae.f(Ljava/awt/Component;I)V")
    public static void method665(Component arg0) {
        arg0.removeKeyListener(field2178);
        arg0.removeFocusListener(field2178);
        field2169 = -1;
    }

    @ObfuscatedName("e.e(I)V")
    public static void method16() {
        if (field2178 != null) {
            class141 var0 = field2178;
            synchronized (field2178) {
                field2178 = null;
            }
        }
    }

    @ObfuscatedName("hn.n(B)Z")
    public static final boolean method3786() {
        class141 var0 = field2178;
        synchronized (field2178) {
            if (field2176 == field2174) {
                return false;
            } else {
                Statics.field2162 = field2171[field2174];
                Statics.field2164 = field2163[field2174];
                field2174 = field2174 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2178 == null) {
            return;
        }
        field2177 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2166.length) {
            var3 = field2166[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2169 >= 0 && var3 >= 0) {
            field2159[field2169] = var3;
            field2169 = field2169 + 1 & 0x7F;
            if (field2169 == field2168) {
                field2169 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2175 + 1 & 0x7F;
            if (field2174 != var4) {
                field2171[field2175] = var3;
                field2163[field2175] = 0;
                field2175 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2178 != null) {
            field2177 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2166.length) {
                var3 = field2166[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2169 >= 0 && var3 >= 0) {
                field2159[field2169] = ~var3;
                field2169 = field2169 + 1 & 0x7F;
                if (field2169 == field2168) {
                    field2169 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2178 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class169.field2699;
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
                    int var7 = field2175 + 1 & 0x7F;
                    if (field2174 != var7) {
                        field2171[field2175] = -1;
                        field2163[field2175] = var2;
                        field2175 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2178 != null) {
            field2169 = -1;
        }
    }
}
