package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fl")
public class class175 {

    @ObfuscatedName("fl.q")
    public static int field2762 = 0;

    @ObfuscatedName("fl.c")
    public static class200 field2777 = new class200(4096);

    @ObfuscatedName("fl.v")
    public static int field2775 = 0;

    @ObfuscatedName("fl.j")
    public static class200 field2766 = new class200(32);

    @ObfuscatedName("fl.m")
    public static int field2776 = 0;

    @ObfuscatedName("fl.y")
    public static class207 field2768 = new class207();

    @ObfuscatedName("fl.u")
    public static class200 field2769 = new class200(4096);

    @ObfuscatedName("fl.h")
    public static int field2780 = 0;

    @ObfuscatedName("fl.l")
    public static class200 field2765 = new class200(4096);

    @ObfuscatedName("fl.b")
    public static int field2772 = 0;

    @ObfuscatedName("fl.p")
    public static class123 field2773 = new class123(8);

    @ObfuscatedName("fl.w")
    public static int field2774 = 0;

    @ObfuscatedName("fl.r")
    public static CRC32 field2761 = new CRC32();

    @ObfuscatedName("fl.n")
    public static class172[] field2782 = new class172[256];

    @ObfuscatedName("fl.z")
    public static byte field2767 = 0;

    @ObfuscatedName("fl.x")
    public static int field2778 = 0;

    @ObfuscatedName("fl.d")
    public static int field2779 = 0;

