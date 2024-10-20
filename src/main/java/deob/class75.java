package deob;

import java.util.Random;

@ObfuscatedName("bo")
public class class75 {

    @ObfuscatedName("bo.k")
    public class61 field1387;

    @ObfuscatedName("bo.q")
    public class61 field1382;

    @ObfuscatedName("bo.f")
    public class61 field1403;

    @ObfuscatedName("bo.c")
    public class61 field1393;

    @ObfuscatedName("bo.v")
    public class61 field1385;

    @ObfuscatedName("bo.j")
    public class61 field1386;

    @ObfuscatedName("bo.m")
    public class61 field1404;

    @ObfuscatedName("bo.y")
    public class61 field1405;

    @ObfuscatedName("bo.u")
    public int[] field1389 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bo.h")
    public int[] field1381 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bo.l")
    public int[] field1391 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bo.b")
    public int field1396 = 0;

    @ObfuscatedName("bo.g")
    public int field1399 = 100;

    @ObfuscatedName("bo.e")
    public class67 field1394;

    @ObfuscatedName("bo.p")
    public class61 field1406;

    @ObfuscatedName("bo.s")
    public int field1395 = 500;

    @ObfuscatedName("bo.w")
    public int field1397 = 0;

    @ObfuscatedName("bo.i")
    public static int[] field1398;

    @ObfuscatedName("bo.r")
    public static int[] field1392 = new int[32768];

    @ObfuscatedName("bo.a")
    public static int[] field1400;

    @ObfuscatedName("bo.z")
    public static int[] field1402;

    @ObfuscatedName("bo.x")
    public static int[] field1384;

    @ObfuscatedName("bo.d")
    public static int[] field1388;

    @ObfuscatedName("bo.t")
    public static int[] field1383;

