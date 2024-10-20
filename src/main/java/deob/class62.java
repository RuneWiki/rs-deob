package deob;

import java.util.Random;

@ObfuscatedName("cp")
public class class62 {

    @ObfuscatedName("cp.ac")
    public class44 field470;

    @ObfuscatedName("cp.al")
    public class44 field461;

    @ObfuscatedName("cp.ak")
    public class44 field462;

    @ObfuscatedName("cp.ax")
    public class44 field463;

    @ObfuscatedName("cp.ao")
    public class44 field464;

    @ObfuscatedName("cp.ah")
    public class44 field465;

    @ObfuscatedName("cp.ar")
    public class44 field466;

    @ObfuscatedName("cp.ab")
    public class44 field467;

    @ObfuscatedName("cp.am")
    public int[] field468 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("cp.av")
    public int[] field469 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("cp.ag")
    public int[] field485 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("cp.aa")
    public int field471 = 0;

    @ObfuscatedName("cp.ap")
    public int field478 = 100;

    @ObfuscatedName("cp.ay")
    public class59 field473;

    @ObfuscatedName("cp.as")
    public class44 field477;

    @ObfuscatedName("cp.aj")
    public int field475 = 500;

    @ObfuscatedName("cp.an")
    public int field474 = 0;

    @ObfuscatedName("cp.au")
    public static int[] field476;

    @ObfuscatedName("cp.ai")
    public static int[] field460 = new int[32768];

    @ObfuscatedName("cp.ae")
    public static int[] field479;

    @ObfuscatedName("cp.aq")
    public static int[] field481;

    @ObfuscatedName("cp.az")
    public static int[] field472;

    @ObfuscatedName("cp.at")
    public static int[] field482;

    @ObfuscatedName("cp.af")
    public static int[] field484;

