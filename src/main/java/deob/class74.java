package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("bx")
public final class class74 implements KeyListener, FocusListener {

    @ObfuscatedName("bx.z")
    public static class74 field1362 = new class74();

    @ObfuscatedName("bx.cs")
    public static boolean[] field1361 = new boolean[112];

    @ObfuscatedName("bx.co")
    public static int[] field1350 = new int[128];

    @ObfuscatedName("bx.cf")
    public static int field1363 = 0;

    @ObfuscatedName("bx.cd")
    public static int field1364 = 0;

    @ObfuscatedName("bx.cq")
    public static char[] field1345 = new char[128];

    @ObfuscatedName("bx.ch")
    public static int[] field1366 = new int[128];

    @ObfuscatedName("bx.cx")
    public static int field1367 = 0;

    @ObfuscatedName("bx.ce")
    public static int field1368 = 0;

    @ObfuscatedName("bx.cc")
    public static int field1369 = 0;

    @ObfuscatedName("bx.cv")
    public static volatile int field1370 = 0;

    @ObfuscatedName("bx.cg")
    public static int[] field1351 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("c.z(Ljava/awt/Component;I)V")
    public static void method21(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1362);
        arg0.addFocusListener(field1362);
    }

    @ObfuscatedName("t.h(I)V")
    public static void method118() {
        class74 var0 = field1362;
        synchronized (field1362) {
            field1370++;
            field1367 = field1369;
            if (field1364 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1361[var1] = false;
                }
                field1364 = field1363;
            } else {
                while (field1364 != field1363) {
                    int var2 = field1350[field1363];
                    field1363 = field1363 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1361[~var2] = false;
                    } else {
                        field1361[var2] = true;
                    }
                }
            }
            field1369 = field1368;
        }
    }

    @ObfuscatedName("a.c(I)Z")
    public static final boolean method212() {
        class74 var0 = field1362;
        synchronized (field1362) {
            if (field1369 == field1367) {
                return false;
            } else {
                Statics.field181 = field1366[field1367];
                Statics.field383 = field1345[field1367];
                field1367 = field1367 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1362 == null) {
            return;
        }
        field1370 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1351.length) {
            var3 = field1351[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1364 >= 0 && var3 >= 0) {
            field1350[field1364] = var3;
            field1364 = field1364 + 1 & 0x7F;
            if (field1364 == field1363) {
                field1364 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1368 + 1 & 0x7F;
            if (field1367 != var4) {
                field1366[field1368] = var3;
                field1345[field1368] = 0;
                field1368 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1362 != null) {
            field1370 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1351.length) {
                var3 = field1351[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1364 >= 0 && var3 >= 0) {
                field1350[field1364] = ~var3;
                field1364 = field1364 + 1 & 0x7F;
                if (field1364 == field1363) {
                    field1364 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1362 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class148.method62(var2)) {
                int var3 = field1368 + 1 & 0x7F;
                if (field1367 != var3) {
                    field1366[field1368] = -1;
                    field1345[field1368] = var2;
                    field1368 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1362 != null) {
            field1364 = -1;
        }
    }
}
