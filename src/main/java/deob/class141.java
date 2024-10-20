package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("eo")
public final class class141 implements KeyListener, FocusListener {

    @ObfuscatedName("eo.e")
    public static class141 field2156 = new class141();

    @ObfuscatedName("eo.ct")
    public static boolean[] field2161 = new boolean[112];

    @ObfuscatedName("eo.cq")
    public static int[] field2167 = new int[128];

    @ObfuscatedName("eo.cm")
    public static int field2168 = 0;

    @ObfuscatedName("eo.cz")
    public static int field2157 = 0;

    @ObfuscatedName("eo.ci")
    public static char[] field2170 = new char[128];

    @ObfuscatedName("eo.cw")
    public static int[] field2171 = new int[128];

    @ObfuscatedName("eo.cy")
    public static int[] field2172 = new int[128];

    @ObfuscatedName("eo.cd")
    public static int field2173 = 0;

    @ObfuscatedName("eo.ce")
    public static int field2174 = 0;

    @ObfuscatedName("eo.co")
    public static int field2175 = 0;

    @ObfuscatedName("eo.ch")
    public static int field2176 = 0;

    @ObfuscatedName("eo.cx")
    public static volatile int field2177 = 0;

    @ObfuscatedName("eo.cj")
    public static int[] field2178 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("ag.e(B)V")
    public static void method769() {
        if (Statics.field2144.toLowerCase().indexOf("microsoft") != -1) {
            field2178[186] = 57;
            field2178[187] = 27;
            field2178[188] = 71;
            field2178[189] = 26;
            field2178[190] = 72;
            field2178[191] = 73;
            field2178[192] = 58;
            field2178[219] = 42;
            field2178[220] = 74;
            field2178[221] = 43;
            field2178[222] = 59;
            field2178[223] = 28;
            return;
        }
        field2178[44] = 71;
        field2178[45] = 26;
        field2178[46] = 72;
        field2178[47] = 73;
        field2178[59] = 57;
        field2178[61] = 27;
        field2178[91] = 42;
        field2178[92] = 74;
        field2178[93] = 43;
        field2178[192] = 28;
        field2178[222] = 58;
        field2178[520] = 59;
    }

    @ObfuscatedName("cw.l(Ljava/awt/Component;I)V")
    public static void method2060(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field2156);
        arg0.addFocusListener(field2156);
    }

    @ObfuscatedName("dd.c(I)Z")
    public static final boolean method2666() {
        class141 var0 = field2156;
        synchronized (field2156) {
            if (field2176 == field2174) {
                return false;
            } else {
                Statics.field1163 = field2171[field2174];
                Statics.field1869 = field2170[field2174];
                field2174 = field2174 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2156 == null) {
            return;
        }
        field2177 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2178.length) {
            var3 = field2178[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2157 >= 0 && var3 >= 0) {
            field2167[field2157] = var3;
            field2157 = field2157 + 1 & 0x7F;
            if (field2168 == field2157) {
                field2157 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2175 + 1 & 0x7F;
            if (field2174 != var4) {
                field2171[field2175] = var3;
                field2170[field2175] = 0;
                field2175 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2156 != null) {
            field2177 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2178.length) {
                var3 = field2178[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2157 >= 0 && var3 >= 0) {
                field2167[field2157] = ~var3;
                field2157 = field2157 + 1 & 0x7F;
                if (field2168 == field2157) {
                    field2157 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2156 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class169.field2700;
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
                    int var7 = field2175 + 1 & 0x7F;
                    if (field2174 != var7) {
                        field2171[field2175] = -1;
                        field2170[field2175] = var2;
                        field2175 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2156 != null) {
            field2157 = -1;
        }
    }
}
