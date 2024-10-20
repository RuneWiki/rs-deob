package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("bn")
public final class class75 implements KeyListener, FocusListener {

    @ObfuscatedName("bn.j")
    public static class75 field1345 = new class75();

    @ObfuscatedName("bn.cl")
    public static boolean[] field1342 = new boolean[112];

    @ObfuscatedName("bn.cy")
    public static int[] field1343 = new int[128];

    @ObfuscatedName("bn.ce")
    public static int field1344 = 0;

    @ObfuscatedName("bn.cs")
    public static int field1350 = 0;

    @ObfuscatedName("bn.cp")
    public static char[] field1346 = new char[128];

    @ObfuscatedName("bn.cj")
    public static int[] field1347 = new int[128];

    @ObfuscatedName("bn.cx")
    public static int[] field1348 = new int[128];

    @ObfuscatedName("bn.cr")
    public static int field1328 = 0;

    @ObfuscatedName("bn.ck")
    public static int field1353 = 0;

    @ObfuscatedName("bn.ch")
    public static int field1351 = 0;

    @ObfuscatedName("bn.cu")
    public static int field1325 = 0;

    @ObfuscatedName("bn.cq")
    public static volatile int field1337 = 0;

    @ObfuscatedName("bn.co")
    public static int[] field1354 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("av.j(Ljava/awt/Component;I)V")
    public static void method691(Component arg0) {
        arg0.removeKeyListener(field1345);
        arg0.removeFocusListener(field1345);
        field1350 = -1;
    }

    @ObfuscatedName("i.r(I)V")
    public static void method130() {
        class75 var0 = field1345;
        synchronized (field1345) {
            field1337++;
            field1353 = field1325;
            field1328 = 0;
            if (field1350 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1342[var1] = false;
                }
                field1350 = field1344;
            } else {
                while (field1350 != field1344) {
                    int var2 = field1343[field1344];
                    field1344 = field1344 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1342[~var2] = false;
                    } else {
                        if (!field1342[var2] && field1328 < field1348.length - 1) {
                            field1348[++field1328 - 1] = var2;
                        }
                        field1342[var2] = true;
                    }
                }
            }
            field1325 = field1351;
        }
    }

    @ObfuscatedName("ab.v(I)Z")
    public static final boolean method595() {
        class75 var0 = field1345;
        synchronized (field1345) {
            if (field1353 == field1325) {
                return false;
            } else {
                Statics.field1289 = field1347[field1353];
                Statics.field1261 = field1346[field1353];
                field1353 = field1353 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("dc.p(I)I")
    public static int method2384() {
        return field1337;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1345 == null) {
            return;
        }
        field1337 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1354.length) {
            var3 = field1354[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1350 >= 0 && var3 >= 0) {
            field1343[field1350] = var3;
            field1350 = field1350 + 1 & 0x7F;
            if (field1350 == field1344) {
                field1350 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1351 + 1 & 0x7F;
            if (field1353 != var4) {
                field1347[field1351] = var3;
                field1346[field1351] = 0;
                field1351 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1345 != null) {
            field1337 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1354.length) {
                var3 = field1354[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1350 >= 0 && var3 >= 0) {
                field1343[field1350] = ~var3;
                field1350 = field1350 + 1 & 0x7F;
                if (field1350 == field1344) {
                    field1350 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1345 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class149.method1393(var2)) {
                int var3 = field1351 + 1 & 0x7F;
                if (field1353 != var3) {
                    field1347[field1351] = -1;
                    field1346[field1351] = var2;
                    field1351 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1345 != null) {
            field1350 = -1;
        }
    }
}
