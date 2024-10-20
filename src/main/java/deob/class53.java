package deob;

import java.util.Random;

@ObfuscatedName("bj")
public class class53 {

    @ObfuscatedName("bj.v")
    public class39 field426;

    @ObfuscatedName("bj.c")
    public class39 field432;

    @ObfuscatedName("bj.i")
    public class39 field417;

    @ObfuscatedName("bj.f")
    public class39 field439;

    @ObfuscatedName("bj.b")
    public class39 field419;

    @ObfuscatedName("bj.n")
    public class39 field420;

    @ObfuscatedName("bj.s")
    public class39 field421;

    @ObfuscatedName("bj.l")
    public class39 field422;

    @ObfuscatedName("bj.q")
    public int[] field436 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bj.o")
    public int[] field418 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bj.r")
    public int[] field416 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bj.p")
    public int field424 = 0;

    @ObfuscatedName("bj.w")
    public int field427 = 100;

    @ObfuscatedName("bj.k")
    public class52 field428;

    @ObfuscatedName("bj.d")
    public class39 field429;

    @ObfuscatedName("bj.m")
    public int field430 = 500;

    @ObfuscatedName("bj.u")
    public int field431 = 0;

    @ObfuscatedName("bj.t")
    public static int[] field437;

    @ObfuscatedName("bj.g")
    public static int[] field433 = new int[32768];

    @ObfuscatedName("bj.x")
    public static int[] field423;

    @ObfuscatedName("bj.y")
    public static int[] field415;

    @ObfuscatedName("bj.j")
    public static int[] field425;

    @ObfuscatedName("bj.e")
    public static int[] field438;

    @ObfuscatedName("bj.z")
    public static int[] field434;

    @ObfuscatedName("bj.h")
    public static int[] field440;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field433[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field423 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field423[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field437 = new int[220500];
        field415 = new int[5];
        field425 = new int[5];
        field438 = new int[5];
        field434 = new int[5];
        field440 = new int[5];
    }

    @ObfuscatedName("bj.v(II)[I")
    public final int[] method996(int arg0, int arg1) {
        class351.method5925(field437, 0, arg0);
        if (arg1 < 10) {
            return field437;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field426.method727();
        this.field432.method727();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field417 != null) {
            this.field417.method727();
            this.field439.method727();
            var5 = (int) ((double) (this.field417.field301 - this.field417.field298) * 32.768D / var3);
            var6 = (int) ((double) this.field417.field298 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field419 != null) {
            this.field419.method727();
            this.field420.method727();
            var8 = (int) ((double) (this.field419.field301 - this.field419.field298) * 32.768D / var3);
            var9 = (int) ((double) this.field419.field298 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field436[var11] != 0) {
                field415[var11] = 0;
                field425[var11] = (int) ((double) this.field416[var11] * var3);
                field438[var11] = (this.field436[var11] << 14) / 100;
                field434[var11] = (int) ((double) (this.field426.field301 - this.field426.field298) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field418[var11]) / var3);
                field440[var11] = (int) ((double) this.field426.field298 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field426.method725(arg0);
            int var14 = this.field432.method725(arg0);
            if (this.field417 != null) {
                int var15 = this.field417.method725(arg0);
                int var16 = this.field439.method725(arg0);
                var13 += this.method1002(var7, var16, this.field417.field308) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field419 != null) {
                int var17 = this.field419.method725(arg0);
                int var18 = this.field420.method725(arg0);
                var14 = var14 * ((this.method1002(var10, var18, this.field419.field308) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field436[var19] != 0) {
                    int var20 = field425[var19] + var12;
                    if (var20 < arg0) {
                        field437[var20] += this.method1002(field415[var19], field438[var19] * var14 >> 15, this.field426.field308);
                        field415[var19] += (field434[var19] * var13 >> 16) + field440[var19];
                    }
                }
            }
        }
        if (this.field421 != null) {
            this.field421.method727();
            this.field422.method727();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field421.method725(arg0);
                int var26 = this.field422.method725(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field421.field301 - this.field421.field298) * var25 >> 8) + this.field421.field298;
                } else {
                    var27 = ((this.field421.field301 - this.field421.field298) * var26 >> 8) + this.field421.field298;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field437[var24] = 0;
                }
            }
        }
        if (this.field424 > 0 && this.field427 > 0) {
            int var28 = (int) ((double) this.field424 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field437[var29] += field437[var29 - var28] * this.field427 / 100;
            }
        }
        if (this.field428.field412[0] > 0 || this.field428.field412[1] > 0) {
            this.field429.method727();
            int var30 = this.field429.method725(arg0 + 1);
            int var31 = this.field428.method980(0, (float) var30 / 65536.0F);
            int var32 = this.field428.method980(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field437[var31 + var33] * (long) Statics.field411 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field437[var31 + var33 - 1 - var36] * (long) class52.field409[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field437[var33 - 1 - var37] * (long) class52.field409[1][var37] >> 16);
                    }
                    field437[var33] = var35;
                    var30 = this.field429.method725(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field437[var31 + var33] * (long) Statics.field411 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field437[var31 + var33 - 1 - var40] * (long) class52.field409[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field437[var33 - 1 - var41] * (long) class52.field409[1][var41] >> 16);
                        }
                        field437[var33] = var39;
                        var30 = this.field429.method725(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field437[var31 + var33 - 1 - var43] * (long) class52.field409[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field437[var33 - 1 - var44] * (long) class52.field409[1][var44] >> 16);
                            }
                            field437[var33] = var42;
                            this.field429.method725(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field428.method980(0, (float) var30 / 65536.0F);
                    var32 = this.field428.method980(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field437[var46] < -32768) {
                field437[var46] = -32768;
            }
            if (field437[var46] > 32767) {
                field437[var46] = 32767;
            }
        }
        return field437;
    }

    @ObfuscatedName("bj.c(III)I")
    public final int method1002(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field423[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field433[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bj.i(Lpi;)V")
    public final void method997(class438 arg0) {
        this.field426 = new class39();
        this.field426.method722(arg0);
        this.field432 = new class39();
        this.field432.method722(arg0);
        int var2 = arg0.method6971();
        if (var2 != 0) {
            arg0.field4621--;
            this.field417 = new class39();
            this.field417.method722(arg0);
            this.field439 = new class39();
            this.field439.method722(arg0);
        }
        int var3 = arg0.method6971();
        if (var3 != 0) {
            arg0.field4621--;
            this.field419 = new class39();
            this.field419.method722(arg0);
            this.field420 = new class39();
            this.field420.method722(arg0);
        }
        int var4 = arg0.method6971();
        if (var4 != 0) {
            arg0.field4621--;
            this.field421 = new class39();
            this.field421.method722(arg0);
            this.field422 = new class39();
            this.field422.method722(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method6986();
            if (var6 == 0) {
                break;
            }
            this.field436[var5] = var6;
            this.field418[var5] = arg0.method7024();
            this.field416[var5] = arg0.method6986();
        }
        this.field424 = arg0.method6986();
        this.field427 = arg0.method6986();
        this.field430 = arg0.method7148();
        this.field431 = arg0.method7148();
        this.field428 = new class52();
        this.field429 = new class39();
        this.field428.method981(arg0, this.field429);
    }
}
