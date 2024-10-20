package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("av")
public final class class52 implements KeyListener, FocusListener {

    @ObfuscatedName("av.d")
    public static class52 field634 = new class52();

    @ObfuscatedName("av.ck")
    public static boolean[] field637 = new boolean[112];

    @ObfuscatedName("av.cj")
    public static int[] field633 = new int[128];

    @ObfuscatedName("av.cx")
    public static int field635 = 0;

    @ObfuscatedName("av.cw")
    public static int field638 = 0;

    @ObfuscatedName("av.cp")
    public static char[] field644 = new char[128];

    @ObfuscatedName("av.ch")
    public static int[] field632 = new int[128];

    @ObfuscatedName("av.cr")
    public static int[] field639 = new int[128];

    @ObfuscatedName("av.cf")
    public static int field640 = 0;

    @ObfuscatedName("av.ct")
    public static int field641 = 0;

    @ObfuscatedName("av.ca")
    public static int field642 = 0;

    @ObfuscatedName("av.cz")
    public static int field643 = 0;

    @ObfuscatedName("av.cb")
    public static volatile int field625 = 0;

    @ObfuscatedName("av.cy")
    public static int[] field645 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("bt.d(Ljava/awt/Component;B)V")
    public static void method879(Component arg0) {
        arg0.removeKeyListener(field634);
        arg0.removeFocusListener(field634);
        field638 = -1;
    }

    @ObfuscatedName("fq.z(B)V")
    public static void method2986() {
        class52 var0 = field634;
        synchronized (field634) {
            field625++;
            field641 = field643;
            field640 = 0;
            if (field638 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field637[var1] = false;
                }
                field638 = field635;
            } else {
                while (field638 != field635) {
                    int var2 = field633[field635];
                    field635 = field635 + 1 & 0x7F;
                    if (var2 < 0) {
                        field637[~var2] = false;
                    } else {
                        if (!field637[var2] && field640 < field639.length - 1) {
                            field639[++field640 - 1] = var2;
                        }
                        field637[var2] = true;
                    }
                }
            }
            if (field640 > 0) {
                field625 = 0;
            }
            field643 = field642;
        }
    }

    @ObfuscatedName("a.n(B)Z")
    public static final boolean method181() {
        class52 var0 = field634;
        synchronized (field634) {
            if (field643 == field641) {
                return false;
            } else {
                Statics.field1570 = field632[field641];
                Statics.field352 = field644[field641];
                field641 = field641 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("em.r(B)I")
    public static int method2897() {
        return field625;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field634 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field645.length) {
            var3 = field645[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field638 >= 0 && var3 >= 0) {
            field633[field638] = var3;
            field638 = field638 + 1 & 0x7F;
            if (field638 == field635) {
                field638 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field642 + 1 & 0x7F;
            if (field641 != var4) {
                field632[field642] = var3;
                field644[field642] = 0;
                field642 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field634 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field645.length) {
                var3 = field645[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field638 >= 0 && var3 >= 0) {
                field633[field638] = ~var3;
                field638 = field638 + 1 & 0x7F;
                if (field638 == field635) {
                    field638 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field634 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class315.method1751(var2)) {
                int var3 = field642 + 1 & 0x7F;
                if (field641 != var3) {
                    field632[field642] = -1;
                    field644[field642] = var2;
                    field642 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field634 != null) {
            field638 = -1;
        }
    }
}
