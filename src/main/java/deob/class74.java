package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("bx")
public final class class74 implements KeyListener, FocusListener {

    @ObfuscatedName("bx.v")
    public static class74 field1355 = new class74();

    @ObfuscatedName("bx.ce")
    public static boolean[] field1338 = new boolean[112];

    @ObfuscatedName("bx.cp")
    public static int[] field1339 = new int[128];

    @ObfuscatedName("bx.cm")
    public static int field1340 = 0;

    @ObfuscatedName("bx.ci")
    public static int field1341 = 0;

    @ObfuscatedName("bx.cf")
    public static char[] field1328 = new char[128];

    @ObfuscatedName("bx.cx")
    public static int[] field1343 = new int[128];

    @ObfuscatedName("bx.cs")
    public static int[] field1345 = new int[128];

    @ObfuscatedName("bx.cq")
    public static int field1319 = 0;

    @ObfuscatedName("bx.ca")
    public static int field1333 = 0;

    @ObfuscatedName("bx.cd")
    public static int field1342 = 0;

    @ObfuscatedName("bx.cy")
    public static int field1348 = 0;

    @ObfuscatedName("bx.cw")
    public static volatile int field1334 = 0;

    @ObfuscatedName("bx.co")
    public static int[] field1350 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("o.v(I)Z")
    public static final boolean method113() {
        class74 var0 = field1355;
        synchronized (field1355) {
            if (field1348 == field1333) {
                return false;
            } else {
                Statics.field124 = field1343[field1333];
                Statics.field951 = field1328[field1333];
                field1333 = field1333 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1355 == null) {
            return;
        }
        field1334 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1350.length) {
            var3 = field1350[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1341 >= 0 && var3 >= 0) {
            field1339[field1341] = var3;
            field1341 = field1341 + 1 & 0x7F;
            if (field1341 == field1340) {
                field1341 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1342 + 1 & 0x7F;
            if (field1333 != var4) {
                field1343[field1342] = var3;
                field1328[field1342] = 0;
                field1342 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1355 != null) {
            field1334 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1350.length) {
                var3 = field1350[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1341 >= 0 && var3 >= 0) {
                field1339[field1341] = ~var3;
                field1341 = field1341 + 1 & 0x7F;
                if (field1341 == field1340) {
                    field1341 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1355 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class148.field2448;
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
                    int var7 = field1342 + 1 & 0x7F;
                    if (field1333 != var7) {
                        field1343[field1342] = -1;
                        field1328[field1342] = var2;
                        field1342 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1355 != null) {
            field1341 = -1;
        }
    }
}
