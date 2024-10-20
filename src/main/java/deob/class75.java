package deob;

import java.util.Random;

@ObfuscatedName("bl")
public class class75 {

    @ObfuscatedName("bl.f")
    public class61 field1384;

    @ObfuscatedName("bl.e")
    public class61 field1380;

    @ObfuscatedName("bl.n")
    public class61 field1369;

    @ObfuscatedName("bl.t")
    public class61 field1370;

    @ObfuscatedName("bl.v")
    public class61 field1378;

    @ObfuscatedName("bl.b")
    public class61 field1374;

    @ObfuscatedName("bl.m")
    public class61 field1375;

    @ObfuscatedName("bl.k")
    public class61 field1373;

    @ObfuscatedName("bl.c")
    public int[] field1377 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bl.w")
    public int[] field1376 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bl.l")
    public int[] field1379 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bl.h")
    public int field1388 = 0;

    @ObfuscatedName("bl.i")
    public int field1381 = 100;

    @ObfuscatedName("bl.u")
    public class67 field1371;

    @ObfuscatedName("bl.x")
    public class61 field1382;

    @ObfuscatedName("bl.d")
    public int field1372 = 500;

    @ObfuscatedName("bl.o")
    public int field1385 = 0;

    @ObfuscatedName("bl.j")
    public static int[] field1386;

    @ObfuscatedName("bl.q")
    public static int[] field1387 = new int[32768];

    @ObfuscatedName("bl.r")
    public static int[] field1394;

    @ObfuscatedName("bl.z")
    public static int[] field1390;

    @ObfuscatedName("bl.p")
    public static int[] field1391;

    @ObfuscatedName("bl.y")
    public static int[] field1392;

    @ObfuscatedName("bl.s")
    public static int[] field1393;

