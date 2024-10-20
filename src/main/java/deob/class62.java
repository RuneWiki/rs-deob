package deob;

import java.util.Random;

@ObfuscatedName("cc")
public class class62 {

    @ObfuscatedName("cc.ak")
    public class44 field457;

    @ObfuscatedName("cc.al")
    public class44 field441;

    @ObfuscatedName("cc.aj")
    public class44 field442;

    @ObfuscatedName("cc.az")
    public class44 field443;

    @ObfuscatedName("cc.af")
    public class44 field444;

    @ObfuscatedName("cc.aa")
    public class44 field445;

    @ObfuscatedName("cc.at")
    public class44 field446;

    @ObfuscatedName("cc.ab")
    public class44 field464;

    @ObfuscatedName("cc.ac")
    public int[] field448 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("cc.ao")
    public int[] field459 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("cc.ah")
    public int[] field450 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("cc.av")
    public int field451 = 0;

    @ObfuscatedName("cc.aq")
    public int field452 = 100;

    @ObfuscatedName("cc.ap")
    public class59 field465;

    @ObfuscatedName("cc.ae")
    public class44 field454;

    @ObfuscatedName("cc.ax")
    public int field455 = 500;

    @ObfuscatedName("cc.ay")
    public int field453 = 0;

    @ObfuscatedName("cc.au")
    public static int[] field447;

    @ObfuscatedName("cc.as")
    public static int[] field458 = new int[32768];

    @ObfuscatedName("cc.aw")
    public static int[] field456;

    @ObfuscatedName("cc.ai")
    public static int[] field461;

    @ObfuscatedName("cc.an")
    public static int[] field462;

    @ObfuscatedName("cc.am")
    public static int[] field463;

    @ObfuscatedName("cc.ar")
    public static int[] field449;

