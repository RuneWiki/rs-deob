package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("aa")
public final class class51 implements KeyListener, FocusListener {

    @ObfuscatedName("aa.b")
    public static class51 field601 = new class51();

    @ObfuscatedName("aa.cv")
    public static boolean[] field579 = new boolean[112];

    @ObfuscatedName("aa.cn")
    public static int[] field590 = new int[128];

    @ObfuscatedName("aa.cp")
    public static int field591 = 0;

    @ObfuscatedName("aa.ca")
    public static int field592 = 0;

    @ObfuscatedName("aa.ck")
    public static char[] field593 = new char[128];

    @ObfuscatedName("aa.ct")
    public static int[] field589 = new int[128];

    @ObfuscatedName("aa.cb")
    public static int[] field595 = new int[128];

    @ObfuscatedName("aa.cf")
    public static int field602 = 0;

    @ObfuscatedName("aa.cm")
    public static int field597 = 0;

    @ObfuscatedName("aa.cx")
    public static int field598 = 0;

    @ObfuscatedName("aa.cs")
    public static int field599 = 0;

    @ObfuscatedName("aa.co")
    public static volatile int field600 = 0;

    @ObfuscatedName("aa.ci")
    public static int[] field594 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("et.b(I)V")
    public static void method2673() {
        if (Statics.field2140.toLowerCase().indexOf("microsoft") != -1) {
            field594[186] = 57;
            field594[187] = 27;
            field594[188] = 71;
            field594[189] = 26;
            field594[190] = 72;
            field594[191] = 73;
            field594[192] = 58;
            field594[219] = 42;
            field594[220] = 74;
            field594[221] = 43;
            field594[222] = 59;
            field594[223] = 28;
            return;
        }
        field594[44] = 71;
        field594[45] = 26;
        field594[46] = 72;
        field594[47] = 73;
        field594[59] = 57;
        field594[61] = 27;
        field594[91] = 42;
        field594[92] = 74;
        field594[93] = 43;
        field594[192] = 28;
        field594[222] = 58;
        field594[520] = 59;
    }

    @ObfuscatedName("ax.s(Ljava/awt/Component;I)V")
    public static void method595(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field601);
        arg0.addFocusListener(field601);
    }

    @ObfuscatedName("af.r(I)V")
    public static void method525() {
        class51 var0 = field601;
        synchronized (field601) {
            field600++;
            field597 = field599;
            field602 = 0;
            if (field592 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field579[var1] = false;
                }
                field592 = field591;
            } else {
                while (field592 != field591) {
                    int var2 = field590[field591];
                    field591 = field591 + 1 & 0x7F;
                    if (var2 < 0) {
                        field579[~var2] = false;
                    } else {
                        if (!field579[var2] && field602 < field595.length - 1) {
                            field595[++field602 - 1] = var2;
                        }
                        field579[var2] = true;
                    }
                }
            }
            if (field602 > 0) {
                field600 = 0;
            }
            field599 = field598;
        }
    }

    @ObfuscatedName("im.g(I)Z")
    public static final boolean method4004() {
        class51 var0 = field601;
        synchronized (field601) {
            if (field599 == field597) {
                return false;
            } else {
                Statics.field1427 = field589[field597];
                Statics.field3201 = field593[field597];
                field597 = field597 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field601 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field594.length) {
            var3 = field594[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field592 >= 0 && var3 >= 0) {
            field590[field592] = var3;
            field592 = field592 + 1 & 0x7F;
            if (field592 == field591) {
                field592 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field598 + 1 & 0x7F;
            if (field597 != var4) {
                field589[field598] = var3;
                field593[field598] = 0;
                field598 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field601 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field594.length) {
                var3 = field594[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field592 >= 0 && var3 >= 0) {
                field590[field592] = ~var3;
                field592 = field592 + 1 & 0x7F;
                if (field592 == field591) {
                    field592 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field601 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class274.method4006(var2)) {
                int var3 = field598 + 1 & 0x7F;
                if (field597 != var3) {
                    field589[field598] = -1;
                    field593[field598] = var2;
                    field598 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field601 != null) {
            field592 = -1;
        }
    }
}
