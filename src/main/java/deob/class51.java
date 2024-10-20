package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("at")
public final class class51 implements KeyListener, FocusListener {

    @ObfuscatedName("at.s")
    public static class51 field620 = new class51();

    @ObfuscatedName("at.cj")
    public static boolean[] field618 = new boolean[112];

    @ObfuscatedName("at.cg")
    public static int[] field610 = new int[128];

    @ObfuscatedName("at.cx")
    public static int field611 = 0;

    @ObfuscatedName("at.ck")
    public static int field615 = 0;

    @ObfuscatedName("at.cb")
    public static char[] field613 = new char[128];

    @ObfuscatedName("at.cm")
    public static int[] field604 = new int[128];

    @ObfuscatedName("at.cu")
    public static int[] field616 = new int[128];

    @ObfuscatedName("at.cf")
    public static int field608 = 0;

    @ObfuscatedName("at.cl")
    public static int field623 = 0;

    @ObfuscatedName("at.cr")
    public static int field592 = 0;

    @ObfuscatedName("at.ca")
    public static int field619 = 0;

    @ObfuscatedName("at.cy")
    public static volatile int field601 = 0;

    @ObfuscatedName("at.cs")
    public static int[] field621 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("in.s(B)V")
    public static void method4338() {
        if (Statics.field2534.toLowerCase().indexOf("microsoft") != -1) {
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

    @ObfuscatedName("ei.m(I)Z")
    public static final boolean method2929() {
        class51 var0 = field620;
        synchronized (field620) {
            if (field623 == field619) {
                return false;
            } else {
                Statics.field609 = field604[field623];
                Statics.field3236 = field613[field623];
                field623 = field623 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("w.h(I)I")
    public static int method14() {
        return field601;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field620 == null) {
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
        if (field615 >= 0 && var3 >= 0) {
            field610[field615] = var3;
            field615 = field615 + 1 & 0x7F;
            if (field615 == field611) {
                field615 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field592 + 1 & 0x7F;
            if (field623 != var4) {
                field604[field592] = var3;
                field613[field592] = 0;
                field592 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field620 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field621.length) {
                var3 = field621[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field615 >= 0 && var3 >= 0) {
                field610[field615] = ~var3;
                field615 = field615 + 1 & 0x7F;
                if (field615 == field611) {
                    field615 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field620 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class290.field3786;
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
                    int var7 = field592 + 1 & 0x7F;
                    if (field623 != var7) {
                        field604[field592] = -1;
                        field613[field592] = var2;
                        field592 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field620 != null) {
            field615 = -1;
        }
    }
}
