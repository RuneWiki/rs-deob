package deob;

import java.util.Random;

@ObfuscatedName("bs")
public class class72 {

    @ObfuscatedName("bs.w")
    public class58 field1337;

    @ObfuscatedName("bs.x")
    public class58 field1329;

    @ObfuscatedName("bs.t")
    public class58 field1344;

    @ObfuscatedName("bs.p")
    public class58 field1331;

    @ObfuscatedName("bs.e")
    public class58 field1332;

    @ObfuscatedName("bs.y")
    public class58 field1346;

    @ObfuscatedName("bs.m")
    public class58 field1334;

    @ObfuscatedName("bs.c")
    public class58 field1351;

    @ObfuscatedName("bs.v")
    public int[] field1336 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bs.l")
    public int[] field1348 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bs.z")
    public int[] field1338 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bs.s")
    public int field1339 = 0;

    @ObfuscatedName("bs.j")
    public int field1340 = 100;

    @ObfuscatedName("bs.q")
    public class64 field1341;

    @ObfuscatedName("bs.a")
    public class58 field1342;

    @ObfuscatedName("bs.d")
    public int field1343 = 500;

    @ObfuscatedName("bs.u")
    public int field1330 = 0;

    @ObfuscatedName("bs.i")
    public static int[] field1345;

    @ObfuscatedName("bs.o")
    public static int[] field1352 = new int[32768];

    @ObfuscatedName("bs.h")
    public static int[] field1328;

    @ObfuscatedName("bs.f")
    public static int[] field1349;

    @ObfuscatedName("bs.r")
    public static int[] field1350;

    @ObfuscatedName("bs.n")
    public static int[] field1335;

    @ObfuscatedName("bs.g")
    public static int[] field1347;

