package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ap")
public final class class51 implements KeyListener, FocusListener {

    @ObfuscatedName("ap.n")
    public static class51 field618 = new class51();

    @ObfuscatedName("ap.cx")
    public static boolean[] field609 = new boolean[112];

    @ObfuscatedName("ap.cc")
    public static int[] field605 = new int[128];

    @ObfuscatedName("ap.cr")
    public static int field611 = 0;

    @ObfuscatedName("ap.cz")
    public static int field612 = 0;

    @ObfuscatedName("ap.cy")
    public static char[] field613 = new char[128];

    @ObfuscatedName("ap.ct")
    public static int[] field614 = new int[128];

    @ObfuscatedName("ap.cp")
    public static int[] field615 = new int[128];

    @ObfuscatedName("ap.cn")
    public static int field616 = 0;

    @ObfuscatedName("ap.cm")
    public static int field601 = 0;

    @ObfuscatedName("ap.cv")
    public static int field596 = 0;

    @ObfuscatedName("ap.ce")
    public static int field619 = 0;

    @ObfuscatedName("ap.ci")
    public static volatile int field608 = 0;

    @ObfuscatedName("ap.cg")
    public static int[] field621 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("ex.n(I)V")
    public static void method2428() {
        if (Statics.field2158.toLowerCase().indexOf("microsoft") != -1) {
            field621[186] = 57;
            field621[187] = 27;
            field621[188] = 71;
            field621[189] = 26;
            field621[190] = 72;
            field621[191] = 73;
            field621[192] = 58;
            field621[219] = 42;
            field621[220] = 74;
            field621[221] = 43;
            field621[222] = 59;
            field621[223] = 28;
            return;
        }
        field621[44] = 71;
        field621[45] = 26;
        field621[46] = 72;
        field621[47] = 73;
        field621[59] = 57;
        field621[61] = 27;
        field621[91] = 42;
        field621[92] = 74;
        field621[93] = 43;
        field621[192] = 28;
        field621[222] = 58;
        field621[520] = 59;
    }

    @ObfuscatedName("br.v(Ljava/awt/Component;I)V")
    public static void method1071(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field618);
        arg0.addFocusListener(field618);
    }

    @ObfuscatedName("az.y(S)Z")
    public static final boolean method312() {
        class51 var0 = field618;
        synchronized (field618) {
            if (field619 == field601) {
                return false;
            } else {
                Statics.field1684 = field614[field601];
                Statics.field492 = field613[field601];
                field601 = field601 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("ex.r(I)I")
    public static int method2423() {
        return field608;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field618 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field621.length) {
            var3 = field621[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field612 >= 0 && var3 >= 0) {
            field605[field612] = var3;
            field612 = field612 + 1 & 0x7F;
            if (field612 == field611) {
                field612 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field596 + 1 & 0x7F;
            if (field601 != var4) {
                field614[field596] = var3;
                field613[field596] = 0;
                field596 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field618 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field621.length) {
                var3 = field621[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field612 >= 0 && var3 >= 0) {
                field605[field612] = ~var3;
                field612 = field612 + 1 & 0x7F;
                if (field612 == field611) {
                    field612 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field618 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class278.field3744;
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
                    int var7 = field596 + 1 & 0x7F;
                    if (field601 != var7) {
                        field614[field596] = -1;
                        field613[field596] = var2;
                        field596 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field618 != null) {
            field612 = -1;
        }
    }
}
