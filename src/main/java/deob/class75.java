package deob;

import java.util.Random;

@ObfuscatedName("bz")
public class class75 {

    @ObfuscatedName("bz.s")
    public class61 field1376;

    @ObfuscatedName("bz.z")
    public class61 field1365;

    @ObfuscatedName("bz.t")
    public class61 field1381;

    @ObfuscatedName("bz.y")
    public class61 field1367;

    @ObfuscatedName("bz.p")
    public class61 field1368;

    @ObfuscatedName("bz.g")
    public class61 field1369;

    @ObfuscatedName("bz.m")
    public class61 field1370;

    @ObfuscatedName("bz.f")
    public class61 field1373;

    @ObfuscatedName("bz.k")
    public int[] field1372 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bz.h")
    public int[] field1379 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bz.r")
    public int[] field1374 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bz.w")
    public int field1375 = 0;

    @ObfuscatedName("bz.u")
    public int field1388 = 100;

    @ObfuscatedName("bz.n")
    public class67 field1389;

    @ObfuscatedName("bz.d")
    public class61 field1378;

    @ObfuscatedName("bz.a")
    public int field1364 = 500;

    @ObfuscatedName("bz.b")
    public int field1380 = 0;

    @ObfuscatedName("bz.q")
    public static int[] field1377;

    @ObfuscatedName("bz.o")
    public static int[] field1382 = new int[32768];

    @ObfuscatedName("bz.c")
    public static int[] field1383;

    @ObfuscatedName("bz.x")
    public static int[] field1385;

    @ObfuscatedName("bz.v")
    public static int[] field1386;

    @ObfuscatedName("bz.l")
    public static int[] field1387;

    @ObfuscatedName("bz.e")
    public static int[] field1371;

