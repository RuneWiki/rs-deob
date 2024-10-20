package deob;

@ObfuscatedName("cf")
public class class83 extends class90 {

    @ObfuscatedName("cf.q")
    public static class83 field1376 = new class83();

    @ObfuscatedName("cf.d")
    public static byte[] field1392 = new byte[1];

    @ObfuscatedName("cf.h")
    public static class83 field1435 = new class83();

    @ObfuscatedName("cf.p")
    public static byte[] field1400 = new byte[1];

    @ObfuscatedName("cf.j")
    public int field1378 = 0;

    @ObfuscatedName("cf.n")
    public int[] field1379;

    @ObfuscatedName("cf.r")
    public int[] field1387;

    @ObfuscatedName("cf.c")
    public int[] field1382;

    @ObfuscatedName("cf.i")
    public int field1389 = 0;

    @ObfuscatedName("cf.o")
    public int[] field1420;

    @ObfuscatedName("cf.m")
    public int[] field1384;

    @ObfuscatedName("cf.s")
    public int[] field1385;

    @ObfuscatedName("cf.u")
    public int[] field1386;

    @ObfuscatedName("cf.b")
    public int[] field1438;

    @ObfuscatedName("cf.v")
    public int[] field1414;

    @ObfuscatedName("cf.f")
    public byte[] field1417;

    @ObfuscatedName("cf.z")
    public byte[] field1390;

    @ObfuscatedName("cf.t")
    public byte[] field1391;

    @ObfuscatedName("cf.y")
    public short[] field1433;

    @ObfuscatedName("cf.w")
    public byte field1393 = 0;

    @ObfuscatedName("cf.a")
    public int field1394 = 0;

    @ObfuscatedName("cf.k")
    public int[] field1395;

    @ObfuscatedName("cf.l")
    public int[] field1396;

    @ObfuscatedName("cf.x")
    public int[] field1381;

    @ObfuscatedName("cf.g")
    public int[][] field1398;

    @ObfuscatedName("cf.e")
    public int[][] field1399;

    @ObfuscatedName("cf.ae")
    public boolean field1403 = false;

    @ObfuscatedName("cf.aq")
    public int field1401;

    @ObfuscatedName("cf.at")
    public int field1413;

    @ObfuscatedName("cf.au")
    public int field1431;

    @ObfuscatedName("cf.am")
    public int field1404;

    @ObfuscatedName("cf.ad")
    public int field1405;

    @ObfuscatedName("cf.ac")
    public static boolean[] field1407 = new boolean[4700];

    @ObfuscatedName("cf.ao")
    public static boolean[] field1408 = new boolean[4700];

    @ObfuscatedName("cf.as")
    public static int[] field1409 = new int[4700];

    @ObfuscatedName("cf.aa")
    public static int[] field1410 = new int[4700];

    @ObfuscatedName("cf.ah")
    public static int[] field1411 = new int[4700];

    @ObfuscatedName("cf.aj")
    public static int[] field1412 = new int[4700];

    @ObfuscatedName("cf.aw")
    public static int[] field1419 = new int[4700];

    @ObfuscatedName("cf.ap")
    public static int[] field1402 = new int[4700];

    @ObfuscatedName("cf.ag")
    public static int[] field1416 = new int[1600];

    @ObfuscatedName("cf.al")
    public static int[][] field1432 = new int[1600][512];

    @ObfuscatedName("cf.an")
    public static int[] field1418 = new int[12];

    @ObfuscatedName("cf.ar")
    public static int[][] field1388 = new int[12][2000];

    @ObfuscatedName("cf.ab")
    public static int[] field1374 = new int[2000];

    @ObfuscatedName("cf.az")
    public static int[] field1421 = new int[2000];

    @ObfuscatedName("cf.ay")
    public static int[] field1422 = new int[12];

    @ObfuscatedName("cf.av")
    public static int[] field1397 = new int[10];

    @ObfuscatedName("cf.af")
    public static int[] field1424 = new int[10];

    @ObfuscatedName("cf.ax")
    public static int[] field1425 = new int[10];

    @ObfuscatedName("cf.bj")
    public static boolean field1429 = false;

    @ObfuscatedName("cf.bw")
    public static int field1430 = 0;

    @ObfuscatedName("cf.bd")
    public static int field1377 = 0;

    @ObfuscatedName("cf.bu")
    public static int field1423 = 0;

    @ObfuscatedName("cf.bo")
    public static int[] field1383 = new int[1000];

    @ObfuscatedName("cf.bc")
    public static int[] field1434 = class85.field1469;

    @ObfuscatedName("cf.bm")
    public static int[] field1380 = class85.field1463;

    @ObfuscatedName("cf.be")
    public static int[] field1436 = class85.field1465;

