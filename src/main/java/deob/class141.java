package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("eh")
public final class class141 implements KeyListener, FocusListener {

    @ObfuscatedName("eh.s")
    public static class141 field2156 = new class141();

    @ObfuscatedName("eh.co")
    public static boolean[] field2158 = new boolean[112];

    @ObfuscatedName("eh.ce")
    public static int[] field2159 = new int[128];

    @ObfuscatedName("eh.cy")
    public static int field2160 = 0;

    @ObfuscatedName("eh.cc")
    public static int field2151 = 0;

    @ObfuscatedName("eh.cr")
    public static char[] field2162 = new char[128];

    @ObfuscatedName("eh.cq")
    public static int[] field2163 = new int[128];

    @ObfuscatedName("eh.cf")
    public static int[] field2169 = new int[128];

    @ObfuscatedName("eh.cv")
    public static int field2165 = 0;

    @ObfuscatedName("eh.ck")
    public static int field2166 = 0;

    @ObfuscatedName("eh.cd")
    public static int field2167 = 0;

    @ObfuscatedName("eh.cn")
    public static int field2168 = 0;

    @ObfuscatedName("eh.cm")
    public static volatile int field2152 = 0;

    @ObfuscatedName("eh.cu")
    public static int[] field2157 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("ad.s(Ljava/awt/Component;I)V")
    public static void method767(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field2156);
        arg0.addFocusListener(field2156);
    }

    @ObfuscatedName("cn.z(Ljava/awt/Component;B)V")
    public static void method2067(Component arg0) {
        arg0.removeKeyListener(field2156);
        arg0.removeFocusListener(field2156);
        field2151 = -1;
    }

    @ObfuscatedName("bo.y(I)V")
    public static void method1052() {
        class141 var0 = field2156;
        synchronized (field2156) {
            field2152++;
            field2166 = field2168;
            field2165 = 0;
            if (field2151 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field2158[var1] = false;
                }
                field2151 = field2160;
            } else {
                while (field2160 != field2151) {
                    int var2 = field2159[field2160];
                    field2160 = field2160 + 1 & 0x7F;
                    if (var2 < 0) {
                        field2158[~var2] = false;
                    } else {
                        if (!field2158[var2] && field2165 < field2169.length - 1) {
                            field2169[++field2165 - 1] = var2;
                        }
                        field2158[var2] = true;
                    }
                }
            }
            field2168 = field2167;
        }
    }

    @ObfuscatedName("p.p(I)Z")
    public static final boolean method45() {
        class141 var0 = field2156;
        synchronized (field2156) {
            if (field2168 == field2166) {
                return false;
            } else {
                Statics.field2651 = field2163[field2166];
                Statics.field2085 = field2162[field2166];
                field2166 = field2166 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("er.g(I)I")
    public static int method2701() {
        return field2152;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2156 == null) {
            return;
        }
        field2152 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2157.length) {
            var3 = field2157[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2151 >= 0 && var3 >= 0) {
            field2159[field2151] = var3;
            field2151 = field2151 + 1 & 0x7F;
            if (field2160 == field2151) {
                field2151 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2167 + 1 & 0x7F;
            if (field2166 != var4) {
                field2163[field2167] = var3;
                field2162[field2167] = 0;
                field2167 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2156 != null) {
            field2152 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2157.length) {
                var3 = field2157[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2151 >= 0 && var3 >= 0) {
                field2159[field2151] = ~var3;
                field2151 = field2151 + 1 & 0x7F;
                if (field2160 == field2151) {
                    field2151 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2156 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class169.field2710;
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
                    int var7 = field2167 + 1 & 0x7F;
                    if (field2166 != var7) {
                        field2163[field2167] = -1;
                        field2162[field2167] = var2;
                        field2167 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2156 != null) {
            field2151 = -1;
        }
    }
}
