package deob;

@ObfuscatedName("cj")
public class class83 extends class90 {

    @ObfuscatedName("cj.x")
    public static class83 field1426 = new class83();

    @ObfuscatedName("cj.j")
    public static byte[] field1409 = new byte[1];

    @ObfuscatedName("cj.c")
    public static class83 field1373 = new class83();

    @ObfuscatedName("cj.d")
    public static byte[] field1368 = new byte[1];

    @ObfuscatedName("cj.w")
    public int field1369 = 0;

    @ObfuscatedName("cj.h")
    public int[] field1370;

    @ObfuscatedName("cj.u")
    public int[] field1366;

    @ObfuscatedName("cj.k")
    public int[] field1387;

    @ObfuscatedName("cj.g")
    public int field1428 = 0;

    @ObfuscatedName("cj.y")
    public int[] field1374;

    @ObfuscatedName("cj.e")
    public int[] field1375;

    @ObfuscatedName("cj.q")
    public int[] field1406;

    @ObfuscatedName("cj.v")
    public int[] field1377;

    @ObfuscatedName("cj.l")
    public int[] field1425;

    @ObfuscatedName("cj.s")
    public int[] field1379;

    @ObfuscatedName("cj.r")
    public byte[] field1415;

    @ObfuscatedName("cj.m")
    public byte[] field1381;

    @ObfuscatedName("cj.i")
    public byte[] field1403;

    @ObfuscatedName("cj.f")
    public short[] field1383;

    @ObfuscatedName("cj.b")
    public byte field1384 = 0;

    @ObfuscatedName("cj.t")
    public int field1388 = 0;

    @ObfuscatedName("cj.z")
    public int[] field1427;

    @ObfuscatedName("cj.p")
    public int[] field1367;

    @ObfuscatedName("cj.n")
    public int[] field1378;

    @ObfuscatedName("cj.a")
    public int[][] field1389;

    @ObfuscatedName("cj.o")
    public int[][] field1390;

    @ObfuscatedName("cj.an")
    public boolean field1391 = false;

    @ObfuscatedName("cj.ar")
    public int field1365;

    @ObfuscatedName("cj.aa")
    public int field1393;

    @ObfuscatedName("cj.af")
    public int field1372;

    @ObfuscatedName("cj.ax")
    public int field1395;

    @ObfuscatedName("cj.ah")
    public int field1396;

    @ObfuscatedName("cj.at")
    public static boolean[] field1398 = new boolean[4700];

    @ObfuscatedName("cj.ab")
    public static boolean[] field1399 = new boolean[4700];

    @ObfuscatedName("cj.ae")
    public static int[] field1400 = new int[4700];

    @ObfuscatedName("cj.ao")
    public static int[] field1401 = new int[4700];

    @ObfuscatedName("cj.am")
    public static int[] field1402 = new int[4700];

    @ObfuscatedName("cj.ak")
    public static int[] field1385 = new int[4700];

    @ObfuscatedName("cj.ay")
    public static int[] field1404 = new int[4700];

    @ObfuscatedName("cj.aq")
    public static int[] field1392 = new int[4700];

    @ObfuscatedName("cj.ap")
    public static int[] field1407 = new int[1600];

    @ObfuscatedName("cj.ai")
    public static int[][] field1371 = new int[1600][512];

    @ObfuscatedName("cj.ac")
    public static int[] field1405 = new int[12];

    @ObfuscatedName("cj.av")
    public static int[][] field1418 = new int[12][2000];

    @ObfuscatedName("cj.as")
    public static int[] field1411 = new int[2000];

    @ObfuscatedName("cj.al")
    public static int[] field1412 = new int[2000];

    @ObfuscatedName("cj.ag")
    public static int[] field1413 = new int[12];

    @ObfuscatedName("cj.aw")
    public static int[] field1414 = new int[10];

    @ObfuscatedName("cj.ad")
    public static int[] field1376 = new int[10];

    @ObfuscatedName("cj.au")
    public static int[] field1416 = new int[10];

    @ObfuscatedName("cj.bt")
    public static boolean field1420 = false;

    @ObfuscatedName("cj.bl")
    public static int field1421 = 0;

    @ObfuscatedName("cj.bv")
    public static int field1422 = 0;

    @ObfuscatedName("cj.bm")
    public static int field1423 = 0;

    @ObfuscatedName("cj.bc")
    public static int[] field1424 = new int[1000];

    @ObfuscatedName("cj.be")
    public static int[] field1408 = class85.field1442;

    @ObfuscatedName("cj.bk")
    public static int[] field1386 = class85.field1463;

    @ObfuscatedName("cj.bq")
    public static int[] field1380 = class85.field1449;

    @ObfuscatedName("cj.bp")
    public static int[] field1397 = class85.field1454;

