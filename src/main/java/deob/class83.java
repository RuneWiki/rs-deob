package deob;

@ObfuscatedName("cz")
public class class83 extends class90 {

    @ObfuscatedName("cz.s")
    public static class83 field1399 = new class83();

    @ObfuscatedName("cz.c")
    public static byte[] field1358 = new byte[1];

    @ObfuscatedName("cz.f")
    public static class83 field1365 = new class83();

    @ObfuscatedName("cz.h")
    public static byte[] field1360 = new byte[1];

    @ObfuscatedName("cz.a")
    public int field1359 = 0;

    @ObfuscatedName("cz.g")
    public int[] field1386;

    @ObfuscatedName("cz.k")
    public int[] field1384;

    @ObfuscatedName("cz.u")
    public int[] field1388;

    @ObfuscatedName("cz.b")
    public int field1370 = 0;

    @ObfuscatedName("cz.x")
    public int[] field1366;

    @ObfuscatedName("cz.r")
    public int[] field1380;

    @ObfuscatedName("cz.n")
    public int[] field1368;

    @ObfuscatedName("cz.m")
    public int[] field1369;

    @ObfuscatedName("cz.j")
    public int[] field1362;

    @ObfuscatedName("cz.w")
    public int[] field1381;

    @ObfuscatedName("cz.p")
    public byte[] field1372;

    @ObfuscatedName("cz.o")
    public byte[] field1373;

    @ObfuscatedName("cz.i")
    public byte[] field1361;

    @ObfuscatedName("cz.z")
    public short[] field1416;

    @ObfuscatedName("cz.e")
    public byte field1376 = 0;

    @ObfuscatedName("cz.d")
    public int field1367 = 0;

    @ObfuscatedName("cz.t")
    public int[] field1378;

    @ObfuscatedName("cz.q")
    public int[] field1379;

    @ObfuscatedName("cz.y")
    public int[] field1396;

    @ObfuscatedName("cz.l")
    public int[][] field1375;

    @ObfuscatedName("cz.v")
    public int[][] field1382;

    @ObfuscatedName("cz.az")
    public boolean field1383 = false;

    @ObfuscatedName("cz.ai")
    public int field1357;

    @ObfuscatedName("cz.ad")
    public int field1385;

    @ObfuscatedName("cz.aa")
    public int field1400;

    @ObfuscatedName("cz.ao")
    public int field1377;

    @ObfuscatedName("cz.ax")
    public int field1389;

    @ObfuscatedName("cz.al")
    public static boolean[] field1390 = new boolean[4700];

    @ObfuscatedName("cz.an")
    public static boolean[] field1391 = new boolean[4700];

    @ObfuscatedName("cz.aw")
    public static int[] field1392 = new int[4700];

    @ObfuscatedName("cz.ah")
    public static int[] field1393 = new int[4700];

    @ObfuscatedName("cz.ar")
    public static int[] field1394 = new int[4700];

    @ObfuscatedName("cz.ay")
    public static int[] field1395 = new int[4700];

    @ObfuscatedName("cz.as")
    public static int[] field1363 = new int[4700];

    @ObfuscatedName("cz.aq")
    public static int[] field1397 = new int[4700];

    @ObfuscatedName("cz.aj")
    public static int[] field1371 = new int[1600];

    @ObfuscatedName("cz.ap")
    public static int[][] field1364 = new int[1600][512];

    @ObfuscatedName("cz.ac")
    public static int[] field1401 = new int[12];

    @ObfuscatedName("cz.at")
    public static int[][] field1402 = new int[12][2000];

    @ObfuscatedName("cz.av")
    public static int[] field1403 = new int[2000];

    @ObfuscatedName("cz.am")
    public static int[] field1404 = new int[2000];

    @ObfuscatedName("cz.ak")
    public static int[] field1405 = new int[12];

    @ObfuscatedName("cz.au")
    public static int[] field1406 = new int[10];

    @ObfuscatedName("cz.ag")
    public static int[] field1407 = new int[10];

    @ObfuscatedName("cz.ab")
    public static int[] field1408 = new int[10];

    @ObfuscatedName("cz.bs")
    public static boolean field1412 = false;

    @ObfuscatedName("cz.bm")
    public static int field1413 = 0;

    @ObfuscatedName("cz.bb")
    public static int field1414 = 0;

    @ObfuscatedName("cz.bl")
    public static int field1415 = 0;

    @ObfuscatedName("cz.bp")
    public static int[] field1387 = new int[1000];

    @ObfuscatedName("cz.bh")
    public static int[] field1417 = class85.field1445;

    @ObfuscatedName("cz.bo")
    public static int[] field1418 = class85.field1454;

    @ObfuscatedName("cz.bx")
    public static int[] field1374 = class85.field1441;

    @ObfuscatedName("cz.bj")
    public static int[] field1420 = class85.field1452;

    public class83() {
    }

