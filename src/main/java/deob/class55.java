package deob;

import java.util.Random;

@ObfuscatedName("bl")
public class class55 {

    @ObfuscatedName("bl.s")
    public class41 field426;

    @ObfuscatedName("bl.h")
    public class41 field439;

    @ObfuscatedName("bl.w")
    public class41 field444;

    @ObfuscatedName("bl.v")
    public class41 field423;

    @ObfuscatedName("bl.c")
    public class41 field425;

    @ObfuscatedName("bl.q")
    public class41 field437;

    @ObfuscatedName("bl.i")
    public class41 field424;

    @ObfuscatedName("bl.k")
    public class41 field428;

    @ObfuscatedName("bl.o")
    public int[] field429 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bl.n")
    public int[] field430 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bl.d")
    public int[] field431 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bl.a")
    public int field432 = 0;

    @ObfuscatedName("bl.m")
    public int field421 = 100;

    @ObfuscatedName("bl.u")
    public class54 field434;

    @ObfuscatedName("bl.l")
    public class41 field435;

    @ObfuscatedName("bl.z")
    public int field436 = 500;

    @ObfuscatedName("bl.r")
    public int field427 = 0;

    @ObfuscatedName("bl.y")
    public static int[] field438;

    @ObfuscatedName("bl.p")
    public static int[] field422 = new int[32768];

    @ObfuscatedName("bl.e")
    public static int[] field440;

    @ObfuscatedName("bl.x")
    public static int[] field442;

    @ObfuscatedName("bl.f")
    public static int[] field443;

    @ObfuscatedName("bl.t")
    public static int[] field433;

    @ObfuscatedName("bl.j")
    public static int[] field445;

