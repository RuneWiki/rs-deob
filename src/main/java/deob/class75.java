package deob;

import java.util.Random;

@ObfuscatedName("by")
public class class75 {

    @ObfuscatedName("by.x")
    public class61 field1368;

    @ObfuscatedName("by.r")
    public class61 field1384;

    @ObfuscatedName("by.j")
    public class61 field1380;

    @ObfuscatedName("by.z")
    public class61 field1369;

    @ObfuscatedName("by.i")
    public class61 field1370;

    @ObfuscatedName("by.b")
    public class61 field1367;

    @ObfuscatedName("by.l")
    public class61 field1372;

    @ObfuscatedName("by.m")
    public class61 field1366;

    @ObfuscatedName("by.p")
    public int[] field1373 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("by.f")
    public int[] field1375 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("by.d")
    public int[] field1377 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("by.v")
    public int field1371 = 0;

    @ObfuscatedName("by.q")
    public int field1378 = 100;

    @ObfuscatedName("by.t")
    public class67 field1379;

    @ObfuscatedName("by.g")
    public class61 field1374;

    @ObfuscatedName("by.s")
    public int field1390 = 500;

    @ObfuscatedName("by.h")
    public int field1382 = 0;

    @ObfuscatedName("by.u")
    public static int[] field1383;

    @ObfuscatedName("by.a")
    public static int[] field1381 = new int[32768];

    @ObfuscatedName("by.e")
    public static int[] field1385;

    @ObfuscatedName("by.n")
    public static int[] field1387;

    @ObfuscatedName("by.y")
    public static int[] field1388;

    @ObfuscatedName("by.k")
    public static int[] field1389;

    @ObfuscatedName("by.w")
    public static int[] field1376;

