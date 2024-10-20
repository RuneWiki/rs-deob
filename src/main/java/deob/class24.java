package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("n")
public final class class24 implements KeyListener, FocusListener {

    @ObfuscatedName("n.l")
    public static class24 field132 = new class24();

    @ObfuscatedName("n.cr")
    public static boolean[] field118 = new boolean[112];

    @ObfuscatedName("n.cq")
    public static boolean[] field129 = new boolean[112];

    @ObfuscatedName("n.cs")
    public static boolean[] field130 = new boolean[112];

    @ObfuscatedName("n.cz")
    public static int[] field131 = new int[128];

    @ObfuscatedName("n.cu")
    public static int field145 = 0;

    @ObfuscatedName("n.cv")
    public static int field124 = 0;

    @ObfuscatedName("n.cn")
    public static char[] field134 = new char[128];

    @ObfuscatedName("n.cf")
    public static int[] field135 = new int[128];

    @ObfuscatedName("n.ch")
    public static int[] field136 = new int[128];

    @ObfuscatedName("n.cc")
    public static int field137 = 0;

    @ObfuscatedName("n.cj")
    public static int[] field138 = new int[128];

    @ObfuscatedName("n.co")
    public static int field141 = 0;

    @ObfuscatedName("n.ck")
    public static int field140 = 0;

    @ObfuscatedName("n.cb")
    public static int field128 = 0;

    @ObfuscatedName("n.cm")
    public static int field127 = 0;

    @ObfuscatedName("n.db")
    public static volatile int field115 = 0;

    @ObfuscatedName("n.dx")
    public static int[] field144 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("g.l(Ljava/awt/Component;I)V")
    public static void method150(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field132);
        arg0.addFocusListener(field132);
    }

    @ObfuscatedName("cp.q(I)V")
    public static void method2065() {
        if (field132 != null) {
            class24 var0 = field132;
            synchronized (field132) {
                field132 = null;
            }
        }
    }

    @ObfuscatedName("fy.f(B)Z")
    public static final boolean method3164() {
        class24 var0 = field132;
        synchronized (field132) {
            if (field140 == field127) {
                return false;
            } else {
                Statics.field14 = field135[field140];
                Statics.field2377 = field134[field140];
                field140 = field140 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("eg.j(I)I")
    public static int method2584() {
        return field115;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field132 == null) {
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
        if (field124 >= 0 && var3 >= 0) {
            field131[field124] = var3;
            field124 = field124 + 1 & 0x7F;
            if (field145 == field124) {
                field124 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field128 + 1 & 0x7F;
            if (field140 != var4) {
                field135[field128] = var3;
                field134[field128] = 0;
                field128 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field132 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field144.length) {
                var3 = field144[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field124 >= 0 && var3 >= 0) {
                field131[field124] = ~var3;
                field124 = field124 + 1 & 0x7F;
                if (field145 == field124) {
                    field124 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field132 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class317.field3864;
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
                    int var7 = field128 + 1 & 0x7F;
                    if (field140 != var7) {
                        field135[field128] = -1;
                        field134[field128] = var2;
                        field128 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    @ObfuscatedName("is.m(II)Z")
    public static boolean method4245(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? field129[arg0] : false;
    }

    @ObfuscatedName("t.k(II)Z")
    public static boolean method40(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? field118[arg0] : false;
    }

    @ObfuscatedName("ch.t(II)Z")
    public static boolean method2243(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? field130[arg0] : false;
    }

    @ObfuscatedName("lr.a(I)[I")
    public static int[] method5403() {
        int[] var0 = new int[field137];
        for (int var1 = 0; var1 < field137; var1++) {
            var0[var1] = field136[var1];
        }
        return var0;
    }

    @ObfuscatedName("hz.e(I)[I")
    public static int[] method3743() {
        int[] var0 = new int[field141];
        for (int var1 = 0; var1 < field141; var1++) {
            var0[var1] = field138[var1];
        }
        return var0;
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field132 != null) {
            field124 = -1;
        }
    }
}
