package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("af")
public final class class39 implements KeyListener, FocusListener {

    @ObfuscatedName("af.f")
    public static class39 field270 = new class39();

    @ObfuscatedName("af.cn")
    public static boolean[] field247 = new boolean[112];

    @ObfuscatedName("af.cq")
    public static int[] field258 = new int[128];

    @ObfuscatedName("af.ck")
    public static int field259 = 0;

    @ObfuscatedName("af.cu")
    public static int field260 = 0;

    @ObfuscatedName("af.cb")
    public static char[] field253 = new char[128];

    @ObfuscatedName("af.cv")
    public static int[] field257 = new int[128];

    @ObfuscatedName("af.cj")
    public static int[] field263 = new int[128];

    @ObfuscatedName("af.cy")
    public static int field264 = 0;

    @ObfuscatedName("af.cs")
    public static int field265 = 0;

    @ObfuscatedName("af.cr")
    public static int field266 = 0;

    @ObfuscatedName("af.cd")
    public static int field272 = 0;

    @ObfuscatedName("af.cl")
    public static volatile int field268 = 0;

    @ObfuscatedName("af.ci")
    public static int[] field269 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("cp.f(I)V")
    public static void method1665() {
        if (Statics.field1466.toLowerCase().indexOf("microsoft") != -1) {
            field269[186] = 57;
            field269[187] = 27;
            field269[188] = 71;
            field269[189] = 26;
            field269[190] = 72;
            field269[191] = 73;
            field269[192] = 58;
            field269[219] = 42;
            field269[220] = 74;
            field269[221] = 43;
            field269[222] = 59;
            field269[223] = 28;
            return;
        }
        field269[44] = 71;
        field269[45] = 26;
        field269[46] = 72;
        field269[47] = 73;
        field269[59] = 57;
        field269[61] = 27;
        field269[91] = 42;
        field269[92] = 74;
        field269[93] = 43;
        field269[192] = 28;
        field269[222] = 58;
        field269[520] = 59;
    }

    @ObfuscatedName("eu.o(I)V")
    public static void method2385() {
        class39 var0 = field270;
        synchronized (field270) {
            field268++;
            field265 = field272;
            field264 = 0;
            if (field260 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field247[var1] = false;
                }
                field260 = field259;
            } else {
                while (field260 != field259) {
                    int var2 = field258[field259];
                    field259 = field259 + 1 & 0x7F;
                    if (var2 < 0) {
                        field247[~var2] = false;
                    } else {
                        if (!field247[var2] && field264 < field263.length - 1) {
                            field263[++field264 - 1] = var2;
                        }
                        field247[var2] = true;
                    }
                }
            }
            if (field264 > 0) {
                field268 = 0;
            }
            field272 = field266;
        }
    }

    @ObfuscatedName("hy.u(I)Z")
    public static final boolean method3835() {
        class39 var0 = field270;
        synchronized (field270) {
            if (field272 == field265) {
                return false;
            } else {
                Statics.field147 = field257[field265];
                Statics.field592 = field253[field265];
                field265 = field265 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("n.p(B)I")
    public static int method81() {
        return field268;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field270 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field269.length) {
            var3 = field269[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field260 >= 0 && var3 >= 0) {
            field258[field260] = var3;
            field260 = field260 + 1 & 0x7F;
            if (field260 == field259) {
                field260 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field266 + 1 & 0x7F;
            if (field265 != var4) {
                field257[field266] = var3;
                field253[field266] = 0;
                field266 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field270 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field269.length) {
                var3 = field269[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field260 >= 0 && var3 >= 0) {
                field258[field260] = ~var3;
                field260 = field260 + 1 & 0x7F;
                if (field260 == field259) {
                    field260 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field270 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class301.field3750;
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
                    int var7 = field266 + 1 & 0x7F;
                    if (field265 != var7) {
                        field257[field266] = -1;
                        field253[field266] = var2;
                        field266 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field270 != null) {
            field260 = -1;
        }
    }
}
