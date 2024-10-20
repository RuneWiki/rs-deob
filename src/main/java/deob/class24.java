package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("f")
public final class class24 implements KeyListener, FocusListener {

    @ObfuscatedName("f.i")
    public static class24 field122 = new class24();

    @ObfuscatedName("f.cl")
    public static boolean[] field118 = new boolean[112];

    @ObfuscatedName("f.cs")
    public static boolean[] field119 = new boolean[112];

    @ObfuscatedName("f.ce")
    public static boolean[] field120 = new boolean[112];

    @ObfuscatedName("f.cw")
    public static int[] field121 = new int[128];

    @ObfuscatedName("f.cr")
    public static int field134 = 0;

    @ObfuscatedName("f.cu")
    public static int field123 = 0;

    @ObfuscatedName("f.cc")
    public static char[] field113 = new char[128];

    @ObfuscatedName("f.ch")
    public static int[] field125 = new int[128];

    @ObfuscatedName("f.cz")
    public static int[] field126 = new int[128];

    @ObfuscatedName("f.cv")
    public static int field111 = 0;

    @ObfuscatedName("f.cf")
    public static int[] field128 = new int[128];

    @ObfuscatedName("f.cm")
    public static int field136 = 0;

    @ObfuscatedName("f.co")
    public static int field108 = 0;

    @ObfuscatedName("f.cy")
    public static int field131 = 0;

    @ObfuscatedName("f.cb")
    public static int field132 = 0;

    @ObfuscatedName("f.dq")
    public static volatile int field129 = 0;

    @ObfuscatedName("f.df")
    public static int[] field133 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("en.i(B)Z")
    public static final boolean method2714() {
        class24 var0 = field122;
        synchronized (field122) {
            if (field132 == field108) {
                return false;
            } else {
                Statics.field56 = field125[field108];
                Statics.field3859 = field113[field108];
                field108 = field108 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("ai.w(I)I")
    public static int method576() {
        return field129;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field122 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field133.length) {
            var3 = field133[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field123 >= 0 && var3 >= 0) {
            field121[field123] = var3;
            field123 = field123 + 1 & 0x7F;
            if (field134 == field123) {
                field123 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field131 + 1 & 0x7F;
            if (field108 != var4) {
                field125[field131] = var3;
                field113[field131] = 0;
                field131 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field122 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field133.length) {
                var3 = field133[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field123 >= 0 && var3 >= 0) {
                field121[field123] = ~var3;
                field123 = field123 + 1 & 0x7F;
                if (field134 == field123) {
                    field123 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field122 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class317.field3849;
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
                    int var7 = field131 + 1 & 0x7F;
                    if (field108 != var7) {
                        field125[field131] = -1;
                        field113[field131] = var2;
                        field131 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    @ObfuscatedName("iq.s(II)Z")
    public static boolean method4477(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? field119[arg0] : false;
    }

    @ObfuscatedName("jb.a(II)Z")
    public static boolean method4679(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? field118[arg0] : false;
    }

    @ObfuscatedName("ff.o(II)Z")
    public static boolean method3085(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? field120[arg0] : false;
    }

    @ObfuscatedName("p.g(I)[I")
    public static int[] method53() {
        int[] var0 = new int[field111];
        for (int var1 = 0; var1 < field111; var1++) {
            var0[var1] = field126[var1];
        }
        return var0;
    }

    @ObfuscatedName("ew.e(I)[I")
    public static int[] method2585() {
        int[] var0 = new int[field136];
        for (int var1 = 0; var1 < field136; var1++) {
            var0[var1] = field128[var1];
        }
        return var0;
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field122 != null) {
            field123 = -1;
        }
    }
}
