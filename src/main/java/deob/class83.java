package deob;

@ObfuscatedName("ce")
public class class83 extends class90 {

    @ObfuscatedName("ce.f")
    public static class83 field1391 = new class83();

    @ObfuscatedName("ce.i")
    public static byte[] field1435 = new byte[1];

    @ObfuscatedName("ce.u")
    public static class83 field1379 = new class83();

    @ObfuscatedName("ce.h")
    public static byte[] field1380 = new byte[1];

    @ObfuscatedName("ce.r")
    public int field1381 = 0;

    @ObfuscatedName("ce.o")
    public int[] field1433;

    @ObfuscatedName("ce.l")
    public int[] field1383;

    @ObfuscatedName("ce.n")
    public int[] field1384;

    @ObfuscatedName("ce.m")
    public int field1385 = 0;

    @ObfuscatedName("ce.w")
    public int[] field1386;

    @ObfuscatedName("ce.j")
    public int[] field1415;

    @ObfuscatedName("ce.s")
    public int[] field1377;

    @ObfuscatedName("ce.q")
    public int[] field1389;

    @ObfuscatedName("ce.d")
    public int[] field1390;

    @ObfuscatedName("ce.p")
    public int[] field1378;

    @ObfuscatedName("ce.y")
    public byte[] field1404;

    @ObfuscatedName("ce.a")
    public byte[] field1393;

    @ObfuscatedName("ce.v")
    public byte[] field1388;

    @ObfuscatedName("ce.z")
    public short[] field1400;

    @ObfuscatedName("ce.x")
    public byte field1387 = 0;

    @ObfuscatedName("ce.g")
    public int field1402 = 0;

    @ObfuscatedName("ce.b")
    public int[] field1398;

    @ObfuscatedName("ce.k")
    public int[] field1399;

    @ObfuscatedName("ce.t")
    public int[] field1407;

    @ObfuscatedName("ce.c")
    public int[][] field1401;

    @ObfuscatedName("ce.e")
    public int[][] field1406;

    @ObfuscatedName("ce.am")
    public boolean field1410 = false;

    @ObfuscatedName("ce.an")
    public int field1397;

    @ObfuscatedName("ce.aq")
    public int field1405;

    @ObfuscatedName("ce.ah")
    public int field1417;

    @ObfuscatedName("ce.ag")
    public int field1441;

    @ObfuscatedName("ce.ab")
    public int field1408;

    @ObfuscatedName("ce.ax")
    public static boolean[] field1439 = new boolean[4700];

    @ObfuscatedName("ce.ar")
    public static boolean[] field1411 = new boolean[4700];

    @ObfuscatedName("ce.ak")
    public static int[] field1412 = new int[4700];

    @ObfuscatedName("ce.ai")
    public static int[] field1413 = new int[4700];

    @ObfuscatedName("ce.ap")
    public static int[] field1382 = new int[4700];

    @ObfuscatedName("ce.au")
    public static int[] field1394 = new int[4700];

    @ObfuscatedName("ce.aj")
    public static int[] field1416 = new int[4700];

    @ObfuscatedName("ce.at")
    public static int[] field1395 = new int[4700];

    @ObfuscatedName("ce.av")
    public static int[] field1419 = new int[1600];

    @ObfuscatedName("ce.ao")
    public static int[][] field1420 = new int[1600][512];

    @ObfuscatedName("ce.ae")
    public static int[] field1421 = new int[12];

    @ObfuscatedName("ce.aa")
    public static int[][] field1418 = new int[12][2000];

    @ObfuscatedName("ce.as")
    public static int[] field1396 = new int[2000];

    @ObfuscatedName("ce.al")
    public static int[] field1424 = new int[2000];

    @ObfuscatedName("ce.az")
    public static int[] field1425 = new int[12];

    @ObfuscatedName("ce.ay")
    public static int[] field1426 = new int[10];

    @ObfuscatedName("ce.ac")
    public static int[] field1427 = new int[10];

    @ObfuscatedName("ce.af")
    public static int[] field1428 = new int[10];

    @ObfuscatedName("ce.br")
    public static boolean field1432 = false;

    @ObfuscatedName("ce.bk")
    public static int field1409 = 0;

    @ObfuscatedName("ce.bu")
    public static int field1434 = 0;

    @ObfuscatedName("ce.by")
    public static int field1422 = 0;

    @ObfuscatedName("ce.bl")
    public static int[] field1436 = new int[1000];

    @ObfuscatedName("ce.bv")
    public static int[] field1437 = class85.field1476;

    @ObfuscatedName("ce.bb")
    public static int[] field1438 = class85.field1470;

    @ObfuscatedName("ce.bq")
    public static int[] field1423 = class85.field1467;

