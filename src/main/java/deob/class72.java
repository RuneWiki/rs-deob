package deob;

import java.util.Random;

@ObfuscatedName("bj")
public class class72 {

    @ObfuscatedName("bj.f")
    public class58 field1363;

    @ObfuscatedName("bj.u")
    public class58 field1339;

    @ObfuscatedName("bj.x")
    public class58 field1353;

    @ObfuscatedName("bj.b")
    public class58 field1341;

    @ObfuscatedName("bj.l")
    public class58 field1342;

    @ObfuscatedName("bj.d")
    public class58 field1350;

    @ObfuscatedName("bj.n")
    public class58 field1344;

    @ObfuscatedName("bj.m")
    public class58 field1345;

    @ObfuscatedName("bj.g")
    public int[] field1346 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bj.s")
    public int[] field1355 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bj.r")
    public int[] field1357 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bj.k")
    public int field1349 = 0;

    @ObfuscatedName("bj.o")
    public int field1352 = 100;

    @ObfuscatedName("bj.q")
    public class64 field1351;

    @ObfuscatedName("bj.p")
    public class58 field1356;

    @ObfuscatedName("bj.h")
    public int field1358 = 500;

    @ObfuscatedName("bj.e")
    public int field1354 = 0;

    @ObfuscatedName("bj.t")
    public static int[] field1338;

    @ObfuscatedName("bj.w")
    public static int[] field1348 = new int[32768];

    @ObfuscatedName("bj.v")
    public static int[] field1343;

    @ObfuscatedName("bj.c")
    public static int[] field1359;

    @ObfuscatedName("bj.i")
    public static int[] field1347;

    @ObfuscatedName("bj.a")
    public static int[] field1361;

    @ObfuscatedName("bj.z")
    public static int[] field1362;

