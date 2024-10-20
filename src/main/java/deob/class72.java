package deob;

import java.util.Random;

@ObfuscatedName("by")
public class class72 {

    @ObfuscatedName("by.j")
    public class58 field1349;

    @ObfuscatedName("by.l")
    public class58 field1331;

    @ObfuscatedName("by.a")
    public class58 field1339;

    @ObfuscatedName("by.i")
    public class58 field1333;

    @ObfuscatedName("by.f")
    public class58 field1334;

    @ObfuscatedName("by.m")
    public class58 field1335;

    @ObfuscatedName("by.o")
    public class58 field1342;

    @ObfuscatedName("by.h")
    public class58 field1337;

    @ObfuscatedName("by.n")
    public int[] field1338 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("by.k")
    public int[] field1330 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("by.r")
    public int[] field1340 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("by.b")
    public int field1341 = 0;

    @ObfuscatedName("by.q")
    public int field1355 = 100;

    @ObfuscatedName("by.u")
    public class64 field1332;

    @ObfuscatedName("by.g")
    public class58 field1346;

    @ObfuscatedName("by.y")
    public int field1345 = 500;

    @ObfuscatedName("by.s")
    public int field1351 = 0;

    @ObfuscatedName("by.d")
    public static int[] field1347;

    @ObfuscatedName("by.z")
    public static int[] field1348 = new int[32768];

    @ObfuscatedName("by.p")
    public static int[] field1343;

    @ObfuscatedName("by.t")
    public static int[] field1344;

    @ObfuscatedName("by.c")
    public static int[] field1352;

    @ObfuscatedName("by.x")
    public static int[] field1336;

    @ObfuscatedName("by.e")
    public static int[] field1354;

    @ObfuscatedName("by.v")
    public static int[] field1353;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1348[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1343 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1343[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1347 = new int[220500];
        field1344 = new int[5];
        field1352 = new int[5];
        field1336 = new int[5];
        field1354 = new int[5];
        field1353 = new int[5];
    }

    @ObfuscatedName("by.j(II)[I")
    public final int[] method1464(int arg0, int arg1) {
        class120.method2539(field1347, 0, arg0);
        if (arg1 < 10) {
            return field1347;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1349.method1190();
        this.field1331.method1190();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1339 != null) {
            this.field1339.method1190();
            this.field1333.method1190();
            var5 = (int) ((double) (this.field1339.field1210 - this.field1339.field1209) * 32.768D / var3);
            var6 = (int) ((double) this.field1339.field1209 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1334 != null) {
            this.field1334.method1190();
            this.field1335.method1190();
            var8 = (int) ((double) (this.field1334.field1210 - this.field1334.field1209) * 32.768D / var3);
            var9 = (int) ((double) this.field1334.field1209 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1338[var11] != 0) {
                field1344[var11] = 0;
                field1352[var11] = (int) ((double) this.field1340[var11] * var3);
                field1336[var11] = (this.field1338[var11] << 14) / 100;
                field1354[var11] = (int) ((double) (this.field1349.field1210 - this.field1349.field1209) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1330[var11]) / var3);
                field1353[var11] = (int) ((double) this.field1349.field1209 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1349.method1191(arg0);
            int var14 = this.field1331.method1191(arg0);
            if (this.field1339 != null) {
                int var15 = this.field1339.method1191(arg0);
                int var16 = this.field1333.method1191(arg0);
                var13 += this.method1465(var7, var16, this.field1339.field1211) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1334 != null) {
                int var17 = this.field1334.method1191(arg0);
                int var18 = this.field1335.method1191(arg0);
                var14 = var14 * ((this.method1465(var10, var18, this.field1334.field1211) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1338[var19] != 0) {
                    int var20 = field1352[var19] + var12;
                    if (var20 < arg0) {
                        field1347[var20] += this.method1465(field1344[var19], field1336[var19] * var14 >> 15, this.field1349.field1211);
                        field1344[var19] += (field1354[var19] * var13 >> 16) + field1353[var19];
                    }
                }
            }
        }
        if (this.field1342 != null) {
            this.field1342.method1190();
            this.field1337.method1190();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1342.method1191(arg0);
                int var26 = this.field1337.method1191(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1342.field1210 - this.field1342.field1209) * var25 >> 8) + this.field1342.field1209;
                } else {
                    var27 = ((this.field1342.field1210 - this.field1342.field1209) * var26 >> 8) + this.field1342.field1209;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1347[var24] = 0;
                }
            }
        }
        if (this.field1341 > 0 && this.field1355 > 0) {
            int var28 = (int) ((double) this.field1341 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1347[var29] += field1347[var29 - var28] * this.field1355 / 100;
            }
        }
        if (this.field1332.field1255[0] > 0 || this.field1332.field1255[1] > 0) {
            this.field1346.method1190();
            int var30 = this.field1346.method1191(arg0 + 1);
            int var31 = this.field1332.method1253(0, (float) var30 / 65536.0F);
            int var32 = this.field1332.method1253(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1347[var31 + var33] * (long) Statics.field1252 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1347[var31 + var33 - 1 - var36] * (long) class64.field1250[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1347[var33 - 1 - var37] * (long) class64.field1250[1][var37] >> 16);
                    }
                    field1347[var33] = var35;
                    var30 = this.field1346.method1191(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1347[var31 + var33] * (long) Statics.field1252 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1347[var31 + var33 - 1 - var40] * (long) class64.field1250[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1347[var33 - 1 - var41] * (long) class64.field1250[1][var41] >> 16);
                        }
                        field1347[var33] = var39;
                        var30 = this.field1346.method1191(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1347[var31 + var33 - 1 - var43] * (long) class64.field1250[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1347[var33 - 1 - var44] * (long) class64.field1250[1][var44] >> 16);
                            }
                            field1347[var33] = var42;
                            this.field1346.method1191(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1332.method1253(0, (float) var30 / 65536.0F);
                    var32 = this.field1332.method1253(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1347[var46] < -32768) {
                field1347[var46] = -32768;
            }
            if (field1347[var46] > 32767) {
                field1347[var46] = 32767;
            }
        }
        return field1347;
    }

    @ObfuscatedName("by.l(III)I")
    public final int method1465(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1343[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1348[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("by.a(Ldc;)V")
    public final void method1466(class119 arg0) {
        this.field1349 = new class58();
        this.field1349.method1188(arg0);
        this.field1331 = new class58();
        this.field1331.method1188(arg0);
        int var2 = arg0.method2316();
        if (var2 != 0) {
            arg0.field1999--;
            this.field1339 = new class58();
            this.field1339.method1188(arg0);
            this.field1333 = new class58();
            this.field1333.method1188(arg0);
        }
        int var3 = arg0.method2316();
        if (var3 != 0) {
            arg0.field1999--;
            this.field1334 = new class58();
            this.field1334.method1188(arg0);
            this.field1335 = new class58();
            this.field1335.method1188(arg0);
        }
        int var4 = arg0.method2316();
        if (var4 != 0) {
            arg0.field1999--;
            this.field1342 = new class58();
            this.field1342.method1188(arg0);
            this.field1337 = new class58();
            this.field1337.method1188(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2329();
            if (var6 == 0) {
                break;
            }
            this.field1338[var5] = var6;
            this.field1330[var5] = arg0.method2328();
            this.field1340[var5] = arg0.method2329();
        }
        this.field1341 = arg0.method2329();
        this.field1355 = arg0.method2329();
        this.field1345 = arg0.method2318();
        this.field1351 = arg0.method2318();
        this.field1332 = new class64();
        this.field1346 = new class58();
        this.field1332.method1250(arg0, this.field1346);
    }
}
