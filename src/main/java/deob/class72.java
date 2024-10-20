package deob;

import java.util.Random;

@ObfuscatedName("bu")
public class class72 {

    @ObfuscatedName("bu.s")
    public class58 field1349;

    @ObfuscatedName("bu.j")
    public class58 field1329;

    @ObfuscatedName("bu.p")
    public class58 field1330;

    @ObfuscatedName("bu.x")
    public class58 field1340;

    @ObfuscatedName("bu.d")
    public class58 field1338;

    @ObfuscatedName("bu.u")
    public class58 field1339;

    @ObfuscatedName("bu.o")
    public class58 field1334;

    @ObfuscatedName("bu.b")
    public class58 field1332;

    @ObfuscatedName("bu.k")
    public int[] field1331 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bu.c")
    public int[] field1335 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bu.l")
    public int[] field1348 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bu.t")
    public int field1350 = 0;

    @ObfuscatedName("bu.i")
    public int field1341 = 100;

    @ObfuscatedName("bu.r")
    public class64 field1328;

    @ObfuscatedName("bu.m")
    public class58 field1342;

    @ObfuscatedName("bu.e")
    public int field1343 = 500;

    @ObfuscatedName("bu.h")
    public int field1344 = 0;

    @ObfuscatedName("bu.z")
    public static int[] field1345;

    @ObfuscatedName("bu.a")
    public static int[] field1346 = new int[32768];

    @ObfuscatedName("bu.w")
    public static int[] field1333;

    @ObfuscatedName("bu.y")
    public static int[] field1337;

    @ObfuscatedName("bu.f")
    public static int[] field1336;

    @ObfuscatedName("bu.q")
    public static int[] field1351;

    @ObfuscatedName("bu.n")
    public static int[] field1352;

    @ObfuscatedName("bu.v")
    public static int[] field1353;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1346[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1333 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1333[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1345 = new int[220500];
        field1337 = new int[5];
        field1336 = new int[5];
        field1351 = new int[5];
        field1352 = new int[5];
        field1353 = new int[5];
    }

    @ObfuscatedName("bu.s(II)[I")
    public final int[] method1442(int arg0, int arg1) {
        class121.method2563(field1345, 0, arg0);
        if (arg1 < 10) {
            return field1345;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1349.method1169();
        this.field1329.method1169();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1330 != null) {
            this.field1330.method1169();
            this.field1340.method1169();
            var5 = (int) ((double) (this.field1330.field1210 - this.field1330.field1209) * 32.768D / var3);
            var6 = (int) ((double) this.field1330.field1209 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1338 != null) {
            this.field1338.method1169();
            this.field1339.method1169();
            var8 = (int) ((double) (this.field1338.field1210 - this.field1338.field1209) * 32.768D / var3);
            var9 = (int) ((double) this.field1338.field1209 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1331[var11] != 0) {
                field1337[var11] = 0;
                field1336[var11] = (int) ((double) this.field1348[var11] * var3);
                field1351[var11] = (this.field1331[var11] << 14) / 100;
                field1352[var11] = (int) ((double) (this.field1349.field1210 - this.field1349.field1209) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1335[var11]) / var3);
                field1353[var11] = (int) ((double) this.field1349.field1209 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1349.method1170(arg0);
            int var14 = this.field1329.method1170(arg0);
            if (this.field1330 != null) {
                int var15 = this.field1330.method1170(arg0);
                int var16 = this.field1340.method1170(arg0);
                var13 += this.method1444(var7, var16, this.field1330.field1207) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1338 != null) {
                int var17 = this.field1338.method1170(arg0);
                int var18 = this.field1339.method1170(arg0);
                var14 = var14 * ((this.method1444(var10, var18, this.field1338.field1207) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1331[var19] != 0) {
                    int var20 = field1336[var19] + var12;
                    if (var20 < arg0) {
                        field1345[var20] += this.method1444(field1337[var19], field1351[var19] * var14 >> 15, this.field1349.field1207);
                        field1337[var19] += (field1352[var19] * var13 >> 16) + field1353[var19];
                    }
                }
            }
        }
        if (this.field1334 != null) {
            this.field1334.method1169();
            this.field1332.method1169();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1334.method1170(arg0);
                int var26 = this.field1332.method1170(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1334.field1210 - this.field1334.field1209) * var25 >> 8) + this.field1334.field1209;
                } else {
                    var27 = ((this.field1334.field1210 - this.field1334.field1209) * var26 >> 8) + this.field1334.field1209;
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
        if (this.field1350 > 0 && this.field1341 > 0) {
            int var28 = (int) ((double) this.field1350 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1345[var29] += field1345[var29 - var28] * this.field1341 / 100;
            }
        }
        if (this.field1328.field1244[0] > 0 || this.field1328.field1244[1] > 0) {
            this.field1342.method1169();
            int var30 = this.field1342.method1170(arg0 + 1);
            int var31 = this.field1328.method1220(0, (float) var30 / 65536.0F);
            int var32 = this.field1328.method1220(1, (float) var30 / 65536.0F);
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
                    var30 = this.field1342.method1170(arg0 + 1);
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
                        var30 = this.field1342.method1170(arg0 + 1);
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
                            this.field1342.method1170(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1328.method1220(0, (float) var30 / 65536.0F);
                    var32 = this.field1328.method1220(1, (float) var30 / 65536.0F);
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

    @ObfuscatedName("bu.j(III)I")
    public final int method1444(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1333[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1346[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bu.p(Lds;)V")
    public final void method1443(class120 arg0) {
        this.field1349 = new class58();
        this.field1349.method1167(arg0);
        this.field1329 = new class58();
        this.field1329.method1167(arg0);
        int var2 = arg0.method2338();
        if (var2 != 0) {
            arg0.field2006--;
            this.field1330 = new class58();
            this.field1330.method1167(arg0);
            this.field1340 = new class58();
            this.field1340.method1167(arg0);
        }
        int var3 = arg0.method2338();
        if (var3 != 0) {
            arg0.field2006--;
            this.field1338 = new class58();
            this.field1338.method1167(arg0);
            this.field1339 = new class58();
            this.field1339.method1167(arg0);
        }
        int var4 = arg0.method2338();
        if (var4 != 0) {
            arg0.field2006--;
            this.field1334 = new class58();
            this.field1334.method1167(arg0);
            this.field1332 = new class58();
            this.field1332.method1167(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2351();
            if (var6 == 0) {
                break;
            }
            this.field1331[var5] = var6;
            this.field1335[var5] = arg0.method2431();
            this.field1348[var5] = arg0.method2351();
        }
        this.field1350 = arg0.method2351();
        this.field1341 = arg0.method2351();
        this.field1343 = arg0.method2430();
        this.field1344 = arg0.method2430();
        this.field1328 = new class64();
        this.field1342 = new class58();
        this.field1328.method1227(arg0, this.field1342);
    }
}
