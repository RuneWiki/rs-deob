package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("es")
public final class class137 implements KeyListener, FocusListener {

    @ObfuscatedName("es.k")
    public static class137 field2076 = new class137();

    @ObfuscatedName("es.cb")
    public static boolean[] field2079 = new boolean[112];

    @ObfuscatedName("es.cr")
    public static int[] field2090 = new int[128];

    @ObfuscatedName("es.co")
    public static int field2081 = 0;

    @ObfuscatedName("es.cp")
    public static int field2080 = 0;

    @ObfuscatedName("es.ce")
    public static char[] field2082 = new char[128];

    @ObfuscatedName("es.ct")
    public static int[] field2065 = new int[128];

    @ObfuscatedName("es.cl")
    public static int[] field2085 = new int[128];

    @ObfuscatedName("es.ca")
    public static int field2086 = 0;

    @ObfuscatedName("es.ch")
    public static int field2087 = 0;

    @ObfuscatedName("es.cu")
    public static int field2088 = 0;

    @ObfuscatedName("es.ci")
    public static int field2070 = 0;

    @ObfuscatedName("es.cg")
    public static volatile int field2089 = 0;

    @ObfuscatedName("es.cf")
    public static int[] field2091 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("ct.k(I)V")
    public static void method2032() {
        if (Statics.field2053.toLowerCase().indexOf("microsoft") != -1) {
            field2091[186] = 57;
            field2091[187] = 27;
            field2091[188] = 71;
            field2091[189] = 26;
            field2091[190] = 72;
            field2091[191] = 73;
            field2091[192] = 58;
            field2091[219] = 42;
            field2091[220] = 74;
            field2091[221] = 43;
            field2091[222] = 59;
            field2091[223] = 28;
            return;
        }
        field2091[44] = 71;
        field2091[45] = 26;
        field2091[46] = 72;
        field2091[47] = 73;
        field2091[59] = 57;
        field2091[61] = 27;
        field2091[91] = 42;
        field2091[92] = 74;
        field2091[93] = 43;
        field2091[192] = 28;
        field2091[222] = 58;
        field2091[520] = 59;
    }

    @ObfuscatedName("an.h(Ljava/awt/Component;I)V")
    public static void method1029(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field2076);
        arg0.addFocusListener(field2076);
    }

    @ObfuscatedName("ar.o(Ljava/awt/Component;I)V")
    public static void method670(Component arg0) {
        arg0.removeKeyListener(field2076);
        arg0.removeFocusListener(field2076);
        field2080 = -1;
    }

    @ObfuscatedName("ah.z(S)V")
    public static void method830() {
        if (field2076 != null) {
            class137 var0 = field2076;
            synchronized (field2076) {
                field2076 = null;
            }
        }
    }

    @ObfuscatedName("ci.c(I)Z")
    public static final boolean method2049() {
        class137 var0 = field2076;
        synchronized (field2076) {
            if (field2087 == field2070) {
                return false;
            } else {
                Statics.field1937 = field2065[field2087];
                Statics.field133 = field2082[field2087];
                field2087 = field2087 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2076 == null) {
            return;
        }
        field2089 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2091.length) {
            var3 = field2091[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2080 >= 0 && var3 >= 0) {
            field2090[field2080] = var3;
            field2080 = field2080 + 1 & 0x7F;
            if (field2081 == field2080) {
                field2080 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2088 + 1 & 0x7F;
            if (field2087 != var4) {
                field2065[field2088] = var3;
                field2082[field2088] = 0;
                field2088 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2076 != null) {
            field2089 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2091.length) {
                var3 = field2091[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2080 >= 0 && var3 >= 0) {
                field2090[field2080] = ~var3;
                field2080 = field2080 + 1 & 0x7F;
                if (field2081 == field2080) {
                    field2080 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2076 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class165.method1516(var2)) {
                int var3 = field2088 + 1 & 0x7F;
                if (field2087 != var3) {
                    field2065[field2088] = -1;
                    field2082[field2088] = var2;
                    field2088 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2076 != null) {
            field2080 = -1;
        }
    }
}
