package deob;

@ObfuscatedName("cs")
public class class83 extends class90 {

    @ObfuscatedName("cs.u")
    public static class83 field1388 = new class83();

    @ObfuscatedName("cs.x")
    public static byte[] field1384 = new byte[1];

    @ObfuscatedName("cs.i")
    public static class83 field1358 = new class83();

    @ObfuscatedName("cs.a")
    public static byte[] field1359 = new byte[1];

    @ObfuscatedName("cs.f")
    public int field1420 = 0;

    @ObfuscatedName("cs.c")
    public int[] field1361;

    @ObfuscatedName("cs.d")
    public int[] field1362;

    @ObfuscatedName("cs.l")
    public int[] field1400;

    @ObfuscatedName("cs.g")
    public int field1364 = 0;

    @ObfuscatedName("cs.z")
    public int[] field1365;

    @ObfuscatedName("cs.t")
    public int[] field1383;

    @ObfuscatedName("cs.m")
    public int[] field1366;

    @ObfuscatedName("cs.q")
    public int[] field1368;

    @ObfuscatedName("cs.e")
    public int[] field1369;

    @ObfuscatedName("cs.v")
    public int[] field1370;

    @ObfuscatedName("cs.j")
    public byte[] field1385;

    @ObfuscatedName("cs.p")
    public byte[] field1372;

    @ObfuscatedName("cs.k")
    public byte[] field1373;

    @ObfuscatedName("cs.r")
    public short[] field1402;

    @ObfuscatedName("cs.y")
    public byte field1375 = 0;

    @ObfuscatedName("cs.h")
    public int field1376 = 0;

    @ObfuscatedName("cs.s")
    public int[] field1377;

    @ObfuscatedName("cs.w")
    public int[] field1357;

    @ObfuscatedName("cs.n")
    public int[] field1379;

    @ObfuscatedName("cs.o")
    public int[][] field1391;

    @ObfuscatedName("cs.b")
    public int[][] field1381;

    @ObfuscatedName("cs.aj")
    public boolean field1382 = false;

    @ObfuscatedName("cs.ag")
    public int field1395;

    @ObfuscatedName("cs.al")
    public int field1390;

    @ObfuscatedName("cs.an")
    public int field1378;

    @ObfuscatedName("cs.af")
    public int field1386;

    @ObfuscatedName("cs.aa")
    public int field1387;

    @ObfuscatedName("cs.ai")
    public static boolean[] field1389 = new boolean[4700];

    @ObfuscatedName("cs.ah")
    public static boolean[] field1374 = new boolean[4700];

    @ObfuscatedName("cs.av")
    public static int[] field1360 = new int[4700];

    @ObfuscatedName("cs.at")
    public static int[] field1392 = new int[4700];

    @ObfuscatedName("cs.az")
    public static int[] field1403 = new int[4700];

    @ObfuscatedName("cs.ad")
    public static int[] field1394 = new int[4700];

    @ObfuscatedName("cs.aw")
    public static int[] field1419 = new int[4700];

    @ObfuscatedName("cs.ak")
    public static int[] field1396 = new int[4700];

    @ObfuscatedName("cs.ac")
    public static int[] field1398 = new int[1600];

    @ObfuscatedName("cs.am")
    public static int[][] field1399 = new int[1600][512];

    @ObfuscatedName("cs.ay")
    public static int[] field1371 = new int[12];

    @ObfuscatedName("cs.ar")
    public static int[][] field1401 = new int[12][2000];

    @ObfuscatedName("cs.ab")
    public static int[] field1405 = new int[2000];

    @ObfuscatedName("cs.as")
    public static int[] field1356 = new int[2000];

    @ObfuscatedName("cs.ap")
    public static int[] field1404 = new int[12];

    @ObfuscatedName("cs.ae")
    public static int[] field1363 = new int[10];

    @ObfuscatedName("cs.ao")
    public static int[] field1406 = new int[10];

    @ObfuscatedName("cs.au")
    public static int[] field1407 = new int[10];

    @ObfuscatedName("cs.be")
    public static boolean field1411 = false;

    @ObfuscatedName("cs.bt")
    public static int field1412 = 0;

    @ObfuscatedName("cs.bm")
    public static int field1413 = 0;

    @ObfuscatedName("cs.bb")
    public static int field1414 = 0;

    @ObfuscatedName("cs.bu")
    public static int[] field1415 = new int[1000];

    @ObfuscatedName("cs.bn")
    public static int[] field1393 = class85.field1439;

    @ObfuscatedName("cs.by")
    public static int[] field1417 = class85.field1429;

    @ObfuscatedName("cs.bl")
    public static int[] field1418 = class85.field1448;

    @ObfuscatedName("cs.bi")
    public static int[] field1410 = class85.field1451;

