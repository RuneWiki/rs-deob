package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("bw")
public final class class75 implements KeyListener, FocusListener {

    @ObfuscatedName("bw.g")
    public static class75 field1348 = new class75();

    @ObfuscatedName("bw.cv")
    public static boolean[] field1345 = new boolean[112];

    @ObfuscatedName("bw.cr")
    public static int[] field1352 = new int[128];

    @ObfuscatedName("bw.cf")
    public static int field1347 = 0;

    @ObfuscatedName("bw.cq")
    public static int field1346 = 0;

    @ObfuscatedName("bw.cl")
    public static char[] field1349 = new char[128];

    @ObfuscatedName("bw.cm")
    public static int[] field1333 = new int[128];

    @ObfuscatedName("bw.ck")
    public static int[] field1351 = new int[128];

    @ObfuscatedName("bw.ce")
    public static int field1332 = 0;

    @ObfuscatedName("bw.cb")
    public static int field1353 = 0;

    @ObfuscatedName("bw.cg")
    public static int field1337 = 0;

    @ObfuscatedName("bw.cd")
    public static int field1355 = 0;

    @ObfuscatedName("bw.cy")
    public static volatile int field1356 = 0;

    @ObfuscatedName("bw.cz")
    public static int[] field1357 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("bd.g(I)V")
    public static void method1325() {
        if (Statics.field1330.toLowerCase().indexOf("microsoft") != -1) {
            field1357[186] = 57;
            field1357[187] = 27;
            field1357[188] = 71;
            field1357[189] = 26;
            field1357[190] = 72;
            field1357[191] = 73;
            field1357[192] = 58;
            field1357[219] = 42;
            field1357[220] = 74;
            field1357[221] = 43;
            field1357[222] = 59;
            field1357[223] = 28;
            return;
        }
        field1357[44] = 71;
        field1357[45] = 26;
        field1357[46] = 72;
        field1357[47] = 73;
        field1357[59] = 57;
        field1357[61] = 27;
        field1357[91] = 42;
        field1357[92] = 74;
        field1357[93] = 43;
        field1357[192] = 28;
        field1357[222] = 58;
        field1357[520] = 59;
    }

    @ObfuscatedName("bw.h(Ljava/awt/Component;I)V")
    public static void method1550(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1348);
        arg0.addFocusListener(field1348);
    }

    @ObfuscatedName("dm.s(Ljava/awt/Component;I)V")
    public static void method2241(Component arg0) {
        arg0.removeKeyListener(field1348);
        arg0.removeFocusListener(field1348);
        field1346 = -1;
    }

    @ObfuscatedName("cq.o(B)V")
    public static void method1889() {
        if (field1348 != null) {
            class75 var0 = field1348;
            synchronized (field1348) {
                field1348 = null;
            }
        }
    }

    @ObfuscatedName("di.p(B)Z")
    public static final boolean method2260() {
        class75 var0 = field1348;
        synchronized (field1348) {
            if (field1355 == field1353) {
                return false;
            } else {
                Statics.field171 = field1333[field1353];
                Statics.field360 = field1349[field1353];
                field1353 = field1353 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1348 == null) {
            return;
        }
        field1356 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1357.length) {
            var3 = field1357[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1346 >= 0 && var3 >= 0) {
            field1352[field1346] = var3;
            field1346 = field1346 + 1 & 0x7F;
            if (field1347 == field1346) {
                field1346 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1337 + 1 & 0x7F;
            if (field1353 != var4) {
                field1333[field1337] = var3;
                field1349[field1337] = 0;
                field1337 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1348 != null) {
            field1356 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1357.length) {
                var3 = field1357[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1346 >= 0 && var3 >= 0) {
                field1352[field1346] = ~var3;
                field1346 = field1346 + 1 & 0x7F;
                if (field1347 == field1346) {
                    field1346 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1348 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class150.method2482(var2)) {
                int var3 = field1337 + 1 & 0x7F;
                if (field1353 != var3) {
                    field1333[field1337] = -1;
                    field1349[field1337] = var2;
                    field1337 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1348 != null) {
            field1346 = -1;
        }
    }
}
