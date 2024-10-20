package deob;

import java.util.Random;

@ObfuscatedName("be")
public class class72 {

    @ObfuscatedName("be.t")
    public class58 field1348;

    @ObfuscatedName("be.i")
    public class58 field1334;

    @ObfuscatedName("be.g")
    public class58 field1351;

    @ObfuscatedName("be.h")
    public class58 field1329;

    @ObfuscatedName("be.z")
    public class58 field1330;

    @ObfuscatedName("be.r")
    public class58 field1327;

    @ObfuscatedName("be.f")
    public class58 field1347;

    @ObfuscatedName("be.s")
    public class58 field1350;

    @ObfuscatedName("be.d")
    public int[] field1342 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("be.l")
    public int[] field1335 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("be.y")
    public int[] field1336 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("be.p")
    public int field1337 = 0;

    @ObfuscatedName("be.k")
    public int field1338 = 100;

    @ObfuscatedName("be.o")
    public class64 field1333;

    @ObfuscatedName("be.b")
    public class58 field1340;

    @ObfuscatedName("be.j")
    public int field1341 = 500;

    @ObfuscatedName("be.a")
    public int field1343 = 0;

    @ObfuscatedName("be.u")
    public static int[] field1326;

    @ObfuscatedName("be.c")
    public static int[] field1344 = new int[32768];

    @ObfuscatedName("be.n")
    public static int[] field1345;

    @ObfuscatedName("be.x")
    public static int[] field1328;

    @ObfuscatedName("be.v")
    public static int[] field1339;

    @ObfuscatedName("be.m")
    public static int[] field1349;

    @ObfuscatedName("be.w")
    public static int[] field1331;

    @ObfuscatedName("be.e")
    public static int[] field1332;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1344[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1345 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1345[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1326 = new int[220500];
        field1328 = new int[5];
        field1339 = new int[5];
        field1349 = new int[5];
        field1331 = new int[5];
        field1332 = new int[5];
    }

    @ObfuscatedName("be.t(II)[I")
    public final int[] method1415(int arg0, int arg1) {
        class121.method2533(field1326, 0, arg0);
        if (arg1 < 10) {
            return field1326;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1348.method1142();
        this.field1334.method1142();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1351 != null) {
            this.field1351.method1142();
            this.field1329.method1142();
            var5 = (int) ((double) (this.field1351.field1210 - this.field1351.field1212) * 32.768D / var3);
            var6 = (int) ((double) this.field1351.field1212 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1330 != null) {
            this.field1330.method1142();
            this.field1327.method1142();
            var8 = (int) ((double) (this.field1330.field1210 - this.field1330.field1212) * 32.768D / var3);
            var9 = (int) ((double) this.field1330.field1212 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1342[var11] != 0) {
                field1328[var11] = 0;
                field1339[var11] = (int) ((double) this.field1336[var11] * var3);
                field1349[var11] = (this.field1342[var11] << 14) / 100;
                field1331[var11] = (int) ((double) (this.field1348.field1210 - this.field1348.field1212) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1335[var11]) / var3);
                field1332[var11] = (int) ((double) this.field1348.field1212 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1348.method1143(arg0);
            int var14 = this.field1334.method1143(arg0);
            if (this.field1351 != null) {
                int var15 = this.field1351.method1143(arg0);
                int var16 = this.field1329.method1143(arg0);
                var13 += this.method1413(var7, var16, this.field1351.field1211) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1330 != null) {
                int var17 = this.field1330.method1143(arg0);
                int var18 = this.field1327.method1143(arg0);
                var14 = var14 * ((this.method1413(var10, var18, this.field1330.field1211) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1342[var19] != 0) {
                    int var20 = field1339[var19] + var12;
                    if (var20 < arg0) {
                        field1326[var20] += this.method1413(field1328[var19], field1349[var19] * var14 >> 15, this.field1348.field1211);
                        field1328[var19] += (field1331[var19] * var13 >> 16) + field1332[var19];
                    }
                }
            }
        }
        if (this.field1347 != null) {
            this.field1347.method1142();
            this.field1350.method1142();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1347.method1143(arg0);
                int var26 = this.field1350.method1143(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1347.field1210 - this.field1347.field1212) * var25 >> 8) + this.field1347.field1212;
                } else {
                    var27 = ((this.field1347.field1210 - this.field1347.field1212) * var26 >> 8) + this.field1347.field1212;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1326[var24] = 0;
                }
            }
        }
        if (this.field1337 > 0 && this.field1338 > 0) {
            int var28 = (int) ((double) this.field1337 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1326[var29] += field1326[var29 - var28] * this.field1338 / 100;
            }
        }
        if (this.field1333.field1241[0] > 0 || this.field1333.field1241[1] > 0) {
            this.field1340.method1142();
            int var30 = this.field1340.method1143(arg0 + 1);
            int var31 = this.field1333.method1196(0, (float) var30 / 65536.0F);
            int var32 = this.field1333.method1196(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1326[var31 + var33] * (long) Statics.field1249 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1326[var31 + var33 - 1 - var36] * (long) class64.field1246[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1326[var33 - 1 - var37] * (long) class64.field1246[1][var37] >> 16);
                    }
                    field1326[var33] = var35;
                    var30 = this.field1340.method1143(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1326[var31 + var33] * (long) Statics.field1249 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1326[var31 + var33 - 1 - var40] * (long) class64.field1246[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1326[var33 - 1 - var41] * (long) class64.field1246[1][var41] >> 16);
                        }
                        field1326[var33] = var39;
                        var30 = this.field1340.method1143(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1326[var31 + var33 - 1 - var43] * (long) class64.field1246[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1326[var33 - 1 - var44] * (long) class64.field1246[1][var44] >> 16);
                            }
                            field1326[var33] = var42;
                            this.field1340.method1143(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1333.method1196(0, (float) var30 / 65536.0F);
                    var32 = this.field1333.method1196(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1326[var46] < -32768) {
                field1326[var46] = -32768;
            }
            if (field1326[var46] > 32767) {
                field1326[var46] = 32767;
            }
        }
        return field1326;
    }

    @ObfuscatedName("be.i(III)I")
    public final int method1413(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1345[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1344[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("be.g(Ldr;)V")
    public final void method1411(class120 arg0) {
        this.field1348 = new class58();
        this.field1348.method1140(arg0);
        this.field1334 = new class58();
        this.field1334.method1140(arg0);
        int var2 = arg0.method2334();
        if (var2 != 0) {
            arg0.field2001--;
            this.field1351 = new class58();
            this.field1351.method1140(arg0);
            this.field1329 = new class58();
            this.field1329.method1140(arg0);
        }
        int var3 = arg0.method2334();
        if (var3 != 0) {
            arg0.field2001--;
            this.field1330 = new class58();
            this.field1330.method1140(arg0);
            this.field1327 = new class58();
            this.field1327.method1140(arg0);
        }
        int var4 = arg0.method2334();
        if (var4 != 0) {
            arg0.field2001--;
            this.field1347 = new class58();
            this.field1347.method1140(arg0);
            this.field1350 = new class58();
            this.field1350.method1140(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2321();
            if (var6 == 0) {
                break;
            }
            this.field1342[var5] = var6;
            this.field1335[var5] = arg0.method2405();
            this.field1336[var5] = arg0.method2321();
        }
        this.field1337 = arg0.method2321();
        this.field1338 = arg0.method2321();
        this.field1341 = arg0.method2310();
        this.field1343 = arg0.method2310();
        this.field1333 = new class64();
        this.field1340 = new class58();
        this.field1333.method1197(arg0, this.field1340);
    }
}
