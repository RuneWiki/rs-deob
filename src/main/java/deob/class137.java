package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("em")
public final class class137 implements KeyListener, FocusListener {

    @ObfuscatedName("em.i")
    public static class137 field2098 = new class137();

    @ObfuscatedName("em.co")
    public static boolean[] field2097 = new boolean[112];

    @ObfuscatedName("em.cc")
    public static int[] field2111 = new int[128];

    @ObfuscatedName("em.cz")
    public static int field2106 = 0;

    @ObfuscatedName("em.cf")
    public static int field2112 = 0;

    @ObfuscatedName("em.cp")
    public static char[] field2108 = new char[128];

    @ObfuscatedName("em.cx")
    public static int[] field2117 = new int[128];

    @ObfuscatedName("em.cl")
    public static int[] field2110 = new int[128];

    @ObfuscatedName("em.ct")
    public static int field2099 = 0;

    @ObfuscatedName("em.cn")
    public static int field2113 = 0;

    @ObfuscatedName("em.ce")
    public static int field2096 = 0;

    @ObfuscatedName("em.cj")
    public static int field2114 = 0;

    @ObfuscatedName("em.cg")
    public static volatile int field2115 = 0;

    @ObfuscatedName("em.cr")
    public static int[] field2116 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("de.i(Ljava/awt/Component;I)V")
    public static void method2605(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field2098);
        arg0.addFocusListener(field2098);
    }

    @ObfuscatedName("dx.v(Ljava/awt/Component;B)V")
    public static void method2619(Component arg0) {
        arg0.removeKeyListener(field2098);
        arg0.removeFocusListener(field2098);
        field2112 = -1;
    }

    @ObfuscatedName("dv.f(I)V")
    public static void method2182() {
        if (field2098 != null) {
            class137 var0 = field2098;
            synchronized (field2098) {
                field2098 = null;
            }
        }
    }

    @ObfuscatedName("dv.h(I)Z")
    public static final boolean method2177() {
        class137 var0 = field2098;
        synchronized (field2098) {
            if (field2114 == field2113) {
                return false;
            } else {
                Statics.field1612 = field2117[field2113];
                Statics.field2000 = field2108[field2113];
                field2113 = field2113 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2098 == null) {
            return;
        }
        field2115 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2116.length) {
            var3 = field2116[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2112 >= 0 && var3 >= 0) {
            field2111[field2112] = var3;
            field2112 = field2112 + 1 & 0x7F;
            if (field2112 == field2106) {
                field2112 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2096 + 1 & 0x7F;
            if (field2113 != var4) {
                field2117[field2096] = var3;
                field2108[field2096] = 0;
                field2096 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2098 != null) {
            field2115 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2116.length) {
                var3 = field2116[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2112 >= 0 && var3 >= 0) {
                field2111[field2112] = ~var3;
                field2112 = field2112 + 1 & 0x7F;
                if (field2112 == field2106) {
                    field2112 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2098 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class165.field2654;
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
                    int var7 = field2096 + 1 & 0x7F;
                    if (field2113 != var7) {
                        field2117[field2096] = -1;
                        field2108[field2096] = var2;
                        field2096 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2098 != null) {
            field2112 = -1;
        }
    }
}
