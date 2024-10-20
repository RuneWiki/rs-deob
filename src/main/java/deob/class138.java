package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ez")
public final class class138 implements KeyListener, FocusListener {

    @ObfuscatedName("ez.t")
    public static class138 field2138 = new class138();

    @ObfuscatedName("ez.co")
    public static boolean[] field2134 = new boolean[112];

    @ObfuscatedName("ez.cy")
    public static int[] field2144 = new int[128];

    @ObfuscatedName("ez.cr")
    public static int field2149 = 0;

    @ObfuscatedName("ez.cx")
    public static int field2146 = 0;

    @ObfuscatedName("ez.cu")
    public static char[] field2127 = new char[128];

    @ObfuscatedName("ez.cw")
    public static int[] field2148 = new int[128];

    @ObfuscatedName("ez.ck")
    public static int[] field2147 = new int[128];

    @ObfuscatedName("ez.cs")
    public static int field2150 = 0;

    @ObfuscatedName("ez.cl")
    public static int field2151 = 0;

    @ObfuscatedName("ez.cn")
    public static int field2145 = 0;

    @ObfuscatedName("ez.ce")
    public static int field2140 = 0;

    @ObfuscatedName("ez.cq")
    public static volatile int field2154 = 0;

    @ObfuscatedName("ez.ca")
    public static int[] field2155 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("client.t(B)V")
    public static void method408() {
        if (Statics.field2115.toLowerCase().indexOf("microsoft") != -1) {
            field2155[186] = 57;
            field2155[187] = 27;
            field2155[188] = 71;
            field2155[189] = 26;
            field2155[190] = 72;
            field2155[191] = 73;
            field2155[192] = 58;
            field2155[219] = 42;
            field2155[220] = 74;
            field2155[221] = 43;
            field2155[222] = 59;
            field2155[223] = 28;
            return;
        }
        field2155[44] = 71;
        field2155[45] = 26;
        field2155[46] = 72;
        field2155[47] = 73;
        field2155[59] = 57;
        field2155[61] = 27;
        field2155[91] = 42;
        field2155[92] = 74;
        field2155[93] = 43;
        field2155[192] = 28;
        field2155[222] = 58;
        field2155[520] = 59;
    }

    @ObfuscatedName("cb.i(Ljava/awt/Component;I)V")
    public static void method1711(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field2138);
        arg0.addFocusListener(field2138);
    }

    @ObfuscatedName("es.g(I)Z")
    public static final boolean method2644() {
        class138 var0 = field2138;
        synchronized (field2138) {
            if (field2151 == field2140) {
                return false;
            } else {
                Statics.field2143 = field2148[field2151];
                Statics.field626 = field2127[field2151];
                field2151 = field2151 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2138 == null) {
            return;
        }
        field2154 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2155.length) {
            var3 = field2155[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2146 >= 0 && var3 >= 0) {
            field2144[field2146] = var3;
            field2146 = field2146 + 1 & 0x7F;
            if (field2149 == field2146) {
                field2146 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2145 + 1 & 0x7F;
            if (field2151 != var4) {
                field2148[field2145] = var3;
                field2127[field2145] = 0;
                field2145 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2138 != null) {
            field2154 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2155.length) {
                var3 = field2155[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2146 >= 0 && var3 >= 0) {
                field2144[field2146] = ~var3;
                field2146 = field2146 + 1 & 0x7F;
                if (field2149 == field2146) {
                    field2146 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2138 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class166.method657(var2)) {
                int var3 = field2145 + 1 & 0x7F;
                if (field2151 != var3) {
                    field2148[field2145] = -1;
                    field2127[field2145] = var2;
                    field2145 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2138 != null) {
            field2146 = -1;
        }
    }
}
