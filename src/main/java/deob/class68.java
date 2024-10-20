package deob;

import java.util.Random;

@ObfuscatedName("bf")
public class class68 {

    @ObfuscatedName("bf.f")
    public class54 field552;

    @ObfuscatedName("bf.o")
    public class54 field530;

    @ObfuscatedName("bf.u")
    public class54 field531;

    @ObfuscatedName("bf.p")
    public class54 field549;

    @ObfuscatedName("bf.b")
    public class54 field533;

    @ObfuscatedName("bf.e")
    public class54 field534;

    @ObfuscatedName("bf.k")
    public class54 field535;

    @ObfuscatedName("bf.g")
    public class54 field536;

    @ObfuscatedName("bf.h")
    public int[] field543 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bf.n")
    public int[] field538 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bf.l")
    public int[] field539 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bf.m")
    public int field540 = 0;

    @ObfuscatedName("bf.d")
    public int field545 = 100;

    @ObfuscatedName("bf.c")
    public class67 field551;

    @ObfuscatedName("bf.j")
    public class54 field550;

    @ObfuscatedName("bf.r")
    public int field544 = 500;

    @ObfuscatedName("bf.q")
    public int field542 = 0;

    @ObfuscatedName("bf.t")
    public static int[] field546;

    @ObfuscatedName("bf.v")
    public static int[] field532 = new int[32768];

    @ObfuscatedName("bf.x")
    public static int[] field548;

    @ObfuscatedName("bf.i")
    public static int[] field529;

    @ObfuscatedName("bf.a")
    public static int[] field537;

    @ObfuscatedName("bf.w")
    public static int[] field541;

    @ObfuscatedName("bf.s")
    public static int[] field553;

    @ObfuscatedName("bf.y")
    public static int[] field554;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field532[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field548 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field548[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field546 = new int[220500];
        field529 = new int[5];
        field537 = new int[5];
        field541 = new int[5];
        field553 = new int[5];
        field554 = new int[5];
    }

    @ObfuscatedName("bf.f(II)[I")
    public final int[] method911(int arg0, int arg1) {
        class306.method4985(field546, 0, arg0);
        if (arg1 < 10) {
            return field546;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field552.method662();
        this.field530.method662();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field531 != null) {
            this.field531.method662();
            this.field549.method662();
            var5 = (int) ((double) (this.field531.field414 - this.field531.field413) * 32.768D / var3);
            var6 = (int) ((double) this.field531.field413 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field533 != null) {
            this.field533.method662();
            this.field534.method662();
            var8 = (int) ((double) (this.field533.field414 - this.field533.field413) * 32.768D / var3);
            var9 = (int) ((double) this.field533.field413 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field543[var11] != 0) {
                field529[var11] = 0;
                field537[var11] = (int) ((double) this.field539[var11] * var3);
                field541[var11] = (this.field543[var11] << 14) / 100;
                field553[var11] = (int) ((double) (this.field552.field414 - this.field552.field413) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field538[var11]) / var3);
                field554[var11] = (int) ((double) this.field552.field413 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field552.method666(arg0);
            int var14 = this.field530.method666(arg0);
            if (this.field531 != null) {
                int var15 = this.field531.method666(arg0);
                int var16 = this.field549.method666(arg0);
                var13 += this.method912(var7, var16, this.field531.field415) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field533 != null) {
                int var17 = this.field533.method666(arg0);
                int var18 = this.field534.method666(arg0);
                var14 = var14 * ((this.method912(var10, var18, this.field533.field415) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field543[var19] != 0) {
                    int var20 = field537[var19] + var12;
                    if (var20 < arg0) {
                        field546[var20] += this.method912(field529[var19], field541[var19] * var14 >> 15, this.field552.field415);
                        field529[var19] += (field553[var19] * var13 >> 16) + field554[var19];
                    }
                }
            }
        }
        if (this.field535 != null) {
            this.field535.method662();
            this.field536.method662();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field535.method666(arg0);
                int var26 = this.field536.method666(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field535.field414 - this.field535.field413) * var25 >> 8) + this.field535.field413;
                } else {
                    var27 = ((this.field535.field414 - this.field535.field413) * var26 >> 8) + this.field535.field413;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field546[var24] = 0;
                }
            }
        }
        if (this.field540 > 0 && this.field545 > 0) {
            int var28 = (int) ((double) this.field540 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field546[var29] += field546[var29 - var28] * this.field545 / 100;
            }
        }
        if (this.field551.field524[0] > 0 || this.field551.field524[1] > 0) {
            this.field550.method662();
            int var30 = this.field550.method666(arg0 + 1);
            int var31 = this.field551.method899(0, (float) var30 / 65536.0F);
            int var32 = this.field551.method899(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field546[var31 + var33] * (long) Statics.field525 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field546[var31 + var33 - 1 - var36] * (long) class67.field523[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field546[var33 - 1 - var37] * (long) class67.field523[1][var37] >> 16);
                    }
                    field546[var33] = var35;
                    var30 = this.field550.method666(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field546[var31 + var33] * (long) Statics.field525 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field546[var31 + var33 - 1 - var40] * (long) class67.field523[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field546[var33 - 1 - var41] * (long) class67.field523[1][var41] >> 16);
                        }
                        field546[var33] = var39;
                        var30 = this.field550.method666(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field546[var31 + var33 - 1 - var43] * (long) class67.field523[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field546[var33 - 1 - var44] * (long) class67.field523[1][var44] >> 16);
                            }
                            field546[var33] = var42;
                            this.field550.method666(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field551.method899(0, (float) var30 / 65536.0F);
                    var32 = this.field551.method899(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field546[var46] < -32768) {
                field546[var46] = -32768;
            }
            if (field546[var46] > 32767) {
                field546[var46] = 32767;
            }
        }
        return field546;
    }

    @ObfuscatedName("bf.o(III)I")
    public final int method912(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field548[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field532[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bf.u(Lnu;)V")
    public final void method919(class382 arg0) {
        this.field552 = new class54();
        this.field552.method672(arg0);
        this.field530 = new class54();
        this.field530.method672(arg0);
        int var2 = arg0.method5856();
        if (var2 != 0) {
            arg0.field4155--;
            this.field531 = new class54();
            this.field531.method672(arg0);
            this.field549 = new class54();
            this.field549.method672(arg0);
        }
        int var3 = arg0.method5856();
        if (var3 != 0) {
            arg0.field4155--;
            this.field533 = new class54();
            this.field533.method672(arg0);
            this.field534 = new class54();
            this.field534.method672(arg0);
        }
        int var4 = arg0.method5856();
        if (var4 != 0) {
            arg0.field4155--;
            this.field535 = new class54();
            this.field535.method672(arg0);
            this.field536 = new class54();
            this.field536.method672(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method5846();
            if (var6 == 0) {
                break;
            }
            this.field543[var5] = var6;
            this.field538[var5] = arg0.method6063();
            this.field539[var5] = arg0.method5846();
        }
        this.field540 = arg0.method5846();
        this.field545 = arg0.method5846();
        this.field544 = arg0.method5858();
        this.field542 = arg0.method5858();
        this.field551 = new class67();
        this.field550 = new class54();
        this.field551.method896(arg0, this.field550);
    }
}
