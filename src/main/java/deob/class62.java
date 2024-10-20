package deob;

import java.util.Random;

@ObfuscatedName("cv")
public class class62 {

    @ObfuscatedName("cv.at")
    public class44 field467;

    @ObfuscatedName("cv.an")
    public class44 field447;

    @ObfuscatedName("cv.av")
    public class44 field449;

    @ObfuscatedName("cv.as")
    public class44 field450;

    @ObfuscatedName("cv.ax")
    public class44 field466;

    @ObfuscatedName("cv.ap")
    public class44 field452;

    @ObfuscatedName("cv.ab")
    public class44 field453;

    @ObfuscatedName("cv.ak")
    public class44 field454;

    @ObfuscatedName("cv.ae")
    public int[] field451 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("cv.af")
    public int[] field456 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("cv.ao")
    public int[] field448 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("cv.aa")
    public int field458 = 0;

    @ObfuscatedName("cv.aj")
    public int field459 = 100;

    @ObfuscatedName("cv.ad")
    public class59 field460;

    @ObfuscatedName("cv.ac")
    public class44 field461;

    @ObfuscatedName("cv.ag")
    public int field462 = 500;

    @ObfuscatedName("cv.ar")
    public int field463 = 0;

    @ObfuscatedName("cv.ah")
    public static int[] field455;

    @ObfuscatedName("cv.az")
    public static int[] field465 = new int[32768];

    @ObfuscatedName("cv.au")
    public static int[] field464;

    @ObfuscatedName("cv.aq")
    public static int[] field469;

    @ObfuscatedName("cv.aw")
    public static int[] field457;

    @ObfuscatedName("cv.ay")
    public static int[] field470;

    @ObfuscatedName("cv.al")
    public static int[] field471;

