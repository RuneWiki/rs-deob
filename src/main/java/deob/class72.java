package deob;

import java.util.Random;

@ObfuscatedName("bi")
public class class72 {

    @ObfuscatedName("bi.n")
    public class58 field1334;

    @ObfuscatedName("bi.q")
    public class58 field1337;

    @ObfuscatedName("bi.c")
    public class58 field1316;

    @ObfuscatedName("bi.l")
    public class58 field1320;

    @ObfuscatedName("bi.r")
    public class58 field1318;

    @ObfuscatedName("bi.u")
    public class58 field1335;

    @ObfuscatedName("bi.j")
    public class58 field1339;

    @ObfuscatedName("bi.w")
    public class58 field1317;

    @ObfuscatedName("bi.y")
    public int[] field1322 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bi.o")
    public int[] field1323 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bi.h")
    public int[] field1315 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bi.e")
    public int field1325 = 0;

    @ObfuscatedName("bi.v")
    public int field1326 = 100;

    @ObfuscatedName("bi.p")
    public class64 field1321;

    @ObfuscatedName("bi.m")
    public class58 field1328;

    @ObfuscatedName("bi.b")
    public int field1329 = 500;

    @ObfuscatedName("bi.s")
    public int field1330 = 0;

    @ObfuscatedName("bi.x")
    public static int[] field1331;

    @ObfuscatedName("bi.z")
    public static int[] field1332 = new int[32768];

    @ObfuscatedName("bi.d")
    public static int[] field1333;

    @ObfuscatedName("bi.t")
    public static int[] field1314;

    @ObfuscatedName("bi.k")
    public static int[] field1336;

    @ObfuscatedName("bi.f")
    public static int[] field1324;

    @ObfuscatedName("bi.g")
    public static int[] field1338;

