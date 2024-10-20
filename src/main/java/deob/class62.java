package deob;

import java.util.Random;

@ObfuscatedName("cc")
public class class62 {

    @ObfuscatedName("cc.am")
    public class44 field459;

    @ObfuscatedName("cc.ap")
    public class44 field442;

    @ObfuscatedName("cc.af")
    public class44 field443;

    @ObfuscatedName("cc.aj")
    public class44 field453;

    @ObfuscatedName("cc.aq")
    public class44 field454;

    @ObfuscatedName("cc.ar")
    public class44 field446;

    @ObfuscatedName("cc.ag")
    public class44 field447;

    @ObfuscatedName("cc.ao")
    public class44 field448;

    @ObfuscatedName("cc.ae")
    public int[] field450 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("cc.aa")
    public int[] field455 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("cc.au")
    public int[] field451 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("cc.an")
    public int field452 = 0;

    @ObfuscatedName("cc.ad")
    public int field460 = 100;

    @ObfuscatedName("cc.ax")
    public class59 field441;

    @ObfuscatedName("cc.aw")
    public class44 field463;

    @ObfuscatedName("cc.az")
    public int field456 = 500;

    @ObfuscatedName("cc.av")
    public int field457 = 0;

    @ObfuscatedName("cc.ak")
    public static int[] field458;

    @ObfuscatedName("cc.ay")
    public static int[] field445 = new int[32768];

    @ObfuscatedName("cc.as")
    public static int[] field449;

    @ObfuscatedName("cc.ah")
    public static int[] field462;

    @ObfuscatedName("cc.ai")
    public static int[] field444;

    @ObfuscatedName("cc.ac")
    public static int[] field464;

    @ObfuscatedName("cc.al")
    public static int[] field465;

