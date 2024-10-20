package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ae")
public final class class51 implements KeyListener, FocusListener {

    @ObfuscatedName("ae.b")
    public static class51 field592 = new class51();

    @ObfuscatedName("ae.cl")
    public static boolean[] field593 = new boolean[112];

    @ObfuscatedName("ae.cy")
    public static int[] field581 = new int[128];

    @ObfuscatedName("ae.cr")
    public static int field582 = 0;

    @ObfuscatedName("ae.co")
    public static int field585 = 0;

    @ObfuscatedName("ae.ct")
    public static char[] field591 = new char[128];

    @ObfuscatedName("ae.cj")
    public static int[] field578 = new int[128];

    @ObfuscatedName("ae.ce")
    public static int[] field586 = new int[128];

    @ObfuscatedName("ae.ca")
    public static int field594 = 0;

    @ObfuscatedName("ae.cs")
    public static int field570 = 0;

    @ObfuscatedName("ae.cp")
    public static int field589 = 0;

    @ObfuscatedName("ae.cf")
    public static int field583 = 0;

    @ObfuscatedName("ae.cz")
    public static volatile int field587 = 0;

    @ObfuscatedName("ae.ck")
    public static int[] field576 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("g.b(Ljava/awt/Component;B)V")
    public static void method28(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field592);
        arg0.addFocusListener(field592);
    }

    @ObfuscatedName("k.q(Ljava/awt/Component;B)V")
    public static void method178(Component arg0) {
        arg0.removeKeyListener(field592);
        arg0.removeFocusListener(field592);
        field585 = -1;
    }

    @ObfuscatedName("fc.o(B)V")
    public static void method2979() {
        if (field592 != null) {
            class51 var0 = field592;
            synchronized (field592) {
                field592 = null;
            }
        }
    }

    @ObfuscatedName("dj.p(I)V")
    public static void method2100() {
        class51 var0 = field592;
        synchronized (field592) {
            field587++;
            field570 = field583;
            field594 = 0;
            if (field585 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field593[var1] = false;
                }
                field585 = field582;
            } else {
                while (field585 != field582) {
                    int var2 = field581[field582];
                    field582 = field582 + 1 & 0x7F;
                    if (var2 < 0) {
                        field593[~var2] = false;
                    } else {
                        if (!field593[var2] && field594 < field586.length - 1) {
                            field586[++field594 - 1] = var2;
                        }
                        field593[var2] = true;
                    }
                }
            }
            if (field594 > 0) {
                field587 = 0;
            }
            field583 = field589;
        }
    }

    @ObfuscatedName("aa.a(S)Z")
    public static final boolean method635() {
        class51 var0 = field592;
        synchronized (field592) {
            if (field583 == field570) {
                return false;
            } else {
                Statics.field1564 = field578[field570];
                Statics.field30 = field591[field570];
                field570 = field570 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("af.h(I)I")
    public static int method266() {
        return field587;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field592 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field576.length) {
            var3 = field576[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field585 >= 0 && var3 >= 0) {
            field581[field585] = var3;
            field585 = field585 + 1 & 0x7F;
            if (field585 == field582) {
                field585 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field589 + 1 & 0x7F;
            if (field570 != var4) {
                field578[field589] = var3;
                field591[field589] = 0;
                field589 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field592 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field576.length) {
                var3 = field576[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field585 >= 0 && var3 >= 0) {
                field581[field585] = ~var3;
                field585 = field585 + 1 & 0x7F;
                if (field585 == field582) {
                    field585 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field592 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class301.field3790;
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
                    int var7 = field589 + 1 & 0x7F;
                    if (field570 != var7) {
                        field578[field589] = -1;
                        field591[field589] = var2;
                        field589 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field592 != null) {
            field585 = -1;
        }
    }
}
