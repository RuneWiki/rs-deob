package deob;

import java.util.Random;

@ObfuscatedName("cg")
public class class62 {

    @ObfuscatedName("cg.ab")
    public class44 field432;

    @ObfuscatedName("cg.ay")
    public class44 field420;

    @ObfuscatedName("cg.an")
    public class44 field423;

    @ObfuscatedName("cg.au")
    public class44 field421;

    @ObfuscatedName("cg.ax")
    public class44 field422;

    @ObfuscatedName("cg.ao")
    public class44 field442;

    @ObfuscatedName("cg.am")
    public class44 field436;

    @ObfuscatedName("cg.ac")
    public class44 field425;

    @ObfuscatedName("cg.ae")
    public int[] field426 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("cg.ad")
    public int[] field427 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("cg.aq")
    public int[] field428 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("cg.al")
    public int field429 = 0;

    @ObfuscatedName("cg.aj")
    public int field430 = 100;

    @ObfuscatedName("cg.as")
    public class59 field431;

    @ObfuscatedName("cg.aw")
    public class44 field440;

    @ObfuscatedName("cg.af")
    public int field433 = 500;

    @ObfuscatedName("cg.aa")
    public int field434 = 0;

    @ObfuscatedName("cg.ah")
    public static int[] field435;

    @ObfuscatedName("cg.ag")
    public static int[] field419 = new int[32768];

    @ObfuscatedName("cg.av")
    public static int[] field424;

    @ObfuscatedName("cg.ap")
    public static int[] field439;

    @ObfuscatedName("cg.ak")
    public static int[] field418;

    @ObfuscatedName("cg.ai")
    public static int[] field441;

    @ObfuscatedName("cg.at")
    public static int[] field437;