    @ObfuscatedName("bl.g")
    public static int[] field446;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field422[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field440 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field440[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field438 = new int[220500];
        field442 = new int[5];
        field443 = new int[5];
        field433 = new int[5];
        field445 = new int[5];
        field446 = new int[5];
    }

    @ObfuscatedName("bl.s(II)[I")
    public final int[] method946(int arg0, int arg1) {
        class352.method5816(field438, 0, arg0);
        if (arg1 < 10) {
            return field438;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field426.method701();
        this.field439.method701();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field444 != null) {
            this.field444.method701();
            this.field423.method701();
            var5 = (int) ((double) (this.field444.field313 - this.field444.field304) * 32.768D / var3);
            var6 = (int) ((double) this.field444.field304 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field425 != null) {
            this.field425.method701();
            this.field437.method701();
            var8 = (int) ((double) (this.field425.field313 - this.field425.field304) * 32.768D / var3);
            var9 = (int) ((double) this.field425.field304 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field429[var11] != 0) {
                field442[var11] = 0;
                field443[var11] = (int) ((double) this.field431[var11] * var3);
                field433[var11] = (this.field429[var11] << 14) / 100;
                field445[var11] = (int) ((double) (this.field426.field313 - this.field426.field304) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field430[var11]) / var3);
                field446[var11] = (int) ((double) this.field426.field304 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field426.method705(arg0);
            int var14 = this.field439.method705(arg0);
            if (this.field444 != null) {
                int var15 = this.field444.method705(arg0);
                int var16 = this.field423.method705(arg0);
                var13 += this.method947(var7, var16, this.field444.field309) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field425 != null) {
                int var17 = this.field425.method705(arg0);
                int var18 = this.field437.method705(arg0);
                var14 = var14 * ((this.method947(var10, var18, this.field425.field309) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field429[var19] != 0) {
                    int var20 = field443[var19] + var12;
                    if (var20 < arg0) {
                        field438[var20] += this.method947(field442[var19], field433[var19] * var14 >> 15, this.field426.field309);
                        field442[var19] += (field445[var19] * var13 >> 16) + field446[var19];
                    }
                }
            }
        }
        if (this.field424 != null) {
            this.field424.method701();
            this.field428.method701();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field424.method705(arg0);
                int var26 = this.field428.method705(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field424.field313 - this.field424.field304) * var25 >> 8) + this.field424.field304;
                } else {
                    var27 = ((this.field424.field313 - this.field424.field304) * var26 >> 8) + this.field424.field304;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field438[var24] = 0;
                }
            }
        }
        if (this.field432 > 0 && this.field421 > 0) {
            int var28 = (int) ((double) this.field432 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field438[var29] += field438[var29 - var28] * this.field421 / 100;
            }
        }
        if (this.field434.field419[0] > 0 || this.field434.field419[1] > 0) {
            this.field435.method701();
            int var30 = this.field435.method705(arg0 + 1);
            int var31 = this.field434.method934(0, (float) var30 / 65536.0F);
            int var32 = this.field434.method934(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field438[var31 + var33] * (long) Statics.field417 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field438[var31 + var33 - 1 - var36] * (long) class54.field415[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field438[var33 - 1 - var37] * (long) class54.field415[1][var37] >> 16);
                    }
                    field438[var33] = var35;
                    var30 = this.field435.method705(arg0 + 1);
                    var33++;
                }
                boolean var38 = true;
                int var39 = 128;
                while (true) {
                    if (var39 > arg0 - var31) {
                        var39 = arg0 - var31;
                    }
                    while (var33 < var39) {
                        int var40 = (int) ((long) field438[var31 + var33] * (long) Statics.field417 >> 16);
                        for (int var41 = 0; var41 < var31; var41++) {
                            var40 += (int) ((long) field438[var31 + var33 - 1 - var41] * (long) class54.field415[0][var41] >> 16);
                        }
                        for (int var42 = 0; var42 < var32; var42++) {
                            var40 -= (int) ((long) field438[var33 - 1 - var42] * (long) class54.field415[1][var42] >> 16);
                        }
                        field438[var33] = var40;
                        var30 = this.field435.method705(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var43 = 0;
                            for (int var44 = var31 + var33 - arg0; var44 < var31; var44++) {
                                var43 += (int) ((long) field438[var31 + var33 - 1 - var44] * (long) class54.field415[0][var44] >> 16);
                            }
                            for (int var45 = 0; var45 < var32; var45++) {
                                var43 -= (int) ((long) field438[var33 - 1 - var45] * (long) class54.field415[1][var45] >> 16);
                            }
                            field438[var33] = var43;
                            this.field435.method705(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field434.method934(0, (float) var30 / 65536.0F);
                    var32 = this.field434.method934(1, (float) var30 / 65536.0F);
                    var39 += 128;
                }
            }
        }
        for (int var47 = 0; var47 < arg0; var47++) {
            if (field438[var47] < -32768) {
                field438[var47] = -32768;
            }
            if (field438[var47] > 32767) {
                field438[var47] = 32767;
            }
        }
        return field438;
    }

    @ObfuscatedName("bl.h(III)I")
    public final int method947(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field440[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field422[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bl.w(Lqr;)V")
    public final void method948(class444 arg0) {
        this.field426 = new class41();
        this.field426.method700(arg0);
        this.field439 = new class41();
        this.field439.method700(arg0);
        int var2 = arg0.method6929();
        if (var2 != 0) {
            arg0.field4708--;
            this.field444 = new class41();
            this.field444.method700(arg0);
            this.field423 = new class41();
            this.field423.method700(arg0);
        }
        int var3 = arg0.method6929();
        if (var3 != 0) {
            arg0.field4708--;
            this.field425 = new class41();
            this.field425.method700(arg0);
            this.field437 = new class41();
            this.field437.method700(arg0);
        }
        int var4 = arg0.method6929();
        if (var4 != 0) {
            arg0.field4708--;
            this.field424 = new class41();
            this.field424.method700(arg0);
            this.field428 = new class41();
            this.field428.method700(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method6944();
            if (var6 == 0) {
                break;
            }
            this.field429[var5] = var6;
            this.field430[var5] = arg0.method7044();
            this.field431[var5] = arg0.method6944();
        }
        this.field432 = arg0.method6944();
        this.field421 = arg0.method6944();
        this.field436 = arg0.method7120();
        this.field427 = arg0.method7120();
        this.field434 = new class54();
        this.field435 = new class41();
        this.field434.method935(arg0, this.field435);
    }
}
