package deob;

import java.util.Random;

@ObfuscatedName("bk")
public class class75 {

    @ObfuscatedName("bk.i")
    public class61 field1377;

    @ObfuscatedName("bk.h")
    public class61 field1376;

    @ObfuscatedName("bk.e")
    public class61 field1398;

    @ObfuscatedName("bk.g")
    public class61 field1401;

    @ObfuscatedName("bk.n")
    public class61 field1379;

    @ObfuscatedName("bk.u")
    public class61 field1381;

    @ObfuscatedName("bk.d")
    public class61 field1382;

    @ObfuscatedName("bk.l")
    public class61 field1383;

    @ObfuscatedName("bk.m")
    public int[] field1384 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bk.j")
    public int[] field1385 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bk.y")
    public int[] field1386 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bk.s")
    public int field1387 = 0;

    @ObfuscatedName("bk.p")
    public int field1388 = 100;

    @ObfuscatedName("bk.v")
    public class67 field1389;

    @ObfuscatedName("bk.r")
    public class61 field1394;

    @ObfuscatedName("bk.c")
    public int field1391 = 500;

    @ObfuscatedName("bk.w")
    public int field1392 = 0;

    @ObfuscatedName("bk.x")
    public static int[] field1393;

    @ObfuscatedName("bk.k")
    public static int[] field1390 = new int[32768];

    @ObfuscatedName("bk.z")
    public static int[] field1395;

    @ObfuscatedName("bk.o")
    public static int[] field1397;

    @ObfuscatedName("bk.f")
    public static int[] field1399;

    @ObfuscatedName("bk.b")
    public static int[] field1378;

    @ObfuscatedName("bk.t")
    public static int[] field1400;

    @ObfuscatedName("bk.a")
    public static int[] field1380;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1390[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1395 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1395[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1393 = new int[220500];
        field1397 = new int[5];
        field1399 = new int[5];
        field1378 = new int[5];
        field1400 = new int[5];
        field1380 = new int[5];
    }

    @ObfuscatedName("bk.i(II)[I")
    public final int[] method1511(int arg0, int arg1) {
        class124.method2614(field1393, 0, arg0);
        if (arg1 < 10) {
            return field1393;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1377.method1237();
        this.field1376.method1237();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1398 != null) {
            this.field1398.method1237();
            this.field1401.method1237();
            var5 = (int) ((double) (this.field1398.field1253 - this.field1398.field1256) * 32.768D / var3);
            var6 = (int) ((double) this.field1398.field1256 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1379 != null) {
            this.field1379.method1237();
            this.field1381.method1237();
            var8 = (int) ((double) (this.field1379.field1253 - this.field1379.field1256) * 32.768D / var3);
            var9 = (int) ((double) this.field1379.field1256 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1384[var11] != 0) {
                field1397[var11] = 0;
                field1399[var11] = (int) ((double) this.field1386[var11] * var3);
                field1378[var11] = (this.field1384[var11] << 14) / 100;
                field1400[var11] = (int) ((double) (this.field1377.field1253 - this.field1377.field1256) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1385[var11]) / var3);
                field1380[var11] = (int) ((double) this.field1377.field1256 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1377.method1241(arg0);
            int var14 = this.field1376.method1241(arg0);
            if (this.field1398 != null) {
                int var15 = this.field1398.method1241(arg0);
                int var16 = this.field1401.method1241(arg0);
                var13 += this.method1513(var7, var16, this.field1398.field1257) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1379 != null) {
                int var17 = this.field1379.method1241(arg0);
                int var18 = this.field1381.method1241(arg0);
                var14 = var14 * ((this.method1513(var10, var18, this.field1379.field1257) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1384[var19] != 0) {
                    int var20 = field1399[var19] + var12;
                    if (var20 < arg0) {
                        field1393[var20] += this.method1513(field1397[var19], field1378[var19] * var14 >> 15, this.field1377.field1257);
                        field1397[var19] += (field1400[var19] * var13 >> 16) + field1380[var19];
                    }
                }
            }
        }
        if (this.field1382 != null) {
            this.field1382.method1237();
            this.field1383.method1237();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1382.method1241(arg0);
                int var26 = this.field1383.method1241(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1382.field1253 - this.field1382.field1256) * var25 >> 8) + this.field1382.field1256;
                } else {
                    var27 = ((this.field1382.field1253 - this.field1382.field1256) * var26 >> 8) + this.field1382.field1256;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1393[var24] = 0;
                }
            }
        }
        if (this.field1387 > 0 && this.field1388 > 0) {
            int var28 = (int) ((double) this.field1387 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1393[var29] += field1393[var29 - var28] * this.field1388 / 100;
            }
        }
        if (this.field1389.field1301[0] > 0 || this.field1389.field1301[1] > 0) {
            this.field1394.method1237();
            int var30 = this.field1394.method1241(arg0 + 1);
            int var31 = this.field1389.method1306(0, (float) var30 / 65536.0F);
            int var32 = this.field1389.method1306(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1393[var31 + var33] * (long) Statics.field1298 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1393[var31 + var33 - 1 - var36] * (long) class67.field1296[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1393[var33 - 1 - var37] * (long) class67.field1296[1][var37] >> 16);
                    }
                    field1393[var33] = var35;
                    var30 = this.field1394.method1241(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1393[var31 + var33] * (long) Statics.field1298 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1393[var31 + var33 - 1 - var40] * (long) class67.field1296[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1393[var33 - 1 - var41] * (long) class67.field1296[1][var41] >> 16);
                        }
                        field1393[var33] = var39;
                        var30 = this.field1394.method1241(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1393[var31 + var33 - 1 - var43] * (long) class67.field1296[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1393[var33 - 1 - var44] * (long) class67.field1296[1][var44] >> 16);
                            }
                            field1393[var33] = var42;
                            this.field1394.method1241(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1389.method1306(0, (float) var30 / 65536.0F);
                    var32 = this.field1389.method1306(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1393[var46] < -32768) {
                field1393[var46] = -32768;
            }
            if (field1393[var46] > 32767) {
                field1393[var46] = 32767;
            }
        }
        return field1393;
    }

    @ObfuscatedName("bk.h(III)I")
    public final int method1513(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1395[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1390[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bk.e(Ldn;)V")
    public final void method1514(class123 arg0) {
        this.field1377 = new class61();
        this.field1377.method1235(arg0);
        this.field1376 = new class61();
        this.field1376.method1235(arg0);
        int var2 = arg0.method2404();
        if (var2 != 0) {
            arg0.field2046--;
            this.field1398 = new class61();
            this.field1398.method1235(arg0);
            this.field1401 = new class61();
            this.field1401.method1235(arg0);
        }
        int var3 = arg0.method2404();
        if (var3 != 0) {
            arg0.field2046--;
            this.field1379 = new class61();
            this.field1379.method1235(arg0);
            this.field1381 = new class61();
            this.field1381.method1235(arg0);
        }
        int var4 = arg0.method2404();
        if (var4 != 0) {
            arg0.field2046--;
            this.field1382 = new class61();
            this.field1382.method1235(arg0);
            this.field1383 = new class61();
            this.field1383.method1235(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2433();
            if (var6 == 0) {
                break;
            }
            this.field1384[var5] = var6;
            this.field1385[var5] = arg0.method2416();
            this.field1386[var5] = arg0.method2433();
        }
        this.field1387 = arg0.method2433();
        this.field1388 = arg0.method2433();
        this.field1391 = arg0.method2406();
        this.field1392 = arg0.method2406();
        this.field1389 = new class67();
        this.field1394 = new class61();
        this.field1389.method1292(arg0, this.field1394);
    }
}