    @ObfuscatedName("cp.ad")
    public static int[] field483;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field460[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field479 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field479[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field476 = new int[220500];
        field481 = new int[5];
        field472 = new int[5];
        field482 = new int[5];
        field484 = new int[5];
        field483 = new int[5];
    }

    @ObfuscatedName("cp.ac(II)[I")
    public final int[] method1114(int arg0, int arg1) {
        class425.method7092(field476, 0, arg0);
        if (arg1 < 10) {
            return field476;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field470.method810();
        this.field461.method810();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field462 != null) {
            this.field462.method810();
            this.field463.method810();
            var5 = (int) ((double) (this.field462.field313 - this.field462.field312) * 32.768D / var3);
            var6 = (int) ((double) this.field462.field312 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field464 != null) {
            this.field464.method810();
            this.field465.method810();
            var8 = (int) ((double) (this.field464.field313 - this.field464.field312) * 32.768D / var3);
            var9 = (int) ((double) this.field464.field312 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field468[var11] != 0) {
                field481[var11] = 0;
                field472[var11] = (int) ((double) this.field485[var11] * var3);
                field482[var11] = (this.field468[var11] << 14) / 100;
                field484[var11] = (int) ((double) (this.field470.field313 - this.field470.field312) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field469[var11]) / var3);
                field483[var11] = (int) ((double) this.field470.field312 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field470.method811(arg0);
            int var14 = this.field461.method811(arg0);
            if (this.field462 != null) {
                int var15 = this.field462.method811(arg0);
                int var16 = this.field463.method811(arg0);
                var13 += this.method1115(var7, var16, this.field462.field309) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field464 != null) {
                int var17 = this.field464.method811(arg0);
                int var18 = this.field465.method811(arg0);
                var14 = var14 * ((this.method1115(var10, var18, this.field464.field309) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field468[var19] != 0) {
                    int var20 = field472[var19] + var12;
                    if (var20 < arg0) {
                        field476[var20] += this.method1115(field481[var19], field482[var19] * var14 >> 15, this.field470.field309);
                        field481[var19] += (field484[var19] * var13 >> 16) + field483[var19];
                    }
                }
            }
        }
        if (this.field466 != null) {
            this.field466.method810();
            this.field467.method810();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field466.method811(arg0);
                int var26 = this.field467.method811(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field466.field313 - this.field466.field312) * var25 >> 8) + this.field466.field312;
                } else {
                    var27 = ((this.field466.field313 - this.field466.field312) * var26 >> 8) + this.field466.field312;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field476[var24] = 0;
                }
            }
        }
        if (this.field471 > 0 && this.field478 > 0) {
            int var28 = (int) ((double) this.field471 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field476[var29] += field476[var29 - var28] * this.field478 / 100;
            }
        }
        if (this.field473.field440[0] > 0 || this.field473.field440[1] > 0) {
            this.field477.method810();
            int var30 = this.field477.method811(arg0 + 1);
            int var31 = this.field473.method1071(0, (float) var30 / 65536.0F);
            int var32 = this.field473.method1071(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field476[var31 + var33] * (long) Statics.field439 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field476[var31 + var33 - 1 - var36] * (long) class59.field437[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field476[var33 - 1 - var37] * (long) class59.field437[1][var37] >> 16);
                    }
                    field476[var33] = var35;
                    var30 = this.field477.method811(arg0 + 1);
                    var33++;
                }
                boolean var38 = true;
                int var39 = 128;
                while (true) {
                    if (var39 > arg0 - var31) {
                        var39 = arg0 - var31;
                    }
                    while (var33 < var39) {
                        int var40 = (int) ((long) field476[var31 + var33] * (long) Statics.field439 >> 16);
                        for (int var41 = 0; var41 < var31; var41++) {
                            var40 += (int) ((long) field476[var31 + var33 - 1 - var41] * (long) class59.field437[0][var41] >> 16);
                        }
                        for (int var42 = 0; var42 < var32; var42++) {
                            var40 -= (int) ((long) field476[var33 - 1 - var42] * (long) class59.field437[1][var42] >> 16);
                        }
                        field476[var33] = var40;
                        var30 = this.field477.method811(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var43 = 0;
                            for (int var44 = var31 + var33 - arg0; var44 < var31; var44++) {
                                var43 += (int) ((long) field476[var31 + var33 - 1 - var44] * (long) class59.field437[0][var44] >> 16);
                            }
                            for (int var45 = 0; var45 < var32; var45++) {
                                var43 -= (int) ((long) field476[var33 - 1 - var45] * (long) class59.field437[1][var45] >> 16);
                            }
                            field476[var33] = var43;
                            this.field477.method811(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field473.method1071(0, (float) var30 / 65536.0F);
                    var32 = this.field473.method1071(1, (float) var30 / 65536.0F);
                    var39 += 128;
                }
            }
        }
        for (int var47 = 0; var47 < arg0; var47++) {
            if (field476[var47] < -32768) {
                field476[var47] = -32768;
            }
            if (field476[var47] > 32767) {
                field476[var47] = 32767;
            }
        }
        return field476;
    }

    @ObfuscatedName("cp.al(III)I")
    public final int method1115(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field479[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field460[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("cp.ak(Lul;)V")
    public final void method1116(class530 arg0) {
        this.field470 = new class44();
        this.field470.method805(arg0);
        this.field461 = new class44();
        this.field461.method805(arg0);
        int var2 = arg0.method8365();
        if (var2 != 0) {
            arg0.field5140--;
            this.field462 = new class44();
            this.field462.method805(arg0);
            this.field463 = new class44();
            this.field463.method805(arg0);
        }
        int var3 = arg0.method8365();
        if (var3 != 0) {
            arg0.field5140--;
            this.field464 = new class44();
            this.field464.method805(arg0);
            this.field465 = new class44();
            this.field465.method805(arg0);
        }
        int var4 = arg0.method8365();
        if (var4 != 0) {
            arg0.field5140--;
            this.field466 = new class44();
            this.field466.method805(arg0);
            this.field467 = new class44();
            this.field467.method805(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method8526();
            if (var6 == 0) {
                break;
            }
            this.field468[var5] = var6;
            this.field469[var5] = arg0.method8480();
            this.field485[var5] = arg0.method8526();
        }
        this.field471 = arg0.method8526();
        this.field478 = arg0.method8526();
        this.field475 = arg0.method8598();
        this.field474 = arg0.method8598();
        this.field473 = new class59();
        this.field477 = new class44();
        this.field473.method1072(arg0, this.field477);
    }
}
