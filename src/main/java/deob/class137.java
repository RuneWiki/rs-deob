package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ex")
public final class class137 implements KeyListener, FocusListener {

    @ObfuscatedName("ex.h")
    public static class137 field2118 = new class137();

    @ObfuscatedName("ex.ck")
    public static boolean[] field2125 = new boolean[112];

    @ObfuscatedName("ex.cs")
    public static int[] field2119 = new int[128];

    @ObfuscatedName("ex.cw")
    public static int field2131 = 0;

    @ObfuscatedName("ex.cu")
    public static int field2117 = 0;

    @ObfuscatedName("ex.cv")
    public static char[] field2122 = new char[128];

    @ObfuscatedName("ex.cr")
    public static int[] field2104 = new int[128];

    @ObfuscatedName("ex.cx")
    public static int[] field2124 = new int[128];

    @ObfuscatedName("ex.cy")
    public static int field2102 = 0;

    @ObfuscatedName("ex.cf")
    public static int field2126 = 0;

    @ObfuscatedName("ex.cj")
    public static int field2127 = 0;

    @ObfuscatedName("ex.cc")
    public static int field2128 = 0;

    @ObfuscatedName("ex.cl")
    public static volatile int field2129 = 0;

    @ObfuscatedName("ex.ch")
    public static int[] field2112 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("du.m(Ljava/awt/Component;I)V")
    public static void method2253(Component arg0) {
        arg0.removeKeyListener(field2118);
        arg0.removeFocusListener(field2118);
        field2117 = -1;
    }

    @ObfuscatedName("cs.i(I)V")
    public static void method1936() {
        class137 var0 = field2118;
        synchronized (field2118) {
            field2129++;
            field2126 = field2128;
            field2102 = 0;
            if (field2117 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field2125[var1] = false;
                }
                field2117 = field2131;
            } else {
                while (field2131 != field2117) {
                    int var2 = field2119[field2131];
                    field2131 = field2131 + 1 & 0x7F;
                    if (var2 < 0) {
                        field2125[~var2] = false;
                    } else {
                        if (!field2125[var2] && field2102 < field2124.length - 1) {
                            field2124[++field2102 - 1] = var2;
                        }
                        field2125[var2] = true;
                    }
                }
            }
            field2128 = field2127;
        }
    }

    @ObfuscatedName("y.q(B)Z")
    public static final boolean method93() {
        class137 var0 = field2118;
        synchronized (field2118) {
            if (field2128 == field2126) {
                return false;
            } else {
                Statics.field1629 = field2104[field2126];
                Statics.field2111 = field2122[field2126];
                field2126 = field2126 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2118 == null) {
            return;
        }
        field2129 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2112.length) {
            var3 = field2112[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2117 >= 0 && var3 >= 0) {
            field2119[field2117] = var3;
            field2117 = field2117 + 1 & 0x7F;
            if (field2131 == field2117) {
                field2117 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2127 + 1 & 0x7F;
            if (field2126 != var4) {
                field2104[field2127] = var3;
                field2122[field2127] = 0;
                field2127 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2118 != null) {
            field2129 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2112.length) {
                var3 = field2112[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2117 >= 0 && var3 >= 0) {
                field2119[field2117] = ~var3;
                field2117 = field2117 + 1 & 0x7F;
                if (field2131 == field2117) {
                    field2117 = -1;
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
                            char[] var4 = class165.field2644;
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
                    int var7 = field2127 + 1 & 0x7F;
                    if (field2126 != var7) {
                        field2104[field2127] = -1;
                        field2122[field2127] = var2;
                        field2127 = var7;
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
            field2117 = -1;
        }
    }
}
