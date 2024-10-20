package deob;

import java.util.Random;

@ObfuscatedName("bs")
public class class75 {

    @ObfuscatedName("bs.e")
    public class61 field1407;

    @ObfuscatedName("bs.l")
    public class61 field1393;

    @ObfuscatedName("bs.c")
    public class61 field1417;

    @ObfuscatedName("bs.h")
    public class61 field1395;

    @ObfuscatedName("bs.r")
    public class61 field1402;

    @ObfuscatedName("bs.a")
    public class61 field1397;

    @ObfuscatedName("bs.b")
    public class61 field1398;

    @ObfuscatedName("bs.u")
    public class61 field1405;

    @ObfuscatedName("bs.o")
    public int[] field1400 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bs.p")
    public int[] field1399 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bs.i")
    public int[] field1392 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bs.q")
    public int field1403 = 0;

    @ObfuscatedName("bs.g")
    public int field1404 = 100;

    @ObfuscatedName("bs.j")
    public class67 field1396;

    @ObfuscatedName("bs.w")
    public class61 field1406;

    @ObfuscatedName("bs.x")
    public int field1410 = 500;

    @ObfuscatedName("bs.f")
    public int field1408 = 0;

    @ObfuscatedName("bs.t")
    public static int[] field1401;

    @ObfuscatedName("bs.z")
    public static int[] field1394 = new int[32768];

    @ObfuscatedName("bs.y")
    public static int[] field1411;

    @ObfuscatedName("bs.v")
    public static int[] field1413;

    @ObfuscatedName("bs.k")
    public static int[] field1414;

    @ObfuscatedName("bs.n")
    public static int[] field1415;

    @ObfuscatedName("bs.d")
    public static int[] field1416;