    @ObfuscatedName("by.o")
    public static int[] field1391;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1381[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1385 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1385[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1383 = new int[220500];
        field1387 = new int[5];
        field1388 = new int[5];
        field1389 = new int[5];
        field1376 = new int[5];
        field1391 = new int[5];
    }

    @ObfuscatedName("by.x(II)[I")
    public final int[] method1503(int arg0, int arg1) {
        class124.method2638(field1383, 0, arg0);
        if (arg1 < 10) {
            return field1383;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1368.method1251();
        this.field1384.method1251();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1380 != null) {
            this.field1380.method1251();
            this.field1369.method1251();
            var5 = (int) ((double) (this.field1380.field1252 - this.field1380.field1248) * 32.768D / var3);
            var6 = (int) ((double) this.field1380.field1248 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1370 != null) {
            this.field1370.method1251();
            this.field1367.method1251();
            var8 = (int) ((double) (this.field1370.field1252 - this.field1370.field1248) * 32.768D / var3);
            var9 = (int) ((double) this.field1370.field1248 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1373[var11] != 0) {
                field1387[var11] = 0;
                field1388[var11] = (int) ((double) this.field1377[var11] * var3);
                field1389[var11] = (this.field1373[var11] << 14) / 100;
                field1376[var11] = (int) ((double) (this.field1368.field1252 - this.field1368.field1248) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1375[var11]) / var3);
                field1391[var11] = (int) ((double) this.field1368.field1248 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1368.method1252(arg0);
            int var14 = this.field1384.method1252(arg0);
            if (this.field1380 != null) {
                int var15 = this.field1380.method1252(arg0);
                int var16 = this.field1369.method1252(arg0);
                var13 += this.method1508(var7, var16, this.field1380.field1250) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1370 != null) {
                int var17 = this.field1370.method1252(arg0);
                int var18 = this.field1367.method1252(arg0);
                var14 = var14 * ((this.method1508(var10, var18, this.field1370.field1250) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1373[var19] != 0) {
                    int var20 = field1388[var19] + var12;
                    if (var20 < arg0) {
                        field1383[var20] += this.method1508(field1387[var19], field1389[var19] * var14 >> 15, this.field1368.field1250);
                        field1387[var19] += (field1376[var19] * var13 >> 16) + field1391[var19];
                    }
                }
            }
        }
        if (this.field1372 != null) {
            this.field1372.method1251();
            this.field1366.method1251();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1372.method1252(arg0);
                int var26 = this.field1366.method1252(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1372.field1252 - this.field1372.field1248) * var25 >> 8) + this.field1372.field1248;
                } else {
                    var27 = ((this.field1372.field1252 - this.field1372.field1248) * var26 >> 8) + this.field1372.field1248;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1383[var24] = 0;
                }
            }
        }
        if (this.field1371 > 0 && this.field1378 > 0) {
            int var28 = (int) ((double) this.field1371 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1383[var29] += field1383[var29 - var28] * this.field1378 / 100;
            }
        }
        if (this.field1379.field1287[0] > 0 || this.field1379.field1287[1] > 0) {
            this.field1374.method1251();
            int var30 = this.field1374.method1252(arg0 + 1);
            int var31 = this.field1379.method1303(0, (float) var30 / 65536.0F);
            int var32 = this.field1379.method1303(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1383[var31 + var33] * (long) Statics.field1288 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1383[var31 + var33 - 1 - var36] * (long) class67.field1285[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1383[var33 - 1 - var37] * (long) class67.field1285[1][var37] >> 16);
                    }
                    field1383[var33] = var35;
                    var30 = this.field1374.method1252(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1383[var31 + var33] * (long) Statics.field1288 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1383[var31 + var33 - 1 - var40] * (long) class67.field1285[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1383[var33 - 1 - var41] * (long) class67.field1285[1][var41] >> 16);
                        }
                        field1383[var33] = var39;
                        var30 = this.field1374.method1252(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1383[var31 + var33 - 1 - var43] * (long) class67.field1285[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1383[var33 - 1 - var44] * (long) class67.field1285[1][var44] >> 16);
                            }
                            field1383[var33] = var42;
                            this.field1374.method1252(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1379.method1303(0, (float) var30 / 65536.0F);
                    var32 = this.field1379.method1303(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1383[var46] < -32768) {
                field1383[var46] = -32768;
            }
            if (field1383[var46] > 32767) {
                field1383[var46] = 32767;
            }
        }
        return field1383;
    }

    @ObfuscatedName("by.r(III)I")
    public final int method1508(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1385[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1381[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("by.j(Ldp;)V")
    public final void method1504(class123 arg0) {
        this.field1368 = new class61();
        this.field1368.method1258(arg0);
        this.field1384 = new class61();
        this.field1384.method1258(arg0);
        int var2 = arg0.method2408();
        if (var2 != 0) {
            arg0.field2057--;
            this.field1380 = new class61();
            this.field1380.method1258(arg0);
            this.field1369 = new class61();
            this.field1369.method1258(arg0);
        }
        int var3 = arg0.method2408();
        if (var3 != 0) {
            arg0.field2057--;
            this.field1370 = new class61();
            this.field1370.method1258(arg0);
            this.field1367 = new class61();
            this.field1367.method1258(arg0);
        }
        int var4 = arg0.method2408();
        if (var4 != 0) {
            arg0.field2057--;
            this.field1372 = new class61();
            this.field1372.method1258(arg0);
            this.field1366 = new class61();
            this.field1366.method1258(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2421();
            if (var6 == 0) {
                break;
            }
            this.field1373[var5] = var6;
            this.field1375[var5] = arg0.method2420();
            this.field1377[var5] = arg0.method2421();
        }
        this.field1371 = arg0.method2421();
        this.field1378 = arg0.method2421();
        this.field1390 = arg0.method2403();
        this.field1382 = arg0.method2403();
        this.field1379 = new class67();
        this.field1374 = new class61();
        this.field1379.method1298(arg0, this.field1374);
    }
}
