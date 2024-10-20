package deob;

import java.util.Random;

@ObfuscatedName("bk")
public class class75 {

    @ObfuscatedName("bk.m")
    public class61 field1396;

    @ObfuscatedName("bk.w")
    public class61 field1397;

    @ObfuscatedName("bk.e")
    public class61 field1403;

    @ObfuscatedName("bk.o")
    public class61 field1408;

    @ObfuscatedName("bk.g")
    public class61 field1400;

    @ObfuscatedName("bk.l")
    public class61 field1401;

    @ObfuscatedName("bk.j")
    public class61 field1407;

    @ObfuscatedName("bk.r")
    public class61 field1398;

    @ObfuscatedName("bk.x")
    public int[] field1404 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bk.k")
    public int[] field1405 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bk.v")
    public int[] field1406 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bk.h")
    public int field1415 = 0;

    @ObfuscatedName("bk.u")
    public int field1409 = 100;

    @ObfuscatedName("bk.y")
    public class67 field1410;

    @ObfuscatedName("bk.p")
    public class61 field1402;

    @ObfuscatedName("bk.s")
    public int field1411 = 500;

    @ObfuscatedName("bk.f")
    public int field1412 = 0;

    @ObfuscatedName("bk.i")
    public static int[] field1413;

    @ObfuscatedName("bk.d")
    public static int[] field1414 = new int[32768];

    @ObfuscatedName("bk.t")
    public static int[] field1399;

    @ObfuscatedName("bk.z")
    public static int[] field1417;

    @ObfuscatedName("bk.n")
    public static int[] field1418;

    @ObfuscatedName("bk.q")
    public static int[] field1419;

    @ObfuscatedName("bk.a")
    public static int[] field1420;

