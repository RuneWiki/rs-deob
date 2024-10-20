package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ai")
public final class class46 implements KeyListener, FocusListener {

    @ObfuscatedName("ai.q")
    public static class46 field393 = new class46();

    @ObfuscatedName("ai.cp")
    public static boolean[] field396 = new boolean[112];

    @ObfuscatedName("ai.cw")
    public static int[] field392 = new int[128];

    @ObfuscatedName("ai.ca")
    public static int field389 = 0;

    @ObfuscatedName("ai.cb")
    public static int field399 = 0;

    @ObfuscatedName("ai.cx")
    public static char[] field400 = new char[128];

    @ObfuscatedName("ai.cu")
    public static int[] field401 = new int[128];

    @ObfuscatedName("ai.cs")
    public static int[] field402 = new int[128];

    @ObfuscatedName("ai.cg")
    public static int field387 = 0;

    @ObfuscatedName("ai.cv")
    public static int field397 = 0;

    @ObfuscatedName("ai.ce")
    public static int field405 = 0;

    @ObfuscatedName("ai.cz")
    public static int field386 = 0;

    @ObfuscatedName("ai.cm")
    public static volatile int field407 = 0;

    @ObfuscatedName("ai.ck")
    public static int[] field408 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("cl.q(Ljava/awt/Component;I)V")
    public static void method1811(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field393);
        arg0.addFocusListener(field393);
    }

    @ObfuscatedName("dq.w(S)V")
    public static void method2585() {
        if (field393 != null) {
            class46 var0 = field393;
            synchronized (field393) {
                field393 = null;
            }
        }
    }

    @ObfuscatedName("hb.e(I)Z")
    public static final boolean method3746() {
        class46 var0 = field393;
        synchronized (field393) {
            if (field397 == field386) {
                return false;
            } else {
                Statics.field1339 = field401[field397];
                Statics.field2509 = field400[field397];
                field397 = field397 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field393 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field408.length) {
            var3 = field408[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field399 >= 0 && var3 >= 0) {
            field392[field399] = var3;
            field399 = field399 + 1 & 0x7F;
            if (field399 == field389) {
                field399 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field405 + 1 & 0x7F;
            if (field397 != var4) {
                field401[field405] = var3;
                field400[field405] = 0;
                field405 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field393 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field408.length) {
                var3 = field408[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field399 >= 0 && var3 >= 0) {
                field392[field399] = ~var3;
                field399 = field399 + 1 & 0x7F;
                if (field399 == field389) {
                    field399 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field393 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class289.method3983(var2)) {
                int var3 = field405 + 1 & 0x7F;
                if (field397 != var3) {
                    field401[field405] = -1;
                    field400[field405] = var2;
                    field405 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field393 != null) {
            field399 = -1;
        }
    }
}
