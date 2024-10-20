package deob;

import java.util.Random;

@ObfuscatedName("cq")
public class class62 {

    @ObfuscatedName("cq.at")
    public class44 field443;

    @ObfuscatedName("cq.ah")
    public class44 field446;

    @ObfuscatedName("cq.ar")
    public class44 field428;

    @ObfuscatedName("cq.ao")
    public class44 field450;

    @ObfuscatedName("cq.ab")
    public class44 field426;

    @ObfuscatedName("cq.au")
    public class44 field431;

    @ObfuscatedName("cq.aa")
    public class44 field432;

    @ObfuscatedName("cq.ac")
    public class44 field433;

    @ObfuscatedName("cq.al")
    public int[] field434 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("cq.az")
    public int[] field435 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("cq.ap")
    public int[] field436 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("cq.av")
    public int field437 = 0;

    @ObfuscatedName("cq.ax")
    public int field438 = 100;

    @ObfuscatedName("cq.as")
    public class59 field444;

    @ObfuscatedName("cq.ay")
    public class44 field440;

    @ObfuscatedName("cq.ak")
    public int field441 = 500;

    @ObfuscatedName("cq.aj")
    public int field442 = 0;

    @ObfuscatedName("cq.am")
    public static int[] field427;

    @ObfuscatedName("cq.aq")
    public static int[] field447 = new int[32768];

    @ObfuscatedName("cq.ai")
    public static int[] field429;

    @ObfuscatedName("cq.ae")
    public static int[] field445;

    @ObfuscatedName("cq.an")
    public static int[] field448;

    @ObfuscatedName("cq.ag")
    public static int[] field439;

    @ObfuscatedName("cq.ad")
    public static int[] field430;

