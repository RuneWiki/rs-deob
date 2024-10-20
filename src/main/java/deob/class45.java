package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ay")
public final class class45 implements KeyListener, FocusListener {

    @ObfuscatedName("ay.n")
    public static class45 field368 = new class45();

    @ObfuscatedName("ay.ca")
    public static boolean[] field382 = new boolean[112];

    @ObfuscatedName("ay.cz")
    public static int[] field383 = new int[128];

    @ObfuscatedName("ay.cd")
    public static int field375 = 0;

    @ObfuscatedName("ay.cn")
    public static int field385 = 0;

    @ObfuscatedName("ay.ci")
    public static char[] field393 = new char[128];

    @ObfuscatedName("ay.cl")
    public static int[] field387 = new int[128];

    @ObfuscatedName("ay.cs")
    public static int[] field388 = new int[128];

    @ObfuscatedName("ay.cp")
    public static int field389 = 0;

    @ObfuscatedName("ay.cb")
    public static int field390 = 0;

    @ObfuscatedName("ay.cv")
    public static int field384 = 0;

    @ObfuscatedName("ay.cj")
    public static int field392 = 0;

    @ObfuscatedName("ay.ct")
    public static volatile int field373 = 0;

    @ObfuscatedName("ay.cq")
    public static int[] field394 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("jh.n(Ljava/awt/Component;I)V")
    public static void method4820(Component arg0) {
        arg0.removeKeyListener(field368);
        arg0.removeFocusListener(field368);
        field385 = -1;
    }

    @ObfuscatedName("client.h(I)V")
    public static void method1571() {
        class45 var0 = field368;
        synchronized (field368) {
            field373++;
            field390 = field392;
            field389 = 0;
            if (field385 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field382[var1] = false;
                }
                field385 = field375;
            } else {
                while (field385 != field375) {
                    int var2 = field383[field375];
                    field375 = field375 + 1 & 0x7F;
                    if (var2 < 0) {
                        field382[~var2] = false;
                    } else {
                        if (!field382[var2] && field389 < field388.length - 1) {
                            field388[++field389 - 1] = var2;
                        }
                        field382[var2] = true;
                    }
                }
            }
            if (field389 > 0) {
                field373 = 0;
            }
            field392 = field384;
        }
    }

    @ObfuscatedName("ao.l(I)Z")
    public static final boolean method565() {
        class45 var0 = field368;
        synchronized (field368) {
            if (field392 == field390) {
                return false;
            } else {
                Statics.field3625 = field387[field390];
                Statics.field2218 = field393[field390];
                field390 = field390 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("bg.g(I)I")
    public static int method1819() {
        return field373;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field368 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field394.length) {
            var3 = field394[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field385 >= 0 && var3 >= 0) {
            field383[field385] = var3;
            field385 = field385 + 1 & 0x7F;
            if (field385 == field375) {
                field385 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field384 + 1 & 0x7F;
            if (field390 != var4) {
                field387[field384] = var3;
                field393[field384] = 0;
                field384 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field368 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field394.length) {
                var3 = field394[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field385 >= 0 && var3 >= 0) {
                field383[field385] = ~var3;
                field385 = field385 + 1 & 0x7F;
                if (field385 == field375) {
                    field385 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field368 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class307.method4371(var2)) {
                int var3 = field384 + 1 & 0x7F;
                if (field390 != var3) {
                    field387[field384] = -1;
                    field393[field384] = var2;
                    field384 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field368 != null) {
            field385 = -1;
        }
    }
}