    @ObfuscatedName("cg.az")
    public static int[] field443;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field419[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field424 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field424[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field435 = new int[220500];
        field439 = new int[5];
        field418 = new int[5];
        field441 = new int[5];
        field437 = new int[5];
        field443 = new int[5];
    }

    @ObfuscatedName("cg.ab(II)[I")
    public final int[] method1093(int arg0, int arg1) {
        class449.method7693(field435, 0, arg0);
        if (arg1 < 10) {
            return field435;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field432.method788();
        this.field420.method788();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field423 != null) {
            this.field423.method788();
            this.field421.method788();
            var5 = (int) ((double) (this.field423.field281 - this.field423.field287) * 32.768D / var3);
            var6 = (int) ((double) this.field423.field287 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field422 != null) {
            this.field422.method788();
            this.field442.method788();
            var8 = (int) ((double) (this.field422.field281 - this.field422.field287) * 32.768D / var3);
            var9 = (int) ((double) this.field422.field287 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field426[var11] != 0) {
                field439[var11] = 0;
                field418[var11] = (int) ((double) this.field428[var11] * var3);
                field441[var11] = (this.field426[var11] << 14) / 100;
                field437[var11] = (int) ((double) (this.field432.field281 - this.field432.field287) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field427[var11]) / var3);
                field443[var11] = (int) ((double) this.field432.field287 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field432.method783(arg0);
            int var14 = this.field420.method783(arg0);
            if (this.field423 != null) {
                int var15 = this.field423.method783(arg0);
                int var16 = this.field421.method783(arg0);
                var13 += this.method1096(var7, var16, this.field423.field280) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field422 != null) {
                int var17 = this.field422.method783(arg0);
                int var18 = this.field442.method783(arg0);
                var14 = var14 * ((this.method1096(var10, var18, this.field422.field280) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field426[var19] != 0) {
                    int var20 = field418[var19] + var12;
                    if (var20 < arg0) {
                        field435[var20] += this.method1096(field439[var19], field441[var19] * var14 >> 15, this.field432.field280);
                        field439[var19] += (field437[var19] * var13 >> 16) + field443[var19];
                    }
                }
            }
        }
        if (this.field436 != null) {
            this.field436.method788();
            this.field425.method788();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field436.method783(arg0);
                int var26 = this.field425.method783(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field436.field281 - this.field436.field287) * var25 >> 8) + this.field436.field287;
                } else {
                    var27 = ((this.field436.field281 - this.field436.field287) * var26 >> 8) + this.field436.field287;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field435[var24] = 0;
                }
            }
        }
        if (this.field429 > 0 && this.field430 > 0) {
            int var28 = (int) ((double) this.field429 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field435[var29] += field435[var29 - var28] * this.field430 / 100;
            }
        }
        if (this.field431.field393[0] > 0 || this.field431.field393[1] > 0) {
            this.field440.method788();
            int var30 = this.field440.method783(arg0 + 1);
            int var31 = this.field431.method1049(0, (float) var30 / 65536.0F);
            int var32 = this.field431.method1049(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field435[var31 + var33] * (long) Statics.field396 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field435[var31 + var33 - 1 - var36] * (long) class59.field399[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field435[var33 - 1 - var37] * (long) class59.field399[1][var37] >> 16);
                    }
                    field435[var33] = var35;
                    var30 = this.field440.method783(arg0 + 1);
                    var33++;
                }
                boolean var38 = true;
                int var39 = 128;
                while (true) {
                    if (var39 > arg0 - var31) {
                        var39 = arg0 - var31;
                    }
                    while (var33 < var39) {
                        int var40 = (int) ((long) field435[var31 + var33] * (long) Statics.field396 >> 16);
                        for (int var41 = 0; var41 < var31; var41++) {
                            var40 += (int) ((long) field435[var31 + var33 - 1 - var41] * (long) class59.field399[0][var41] >> 16);
                        }
                        for (int var42 = 0; var42 < var32; var42++) {
                            var40 -= (int) ((long) field435[var33 - 1 - var42] * (long) class59.field399[1][var42] >> 16);
                        }
                        field435[var33] = var40;
                        var30 = this.field440.method783(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var43 = 0;
                            for (int var44 = var31 + var33 - arg0; var44 < var31; var44++) {
                                var43 += (int) ((long) field435[var31 + var33 - 1 - var44] * (long) class59.field399[0][var44] >> 16);
                            }
                            for (int var45 = 0; var45 < var32; var45++) {
                                var43 -= (int) ((long) field435[var33 - 1 - var45] * (long) class59.field399[1][var45] >> 16);
                            }
                            field435[var33] = var43;
                            this.field440.method783(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field431.method1049(0, (float) var30 / 65536.0F);
                    var32 = this.field431.method1049(1, (float) var30 / 65536.0F);
                    var39 += 128;
                }
            }
        }
        for (int var47 = 0; var47 < arg0; var47++) {
            if (field435[var47] < -32768) {
                field435[var47] = -32768;
            }
            if (field435[var47] > 32767) {
                field435[var47] = 32767;
            }
        }
        return field435;
    }

    @ObfuscatedName("cg.ay(III)I")
    public final int method1096(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field424[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field419[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("cg.an(Lvg;)V")
    public final void method1100(class549 arg0) {
        this.field432 = new class44();
        this.field432.method780(arg0);
        this.field420 = new class44();
        this.field420.method780(arg0);
        int var2 = arg0.method9025();
        if (var2 != 0) {
            arg0.field5378--;
            this.field423 = new class44();
            this.field423.method780(arg0);
            this.field421 = new class44();
            this.field421.method780(arg0);
        }
        int var3 = arg0.method9025();
        if (var3 != 0) {
            arg0.field5378--;
            this.field422 = new class44();
            this.field422.method780(arg0);
            this.field442 = new class44();
            this.field442.method780(arg0);
        }
        int var4 = arg0.method9025();
        if (var4 != 0) {
            arg0.field5378--;
            this.field436 = new class44();
            this.field436.method780(arg0);
            this.field425 = new class44();
            this.field425.method780(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method8813();
            if (var6 == 0) {
                break;
            }
            this.field426[var5] = var6;
            this.field427[var5] = arg0.method8812();
            this.field428[var5] = arg0.method8813();
        }
        this.field429 = arg0.method8813();
        this.field430 = arg0.method8813();
        this.field433 = arg0.method8968();
        this.field434 = arg0.method8968();
        this.field431 = new class59();
        this.field440 = new class44();
        this.field431.method1050(arg0, this.field440);
    }
}