    @ObfuscatedName("bj.j")
    public static int[] field1340;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1348[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1343 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1343[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1338 = new int[220500];
        field1359 = new int[5];
        field1347 = new int[5];
        field1361 = new int[5];
        field1362 = new int[5];
        field1340 = new int[5];
    }

    @ObfuscatedName("bj.f(II)[I")
    public final int[] method1516(int arg0, int arg1) {
        class121.method2579(field1338, 0, arg0);
        if (arg1 < 10) {
            return field1338;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1363.method1243();
        this.field1339.method1243();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1353 != null) {
            this.field1353.method1243();
            this.field1341.method1243();
            var5 = (int) ((double) (this.field1353.field1215 - this.field1353.field1214) * 32.768D / var3);
            var6 = (int) ((double) this.field1353.field1214 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1342 != null) {
            this.field1342.method1243();
            this.field1350.method1243();
            var8 = (int) ((double) (this.field1342.field1215 - this.field1342.field1214) * 32.768D / var3);
            var9 = (int) ((double) this.field1342.field1214 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1346[var11] != 0) {
                field1359[var11] = 0;
                field1347[var11] = (int) ((double) this.field1357[var11] * var3);
                field1361[var11] = (this.field1346[var11] << 14) / 100;
                field1362[var11] = (int) ((double) (this.field1363.field1215 - this.field1363.field1214) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1355[var11]) / var3);
                field1340[var11] = (int) ((double) this.field1363.field1214 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1363.method1244(arg0);
            int var14 = this.field1339.method1244(arg0);
            if (this.field1353 != null) {
                int var15 = this.field1353.method1244(arg0);
                int var16 = this.field1341.method1244(arg0);
                var13 += this.method1508(var7, var16, this.field1353.field1211) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1342 != null) {
                int var17 = this.field1342.method1244(arg0);
                int var18 = this.field1350.method1244(arg0);
                var14 = var14 * ((this.method1508(var10, var18, this.field1342.field1211) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1346[var19] != 0) {
                    int var20 = field1347[var19] + var12;
                    if (var20 < arg0) {
                        field1338[var20] += this.method1508(field1359[var19], field1361[var19] * var14 >> 15, this.field1363.field1211);
                        field1359[var19] += (field1362[var19] * var13 >> 16) + field1340[var19];
                    }
                }
            }
        }
        if (this.field1344 != null) {
            this.field1344.method1243();
            this.field1345.method1243();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1344.method1244(arg0);
                int var26 = this.field1345.method1244(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1344.field1215 - this.field1344.field1214) * var25 >> 8) + this.field1344.field1214;
                } else {
                    var27 = ((this.field1344.field1215 - this.field1344.field1214) * var26 >> 8) + this.field1344.field1214;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1338[var24] = 0;
                }
            }
        }
        if (this.field1349 > 0 && this.field1352 > 0) {
            int var28 = (int) ((double) this.field1349 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1338[var29] += field1338[var29 - var28] * this.field1352 / 100;
            }
        }
        if (this.field1351.field1258[0] > 0 || this.field1351.field1258[1] > 0) {
            this.field1356.method1243();
            int var30 = this.field1356.method1244(arg0 + 1);
            int var31 = this.field1351.method1294(0, (float) var30 / 65536.0F);
            int var32 = this.field1351.method1294(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1338[var31 + var33] * (long) Statics.field1260 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1338[var31 + var33 - 1 - var36] * (long) class64.field1255[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1338[var33 - 1 - var37] * (long) class64.field1255[1][var37] >> 16);
                    }
                    field1338[var33] = var35;
                    var30 = this.field1356.method1244(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1338[var31 + var33] * (long) Statics.field1260 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1338[var31 + var33 - 1 - var40] * (long) class64.field1255[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1338[var33 - 1 - var41] * (long) class64.field1255[1][var41] >> 16);
                        }
                        field1338[var33] = var39;
                        var30 = this.field1356.method1244(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1338[var31 + var33 - 1 - var43] * (long) class64.field1255[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1338[var33 - 1 - var44] * (long) class64.field1255[1][var44] >> 16);
                            }
                            field1338[var33] = var42;
                            this.field1356.method1244(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1351.method1294(0, (float) var30 / 65536.0F);
                    var32 = this.field1351.method1294(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1338[var46] < -32768) {
                field1338[var46] = -32768;
            }
            if (field1338[var46] > 32767) {
                field1338[var46] = 32767;
            }
        }
        return field1338;
    }

    @ObfuscatedName("bj.u(III)I")
    public final int method1508(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("bj.x(Ldj;)V")
    public final void method1509(class120 arg0) {
        this.field1363 = new class58();
        this.field1363.method1241(arg0);
        this.field1339 = new class58();
        this.field1339.method1241(arg0);
        int var2 = arg0.method2385();
        if (var2 != 0) {
            arg0.field1999--;
            this.field1353 = new class58();
            this.field1353.method1241(arg0);
            this.field1341 = new class58();
            this.field1341.method1241(arg0);
        }
        int var3 = arg0.method2385();
        if (var3 != 0) {
            arg0.field1999--;
            this.field1342 = new class58();
            this.field1342.method1241(arg0);
            this.field1350 = new class58();
            this.field1350.method1241(arg0);
        }
        int var4 = arg0.method2385();
        if (var4 != 0) {
            arg0.field1999--;
            this.field1344 = new class58();
            this.field1344.method1241(arg0);
            this.field1345 = new class58();
            this.field1345.method1241(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2398();
            if (var6 == 0) {
                break;
            }
            this.field1346[var5] = var6;
            this.field1355[var5] = arg0.method2397();
            this.field1357[var5] = arg0.method2398();
        }
        this.field1349 = arg0.method2398();
        this.field1352 = arg0.method2398();
        this.field1358 = arg0.method2387();
        this.field1354 = arg0.method2387();
        this.field1351 = new class64();
        this.field1356 = new class58();
        this.field1351.method1299(arg0, this.field1356);
    }
}