    @ObfuscatedName("bl.g")
    public static int[] field1383;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1387[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1394 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1394[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1386 = new int[220500];
        field1390 = new int[5];
        field1391 = new int[5];
        field1392 = new int[5];
        field1393 = new int[5];
        field1383 = new int[5];
    }

    @ObfuscatedName("bl.f(II)[I")
    public final int[] method1534(int arg0, int arg1) {
        class124.method2607(field1386, 0, arg0);
        if (arg1 < 10) {
            return field1386;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1384.method1258();
        this.field1380.method1258();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1369 != null) {
            this.field1369.method1258();
            this.field1370.method1258();
            var5 = (int) ((double) (this.field1369.field1249 - this.field1369.field1248) * 32.768D / var3);
            var6 = (int) ((double) this.field1369.field1248 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1378 != null) {
            this.field1378.method1258();
            this.field1374.method1258();
            var8 = (int) ((double) (this.field1378.field1249 - this.field1378.field1248) * 32.768D / var3);
            var9 = (int) ((double) this.field1378.field1248 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1377[var11] != 0) {
                field1390[var11] = 0;
                field1391[var11] = (int) ((double) this.field1379[var11] * var3);
                field1392[var11] = (this.field1377[var11] << 14) / 100;
                field1393[var11] = (int) ((double) (this.field1384.field1249 - this.field1384.field1248) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1376[var11]) / var3);
                field1383[var11] = (int) ((double) this.field1384.field1248 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1384.method1259(arg0);
            int var14 = this.field1380.method1259(arg0);
            if (this.field1369 != null) {
                int var15 = this.field1369.method1259(arg0);
                int var16 = this.field1370.method1259(arg0);
                var13 += this.method1535(var7, var16, this.field1369.field1252) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1378 != null) {
                int var17 = this.field1378.method1259(arg0);
                int var18 = this.field1374.method1259(arg0);
                var14 = var14 * ((this.method1535(var10, var18, this.field1378.field1252) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1377[var19] != 0) {
                    int var20 = field1391[var19] + var12;
                    if (var20 < arg0) {
                        field1386[var20] += this.method1535(field1390[var19], field1392[var19] * var14 >> 15, this.field1384.field1252);
                        field1390[var19] += (field1393[var19] * var13 >> 16) + field1383[var19];
                    }
                }
            }
        }
        if (this.field1375 != null) {
            this.field1375.method1258();
            this.field1373.method1258();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1375.method1259(arg0);
                int var26 = this.field1373.method1259(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1375.field1249 - this.field1375.field1248) * var25 >> 8) + this.field1375.field1248;
                } else {
                    var27 = ((this.field1375.field1249 - this.field1375.field1248) * var26 >> 8) + this.field1375.field1248;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1386[var24] = 0;
                }
            }
        }
        if (this.field1388 > 0 && this.field1381 > 0) {
            int var28 = (int) ((double) this.field1388 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1386[var29] += field1386[var29 - var28] * this.field1381 / 100;
            }
        }
        if (this.field1371.field1289[0] > 0 || this.field1371.field1289[1] > 0) {
            this.field1382.method1258();
            int var30 = this.field1382.method1259(arg0 + 1);
            int var31 = this.field1371.method1318(0, (float) var30 / 65536.0F);
            int var32 = this.field1371.method1318(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1386[var31 + var33] * (long) Statics.field1291 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1386[var31 + var33 - 1 - var36] * (long) class67.field1285[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1386[var33 - 1 - var37] * (long) class67.field1285[1][var37] >> 16);
                    }
                    field1386[var33] = var35;
                    var30 = this.field1382.method1259(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1386[var31 + var33] * (long) Statics.field1291 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1386[var31 + var33 - 1 - var40] * (long) class67.field1285[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1386[var33 - 1 - var41] * (long) class67.field1285[1][var41] >> 16);
                        }
                        field1386[var33] = var39;
                        var30 = this.field1382.method1259(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1386[var31 + var33 - 1 - var43] * (long) class67.field1285[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1386[var33 - 1 - var44] * (long) class67.field1285[1][var44] >> 16);
                            }
                            field1386[var33] = var42;
                            this.field1382.method1259(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1371.method1318(0, (float) var30 / 65536.0F);
                    var32 = this.field1371.method1318(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1386[var46] < -32768) {
                field1386[var46] = -32768;
            }
            if (field1386[var46] > 32767) {
                field1386[var46] = 32767;
            }
        }
        return field1386;
    }

    @ObfuscatedName("bl.e(III)I")
    public final int method1535(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1394[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1387[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bl.n(Ldx;)V")
    public final void method1536(class123 arg0) {
        this.field1384 = new class61();
        this.field1384.method1264(arg0);
        this.field1380 = new class61();
        this.field1380.method1264(arg0);
        int var2 = arg0.method2522();
        if (var2 != 0) {
            arg0.field2052--;
            this.field1369 = new class61();
            this.field1369.method1264(arg0);
            this.field1370 = new class61();
            this.field1370.method1264(arg0);
        }
        int var3 = arg0.method2522();
        if (var3 != 0) {
            arg0.field2052--;
            this.field1378 = new class61();
            this.field1378.method1264(arg0);
            this.field1374 = new class61();
            this.field1374.method1264(arg0);
        }
        int var4 = arg0.method2522();
        if (var4 != 0) {
            arg0.field2052--;
            this.field1375 = new class61();
            this.field1375.method1264(arg0);
            this.field1373 = new class61();
            this.field1373.method1264(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2412();
            if (var6 == 0) {
                break;
            }
            this.field1377[var5] = var6;
            this.field1376[var5] = arg0.method2415();
            this.field1379[var5] = arg0.method2412();
        }
        this.field1388 = arg0.method2412();
        this.field1381 = arg0.method2412();
        this.field1372 = arg0.method2401();
        this.field1385 = arg0.method2401();
        this.field1371 = new class67();
        this.field1382 = new class61();
        this.field1371.method1319(arg0, this.field1382);
    }
}
