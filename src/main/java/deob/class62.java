package deob;

import java.util.Random;

@ObfuscatedName("cv")
public class class62 {

    @ObfuscatedName("cv.ap")
    public class44 field420;

    @ObfuscatedName("cv.aw")
    public class44 field416;

    @ObfuscatedName("cv.ak")
    public class44 field417;

    @ObfuscatedName("cv.aj")
    public class44 field434;

    @ObfuscatedName("cv.ai")
    public class44 field419;

    @ObfuscatedName("cv.ay")
    public class44 field435;

    @ObfuscatedName("cv.as")
    public class44 field421;

    @ObfuscatedName("cv.ae")
    public class44 field422;

    @ObfuscatedName("cv.am")
    public int[] field423 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("cv.at")
    public int[] field427 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("cv.au")
    public int[] field425 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("cv.an")
    public int field415 = 0;

    @ObfuscatedName("cv.ao")
    public int field424 = 100;

    @ObfuscatedName("cv.af")
    public class59 field431;

    @ObfuscatedName("cv.ar")
    public class44 field429;

    @ObfuscatedName("cv.ab")
    public int field430 = 500;

    @ObfuscatedName("cv.az")
    public int field426 = 0;

    @ObfuscatedName("cv.ag")
    public static int[] field432;

    @ObfuscatedName("cv.ad")
    public static int[] field433 = new int[32768];

    @ObfuscatedName("cv.ac")
    public static int[] field418;

    @ObfuscatedName("cv.ax")
    public static int[] field436;

    @ObfuscatedName("cv.aq")
    public static int[] field437;

    @ObfuscatedName("cv.al")
    public static int[] field428;

    @ObfuscatedName("cv.aa")
    public static int[] field439;

