package deob;

import java.util.Random;

@ObfuscatedName("ca")
public class class58 {

    @ObfuscatedName("ca.af")
    public class44 field453;

    @ObfuscatedName("ca.an")
    public class44 field436;

    @ObfuscatedName("ca.aw")
    public class44 field437;

    @ObfuscatedName("ca.ac")
    public class44 field438;

    @ObfuscatedName("ca.au")
    public class44 field439;

    @ObfuscatedName("ca.ab")
    public class44 field440;

    @ObfuscatedName("ca.aq")
    public class44 field441;

    @ObfuscatedName("ca.al")
    public class44 field442;

    @ObfuscatedName("ca.at")
    public int[] field435 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("ca.aa")
    public int[] field444 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("ca.ay")
    public int[] field451 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("ca.ao")
    public int field446 = 0;

    @ObfuscatedName("ca.ax")
    public int field447 = 100;

    @ObfuscatedName("ca.ai")
    public class57 field455;

    @ObfuscatedName("ca.ag")
    public class44 field452;

    @ObfuscatedName("ca.ah")
    public int field443 = 500;

    @ObfuscatedName("ca.av")
    public int field445 = 0;

    @ObfuscatedName("ca.ar")
    public static int[] field449;

    @ObfuscatedName("ca.am")
    public static int[] field450 = new int[32768];

    @ObfuscatedName("ca.as")
    public static int[] field454;

    @ObfuscatedName("ca.ak")
    public static int[] field459;

    @ObfuscatedName("ca.az")
    public static int[] field457;

    @ObfuscatedName("ca.ad")
    public static int[] field458;

    @ObfuscatedName("ca.ae")
    public static int[] field448;

