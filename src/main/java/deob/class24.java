package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;

@ObfuscatedName("t")
public final class class24 implements KeyListener, FocusListener {

    @ObfuscatedName("t.s")
    public static class24 field141 = new class24();

    @ObfuscatedName("t.cc")
    public static boolean[] field135 = new boolean[112];

    @ObfuscatedName("t.cm")
    public static boolean[] field129 = new boolean[112];

    @ObfuscatedName("t.cn")
    public static boolean[] field127 = new boolean[112];

    @ObfuscatedName("t.cp")
    public static int[] field131 = new int[128];

    @ObfuscatedName("t.cr")
    public static int field150 = 0;

    @ObfuscatedName("t.cs")
    public static int field133 = 0;

    @ObfuscatedName("t.cy")
    public static char[] field126 = new char[128];

    @ObfuscatedName("t.cw")
    public static int[] field145 = new int[128];

    @ObfuscatedName("t.cg")
    public static int[] field136 = new int[128];

    @ObfuscatedName("t.cd")
    public static int field137 = 0;

    @ObfuscatedName("t.cz")
    public static int[] field138 = new int[128];

    @ObfuscatedName("t.cu")
    public static int field139 = 0;

    @ObfuscatedName("t.ca")
    public static int field140 = 0;

    @ObfuscatedName("t.cv")
    public static int field134 = 0;

    @ObfuscatedName("t.ck")
    public static int field142 = 0;

    @ObfuscatedName("t.du")
    public static volatile int field143 = 0;

    @ObfuscatedName("t.di")
    public static int[] field144 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("ba.s(Ljava/awt/Component;B)V")
    public static void method1761(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field141);
        arg0.addFocusListener(field141);
    }

    @ObfuscatedName("pe.h(I)V")
    public static void method6766() {
        class24 var0 = field141;
        synchronized (field141) {
            field143++;
            field140 = field142;
            field137 = 0;
            field139 = 0;
            Arrays.fill(field129, false);
            Arrays.fill(field127, false);
            if (field133 < 0) {
                Arrays.fill(field135, false);
                field133 = field150;
            } else {
                while (field150 != field133) {
                    int var1 = field131[field150];
                    field150 = field150 + 1 & 0x7F;
                    if (var1 < 0) {
                        int var2 = ~var1;
                        if (field135[var2]) {
                            field135[var2] = false;
                            field127[var2] = true;
                            field138[field139] = var2;
                            field139++;
                        }
                    } else {
                        if (!field135[var1] && field137 < field136.length - 1) {
                            field129[var1] = true;
                            field136[++field137 - 1] = var1;
                        }
                        field135[var1] = true;
                    }
                }
            }
            if (field137 > 0) {
                field143 = 0;
            }
            field142 = field134;
        }
    }

    @ObfuscatedName("gw.w(I)Z")
    public static final boolean method3180() {
        class24 var0 = field141;
        synchronized (field141) {
            if (field142 == field140) {
                return false;
            } else {
                Statics.field1654 = field145[field140];
                Statics.field2637 = field126[field140];
                field140 = field140 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field141 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field144.length) {
            var3 = field144[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field133 >= 0 && var3 >= 0) {
            field131[field133] = var3;
            field133 = field133 + 1 & 0x7F;
            if (field150 == field133) {
                field133 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field134 + 1 & 0x7F;
            if (field140 != var4) {
                field145[field134] = var3;
                field126[field134] = 0;
                field134 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field141 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field144.length) {
                var3 = field144[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field133 >= 0 && var3 >= 0) {
                field131[field133] = ~var3;
                field133 = field133 + 1 & 0x7F;
                if (field150 == field133) {
                    field133 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field141 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class342.method199(var2)) {
                int var3 = field134 + 1 & 0x7F;
                if (field140 != var3) {
                    field145[field134] = -1;
                    field126[field134] = var2;
                    field134 = var3;
                }
            }
        }
        arg0.consume();
    }

    @ObfuscatedName("kx.v(II)Z")
    public static boolean method5098(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? field129[arg0] : false;
    }

    @ObfuscatedName("gz.c(IB)Z")
    public static boolean method3164(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? field135[arg0] : false;
    }

    @ObfuscatedName("ce.q(II)Z")
    public static boolean method1948(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? field127[arg0] : false;
    }

    @ObfuscatedName("me.i(B)[I")
    public static int[] method5592() {
        int[] var0 = new int[field137];
        for (int var1 = 0; var1 < field137; var1++) {
            var0[var1] = field136[var1];
        }
        return var0;
    }

    @ObfuscatedName("gr.k(B)[I")
    public static int[] method3475() {
        int[] var0 = new int[field139];
        for (int var1 = 0; var1 < field139; var1++) {
            var0[var1] = field138[var1];
        }
        return var0;
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field141 != null) {
            field133 = -1;
        }
    }
}
