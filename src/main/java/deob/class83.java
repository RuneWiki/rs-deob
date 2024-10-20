package deob;

@ObfuscatedName("cw")
public class class83 extends class90 {

    @ObfuscatedName("cw.p")
    public static class83 field1365 = new class83();

    @ObfuscatedName("cw.g")
    public static byte[] field1356 = new byte[1];

    @ObfuscatedName("cw.x")
    public static class83 field1357 = new class83();

    @ObfuscatedName("cw.q")
    public static byte[] field1358 = new byte[1];

    @ObfuscatedName("cw.d")
    public int field1359 = 0;

    @ObfuscatedName("cw.k")
    public int[] field1360;

    @ObfuscatedName("cw.j")
    public int[] field1376;

    @ObfuscatedName("cw.s")
    public int[] field1362;

    @ObfuscatedName("cw.o")
    public int field1367 = 0;

    @ObfuscatedName("cw.a")
    public int[] field1363;

    @ObfuscatedName("cw.c")
    public int[] field1412;

    @ObfuscatedName("cw.m")
    public int[] field1366;

    @ObfuscatedName("cw.h")
    public int[] field1355;

    @ObfuscatedName("cw.r")
    public int[] field1368;

    @ObfuscatedName("cw.u")
    public int[] field1370;

    @ObfuscatedName("cw.i")
    public byte[] field1416;

    @ObfuscatedName("cw.z")
    public byte[] field1371;

    @ObfuscatedName("cw.n")
    public byte[] field1372;

    @ObfuscatedName("cw.w")
    public short[] field1373;

    @ObfuscatedName("cw.y")
    public byte field1374 = 0;

    @ObfuscatedName("cw.v")
    public int field1375 = 0;

    @ObfuscatedName("cw.f")
    public int[] field1380;

    @ObfuscatedName("cw.l")
    public int[] field1407;

    @ObfuscatedName("cw.t")
    public int[] field1378;

    @ObfuscatedName("cw.b")
    public int[][] field1379;

    @ObfuscatedName("cw.e")
    public int[][] field1394;

    @ObfuscatedName("cw.ai")
    public boolean field1381 = false;

    @ObfuscatedName("cw.am")
    public int field1397;

    @ObfuscatedName("cw.ad")
    public int field1383;

    @ObfuscatedName("cw.ah")
    public int field1377;

    @ObfuscatedName("cw.aj")
    public int field1385;

    @ObfuscatedName("cw.ax")
    public int field1406;

    @ObfuscatedName("cw.ar")
    public static boolean[] field1401 = new boolean[4700];

    @ObfuscatedName("cw.aw")
    public static boolean[] field1408 = new boolean[4700];

    @ObfuscatedName("cw.ay")
    public static int[] field1390 = new int[4700];

    @ObfuscatedName("cw.af")
    public static int[] field1391 = new int[4700];

    @ObfuscatedName("cw.av")
    public static int[] field1387 = new int[4700];

    @ObfuscatedName("cw.aa")
    public static int[] field1393 = new int[4700];

    @ObfuscatedName("cw.ag")
    public static int[] field1389 = new int[4700];

    @ObfuscatedName("cw.ao")
    public static int[] field1395 = new int[4700];

    @ObfuscatedName("cw.an")
    public static int[] field1386 = new int[1600];

    @ObfuscatedName("cw.ac")
    public static int[][] field1398 = new int[1600][512];

    @ObfuscatedName("cw.al")
    public static int[] field1399 = new int[12];

    @ObfuscatedName("cw.ae")
    public static int[][] field1400 = new int[12][2000];

    @ObfuscatedName("cw.ap")
    public static int[] field1414 = new int[2000];

    @ObfuscatedName("cw.au")
    public static int[] field1402 = new int[2000];

    @ObfuscatedName("cw.aq")
    public static int[] field1384 = new int[12];

    @ObfuscatedName("cw.at")
    public static int[] field1404 = new int[10];

    @ObfuscatedName("cw.az")
    public static int[] field1405 = new int[10];

    @ObfuscatedName("cw.as")
    public static int[] field1388 = new int[10];

    @ObfuscatedName("cw.br")
    public static boolean field1410 = false;

    @ObfuscatedName("cw.bb")
    public static int field1411 = 0;

    @ObfuscatedName("cw.bl")
    public static int field1364 = 0;

    @ObfuscatedName("cw.bm")
    public static int field1413 = 0;

    @ObfuscatedName("cw.bf")
    public static int[] field1392 = new int[1000];

    @ObfuscatedName("cw.bg")
    public static int[] field1415 = class85.field1439;

    @ObfuscatedName("cw.bp")
    public static int[] field1420 = class85.field1453;

    @ObfuscatedName("cw.bj")
    public static int[] field1417 = class85.field1448;

