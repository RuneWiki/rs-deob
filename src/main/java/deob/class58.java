package deob;

import java.util.Random;

@ObfuscatedName("be")
public class class58 {

    @ObfuscatedName("be.f")
    public class44 field456;

    @ObfuscatedName("be.w")
    public class44 field442;

    @ObfuscatedName("be.v")
    public class44 field443;

    @ObfuscatedName("be.s")
    public class44 field444;

    @ObfuscatedName("be.z")
    public class44 field445;

    @ObfuscatedName("be.j")
    public class44 field446;

    @ObfuscatedName("be.i")
    public class44 field447;

    @ObfuscatedName("be.n")
    public class44 field462;

    @ObfuscatedName("be.l")
    public int[] field449 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("be.k")
    public int[] field455 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("be.c")
    public int[] field451 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("be.r")
    public int field452 = 0;

    @ObfuscatedName("be.b")
    public int field458 = 100;

    @ObfuscatedName("be.m")
    public class57 field453;

    @ObfuscatedName("be.t")
    public class44 field448;

    @ObfuscatedName("be.h")
    public int field465 = 500;

    @ObfuscatedName("be.p")
    public int field457 = 0;

    @ObfuscatedName("be.o")
    public static int[] field466;

    @ObfuscatedName("be.u")
    public static int[] field459 = new int[32768];

    @ObfuscatedName("be.x")
    public static int[] field460;

    @ObfuscatedName("be.q")
    public static int[] field454;

    @ObfuscatedName("be.d")
    public static int[] field463;

    @ObfuscatedName("be.e")
    public static int[] field441;

    @ObfuscatedName("be.g")
    public static int[] field464;

