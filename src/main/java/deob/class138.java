package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ec")
public final class class138 implements KeyListener, FocusListener {

    @ObfuscatedName("ec.s")
    public static class138 field2120 = new class138();

    @ObfuscatedName("ec.ck")
    public static boolean[] field2121 = new boolean[112];

    @ObfuscatedName("ec.ce")
    public static int[] field2135 = new int[128];

    @ObfuscatedName("ec.cr")
    public static int field2119 = 0;

    @ObfuscatedName("ec.cf")
    public static int field2137 = 0;

    @ObfuscatedName("ec.cc")
    public static char[] field2128 = new char[128];

    @ObfuscatedName("ec.cp")
    public static int[] field2139 = new int[128];

    @ObfuscatedName("ec.cz")
    public static int[] field2140 = new int[128];

    @ObfuscatedName("ec.cu")
    public static int field2141 = 0;

    @ObfuscatedName("ec.cl")
    public static int field2142 = 0;

    @ObfuscatedName("ec.cv")
    public static int field2143 = 0;

    @ObfuscatedName("ec.ch")
    public static int field2144 = 0;

    @ObfuscatedName("ec.cy")
    public static volatile int field2145 = 0;

    @ObfuscatedName("ec.cq")
    public static int[] field2146 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("bp.s(Ljava/awt/Component;I)V")
    public static void method1480(Component arg0) {
        arg0.removeKeyListener(field2120);
        arg0.removeFocusListener(field2120);
        field2137 = -1;
    }

    @ObfuscatedName("dd.j(I)V")
    public static void method2606() {
        class138 var0 = field2120;
        synchronized (field2120) {
            field2145++;
            field2142 = field2144;
            field2141 = 0;
            if (field2137 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field2121[var1] = false;
                }
                field2137 = field2119;
            } else {
                while (field2137 != field2119) {
                    int var2 = field2135[field2119];
                    field2119 = field2119 + 1 & 0x7F;
                    if (var2 < 0) {
                        field2121[~var2] = false;
                    } else {
                        if (!field2121[var2] && field2141 < field2140.length - 1) {
                            field2140[++field2141 - 1] = var2;
                        }
                        field2121[var2] = true;
                    }
                }
            }
            field2144 = field2143;
        }
    }

    @ObfuscatedName("g.p(I)Z")
    public static final boolean method546() {
        class138 var0 = field2120;
        synchronized (field2120) {
            if (field2144 == field2142) {
                return false;
            } else {
                Statics.field2134 = field2139[field2142];
                Statics.field1918 = field2128[field2142];
                field2142 = field2142 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("cb.x(I)I")
    public static int method1746() {
        return field2145;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2120 == null) {
            return;
        }
        field2145 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2146.length) {
            var3 = field2146[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2137 >= 0 && var3 >= 0) {
            field2135[field2137] = var3;
            field2137 = field2137 + 1 & 0x7F;
            if (field2137 == field2119) {
                field2137 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2143 + 1 & 0x7F;
            if (field2142 != var4) {
                field2139[field2143] = var3;
                field2128[field2143] = 0;
                field2143 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2120 != null) {
            field2145 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2146.length) {
                var3 = field2146[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2137 >= 0 && var3 >= 0) {
                field2135[field2137] = ~var3;
                field2137 = field2137 + 1 & 0x7F;
                if (field2137 == field2119) {
                    field2137 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2120 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class166.field2670;
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
                    int var7 = field2143 + 1 & 0x7F;
                    if (field2142 != var7) {
                        field2139[field2143] = -1;
                        field2128[field2143] = var2;
                        field2143 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2120 != null) {
            field2137 = -1;
        }
    }
}
