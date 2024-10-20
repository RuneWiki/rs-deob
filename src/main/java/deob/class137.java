package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("eh")
public final class class137 implements KeyListener, FocusListener {

    @ObfuscatedName("eh.a")
    public static class137 field2109 = new class137();

    @ObfuscatedName("eh.cl")
    public static boolean[] field2088 = new boolean[112];

    @ObfuscatedName("eh.cm")
    public static int[] field2108 = new int[128];

    @ObfuscatedName("eh.cq")
    public static int field2114 = 0;

    @ObfuscatedName("eh.cx")
    public static int field2110 = 0;

    @ObfuscatedName("eh.ck")
    public static char[] field2094 = new char[128];

    @ObfuscatedName("eh.cp")
    public static int[] field2104 = new int[128];

    @ObfuscatedName("eh.cb")
    public static int[] field2113 = new int[128];

    @ObfuscatedName("eh.cy")
    public static int field2111 = 0;

    @ObfuscatedName("eh.cf")
    public static int field2102 = 0;

    @ObfuscatedName("eh.co")
    public static int field2112 = 0;

    @ObfuscatedName("eh.cn")
    public static int field2117 = 0;

    @ObfuscatedName("eh.ch")
    public static volatile int field2118 = 0;

    @ObfuscatedName("eh.cd")
    public static int[] field2119 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("c.a(Ljava/awt/Component;I)V")
    public static void method200(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field2109);
        arg0.addFocusListener(field2109);
    }

    @ObfuscatedName("ag.r(Ljava/awt/Component;I)V")
    public static void method843(Component arg0) {
        arg0.removeKeyListener(field2109);
        arg0.removeFocusListener(field2109);
        field2110 = -1;
    }

    @ObfuscatedName("cd.f(I)V")
    public static void method2139() {
        if (field2109 != null) {
            class137 var0 = field2109;
            synchronized (field2109) {
                field2109 = null;
            }
        }
    }

    @ObfuscatedName("ax.s(I)V")
    public static void method646() {
        class137 var0 = field2109;
        synchronized (field2109) {
            field2118++;
            field2102 = field2117;
            field2111 = 0;
            if (field2110 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field2088[var1] = false;
                }
                field2110 = field2114;
            } else {
                while (field2114 != field2110) {
                    int var2 = field2108[field2114];
                    field2114 = field2114 + 1 & 0x7F;
                    if (var2 < 0) {
                        field2088[~var2] = false;
                    } else {
                        if (!field2088[var2] && field2111 < field2113.length - 1) {
                            field2113[++field2111 - 1] = var2;
                        }
                        field2088[var2] = true;
                    }
                }
            }
            field2117 = field2112;
        }
    }

    @ObfuscatedName("as.y(I)Z")
    public static final boolean method700() {
        class137 var0 = field2109;
        synchronized (field2109) {
            if (field2117 == field2102) {
                return false;
            } else {
                Statics.field202 = field2104[field2102];
                Statics.field1949 = field2094[field2102];
                field2102 = field2102 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("cl.e(B)I")
    public static int method1957() {
        return field2118;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2109 == null) {
            return;
        }
        field2118 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2119.length) {
            var3 = field2119[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2110 >= 0 && var3 >= 0) {
            field2108[field2110] = var3;
            field2110 = field2110 + 1 & 0x7F;
            if (field2114 == field2110) {
                field2110 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2112 + 1 & 0x7F;
            if (field2102 != var4) {
                field2104[field2112] = var3;
                field2094[field2112] = 0;
                field2112 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2109 != null) {
            field2118 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2119.length) {
                var3 = field2119[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2110 >= 0 && var3 >= 0) {
                field2108[field2110] = ~var3;
                field2110 = field2110 + 1 & 0x7F;
                if (field2114 == field2110) {
                    field2110 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2109 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class165.field2651;
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
                    int var7 = field2112 + 1 & 0x7F;
                    if (field2102 != var7) {
                        field2104[field2112] = -1;
                        field2094[field2112] = var2;
                        field2112 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2109 != null) {
            field2110 = -1;
        }
    }
}
