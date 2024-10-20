package deob;

import java.util.Random;

@ObfuscatedName("cm")
public class class62 {

    @ObfuscatedName("cm.az")
    public class44 field434;

    @ObfuscatedName("cm.ah")
    public class44 field432;

    @ObfuscatedName("cm.af")
    public class44 field433;

    @ObfuscatedName("cm.at")
    public class44 field450;

    @ObfuscatedName("cm.an")
    public class44 field444;

    @ObfuscatedName("cm.ao")
    public class44 field454;

    @ObfuscatedName("cm.ab")
    public class44 field431;

    @ObfuscatedName("cm.aw")
    public class44 field438;

    @ObfuscatedName("cm.ad")
    public int[] field439 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("cm.al")
    public int[] field456 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("cm.as")
    public int[] field441 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("cm.ag")
    public int field442 = 0;

    @ObfuscatedName("cm.ai")
    public int field443 = 100;

    @ObfuscatedName("cm.ax")
    public class59 field437;

    @ObfuscatedName("cm.ar")
    public class44 field445;

    @ObfuscatedName("cm.aj")
    public int field446 = 500;

    @ObfuscatedName("cm.au")
    public int field447 = 0;

    @ObfuscatedName("cm.ay")
    public static int[] field436;

    @ObfuscatedName("cm.ap")
    public static int[] field449 = new int[32768];

    @ObfuscatedName("cm.av")
    public static int[] field448;

    @ObfuscatedName("cm.aq")
    public static int[] field452;

    @ObfuscatedName("cm.am")
    public static int[] field453;

    @ObfuscatedName("cm.ac")
    public static int[] field435;

    @ObfuscatedName("cm.ae")
    public static int[] field440;

