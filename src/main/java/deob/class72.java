package deob;

import java.util.Random;

@ObfuscatedName("be")
public class class72 {

    @ObfuscatedName("be.o")
    public class58 field1323;

    @ObfuscatedName("be.f")
    public class58 field1316;

    @ObfuscatedName("be.i")
    public class58 field1317;

    @ObfuscatedName("be.h")
    public class58 field1318;

    @ObfuscatedName("be.q")
    public class58 field1319;

    @ObfuscatedName("be.u")
    public class58 field1338;

    @ObfuscatedName("be.m")
    public class58 field1321;

    @ObfuscatedName("be.y")
    public class58 field1322;

    @ObfuscatedName("be.p")
    public int[] field1315 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("be.t")
    public int[] field1326 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("be.g")
    public int[] field1335 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("be.v")
    public int field1329 = 0;

    @ObfuscatedName("be.l")
    public int field1327 = 100;

    @ObfuscatedName("be.e")
    public class64 field1328;

    @ObfuscatedName("be.a")
    public class58 field1320;

    @ObfuscatedName("be.w")
    public int field1330 = 500;

    @ObfuscatedName("be.d")
    public int field1331 = 0;

    @ObfuscatedName("be.z")
    public static int[] field1332;

    @ObfuscatedName("be.s")
    public static int[] field1333 = new int[32768];

    @ObfuscatedName("be.j")
    public static int[] field1334;

    @ObfuscatedName("be.r")
    public static int[] field1336;

    @ObfuscatedName("be.n")
    public static int[] field1337;

    @ObfuscatedName("be.c")
    public static int[] field1340;

    @ObfuscatedName("be.k")
    public static int[] field1339;

    @ObfuscatedName("be.x")
    public static int[] field1324;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1333[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1334 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1334[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1332 = new int[220500];
        field1336 = new int[5];
        field1337 = new int[5];
        field1340 = new int[5];
        field1339 = new int[5];
        field1324 = new int[5];
    }

    @ObfuscatedName("be.o(II)[I")
    public final int[] method1414(int arg0, int arg1) {
        class120.method2507(field1332, 0, arg0);
        if (arg1 < 10) {
            return field1332;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1323.method1153();
        this.field1316.method1153();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1317 != null) {
            this.field1317.method1153();
            this.field1318.method1153();
            var5 = (int) ((double) (this.field1317.field1197 - this.field1317.field1196) * 32.768D / var3);
            var6 = (int) ((double) this.field1317.field1196 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1319 != null) {
            this.field1319.method1153();
            this.field1338.method1153();
            var8 = (int) ((double) (this.field1319.field1197 - this.field1319.field1196) * 32.768D / var3);
            var9 = (int) ((double) this.field1319.field1196 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1315[var11] != 0) {
                field1336[var11] = 0;
                field1337[var11] = (int) ((double) this.field1335[var11] * var3);
                field1340[var11] = (this.field1315[var11] << 14) / 100;
                field1339[var11] = (int) ((double) (this.field1323.field1197 - this.field1323.field1196) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1326[var11]) / var3);
                field1324[var11] = (int) ((double) this.field1323.field1196 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1323.method1157(arg0);
            int var14 = this.field1316.method1157(arg0);
            if (this.field1317 != null) {
                int var15 = this.field1317.method1157(arg0);
                int var16 = this.field1318.method1157(arg0);
                var13 += this.method1415(var7, var16, this.field1317.field1198) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1319 != null) {
                int var17 = this.field1319.method1157(arg0);
                int var18 = this.field1338.method1157(arg0);
                var14 = var14 * ((this.method1415(var10, var18, this.field1319.field1198) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1315[var19] != 0) {
                    int var20 = field1337[var19] + var12;
                    if (var20 < arg0) {
                        field1332[var20] += this.method1415(field1336[var19], field1340[var19] * var14 >> 15, this.field1323.field1198);
                        field1336[var19] += (field1339[var19] * var13 >> 16) + field1324[var19];
                    }
                }
            }
        }
        if (this.field1321 != null) {
            this.field1321.method1153();
            this.field1322.method1153();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1321.method1157(arg0);
                int var26 = this.field1322.method1157(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1321.field1197 - this.field1321.field1196) * var25 >> 8) + this.field1321.field1196;
                } else {
                    var27 = ((this.field1321.field1197 - this.field1321.field1196) * var26 >> 8) + this.field1321.field1196;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1332[var24] = 0;
                }
            }
        }
        if (this.field1329 > 0 && this.field1327 > 0) {
            int var28 = (int) ((double) this.field1329 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1332[var29] += field1332[var29 - var28] * this.field1327 / 100;
            }
        }
        if (this.field1328.field1238[0] > 0 || this.field1328.field1238[1] > 0) {
            this.field1320.method1153();
            int var30 = this.field1320.method1157(arg0 + 1);
            int var31 = this.field1328.method1211(0, (float) var30 / 65536.0F);
            int var32 = this.field1328.method1211(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1332[var31 + var33] * (long) Statics.field1237 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1332[var31 + var33 - 1 - var36] * (long) class64.field1235[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1332[var33 - 1 - var37] * (long) class64.field1235[1][var37] >> 16);
                    }
                    field1332[var33] = var35;
                    var30 = this.field1320.method1157(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1332[var31 + var33] * (long) Statics.field1237 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1332[var31 + var33 - 1 - var40] * (long) class64.field1235[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1332[var33 - 1 - var41] * (long) class64.field1235[1][var41] >> 16);
                        }
                        field1332[var33] = var39;
                        var30 = this.field1320.method1157(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1332[var31 + var33 - 1 - var43] * (long) class64.field1235[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1332[var33 - 1 - var44] * (long) class64.field1235[1][var44] >> 16);
                            }
                            field1332[var33] = var42;
                            this.field1320.method1157(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1328.method1211(0, (float) var30 / 65536.0F);
                    var32 = this.field1328.method1211(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1332[var46] < -32768) {
                field1332[var46] = -32768;
            }
            if (field1332[var46] > 32767) {
                field1332[var46] = 32767;
            }
        }
        return field1332;
    }

    @ObfuscatedName("be.f(III)I")
    public final int method1415(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1334[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1333[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("be.i(Ldc;)V")
    public final void method1416(class119 arg0) {
        this.field1323 = new class58();
        this.field1323.method1150(arg0);
        this.field1316 = new class58();
        this.field1316.method1150(arg0);
        int var2 = arg0.method2290();
        if (var2 != 0) {
            arg0.field1984--;
            this.field1317 = new class58();
            this.field1317.method1150(arg0);
            this.field1318 = new class58();
            this.field1318.method1150(arg0);
        }
        int var3 = arg0.method2290();
        if (var3 != 0) {
            arg0.field1984--;
            this.field1319 = new class58();
            this.field1319.method1150(arg0);
            this.field1338 = new class58();
            this.field1338.method1150(arg0);
        }
        int var4 = arg0.method2290();
        if (var4 != 0) {
            arg0.field1984--;
            this.field1321 = new class58();
            this.field1321.method1150(arg0);
            this.field1322 = new class58();
            this.field1322.method1150(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2303();
            if (var6 == 0) {
                break;
            }
            this.field1315[var5] = var6;
            this.field1326[var5] = arg0.method2302();
            this.field1335[var5] = arg0.method2303();
        }
        this.field1329 = arg0.method2303();
        this.field1327 = arg0.method2303();
        this.field1330 = arg0.method2292();
        this.field1331 = arg0.method2292();
        this.field1328 = new class64();
        this.field1320 = new class58();
        this.field1328.method1207(arg0, this.field1320);
    }
}
