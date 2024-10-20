package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ej")
public final class class137 implements KeyListener, FocusListener {

    @ObfuscatedName("ej.c")
    public static class137 field2087 = new class137();

    @ObfuscatedName("ej.cr")
    public static boolean[] field2075 = new boolean[112];

    @ObfuscatedName("ej.cs")
    public static int[] field2094 = new int[128];

    @ObfuscatedName("ej.cg")
    public static int field2085 = 0;

    @ObfuscatedName("ej.ci")
    public static int field2086 = 0;

    @ObfuscatedName("ej.cu")
    public static char[] field2077 = new char[128];

    @ObfuscatedName("ej.cb")
    public static int[] field2088 = new int[128];

    @ObfuscatedName("ej.cz")
    public static int[] field2069 = new int[128];

    @ObfuscatedName("ej.cc")
    public static int field2090 = 0;

    @ObfuscatedName("ej.cx")
    public static int field2091 = 0;

    @ObfuscatedName("ej.cv")
    public static int field2092 = 0;

    @ObfuscatedName("ej.cw")
    public static int field2093 = 0;

    @ObfuscatedName("ej.ch")
    public static volatile int field2089 = 0;

    @ObfuscatedName("ej.ct")
    public static int[] field2095 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("ep.c(S)V")
    public static void method2899() {
        if (field2087 != null) {
            class137 var0 = field2087;
            synchronized (field2087) {
                field2087 = null;
            }
        }
    }

    @ObfuscatedName("fs.k(I)I")
    public static int method3196() {
        return field2089;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2087 == null) {
            return;
        }
        field2089 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2095.length) {
            var3 = field2095[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2086 >= 0 && var3 >= 0) {
            field2094[field2086] = var3;
            field2086 = field2086 + 1 & 0x7F;
            if (field2086 == field2085) {
                field2086 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2092 + 1 & 0x7F;
            if (field2091 != var4) {
                field2088[field2092] = var3;
                field2077[field2092] = 0;
                field2092 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2087 != null) {
            field2089 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2095.length) {
                var3 = field2095[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2086 >= 0 && var3 >= 0) {
                field2094[field2086] = ~var3;
                field2086 = field2086 + 1 & 0x7F;
                if (field2086 == field2085) {
                    field2086 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2087 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class165.field2646;
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
                    int var7 = field2092 + 1 & 0x7F;
                    if (field2091 != var7) {
                        field2088[field2092] = -1;
                        field2077[field2092] = var2;
                        field2092 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2087 != null) {
            field2086 = -1;
        }
    }
}
