package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("bz")
public final class class75 implements KeyListener, FocusListener {

    @ObfuscatedName("bz.l")
    public static class75 field1353 = new class75();

    @ObfuscatedName("bz.cv")
    public static boolean[] field1345 = new boolean[112];

    @ObfuscatedName("bz.co")
    public static int[] field1358 = new int[128];

    @ObfuscatedName("bz.cq")
    public static int field1347 = 0;

    @ObfuscatedName("bz.cg")
    public static int field1348 = 0;

    @ObfuscatedName("bz.cz")
    public static char[] field1360 = new char[128];

    @ObfuscatedName("bz.cm")
    public static int[] field1346 = new int[128];

    @ObfuscatedName("bz.ct")
    public static int[] field1356 = new int[128];

    @ObfuscatedName("bz.ca")
    public static int field1352 = 0;

    @ObfuscatedName("bz.ce")
    public static int field1337 = 0;

    @ObfuscatedName("bz.cw")
    public static int field1354 = 0;

    @ObfuscatedName("bz.cr")
    public static int field1355 = 0;

    @ObfuscatedName("bz.cp")
    public static volatile int field1335 = 0;

    @ObfuscatedName("bz.cc")
    public static int[] field1357 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("av.l(Ljava/awt/Component;I)V")
    public static void method710(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1353);
        arg0.addFocusListener(field1353);
    }

    @ObfuscatedName("y.b(I)V")
    public static void method152() {
        if (field1353 != null) {
            class75 var0 = field1353;
            synchronized (field1353) {
                field1353 = null;
            }
        }
    }

    @ObfuscatedName("k.o(I)Z")
    public static final boolean method36() {
        class75 var0 = field1353;
        synchronized (field1353) {
            if (field1355 == field1337) {
                return false;
            } else {
                Statics.field1971 = field1346[field1337];
                Statics.field1796 = field1360[field1337];
                field1337 = field1337 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("cg.w(I)I")
    public static int method1839() {
        return field1335;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1353 == null) {
            return;
        }
        field1335 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1357.length) {
            var3 = field1357[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1348 >= 0 && var3 >= 0) {
            field1358[field1348] = var3;
            field1348 = field1348 + 1 & 0x7F;
            if (field1348 == field1347) {
                field1348 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1354 + 1 & 0x7F;
            if (field1337 != var4) {
                field1346[field1354] = var3;
                field1360[field1354] = 0;
                field1354 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1353 != null) {
            field1335 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1357.length) {
                var3 = field1357[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1348 >= 0 && var3 >= 0) {
                field1358[field1348] = ~var3;
                field1348 = field1348 + 1 & 0x7F;
                if (field1348 == field1347) {
                    field1348 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1353 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class151.field2475;
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
                    int var7 = field1354 + 1 & 0x7F;
                    if (field1337 != var7) {
                        field1346[field1354] = -1;
                        field1360[field1354] = var2;
                        field1354 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1353 != null) {
            field1348 = -1;
        }
    }
}
