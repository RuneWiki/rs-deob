package deob;

import java.util.Random;

@ObfuscatedName("bp")
public class class55 {

    @ObfuscatedName("bp.c")
    public class41 field423;

    @ObfuscatedName("bp.v")
    public class41 field419;

    @ObfuscatedName("bp.q")
    public class41 field441;

    @ObfuscatedName("bp.f")
    public class41 field420;

    @ObfuscatedName("bp.j")
    public class41 field421;

    @ObfuscatedName("bp.e")
    public class41 field432;

    @ObfuscatedName("bp.g")
    public class41 field417;

    @ObfuscatedName("bp.w")
    public class41 field424;

    @ObfuscatedName("bp.y")
    public int[] field425 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bp.i")
    public int[] field426 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bp.s")
    public int[] field427 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bp.t")
    public int field418 = 0;

    @ObfuscatedName("bp.z")
    public int field422 = 100;

    @ObfuscatedName("bp.r")
    public class54 field428;

    @ObfuscatedName("bp.u")
    public class41 field429;

    @ObfuscatedName("bp.k")
    public int field431 = 500;

    @ObfuscatedName("bp.h")
    public int field433 = 0;

    @ObfuscatedName("bp.x")
    public static int[] field434;

    @ObfuscatedName("bp.l")
    public static int[] field435 = new int[32768];

    @ObfuscatedName("bp.a")
    public static int[] field436;

    @ObfuscatedName("bp.b")
    public static int[] field438;

    @ObfuscatedName("bp.n")
    public static int[] field439;

    @ObfuscatedName("bp.o")
    public static int[] field440;

    @ObfuscatedName("bp.m")
    public static int[] field430;

