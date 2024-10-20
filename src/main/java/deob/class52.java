package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ad")
public final class class52 implements KeyListener, FocusListener {

    @ObfuscatedName("ad.t")
    public static class52 field609 = new class52();

    @ObfuscatedName("ad.co")
    public static boolean[] field615 = new boolean[112];

    @ObfuscatedName("ad.cq")
    public static int[] field598 = new int[128];

    @ObfuscatedName("ad.ci")
    public static int field603 = 0;

    @ObfuscatedName("ad.cc")
    public static int field604 = 0;

    @ObfuscatedName("ad.ce")
    public static char[] field602 = new char[128];

    @ObfuscatedName("ad.cx")
    public static int[] field606 = new int[128];

    @ObfuscatedName("ad.cy")
    public static int[] field607 = new int[128];

    @ObfuscatedName("ad.cg")
    public static int field601 = 0;

    @ObfuscatedName("ad.cj")
    public static int field612 = 0;

    @ObfuscatedName("ad.cl")
    public static int field591 = 0;

    @ObfuscatedName("ad.cz")
    public static int field611 = 0;

    @ObfuscatedName("ad.cn")
    public static volatile int field599 = 0;

    @ObfuscatedName("ad.ca")
    public static int[] field608 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("if.q(Ljava/awt/Component;I)V")
    public static void method4076(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field609);
        arg0.addFocusListener(field609);
    }

    @ObfuscatedName("ae.i(B)V")
    public static void method246() {
        if (field609 != null) {
            class52 var0 = field609;
            synchronized (field609) {
                field609 = null;
            }
        }
    }

    @ObfuscatedName("ae.a(B)V")
    public static void method249() {
        class52 var0 = field609;
        synchronized (field609) {
            field599++;
            field612 = field611;
            field601 = 0;
            if (field604 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field615[var1] = false;
                }
                field604 = field603;
            } else {
                while (field604 != field603) {
                    int var2 = field598[field603];
                    field603 = field603 + 1 & 0x7F;
                    if (var2 < 0) {
                        field615[~var2] = false;
                    } else {
                        if (!field615[var2] && field601 < field607.length - 1) {
                            field607[++field601 - 1] = var2;
                        }
                        field615[var2] = true;
                    }
                }
            }
            if (field601 > 0) {
                field599 = 0;
            }
            field611 = field591;
        }
    }

    @ObfuscatedName("ko.l(I)Z")
    public static final boolean method4806() {
        class52 var0 = field609;
        synchronized (field609) {
            if (field612 == field611) {
                return false;
            } else {
                Statics.field1296 = field606[field612];
                Statics.field342 = field602[field612];
                field612 = field612 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("er.b(I)I")
    public static int method2899() {
        return field599;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field609 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field608.length) {
            var3 = field608[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field604 >= 0 && var3 >= 0) {
            field598[field604] = var3;
            field604 = field604 + 1 & 0x7F;
            if (field604 == field603) {
                field604 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field591 + 1 & 0x7F;
            if (field612 != var4) {
                field606[field591] = var3;
                field602[field591] = 0;
                field591 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field609 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field608.length) {
                var3 = field608[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field604 >= 0 && var3 >= 0) {
                field598[field604] = ~var3;
                field604 = field604 + 1 & 0x7F;
                if (field604 == field603) {
                    field604 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field609 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class315.field3916;
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
                    int var7 = field591 + 1 & 0x7F;
                    if (field612 != var7) {
                        field606[field591] = -1;
                        field602[field591] = var2;
                        field591 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field609 != null) {
            field604 = -1;
        }
    }
}