    @ObfuscatedName("bk.b")
    public static int[] field1421;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1414[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1399 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1399[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1413 = new int[220500];
        field1417 = new int[5];
        field1418 = new int[5];
        field1419 = new int[5];
        field1420 = new int[5];
        field1421 = new int[5];
    }

    @ObfuscatedName("bk.m(II)[I")
    public final int[] method1559(int arg0, int arg1) {
        class124.method2606(field1413, 0, arg0);
        if (arg1 < 10) {
            return field1413;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1396.method1281();
        this.field1397.method1281();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1403 != null) {
            this.field1403.method1281();
            this.field1408.method1281();
            var5 = (int) ((double) (this.field1403.field1275 - this.field1403.field1274) * 32.768D / var3);
            var6 = (int) ((double) this.field1403.field1274 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1400 != null) {
            this.field1400.method1281();
            this.field1401.method1281();
            var8 = (int) ((double) (this.field1400.field1275 - this.field1400.field1274) * 32.768D / var3);
            var9 = (int) ((double) this.field1400.field1274 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1404[var11] != 0) {
                field1417[var11] = 0;
                field1418[var11] = (int) ((double) this.field1406[var11] * var3);
                field1419[var11] = (this.field1404[var11] << 14) / 100;
                field1420[var11] = (int) ((double) (this.field1396.field1275 - this.field1396.field1274) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1405[var11]) / var3);
                field1421[var11] = (int) ((double) this.field1396.field1274 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1396.method1274(arg0);
            int var14 = this.field1397.method1274(arg0);
            if (this.field1403 != null) {
                int var15 = this.field1403.method1274(arg0);
                int var16 = this.field1408.method1274(arg0);
                var13 += this.method1562(var7, var16, this.field1403.field1271) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1400 != null) {
                int var17 = this.field1400.method1274(arg0);
                int var18 = this.field1401.method1274(arg0);
                var14 = var14 * ((this.method1562(var10, var18, this.field1400.field1271) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1404[var19] != 0) {
                    int var20 = field1418[var19] + var12;
                    if (var20 < arg0) {
                        field1413[var20] += this.method1562(field1417[var19], field1419[var19] * var14 >> 15, this.field1396.field1271);
                        field1417[var19] += (field1420[var19] * var13 >> 16) + field1421[var19];
                    }
                }
            }
        }
        if (this.field1407 != null) {
            this.field1407.method1281();
            this.field1398.method1281();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1407.method1274(arg0);
                int var26 = this.field1398.method1274(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1407.field1275 - this.field1407.field1274) * var25 >> 8) + this.field1407.field1274;
                } else {
                    var27 = ((this.field1407.field1275 - this.field1407.field1274) * var26 >> 8) + this.field1407.field1274;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1413[var24] = 0;
                }
            }
        }
        if (this.field1415 > 0 && this.field1409 > 0) {
            int var28 = (int) ((double) this.field1415 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1413[var29] += field1413[var29 - var28] * this.field1409 / 100;
            }
        }
        if (this.field1410.field1310[0] > 0 || this.field1410.field1310[1] > 0) {
            this.field1402.method1281();
            int var30 = this.field1402.method1274(arg0 + 1);
            int var31 = this.field1410.method1337(0, (float) var30 / 65536.0F);
            int var32 = this.field1410.method1337(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1413[var31 + var33] * (long) Statics.field1318 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1413[var31 + var33 - 1 - var36] * (long) class67.field1316[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1413[var33 - 1 - var37] * (long) class67.field1316[1][var37] >> 16);
                    }
                    field1413[var33] = var35;
                    var30 = this.field1402.method1274(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1413[var31 + var33] * (long) Statics.field1318 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1413[var31 + var33 - 1 - var40] * (long) class67.field1316[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1413[var33 - 1 - var41] * (long) class67.field1316[1][var41] >> 16);
                        }
                        field1413[var33] = var39;
                        var30 = this.field1402.method1274(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1413[var31 + var33 - 1 - var43] * (long) class67.field1316[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1413[var33 - 1 - var44] * (long) class67.field1316[1][var44] >> 16);
                            }
                            field1413[var33] = var42;
                            this.field1402.method1274(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1410.method1337(0, (float) var30 / 65536.0F);
                    var32 = this.field1410.method1337(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1413[var46] < -32768) {
                field1413[var46] = -32768;
            }
            if (field1413[var46] > 32767) {
                field1413[var46] = 32767;
            }
        }
        return field1413;
    }

    @ObfuscatedName("bk.w(III)I")
    public final int method1562(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1399[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1414[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bk.e(Ldj;)V")
    public final void method1560(class123 arg0) {
        this.field1396 = new class61();
        this.field1396.method1273(arg0);
        this.field1397 = new class61();
        this.field1397.method1273(arg0);
        int var2 = arg0.method2398();
        if (var2 != 0) {
            arg0.field2046--;
            this.field1403 = new class61();
            this.field1403.method1273(arg0);
            this.field1408 = new class61();
            this.field1408.method1273(arg0);
        }
        int var3 = arg0.method2398();
        if (var3 != 0) {
            arg0.field2046--;
            this.field1400 = new class61();
            this.field1400.method1273(arg0);
            this.field1401 = new class61();
            this.field1401.method1273(arg0);
        }
        int var4 = arg0.method2398();
        if (var4 != 0) {
            arg0.field2046--;
            this.field1407 = new class61();
            this.field1407.method1273(arg0);
            this.field1398 = new class61();
            this.field1398.method1273(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2427();
            if (var6 == 0) {
                break;
            }
            this.field1404[var5] = var6;
            this.field1405[var5] = arg0.method2426();
            this.field1406[var5] = arg0.method2427();
        }
        this.field1415 = arg0.method2427();
        this.field1409 = arg0.method2427();
        this.field1411 = arg0.method2548();
        this.field1412 = arg0.method2548();
        this.field1410 = new class67();
        this.field1402 = new class61();
        this.field1410.method1338(arg0, this.field1402);
    }
}