    @ObfuscatedName("cv.ah")
    public static int[] field440;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field433[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field418 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field418[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field432 = new int[220500];
        field436 = new int[5];
        field437 = new int[5];
        field428 = new int[5];
        field439 = new int[5];
        field440 = new int[5];
    }

    @ObfuscatedName("cv.ap(II)[I")
    public final int[] method1149(int arg0, int arg1) {
        class452.method8083(field432, 0, arg0);
        if (arg1 < 10) {
            return field432;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field420.method829();
        this.field416.method829();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field417 != null) {
            this.field417.method829();
            this.field434.method829();
            var5 = (int) ((double) (this.field417.field275 - this.field417.field278) * 32.768D / var3);
            var6 = (int) ((double) this.field417.field278 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field419 != null) {
            this.field419.method829();
            this.field435.method829();
            var8 = (int) ((double) (this.field419.field275 - this.field419.field278) * 32.768D / var3);
            var9 = (int) ((double) this.field419.field278 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field423[var11] != 0) {
                field436[var11] = 0;
                field437[var11] = (int) ((double) this.field425[var11] * var3);
                field428[var11] = (this.field423[var11] << 14) / 100;
                field439[var11] = (int) ((double) (this.field420.field275 - this.field420.field278) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field427[var11]) / var3);
                field440[var11] = (int) ((double) this.field420.field278 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field420.method824(arg0);
            int var14 = this.field416.method824(arg0);
            if (this.field417 != null) {
                int var15 = this.field417.method824(arg0);
                int var16 = this.field434.method824(arg0);
                var13 += this.method1151(var7, var16, this.field417.field280) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field419 != null) {
                int var17 = this.field419.method824(arg0);
                int var18 = this.field435.method824(arg0);
                var14 = var14 * ((this.method1151(var10, var18, this.field419.field280) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field423[var19] != 0) {
                    int var20 = field437[var19] + var12;
                    if (var20 < arg0) {
                        field432[var20] += this.method1151(field436[var19], field428[var19] * var14 >> 15, this.field420.field280);
                        field436[var19] += (field439[var19] * var13 >> 16) + field440[var19];
                    }
                }
            }
        }
        if (this.field421 != null) {
            this.field421.method829();
            this.field422.method829();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field421.method824(arg0);
                int var26 = this.field422.method824(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field421.field275 - this.field421.field278) * var25 >> 8) + this.field421.field278;
                } else {
                    var27 = ((this.field421.field275 - this.field421.field278) * var26 >> 8) + this.field421.field278;
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
        if (this.field415 > 0 && this.field424 > 0) {
            int var28 = (int) ((double) this.field415 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field432[var29] += field432[var29 - var28] * this.field424 / 100;
            }
        }
        if (this.field431.field391[0] > 0 || this.field431.field391[1] > 0) {
            this.field429.method829();
            int var30 = this.field429.method824(arg0 + 1);
            int var31 = this.field431.method1112(0, (float) var30 / 65536.0F);
            int var32 = this.field431.method1112(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field432[var31 + var33] * (long) Statics.field397 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field432[var31 + var33 - 1 - var36] * (long) class59.field395[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field432[var33 - 1 - var37] * (long) class59.field395[1][var37] >> 16);
                    }
                    field432[var33] = var35;
                    var30 = this.field429.method824(arg0 + 1);
                    var33++;
                }
                boolean var38 = true;
                int var39 = 128;
                while (true) {
                    if (var39 > arg0 - var31) {
                        var39 = arg0 - var31;
                    }
                    while (var33 < var39) {
                        int var40 = (int) ((long) field432[var31 + var33] * (long) Statics.field397 >> 16);
                        for (int var41 = 0; var41 < var31; var41++) {
                            var40 += (int) ((long) field432[var31 + var33 - 1 - var41] * (long) class59.field395[0][var41] >> 16);
                        }
                        for (int var42 = 0; var42 < var32; var42++) {
                            var40 -= (int) ((long) field432[var33 - 1 - var42] * (long) class59.field395[1][var42] >> 16);
                        }
                        field432[var33] = var40;
                        var30 = this.field429.method824(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var43 = 0;
                            for (int var44 = var31 + var33 - arg0; var44 < var31; var44++) {
                                var43 += (int) ((long) field432[var31 + var33 - 1 - var44] * (long) class59.field395[0][var44] >> 16);
                            }
                            for (int var45 = 0; var45 < var32; var45++) {
                                var43 -= (int) ((long) field432[var33 - 1 - var45] * (long) class59.field395[1][var45] >> 16);
                            }
                            field432[var33] = var43;
                            this.field429.method824(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field431.method1112(0, (float) var30 / 65536.0F);
                    var32 = this.field431.method1112(1, (float) var30 / 65536.0F);
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

    @ObfuscatedName("cv.aw(III)I")
    public final int method1151(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field418[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field433[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("cv.ak(Lvl;)V")
    public final void method1150(class558 arg0) {
        this.field420 = new class44();
        this.field420.method820(arg0);
        this.field416 = new class44();
        this.field416.method820(arg0);
        int var2 = arg0.method9258();
        if (var2 != 0) {
            arg0.field5462--;
            this.field417 = new class44();
            this.field417.method820(arg0);
            this.field434 = new class44();
            this.field434.method820(arg0);
        }
        int var3 = arg0.method9258();
        if (var3 != 0) {
            arg0.field5462--;
            this.field419 = new class44();
            this.field419.method820(arg0);
            this.field435 = new class44();
            this.field435.method820(arg0);
        }
        int var4 = arg0.method9258();
        if (var4 != 0) {
            arg0.field5462--;
            this.field421 = new class44();
            this.field421.method820(arg0);
            this.field422 = new class44();
            this.field422.method820(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method9274();
            if (var6 == 0) {
                break;
            }
            this.field423[var5] = var6;
            this.field427[var5] = arg0.method9273();
            this.field425[var5] = arg0.method9274();
        }
        this.field415 = arg0.method9274();
        this.field424 = arg0.method9274();
        this.field430 = arg0.method9260();
        this.field426 = arg0.method9260();
        this.field431 = new class59();
        this.field429 = new class44();
        this.field431.method1109(arg0, this.field429);
    }
}
