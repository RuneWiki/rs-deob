package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ii")
public class class237 {

    @ObfuscatedName("ii.w")
    public static int field3164 = 0;

    @ObfuscatedName("ii.p")
    public static class319 field3166 = new class319(4096);

    @ObfuscatedName("ii.k")
    public static int field3167 = 0;

    @ObfuscatedName("ii.l")
    public static class319 field3168 = new class319(32);

    @ObfuscatedName("ii.b")
    public static int field3169 = 0;

    @ObfuscatedName("ii.i")
    public static class260 field3171 = new class260();

    @ObfuscatedName("ii.c")
    public static class319 field3181 = new class319(4096);

    @ObfuscatedName("ii.f")
    public static int field3172 = 0;

    @ObfuscatedName("ii.m")
    public static class319 field3173 = new class319(4096);

    @ObfuscatedName("ii.u")
    public static int field3165 = 0;

    @ObfuscatedName("ii.v")
    public static class301 field3175 = new class301(8);

    @ObfuscatedName("ii.g")
    public static int field3176 = 0;

    @ObfuscatedName("ii.j")
    public static CRC32 field3178 = new CRC32();

    @ObfuscatedName("ii.h")
    public static class236[] field3174 = new class236[256];

    @ObfuscatedName("ii.o")
    public static byte field3182 = 0;

    @ObfuscatedName("ii.n")
    public static int field3180 = 0;

    @ObfuscatedName("ii.d")
    public static int field3179 = 0;