    @ObfuscatedName("bz.j")
    public static int[] field1366;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1382[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1383 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1383[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1377 = new int[220500];
        field1385 = new int[5];
        field1386 = new int[5];
        field1387 = new int[5];
        field1371 = new int[5];
        field1366 = new int[5];
    }

    @ObfuscatedName("bz.s(II)[I")
    public final int[] method1502(int arg0, int arg1) {
        class124.method2579(field1377, 0, arg0);
        if (arg1 < 10) {
            return field1377;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1376.method1228();
        this.field1365.method1228();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1381 != null) {
            this.field1381.method1228();
            this.field1367.method1228();
            var5 = (int) ((double) (this.field1381.field1253 - this.field1381.field1246) * 32.768D / var3);
            var6 = (int) ((double) this.field1381.field1246 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1368 != null) {
            this.field1368.method1228();
            this.field1369.method1228();
            var8 = (int) ((double) (this.field1368.field1253 - this.field1368.field1246) * 32.768D / var3);
            var9 = (int) ((double) this.field1368.field1246 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1372[var11] != 0) {
                field1385[var11] = 0;
                field1386[var11] = (int) ((double) this.field1374[var11] * var3);
                field1387[var11] = (this.field1372[var11] << 14) / 100;
                field1371[var11] = (int) ((double) (this.field1376.field1253 - this.field1376.field1246) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1379[var11]) / var3);
                field1366[var11] = (int) ((double) this.field1376.field1246 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1376.method1226(arg0);
            int var14 = this.field1365.method1226(arg0);
            if (this.field1381 != null) {
                int var15 = this.field1381.method1226(arg0);
                int var16 = this.field1367.method1226(arg0);
                var13 += this.method1503(var7, var16, this.field1381.field1243) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1368 != null) {
                int var17 = this.field1368.method1226(arg0);
                int var18 = this.field1369.method1226(arg0);
                var14 = var14 * ((this.method1503(var10, var18, this.field1368.field1243) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1372[var19] != 0) {
                    int var20 = field1386[var19] + var12;
                    if (var20 < arg0) {
                        field1377[var20] += this.method1503(field1385[var19], field1387[var19] * var14 >> 15, this.field1376.field1243);
                        field1385[var19] += (field1371[var19] * var13 >> 16) + field1366[var19];
                    }
                }
            }
        }
        if (this.field1370 != null) {
            this.field1370.method1228();
            this.field1373.method1228();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1370.method1226(arg0);
                int var26 = this.field1373.method1226(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1370.field1253 - this.field1370.field1246) * var25 >> 8) + this.field1370.field1246;
                } else {
                    var27 = ((this.field1370.field1253 - this.field1370.field1246) * var26 >> 8) + this.field1370.field1246;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1377[var24] = 0;
                }
            }
        }
        if (this.field1375 > 0 && this.field1388 > 0) {
            int var28 = (int) ((double) this.field1375 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1377[var29] += field1377[var29 - var28] * this.field1388 / 100;
            }
        }
        if (this.field1389.field1283[0] > 0 || this.field1389.field1283[1] > 0) {
            this.field1378.method1228();
            int var30 = this.field1378.method1226(arg0 + 1);
            int var31 = this.field1389.method1280(0, (float) var30 / 65536.0F);
            int var32 = this.field1389.method1280(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1377[var31 + var33] * (long) Statics.field1286 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1377[var31 + var33 - 1 - var36] * (long) class67.field1284[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1377[var33 - 1 - var37] * (long) class67.field1284[1][var37] >> 16);
                    }
                    field1377[var33] = var35;
                    var30 = this.field1378.method1226(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1377[var31 + var33] * (long) Statics.field1286 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1377[var31 + var33 - 1 - var40] * (long) class67.field1284[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1377[var33 - 1 - var41] * (long) class67.field1284[1][var41] >> 16);
                        }
                        field1377[var33] = var39;
                        var30 = this.field1378.method1226(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1377[var31 + var33 - 1 - var43] * (long) class67.field1284[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1377[var33 - 1 - var44] * (long) class67.field1284[1][var44] >> 16);
                            }
                            field1377[var33] = var42;
                            this.field1378.method1226(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1389.method1280(0, (float) var30 / 65536.0F);
                    var32 = this.field1389.method1280(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1377[var46] < -32768) {
                field1377[var46] = -32768;
            }
            if (field1377[var46] > 32767) {
                field1377[var46] = 32767;
            }
        }
        return field1377;
    }

    @ObfuscatedName("bz.z(III)I")
    public final int method1503(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1383[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1382[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bz.t(Ldy;)V")
    public final void method1504(class123 arg0) {
        this.field1376 = new class61();
        this.field1376.method1216(arg0);
        this.field1365 = new class61();
        this.field1365.method1216(arg0);
        int var2 = arg0.method2363();
        if (var2 != 0) {
            arg0.field2028--;
            this.field1381 = new class61();
            this.field1381.method1216(arg0);
            this.field1367 = new class61();
            this.field1367.method1216(arg0);
        }
        int var3 = arg0.method2363();
        if (var3 != 0) {
            arg0.field2028--;
            this.field1368 = new class61();
            this.field1368.method1216(arg0);
            this.field1369 = new class61();
            this.field1369.method1216(arg0);
        }
        int var4 = arg0.method2363();
        if (var4 != 0) {
            arg0.field2028--;
            this.field1370 = new class61();
            this.field1370.method1216(arg0);
            this.field1373 = new class61();
            this.field1373.method1216(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2536();
            if (var6 == 0) {
                break;
            }
            this.field1372[var5] = var6;
            this.field1379[var5] = arg0.method2552();
            this.field1374[var5] = arg0.method2536();
        }
        this.field1375 = arg0.method2536();
        this.field1388 = arg0.method2536();
        this.field1364 = arg0.method2550();
        this.field1380 = arg0.method2550();
        this.field1389 = new class67();
        this.field1378 = new class61();
        this.field1389.method1283(arg0, this.field1378);
    }
}
