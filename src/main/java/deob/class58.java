package deob;

import java.util.Random;

@ObfuscatedName("cn")
public class class58 {

    @ObfuscatedName("cn.aj")
    public class44 field437;

    @ObfuscatedName("cn.al")
    public class44 field436;

    @ObfuscatedName("cn.ac")
    public class44 field422;

    @ObfuscatedName("cn.ab")
    public class44 field423;

    @ObfuscatedName("cn.an")
    public class44 field424;

    @ObfuscatedName("cn.ao")
    public class44 field435;

    @ObfuscatedName("cn.av")
    public class44 field426;

    @ObfuscatedName("cn.aq")
    public class44 field427;

    @ObfuscatedName("cn.ap")
    public int[] field428 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("cn.ar")
    public int[] field421 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("cn.ak")
    public int[] field430 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("cn.ax")
    public int field431 = 0;

    @ObfuscatedName("cn.as")
    public int field432 = 100;

    @ObfuscatedName("cn.ay")
    public class57 field444;

    @ObfuscatedName("cn.am")
    public class44 field434;

    @ObfuscatedName("cn.az")
    public int field429 = 500;

    @ObfuscatedName("cn.ae")
    public int field441 = 0;

    @ObfuscatedName("cn.au")
    public static int[] field425;

    @ObfuscatedName("cn.ag")
    public static int[] field438 = new int[32768];

    @ObfuscatedName("cn.at")
    public static int[] field439;

    @ObfuscatedName("cn.ai")
    public static int[] field420;

    @ObfuscatedName("cn.aw")
    public static int[] field442;

    @ObfuscatedName("cn.aa")
    public static int[] field443;

    @ObfuscatedName("cn.ah")
    public static int[] field433;

