package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ab")
public final class class51 implements KeyListener, FocusListener {

    @ObfuscatedName("ab.d")
    public static class51 field599 = new class51();

    @ObfuscatedName("ab.cf")
    public static boolean[] field605 = new boolean[112];

    @ObfuscatedName("ab.cy")
    public static int[] field606 = new int[128];

    @ObfuscatedName("ab.cz")
    public static int field607 = 0;

    @ObfuscatedName("ab.cw")
    public static int field608 = 0;

    @ObfuscatedName("ab.cb")
    public static char[] field609 = new char[128];

    @ObfuscatedName("ab.co")
    public static int[] field617 = new int[128];

    @ObfuscatedName("ab.ce")
    public static int[] field618 = new int[128];

    @ObfuscatedName("ab.cx")
    public static int field612 = 0;

    @ObfuscatedName("ab.ca")
    public static int field613 = 0;

    @ObfuscatedName("ab.ck")
    public static int field598 = 0;

    @ObfuscatedName("ab.cr")
    public static int field615 = 0;

    @ObfuscatedName("ab.cd")
    public static volatile int field616 = 0;

    @ObfuscatedName("ab.cq")
    public static int[] field595 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("a.d(I)V")
    public static void method153() {
        if (Statics.field2208.toLowerCase().indexOf("microsoft") != -1) {
            field595[186] = 57;
            field595[187] = 27;
            field595[188] = 71;
            field595[189] = 26;
            field595[190] = 72;
            field595[191] = 73;
            field595[192] = 58;
            field595[219] = 42;
            field595[220] = 74;
            field595[221] = 43;
            field595[222] = 59;
            field595[223] = 28;
            return;
        }
        field595[44] = 71;
        field595[45] = 26;
        field595[46] = 72;
        field595[47] = 73;
        field595[59] = 57;
        field595[61] = 27;
        field595[91] = 42;
        field595[92] = 74;
        field595[93] = 43;
        field595[192] = 28;
        field595[222] = 58;
        field595[520] = 59;
    }

    @ObfuscatedName("cz.q(Ljava/awt/Component;B)V")
    public static void method1566(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field599);
        arg0.addFocusListener(field599);
    }

    @ObfuscatedName("hx.x(Ljava/awt/Component;S)V")
    public static void method3657(Component arg0) {
        arg0.removeKeyListener(field599);
        arg0.removeFocusListener(field599);
        field608 = -1;
    }

    @ObfuscatedName("o.y(B)Z")
    public static final boolean method64() {
        class51 var0 = field599;
        synchronized (field599) {
            if (field615 == field613) {
                return false;
            } else {
                Statics.field2349 = field617[field613];
                Statics.field9 = field609[field613];
                field613 = field613 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field599 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field595.length) {
            var3 = field595[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field608 >= 0 && var3 >= 0) {
            field606[field608] = var3;
            field608 = field608 + 1 & 0x7F;
            if (field608 == field607) {
                field608 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field598 + 1 & 0x7F;
            if (field613 != var4) {
                field617[field598] = var3;
                field609[field598] = 0;
                field598 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field599 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field595.length) {
                var3 = field595[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field608 >= 0 && var3 >= 0) {
                field606[field608] = ~var3;
                field608 = field608 + 1 & 0x7F;
                if (field608 == field607) {
                    field608 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field599 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class267.method1704(var2)) {
                int var3 = field598 + 1 & 0x7F;
                if (field613 != var3) {
                    field617[field598] = -1;
                    field609[field598] = var2;
                    field598 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field599 != null) {
            field608 = -1;
        }
    }
}
