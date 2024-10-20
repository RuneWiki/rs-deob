package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ay")
public final class class52 implements KeyListener, FocusListener {

    @ObfuscatedName("ay.o")
    public static class52 field637 = new class52();

    @ObfuscatedName("ay.cu")
    public static boolean[] field625 = new boolean[112];

    @ObfuscatedName("ay.ci")
    public static int[] field626 = new int[128];

    @ObfuscatedName("ay.cx")
    public static int field627 = 0;

    @ObfuscatedName("ay.cs")
    public static int field628 = 0;

    @ObfuscatedName("ay.cc")
    public static char[] field633 = new char[128];

    @ObfuscatedName("ay.ca")
    public static int[] field630 = new int[128];

    @ObfuscatedName("ay.ch")
    public static int[] field631 = new int[128];

    @ObfuscatedName("ay.cy")
    public static int field639 = 0;

    @ObfuscatedName("ay.cr")
    public static int field621 = 0;

    @ObfuscatedName("ay.ct")
    public static int field632 = 0;

    @ObfuscatedName("ay.co")
    public static int field624 = 0;

    @ObfuscatedName("ay.cq")
    public static volatile int field636 = 0;

    @ObfuscatedName("ay.cn")
    public static int[] field615 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("p.o(Ljava/awt/Component;I)V")
    public static void method175(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field637);
        arg0.addFocusListener(field637);
    }

    @ObfuscatedName("dy.k(Ljava/awt/Component;I)V")
    public static void method2318(Component arg0) {
        arg0.removeKeyListener(field637);
        arg0.removeFocusListener(field637);
        field628 = -1;
    }

    @ObfuscatedName("es.t(I)V")
    public static void method2832() {
        class52 var0 = field637;
        synchronized (field637) {
            field636++;
            field621 = field624;
            field639 = 0;
            if (field628 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field625[var1] = false;
                }
                field628 = field627;
            } else {
                while (field628 != field627) {
                    int var2 = field626[field627];
                    field627 = field627 + 1 & 0x7F;
                    if (var2 < 0) {
                        field625[~var2] = false;
                    } else {
                        if (!field625[var2] && field639 < field631.length - 1) {
                            field631[++field639 - 1] = var2;
                        }
                        field625[var2] = true;
                    }
                }
            }
            if (field639 > 0) {
                field636 = 0;
            }
            field624 = field632;
        }
    }

    @ObfuscatedName("ft.d(I)Z")
    public static final boolean method2932() {
        class52 var0 = field637;
        synchronized (field637) {
            if (field624 == field621) {
                return false;
            } else {
                Statics.field1425 = field630[field621];
                Statics.field508 = field633[field621];
                field621 = field621 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("ab.h(B)I")
    public static int method224() {
        return field636;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field637 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field615.length) {
            var3 = field615[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field628 >= 0 && var3 >= 0) {
            field626[field628] = var3;
            field628 = field628 + 1 & 0x7F;
            if (field628 == field627) {
                field628 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field632 + 1 & 0x7F;
            if (field621 != var4) {
                field630[field632] = var3;
                field633[field632] = 0;
                field632 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field637 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field615.length) {
                var3 = field615[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field628 >= 0 && var3 >= 0) {
                field626[field628] = ~var3;
                field628 = field628 + 1 & 0x7F;
                if (field628 == field627) {
                    field628 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field637 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class315.field3920;
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
                    int var7 = field632 + 1 & 0x7F;
                    if (field621 != var7) {
                        field630[field632] = -1;
                        field633[field632] = var2;
                        field632 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field637 != null) {
            field628 = -1;
        }
    }
}
