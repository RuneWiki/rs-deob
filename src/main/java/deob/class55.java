package deob;

import java.util.Random;

@ObfuscatedName("ba")
public class class55 {

    @ObfuscatedName("ba.c")
    public class41 field421;

    @ObfuscatedName("ba.b")
    public class41 field423;

    @ObfuscatedName("ba.p")
    public class41 field417;

    @ObfuscatedName("ba.m")
    public class41 field418;

    @ObfuscatedName("ba.t")
    public class41 field436;

    @ObfuscatedName("ba.s")
    public class41 field420;

    @ObfuscatedName("ba.j")
    public class41 field433;

    @ObfuscatedName("ba.w")
    public class41 field422;

    @ObfuscatedName("ba.n")
    public int[] field440 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("ba.r")
    public int[] field424 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("ba.o")
    public int[] field435 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("ba.v")
    public int field426 = 0;

    @ObfuscatedName("ba.d")
    public int field427 = 100;

    @ObfuscatedName("ba.h")
    public class54 field428;

    @ObfuscatedName("ba.g")
    public class41 field429;

    @ObfuscatedName("ba.e")
    public int field430 = 500;

    @ObfuscatedName("ba.a")
    public int field431 = 0;

    @ObfuscatedName("ba.u")
    public static int[] field432;

    @ObfuscatedName("ba.k")
    public static int[] field425 = new int[32768];

    @ObfuscatedName("ba.f")
    public static int[] field434;

    @ObfuscatedName("ba.q")
    public static int[] field416;

    @ObfuscatedName("ba.x")
    public static int[] field437;

    @ObfuscatedName("ba.z")
    public static int[] field438;

    @ObfuscatedName("ba.i")
    public static int[] field419;