    @ObfuscatedName("bs.b")
    public static int[] field1353;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1352[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1328 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1328[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1345 = new int[220500];
        field1349 = new int[5];
        field1350 = new int[5];
        field1335 = new int[5];
        field1347 = new int[5];
        field1353 = new int[5];
    }

    @ObfuscatedName("bs.w(II)[I")
    public final int[] method1470(int arg0, int arg1) {
        class121.method2564(field1345, 0, arg0);
        if (arg1 < 10) {
            return field1345;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1337.method1206();
        this.field1329.method1206();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1344 != null) {
            this.field1344.method1206();
            this.field1331.method1206();
            var5 = (int) ((double) (this.field1344.field1209 - this.field1344.field1208) * 32.768D / var3);
            var6 = (int) ((double) this.field1344.field1208 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1332 != null) {
            this.field1332.method1206();
            this.field1346.method1206();
            var8 = (int) ((double) (this.field1332.field1209 - this.field1332.field1208) * 32.768D / var3);
            var9 = (int) ((double) this.field1332.field1208 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1336[var11] != 0) {
                field1349[var11] = 0;
                field1350[var11] = (int) ((double) this.field1338[var11] * var3);
                field1335[var11] = (this.field1336[var11] << 14) / 100;
                field1347[var11] = (int) ((double) (this.field1337.field1209 - this.field1337.field1208) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1348[var11]) / var3);
                field1353[var11] = (int) ((double) this.field1337.field1208 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1337.method1208(arg0);
            int var14 = this.field1329.method1208(arg0);
            if (this.field1344 != null) {
                int var15 = this.field1344.method1208(arg0);
                int var16 = this.field1331.method1208(arg0);
                var13 += this.method1471(var7, var16, this.field1344.field1210) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1332 != null) {
                int var17 = this.field1332.method1208(arg0);
                int var18 = this.field1346.method1208(arg0);
                var14 = var14 * ((this.method1471(var10, var18, this.field1332.field1210) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1336[var19] != 0) {
                    int var20 = field1350[var19] + var12;
                    if (var20 < arg0) {
                        field1345[var20] += this.method1471(field1349[var19], field1335[var19] * var14 >> 15, this.field1337.field1210);
                        field1349[var19] += (field1347[var19] * var13 >> 16) + field1353[var19];
                    }
                }
            }
        }
        if (this.field1334 != null) {
            this.field1334.method1206();
            this.field1351.method1206();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1334.method1208(arg0);
                int var26 = this.field1351.method1208(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1334.field1209 - this.field1334.field1208) * var25 >> 8) + this.field1334.field1208;
                } else {
                    var27 = ((this.field1334.field1209 - this.field1334.field1208) * var26 >> 8) + this.field1334.field1208;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1345[var24] = 0;
                }
            }
        }
        if (this.field1339 > 0 && this.field1340 > 0) {
            int var28 = (int) ((double) this.field1339 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1345[var29] += field1345[var29 - var28] * this.field1340 / 100;
            }
        }
        if (this.field1341.field1243[0] > 0 || this.field1341.field1243[1] > 0) {
            this.field1342.method1206();
            int var30 = this.field1342.method1208(arg0 + 1);
            int var31 = this.field1341.method1263(0, (float) var30 / 65536.0F);
            int var32 = this.field1341.method1263(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1345[var31 + var33] * (long) Statics.field1250 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1345[var31 + var33 - 1 - var36] * (long) class64.field1248[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1345[var33 - 1 - var37] * (long) class64.field1248[1][var37] >> 16);
                    }
                    field1345[var33] = var35;
                    var30 = this.field1342.method1208(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1345[var31 + var33] * (long) Statics.field1250 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1345[var31 + var33 - 1 - var40] * (long) class64.field1248[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1345[var33 - 1 - var41] * (long) class64.field1248[1][var41] >> 16);
                        }
                        field1345[var33] = var39;
                        var30 = this.field1342.method1208(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1345[var31 + var33 - 1 - var43] * (long) class64.field1248[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1345[var33 - 1 - var44] * (long) class64.field1248[1][var44] >> 16);
                            }
                            field1345[var33] = var42;
                            this.field1342.method1208(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1341.method1263(0, (float) var30 / 65536.0F);
                    var32 = this.field1341.method1263(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1345[var46] < -32768) {
                field1345[var46] = -32768;
            }
            if (field1345[var46] > 32767) {
                field1345[var46] = 32767;
            }
        }
        return field1345;
    }

    @ObfuscatedName("bs.x(III)I")
    public final int method1471(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1328[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1352[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bs.t(Lde;)V")
    public final void method1469(class120 arg0) {
        this.field1337 = new class58();
        this.field1337.method1204(arg0);
        this.field1329 = new class58();
        this.field1329.method1204(arg0);
        int var2 = arg0.method2363();
        if (var2 != 0) {
            arg0.field2012--;
            this.field1344 = new class58();
            this.field1344.method1204(arg0);
            this.field1331 = new class58();
            this.field1331.method1204(arg0);
        }
        int var3 = arg0.method2363();
        if (var3 != 0) {
            arg0.field2012--;
            this.field1332 = new class58();
            this.field1332.method1204(arg0);
            this.field1346 = new class58();
            this.field1346.method1204(arg0);
        }
        int var4 = arg0.method2363();
        if (var4 != 0) {
            arg0.field2012--;
            this.field1334 = new class58();
            this.field1334.method1204(arg0);
            this.field1351 = new class58();
            this.field1351.method1204(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2428();
            if (var6 == 0) {
                break;
            }
            this.field1336[var5] = var6;
            this.field1348[var5] = arg0.method2375();
            this.field1338[var5] = arg0.method2428();
        }
        this.field1339 = arg0.method2428();
        this.field1340 = arg0.method2428();
        this.field1343 = arg0.method2365();
        this.field1330 = arg0.method2365();
        this.field1341 = new class64();
        this.field1342 = new class58();
        this.field1341.method1269(arg0, this.field1342);
    }
}