    public class83() {
    }

    public class83(class83[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1369 = 0;
        this.field1428 = 0;
        this.field1388 = 0;
        this.field1384 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class83 var8 = arg0[var7];
            if (var8 != null) {
                this.field1369 += var8.field1369;
                this.field1428 += var8.field1428;
                this.field1388 += var8.field1388;
                if (var8.field1415 == null) {
                    if (this.field1384 == -1) {
                        this.field1384 = var8.field1384;
                    }
                    if (this.field1384 != var8.field1384) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1381 != null;
                var5 |= var8.field1383 != null;
                var6 |= var8.field1403 != null;
            }
        }
        this.field1370 = new int[this.field1369];
        this.field1366 = new int[this.field1369];
        this.field1387 = new int[this.field1369];
        this.field1374 = new int[this.field1428];
        this.field1375 = new int[this.field1428];
        this.field1406 = new int[this.field1428];
        this.field1377 = new int[this.field1428];
        this.field1425 = new int[this.field1428];
        this.field1379 = new int[this.field1428];
        if (var3) {
            this.field1415 = new byte[this.field1428];
        }
        if (var4) {
            this.field1381 = new byte[this.field1428];
        }
        if (var5) {
            this.field1383 = new short[this.field1428];
        }
        if (var6) {
            this.field1403 = new byte[this.field1428];
        }
        if (this.field1388 > 0) {
            this.field1427 = new int[this.field1388];
            this.field1367 = new int[this.field1388];
            this.field1378 = new int[this.field1388];
        }
        this.field1369 = 0;
        this.field1428 = 0;
        this.field1388 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class83 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1428; var11++) {
                    this.field1374[this.field1428] = var10.field1374[var11] + this.field1369;
                    this.field1375[this.field1428] = var10.field1375[var11] + this.field1369;
                    this.field1406[this.field1428] = var10.field1406[var11] + this.field1369;
                    this.field1377[this.field1428] = var10.field1377[var11];
                    this.field1425[this.field1428] = var10.field1425[var11];
                    this.field1379[this.field1428] = var10.field1379[var11];
                    if (var3) {
                        if (var10.field1415 == null) {
                            this.field1415[this.field1428] = var10.field1384;
                        } else {
                            this.field1415[this.field1428] = var10.field1415[var11];
                        }
                    }
                    if (var4 && var10.field1381 != null) {
                        this.field1381[this.field1428] = var10.field1381[var11];
                    }
                    if (var5) {
                        if (var10.field1383 == null) {
                            this.field1383[this.field1428] = -1;
                        } else {
                            this.field1383[this.field1428] = var10.field1383[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1403 == null || var10.field1403[var11] == -1) {
                            this.field1403[this.field1428] = -1;
                        } else {
                            this.field1403[this.field1428] = (byte) (var10.field1403[var11] + this.field1388);
                        }
                    }
                    this.field1428++;
                }
                for (int var12 = 0; var12 < var10.field1388; var12++) {
                    this.field1427[this.field1388] = var10.field1427[var12] + this.field1369;
                    this.field1367[this.field1388] = var10.field1367[var12] + this.field1369;
                    this.field1378[this.field1388] = var10.field1378[var12] + this.field1369;
                    this.field1388++;
                }
                for (int var13 = 0; var13 < var10.field1369; var13++) {
                    this.field1370[this.field1369] = var10.field1370[var13];
                    this.field1366[this.field1369] = var10.field1366[var13];
                    this.field1387[this.field1369] = var10.field1387[var13];
                    this.field1369++;
                }
            }
        }
    }

    @ObfuscatedName("cj.x([[IIIIZI)Lcj;")
    public class83 method1528(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1532();
        int var7 = arg1 - this.field1372;
        int var8 = this.field1372 + arg1;
        int var9 = arg3 - this.field1372;
        int var10 = this.field1372 + arg3;
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
            var15.field1369 = this.field1369;
            var15.field1428 = this.field1428;
            var15.field1388 = this.field1388;
            var15.field1370 = this.field1370;
            var15.field1387 = this.field1387;
            var15.field1374 = this.field1374;
            var15.field1375 = this.field1375;
            var15.field1406 = this.field1406;
            var15.field1377 = this.field1377;
            var15.field1425 = this.field1425;
            var15.field1379 = this.field1379;
            var15.field1415 = this.field1415;
            var15.field1381 = this.field1381;
            var15.field1403 = this.field1403;
            var15.field1383 = this.field1383;
            var15.field1384 = this.field1384;
            var15.field1427 = this.field1427;
            var15.field1367 = this.field1367;
            var15.field1378 = this.field1378;
            var15.field1389 = this.field1389;
            var15.field1390 = this.field1390;
            var15.field1391 = this.field1391;
            var15.field1366 = new int[var15.field1369];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1369; var16++) {
                int var17 = this.field1370[var16] + arg1;
                int var18 = this.field1387[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1366[var16] = this.field1366[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1369; var26++) {
                int var27 = (-this.field1366[var26] << 16) / this.field1556;
                if (var27 < arg5) {
                    int var28 = this.field1370[var26] + arg1;
                    int var29 = this.field1387[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1366[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1366[var26];
                }
            }
        }
        var15.field1365 = 0;
        return var15;
    }

    @ObfuscatedName("cj.j(Z)Lcj;")
    public class83 method1529(boolean arg0) {
        if (!arg0 && field1409.length < this.field1428) {
            field1409 = new byte[this.field1428 + 100];
        }
        return this.method1531(arg0, field1426, field1409);
    }

    @ObfuscatedName("cj.d(Z)Lcj;")
    public class83 method1530(boolean arg0) {
        if (!arg0 && field1368.length < this.field1428) {
            field1368 = new byte[this.field1428 + 100];
        }
        return this.method1531(arg0, field1373, field1368);
    }

    @ObfuscatedName("cj.w(ZLcj;[B)Lcj;")
    public class83 method1531(boolean arg0, class83 arg1, byte[] arg2) {
        arg1.field1369 = this.field1369;
        arg1.field1428 = this.field1428;
        arg1.field1388 = this.field1388;
        if (arg1.field1370 == null || arg1.field1370.length < this.field1369) {
            arg1.field1370 = new int[this.field1369 + 100];
            arg1.field1366 = new int[this.field1369 + 100];
            arg1.field1387 = new int[this.field1369 + 100];
        }
        for (int var4 = 0; var4 < this.field1369; var4++) {
            arg1.field1370[var4] = this.field1370[var4];
            arg1.field1366[var4] = this.field1366[var4];
            arg1.field1387[var4] = this.field1387[var4];
        }
        if (arg0) {
            arg1.field1381 = this.field1381;
        } else {
            arg1.field1381 = arg2;
            if (this.field1381 == null) {
                for (int var5 = 0; var5 < this.field1428; var5++) {
                    arg1.field1381[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1428; var6++) {
                    arg1.field1381[var6] = this.field1381[var6];
                }
            }
        }
        arg1.field1374 = this.field1374;
        arg1.field1375 = this.field1375;
        arg1.field1406 = this.field1406;
        arg1.field1377 = this.field1377;
        arg1.field1425 = this.field1425;
        arg1.field1379 = this.field1379;
        arg1.field1415 = this.field1415;
        arg1.field1403 = this.field1403;
        arg1.field1383 = this.field1383;
        arg1.field1384 = this.field1384;
        arg1.field1427 = this.field1427;
        arg1.field1367 = this.field1367;
        arg1.field1378 = this.field1378;
        arg1.field1389 = this.field1389;
        arg1.field1390 = this.field1390;
        arg1.field1391 = this.field1391;
        arg1.field1365 = 0;
        return arg1;
    }

    @ObfuscatedName("cj.u()V")
    public void method1532() {
        if (this.field1365 == 1) {
            return;
        }
        this.field1365 = 1;
        this.field1556 = 0;
        this.field1393 = 0;
        this.field1372 = 0;
        for (int var1 = 0; var1 < this.field1369; var1++) {
            int var2 = this.field1370[var1];
            int var3 = this.field1366[var1];
            int var4 = this.field1387[var1];
            if (-var3 > this.field1556) {
                this.field1556 = -var3;
            }
            if (var3 > this.field1393) {
                this.field1393 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1372) {
                this.field1372 = var5;
            }
        }
        this.field1372 = (int) (Math.sqrt((double) this.field1372) + 0.99D);
        this.field1396 = (int) (Math.sqrt((double) (this.field1556 * this.field1556 + this.field1372 * this.field1372)) + 0.99D);
        this.field1395 = this.field1396 + (int) (Math.sqrt((double) (this.field1393 * this.field1393 + this.field1372 * this.field1372)) + 0.99D);
    }

    @ObfuscatedName("cj.y()V")
    public void method1533() {
        if (this.field1365 == 2) {
            return;
        }
        this.field1365 = 2;
        this.field1372 = 0;
        for (int var1 = 0; var1 < this.field1369; var1++) {
            int var2 = this.field1370[var1];
            int var3 = this.field1366[var1];
            int var4 = this.field1387[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1372) {
                this.field1372 = var5;
            }
        }
        this.field1372 = (int) (Math.sqrt((double) this.field1372) + 0.99D);
        this.field1396 = this.field1372;
        this.field1395 = this.field1372 + this.field1372;
    }

    @ObfuscatedName("cj.e()I")
    public int method1534() {
        this.method1532();
        return this.field1372;
    }

    @ObfuscatedName("cj.q(Lcy;I)V")
    public void method1546(class93 arg0, int arg1) {
        if (this.field1389 == null || arg1 == -1) {
            return;
        }
        class81 var3 = arg0.field1581[arg1];
        class87 var4 = var3.field1332;
        Statics.field1417 = 0;
        Statics.field1382 = 0;
        Statics.field1419 = 0;
        for (int var5 = 0; var5 < var3.field1333; var5++) {
            int var6 = var3.field1334[var5];
            this.method1537(var4.field1479[var6], var4.field1480[var6], var3.field1335[var5], var3.field1336[var5], var3.field1337[var5]);
        }
        this.field1365 = 0;
    }

    @ObfuscatedName("cj.v(Lcy;ILcy;I[I)V")
    public void method1536(class93 arg0, int arg1, class93 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method1546(arg0, arg1);
            return;
        }
        class81 var6 = arg0.field1581[arg1];
        class81 var7 = arg2.field1581[arg3];
        class87 var8 = var6.field1332;
        Statics.field1417 = 0;
        Statics.field1382 = 0;
        Statics.field1419 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1333; var11++) {
            int var12 = var6.field1334[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1479[var12] == 0) {
                this.method1537(var8.field1479[var12], var8.field1480[var12], var6.field1335[var11], var6.field1336[var11], var6.field1337[var11]);
            }
        }
        Statics.field1417 = 0;
        Statics.field1382 = 0;
        Statics.field1419 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1333; var15++) {
            int var16 = var7.field1334[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1479[var16] == 0) {
                this.method1537(var8.field1479[var16], var8.field1480[var16], var7.field1335[var15], var7.field1336[var15], var7.field1337[var15]);
            }
        }
        this.field1365 = 0;
    }

    @ObfuscatedName("cj.l(I[IIII)V")
    public void method1537(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1417 = 0;
            Statics.field1382 = 0;
            Statics.field1419 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1389.length) {
                    int[] var10 = this.field1389[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1417 += this.field1370[var12];
                        Statics.field1382 += this.field1366[var12];
                        Statics.field1419 += this.field1387[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1417 = Statics.field1417 / var7 + arg2;
                Statics.field1382 = Statics.field1382 / var7 + arg3;
                Statics.field1419 = Statics.field1419 / var7 + arg4;
            } else {
                Statics.field1417 = arg2;
                Statics.field1382 = arg3;
                Statics.field1419 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1389.length) {
                    int[] var15 = this.field1389[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1370[var17] += arg2;
                        this.field1366[var17] += arg3;
                        this.field1387[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1389.length) {
                    int[] var20 = this.field1389[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1370[var22] -= Statics.field1417;
                        this.field1366[var22] -= Statics.field1382;
                        this.field1387[var22] -= Statics.field1419;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1408[var25];
                            int var27 = field1386[var25];
                            int var28 = this.field1370[var22] * var27 + this.field1366[var22] * var26 >> 16;
                            this.field1366[var22] = this.field1366[var22] * var27 - this.field1370[var22] * var26 >> 16;
                            this.field1370[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1408[var23];
                            int var30 = field1386[var23];
                            int var31 = this.field1366[var22] * var30 - this.field1387[var22] * var29 >> 16;
                            this.field1387[var22] = this.field1387[var22] * var30 + this.field1366[var22] * var29 >> 16;
                            this.field1366[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1408[var24];
                            int var33 = field1386[var24];
                            int var34 = this.field1387[var22] * var32 + this.field1370[var22] * var33 >> 16;
                            this.field1387[var22] = this.field1387[var22] * var33 - this.field1370[var22] * var32 >> 16;
                            this.field1370[var22] = var34;
                        }
                        this.field1370[var22] += Statics.field1417;
                        this.field1366[var22] += Statics.field1382;
                        this.field1387[var22] += Statics.field1419;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1389.length) {
                    int[] var37 = this.field1389[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1370[var39] -= Statics.field1417;
                        this.field1366[var39] -= Statics.field1382;
                        this.field1387[var39] -= Statics.field1419;
                        this.field1370[var39] = this.field1370[var39] * arg2 / 128;
                        this.field1366[var39] = this.field1366[var39] * arg3 / 128;
                        this.field1387[var39] = this.field1387[var39] * arg4 / 128;
                        this.field1370[var39] += Statics.field1417;
                        this.field1366[var39] += Statics.field1382;
                        this.field1387[var39] += Statics.field1419;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1390 != null && this.field1381 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1390.length) {
                    int[] var42 = this.field1390[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1381[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1381[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("cj.s()V")
    public void method1562() {
        for (int var1 = 0; var1 < this.field1369; var1++) {
            int var2 = this.field1370[var1];
            this.field1370[var1] = this.field1387[var1];
            this.field1387[var1] = -var2;
        }
        this.field1365 = 0;
    }

    @ObfuscatedName("cj.b()V")
    public void method1539() {
        for (int var1 = 0; var1 < this.field1369; var1++) {
            this.field1370[var1] = -this.field1370[var1];
            this.field1387[var1] = -this.field1387[var1];
        }
        this.field1365 = 0;
    }

    @ObfuscatedName("cj.t()V")
    public void method1550() {
        for (int var1 = 0; var1 < this.field1369; var1++) {
            int var2 = this.field1387[var1];
            this.field1387[var1] = this.field1370[var1];
            this.field1370[var1] = -var2;
        }
        this.field1365 = 0;
    }

    @ObfuscatedName("cj.z(I)V")
    public void method1541(int arg0) {
        int var2 = field1408[arg0];
        int var3 = field1386[arg0];
        for (int var4 = 0; var4 < this.field1369; var4++) {
            int var5 = this.field1366[var4] * var3 - this.field1387[var4] * var2 >> 16;
            this.field1387[var4] = this.field1387[var4] * var3 + this.field1366[var4] * var2 >> 16;
            this.field1366[var4] = var5;
        }
        this.field1365 = 0;
    }

    @ObfuscatedName("cj.p(III)V")
    public void method1545(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1369; var4++) {
            this.field1370[var4] += arg0;
            this.field1366[var4] += arg1;
            this.field1387[var4] += arg2;
        }
        this.field1365 = 0;
    }

    @ObfuscatedName("cj.n(III)V")
    public void method1542(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1369; var4++) {
            this.field1370[var4] = this.field1370[var4] * arg0 / 128;
            this.field1366[var4] = this.field1366[var4] * arg1 / 128;
            this.field1387[var4] = this.field1387[var4] * arg2 / 128;
        }
        this.field1365 = 0;
    }

    @ObfuscatedName("cj.a(IIIIIII)V")
    public final void method1544(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1407[0] = -1;
        if (this.field1365 != 2 && this.field1365 != 1) {
            this.method1533();
        }
        int var8 = Statics.field1452;
        int var9 = Statics.field1461;
        int var10 = field1408[arg0];
        int var11 = field1386[arg0];
        int var12 = field1408[arg1];
        int var13 = field1386[arg1];
        int var14 = field1408[arg2];
        int var15 = field1386[arg2];
        int var16 = field1408[arg3];
        int var17 = field1386[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1369; var19++) {
            int var20 = this.field1370[var19];
            int var21 = this.field1366[var19];
            int var22 = this.field1387[var19];
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
            field1402[var19] = var30 - var18;
            field1400[var19] = class85.field1448 * var26 / var30 + var8;
            field1401[var19] = class85.field1448 * var29 / var30 + var9;
            if (this.field1388 > 0) {
                field1385[var19] = var26;
                field1404[var19] = var29;
                field1392[var19] = var30;
            }
        }
        try {
            this.method1547(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("cj.o(IIIIIIII)V")
    public final void method1604(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1407[0] = -1;
        if (this.field1365 != 2 && this.field1365 != 1) {
            this.method1533();
        }
        int var9 = Statics.field1452;
        int var10 = Statics.field1461;
        int var11 = field1408[arg0];
        int var12 = field1386[arg0];
        int var13 = field1408[arg1];
        int var14 = field1386[arg1];
        int var15 = field1408[arg2];
        int var16 = field1386[arg2];
        int var17 = field1408[arg3];
        int var18 = field1386[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1369; var20++) {
            int var21 = this.field1370[var20];
            int var22 = this.field1366[var20];
            int var23 = this.field1387[var20];
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
            field1402[var20] = var31 - var19;
            field1400[var20] = class85.field1448 * var27 / arg7 + var9;
            field1401[var20] = class85.field1448 * var30 / arg7 + var10;
            if (this.field1388 > 0) {
                field1385[var20] = var27;
                field1404[var20] = var30;
                field1392[var20] = var31;
            }
        }
        try {
            this.method1547(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("cj.cb(IIIIIIIII)V")
    public void method1527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1407[0] = -1;
        if (this.field1365 != 1) {
            this.method1532();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1372 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1372) * class85.field1448;
        if (var15 / var13 >= Statics.field1445) {
            return;
        }
        int var16 = (this.field1372 + var14) * class85.field1448;
        if (var16 / var13 <= Statics.field1453) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1372 * arg1 >> 16;
        int var19 = (var17 + var18) * class85.field1448;
        if (var19 / var13 <= Statics.field1455) {
            return;
        }
        int var20 = (this.field1556 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class85.field1448;
        if (var21 / var13 >= Statics.field1456) {
            return;
        }
        int var22 = (this.field1556 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1388 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1420) {
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
            int var32 = field1421 - Statics.field1452;
            int var33 = field1422 - Statics.field1461;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1391) {
                    field1424[field1423++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1452;
        int var35 = Statics.field1461;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1408[arg0];
            var37 = field1386[arg0];
        }
        for (int var38 = 0; var38 < this.field1369; var38++) {
            int var39 = this.field1370[var38];
            int var40 = this.field1366[var38];
            int var41 = this.field1387[var38];
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
            field1402[var38] = var50 - var11;
            if (var50 >= 50) {
                field1400[var38] = class85.field1448 * var46 / var50 + var34;
                field1401[var38] = class85.field1448 * var49 / var50 + var35;
            } else {
                field1400[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1385[var38] = var46;
                field1404[var38] = var49;
                field1392[var38] = var50;
            }
        }
        try {
            this.method1547(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("cj.an(ZZI)V")
    public final void method1547(boolean arg0, boolean arg1, int arg2) {
        if (this.field1395 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1395; var4++) {
            field1407[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1428; var5++) {
            if (this.field1379[var5] != -2) {
                int var6 = this.field1374[var5];
                int var7 = this.field1375[var5];
                int var8 = this.field1406[var5];
                int var9 = field1400[var6];
                int var10 = field1400[var7];
                int var11 = field1400[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1385[var6];
                    int var13 = field1385[var7];
                    int var14 = field1385[var8];
                    int var15 = field1404[var6];
                    int var16 = field1404[var7];
                    int var17 = field1404[var8];
                    int var18 = field1392[var6];
                    int var19 = field1392[var7];
                    int var20 = field1392[var8];
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
                        field1399[var5] = true;
                        int var30 = (field1402[var6] + field1402[var7] + field1402[var8]) / 3 + this.field1396;
                        field1371[var30][field1407[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method1565(field1421, field1422, field1401[var6], field1401[var7], field1401[var8], var9, var10, var11)) {
                        field1424[field1423++] = arg2;
                        arg1 = false;
                    }
                    if ((field1401[var8] - field1401[var7]) * (var9 - var10) - (field1401[var6] - field1401[var7]) * (var11 - var10) > 0) {
                        field1399[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1451 && var10 <= Statics.field1451 && var11 <= Statics.field1451) {
                            field1398[var5] = false;
                        } else {
                            field1398[var5] = true;
                        }
                        int var31 = (field1402[var6] + field1402[var7] + field1402[var8]) / 3 + this.field1396;
                        field1371[var31][field1407[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1415 == null) {
            for (int var32 = this.field1395 - 1; var32 >= 0; var32--) {
                int var33 = field1407[var32];
                if (var33 > 0) {
                    int[] var34 = field1371[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method1548(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1405[var36] = 0;
            field1413[var36] = 0;
        }
        for (int var37 = this.field1395 - 1; var37 >= 0; var37--) {
            int var38 = field1407[var37];
            if (var38 > 0) {
                int[] var39 = field1371[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1415[var41];
                    int var43 = field1405[var42]++;
                    field1418[var42][var43] = var41;
                    if (var42 < 10) {
                        field1413[var42] += var37;
                    } else if (var42 == 10) {
                        field1411[var43] = var37;
                    } else {
                        field1412[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1405[1] > 0 || field1405[2] > 0) {
            var44 = (field1413[1] + field1413[2]) / (field1405[1] + field1405[2]);
        }
        int var45 = 0;
        if (field1405[3] > 0 || field1405[4] > 0) {
            var45 = (field1413[3] + field1413[4]) / (field1405[3] + field1405[4]);
        }
        int var46 = 0;
        if (field1405[6] > 0 || field1405[8] > 0) {
            var46 = (field1413[6] + field1413[8]) / (field1405[6] + field1405[8]);
        }
        int var47 = 0;
        int var48 = field1405[10];
        int[] var49 = field1418[10];
        int[] var50 = field1411;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1405[11];
            var49 = field1418[11];
            var50 = field1412;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method1548(var49[var47++]);
                if (var47 == var48 && field1418[11] != var49) {
                    var47 = 0;
                    var48 = field1405[11];
                    var49 = field1418[11];
                    var50 = field1412;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method1548(var49[var47++]);
                if (var47 == var48 && field1418[11] != var49) {
                    var47 = 0;
                    var48 = field1405[11];
                    var49 = field1418[11];
                    var50 = field1412;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method1548(var49[var47++]);
                if (var47 == var48 && field1418[11] != var49) {
                    var47 = 0;
                    var48 = field1405[11];
                    var49 = field1418[11];
                    var50 = field1412;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1405[var52];
            int[] var54 = field1418[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method1548(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method1548(var49[var47++]);
            if (var47 == var48 && field1418[11] != var49) {
                var47 = 0;
                var49 = field1418[11];
                var48 = field1405[11];
                var50 = field1412;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("cj.ar(I)V")
    public final void method1548(int arg0) {
        if (field1399[arg0]) {
            this.method1549(arg0);
            return;
        }
        int var2 = this.field1374[arg0];
        int var3 = this.field1375[arg0];
        int var4 = this.field1406[arg0];
        class85.field1458 = field1398[arg0];
        if (this.field1381 == null) {
            class85.field1443 = 0;
        } else {
            class85.field1443 = this.field1381[arg0] & 0xFF;
        }
        if (this.field1383 != null && this.field1383[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1403 == null || this.field1403[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1403[arg0] & 0xFF;
                var6 = this.field1427[var5];
                var7 = this.field1367[var5];
                var8 = this.field1378[var5];
            }
            if (this.field1379[arg0] == -1) {
                class85.method1618(field1401[var2], field1401[var3], field1401[var4], field1400[var2], field1400[var3], field1400[var4], this.field1377[arg0], this.field1377[arg0], this.field1377[arg0], field1385[var6], field1385[var7], field1385[var8], field1404[var6], field1404[var7], field1404[var8], field1392[var6], field1392[var7], field1392[var8], this.field1383[arg0]);
            } else {
                class85.method1618(field1401[var2], field1401[var3], field1401[var4], field1400[var2], field1400[var3], field1400[var4], this.field1377[arg0], this.field1425[arg0], this.field1379[arg0], field1385[var6], field1385[var7], field1385[var8], field1404[var6], field1404[var7], field1404[var8], field1392[var6], field1392[var7], field1392[var8], this.field1383[arg0]);
            }
        } else if (this.field1379[arg0] == -1) {
            class85.method1655(field1401[var2], field1401[var3], field1401[var4], field1400[var2], field1400[var3], field1400[var4], field1380[this.field1377[arg0]]);
        } else {
            class85.method1616(field1401[var2], field1401[var3], field1401[var4], field1400[var2], field1400[var3], field1400[var4], this.field1377[arg0], this.field1425[arg0], this.field1379[arg0]);
        }
    }

    @ObfuscatedName("cj.aa(I)V")
    public final void method1549(int arg0) {
        int var2 = Statics.field1452;
        int var3 = Statics.field1461;
        int var4 = 0;
        int var5 = this.field1374[arg0];
        int var6 = this.field1375[arg0];
        int var7 = this.field1406[arg0];
        int var8 = field1392[var5];
        int var9 = field1392[var6];
        int var10 = field1392[var7];
        if (this.field1381 == null) {
            class85.field1443 = 0;
        } else {
            class85.field1443 = this.field1381[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1414[var4] = field1400[var5];
            field1376[var4] = field1401[var5];
            field1416[var4++] = this.field1377[arg0];
        } else {
            int var11 = field1385[var5];
            int var12 = field1404[var5];
            int var13 = this.field1377[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1397[var10 - var8];
                field1414[var4] = (((field1385[var7] - var11) * var14 >> 16) + var11) * class85.field1448 / 50 + var2;
                field1376[var4] = (((field1404[var7] - var12) * var14 >> 16) + var12) * class85.field1448 / 50 + var3;
                field1416[var4++] = ((this.field1379[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1397[var9 - var8];
                field1414[var4] = (((field1385[var6] - var11) * var15 >> 16) + var11) * class85.field1448 / 50 + var2;
                field1376[var4] = (((field1404[var6] - var12) * var15 >> 16) + var12) * class85.field1448 / 50 + var3;
                field1416[var4++] = ((this.field1425[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1414[var4] = field1400[var6];
            field1376[var4] = field1401[var6];
            field1416[var4++] = this.field1425[arg0];
        } else {
            int var16 = field1385[var6];
            int var17 = field1404[var6];
            int var18 = this.field1425[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1397[var8 - var9];
                field1414[var4] = (((field1385[var5] - var16) * var19 >> 16) + var16) * class85.field1448 / 50 + var2;
                field1376[var4] = (((field1404[var5] - var17) * var19 >> 16) + var17) * class85.field1448 / 50 + var3;
                field1416[var4++] = ((this.field1377[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1397[var10 - var9];
                field1414[var4] = (((field1385[var7] - var16) * var20 >> 16) + var16) * class85.field1448 / 50 + var2;
                field1376[var4] = (((field1404[var7] - var17) * var20 >> 16) + var17) * class85.field1448 / 50 + var3;
                field1416[var4++] = ((this.field1379[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1414[var4] = field1400[var7];
            field1376[var4] = field1401[var7];
            field1416[var4++] = this.field1379[arg0];
        } else {
            int var21 = field1385[var7];
            int var22 = field1404[var7];
            int var23 = this.field1379[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1397[var9 - var10];
                field1414[var4] = (((field1385[var6] - var21) * var24 >> 16) + var21) * class85.field1448 / 50 + var2;
                field1376[var4] = (((field1404[var6] - var22) * var24 >> 16) + var22) * class85.field1448 / 50 + var3;
                field1416[var4++] = ((this.field1425[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1397[var8 - var10];
                field1414[var4] = (((field1385[var5] - var21) * var25 >> 16) + var21) * class85.field1448 / 50 + var2;
                field1376[var4] = (((field1404[var5] - var22) * var25 >> 16) + var22) * class85.field1448 / 50 + var3;
                field1416[var4++] = ((this.field1377[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1414[0];
        int var27 = field1414[1];
        int var28 = field1414[2];
        int var29 = field1376[0];
        int var30 = field1376[1];
        int var31 = field1376[2];
        class85.field1458 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1451 || var27 > Statics.field1451 || var28 > Statics.field1451) {
                class85.field1458 = true;
            }
            if (this.field1383 != null && this.field1383[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1403 == null || this.field1403[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1403[arg0] & 0xFF;
                    var33 = this.field1427[var32];
                    var34 = this.field1367[var32];
                    var35 = this.field1378[var32];
                }
                if (this.field1379[arg0] == -1) {
                    class85.method1618(var29, var30, var31, var26, var27, var28, this.field1377[arg0], this.field1377[arg0], this.field1377[arg0], field1385[var33], field1385[var34], field1385[var35], field1404[var33], field1404[var34], field1404[var35], field1392[var33], field1392[var34], field1392[var35], this.field1383[arg0]);
                } else {
                    class85.method1618(var29, var30, var31, var26, var27, var28, field1416[0], field1416[1], field1416[2], field1385[var33], field1385[var34], field1385[var35], field1404[var33], field1404[var34], field1404[var35], field1392[var33], field1392[var34], field1392[var35], this.field1383[arg0]);
                }
            } else if (this.field1379[arg0] == -1) {
                class85.method1655(var29, var30, var31, var26, var27, var28, field1380[this.field1377[arg0]]);
            } else {
                class85.method1616(var29, var30, var31, var26, var27, var28, field1416[0], field1416[1], field1416[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1451 || var27 > Statics.field1451 || var28 > Statics.field1451 || field1414[3] < 0 || field1414[3] > Statics.field1451) {
            class85.field1458 = true;
        }
        if (this.field1383 != null && this.field1383[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1403 == null || this.field1403[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1403[arg0] & 0xFF;
                var37 = this.field1427[var36];
                var38 = this.field1367[var36];
                var39 = this.field1378[var36];
            }
            short var40 = this.field1383[arg0];
            if (this.field1379[arg0] == -1) {
                class85.method1618(var29, var30, var31, var26, var27, var28, this.field1377[arg0], this.field1377[arg0], this.field1377[arg0], field1385[var37], field1385[var38], field1385[var39], field1404[var37], field1404[var38], field1404[var39], field1392[var37], field1392[var38], field1392[var39], var40);
                class85.method1618(var29, var31, field1376[3], var26, var28, field1414[3], this.field1377[arg0], this.field1377[arg0], this.field1377[arg0], field1385[var37], field1385[var38], field1385[var39], field1404[var37], field1404[var38], field1404[var39], field1392[var37], field1392[var38], field1392[var39], var40);
            } else {
                class85.method1618(var29, var30, var31, var26, var27, var28, field1416[0], field1416[1], field1416[2], field1385[var37], field1385[var38], field1385[var39], field1404[var37], field1404[var38], field1404[var39], field1392[var37], field1392[var38], field1392[var39], var40);
                class85.method1618(var29, var31, field1376[3], var26, var28, field1414[3], field1416[0], field1416[2], field1416[3], field1385[var37], field1385[var38], field1385[var39], field1404[var37], field1404[var38], field1404[var39], field1392[var37], field1392[var38], field1392[var39], var40);
            }
        } else if (this.field1379[arg0] == -1) {
            int var41 = field1380[this.field1377[arg0]];
            class85.method1655(var29, var30, var31, var26, var27, var28, var41);
            class85.method1655(var29, var31, field1376[3], var26, var28, field1414[3], var41);
        } else {
            class85.method1616(var29, var30, var31, var26, var27, var28, field1416[0], field1416[1], field1416[2]);
            class85.method1616(var29, var31, field1376[3], var26, var28, field1414[3], field1416[0], field1416[2], field1416[3]);
        }
    }

    @ObfuscatedName("cj.af(IIIIIIII)Z")
    public final boolean method1565(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
