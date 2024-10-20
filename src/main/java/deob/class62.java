package deob;

import java.util.Random;

@ObfuscatedName("cq")
public class class62 {

    @ObfuscatedName("cq.aw")
    public class44 field465;

    @ObfuscatedName("cq.ay")
    public class44 field462;

    @ObfuscatedName("cq.ar")
    public class44 field463;

    @ObfuscatedName("cq.am")
    public class44 field473;

    @ObfuscatedName("cq.as")
    public class44 field478;

    @ObfuscatedName("cq.aj")
    public class44 field466;

    @ObfuscatedName("cq.ag")
    public class44 field467;

    @ObfuscatedName("cq.az")
    public class44 field471;

    @ObfuscatedName("cq.av")
    public int[] field469 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("cq.ap")
    public int[] field486 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("cq.aq")
    public int[] field470 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("cq.at")
    public int field472 = 0;

    @ObfuscatedName("cq.ah")
    public int field476 = 100;

    @ObfuscatedName("cq.ax")
    public class59 field474;

    @ObfuscatedName("cq.aa")
    public class44 field475;

    @ObfuscatedName("cq.au")
    public int field464 = 500;

    @ObfuscatedName("cq.ae")
    public int field477 = 0;

    @ObfuscatedName("cq.ab")
    public static int[] field483;

    @ObfuscatedName("cq.ad")
    public static int[] field479 = new int[32768];

    @ObfuscatedName("cq.ao")
    public static int[] field480;

    @ObfuscatedName("cq.ak")
    public static int[] field461;

    @ObfuscatedName("cq.an")
    public static int[] field485;

    @ObfuscatedName("cq.af")
    public static int[] field484;

    @ObfuscatedName("cq.ai")
    public static int[] field482;

