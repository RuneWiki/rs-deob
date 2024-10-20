package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ey")
public final class class141 implements KeyListener, FocusListener {

    @ObfuscatedName("ey.k")
    public static class141 field2173 = new class141();

    @ObfuscatedName("ey.ce")
    public static boolean[] field2164 = new boolean[112];

    @ObfuscatedName("ey.cp")
    public static int[] field2165 = new int[128];

    @ObfuscatedName("ey.cd")
    public static int field2161 = 0;

    @ObfuscatedName("ey.cq")
    public static int field2167 = 0;

    @ObfuscatedName("ey.co")
    public static char[] field2166 = new char[128];

    @ObfuscatedName("ey.cj")
    public static int[] field2169 = new int[128];

    @ObfuscatedName("ey.ck")
    public static int[] field2170 = new int[128];

    @ObfuscatedName("ey.ch")
    public static int field2171 = 0;

    @ObfuscatedName("ey.cf")
    public static int field2174 = 0;

    @ObfuscatedName("ey.cw")
    public static int field2178 = 0;

    @ObfuscatedName("ey.cz")
    public static int field2168 = 0;

    @ObfuscatedName("ey.cy")
    public static volatile int field2162 = 0;

    @ObfuscatedName("ey.cl")
    public static int[] field2176 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("w.k(Ljava/awt/Component;I)V")
    public static void method160(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field2173);
        arg0.addFocusListener(field2173);
    }

    @ObfuscatedName("ax.q(B)V")
    public static void method741() {
        if (field2173 != null) {
            class141 var0 = field2173;
            synchronized (field2173) {
                field2173 = null;
            }
        }
    }

    @ObfuscatedName("k.f(I)Z")
    public static final boolean method3() {
        class141 var0 = field2173;
        synchronized (field2173) {
            if (field2174 == field2168) {
                return false;
            } else {
                Statics.field198 = field2169[field2174];
                Statics.field1745 = field2166[field2174];
                field2174 = field2174 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2173 == null) {
            return;
        }
        field2162 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2176.length) {
            var3 = field2176[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2167 >= 0 && var3 >= 0) {
            field2165[field2167] = var3;
            field2167 = field2167 + 1 & 0x7F;
            if (field2167 == field2161) {
                field2167 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2178 + 1 & 0x7F;
            if (field2174 != var4) {
                field2169[field2178] = var3;
                field2166[field2178] = 0;
                field2178 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2173 != null) {
            field2162 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2176.length) {
                var3 = field2176[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2167 >= 0 && var3 >= 0) {
                field2165[field2167] = ~var3;
                field2167 = field2167 + 1 & 0x7F;
                if (field2167 == field2161) {
                    field2167 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2173 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class169.field2706;
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
                    int var7 = field2178 + 1 & 0x7F;
                    if (field2174 != var7) {
                        field2169[field2178] = -1;
                        field2166[field2178] = var2;
                        field2178 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2173 != null) {
            field2167 = -1;
        }
    }
}
