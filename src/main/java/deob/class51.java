package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("az")
public final class class51 implements KeyListener, FocusListener {

    @ObfuscatedName("az.d")
    public static class51 field610 = new class51();

    @ObfuscatedName("az.cn")
    public static boolean[] field607 = new boolean[112];

    @ObfuscatedName("az.cc")
    public static int[] field620 = new int[128];

    @ObfuscatedName("az.ck")
    public static int field609 = 0;

    @ObfuscatedName("az.cq")
    public static int field615 = 0;

    @ObfuscatedName("az.cp")
    public static char[] field611 = new char[128];

    @ObfuscatedName("az.ci")
    public static int[] field612 = new int[128];

    @ObfuscatedName("az.cz")
    public static int[] field613 = new int[128];

    @ObfuscatedName("az.cr")
    public static int field614 = 0;

    @ObfuscatedName("az.cl")
    public static int field601 = 0;

    @ObfuscatedName("az.ce")
    public static int field619 = 0;

    @ObfuscatedName("az.cx")
    public static int field617 = 0;

    @ObfuscatedName("az.ch")
    public static volatile int field618 = 0;

    @ObfuscatedName("az.ct")
    public static int[] field596 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("p.x(Ljava/awt/Component;I)V")
    public static void method42(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field610);
        arg0.addFocusListener(field610);
    }

    @ObfuscatedName("hc.k(Ljava/awt/Component;B)V")
    public static void method3559(Component arg0) {
        arg0.removeKeyListener(field610);
        arg0.removeFocusListener(field610);
        field615 = -1;
    }

    @ObfuscatedName("bh.z(I)V")
    public static void method1046() {
        if (field610 != null) {
            class51 var0 = field610;
            synchronized (field610) {
                field610 = null;
            }
        }
    }

    @ObfuscatedName("dy.v(B)V")
    public static void method2292() {
        class51 var0 = field610;
        synchronized (field610) {
            field618++;
            field601 = field617;
            field614 = 0;
            if (field615 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field607[var1] = false;
                }
                field615 = field609;
            } else {
                while (field615 != field609) {
                    int var2 = field620[field609];
                    field609 = field609 + 1 & 0x7F;
                    if (var2 < 0) {
                        field607[~var2] = false;
                    } else {
                        if (!field607[var2] && field614 < field613.length - 1) {
                            field613[++field614 - 1] = var2;
                        }
                        field607[var2] = true;
                    }
                }
            }
            if (field614 > 0) {
                field618 = 0;
            }
            field617 = field619;
        }
    }

    @ObfuscatedName("bx.m(I)Z")
    public static final boolean method1030() {
        class51 var0 = field610;
        synchronized (field610) {
            if (field617 == field601) {
                return false;
            } else {
                Statics.field474 = field612[field601];
                Statics.field321 = field611[field601];
                field601 = field601 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field610 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field596.length) {
            var3 = field596[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field615 >= 0 && var3 >= 0) {
            field620[field615] = var3;
            field615 = field615 + 1 & 0x7F;
            if (field615 == field609) {
                field615 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field619 + 1 & 0x7F;
            if (field601 != var4) {
                field612[field619] = var3;
                field611[field619] = 0;
                field619 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field610 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field596.length) {
                var3 = field596[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field615 >= 0 && var3 >= 0) {
                field620[field615] = ~var3;
                field615 = field615 + 1 & 0x7F;
                if (field615 == field609) {
                    field615 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field610 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class274.method2813(var2)) {
                int var3 = field619 + 1 & 0x7F;
                if (field601 != var3) {
                    field612[field619] = -1;
                    field611[field619] = var2;
                    field619 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field610 != null) {
            field615 = -1;
        }
    }
}