    @ObfuscatedName("cv.am")
    public static int[] field472;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field465[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field464 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field464[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field455 = new int[220500];
        field469 = new int[5];
        field457 = new int[5];
        field470 = new int[5];
        field471 = new int[5];
        field472 = new int[5];
    }

    @ObfuscatedName("cv.at(II)[I")
    public final int[] method1069(int arg0, int arg1) {
        class398.method6918(field455, 0, arg0);
        if (arg1 < 10) {
            return field455;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field467.method776();
        this.field447.method776();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field449 != null) {
            this.field449.method776();
            this.field450.method776();
            var5 = (int) ((double) (this.field449.field306 - this.field449.field302) * 32.768D / var3);
            var6 = (int) ((double) this.field449.field302 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field466 != null) {
            this.field466.method776();
            this.field452.method776();
            var8 = (int) ((double) (this.field466.field306 - this.field466.field302) * 32.768D / var3);
            var9 = (int) ((double) this.field466.field302 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field451[var11] != 0) {
                field469[var11] = 0;
                field457[var11] = (int) ((double) this.field448[var11] * var3);
                field470[var11] = (this.field451[var11] << 14) / 100;
                field471[var11] = (int) ((double) (this.field467.field306 - this.field467.field302) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field456[var11]) / var3);
                field472[var11] = (int) ((double) this.field467.field302 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field467.method777(arg0);
            int var14 = this.field447.method777(arg0);
            if (this.field449 != null) {
                int var15 = this.field449.method777(arg0);
                int var16 = this.field450.method777(arg0);
                var13 += this.method1071(var7, var16, this.field449.field304) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field466 != null) {
                int var17 = this.field466.method777(arg0);
                int var18 = this.field452.method777(arg0);
                var14 = var14 * ((this.method1071(var10, var18, this.field466.field304) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field451[var19] != 0) {
                    int var20 = field457[var19] + var12;
                    if (var20 < arg0) {
                        field455[var20] += this.method1071(field469[var19], field470[var19] * var14 >> 15, this.field467.field304);
                        field469[var19] += (field471[var19] * var13 >> 16) + field472[var19];
                    }
                }
            }
        }
        if (this.field453 != null) {
            this.field453.method776();
            this.field454.method776();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field453.method777(arg0);
                int var26 = this.field454.method777(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field453.field306 - this.field453.field302) * var25 >> 8) + this.field453.field302;
                } else {
                    var27 = ((this.field453.field306 - this.field453.field302) * var26 >> 8) + this.field453.field302;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field455[var24] = 0;
                }
            }
        }
        if (this.field458 > 0 && this.field459 > 0) {
            int var28 = (int) ((double) this.field458 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field455[var29] += field455[var29 - var28] * this.field459 / 100;
            }
        }
        if (this.field460.field426[0] > 0 || this.field460.field426[1] > 0) {
            this.field461.method776();
            int var30 = this.field461.method777(arg0 + 1);
            int var31 = this.field460.method1028(0, (float) var30 / 65536.0F);
            int var32 = this.field460.method1028(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field455[var31 + var33] * (long) Statics.field421 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field455[var31 + var33 - 1 - var36] * (long) class59.field423[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field455[var33 - 1 - var37] * (long) class59.field423[1][var37] >> 16);
                    }
                    field455[var33] = var35;
                    var30 = this.field461.method777(arg0 + 1);
                    var33++;
                }
                boolean var38 = true;
                int var39 = 128;
                while (true) {
                    if (var39 > arg0 - var31) {
                        var39 = arg0 - var31;
                    }
                    while (var33 < var39) {
                        int var40 = (int) ((long) field455[var31 + var33] * (long) Statics.field421 >> 16);
                        for (int var41 = 0; var41 < var31; var41++) {
                            var40 += (int) ((long) field455[var31 + var33 - 1 - var41] * (long) class59.field423[0][var41] >> 16);
                        }
                        for (int var42 = 0; var42 < var32; var42++) {
                            var40 -= (int) ((long) field455[var33 - 1 - var42] * (long) class59.field423[1][var42] >> 16);
                        }
                        field455[var33] = var40;
                        var30 = this.field461.method777(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var43 = 0;
                            for (int var44 = var31 + var33 - arg0; var44 < var31; var44++) {
                                var43 += (int) ((long) field455[var31 + var33 - 1 - var44] * (long) class59.field423[0][var44] >> 16);
                            }
                            for (int var45 = 0; var45 < var32; var45++) {
                                var43 -= (int) ((long) field455[var33 - 1 - var45] * (long) class59.field423[1][var45] >> 16);
                            }
                            field455[var33] = var43;
                            this.field461.method777(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field460.method1028(0, (float) var30 / 65536.0F);
                    var32 = this.field460.method1028(1, (float) var30 / 65536.0F);
                    var39 += 128;
                }
            }
        }
        for (int var47 = 0; var47 < arg0; var47++) {
            if (field455[var47] < -32768) {
                field455[var47] = -32768;
            }
            if (field455[var47] > 32767) {
                field455[var47] = 32767;
            }
        }
        return field455;
    }

    @ObfuscatedName("cv.an(III)I")
    public final int method1071(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field464[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field465[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("cv.av(Ltz;)V")
    public final void method1072(class501 arg0) {
        this.field467 = new class44();
        this.field467.method781(arg0);
        this.field447 = new class44();
        this.field447.method781(arg0);
        int var2 = arg0.method8129();
        if (var2 != 0) {
            arg0.field5017--;
            this.field449 = new class44();
            this.field449.method781(arg0);
            this.field450 = new class44();
            this.field450.method781(arg0);
        }
        int var3 = arg0.method8129();
        if (var3 != 0) {
            arg0.field5017--;
            this.field466 = new class44();
            this.field466.method781(arg0);
            this.field452 = new class44();
            this.field452.method781(arg0);
        }
        int var4 = arg0.method8129();
        if (var4 != 0) {
            arg0.field5017--;
            this.field453 = new class44();
            this.field453.method781(arg0);
            this.field454 = new class44();
            this.field454.method781(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method8144();
            if (var6 == 0) {
                break;
            }
            this.field451[var5] = var6;
            this.field456[var5] = arg0.method8143();
            this.field448[var5] = arg0.method8144();
        }
        this.field458 = arg0.method8144();
        this.field459 = arg0.method8144();
        this.field462 = arg0.method8195();
        this.field463 = arg0.method8195();
        this.field460 = new class59();
        this.field461 = new class44();
        this.field460.method1029(arg0, this.field461);
    }
}
