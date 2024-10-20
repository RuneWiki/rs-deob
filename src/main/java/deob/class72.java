package deob;

import java.util.Random;

@ObfuscatedName("bv")
public class class72 {

    @ObfuscatedName("bv.h")
    public class58 field1349;

    @ObfuscatedName("bv.m")
    public class58 field1339;

    @ObfuscatedName("bv.i")
    public class58 field1334;

    @ObfuscatedName("bv.q")
    public class58 field1335;

    @ObfuscatedName("bv.p")
    public class58 field1336;

    @ObfuscatedName("bv.c")
    public class58 field1337;

    @ObfuscatedName("bv.f")
    public class58 field1338;

    @ObfuscatedName("bv.y")
    public class58 field1343;

    @ObfuscatedName("bv.w")
    public int[] field1340 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bv.l")
    public int[] field1333 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bv.v")
    public int[] field1342 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bv.k")
    public int field1355 = 0;

    @ObfuscatedName("bv.o")
    public int field1344 = 100;

    @ObfuscatedName("bv.u")
    public class64 field1345;

    @ObfuscatedName("bv.s")
    public class58 field1354;

    @ObfuscatedName("bv.g")
    public int field1347 = 500;

    @ObfuscatedName("bv.x")
    public int field1332 = 0;

    @ObfuscatedName("bv.a")
    public static int[] field1341;

    @ObfuscatedName("bv.t")
    public static int[] field1348 = new int[32768];

    @ObfuscatedName("bv.z")
    public static int[] field1351;

    @ObfuscatedName("bv.d")
    public static int[] field1353;

    @ObfuscatedName("bv.n")
    public static int[] field1352;

    @ObfuscatedName("bv.j")
    public static int[] field1350;

    @ObfuscatedName("bv.b")
    public static int[] field1356;