    @ObfuscatedName("ba.y")
    public static int[] field415;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field425[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field434 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field434[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field432 = new int[220500];
        field416 = new int[5];
        field437 = new int[5];
        field438 = new int[5];
        field419 = new int[5];
        field415 = new int[5];
    }

    @ObfuscatedName("ba.c(II)[I")
    public final int[] method1036(int arg0, int arg1) {
        class334.method5625(field432, 0, arg0);
        if (arg1 < 10) {
            return field432;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field421.method776();
        this.field423.method776();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field417 != null) {
            this.field417.method776();
            this.field418.method776();
            var5 = (int) ((double) (this.field417.field305 - this.field417.field304) * 32.768D / var3);
            var6 = (int) ((double) this.field417.field304 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field436 != null) {
            this.field436.method776();
            this.field420.method776();
            var8 = (int) ((double) (this.field436.field305 - this.field436.field304) * 32.768D / var3);
            var9 = (int) ((double) this.field436.field304 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field440[var11] != 0) {
                field416[var11] = 0;
                field437[var11] = (int) ((double) this.field435[var11] * var3);
                field438[var11] = (this.field440[var11] << 14) / 100;
                field419[var11] = (int) ((double) (this.field421.field305 - this.field421.field304) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field424[var11]) / var3);
                field415[var11] = (int) ((double) this.field421.field304 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field421.method779(arg0);
            int var14 = this.field423.method779(arg0);
            if (this.field417 != null) {
                int var15 = this.field417.method779(arg0);
                int var16 = this.field418.method779(arg0);
                var13 += this.method1037(var7, var16, this.field417.field306) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field436 != null) {
                int var17 = this.field436.method779(arg0);
                int var18 = this.field420.method779(arg0);
                var14 = var14 * ((this.method1037(var10, var18, this.field436.field306) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field440[var19] != 0) {
                    int var20 = field437[var19] + var12;
                    if (var20 < arg0) {
                        field432[var20] += this.method1037(field416[var19], field438[var19] * var14 >> 15, this.field421.field306);
                        field416[var19] += (field419[var19] * var13 >> 16) + field415[var19];
                    }
                }
            }
        }
        if (this.field433 != null) {
            this.field433.method776();
            this.field422.method776();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field433.method779(arg0);
                int var26 = this.field422.method779(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field433.field305 - this.field433.field304) * var25 >> 8) + this.field433.field304;
                } else {
                    var27 = ((this.field433.field305 - this.field433.field304) * var26 >> 8) + this.field433.field304;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field432[var24] = 0;
                }
            }
        }
        if (this.field426 > 0 && this.field427 > 0) {
            int var28 = (int) ((double) this.field426 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field432[var29] += field432[var29 - var28] * this.field427 / 100;
            }
        }
        if (this.field428.field403[0] > 0 || this.field428.field403[1] > 0) {
            this.field429.method776();
            int var30 = this.field429.method779(arg0 + 1);
            int var31 = this.field428.method1023(0, (float) var30 / 65536.0F);
            int var32 = this.field428.method1023(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field432[var31 + var33] * (long) Statics.field411 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field432[var31 + var33 - 1 - var36] * (long) class54.field409[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field432[var33 - 1 - var37] * (long) class54.field409[1][var37] >> 16);
                    }
                    field432[var33] = var35;
                    var30 = this.field429.method779(arg0 + 1);
                    var33++;
                }
                boolean var38 = true;
                int var39 = 128;
                while (true) {
                    if (var39 > arg0 - var31) {
                        var39 = arg0 - var31;
                    }
                    while (var33 < var39) {
                        int var40 = (int) ((long) field432[var31 + var33] * (long) Statics.field411 >> 16);
                        for (int var41 = 0; var41 < var31; var41++) {
                            var40 += (int) ((long) field432[var31 + var33 - 1 - var41] * (long) class54.field409[0][var41] >> 16);
                        }
                        for (int var42 = 0; var42 < var32; var42++) {
                            var40 -= (int) ((long) field432[var33 - 1 - var42] * (long) class54.field409[1][var42] >> 16);
                        }
                        field432[var33] = var40;
                        var30 = this.field429.method779(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var43 = 0;
                            for (int var44 = var31 + var33 - arg0; var44 < var31; var44++) {
                                var43 += (int) ((long) field432[var31 + var33 - 1 - var44] * (long) class54.field409[0][var44] >> 16);
                            }
                            for (int var45 = 0; var45 < var32; var45++) {
                                var43 -= (int) ((long) field432[var33 - 1 - var45] * (long) class54.field409[1][var45] >> 16);
                            }
                            field432[var33] = var43;
                            this.field429.method779(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field428.method1023(0, (float) var30 / 65536.0F);
                    var32 = this.field428.method1023(1, (float) var30 / 65536.0F);
                    var39 += 128;
                }
            }
        }
        for (int var47 = 0; var47 < arg0; var47++) {
            if (field432[var47] < -32768) {
                field432[var47] = -32768;
            }
            if (field432[var47] > 32767) {
                field432[var47] = 32767;
            }
        }
        return field432;
    }

    @ObfuscatedName("ba.b(III)I")
    public final int method1037(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field434[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field425[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ba.p(Lpi;)V")
    public final void method1038(class419 arg0) {
        this.field421 = new class41();
        this.field421.method769(arg0);
        this.field423 = new class41();
        this.field423.method769(arg0);
        int var2 = arg0.method6781();
        if (var2 != 0) {
            arg0.field4475--;
            this.field417 = new class41();
            this.field417.method769(arg0);
            this.field418 = new class41();
            this.field418.method769(arg0);
        }
        int var3 = arg0.method6781();
        if (var3 != 0) {
            arg0.field4475--;
            this.field436 = new class41();
            this.field436.method769(arg0);
            this.field420 = new class41();
            this.field420.method769(arg0);
        }
        int var4 = arg0.method6781();
        if (var4 != 0) {
            arg0.field4475--;
            this.field433 = new class41();
            this.field433.method769(arg0);
            this.field422 = new class41();
            this.field422.method769(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method6685();
            if (var6 == 0) {
                break;
            }
            this.field440[var5] = var6;
            this.field424[var5] = arg0.method6799();
            this.field435[var5] = arg0.method6685();
        }
        this.field426 = arg0.method6685();
        this.field427 = arg0.method6685();
        this.field430 = arg0.method6672();
        this.field431 = arg0.method6672();
        this.field428 = new class54();
        this.field429 = new class41();
        this.field428.method1024(arg0, this.field429);
    }
}
