package deob;

import java.util.Random;

@ObfuscatedName("bk")
public class class55 {

    @ObfuscatedName("bk.o")
    public class41 field423;

    @ObfuscatedName("bk.q")
    public class41 field424;

    @ObfuscatedName("bk.l")
    public class41 field425;

    @ObfuscatedName("bk.k")
    public class41 field445;

    @ObfuscatedName("bk.a")
    public class41 field434;

    @ObfuscatedName("bk.m")
    public class41 field444;

    @ObfuscatedName("bk.p")
    public class41 field429;

    @ObfuscatedName("bk.s")
    public class41 field430;

    @ObfuscatedName("bk.r")
    public int[] field431 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bk.v")
    public int[] field427 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bk.y")
    public int[] field433 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bk.c")
    public int field428 = 0;

    @ObfuscatedName("bk.w")
    public int field435 = 100;

    @ObfuscatedName("bk.b")
    public class54 field436;

    @ObfuscatedName("bk.t")
    public class41 field437;

    @ObfuscatedName("bk.g")
    public int field446 = 500;

    @ObfuscatedName("bk.x")
    public int field439 = 0;

    @ObfuscatedName("bk.n")
    public static int[] field440;

    @ObfuscatedName("bk.e")
    public static int[] field441 = new int[32768];

    @ObfuscatedName("bk.h")
    public static int[] field442;

    @ObfuscatedName("bk.d")
    public static int[] field426;

    @ObfuscatedName("bk.j")
    public static int[] field438;

    @ObfuscatedName("bk.z")
    public static int[] field432;

    @ObfuscatedName("bk.i")
    public static int[] field447;

