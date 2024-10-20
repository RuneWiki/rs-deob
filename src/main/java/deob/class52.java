package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("aq")
public final class class52 implements KeyListener, FocusListener {

    @ObfuscatedName("aq.g")
    public static class52 field623 = new class52();

    @ObfuscatedName("aq.ck")
    public static boolean[] field620 = new boolean[112];

    @ObfuscatedName("aq.cn")
    public static int[] field613 = new int[128];

    @ObfuscatedName("aq.cc")
    public static int field622 = 0;

    @ObfuscatedName("aq.cz")
    public static int field615 = 0;

    @ObfuscatedName("aq.cd")
    public static char[] field624 = new char[128];

    @ObfuscatedName("aq.co")
    public static int[] field625 = new int[128];

    @ObfuscatedName("aq.cb")
    public static int[] field626 = new int[128];

    @ObfuscatedName("aq.cs")
    public static int field627 = 0;

    @ObfuscatedName("aq.cr")
    public static int field628 = 0;

    @ObfuscatedName("aq.cw")
    public static int field629 = 0;

    @ObfuscatedName("aq.ci")
    public static int field611 = 0;

    @ObfuscatedName("aq.cq")
    public static volatile int field631 = 0;

    @ObfuscatedName("aq.ct")
    public static int[] field609 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("fg.g(S)V")
    public static void method3029() {
        if (Statics.field2190.toLowerCase().indexOf("microsoft") != -1) {
            field609[186] = 57;
            field609[187] = 27;
            field609[188] = 71;
            field609[189] = 26;
            field609[190] = 72;
            field609[191] = 73;
            field609[192] = 58;
            field609[219] = 42;
            field609[220] = 74;
            field609[221] = 43;
            field609[222] = 59;
            field609[223] = 28;
            return;
        }
        field609[44] = 71;
        field609[45] = 26;
        field609[46] = 72;
        field609[47] = 73;
        field609[59] = 57;
        field609[61] = 27;
        field609[91] = 42;
        field609[92] = 74;
        field609[93] = 43;
        field609[192] = 28;
        field609[222] = 58;
        field609[520] = 59;
    }

    @ObfuscatedName("gw.e(Ljava/awt/Component;I)V")
    public static void method3289(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field623);
        arg0.addFocusListener(field623);
    }

    @ObfuscatedName("eu.b(I)V")
    public static void method2937() {
        class52 var0 = field623;
        synchronized (field623) {
            field631++;
            field628 = field611;
            field627 = 0;
            if (field615 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field620[var1] = false;
                }
                field615 = field622;
            } else {
                while (field622 != field615) {
                    int var2 = field613[field622];
                    field622 = field622 + 1 & 0x7F;
                    if (var2 < 0) {
                        field620[~var2] = false;
                    } else {
                        if (!field620[var2] && field627 < field626.length - 1) {
                            field626[++field627 - 1] = var2;
                        }
                        field620[var2] = true;
                    }
                }
            }
            if (field627 > 0) {
                field631 = 0;
            }
            field611 = field629;
        }
    }

    @ObfuscatedName("km.z(B)Z")
    public static final boolean method4967() {
        class52 var0 = field623;
        synchronized (field623) {
            if (field628 == field611) {
                return false;
            } else {
                Statics.field3860 = field625[field628];
                Statics.field244 = field624[field628];
                field628 = field628 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("an.n(I)I")
    public static int method680() {
        return field631;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field623 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field609.length) {
            var3 = field609[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field615 >= 0 && var3 >= 0) {
            field613[field615] = var3;
            field615 = field615 + 1 & 0x7F;
            if (field622 == field615) {
                field615 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field629 + 1 & 0x7F;
            if (field628 != var4) {
                field625[field629] = var3;
                field624[field629] = 0;
                field629 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field623 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field609.length) {
                var3 = field609[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field615 >= 0 && var3 >= 0) {
                field613[field615] = ~var3;
                field615 = field615 + 1 & 0x7F;
                if (field622 == field615) {
                    field615 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field623 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class315.field3921;
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
                    int var7 = field629 + 1 & 0x7F;
                    if (field628 != var7) {
                        field625[field629] = -1;
                        field624[field629] = var2;
                        field629 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field623 != null) {
            field615 = -1;
        }
    }
}