    public class175() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("s.k(I)Z")
    public static boolean method155() {
        long var0 = class119.method3068();
        int var2 = (int) (var0 - Statics.field2763);
        Statics.field2763 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2762 += var2;
        if (field2772 == 0 && field2776 == 0 && field2780 == 0 && field2775 == 0) {
            return true;
        } else if (Statics.field2770 == null) {
            return false;
        } else {
            try {
                if (field2762 > 30000) {
                    throw new IOException();
                }
                while (field2776 < 20 && field2775 > 0) {
                    class176 var3 = (class176) field2777.method3577();
                    class123 var4 = new class123(4);
                    var4.method2412(1);
                    var4.method2414((int) var3.field3166);
                    Statics.field2770.method2869(var4.field2054, 0, 4);
                    field2766.method3574(var3, var3.field3166);
                    field2775--;
                    field2776++;
                }
                while (field2772 < 20 && field2780 > 0) {
                    class176 var5 = (class176) field2768.method3666();
                    class123 var6 = new class123(4);
                    var6.method2412(0);
                    var6.method2414((int) var5.field3166);
                    Statics.field2770.method2869(var6.field2054, 0, 4);
                    var5.method3684();
                    field2765.method3574(var5, var5.field3166);
                    field2780--;
                    field2772++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2770.method2864();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2762 = 0;
                    byte var9 = 0;
                    if (Statics.field3216 == null) {
                        var9 = 8;
                    } else if (field2774 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2773.field2060;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2770.method2866(field2773.field2054, field2773.field2060, var10);
                        if (field2767 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2773.field2054[field2773.field2060 + var11] ^= field2767;
                            }
                        }
                        field2773.field2060 += var10;
                        if (field2773.field2060 < var9) {
                            break;
                        }
                        if (Statics.field3216 == null) {
                            field2773.field2060 = 0;
                            int var12 = field2773.method2427();
                            int var13 = field2773.method2547();
                            int var14 = field2773.method2427();
                            int var15 = field2773.method2432();
                            long var16 = (long) ((var12 << 16) + var13);
                            class176 var18 = (class176) field2766.method3580(var16);
                            Statics.field1970 = true;
                            if (var18 == null) {
                                var18 = (class176) field2765.method3580(var16);
                                Statics.field1970 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field3216 = var18;
                            Statics.field262 = new class123(var15 + var19 + Statics.field3216.field2785);
                            Statics.field262.method2412(var14);
                            Statics.field262.method2415(var15);
                            field2774 = 8;
                            field2773.field2060 = 0;
                        } else if (field2774 == 0) {
                            if (field2773.field2054[0] == -1) {
                                field2774 = 1;
                                field2773.field2060 = 0;
                            } else {
                                Statics.field3216 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field262.field2054.length - Statics.field3216.field2785;
                        int var21 = 512 - field2774;
                        if (var21 > var20 - Statics.field262.field2060) {
                            var21 = var20 - Statics.field262.field2060;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2770.method2866(Statics.field262.field2054, Statics.field262.field2060, var21);
                        if (field2767 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field262.field2054[Statics.field262.field2060 + var22] ^= field2767;
                            }
                        }
                        Statics.field262.field2060 += var21;
                        field2774 += var21;
                        if (Statics.field262.field2060 == var20) {
                            if (Statics.field3216.field3166 == 16711935L) {
                                Statics.field720 = Statics.field262;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class172 var24 = field2782[var23];
                                    if (var24 != null) {
                                        Statics.field720.field2060 = var23 * 8 + 5;
                                        int var25 = Statics.field720.method2432();
                                        int var26 = Statics.field720.method2432();
                                        var24.method3157(var25, var26);
                                    }
                                }
                            } else {
                                field2761.reset();
                                field2761.update(Statics.field262.field2054, 0, var20);
                                int var27 = (int) field2761.getValue();
                                if (Statics.field3216.field2786 != var27) {
                                    try {
                                        Statics.field2770.method2862();
                                    } catch (Exception var32) {
                                    }
                                    field2778++;
                                    Statics.field2770 = null;
                                    field2767 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2778 = 0;
                                field2779 = 0;
                                Statics.field3216.field2783.method3176((int) (Statics.field3216.field3166 & 0xFFFFL), Statics.field262.field2054, (Statics.field3216.field3166 & 0xFF0000L) == 16711680L, Statics.field1970);
                            }
                            Statics.field3216.method3703();
                            if (Statics.field1970) {
                                field2776--;
                            } else {
                                field2772--;
                            }
                            field2774 = 0;
                            Statics.field3216 = null;
                            Statics.field262 = null;
                        } else {
                            if (field2774 != 512) {
                                break;
                            }
                            field2774 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2770.method2862();
                } catch (Exception var31) {
                }
                field2779++;
                Statics.field2770 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("dt.q(ZI)V")
    public static void method2664(boolean arg0) {
        if (Statics.field2770 == null) {
            return;
        }
        try {
            class123 var1 = new class123(4);
            var1.method2412(arg0 ? 2 : 3);
            var1.method2414(0);
            Statics.field2770.method2869(var1.field2054, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2770.method2862();
            } catch (Exception var4) {
            }
            field2779++;
            Statics.field2770 = null;
        }
    }

    @ObfuscatedName("fh.f(Lec;ZB)V")
    public static void method3001(class147 arg0, boolean arg1) {
        if (Statics.field2770 != null) {
            try {
                Statics.field2770.method2862();
            } catch (Exception var10) {
            }
            Statics.field2770 = null;
        }
        Statics.field2770 = arg0;
        method2664(arg1);
        field2773.field2060 = 0;
        Statics.field3216 = null;
        Statics.field262 = null;
        field2774 = 0;
        while (true) {
            class176 var3 = (class176) field2766.method3577();
            if (var3 == null) {
                while (true) {
                    class176 var4 = (class176) field2765.method3577();
                    if (var4 == null) {
                        if (field2767 != 0) {
                            try {
                                class123 var5 = new class123(4);
                                var5.method2412(4);
                                var5.method2412(field2767);
                                var5.method2494(0);
                                Statics.field2770.method2869(var5.field2054, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2770.method2862();
                                } catch (Exception var8) {
                                }
                                field2779++;
                                Statics.field2770 = null;
                            }
                        }
                        field2762 = 0;
                        Statics.field2763 = class119.method3068();
                        return;
                    }
                    field2768.method3668(var4);
                    field2769.method3574(var4, var4.field3166);
                    field2780++;
                    field2772--;
                }
            }
            field2777.method3574(var3, var3.field3166);
            field2775++;
            field2776--;
        }
    }

    @ObfuscatedName("df.c(Lfx;IIIBZB)V")
    public static void method2222(class172 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class176 var8 = (class176) field2777.method3580(var6);
        if (var8 != null) {
            return;
        }
        class176 var9 = (class176) field2766.method3580(var6);
        if (var9 != null) {
            return;
        }
        class176 var10 = (class176) field2769.method3580(var6);
        if (var10 == null) {
            if (!arg5) {
                class176 var11 = (class176) field2765.method3580(var6);
                if (var11 != null) {
                    return;
                }
            }
            class176 var12 = new class176();
            var12.field2783 = arg0;
            var12.field2786 = arg3;
            var12.field2785 = arg4;
            if (arg5) {
                field2777.method3574(var12, var6);
                field2775++;
            } else {
                field2768.method3672(var12);
                field2769.method3574(var12, var6);
                field2780++;
            }
        } else if (arg5) {
            var10.method3684();
            field2777.method3574(var10, var6);
            field2780--;
            field2775++;
        }
    }

    @ObfuscatedName("ay.v(I)V")
    public static void method699() {
        if (Statics.field2770 != null) {
            Statics.field2770.method2862();
        }
    }
}