    public class83(class83[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1359 = 0;
        this.field1370 = 0;
        this.field1367 = 0;
        this.field1376 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class83 var8 = arg0[var7];
            if (var8 != null) {
                this.field1359 += var8.field1359;
                this.field1370 += var8.field1370;
                this.field1367 += var8.field1367;
                if (var8.field1372 == null) {
                    if (this.field1376 == -1) {
                        this.field1376 = var8.field1376;
                    }
                    if (this.field1376 != var8.field1376) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1373 != null;
                var5 |= var8.field1416 != null;
                var6 |= var8.field1361 != null;
            }
        }
        this.field1386 = new int[this.field1359];
        this.field1384 = new int[this.field1359];
        this.field1388 = new int[this.field1359];
        this.field1366 = new int[this.field1370];
        this.field1380 = new int[this.field1370];
        this.field1368 = new int[this.field1370];
        this.field1369 = new int[this.field1370];
        this.field1362 = new int[this.field1370];
        this.field1381 = new int[this.field1370];
        if (var3) {
            this.field1372 = new byte[this.field1370];
        }
        if (var4) {
            this.field1373 = new byte[this.field1370];
        }
        if (var5) {
            this.field1416 = new short[this.field1370];
        }
        if (var6) {
            this.field1361 = new byte[this.field1370];
        }
        if (this.field1367 > 0) {
            this.field1378 = new int[this.field1367];
            this.field1379 = new int[this.field1367];
            this.field1396 = new int[this.field1367];
        }
        this.field1359 = 0;
        this.field1370 = 0;
        this.field1367 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class83 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1370; var11++) {
                    this.field1366[this.field1370] = var10.field1366[var11] + this.field1359;
                    this.field1380[this.field1370] = var10.field1380[var11] + this.field1359;
                    this.field1368[this.field1370] = var10.field1368[var11] + this.field1359;
                    this.field1369[this.field1370] = var10.field1369[var11];
                    this.field1362[this.field1370] = var10.field1362[var11];
                    this.field1381[this.field1370] = var10.field1381[var11];
                    if (var3) {
                        if (var10.field1372 == null) {
                            this.field1372[this.field1370] = var10.field1376;
                        } else {
                            this.field1372[this.field1370] = var10.field1372[var11];
                        }
                    }
                    if (var4 && var10.field1373 != null) {
                        this.field1373[this.field1370] = var10.field1373[var11];
                    }
                    if (var5) {
                        if (var10.field1416 == null) {
                            this.field1416[this.field1370] = -1;
                        } else {
                            this.field1416[this.field1370] = var10.field1416[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1361 == null || var10.field1361[var11] == -1) {
                            this.field1361[this.field1370] = -1;
                        } else {
                            this.field1361[this.field1370] = (byte) (var10.field1361[var11] + this.field1367);
                        }
                    }
                    this.field1370++;
                }
                for (int var12 = 0; var12 < var10.field1367; var12++) {
                    this.field1378[this.field1367] = var10.field1378[var12] + this.field1359;
                    this.field1379[this.field1367] = var10.field1379[var12] + this.field1359;
                    this.field1396[this.field1367] = var10.field1396[var12] + this.field1359;
                    this.field1367++;
                }
                for (int var13 = 0; var13 < var10.field1359; var13++) {
                    this.field1386[this.field1359] = var10.field1386[var13];
                    this.field1384[this.field1359] = var10.field1384[var13];
                    this.field1388[this.field1359] = var10.field1388[var13];
                    this.field1359++;
                }
            }
        }
    }

    @ObfuscatedName("cz.s([[IIIIZI)Lcz;")
    public class83 method1483(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1443();
        int var7 = arg1 - this.field1400;
        int var8 = this.field1400 + arg1;
        int var9 = arg3 - this.field1400;
        int var10 = this.field1400 + arg3;
        if (var7 < 0 || var8 + 128 >> 7 >= arg0.length || var9 < 0 || var10 + 128 >> 7 >= arg0[0].length) {
            return this;
        }
        int var11 = var7 >> 7;
        int var12 = var8 + 127 >> 7;
        int var13 = var9 >> 7;
        int var14 = var10 + 127 >> 7;
        if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
            return this;
        }
        class83 var15;
        if (arg4) {
            var15 = new class83();
            var15.field1359 = this.field1359;
            var15.field1370 = this.field1370;
            var15.field1367 = this.field1367;
            var15.field1386 = this.field1386;
            var15.field1388 = this.field1388;
            var15.field1366 = this.field1366;
            var15.field1380 = this.field1380;
            var15.field1368 = this.field1368;
            var15.field1369 = this.field1369;
            var15.field1362 = this.field1362;
            var15.field1381 = this.field1381;
            var15.field1372 = this.field1372;
            var15.field1373 = this.field1373;
            var15.field1361 = this.field1361;
            var15.field1416 = this.field1416;
            var15.field1376 = this.field1376;
            var15.field1378 = this.field1378;
            var15.field1379 = this.field1379;
            var15.field1396 = this.field1396;
            var15.field1375 = this.field1375;
            var15.field1382 = this.field1382;
            var15.field1383 = this.field1383;
            var15.field1384 = new int[var15.field1359];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1359; var16++) {
                int var17 = this.field1386[var16] + arg1;
                int var18 = this.field1388[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1384[var16] = this.field1384[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1359; var26++) {
                int var27 = (-this.field1384[var26] << 16) / this.field1546;
                if (var27 < arg5) {
                    int var28 = this.field1386[var26] + arg1;
                    int var29 = this.field1388[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1384[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1384[var26];
                }
            }
        }
        var15.field1357 = 0;
        return var15;
    }

    @ObfuscatedName("cz.c(Z)Lcz;")
    public class83 method1444(boolean arg0) {
        if (!arg0 && field1358.length < this.field1370) {
            field1358 = new byte[this.field1370 + 100];
        }
        return this.method1446(arg0, field1399, field1358);
    }

    @ObfuscatedName("cz.g(Z)Lcz;")
    public class83 method1445(boolean arg0) {
        if (!arg0 && field1360.length < this.field1370) {
            field1360 = new byte[this.field1370 + 100];
        }
        return this.method1446(arg0, field1365, field1360);
    }

    @ObfuscatedName("cz.k(ZLcz;[B)Lcz;")
    public class83 method1446(boolean arg0, class83 arg1, byte[] arg2) {
        arg1.field1359 = this.field1359;
        arg1.field1370 = this.field1370;
        arg1.field1367 = this.field1367;
        if (arg1.field1386 == null || arg1.field1386.length < this.field1359) {
            arg1.field1386 = new int[this.field1359 + 100];
            arg1.field1384 = new int[this.field1359 + 100];
            arg1.field1388 = new int[this.field1359 + 100];
        }
        for (int var4 = 0; var4 < this.field1359; var4++) {
            arg1.field1386[var4] = this.field1386[var4];
            arg1.field1384[var4] = this.field1384[var4];
            arg1.field1388[var4] = this.field1388[var4];
        }
        if (arg0) {
            arg1.field1373 = this.field1373;
        } else {
            arg1.field1373 = arg2;
            if (this.field1373 == null) {
                for (int var5 = 0; var5 < this.field1370; var5++) {
                    arg1.field1373[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1370; var6++) {
                    arg1.field1373[var6] = this.field1373[var6];
                }
            }
        }
        arg1.field1366 = this.field1366;
        arg1.field1380 = this.field1380;
        arg1.field1368 = this.field1368;
        arg1.field1369 = this.field1369;
        arg1.field1362 = this.field1362;
        arg1.field1381 = this.field1381;
        arg1.field1372 = this.field1372;
        arg1.field1361 = this.field1361;
        arg1.field1416 = this.field1416;
        arg1.field1376 = this.field1376;
        arg1.field1378 = this.field1378;
        arg1.field1379 = this.field1379;
        arg1.field1396 = this.field1396;
        arg1.field1375 = this.field1375;
        arg1.field1382 = this.field1382;
        arg1.field1383 = this.field1383;
        arg1.field1357 = 0;
        return arg1;
    }

    @ObfuscatedName("cz.u()V")
    public void method1443() {
        if (this.field1357 == 1) {
            return;
        }
        this.field1357 = 1;
        this.field1546 = 0;
        this.field1385 = 0;
        this.field1400 = 0;
        for (int var1 = 0; var1 < this.field1359; var1++) {
            int var2 = this.field1386[var1];
            int var3 = this.field1384[var1];
            int var4 = this.field1388[var1];
            if (-var3 > this.field1546) {
                this.field1546 = -var3;
            }
            if (var3 > this.field1385) {
                this.field1385 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1400) {
                this.field1400 = var5;
            }
        }
        this.field1400 = (int) (Math.sqrt((double) this.field1400) + 0.99D);
        this.field1389 = (int) (Math.sqrt((double) (this.field1546 * this.field1546 + this.field1400 * this.field1400)) + 0.99D);
        this.field1377 = this.field1389 + (int) (Math.sqrt((double) (this.field1400 * this.field1400 + this.field1385 * this.field1385)) + 0.99D);
    }

    @ObfuscatedName("cz.b()V")
    public void method1448() {
        if (this.field1357 == 2) {
            return;
        }
        this.field1357 = 2;
        this.field1400 = 0;
        for (int var1 = 0; var1 < this.field1359; var1++) {
            int var2 = this.field1386[var1];
            int var3 = this.field1384[var1];
            int var4 = this.field1388[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1400) {
                this.field1400 = var5;
            }
        }
        this.field1400 = (int) (Math.sqrt((double) this.field1400) + 0.99D);
        this.field1389 = this.field1400;
        this.field1377 = this.field1400 + this.field1400;
    }

    @ObfuscatedName("cz.x()I")
    public int method1494() {
        this.method1443();
        return this.field1400;
    }

    @ObfuscatedName("cz.r(Lcp;I)V")
    public void method1453(class93 arg0, int arg1) {
        if (this.field1375 == null || arg1 == -1) {
            return;
        }
        class81 var3 = arg0.field1569[arg1];
        class87 var4 = var3.field1324;
        Statics.field1409 = 0;
        Statics.field1410 = 0;
        Statics.field1411 = 0;
        for (int var5 = 0; var5 < var3.field1325; var5++) {
            int var6 = var3.field1329[var5];
            this.method1452(var4.field1470[var6], var4.field1472[var6], var3.field1327[var5], var3.field1328[var5], var3.field1320[var5]);
        }
        this.field1357 = 0;
    }

    @ObfuscatedName("cz.n(Lcp;ILcp;I[I)V")
    public void method1451(class93 arg0, int arg1, class93 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method1453(arg0, arg1);
            return;
        }
        class81 var6 = arg0.field1569[arg1];
        class81 var7 = arg2.field1569[arg3];
        class87 var8 = var6.field1324;
        Statics.field1409 = 0;
        Statics.field1410 = 0;
        Statics.field1411 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1325; var11++) {
            int var12 = var6.field1329[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1470[var12] == 0) {
                this.method1452(var8.field1470[var12], var8.field1472[var12], var6.field1327[var11], var6.field1328[var11], var6.field1320[var11]);
            }
        }
        Statics.field1409 = 0;
        Statics.field1410 = 0;
        Statics.field1411 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1325; var15++) {
            int var16 = var7.field1329[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1470[var16] == 0) {
                this.method1452(var8.field1470[var16], var8.field1472[var16], var7.field1327[var15], var7.field1328[var15], var7.field1320[var15]);
            }
        }
        this.field1357 = 0;
    }

    @ObfuscatedName("cz.m(I[IIII)V")
    public void method1452(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1409 = 0;
            Statics.field1410 = 0;
            Statics.field1411 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1375.length) {
                    int[] var10 = this.field1375[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1409 += this.field1386[var12];
                        Statics.field1410 += this.field1384[var12];
                        Statics.field1411 += this.field1388[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1409 = Statics.field1409 / var7 + arg2;
                Statics.field1410 = Statics.field1410 / var7 + arg3;
                Statics.field1411 = Statics.field1411 / var7 + arg4;
            } else {
                Statics.field1409 = arg2;
                Statics.field1410 = arg3;
                Statics.field1411 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1375.length) {
                    int[] var15 = this.field1375[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1386[var17] += arg2;
                        this.field1384[var17] += arg3;
                        this.field1388[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1375.length) {
                    int[] var20 = this.field1375[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1386[var22] -= Statics.field1409;
                        this.field1384[var22] -= Statics.field1410;
                        this.field1388[var22] -= Statics.field1411;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1417[var25];
                            int var27 = field1418[var25];
                            int var28 = this.field1386[var22] * var27 + this.field1384[var22] * var26 >> 16;
                            this.field1384[var22] = this.field1384[var22] * var27 - this.field1386[var22] * var26 >> 16;
                            this.field1386[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1417[var23];
                            int var30 = field1418[var23];
                            int var31 = this.field1384[var22] * var30 - this.field1388[var22] * var29 >> 16;
                            this.field1388[var22] = this.field1388[var22] * var30 + this.field1384[var22] * var29 >> 16;
                            this.field1384[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1417[var24];
                            int var33 = field1418[var24];
                            int var34 = this.field1388[var22] * var32 + this.field1386[var22] * var33 >> 16;
                            this.field1388[var22] = this.field1388[var22] * var33 - this.field1386[var22] * var32 >> 16;
                            this.field1386[var22] = var34;
                        }
                        this.field1386[var22] += Statics.field1409;
                        this.field1384[var22] += Statics.field1410;
                        this.field1388[var22] += Statics.field1411;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1375.length) {
                    int[] var37 = this.field1375[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1386[var39] -= Statics.field1409;
                        this.field1384[var39] -= Statics.field1410;
                        this.field1388[var39] -= Statics.field1411;
                        this.field1386[var39] = this.field1386[var39] * arg2 / 128;
                        this.field1384[var39] = this.field1384[var39] * arg3 / 128;
                        this.field1388[var39] = this.field1388[var39] * arg4 / 128;
                        this.field1386[var39] += Statics.field1409;
                        this.field1384[var39] += Statics.field1410;
                        this.field1388[var39] += Statics.field1411;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1382 != null && this.field1373 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1382.length) {
                    int[] var42 = this.field1382[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1373[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1373[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("cz.j()V")
    public void method1514() {
        for (int var1 = 0; var1 < this.field1359; var1++) {
            int var2 = this.field1386[var1];
            this.field1386[var1] = this.field1388[var1];
            this.field1388[var1] = -var2;
        }
        this.field1357 = 0;
    }

    @ObfuscatedName("cz.w()V")
    public void method1468() {
        for (int var1 = 0; var1 < this.field1359; var1++) {
            this.field1386[var1] = -this.field1386[var1];
            this.field1388[var1] = -this.field1388[var1];
        }
        this.field1357 = 0;
    }

    @ObfuscatedName("cz.p()V")
    public void method1455() {
        for (int var1 = 0; var1 < this.field1359; var1++) {
            int var2 = this.field1388[var1];
            this.field1388[var1] = this.field1386[var1];
            this.field1386[var1] = -var2;
        }
        this.field1357 = 0;
    }

    @ObfuscatedName("cz.z(I)V")
    public void method1456(int arg0) {
        int var2 = field1417[arg0];
        int var3 = field1418[arg0];
        for (int var4 = 0; var4 < this.field1359; var4++) {
            int var5 = this.field1384[var4] * var3 - this.field1388[var4] * var2 >> 16;
            this.field1388[var4] = this.field1388[var4] * var3 + this.field1384[var4] * var2 >> 16;
            this.field1384[var4] = var5;
        }
        this.field1357 = 0;
    }

    @ObfuscatedName("cz.e(III)V")
    public void method1442(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1359; var4++) {
            this.field1386[var4] += arg0;
            this.field1384[var4] += arg1;
            this.field1388[var4] += arg2;
        }
        this.field1357 = 0;
    }

    @ObfuscatedName("cz.d(III)V")
    public void method1471(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1359; var4++) {
            this.field1386[var4] = this.field1386[var4] * arg0 / 128;
            this.field1384[var4] = this.field1384[var4] * arg1 / 128;
            this.field1388[var4] = this.field1388[var4] * arg2 / 128;
        }
        this.field1357 = 0;
    }

    @ObfuscatedName("cz.t(IIIIIII)V")
    public final void method1459(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1371[0] = -1;
        if (this.field1357 != 2 && this.field1357 != 1) {
            this.method1448();
        }
        int var8 = Statics.field1432;
        int var9 = Statics.field1450;
        int var10 = field1417[arg0];
        int var11 = field1418[arg0];
        int var12 = field1417[arg1];
        int var13 = field1418[arg1];
        int var14 = field1417[arg2];
        int var15 = field1418[arg2];
        int var16 = field1417[arg3];
        int var17 = field1418[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1359; var19++) {
            int var20 = this.field1386[var19];
            int var21 = this.field1384[var19];
            int var22 = this.field1388[var19];
            if (arg2 != 0) {
                int var23 = var14 * var21 + var15 * var20 >> 16;
                var21 = var15 * var21 - var14 * var20 >> 16;
                var20 = var23;
            }
            if (arg0 != 0) {
                int var24 = var11 * var21 - var10 * var22 >> 16;
                var22 = var10 * var21 + var11 * var22 >> 16;
                var21 = var24;
            }
            if (arg1 != 0) {
                int var25 = var12 * var22 + var13 * var20 >> 16;
                var22 = var13 * var22 - var12 * var20 >> 16;
                var20 = var25;
            }
            int var26 = arg4 + var20;
            int var27 = arg5 + var21;
            int var28 = arg6 + var22;
            int var29 = var17 * var27 - var16 * var28 >> 16;
            int var30 = var16 * var27 + var17 * var28 >> 16;
            field1394[var19] = var30 - var18;
            field1392[var19] = class85.field1436 * var26 / var30 + var8;
            field1393[var19] = class85.field1436 * var29 / var30 + var9;
            if (this.field1367 > 0) {
                field1395[var19] = var26;
                field1363[var19] = var29;
                field1397[var19] = var30;
            }
        }
        try {
            this.method1462(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("cz.q(IIIIIIII)V")
    public final void method1460(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1371[0] = -1;
        if (this.field1357 != 2 && this.field1357 != 1) {
            this.method1448();
        }
        int var9 = Statics.field1432;
        int var10 = Statics.field1450;
        int var11 = field1417[arg0];
        int var12 = field1418[arg0];
        int var13 = field1417[arg1];
        int var14 = field1418[arg1];
        int var15 = field1417[arg2];
        int var16 = field1418[arg2];
        int var17 = field1417[arg3];
        int var18 = field1418[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1359; var20++) {
            int var21 = this.field1386[var20];
            int var22 = this.field1384[var20];
            int var23 = this.field1388[var20];
            if (arg2 != 0) {
                int var24 = var15 * var22 + var16 * var21 >> 16;
                var22 = var16 * var22 - var15 * var21 >> 16;
                var21 = var24;
            }
            if (arg0 != 0) {
                int var25 = var12 * var22 - var11 * var23 >> 16;
                var23 = var11 * var22 + var12 * var23 >> 16;
                var22 = var25;
            }
            if (arg1 != 0) {
                int var26 = var13 * var23 + var14 * var21 >> 16;
                var23 = var14 * var23 - var13 * var21 >> 16;
                var21 = var26;
            }
            int var27 = arg4 + var21;
            int var28 = arg5 + var22;
            int var29 = arg6 + var23;
            int var30 = var18 * var28 - var17 * var29 >> 16;
            int var31 = var17 * var28 + var18 * var29 >> 16;
            field1394[var20] = var31 - var19;
            field1392[var20] = class85.field1436 * var27 / arg7 + var9;
            field1393[var20] = class85.field1436 * var30 / arg7 + var10;
            if (this.field1367 > 0) {
                field1395[var20] = var27;
                field1363[var20] = var30;
                field1397[var20] = var31;
            }
        }
        try {
            this.method1462(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("cz.ca(IIIIIIIII)V")
    public void method1461(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1371[0] = -1;
        if (this.field1357 != 1) {
            this.method1443();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1400 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1400) * class85.field1436;
        if (var15 / var13 >= Statics.field1440) {
            return;
        }
        int var16 = (this.field1400 + var14) * class85.field1436;
        if (var16 / var13 <= Statics.field1442) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1400 * arg1 >> 16;
        int var19 = (var17 + var18) * class85.field1436;
        if (var19 / var13 <= Statics.field1446) {
            return;
        }
        int var20 = (this.field1546 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class85.field1436;
        if (var21 / var13 >= Statics.field1447) {
            return;
        }
        int var22 = (this.field1546 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1367 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1412) {
            int var27 = var11 - var12;
            if (var27 <= 50) {
                var27 = 50;
            }
            int var28;
            int var29;
            if (var14 > 0) {
                var28 = var15 / var13;
                var29 = var16 / var27;
            } else {
                var29 = var16 / var13;
                var28 = var15 / var27;
            }
            int var30;
            int var31;
            if (var17 > 0) {
                var30 = var21 / var13;
                var31 = var19 / var27;
            } else {
                var31 = var19 / var13;
                var30 = var21 / var27;
            }
            int var32 = field1413 - Statics.field1432;
            int var33 = field1414 - Statics.field1450;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1383) {
                    field1387[field1415++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1432;
        int var35 = Statics.field1450;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1417[arg0];
            var37 = field1418[arg0];
        }
        for (int var38 = 0; var38 < this.field1359; var38++) {
            int var39 = this.field1386[var38];
            int var40 = this.field1384[var38];
            int var41 = this.field1388[var38];
            if (arg0 != 0) {
                int var42 = var36 * var41 + var37 * var39 >> 16;
                var41 = var37 * var41 - var36 * var39 >> 16;
                var39 = var42;
            }
            int var43 = arg5 + var39;
            int var44 = arg6 + var40;
            int var45 = arg7 + var41;
            int var46 = arg3 * var45 + arg4 * var43 >> 16;
            int var47 = arg4 * var45 - arg3 * var43 >> 16;
            int var49 = arg2 * var44 - arg1 * var47 >> 16;
            int var50 = arg1 * var44 + arg2 * var47 >> 16;
            field1394[var38] = var50 - var11;
            if (var50 >= 50) {
                field1392[var38] = class85.field1436 * var46 / var50 + var34;
                field1393[var38] = class85.field1436 * var49 / var50 + var35;
            } else {
                field1392[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1395[var38] = var46;
                field1363[var38] = var49;
                field1397[var38] = var50;
            }
        }
        try {
            this.method1462(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("cz.y(ZZI)V")
    public final void method1462(boolean arg0, boolean arg1, int arg2) {
        if (this.field1377 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1377; var4++) {
            field1371[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1370; var5++) {
            if (this.field1381[var5] != -2) {
                int var6 = this.field1366[var5];
                int var7 = this.field1380[var5];
                int var8 = this.field1368[var5];
                int var9 = field1392[var6];
                int var10 = field1392[var7];
                int var11 = field1392[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1395[var6];
                    int var13 = field1395[var7];
                    int var14 = field1395[var8];
                    int var15 = field1363[var6];
                    int var16 = field1363[var7];
                    int var17 = field1363[var8];
                    int var18 = field1397[var6];
                    int var19 = field1397[var7];
                    int var20 = field1397[var8];
                    int var21 = var12 - var13;
                    int var22 = var14 - var13;
                    int var23 = var15 - var16;
                    int var24 = var17 - var16;
                    int var25 = var18 - var19;
                    int var26 = var20 - var19;
                    int var27 = var23 * var26 - var24 * var25;
                    int var28 = var22 * var25 - var21 * var26;
                    int var29 = var21 * var24 - var22 * var23;
                    if (var19 * var29 + var13 * var27 + var16 * var28 > 0) {
                        field1391[var5] = true;
                        int var30 = (field1394[var6] + field1394[var7] + field1394[var8]) / 3 + this.field1389;
                        field1364[var30][field1371[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method1465(field1413, field1414, field1393[var6], field1393[var7], field1393[var8], var9, var10, var11)) {
                        field1387[field1415++] = arg2;
                        arg1 = false;
                    }
                    if ((field1393[var8] - field1393[var7]) * (var9 - var10) - (field1393[var6] - field1393[var7]) * (var11 - var10) > 0) {
                        field1391[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1431 && var10 <= Statics.field1431 && var11 <= Statics.field1431) {
                            field1390[var5] = false;
                        } else {
                            field1390[var5] = true;
                        }
                        int var31 = (field1394[var6] + field1394[var7] + field1394[var8]) / 3 + this.field1389;
                        field1364[var31][field1371[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1372 == null) {
            for (int var32 = this.field1377 - 1; var32 >= 0; var32--) {
                int var33 = field1371[var32];
                if (var33 > 0) {
                    int[] var34 = field1364[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method1454(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1401[var36] = 0;
            field1405[var36] = 0;
        }
        for (int var37 = this.field1377 - 1; var37 >= 0; var37--) {
            int var38 = field1371[var37];
            if (var38 > 0) {
                int[] var39 = field1364[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1372[var41];
                    int var43 = field1401[var42]++;
                    field1402[var42][var43] = var41;
                    if (var42 < 10) {
                        field1405[var42] += var37;
                    } else if (var42 == 10) {
                        field1403[var43] = var37;
                    } else {
                        field1404[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1401[1] > 0 || field1401[2] > 0) {
            var44 = (field1405[1] + field1405[2]) / (field1401[1] + field1401[2]);
        }
        int var45 = 0;
        if (field1401[3] > 0 || field1401[4] > 0) {
            var45 = (field1405[3] + field1405[4]) / (field1401[3] + field1401[4]);
        }
        int var46 = 0;
        if (field1401[6] > 0 || field1401[8] > 0) {
            var46 = (field1405[6] + field1405[8]) / (field1401[6] + field1401[8]);
        }
        int var47 = 0;
        int var48 = field1401[10];
        int[] var49 = field1402[10];
        int[] var50 = field1403;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1401[11];
            var49 = field1402[11];
            var50 = field1404;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method1454(var49[var47++]);
                if (var47 == var48 && field1402[11] != var49) {
                    var47 = 0;
                    var48 = field1401[11];
                    var49 = field1402[11];
                    var50 = field1404;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method1454(var49[var47++]);
                if (var47 == var48 && field1402[11] != var49) {
                    var47 = 0;
                    var48 = field1401[11];
                    var49 = field1402[11];
                    var50 = field1404;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method1454(var49[var47++]);
                if (var47 == var48 && field1402[11] != var49) {
                    var47 = 0;
                    var48 = field1401[11];
                    var49 = field1402[11];
                    var50 = field1404;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1401[var52];
            int[] var54 = field1402[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method1454(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method1454(var49[var47++]);
            if (var47 == var48 && field1402[11] != var49) {
                var47 = 0;
                var49 = field1402[11];
                var48 = field1401[11];
                var50 = field1404;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("cz.l(I)V")
    public final void method1454(int arg0) {
        if (field1391[arg0]) {
            this.method1464(arg0);
            return;
        }
        int var2 = this.field1366[arg0];
        int var3 = this.field1380[arg0];
        int var4 = this.field1368[arg0];
        class85.field1444 = field1390[arg0];
        if (this.field1373 == null) {
            class85.field1434 = 0;
        } else {
            class85.field1434 = this.field1373[arg0] & 0xFF;
        }
        if (this.field1416 != null && this.field1416[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1361 == null || this.field1361[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1361[arg0] & 0xFF;
                var6 = this.field1378[var5];
                var7 = this.field1379[var5];
                var8 = this.field1396[var5];
            }
            if (this.field1381[arg0] == -1) {
                class85.method1531(field1393[var2], field1393[var3], field1393[var4], field1392[var2], field1392[var3], field1392[var4], this.field1369[arg0], this.field1369[arg0], this.field1369[arg0], field1395[var6], field1395[var7], field1395[var8], field1363[var6], field1363[var7], field1363[var8], field1397[var6], field1397[var7], field1397[var8], this.field1416[arg0]);
            } else {
                class85.method1531(field1393[var2], field1393[var3], field1393[var4], field1392[var2], field1392[var3], field1392[var4], this.field1369[arg0], this.field1362[arg0], this.field1381[arg0], field1395[var6], field1395[var7], field1395[var8], field1363[var6], field1363[var7], field1363[var8], field1397[var6], field1397[var7], field1397[var8], this.field1416[arg0]);
            }
        } else if (this.field1381[arg0] == -1) {
            class85.method1562(field1393[var2], field1393[var3], field1393[var4], field1392[var2], field1392[var3], field1392[var4], field1374[this.field1369[arg0]]);
        } else {
            class85.method1527(field1393[var2], field1393[var3], field1393[var4], field1392[var2], field1392[var3], field1392[var4], this.field1369[arg0], this.field1362[arg0], this.field1381[arg0]);
        }
    }

    @ObfuscatedName("cz.v(I)V")
    public final void method1464(int arg0) {
        int var2 = Statics.field1432;
        int var3 = Statics.field1450;
        int var4 = 0;
        int var5 = this.field1366[arg0];
        int var6 = this.field1380[arg0];
        int var7 = this.field1368[arg0];
        int var8 = field1397[var5];
        int var9 = field1397[var6];
        int var10 = field1397[var7];
        if (this.field1373 == null) {
            class85.field1434 = 0;
        } else {
            class85.field1434 = this.field1373[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1406[var4] = field1392[var5];
            field1407[var4] = field1393[var5];
            field1408[var4++] = this.field1369[arg0];
        } else {
            int var11 = field1395[var5];
            int var12 = field1363[var5];
            int var13 = this.field1369[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1420[var10 - var8];
                field1406[var4] = (((field1395[var7] - var11) * var14 >> 16) + var11) * class85.field1436 / 50 + var2;
                field1407[var4] = (((field1363[var7] - var12) * var14 >> 16) + var12) * class85.field1436 / 50 + var3;
                field1408[var4++] = ((this.field1381[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1420[var9 - var8];
                field1406[var4] = (((field1395[var6] - var11) * var15 >> 16) + var11) * class85.field1436 / 50 + var2;
                field1407[var4] = (((field1363[var6] - var12) * var15 >> 16) + var12) * class85.field1436 / 50 + var3;
                field1408[var4++] = ((this.field1362[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1406[var4] = field1392[var6];
            field1407[var4] = field1393[var6];
            field1408[var4++] = this.field1362[arg0];
        } else {
            int var16 = field1395[var6];
            int var17 = field1363[var6];
            int var18 = this.field1362[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1420[var8 - var9];
                field1406[var4] = (((field1395[var5] - var16) * var19 >> 16) + var16) * class85.field1436 / 50 + var2;
                field1407[var4] = (((field1363[var5] - var17) * var19 >> 16) + var17) * class85.field1436 / 50 + var3;
                field1408[var4++] = ((this.field1369[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1420[var10 - var9];
                field1406[var4] = (((field1395[var7] - var16) * var20 >> 16) + var16) * class85.field1436 / 50 + var2;
                field1407[var4] = (((field1363[var7] - var17) * var20 >> 16) + var17) * class85.field1436 / 50 + var3;
                field1408[var4++] = ((this.field1381[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1406[var4] = field1392[var7];
            field1407[var4] = field1393[var7];
            field1408[var4++] = this.field1381[arg0];
        } else {
            int var21 = field1395[var7];
            int var22 = field1363[var7];
            int var23 = this.field1381[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1420[var9 - var10];
                field1406[var4] = (((field1395[var6] - var21) * var24 >> 16) + var21) * class85.field1436 / 50 + var2;
                field1407[var4] = (((field1363[var6] - var22) * var24 >> 16) + var22) * class85.field1436 / 50 + var3;
                field1408[var4++] = ((this.field1362[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1420[var8 - var10];
                field1406[var4] = (((field1395[var5] - var21) * var25 >> 16) + var21) * class85.field1436 / 50 + var2;
                field1407[var4] = (((field1363[var5] - var22) * var25 >> 16) + var22) * class85.field1436 / 50 + var3;
                field1408[var4++] = ((this.field1369[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1406[0];
        int var27 = field1406[1];
        int var28 = field1406[2];
        int var29 = field1407[0];
        int var30 = field1407[1];
        int var31 = field1407[2];
        class85.field1444 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1431 || var27 > Statics.field1431 || var28 > Statics.field1431) {
                class85.field1444 = true;
            }
            if (this.field1416 != null && this.field1416[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1361 == null || this.field1361[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1361[arg0] & 0xFF;
                    var33 = this.field1378[var32];
                    var34 = this.field1379[var32];
                    var35 = this.field1396[var32];
                }
                if (this.field1381[arg0] == -1) {
                    class85.method1531(var29, var30, var31, var26, var27, var28, this.field1369[arg0], this.field1369[arg0], this.field1369[arg0], field1395[var33], field1395[var34], field1395[var35], field1363[var33], field1363[var34], field1363[var35], field1397[var33], field1397[var34], field1397[var35], this.field1416[arg0]);
                } else {
                    class85.method1531(var29, var30, var31, var26, var27, var28, field1408[0], field1408[1], field1408[2], field1395[var33], field1395[var34], field1395[var35], field1363[var33], field1363[var34], field1363[var35], field1397[var33], field1397[var34], field1397[var35], this.field1416[arg0]);
                }
            } else if (this.field1381[arg0] == -1) {
                class85.method1562(var29, var30, var31, var26, var27, var28, field1374[this.field1369[arg0]]);
            } else {
                class85.method1527(var29, var30, var31, var26, var27, var28, field1408[0], field1408[1], field1408[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1431 || var27 > Statics.field1431 || var28 > Statics.field1431 || field1406[3] < 0 || field1406[3] > Statics.field1431) {
            class85.field1444 = true;
        }
        if (this.field1416 != null && this.field1416[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1361 == null || this.field1361[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1361[arg0] & 0xFF;
                var37 = this.field1378[var36];
                var38 = this.field1379[var36];
                var39 = this.field1396[var36];
            }
            short var40 = this.field1416[arg0];
            if (this.field1381[arg0] == -1) {
                class85.method1531(var29, var30, var31, var26, var27, var28, this.field1369[arg0], this.field1369[arg0], this.field1369[arg0], field1395[var37], field1395[var38], field1395[var39], field1363[var37], field1363[var38], field1363[var39], field1397[var37], field1397[var38], field1397[var39], var40);
                class85.method1531(var29, var31, field1407[3], var26, var28, field1406[3], this.field1369[arg0], this.field1369[arg0], this.field1369[arg0], field1395[var37], field1395[var38], field1395[var39], field1363[var37], field1363[var38], field1363[var39], field1397[var37], field1397[var38], field1397[var39], var40);
            } else {
                class85.method1531(var29, var30, var31, var26, var27, var28, field1408[0], field1408[1], field1408[2], field1395[var37], field1395[var38], field1395[var39], field1363[var37], field1363[var38], field1363[var39], field1397[var37], field1397[var38], field1397[var39], var40);
                class85.method1531(var29, var31, field1407[3], var26, var28, field1406[3], field1408[0], field1408[2], field1408[3], field1395[var37], field1395[var38], field1395[var39], field1363[var37], field1363[var38], field1363[var39], field1397[var37], field1397[var38], field1397[var39], var40);
            }
        } else if (this.field1381[arg0] == -1) {
            int var41 = field1374[this.field1369[arg0]];
            class85.method1562(var29, var30, var31, var26, var27, var28, var41);
            class85.method1562(var29, var31, field1407[3], var26, var28, field1406[3], var41);
        } else {
            class85.method1527(var29, var30, var31, var26, var27, var28, field1408[0], field1408[1], field1408[2]);
            class85.method1527(var29, var31, field1407[3], var26, var28, field1406[3], field1408[0], field1408[2], field1408[3]);
        }
    }

    @ObfuscatedName("cz.az(IIIIIIII)Z")
    public final boolean method1465(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }
}
