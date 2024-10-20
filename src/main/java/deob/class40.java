package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("af")
public final class class40 implements KeyListener, FocusListener {

    @ObfuscatedName("af.w")
    public static class40 field351 = new class40();

    @ObfuscatedName("af.co")
    public static boolean[] field341 = new boolean[112];

    @ObfuscatedName("af.ck")
    public static int[] field342 = new int[128];

    @ObfuscatedName("af.ca")
    public static int field344 = 0;

    @ObfuscatedName("af.cm")
    public static int field350 = 0;

    @ObfuscatedName("af.cb")
    public static char[] field345 = new char[128];

    @ObfuscatedName("af.cg")
    public static int[] field340 = new int[128];

    @ObfuscatedName("af.cl")
    public static int[] field347 = new int[128];

    @ObfuscatedName("af.cc")
    public static int field348 = 0;

    @ObfuscatedName("af.cy")
    public static int field343 = 0;

    @ObfuscatedName("af.ch")
    public static int field356 = 0;

    @ObfuscatedName("af.cv")
    public static int field349 = 0;

    @ObfuscatedName("af.cz")
    public static volatile int field332 = 0;

    @ObfuscatedName("af.cr")
    public static int[] field353 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("jc.w(I)V")
    public static void method4553() {
        if (Statics.field1973.toLowerCase().indexOf("microsoft") != -1) {
            field353[186] = 57;
            field353[187] = 27;
            field353[188] = 71;
            field353[189] = 26;
            field353[190] = 72;
            field353[191] = 73;
            field353[192] = 58;
            field353[219] = 42;
            field353[220] = 74;
            field353[221] = 43;
            field353[222] = 59;
            field353[223] = 28;
            return;
        }
        field353[44] = 71;
        field353[45] = 26;
        field353[46] = 72;
        field353[47] = 73;
        field353[59] = 57;
        field353[61] = 27;
        field353[91] = 42;
        field353[92] = 74;
        field353[93] = 43;
        field353[192] = 28;
        field353[222] = 58;
        field353[520] = 59;
    }

    @ObfuscatedName("f.m(Ljava/awt/Component;I)V")
    public static void method54(Component arg0) {
        arg0.removeKeyListener(field351);
        arg0.removeFocusListener(field351);
        field350 = -1;
    }

    @ObfuscatedName("cc.q(I)Z")
    public static final boolean method2047() {
        class40 var0 = field351;
        synchronized (field351) {
            if (field349 == field343) {
                return false;
            } else {
                Statics.field1814 = field340[field343];
                Statics.field1847 = field345[field343];
                field343 = field343 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("be.x(I)I")
    public static int method985() {
        return field332;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field351 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field353.length) {
            var3 = field353[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field350 >= 0 && var3 >= 0) {
            field342[field350] = var3;
            field350 = field350 + 1 & 0x7F;
            if (field350 == field344) {
                field350 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field356 + 1 & 0x7F;
            if (field343 != var4) {
                field340[field356] = var3;
                field345[field356] = 0;
                field356 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field351 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field353.length) {
                var3 = field353[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field350 >= 0 && var3 >= 0) {
                field342[field350] = ~var3;
                field350 = field350 + 1 & 0x7F;
                if (field350 == field344) {
                    field350 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field351 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class302.field3727;
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
                    int var7 = field356 + 1 & 0x7F;
                    if (field343 != var7) {
                        field340[field356] = -1;
                        field345[field356] = var2;
                        field356 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field351 != null) {
            field350 = -1;
        }
    }
}
