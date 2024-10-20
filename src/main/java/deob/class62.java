package deob;

import java.util.Random;

@ObfuscatedName("co")
public class class62 {

    @ObfuscatedName("co.ac")
    public class44 field451;

    @ObfuscatedName("co.ae")
    public class44 field437;

    @ObfuscatedName("co.ag")
    public class44 field430;

    @ObfuscatedName("co.am")
    public class44 field433;

    @ObfuscatedName("co.ax")
    public class44 field434;

    @ObfuscatedName("co.aq")
    public class44 field435;

    @ObfuscatedName("co.af")
    public class44 field436;

    @ObfuscatedName("co.at")
    public class44 field439;

    @ObfuscatedName("co.au")
    public int[] field438 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("co.ar")
    public int[] field431 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("co.al")
    public int[] field432 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("co.ad")
    public int field441 = 0;

    @ObfuscatedName("co.ah")
    public int field446 = 100;

    @ObfuscatedName("co.ap")
    public class59 field443;

    @ObfuscatedName("co.ab")
    public class44 field444;

    @ObfuscatedName("co.az")
    public int field445 = 500;

    @ObfuscatedName("co.aa")
    public int field454 = 0;

    @ObfuscatedName("co.ai")
    public static int[] field447;

    @ObfuscatedName("co.ao")
    public static int[] field448 = new int[32768];

    @ObfuscatedName("co.as")
    public static int[] field449;

    @ObfuscatedName("co.aj")
    public static int[] field442;

    @ObfuscatedName("co.av")
    public static int[] field452;

    @ObfuscatedName("co.aw")
    public static int[] field453;

    @ObfuscatedName("co.an")
    public static int[] field440;

