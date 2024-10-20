package deob;

import java.util.Random;

@ObfuscatedName("cq")
public class class62 {

    @ObfuscatedName("cq.au")
    public class44 field475;

    @ObfuscatedName("cq.ae")
    public class44 field486;

    @ObfuscatedName("cq.ao")
    public class44 field467;

    @ObfuscatedName("cq.at")
    public class44 field468;

    @ObfuscatedName("cq.ac")
    public class44 field474;

    @ObfuscatedName("cq.ai")
    public class44 field470;

    @ObfuscatedName("cq.az")
    public class44 field471;

    @ObfuscatedName("cq.ap")
    public class44 field472;

    @ObfuscatedName("cq.aa")
    public int[] field469 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("cq.af")
    public int[] field466 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("cq.ad")
    public int[] field482 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("cq.aq")
    public int field476 = 0;

    @ObfuscatedName("cq.al")
    public int field480 = 100;

    @ObfuscatedName("cq.an")
    public class59 field478;

    @ObfuscatedName("cq.ar")
    public class44 field479;

    @ObfuscatedName("cq.ab")
    public int field473 = 500;

    @ObfuscatedName("cq.ag")
    public int field481 = 0;

    @ObfuscatedName("cq.am")
    public static int[] field488;

    @ObfuscatedName("cq.ax")
    public static int[] field483 = new int[32768];

    @ObfuscatedName("cq.ah")
    public static int[] field484;

    @ObfuscatedName("cq.ay")
    public static int[] field485;

    @ObfuscatedName("cq.aj")
    public static int[] field487;

    @ObfuscatedName("cq.av")
    public static int[] field490;

    @ObfuscatedName("cq.aw")
    public static int[] field489;

