package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("eh")
public final class class137 implements KeyListener, FocusListener {

    @ObfuscatedName("eh.l")
    public static class137 field2115 = new class137();

    @ObfuscatedName("eh.cn")
    public static boolean[] field2117 = new boolean[112];

    @ObfuscatedName("eh.cb")
    public static int[] field2104 = new int[128];

    @ObfuscatedName("eh.cj")
    public static int field2119 = 0;

    @ObfuscatedName("eh.cc")
    public static int field2120 = 0;

    @ObfuscatedName("eh.cg")
    public static char[] field2121 = new char[128];

    @ObfuscatedName("eh.ch")
    public static int[] field2122 = new int[128];

    @ObfuscatedName("eh.ct")
    public static int[] field2123 = new int[128];

    @ObfuscatedName("eh.cf")
    public static int field2118 = 0;

    @ObfuscatedName("eh.cq")
    public static int field2125 = 0;

    @ObfuscatedName("eh.cl")
    public static int field2126 = 0;

    @ObfuscatedName("eh.cz")
    public static int field2127 = 0;

    @ObfuscatedName("eh.cm")
    public static volatile int field2101 = 0;

    @ObfuscatedName("eh.cw")
    public static int[] field2113 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("ba.l(I)V")
    public static void method1602() {
        if (Statics.field2096.toLowerCase().indexOf("microsoft") != -1) {
            field2113[186] = 57;
            field2113[187] = 27;
            field2113[188] = 71;
            field2113[189] = 26;
            field2113[190] = 72;
            field2113[191] = 73;
            field2113[192] = 58;
            field2113[219] = 42;
            field2113[220] = 74;
            field2113[221] = 43;
            field2113[222] = 59;
            field2113[223] = 28;
            return;
        }
        field2113[44] = 71;
        field2113[45] = 26;
        field2113[46] = 72;
        field2113[47] = 73;
        field2113[59] = 57;
        field2113[61] = 27;
        field2113[91] = 42;
        field2113[92] = 74;
        field2113[93] = 43;
        field2113[192] = 28;
        field2113[222] = 58;
        field2113[520] = 59;
    }

    @ObfuscatedName("dv.e(Ljava/awt/Component;B)V")
    public static void method2259(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field2115);
        arg0.addFocusListener(field2115);
    }

    @ObfuscatedName("dm.q(I)V")
    public static void method2656() {
        if (field2115 != null) {
            class137 var0 = field2115;
            synchronized (field2115) {
                field2115 = null;
            }
        }
    }

    @ObfuscatedName("aq.o(B)Z")
    public static final boolean method654() {
        class137 var0 = field2115;
        synchronized (field2115) {
            if (field2127 == field2125) {
                return false;
            } else {
                Statics.field2037 = field2122[field2125];
                Statics.field1742 = field2121[field2125];
                field2125 = field2125 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("cg.g(I)I")
    public static int method2055() {
        return field2101;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2115 == null) {
            return;
        }
        field2101 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2113.length) {
            var3 = field2113[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2120 >= 0 && var3 >= 0) {
            field2104[field2120] = var3;
            field2120 = field2120 + 1 & 0x7F;
            if (field2120 == field2119) {
                field2120 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2126 + 1 & 0x7F;
            if (field2125 != var4) {
                field2122[field2126] = var3;
                field2121[field2126] = 0;
                field2126 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2115 != null) {
            field2101 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2113.length) {
                var3 = field2113[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2120 >= 0 && var3 >= 0) {
                field2104[field2120] = ~var3;
                field2120 = field2120 + 1 & 0x7F;
                if (field2120 == field2119) {
                    field2120 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2115 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class165.method2311(var2)) {
                int var3 = field2126 + 1 & 0x7F;
                if (field2125 != var3) {
                    field2122[field2126] = -1;
                    field2121[field2126] = var2;
                    field2126 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2115 != null) {
            field2120 = -1;
        }
    }
}
