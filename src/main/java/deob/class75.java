package deob;

import java.util.Random;

@ObfuscatedName("bf")
public class class75 {

    @ObfuscatedName("bf.l")
    public class61 field1395;

    @ObfuscatedName("bf.g")
    public class61 field1398;

    @ObfuscatedName("bf.r")
    public class61 field1406;

    @ObfuscatedName("bf.e")
    public class61 field1396;

    @ObfuscatedName("bf.h")
    public class61 field1417;

    @ObfuscatedName("bf.s")
    public class61 field1394;

    @ObfuscatedName("bf.k")
    public class61 field1399;

    @ObfuscatedName("bf.u")
    public class61 field1397;

    @ObfuscatedName("bf.n")
    public int[] field1400 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bf.b")
    public int[] field1402 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bf.m")
    public int[] field1401 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bf.q")
    public int field1404 = 0;

    @ObfuscatedName("bf.p")
    public int field1403 = 100;

    @ObfuscatedName("bf.w")
    public class67 field1393;

    @ObfuscatedName("bf.o")
    public class61 field1407;

    @ObfuscatedName("bf.d")
    public int field1408 = 500;

    @ObfuscatedName("bf.f")
    public int field1409 = 0;

    @ObfuscatedName("bf.z")
    public static int[] field1410;

    @ObfuscatedName("bf.i")
    public static int[] field1411 = new int[32768];

    @ObfuscatedName("bf.v")
    public static int[] field1412;

    @ObfuscatedName("bf.x")
    public static int[] field1414;

    @ObfuscatedName("bf.t")
    public static int[] field1415;

    @ObfuscatedName("bf.y")
    public static int[] field1416;

    @ObfuscatedName("bf.a")
    public static int[] field1405;