    @ObfuscatedName("cq.ak")
    public static int[] field477;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field483[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field484 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field484[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field488 = new int[220500];
        field485 = new int[5];
        field487 = new int[5];
        field490 = new int[5];
        field489 = new int[5];
        field477 = new int[5];
    }

    @ObfuscatedName("cq.au(II)[I")
    public final int[] method1113(int arg0, int arg1) {
        class410.method7026(field488, 0, arg0);
        if (arg1 < 10) {
            return field488;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field475.method834();
        this.field486.method834();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field467 != null) {
            this.field467.method834();
            this.field468.method834();
            var5 = (int) ((double) (this.field467.field319 - this.field467.field322) * 32.768D / var3);
            var6 = (int) ((double) this.field467.field322 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field474 != null) {
            this.field474.method834();
            this.field470.method834();
            var8 = (int) ((double) (this.field474.field319 - this.field474.field322) * 32.768D / var3);
            var9 = (int) ((double) this.field474.field322 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field469[var11] != 0) {
                field485[var11] = 0;
                field487[var11] = (int) ((double) this.field482[var11] * var3);
                field490[var11] = (this.field469[var11] << 14) / 100;
                field489[var11] = (int) ((double) (this.field475.field319 - this.field475.field322) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field466[var11]) / var3);
                field477[var11] = (int) ((double) this.field475.field322 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field475.method832(arg0);
            int var14 = this.field486.method832(arg0);
            if (this.field467 != null) {
                int var15 = this.field467.method832(arg0);
                int var16 = this.field468.method832(arg0);
                var13 += this.method1117(var7, var16, this.field467.field323) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field474 != null) {
                int var17 = this.field474.method832(arg0);
                int var18 = this.field470.method832(arg0);
                var14 = var14 * ((this.method1117(var10, var18, this.field474.field323) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field469[var19] != 0) {
                    int var20 = field487[var19] + var12;
                    if (var20 < arg0) {
                        field488[var20] += this.method1117(field485[var19], field490[var19] * var14 >> 15, this.field475.field323);
                        field485[var19] += (field489[var19] * var13 >> 16) + field477[var19];
                    }
                }
            }
        }
        if (this.field471 != null) {
            this.field471.method834();
            this.field472.method834();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field471.method832(arg0);
                int var26 = this.field472.method832(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field471.field319 - this.field471.field322) * var25 >> 8) + this.field471.field322;
                } else {
                    var27 = ((this.field471.field319 - this.field471.field322) * var26 >> 8) + this.field471.field322;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field488[var24] = 0;
                }
            }
        }
        if (this.field476 > 0 && this.field480 > 0) {
            int var28 = (int) ((double) this.field476 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field488[var29] += field488[var29 - var28] * this.field480 / 100;
            }
        }
        if (this.field478.field438[0] > 0 || this.field478.field438[1] > 0) {
            this.field479.method834();
            int var30 = this.field479.method832(arg0 + 1);
            int var31 = this.field478.method1086(0, (float) var30 / 65536.0F);
            int var32 = this.field478.method1086(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field488[var31 + var33] * (long) Statics.field441 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field488[var31 + var33 - 1 - var36] * (long) class59.field433[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field488[var33 - 1 - var37] * (long) class59.field433[1][var37] >> 16);
                    }
                    field488[var33] = var35;
                    var30 = this.field479.method832(arg0 + 1);
                    var33++;
                }
                boolean var38 = true;
                int var39 = 128;
                while (true) {
                    if (var39 > arg0 - var31) {
                        var39 = arg0 - var31;
                    }
                    while (var33 < var39) {
                        int var40 = (int) ((long) field488[var31 + var33] * (long) Statics.field441 >> 16);
                        for (int var41 = 0; var41 < var31; var41++) {
                            var40 += (int) ((long) field488[var31 + var33 - 1 - var41] * (long) class59.field433[0][var41] >> 16);
                        }
                        for (int var42 = 0; var42 < var32; var42++) {
                            var40 -= (int) ((long) field488[var33 - 1 - var42] * (long) class59.field433[1][var42] >> 16);
                        }
                        field488[var33] = var40;
                        var30 = this.field479.method832(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var43 = 0;
                            for (int var44 = var31 + var33 - arg0; var44 < var31; var44++) {
                                var43 += (int) ((long) field488[var31 + var33 - 1 - var44] * (long) class59.field433[0][var44] >> 16);
                            }
                            for (int var45 = 0; var45 < var32; var45++) {
                                var43 -= (int) ((long) field488[var33 - 1 - var45] * (long) class59.field433[1][var45] >> 16);
                            }
                            field488[var33] = var43;
                            this.field479.method832(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field478.method1086(0, (float) var30 / 65536.0F);
                    var32 = this.field478.method1086(1, (float) var30 / 65536.0F);
                    var39 += 128;
                }
            }
        }
        for (int var47 = 0; var47 < arg0; var47++) {
            if (field488[var47] < -32768) {
                field488[var47] = -32768;
            }
            if (field488[var47] > 32767) {
                field488[var47] = 32767;
            }
        }
        return field488;
    }

    @ObfuscatedName("cq.ae(III)I")
    public final int method1117(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field484[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field483[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("cq.ao(Ltm;)V")
    public final void method1115(class515 arg0) {
        this.field475 = new class44();
        this.field475.method835(arg0);
        this.field486 = new class44();
        this.field486.method835(arg0);
        int var2 = arg0.method8300();
        if (var2 != 0) {
            arg0.field5111--;
            this.field467 = new class44();
            this.field467.method835(arg0);
            this.field468 = new class44();
            this.field468.method835(arg0);
        }
        int var3 = arg0.method8300();
        if (var3 != 0) {
            arg0.field5111--;
            this.field474 = new class44();
            this.field474.method835(arg0);
            this.field470 = new class44();
            this.field470.method835(arg0);
        }
        int var4 = arg0.method8300();
        if (var4 != 0) {
            arg0.field5111--;
            this.field471 = new class44();
            this.field471.method835(arg0);
            this.field472 = new class44();
            this.field472.method835(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method8436();
            if (var6 == 0) {
                break;
            }
            this.field469[var5] = var6;
            this.field466[var5] = arg0.method8315();
            this.field482[var5] = arg0.method8436();
        }
        this.field476 = arg0.method8436();
        this.field480 = arg0.method8436();
        this.field473 = arg0.method8448();
        this.field481 = arg0.method8448();
        this.field478 = new class59();
        this.field479 = new class44();
        this.field478.method1077(arg0, this.field479);
    }
}
