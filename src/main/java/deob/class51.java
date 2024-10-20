package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("af")
public final class class51 implements KeyListener, FocusListener {

    @ObfuscatedName("af.i")
    public static class51 field657 = new class51();

    @ObfuscatedName("af.ca")
    public static boolean[] field660 = new boolean[112];

    @ObfuscatedName("af.cf")
    public static int[] field666 = new int[128];

    @ObfuscatedName("af.cc")
    public static int field664 = 0;

    @ObfuscatedName("af.cp")
    public static int field668 = 0;

    @ObfuscatedName("af.cj")
    public static char[] field661 = new char[128];

    @ObfuscatedName("af.cr")
    public static int[] field670 = new int[128];

    @ObfuscatedName("af.cz")
    public static int[] field671 = new int[128];

    @ObfuscatedName("af.ci")
    public static int field672 = 0;

    @ObfuscatedName("af.cu")
    public static int field673 = 0;

    @ObfuscatedName("af.ce")
    public static int field674 = 0;

    @ObfuscatedName("af.cx")
    public static int field675 = 0;

    @ObfuscatedName("af.cy")
    public static volatile int field676 = 0;

    @ObfuscatedName("af.co")
    public static int[] field677 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("ay.i(I)V")
    public static void method309() {
        class51 var0 = field657;
        synchronized (field657) {
            field676++;
            field673 = field675;
            field672 = 0;
            if (field668 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field660[var1] = false;
                }
                field668 = field664;
            } else {
                while (field668 != field664) {
                    int var2 = field666[field664];
                    field664 = field664 + 1 & 0x7F;
                    if (var2 < 0) {
                        field660[~var2] = false;
                    } else {
                        if (!field660[var2] && field672 < field671.length - 1) {
                            field671[++field672 - 1] = var2;
                        }
                        field660[var2] = true;
                    }
                }
            }
            if (field672 > 0) {
                field676 = 0;
            }
            field675 = field674;
        }
    }

    @ObfuscatedName("c.w(B)Z")
    public static final boolean method69() {
        class51 var0 = field657;
        synchronized (field657) {
            if (field675 == field673) {
                return false;
            } else {
                Statics.field2347 = field670[field673];
                Statics.field3239 = field661[field673];
                field673 = field673 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("bg.a(B)I")
    public static int method938() {
        return field676;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field657 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field677.length) {
            var3 = field677[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field668 >= 0 && var3 >= 0) {
            field666[field668] = var3;
            field668 = field668 + 1 & 0x7F;
            if (field668 == field664) {
                field668 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field674 + 1 & 0x7F;
            if (field673 != var4) {
                field670[field674] = var3;
                field661[field674] = 0;
                field674 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field657 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field677.length) {
                var3 = field677[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field668 >= 0 && var3 >= 0) {
                field666[field668] = ~var3;
                field668 = field668 + 1 & 0x7F;
                if (field668 == field664) {
                    field668 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field657 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class267.field3669;
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
                    int var7 = field674 + 1 & 0x7F;
                    if (field673 != var7) {
                        field670[field674] = -1;
                        field661[field674] = var2;
                        field674 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field657 != null) {
            field668 = -1;
        }
    }
}