    @ObfuscatedName("cq.al")
    public static int[] field468;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field479[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field480 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field480[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field483 = new int[220500];
        field461 = new int[5];
        field485 = new int[5];
        field484 = new int[5];
        field482 = new int[5];
        field468 = new int[5];
    }

    @ObfuscatedName("cq.aw(II)[I")
    public final int[] method1127(int arg0, int arg1) {
        class411.method6986(field483, 0, arg0);
        if (arg1 < 10) {
            return field483;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field465.method813();
        this.field462.method813();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field463 != null) {
            this.field463.method813();
            this.field473.method813();
            var5 = (int) ((double) (this.field463.field324 - this.field463.field323) * 32.768D / var3);
            var6 = (int) ((double) this.field463.field323 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field478 != null) {
            this.field478.method813();
            this.field466.method813();
            var8 = (int) ((double) (this.field478.field324 - this.field478.field323) * 32.768D / var3);
            var9 = (int) ((double) this.field478.field323 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field469[var11] != 0) {
                field461[var11] = 0;
                field485[var11] = (int) ((double) this.field470[var11] * var3);
                field484[var11] = (this.field469[var11] << 14) / 100;
                field482[var11] = (int) ((double) (this.field465.field324 - this.field465.field323) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field486[var11]) / var3);
                field468[var11] = (int) ((double) this.field465.field323 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field465.method814(arg0);
            int var14 = this.field462.method814(arg0);
            if (this.field463 != null) {
                int var15 = this.field463.method814(arg0);
                int var16 = this.field473.method814(arg0);
                var13 += this.method1131(var7, var16, this.field463.field327) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field478 != null) {
                int var17 = this.field478.method814(arg0);
                int var18 = this.field466.method814(arg0);
                var14 = var14 * ((this.method1131(var10, var18, this.field478.field327) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field469[var19] != 0) {
                    int var20 = field485[var19] + var12;
                    if (var20 < arg0) {
                        field483[var20] += this.method1131(field461[var19], field484[var19] * var14 >> 15, this.field465.field327);
                        field461[var19] += (field482[var19] * var13 >> 16) + field468[var19];
                    }
                }
            }
        }
        if (this.field467 != null) {
            this.field467.method813();
            this.field471.method813();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field467.method814(arg0);
                int var26 = this.field471.method814(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field467.field324 - this.field467.field323) * var25 >> 8) + this.field467.field323;
                } else {
                    var27 = ((this.field467.field324 - this.field467.field323) * var26 >> 8) + this.field467.field323;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field483[var24] = 0;
                }
            }
        }
        if (this.field472 > 0 && this.field476 > 0) {
            int var28 = (int) ((double) this.field472 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field483[var29] += field483[var29 - var28] * this.field476 / 100;
            }
        }
        if (this.field474.field443[0] > 0 || this.field474.field443[1] > 0) {
            this.field475.method813();
            int var30 = this.field475.method814(arg0 + 1);
            int var31 = this.field474.method1079(0, (float) var30 / 65536.0F);
            int var32 = this.field474.method1079(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field483[var31 + var33] * (long) Statics.field447 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field483[var31 + var33 - 1 - var36] * (long) class59.field444[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field483[var33 - 1 - var37] * (long) class59.field444[1][var37] >> 16);
                    }
                    field483[var33] = var35;
                    var30 = this.field475.method814(arg0 + 1);
                    var33++;
                }
                boolean var38 = true;
                int var39 = 128;
                while (true) {
                    if (var39 > arg0 - var31) {
                        var39 = arg0 - var31;
                    }
                    while (var33 < var39) {
                        int var40 = (int) ((long) field483[var31 + var33] * (long) Statics.field447 >> 16);
                        for (int var41 = 0; var41 < var31; var41++) {
                            var40 += (int) ((long) field483[var31 + var33 - 1 - var41] * (long) class59.field444[0][var41] >> 16);
                        }
                        for (int var42 = 0; var42 < var32; var42++) {
                            var40 -= (int) ((long) field483[var33 - 1 - var42] * (long) class59.field444[1][var42] >> 16);
                        }
                        field483[var33] = var40;
                        var30 = this.field475.method814(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var43 = 0;
                            for (int var44 = var31 + var33 - arg0; var44 < var31; var44++) {
                                var43 += (int) ((long) field483[var31 + var33 - 1 - var44] * (long) class59.field444[0][var44] >> 16);
                            }
                            for (int var45 = 0; var45 < var32; var45++) {
                                var43 -= (int) ((long) field483[var33 - 1 - var45] * (long) class59.field444[1][var45] >> 16);
                            }
                            field483[var33] = var43;
                            this.field475.method814(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field474.method1079(0, (float) var30 / 65536.0F);
                    var32 = this.field474.method1079(1, (float) var30 / 65536.0F);
                    var39 += 128;
                }
            }
        }
        for (int var47 = 0; var47 < arg0; var47++) {
            if (field483[var47] < -32768) {
                field483[var47] = -32768;
            }
            if (field483[var47] > 32767) {
                field483[var47] = 32767;
            }
        }
        return field483;
    }

    @ObfuscatedName("cq.ay(III)I")
    public final int method1131(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field480[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field479[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("cq.ar(Lty;)V")
    public final void method1132(class514 arg0) {
        this.field465 = new class44();
        this.field465.method811(arg0);
        this.field462 = new class44();
        this.field462.method811(arg0);
        int var2 = arg0.method8244();
        if (var2 != 0) {
            arg0.field5072--;
            this.field463 = new class44();
            this.field463.method811(arg0);
            this.field473 = new class44();
            this.field473.method811(arg0);
        }
        int var3 = arg0.method8244();
        if (var3 != 0) {
            arg0.field5072--;
            this.field478 = new class44();
            this.field478.method811(arg0);
            this.field466 = new class44();
            this.field466.method811(arg0);
        }
        int var4 = arg0.method8244();
        if (var4 != 0) {
            arg0.field5072--;
            this.field467 = new class44();
            this.field467.method811(arg0);
            this.field471 = new class44();
            this.field471.method811(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method8260();
            if (var6 == 0) {
                break;
            }
            this.field469[var5] = var6;
            this.field486[var5] = arg0.method8259();
            this.field470[var5] = arg0.method8260();
        }
        this.field472 = arg0.method8260();
        this.field476 = arg0.method8260();
        this.field464 = arg0.method8246();
        this.field477 = arg0.method8246();
        this.field474 = new class59();
        this.field475 = new class44();
        this.field474.method1088(arg0, this.field475);
    }
}
