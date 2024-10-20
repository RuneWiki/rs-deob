package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("an")
public final class class52 implements KeyListener, FocusListener {

    @ObfuscatedName("an.c")
    public static class52 field623 = new class52();

    @ObfuscatedName("an.cm")
    public static boolean[] field608 = new boolean[112];

    @ObfuscatedName("an.cv")
    public static int[] field617 = new int[128];

    @ObfuscatedName("an.ch")
    public static int field610 = 0;

    @ObfuscatedName("an.ci")
    public static int field611 = 0;

    @ObfuscatedName("an.ce")
    public static char[] field595 = new char[128];

    @ObfuscatedName("an.cr")
    public static int[] field613 = new int[128];

    @ObfuscatedName("an.cf")
    public static int[] field614 = new int[128];

    @ObfuscatedName("an.cb")
    public static int field594 = 0;

    @ObfuscatedName("an.cx")
    public static int field616 = 0;

    @ObfuscatedName("an.cw")
    public static int field607 = 0;

    @ObfuscatedName("an.cp")
    public static int field618 = 0;

    @ObfuscatedName("an.co")
    public static volatile int field612 = 0;

    @ObfuscatedName("an.cs")
    public static int[] field620 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("p.c(I)V")
    public static void method29() {
        if (field623 != null) {
            class52 var0 = field623;
            synchronized (field623) {
                field623 = null;
            }
        }
    }

    @ObfuscatedName("gv.i(B)V")
    public static void method3192() {
        class52 var0 = field623;
        synchronized (field623) {
            field612++;
            field616 = field618;
            field594 = 0;
            if (field611 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field608[var1] = false;
                }
                field611 = field610;
            } else {
                while (field611 != field610) {
                    int var2 = field617[field610];
                    field610 = field610 + 1 & 0x7F;
                    if (var2 < 0) {
                        field608[~var2] = false;
                    } else {
                        if (!field608[var2] && field594 < field614.length - 1) {
                            field614[++field594 - 1] = var2;
                        }
                        field608[var2] = true;
                    }
                }
            }
            if (field594 > 0) {
                field612 = 0;
            }
            field618 = field607;
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field623 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field620.length) {
            var3 = field620[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field611 >= 0 && var3 >= 0) {
            field617[field611] = var3;
            field611 = field611 + 1 & 0x7F;
            if (field611 == field610) {
                field611 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field607 + 1 & 0x7F;
            if (field616 != var4) {
                field613[field607] = var3;
                field595[field607] = 0;
                field607 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field623 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field620.length) {
                var3 = field620[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field611 >= 0 && var3 >= 0) {
                field617[field611] = ~var3;
                field611 = field611 + 1 & 0x7F;
                if (field611 == field610) {
                    field611 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field623 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class315.field3913;
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
                    int var7 = field607 + 1 & 0x7F;
                    if (field616 != var7) {
                        field613[field607] = -1;
                        field595[field607] = var2;
                        field607 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field623 != null) {
            field611 = -1;
        }
    }
}