    @ObfuscatedName("cw.bx")
    public static int[] field1418 = class85.field1451;

    public class83() {
    }

    public class83(class83[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1359 = 0;
        this.field1367 = 0;
        this.field1375 = 0;
        this.field1374 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class83 var8 = arg0[var7];
            if (var8 != null) {
                this.field1359 += var8.field1359;
                this.field1367 += var8.field1367;
                this.field1375 += var8.field1375;
                if (var8.field1416 == null) {
                    if (this.field1374 == -1) {
                        this.field1374 = var8.field1374;
                    }
                    if (this.field1374 != var8.field1374) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1371 != null;
                var5 |= var8.field1373 != null;
                var6 |= var8.field1372 != null;
            }
        }
        this.field1360 = new int[this.field1359];
        this.field1376 = new int[this.field1359];
        this.field1362 = new int[this.field1359];
        this.field1363 = new int[this.field1367];
        this.field1412 = new int[this.field1367];
        this.field1366 = new int[this.field1367];
        this.field1355 = new int[this.field1367];
        this.field1368 = new int[this.field1367];
        this.field1370 = new int[this.field1367];
        if (var3) {
            this.field1416 = new byte[this.field1367];
        }
        if (var4) {
            this.field1371 = new byte[this.field1367];
        }
        if (var5) {
            this.field1373 = new short[this.field1367];
        }
        if (var6) {
            this.field1372 = new byte[this.field1367];
        }
        if (this.field1375 > 0) {
            this.field1380 = new int[this.field1375];
            this.field1407 = new int[this.field1375];
            this.field1378 = new int[this.field1375];
        }
        this.field1359 = 0;
        this.field1367 = 0;
        this.field1375 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class83 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1367; var11++) {
                    this.field1363[this.field1367] = var10.field1363[var11] + this.field1359;
                    this.field1412[this.field1367] = var10.field1412[var11] + this.field1359;
                    this.field1366[this.field1367] = var10.field1366[var11] + this.field1359;
                    this.field1355[this.field1367] = var10.field1355[var11];
                    this.field1368[this.field1367] = var10.field1368[var11];
                    this.field1370[this.field1367] = var10.field1370[var11];
                    if (var3) {
                        if (var10.field1416 == null) {
                            this.field1416[this.field1367] = var10.field1374;
                        } else {
                            this.field1416[this.field1367] = var10.field1416[var11];
                        }
                    }
                    if (var4 && var10.field1371 != null) {
                        this.field1371[this.field1367] = var10.field1371[var11];
                    }
                    if (var5) {
                        if (var10.field1373 == null) {
                            this.field1373[this.field1367] = -1;
                        } else {
                            this.field1373[this.field1367] = var10.field1373[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1372 == null || var10.field1372[var11] == -1) {
                            this.field1372[this.field1367] = -1;
                        } else {
                            this.field1372[this.field1367] = (byte) (var10.field1372[var11] + this.field1375);
                        }
                    }
                    this.field1367++;
                }
                for (int var12 = 0; var12 < var10.field1375; var12++) {
                    this.field1380[this.field1375] = var10.field1380[var12] + this.field1359;
                    this.field1407[this.field1375] = var10.field1407[var12] + this.field1359;
                    this.field1378[this.field1375] = var10.field1378[var12] + this.field1359;
                    this.field1375++;
                }
                for (int var13 = 0; var13 < var10.field1359; var13++) {
                    this.field1360[this.field1359] = var10.field1360[var13];
                    this.field1376[this.field1359] = var10.field1376[var13];
                    this.field1362[this.field1359] = var10.field1362[var13];
                    this.field1359++;
                }
            }
        }
    }

    @ObfuscatedName("cw.p([[IIIIZI)Lcw;")
    public class83 method1456(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1504();
        int var7 = arg1 - this.field1377;
        int var8 = this.field1377 + arg1;
        int var9 = arg3 - this.field1377;
        int var10 = this.field1377 + arg3;
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
            var15.field1367 = this.field1367;
            var15.field1375 = this.field1375;
            var15.field1360 = this.field1360;
            var15.field1362 = this.field1362;
            var15.field1363 = this.field1363;
            var15.field1412 = this.field1412;
            var15.field1366 = this.field1366;
            var15.field1355 = this.field1355;
            var15.field1368 = this.field1368;
            var15.field1370 = this.field1370;
            var15.field1416 = this.field1416;
            var15.field1371 = this.field1371;
            var15.field1372 = this.field1372;
            var15.field1373 = this.field1373;
            var15.field1374 = this.field1374;
            var15.field1380 = this.field1380;
            var15.field1407 = this.field1407;
            var15.field1378 = this.field1378;
            var15.field1379 = this.field1379;
            var15.field1394 = this.field1394;
            var15.field1381 = this.field1381;
            var15.field1376 = new int[var15.field1359];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1359; var16++) {
                int var17 = this.field1360[var16] + arg1;
                int var18 = this.field1362[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1376[var16] = this.field1376[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1359; var26++) {
                int var27 = (-this.field1376[var26] << 16) / this.field1544;
                if (var27 < arg5) {
                    int var28 = this.field1360[var26] + arg1;
                    int var29 = this.field1362[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1376[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1376[var26];
                }
            }
        }
        var15.field1397 = 0;
        return var15;
    }

    @ObfuscatedName("cw.g(Z)Lcw;")
    public class83 method1457(boolean arg0) {
        if (!arg0 && field1356.length < this.field1367) {
            field1356 = new byte[this.field1367 + 100];
        }
        return this.method1459(arg0, field1365, field1356);
    }

    @ObfuscatedName("cw.q(Z)Lcw;")
    public class83 method1458(boolean arg0) {
        if (!arg0 && field1358.length < this.field1367) {
            field1358 = new byte[this.field1367 + 100];
        }
        return this.method1459(arg0, field1357, field1358);
    }

    @ObfuscatedName("cw.d(ZLcw;[B)Lcw;")
    public class83 method1459(boolean arg0, class83 arg1, byte[] arg2) {
        arg1.field1359 = this.field1359;
        arg1.field1367 = this.field1367;
        arg1.field1375 = this.field1375;
        if (arg1.field1360 == null || arg1.field1360.length < this.field1359) {
            arg1.field1360 = new int[this.field1359 + 100];
            arg1.field1376 = new int[this.field1359 + 100];
            arg1.field1362 = new int[this.field1359 + 100];
        }
        for (int var4 = 0; var4 < this.field1359; var4++) {
            arg1.field1360[var4] = this.field1360[var4];
            arg1.field1376[var4] = this.field1376[var4];
            arg1.field1362[var4] = this.field1362[var4];
        }
        if (arg0) {
            arg1.field1371 = this.field1371;
        } else {
            arg1.field1371 = arg2;
            if (this.field1371 == null) {
                for (int var5 = 0; var5 < this.field1367; var5++) {
                    arg1.field1371[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1367; var6++) {
                    arg1.field1371[var6] = this.field1371[var6];
                }
            }
        }
        arg1.field1363 = this.field1363;
        arg1.field1412 = this.field1412;
        arg1.field1366 = this.field1366;
        arg1.field1355 = this.field1355;
        arg1.field1368 = this.field1368;
        arg1.field1370 = this.field1370;
        arg1.field1416 = this.field1416;
        arg1.field1372 = this.field1372;
        arg1.field1373 = this.field1373;
        arg1.field1374 = this.field1374;
        arg1.field1380 = this.field1380;
        arg1.field1407 = this.field1407;
        arg1.field1378 = this.field1378;
        arg1.field1379 = this.field1379;
        arg1.field1394 = this.field1394;
        arg1.field1381 = this.field1381;
        arg1.field1397 = 0;
        return arg1;
    }

    @ObfuscatedName("cw.k()V")
    public void method1504() {
        if (this.field1397 == 1) {
            return;
        }
        this.field1397 = 1;
        this.field1544 = 0;
        this.field1383 = 0;
        this.field1377 = 0;
        for (int var1 = 0; var1 < this.field1359; var1++) {
            int var2 = this.field1360[var1];
            int var3 = this.field1376[var1];
            int var4 = this.field1362[var1];
            if (-var3 > this.field1544) {
                this.field1544 = -var3;
            }
            if (var3 > this.field1383) {
                this.field1383 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1377) {
                this.field1377 = var5;
            }
        }
        this.field1377 = (int) (Math.sqrt((double) this.field1377) + 0.99D);
        this.field1406 = (int) (Math.sqrt((double) (this.field1544 * this.field1544 + this.field1377 * this.field1377)) + 0.99D);
        this.field1385 = this.field1406 + (int) (Math.sqrt((double) (this.field1383 * this.field1383 + this.field1377 * this.field1377)) + 0.99D);
    }

    @ObfuscatedName("cw.j()V")
    public void method1461() {
        if (this.field1397 == 2) {
            return;
        }
        this.field1397 = 2;
        this.field1377 = 0;
        for (int var1 = 0; var1 < this.field1359; var1++) {
            int var2 = this.field1360[var1];
            int var3 = this.field1376[var1];
            int var4 = this.field1362[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1377) {
                this.field1377 = var5;
            }
        }
        this.field1377 = (int) (Math.sqrt((double) this.field1377) + 0.99D);
        this.field1406 = this.field1377;
        this.field1385 = this.field1377 + this.field1377;
    }

    @ObfuscatedName("cw.s()I")
    public int method1462() {
        this.method1504();
        return this.field1377;
    }

    @ObfuscatedName("cw.o(Lcv;I)V")
    public void method1468(class93 arg0, int arg1) {
        if (this.field1379 == null || arg1 == -1) {
            return;
        }
        class81 var3 = arg0.field1571[arg1];
        class87 var4 = var3.field1320;
        Statics.field1369 = 0;
        Statics.field1361 = 0;
        Statics.field1409 = 0;
        for (int var5 = 0; var5 < var3.field1321; var5++) {
            int var6 = var3.field1317[var5];
            this.method1465(var4.field1470[var6], var4.field1467[var6], var3.field1316[var5], var3.field1324[var5], var3.field1325[var5]);
        }
        this.field1397 = 0;
    }

    @ObfuscatedName("cw.a(Lcv;ILcv;I[I)V")
    public void method1464(class93 arg0, int arg1, class93 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method1468(arg0, arg1);
            return;
        }
        class81 var6 = arg0.field1571[arg1];
        class81 var7 = arg2.field1571[arg3];
        class87 var8 = var6.field1320;
        Statics.field1369 = 0;
        Statics.field1361 = 0;
        Statics.field1409 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1321; var11++) {
            int var12 = var6.field1317[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1470[var12] == 0) {
                this.method1465(var8.field1470[var12], var8.field1467[var12], var6.field1316[var11], var6.field1324[var11], var6.field1325[var11]);
            }
        }
        Statics.field1369 = 0;
        Statics.field1361 = 0;
        Statics.field1409 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1321; var15++) {
            int var16 = var7.field1317[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1470[var16] == 0) {
                this.method1465(var8.field1470[var16], var8.field1467[var16], var7.field1316[var15], var7.field1324[var15], var7.field1325[var15]);
            }
        }
        this.field1397 = 0;
    }

    @ObfuscatedName("cw.c(I[IIII)V")
    public void method1465(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1369 = 0;
            Statics.field1361 = 0;
            Statics.field1409 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1379.length) {
                    int[] var10 = this.field1379[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1369 += this.field1360[var12];
                        Statics.field1361 += this.field1376[var12];
                        Statics.field1409 += this.field1362[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1369 = Statics.field1369 / var7 + arg2;
                Statics.field1361 = Statics.field1361 / var7 + arg3;
                Statics.field1409 = Statics.field1409 / var7 + arg4;
            } else {
                Statics.field1369 = arg2;
                Statics.field1361 = arg3;
                Statics.field1409 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1379.length) {
                    int[] var15 = this.field1379[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1360[var17] += arg2;
                        this.field1376[var17] += arg3;
                        this.field1362[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1379.length) {
                    int[] var20 = this.field1379[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1360[var22] -= Statics.field1369;
                        this.field1376[var22] -= Statics.field1361;
                        this.field1362[var22] -= Statics.field1409;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1415[var25];
                            int var27 = field1420[var25];
                            int var28 = this.field1376[var22] * var26 + this.field1360[var22] * var27 >> 16;
                            this.field1376[var22] = this.field1376[var22] * var27 - this.field1360[var22] * var26 >> 16;
                            this.field1360[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1415[var23];
                            int var30 = field1420[var23];
                            int var31 = this.field1376[var22] * var30 - this.field1362[var22] * var29 >> 16;
                            this.field1362[var22] = this.field1376[var22] * var29 + this.field1362[var22] * var30 >> 16;
                            this.field1376[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1415[var24];
                            int var33 = field1420[var24];
                            int var34 = this.field1362[var22] * var32 + this.field1360[var22] * var33 >> 16;
                            this.field1362[var22] = this.field1362[var22] * var33 - this.field1360[var22] * var32 >> 16;
                            this.field1360[var22] = var34;
                        }
                        this.field1360[var22] += Statics.field1369;
                        this.field1376[var22] += Statics.field1361;
                        this.field1362[var22] += Statics.field1409;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1379.length) {
                    int[] var37 = this.field1379[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1360[var39] -= Statics.field1369;
                        this.field1376[var39] -= Statics.field1361;
                        this.field1362[var39] -= Statics.field1409;
                        this.field1360[var39] = this.field1360[var39] * arg2 / 128;
                        this.field1376[var39] = this.field1376[var39] * arg3 / 128;
                        this.field1362[var39] = this.field1362[var39] * arg4 / 128;
                        this.field1360[var39] += Statics.field1369;
                        this.field1376[var39] += Statics.field1361;
                        this.field1362[var39] += Statics.field1409;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1394 != null && this.field1371 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1394.length) {
                    int[] var42 = this.field1394[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1371[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1371[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("cw.u()V")
    public void method1470() {
        for (int var1 = 0; var1 < this.field1359; var1++) {
            int var2 = this.field1360[var1];
            this.field1360[var1] = this.field1362[var1];
            this.field1362[var1] = -var2;
        }
        this.field1397 = 0;
    }

    @ObfuscatedName("cw.i()V")
    public void method1467() {
        for (int var1 = 0; var1 < this.field1359; var1++) {
            this.field1360[var1] = -this.field1360[var1];
            this.field1362[var1] = -this.field1362[var1];
        }
        this.field1397 = 0;
    }

    @ObfuscatedName("cw.z()V")
    public void method1490() {
        for (int var1 = 0; var1 < this.field1359; var1++) {
            int var2 = this.field1362[var1];
            this.field1362[var1] = this.field1360[var1];
            this.field1360[var1] = -var2;
        }
        this.field1397 = 0;
    }

    @ObfuscatedName("cw.n(I)V")
    public void method1469(int arg0) {
        int var2 = field1415[arg0];
        int var3 = field1420[arg0];
        for (int var4 = 0; var4 < this.field1359; var4++) {
            int var5 = this.field1376[var4] * var3 - this.field1362[var4] * var2 >> 16;
            this.field1362[var4] = this.field1376[var4] * var2 + this.field1362[var4] * var3 >> 16;
            this.field1376[var4] = var5;
        }
        this.field1397 = 0;
    }

    @ObfuscatedName("cw.l(III)V")
    public void method1492(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1359; var4++) {
            this.field1360[var4] += arg0;
            this.field1376[var4] += arg1;
            this.field1362[var4] += arg2;
        }
        this.field1397 = 0;
    }

    @ObfuscatedName("cw.t(III)V")
    public void method1503(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1359; var4++) {
            this.field1360[var4] = this.field1360[var4] * arg0 / 128;
            this.field1376[var4] = this.field1376[var4] * arg1 / 128;
            this.field1362[var4] = this.field1362[var4] * arg2 / 128;
        }
        this.field1397 = 0;
    }

    @ObfuscatedName("cw.b(IIIIIII)V")
    public final void method1485(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1386[0] = -1;
        if (this.field1397 != 2 && this.field1397 != 1) {
            this.method1461();
        }
        int var8 = Statics.field1441;
        int var9 = Statics.field1442;
        int var10 = field1415[arg0];
        int var11 = field1420[arg0];
        int var12 = field1415[arg1];
        int var13 = field1420[arg1];
        int var14 = field1415[arg2];
        int var15 = field1420[arg2];
        int var16 = field1415[arg3];
        int var17 = field1420[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1359; var19++) {
            int var20 = this.field1360[var19];
            int var21 = this.field1376[var19];
            int var22 = this.field1362[var19];
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
            field1387[var19] = var30 - var18;
            field1390[var19] = class85.field1438 * var26 / var30 + var8;
            field1391[var19] = class85.field1438 * var29 / var30 + var9;
            if (this.field1375 > 0) {
                field1393[var19] = var26;
                field1389[var19] = var29;
                field1395[var19] = var30;
            }
        }
        try {
            this.method1479(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("cw.e(IIIIIIII)V")
    public final void method1474(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1386[0] = -1;
        if (this.field1397 != 2 && this.field1397 != 1) {
            this.method1461();
        }
        int var9 = Statics.field1441;
        int var10 = Statics.field1442;
        int var11 = field1415[arg0];
        int var12 = field1420[arg0];
        int var13 = field1415[arg1];
        int var14 = field1420[arg1];
        int var15 = field1415[arg2];
        int var16 = field1420[arg2];
        int var17 = field1415[arg3];
        int var18 = field1420[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1359; var20++) {
            int var21 = this.field1360[var20];
            int var22 = this.field1376[var20];
            int var23 = this.field1362[var20];
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
            field1387[var20] = var31 - var19;
            field1390[var20] = class85.field1438 * var27 / arg7 + var9;
            field1391[var20] = class85.field1438 * var30 / arg7 + var10;
            if (this.field1375 > 0) {
                field1393[var20] = var27;
                field1389[var20] = var30;
                field1395[var20] = var31;
            }
        }
        try {
            this.method1479(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("cw.cs(IIIIIIIII)V")
    public void method1473(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1386[0] = -1;
        if (this.field1397 != 1) {
            this.method1504();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1377 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1377) * class85.field1438;
        if (var15 / var13 >= Statics.field1444) {
            return;
        }
        int var16 = (this.field1377 + var14) * class85.field1438;
        if (var16 / var13 <= Statics.field1437) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1377 * arg1 >> 16;
        int var19 = (var17 + var18) * class85.field1438;
        if (var19 / var13 <= Statics.field1433) {
            return;
        }
        int var20 = (this.field1544 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class85.field1438;
        if (var21 / var13 >= Statics.field1446) {
            return;
        }
        int var22 = (this.field1544 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1375 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1410) {
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
            int var32 = field1411 - Statics.field1441;
            int var33 = field1364 - Statics.field1442;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1381) {
                    field1392[field1413++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1441;
        int var35 = Statics.field1442;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1415[arg0];
            var37 = field1420[arg0];
        }
        for (int var38 = 0; var38 < this.field1359; var38++) {
            int var39 = this.field1360[var38];
            int var40 = this.field1376[var38];
            int var41 = this.field1362[var38];
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
            field1387[var38] = var50 - var11;
            if (var50 >= 50) {
                field1390[var38] = class85.field1438 * var46 / var50 + var34;
                field1391[var38] = class85.field1438 * var49 / var50 + var35;
            } else {
                field1390[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1393[var38] = var46;
                field1389[var38] = var49;
                field1395[var38] = var50;
            }
        }
        try {
            this.method1479(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("cw.ai(ZZI)V")
    public final void method1479(boolean arg0, boolean arg1, int arg2) {
        if (this.field1385 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1385; var4++) {
            field1386[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1367; var5++) {
            if (this.field1370[var5] != -2) {
                int var6 = this.field1363[var5];
                int var7 = this.field1412[var5];
                int var8 = this.field1366[var5];
                int var9 = field1390[var6];
                int var10 = field1390[var7];
                int var11 = field1390[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1393[var6];
                    int var13 = field1393[var7];
                    int var14 = field1393[var8];
                    int var15 = field1389[var6];
                    int var16 = field1389[var7];
                    int var17 = field1389[var8];
                    int var18 = field1395[var6];
                    int var19 = field1395[var7];
                    int var20 = field1395[var8];
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
                        field1408[var5] = true;
                        int var30 = (field1387[var6] + field1387[var7] + field1387[var8]) / 3 + this.field1406;
                        field1398[var30][field1386[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method1477(field1411, field1364, field1391[var6], field1391[var7], field1391[var8], var9, var10, var11)) {
                        field1392[field1413++] = arg2;
                        arg1 = false;
                    }
                    if ((field1391[var8] - field1391[var7]) * (var9 - var10) - (field1391[var6] - field1391[var7]) * (var11 - var10) > 0) {
                        field1408[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1445 && var10 <= Statics.field1445 && var11 <= Statics.field1445) {
                            field1401[var5] = false;
                        } else {
                            field1401[var5] = true;
                        }
                        int var31 = (field1387[var6] + field1387[var7] + field1387[var8]) / 3 + this.field1406;
                        field1398[var31][field1386[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1416 == null) {
            for (int var32 = this.field1385 - 1; var32 >= 0; var32--) {
                int var33 = field1386[var32];
                if (var33 > 0) {
                    int[] var34 = field1398[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method1498(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1399[var36] = 0;
            field1384[var36] = 0;
        }
        for (int var37 = this.field1385 - 1; var37 >= 0; var37--) {
            int var38 = field1386[var37];
            if (var38 > 0) {
                int[] var39 = field1398[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1416[var41];
                    int var43 = field1399[var42]++;
                    field1400[var42][var43] = var41;
                    if (var42 < 10) {
                        field1384[var42] += var37;
                    } else if (var42 == 10) {
                        field1414[var43] = var37;
                    } else {
                        field1402[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1399[1] > 0 || field1399[2] > 0) {
            var44 = (field1384[1] + field1384[2]) / (field1399[1] + field1399[2]);
        }
        int var45 = 0;
        if (field1399[3] > 0 || field1399[4] > 0) {
            var45 = (field1384[3] + field1384[4]) / (field1399[3] + field1399[4]);
        }
        int var46 = 0;
        if (field1399[6] > 0 || field1399[8] > 0) {
            var46 = (field1384[6] + field1384[8]) / (field1399[6] + field1399[8]);
        }
        int var47 = 0;
        int var48 = field1399[10];
        int[] var49 = field1400[10];
        int[] var50 = field1414;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1399[11];
            var49 = field1400[11];
            var50 = field1402;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method1498(var49[var47++]);
                if (var47 == var48 && field1400[11] != var49) {
                    var47 = 0;
                    var48 = field1399[11];
                    var49 = field1400[11];
                    var50 = field1402;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method1498(var49[var47++]);
                if (var47 == var48 && field1400[11] != var49) {
                    var47 = 0;
                    var48 = field1399[11];
                    var49 = field1400[11];
                    var50 = field1402;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method1498(var49[var47++]);
                if (var47 == var48 && field1400[11] != var49) {
                    var47 = 0;
                    var48 = field1399[11];
                    var49 = field1400[11];
                    var50 = field1402;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1399[var52];
            int[] var54 = field1400[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method1498(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method1498(var49[var47++]);
            if (var47 == var48 && field1400[11] != var49) {
                var47 = 0;
                var49 = field1400[11];
                var48 = field1399[11];
                var50 = field1402;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("cw.am(I)V")
    public final void method1498(int arg0) {
        if (field1408[arg0]) {
            this.method1463(arg0);
            return;
        }
        int var2 = this.field1363[arg0];
        int var3 = this.field1412[arg0];
        int var4 = this.field1366[arg0];
        class85.field1443 = field1401[arg0];
        if (this.field1371 == null) {
            class85.field1429 = 0;
        } else {
            class85.field1429 = this.field1371[arg0] & 0xFF;
        }
        if (this.field1373 != null && this.field1373[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1372 == null || this.field1372[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1372[arg0] & 0xFF;
                var6 = this.field1380[var5];
                var7 = this.field1407[var5];
                var8 = this.field1378[var5];
            }
            if (this.field1370[arg0] == -1) {
                class85.method1557(field1391[var2], field1391[var3], field1391[var4], field1390[var2], field1390[var3], field1390[var4], this.field1355[arg0], this.field1355[arg0], this.field1355[arg0], field1393[var6], field1393[var7], field1393[var8], field1389[var6], field1389[var7], field1389[var8], field1395[var6], field1395[var7], field1395[var8], this.field1373[arg0]);
            } else {
                class85.method1557(field1391[var2], field1391[var3], field1391[var4], field1390[var2], field1390[var3], field1390[var4], this.field1355[arg0], this.field1368[arg0], this.field1370[arg0], field1393[var6], field1393[var7], field1393[var8], field1389[var6], field1389[var7], field1389[var8], field1395[var6], field1395[var7], field1395[var8], this.field1373[arg0]);
            }
        } else if (this.field1370[arg0] == -1) {
            class85.method1542(field1391[var2], field1391[var3], field1391[var4], field1390[var2], field1390[var3], field1390[var4], field1417[this.field1355[arg0]]);
        } else {
            class85.method1540(field1391[var2], field1391[var3], field1391[var4], field1390[var2], field1390[var3], field1390[var4], this.field1355[arg0], this.field1368[arg0], this.field1370[arg0]);
        }
    }

    @ObfuscatedName("cw.ad(I)V")
    public final void method1463(int arg0) {
        int var2 = Statics.field1441;
        int var3 = Statics.field1442;
        int var4 = 0;
        int var5 = this.field1363[arg0];
        int var6 = this.field1412[arg0];
        int var7 = this.field1366[arg0];
        int var8 = field1395[var5];
        int var9 = field1395[var6];
        int var10 = field1395[var7];
        if (this.field1371 == null) {
            class85.field1429 = 0;
        } else {
            class85.field1429 = this.field1371[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1404[var4] = field1390[var5];
            field1405[var4] = field1391[var5];
            field1388[var4++] = this.field1355[arg0];
        } else {
            int var11 = field1393[var5];
            int var12 = field1389[var5];
            int var13 = this.field1355[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1418[var10 - var8];
                field1404[var4] = (((field1393[var7] - var11) * var14 >> 16) + var11) * class85.field1438 / 50 + var2;
                field1405[var4] = (((field1389[var7] - var12) * var14 >> 16) + var12) * class85.field1438 / 50 + var3;
                field1388[var4++] = ((this.field1370[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1418[var9 - var8];
                field1404[var4] = (((field1393[var6] - var11) * var15 >> 16) + var11) * class85.field1438 / 50 + var2;
                field1405[var4] = (((field1389[var6] - var12) * var15 >> 16) + var12) * class85.field1438 / 50 + var3;
                field1388[var4++] = ((this.field1368[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1404[var4] = field1390[var6];
            field1405[var4] = field1391[var6];
            field1388[var4++] = this.field1368[arg0];
        } else {
            int var16 = field1393[var6];
            int var17 = field1389[var6];
            int var18 = this.field1368[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1418[var8 - var9];
                field1404[var4] = (((field1393[var5] - var16) * var19 >> 16) + var16) * class85.field1438 / 50 + var2;
                field1405[var4] = (((field1389[var5] - var17) * var19 >> 16) + var17) * class85.field1438 / 50 + var3;
                field1388[var4++] = ((this.field1355[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1418[var10 - var9];
                field1404[var4] = (((field1393[var7] - var16) * var20 >> 16) + var16) * class85.field1438 / 50 + var2;
                field1405[var4] = (((field1389[var7] - var17) * var20 >> 16) + var17) * class85.field1438 / 50 + var3;
                field1388[var4++] = ((this.field1370[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1404[var4] = field1390[var7];
            field1405[var4] = field1391[var7];
            field1388[var4++] = this.field1370[arg0];
        } else {
            int var21 = field1393[var7];
            int var22 = field1389[var7];
            int var23 = this.field1370[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1418[var9 - var10];
                field1404[var4] = (((field1393[var6] - var21) * var24 >> 16) + var21) * class85.field1438 / 50 + var2;
                field1405[var4] = (((field1389[var6] - var22) * var24 >> 16) + var22) * class85.field1438 / 50 + var3;
                field1388[var4++] = ((this.field1368[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1418[var8 - var10];
                field1404[var4] = (((field1393[var5] - var21) * var25 >> 16) + var21) * class85.field1438 / 50 + var2;
                field1405[var4] = (((field1389[var5] - var22) * var25 >> 16) + var22) * class85.field1438 / 50 + var3;
                field1388[var4++] = ((this.field1355[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1404[0];
        int var27 = field1404[1];
        int var28 = field1404[2];
        int var29 = field1405[0];
        int var30 = field1405[1];
        int var31 = field1405[2];
        class85.field1443 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1445 || var27 > Statics.field1445 || var28 > Statics.field1445) {
                class85.field1443 = true;
            }
            if (this.field1373 != null && this.field1373[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1372 == null || this.field1372[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1372[arg0] & 0xFF;
                    var33 = this.field1380[var32];
                    var34 = this.field1407[var32];
                    var35 = this.field1378[var32];
                }
                if (this.field1370[arg0] == -1) {
                    class85.method1557(var29, var30, var31, var26, var27, var28, this.field1355[arg0], this.field1355[arg0], this.field1355[arg0], field1393[var33], field1393[var34], field1393[var35], field1389[var33], field1389[var34], field1389[var35], field1395[var33], field1395[var34], field1395[var35], this.field1373[arg0]);
                } else {
                    class85.method1557(var29, var30, var31, var26, var27, var28, field1388[0], field1388[1], field1388[2], field1393[var33], field1393[var34], field1393[var35], field1389[var33], field1389[var34], field1389[var35], field1395[var33], field1395[var34], field1395[var35], this.field1373[arg0]);
                }
            } else if (this.field1370[arg0] == -1) {
                class85.method1542(var29, var30, var31, var26, var27, var28, field1417[this.field1355[arg0]]);
            } else {
                class85.method1540(var29, var30, var31, var26, var27, var28, field1388[0], field1388[1], field1388[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1445 || var27 > Statics.field1445 || var28 > Statics.field1445 || field1404[3] < 0 || field1404[3] > Statics.field1445) {
            class85.field1443 = true;
        }
        if (this.field1373 != null && this.field1373[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1372 == null || this.field1372[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1372[arg0] & 0xFF;
                var37 = this.field1380[var36];
                var38 = this.field1407[var36];
                var39 = this.field1378[var36];
            }
            short var40 = this.field1373[arg0];
            if (this.field1370[arg0] == -1) {
                class85.method1557(var29, var30, var31, var26, var27, var28, this.field1355[arg0], this.field1355[arg0], this.field1355[arg0], field1393[var37], field1393[var38], field1393[var39], field1389[var37], field1389[var38], field1389[var39], field1395[var37], field1395[var38], field1395[var39], var40);
                class85.method1557(var29, var31, field1405[3], var26, var28, field1404[3], this.field1355[arg0], this.field1355[arg0], this.field1355[arg0], field1393[var37], field1393[var38], field1393[var39], field1389[var37], field1389[var38], field1389[var39], field1395[var37], field1395[var38], field1395[var39], var40);
            } else {
                class85.method1557(var29, var30, var31, var26, var27, var28, field1388[0], field1388[1], field1388[2], field1393[var37], field1393[var38], field1393[var39], field1389[var37], field1389[var38], field1389[var39], field1395[var37], field1395[var38], field1395[var39], var40);
                class85.method1557(var29, var31, field1405[3], var26, var28, field1404[3], field1388[0], field1388[2], field1388[3], field1393[var37], field1393[var38], field1393[var39], field1389[var37], field1389[var38], field1389[var39], field1395[var37], field1395[var38], field1395[var39], var40);
            }
        } else if (this.field1370[arg0] == -1) {
            int var41 = field1417[this.field1355[arg0]];
            class85.method1542(var29, var30, var31, var26, var27, var28, var41);
            class85.method1542(var29, var31, field1405[3], var26, var28, field1404[3], var41);
        } else {
            class85.method1540(var29, var30, var31, var26, var27, var28, field1388[0], field1388[1], field1388[2]);
            class85.method1540(var29, var31, field1405[3], var26, var28, field1404[3], field1388[0], field1388[2], field1388[3]);
        }
    }

    @ObfuscatedName("cw.ah(IIIIIIII)Z")
    public final boolean method1477(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
