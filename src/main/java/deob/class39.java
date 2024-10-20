package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("an")
public final class class39 implements KeyListener, FocusListener {

    @ObfuscatedName("an.f")
    public static class39 field280 = new class39();

    @ObfuscatedName("an.cb")
    public static boolean[] field259 = new boolean[112];

    @ObfuscatedName("an.cg")
    public static boolean[] field265 = new boolean[112];

    @ObfuscatedName("an.ca")
    public static boolean[] field266 = new boolean[112];

    @ObfuscatedName("an.cy")
    public static int[] field284 = new int[128];

    @ObfuscatedName("an.ct")
    public static int field268 = 0;

    @ObfuscatedName("an.ci")
    public static int field269 = 0;

    @ObfuscatedName("an.cs")
    public static char[] field270 = new char[128];

    @ObfuscatedName("an.co")
    public static int[] field271 = new int[128];

    @ObfuscatedName("an.cj")
    public static int[] field258 = new int[128];

    @ObfuscatedName("an.cr")
    public static int field272 = 0;

    @ObfuscatedName("an.cl")
    public static int[] field274 = new int[128];

    @ObfuscatedName("an.cw")
    public static int field275 = 0;

    @ObfuscatedName("an.ck")
    public static int field277 = 0;

    @ObfuscatedName("an.cn")
    public static int field256 = 0;

    @ObfuscatedName("an.ch")
    public static int field278 = 0;

    @ObfuscatedName("an.du")
    public static volatile int field279 = 0;

    @ObfuscatedName("an.db")
    public static int[] field276 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("jb.f(I)V")
    public static void method4603() {
        if (Statics.field1485.toLowerCase().indexOf("microsoft") != -1) {
            field276[186] = 57;
            field276[187] = 27;
            field276[188] = 71;
            field276[189] = 26;
            field276[190] = 72;
            field276[191] = 73;
            field276[192] = 58;
            field276[219] = 42;
            field276[220] = 74;
            field276[221] = 43;
            field276[222] = 59;
            field276[223] = 28;
            return;
        }
        field276[44] = 71;
        field276[45] = 26;
        field276[46] = 72;
        field276[47] = 73;
        field276[59] = 57;
        field276[61] = 27;
        field276[91] = 42;
        field276[92] = 74;
        field276[93] = 43;
        field276[192] = 28;
        field276[222] = 58;
        field276[520] = 59;
    }

    @ObfuscatedName("bz.e(Ljava/awt/Component;B)V")
    public static void method748(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field280);
        arg0.addFocusListener(field280);
    }

    @ObfuscatedName("q.v(Ljava/awt/Component;I)V")
    public static void method171(Component arg0) {
        arg0.removeKeyListener(field280);
        arg0.removeFocusListener(field280);
        field269 = -1;
    }

    @ObfuscatedName("cd.y(I)Z")
    public static final boolean method1900() {
        class39 var0 = field280;
        synchronized (field280) {
            if (field278 == field277) {
                return false;
            } else {
                Statics.field447 = field271[field277];
                Statics.field3781 = field270[field277];
                field277 = field277 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field280 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field276.length) {
            var3 = field276[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field269 >= 0 && var3 >= 0) {
            field284[field269] = var3;
            field269 = field269 + 1 & 0x7F;
            if (field269 == field268) {
                field269 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field256 + 1 & 0x7F;
            if (field277 != var4) {
                field271[field256] = var3;
                field270[field256] = 0;
                field256 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field280 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field276.length) {
                var3 = field276[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field269 >= 0 && var3 >= 0) {
                field284[field269] = ~var3;
                field269 = field269 + 1 & 0x7F;
                if (field269 == field268) {
                    field269 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field280 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class303.method3403(var2)) {
                int var3 = field256 + 1 & 0x7F;
                if (field277 != var3) {
                    field271[field256] = -1;
                    field270[field256] = var2;
                    field256 = var3;
                }
            }
        }
        arg0.consume();
    }

    @ObfuscatedName("q.o(IB)Z")
    public static boolean method168(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? field259[arg0] : false;
    }

    @ObfuscatedName("er.m(II)Z")
    public static boolean method2475(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? field266[arg0] : false;
    }

    @ObfuscatedName("fp.r(I)[I")
    public static int[] method3272() {
        int[] var0 = new int[field272];
        for (int var1 = 0; var1 < field272; var1++) {
            var0[var1] = field258[var1];
        }
        return var0;
    }

    @ObfuscatedName("ca.h(I)[I")
    public static int[] method1893() {
        int[] var0 = new int[field275];
        for (int var1 = 0; var1 < field275; var1++) {
            var0[var1] = field274[var1];
        }
        return var0;
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field280 != null) {
            field269 = -1;
        }
    }
}
