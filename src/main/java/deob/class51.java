package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ai")
public final class class51 implements KeyListener, FocusListener {

    @ObfuscatedName("ai.i")
    public static class51 field660 = new class51();

    @ObfuscatedName("ai.ct")
    public static boolean[] field652 = new boolean[112];

    @ObfuscatedName("ai.cx")
    public static int[] field643 = new int[128];

    @ObfuscatedName("ai.cd")
    public static int field654 = 0;

    @ObfuscatedName("ai.cb")
    public static int field655 = 0;

    @ObfuscatedName("ai.cg")
    public static char[] field656 = new char[128];

    @ObfuscatedName("ai.cr")
    public static int[] field657 = new int[128];

    @ObfuscatedName("ai.ci")
    public static int[] field647 = new int[128];

    @ObfuscatedName("ai.cm")
    public static int field653 = 0;

    @ObfuscatedName("ai.cy")
    public static int field658 = 0;

    @ObfuscatedName("ai.co")
    public static int field659 = 0;

    @ObfuscatedName("ai.ck")
    public static int field662 = 0;

    @ObfuscatedName("ai.cn")
    public static volatile int field663 = 0;

    @ObfuscatedName("ai.cv")
    public static int[] field641 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("k.i(B)V")
    public static void method37() {
        if (Statics.field2243.toLowerCase().indexOf("microsoft") != -1) {
            field641[186] = 57;
            field641[187] = 27;
            field641[188] = 71;
            field641[189] = 26;
            field641[190] = 72;
            field641[191] = 73;
            field641[192] = 58;
            field641[219] = 42;
            field641[220] = 74;
            field641[221] = 43;
            field641[222] = 59;
            field641[223] = 28;
            return;
        }
        field641[44] = 71;
        field641[45] = 26;
        field641[46] = 72;
        field641[47] = 73;
        field641[59] = 57;
        field641[61] = 27;
        field641[91] = 42;
        field641[92] = 74;
        field641[93] = 43;
        field641[192] = 28;
        field641[222] = 58;
        field641[520] = 59;
    }

    @ObfuscatedName("client.a(I)V")
    public static void method1180() {
        class51 var0 = field660;
        synchronized (field660) {
            field663++;
            field658 = field662;
            field653 = 0;
            if (field655 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field652[var1] = false;
                }
                field655 = field654;
            } else {
                while (field655 != field654) {
                    int var2 = field643[field654];
                    field654 = field654 + 1 & 0x7F;
                    if (var2 < 0) {
                        field652[~var2] = false;
                    } else {
                        if (!field652[var2] && field653 < field647.length - 1) {
                            field647[++field653 - 1] = var2;
                        }
                        field652[var2] = true;
                    }
                }
            }
            if (field653 > 0) {
                field663 = 0;
            }
            field662 = field659;
        }
    }

    @ObfuscatedName("m.r(I)Z")
    public static final boolean method162() {
        class51 var0 = field660;
        synchronized (field660) {
            if (field662 == field658) {
                return false;
            } else {
                Statics.field2494 = field657[field658];
                Statics.field445 = field656[field658];
                field658 = field658 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field660 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field641.length) {
            var3 = field641[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field655 >= 0 && var3 >= 0) {
            field643[field655] = var3;
            field655 = field655 + 1 & 0x7F;
            if (field655 == field654) {
                field655 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field659 + 1 & 0x7F;
            if (field658 != var4) {
                field657[field659] = var3;
                field656[field659] = 0;
                field659 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field660 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field641.length) {
                var3 = field641[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field655 >= 0 && var3 >= 0) {
                field643[field655] = ~var3;
                field655 = field655 + 1 & 0x7F;
                if (field655 == field654) {
                    field655 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field660 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class268.field3661;
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
                    int var7 = field659 + 1 & 0x7F;
                    if (field658 != var7) {
                        field657[field659] = -1;
                        field656[field659] = var2;
                        field659 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field660 != null) {
            field655 = -1;
        }
    }
}
