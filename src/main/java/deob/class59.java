package deob;

import java.util.Random;

@ObfuscatedName("bp")
public class class59 {

    @ObfuscatedName("bp.h")
    public class45 field471;

    @ObfuscatedName("bp.e")
    public class45 field454;

    @ObfuscatedName("bp.v")
    public class45 field455;

    @ObfuscatedName("bp.x")
    public class45 field456;

    @ObfuscatedName("bp.m")
    public class45 field457;

    @ObfuscatedName("bp.q")
    public class45 field470;

    @ObfuscatedName("bp.f")
    public class45 field459;

    @ObfuscatedName("bp.r")
    public class45 field473;

    @ObfuscatedName("bp.u")
    public int[] field461 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bp.b")
    public int[] field462 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bp.j")
    public int[] field463 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bp.g")
    public int field465 = 0;

    @ObfuscatedName("bp.i")
    public int field477 = 100;

    @ObfuscatedName("bp.o")
    public class58 field466;

    @ObfuscatedName("bp.n")
    public class45 field467;

    @ObfuscatedName("bp.k")
    public int field468 = 500;

    @ObfuscatedName("bp.a")
    public int field469 = 0;

    @ObfuscatedName("bp.s")
    public static int[] field464;

    @ObfuscatedName("bp.l")
    public static int[] field458 = new int[32768];

    @ObfuscatedName("bp.t")
    public static int[] field472;

    @ObfuscatedName("bp.p")
    public static int[] field474;

    @ObfuscatedName("bp.d")
    public static int[] field475;

    @ObfuscatedName("bp.y")
    public static int[] field453;

    @ObfuscatedName("bp.z")
    public static int[] field476;