    @ObfuscatedName("bs.s")
    public static int[] field1409;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1394[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1411 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1411[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1401 = new int[220500];
        field1413 = new int[5];
        field1414 = new int[5];
        field1415 = new int[5];
        field1416 = new int[5];
        field1409 = new int[5];
    }

    @ObfuscatedName("bs.e(II)[I")
    public final int[] method1566(int arg0, int arg1) {
        class124.method2683(field1401, 0, arg0);
        if (arg1 < 10) {
            return field1401;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1407.method1298();
        this.field1393.method1298();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1417 != null) {
            this.field1417.method1298();
            this.field1395.method1298();
            var5 = (int) ((double) (this.field1417.field1270 - this.field1417.field1274) * 32.768D / var3);
            var6 = (int) ((double) this.field1417.field1274 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1402 != null) {
            this.field1402.method1298();
            this.field1397.method1298();
            var8 = (int) ((double) (this.field1402.field1270 - this.field1402.field1274) * 32.768D / var3);
            var9 = (int) ((double) this.field1402.field1274 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1400[var11] != 0) {
                field1413[var11] = 0;
                field1414[var11] = (int) ((double) this.field1392[var11] * var3);
                field1415[var11] = (this.field1400[var11] << 14) / 100;
                field1416[var11] = (int) ((double) (this.field1407.field1270 - this.field1407.field1274) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1399[var11]) / var3);
                field1409[var11] = (int) ((double) this.field1407.field1274 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1407.method1304(arg0);
            int var14 = this.field1393.method1304(arg0);
            if (this.field1417 != null) {
                int var15 = this.field1417.method1304(arg0);
                int var16 = this.field1395.method1304(arg0);
                var13 += this.method1574(var7, var16, this.field1417.field1271) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1402 != null) {
                int var17 = this.field1402.method1304(arg0);
                int var18 = this.field1397.method1304(arg0);
                var14 = var14 * ((this.method1574(var10, var18, this.field1402.field1271) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1400[var19] != 0) {
                    int var20 = field1414[var19] + var12;
                    if (var20 < arg0) {
                        field1401[var20] += this.method1574(field1413[var19], field1415[var19] * var14 >> 15, this.field1407.field1271);
                        field1413[var19] += (field1416[var19] * var13 >> 16) + field1409[var19];
                    }
                }
            }
        }
        if (this.field1398 != null) {
            this.field1398.method1298();
            this.field1405.method1298();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1398.method1304(arg0);
                int var26 = this.field1405.method1304(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1398.field1270 - this.field1398.field1274) * var25 >> 8) + this.field1398.field1274;
                } else {
                    var27 = ((this.field1398.field1270 - this.field1398.field1274) * var26 >> 8) + this.field1398.field1274;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1401[var24] = 0;
                }
            }
        }
        if (this.field1403 > 0 && this.field1404 > 0) {
            int var28 = (int) ((double) this.field1403 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1401[var29] += field1401[var29 - var28] * this.field1404 / 100;
            }
        }
        if (this.field1396.field1317[0] > 0 || this.field1396.field1317[1] > 0) {
            this.field1406.method1298();
            int var30 = this.field1406.method1304(arg0 + 1);
            int var31 = this.field1396.method1356(0, (float) var30 / 65536.0F);
            int var32 = this.field1396.method1356(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1401[var31 + var33] * (long) Statics.field1314 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1401[var31 + var33 - 1 - var36] * (long) class67.field1312[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1401[var33 - 1 - var37] * (long) class67.field1312[1][var37] >> 16);
                    }
                    field1401[var33] = var35;
                    var30 = this.field1406.method1304(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1401[var31 + var33] * (long) Statics.field1314 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1401[var31 + var33 - 1 - var40] * (long) class67.field1312[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1401[var33 - 1 - var41] * (long) class67.field1312[1][var41] >> 16);
                        }
                        field1401[var33] = var39;
                        var30 = this.field1406.method1304(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1401[var31 + var33 - 1 - var43] * (long) class67.field1312[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1401[var33 - 1 - var44] * (long) class67.field1312[1][var44] >> 16);
                            }
                            field1401[var33] = var42;
                            this.field1406.method1304(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1396.method1356(0, (float) var30 / 65536.0F);
                    var32 = this.field1396.method1356(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1401[var46] < -32768) {
                field1401[var46] = -32768;
            }
            if (field1401[var46] > 32767) {
                field1401[var46] = 32767;
            }
        }
        return field1401;
    }

    @ObfuscatedName("bs.l(III)I")
    public final int method1574(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1411[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1394[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bs.c(Ldd;)V")
    public final void method1572(class123 arg0) {
        this.field1407 = new class61();
        this.field1407.method1296(arg0);
        this.field1393 = new class61();
        this.field1393.method1296(arg0);
        int var2 = arg0.method2464();
        if (var2 != 0) {
            arg0.field2062--;
            this.field1417 = new class61();
            this.field1417.method1296(arg0);
            this.field1395 = new class61();
            this.field1395.method1296(arg0);
        }
        int var3 = arg0.method2464();
        if (var3 != 0) {
            arg0.field2062--;
            this.field1402 = new class61();
            this.field1402.method1296(arg0);
            this.field1397 = new class61();
            this.field1397.method1296(arg0);
        }
        int var4 = arg0.method2464();
        if (var4 != 0) {
            arg0.field2062--;
            this.field1398 = new class61();
            this.field1398.method1296(arg0);
            this.field1405 = new class61();
            this.field1405.method1296(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2526();
            if (var6 == 0) {
                break;
            }
            this.field1400[var5] = var6;
            this.field1399[var5] = arg0.method2556();
            this.field1392[var5] = arg0.method2526();
        }
        this.field1403 = arg0.method2526();
        this.field1404 = arg0.method2526();
        this.field1410 = arg0.method2466();
        this.field1408 = arg0.method2466();
        this.field1396 = new class67();
        this.field1406 = new class61();
        this.field1396.method1357(arg0, this.field1406);
    }
}
