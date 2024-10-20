package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ah")
public final class class40 implements KeyListener, FocusListener {

    @ObfuscatedName("ah.f")
    public static class40 field340 = new class40();

    @ObfuscatedName("ah.cw")
    public static boolean[] field328 = new boolean[112];

    @ObfuscatedName("ah.cu")
    public static int[] field338 = new int[128];

    @ObfuscatedName("ah.cz")
    public static int field339 = 0;

    @ObfuscatedName("ah.ci")
    public static int field351 = 0;

    @ObfuscatedName("ah.cj")
    public static char[] field341 = new char[128];

    @ObfuscatedName("ah.cd")
    public static int[] field342 = new int[128];

    @ObfuscatedName("ah.cr")
    public static int[] field343 = new int[128];

    @ObfuscatedName("ah.cb")
    public static int field344 = 0;

    @ObfuscatedName("ah.ct")
    public static int field345 = 0;

    @ObfuscatedName("ah.ca")
    public static int field346 = 0;

    @ObfuscatedName("ah.cx")
    public static int field347 = 0;

    @ObfuscatedName("ah.ce")
    public static volatile int field348 = 0;

    @ObfuscatedName("ah.cv")
    public static int[] field337 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("ag.f(Ljava/awt/Component;I)V")
    public static void method527(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field340);
        arg0.addFocusListener(field340);
    }

    @ObfuscatedName("dh.h(Ljava/awt/Component;I)V")
    public static void method2588(Component arg0) {
        arg0.removeKeyListener(field340);
        arg0.removeFocusListener(field340);
        field351 = -1;
    }

    @ObfuscatedName("gu.e(I)Z")
    public static final boolean method3304() {
        class40 var0 = field340;
        synchronized (field340) {
            if (field347 == field345) {
                return false;
            } else {
                Statics.field30 = field342[field345];
                Statics.field1062 = field341[field345];
                field345 = field345 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("bu.b(I)I")
    public static int method1014() {
        return field348;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field340 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field337.length) {
            var3 = field337[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field351 >= 0 && var3 >= 0) {
            field338[field351] = var3;
            field351 = field351 + 1 & 0x7F;
            if (field351 == field339) {
                field351 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field346 + 1 & 0x7F;
            if (field345 != var4) {
                field342[field346] = var3;
                field341[field346] = 0;
                field346 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field340 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field337.length) {
                var3 = field337[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field351 >= 0 && var3 >= 0) {
                field338[field351] = ~var3;
                field351 = field351 + 1 & 0x7F;
                if (field351 == field339) {
                    field351 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field340 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class304.field3778;
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
                    int var7 = field346 + 1 & 0x7F;
                    if (field345 != var7) {
                        field342[field346] = -1;
                        field341[field346] = var2;
                        field346 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field340 != null) {
            field351 = -1;
        }
    }
}