    @ObfuscatedName("bf.c")
    public static int[] field1418;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1411[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1412 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1412[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1410 = new int[220500];
        field1414 = new int[5];
        field1415 = new int[5];
        field1416 = new int[5];
        field1405 = new int[5];
        field1418 = new int[5];
    }

    @ObfuscatedName("bf.l(II)[I")
    public final int[] method1591(int arg0, int arg1) {
        class124.method2719(field1410, 0, arg0);
        if (arg1 < 10) {
            return field1410;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1395.method1332();
        this.field1398.method1332();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1406 != null) {
            this.field1406.method1332();
            this.field1396.method1332();
            var5 = (int) ((double) (this.field1406.field1274 - this.field1406.field1273) * 32.768D / var3);
            var6 = (int) ((double) this.field1406.field1273 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1417 != null) {
            this.field1417.method1332();
            this.field1394.method1332();
            var8 = (int) ((double) (this.field1417.field1274 - this.field1417.field1273) * 32.768D / var3);
            var9 = (int) ((double) this.field1417.field1273 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1400[var11] != 0) {
                field1414[var11] = 0;
                field1415[var11] = (int) ((double) this.field1401[var11] * var3);
                field1416[var11] = (this.field1400[var11] << 14) / 100;
                field1405[var11] = (int) ((double) (this.field1395.field1274 - this.field1395.field1273) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1402[var11]) / var3);
                field1418[var11] = (int) ((double) this.field1395.field1273 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1395.method1333(arg0);
            int var14 = this.field1398.method1333(arg0);
            if (this.field1406 != null) {
                int var15 = this.field1406.method1333(arg0);
                int var16 = this.field1396.method1333(arg0);
                var13 += this.method1586(var7, var16, this.field1406.field1275) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1417 != null) {
                int var17 = this.field1417.method1333(arg0);
                int var18 = this.field1394.method1333(arg0);
                var14 = var14 * ((this.method1586(var10, var18, this.field1417.field1275) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1400[var19] != 0) {
                    int var20 = field1415[var19] + var12;
                    if (var20 < arg0) {
                        field1410[var20] += this.method1586(field1414[var19], field1416[var19] * var14 >> 15, this.field1395.field1275);
                        field1414[var19] += (field1405[var19] * var13 >> 16) + field1418[var19];
                    }
                }
            }
        }
        if (this.field1399 != null) {
            this.field1399.method1332();
            this.field1397.method1332();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1399.method1333(arg0);
                int var26 = this.field1397.method1333(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1399.field1274 - this.field1399.field1273) * var25 >> 8) + this.field1399.field1273;
                } else {
                    var27 = ((this.field1399.field1274 - this.field1399.field1273) * var26 >> 8) + this.field1399.field1273;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1410[var24] = 0;
                }
            }
        }
        if (this.field1404 > 0 && this.field1403 > 0) {
            int var28 = (int) ((double) this.field1404 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1410[var29] += field1410[var29 - var28] * this.field1403 / 100;
            }
        }
        if (this.field1393.field1314[0] > 0 || this.field1393.field1314[1] > 0) {
            this.field1407.method1332();
            int var30 = this.field1407.method1333(arg0 + 1);
            int var31 = this.field1393.method1386(0, (float) var30 / 65536.0F);
            int var32 = this.field1393.method1386(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1410[var31 + var33] * (long) Statics.field1315 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1410[var31 + var33 - 1 - var36] * (long) class67.field1316[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1410[var33 - 1 - var37] * (long) class67.field1316[1][var37] >> 16);
                    }
                    field1410[var33] = var35;
                    var30 = this.field1407.method1333(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1410[var31 + var33] * (long) Statics.field1315 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1410[var31 + var33 - 1 - var40] * (long) class67.field1316[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1410[var33 - 1 - var41] * (long) class67.field1316[1][var41] >> 16);
                        }
                        field1410[var33] = var39;
                        var30 = this.field1407.method1333(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1410[var31 + var33 - 1 - var43] * (long) class67.field1316[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1410[var33 - 1 - var44] * (long) class67.field1316[1][var44] >> 16);
                            }
                            field1410[var33] = var42;
                            this.field1407.method1333(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1393.method1386(0, (float) var30 / 65536.0F);
                    var32 = this.field1393.method1386(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1410[var46] < -32768) {
                field1410[var46] = -32768;
            }
            if (field1410[var46] > 32767) {
                field1410[var46] = 32767;
            }
        }
        return field1410;
    }

    @ObfuscatedName("bf.g(III)I")
    public final int method1586(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1412[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1411[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bf.r(Ldc;)V")
    public final void method1587(class123 arg0) {
        this.field1395 = new class61();
        this.field1395.method1336(arg0);
        this.field1398 = new class61();
        this.field1398.method1336(arg0);
        int var2 = arg0.method2490();
        if (var2 != 0) {
            arg0.field2051--;
            this.field1406 = new class61();
            this.field1406.method1336(arg0);
            this.field1396 = new class61();
            this.field1396.method1336(arg0);
        }
        int var3 = arg0.method2490();
        if (var3 != 0) {
            arg0.field2051--;
            this.field1417 = new class61();
            this.field1417.method1336(arg0);
            this.field1394 = new class61();
            this.field1394.method1336(arg0);
        }
        int var4 = arg0.method2490();
        if (var4 != 0) {
            arg0.field2051--;
            this.field1399 = new class61();
            this.field1399.method1336(arg0);
            this.field1397 = new class61();
            this.field1397.method1336(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2503();
            if (var6 == 0) {
                break;
            }
            this.field1400[var5] = var6;
            this.field1402[var5] = arg0.method2502();
            this.field1401[var5] = arg0.method2503();
        }
        this.field1404 = arg0.method2503();
        this.field1403 = arg0.method2503();
        this.field1408 = arg0.method2492();
        this.field1409 = arg0.method2492();
        this.field1393 = new class67();
        this.field1407 = new class61();
        this.field1393.method1391(arg0, this.field1407);
    }
}