    @ObfuscatedName("bp.w")
    public static int[] field478;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field458[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field472 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field472[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field464 = new int[220500];
        field474 = new int[5];
        field475 = new int[5];
        field453 = new int[5];
        field476 = new int[5];
        field478 = new int[5];
    }

    @ObfuscatedName("bp.h(II)[I")
    public final int[] method1087(int arg0, int arg1) {
        class374.method6646(field464, 0, arg0);
        if (arg1 < 10) {
            return field464;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field471.method823();
        this.field454.method823();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field455 != null) {
            this.field455.method823();
            this.field456.method823();
            var5 = (int) ((double) (this.field455.field339 - this.field455.field338) * 32.768D / var3);
            var6 = (int) ((double) this.field455.field338 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field457 != null) {
            this.field457.method823();
            this.field470.method823();
            var8 = (int) ((double) (this.field457.field339 - this.field457.field338) * 32.768D / var3);
            var9 = (int) ((double) this.field457.field338 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field461[var11] != 0) {
                field474[var11] = 0;
                field475[var11] = (int) ((double) this.field463[var11] * var3);
                field453[var11] = (this.field461[var11] << 14) / 100;
                field476[var11] = (int) ((double) (this.field471.field339 - this.field471.field338) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field462[var11]) / var3);
                field478[var11] = (int) ((double) this.field471.field338 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field471.method821(arg0);
            int var14 = this.field454.method821(arg0);
            if (this.field455 != null) {
                int var15 = this.field455.method821(arg0);
                int var16 = this.field456.method821(arg0);
                var13 += this.method1075(var7, var16, this.field455.field345) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field457 != null) {
                int var17 = this.field457.method821(arg0);
                int var18 = this.field470.method821(arg0);
                var14 = var14 * ((this.method1075(var10, var18, this.field457.field345) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field461[var19] != 0) {
                    int var20 = field475[var19] + var12;
                    if (var20 < arg0) {
                        field464[var20] += this.method1075(field474[var19], field453[var19] * var14 >> 15, this.field471.field345);
                        field474[var19] += (field476[var19] * var13 >> 16) + field478[var19];
                    }
                }
            }
        }
        if (this.field459 != null) {
            this.field459.method823();
            this.field473.method823();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field459.method821(arg0);
                int var26 = this.field473.method821(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field459.field339 - this.field459.field338) * var25 >> 8) + this.field459.field338;
                } else {
                    var27 = ((this.field459.field339 - this.field459.field338) * var26 >> 8) + this.field459.field338;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field464[var24] = 0;
                }
            }
        }
        if (this.field465 > 0 && this.field477 > 0) {
            int var28 = (int) ((double) this.field465 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field464[var29] += field464[var29 - var28] * this.field477 / 100;
            }
        }
        if (this.field466.field447[0] > 0 || this.field466.field447[1] > 0) {
            this.field467.method823();
            int var30 = this.field467.method821(arg0 + 1);
            int var31 = this.field466.method1063(0, (float) var30 / 65536.0F);
            int var32 = this.field466.method1063(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field464[var31 + var33] * (long) Statics.field441 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field464[var31 + var33 - 1 - var36] * (long) class58.field442[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field464[var33 - 1 - var37] * (long) class58.field442[1][var37] >> 16);
                    }
                    field464[var33] = var35;
                    var30 = this.field467.method821(arg0 + 1);
                    var33++;
                }
                boolean var38 = true;
                int var39 = 128;
                while (true) {
                    if (var39 > arg0 - var31) {
                        var39 = arg0 - var31;
                    }
                    while (var33 < var39) {
                        int var40 = (int) ((long) field464[var31 + var33] * (long) Statics.field441 >> 16);
                        for (int var41 = 0; var41 < var31; var41++) {
                            var40 += (int) ((long) field464[var31 + var33 - 1 - var41] * (long) class58.field442[0][var41] >> 16);
                        }
                        for (int var42 = 0; var42 < var32; var42++) {
                            var40 -= (int) ((long) field464[var33 - 1 - var42] * (long) class58.field442[1][var42] >> 16);
                        }
                        field464[var33] = var40;
                        var30 = this.field467.method821(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var43 = 0;
                            for (int var44 = var31 + var33 - arg0; var44 < var31; var44++) {
                                var43 += (int) ((long) field464[var31 + var33 - 1 - var44] * (long) class58.field442[0][var44] >> 16);
                            }
                            for (int var45 = 0; var45 < var32; var45++) {
                                var43 -= (int) ((long) field464[var33 - 1 - var45] * (long) class58.field442[1][var45] >> 16);
                            }
                            field464[var33] = var43;
                            this.field467.method821(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field466.method1063(0, (float) var30 / 65536.0F);
                    var32 = this.field466.method1063(1, (float) var30 / 65536.0F);
                    var39 += 128;
                }
            }
        }
        for (int var47 = 0; var47 < arg0; var47++) {
            if (field464[var47] < -32768) {
                field464[var47] = -32768;
            }
            if (field464[var47] > 32767) {
                field464[var47] = 32767;
            }
        }
        return field464;
    }

    @ObfuscatedName("bp.e(III)I")
    public final int method1075(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field472[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field458[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bp.v(Lqy;)V")
    public final void method1077(class467 arg0) {
        this.field471 = new class45();
        this.field471.method825(arg0);
        this.field454 = new class45();
        this.field454.method825(arg0);
        int var2 = arg0.method7792();
        if (var2 != 0) {
            arg0.field4915--;
            this.field455 = new class45();
            this.field455.method825(arg0);
            this.field456 = new class45();
            this.field456.method825(arg0);
        }
        int var3 = arg0.method7792();
        if (var3 != 0) {
            arg0.field4915--;
            this.field457 = new class45();
            this.field457.method825(arg0);
            this.field470 = new class45();
            this.field470.method825(arg0);
        }
        int var4 = arg0.method7792();
        if (var4 != 0) {
            arg0.field4915--;
            this.field459 = new class45();
            this.field459.method825(arg0);
            this.field473 = new class45();
            this.field473.method825(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method7806();
            if (var6 == 0) {
                break;
            }
            this.field461[var5] = var6;
            this.field462[var5] = arg0.method7805();
            this.field463[var5] = arg0.method7806();
        }
        this.field465 = arg0.method7806();
        this.field477 = arg0.method7806();
        this.field468 = arg0.method7794();
        this.field469 = arg0.method7794();
        this.field466 = new class58();
        this.field467 = new class45();
        this.field466.method1065(arg0, this.field467);
    }
}