    public class83() {
    }

    public class83(class83[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1420 = 0;
        this.field1364 = 0;
        this.field1376 = 0;
        this.field1375 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class83 var8 = arg0[var7];
            if (var8 != null) {
                this.field1420 += var8.field1420;
                this.field1364 += var8.field1364;
                this.field1376 += var8.field1376;
                if (var8.field1385 == null) {
                    if (this.field1375 == -1) {
                        this.field1375 = var8.field1375;
                    }
                    if (this.field1375 != var8.field1375) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1372 != null;
                var5 |= var8.field1402 != null;
                var6 |= var8.field1373 != null;
            }
        }
        this.field1361 = new int[this.field1420];
        this.field1362 = new int[this.field1420];
        this.field1400 = new int[this.field1420];
        this.field1365 = new int[this.field1364];
        this.field1383 = new int[this.field1364];
        this.field1366 = new int[this.field1364];
        this.field1368 = new int[this.field1364];
        this.field1369 = new int[this.field1364];
        this.field1370 = new int[this.field1364];
        if (var3) {
            this.field1385 = new byte[this.field1364];
        }
        if (var4) {
            this.field1372 = new byte[this.field1364];
        }
        if (var5) {
            this.field1402 = new short[this.field1364];
        }
        if (var6) {
            this.field1373 = new byte[this.field1364];
        }
        if (this.field1376 > 0) {
            this.field1377 = new int[this.field1376];
            this.field1357 = new int[this.field1376];
            this.field1379 = new int[this.field1376];
        }
        this.field1420 = 0;
        this.field1364 = 0;
        this.field1376 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class83 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1364; var11++) {
                    this.field1365[this.field1364] = var10.field1365[var11] + this.field1420;
                    this.field1383[this.field1364] = var10.field1383[var11] + this.field1420;
                    this.field1366[this.field1364] = var10.field1366[var11] + this.field1420;
                    this.field1368[this.field1364] = var10.field1368[var11];
                    this.field1369[this.field1364] = var10.field1369[var11];
                    this.field1370[this.field1364] = var10.field1370[var11];
                    if (var3) {
                        if (var10.field1385 == null) {
                            this.field1385[this.field1364] = var10.field1375;
                        } else {
                            this.field1385[this.field1364] = var10.field1385[var11];
                        }
                    }
                    if (var4 && var10.field1372 != null) {
                        this.field1372[this.field1364] = var10.field1372[var11];
                    }
                    if (var5) {
                        if (var10.field1402 == null) {
                            this.field1402[this.field1364] = -1;
                        } else {
                            this.field1402[this.field1364] = var10.field1402[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1373 == null || var10.field1373[var11] == -1) {
                            this.field1373[this.field1364] = -1;
                        } else {
                            this.field1373[this.field1364] = (byte) (var10.field1373[var11] + this.field1376);
                        }
                    }
                    this.field1364++;
                }
                for (int var12 = 0; var12 < var10.field1376; var12++) {
                    this.field1377[this.field1376] = var10.field1377[var12] + this.field1420;
                    this.field1357[this.field1376] = var10.field1357[var12] + this.field1420;
                    this.field1379[this.field1376] = var10.field1379[var12] + this.field1420;
                    this.field1376++;
                }
                for (int var13 = 0; var13 < var10.field1420; var13++) {
                    this.field1361[this.field1420] = var10.field1361[var13];
                    this.field1362[this.field1420] = var10.field1362[var13];
                    this.field1400[this.field1420] = var10.field1400[var13];
                    this.field1420++;
                }
            }
        }
    }

    @ObfuscatedName("cs.u([[IIIIZI)Lcs;")
    public class83 method1445(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1462();
        int var7 = arg1 - this.field1378;
        int var8 = this.field1378 + arg1;
        int var9 = arg3 - this.field1378;
        int var10 = this.field1378 + arg3;
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
            var15.field1420 = this.field1420;
            var15.field1364 = this.field1364;
            var15.field1376 = this.field1376;
            var15.field1361 = this.field1361;
            var15.field1400 = this.field1400;
            var15.field1365 = this.field1365;
            var15.field1383 = this.field1383;
            var15.field1366 = this.field1366;
            var15.field1368 = this.field1368;
            var15.field1369 = this.field1369;
            var15.field1370 = this.field1370;
            var15.field1385 = this.field1385;
            var15.field1372 = this.field1372;
            var15.field1373 = this.field1373;
            var15.field1402 = this.field1402;
            var15.field1375 = this.field1375;
            var15.field1377 = this.field1377;
            var15.field1357 = this.field1357;
            var15.field1379 = this.field1379;
            var15.field1391 = this.field1391;
            var15.field1381 = this.field1381;
            var15.field1382 = this.field1382;
            var15.field1362 = new int[var15.field1420];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1420; var16++) {
                int var17 = this.field1361[var16] + arg1;
                int var18 = this.field1400[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1362[var16] = this.field1362[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1420; var26++) {
                int var27 = (-this.field1362[var26] << 16) / this.field1541;
                if (var27 < arg5) {
                    int var28 = this.field1361[var26] + arg1;
                    int var29 = this.field1400[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1362[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1362[var26];
                }
            }
        }
        var15.field1395 = 0;
        return var15;
    }

    @ObfuscatedName("cs.x(Z)Lcs;")
    public class83 method1487(boolean arg0) {
        if (!arg0 && field1384.length < this.field1364) {
            field1384 = new byte[this.field1364 + 100];
        }
        return this.method1450(arg0, field1388, field1384);
    }

    @ObfuscatedName("cs.a(Z)Lcs;")
    public class83 method1447(boolean arg0) {
        if (!arg0 && field1359.length < this.field1364) {
            field1359 = new byte[this.field1364 + 100];
        }
        return this.method1450(arg0, field1358, field1359);
    }

    @ObfuscatedName("cs.c(ZLcs;[B)Lcs;")
    public class83 method1450(boolean arg0, class83 arg1, byte[] arg2) {
        arg1.field1420 = this.field1420;
        arg1.field1364 = this.field1364;
        arg1.field1376 = this.field1376;
        if (arg1.field1361 == null || arg1.field1361.length < this.field1420) {
            arg1.field1361 = new int[this.field1420 + 100];
            arg1.field1362 = new int[this.field1420 + 100];
            arg1.field1400 = new int[this.field1420 + 100];
        }
        for (int var4 = 0; var4 < this.field1420; var4++) {
            arg1.field1361[var4] = this.field1361[var4];
            arg1.field1362[var4] = this.field1362[var4];
            arg1.field1400[var4] = this.field1400[var4];
        }
        if (arg0) {
            arg1.field1372 = this.field1372;
        } else {
            arg1.field1372 = arg2;
            if (this.field1372 == null) {
                for (int var5 = 0; var5 < this.field1364; var5++) {
                    arg1.field1372[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1364; var6++) {
                    arg1.field1372[var6] = this.field1372[var6];
                }
            }
        }
        arg1.field1365 = this.field1365;
        arg1.field1383 = this.field1383;
        arg1.field1366 = this.field1366;
        arg1.field1368 = this.field1368;
        arg1.field1369 = this.field1369;
        arg1.field1370 = this.field1370;
        arg1.field1385 = this.field1385;
        arg1.field1373 = this.field1373;
        arg1.field1402 = this.field1402;
        arg1.field1375 = this.field1375;
        arg1.field1377 = this.field1377;
        arg1.field1357 = this.field1357;
        arg1.field1379 = this.field1379;
        arg1.field1391 = this.field1391;
        arg1.field1381 = this.field1381;
        arg1.field1382 = this.field1382;
        arg1.field1395 = 0;
        return arg1;
    }

    @ObfuscatedName("cs.g()V")
    public void method1462() {
        if (this.field1395 == 1) {
            return;
        }
        this.field1395 = 1;
        this.field1541 = 0;
        this.field1390 = 0;
        this.field1378 = 0;
        for (int var1 = 0; var1 < this.field1420; var1++) {
            int var2 = this.field1361[var1];
            int var3 = this.field1362[var1];
            int var4 = this.field1400[var1];
            if (-var3 > this.field1541) {
                this.field1541 = -var3;
            }
            if (var3 > this.field1390) {
                this.field1390 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1378) {
                this.field1378 = var5;
            }
        }
        this.field1378 = (int) (Math.sqrt((double) this.field1378) + 0.99D);
        this.field1387 = (int) (Math.sqrt((double) (this.field1541 * this.field1541 + this.field1378 * this.field1378)) + 0.99D);
        this.field1386 = this.field1387 + (int) (Math.sqrt((double) (this.field1390 * this.field1390 + this.field1378 * this.field1378)) + 0.99D);
    }

    @ObfuscatedName("cs.z()V")
    public void method1504() {
        if (this.field1395 == 2) {
            return;
        }
        this.field1395 = 2;
        this.field1378 = 0;
        for (int var1 = 0; var1 < this.field1420; var1++) {
            int var2 = this.field1361[var1];
            int var3 = this.field1362[var1];
            int var4 = this.field1400[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1378) {
                this.field1378 = var5;
            }
        }
        this.field1378 = (int) (Math.sqrt((double) this.field1378) + 0.99D);
        this.field1387 = this.field1378;
        this.field1386 = this.field1378 + this.field1378;
    }

    @ObfuscatedName("cs.t()I")
    public int method1451() {
        this.method1462();
        return this.field1378;
    }

    @ObfuscatedName("cs.m(Lce;I)V")
    public void method1452(class93 arg0, int arg1) {
        if (this.field1391 == null || arg1 == -1) {
            return;
        }
        class81 var3 = arg0.field1563[arg1];
        class87 var4 = var3.field1321;
        Statics.field1408 = 0;
        Statics.field1409 = 0;
        Statics.field1416 = 0;
        for (int var5 = 0; var5 < var3.field1322; var5++) {
            int var6 = var3.field1323[var5];
            this.method1454(var4.field1463[var6], var4.field1462[var6], var3.field1324[var5], var3.field1325[var5], var3.field1327[var5]);
        }
        this.field1395 = 0;
    }

    @ObfuscatedName("cs.q(Lce;ILce;I[I)V")
    public void method1453(class93 arg0, int arg1, class93 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method1452(arg0, arg1);
            return;
        }
        class81 var6 = arg0.field1563[arg1];
        class81 var7 = arg2.field1563[arg3];
        class87 var8 = var6.field1321;
        Statics.field1408 = 0;
        Statics.field1409 = 0;
        Statics.field1416 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1322; var11++) {
            int var12 = var6.field1323[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1463[var12] == 0) {
                this.method1454(var8.field1463[var12], var8.field1462[var12], var6.field1324[var11], var6.field1325[var11], var6.field1327[var11]);
            }
        }
        Statics.field1408 = 0;
        Statics.field1409 = 0;
        Statics.field1416 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1322; var15++) {
            int var16 = var7.field1323[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1463[var16] == 0) {
                this.method1454(var8.field1463[var16], var8.field1462[var16], var7.field1324[var15], var7.field1325[var15], var7.field1327[var15]);
            }
        }
        this.field1395 = 0;
    }

    @ObfuscatedName("cs.v(I[IIII)V")
    public void method1454(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1408 = 0;
            Statics.field1409 = 0;
            Statics.field1416 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1391.length) {
                    int[] var10 = this.field1391[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1408 += this.field1361[var12];
                        Statics.field1409 += this.field1362[var12];
                        Statics.field1416 += this.field1400[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1408 = Statics.field1408 / var7 + arg2;
                Statics.field1409 = Statics.field1409 / var7 + arg3;
                Statics.field1416 = Statics.field1416 / var7 + arg4;
            } else {
                Statics.field1408 = arg2;
                Statics.field1409 = arg3;
                Statics.field1416 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1391.length) {
                    int[] var15 = this.field1391[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1361[var17] += arg2;
                        this.field1362[var17] += arg3;
                        this.field1400[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1391.length) {
                    int[] var20 = this.field1391[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1361[var22] -= Statics.field1408;
                        this.field1362[var22] -= Statics.field1409;
                        this.field1400[var22] -= Statics.field1416;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1393[var25];
                            int var27 = field1417[var25];
                            int var28 = this.field1362[var22] * var26 + this.field1361[var22] * var27 >> 16;
                            this.field1362[var22] = this.field1362[var22] * var27 - this.field1361[var22] * var26 >> 16;
                            this.field1361[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1393[var23];
                            int var30 = field1417[var23];
                            int var31 = this.field1362[var22] * var30 - this.field1400[var22] * var29 >> 16;
                            this.field1400[var22] = this.field1400[var22] * var30 + this.field1362[var22] * var29 >> 16;
                            this.field1362[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1393[var24];
                            int var33 = field1417[var24];
                            int var34 = this.field1400[var22] * var32 + this.field1361[var22] * var33 >> 16;
                            this.field1400[var22] = this.field1400[var22] * var33 - this.field1361[var22] * var32 >> 16;
                            this.field1361[var22] = var34;
                        }
                        this.field1361[var22] += Statics.field1408;
                        this.field1362[var22] += Statics.field1409;
                        this.field1400[var22] += Statics.field1416;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1391.length) {
                    int[] var37 = this.field1391[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1361[var39] -= Statics.field1408;
                        this.field1362[var39] -= Statics.field1409;
                        this.field1400[var39] -= Statics.field1416;
                        this.field1361[var39] = this.field1361[var39] * arg2 / 128;
                        this.field1362[var39] = this.field1362[var39] * arg3 / 128;
                        this.field1400[var39] = this.field1400[var39] * arg4 / 128;
                        this.field1361[var39] += Statics.field1408;
                        this.field1362[var39] += Statics.field1409;
                        this.field1400[var39] += Statics.field1416;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1381 != null && this.field1372 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1381.length) {
                    int[] var42 = this.field1381[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1372[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1372[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("cs.j()V")
    public void method1455() {
        for (int var1 = 0; var1 < this.field1420; var1++) {
            int var2 = this.field1361[var1];
            this.field1361[var1] = this.field1400[var1];
            this.field1400[var1] = -var2;
        }
        this.field1395 = 0;
    }

    @ObfuscatedName("cs.p()V")
    public void method1446() {
        for (int var1 = 0; var1 < this.field1420; var1++) {
            this.field1361[var1] = -this.field1361[var1];
            this.field1400[var1] = -this.field1400[var1];
        }
        this.field1395 = 0;
    }

    @ObfuscatedName("cs.k()V")
    public void method1457() {
        for (int var1 = 0; var1 < this.field1420; var1++) {
            int var2 = this.field1400[var1];
            this.field1400[var1] = this.field1361[var1];
            this.field1361[var1] = -var2;
        }
        this.field1395 = 0;
    }

    @ObfuscatedName("cs.r(I)V")
    public void method1458(int arg0) {
        int var2 = field1393[arg0];
        int var3 = field1417[arg0];
        for (int var4 = 0; var4 < this.field1420; var4++) {
            int var5 = this.field1362[var4] * var3 - this.field1400[var4] * var2 >> 16;
            this.field1400[var4] = this.field1400[var4] * var3 + this.field1362[var4] * var2 >> 16;
            this.field1362[var4] = var5;
        }
        this.field1395 = 0;
    }

    @ObfuscatedName("cs.y(III)V")
    public void method1480(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1420; var4++) {
            this.field1361[var4] += arg0;
            this.field1362[var4] += arg1;
            this.field1400[var4] += arg2;
        }
        this.field1395 = 0;
    }

    @ObfuscatedName("cs.h(III)V")
    public void method1444(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1420; var4++) {
            this.field1361[var4] = this.field1361[var4] * arg0 / 128;
            this.field1362[var4] = this.field1362[var4] * arg1 / 128;
            this.field1400[var4] = this.field1400[var4] * arg2 / 128;
        }
        this.field1395 = 0;
    }

    @ObfuscatedName("cs.s(IIIIIII)V")
    public final void method1461(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1398[0] = -1;
        if (this.field1395 != 2 && this.field1395 != 1) {
            this.method1504();
        }
        int var8 = Statics.field1444;
        int var9 = Statics.field1440;
        int var10 = field1393[arg0];
        int var11 = field1417[arg0];
        int var12 = field1393[arg1];
        int var13 = field1417[arg1];
        int var14 = field1393[arg2];
        int var15 = field1417[arg2];
        int var16 = field1393[arg3];
        int var17 = field1417[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1420; var19++) {
            int var20 = this.field1361[var19];
            int var21 = this.field1362[var19];
            int var22 = this.field1400[var19];
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
            field1403[var19] = var30 - var18;
            field1360[var19] = class85.field1438 * var26 / var30 + var8;
            field1392[var19] = class85.field1438 * var29 / var30 + var9;
            if (this.field1376 > 0) {
                field1394[var19] = var26;
                field1419[var19] = var29;
                field1396[var19] = var30;
            }
        }
        try {
            this.method1526(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("cs.w(IIIIIIII)V")
    public final void method1522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1398[0] = -1;
        if (this.field1395 != 2 && this.field1395 != 1) {
            this.method1504();
        }
        int var9 = Statics.field1444;
        int var10 = Statics.field1440;
        int var11 = field1393[arg0];
        int var12 = field1417[arg0];
        int var13 = field1393[arg1];
        int var14 = field1417[arg1];
        int var15 = field1393[arg2];
        int var16 = field1417[arg2];
        int var17 = field1393[arg3];
        int var18 = field1417[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1420; var20++) {
            int var21 = this.field1361[var20];
            int var22 = this.field1362[var20];
            int var23 = this.field1400[var20];
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
            field1403[var20] = var31 - var19;
            field1360[var20] = class85.field1438 * var27 / arg7 + var9;
            field1392[var20] = class85.field1438 * var30 / arg7 + var10;
            if (this.field1376 > 0) {
                field1394[var20] = var27;
                field1419[var20] = var30;
                field1396[var20] = var31;
            }
        }
        try {
            this.method1526(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("cs.cb(IIIIIIIII)V")
    public void method1463(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1398[0] = -1;
        if (this.field1395 != 1) {
            this.method1462();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1378 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1378) * class85.field1438;
        if (var15 / var13 >= Statics.field1453) {
            return;
        }
        int var16 = (this.field1378 + var14) * class85.field1438;
        if (var16 / var13 <= Statics.field1443) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1378 * arg1 >> 16;
        int var19 = (var17 + var18) * class85.field1438;
        if (var19 / var13 <= Statics.field1449) {
            return;
        }
        int var20 = (this.field1541 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class85.field1438;
        if (var21 / var13 >= Statics.field1436) {
            return;
        }
        int var22 = (this.field1541 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1376 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1411) {
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
            int var32 = field1412 - Statics.field1444;
            int var33 = field1413 - Statics.field1440;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1382) {
                    field1415[field1414++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1444;
        int var35 = Statics.field1440;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1393[arg0];
            var37 = field1417[arg0];
        }
        for (int var38 = 0; var38 < this.field1420; var38++) {
            int var39 = this.field1361[var38];
            int var40 = this.field1362[var38];
            int var41 = this.field1400[var38];
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
            field1403[var38] = var50 - var11;
            if (var50 >= 50) {
                field1360[var38] = class85.field1438 * var46 / var50 + var34;
                field1392[var38] = class85.field1438 * var49 / var50 + var35;
            } else {
                field1360[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1394[var38] = var46;
                field1419[var38] = var49;
                field1396[var38] = var50;
            }
        }
        try {
            this.method1526(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("cs.n(ZZI)V")
    public final void method1526(boolean arg0, boolean arg1, int arg2) {
        if (this.field1386 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1386; var4++) {
            field1398[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1364; var5++) {
            if (this.field1370[var5] != -2) {
                int var6 = this.field1365[var5];
                int var7 = this.field1383[var5];
                int var8 = this.field1366[var5];
                int var9 = field1360[var6];
                int var10 = field1360[var7];
                int var11 = field1360[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1394[var6];
                    int var13 = field1394[var7];
                    int var14 = field1394[var8];
                    int var15 = field1419[var6];
                    int var16 = field1419[var7];
                    int var17 = field1419[var8];
                    int var18 = field1396[var6];
                    int var19 = field1396[var7];
                    int var20 = field1396[var8];
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
                        field1374[var5] = true;
                        int var30 = (field1403[var6] + field1403[var7] + field1403[var8]) / 3 + this.field1387;
                        field1399[var30][field1398[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method1519(field1412, field1413, field1392[var6], field1392[var7], field1392[var8], var9, var10, var11)) {
                        field1415[field1414++] = arg2;
                        arg1 = false;
                    }
                    if ((field1392[var8] - field1392[var7]) * (var9 - var10) - (field1392[var6] - field1392[var7]) * (var11 - var10) > 0) {
                        field1374[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1441 && var10 <= Statics.field1441 && var11 <= Statics.field1441) {
                            field1389[var5] = false;
                        } else {
                            field1389[var5] = true;
                        }
                        int var31 = (field1403[var6] + field1403[var7] + field1403[var8]) / 3 + this.field1387;
                        field1399[var31][field1398[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1385 == null) {
            for (int var32 = this.field1386 - 1; var32 >= 0; var32--) {
                int var33 = field1398[var32];
                if (var33 > 0) {
                    int[] var34 = field1399[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method1465(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1371[var36] = 0;
            field1404[var36] = 0;
        }
        for (int var37 = this.field1386 - 1; var37 >= 0; var37--) {
            int var38 = field1398[var37];
            if (var38 > 0) {
                int[] var39 = field1399[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1385[var41];
                    int var43 = field1371[var42]++;
                    field1401[var42][var43] = var41;
                    if (var42 < 10) {
                        field1404[var42] += var37;
                    } else if (var42 == 10) {
                        field1405[var43] = var37;
                    } else {
                        field1356[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1371[1] > 0 || field1371[2] > 0) {
            var44 = (field1404[1] + field1404[2]) / (field1371[1] + field1371[2]);
        }
        int var45 = 0;
        if (field1371[3] > 0 || field1371[4] > 0) {
            var45 = (field1404[3] + field1404[4]) / (field1371[3] + field1371[4]);
        }
        int var46 = 0;
        if (field1371[6] > 0 || field1371[8] > 0) {
            var46 = (field1404[6] + field1404[8]) / (field1371[6] + field1371[8]);
        }
        int var47 = 0;
        int var48 = field1371[10];
        int[] var49 = field1401[10];
        int[] var50 = field1405;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1371[11];
            var49 = field1401[11];
            var50 = field1356;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method1465(var49[var47++]);
                if (var47 == var48 && field1401[11] != var49) {
                    var47 = 0;
                    var48 = field1371[11];
                    var49 = field1401[11];
                    var50 = field1356;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method1465(var49[var47++]);
                if (var47 == var48 && field1401[11] != var49) {
                    var47 = 0;
                    var48 = field1371[11];
                    var49 = field1401[11];
                    var50 = field1356;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method1465(var49[var47++]);
                if (var47 == var48 && field1401[11] != var49) {
                    var47 = 0;
                    var48 = field1371[11];
                    var49 = field1401[11];
                    var50 = field1356;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1371[var52];
            int[] var54 = field1401[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method1465(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method1465(var49[var47++]);
            if (var47 == var48 && field1401[11] != var49) {
                var47 = 0;
                var49 = field1401[11];
                var48 = field1371[11];
                var50 = field1356;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("cs.o(I)V")
    public final void method1465(int arg0) {
        if (field1374[arg0]) {
            this.method1466(arg0);
            return;
        }
        int var2 = this.field1365[arg0];
        int var3 = this.field1383[arg0];
        int var4 = this.field1366[arg0];
        class85.field1434 = field1389[arg0];
        if (this.field1372 == null) {
            class85.field1433 = 0;
        } else {
            class85.field1433 = this.field1372[arg0] & 0xFF;
        }
        if (this.field1402 != null && this.field1402[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1373 == null || this.field1373[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1373[arg0] & 0xFF;
                var6 = this.field1377[var5];
                var7 = this.field1357[var5];
                var8 = this.field1379[var5];
            }
            if (this.field1370[arg0] == -1) {
                class85.method1559(field1392[var2], field1392[var3], field1392[var4], field1360[var2], field1360[var3], field1360[var4], this.field1368[arg0], this.field1368[arg0], this.field1368[arg0], field1394[var6], field1394[var7], field1394[var8], field1419[var6], field1419[var7], field1419[var8], field1396[var6], field1396[var7], field1396[var8], this.field1402[arg0]);
            } else {
                class85.method1559(field1392[var2], field1392[var3], field1392[var4], field1360[var2], field1360[var3], field1360[var4], this.field1368[arg0], this.field1369[arg0], this.field1370[arg0], field1394[var6], field1394[var7], field1394[var8], field1419[var6], field1419[var7], field1419[var8], field1396[var6], field1396[var7], field1396[var8], this.field1402[arg0]);
            }
        } else if (this.field1370[arg0] == -1) {
            class85.method1542(field1392[var2], field1392[var3], field1392[var4], field1360[var2], field1360[var3], field1360[var4], field1418[this.field1368[arg0]]);
        } else {
            class85.method1575(field1392[var2], field1392[var3], field1392[var4], field1360[var2], field1360[var3], field1360[var4], this.field1368[arg0], this.field1369[arg0], this.field1370[arg0]);
        }
    }

    @ObfuscatedName("cs.b(I)V")
    public final void method1466(int arg0) {
        int var2 = Statics.field1444;
        int var3 = Statics.field1440;
        int var4 = 0;
        int var5 = this.field1365[arg0];
        int var6 = this.field1383[arg0];
        int var7 = this.field1366[arg0];
        int var8 = field1396[var5];
        int var9 = field1396[var6];
        int var10 = field1396[var7];
        if (this.field1372 == null) {
            class85.field1433 = 0;
        } else {
            class85.field1433 = this.field1372[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1363[var4] = field1360[var5];
            field1406[var4] = field1392[var5];
            field1407[var4++] = this.field1368[arg0];
        } else {
            int var11 = field1394[var5];
            int var12 = field1419[var5];
            int var13 = this.field1368[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1410[var10 - var8];
                field1363[var4] = (((field1394[var7] - var11) * var14 >> 16) + var11) * class85.field1438 / 50 + var2;
                field1406[var4] = (((field1419[var7] - var12) * var14 >> 16) + var12) * class85.field1438 / 50 + var3;
                field1407[var4++] = ((this.field1370[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1410[var9 - var8];
                field1363[var4] = (((field1394[var6] - var11) * var15 >> 16) + var11) * class85.field1438 / 50 + var2;
                field1406[var4] = (((field1419[var6] - var12) * var15 >> 16) + var12) * class85.field1438 / 50 + var3;
                field1407[var4++] = ((this.field1369[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1363[var4] = field1360[var6];
            field1406[var4] = field1392[var6];
            field1407[var4++] = this.field1369[arg0];
        } else {
            int var16 = field1394[var6];
            int var17 = field1419[var6];
            int var18 = this.field1369[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1410[var8 - var9];
                field1363[var4] = (((field1394[var5] - var16) * var19 >> 16) + var16) * class85.field1438 / 50 + var2;
                field1406[var4] = (((field1419[var5] - var17) * var19 >> 16) + var17) * class85.field1438 / 50 + var3;
                field1407[var4++] = ((this.field1368[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1410[var10 - var9];
                field1363[var4] = (((field1394[var7] - var16) * var20 >> 16) + var16) * class85.field1438 / 50 + var2;
                field1406[var4] = (((field1419[var7] - var17) * var20 >> 16) + var17) * class85.field1438 / 50 + var3;
                field1407[var4++] = ((this.field1370[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1363[var4] = field1360[var7];
            field1406[var4] = field1392[var7];
            field1407[var4++] = this.field1370[arg0];
        } else {
            int var21 = field1394[var7];
            int var22 = field1419[var7];
            int var23 = this.field1370[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1410[var9 - var10];
                field1363[var4] = (((field1394[var6] - var21) * var24 >> 16) + var21) * class85.field1438 / 50 + var2;
                field1406[var4] = (((field1419[var6] - var22) * var24 >> 16) + var22) * class85.field1438 / 50 + var3;
                field1407[var4++] = ((this.field1369[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1410[var8 - var10];
                field1363[var4] = (((field1394[var5] - var21) * var25 >> 16) + var21) * class85.field1438 / 50 + var2;
                field1406[var4] = (((field1419[var5] - var22) * var25 >> 16) + var22) * class85.field1438 / 50 + var3;
                field1407[var4++] = ((this.field1368[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1363[0];
        int var27 = field1363[1];
        int var28 = field1363[2];
        int var29 = field1406[0];
        int var30 = field1406[1];
        int var31 = field1406[2];
        class85.field1434 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1441 || var27 > Statics.field1441 || var28 > Statics.field1441) {
                class85.field1434 = true;
            }
            if (this.field1402 != null && this.field1402[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1373 == null || this.field1373[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1373[arg0] & 0xFF;
                    var33 = this.field1377[var32];
                    var34 = this.field1357[var32];
                    var35 = this.field1379[var32];
                }
                if (this.field1370[arg0] == -1) {
                    class85.method1559(var29, var30, var31, var26, var27, var28, this.field1368[arg0], this.field1368[arg0], this.field1368[arg0], field1394[var33], field1394[var34], field1394[var35], field1419[var33], field1419[var34], field1419[var35], field1396[var33], field1396[var34], field1396[var35], this.field1402[arg0]);
                } else {
                    class85.method1559(var29, var30, var31, var26, var27, var28, field1407[0], field1407[1], field1407[2], field1394[var33], field1394[var34], field1394[var35], field1419[var33], field1419[var34], field1419[var35], field1396[var33], field1396[var34], field1396[var35], this.field1402[arg0]);
                }
            } else if (this.field1370[arg0] == -1) {
                class85.method1542(var29, var30, var31, var26, var27, var28, field1418[this.field1368[arg0]]);
            } else {
                class85.method1575(var29, var30, var31, var26, var27, var28, field1407[0], field1407[1], field1407[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1441 || var27 > Statics.field1441 || var28 > Statics.field1441 || field1363[3] < 0 || field1363[3] > Statics.field1441) {
            class85.field1434 = true;
        }
        if (this.field1402 != null && this.field1402[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1373 == null || this.field1373[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1373[arg0] & 0xFF;
                var37 = this.field1377[var36];
                var38 = this.field1357[var36];
                var39 = this.field1379[var36];
            }
            short var40 = this.field1402[arg0];
            if (this.field1370[arg0] == -1) {
                class85.method1559(var29, var30, var31, var26, var27, var28, this.field1368[arg0], this.field1368[arg0], this.field1368[arg0], field1394[var37], field1394[var38], field1394[var39], field1419[var37], field1419[var38], field1419[var39], field1396[var37], field1396[var38], field1396[var39], var40);
                class85.method1559(var29, var31, field1406[3], var26, var28, field1363[3], this.field1368[arg0], this.field1368[arg0], this.field1368[arg0], field1394[var37], field1394[var38], field1394[var39], field1419[var37], field1419[var38], field1419[var39], field1396[var37], field1396[var38], field1396[var39], var40);
            } else {
                class85.method1559(var29, var30, var31, var26, var27, var28, field1407[0], field1407[1], field1407[2], field1394[var37], field1394[var38], field1394[var39], field1419[var37], field1419[var38], field1419[var39], field1396[var37], field1396[var38], field1396[var39], var40);
                class85.method1559(var29, var31, field1406[3], var26, var28, field1363[3], field1407[0], field1407[2], field1407[3], field1394[var37], field1394[var38], field1394[var39], field1419[var37], field1419[var38], field1419[var39], field1396[var37], field1396[var38], field1396[var39], var40);
            }
        } else if (this.field1370[arg0] == -1) {
            int var41 = field1418[this.field1368[arg0]];
            class85.method1542(var29, var30, var31, var26, var27, var28, var41);
            class85.method1542(var29, var31, field1406[3], var26, var28, field1363[3], var41);
        } else {
            class85.method1575(var29, var30, var31, var26, var27, var28, field1407[0], field1407[1], field1407[2]);
            class85.method1575(var29, var31, field1406[3], var26, var28, field1363[3], field1407[0], field1407[2], field1407[3]);
        }
    }

    @ObfuscatedName("cs.aj(IIIIIIII)Z")
    public final boolean method1519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