    @ObfuscatedName("bv.e")
    public static int[] field1357;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1348[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1351 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1351[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1341 = new int[220500];
        field1353 = new int[5];
        field1352 = new int[5];
        field1350 = new int[5];
        field1356 = new int[5];
        field1357 = new int[5];
    }

    @ObfuscatedName("bv.h(II)[I")
    public final int[] method1453(int arg0, int arg1) {
        class120.method2526(field1341, 0, arg0);
        if (arg1 < 10) {
            return field1341;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1349.method1184();
        this.field1339.method1184();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1334 != null) {
            this.field1334.method1184();
            this.field1335.method1184();
            var5 = (int) ((double) (this.field1334.field1212 - this.field1334.field1211) * 32.768D / var3);
            var6 = (int) ((double) this.field1334.field1211 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1336 != null) {
            this.field1336.method1184();
            this.field1337.method1184();
            var8 = (int) ((double) (this.field1336.field1212 - this.field1336.field1211) * 32.768D / var3);
            var9 = (int) ((double) this.field1336.field1211 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1340[var11] != 0) {
                field1353[var11] = 0;
                field1352[var11] = (int) ((double) this.field1342[var11] * var3);
                field1350[var11] = (this.field1340[var11] << 14) / 100;
                field1356[var11] = (int) ((double) (this.field1349.field1212 - this.field1349.field1211) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1333[var11]) / var3);
                field1357[var11] = (int) ((double) this.field1349.field1211 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1349.method1185(arg0);
            int var14 = this.field1339.method1185(arg0);
            if (this.field1334 != null) {
                int var15 = this.field1334.method1185(arg0);
                int var16 = this.field1335.method1185(arg0);
                var13 += this.method1452(var7, var16, this.field1334.field1209) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1336 != null) {
                int var17 = this.field1336.method1185(arg0);
                int var18 = this.field1337.method1185(arg0);
                var14 = var14 * ((this.method1452(var10, var18, this.field1336.field1209) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1340[var19] != 0) {
                    int var20 = field1352[var19] + var12;
                    if (var20 < arg0) {
                        field1341[var20] += this.method1452(field1353[var19], field1350[var19] * var14 >> 15, this.field1349.field1209);
                        field1353[var19] += (field1356[var19] * var13 >> 16) + field1357[var19];
                    }
                }
            }
        }
        if (this.field1338 != null) {
            this.field1338.method1184();
            this.field1343.method1184();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1338.method1185(arg0);
                int var26 = this.field1343.method1185(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1338.field1212 - this.field1338.field1211) * var25 >> 8) + this.field1338.field1211;
                } else {
                    var27 = ((this.field1338.field1212 - this.field1338.field1211) * var26 >> 8) + this.field1338.field1211;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1341[var24] = 0;
                }
            }
        }
        if (this.field1355 > 0 && this.field1344 > 0) {
            int var28 = (int) ((double) this.field1355 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1341[var29] += field1341[var29 - var28] * this.field1344 / 100;
            }
        }
        if (this.field1345.field1256[0] > 0 || this.field1345.field1256[1] > 0) {
            this.field1354.method1184();
            int var30 = this.field1354.method1185(arg0 + 1);
            int var31 = this.field1345.method1241(0, (float) var30 / 65536.0F);
            int var32 = this.field1345.method1241(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1341[var31 + var33] * (long) Statics.field1246 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1341[var31 + var33 - 1 - var36] * (long) class64.field1248[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1341[var33 - 1 - var37] * (long) class64.field1248[1][var37] >> 16);
                    }
                    field1341[var33] = var35;
                    var30 = this.field1354.method1185(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1341[var31 + var33] * (long) Statics.field1246 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1341[var31 + var33 - 1 - var40] * (long) class64.field1248[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1341[var33 - 1 - var41] * (long) class64.field1248[1][var41] >> 16);
                        }
                        field1341[var33] = var39;
                        var30 = this.field1354.method1185(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1341[var31 + var33 - 1 - var43] * (long) class64.field1248[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1341[var33 - 1 - var44] * (long) class64.field1248[1][var44] >> 16);
                            }
                            field1341[var33] = var42;
                            this.field1354.method1185(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1345.method1241(0, (float) var30 / 65536.0F);
                    var32 = this.field1345.method1241(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1341[var46] < -32768) {
                field1341[var46] = -32768;
            }
            if (field1341[var46] > 32767) {
                field1341[var46] = 32767;
            }
        }
        return field1341;
    }

    @ObfuscatedName("bv.m(III)I")
    public final int method1452(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1351[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1348[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bv.i(Ldp;)V")
    public final void method1450(class119 arg0) {
        this.field1349 = new class58();
        this.field1349.method1182(arg0);
        this.field1339 = new class58();
        this.field1339.method1182(arg0);
        int var2 = arg0.method2320();
        if (var2 != 0) {
            arg0.field1988--;
            this.field1334 = new class58();
            this.field1334.method1182(arg0);
            this.field1335 = new class58();
            this.field1335.method1182(arg0);
        }
        int var3 = arg0.method2320();
        if (var3 != 0) {
            arg0.field1988--;
            this.field1336 = new class58();
            this.field1336.method1182(arg0);
            this.field1337 = new class58();
            this.field1337.method1182(arg0);
        }
        int var4 = arg0.method2320();
        if (var4 != 0) {
            arg0.field1988--;
            this.field1338 = new class58();
            this.field1338.method1182(arg0);
            this.field1343 = new class58();
            this.field1343.method1182(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2332();
            if (var6 == 0) {
                break;
            }
            this.field1340[var5] = var6;
            this.field1333[var5] = arg0.method2331();
            this.field1342[var5] = arg0.method2332();
        }
        this.field1355 = arg0.method2332();
        this.field1344 = arg0.method2332();
        this.field1347 = arg0.method2322();
        this.field1332 = arg0.method2322();
        this.field1345 = new class64();
        this.field1354 = new class58();
        this.field1345.method1236(arg0, this.field1354);
    }
}
