package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ev")
public final class class137 implements KeyListener, FocusListener {

    @ObfuscatedName("ev.o")
    public static class137 field2117 = new class137();

    @ObfuscatedName("ev.ch")
    public static boolean[] field2124 = new boolean[112];

    @ObfuscatedName("ev.cq")
    public static int[] field2109 = new int[128];

    @ObfuscatedName("ev.ct")
    public static int field2095 = 0;

    @ObfuscatedName("ev.cm")
    public static int field2111 = 0;

    @ObfuscatedName("ev.cb")
    public static char[] field2112 = new char[128];

    @ObfuscatedName("ev.cz")
    public static int[] field2113 = new int[128];

    @ObfuscatedName("ev.ca")
    public static int[] field2114 = new int[128];

    @ObfuscatedName("ev.cl")
    public static int field2115 = 0;

    @ObfuscatedName("ev.cx")
    public static int field2116 = 0;

    @ObfuscatedName("ev.cd")
    public static int field2108 = 0;

    @ObfuscatedName("ev.cw")
    public static int field2110 = 0;

    @ObfuscatedName("ev.cf")
    public static volatile int field2122 = 0;

    @ObfuscatedName("ev.cy")
    public static int[] field2120 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("z.o(I)V")
    public static void method577() {
        if (Statics.field2084.toLowerCase().indexOf("microsoft") != -1) {
            field2120[186] = 57;
            field2120[187] = 27;
            field2120[188] = 71;
            field2120[189] = 26;
            field2120[190] = 72;
            field2120[191] = 73;
            field2120[192] = 58;
            field2120[219] = 42;
            field2120[220] = 74;
            field2120[221] = 43;
            field2120[222] = 59;
            field2120[223] = 28;
            return;
        }
        field2120[44] = 71;
        field2120[45] = 26;
        field2120[46] = 72;
        field2120[47] = 73;
        field2120[59] = 57;
        field2120[61] = 27;
        field2120[91] = 42;
        field2120[92] = 74;
        field2120[93] = 43;
        field2120[192] = 28;
        field2120[222] = 58;
        field2120[520] = 59;
    }

    @ObfuscatedName("dg.e(Ljava/awt/Component;I)V")
    public static void method2257(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field2117);
        arg0.addFocusListener(field2117);
    }

    @ObfuscatedName("eu.u(Ljava/awt/Component;I)V")
    public static void method2691(Component arg0) {
        arg0.removeKeyListener(field2117);
        arg0.removeFocusListener(field2117);
        field2111 = -1;
    }

    @ObfuscatedName("ao.b(I)Z")
    public static final boolean method712() {
        class137 var0 = field2117;
        synchronized (field2117) {
            if (field2116 == field2110) {
                return false;
            } else {
                Statics.field2025 = field2113[field2116];
                Statics.field1922 = field2112[field2116];
                field2116 = field2116 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2117 == null) {
            return;
        }
        field2122 = 0;
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
            field2109[field2111] = var3;
            field2111 = field2111 + 1 & 0x7F;
            if (field2111 == field2095) {
                field2111 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2108 + 1 & 0x7F;
            if (field2116 != var4) {
                field2113[field2108] = var3;
                field2112[field2108] = 0;
                field2108 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2117 != null) {
            field2122 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2120.length) {
                var3 = field2120[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2111 >= 0 && var3 >= 0) {
                field2109[field2111] = ~var3;
                field2111 = field2111 + 1 & 0x7F;
                if (field2111 == field2095) {
                    field2111 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2117 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class165.field2658;
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
                    int var7 = field2108 + 1 & 0x7F;
                    if (field2116 != var7) {
                        field2113[field2108] = -1;
                        field2112[field2108] = var2;
                        field2108 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2117 != null) {
            field2111 = -1;
        }
    }
}