    @ObfuscatedName("cn.ad")
    public static int[] field445;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field438[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field439 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field439[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field425 = new int[220500];
        field420 = new int[5];
        field442 = new int[5];
        field443 = new int[5];
        field433 = new int[5];
        field445 = new int[5];
    }

    @ObfuscatedName("cn.aj(II)[I")
    public final int[] method1070(int arg0, int arg1) {
        class381.method6683(field425, 0, arg0);
        if (arg1 < 10) {
            return field425;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field437.method796();
        this.field436.method796();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field422 != null) {
            this.field422.method796();
            this.field423.method796();
            var5 = (int) ((double) (this.field422.field316 - this.field422.field310) * 32.768D / var3);
            var6 = (int) ((double) this.field422.field310 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field424 != null) {
            this.field424.method796();
            this.field435.method796();
            var8 = (int) ((double) (this.field424.field316 - this.field424.field310) * 32.768D / var3);
            var9 = (int) ((double) this.field424.field310 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field428[var11] != 0) {
                field420[var11] = 0;
                field442[var11] = (int) ((double) this.field430[var11] * var3);
                field443[var11] = (this.field428[var11] << 14) / 100;
                field433[var11] = (int) ((double) (this.field437.field316 - this.field437.field310) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field421[var11]) / var3);
                field445[var11] = (int) ((double) this.field437.field310 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field437.method793(arg0);
            int var14 = this.field436.method793(arg0);
            if (this.field422 != null) {
                int var15 = this.field422.method793(arg0);
                int var16 = this.field423.method793(arg0);
                var13 += this.method1074(var7, var16, this.field422.field312) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field424 != null) {
                int var17 = this.field424.method793(arg0);
                int var18 = this.field435.method793(arg0);
                var14 = var14 * ((this.method1074(var10, var18, this.field424.field312) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field428[var19] != 0) {
                    int var20 = field442[var19] + var12;
                    if (var20 < arg0) {
                        field425[var20] += this.method1074(field420[var19], field443[var19] * var14 >> 15, this.field437.field312);
                        field420[var19] += (field433[var19] * var13 >> 16) + field445[var19];
                    }
                }
            }
        }
        if (this.field426 != null) {
            this.field426.method796();
            this.field427.method796();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field426.method793(arg0);
                int var26 = this.field427.method793(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field426.field316 - this.field426.field310) * var25 >> 8) + this.field426.field310;
                } else {
                    var27 = ((this.field426.field316 - this.field426.field310) * var26 >> 8) + this.field426.field310;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field425[var24] = 0;
                }
            }
        }
        if (this.field431 > 0 && this.field432 > 0) {
            int var28 = (int) ((double) this.field431 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field425[var29] += field425[var29 - var28] * this.field432 / 100;
            }
        }
        if (this.field444.field410[0] > 0 || this.field444.field410[1] > 0) {
            this.field434.method796();
            int var30 = this.field434.method793(arg0 + 1);
            int var31 = this.field444.method1064(0, (float) var30 / 65536.0F);
            int var32 = this.field444.method1064(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field425[var31 + var33] * (long) Statics.field416 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field425[var31 + var33 - 1 - var36] * (long) class57.field414[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field425[var33 - 1 - var37] * (long) class57.field414[1][var37] >> 16);
                    }
                    field425[var33] = var35;
                    var30 = this.field434.method793(arg0 + 1);
                    var33++;
                }
                boolean var38 = true;
                int var39 = 128;
                while (true) {
                    if (var39 > arg0 - var31) {
                        var39 = arg0 - var31;
                    }
                    while (var33 < var39) {
                        int var40 = (int) ((long) field425[var31 + var33] * (long) Statics.field416 >> 16);
                        for (int var41 = 0; var41 < var31; var41++) {
                            var40 += (int) ((long) field425[var31 + var33 - 1 - var41] * (long) class57.field414[0][var41] >> 16);
                        }
                        for (int var42 = 0; var42 < var32; var42++) {
                            var40 -= (int) ((long) field425[var33 - 1 - var42] * (long) class57.field414[1][var42] >> 16);
                        }
                        field425[var33] = var40;
                        var30 = this.field434.method793(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var43 = 0;
                            for (int var44 = var31 + var33 - arg0; var44 < var31; var44++) {
                                var43 += (int) ((long) field425[var31 + var33 - 1 - var44] * (long) class57.field414[0][var44] >> 16);
                            }
                            for (int var45 = 0; var45 < var32; var45++) {
                                var43 -= (int) ((long) field425[var33 - 1 - var45] * (long) class57.field414[1][var45] >> 16);
                            }
                            field425[var33] = var43;
                            this.field434.method793(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field444.method1064(0, (float) var30 / 65536.0F);
                    var32 = this.field444.method1064(1, (float) var30 / 65536.0F);
                    var39 += 128;
                }
            }
        }
        for (int var47 = 0; var47 < arg0; var47++) {
            if (field425[var47] < -32768) {
                field425[var47] = -32768;
            }
            if (field425[var47] > 32767) {
                field425[var47] = 32767;
            }
        }
        return field425;
    }

    @ObfuscatedName("cn.al(III)I")
    public final int method1074(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field439[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field438[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("cn.ac(Lsy;)V")
    public final void method1072(class478 arg0) {
        this.field437 = new class44();
        this.field437.method791(arg0);
        this.field436 = new class44();
        this.field436.method791(arg0);
        int var2 = arg0.method7909();
        if (var2 != 0) {
            arg0.field4904--;
            this.field422 = new class44();
            this.field422.method791(arg0);
            this.field423 = new class44();
            this.field423.method791(arg0);
        }
        int var3 = arg0.method7909();
        if (var3 != 0) {
            arg0.field4904--;
            this.field424 = new class44();
            this.field424.method791(arg0);
            this.field435 = new class44();
            this.field435.method791(arg0);
        }
        int var4 = arg0.method7909();
        if (var4 != 0) {
            arg0.field4904--;
            this.field426 = new class44();
            this.field426.method791(arg0);
            this.field427 = new class44();
            this.field427.method791(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method7918();
            if (var6 == 0) {
                break;
            }
            this.field428[var5] = var6;
            this.field421[var5] = arg0.method7917();
            this.field430[var5] = arg0.method7918();
        }
        this.field431 = arg0.method7918();
        this.field432 = arg0.method7918();
        this.field429 = arg0.method7905();
        this.field441 = arg0.method7905();
        this.field444 = new class57();
        this.field434 = new class44();
        this.field444.method1059(arg0, this.field434);
    }
}
