package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("p")
public final class class24 implements KeyListener, FocusListener {

    @ObfuscatedName("p.n")
    public static class24 field120 = new class24();

    @ObfuscatedName("p.ch")
    public static boolean[] field123 = new boolean[112];

    @ObfuscatedName("p.cx")
    public static boolean[] field125 = new boolean[112];

    @ObfuscatedName("p.cv")
    public static boolean[] field126 = new boolean[112];

    @ObfuscatedName("p.ck")
    public static int[] field127 = new int[128];

    @ObfuscatedName("p.cm")
    public static int field144 = 0;

    @ObfuscatedName("p.cy")
    public static int field129 = 0;

    @ObfuscatedName("p.cp")
    public static char[] field130 = new char[128];

    @ObfuscatedName("p.cg")
    public static int[] field131 = new int[128];

    @ObfuscatedName("p.cd")
    public static int[] field132 = new int[128];

    @ObfuscatedName("p.cs")
    public static int field115 = 0;

    @ObfuscatedName("p.ca")
    public static int[] field140 = new int[128];

    @ObfuscatedName("p.cj")
    public static int field133 = 0;

    @ObfuscatedName("p.ct")
    public static int field136 = 0;

    @ObfuscatedName("p.cz")
    public static int field137 = 0;

    @ObfuscatedName("p.ce")
    public static int field138 = 0;

    @ObfuscatedName("p.dd")
    public static volatile int field139 = 0;

    @ObfuscatedName("p.dk")
    public static int[] field135 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("fe.n(I)V")
    public static void method2873() {
        if (field120 != null) {
            class24 var0 = field120;
            synchronized (field120) {
                field120 = null;
            }
        }
    }

    @ObfuscatedName("eg.c(B)Z")
    public static final boolean method2655() {
        class24 var0 = field120;
        synchronized (field120) {
            if (field138 == field136) {
                return false;
            } else {
                Statics.field2995 = field131[field136];
                Statics.field1011 = field130[field136];
                field136 = field136 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field120 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field135.length) {
            var3 = field135[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field129 >= 0 && var3 >= 0) {
            field127[field129] = var3;
            field129 = field129 + 1 & 0x7F;
            if (field144 == field129) {
                field129 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field137 + 1 & 0x7F;
            if (field136 != var4) {
                field131[field137] = var3;
                field130[field137] = 0;
                field137 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field120 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field135.length) {
                var3 = field135[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field129 >= 0 && var3 >= 0) {
                field127[field129] = ~var3;
                field129 = field129 + 1 & 0x7F;
                if (field144 == field129) {
                    field129 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field120 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class317.field3853;
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
                    int var7 = field137 + 1 & 0x7F;
                    if (field136 != var7) {
                        field131[field137] = -1;
                        field130[field137] = var2;
                        field137 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    @ObfuscatedName("fq.m(IB)Z")
    public static boolean method2742(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? field125[arg0] : false;
    }

    @ObfuscatedName("gi.k(II)Z")
    public static boolean method3544(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? field123[arg0] : false;
    }

    @ObfuscatedName("bu.o(II)Z")
    public static boolean method1773(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? field126[arg0] : false;
    }

    @ObfuscatedName("kv.g(I)[I")
    public static int[] method4866() {
        int[] var0 = new int[field115];
        for (int var1 = 0; var1 < field115; var1++) {
            var0[var1] = field132[var1];
        }
        return var0;
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field120 != null) {
            field129 = -1;
        }
    }
}
