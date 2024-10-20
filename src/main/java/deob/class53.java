package deob;

import java.util.Random;

@ObfuscatedName("bd")
public class class53 {

    @ObfuscatedName("bd.n")
    public class39 field414;

    @ObfuscatedName("bd.c")
    public class39 field408;

    @ObfuscatedName("bd.m")
    public class39 field409;

    @ObfuscatedName("bd.k")
    public class39 field432;

    @ObfuscatedName("bd.o")
    public class39 field417;

    @ObfuscatedName("bd.g")
    public class39 field412;

    @ObfuscatedName("bd.z")
    public class39 field410;

    @ObfuscatedName("bd.a")
    public class39 field420;

    @ObfuscatedName("bd.u")
    public int[] field415 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bd.e")
    public int[] field416 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bd.l")
    public int[] field407 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bd.y")
    public int field421 = 0;

    @ObfuscatedName("bd.v")
    public int field419 = 100;

    @ObfuscatedName("bd.f")
    public class52 field413;

    @ObfuscatedName("bd.s")
    public class39 field429;

    @ObfuscatedName("bd.h")
    public int field422 = 500;

    @ObfuscatedName("bd.d")
    public int field423 = 0;

    @ObfuscatedName("bd.q")
    public static int[] field424;

    @ObfuscatedName("bd.j")
    public static int[] field425 = new int[32768];

    @ObfuscatedName("bd.x")
    public static int[] field426;

    @ObfuscatedName("bd.t")
    public static int[] field428;

    @ObfuscatedName("bd.r")
    public static int[] field411;

    @ObfuscatedName("bd.p")
    public static int[] field430;

    @ObfuscatedName("bd.w")
    public static int[] field431;

    @ObfuscatedName("bd.i")
    public static int[] field418;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field425[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field426 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field426[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field424 = new int[220500];
        field428 = new int[5];
        field411 = new int[5];
        field430 = new int[5];
        field431 = new int[5];
        field418 = new int[5];
    }

    @ObfuscatedName("bd.n(II)[I")
    public final int[] method993(int arg0, int arg1) {
        class322.method5305(field424, 0, arg0);
        if (arg1 < 10) {
            return field424;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field414.method739();
        this.field408.method739();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field409 != null) {
            this.field409.method739();
            this.field432.method739();
            var5 = (int) ((double) (this.field409.field297 - this.field409.field293) * 32.768D / var3);
            var6 = (int) ((double) this.field409.field293 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field417 != null) {
            this.field417.method739();
            this.field412.method739();
            var8 = (int) ((double) (this.field417.field297 - this.field417.field293) * 32.768D / var3);
            var9 = (int) ((double) this.field417.field293 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field415[var11] != 0) {
                field428[var11] = 0;
                field411[var11] = (int) ((double) this.field407[var11] * var3);
                field430[var11] = (this.field415[var11] << 14) / 100;
                field431[var11] = (int) ((double) (this.field414.field297 - this.field414.field293) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field416[var11]) / var3);
                field418[var11] = (int) ((double) this.field414.field293 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field414.method743(arg0);
            int var14 = this.field408.method743(arg0);
            if (this.field409 != null) {
                int var15 = this.field409.method743(arg0);
                int var16 = this.field432.method743(arg0);
                var13 += this.method995(var7, var16, this.field409.field294) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field417 != null) {
                int var17 = this.field417.method743(arg0);
                int var18 = this.field412.method743(arg0);
                var14 = var14 * ((this.method995(var10, var18, this.field417.field294) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field415[var19] != 0) {
                    int var20 = field411[var19] + var12;
                    if (var20 < arg0) {
                        field424[var20] += this.method995(field428[var19], field430[var19] * var14 >> 15, this.field414.field294);
                        field428[var19] += (field431[var19] * var13 >> 16) + field418[var19];
                    }
                }
            }
        }
        if (this.field410 != null) {
            this.field410.method739();
            this.field420.method739();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field410.method743(arg0);
                int var26 = this.field420.method743(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field410.field297 - this.field410.field293) * var25 >> 8) + this.field410.field293;
                } else {
                    var27 = ((this.field410.field297 - this.field410.field293) * var26 >> 8) + this.field410.field293;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field424[var24] = 0;
                }
            }
        }
        if (this.field421 > 0 && this.field419 > 0) {
            int var28 = (int) ((double) this.field421 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field424[var29] += field424[var29 - var28] * this.field419 / 100;
            }
        }
        if (this.field413.field406[0] > 0 || this.field413.field406[1] > 0) {
            this.field429.method739();
            int var30 = this.field429.method743(arg0 + 1);
            int var31 = this.field413.method987(0, (float) var30 / 65536.0F);
            int var32 = this.field413.method987(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field424[var31 + var33] * (long) Statics.field395 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field424[var31 + var33 - 1 - var36] * (long) class52.field401[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field424[var33 - 1 - var37] * (long) class52.field401[1][var37] >> 16);
                    }
                    field424[var33] = var35;
                    var30 = this.field429.method743(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field424[var31 + var33] * (long) Statics.field395 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field424[var31 + var33 - 1 - var40] * (long) class52.field401[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field424[var33 - 1 - var41] * (long) class52.field401[1][var41] >> 16);
                        }
                        field424[var33] = var39;
                        var30 = this.field429.method743(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field424[var31 + var33 - 1 - var43] * (long) class52.field401[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field424[var33 - 1 - var44] * (long) class52.field401[1][var44] >> 16);
                            }
                            field424[var33] = var42;
                            this.field429.method743(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field413.method987(0, (float) var30 / 65536.0F);
                    var32 = this.field413.method987(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field424[var46] < -32768) {
                field424[var46] = -32768;
            }
            if (field424[var46] > 32767) {
                field424[var46] = 32767;
            }
        }
        return field424;
    }

    @ObfuscatedName("bd.c(III)I")
    public final int method995(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field426[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field425[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bd.m(Lot;)V")
    public final void method996(class400 arg0) {
        this.field414 = new class39();
        this.field414.method740(arg0);
        this.field408 = new class39();
        this.field408.method740(arg0);
        int var2 = arg0.method6217();
        if (var2 != 0) {
            arg0.field4272--;
            this.field409 = new class39();
            this.field409.method740(arg0);
            this.field432 = new class39();
            this.field432.method740(arg0);
        }
        int var3 = arg0.method6217();
        if (var3 != 0) {
            arg0.field4272--;
            this.field417 = new class39();
            this.field417.method740(arg0);
            this.field412 = new class39();
            this.field412.method740(arg0);
        }
        int var4 = arg0.method6217();
        if (var4 != 0) {
            arg0.field4272--;
            this.field410 = new class39();
            this.field410.method740(arg0);
            this.field420 = new class39();
            this.field420.method740(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method6231();
            if (var6 == 0) {
                break;
            }
            this.field415[var5] = var6;
            this.field416[var5] = arg0.method6230();
            this.field407[var5] = arg0.method6231();
        }
        this.field421 = arg0.method6231();
        this.field419 = arg0.method6231();
        this.field422 = arg0.method6219();
        this.field423 = arg0.method6219();
        this.field413 = new class52();
        this.field429 = new class39();
        this.field413.method984(arg0, this.field429);
    }
}
