package deob;

import java.util.Random;

@ObfuscatedName("bz")
public class class72 {

    @ObfuscatedName("bz.f")
    public class58 field1328;

    @ObfuscatedName("bz.s")
    public class58 field1349;

    @ObfuscatedName("bz.q")
    public class58 field1329;

    @ObfuscatedName("bz.g")
    public class58 field1333;

    @ObfuscatedName("bz.m")
    public class58 field1346;

    @ObfuscatedName("bz.t")
    public class58 field1332;

    @ObfuscatedName("bz.j")
    public class58 field1334;

    @ObfuscatedName("bz.n")
    public class58 field1338;

    @ObfuscatedName("bz.l")
    public int[] field1335 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bz.i")
    public int[] field1336 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bz.w")
    public int[] field1337 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bz.v")
    public int field1331 = 0;

    @ObfuscatedName("bz.o")
    public int field1339 = 100;

    @ObfuscatedName("bz.p")
    public class64 field1340;

    @ObfuscatedName("bz.b")
    public class58 field1341;

    @ObfuscatedName("bz.z")
    public int field1342 = 500;

    @ObfuscatedName("bz.k")
    public int field1343 = 0;

    @ObfuscatedName("bz.r")
    public static int[] field1344;

    @ObfuscatedName("bz.d")
    public static int[] field1330 = new int[32768];

    @ObfuscatedName("bz.u")
    public static int[] field1345;

    @ObfuscatedName("bz.x")
    public static int[] field1348;

    @ObfuscatedName("bz.y")
    public static int[] field1327;

    @ObfuscatedName("bz.c")
    public static int[] field1350;

    @ObfuscatedName("bz.h")
    public static int[] field1351;

    @ObfuscatedName("bz.e")
    public static int[] field1352;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1330[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1345 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1345[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1344 = new int[220500];
        field1348 = new int[5];
        field1327 = new int[5];
        field1350 = new int[5];
        field1351 = new int[5];
        field1352 = new int[5];
    }

    @ObfuscatedName("bz.f(II)[I")
    public final int[] method1481(int arg0, int arg1) {
        class120.method2566(field1344, 0, arg0);
        if (arg1 < 10) {
            return field1344;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1328.method1204();
        this.field1349.method1204();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1329 != null) {
            this.field1329.method1204();
            this.field1333.method1204();
            var5 = (int) ((double) (this.field1329.field1208 - this.field1329.field1207) * 32.768D / var3);
            var6 = (int) ((double) this.field1329.field1207 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1346 != null) {
            this.field1346.method1204();
            this.field1332.method1204();
            var8 = (int) ((double) (this.field1346.field1208 - this.field1346.field1207) * 32.768D / var3);
            var9 = (int) ((double) this.field1346.field1207 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1335[var11] != 0) {
                field1348[var11] = 0;
                field1327[var11] = (int) ((double) this.field1337[var11] * var3);
                field1350[var11] = (this.field1335[var11] << 14) / 100;
                field1351[var11] = (int) ((double) (this.field1328.field1208 - this.field1328.field1207) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1336[var11]) / var3);
                field1352[var11] = (int) ((double) this.field1328.field1207 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1328.method1206(arg0);
            int var14 = this.field1349.method1206(arg0);
            if (this.field1329 != null) {
                int var15 = this.field1329.method1206(arg0);
                int var16 = this.field1333.method1206(arg0);
                var13 += this.method1483(var7, var16, this.field1329.field1209) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1346 != null) {
                int var17 = this.field1346.method1206(arg0);
                int var18 = this.field1332.method1206(arg0);
                var14 = var14 * ((this.method1483(var10, var18, this.field1346.field1209) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1335[var19] != 0) {
                    int var20 = field1327[var19] + var12;
                    if (var20 < arg0) {
                        field1344[var20] += this.method1483(field1348[var19], field1350[var19] * var14 >> 15, this.field1328.field1209);
                        field1348[var19] += (field1351[var19] * var13 >> 16) + field1352[var19];
                    }
                }
            }
        }
        if (this.field1334 != null) {
            this.field1334.method1204();
            this.field1338.method1204();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1334.method1206(arg0);
                int var26 = this.field1338.method1206(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1334.field1208 - this.field1334.field1207) * var25 >> 8) + this.field1334.field1207;
                } else {
                    var27 = ((this.field1334.field1208 - this.field1334.field1207) * var26 >> 8) + this.field1334.field1207;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1344[var24] = 0;
                }
            }
        }
        if (this.field1331 > 0 && this.field1339 > 0) {
            int var28 = (int) ((double) this.field1331 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1344[var29] += field1344[var29 - var28] * this.field1339 / 100;
            }
        }
        if (this.field1340.field1249[0] > 0 || this.field1340.field1249[1] > 0) {
            this.field1341.method1204();
            int var30 = this.field1341.method1206(arg0 + 1);
            int var31 = this.field1340.method1261(0, (float) var30 / 65536.0F);
            int var32 = this.field1340.method1261(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1344[var31 + var33] * (long) Statics.field1244 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1344[var31 + var33 - 1 - var36] * (long) class64.field1241[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1344[var33 - 1 - var37] * (long) class64.field1241[1][var37] >> 16);
                    }
                    field1344[var33] = var35;
                    var30 = this.field1341.method1206(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1344[var31 + var33] * (long) Statics.field1244 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1344[var31 + var33 - 1 - var40] * (long) class64.field1241[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1344[var33 - 1 - var41] * (long) class64.field1241[1][var41] >> 16);
                        }
                        field1344[var33] = var39;
                        var30 = this.field1341.method1206(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1344[var31 + var33 - 1 - var43] * (long) class64.field1241[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1344[var33 - 1 - var44] * (long) class64.field1241[1][var44] >> 16);
                            }
                            field1344[var33] = var42;
                            this.field1341.method1206(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1340.method1261(0, (float) var30 / 65536.0F);
                    var32 = this.field1340.method1261(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1344[var46] < -32768) {
                field1344[var46] = -32768;
            }
            if (field1344[var46] > 32767) {
                field1344[var46] = 32767;
            }
        }
        return field1344;
    }

    @ObfuscatedName("bz.s(III)I")
    public final int method1483(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1345[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1330[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bz.q(Ldn;)V")
    public final void method1487(class119 arg0) {
        this.field1328 = new class58();
        this.field1328.method1202(arg0);
        this.field1349 = new class58();
        this.field1349.method1202(arg0);
        int var2 = arg0.method2363();
        if (var2 != 0) {
            arg0.field1994--;
            this.field1329 = new class58();
            this.field1329.method1202(arg0);
            this.field1333 = new class58();
            this.field1333.method1202(arg0);
        }
        int var3 = arg0.method2363();
        if (var3 != 0) {
            arg0.field1994--;
            this.field1346 = new class58();
            this.field1346.method1202(arg0);
            this.field1332 = new class58();
            this.field1332.method1202(arg0);
        }
        int var4 = arg0.method2363();
        if (var4 != 0) {
            arg0.field1994--;
            this.field1334 = new class58();
            this.field1334.method1202(arg0);
            this.field1338 = new class58();
            this.field1338.method1202(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2376();
            if (var6 == 0) {
                break;
            }
            this.field1335[var5] = var6;
            this.field1336[var5] = arg0.method2375();
            this.field1337[var5] = arg0.method2376();
        }
        this.field1331 = arg0.method2376();
        this.field1339 = arg0.method2376();
        this.field1342 = arg0.method2353();
        this.field1343 = arg0.method2353();
        this.field1340 = new class64();
        this.field1341 = new class58();
        this.field1340.method1262(arg0, this.field1341);
    }
}