    @ObfuscatedName("cc.at")
    public static int[] field466;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field445[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field449 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field449[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field458 = new int[220500];
        field462 = new int[5];
        field444 = new int[5];
        field464 = new int[5];
        field465 = new int[5];
        field466 = new int[5];
    }

    @ObfuscatedName("cc.am(II)[I")
    public final int[] method1138(int arg0, int arg1) {
        class426.method7289(field458, 0, arg0);
        if (arg1 < 10) {
            return field458;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field459.method839();
        this.field442.method839();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field443 != null) {
            this.field443.method839();
            this.field453.method839();
            var5 = (int) ((double) (this.field443.field305 - this.field443.field301) * 32.768D / var3);
            var6 = (int) ((double) this.field443.field301 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field454 != null) {
            this.field454.method839();
            this.field446.method839();
            var8 = (int) ((double) (this.field454.field305 - this.field454.field301) * 32.768D / var3);
            var9 = (int) ((double) this.field454.field301 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field450[var11] != 0) {
                field462[var11] = 0;
                field444[var11] = (int) ((double) this.field451[var11] * var3);
                field464[var11] = (this.field450[var11] << 14) / 100;
                field465[var11] = (int) ((double) (this.field459.field305 - this.field459.field301) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field455[var11]) / var3);
                field466[var11] = (int) ((double) this.field459.field301 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field459.method838(arg0);
            int var14 = this.field442.method838(arg0);
            if (this.field443 != null) {
                int var15 = this.field443.method838(arg0);
                int var16 = this.field453.method838(arg0);
                var13 += this.method1139(var7, var16, this.field443.field311) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field454 != null) {
                int var17 = this.field454.method838(arg0);
                int var18 = this.field446.method838(arg0);
                var14 = var14 * ((this.method1139(var10, var18, this.field454.field311) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field450[var19] != 0) {
                    int var20 = field444[var19] + var12;
                    if (var20 < arg0) {
                        field458[var20] += this.method1139(field462[var19], field464[var19] * var14 >> 15, this.field459.field311);
                        field462[var19] += (field465[var19] * var13 >> 16) + field466[var19];
                    }
                }
            }
        }
        if (this.field447 != null) {
            this.field447.method839();
            this.field448.method839();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field447.method838(arg0);
                int var26 = this.field448.method838(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field447.field305 - this.field447.field301) * var25 >> 8) + this.field447.field301;
                } else {
                    var27 = ((this.field447.field305 - this.field447.field301) * var26 >> 8) + this.field447.field301;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field458[var24] = 0;
                }
            }
        }
        if (this.field452 > 0 && this.field460 > 0) {
            int var28 = (int) ((double) this.field452 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field458[var29] += field458[var29 - var28] * this.field460 / 100;
            }
        }
        if (this.field441.field423[0] > 0 || this.field441.field423[1] > 0) {
            this.field463.method839();
            int var30 = this.field463.method838(arg0 + 1);
            int var31 = this.field441.method1090(0, (float) var30 / 65536.0F);
            int var32 = this.field441.method1090(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field458[var31 + var33] * (long) Statics.field421 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field458[var31 + var33 - 1 - var36] * (long) class59.field415[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field458[var33 - 1 - var37] * (long) class59.field415[1][var37] >> 16);
                    }
                    field458[var33] = var35;
                    var30 = this.field463.method838(arg0 + 1);
                    var33++;
                }
                boolean var38 = true;
                int var39 = 128;
                while (true) {
                    if (var39 > arg0 - var31) {
                        var39 = arg0 - var31;
                    }
                    while (var33 < var39) {
                        int var40 = (int) ((long) field458[var31 + var33] * (long) Statics.field421 >> 16);
                        for (int var41 = 0; var41 < var31; var41++) {
                            var40 += (int) ((long) field458[var31 + var33 - 1 - var41] * (long) class59.field415[0][var41] >> 16);
                        }
                        for (int var42 = 0; var42 < var32; var42++) {
                            var40 -= (int) ((long) field458[var33 - 1 - var42] * (long) class59.field415[1][var42] >> 16);
                        }
                        field458[var33] = var40;
                        var30 = this.field463.method838(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var43 = 0;
                            for (int var44 = var31 + var33 - arg0; var44 < var31; var44++) {
                                var43 += (int) ((long) field458[var31 + var33 - 1 - var44] * (long) class59.field415[0][var44] >> 16);
                            }
                            for (int var45 = 0; var45 < var32; var45++) {
                                var43 -= (int) ((long) field458[var33 - 1 - var45] * (long) class59.field415[1][var45] >> 16);
                            }
                            field458[var33] = var43;
                            this.field463.method838(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field441.method1090(0, (float) var30 / 65536.0F);
                    var32 = this.field441.method1090(1, (float) var30 / 65536.0F);
                    var39 += 128;
                }
            }
        }
        for (int var47 = 0; var47 < arg0; var47++) {
            if (field458[var47] < -32768) {
                field458[var47] = -32768;
            }
            if (field458[var47] > 32767) {
                field458[var47] = 32767;
            }
        }
        return field458;
    }

    @ObfuscatedName("cc.ap(III)I")
    public final int method1139(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field449[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field445[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("cc.af(Luk;)V")
    public final void method1141(class531 arg0) {
        this.field459 = new class44();
        this.field459.method836(arg0);
        this.field442 = new class44();
        this.field442.method836(arg0);
        int var2 = arg0.method8561();
        if (var2 != 0) {
            arg0.field5181--;
            this.field443 = new class44();
            this.field443.method836(arg0);
            this.field453 = new class44();
            this.field453.method836(arg0);
        }
        int var3 = arg0.method8561();
        if (var3 != 0) {
            arg0.field5181--;
            this.field454 = new class44();
            this.field454.method836(arg0);
            this.field446 = new class44();
            this.field446.method836(arg0);
        }
        int var4 = arg0.method8561();
        if (var4 != 0) {
            arg0.field5181--;
            this.field447 = new class44();
            this.field447.method836(arg0);
            this.field448 = new class44();
            this.field448.method836(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method8576();
            if (var6 == 0) {
                break;
            }
            this.field450[var5] = var6;
            this.field455[var5] = arg0.method8631();
            this.field451[var5] = arg0.method8576();
        }
        this.field452 = arg0.method8576();
        this.field460 = arg0.method8576();
        this.field456 = arg0.method8775();
        this.field457 = arg0.method8775();
        this.field441 = new class59();
        this.field463 = new class44();
        this.field441.method1092(arg0, this.field463);
    }
}
