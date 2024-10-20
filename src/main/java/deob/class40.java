package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("aw")
public final class class40 implements KeyListener, FocusListener {

    @ObfuscatedName("aw.y")
    public static class40 field383 = new class40();

    @ObfuscatedName("aw.cu")
    public static boolean[] field377 = new boolean[112];

    @ObfuscatedName("aw.cw")
    public static int[] field368 = new int[128];

    @ObfuscatedName("aw.ct")
    public static int field370 = 0;

    @ObfuscatedName("aw.cp")
    public static int field371 = 0;

    @ObfuscatedName("aw.cs")
    public static char[] field372 = new char[128];

    @ObfuscatedName("aw.cf")
    public static int[] field373 = new int[128];

    @ObfuscatedName("aw.cj")
    public static int[] field374 = new int[128];

    @ObfuscatedName("aw.cz")
    public static int field361 = 0;

    @ObfuscatedName("aw.ch")
    public static int field376 = 0;

    @ObfuscatedName("aw.cy")
    public static int field356 = 0;

    @ObfuscatedName("aw.cx")
    public static int field378 = 0;

    @ObfuscatedName("aw.cc")
    public static volatile int field379 = 0;

    @ObfuscatedName("aw.ck")
    public static int[] field380 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("ga.y(B)V")
    public static void method3508() {
        if (Statics.field1995.toLowerCase().indexOf("microsoft") != -1) {
            field380[186] = 57;
            field380[187] = 27;
            field380[188] = 71;
            field380[189] = 26;
            field380[190] = 72;
            field380[191] = 73;
            field380[192] = 58;
            field380[219] = 42;
            field380[220] = 74;
            field380[221] = 43;
            field380[222] = 59;
            field380[223] = 28;
            return;
        }
        field380[44] = 71;
        field380[45] = 26;
        field380[46] = 72;
        field380[47] = 73;
        field380[59] = 57;
        field380[61] = 27;
        field380[91] = 42;
        field380[92] = 74;
        field380[93] = 43;
        field380[192] = 28;
        field380[222] = 58;
        field380[520] = 59;
    }

    @ObfuscatedName("ga.c(I)V")
    public static void method3512() {
        if (field383 != null) {
            class40 var0 = field383;
            synchronized (field383) {
                field383 = null;
            }
        }
    }

    @ObfuscatedName("u.n(I)Z")
    public static final boolean method25() {
        class40 var0 = field383;
        synchronized (field383) {
            if (field378 == field376) {
                return false;
            } else {
                Statics.field180 = field373[field376];
                Statics.field200 = field372[field376];
                field376 = field376 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field383 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field380.length) {
            var3 = field380[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field371 >= 0 && var3 >= 0) {
            field368[field371] = var3;
            field371 = field371 + 1 & 0x7F;
            if (field371 == field370) {
                field371 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field356 + 1 & 0x7F;
            if (field376 != var4) {
                field373[field356] = var3;
                field372[field356] = 0;
                field356 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field383 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field380.length) {
                var3 = field380[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field371 >= 0 && var3 >= 0) {
                field368[field371] = ~var3;
                field371 = field371 + 1 & 0x7F;
                if (field371 == field370) {
                    field371 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field383 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class304.method3181(var2)) {
                int var3 = field356 + 1 & 0x7F;
                if (field376 != var3) {
                    field373[field356] = -1;
                    field372[field356] = var2;
                    field356 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field383 != null) {
            field371 = -1;
        }
    }
}