    @ObfuscatedName("cf.bb")
    public static int[] field1437 = class85.field1468;

    public class83() {
    }

    public class83(class83[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1378 = 0;
        this.field1389 = 0;
        this.field1394 = 0;
        this.field1393 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class83 var8 = arg0[var7];
            if (var8 != null) {
                this.field1378 += var8.field1378;
                this.field1389 += var8.field1389;
                this.field1394 += var8.field1394;
                if (var8.field1417 == null) {
                    if (this.field1393 == -1) {
                        this.field1393 = var8.field1393;
                    }
                    if (this.field1393 != var8.field1393) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1390 != null;
                var5 |= var8.field1433 != null;
                var6 |= var8.field1391 != null;
            }
        }
        this.field1379 = new int[this.field1378];
        this.field1387 = new int[this.field1378];
        this.field1382 = new int[this.field1378];
        this.field1420 = new int[this.field1389];
        this.field1384 = new int[this.field1389];
        this.field1385 = new int[this.field1389];
        this.field1386 = new int[this.field1389];
        this.field1438 = new int[this.field1389];
        this.field1414 = new int[this.field1389];
        if (var3) {
            this.field1417 = new byte[this.field1389];
        }
        if (var4) {
            this.field1390 = new byte[this.field1389];
        }
        if (var5) {
            this.field1433 = new short[this.field1389];
        }
        if (var6) {
            this.field1391 = new byte[this.field1389];
        }
        if (this.field1394 > 0) {
            this.field1395 = new int[this.field1394];
            this.field1396 = new int[this.field1394];
            this.field1381 = new int[this.field1394];
        }
        this.field1378 = 0;
        this.field1389 = 0;
        this.field1394 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class83 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1389; var11++) {
                    this.field1420[this.field1389] = var10.field1420[var11] + this.field1378;
                    this.field1384[this.field1389] = var10.field1384[var11] + this.field1378;
                    this.field1385[this.field1389] = var10.field1385[var11] + this.field1378;
                    this.field1386[this.field1389] = var10.field1386[var11];
                    this.field1438[this.field1389] = var10.field1438[var11];
                    this.field1414[this.field1389] = var10.field1414[var11];
                    if (var3) {
                        if (var10.field1417 == null) {
                            this.field1417[this.field1389] = var10.field1393;
                        } else {
                            this.field1417[this.field1389] = var10.field1417[var11];
                        }
                    }
                    if (var4 && var10.field1390 != null) {
                        this.field1390[this.field1389] = var10.field1390[var11];
                    }
                    if (var5) {
                        if (var10.field1433 == null) {
                            this.field1433[this.field1389] = -1;
                        } else {
                            this.field1433[this.field1389] = var10.field1433[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1391 == null || var10.field1391[var11] == -1) {
                            this.field1391[this.field1389] = -1;
                        } else {
                            this.field1391[this.field1389] = (byte) (var10.field1391[var11] + this.field1394);
                        }
                    }
                    this.field1389++;
                }
                for (int var12 = 0; var12 < var10.field1394; var12++) {
                    this.field1395[this.field1394] = var10.field1395[var12] + this.field1378;
                    this.field1396[this.field1394] = var10.field1396[var12] + this.field1378;
                    this.field1381[this.field1394] = var10.field1381[var12] + this.field1378;
                    this.field1394++;
                }
                for (int var13 = 0; var13 < var10.field1378; var13++) {
                    this.field1379[this.field1378] = var10.field1379[var13];
                    this.field1387[this.field1378] = var10.field1387[var13];
                    this.field1382[this.field1378] = var10.field1382[var13];
                    this.field1378++;
                }
            }
        }
    }

    @ObfuscatedName("cf.q([[IIIIZI)Lcf;")
    public class83 method1548(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1582();
        int var7 = arg1 - this.field1431;
        int var8 = this.field1431 + arg1;
        int var9 = arg3 - this.field1431;
        int var10 = this.field1431 + arg3;
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
            var15.field1378 = this.field1378;
            var15.field1389 = this.field1389;
            var15.field1394 = this.field1394;
            var15.field1379 = this.field1379;
            var15.field1382 = this.field1382;
            var15.field1420 = this.field1420;
            var15.field1384 = this.field1384;
            var15.field1385 = this.field1385;
            var15.field1386 = this.field1386;
            var15.field1438 = this.field1438;
            var15.field1414 = this.field1414;
            var15.field1417 = this.field1417;
            var15.field1390 = this.field1390;
            var15.field1391 = this.field1391;
            var15.field1433 = this.field1433;
            var15.field1393 = this.field1393;
            var15.field1395 = this.field1395;
            var15.field1396 = this.field1396;
            var15.field1381 = this.field1381;
            var15.field1398 = this.field1398;
            var15.field1399 = this.field1399;
            var15.field1403 = this.field1403;
            var15.field1387 = new int[var15.field1378];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1378; var16++) {
                int var17 = this.field1379[var16] + arg1;
                int var18 = this.field1382[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1387[var16] = this.field1387[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1378; var26++) {
                int var27 = (-this.field1387[var26] << 16) / this.field1558;
                if (var27 < arg5) {
                    int var28 = this.field1379[var26] + arg1;
                    int var29 = this.field1382[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1387[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1387[var26];
                }
            }
        }
        var15.field1401 = 0;
        return var15;
    }

    @ObfuscatedName("cf.d(Z)Lcf;")
    public class83 method1549(boolean arg0) {
        if (!arg0 && field1392.length < this.field1389) {
            field1392 = new byte[this.field1389 + 100];
        }
        return this.method1551(arg0, field1376, field1392);
    }

    @ObfuscatedName("cf.p(Z)Lcf;")
    public class83 method1550(boolean arg0) {
        if (!arg0 && field1400.length < this.field1389) {
            field1400 = new byte[this.field1389 + 100];
        }
        return this.method1551(arg0, field1435, field1400);
    }

    @ObfuscatedName("cf.j(ZLcf;[B)Lcf;")
    public class83 method1551(boolean arg0, class83 arg1, byte[] arg2) {
        arg1.field1378 = this.field1378;
        arg1.field1389 = this.field1389;
        arg1.field1394 = this.field1394;
        if (arg1.field1379 == null || arg1.field1379.length < this.field1378) {
            arg1.field1379 = new int[this.field1378 + 100];
            arg1.field1387 = new int[this.field1378 + 100];
            arg1.field1382 = new int[this.field1378 + 100];
        }
        for (int var4 = 0; var4 < this.field1378; var4++) {
            arg1.field1379[var4] = this.field1379[var4];
            arg1.field1387[var4] = this.field1387[var4];
            arg1.field1382[var4] = this.field1382[var4];
        }
        if (arg0) {
            arg1.field1390 = this.field1390;
        } else {
            arg1.field1390 = arg2;
            if (this.field1390 == null) {
                for (int var5 = 0; var5 < this.field1389; var5++) {
                    arg1.field1390[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1389; var6++) {
                    arg1.field1390[var6] = this.field1390[var6];
                }
            }
        }
        arg1.field1420 = this.field1420;
        arg1.field1384 = this.field1384;
        arg1.field1385 = this.field1385;
        arg1.field1386 = this.field1386;
        arg1.field1438 = this.field1438;
        arg1.field1414 = this.field1414;
        arg1.field1417 = this.field1417;
        arg1.field1391 = this.field1391;
        arg1.field1433 = this.field1433;
        arg1.field1393 = this.field1393;
        arg1.field1395 = this.field1395;
        arg1.field1396 = this.field1396;
        arg1.field1381 = this.field1381;
        arg1.field1398 = this.field1398;
        arg1.field1399 = this.field1399;
        arg1.field1403 = this.field1403;
        arg1.field1401 = 0;
        return arg1;
    }

    @ObfuscatedName("cf.n()V")
    public void method1582() {
        if (this.field1401 == 1) {
            return;
        }
        this.field1401 = 1;
        this.field1558 = 0;
        this.field1413 = 0;
        this.field1431 = 0;
        for (int var1 = 0; var1 < this.field1378; var1++) {
            int var2 = this.field1379[var1];
            int var3 = this.field1387[var1];
            int var4 = this.field1382[var1];
            if (-var3 > this.field1558) {
                this.field1558 = -var3;
            }
            if (var3 > this.field1413) {
                this.field1413 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1431) {
                this.field1431 = var5;
            }
        }
        this.field1431 = (int) (Math.sqrt((double) this.field1431) + 0.99D);
        this.field1405 = (int) (Math.sqrt((double) (this.field1558 * this.field1558 + this.field1431 * this.field1431)) + 0.99D);
        this.field1404 = this.field1405 + (int) (Math.sqrt((double) (this.field1431 * this.field1431 + this.field1413 * this.field1413)) + 0.99D);
    }

    @ObfuscatedName("cf.c()V")
    public void method1561() {
        if (this.field1401 == 2) {
            return;
        }
        this.field1401 = 2;
        this.field1431 = 0;
        for (int var1 = 0; var1 < this.field1378; var1++) {
            int var2 = this.field1379[var1];
            int var3 = this.field1387[var1];
            int var4 = this.field1382[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1431) {
                this.field1431 = var5;
            }
        }
        this.field1431 = (int) (Math.sqrt((double) this.field1431) + 0.99D);
        this.field1405 = this.field1431;
        this.field1404 = this.field1431 + this.field1431;
    }

    @ObfuscatedName("cf.o()I")
    public int method1554() {
        this.method1582();
        return this.field1431;
    }

    @ObfuscatedName("cf.s(Lcu;I)V")
    public void method1595(class93 arg0, int arg1) {
        if (this.field1398 == null || arg1 == -1) {
            return;
        }
        class81 var3 = arg0.field1580[arg1];
        class87 var4 = var3.field1344;
        Statics.field1426 = 0;
        Statics.field1427 = 0;
        Statics.field1428 = 0;
        for (int var5 = 0; var5 < var3.field1343; var5++) {
            int var6 = var3.field1341[var5];
            this.method1557(var4.field1485[var6], var4.field1483[var6], var3.field1346[var5], var3.field1345[var5], var3.field1340[var5]);
        }
        this.field1401 = 0;
    }

    @ObfuscatedName("cf.u(Lcu;ILcu;I[I)V")
    public void method1556(class93 arg0, int arg1, class93 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method1595(arg0, arg1);
            return;
        }
        class81 var6 = arg0.field1580[arg1];
        class81 var7 = arg2.field1580[arg3];
        class87 var8 = var6.field1344;
        Statics.field1426 = 0;
        Statics.field1427 = 0;
        Statics.field1428 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1343; var11++) {
            int var12 = var6.field1341[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1485[var12] == 0) {
                this.method1557(var8.field1485[var12], var8.field1483[var12], var6.field1346[var11], var6.field1345[var11], var6.field1340[var11]);
            }
        }
        Statics.field1426 = 0;
        Statics.field1427 = 0;
        Statics.field1428 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1343; var15++) {
            int var16 = var7.field1341[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1485[var16] == 0) {
                this.method1557(var8.field1485[var16], var8.field1483[var16], var7.field1346[var15], var7.field1345[var15], var7.field1340[var15]);
            }
        }
        this.field1401 = 0;
    }

    @ObfuscatedName("cf.b(I[IIII)V")
    public void method1557(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1426 = 0;
            Statics.field1427 = 0;
            Statics.field1428 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1398.length) {
                    int[] var10 = this.field1398[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1426 += this.field1379[var12];
                        Statics.field1427 += this.field1387[var12];
                        Statics.field1428 += this.field1382[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1426 = Statics.field1426 / var7 + arg2;
                Statics.field1427 = Statics.field1427 / var7 + arg3;
                Statics.field1428 = Statics.field1428 / var7 + arg4;
            } else {
                Statics.field1426 = arg2;
                Statics.field1427 = arg3;
                Statics.field1428 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1398.length) {
                    int[] var15 = this.field1398[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1379[var17] += arg2;
                        this.field1387[var17] += arg3;
                        this.field1382[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1398.length) {
                    int[] var20 = this.field1398[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1379[var22] -= Statics.field1426;
                        this.field1387[var22] -= Statics.field1427;
                        this.field1382[var22] -= Statics.field1428;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1434[var25];
                            int var27 = field1380[var25];
                            int var28 = this.field1387[var22] * var26 + this.field1379[var22] * var27 >> 16;
                            this.field1387[var22] = this.field1387[var22] * var27 - this.field1379[var22] * var26 >> 16;
                            this.field1379[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1434[var23];
                            int var30 = field1380[var23];
                            int var31 = this.field1387[var22] * var30 - this.field1382[var22] * var29 >> 16;
                            this.field1382[var22] = this.field1387[var22] * var29 + this.field1382[var22] * var30 >> 16;
                            this.field1387[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1434[var24];
                            int var33 = field1380[var24];
                            int var34 = this.field1382[var22] * var32 + this.field1379[var22] * var33 >> 16;
                            this.field1382[var22] = this.field1382[var22] * var33 - this.field1379[var22] * var32 >> 16;
                            this.field1379[var22] = var34;
                        }
                        this.field1379[var22] += Statics.field1426;
                        this.field1387[var22] += Statics.field1427;
                        this.field1382[var22] += Statics.field1428;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1398.length) {
                    int[] var37 = this.field1398[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1379[var39] -= Statics.field1426;
                        this.field1387[var39] -= Statics.field1427;
                        this.field1382[var39] -= Statics.field1428;
                        this.field1379[var39] = this.field1379[var39] * arg2 / 128;
                        this.field1387[var39] = this.field1387[var39] * arg3 / 128;
                        this.field1382[var39] = this.field1382[var39] * arg4 / 128;
                        this.field1379[var39] += Statics.field1426;
                        this.field1387[var39] += Statics.field1427;
                        this.field1382[var39] += Statics.field1428;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1399 != null && this.field1390 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1399.length) {
                    int[] var42 = this.field1399[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1390[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1390[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("cf.f()V")
    public void method1558() {
        for (int var1 = 0; var1 < this.field1378; var1++) {
            int var2 = this.field1379[var1];
            this.field1379[var1] = this.field1382[var1];
            this.field1382[var1] = -var2;
        }
        this.field1401 = 0;
    }

    @ObfuscatedName("cf.z()V")
    public void method1559() {
        for (int var1 = 0; var1 < this.field1378; var1++) {
            this.field1379[var1] = -this.field1379[var1];
            this.field1382[var1] = -this.field1382[var1];
        }
        this.field1401 = 0;
    }

    @ObfuscatedName("cf.t()V")
    public void method1560() {
        for (int var1 = 0; var1 < this.field1378; var1++) {
            int var2 = this.field1382[var1];
            this.field1382[var1] = this.field1379[var1];
            this.field1379[var1] = -var2;
        }
        this.field1401 = 0;
    }

    @ObfuscatedName("cf.y(I)V")
    public void method1546(int arg0) {
        int var2 = field1434[arg0];
        int var3 = field1380[arg0];
        for (int var4 = 0; var4 < this.field1378; var4++) {
            int var5 = this.field1387[var4] * var3 - this.field1382[var4] * var2 >> 16;
            this.field1382[var4] = this.field1387[var4] * var2 + this.field1382[var4] * var3 >> 16;
            this.field1387[var4] = var5;
        }
        this.field1401 = 0;
    }

    @ObfuscatedName("cf.w(III)V")
    public void method1562(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1378; var4++) {
            this.field1379[var4] += arg0;
            this.field1387[var4] += arg1;
            this.field1382[var4] += arg2;
        }
        this.field1401 = 0;
    }

    @ObfuscatedName("cf.a(III)V")
    public void method1563(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1378; var4++) {
            this.field1379[var4] = this.field1379[var4] * arg0 / 128;
            this.field1387[var4] = this.field1387[var4] * arg1 / 128;
            this.field1382[var4] = this.field1382[var4] * arg2 / 128;
        }
        this.field1401 = 0;
    }

    @ObfuscatedName("cf.k(IIIIIII)V")
    public final void method1564(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1416[0] = -1;
        if (this.field1401 != 2 && this.field1401 != 1) {
            this.method1561();
        }
        int var8 = Statics.field1456;
        int var9 = Statics.field1457;
        int var10 = field1434[arg0];
        int var11 = field1380[arg0];
        int var12 = field1434[arg1];
        int var13 = field1380[arg1];
        int var14 = field1434[arg2];
        int var15 = field1380[arg2];
        int var16 = field1434[arg3];
        int var17 = field1380[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1378; var19++) {
            int var20 = this.field1379[var19];
            int var21 = this.field1387[var19];
            int var22 = this.field1382[var19];
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
            field1411[var19] = var30 - var18;
            field1409[var19] = class85.field1446 * var26 / var30 + var8;
            field1410[var19] = class85.field1446 * var29 / var30 + var9;
            if (this.field1394 > 0) {
                field1412[var19] = var26;
                field1419[var19] = var29;
                field1402[var19] = var30;
            }
        }
        try {
            this.method1567(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("cf.l(IIIIIIII)V")
    public final void method1565(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1416[0] = -1;
        if (this.field1401 != 2 && this.field1401 != 1) {
            this.method1561();
        }
        int var9 = Statics.field1456;
        int var10 = Statics.field1457;
        int var11 = field1434[arg0];
        int var12 = field1380[arg0];
        int var13 = field1434[arg1];
        int var14 = field1380[arg1];
        int var15 = field1434[arg2];
        int var16 = field1380[arg2];
        int var17 = field1434[arg3];
        int var18 = field1380[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1378; var20++) {
            int var21 = this.field1379[var20];
            int var22 = this.field1387[var20];
            int var23 = this.field1382[var20];
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
            field1411[var20] = var31 - var19;
            field1409[var20] = class85.field1446 * var27 / arg7 + var9;
            field1410[var20] = class85.field1446 * var30 / arg7 + var10;
            if (this.field1394 > 0) {
                field1412[var20] = var27;
                field1419[var20] = var30;
                field1402[var20] = var31;
            }
        }
        try {
            this.method1567(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("cf.cj(IIIIIIIII)V")
    public void method1566(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1416[0] = -1;
        if (this.field1401 != 1) {
            this.method1582();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1431 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1431) * class85.field1446;
        if (var15 / var13 >= Statics.field1460) {
            return;
        }
        int var16 = (this.field1431 + var14) * class85.field1446;
        if (var16 / var13 <= Statics.field1454) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1431 * arg1 >> 16;
        int var19 = (var17 + var18) * class85.field1446;
        if (var19 / var13 <= Statics.field1462) {
            return;
        }
        int var20 = (this.field1558 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class85.field1446;
        if (var21 / var13 >= Statics.field1453) {
            return;
        }
        int var22 = (this.field1558 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1394 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1429) {
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
            int var32 = field1430 - Statics.field1456;
            int var33 = field1377 - Statics.field1457;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1403) {
                    field1383[field1423++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1456;
        int var35 = Statics.field1457;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1434[arg0];
            var37 = field1380[arg0];
        }
        for (int var38 = 0; var38 < this.field1378; var38++) {
            int var39 = this.field1379[var38];
            int var40 = this.field1387[var38];
            int var41 = this.field1382[var38];
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
            field1411[var38] = var50 - var11;
            if (var50 >= 50) {
                field1409[var38] = class85.field1446 * var46 / var50 + var34;
                field1410[var38] = class85.field1446 * var49 / var50 + var35;
            } else {
                field1409[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1412[var38] = var46;
                field1419[var38] = var49;
                field1402[var38] = var50;
            }
        }
        try {
            this.method1567(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("cf.x(ZZI)V")
    public final void method1567(boolean arg0, boolean arg1, int arg2) {
        if (this.field1404 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1404; var4++) {
            field1416[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1389; var5++) {
            if (this.field1414[var5] != -2) {
                int var6 = this.field1420[var5];
                int var7 = this.field1384[var5];
                int var8 = this.field1385[var5];
                int var9 = field1409[var6];
                int var10 = field1409[var7];
                int var11 = field1409[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1412[var6];
                    int var13 = field1412[var7];
                    int var14 = field1412[var8];
                    int var15 = field1419[var6];
                    int var16 = field1419[var7];
                    int var17 = field1419[var8];
                    int var18 = field1402[var6];
                    int var19 = field1402[var7];
                    int var20 = field1402[var8];
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
                        int var30 = (field1411[var6] + field1411[var7] + field1411[var8]) / 3 + this.field1405;
                        field1432[var30][field1416[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method1570(field1430, field1377, field1410[var6], field1410[var7], field1410[var8], var9, var10, var11)) {
                        field1383[field1423++] = arg2;
                        arg1 = false;
                    }
                    if ((field1410[var8] - field1410[var7]) * (var9 - var10) - (field1410[var6] - field1410[var7]) * (var11 - var10) > 0) {
                        field1408[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1458 && var10 <= Statics.field1458 && var11 <= Statics.field1458) {
                            field1407[var5] = false;
                        } else {
                            field1407[var5] = true;
                        }
                        int var31 = (field1411[var6] + field1411[var7] + field1411[var8]) / 3 + this.field1405;
                        field1432[var31][field1416[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1417 == null) {
            for (int var32 = this.field1404 - 1; var32 >= 0; var32--) {
                int var33 = field1416[var32];
                if (var33 > 0) {
                    int[] var34 = field1432[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method1553(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1418[var36] = 0;
            field1422[var36] = 0;
        }
        for (int var37 = this.field1404 - 1; var37 >= 0; var37--) {
            int var38 = field1416[var37];
            if (var38 > 0) {
                int[] var39 = field1432[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1417[var41];
                    int var43 = field1418[var42]++;
                    field1388[var42][var43] = var41;
                    if (var42 < 10) {
                        field1422[var42] += var37;
                    } else if (var42 == 10) {
                        field1374[var43] = var37;
                    } else {
                        field1421[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1418[1] > 0 || field1418[2] > 0) {
            var44 = (field1422[1] + field1422[2]) / (field1418[1] + field1418[2]);
        }
        int var45 = 0;
        if (field1418[3] > 0 || field1418[4] > 0) {
            var45 = (field1422[3] + field1422[4]) / (field1418[3] + field1418[4]);
        }
        int var46 = 0;
        if (field1418[6] > 0 || field1418[8] > 0) {
            var46 = (field1422[6] + field1422[8]) / (field1418[6] + field1418[8]);
        }
        int var47 = 0;
        int var48 = field1418[10];
        int[] var49 = field1388[10];
        int[] var50 = field1374;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1418[11];
            var49 = field1388[11];
            var50 = field1421;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method1553(var49[var47++]);
                if (var47 == var48 && field1388[11] != var49) {
                    var47 = 0;
                    var48 = field1418[11];
                    var49 = field1388[11];
                    var50 = field1421;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method1553(var49[var47++]);
                if (var47 == var48 && field1388[11] != var49) {
                    var47 = 0;
                    var48 = field1418[11];
                    var49 = field1388[11];
                    var50 = field1421;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method1553(var49[var47++]);
                if (var47 == var48 && field1388[11] != var49) {
                    var47 = 0;
                    var48 = field1418[11];
                    var49 = field1388[11];
                    var50 = field1421;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1418[var52];
            int[] var54 = field1388[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method1553(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method1553(var49[var47++]);
            if (var47 == var48 && field1388[11] != var49) {
                var47 = 0;
                var49 = field1388[11];
                var48 = field1418[11];
                var50 = field1421;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("cf.g(I)V")
    public final void method1553(int arg0) {
        if (field1408[arg0]) {
            this.method1569(arg0);
            return;
        }
        int var2 = this.field1420[arg0];
        int var3 = this.field1384[arg0];
        int var4 = this.field1385[arg0];
        class85.field1459 = field1407[arg0];
        if (this.field1390 == null) {
            class85.field1470 = 0;
        } else {
            class85.field1470 = this.field1390[arg0] & 0xFF;
        }
        if (this.field1433 != null && this.field1433[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1391 == null || this.field1391[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1391[arg0] & 0xFF;
                var6 = this.field1395[var5];
                var7 = this.field1396[var5];
                var8 = this.field1381[var5];
            }
            if (this.field1414[arg0] == -1) {
                class85.method1634(field1410[var2], field1410[var3], field1410[var4], field1409[var2], field1409[var3], field1409[var4], this.field1386[arg0], this.field1386[arg0], this.field1386[arg0], field1412[var6], field1412[var7], field1412[var8], field1419[var6], field1419[var7], field1419[var8], field1402[var6], field1402[var7], field1402[var8], this.field1433[arg0]);
            } else {
                class85.method1634(field1410[var2], field1410[var3], field1410[var4], field1409[var2], field1409[var3], field1409[var4], this.field1386[arg0], this.field1438[arg0], this.field1414[arg0], field1412[var6], field1412[var7], field1412[var8], field1419[var6], field1419[var7], field1419[var8], field1402[var6], field1402[var7], field1402[var8], this.field1433[arg0]);
            }
        } else if (this.field1414[arg0] == -1) {
            class85.method1632(field1410[var2], field1410[var3], field1410[var4], field1409[var2], field1409[var3], field1409[var4], field1436[this.field1386[arg0]]);
        } else {
            class85.method1630(field1410[var2], field1410[var3], field1410[var4], field1409[var2], field1409[var3], field1409[var4], this.field1386[arg0], this.field1438[arg0], this.field1414[arg0]);
        }
    }

    @ObfuscatedName("cf.e(I)V")
    public final void method1569(int arg0) {
        int var2 = Statics.field1456;
        int var3 = Statics.field1457;
        int var4 = 0;
        int var5 = this.field1420[arg0];
        int var6 = this.field1384[arg0];
        int var7 = this.field1385[arg0];
        int var8 = field1402[var5];
        int var9 = field1402[var6];
        int var10 = field1402[var7];
        if (this.field1390 == null) {
            class85.field1470 = 0;
        } else {
            class85.field1470 = this.field1390[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1397[var4] = field1409[var5];
            field1424[var4] = field1410[var5];
            field1425[var4++] = this.field1386[arg0];
        } else {
            int var11 = field1412[var5];
            int var12 = field1419[var5];
            int var13 = this.field1386[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1437[var10 - var8];
                field1397[var4] = (((field1412[var7] - var11) * var14 >> 16) + var11) * class85.field1446 / 50 + var2;
                field1424[var4] = (((field1419[var7] - var12) * var14 >> 16) + var12) * class85.field1446 / 50 + var3;
                field1425[var4++] = ((this.field1414[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1437[var9 - var8];
                field1397[var4] = (((field1412[var6] - var11) * var15 >> 16) + var11) * class85.field1446 / 50 + var2;
                field1424[var4] = (((field1419[var6] - var12) * var15 >> 16) + var12) * class85.field1446 / 50 + var3;
                field1425[var4++] = ((this.field1438[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1397[var4] = field1409[var6];
            field1424[var4] = field1410[var6];
            field1425[var4++] = this.field1438[arg0];
        } else {
            int var16 = field1412[var6];
            int var17 = field1419[var6];
            int var18 = this.field1438[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1437[var8 - var9];
                field1397[var4] = (((field1412[var5] - var16) * var19 >> 16) + var16) * class85.field1446 / 50 + var2;
                field1424[var4] = (((field1419[var5] - var17) * var19 >> 16) + var17) * class85.field1446 / 50 + var3;
                field1425[var4++] = ((this.field1386[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1437[var10 - var9];
                field1397[var4] = (((field1412[var7] - var16) * var20 >> 16) + var16) * class85.field1446 / 50 + var2;
                field1424[var4] = (((field1419[var7] - var17) * var20 >> 16) + var17) * class85.field1446 / 50 + var3;
                field1425[var4++] = ((this.field1414[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1397[var4] = field1409[var7];
            field1424[var4] = field1410[var7];
            field1425[var4++] = this.field1414[arg0];
        } else {
            int var21 = field1412[var7];
            int var22 = field1419[var7];
            int var23 = this.field1414[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1437[var9 - var10];
                field1397[var4] = (((field1412[var6] - var21) * var24 >> 16) + var21) * class85.field1446 / 50 + var2;
                field1424[var4] = (((field1419[var6] - var22) * var24 >> 16) + var22) * class85.field1446 / 50 + var3;
                field1425[var4++] = ((this.field1438[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1437[var8 - var10];
                field1397[var4] = (((field1412[var5] - var21) * var25 >> 16) + var21) * class85.field1446 / 50 + var2;
                field1424[var4] = (((field1419[var5] - var22) * var25 >> 16) + var22) * class85.field1446 / 50 + var3;
                field1425[var4++] = ((this.field1386[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1397[0];
        int var27 = field1397[1];
        int var28 = field1397[2];
        int var29 = field1424[0];
        int var30 = field1424[1];
        int var31 = field1424[2];
        class85.field1459 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1458 || var27 > Statics.field1458 || var28 > Statics.field1458) {
                class85.field1459 = true;
            }
            if (this.field1433 != null && this.field1433[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1391 == null || this.field1391[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1391[arg0] & 0xFF;
                    var33 = this.field1395[var32];
                    var34 = this.field1396[var32];
                    var35 = this.field1381[var32];
                }
                if (this.field1414[arg0] == -1) {
                    class85.method1634(var29, var30, var31, var26, var27, var28, this.field1386[arg0], this.field1386[arg0], this.field1386[arg0], field1412[var33], field1412[var34], field1412[var35], field1419[var33], field1419[var34], field1419[var35], field1402[var33], field1402[var34], field1402[var35], this.field1433[arg0]);
                } else {
                    class85.method1634(var29, var30, var31, var26, var27, var28, field1425[0], field1425[1], field1425[2], field1412[var33], field1412[var34], field1412[var35], field1419[var33], field1419[var34], field1419[var35], field1402[var33], field1402[var34], field1402[var35], this.field1433[arg0]);
                }
            } else if (this.field1414[arg0] == -1) {
                class85.method1632(var29, var30, var31, var26, var27, var28, field1436[this.field1386[arg0]]);
            } else {
                class85.method1630(var29, var30, var31, var26, var27, var28, field1425[0], field1425[1], field1425[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1458 || var27 > Statics.field1458 || var28 > Statics.field1458 || field1397[3] < 0 || field1397[3] > Statics.field1458) {
            class85.field1459 = true;
        }
        if (this.field1433 != null && this.field1433[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1391 == null || this.field1391[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1391[arg0] & 0xFF;
                var37 = this.field1395[var36];
                var38 = this.field1396[var36];
                var39 = this.field1381[var36];
            }
            short var40 = this.field1433[arg0];
            if (this.field1414[arg0] == -1) {
                class85.method1634(var29, var30, var31, var26, var27, var28, this.field1386[arg0], this.field1386[arg0], this.field1386[arg0], field1412[var37], field1412[var38], field1412[var39], field1419[var37], field1419[var38], field1419[var39], field1402[var37], field1402[var38], field1402[var39], var40);
                class85.method1634(var29, var31, field1424[3], var26, var28, field1397[3], this.field1386[arg0], this.field1386[arg0], this.field1386[arg0], field1412[var37], field1412[var38], field1412[var39], field1419[var37], field1419[var38], field1419[var39], field1402[var37], field1402[var38], field1402[var39], var40);
            } else {
                class85.method1634(var29, var30, var31, var26, var27, var28, field1425[0], field1425[1], field1425[2], field1412[var37], field1412[var38], field1412[var39], field1419[var37], field1419[var38], field1419[var39], field1402[var37], field1402[var38], field1402[var39], var40);
                class85.method1634(var29, var31, field1424[3], var26, var28, field1397[3], field1425[0], field1425[2], field1425[3], field1412[var37], field1412[var38], field1412[var39], field1419[var37], field1419[var38], field1419[var39], field1402[var37], field1402[var38], field1402[var39], var40);
            }
        } else if (this.field1414[arg0] == -1) {
            int var41 = field1436[this.field1386[arg0]];
            class85.method1632(var29, var30, var31, var26, var27, var28, var41);
            class85.method1632(var29, var31, field1424[3], var26, var28, field1397[3], var41);
        } else {
            class85.method1630(var29, var30, var31, var26, var27, var28, field1425[0], field1425[1], field1425[2]);
            class85.method1630(var29, var31, field1424[3], var26, var28, field1397[3], field1425[0], field1425[2], field1425[3]);
        }
    }

    @ObfuscatedName("cf.ae(IIIIIIII)Z")
    public final boolean method1570(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