    @ObfuscatedName("ca.ap")
    public static int[] field460;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field450[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field454 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field454[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field449 = new int[220500];
        field459 = new int[5];
        field457 = new int[5];
        field458 = new int[5];
        field448 = new int[5];
        field460 = new int[5];
    }

    @ObfuscatedName("ca.af(II)[I")
    public final int[] method1085(int arg0, int arg1) {
        class385.method6904(field449, 0, arg0);
        if (arg1 < 10) {
            return field449;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field453.method844();
        this.field436.method844();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field437 != null) {
            this.field437.method844();
            this.field438.method844();
            var5 = (int) ((double) (this.field437.field322 - this.field437.field321) * 32.768D / var3);
            var6 = (int) ((double) this.field437.field321 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field439 != null) {
            this.field439.method844();
            this.field440.method844();
            var8 = (int) ((double) (this.field439.field322 - this.field439.field321) * 32.768D / var3);
            var9 = (int) ((double) this.field439.field321 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field435[var11] != 0) {
                field459[var11] = 0;
                field457[var11] = (int) ((double) this.field451[var11] * var3);
                field458[var11] = (this.field435[var11] << 14) / 100;
                field448[var11] = (int) ((double) (this.field453.field322 - this.field453.field321) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field444[var11]) / var3);
                field460[var11] = (int) ((double) this.field453.field321 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field453.method841(arg0);
            int var14 = this.field436.method841(arg0);
            if (this.field437 != null) {
                int var15 = this.field437.method841(arg0);
                int var16 = this.field438.method841(arg0);
                var13 += this.method1086(var7, var16, this.field437.field318) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field439 != null) {
                int var17 = this.field439.method841(arg0);
                int var18 = this.field440.method841(arg0);
                var14 = var14 * ((this.method1086(var10, var18, this.field439.field318) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field435[var19] != 0) {
                    int var20 = field457[var19] + var12;
                    if (var20 < arg0) {
                        field449[var20] += this.method1086(field459[var19], field458[var19] * var14 >> 15, this.field453.field318);
                        field459[var19] += (field448[var19] * var13 >> 16) + field460[var19];
                    }
                }
            }
        }
        if (this.field441 != null) {
            this.field441.method844();
            this.field442.method844();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field441.method841(arg0);
                int var26 = this.field442.method841(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field441.field322 - this.field441.field321) * var25 >> 8) + this.field441.field321;
                } else {
                    var27 = ((this.field441.field322 - this.field441.field321) * var26 >> 8) + this.field441.field321;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field449[var24] = 0;
                }
            }
        }
        if (this.field446 > 0 && this.field447 > 0) {
            int var28 = (int) ((double) this.field446 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field449[var29] += field449[var29 - var28] * this.field447 / 100;
            }
        }
        if (this.field455.field429[0] > 0 || this.field455.field429[1] > 0) {
            this.field452.method844();
            int var30 = this.field452.method841(arg0 + 1);
            int var31 = this.field455.method1082(0, (float) var30 / 65536.0F);
            int var32 = this.field455.method1082(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field449[var31 + var33] * (long) Statics.field431 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field449[var31 + var33 - 1 - var36] * (long) class57.field434[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field449[var33 - 1 - var37] * (long) class57.field434[1][var37] >> 16);
                    }
                    field449[var33] = var35;
                    var30 = this.field452.method841(arg0 + 1);
                    var33++;
                }
                boolean var38 = true;
                int var39 = 128;
                while (true) {
                    if (var39 > arg0 - var31) {
                        var39 = arg0 - var31;
                    }
                    while (var33 < var39) {
                        int var40 = (int) ((long) field449[var31 + var33] * (long) Statics.field431 >> 16);
                        for (int var41 = 0; var41 < var31; var41++) {
                            var40 += (int) ((long) field449[var31 + var33 - 1 - var41] * (long) class57.field434[0][var41] >> 16);
                        }
                        for (int var42 = 0; var42 < var32; var42++) {
                            var40 -= (int) ((long) field449[var33 - 1 - var42] * (long) class57.field434[1][var42] >> 16);
                        }
                        field449[var33] = var40;
                        var30 = this.field452.method841(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var43 = 0;
                            for (int var44 = var31 + var33 - arg0; var44 < var31; var44++) {
                                var43 += (int) ((long) field449[var31 + var33 - 1 - var44] * (long) class57.field434[0][var44] >> 16);
                            }
                            for (int var45 = 0; var45 < var32; var45++) {
                                var43 -= (int) ((long) field449[var33 - 1 - var45] * (long) class57.field434[1][var45] >> 16);
                            }
                            field449[var33] = var43;
                            this.field452.method841(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field455.method1082(0, (float) var30 / 65536.0F);
                    var32 = this.field455.method1082(1, (float) var30 / 65536.0F);
                    var39 += 128;
                }
            }
        }
        for (int var47 = 0; var47 < arg0; var47++) {
            if (field449[var47] < -32768) {
                field449[var47] = -32768;
            }
            if (field449[var47] > 32767) {
                field449[var47] = 32767;
            }
        }
        return field449;
    }

    @ObfuscatedName("ca.an(III)I")
    public final int method1086(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field454[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field450[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ca.aw(Lsg;)V")
    public final void method1088(class489 arg0) {
        this.field453 = new class44();
        this.field453.method839(arg0);
        this.field436 = new class44();
        this.field436.method839(arg0);
        int var2 = arg0.method8248();
        if (var2 != 0) {
            arg0.field4989--;
            this.field437 = new class44();
            this.field437.method839(arg0);
            this.field438 = new class44();
            this.field438.method839(arg0);
        }
        int var3 = arg0.method8248();
        if (var3 != 0) {
            arg0.field4989--;
            this.field439 = new class44();
            this.field439.method839(arg0);
            this.field440 = new class44();
            this.field440.method839(arg0);
        }
        int var4 = arg0.method8248();
        if (var4 != 0) {
            arg0.field4989--;
            this.field441 = new class44();
            this.field441.method839(arg0);
            this.field442 = new class44();
            this.field442.method839(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method8417();
            if (var6 == 0) {
                break;
            }
            this.field435[var5] = var6;
            this.field444[var5] = arg0.method8263();
            this.field451[var5] = arg0.method8417();
        }
        this.field446 = arg0.method8417();
        this.field447 = arg0.method8417();
        this.field443 = arg0.method8250();
        this.field445 = arg0.method8250();
        this.field455 = new class57();
        this.field452 = new class44();
        this.field455.method1066(arg0, this.field452);
    }
}
