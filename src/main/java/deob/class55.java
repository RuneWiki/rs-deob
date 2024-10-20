package deob;

import java.util.Random;

@ObfuscatedName("bn")
public class class55 {

    @ObfuscatedName("bn.c")
    public class41 field435;

    @ObfuscatedName("bn.l")
    public class41 field434;

    @ObfuscatedName("bn.s")
    public class41 field436;

    @ObfuscatedName("bn.e")
    public class41 field437;

    @ObfuscatedName("bn.r")
    public class41 field438;

    @ObfuscatedName("bn.o")
    public class41 field440;

    @ObfuscatedName("bn.i")
    public class41 field446;

    @ObfuscatedName("bn.w")
    public class41 field441;

    @ObfuscatedName("bn.v")
    public int[] field442 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bn.a")
    public int[] field443 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bn.y")
    public int[] field444 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bn.u")
    public int field450 = 0;

    @ObfuscatedName("bn.h")
    public int field445 = 100;

    @ObfuscatedName("bn.q")
    public class54 field451;

    @ObfuscatedName("bn.x")
    public class41 field448;

    @ObfuscatedName("bn.p")
    public int field449 = 500;

    @ObfuscatedName("bn.n")
    public int field447 = 0;

    @ObfuscatedName("bn.m")
    public static int[] field454;

    @ObfuscatedName("bn.d")
    public static int[] field452 = new int[32768];

    @ObfuscatedName("bn.j")
    public static int[] field453;

    @ObfuscatedName("bn.g")
    public static int[] field455;

    @ObfuscatedName("bn.t")
    public static int[] field456;

    @ObfuscatedName("bn.k")
    public static int[] field457;

    @ObfuscatedName("bn.b")
    public static int[] field458;

