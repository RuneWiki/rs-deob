package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ej")
public final class class137 implements KeyListener, FocusListener {

    @ObfuscatedName("ej.g")
    public static class137 field2106 = new class137();

    @ObfuscatedName("ej.cw")
    public static boolean[] field2108 = new boolean[112];

    @ObfuscatedName("ej.ci")
    public static int[] field2123 = new int[128];

    @ObfuscatedName("ej.ct")
    public static int field2110 = 0;

    @ObfuscatedName("ej.ca")
    public static int field2111 = 0;

    @ObfuscatedName("ej.cv")
    public static char[] field2112 = new char[128];

    @ObfuscatedName("ej.cb")
    public static int[] field2113 = new int[128];

    @ObfuscatedName("ej.cm")
    public static int[] field2117 = new int[128];

    @ObfuscatedName("ej.cu")
    public static int field2115 = 0;

    @ObfuscatedName("ej.cj")
    public static int field2116 = 0;

    @ObfuscatedName("ej.cf")
    public static int field2100 = 0;

    @ObfuscatedName("ej.cq")
    public static int field2114 = 0;

    @ObfuscatedName("ej.cd")
    public static volatile int field2119 = 0;

    @ObfuscatedName("ej.cc")
    public static int[] field2120 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("am.g(I)V")
    public static void method918() {
        if (field2106 != null) {
            class137 var0 = field2106;
            synchronized (field2106) {
                field2106 = null;
            }
        }
    }

    @ObfuscatedName("fd.b(B)Z")
    public static final boolean method3259() {
        class137 var0 = field2106;
        synchronized (field2106) {
            if (field2116 == field2114) {
                return false;
            } else {
                Statics.field19 = field2113[field2116];
                Statics.field1042 = field2112[field2116];
                field2116 = field2116 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("ej.w(B)I")
    public static int method2768() {
        return field2119;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2106 == null) {
            return;
        }
        field2119 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2120.length) {
            var3 = field2120[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2111 >= 0 && var3 >= 0) {
            field2123[field2111] = var3;
            field2111 = field2111 + 1 & 0x7F;
            if (field2111 == field2110) {
                field2111 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2100 + 1 & 0x7F;
            if (field2116 != var4) {
                field2113[field2100] = var3;
                field2112[field2100] = 0;
                field2100 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2106 != null) {
            field2119 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2120.length) {
                var3 = field2120[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2111 >= 0 && var3 >= 0) {
                field2123[field2111] = ~var3;
                field2111 = field2111 + 1 & 0x7F;
                if (field2111 == field2110) {
                    field2111 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2106 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class165.field2649;
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
                    int var7 = field2100 + 1 & 0x7F;
                    if (field2116 != var7) {
                        field2113[field2100] = -1;
                        field2112[field2100] = var2;
                        field2100 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2106 != null) {
            field2111 = -1;
        }
    }
}
