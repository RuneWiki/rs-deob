package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("aj")
public final class class45 implements KeyListener, FocusListener {

    @ObfuscatedName("aj.f")
    public static class45 field382 = new class45();

    @ObfuscatedName("aj.ca")
    public static boolean[] field367 = new boolean[112];

    @ObfuscatedName("aj.ck")
    public static int[] field372 = new int[128];

    @ObfuscatedName("aj.ce")
    public static int field373 = 0;

    @ObfuscatedName("aj.cu")
    public static int field374 = 0;

    @ObfuscatedName("aj.cg")
    public static char[] field386 = new char[128];

    @ObfuscatedName("aj.ct")
    public static int[] field376 = new int[128];

    @ObfuscatedName("aj.cr")
    public static int[] field377 = new int[128];

    @ObfuscatedName("aj.cy")
    public static int field378 = 0;

    @ObfuscatedName("aj.cz")
    public static int field379 = 0;

    @ObfuscatedName("aj.cm")
    public static int field387 = 0;

    @ObfuscatedName("aj.cl")
    public static int field381 = 0;

    @ObfuscatedName("aj.ci")
    public static volatile int field362 = 0;

    @ObfuscatedName("aj.cc")
    public static int[] field383 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("ag.f(I)V")
    public static void method602() {
        if (Statics.field2019.toLowerCase().indexOf("microsoft") != -1) {
            field383[186] = 57;
            field383[187] = 27;
            field383[188] = 71;
            field383[189] = 26;
            field383[190] = 72;
            field383[191] = 73;
            field383[192] = 58;
            field383[219] = 42;
            field383[220] = 74;
            field383[221] = 43;
            field383[222] = 59;
            field383[223] = 28;
            return;
        }
        field383[44] = 71;
        field383[45] = 26;
        field383[46] = 72;
        field383[47] = 73;
        field383[59] = 57;
        field383[61] = 27;
        field383[91] = 42;
        field383[92] = 74;
        field383[93] = 43;
        field383[192] = 28;
        field383[222] = 58;
        field383[520] = 59;
    }

    @ObfuscatedName("a.i(Ljava/awt/Component;I)V")
    public static void method73(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field382);
        arg0.addFocusListener(field382);
    }

    @ObfuscatedName("hr.y(Ljava/awt/Component;I)V")
    public static void method3747(Component arg0) {
        arg0.removeKeyListener(field382);
        arg0.removeFocusListener(field382);
        field374 = -1;
    }

    @ObfuscatedName("fi.w(I)V")
    public static void method3275() {
        if (field382 != null) {
            class45 var0 = field382;
            synchronized (field382) {
                field382 = null;
            }
        }
    }

    @ObfuscatedName("aj.p(I)Z")
    public static final boolean method695() {
        class45 var0 = field382;
        synchronized (field382) {
            if (field381 == field379) {
                return false;
            } else {
                Statics.field1733 = field376[field379];
                Statics.field1522 = field386[field379];
                field379 = field379 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("gl.b(I)I")
    public static int method3478() {
        return field362;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field382 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field383.length) {
            var3 = field383[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field374 >= 0 && var3 >= 0) {
            field372[field374] = var3;
            field374 = field374 + 1 & 0x7F;
            if (field374 == field373) {
                field374 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field387 + 1 & 0x7F;
            if (field379 != var4) {
                field376[field387] = var3;
                field386[field387] = 0;
                field387 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field382 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field383.length) {
                var3 = field383[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field374 >= 0 && var3 >= 0) {
                field372[field374] = ~var3;
                field374 = field374 + 1 & 0x7F;
                if (field374 == field373) {
                    field374 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field382 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class288.field3630;
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
                    int var7 = field387 + 1 & 0x7F;
                    if (field379 != var7) {
                        field376[field387] = -1;
                        field386[field387] = var2;
                        field387 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field382 != null) {
            field374 = -1;
        }
    }
}
