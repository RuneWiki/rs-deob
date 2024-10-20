package deob;

import java.util.Random;

@ObfuscatedName("bx")
public class class72 {

    @ObfuscatedName("bx.a")
    public class58 field1329;

    @ObfuscatedName("bx.r")
    public class58 field1323;

    @ObfuscatedName("bx.f")
    public class58 field1338;

    @ObfuscatedName("bx.s")
    public class58 field1325;

    @ObfuscatedName("bx.y")
    public class58 field1326;

    @ObfuscatedName("bx.e")
    public class58 field1327;

    @ObfuscatedName("bx.g")
    public class58 field1328;

    @ObfuscatedName("bx.m")
    public class58 field1347;

    @ObfuscatedName("bx.j")
    public int[] field1330 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bx.n")
    public int[] field1324 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bx.l")
    public int[] field1332 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bx.h")
    public int field1333 = 0;

    @ObfuscatedName("bx.i")
    public int field1334 = 100;

    @ObfuscatedName("bx.v")
    public class64 field1335;

    @ObfuscatedName("bx.z")
    public class58 field1322;

    @ObfuscatedName("bx.u")
    public int field1337 = 500;

    @ObfuscatedName("bx.t")
    public int field1336 = 0;

    @ObfuscatedName("bx.b")
    public static int[] field1339;

    @ObfuscatedName("bx.c")
    public static int[] field1340 = new int[32768];

    @ObfuscatedName("bx.x")
    public static int[] field1341;

    @ObfuscatedName("bx.p")
    public static int[] field1343;

    @ObfuscatedName("bx.q")
    public static int[] field1344;

    @ObfuscatedName("bx.w")
    public static int[] field1345;

    @ObfuscatedName("bx.k")
    public static int[] field1346;