    public class237() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("al.q(I)Z")
    public static boolean method309() {
        long var0 = class298.method3576();
        int var2 = (int) (var0 - Statics.field3170);
        Statics.field3170 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field3164 += var2;
        if (field3165 == 0 && field3169 == 0 && field3172 == 0 && field3167 == 0) {
            return true;
        } else if (Statics.field3177 == null) {
            return false;
        } else {
            try {
                if (field3164 > 30000) {
                    throw new IOException();
                }
                while (field3169 < 200 && field3167 > 0) {
                    class233 var3 = (class233) field3166.method5477();
                    class301 var4 = new class301(4);
                    var4.method5228(1);
                    var4.method5053((int) var3.field2114);
                    Statics.field3177.method3210(var4.field3731, 0, 4);
                    field3168.method5478(var3, var3.field2114);
                    field3167--;
                    field3169++;
                }
                while (field3165 < 200 && field3172 > 0) {
                    class233 var5 = (class233) field3171.method4407();
                    class301 var6 = new class301(4);
                    var6.method5228(0);
                    var6.method5053((int) var5.field2114);
                    Statics.field3177.method3210(var6.field3731, 0, 4);
                    var5.method3276();
                    field3173.method5478(var5, var5.field2114);
                    field3172--;
                    field3165++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field3177.method3206();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field3164 = 0;
                    byte var9 = 0;
                    if (Statics.field3072 == null) {
                        var9 = 8;
                    } else if (field3176 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field3175.field3733;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field3177.method3208(field3175.field3731, field3175.field3733, var10);
                        if (field3182 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field3175.field3731[field3175.field3733 + var11] ^= field3182;
                            }
                        }
                        field3175.field3733 += var10;
                        if (field3175.field3733 < var9) {
                            break;
                        }
                        if (Statics.field3072 == null) {
                            field3175.field3733 = 0;
                            int var12 = field3175.method5077();
                            int var13 = field3175.method5069();
                            int var14 = field3175.method5077();
                            int var15 = field3175.method5072();
                            long var16 = (long) ((var12 << 16) + var13);
                            class233 var18 = (class233) field3168.method5479(var16);
                            Statics.field2546 = true;
                            if (var18 == null) {
                                var18 = (class233) field3173.method5479(var16);
                                Statics.field2546 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field3072 = var18;
                            Statics.field3210 = new class301(var15 + var19 + Statics.field3072.field3123);
                            Statics.field3210.method5228(var14);
                            Statics.field3210.method5054(var15);
                            field3176 = 8;
                            field3175.field3733 = 0;
                        } else if (field3176 == 0) {
                            if (field3175.field3731[0] == -1) {
                                field3176 = 1;
                                field3175.field3733 = 0;
                            } else {
                                Statics.field3072 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field3210.field3731.length - Statics.field3072.field3123;
                        int var21 = 512 - field3176;
                        if (var21 > var20 - Statics.field3210.field3733) {
                            var21 = var20 - Statics.field3210.field3733;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field3177.method3208(Statics.field3210.field3731, Statics.field3210.field3733, var21);
                        if (field3182 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field3210.field3731[Statics.field3210.field3733 + var22] ^= field3182;
                            }
                        }
                        Statics.field3210.field3733 += var21;
                        field3176 += var21;
                        if (Statics.field3210.field3733 == var20) {
                            if (Statics.field3072.field2114 == 16711935L) {
                                Statics.field3883 = Statics.field3210;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class236 var24 = field3174[var23];
                                    if (var24 != null) {
                                        Statics.field3883.field3733 = var23 * 8 + 5;
                                        int var25 = Statics.field3883.method5072();
                                        int var26 = Statics.field3883.method5072();
                                        var24.method3891(var25, var26);
                                    }
                                }
                            } else {
                                field3178.reset();
                                field3178.update(Statics.field3210.field3731, 0, var20);
                                int var27 = (int) field3178.getValue();
                                if (Statics.field3072.field3122 != var27) {
                                    try {
                                        Statics.field3177.method3204();
                                    } catch (Exception var32) {
                                    }
                                    field3180++;
                                    Statics.field3177 = null;
                                    field3182 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field3180 = 0;
                                field3179 = 0;
                                Statics.field3072.field3125.method3892((int) (Statics.field3072.field2114 & 0xFFFFL), Statics.field3210.field3731, (Statics.field3072.field2114 & 0xFF0000L) == 16711680L, Statics.field2546);
                            }
                            Statics.field3072.method3286();
                            if (Statics.field2546) {
                                field3169--;
                            } else {
                                field3165--;
                            }
                            field3176 = 0;
                            Statics.field3072 = null;
                            Statics.field3210 = null;
                        } else {
                            if (field3176 != 512) {
                                break;
                            }
                            field3176 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field3177.method3204();
                } catch (Exception var31) {
                }
                field3179++;
                Statics.field3177 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("cu.w(Lky;ZS)V")
    public static void method2002(class306 arg0, boolean arg1) {
        if (Statics.field3177 != null) {
            try {
                Statics.field3177.method3204();
            } catch (Exception var15) {
            }
            Statics.field3177 = null;
        }
        Statics.field3177 = arg0;
        if (Statics.field3177 != null) {
            try {
                class301 var3 = new class301(4);
                var3.method5228(arg1 ? 2 : 3);
                var3.method5053(0);
                Statics.field3177.method3210(var3.field3731, 0, 4);
            } catch (IOException var14) {
                try {
                    Statics.field3177.method3204();
                } catch (Exception var13) {
                }
                field3179++;
                Statics.field3177 = null;
            }
        }
        field3175.field3733 = 0;
        Statics.field3072 = null;
        Statics.field3210 = null;
        field3176 = 0;
        while (true) {
            class233 var6 = (class233) field3168.method5477();
            if (var6 == null) {
                while (true) {
                    class233 var7 = (class233) field3173.method5477();
                    if (var7 == null) {
                        if (field3182 != 0) {
                            try {
                                class301 var8 = new class301(4);
                                var8.method5228(4);
                                var8.method5228(field3182);
                                var8.method5052(0);
                                Statics.field3177.method3210(var8.field3731, 0, 4);
                            } catch (IOException var12) {
                                try {
                                    Statics.field3177.method3204();
                                } catch (Exception var11) {
                                }
                                field3179++;
                                Statics.field3177 = null;
                            }
                        }
                        field3164 = 0;
                        Statics.field3170 = class298.method3576();
                        return;
                    }
                    field3171.method4408(var7);
                    field3181.method5478(var7, var7.field2114);
                    field3172++;
                    field3165--;
                }
            }
            field3166.method5478(var6, var6.field2114);
            field3167++;
            field3169--;
        }
    }

    @ObfuscatedName("di.e(Liu;IIIBZI)V")
    public static void method2704(class236 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class233 var8 = (class233) field3166.method5479(var6);
        if (var8 != null) {
            return;
        }
        class233 var9 = (class233) field3168.method5479(var6);
        if (var9 != null) {
            return;
        }
        class233 var10 = (class233) field3181.method5479(var6);
        if (var10 == null) {
            if (!arg5) {
                class233 var11 = (class233) field3173.method5479(var6);
                if (var11 != null) {
                    return;
                }
            }
            class233 var12 = new class233();
            var12.field3125 = arg0;
            var12.field3122 = arg3;
            var12.field3123 = arg4;
            if (arg5) {
                field3166.method5478(var12, var6);
                field3167++;
            } else {
                field3171.method4405(var12);
                field3181.method5478(var12, var6);
                field3172++;
            }
        } else if (arg5) {
            var10.method3276();
            field3166.method5478(var10, var6);
            field3172--;
            field3167++;
        }
    }

    @ObfuscatedName("bt.p(III)V")
    public static void method1492(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class233 var4 = (class233) field3181.method5479(var2);
        if (var4 != null) {
            field3171.method4408(var4);
        }
    }

    @ObfuscatedName("hk.k(IIB)I")
    public static int method3585(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field3072 != null && Statics.field3072.field2114 == var2 ? Statics.field3210.field3733 * 99 / (Statics.field3210.field3731.length - Statics.field3072.field3123) + 1 : 0;
    }
}
