package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ar")
public final class class40 implements KeyListener, FocusListener {

    @ObfuscatedName("ar.z")
    public static class40 field338 = new class40();

    @ObfuscatedName("ar.cw")
    public static boolean[] field342 = new boolean[112];

    @ObfuscatedName("ar.cr")
    public static int[] field344 = new int[128];

    @ObfuscatedName("ar.cv")
    public static int field345 = 0;

    @ObfuscatedName("ar.cg")
    public static int field330 = 0;

    @ObfuscatedName("ar.cs")
    public static char[] field347 = new char[128];

    @ObfuscatedName("ar.ct")
    public static int[] field349 = new int[128];

    @ObfuscatedName("ar.cc")
    public static int[] field339 = new int[128];

    @ObfuscatedName("ar.cx")
    public static int field350 = 0;

    @ObfuscatedName("ar.cj")
    public static int field351 = 0;

    @ObfuscatedName("ar.ci")
    public static int field352 = 0;

    @ObfuscatedName("ar.cn")
    public static int field353 = 0;

    @ObfuscatedName("ar.cp")
    public static volatile int field354 = 0;

    @ObfuscatedName("ar.cz")
    public static int[] field335 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("w.z(I)Z")
    public static final boolean method9() {
        class40 var0 = field338;
        synchronized (field338) {
            if (field353 == field351) {
                return false;
            } else {
                Statics.field2017 = field349[field351];
                Statics.field343 = field347[field351];
                field351 = field351 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field338 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field335.length) {
            var3 = field335[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field330 >= 0 && var3 >= 0) {
            field344[field330] = var3;
            field330 = field330 + 1 & 0x7F;
            if (field345 == field330) {
                field330 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field352 + 1 & 0x7F;
            if (field351 != var4) {
                field349[field352] = var3;
                field347[field352] = 0;
                field352 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field338 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field335.length) {
                var3 = field335[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field330 >= 0 && var3 >= 0) {
                field344[field330] = ~var3;
                field330 = field330 + 1 & 0x7F;
                if (field345 == field330) {
                    field330 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field338 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class302.method5071(var2)) {
                int var3 = field352 + 1 & 0x7F;
                if (field351 != var3) {
                    field349[field352] = -1;
                    field347[field352] = var2;
                    field352 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field338 != null) {
            field330 = -1;
        }
    }
}
