package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("an")
public final class class46 implements KeyListener, FocusListener {

    @ObfuscatedName("an.u")
    public static class46 field391 = new class46();

    @ObfuscatedName("an.cb")
    public static boolean[] field405 = new boolean[112];

    @ObfuscatedName("an.cj")
    public static int[] field395 = new int[128];

    @ObfuscatedName("an.cq")
    public static int field394 = 0;

    @ObfuscatedName("an.ci")
    public static int field398 = 0;

    @ObfuscatedName("an.cu")
    public static char[] field396 = new char[128];

    @ObfuscatedName("an.cs")
    public static int[] field397 = new int[128];

    @ObfuscatedName("an.cc")
    public static int[] field379 = new int[128];

    @ObfuscatedName("an.cp")
    public static int field399 = 0;

    @ObfuscatedName("an.ce")
    public static int field400 = 0;

    @ObfuscatedName("an.ca")
    public static int field401 = 0;

    @ObfuscatedName("an.cf")
    public static int field385 = 0;

    @ObfuscatedName("an.cx")
    public static volatile int field392 = 0;

    @ObfuscatedName("an.cz")
    public static int[] field404 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("x.u(I)V")
    public static void method133() {
        if (Statics.field2042.toLowerCase().indexOf("microsoft") != -1) {
            field404[186] = 57;
            field404[187] = 27;
            field404[188] = 71;
            field404[189] = 26;
            field404[190] = 72;
            field404[191] = 73;
            field404[192] = 58;
            field404[219] = 42;
            field404[220] = 74;
            field404[221] = 43;
            field404[222] = 59;
            field404[223] = 28;
            return;
        }
        field404[44] = 71;
        field404[45] = 26;
        field404[46] = 72;
        field404[47] = 73;
        field404[59] = 57;
        field404[61] = 27;
        field404[91] = 42;
        field404[92] = 74;
        field404[93] = 43;
        field404[192] = 28;
        field404[222] = 58;
        field404[520] = 59;
    }

    @ObfuscatedName("n.f(Ljava/awt/Component;B)V")
    public static void method158(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field391);
        arg0.addFocusListener(field391);
    }

    @ObfuscatedName("i.b(Ljava/awt/Component;I)V")
    public static void method109(Component arg0) {
        arg0.removeKeyListener(field391);
        arg0.removeFocusListener(field391);
        field398 = -1;
    }

    @ObfuscatedName("gl.g(I)V")
    public static void method3411() {
        if (field391 != null) {
            class46 var0 = field391;
            synchronized (field391) {
                field391 = null;
            }
        }
    }

    @ObfuscatedName("it.z(B)Z")
    public static final boolean method4034() {
        class46 var0 = field391;
        synchronized (field391) {
            if (field400 == field385) {
                return false;
            } else {
                Statics.field419 = field397[field400];
                Statics.field3700 = field396[field400];
                field400 = field400 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field391 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field404.length) {
            var3 = field404[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field398 >= 0 && var3 >= 0) {
            field395[field398] = var3;
            field398 = field398 + 1 & 0x7F;
            if (field398 == field394) {
                field398 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field401 + 1 & 0x7F;
            if (field400 != var4) {
                field397[field401] = var3;
                field396[field401] = 0;
                field401 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field391 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field404.length) {
                var3 = field404[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field398 >= 0 && var3 >= 0) {
                field395[field398] = ~var3;
                field398 = field398 + 1 & 0x7F;
                if (field398 == field394) {
                    field398 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field391 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class288.field3648;
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
                    int var7 = field401 + 1 & 0x7F;
                    if (field400 != var7) {
                        field397[field401] = -1;
                        field396[field401] = var2;
                        field401 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field391 != null) {
            field398 = -1;
        }
    }
}
