package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("z")
public final class class24 implements KeyListener, FocusListener {

    @ObfuscatedName("z.o")
    public static class24 field126 = new class24();

    @ObfuscatedName("z.cn")
    public static boolean[] field131 = new boolean[112];

    @ObfuscatedName("z.cc")
    public static boolean[] field121 = new boolean[112];

    @ObfuscatedName("z.cy")
    public static boolean[] field133 = new boolean[112];

    @ObfuscatedName("z.cw")
    public static int[] field134 = new int[128];

    @ObfuscatedName("z.cf")
    public static int field151 = 0;

    @ObfuscatedName("z.cq")
    public static int field136 = 0;

    @ObfuscatedName("z.cg")
    public static char[] field137 = new char[128];

    @ObfuscatedName("z.cl")
    public static int[] field123 = new int[128];

    @ObfuscatedName("z.cu")
    public static int[] field139 = new int[128];

    @ObfuscatedName("z.ch")
    public static int field140 = 0;

    @ObfuscatedName("z.cz")
    public static int[] field141 = new int[128];

    @ObfuscatedName("z.ce")
    public static int field135 = 0;

    @ObfuscatedName("z.cj")
    public static int field143 = 0;

    @ObfuscatedName("z.cb")
    public static int field144 = 0;

    @ObfuscatedName("z.cp")
    public static int field145 = 0;

    @ObfuscatedName("z.dc")
    public static volatile int field146 = 0;

    @ObfuscatedName("z.dp")
    public static int[] field147 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("fv.o(I)V")
    public static void method2946() {
        if (field126 != null) {
            class24 var0 = field126;
            synchronized (field126) {
                field126 = null;
            }
        }
    }

    @ObfuscatedName("fs.q(I)Z")
    public static final boolean method2886() {
        class24 var0 = field126;
        synchronized (field126) {
            if (field145 == field143) {
                return false;
            } else {
                Statics.field62 = field123[field143];
                Statics.field1851 = field137[field143];
                field143 = field143 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("bj.l(B)I")
    public static int method1639() {
        return field146;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field126 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field147.length) {
            var3 = field147[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field136 >= 0 && var3 >= 0) {
            field134[field136] = var3;
            field136 = field136 + 1 & 0x7F;
            if (field151 == field136) {
                field136 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field144 + 1 & 0x7F;
            if (field143 != var4) {
                field123[field144] = var3;
                field137[field144] = 0;
                field144 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field126 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field147.length) {
                var3 = field147[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field136 >= 0 && var3 >= 0) {
                field134[field136] = ~var3;
                field136 = field136 + 1 & 0x7F;
                if (field151 == field136) {
                    field136 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field126 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class342.field4158;
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
                    int var7 = field144 + 1 & 0x7F;
                    if (field143 != var7) {
                        field123[field144] = -1;
                        field137[field144] = var2;
                        field144 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    @ObfuscatedName("iq.k(II)Z")
    public static boolean method4472(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? field121[arg0] : false;
    }

    @ObfuscatedName("dc.a(IB)Z")
    public static boolean method2442(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? field131[arg0] : false;
    }

    @ObfuscatedName("h.m(II)Z")
    public static boolean method250(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? field133[arg0] : false;
    }

    @ObfuscatedName("ck.p(I)[I")
    public static int[] method1966() {
        int[] var0 = new int[field140];
        for (int var1 = 0; var1 < field140; var1++) {
            var0[var1] = field139[var1];
        }
        return var0;
    }

    @ObfuscatedName("jg.s(I)[I")
    public static int[] method4598() {
        int[] var0 = new int[field135];
        for (int var1 = 0; var1 < field135; var1++) {
            var0[var1] = field141[var1];
        }
        return var0;
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field126 != null) {
            field136 = -1;
        }
    }
}
