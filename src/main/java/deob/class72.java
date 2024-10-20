package deob;

import java.util.Random;

@ObfuscatedName("ba")
public class class72 {

    @ObfuscatedName("ba.o")
    public class58 field1321;

    @ObfuscatedName("ba.e")
    public class58 field1326;

    @ObfuscatedName("ba.u")
    public class58 field1318;

    @ObfuscatedName("ba.b")
    public class58 field1319;

    @ObfuscatedName("ba.p")
    public class58 field1323;

    @ObfuscatedName("ba.s")
    public class58 field1332;

    @ObfuscatedName("ba.y")
    public class58 field1322;

    @ObfuscatedName("ba.t")
    public class58 field1329;

    @ObfuscatedName("ba.w")
    public int[] field1324 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("ba.h")
    public int[] field1328 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("ba.d")
    public int[] field1320 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("ba.l")
    public int field1339 = 0;

    @ObfuscatedName("ba.n")
    public int field1331 = 100;

    @ObfuscatedName("ba.q")
    public class64 field1316;

    @ObfuscatedName("ba.f")
    public class58 field1330;

    @ObfuscatedName("ba.v")
    public int field1327 = 500;

    @ObfuscatedName("ba.a")
    public int field1325 = 0;

    @ObfuscatedName("ba.k")
    public static int[] field1333;

    @ObfuscatedName("ba.r")
    public static int[] field1334 = new int[32768];

    @ObfuscatedName("ba.i")
    public static int[] field1335;

    @ObfuscatedName("ba.z")
    public static int[] field1337;

    @ObfuscatedName("ba.m")
    public static int[] field1338;

    @ObfuscatedName("ba.g")
    public static int[] field1317;

    @ObfuscatedName("ba.c")
    public static int[] field1340;

