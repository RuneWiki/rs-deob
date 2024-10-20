package deob;

import java.util.Random;

@ObfuscatedName("ch")
public class class62 {

    @ObfuscatedName("ch.aq")
    public class44 field425;

    @ObfuscatedName("ch.ad")
    public class44 field429;

    @ObfuscatedName("ch.ag")
    public class44 field418;

    @ObfuscatedName("ch.ak")
    public class44 field419;

    @ObfuscatedName("ch.ap")
    public class44 field431;

    @ObfuscatedName("ch.an")
    public class44 field421;

    @ObfuscatedName("ch.aj")
    public class44 field422;

    @ObfuscatedName("ch.av")
    public class44 field439;

    @ObfuscatedName("ch.ab")
    public int[] field424 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("ch.ai")
    public int[] field423 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("ch.ae")
    public int[] field426 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("ch.au")
    public int field427 = 0;

    @ObfuscatedName("ch.ah")
    public int field428 = 100;

    @ObfuscatedName("ch.az")
    public class59 field437;

    @ObfuscatedName("ch.ax")
    public class44 field430;

    @ObfuscatedName("ch.ac")
    public int field416 = 500;

    @ObfuscatedName("ch.al")
    public int field432 = 0;

    @ObfuscatedName("ch.ay")
    public static int[] field433;

    @ObfuscatedName("ch.ao")
    public static int[] field434 = new int[32768];

    @ObfuscatedName("ch.aa")
    public static int[] field417;

    @ObfuscatedName("ch.aw")
    public static int[] field420;

    @ObfuscatedName("ch.at")
    public static int[] field438;

    @ObfuscatedName("ch.af")
    public static int[] field436;

    @ObfuscatedName("ch.am")
    public static int[] field440;

