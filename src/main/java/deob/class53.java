package deob;

import java.util.Random;

@ObfuscatedName("bg")
public class class53 {

    @ObfuscatedName("bg.i")
    public class39 field407;

    @ObfuscatedName("bg.w")
    public class39 field390;

    @ObfuscatedName("bg.s")
    public class39 field394;

    @ObfuscatedName("bg.a")
    public class39 field392;

    @ObfuscatedName("bg.o")
    public class39 field389;

    @ObfuscatedName("bg.g")
    public class39 field391;

    @ObfuscatedName("bg.e")
    public class39 field393;

    @ObfuscatedName("bg.p")
    public class39 field396;

    @ObfuscatedName("bg.j")
    public int[] field397 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bg.b")
    public int[] field398 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bg.x")
    public int[] field399 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bg.y")
    public int field400 = 0;

    @ObfuscatedName("bg.k")
    public int field401 = 100;

    @ObfuscatedName("bg.t")
    public class52 field402;

    @ObfuscatedName("bg.l")
    public class39 field403;

    @ObfuscatedName("bg.u")
    public int field412 = 500;

    @ObfuscatedName("bg.n")
    public int field414 = 0;

    @ObfuscatedName("bg.z")
    public static int[] field406;

    @ObfuscatedName("bg.q")
    public static int[] field395 = new int[32768];

    @ObfuscatedName("bg.d")
    public static int[] field405;

    @ObfuscatedName("bg.m")
    public static int[] field410;

    @ObfuscatedName("bg.c")
    public static int[] field411;

    @ObfuscatedName("bg.f")
    public static int[] field404;

    @ObfuscatedName("bg.h")
    public static int[] field413;

    @ObfuscatedName("bg.v")
    public static int[] field408;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field395[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field405 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field405[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field406 = new int[220500];
        field410 = new int[5];
        field411 = new int[5];
        field404 = new int[5];
        field413 = new int[5];
        field408 = new int[5];
    }

    @ObfuscatedName("bg.i(II)[I")
    public final int[] method1012(int arg0, int arg1) {
        class322.method5339(field406, 0, arg0);
        if (arg1 < 10) {
            return field406;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field407.method738();
        this.field390.method738();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field394 != null) {
            this.field394.method738();
            this.field392.method738();
            var5 = (int) ((double) (this.field394.field283 - this.field394.field275) * 32.768D / var3);
            var6 = (int) ((double) this.field394.field275 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field389 != null) {
            this.field389.method738();
            this.field391.method738();
            var8 = (int) ((double) (this.field389.field283 - this.field389.field275) * 32.768D / var3);
            var9 = (int) ((double) this.field389.field275 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field397[var11] != 0) {
                field410[var11] = 0;
                field411[var11] = (int) ((double) this.field399[var11] * var3);
                field404[var11] = (this.field397[var11] << 14) / 100;
                field413[var11] = (int) ((double) (this.field407.field283 - this.field407.field275) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field398[var11]) / var3);
                field408[var11] = (int) ((double) this.field407.field275 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field407.method752(arg0);
            int var14 = this.field390.method752(arg0);
            if (this.field394 != null) {
                int var15 = this.field394.method752(arg0);
                int var16 = this.field392.method752(arg0);
                var13 += this.method1010(var7, var16, this.field394.field280) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field389 != null) {
                int var17 = this.field389.method752(arg0);
                int var18 = this.field391.method752(arg0);
                var14 = var14 * ((this.method1010(var10, var18, this.field389.field280) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field397[var19] != 0) {
                    int var20 = field411[var19] + var12;
                    if (var20 < arg0) {
                        field406[var20] += this.method1010(field410[var19], field404[var19] * var14 >> 15, this.field407.field280);
                        field410[var19] += (field413[var19] * var13 >> 16) + field408[var19];
                    }
                }
            }
        }
        if (this.field393 != null) {
            this.field393.method738();
            this.field396.method738();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field393.method752(arg0);
                int var26 = this.field396.method752(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field393.field283 - this.field393.field275) * var25 >> 8) + this.field393.field275;
                } else {
                    var27 = ((this.field393.field283 - this.field393.field275) * var26 >> 8) + this.field393.field275;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field406[var24] = 0;
                }
            }
        }
        if (this.field400 > 0 && this.field401 > 0) {
            int var28 = (int) ((double) this.field400 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field406[var29] += field406[var29 - var28] * this.field401 / 100;
            }
        }
        if (this.field402.field379[0] > 0 || this.field402.field379[1] > 0) {
            this.field403.method738();
            int var30 = this.field403.method752(arg0 + 1);
            int var31 = this.field402.method995(0, (float) var30 / 65536.0F);
            int var32 = this.field402.method995(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field406[var31 + var33] * (long) Statics.field381 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field406[var31 + var33 - 1 - var36] * (long) class52.field383[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field406[var33 - 1 - var37] * (long) class52.field383[1][var37] >> 16);
                    }
                    field406[var33] = var35;
                    var30 = this.field403.method752(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field406[var31 + var33] * (long) Statics.field381 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field406[var31 + var33 - 1 - var40] * (long) class52.field383[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field406[var33 - 1 - var41] * (long) class52.field383[1][var41] >> 16);
                        }
                        field406[var33] = var39;
                        var30 = this.field403.method752(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field406[var31 + var33 - 1 - var43] * (long) class52.field383[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field406[var33 - 1 - var44] * (long) class52.field383[1][var44] >> 16);
                            }
                            field406[var33] = var42;
                            this.field403.method752(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field402.method995(0, (float) var30 / 65536.0F);
                    var32 = this.field402.method995(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field406[var46] < -32768) {
                field406[var46] = -32768;
            }
            if (field406[var46] > 32767) {
                field406[var46] = 32767;
            }
        }
        return field406;
    }

    @ObfuscatedName("bg.w(III)I")
    public final int method1010(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field405[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field395[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bg.s(Lop;)V")
    public final void method1011(class401 arg0) {
        this.field407 = new class39();
        this.field407.method747(arg0);
        this.field390 = new class39();
        this.field390.method747(arg0);
        int var2 = arg0.method6240();
        if (var2 != 0) {
            arg0.field4300--;
            this.field394 = new class39();
            this.field394.method747(arg0);
            this.field392 = new class39();
            this.field392.method747(arg0);
        }
        int var3 = arg0.method6240();
        if (var3 != 0) {
            arg0.field4300--;
            this.field389 = new class39();
            this.field389.method747(arg0);
            this.field391 = new class39();
            this.field391.method747(arg0);
        }
        int var4 = arg0.method6240();
        if (var4 != 0) {
            arg0.field4300--;
            this.field393 = new class39();
            this.field393.method747(arg0);
            this.field396 = new class39();
            this.field396.method747(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method6254();
            if (var6 == 0) {
                break;
            }
            this.field397[var5] = var6;
            this.field398[var5] = arg0.method6253();
            this.field399[var5] = arg0.method6254();
        }
        this.field400 = arg0.method6254();
        this.field401 = arg0.method6254();
        this.field412 = arg0.method6242();
        this.field414 = arg0.method6242();
        this.field402 = new class52();
        this.field403 = new class39();
        this.field402.method1007(arg0, this.field403);
    }
}