    @ObfuscatedName("ce.bf")
    public static int[] field1440 = class85.field1475;

    public class83() {
    }

    public class83(class83[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1381 = 0;
        this.field1385 = 0;
        this.field1402 = 0;
        this.field1387 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class83 var8 = arg0[var7];
            if (var8 != null) {
                this.field1381 += var8.field1381;
                this.field1385 += var8.field1385;
                this.field1402 += var8.field1402;
                if (var8.field1404 == null) {
                    if (this.field1387 == -1) {
                        this.field1387 = var8.field1387;
                    }
                    if (this.field1387 != var8.field1387) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1393 != null;
                var5 |= var8.field1400 != null;
                var6 |= var8.field1388 != null;
            }
        }
        this.field1433 = new int[this.field1381];
        this.field1383 = new int[this.field1381];
        this.field1384 = new int[this.field1381];
        this.field1386 = new int[this.field1385];
        this.field1415 = new int[this.field1385];
        this.field1377 = new int[this.field1385];
        this.field1389 = new int[this.field1385];
        this.field1390 = new int[this.field1385];
        this.field1378 = new int[this.field1385];
        if (var3) {
            this.field1404 = new byte[this.field1385];
        }
        if (var4) {
            this.field1393 = new byte[this.field1385];
        }
        if (var5) {
            this.field1400 = new short[this.field1385];
        }
        if (var6) {
            this.field1388 = new byte[this.field1385];
        }
        if (this.field1402 > 0) {
            this.field1398 = new int[this.field1402];
            this.field1399 = new int[this.field1402];
            this.field1407 = new int[this.field1402];
        }
        this.field1381 = 0;
        this.field1385 = 0;
        this.field1402 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class83 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1385; var11++) {
                    this.field1386[this.field1385] = var10.field1386[var11] + this.field1381;
                    this.field1415[this.field1385] = var10.field1415[var11] + this.field1381;
                    this.field1377[this.field1385] = var10.field1377[var11] + this.field1381;
                    this.field1389[this.field1385] = var10.field1389[var11];
                    this.field1390[this.field1385] = var10.field1390[var11];
                    this.field1378[this.field1385] = var10.field1378[var11];
                    if (var3) {
                        if (var10.field1404 == null) {
                            this.field1404[this.field1385] = var10.field1387;
                        } else {
                            this.field1404[this.field1385] = var10.field1404[var11];
                        }
                    }
                    if (var4 && var10.field1393 != null) {
                        this.field1393[this.field1385] = var10.field1393[var11];
                    }
                    if (var5) {
                        if (var10.field1400 == null) {
                            this.field1400[this.field1385] = -1;
                        } else {
                            this.field1400[this.field1385] = var10.field1400[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1388 == null || var10.field1388[var11] == -1) {
                            this.field1388[this.field1385] = -1;
                        } else {
                            this.field1388[this.field1385] = (byte) (var10.field1388[var11] + this.field1402);
                        }
                    }
                    this.field1385++;
                }
                for (int var12 = 0; var12 < var10.field1402; var12++) {
                    this.field1398[this.field1402] = var10.field1398[var12] + this.field1381;
                    this.field1399[this.field1402] = var10.field1399[var12] + this.field1381;
                    this.field1407[this.field1402] = var10.field1407[var12] + this.field1381;
                    this.field1402++;
                }
                for (int var13 = 0; var13 < var10.field1381; var13++) {
                    this.field1433[this.field1381] = var10.field1433[var13];
                    this.field1383[this.field1381] = var10.field1383[var13];
                    this.field1384[this.field1381] = var10.field1384[var13];
                    this.field1381++;
                }
            }
        }
    }

    @ObfuscatedName("ce.f([[IIIIZI)Lce;")
    public class83 method1496(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1556();
        int var7 = arg1 - this.field1417;
        int var8 = this.field1417 + arg1;
        int var9 = arg3 - this.field1417;
        int var10 = this.field1417 + arg3;
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
            var15.field1381 = this.field1381;
            var15.field1385 = this.field1385;
            var15.field1402 = this.field1402;
            var15.field1433 = this.field1433;
            var15.field1384 = this.field1384;
            var15.field1386 = this.field1386;
            var15.field1415 = this.field1415;
            var15.field1377 = this.field1377;
            var15.field1389 = this.field1389;
            var15.field1390 = this.field1390;
            var15.field1378 = this.field1378;
            var15.field1404 = this.field1404;
            var15.field1393 = this.field1393;
            var15.field1388 = this.field1388;
            var15.field1400 = this.field1400;
            var15.field1387 = this.field1387;
            var15.field1398 = this.field1398;
            var15.field1399 = this.field1399;
            var15.field1407 = this.field1407;
            var15.field1401 = this.field1401;
            var15.field1406 = this.field1406;
            var15.field1410 = this.field1410;
            var15.field1383 = new int[var15.field1381];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1381; var16++) {
                int var17 = this.field1433[var16] + arg1;
                int var18 = this.field1384[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1383[var16] = this.field1383[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1381; var26++) {
                int var27 = (-this.field1383[var26] << 16) / this.field1564;
                if (var27 < arg5) {
                    int var28 = this.field1433[var26] + arg1;
                    int var29 = this.field1384[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1383[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1383[var26];
                }
            }
        }
        var15.field1397 = 0;
        return var15;
    }

    @ObfuscatedName("ce.i(Z)Lce;")
    public class83 method1497(boolean arg0) {
        if (!arg0 && field1435.length < this.field1385) {
            field1435 = new byte[this.field1385 + 100];
        }
        return this.method1499(arg0, field1391, field1435);
    }

    @ObfuscatedName("ce.r(Z)Lce;")
    public class83 method1498(boolean arg0) {
        if (!arg0 && field1380.length < this.field1385) {
            field1380 = new byte[this.field1385 + 100];
        }
        return this.method1499(arg0, field1379, field1380);
    }

    @ObfuscatedName("ce.o(ZLce;[B)Lce;")
    public class83 method1499(boolean arg0, class83 arg1, byte[] arg2) {
        arg1.field1381 = this.field1381;
        arg1.field1385 = this.field1385;
        arg1.field1402 = this.field1402;
        if (arg1.field1433 == null || arg1.field1433.length < this.field1381) {
            arg1.field1433 = new int[this.field1381 + 100];
            arg1.field1383 = new int[this.field1381 + 100];
            arg1.field1384 = new int[this.field1381 + 100];
        }
        for (int var4 = 0; var4 < this.field1381; var4++) {
            arg1.field1433[var4] = this.field1433[var4];
            arg1.field1383[var4] = this.field1383[var4];
            arg1.field1384[var4] = this.field1384[var4];
        }
        if (arg0) {
            arg1.field1393 = this.field1393;
        } else {
            arg1.field1393 = arg2;
            if (this.field1393 == null) {
                for (int var5 = 0; var5 < this.field1385; var5++) {
                    arg1.field1393[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1385; var6++) {
                    arg1.field1393[var6] = this.field1393[var6];
                }
            }
        }
        arg1.field1386 = this.field1386;
        arg1.field1415 = this.field1415;
        arg1.field1377 = this.field1377;
        arg1.field1389 = this.field1389;
        arg1.field1390 = this.field1390;
        arg1.field1378 = this.field1378;
        arg1.field1404 = this.field1404;
        arg1.field1388 = this.field1388;
        arg1.field1400 = this.field1400;
        arg1.field1387 = this.field1387;
        arg1.field1398 = this.field1398;
        arg1.field1399 = this.field1399;
        arg1.field1407 = this.field1407;
        arg1.field1401 = this.field1401;
        arg1.field1406 = this.field1406;
        arg1.field1410 = this.field1410;
        arg1.field1397 = 0;
        return arg1;
    }

    @ObfuscatedName("ce.l()V")
    public void method1556() {
        if (this.field1397 == 1) {
            return;
        }
        this.field1397 = 1;
        this.field1564 = 0;
        this.field1405 = 0;
        this.field1417 = 0;
        for (int var1 = 0; var1 < this.field1381; var1++) {
            int var2 = this.field1433[var1];
            int var3 = this.field1383[var1];
            int var4 = this.field1384[var1];
            if (-var3 > this.field1564) {
                this.field1564 = -var3;
            }
            if (var3 > this.field1405) {
                this.field1405 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1417) {
                this.field1417 = var5;
            }
        }
        this.field1417 = (int) (Math.sqrt((double) this.field1417) + 0.99D);
        this.field1408 = (int) (Math.sqrt((double) (this.field1564 * this.field1564 + this.field1417 * this.field1417)) + 0.99D);
        this.field1441 = this.field1408 + (int) (Math.sqrt((double) (this.field1417 * this.field1417 + this.field1405 * this.field1405)) + 0.99D);
    }

    @ObfuscatedName("ce.n()V")
    public void method1571() {
        if (this.field1397 == 2) {
            return;
        }
        this.field1397 = 2;
        this.field1417 = 0;
        for (int var1 = 0; var1 < this.field1381; var1++) {
            int var2 = this.field1433[var1];
            int var3 = this.field1383[var1];
            int var4 = this.field1384[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1417) {
                this.field1417 = var5;
            }
        }
        this.field1417 = (int) (Math.sqrt((double) this.field1417) + 0.99D);
        this.field1408 = this.field1417;
        this.field1441 = this.field1417 + this.field1417;
    }

    @ObfuscatedName("ce.m()I")
    public int method1502() {
        this.method1556();
        return this.field1417;
    }

    @ObfuscatedName("ce.w(Lcc;I)V")
    public void method1501(class93 arg0, int arg1) {
        if (this.field1401 == null || arg1 == -1) {
            return;
        }
        class81 var3 = arg0.field1596[arg1];
        class87 var4 = var3.field1343;
        Statics.field1429 = 0;
        Statics.field1430 = 0;
        Statics.field1431 = 0;
        for (int var5 = 0; var5 < var3.field1344; var5++) {
            int var6 = var3.field1342[var5];
            this.method1574(var4.field1490[var6], var4.field1491[var6], var3.field1346[var5], var3.field1347[var5], var3.field1348[var5]);
        }
        this.field1397 = 0;
    }

    @ObfuscatedName("ce.j(Lcc;ILcc;I[I)V")
    public void method1559(class93 arg0, int arg1, class93 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method1501(arg0, arg1);
            return;
        }
        class81 var6 = arg0.field1596[arg1];
        class81 var7 = arg2.field1596[arg3];
        class87 var8 = var6.field1343;
        Statics.field1429 = 0;
        Statics.field1430 = 0;
        Statics.field1431 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1344; var11++) {
            int var12 = var6.field1342[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1490[var12] == 0) {
                this.method1574(var8.field1490[var12], var8.field1491[var12], var6.field1346[var11], var6.field1347[var11], var6.field1348[var11]);
            }
        }
        Statics.field1429 = 0;
        Statics.field1430 = 0;
        Statics.field1431 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1344; var15++) {
            int var16 = var7.field1342[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1490[var16] == 0) {
                this.method1574(var8.field1490[var16], var8.field1491[var16], var7.field1346[var15], var7.field1347[var15], var7.field1348[var15]);
            }
        }
        this.field1397 = 0;
    }

    @ObfuscatedName("ce.s(I[IIII)V")
    public void method1574(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1429 = 0;
            Statics.field1430 = 0;
            Statics.field1431 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1401.length) {
                    int[] var10 = this.field1401[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1429 += this.field1433[var12];
                        Statics.field1430 += this.field1383[var12];
                        Statics.field1431 += this.field1384[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1429 = Statics.field1429 / var7 + arg2;
                Statics.field1430 = Statics.field1430 / var7 + arg3;
                Statics.field1431 = Statics.field1431 / var7 + arg4;
            } else {
                Statics.field1429 = arg2;
                Statics.field1430 = arg3;
                Statics.field1431 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1401.length) {
                    int[] var15 = this.field1401[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1433[var17] += arg2;
                        this.field1383[var17] += arg3;
                        this.field1384[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1401.length) {
                    int[] var20 = this.field1401[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1433[var22] -= Statics.field1429;
                        this.field1383[var22] -= Statics.field1430;
                        this.field1384[var22] -= Statics.field1431;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1437[var25];
                            int var27 = field1438[var25];
                            int var28 = this.field1433[var22] * var27 + this.field1383[var22] * var26 >> 16;
                            this.field1383[var22] = this.field1383[var22] * var27 - this.field1433[var22] * var26 >> 16;
                            this.field1433[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1437[var23];
                            int var30 = field1438[var23];
                            int var31 = this.field1383[var22] * var30 - this.field1384[var22] * var29 >> 16;
                            this.field1384[var22] = this.field1384[var22] * var30 + this.field1383[var22] * var29 >> 16;
                            this.field1383[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1437[var24];
                            int var33 = field1438[var24];
                            int var34 = this.field1433[var22] * var33 + this.field1384[var22] * var32 >> 16;
                            this.field1384[var22] = this.field1384[var22] * var33 - this.field1433[var22] * var32 >> 16;
                            this.field1433[var22] = var34;
                        }
                        this.field1433[var22] += Statics.field1429;
                        this.field1383[var22] += Statics.field1430;
                        this.field1384[var22] += Statics.field1431;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1401.length) {
                    int[] var37 = this.field1401[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1433[var39] -= Statics.field1429;
                        this.field1383[var39] -= Statics.field1430;
                        this.field1384[var39] -= Statics.field1431;
                        this.field1433[var39] = this.field1433[var39] * arg2 / 128;
                        this.field1383[var39] = this.field1383[var39] * arg3 / 128;
                        this.field1384[var39] = this.field1384[var39] * arg4 / 128;
                        this.field1433[var39] += Statics.field1429;
                        this.field1383[var39] += Statics.field1430;
                        this.field1384[var39] += Statics.field1431;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1406 != null && this.field1393 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1406.length) {
                    int[] var42 = this.field1406[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1393[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1393[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ce.q()V")
    public void method1569() {
        for (int var1 = 0; var1 < this.field1381; var1++) {
            int var2 = this.field1433[var1];
            this.field1433[var1] = this.field1384[var1];
            this.field1384[var1] = -var2;
        }
        this.field1397 = 0;
    }

    @ObfuscatedName("ce.y()V")
    public void method1507() {
        for (int var1 = 0; var1 < this.field1381; var1++) {
            this.field1433[var1] = -this.field1433[var1];
            this.field1384[var1] = -this.field1384[var1];
        }
        this.field1397 = 0;
    }

    @ObfuscatedName("ce.a()V")
    public void method1508() {
        for (int var1 = 0; var1 < this.field1381; var1++) {
            int var2 = this.field1384[var1];
            this.field1384[var1] = this.field1433[var1];
            this.field1433[var1] = -var2;
        }
        this.field1397 = 0;
    }

    @ObfuscatedName("ce.v(I)V")
    public void method1505(int arg0) {
        int var2 = field1437[arg0];
        int var3 = field1438[arg0];
        for (int var4 = 0; var4 < this.field1381; var4++) {
            int var5 = this.field1383[var4] * var3 - this.field1384[var4] * var2 >> 16;
            this.field1384[var4] = this.field1384[var4] * var3 + this.field1383[var4] * var2 >> 16;
            this.field1383[var4] = var5;
        }
        this.field1397 = 0;
    }

    @ObfuscatedName("ce.z(III)V")
    public void method1510(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1381; var4++) {
            this.field1433[var4] += arg0;
            this.field1383[var4] += arg1;
            this.field1384[var4] += arg2;
        }
        this.field1397 = 0;
    }

    @ObfuscatedName("ce.x(III)V")
    public void method1527(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1381; var4++) {
            this.field1433[var4] = this.field1433[var4] * arg0 / 128;
            this.field1383[var4] = this.field1383[var4] * arg1 / 128;
            this.field1384[var4] = this.field1384[var4] * arg2 / 128;
        }
        this.field1397 = 0;
    }

    @ObfuscatedName("ce.g(IIIIIII)V")
    public final void method1512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1419[0] = -1;
        if (this.field1397 != 2 && this.field1397 != 1) {
            this.method1571();
        }
        int var8 = Statics.field1457;
        int var9 = Statics.field1456;
        int var10 = field1437[arg0];
        int var11 = field1438[arg0];
        int var12 = field1437[arg1];
        int var13 = field1438[arg1];
        int var14 = field1437[arg2];
        int var15 = field1438[arg2];
        int var16 = field1437[arg3];
        int var17 = field1438[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1381; var19++) {
            int var20 = this.field1433[var19];
            int var21 = this.field1383[var19];
            int var22 = this.field1384[var19];
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
            field1382[var19] = var30 - var18;
            field1412[var19] = class85.field1462 * var26 / var30 + var8;
            field1413[var19] = class85.field1462 * var29 / var30 + var9;
            if (this.field1402 > 0) {
                field1394[var19] = var26;
                field1416[var19] = var29;
                field1395[var19] = var30;
            }
        }
        try {
            this.method1514(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("ce.b(IIIIIIII)V")
    public final void method1513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1419[0] = -1;
        if (this.field1397 != 2 && this.field1397 != 1) {
            this.method1571();
        }
        int var9 = Statics.field1457;
        int var10 = Statics.field1456;
        int var11 = field1437[arg0];
        int var12 = field1438[arg0];
        int var13 = field1437[arg1];
        int var14 = field1438[arg1];
        int var15 = field1437[arg2];
        int var16 = field1438[arg2];
        int var17 = field1437[arg3];
        int var18 = field1438[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1381; var20++) {
            int var21 = this.field1433[var20];
            int var22 = this.field1383[var20];
            int var23 = this.field1384[var20];
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
            field1382[var20] = var31 - var19;
            field1412[var20] = class85.field1462 * var27 / arg7 + var9;
            field1413[var20] = class85.field1462 * var30 / arg7 + var10;
            if (this.field1402 > 0) {
                field1394[var20] = var27;
                field1416[var20] = var30;
                field1395[var20] = var31;
            }
        }
        try {
            this.method1514(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("ce.bt(IIIIIIIII)V")
    public void method1500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1419[0] = -1;
        if (this.field1397 != 1) {
            this.method1556();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1417 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1417) * class85.field1462;
        if (var15 / var13 >= Statics.field1453) {
            return;
        }
        int var16 = (this.field1417 + var14) * class85.field1462;
        if (var16 / var13 <= Statics.field1463) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1417 * arg1 >> 16;
        int var19 = (var17 + var18) * class85.field1462;
        if (var19 / var13 <= Statics.field1469) {
            return;
        }
        int var20 = (this.field1564 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class85.field1462;
        if (var21 / var13 >= Statics.field1454) {
            return;
        }
        int var22 = (this.field1564 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1402 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1432) {
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
            int var32 = field1409 - Statics.field1457;
            int var33 = field1434 - Statics.field1456;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1410) {
                    field1436[field1422++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1457;
        int var35 = Statics.field1456;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1437[arg0];
            var37 = field1438[arg0];
        }
        for (int var38 = 0; var38 < this.field1381; var38++) {
            int var39 = this.field1433[var38];
            int var40 = this.field1383[var38];
            int var41 = this.field1384[var38];
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
            field1382[var38] = var50 - var11;
            if (var50 >= 50) {
                field1412[var38] = class85.field1462 * var46 / var50 + var34;
                field1413[var38] = class85.field1462 * var49 / var50 + var35;
            } else {
                field1412[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1394[var38] = var46;
                field1416[var38] = var49;
                field1395[var38] = var50;
            }
        }
        try {
            this.method1514(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("ce.k(ZZI)V")
    public final void method1514(boolean arg0, boolean arg1, int arg2) {
        if (this.field1441 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1441; var4++) {
            field1419[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1385; var5++) {
            if (this.field1378[var5] != -2) {
                int var6 = this.field1386[var5];
                int var7 = this.field1415[var5];
                int var8 = this.field1377[var5];
                int var9 = field1412[var6];
                int var10 = field1412[var7];
                int var11 = field1412[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1394[var6];
                    int var13 = field1394[var7];
                    int var14 = field1394[var8];
                    int var15 = field1416[var6];
                    int var16 = field1416[var7];
                    int var17 = field1416[var8];
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
                        field1411[var5] = true;
                        int var30 = (field1382[var6] + field1382[var7] + field1382[var8]) / 3 + this.field1408;
                        field1420[var30][field1419[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method1517(field1409, field1434, field1413[var6], field1413[var7], field1413[var8], var9, var10, var11)) {
                        field1436[field1422++] = arg2;
                        arg1 = false;
                    }
                    if ((field1413[var8] - field1413[var7]) * (var9 - var10) - (field1413[var6] - field1413[var7]) * (var11 - var10) > 0) {
                        field1411[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1472 && var10 <= Statics.field1472 && var11 <= Statics.field1472) {
                            field1439[var5] = false;
                        } else {
                            field1439[var5] = true;
                        }
                        int var31 = (field1382[var6] + field1382[var7] + field1382[var8]) / 3 + this.field1408;
                        field1420[var31][field1419[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1404 == null) {
            for (int var32 = this.field1441 - 1; var32 >= 0; var32--) {
                int var33 = field1419[var32];
                if (var33 > 0) {
                    int[] var34 = field1420[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method1515(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1421[var36] = 0;
            field1425[var36] = 0;
        }
        for (int var37 = this.field1441 - 1; var37 >= 0; var37--) {
            int var38 = field1419[var37];
            if (var38 > 0) {
                int[] var39 = field1420[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1404[var41];
                    int var43 = field1421[var42]++;
                    field1418[var42][var43] = var41;
                    if (var42 < 10) {
                        field1425[var42] += var37;
                    } else if (var42 == 10) {
                        field1396[var43] = var37;
                    } else {
                        field1424[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1421[1] > 0 || field1421[2] > 0) {
            var44 = (field1425[1] + field1425[2]) / (field1421[1] + field1421[2]);
        }
        int var45 = 0;
        if (field1421[3] > 0 || field1421[4] > 0) {
            var45 = (field1425[3] + field1425[4]) / (field1421[3] + field1421[4]);
        }
        int var46 = 0;
        if (field1421[6] > 0 || field1421[8] > 0) {
            var46 = (field1425[6] + field1425[8]) / (field1421[6] + field1421[8]);
        }
        int var47 = 0;
        int var48 = field1421[10];
        int[] var49 = field1418[10];
        int[] var50 = field1396;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1421[11];
            var49 = field1418[11];
            var50 = field1424;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method1515(var49[var47++]);
                if (var47 == var48 && field1418[11] != var49) {
                    var47 = 0;
                    var48 = field1421[11];
                    var49 = field1418[11];
                    var50 = field1424;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method1515(var49[var47++]);
                if (var47 == var48 && field1418[11] != var49) {
                    var47 = 0;
                    var48 = field1421[11];
                    var49 = field1418[11];
                    var50 = field1424;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method1515(var49[var47++]);
                if (var47 == var48 && field1418[11] != var49) {
                    var47 = 0;
                    var48 = field1421[11];
                    var49 = field1418[11];
                    var50 = field1424;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1421[var52];
            int[] var54 = field1418[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method1515(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method1515(var49[var47++]);
            if (var47 == var48 && field1418[11] != var49) {
                var47 = 0;
                var49 = field1418[11];
                var48 = field1421[11];
                var50 = field1424;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("ce.t(I)V")
    public final void method1515(int arg0) {
        if (field1411[arg0]) {
            this.method1516(arg0);
            return;
        }
        int var2 = this.field1386[arg0];
        int var3 = this.field1415[arg0];
        int var4 = this.field1377[arg0];
        class85.field1465 = field1439[arg0];
        if (this.field1393 == null) {
            class85.field1468 = 0;
        } else {
            class85.field1468 = this.field1393[arg0] & 0xFF;
        }
        if (this.field1400 != null && this.field1400[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1388 == null || this.field1388[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1388[arg0] & 0xFF;
                var6 = this.field1398[var5];
                var7 = this.field1399[var5];
                var8 = this.field1407[var5];
            }
            if (this.field1378[arg0] == -1) {
                class85.method1610(field1413[var2], field1413[var3], field1413[var4], field1412[var2], field1412[var3], field1412[var4], this.field1389[arg0], this.field1389[arg0], this.field1389[arg0], field1394[var6], field1394[var7], field1394[var8], field1416[var6], field1416[var7], field1416[var8], field1395[var6], field1395[var7], field1395[var8], this.field1400[arg0]);
            } else {
                class85.method1610(field1413[var2], field1413[var3], field1413[var4], field1412[var2], field1412[var3], field1412[var4], this.field1389[arg0], this.field1390[arg0], this.field1378[arg0], field1394[var6], field1394[var7], field1394[var8], field1416[var6], field1416[var7], field1416[var8], field1395[var6], field1395[var7], field1395[var8], this.field1400[arg0]);
            }
        } else if (this.field1378[arg0] == -1) {
            class85.method1595(field1413[var2], field1413[var3], field1413[var4], field1412[var2], field1412[var3], field1412[var4], field1423[this.field1389[arg0]]);
        } else {
            class85.method1632(field1413[var2], field1413[var3], field1413[var4], field1412[var2], field1412[var3], field1412[var4], this.field1389[arg0], this.field1390[arg0], this.field1378[arg0]);
        }
    }

    @ObfuscatedName("ce.c(I)V")
    public final void method1516(int arg0) {
        int var2 = Statics.field1457;
        int var3 = Statics.field1456;
        int var4 = 0;
        int var5 = this.field1386[arg0];
        int var6 = this.field1415[arg0];
        int var7 = this.field1377[arg0];
        int var8 = field1395[var5];
        int var9 = field1395[var6];
        int var10 = field1395[var7];
        if (this.field1393 == null) {
            class85.field1468 = 0;
        } else {
            class85.field1468 = this.field1393[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1426[var4] = field1412[var5];
            field1427[var4] = field1413[var5];
            field1428[var4++] = this.field1389[arg0];
        } else {
            int var11 = field1394[var5];
            int var12 = field1416[var5];
            int var13 = this.field1389[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1440[var10 - var8];
                field1426[var4] = (((field1394[var7] - var11) * var14 >> 16) + var11) * class85.field1462 / 50 + var2;
                field1427[var4] = (((field1416[var7] - var12) * var14 >> 16) + var12) * class85.field1462 / 50 + var3;
                field1428[var4++] = ((this.field1378[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1440[var9 - var8];
                field1426[var4] = (((field1394[var6] - var11) * var15 >> 16) + var11) * class85.field1462 / 50 + var2;
                field1427[var4] = (((field1416[var6] - var12) * var15 >> 16) + var12) * class85.field1462 / 50 + var3;
                field1428[var4++] = ((this.field1390[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1426[var4] = field1412[var6];
            field1427[var4] = field1413[var6];
            field1428[var4++] = this.field1390[arg0];
        } else {
            int var16 = field1394[var6];
            int var17 = field1416[var6];
            int var18 = this.field1390[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1440[var8 - var9];
                field1426[var4] = (((field1394[var5] - var16) * var19 >> 16) + var16) * class85.field1462 / 50 + var2;
                field1427[var4] = (((field1416[var5] - var17) * var19 >> 16) + var17) * class85.field1462 / 50 + var3;
                field1428[var4++] = ((this.field1389[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1440[var10 - var9];
                field1426[var4] = (((field1394[var7] - var16) * var20 >> 16) + var16) * class85.field1462 / 50 + var2;
                field1427[var4] = (((field1416[var7] - var17) * var20 >> 16) + var17) * class85.field1462 / 50 + var3;
                field1428[var4++] = ((this.field1378[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1426[var4] = field1412[var7];
            field1427[var4] = field1413[var7];
            field1428[var4++] = this.field1378[arg0];
        } else {
            int var21 = field1394[var7];
            int var22 = field1416[var7];
            int var23 = this.field1378[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1440[var9 - var10];
                field1426[var4] = (((field1394[var6] - var21) * var24 >> 16) + var21) * class85.field1462 / 50 + var2;
                field1427[var4] = (((field1416[var6] - var22) * var24 >> 16) + var22) * class85.field1462 / 50 + var3;
                field1428[var4++] = ((this.field1390[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1440[var8 - var10];
                field1426[var4] = (((field1394[var5] - var21) * var25 >> 16) + var21) * class85.field1462 / 50 + var2;
                field1427[var4] = (((field1416[var5] - var22) * var25 >> 16) + var22) * class85.field1462 / 50 + var3;
                field1428[var4++] = ((this.field1389[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1426[0];
        int var27 = field1426[1];
        int var28 = field1426[2];
        int var29 = field1427[0];
        int var30 = field1427[1];
        int var31 = field1427[2];
        class85.field1465 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1472 || var27 > Statics.field1472 || var28 > Statics.field1472) {
                class85.field1465 = true;
            }
            if (this.field1400 != null && this.field1400[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1388 == null || this.field1388[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1388[arg0] & 0xFF;
                    var33 = this.field1398[var32];
                    var34 = this.field1399[var32];
                    var35 = this.field1407[var32];
                }
                if (this.field1378[arg0] == -1) {
                    class85.method1610(var29, var30, var31, var26, var27, var28, this.field1389[arg0], this.field1389[arg0], this.field1389[arg0], field1394[var33], field1394[var34], field1394[var35], field1416[var33], field1416[var34], field1416[var35], field1395[var33], field1395[var34], field1395[var35], this.field1400[arg0]);
                } else {
                    class85.method1610(var29, var30, var31, var26, var27, var28, field1428[0], field1428[1], field1428[2], field1394[var33], field1394[var34], field1394[var35], field1416[var33], field1416[var34], field1416[var35], field1395[var33], field1395[var34], field1395[var35], this.field1400[arg0]);
                }
            } else if (this.field1378[arg0] == -1) {
                class85.method1595(var29, var30, var31, var26, var27, var28, field1423[this.field1389[arg0]]);
            } else {
                class85.method1632(var29, var30, var31, var26, var27, var28, field1428[0], field1428[1], field1428[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1472 || var27 > Statics.field1472 || var28 > Statics.field1472 || field1426[3] < 0 || field1426[3] > Statics.field1472) {
            class85.field1465 = true;
        }
        if (this.field1400 != null && this.field1400[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1388 == null || this.field1388[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1388[arg0] & 0xFF;
                var37 = this.field1398[var36];
                var38 = this.field1399[var36];
                var39 = this.field1407[var36];
            }
            short var40 = this.field1400[arg0];
            if (this.field1378[arg0] == -1) {
                class85.method1610(var29, var30, var31, var26, var27, var28, this.field1389[arg0], this.field1389[arg0], this.field1389[arg0], field1394[var37], field1394[var38], field1394[var39], field1416[var37], field1416[var38], field1416[var39], field1395[var37], field1395[var38], field1395[var39], var40);
                class85.method1610(var29, var31, field1427[3], var26, var28, field1426[3], this.field1389[arg0], this.field1389[arg0], this.field1389[arg0], field1394[var37], field1394[var38], field1394[var39], field1416[var37], field1416[var38], field1416[var39], field1395[var37], field1395[var38], field1395[var39], var40);
            } else {
                class85.method1610(var29, var30, var31, var26, var27, var28, field1428[0], field1428[1], field1428[2], field1394[var37], field1394[var38], field1394[var39], field1416[var37], field1416[var38], field1416[var39], field1395[var37], field1395[var38], field1395[var39], var40);
                class85.method1610(var29, var31, field1427[3], var26, var28, field1426[3], field1428[0], field1428[2], field1428[3], field1394[var37], field1394[var38], field1394[var39], field1416[var37], field1416[var38], field1416[var39], field1395[var37], field1395[var38], field1395[var39], var40);
            }
        } else if (this.field1378[arg0] == -1) {
            int var41 = field1423[this.field1389[arg0]];
            class85.method1595(var29, var30, var31, var26, var27, var28, var41);
            class85.method1595(var29, var31, field1427[3], var26, var28, field1426[3], var41);
        } else {
            class85.method1632(var29, var30, var31, var26, var27, var28, field1428[0], field1428[1], field1428[2]);
            class85.method1632(var29, var31, field1427[3], var26, var28, field1426[3], field1428[0], field1428[2], field1428[3]);
        }
    }

    @ObfuscatedName("ce.e(IIIIIIII)Z")
    public final boolean method1517(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
