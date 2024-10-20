package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("aj")
public final class class51 implements KeyListener, FocusListener {

    @ObfuscatedName("aj.e")
    public static class51 field622 = new class51();

    @ObfuscatedName("aj.cg")
    public static boolean[] field632 = new boolean[112];

    @ObfuscatedName("aj.cn")
    public static int[] field643 = new int[128];

    @ObfuscatedName("aj.ca")
    public static int field627 = 0;

    @ObfuscatedName("aj.cd")
    public static int field635 = 0;

    @ObfuscatedName("aj.cx")
    public static char[] field636 = new char[128];

    @ObfuscatedName("aj.cb")
    public static int[] field634 = new int[128];

    @ObfuscatedName("aj.ck")
    public static int[] field638 = new int[128];

    @ObfuscatedName("aj.ci")
    public static int field644 = 0;

    @ObfuscatedName("aj.cv")
    public static int field631 = 0;

    @ObfuscatedName("aj.ce")
    public static int field637 = 0;

    @ObfuscatedName("aj.cy")
    public static int field619 = 0;

    @ObfuscatedName("aj.cr")
    public static volatile int field639 = 0;

    @ObfuscatedName("aj.cc")
    public static int[] field640 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("cd.e(I)V")
    public static void method1609() {
        if (Statics.field2225.toLowerCase().indexOf("microsoft") != -1) {
            field640[186] = 57;
            field640[187] = 27;
            field640[188] = 71;
            field640[189] = 26;
            field640[190] = 72;
            field640[191] = 73;
            field640[192] = 58;
            field640[219] = 42;
            field640[220] = 74;
            field640[221] = 43;
            field640[222] = 59;
            field640[223] = 28;
            return;
        }
        field640[44] = 71;
        field640[45] = 26;
        field640[46] = 72;
        field640[47] = 73;
        field640[59] = 57;
        field640[61] = 27;
        field640[91] = 42;
        field640[92] = 74;
        field640[93] = 43;
        field640[192] = 28;
        field640[222] = 58;
        field640[520] = 59;
    }

    @ObfuscatedName("a.n(I)V")
    public static void method121() {
        class51 var0 = field622;
        synchronized (field622) {
            field639++;
            field631 = field619;
            field644 = 0;
            if (field635 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field632[var1] = false;
                }
                field635 = field627;
            } else {
                while (field635 != field627) {
                    int var2 = field643[field627];
                    field627 = field627 + 1 & 0x7F;
                    if (var2 < 0) {
                        field632[~var2] = false;
                    } else {
                        if (!field632[var2] && field644 < field638.length - 1) {
                            field638[++field644 - 1] = var2;
                        }
                        field632[var2] = true;
                    }
                }
            }
            if (field644 > 0) {
                field639 = 0;
            }
            field619 = field637;
        }
    }

    @ObfuscatedName("ao.g(I)Z")
    public static final boolean method249() {
        class51 var0 = field622;
        synchronized (field622) {
            if (field631 == field619) {
                return false;
            } else {
                Statics.field2590 = field634[field631];
                Statics.field1293 = field636[field631];
                field631 = field631 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("eo.y(I)I")
    public static int method2426() {
        return field639;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field622 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field640.length) {
            var3 = field640[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field635 >= 0 && var3 >= 0) {
            field643[field635] = var3;
            field635 = field635 + 1 & 0x7F;
            if (field635 == field627) {
                field635 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field637 + 1 & 0x7F;
            if (field631 != var4) {
                field634[field637] = var3;
                field636[field637] = 0;
                field637 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field622 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field640.length) {
                var3 = field640[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field635 >= 0 && var3 >= 0) {
                field643[field635] = ~var3;
                field635 = field635 + 1 & 0x7F;
                if (field635 == field627) {
                    field635 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field622 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && Statics.method3774(var2)) {
                int var3 = field637 + 1 & 0x7F;
                if (field631 != var3) {
                    field634[field637] = -1;
                    field636[field637] = var2;
                    field637 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field622 != null) {
            field635 = -1;
        }
    }
}