    @ObfuscatedName("bx.o")
    public static int[] field1342;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1340[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1341 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1341[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1339 = new int[220500];
        field1343 = new int[5];
        field1344 = new int[5];
        field1345 = new int[5];
        field1346 = new int[5];
        field1342 = new int[5];
    }

    @ObfuscatedName("bx.a(II)[I")
    public final int[] method1483(int arg0, int arg1) {
        class120.method2551(field1339, 0, arg0);
        if (arg1 < 10) {
            return field1339;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1329.method1198();
        this.field1323.method1198();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1338 != null) {
            this.field1338.method1198();
            this.field1325.method1198();
            var5 = (int) ((double) (this.field1338.field1201 - this.field1338.field1200) * 32.768D / var3);
            var6 = (int) ((double) this.field1338.field1200 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1326 != null) {
            this.field1326.method1198();
            this.field1327.method1198();
            var8 = (int) ((double) (this.field1326.field1201 - this.field1326.field1200) * 32.768D / var3);
            var9 = (int) ((double) this.field1326.field1200 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1330[var11] != 0) {
                field1343[var11] = 0;
                field1344[var11] = (int) ((double) this.field1332[var11] * var3);
                field1345[var11] = (this.field1330[var11] << 14) / 100;
                field1346[var11] = (int) ((double) (this.field1329.field1201 - this.field1329.field1200) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1324[var11]) / var3);
                field1342[var11] = (int) ((double) this.field1329.field1200 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1329.method1199(arg0);
            int var14 = this.field1323.method1199(arg0);
            if (this.field1338 != null) {
                int var15 = this.field1338.method1199(arg0);
                int var16 = this.field1325.method1199(arg0);
                var13 += this.method1484(var7, var16, this.field1338.field1199) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1326 != null) {
                int var17 = this.field1326.method1199(arg0);
                int var18 = this.field1327.method1199(arg0);
                var14 = var14 * ((this.method1484(var10, var18, this.field1326.field1199) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1330[var19] != 0) {
                    int var20 = field1344[var19] + var12;
                    if (var20 < arg0) {
                        field1339[var20] += this.method1484(field1343[var19], field1345[var19] * var14 >> 15, this.field1329.field1199);
                        field1343[var19] += (field1346[var19] * var13 >> 16) + field1342[var19];
                    }
                }
            }
        }
        if (this.field1328 != null) {
            this.field1328.method1198();
            this.field1347.method1198();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1328.method1199(arg0);
                int var26 = this.field1347.method1199(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1328.field1201 - this.field1328.field1200) * var25 >> 8) + this.field1328.field1200;
                } else {
                    var27 = ((this.field1328.field1201 - this.field1328.field1200) * var26 >> 8) + this.field1328.field1200;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1339[var24] = 0;
                }
            }
        }
        if (this.field1333 > 0 && this.field1334 > 0) {
            int var28 = (int) ((double) this.field1333 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1339[var29] += field1339[var29 - var28] * this.field1334 / 100;
            }
        }
        if (this.field1335.field1239[0] > 0 || this.field1335.field1239[1] > 0) {
            this.field1322.method1198();
            int var30 = this.field1322.method1199(arg0 + 1);
            int var31 = this.field1335.method1262(0, (float) var30 / 65536.0F);
            int var32 = this.field1335.method1262(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1339[var31 + var33] * (long) Statics.field1244 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1339[var31 + var33 - 1 - var36] * (long) class64.field1242[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1339[var33 - 1 - var37] * (long) class64.field1242[1][var37] >> 16);
                    }
                    field1339[var33] = var35;
                    var30 = this.field1322.method1199(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1339[var31 + var33] * (long) Statics.field1244 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1339[var31 + var33 - 1 - var40] * (long) class64.field1242[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1339[var33 - 1 - var41] * (long) class64.field1242[1][var41] >> 16);
                        }
                        field1339[var33] = var39;
                        var30 = this.field1322.method1199(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1339[var31 + var33 - 1 - var43] * (long) class64.field1242[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1339[var33 - 1 - var44] * (long) class64.field1242[1][var44] >> 16);
                            }
                            field1339[var33] = var42;
                            this.field1322.method1199(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1335.method1262(0, (float) var30 / 65536.0F);
                    var32 = this.field1335.method1262(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1339[var46] < -32768) {
                field1339[var46] = -32768;
            }
            if (field1339[var46] > 32767) {
                field1339[var46] = 32767;
            }
        }
        return field1339;
    }

    @ObfuscatedName("bx.r(III)I")
    public final int method1484(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1341[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1340[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bx.f(Lds;)V")
    public final void method1489(class119 arg0) {
        this.field1329 = new class58();
        this.field1329.method1208(arg0);
        this.field1323 = new class58();
        this.field1323.method1208(arg0);
        int var2 = arg0.method2412();
        if (var2 != 0) {
            arg0.field1980--;
            this.field1338 = new class58();
            this.field1338.method1208(arg0);
            this.field1325 = new class58();
            this.field1325.method1208(arg0);
        }
        int var3 = arg0.method2412();
        if (var3 != 0) {
            arg0.field1980--;
            this.field1326 = new class58();
            this.field1326.method1208(arg0);
            this.field1327 = new class58();
            this.field1327.method1208(arg0);
        }
        int var4 = arg0.method2412();
        if (var4 != 0) {
            arg0.field1980--;
            this.field1328 = new class58();
            this.field1328.method1208(arg0);
            this.field1347 = new class58();
            this.field1347.method1208(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2492();
            if (var6 == 0) {
                break;
            }
            this.field1330[var5] = var6;
            this.field1324[var5] = arg0.method2357();
            this.field1332[var5] = arg0.method2492();
        }
        this.field1333 = arg0.method2492();
        this.field1334 = arg0.method2492();
        this.field1337 = arg0.method2347();
        this.field1336 = arg0.method2347();
        this.field1335 = new class64();
        this.field1322 = new class58();
        this.field1335.method1271(arg0, this.field1322);
    }
}