    @ObfuscatedName("bn.z")
    public static int[] field459;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field452[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field453 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field453[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field454 = new int[220500];
        field455 = new int[5];
        field456 = new int[5];
        field457 = new int[5];
        field458 = new int[5];
        field459 = new int[5];
    }

    @ObfuscatedName("bn.c(II)[I")
    public final int[] method996(int arg0, int arg1) {
        class339.method5628(field454, 0, arg0);
        if (arg1 < 10) {
            return field454;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field435.method742();
        this.field434.method742();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field436 != null) {
            this.field436.method742();
            this.field437.method742();
            var5 = (int) ((double) (this.field436.field316 - this.field436.field313) * 32.768D / var3);
            var6 = (int) ((double) this.field436.field313 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field438 != null) {
            this.field438.method742();
            this.field440.method742();
            var8 = (int) ((double) (this.field438.field316 - this.field438.field313) * 32.768D / var3);
            var9 = (int) ((double) this.field438.field313 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field442[var11] != 0) {
                field455[var11] = 0;
                field456[var11] = (int) ((double) this.field444[var11] * var3);
                field457[var11] = (this.field442[var11] << 14) / 100;
                field458[var11] = (int) ((double) (this.field435.field316 - this.field435.field313) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field443[var11]) / var3);
                field459[var11] = (int) ((double) this.field435.field313 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field435.method745(arg0);
            int var14 = this.field434.method745(arg0);
            if (this.field436 != null) {
                int var15 = this.field436.method745(arg0);
                int var16 = this.field437.method745(arg0);
                var13 += this.method995(var7, var16, this.field436.field315) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field438 != null) {
                int var17 = this.field438.method745(arg0);
                int var18 = this.field440.method745(arg0);
                var14 = var14 * ((this.method995(var10, var18, this.field438.field315) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field442[var19] != 0) {
                    int var20 = field456[var19] + var12;
                    if (var20 < arg0) {
                        field454[var20] += this.method995(field455[var19], field457[var19] * var14 >> 15, this.field435.field315);
                        field455[var19] += (field458[var19] * var13 >> 16) + field459[var19];
                    }
                }
            }
        }
        if (this.field446 != null) {
            this.field446.method742();
            this.field441.method742();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field446.method745(arg0);
                int var26 = this.field441.method745(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field446.field316 - this.field446.field313) * var25 >> 8) + this.field446.field313;
                } else {
                    var27 = ((this.field446.field316 - this.field446.field313) * var26 >> 8) + this.field446.field313;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field454[var24] = 0;
                }
            }
        }
        if (this.field450 > 0 && this.field445 > 0) {
            int var28 = (int) ((double) this.field450 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field454[var29] += field454[var29 - var28] * this.field445 / 100;
            }
        }
        if (this.field451.field424[0] > 0 || this.field451.field424[1] > 0) {
            this.field448.method742();
            int var30 = this.field448.method745(arg0 + 1);
            int var31 = this.field451.method984(0, (float) var30 / 65536.0F);
            int var32 = this.field451.method984(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field454[var31 + var33] * (long) Statics.field430 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field454[var31 + var33 - 1 - var36] * (long) class54.field432[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field454[var33 - 1 - var37] * (long) class54.field432[1][var37] >> 16);
                    }
                    field454[var33] = var35;
                    var30 = this.field448.method745(arg0 + 1);
                    var33++;
                }
                boolean var38 = true;
                int var39 = 128;
                while (true) {
                    if (var39 > arg0 - var31) {
                        var39 = arg0 - var31;
                    }
                    while (var33 < var39) {
                        int var40 = (int) ((long) field454[var31 + var33] * (long) Statics.field430 >> 16);
                        for (int var41 = 0; var41 < var31; var41++) {
                            var40 += (int) ((long) field454[var31 + var33 - 1 - var41] * (long) class54.field432[0][var41] >> 16);
                        }
                        for (int var42 = 0; var42 < var32; var42++) {
                            var40 -= (int) ((long) field454[var33 - 1 - var42] * (long) class54.field432[1][var42] >> 16);
                        }
                        field454[var33] = var40;
                        var30 = this.field448.method745(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var43 = 0;
                            for (int var44 = var31 + var33 - arg0; var44 < var31; var44++) {
                                var43 += (int) ((long) field454[var31 + var33 - 1 - var44] * (long) class54.field432[0][var44] >> 16);
                            }
                            for (int var45 = 0; var45 < var32; var45++) {
                                var43 -= (int) ((long) field454[var33 - 1 - var45] * (long) class54.field432[1][var45] >> 16);
                            }
                            field454[var33] = var43;
                            this.field448.method745(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field451.method984(0, (float) var30 / 65536.0F);
                    var32 = this.field451.method984(1, (float) var30 / 65536.0F);
                    var39 += 128;
                }
            }
        }
        for (int var47 = 0; var47 < arg0; var47++) {
            if (field454[var47] < -32768) {
                field454[var47] = -32768;
            }
            if (field454[var47] > 32767) {
                field454[var47] = 32767;
            }
        }
        return field454;
    }

    @ObfuscatedName("bn.l(III)I")
    public final int method995(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field453[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field452[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bn.s(Lpi;)V")
    public final void method998(class421 arg0) {
        this.field435 = new class41();
        this.field435.method743(arg0);
        this.field434 = new class41();
        this.field434.method743(arg0);
        int var2 = arg0.method6686();
        if (var2 != 0) {
            arg0.field4512--;
            this.field436 = new class41();
            this.field436.method743(arg0);
            this.field437 = new class41();
            this.field437.method743(arg0);
        }
        int var3 = arg0.method6686();
        if (var3 != 0) {
            arg0.field4512--;
            this.field438 = new class41();
            this.field438.method743(arg0);
            this.field440 = new class41();
            this.field440.method743(arg0);
        }
        int var4 = arg0.method6686();
        if (var4 != 0) {
            arg0.field4512--;
            this.field446 = new class41();
            this.field446.method743(arg0);
            this.field441 = new class41();
            this.field441.method743(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method6679();
            if (var6 == 0) {
                break;
            }
            this.field442[var5] = var6;
            this.field443[var5] = arg0.method6804();
            this.field444[var5] = arg0.method6679();
        }
        this.field450 = arg0.method6679();
        this.field445 = arg0.method6679();
        this.field449 = arg0.method6666();
        this.field447 = arg0.method6666();
        this.field451 = new class54();
        this.field448 = new class41();
        this.field451.method981(arg0, this.field448);
    }
}
