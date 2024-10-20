package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("bg")
public final class class55 implements KeyListener, FocusListener {

    @ObfuscatedName("bg.m")
    public static class55 field423 = new class55();

    @ObfuscatedName("bg.ck")
    public static boolean[] field409 = new boolean[112];

    @ObfuscatedName("bg.ci")
    public static int[] field410 = new int[128];

    @ObfuscatedName("bg.cu")
    public static int field415 = 0;

    @ObfuscatedName("bg.cq")
    public static int field412 = 0;

    @ObfuscatedName("bg.co")
    public static char[] field416 = new char[128];

    @ObfuscatedName("bg.ca")
    public static int[] field414 = new int[128];

    @ObfuscatedName("bg.cm")
    public static int[] field430 = new int[128];

    @ObfuscatedName("bg.cf")
    public static int field426 = 0;

    @ObfuscatedName("bg.ct")
    public static int field417 = 0;

    @ObfuscatedName("bg.cd")
    public static int field418 = 0;

    @ObfuscatedName("bg.cy")
    public static int field422 = 0;

    @ObfuscatedName("bg.cx")
    public static volatile int field420 = 0;

    @ObfuscatedName("bg.cs")
    public static int[] field421 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("jf.m(I)V")
    public static void method4792() {
        if (Statics.field2066.toLowerCase().indexOf("microsoft") != -1) {
            field421[186] = 57;
            field421[187] = 27;
            field421[188] = 71;
            field421[189] = 26;
            field421[190] = 72;
            field421[191] = 73;
            field421[192] = 58;
            field421[219] = 42;
            field421[220] = 74;
            field421[221] = 43;
            field421[222] = 59;
            field421[223] = 28;
            return;
        }
        field421[44] = 71;
        field421[45] = 26;
        field421[46] = 72;
        field421[47] = 73;
        field421[59] = 57;
        field421[61] = 27;
        field421[91] = 42;
        field421[92] = 74;
        field421[93] = 43;
        field421[192] = 28;
        field421[222] = 58;
        field421[520] = 59;
    }

    @ObfuscatedName("ex.o(I)V")
    public static void method2900() {
        if (field423 != null) {
            class55 var0 = field423;
            synchronized (field423) {
                field423 = null;
            }
        }
    }

    @ObfuscatedName("gw.q(I)V")
    public static void method3540() {
        class55 var0 = field423;
        synchronized (field423) {
            field420++;
            field417 = field422;
            field426 = 0;
            if (field412 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field409[var1] = false;
                }
                field412 = field415;
            } else {
                while (field415 != field412) {
                    int var2 = field410[field415];
                    field415 = field415 + 1 & 0x7F;
                    if (var2 < 0) {
                        field409[~var2] = false;
                    } else {
                        if (!field409[var2] && field426 < field430.length - 1) {
                            field430[++field426 - 1] = var2;
                        }
                        field409[var2] = true;
                    }
                }
            }
            if (field426 > 0) {
                field420 = 0;
            }
            field422 = field418;
        }
    }

    @ObfuscatedName("aa.j(I)Z")
    public static final boolean method610() {
        class55 var0 = field423;
        synchronized (field423) {
            if (field422 == field417) {
                return false;
            } else {
                Statics.field547 = field414[field417];
                Statics.field443 = field416[field417];
                field417 = field417 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field423 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field421.length) {
            var3 = field421[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field412 >= 0 && var3 >= 0) {
            field410[field412] = var3;
            field412 = field412 + 1 & 0x7F;
            if (field415 == field412) {
                field412 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field418 + 1 & 0x7F;
            if (field417 != var4) {
                field414[field418] = var3;
                field416[field418] = 0;
                field418 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field423 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field421.length) {
                var3 = field421[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field412 >= 0 && var3 >= 0) {
                field410[field412] = ~var3;
                field412 = field412 + 1 & 0x7F;
                if (field415 == field412) {
                    field412 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field423 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class298.method119(var2)) {
                int var3 = field418 + 1 & 0x7F;
                if (field417 != var3) {
                    field414[field418] = -1;
                    field416[field418] = var2;
                    field418 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field423 != null) {
            field412 = -1;
        }
    }
}
