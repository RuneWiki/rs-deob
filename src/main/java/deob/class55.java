package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("bs")
public final class class55 implements KeyListener, FocusListener {

    @ObfuscatedName("bs.h")
    public static class55 field408 = new class55();

    @ObfuscatedName("bs.cb")
    public static boolean[] field417 = new boolean[112];

    @ObfuscatedName("bs.ch")
    public static int[] field409 = new int[128];

    @ObfuscatedName("bs.cq")
    public static int field402 = 0;

    @ObfuscatedName("bs.cl")
    public static int field411 = 0;

    @ObfuscatedName("bs.cw")
    public static char[] field410 = new char[128];

    @ObfuscatedName("bs.cp")
    public static int[] field413 = new int[128];

    @ObfuscatedName("bs.cu")
    public static int[] field414 = new int[128];

    @ObfuscatedName("bs.ct")
    public static int field415 = 0;

    @ObfuscatedName("bs.ck")
    public static int field416 = 0;

    @ObfuscatedName("bs.cy")
    public static int field420 = 0;

    @ObfuscatedName("bs.cg")
    public static int field418 = 0;

    @ObfuscatedName("bs.cv")
    public static volatile int field419 = 0;

    @ObfuscatedName("bs.cs")
    public static int[] field399 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("ae.h(B)V")
    public static void method313() {
        if (Statics.field2053.toLowerCase().indexOf("microsoft") != -1) {
            field399[186] = 57;
            field399[187] = 27;
            field399[188] = 71;
            field399[189] = 26;
            field399[190] = 72;
            field399[191] = 73;
            field399[192] = 58;
            field399[219] = 42;
            field399[220] = 74;
            field399[221] = 43;
            field399[222] = 59;
            field399[223] = 28;
            return;
        }
        field399[44] = 71;
        field399[45] = 26;
        field399[46] = 72;
        field399[47] = 73;
        field399[59] = 57;
        field399[61] = 27;
        field399[91] = 42;
        field399[92] = 74;
        field399[93] = 43;
        field399[192] = 28;
        field399[222] = 58;
        field399[520] = 59;
    }

    @ObfuscatedName("cv.v(Ljava/awt/Component;I)V")
    public static void method2110(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field408);
        arg0.addFocusListener(field408);
    }

    @ObfuscatedName("az.x(I)V")
    public static void method701() {
        if (field408 != null) {
            class55 var0 = field408;
            synchronized (field408) {
                field408 = null;
            }
        }
    }

    @ObfuscatedName("ce.w(B)V")
    public static void method1939() {
        class55 var0 = field408;
        synchronized (field408) {
            field419++;
            field416 = field418;
            field415 = 0;
            if (field411 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field417[var1] = false;
                }
                field411 = field402;
            } else {
                while (field411 != field402) {
                    int var2 = field409[field402];
                    field402 = field402 + 1 & 0x7F;
                    if (var2 < 0) {
                        field417[~var2] = false;
                    } else {
                        if (!field417[var2] && field415 < field414.length - 1) {
                            field414[++field415 - 1] = var2;
                        }
                        field417[var2] = true;
                    }
                }
            }
            if (field415 > 0) {
                field419 = 0;
            }
            field418 = field420;
        }
    }

    @ObfuscatedName("q.t(I)Z")
    public static final boolean method180() {
        class55 var0 = field408;
        synchronized (field408) {
            if (field418 == field416) {
                return false;
            } else {
                Statics.field3136 = field413[field416];
                Statics.field201 = field410[field416];
                field416 = field416 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("ir.j(B)I")
    public static int method4058() {
        return field419;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field408 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field399.length) {
            var3 = field399[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field411 >= 0 && var3 >= 0) {
            field409[field411] = var3;
            field411 = field411 + 1 & 0x7F;
            if (field411 == field402) {
                field411 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field420 + 1 & 0x7F;
            if (field416 != var4) {
                field413[field420] = var3;
                field410[field420] = 0;
                field420 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field408 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field399.length) {
                var3 = field399[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field411 >= 0 && var3 >= 0) {
                field409[field411] = ~var3;
                field411 = field411 + 1 & 0x7F;
                if (field411 == field402) {
                    field411 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field408 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class299.method225(var2)) {
                int var3 = field420 + 1 & 0x7F;
                if (field416 != var3) {
                    field413[field420] = -1;
                    field410[field420] = var2;
                    field420 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field408 != null) {
            field411 = -1;
        }
    }
}
