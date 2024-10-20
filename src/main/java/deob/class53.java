package deob;

import java.util.Random;

@ObfuscatedName("bz")
public class class53 {

    @ObfuscatedName("bz.l")
    public class39 field412;

    @ObfuscatedName("bz.q")
    public class39 field406;

    @ObfuscatedName("bz.f")
    public class39 field413;

    @ObfuscatedName("bz.j")
    public class39 field421;

    @ObfuscatedName("bz.m")
    public class39 field417;

    @ObfuscatedName("bz.k")
    public class39 field410;

    @ObfuscatedName("bz.t")
    public class39 field407;

    @ObfuscatedName("bz.a")
    public class39 field411;

    @ObfuscatedName("bz.e")
    public int[] field416 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bz.i")
    public int[] field414 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bz.y")
    public int[] field409 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bz.w")
    public int field408 = 0;

    @ObfuscatedName("bz.g")
    public int field405 = 100;

    @ObfuscatedName("bz.v")
    public class52 field418;

    @ObfuscatedName("bz.s")
    public class39 field419;

    @ObfuscatedName("bz.c")
    public int field420 = 500;

    @ObfuscatedName("bz.b")
    public int field415 = 0;

    @ObfuscatedName("bz.x")
    public static int[] field422;

    @ObfuscatedName("bz.p")
    public static int[] field423 = new int[32768];

    @ObfuscatedName("bz.z")
    public static int[] field424;

    @ObfuscatedName("bz.o")
    public static int[] field426;

    @ObfuscatedName("bz.r")
    public static int[] field427;

    @ObfuscatedName("bz.n")
    public static int[] field428;

    @ObfuscatedName("bz.u")
    public static int[] field429;

    @ObfuscatedName("bz.d")
    public static int[] field430;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field423[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field424 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field424[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field422 = new int[220500];
        field426 = new int[5];
        field427 = new int[5];
        field428 = new int[5];
        field429 = new int[5];
        field430 = new int[5];
    }

    @ObfuscatedName("bz.l(II)[I")
    public final int[] method984(int arg0, int arg1) {
        class322.method5370(field422, 0, arg0);
        if (arg1 < 10) {
            return field422;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field412.method721();
        this.field406.method721();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field413 != null) {
            this.field413.method721();
            this.field421.method721();
            var5 = (int) ((double) (this.field413.field296 - this.field413.field294) * 32.768D / var3);
            var6 = (int) ((double) this.field413.field294 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field417 != null) {
            this.field417.method721();
            this.field410.method721();
            var8 = (int) ((double) (this.field417.field296 - this.field417.field294) * 32.768D / var3);
            var9 = (int) ((double) this.field417.field294 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field416[var11] != 0) {
                field426[var11] = 0;
                field427[var11] = (int) ((double) this.field409[var11] * var3);
                field428[var11] = (this.field416[var11] << 14) / 100;
                field429[var11] = (int) ((double) (this.field412.field296 - this.field412.field294) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field414[var11]) / var3);
                field430[var11] = (int) ((double) this.field412.field294 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field412.method722(arg0);
            int var14 = this.field406.method722(arg0);
            if (this.field413 != null) {
                int var15 = this.field413.method722(arg0);
                int var16 = this.field421.method722(arg0);
                var13 += this.method983(var7, var16, this.field413.field293) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field417 != null) {
                int var17 = this.field417.method722(arg0);
                int var18 = this.field410.method722(arg0);
                var14 = var14 * ((this.method983(var10, var18, this.field417.field293) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field416[var19] != 0) {
                    int var20 = field427[var19] + var12;
                    if (var20 < arg0) {
                        field422[var20] += this.method983(field426[var19], field428[var19] * var14 >> 15, this.field412.field293);
                        field426[var19] += (field429[var19] * var13 >> 16) + field430[var19];
                    }
                }
            }
        }
        if (this.field407 != null) {
            this.field407.method721();
            this.field411.method721();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field407.method722(arg0);
                int var26 = this.field411.method722(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field407.field296 - this.field407.field294) * var25 >> 8) + this.field407.field294;
                } else {
                    var27 = ((this.field407.field296 - this.field407.field294) * var26 >> 8) + this.field407.field294;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field422[var24] = 0;
                }
            }
        }
        if (this.field408 > 0 && this.field405 > 0) {
            int var28 = (int) ((double) this.field408 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field422[var29] += field422[var29 - var28] * this.field405 / 100;
            }
        }
        if (this.field418.field401[0] > 0 || this.field418.field401[1] > 0) {
            this.field419.method721();
            int var30 = this.field419.method722(arg0 + 1);
            int var31 = this.field418.method980(0, (float) var30 / 65536.0F);
            int var32 = this.field418.method980(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field422[var31 + var33] * (long) Statics.field399 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field422[var31 + var33 - 1 - var36] * (long) class52.field397[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field422[var33 - 1 - var37] * (long) class52.field397[1][var37] >> 16);
                    }
                    field422[var33] = var35;
                    var30 = this.field419.method722(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field422[var31 + var33] * (long) Statics.field399 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field422[var31 + var33 - 1 - var40] * (long) class52.field397[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field422[var33 - 1 - var41] * (long) class52.field397[1][var41] >> 16);
                        }
                        field422[var33] = var39;
                        var30 = this.field419.method722(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field422[var31 + var33 - 1 - var43] * (long) class52.field397[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field422[var33 - 1 - var44] * (long) class52.field397[1][var44] >> 16);
                            }
                            field422[var33] = var42;
                            this.field419.method722(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field418.method980(0, (float) var30 / 65536.0F);
                    var32 = this.field418.method980(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field422[var46] < -32768) {
                field422[var46] = -32768;
            }
            if (field422[var46] > 32767) {
                field422[var46] = 32767;
            }
        }
        return field422;
    }

    @ObfuscatedName("bz.q(III)I")
    public final int method983(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field424[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field423[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bz.f(Lot;)V")
    public final void method985(class401 arg0) {
        this.field412 = new class39();
        this.field412.method727(arg0);
        this.field406 = new class39();
        this.field406.method727(arg0);
        int var2 = arg0.method6272();
        if (var2 != 0) {
            arg0.field4292--;
            this.field413 = new class39();
            this.field413.method727(arg0);
            this.field421 = new class39();
            this.field421.method727(arg0);
        }
        int var3 = arg0.method6272();
        if (var3 != 0) {
            arg0.field4292--;
            this.field417 = new class39();
            this.field417.method727(arg0);
            this.field410 = new class39();
            this.field410.method727(arg0);
        }
        int var4 = arg0.method6272();
        if (var4 != 0) {
            arg0.field4292--;
            this.field407 = new class39();
            this.field407.method727(arg0);
            this.field411 = new class39();
            this.field411.method727(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method6286();
            if (var6 == 0) {
                break;
            }
            this.field416[var5] = var6;
            this.field414[var5] = arg0.method6285();
            this.field409[var5] = arg0.method6286();
        }
        this.field408 = arg0.method6286();
        this.field405 = arg0.method6286();
        this.field420 = arg0.method6284();
        this.field415 = arg0.method6284();
        this.field418 = new class52();
        this.field419 = new class39();
        this.field418.method968(arg0, this.field419);
    }
}