    @ObfuscatedName("bk.u")
    public static int[] field448;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field441[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field442 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field442[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field440 = new int[220500];
        field426 = new int[5];
        field438 = new int[5];
        field432 = new int[5];
        field447 = new int[5];
        field448 = new int[5];
    }

    @ObfuscatedName("bk.o(II)[I")
    public final int[] method989(int arg0, int arg1) {
        class352.method5831(field440, 0, arg0);
        if (arg1 < 10) {
            return field440;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field423.method738();
        this.field424.method738();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field425 != null) {
            this.field425.method738();
            this.field445.method738();
            var5 = (int) ((double) (this.field425.field304 - this.field425.field308) * 32.768D / var3);
            var6 = (int) ((double) this.field425.field308 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field434 != null) {
            this.field434.method738();
            this.field444.method738();
            var8 = (int) ((double) (this.field434.field304 - this.field434.field308) * 32.768D / var3);
            var9 = (int) ((double) this.field434.field308 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field431[var11] != 0) {
                field426[var11] = 0;
                field438[var11] = (int) ((double) this.field433[var11] * var3);
                field432[var11] = (this.field431[var11] << 14) / 100;
                field447[var11] = (int) ((double) (this.field423.field304 - this.field423.field308) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field427[var11]) / var3);
                field448[var11] = (int) ((double) this.field423.field308 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field423.method743(arg0);
            int var14 = this.field424.method743(arg0);
            if (this.field425 != null) {
                int var15 = this.field425.method743(arg0);
                int var16 = this.field445.method743(arg0);
                var13 += this.method987(var7, var16, this.field425.field309) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field434 != null) {
                int var17 = this.field434.method743(arg0);
                int var18 = this.field444.method743(arg0);
                var14 = var14 * ((this.method987(var10, var18, this.field434.field309) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field431[var19] != 0) {
                    int var20 = field438[var19] + var12;
                    if (var20 < arg0) {
                        field440[var20] += this.method987(field426[var19], field432[var19] * var14 >> 15, this.field423.field309);
                        field426[var19] += (field447[var19] * var13 >> 16) + field448[var19];
                    }
                }
            }
        }
        if (this.field429 != null) {
            this.field429.method738();
            this.field430.method738();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field429.method743(arg0);
                int var26 = this.field430.method743(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field429.field304 - this.field429.field308) * var25 >> 8) + this.field429.field308;
                } else {
                    var27 = ((this.field429.field304 - this.field429.field308) * var26 >> 8) + this.field429.field308;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field440[var24] = 0;
                }
            }
        }
        if (this.field428 > 0 && this.field435 > 0) {
            int var28 = (int) ((double) this.field428 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field440[var29] += field440[var29 - var28] * this.field435 / 100;
            }
        }
        if (this.field436.field417[0] > 0 || this.field436.field417[1] > 0) {
            this.field437.method738();
            int var30 = this.field437.method743(arg0 + 1);
            int var31 = this.field436.method985(0, (float) var30 / 65536.0F);
            int var32 = this.field436.method985(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field440[var31 + var33] * (long) Statics.field415 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field440[var31 + var33 - 1 - var36] * (long) class54.field419[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field440[var33 - 1 - var37] * (long) class54.field419[1][var37] >> 16);
                    }
                    field440[var33] = var35;
                    var30 = this.field437.method743(arg0 + 1);
                    var33++;
                }
                boolean var38 = true;
                int var39 = 128;
                while (true) {
                    if (var39 > arg0 - var31) {
                        var39 = arg0 - var31;
                    }
                    while (var33 < var39) {
                        int var40 = (int) ((long) field440[var31 + var33] * (long) Statics.field415 >> 16);
                        for (int var41 = 0; var41 < var31; var41++) {
                            var40 += (int) ((long) field440[var31 + var33 - 1 - var41] * (long) class54.field419[0][var41] >> 16);
                        }
                        for (int var42 = 0; var42 < var32; var42++) {
                            var40 -= (int) ((long) field440[var33 - 1 - var42] * (long) class54.field419[1][var42] >> 16);
                        }
                        field440[var33] = var40;
                        var30 = this.field437.method743(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var43 = 0;
                            for (int var44 = var31 + var33 - arg0; var44 < var31; var44++) {
                                var43 += (int) ((long) field440[var31 + var33 - 1 - var44] * (long) class54.field419[0][var44] >> 16);
                            }
                            for (int var45 = 0; var45 < var32; var45++) {
                                var43 -= (int) ((long) field440[var33 - 1 - var45] * (long) class54.field419[1][var45] >> 16);
                            }
                            field440[var33] = var43;
                            this.field437.method743(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field436.method985(0, (float) var30 / 65536.0F);
                    var32 = this.field436.method985(1, (float) var30 / 65536.0F);
                    var39 += 128;
                }
            }
        }
        for (int var47 = 0; var47 < arg0; var47++) {
            if (field440[var47] < -32768) {
                field440[var47] = -32768;
            }
            if (field440[var47] > 32767) {
                field440[var47] = 32767;
            }
        }
        return field440;
    }

    @ObfuscatedName("bk.q(III)I")
    public final int method987(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field442[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field441[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bk.l(Lpx;)V")
    public final void method988(class440 arg0) {
        this.field423 = new class41();
        this.field423.method732(arg0);
        this.field424 = new class41();
        this.field424.method732(arg0);
        int var2 = arg0.method7071();
        if (var2 != 0) {
            arg0.field4678--;
            this.field425 = new class41();
            this.field425.method732(arg0);
            this.field445 = new class41();
            this.field445.method732(arg0);
        }
        int var3 = arg0.method7071();
        if (var3 != 0) {
            arg0.field4678--;
            this.field434 = new class41();
            this.field434.method732(arg0);
            this.field444 = new class41();
            this.field444.method732(arg0);
        }
        int var4 = arg0.method7071();
        if (var4 != 0) {
            arg0.field4678--;
            this.field429 = new class41();
            this.field429.method732(arg0);
            this.field430 = new class41();
            this.field430.method732(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method7134();
            if (var6 == 0) {
                break;
            }
            this.field431[var5] = var6;
            this.field427[var5] = arg0.method6907();
            this.field433[var5] = arg0.method7134();
        }
        this.field428 = arg0.method7134();
        this.field435 = arg0.method7134();
        this.field446 = arg0.method7082();
        this.field439 = arg0.method7082();
        this.field436 = new class54();
        this.field437 = new class41();
        this.field436.method975(arg0, this.field437);
    }
}