    @ObfuscatedName("co.ak")
    public static int[] field455;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field448[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field449 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field449[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field447 = new int[220500];
        field442 = new int[5];
        field452 = new int[5];
        field453 = new int[5];
        field440 = new int[5];
        field455 = new int[5];
    }

    @ObfuscatedName("co.ac(II)[I")
    public final int[] method1128(int arg0, int arg1) {
        class451.method7837(field447, 0, arg0);
        if (arg1 < 10) {
            return field447;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field451.method823();
        this.field437.method823();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field430 != null) {
            this.field430.method823();
            this.field433.method823();
            var5 = (int) ((double) (this.field430.field286 - this.field430.field285) * 32.768D / var3);
            var6 = (int) ((double) this.field430.field285 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field434 != null) {
            this.field434.method823();
            this.field435.method823();
            var8 = (int) ((double) (this.field434.field286 - this.field434.field285) * 32.768D / var3);
            var9 = (int) ((double) this.field434.field285 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field438[var11] != 0) {
                field442[var11] = 0;
                field452[var11] = (int) ((double) this.field432[var11] * var3);
                field453[var11] = (this.field438[var11] << 14) / 100;
                field440[var11] = (int) ((double) (this.field451.field286 - this.field451.field285) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field431[var11]) / var3);
                field455[var11] = (int) ((double) this.field451.field285 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field451.method828(arg0);
            int var14 = this.field437.method828(arg0);
            if (this.field430 != null) {
                int var15 = this.field430.method828(arg0);
                int var16 = this.field433.method828(arg0);
                var13 += this.method1140(var7, var16, this.field430.field292) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field434 != null) {
                int var17 = this.field434.method828(arg0);
                int var18 = this.field435.method828(arg0);
                var14 = var14 * ((this.method1140(var10, var18, this.field434.field292) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field438[var19] != 0) {
                    int var20 = field452[var19] + var12;
                    if (var20 < arg0) {
                        field447[var20] += this.method1140(field442[var19], field453[var19] * var14 >> 15, this.field451.field292);
                        field442[var19] += (field440[var19] * var13 >> 16) + field455[var19];
                    }
                }
            }
        }
        if (this.field436 != null) {
            this.field436.method823();
            this.field439.method823();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field436.method828(arg0);
                int var26 = this.field439.method828(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field436.field286 - this.field436.field285) * var25 >> 8) + this.field436.field285;
                } else {
                    var27 = ((this.field436.field286 - this.field436.field285) * var26 >> 8) + this.field436.field285;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field447[var24] = 0;
                }
            }
        }
        if (this.field441 > 0 && this.field446 > 0) {
            int var28 = (int) ((double) this.field441 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field447[var29] += field447[var29 - var28] * this.field446 / 100;
            }
        }
        if (this.field443.field411[0] > 0 || this.field443.field411[1] > 0) {
            this.field444.method823();
            int var30 = this.field444.method828(arg0 + 1);
            int var31 = this.field443.method1093(0, (float) var30 / 65536.0F);
            int var32 = this.field443.method1093(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field447[var31 + var33] * (long) Statics.field412 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field447[var31 + var33 - 1 - var36] * (long) class59.field408[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field447[var33 - 1 - var37] * (long) class59.field408[1][var37] >> 16);
                    }
                    field447[var33] = var35;
                    var30 = this.field444.method828(arg0 + 1);
                    var33++;
                }
                boolean var38 = true;
                int var39 = 128;
                while (true) {
                    if (var39 > arg0 - var31) {
                        var39 = arg0 - var31;
                    }
                    while (var33 < var39) {
                        int var40 = (int) ((long) field447[var31 + var33] * (long) Statics.field412 >> 16);
                        for (int var41 = 0; var41 < var31; var41++) {
                            var40 += (int) ((long) field447[var31 + var33 - 1 - var41] * (long) class59.field408[0][var41] >> 16);
                        }
                        for (int var42 = 0; var42 < var32; var42++) {
                            var40 -= (int) ((long) field447[var33 - 1 - var42] * (long) class59.field408[1][var42] >> 16);
                        }
                        field447[var33] = var40;
                        var30 = this.field444.method828(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var43 = 0;
                            for (int var44 = var31 + var33 - arg0; var44 < var31; var44++) {
                                var43 += (int) ((long) field447[var31 + var33 - 1 - var44] * (long) class59.field408[0][var44] >> 16);
                            }
                            for (int var45 = 0; var45 < var32; var45++) {
                                var43 -= (int) ((long) field447[var33 - 1 - var45] * (long) class59.field408[1][var45] >> 16);
                            }
                            field447[var33] = var43;
                            this.field444.method828(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field443.method1093(0, (float) var30 / 65536.0F);
                    var32 = this.field443.method1093(1, (float) var30 / 65536.0F);
                    var39 += 128;
                }
            }
        }
        for (int var47 = 0; var47 < arg0; var47++) {
            if (field447[var47] < -32768) {
                field447[var47] = -32768;
            }
            if (field447[var47] > 32767) {
                field447[var47] = 32767;
            }
        }
        return field447;
    }

    @ObfuscatedName("co.ae(III)I")
    public final int method1140(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field449[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field448[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("co.ag(Lvf;)V")
    public final void method1129(class551 arg0) {
        this.field451 = new class44();
        this.field451.method821(arg0);
        this.field437 = new class44();
        this.field437.method821(arg0);
        int var2 = arg0.method8955();
        if (var2 != 0) {
            arg0.field5415--;
            this.field430 = new class44();
            this.field430.method821(arg0);
            this.field433 = new class44();
            this.field433.method821(arg0);
        }
        int var3 = arg0.method8955();
        if (var3 != 0) {
            arg0.field5415--;
            this.field434 = new class44();
            this.field434.method821(arg0);
            this.field435 = new class44();
            this.field435.method821(arg0);
        }
        int var4 = arg0.method8955();
        if (var4 != 0) {
            arg0.field5415--;
            this.field436 = new class44();
            this.field436.method821(arg0);
            this.field439 = new class44();
            this.field439.method821(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method8989();
            if (var6 == 0) {
                break;
            }
            this.field438[var5] = var6;
            this.field431[var5] = arg0.method8957();
            this.field432[var5] = arg0.method8989();
        }
        this.field441 = arg0.method8989();
        this.field446 = arg0.method8989();
        this.field445 = arg0.method9119();
        this.field454 = arg0.method9119();
        this.field443 = new class59();
        this.field444 = new class44();
        this.field443.method1094(arg0, this.field444);
    }
}