    @ObfuscatedName("bi.i")
    public static int[] field1319;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1332[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1333 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1333[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1331 = new int[220500];
        field1314 = new int[5];
        field1336 = new int[5];
        field1324 = new int[5];
        field1338 = new int[5];
        field1319 = new int[5];
    }

    @ObfuscatedName("bi.n(II)[I")
    public final int[] method1475(int arg0, int arg1) {
        class120.method2585(field1331, 0, arg0);
        if (arg1 < 10) {
            return field1331;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1334.method1220();
        this.field1337.method1220();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1316 != null) {
            this.field1316.method1220();
            this.field1320.method1220();
            var5 = (int) ((double) (this.field1316.field1195 - this.field1316.field1196) * 32.768D / var3);
            var6 = (int) ((double) this.field1316.field1196 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1318 != null) {
            this.field1318.method1220();
            this.field1335.method1220();
            var8 = (int) ((double) (this.field1318.field1195 - this.field1318.field1196) * 32.768D / var3);
            var9 = (int) ((double) this.field1318.field1196 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1322[var11] != 0) {
                field1314[var11] = 0;
                field1336[var11] = (int) ((double) this.field1315[var11] * var3);
                field1324[var11] = (this.field1322[var11] << 14) / 100;
                field1338[var11] = (int) ((double) (this.field1334.field1195 - this.field1334.field1196) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1323[var11]) / var3);
                field1319[var11] = (int) ((double) this.field1334.field1196 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1334.method1208(arg0);
            int var14 = this.field1337.method1208(arg0);
            if (this.field1316 != null) {
                int var15 = this.field1316.method1208(arg0);
                int var16 = this.field1320.method1208(arg0);
                var13 += this.method1476(var7, var16, this.field1316.field1197) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1318 != null) {
                int var17 = this.field1318.method1208(arg0);
                int var18 = this.field1335.method1208(arg0);
                var14 = var14 * ((this.method1476(var10, var18, this.field1318.field1197) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1322[var19] != 0) {
                    int var20 = field1336[var19] + var12;
                    if (var20 < arg0) {
                        field1331[var20] += this.method1476(field1314[var19], field1324[var19] * var14 >> 15, this.field1334.field1197);
                        field1314[var19] += (field1338[var19] * var13 >> 16) + field1319[var19];
                    }
                }
            }
        }
        if (this.field1339 != null) {
            this.field1339.method1220();
            this.field1317.method1220();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1339.method1208(arg0);
                int var26 = this.field1317.method1208(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1339.field1195 - this.field1339.field1196) * var25 >> 8) + this.field1339.field1196;
                } else {
                    var27 = ((this.field1339.field1195 - this.field1339.field1196) * var26 >> 8) + this.field1339.field1196;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1331[var24] = 0;
                }
            }
        }
        if (this.field1325 > 0 && this.field1326 > 0) {
            int var28 = (int) ((double) this.field1325 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1331[var29] += field1331[var29 - var28] * this.field1326 / 100;
            }
        }
        if (this.field1321.field1233[0] > 0 || this.field1321.field1233[1] > 0) {
            this.field1328.method1220();
            int var30 = this.field1328.method1208(arg0 + 1);
            int var31 = this.field1321.method1272(0, (float) var30 / 65536.0F);
            int var32 = this.field1321.method1272(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1331[var31 + var33] * (long) Statics.field1236 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1331[var31 + var33 - 1 - var36] * (long) class64.field1234[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1331[var33 - 1 - var37] * (long) class64.field1234[1][var37] >> 16);
                    }
                    field1331[var33] = var35;
                    var30 = this.field1328.method1208(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1331[var31 + var33] * (long) Statics.field1236 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1331[var31 + var33 - 1 - var40] * (long) class64.field1234[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1331[var33 - 1 - var41] * (long) class64.field1234[1][var41] >> 16);
                        }
                        field1331[var33] = var39;
                        var30 = this.field1328.method1208(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1331[var31 + var33 - 1 - var43] * (long) class64.field1234[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1331[var33 - 1 - var44] * (long) class64.field1234[1][var44] >> 16);
                            }
                            field1331[var33] = var42;
                            this.field1328.method1208(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1321.method1272(0, (float) var30 / 65536.0F);
                    var32 = this.field1321.method1272(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1331[var46] < -32768) {
                field1331[var46] = -32768;
            }
            if (field1331[var46] > 32767) {
                field1331[var46] = 32767;
            }
        }
        return field1331;
    }

    @ObfuscatedName("bi.q(III)I")
    public final int method1476(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1333[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1332[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bi.c(Ldc;)V")
    public final void method1478(class119 arg0) {
        this.field1334 = new class58();
        this.field1334.method1214(arg0);
        this.field1337 = new class58();
        this.field1337.method1214(arg0);
        int var2 = arg0.method2360();
        if (var2 != 0) {
            arg0.field1982--;
            this.field1316 = new class58();
            this.field1316.method1214(arg0);
            this.field1320 = new class58();
            this.field1320.method1214(arg0);
        }
        int var3 = arg0.method2360();
        if (var3 != 0) {
            arg0.field1982--;
            this.field1318 = new class58();
            this.field1318.method1214(arg0);
            this.field1335 = new class58();
            this.field1335.method1214(arg0);
        }
        int var4 = arg0.method2360();
        if (var4 != 0) {
            arg0.field1982--;
            this.field1339 = new class58();
            this.field1339.method1214(arg0);
            this.field1317 = new class58();
            this.field1317.method1214(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2373();
            if (var6 == 0) {
                break;
            }
            this.field1322[var5] = var6;
            this.field1323[var5] = arg0.method2489();
            this.field1315[var5] = arg0.method2373();
        }
        this.field1325 = arg0.method2373();
        this.field1326 = arg0.method2373();
        this.field1329 = arg0.method2430();
        this.field1330 = arg0.method2430();
        this.field1321 = new class64();
        this.field1328 = new class58();
        this.field1321.method1273(arg0, this.field1328);
    }
}
