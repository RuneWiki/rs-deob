package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ej")
public final class class141 implements KeyListener, FocusListener {

    @ObfuscatedName("ej.a")
    public static class141 field2179 = new class141();

    @ObfuscatedName("ej.cz")
    public static boolean[] field2191 = new boolean[112];

    @ObfuscatedName("ej.ct")
    public static int[] field2192 = new int[128];

    @ObfuscatedName("ej.cn")
    public static int field2193 = 0;

    @ObfuscatedName("ej.ca")
    public static int field2194 = 0;

    @ObfuscatedName("ej.cp")
    public static char[] field2195 = new char[128];

    @ObfuscatedName("ej.cc")
    public static int[] field2196 = new int[128];

    @ObfuscatedName("ej.cl")
    public static int[] field2197 = new int[128];

    @ObfuscatedName("ej.cf")
    public static int field2175 = 0;

    @ObfuscatedName("ej.cu")
    public static int field2186 = 0;

    @ObfuscatedName("ej.cg")
    public static int field2203 = 0;

    @ObfuscatedName("ej.ck")
    public static int field2198 = 0;

    @ObfuscatedName("ej.cx")
    public static volatile int field2202 = 0;

    @ObfuscatedName("ej.cv")
    public static int[] field2200 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("ao.a(Ljava/awt/Component;S)V")
    public static void method735(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field2179);
        arg0.addFocusListener(field2179);
    }

    @ObfuscatedName("db.d(I)V")
    public static void method2609() {
        class141 var0 = field2179;
        synchronized (field2179) {
            field2202++;
            field2186 = field2198;
            field2175 = 0;
            if (field2194 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field2191[var1] = false;
                }
                field2194 = field2193;
            } else {
                while (field2194 != field2193) {
                    int var2 = field2192[field2193];
                    field2193 = field2193 + 1 & 0x7F;
                    if (var2 < 0) {
                        field2191[~var2] = false;
                    } else {
                        if (!field2191[var2] && field2175 < field2197.length - 1) {
                            field2197[++field2175 - 1] = var2;
                        }
                        field2191[var2] = true;
                    }
                }
            }
            field2198 = field2203;
        }
    }

    @ObfuscatedName("f.v(B)Z")
    public static final boolean method597() {
        class141 var0 = field2179;
        synchronized (field2179) {
            if (field2198 == field2186) {
                return false;
            } else {
                Statics.field2048 = field2196[field2186];
                Statics.field616 = field2195[field2186];
                field2186 = field2186 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("df.r(I)I")
    public static int method2702() {
        return field2202;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2179 == null) {
            return;
        }
        field2202 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2200.length) {
            var3 = field2200[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2194 >= 0 && var3 >= 0) {
            field2192[field2194] = var3;
            field2194 = field2194 + 1 & 0x7F;
            if (field2194 == field2193) {
                field2194 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2203 + 1 & 0x7F;
            if (field2186 != var4) {
                field2196[field2203] = var3;
                field2195[field2203] = 0;
                field2203 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2179 != null) {
            field2202 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2200.length) {
                var3 = field2200[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2194 >= 0 && var3 >= 0) {
                field2192[field2194] = ~var3;
                field2194 = field2194 + 1 & 0x7F;
                if (field2194 == field2193) {
                    field2194 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2179 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class169.method969(var2)) {
                int var3 = field2203 + 1 & 0x7F;
                if (field2186 != var3) {
                    field2196[field2203] = -1;
                    field2195[field2203] = var2;
                    field2203 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2179 != null) {
            field2194 = -1;
        }
    }
}
