package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("bp")
public final class class55 implements KeyListener, FocusListener {

    @ObfuscatedName("bp.f")
    public static class55 field413 = new class55();

    @ObfuscatedName("bp.cx")
    public static boolean[] field421 = new boolean[112];

    @ObfuscatedName("bp.cw")
    public static int[] field436 = new int[128];

    @ObfuscatedName("bp.cu")
    public static int field423 = 0;

    @ObfuscatedName("bp.cq")
    public static int field424 = 0;

    @ObfuscatedName("bp.cd")
    public static char[] field425 = new char[128];

    @ObfuscatedName("bp.cj")
    public static int[] field426 = new int[128];

    @ObfuscatedName("bp.cm")
    public static int[] field431 = new int[128];

    @ObfuscatedName("bp.cb")
    public static int field428 = 0;

    @ObfuscatedName("bp.ct")
    public static int field416 = 0;

    @ObfuscatedName("bp.cv")
    public static int field414 = 0;

    @ObfuscatedName("bp.cz")
    public static int field429 = 0;

    @ObfuscatedName("bp.ch")
    public static volatile int field432 = 0;

    @ObfuscatedName("bp.co")
    public static int[] field433 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("v.f(I)V")
    public static void method196() {
        if (Statics.field2059.toLowerCase().indexOf("microsoft") != -1) {
            field433[186] = 57;
            field433[187] = 27;
            field433[188] = 71;
            field433[189] = 26;
            field433[190] = 72;
            field433[191] = 73;
            field433[192] = 58;
            field433[219] = 42;
            field433[220] = 74;
            field433[221] = 43;
            field433[222] = 59;
            field433[223] = 28;
            return;
        }
        field433[44] = 71;
        field433[45] = 26;
        field433[46] = 72;
        field433[47] = 73;
        field433[59] = 57;
        field433[61] = 27;
        field433[91] = 42;
        field433[92] = 74;
        field433[93] = 43;
        field433[192] = 28;
        field433[222] = 58;
        field433[520] = 59;
    }

    @ObfuscatedName("ep.b(Ljava/awt/Component;B)V")
    public static void method2871(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field413);
        arg0.addFocusListener(field413);
    }

    @ObfuscatedName("cc.l(B)V")
    public static void method1834() {
        class55 var0 = field413;
        synchronized (field413) {
            field432++;
            field416 = field429;
            field428 = 0;
            if (field424 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field421[var1] = false;
                }
                field424 = field423;
            } else {
                while (field424 != field423) {
                    int var2 = field436[field423];
                    field423 = field423 + 1 & 0x7F;
                    if (var2 < 0) {
                        field421[~var2] = false;
                    } else {
                        if (!field421[var2] && field428 < field431.length - 1) {
                            field431[++field428 - 1] = var2;
                        }
                        field421[var2] = true;
                    }
                }
            }
            if (field428 > 0) {
                field432 = 0;
            }
            field429 = field414;
        }
    }

    @ObfuscatedName("ft.m(B)Z")
    public static final boolean method3331() {
        class55 var0 = field413;
        synchronized (field413) {
            if (field429 == field416) {
                return false;
            } else {
                Statics.field556 = field426[field416];
                Statics.field336 = field425[field416];
                field416 = field416 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("ip.z(I)I")
    public static int method3881() {
        return field432;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field413 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field433.length) {
            var3 = field433[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field424 >= 0 && var3 >= 0) {
            field436[field424] = var3;
            field424 = field424 + 1 & 0x7F;
            if (field424 == field423) {
                field424 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field414 + 1 & 0x7F;
            if (field416 != var4) {
                field426[field414] = var3;
                field425[field414] = 0;
                field414 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field413 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field433.length) {
                var3 = field433[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field424 >= 0 && var3 >= 0) {
                field436[field424] = ~var3;
                field424 = field424 + 1 & 0x7F;
                if (field424 == field423) {
                    field424 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field413 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class299.field3677;
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
                    int var7 = field414 + 1 & 0x7F;
                    if (field416 != var7) {
                        field426[field414] = -1;
                        field425[field414] = var2;
                        field414 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field413 != null) {
            field424 = -1;
        }
    }
}