    @ObfuscatedName("cq.af")
    public static int[] field451;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field447[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field429 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field429[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field427 = new int[220500];
        field445 = new int[5];
        field448 = new int[5];
        field439 = new int[5];
        field430 = new int[5];
        field451 = new int[5];
    }

    @ObfuscatedName("cq.at(II)[I")
    public final int[] method1122(int arg0, int arg1) {
        class422.method7155(field427, 0, arg0);
        if (arg1 < 10) {
            return field427;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field443.method822();
        this.field446.method822();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field428 != null) {
            this.field428.method822();
            this.field450.method822();
            var5 = (int) ((double) (this.field428.field295 - this.field428.field291) * 32.768D / var3);
            var6 = (int) ((double) this.field428.field291 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field426 != null) {
            this.field426.method822();
            this.field431.method822();
            var8 = (int) ((double) (this.field426.field295 - this.field426.field291) * 32.768D / var3);
            var9 = (int) ((double) this.field426.field291 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field434[var11] != 0) {
                field445[var11] = 0;
                field448[var11] = (int) ((double) this.field436[var11] * var3);
                field439[var11] = (this.field434[var11] << 14) / 100;
                field430[var11] = (int) ((double) (this.field443.field295 - this.field443.field291) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field435[var11]) / var3);
                field451[var11] = (int) ((double) this.field443.field291 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field443.method823(arg0);
            int var14 = this.field446.method823(arg0);
            if (this.field428 != null) {
                int var15 = this.field428.method823(arg0);
                int var16 = this.field450.method823(arg0);
                var13 += this.method1123(var7, var16, this.field428.field297) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field426 != null) {
                int var17 = this.field426.method823(arg0);
                int var18 = this.field431.method823(arg0);
                var14 = var14 * ((this.method1123(var10, var18, this.field426.field297) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field434[var19] != 0) {
                    int var20 = field448[var19] + var12;
                    if (var20 < arg0) {
                        field427[var20] += this.method1123(field445[var19], field439[var19] * var14 >> 15, this.field443.field297);
                        field445[var19] += (field430[var19] * var13 >> 16) + field451[var19];
                    }
                }
            }
        }
        if (this.field432 != null) {
            this.field432.method822();
            this.field433.method822();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field432.method823(arg0);
                int var26 = this.field433.method823(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field432.field295 - this.field432.field291) * var25 >> 8) + this.field432.field291;
                } else {
                    var27 = ((this.field432.field295 - this.field432.field291) * var26 >> 8) + this.field432.field291;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field427[var24] = 0;
                }
            }
        }
        if (this.field437 > 0 && this.field438 > 0) {
            int var28 = (int) ((double) this.field437 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field427[var29] += field427[var29 - var28] * this.field438 / 100;
            }
        }
        if (this.field444.field404[0] > 0 || this.field444.field404[1] > 0) {
            this.field440.method822();
            int var30 = this.field440.method823(arg0 + 1);
            int var31 = this.field444.method1076(0, (float) var30 / 65536.0F);
            int var32 = this.field444.method1076(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field427[var31 + var33] * (long) Statics.field406 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field427[var31 + var33 - 1 - var36] * (long) class59.field402[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field427[var33 - 1 - var37] * (long) class59.field402[1][var37] >> 16);
                    }
                    field427[var33] = var35;
                    var30 = this.field440.method823(arg0 + 1);
                    var33++;
                }
                boolean var38 = true;
                int var39 = 128;
                while (true) {
                    if (var39 > arg0 - var31) {
                        var39 = arg0 - var31;
                    }
                    while (var33 < var39) {
                        int var40 = (int) ((long) field427[var31 + var33] * (long) Statics.field406 >> 16);
                        for (int var41 = 0; var41 < var31; var41++) {
                            var40 += (int) ((long) field427[var31 + var33 - 1 - var41] * (long) class59.field402[0][var41] >> 16);
                        }
                        for (int var42 = 0; var42 < var32; var42++) {
                            var40 -= (int) ((long) field427[var33 - 1 - var42] * (long) class59.field402[1][var42] >> 16);
                        }
                        field427[var33] = var40;
                        var30 = this.field440.method823(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var43 = 0;
                            for (int var44 = var31 + var33 - arg0; var44 < var31; var44++) {
                                var43 += (int) ((long) field427[var31 + var33 - 1 - var44] * (long) class59.field402[0][var44] >> 16);
                            }
                            for (int var45 = 0; var45 < var32; var45++) {
                                var43 -= (int) ((long) field427[var33 - 1 - var45] * (long) class59.field402[1][var45] >> 16);
                            }
                            field427[var33] = var43;
                            this.field440.method823(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field444.method1076(0, (float) var30 / 65536.0F);
                    var32 = this.field444.method1076(1, (float) var30 / 65536.0F);
                    var39 += 128;
                }
            }
        }
        for (int var47 = 0; var47 < arg0; var47++) {
            if (field427[var47] < -32768) {
                field427[var47] = -32768;
            }
            if (field427[var47] > 32767) {
                field427[var47] = 32767;
            }
        }
        return field427;
    }

    @ObfuscatedName("cq.ah(III)I")
    public final int method1123(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field429[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field447[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("cq.ar(Luj;)V")
    public final void method1121(class527 arg0) {
        this.field443 = new class44();
        this.field443.method820(arg0);
        this.field446 = new class44();
        this.field446.method820(arg0);
        int var2 = arg0.method8410();
        if (var2 != 0) {
            arg0.field5137--;
            this.field428 = new class44();
            this.field428.method820(arg0);
            this.field450 = new class44();
            this.field450.method820(arg0);
        }
        int var3 = arg0.method8410();
        if (var3 != 0) {
            arg0.field5137--;
            this.field426 = new class44();
            this.field426.method820(arg0);
            this.field431 = new class44();
            this.field431.method820(arg0);
        }
        int var4 = arg0.method8410();
        if (var4 != 0) {
            arg0.field5137--;
            this.field432 = new class44();
            this.field432.method820(arg0);
            this.field433 = new class44();
            this.field433.method820(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method8426();
            if (var6 == 0) {
                break;
            }
            this.field434[var5] = var6;
            this.field435[var5] = arg0.method8675();
            this.field436[var5] = arg0.method8426();
        }
        this.field437 = arg0.method8426();
        this.field438 = arg0.method8426();
        this.field441 = arg0.method8412();
        this.field442 = arg0.method8412();
        this.field444 = new class59();
        this.field440 = new class44();
        this.field444.method1077(arg0, this.field440);
    }
}