    @ObfuscatedName("bp.d")
    public static int[] field442;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field435[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field436 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field436[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field434 = new int[220500];
        field438 = new int[5];
        field439 = new int[5];
        field440 = new int[5];
        field430 = new int[5];
        field442 = new int[5];
    }

    @ObfuscatedName("bp.c(II)[I")
    public final int[] method974(int arg0, int arg1) {
        class351.method5895(field434, 0, arg0);
        if (arg1 < 10) {
            return field434;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field423.method704();
        this.field419.method704();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field441 != null) {
            this.field441.method704();
            this.field420.method704();
            var5 = (int) ((double) (this.field441.field303 - this.field441.field300) * 32.768D / var3);
            var6 = (int) ((double) this.field441.field300 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field421 != null) {
            this.field421.method704();
            this.field432.method704();
            var8 = (int) ((double) (this.field421.field303 - this.field421.field300) * 32.768D / var3);
            var9 = (int) ((double) this.field421.field300 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field425[var11] != 0) {
                field438[var11] = 0;
                field439[var11] = (int) ((double) this.field427[var11] * var3);
                field440[var11] = (this.field425[var11] << 14) / 100;
                field430[var11] = (int) ((double) (this.field423.field303 - this.field423.field300) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field426[var11]) / var3);
                field442[var11] = (int) ((double) this.field423.field300 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field423.method703(arg0);
            int var14 = this.field419.method703(arg0);
            if (this.field441 != null) {
                int var15 = this.field441.method703(arg0);
                int var16 = this.field420.method703(arg0);
                var13 += this.method972(var7, var16, this.field441.field299) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field421 != null) {
                int var17 = this.field421.method703(arg0);
                int var18 = this.field432.method703(arg0);
                var14 = var14 * ((this.method972(var10, var18, this.field421.field299) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field425[var19] != 0) {
                    int var20 = field439[var19] + var12;
                    if (var20 < arg0) {
                        field434[var20] += this.method972(field438[var19], field440[var19] * var14 >> 15, this.field423.field299);
                        field438[var19] += (field430[var19] * var13 >> 16) + field442[var19];
                    }
                }
            }
        }
        if (this.field417 != null) {
            this.field417.method704();
            this.field424.method704();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field417.method703(arg0);
                int var26 = this.field424.method703(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field417.field303 - this.field417.field300) * var25 >> 8) + this.field417.field300;
                } else {
                    var27 = ((this.field417.field303 - this.field417.field300) * var26 >> 8) + this.field417.field300;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field434[var24] = 0;
                }
            }
        }
        if (this.field418 > 0 && this.field422 > 0) {
            int var28 = (int) ((double) this.field418 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field434[var29] += field434[var29 - var28] * this.field422 / 100;
            }
        }
        if (this.field428.field405[0] > 0 || this.field428.field405[1] > 0) {
            this.field429.method704();
            int var30 = this.field429.method703(arg0 + 1);
            int var31 = this.field428.method960(0, (float) var30 / 65536.0F);
            int var32 = this.field428.method960(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field434[var31 + var33] * (long) Statics.field413 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field434[var31 + var33 - 1 - var36] * (long) class54.field411[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field434[var33 - 1 - var37] * (long) class54.field411[1][var37] >> 16);
                    }
                    field434[var33] = var35;
                    var30 = this.field429.method703(arg0 + 1);
                    var33++;
                }
                boolean var38 = true;
                int var39 = 128;
                while (true) {
                    if (var39 > arg0 - var31) {
                        var39 = arg0 - var31;
                    }
                    while (var33 < var39) {
                        int var40 = (int) ((long) field434[var31 + var33] * (long) Statics.field413 >> 16);
                        for (int var41 = 0; var41 < var31; var41++) {
                            var40 += (int) ((long) field434[var31 + var33 - 1 - var41] * (long) class54.field411[0][var41] >> 16);
                        }
                        for (int var42 = 0; var42 < var32; var42++) {
                            var40 -= (int) ((long) field434[var33 - 1 - var42] * (long) class54.field411[1][var42] >> 16);
                        }
                        field434[var33] = var40;
                        var30 = this.field429.method703(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var43 = 0;
                            for (int var44 = var31 + var33 - arg0; var44 < var31; var44++) {
                                var43 += (int) ((long) field434[var31 + var33 - 1 - var44] * (long) class54.field411[0][var44] >> 16);
                            }
                            for (int var45 = 0; var45 < var32; var45++) {
                                var43 -= (int) ((long) field434[var33 - 1 - var45] * (long) class54.field411[1][var45] >> 16);
                            }
                            field434[var33] = var43;
                            this.field429.method703(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field428.method960(0, (float) var30 / 65536.0F);
                    var32 = this.field428.method960(1, (float) var30 / 65536.0F);
                    var39 += 128;
                }
            }
        }
        for (int var47 = 0; var47 < arg0; var47++) {
            if (field434[var47] < -32768) {
                field434[var47] = -32768;
            }
            if (field434[var47] > 32767) {
                field434[var47] = 32767;
            }
        }
        return field434;
    }

    @ObfuscatedName("bp.v(III)I")
    public final int method972(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field436[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field435[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bp.q(Lqt;)V")
    public final void method973(class443 arg0) {
        this.field423 = new class41();
        this.field423.method694(arg0);
        this.field419 = new class41();
        this.field419.method694(arg0);
        int var2 = arg0.method7047();
        if (var2 != 0) {
            arg0.field4700--;
            this.field441 = new class41();
            this.field441.method694(arg0);
            this.field420 = new class41();
            this.field420.method694(arg0);
        }
        int var3 = arg0.method7047();
        if (var3 != 0) {
            arg0.field4700--;
            this.field421 = new class41();
            this.field421.method694(arg0);
            this.field432 = new class41();
            this.field432.method694(arg0);
        }
        int var4 = arg0.method7047();
        if (var4 != 0) {
            arg0.field4700--;
            this.field417 = new class41();
            this.field417.method694(arg0);
            this.field424 = new class41();
            this.field424.method694(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method7062();
            if (var6 == 0) {
                break;
            }
            this.field425[var5] = var6;
            this.field426[var5] = arg0.method7213();
            this.field427[var5] = arg0.method7062();
        }
        this.field418 = arg0.method7062();
        this.field422 = arg0.method7062();
        this.field431 = arg0.method7049();
        this.field433 = arg0.method7049();
        this.field428 = new class54();
        this.field429 = new class41();
        this.field428.method955(arg0, this.field429);
    }
}
