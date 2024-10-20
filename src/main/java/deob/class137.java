package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ew")
public final class class137 implements KeyListener, FocusListener {

    @ObfuscatedName("ew.m")
    public static class137 field2092 = new class137();

    @ObfuscatedName("ew.cb")
    public static boolean[] field2089 = new boolean[112];

    @ObfuscatedName("ew.ck")
    public static int[] field2087 = new int[128];

    @ObfuscatedName("ew.cu")
    public static int field2088 = 0;

    @ObfuscatedName("ew.cf")
    public static int field2078 = 0;

    @ObfuscatedName("ew.cj")
    public static char[] field2090 = new char[128];

    @ObfuscatedName("ew.cl")
    public static int[] field2091 = new int[128];

    @ObfuscatedName("ew.cq")
    public static int[] field2084 = new int[128];

    @ObfuscatedName("ew.co")
    public static int field2093 = 0;

    @ObfuscatedName("ew.ce")
    public static int field2094 = 0;

    @ObfuscatedName("ew.cw")
    public static int field2095 = 0;

    @ObfuscatedName("ew.cd")
    public static int field2098 = 0;

    @ObfuscatedName("ew.cy")
    public static volatile int field2097 = 0;

    @ObfuscatedName("ew.ca")
    public static int[] field2099 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("h.m(I)V")
    public static void method185() {
        if (Statics.field2069.toLowerCase().indexOf("microsoft") != -1) {
            field2099[186] = 57;
            field2099[187] = 27;
            field2099[188] = 71;
            field2099[189] = 26;
            field2099[190] = 72;
            field2099[191] = 73;
            field2099[192] = 58;
            field2099[219] = 42;
            field2099[220] = 74;
            field2099[221] = 43;
            field2099[222] = 59;
            field2099[223] = 28;
            return;
        }
        field2099[44] = 71;
        field2099[45] = 26;
        field2099[46] = 72;
        field2099[47] = 73;
        field2099[59] = 57;
        field2099[61] = 27;
        field2099[91] = 42;
        field2099[92] = 74;
        field2099[93] = 43;
        field2099[192] = 28;
        field2099[222] = 58;
        field2099[520] = 59;
    }

    @ObfuscatedName("fr.l(Ljava/awt/Component;B)V")
    public static void method3347(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field2092);
        arg0.addFocusListener(field2092);
    }

    @ObfuscatedName("cn.y(I)V")
    public static void method2181() {
        if (field2092 != null) {
            class137 var0 = field2092;
            synchronized (field2092) {
                field2092 = null;
            }
        }
    }

    @ObfuscatedName("p.u(B)Z")
    public static final boolean method135() {
        class137 var0 = field2092;
        synchronized (field2092) {
            if (field2098 == field2094) {
                return false;
            } else {
                Statics.field1573 = field2091[field2094];
                Statics.field2644 = field2090[field2094];
                field2094 = field2094 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2092 == null) {
            return;
        }
        field2097 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2099.length) {
            var3 = field2099[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2078 >= 0 && var3 >= 0) {
            field2087[field2078] = var3;
            field2078 = field2078 + 1 & 0x7F;
            if (field2088 == field2078) {
                field2078 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2095 + 1 & 0x7F;
            if (field2094 != var4) {
                field2091[field2095] = var3;
                field2090[field2095] = 0;
                field2095 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2092 != null) {
            field2097 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2099.length) {
                var3 = field2099[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2078 >= 0 && var3 >= 0) {
                field2087[field2078] = ~var3;
                field2078 = field2078 + 1 & 0x7F;
                if (field2088 == field2078) {
                    field2078 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2092 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class165.method854(var2)) {
                int var3 = field2095 + 1 & 0x7F;
                if (field2094 != var3) {
                    field2091[field2095] = -1;
                    field2090[field2095] = var2;
                    field2095 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2092 != null) {
            field2078 = -1;
        }
    }
}
