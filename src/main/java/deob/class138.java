package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ex")
public final class class138 implements KeyListener, FocusListener {

    @ObfuscatedName("ex.b")
    public static class138 field2082 = new class138();

    @ObfuscatedName("ex.cb")
    public static boolean[] field2096 = new boolean[112];

    @ObfuscatedName("ex.cy")
    public static int[] field2097 = new int[128];

    @ObfuscatedName("ex.cq")
    public static int field2104 = 0;

    @ObfuscatedName("ex.cf")
    public static int field2099 = 0;

    @ObfuscatedName("ex.ce")
    public static char[] field2089 = new char[128];

    @ObfuscatedName("ex.cn")
    public static int[] field2101 = new int[128];

    @ObfuscatedName("ex.ct")
    public static int[] field2102 = new int[128];

    @ObfuscatedName("ex.cz")
    public static int field2103 = 0;

    @ObfuscatedName("ex.cv")
    public static int field2083 = 0;

    @ObfuscatedName("ex.ca")
    public static int field2109 = 0;

    @ObfuscatedName("ex.cd")
    public static int field2106 = 0;

    @ObfuscatedName("ex.cx")
    public static volatile int field2095 = 0;

    @ObfuscatedName("ex.ch")
    public static int[] field2108 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("fn.b(I)V")
    public static void method3033() {
        if (field2082 != null) {
            class138 var0 = field2082;
            synchronized (field2082) {
                field2082 = null;
            }
        }
    }

    @ObfuscatedName("b.g(I)V")
    public static void method3() {
        class138 var0 = field2082;
        synchronized (field2082) {
            field2095++;
            field2083 = field2106;
            field2103 = 0;
            if (field2099 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field2096[var1] = false;
                }
                field2099 = field2104;
            } else {
                while (field2104 != field2099) {
                    int var2 = field2097[field2104];
                    field2104 = field2104 + 1 & 0x7F;
                    if (var2 < 0) {
                        field2096[~var2] = false;
                    } else {
                        if (!field2096[var2] && field2103 < field2102.length - 1) {
                            field2102[++field2103 - 1] = var2;
                        }
                        field2096[var2] = true;
                    }
                }
            }
            field2106 = field2109;
        }
    }

    @ObfuscatedName("cz.j(B)Z")
    public static final boolean method2037() {
        class138 var0 = field2082;
        synchronized (field2082) {
            if (field2106 == field2083) {
                return false;
            } else {
                Statics.field159 = field2101[field2083];
                Statics.field645 = field2089[field2083];
                field2083 = field2083 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2082 == null) {
            return;
        }
        field2095 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2108.length) {
            var3 = field2108[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2099 >= 0 && var3 >= 0) {
            field2097[field2099] = var3;
            field2099 = field2099 + 1 & 0x7F;
            if (field2104 == field2099) {
                field2099 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2109 + 1 & 0x7F;
            if (field2083 != var4) {
                field2101[field2109] = var3;
                field2089[field2109] = 0;
                field2109 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2082 != null) {
            field2095 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2108.length) {
                var3 = field2108[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2099 >= 0 && var3 >= 0) {
                field2097[field2099] = ~var3;
                field2099 = field2099 + 1 & 0x7F;
                if (field2104 == field2099) {
                    field2099 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2082 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class166.field2658;
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
                    int var7 = field2109 + 1 & 0x7F;
                    if (field2083 != var7) {
                        field2101[field2109] = -1;
                        field2089[field2109] = var2;
                        field2109 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2082 != null) {
            field2099 = -1;
        }
    }
}
