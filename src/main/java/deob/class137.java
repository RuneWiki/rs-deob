package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ee")
public final class class137 implements KeyListener, FocusListener {

    @ObfuscatedName("ee.f")
    public static class137 field2118 = new class137();

    @ObfuscatedName("ee.cy")
    public static boolean[] field2114 = new boolean[112];

    @ObfuscatedName("ee.ck")
    public static int[] field2115 = new int[128];

    @ObfuscatedName("ee.cm")
    public static int field2116 = 0;

    @ObfuscatedName("ee.cc")
    public static int field2103 = 0;

    @ObfuscatedName("ee.cq")
    public static char[] field2127 = new char[128];

    @ObfuscatedName("ee.ca")
    public static int[] field2111 = new int[128];

    @ObfuscatedName("ee.ci")
    public static int[] field2120 = new int[128];

    @ObfuscatedName("ee.cn")
    public static int field2108 = 0;

    @ObfuscatedName("ee.cw")
    public static int field2122 = 0;

    @ObfuscatedName("ee.cj")
    public static int field2123 = 0;

    @ObfuscatedName("ee.cf")
    public static int field2124 = 0;

    @ObfuscatedName("ee.cx")
    public static volatile int field2125 = 0;

    @ObfuscatedName("ee.ce")
    public static int[] field2126 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("l.f(I)Z")
    public static final boolean method122() {
        class137 var0 = field2118;
        synchronized (field2118) {
            if (field2124 == field2122) {
                return false;
            } else {
                Statics.field1949 = field2111[field2122];
                Statics.field1167 = field2127[field2122];
                field2122 = field2122 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2118 == null) {
            return;
        }
        field2125 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2126.length) {
            var3 = field2126[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2103 >= 0 && var3 >= 0) {
            field2115[field2103] = var3;
            field2103 = field2103 + 1 & 0x7F;
            if (field2116 == field2103) {
                field2103 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2123 + 1 & 0x7F;
            if (field2122 != var4) {
                field2111[field2123] = var3;
                field2127[field2123] = 0;
                field2123 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2118 != null) {
            field2125 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2126.length) {
                var3 = field2126[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2103 >= 0 && var3 >= 0) {
                field2115[field2103] = ~var3;
                field2103 = field2103 + 1 & 0x7F;
                if (field2116 == field2103) {
                    field2103 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2118 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class165.field2641;
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
                    int var7 = field2123 + 1 & 0x7F;
                    if (field2122 != var7) {
                        field2111[field2123] = -1;
                        field2127[field2123] = var2;
                        field2123 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2118 != null) {
            field2103 = -1;
        }
    }
}