    @ObfuscatedName("cm.ak")
    public static int[] field455;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field449[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field448 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field448[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field436 = new int[220500];
        field452 = new int[5];
        field453 = new int[5];
        field435 = new int[5];
        field440 = new int[5];
        field455 = new int[5];
    }

    @ObfuscatedName("cm.az(II)[I")
    public final int[] method1073(int arg0, int arg1) {
        class430.method7190(field436, 0, arg0);
        if (arg1 < 10) {
            return field436;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field434.method777();
        this.field432.method777();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field433 != null) {
            this.field433.method777();
            this.field450.method777();
            var5 = (int) ((double) (this.field433.field292 - this.field433.field295) * 32.768D / var3);
            var6 = (int) ((double) this.field433.field295 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field444 != null) {
            this.field444.method777();
            this.field454.method777();
            var8 = (int) ((double) (this.field444.field292 - this.field444.field295) * 32.768D / var3);
            var9 = (int) ((double) this.field444.field295 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field439[var11] != 0) {
                field452[var11] = 0;
                field453[var11] = (int) ((double) this.field441[var11] * var3);
                field435[var11] = (this.field439[var11] << 14) / 100;
                field440[var11] = (int) ((double) (this.field434.field292 - this.field434.field295) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field456[var11]) / var3);
                field455[var11] = (int) ((double) this.field434.field295 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field434.method775(arg0);
            int var14 = this.field432.method775(arg0);
            if (this.field433 != null) {
                int var15 = this.field433.method775(arg0);
                int var16 = this.field450.method775(arg0);
                var13 += this.method1074(var7, var16, this.field433.field302) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field444 != null) {
                int var17 = this.field444.method775(arg0);
                int var18 = this.field454.method775(arg0);
                var14 = var14 * ((this.method1074(var10, var18, this.field444.field302) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field439[var19] != 0) {
                    int var20 = field453[var19] + var12;
                    if (var20 < arg0) {
                        field436[var20] += this.method1074(field452[var19], field435[var19] * var14 >> 15, this.field434.field302);
                        field452[var19] += (field440[var19] * var13 >> 16) + field455[var19];
                    }
                }
            }
        }
        if (this.field431 != null) {
            this.field431.method777();
            this.field438.method777();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field431.method775(arg0);
                int var26 = this.field438.method775(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field431.field292 - this.field431.field295) * var25 >> 8) + this.field431.field295;
                } else {
                    var27 = ((this.field431.field292 - this.field431.field295) * var26 >> 8) + this.field431.field295;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field436[var24] = 0;
                }
            }
        }
        if (this.field442 > 0 && this.field443 > 0) {
            int var28 = (int) ((double) this.field442 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field436[var29] += field436[var29 - var28] * this.field443 / 100;
            }
        }
        if (this.field437.field401[0] > 0 || this.field437.field401[1] > 0) {
            this.field445.method777();
            int var30 = this.field445.method775(arg0 + 1);
            int var31 = this.field437.method1040(0, (float) var30 / 65536.0F);
            int var32 = this.field437.method1040(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field436[var31 + var33] * (long) Statics.field405 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field436[var31 + var33 - 1 - var36] * (long) class59.field406[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field436[var33 - 1 - var37] * (long) class59.field406[1][var37] >> 16);
                    }
                    field436[var33] = var35;
                    var30 = this.field445.method775(arg0 + 1);
                    var33++;
                }
                boolean var38 = true;
                int var39 = 128;
                while (true) {
                    if (var39 > arg0 - var31) {
                        var39 = arg0 - var31;
                    }
                    while (var33 < var39) {
                        int var40 = (int) ((long) field436[var31 + var33] * (long) Statics.field405 >> 16);
                        for (int var41 = 0; var41 < var31; var41++) {
                            var40 += (int) ((long) field436[var31 + var33 - 1 - var41] * (long) class59.field406[0][var41] >> 16);
                        }
                        for (int var42 = 0; var42 < var32; var42++) {
                            var40 -= (int) ((long) field436[var33 - 1 - var42] * (long) class59.field406[1][var42] >> 16);
                        }
                        field436[var33] = var40;
                        var30 = this.field445.method775(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var43 = 0;
                            for (int var44 = var31 + var33 - arg0; var44 < var31; var44++) {
                                var43 += (int) ((long) field436[var31 + var33 - 1 - var44] * (long) class59.field406[0][var44] >> 16);
                            }
                            for (int var45 = 0; var45 < var32; var45++) {
                                var43 -= (int) ((long) field436[var33 - 1 - var45] * (long) class59.field406[1][var45] >> 16);
                            }
                            field436[var33] = var43;
                            this.field445.method775(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field437.method1040(0, (float) var30 / 65536.0F);
                    var32 = this.field437.method1040(1, (float) var30 / 65536.0F);
                    var39 += 128;
                }
            }
        }
        for (int var47 = 0; var47 < arg0; var47++) {
            if (field436[var47] < -32768) {
                field436[var47] = -32768;
            }
            if (field436[var47] > 32767) {
                field436[var47] = 32767;
            }
        }
        return field436;
    }

    @ObfuscatedName("cm.ah(III)I")
    public final int method1074(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field448[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field449[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("cm.af(Lur;)V")
    public final void method1075(class535 arg0) {
        this.field434 = new class44();
        this.field434.method783(arg0);
        this.field432 = new class44();
        this.field432.method783(arg0);
        int var2 = arg0.method8462();
        if (var2 != 0) {
            arg0.field5233--;
            this.field433 = new class44();
            this.field433.method783(arg0);
            this.field450 = new class44();
            this.field450.method783(arg0);
        }
        int var3 = arg0.method8462();
        if (var3 != 0) {
            arg0.field5233--;
            this.field444 = new class44();
            this.field444.method783(arg0);
            this.field454 = new class44();
            this.field454.method783(arg0);
        }
        int var4 = arg0.method8462();
        if (var4 != 0) {
            arg0.field5233--;
            this.field431 = new class44();
            this.field431.method783(arg0);
            this.field438 = new class44();
            this.field438.method783(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method8676();
            if (var6 == 0) {
                break;
            }
            this.field439[var5] = var6;
            this.field456[var5] = arg0.method8477();
            this.field441[var5] = arg0.method8676();
        }
        this.field442 = arg0.method8676();
        this.field443 = arg0.method8676();
        this.field446 = arg0.method8670();
        this.field447 = arg0.method8670();
        this.field437 = new class59();
        this.field445 = new class44();
        this.field437.method1032(arg0, this.field445);
    }
}
