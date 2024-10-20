package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ay")
public final class class46 implements KeyListener, FocusListener {

    @ObfuscatedName("ay.a")
    public static class46 field391 = new class46();

    @ObfuscatedName("ay.cl")
    public static boolean[] field387 = new boolean[112];

    @ObfuscatedName("ay.cz")
    public static int[] field379 = new int[128];

    @ObfuscatedName("ay.cq")
    public static int field380 = 0;

    @ObfuscatedName("ay.cj")
    public static int field381 = 0;

    @ObfuscatedName("ay.cm")
    public static char[] field382 = new char[128];

    @ObfuscatedName("ay.cb")
    public static int[] field383 = new int[128];

    @ObfuscatedName("ay.cp")
    public static int[] field384 = new int[128];

    @ObfuscatedName("ay.cs")
    public static int field385 = 0;

    @ObfuscatedName("ay.ck")
    public static int field386 = 0;

    @ObfuscatedName("ay.ct")
    public static int field388 = 0;

    @ObfuscatedName("ay.cc")
    public static int field371 = 0;

    @ObfuscatedName("ay.ch")
    public static volatile int field389 = 0;

    @ObfuscatedName("ay.cg")
    public static int[] field390 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("c.a(I)V")
    public static void method78() {
        if (Statics.field2017.toLowerCase().indexOf("microsoft") != -1) {
            field390[186] = 57;
            field390[187] = 27;
            field390[188] = 71;
            field390[189] = 26;
            field390[190] = 72;
            field390[191] = 73;
            field390[192] = 58;
            field390[219] = 42;
            field390[220] = 74;
            field390[221] = 43;
            field390[222] = 59;
            field390[223] = 28;
            return;
        }
        field390[44] = 71;
        field390[45] = 26;
        field390[46] = 72;
        field390[47] = 73;
        field390[59] = 57;
        field390[61] = 27;
        field390[91] = 42;
        field390[92] = 74;
        field390[93] = 43;
        field390[192] = 28;
        field390[222] = 58;
        field390[520] = 59;
    }

    @ObfuscatedName("an.t(I)V")
    public static void method706() {
        if (field391 != null) {
            class46 var0 = field391;
            synchronized (field391) {
                field391 = null;
            }
        }
    }

    @ObfuscatedName("if.n(I)Z")
    public static final boolean method4057() {
        class46 var0 = field391;
        synchronized (field391) {
            if (field386 == field371) {
                return false;
            } else {
                Statics.field230 = field383[field386];
                Statics.field396 = field382[field386];
                field386 = field386 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("t.q(I)I")
    public static int method18() {
        return field389;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field391 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field390.length) {
            var3 = field390[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field381 >= 0 && var3 >= 0) {
            field379[field381] = var3;
            field381 = field381 + 1 & 0x7F;
            if (field381 == field380) {
                field381 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field388 + 1 & 0x7F;
            if (field386 != var4) {
                field383[field388] = var3;
                field382[field388] = 0;
                field388 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field391 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field390.length) {
                var3 = field390[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field381 >= 0 && var3 >= 0) {
                field379[field381] = ~var3;
                field381 = field381 + 1 & 0x7F;
                if (field381 == field380) {
                    field381 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field391 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class288.field3630;
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
                    int var7 = field388 + 1 & 0x7F;
                    if (field386 != var7) {
                        field383[field388] = -1;
                        field382[field388] = var2;
                        field388 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field391 != null) {
            field381 = -1;
        }
    }
}
