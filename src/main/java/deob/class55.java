package deob;

import java.util.Random;

@ObfuscatedName("bc")
public class class55 {

    @ObfuscatedName("bc.c")
    public class41 field450;

    @ObfuscatedName("bc.p")
    public class41 field458;

    @ObfuscatedName("bc.f")
    public class41 field438;

    @ObfuscatedName("bc.n")
    public class41 field439;

    @ObfuscatedName("bc.k")
    public class41 field440;

    @ObfuscatedName("bc.w")
    public class41 field448;

    @ObfuscatedName("bc.s")
    public class41 field442;

    @ObfuscatedName("bc.q")
    public class41 field443;

    @ObfuscatedName("bc.m")
    public int[] field457 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bc.x")
    public int[] field436 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bc.j")
    public int[] field446 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bc.v")
    public int field447 = 0;

    @ObfuscatedName("bc.h")
    public int field452 = 100;

    @ObfuscatedName("bc.t")
    public class54 field449;

    @ObfuscatedName("bc.u")
    public class41 field437;

    @ObfuscatedName("bc.d")
    public int field451 = 500;

    @ObfuscatedName("bc.b")
    public int field441 = 0;

    @ObfuscatedName("bc.a")
    public static int[] field453;

    @ObfuscatedName("bc.l")
    public static int[] field454 = new int[32768];

    @ObfuscatedName("bc.e")
    public static int[] field455;

    @ObfuscatedName("bc.y")
    public static int[] field445;

    @ObfuscatedName("bc.i")
    public static int[] field456;

    @ObfuscatedName("bc.r")
    public static int[] field459;

    @ObfuscatedName("bc.z")
    public static int[] field460;

