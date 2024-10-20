package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("em")
public final class class137 implements KeyListener, FocusListener {

    @ObfuscatedName("em.z")
    public static class137 field2110 = new class137();

    @ObfuscatedName("em.cm")
    public static boolean[] field2114 = new boolean[112];

    @ObfuscatedName("em.co")
    public static int[] field2133 = new int[128];

    @ObfuscatedName("em.ce")
    public static int field2119 = 0;

    @ObfuscatedName("em.cy")
    public static int field2105 = 0;

    @ObfuscatedName("em.ca")
    public static char[] field2123 = new char[128];

    @ObfuscatedName("em.cp")
    public static int[] field2116 = new int[128];

    @ObfuscatedName("em.ct")
    public static int[] field2118 = new int[128];

    @ObfuscatedName("em.ck")
    public static int field2124 = 0;

    @ObfuscatedName("em.cf")
    public static int field2125 = 0;

    @ObfuscatedName("em.cx")
    public static int field2126 = 0;

    @ObfuscatedName("em.cv")
    public static int field2117 = 0;

    @ObfuscatedName("em.cn")
    public static volatile int field2128 = 0;

    @ObfuscatedName("em.cz")
    public static int[] field2129 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("h.z(I)V")
    public static void method117() {
        if (Statics.field2087.toLowerCase().indexOf("microsoft") != -1) {
            field2129[186] = 57;
            field2129[187] = 27;
            field2129[188] = 71;
            field2129[189] = 26;
            field2129[190] = 72;
            field2129[191] = 73;
            field2129[192] = 58;
            field2129[219] = 42;
            field2129[220] = 74;
            field2129[221] = 43;
            field2129[222] = 59;
            field2129[223] = 28;
            return;
        }
        field2129[44] = 71;
        field2129[45] = 26;
        field2129[46] = 72;
        field2129[47] = 73;
        field2129[59] = 57;
        field2129[61] = 27;
        field2129[91] = 42;
        field2129[92] = 74;
        field2129[93] = 43;
        field2129[192] = 28;
        field2129[222] = 58;
        field2129[520] = 59;
    }

    @ObfuscatedName("dp.q(Ljava/awt/Component;I)V")
    public static void method2585(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field2110);
        arg0.addFocusListener(field2110);
    }

    @ObfuscatedName("aq.k(I)V")
    public static void method637() {
        class137 var0 = field2110;
        synchronized (field2110) {
            field2128++;
            field2125 = field2117;
            field2124 = 0;
            if (field2105 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field2114[var1] = false;
                }
                field2105 = field2119;
            } else {
                while (field2119 != field2105) {
                    int var2 = field2133[field2119];
                    field2119 = field2119 + 1 & 0x7F;
                    if (var2 < 0) {
                        field2114[~var2] = false;
                    } else {
                        if (!field2114[var2] && field2124 < field2118.length - 1) {
                            field2118[++field2124 - 1] = var2;
                        }
                        field2114[var2] = true;
                    }
                }
            }
            field2117 = field2126;
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2110 == null) {
            return;
        }
        field2128 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2129.length) {
            var3 = field2129[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2105 >= 0 && var3 >= 0) {
            field2133[field2105] = var3;
            field2105 = field2105 + 1 & 0x7F;
            if (field2119 == field2105) {
                field2105 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2126 + 1 & 0x7F;
            if (field2125 != var4) {
                field2116[field2126] = var3;
                field2123[field2126] = 0;
                field2126 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2110 != null) {
            field2128 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2129.length) {
                var3 = field2129[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2105 >= 0 && var3 >= 0) {
                field2133[field2105] = ~var3;
                field2105 = field2105 + 1 & 0x7F;
                if (field2119 == field2105) {
                    field2105 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2110 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class165.field2647;
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
                    int var7 = field2126 + 1 & 0x7F;
                    if (field2125 != var7) {
                        field2116[field2126] = -1;
                        field2123[field2126] = var2;
                        field2126 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2110 != null) {
            field2105 = -1;
        }
    }
}