    @ObfuscatedName("bo.o")
    public static int[] field1390;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1392[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1400 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1400[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1398 = new int[220500];
        field1402 = new int[5];
        field1384 = new int[5];
        field1388 = new int[5];
        field1383 = new int[5];
        field1390 = new int[5];
    }

    @ObfuscatedName("bo.k(II)[I")
    public final int[] method1526(int arg0, int arg1) {
        class124.method2636(field1398, 0, arg0);
        if (arg1 < 10) {
            return field1398;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1387.method1240();
        this.field1382.method1240();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1403 != null) {
            this.field1403.method1240();
            this.field1393.method1240();
            var5 = (int) ((double) (this.field1403.field1263 - this.field1403.field1262) * 32.768D / var3);
            var6 = (int) ((double) this.field1403.field1262 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1385 != null) {
            this.field1385.method1240();
            this.field1386.method1240();
            var8 = (int) ((double) (this.field1385.field1263 - this.field1385.field1262) * 32.768D / var3);
            var9 = (int) ((double) this.field1385.field1262 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1389[var11] != 0) {
                field1402[var11] = 0;
                field1384[var11] = (int) ((double) this.field1391[var11] * var3);
                field1388[var11] = (this.field1389[var11] << 14) / 100;
                field1383[var11] = (int) ((double) (this.field1387.field1263 - this.field1387.field1262) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1381[var11]) / var3);
                field1390[var11] = (int) ((double) this.field1387.field1262 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1387.method1241(arg0);
            int var14 = this.field1382.method1241(arg0);
            if (this.field1403 != null) {
                int var15 = this.field1403.method1241(arg0);
                int var16 = this.field1393.method1241(arg0);
                var13 += this.method1534(var7, var16, this.field1403.field1264) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1385 != null) {
                int var17 = this.field1385.method1241(arg0);
                int var18 = this.field1386.method1241(arg0);
                var14 = var14 * ((this.method1534(var10, var18, this.field1385.field1264) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1389[var19] != 0) {
                    int var20 = field1384[var19] + var12;
                    if (var20 < arg0) {
                        field1398[var20] += this.method1534(field1402[var19], field1388[var19] * var14 >> 15, this.field1387.field1264);
                        field1402[var19] += (field1383[var19] * var13 >> 16) + field1390[var19];
                    }
                }
            }
        }
        if (this.field1404 != null) {
            this.field1404.method1240();
            this.field1405.method1240();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1404.method1241(arg0);
                int var26 = this.field1405.method1241(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1404.field1263 - this.field1404.field1262) * var25 >> 8) + this.field1404.field1262;
                } else {
                    var27 = ((this.field1404.field1263 - this.field1404.field1262) * var26 >> 8) + this.field1404.field1262;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1398[var24] = 0;
                }
            }
        }
        if (this.field1396 > 0 && this.field1399 > 0) {
            int var28 = (int) ((double) this.field1396 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1398[var29] += field1398[var29 - var28] * this.field1399 / 100;
            }
        }
        if (this.field1394.field1304[0] > 0 || this.field1394.field1304[1] > 0) {
            this.field1406.method1240();
            int var30 = this.field1406.method1241(arg0 + 1);
            int var31 = this.field1394.method1295(0, (float) var30 / 65536.0F);
            int var32 = this.field1394.method1295(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1398[var31 + var33] * (long) Statics.field1303 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1398[var31 + var33 - 1 - var36] * (long) class67.field1301[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1398[var33 - 1 - var37] * (long) class67.field1301[1][var37] >> 16);
                    }
                    field1398[var33] = var35;
                    var30 = this.field1406.method1241(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1398[var31 + var33] * (long) Statics.field1303 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1398[var31 + var33 - 1 - var40] * (long) class67.field1301[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1398[var33 - 1 - var41] * (long) class67.field1301[1][var41] >> 16);
                        }
                        field1398[var33] = var39;
                        var30 = this.field1406.method1241(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1398[var31 + var33 - 1 - var43] * (long) class67.field1301[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1398[var33 - 1 - var44] * (long) class67.field1301[1][var44] >> 16);
                            }
                            field1398[var33] = var42;
                            this.field1406.method1241(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1394.method1295(0, (float) var30 / 65536.0F);
                    var32 = this.field1394.method1295(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1398[var46] < -32768) {
                field1398[var46] = -32768;
            }
            if (field1398[var46] > 32767) {
                field1398[var46] = 32767;
            }
        }
        return field1398;
    }

    @ObfuscatedName("bo.q(III)I")
    public final int method1534(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1400[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1392[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bo.f(Lde;)V")
    public final void method1527(class123 arg0) {
        this.field1387 = new class61();
        this.field1387.method1242(arg0);
        this.field1382 = new class61();
        this.field1382.method1242(arg0);
        int var2 = arg0.method2427();
        if (var2 != 0) {
            arg0.field2060--;
            this.field1403 = new class61();
            this.field1403.method1242(arg0);
            this.field1393 = new class61();
            this.field1393.method1242(arg0);
        }
        int var3 = arg0.method2427();
        if (var3 != 0) {
            arg0.field2060--;
            this.field1385 = new class61();
            this.field1385.method1242(arg0);
            this.field1386 = new class61();
            this.field1386.method1242(arg0);
        }
        int var4 = arg0.method2427();
        if (var4 != 0) {
            arg0.field2060--;
            this.field1404 = new class61();
            this.field1404.method1242(arg0);
            this.field1405 = new class61();
            this.field1405.method1242(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2410();
            if (var6 == 0) {
                break;
            }
            this.field1389[var5] = var6;
            this.field1381[var5] = arg0.method2439();
            this.field1391[var5] = arg0.method2410();
        }
        this.field1396 = arg0.method2410();
        this.field1399 = arg0.method2410();
        this.field1395 = arg0.method2547();
        this.field1397 = arg0.method2547();
        this.field1394 = new class67();
        this.field1406 = new class61();
        this.field1394.method1291(arg0, this.field1406);
    }
}