    @ObfuscatedName("cc.ag")
    public static int[] field440;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field458[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field456 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field456[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field447 = new int[220500];
        field461 = new int[5];
        field462 = new int[5];
        field463 = new int[5];
        field449 = new int[5];
        field440 = new int[5];
    }

    @ObfuscatedName("cc.ak(II)[I")
    public final int[] method1093(int arg0, int arg1) {
        class447.method7642(field447, 0, arg0);
        if (arg1 < 10) {
            return field447;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field457.method811();
        this.field441.method811();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field442 != null) {
            this.field442.method811();
            this.field443.method811();
            var5 = (int) ((double) (this.field442.field304 - this.field442.field303) * 32.768D / var3);
            var6 = (int) ((double) this.field442.field303 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field444 != null) {
            this.field444.method811();
            this.field445.method811();
            var8 = (int) ((double) (this.field444.field304 - this.field444.field303) * 32.768D / var3);
            var9 = (int) ((double) this.field444.field303 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field448[var11] != 0) {
                field461[var11] = 0;
                field462[var11] = (int) ((double) this.field450[var11] * var3);
                field463[var11] = (this.field448[var11] << 14) / 100;
                field449[var11] = (int) ((double) (this.field457.field304 - this.field457.field303) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field459[var11]) / var3);
                field440[var11] = (int) ((double) this.field457.field303 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field457.method813(arg0);
            int var14 = this.field441.method813(arg0);
            if (this.field442 != null) {
                int var15 = this.field442.method813(arg0);
                int var16 = this.field443.method813(arg0);
                var13 += this.method1089(var7, var16, this.field442.field306) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field444 != null) {
                int var17 = this.field444.method813(arg0);
                int var18 = this.field445.method813(arg0);
                var14 = var14 * ((this.method1089(var10, var18, this.field444.field306) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field448[var19] != 0) {
                    int var20 = field462[var19] + var12;
                    if (var20 < arg0) {
                        field447[var20] += this.method1089(field461[var19], field463[var19] * var14 >> 15, this.field457.field306);
                        field461[var19] += (field449[var19] * var13 >> 16) + field440[var19];
                    }
                }
            }
        }
        if (this.field446 != null) {
            this.field446.method811();
            this.field464.method811();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field446.method813(arg0);
                int var26 = this.field464.method813(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field446.field304 - this.field446.field303) * var25 >> 8) + this.field446.field303;
                } else {
                    var27 = ((this.field446.field304 - this.field446.field303) * var26 >> 8) + this.field446.field303;
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
        if (this.field451 > 0 && this.field452 > 0) {
            int var28 = (int) ((double) this.field451 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field447[var29] += field447[var29 - var28] * this.field452 / 100;
            }
        }
        if (this.field465.field415[0] > 0 || this.field465.field415[1] > 0) {
            this.field454.method811();
            int var30 = this.field454.method813(arg0 + 1);
            int var31 = this.field465.method1059(0, (float) var30 / 65536.0F);
            int var32 = this.field465.method1059(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field447[var31 + var33] * (long) Statics.field424 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field447[var31 + var33 - 1 - var36] * (long) class59.field421[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field447[var33 - 1 - var37] * (long) class59.field421[1][var37] >> 16);
                    }
                    field447[var33] = var35;
                    var30 = this.field454.method813(arg0 + 1);
                    var33++;
                }
                boolean var38 = true;
                int var39 = 128;
                while (true) {
                    if (var39 > arg0 - var31) {
                        var39 = arg0 - var31;
                    }
                    while (var33 < var39) {
                        int var40 = (int) ((long) field447[var31 + var33] * (long) Statics.field424 >> 16);
                        for (int var41 = 0; var41 < var31; var41++) {
                            var40 += (int) ((long) field447[var31 + var33 - 1 - var41] * (long) class59.field421[0][var41] >> 16);
                        }
                        for (int var42 = 0; var42 < var32; var42++) {
                            var40 -= (int) ((long) field447[var33 - 1 - var42] * (long) class59.field421[1][var42] >> 16);
                        }
                        field447[var33] = var40;
                        var30 = this.field454.method813(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var43 = 0;
                            for (int var44 = var31 + var33 - arg0; var44 < var31; var44++) {
                                var43 += (int) ((long) field447[var31 + var33 - 1 - var44] * (long) class59.field421[0][var44] >> 16);
                            }
                            for (int var45 = 0; var45 < var32; var45++) {
                                var43 -= (int) ((long) field447[var33 - 1 - var45] * (long) class59.field421[1][var45] >> 16);
                            }
                            field447[var33] = var43;
                            this.field454.method813(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field465.method1059(0, (float) var30 / 65536.0F);
                    var32 = this.field465.method1059(1, (float) var30 / 65536.0F);
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

    @ObfuscatedName("cc.al(III)I")
    public final int method1089(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field456[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field458[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("cc.aj(Lua;)V")
    public final void method1092(class546 arg0) {
        this.field457 = new class44();
        this.field457.method810(arg0);
        this.field441 = new class44();
        this.field441.method810(arg0);
        int var2 = arg0.method8796();
        if (var2 != 0) {
            arg0.field5344--;
            this.field442 = new class44();
            this.field442.method810(arg0);
            this.field443 = new class44();
            this.field443.method810(arg0);
        }
        int var3 = arg0.method8796();
        if (var3 != 0) {
            arg0.field5344--;
            this.field444 = new class44();
            this.field444.method810(arg0);
            this.field445 = new class44();
            this.field445.method810(arg0);
        }
        int var4 = arg0.method8796();
        if (var4 != 0) {
            arg0.field5344--;
            this.field446 = new class44();
            this.field446.method810(arg0);
            this.field464 = new class44();
            this.field464.method810(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method8810();
            if (var6 == 0) {
                break;
            }
            this.field448[var5] = var6;
            this.field459[var5] = arg0.method8848();
            this.field450[var5] = arg0.method8810();
        }
        this.field451 = arg0.method8810();
        this.field452 = arg0.method8810();
        this.field455 = arg0.method8798();
        this.field453 = arg0.method8798();
        this.field465 = new class59();
        this.field454 = new class44();
        this.field465.method1060(arg0, this.field454);
    }
}