    @ObfuscatedName("be.y")
    public static int[] field450;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field459[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field460 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field460[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field466 = new int[220500];
        field454 = new int[5];
        field463 = new int[5];
        field441 = new int[5];
        field464 = new int[5];
        field450 = new int[5];
    }

    @ObfuscatedName("be.f(II)[I")
    public final int[] method1083(int arg0, int arg1) {
        class378.method6762(field466, 0, arg0);
        if (arg1 < 10) {
            return field466;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field456.method815();
        this.field442.method815();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field443 != null) {
            this.field443.method815();
            this.field444.method815();
            var5 = (int) ((double) (this.field443.field331 - this.field443.field330) * 32.768D / var3);
            var6 = (int) ((double) this.field443.field330 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field445 != null) {
            this.field445.method815();
            this.field446.method815();
            var8 = (int) ((double) (this.field445.field331 - this.field445.field330) * 32.768D / var3);
            var9 = (int) ((double) this.field445.field330 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field449[var11] != 0) {
                field454[var11] = 0;
                field463[var11] = (int) ((double) this.field451[var11] * var3);
                field441[var11] = (this.field449[var11] << 14) / 100;
                field464[var11] = (int) ((double) (this.field456.field331 - this.field456.field330) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field455[var11]) / var3);
                field450[var11] = (int) ((double) this.field456.field330 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field456.method816(arg0);
            int var14 = this.field442.method816(arg0);
            if (this.field443 != null) {
                int var15 = this.field443.method816(arg0);
                int var16 = this.field444.method816(arg0);
                var13 += this.method1075(var7, var16, this.field443.field332) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field445 != null) {
                int var17 = this.field445.method816(arg0);
                int var18 = this.field446.method816(arg0);
                var14 = var14 * ((this.method1075(var10, var18, this.field445.field332) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field449[var19] != 0) {
                    int var20 = field463[var19] + var12;
                    if (var20 < arg0) {
                        field466[var20] += this.method1075(field454[var19], field441[var19] * var14 >> 15, this.field456.field332);
                        field454[var19] += (field464[var19] * var13 >> 16) + field450[var19];
                    }
                }
            }
        }
        if (this.field447 != null) {
            this.field447.method815();
            this.field462.method815();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field447.method816(arg0);
                int var26 = this.field462.method816(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field447.field331 - this.field447.field330) * var25 >> 8) + this.field447.field330;
                } else {
                    var27 = ((this.field447.field331 - this.field447.field330) * var26 >> 8) + this.field447.field330;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field466[var24] = 0;
                }
            }
        }
        if (this.field452 > 0 && this.field458 > 0) {
            int var28 = (int) ((double) this.field452 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field466[var29] += field466[var29 - var28] * this.field458 / 100;
            }
        }
        if (this.field453.field439[0] > 0 || this.field453.field439[1] > 0) {
            this.field448.method815();
            int var30 = this.field448.method816(arg0 + 1);
            int var31 = this.field453.method1061(0, (float) var30 / 65536.0F);
            int var32 = this.field453.method1061(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field466[var31 + var33] * (long) Statics.field437 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field466[var31 + var33 - 1 - var36] * (long) class57.field435[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field466[var33 - 1 - var37] * (long) class57.field435[1][var37] >> 16);
                    }
                    field466[var33] = var35;
                    var30 = this.field448.method816(arg0 + 1);
                    var33++;
                }
                boolean var38 = true;
                int var39 = 128;
                while (true) {
                    if (var39 > arg0 - var31) {
                        var39 = arg0 - var31;
                    }
                    while (var33 < var39) {
                        int var40 = (int) ((long) field466[var31 + var33] * (long) Statics.field437 >> 16);
                        for (int var41 = 0; var41 < var31; var41++) {
                            var40 += (int) ((long) field466[var31 + var33 - 1 - var41] * (long) class57.field435[0][var41] >> 16);
                        }
                        for (int var42 = 0; var42 < var32; var42++) {
                            var40 -= (int) ((long) field466[var33 - 1 - var42] * (long) class57.field435[1][var42] >> 16);
                        }
                        field466[var33] = var40;
                        var30 = this.field448.method816(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var43 = 0;
                            for (int var44 = var31 + var33 - arg0; var44 < var31; var44++) {
                                var43 += (int) ((long) field466[var31 + var33 - 1 - var44] * (long) class57.field435[0][var44] >> 16);
                            }
                            for (int var45 = 0; var45 < var32; var45++) {
                                var43 -= (int) ((long) field466[var33 - 1 - var45] * (long) class57.field435[1][var45] >> 16);
                            }
                            field466[var33] = var43;
                            this.field448.method816(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field453.method1061(0, (float) var30 / 65536.0F);
                    var32 = this.field453.method1061(1, (float) var30 / 65536.0F);
                    var39 += 128;
                }
            }
        }
        for (int var47 = 0; var47 < arg0; var47++) {
            if (field466[var47] < -32768) {
                field466[var47] = -32768;
            }
            if (field466[var47] > 32767) {
                field466[var47] = 32767;
            }
        }
        return field466;
    }

    @ObfuscatedName("be.w(III)I")
    public final int method1075(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field460[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field459[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("be.v(Lrd;)V")
    public final void method1077(class474 arg0) {
        this.field456 = new class44();
        this.field456.method814(arg0);
        this.field442 = new class44();
        this.field442.method814(arg0);
        int var2 = arg0.method7964();
        if (var2 != 0) {
            arg0.field4939--;
            this.field443 = new class44();
            this.field443.method814(arg0);
            this.field444 = new class44();
            this.field444.method814(arg0);
        }
        int var3 = arg0.method7964();
        if (var3 != 0) {
            arg0.field4939--;
            this.field445 = new class44();
            this.field445.method814(arg0);
            this.field446 = new class44();
            this.field446.method814(arg0);
        }
        int var4 = arg0.method7964();
        if (var4 != 0) {
            arg0.field4939--;
            this.field447 = new class44();
            this.field447.method814(arg0);
            this.field462 = new class44();
            this.field462.method814(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method8059();
            if (var6 == 0) {
                break;
            }
            this.field449[var5] = var6;
            this.field455[var5] = arg0.method7978();
            this.field451[var5] = arg0.method8059();
        }
        this.field452 = arg0.method8059();
        this.field458 = arg0.method8059();
        this.field465 = arg0.method8032();
        this.field457 = arg0.method8032();
        this.field453 = new class57();
        this.field448 = new class44();
        this.field453.method1071(arg0, this.field448);
    }
}