    @ObfuscatedName("bc.o")
    public static int[] field461;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field454[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field455 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field455[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field453 = new int[220500];
        field445 = new int[5];
        field456 = new int[5];
        field459 = new int[5];
        field460 = new int[5];
        field461 = new int[5];
    }

    @ObfuscatedName("bc.c(II)[I")
    public final int[] method1056(int arg0, int arg1) {
        class353.method6040(field453, 0, arg0);
        if (arg1 < 10) {
            return field453;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field450.method770();
        this.field458.method770();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field438 != null) {
            this.field438.method770();
            this.field439.method770();
            var5 = (int) ((double) (this.field438.field318 - this.field438.field317) * 32.768D / var3);
            var6 = (int) ((double) this.field438.field317 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field440 != null) {
            this.field440.method770();
            this.field448.method770();
            var8 = (int) ((double) (this.field440.field318 - this.field440.field317) * 32.768D / var3);
            var9 = (int) ((double) this.field440.field317 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field457[var11] != 0) {
                field445[var11] = 0;
                field456[var11] = (int) ((double) this.field446[var11] * var3);
                field459[var11] = (this.field457[var11] << 14) / 100;
                field460[var11] = (int) ((double) (this.field450.field318 - this.field450.field317) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field436[var11]) / var3);
                field461[var11] = (int) ((double) this.field450.field317 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field450.method773(arg0);
            int var14 = this.field458.method773(arg0);
            if (this.field438 != null) {
                int var15 = this.field438.method773(arg0);
                int var16 = this.field439.method773(arg0);
                var13 += this.method1064(var7, var16, this.field438.field316) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field440 != null) {
                int var17 = this.field440.method773(arg0);
                int var18 = this.field448.method773(arg0);
                var14 = var14 * ((this.method1064(var10, var18, this.field440.field316) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field457[var19] != 0) {
                    int var20 = field456[var19] + var12;
                    if (var20 < arg0) {
                        field453[var20] += this.method1064(field445[var19], field459[var19] * var14 >> 15, this.field450.field316);
                        field445[var19] += (field460[var19] * var13 >> 16) + field461[var19];
                    }
                }
            }
        }
        if (this.field442 != null) {
            this.field442.method770();
            this.field443.method770();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field442.method773(arg0);
                int var26 = this.field443.method773(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field442.field318 - this.field442.field317) * var25 >> 8) + this.field442.field317;
                } else {
                    var27 = ((this.field442.field318 - this.field442.field317) * var26 >> 8) + this.field442.field317;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field453[var24] = 0;
                }
            }
        }
        if (this.field447 > 0 && this.field452 > 0) {
            int var28 = (int) ((double) this.field447 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field453[var29] += field453[var29 - var28] * this.field452 / 100;
            }
        }
        if (this.field449.field426[0] > 0 || this.field449.field426[1] > 0) {
            this.field437.method770();
            int var30 = this.field437.method773(arg0 + 1);
            int var31 = this.field449.method1041(0, (float) var30 / 65536.0F);
            int var32 = this.field449.method1041(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field453[var31 + var33] * (long) Statics.field432 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field453[var31 + var33 - 1 - var36] * (long) class54.field433[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field453[var33 - 1 - var37] * (long) class54.field433[1][var37] >> 16);
                    }
                    field453[var33] = var35;
                    var30 = this.field437.method773(arg0 + 1);
                    var33++;
                }
                boolean var38 = true;
                int var39 = 128;
                while (true) {
                    if (var39 > arg0 - var31) {
                        var39 = arg0 - var31;
                    }
                    while (var33 < var39) {
                        int var40 = (int) ((long) field453[var31 + var33] * (long) Statics.field432 >> 16);
                        for (int var41 = 0; var41 < var31; var41++) {
                            var40 += (int) ((long) field453[var31 + var33 - 1 - var41] * (long) class54.field433[0][var41] >> 16);
                        }
                        for (int var42 = 0; var42 < var32; var42++) {
                            var40 -= (int) ((long) field453[var33 - 1 - var42] * (long) class54.field433[1][var42] >> 16);
                        }
                        field453[var33] = var40;
                        var30 = this.field437.method773(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var43 = 0;
                            for (int var44 = var31 + var33 - arg0; var44 < var31; var44++) {
                                var43 += (int) ((long) field453[var31 + var33 - 1 - var44] * (long) class54.field433[0][var44] >> 16);
                            }
                            for (int var45 = 0; var45 < var32; var45++) {
                                var43 -= (int) ((long) field453[var33 - 1 - var45] * (long) class54.field433[1][var45] >> 16);
                            }
                            field453[var33] = var43;
                            this.field437.method773(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field449.method1041(0, (float) var30 / 65536.0F);
                    var32 = this.field449.method1041(1, (float) var30 / 65536.0F);
                    var39 += 128;
                }
            }
        }
        for (int var47 = 0; var47 < arg0; var47++) {
            if (field453[var47] < -32768) {
                field453[var47] = -32768;
            }
            if (field453[var47] > 32767) {
                field453[var47] = 32767;
            }
        }
        return field453;
    }

    @ObfuscatedName("bc.p(III)I")
    public final int method1064(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field455[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field454[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bc.f(Lqq;)V")
    public final void method1058(class445 arg0) {
        this.field450 = new class41();
        this.field450.method775(arg0);
        this.field458 = new class41();
        this.field458.method775(arg0);
        int var2 = arg0.method7196();
        if (var2 != 0) {
            arg0.field4735--;
            this.field438 = new class41();
            this.field438.method775(arg0);
            this.field439 = new class41();
            this.field439.method775(arg0);
        }
        int var3 = arg0.method7196();
        if (var3 != 0) {
            arg0.field4735--;
            this.field440 = new class41();
            this.field440.method775(arg0);
            this.field448 = new class41();
            this.field448.method775(arg0);
        }
        int var4 = arg0.method7196();
        if (var4 != 0) {
            arg0.field4735--;
            this.field442 = new class41();
            this.field442.method775(arg0);
            this.field443 = new class41();
            this.field443.method775(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method7211();
            if (var6 == 0) {
                break;
            }
            this.field457[var5] = var6;
            this.field436[var5] = arg0.method7210();
            this.field446[var5] = arg0.method7211();
        }
        this.field447 = arg0.method7211();
        this.field452 = arg0.method7211();
        this.field451 = arg0.method7198();
        this.field441 = arg0.method7198();
        this.field449 = new class54();
        this.field437 = new class41();
        this.field449.method1042(arg0, this.field437);
    }
}