    @ObfuscatedName("ch.ar")
    public static int[] field441;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field434[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field417 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field417[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field433 = new int[220500];
        field420 = new int[5];
        field438 = new int[5];
        field436 = new int[5];
        field440 = new int[5];
        field441 = new int[5];
    }

    @ObfuscatedName("ch.aq(II)[I")
    public final int[] method1109(int arg0, int arg1) {
        class448.method7593(field433, 0, arg0);
        if (arg1 < 10) {
            return field433;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field425.method830();
        this.field429.method830();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field418 != null) {
            this.field418.method830();
            this.field419.method830();
            var5 = (int) ((double) (this.field418.field288 - this.field418.field289) * 32.768D / var3);
            var6 = (int) ((double) this.field418.field289 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field431 != null) {
            this.field431.method830();
            this.field421.method830();
            var8 = (int) ((double) (this.field431.field288 - this.field431.field289) * 32.768D / var3);
            var9 = (int) ((double) this.field431.field289 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field424[var11] != 0) {
                field420[var11] = 0;
                field438[var11] = (int) ((double) this.field426[var11] * var3);
                field436[var11] = (this.field424[var11] << 14) / 100;
                field440[var11] = (int) ((double) (this.field425.field288 - this.field425.field289) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field423[var11]) / var3);
                field441[var11] = (int) ((double) this.field425.field289 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field425.method833(arg0);
            int var14 = this.field429.method833(arg0);
            if (this.field418 != null) {
                int var15 = this.field418.method833(arg0);
                int var16 = this.field419.method833(arg0);
                var13 += this.method1118(var7, var16, this.field418.field287) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field431 != null) {
                int var17 = this.field431.method833(arg0);
                int var18 = this.field421.method833(arg0);
                var14 = var14 * ((this.method1118(var10, var18, this.field431.field287) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field424[var19] != 0) {
                    int var20 = field438[var19] + var12;
                    if (var20 < arg0) {
                        field433[var20] += this.method1118(field420[var19], field436[var19] * var14 >> 15, this.field425.field287);
                        field420[var19] += (field440[var19] * var13 >> 16) + field441[var19];
                    }
                }
            }
        }
        if (this.field422 != null) {
            this.field422.method830();
            this.field439.method830();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field422.method833(arg0);
                int var26 = this.field439.method833(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field422.field288 - this.field422.field289) * var25 >> 8) + this.field422.field289;
                } else {
                    var27 = ((this.field422.field288 - this.field422.field289) * var26 >> 8) + this.field422.field289;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field433[var24] = 0;
                }
            }
        }
        if (this.field427 > 0 && this.field428 > 0) {
            int var28 = (int) ((double) this.field427 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field433[var29] += field433[var29 - var28] * this.field428 / 100;
            }
        }
        if (this.field437.field401[0] > 0 || this.field437.field401[1] > 0) {
            this.field430.method830();
            int var30 = this.field430.method833(arg0 + 1);
            int var31 = this.field437.method1074(0, (float) var30 / 65536.0F);
            int var32 = this.field437.method1074(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field433[var31 + var33] * (long) Statics.field398 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field433[var31 + var33 - 1 - var36] * (long) class59.field396[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field433[var33 - 1 - var37] * (long) class59.field396[1][var37] >> 16);
                    }
                    field433[var33] = var35;
                    var30 = this.field430.method833(arg0 + 1);
                    var33++;
                }
                boolean var38 = true;
                int var39 = 128;
                while (true) {
                    if (var39 > arg0 - var31) {
                        var39 = arg0 - var31;
                    }
                    while (var33 < var39) {
                        int var40 = (int) ((long) field433[var31 + var33] * (long) Statics.field398 >> 16);
                        for (int var41 = 0; var41 < var31; var41++) {
                            var40 += (int) ((long) field433[var31 + var33 - 1 - var41] * (long) class59.field396[0][var41] >> 16);
                        }
                        for (int var42 = 0; var42 < var32; var42++) {
                            var40 -= (int) ((long) field433[var33 - 1 - var42] * (long) class59.field396[1][var42] >> 16);
                        }
                        field433[var33] = var40;
                        var30 = this.field430.method833(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var43 = 0;
                            for (int var44 = var31 + var33 - arg0; var44 < var31; var44++) {
                                var43 += (int) ((long) field433[var31 + var33 - 1 - var44] * (long) class59.field396[0][var44] >> 16);
                            }
                            for (int var45 = 0; var45 < var32; var45++) {
                                var43 -= (int) ((long) field433[var33 - 1 - var45] * (long) class59.field396[1][var45] >> 16);
                            }
                            field433[var33] = var43;
                            this.field430.method833(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field437.method1074(0, (float) var30 / 65536.0F);
                    var32 = this.field437.method1074(1, (float) var30 / 65536.0F);
                    var39 += 128;
                }
            }
        }
        for (int var47 = 0; var47 < arg0; var47++) {
            if (field433[var47] < -32768) {
                field433[var47] = -32768;
            }
            if (field433[var47] > 32767) {
                field433[var47] = 32767;
            }
        }
        return field433;
    }

    @ObfuscatedName("ch.ad(III)I")
    public final int method1118(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field417[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field434[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ch.ag(Lvp;)V")
    public final void method1108(class547 arg0) {
        this.field425 = new class44();
        this.field425.method836(arg0);
        this.field429 = new class44();
        this.field429.method836(arg0);
        int var2 = arg0.method8804();
        if (var2 != 0) {
            arg0.field5363--;
            this.field418 = new class44();
            this.field418.method836(arg0);
            this.field419 = new class44();
            this.field419.method836(arg0);
        }
        int var3 = arg0.method8804();
        if (var3 != 0) {
            arg0.field5363--;
            this.field431 = new class44();
            this.field431.method836(arg0);
            this.field421 = new class44();
            this.field421.method836(arg0);
        }
        int var4 = arg0.method8804();
        if (var4 != 0) {
            arg0.field5363--;
            this.field422 = new class44();
            this.field422.method836(arg0);
            this.field439 = new class44();
            this.field439.method836(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method8744();
            if (var6 == 0) {
                break;
            }
            this.field424[var5] = var6;
            this.field423[var5] = arg0.method8743();
            this.field426[var5] = arg0.method8744();
        }
        this.field427 = arg0.method8744();
        this.field428 = arg0.method8744();
        this.field416 = arg0.method8899();
        this.field432 = arg0.method8899();
        this.field437 = new class59();
        this.field430 = new class44();
        this.field437.method1075(arg0, this.field430);
    }
}