    @ObfuscatedName("ba.x")
    public static int[] field1341;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1334[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1335 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1335[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1333 = new int[220500];
        field1337 = new int[5];
        field1338 = new int[5];
        field1317 = new int[5];
        field1340 = new int[5];
        field1341 = new int[5];
    }

    @ObfuscatedName("ba.o(II)[I")
    public final int[] method1444(int arg0, int arg1) {
        class120.method2569(field1333, 0, arg0);
        if (arg1 < 10) {
            return field1333;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1321.method1172();
        this.field1326.method1172();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1318 != null) {
            this.field1318.method1172();
            this.field1319.method1172();
            var5 = (int) ((double) (this.field1318.field1201 - this.field1318.field1194) * 32.768D / var3);
            var6 = (int) ((double) this.field1318.field1194 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1323 != null) {
            this.field1323.method1172();
            this.field1332.method1172();
            var8 = (int) ((double) (this.field1323.field1201 - this.field1323.field1194) * 32.768D / var3);
            var9 = (int) ((double) this.field1323.field1194 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1324[var11] != 0) {
                field1337[var11] = 0;
                field1338[var11] = (int) ((double) this.field1320[var11] * var3);
                field1317[var11] = (this.field1324[var11] << 14) / 100;
                field1340[var11] = (int) ((double) (this.field1321.field1201 - this.field1321.field1194) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1328[var11]) / var3);
                field1341[var11] = (int) ((double) this.field1321.field1194 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1321.method1165(arg0);
            int var14 = this.field1326.method1165(arg0);
            if (this.field1318 != null) {
                int var15 = this.field1318.method1165(arg0);
                int var16 = this.field1319.method1165(arg0);
                var13 += this.method1439(var7, var16, this.field1318.field1196) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1323 != null) {
                int var17 = this.field1323.method1165(arg0);
                int var18 = this.field1332.method1165(arg0);
                var14 = var14 * ((this.method1439(var10, var18, this.field1323.field1196) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1324[var19] != 0) {
                    int var20 = field1338[var19] + var12;
                    if (var20 < arg0) {
                        field1333[var20] += this.method1439(field1337[var19], field1317[var19] * var14 >> 15, this.field1321.field1196);
                        field1337[var19] += (field1340[var19] * var13 >> 16) + field1341[var19];
                    }
                }
            }
        }
        if (this.field1322 != null) {
            this.field1322.method1172();
            this.field1329.method1172();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1322.method1165(arg0);
                int var26 = this.field1329.method1165(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1322.field1201 - this.field1322.field1194) * var25 >> 8) + this.field1322.field1194;
                } else {
                    var27 = ((this.field1322.field1201 - this.field1322.field1194) * var26 >> 8) + this.field1322.field1194;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1333[var24] = 0;
                }
            }
        }
        if (this.field1339 > 0 && this.field1331 > 0) {
            int var28 = (int) ((double) this.field1339 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1333[var29] += field1333[var29 - var28] * this.field1331 / 100;
            }
        }
        if (this.field1316.field1231[0] > 0 || this.field1316.field1231[1] > 0) {
            this.field1330.method1172();
            int var30 = this.field1330.method1165(arg0 + 1);
            int var31 = this.field1316.method1221(0, (float) var30 / 65536.0F);
            int var32 = this.field1316.method1221(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1333[var31 + var33] * (long) Statics.field1241 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1333[var31 + var33 - 1 - var36] * (long) class64.field1238[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1333[var33 - 1 - var37] * (long) class64.field1238[1][var37] >> 16);
                    }
                    field1333[var33] = var35;
                    var30 = this.field1330.method1165(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1333[var31 + var33] * (long) Statics.field1241 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1333[var31 + var33 - 1 - var40] * (long) class64.field1238[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1333[var33 - 1 - var41] * (long) class64.field1238[1][var41] >> 16);
                        }
                        field1333[var33] = var39;
                        var30 = this.field1330.method1165(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1333[var31 + var33 - 1 - var43] * (long) class64.field1238[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1333[var33 - 1 - var44] * (long) class64.field1238[1][var44] >> 16);
                            }
                            field1333[var33] = var42;
                            this.field1330.method1165(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1316.method1221(0, (float) var30 / 65536.0F);
                    var32 = this.field1316.method1221(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1333[var46] < -32768) {
                field1333[var46] = -32768;
            }
            if (field1333[var46] > 32767) {
                field1333[var46] = 32767;
            }
        }
        return field1333;
    }

    @ObfuscatedName("ba.e(III)I")
    public final int method1439(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1335[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1334[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ba.u(Ldi;)V")
    public final void method1440(class119 arg0) {
        this.field1321 = new class58();
        this.field1321.method1179(arg0);
        this.field1326 = new class58();
        this.field1326.method1179(arg0);
        int var2 = arg0.method2427();
        if (var2 != 0) {
            arg0.field1974--;
            this.field1318 = new class58();
            this.field1318.method1179(arg0);
            this.field1319 = new class58();
            this.field1319.method1179(arg0);
        }
        int var3 = arg0.method2427();
        if (var3 != 0) {
            arg0.field1974--;
            this.field1323 = new class58();
            this.field1323.method1179(arg0);
            this.field1332 = new class58();
            this.field1332.method1179(arg0);
        }
        int var4 = arg0.method2427();
        if (var4 != 0) {
            arg0.field1974--;
            this.field1322 = new class58();
            this.field1322.method1179(arg0);
            this.field1329 = new class58();
            this.field1329.method1179(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2350();
            if (var6 == 0) {
                break;
            }
            this.field1324[var5] = var6;
            this.field1328[var5] = arg0.method2349();
            this.field1320[var5] = arg0.method2350();
        }
        this.field1339 = arg0.method2350();
        this.field1331 = arg0.method2350();
        this.field1327 = arg0.method2339();
        this.field1325 = arg0.method2339();
        this.field1316 = new class64();
        this.field1330 = new class58();
        this.field1316.method1222(arg0, this.field1330);
    }
}
