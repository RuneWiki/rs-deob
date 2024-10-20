package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ae")
public final class class51 implements KeyListener, FocusListener {

    @ObfuscatedName("ae.m")
    public static class51 field610 = new class51();

    @ObfuscatedName("ae.ck")
    public static boolean[] field619 = new boolean[112];

    @ObfuscatedName("ae.ci")
    public static int[] field613 = new int[128];

    @ObfuscatedName("ae.co")
    public static int field618 = 0;

    @ObfuscatedName("ae.cb")
    public static int field612 = 0;

    @ObfuscatedName("ae.cf")
    public static char[] field609 = new char[128];

    @ObfuscatedName("ae.ch")
    public static int[] field617 = new int[128];

    @ObfuscatedName("ae.cg")
    public static int[] field615 = new int[128];

    @ObfuscatedName("ae.cu")
    public static int field606 = 0;

    @ObfuscatedName("ae.cl")
    public static int field620 = 0;

    @ObfuscatedName("ae.cw")
    public static int field616 = 0;

    @ObfuscatedName("ae.cq")
    public static int field622 = 0;

    @ObfuscatedName("ae.cs")
    public static volatile int field623 = 0;

    @ObfuscatedName("ae.cx")
    public static int[] field624 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("fg.m(I)V")
    public static void method2921() {
        if (field610 != null) {
            class51 var0 = field610;
            synchronized (field610) {
                field610 = null;
            }
        }
    }

    @ObfuscatedName("ar.i(I)Z")
    public static final boolean method720() {
        class51 var0 = field610;
        synchronized (field610) {
            if (field622 == field620) {
                return false;
            } else {
                Statics.field1290 = field617[field620];
                Statics.field3793 = field609[field620];
                field620 = field620 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("d.j(I)I")
    public static int method176() {
        return field623;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field610 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field624.length) {
            var3 = field624[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field612 >= 0 && var3 >= 0) {
            field613[field612] = var3;
            field612 = field612 + 1 & 0x7F;
            if (field618 == field612) {
                field612 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field616 + 1 & 0x7F;
            if (field620 != var4) {
                field617[field616] = var3;
                field609[field616] = 0;
                field616 = var4;
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
            if (var2 >= 0 && var2 < field624.length) {
                var3 = field624[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field612 >= 0 && var3 >= 0) {
                field613[field612] = ~var3;
                field612 = field612 + 1 & 0x7F;
                if (field618 == field612) {
                    field612 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field610 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class274.field3720;
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
                    int var7 = field616 + 1 & 0x7F;
                    if (field620 != var7) {
                        field617[field616] = -1;
                        field609[field616] = var2;
                        field616 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field610 != null) {
            field612 = -1;
        }
    }
}
