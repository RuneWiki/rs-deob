package deob;

@ObfuscatedName("cj")
public class class83 extends class90 {

    @ObfuscatedName("cj.x")
    public static class83 field1378 = new class83();

    @ObfuscatedName("cj.n")
    public static byte[] field1367 = new byte[1];

    @ObfuscatedName("cj.g")
    public static class83 field1368 = new class83();

    @ObfuscatedName("cj.v")
    public static byte[] field1431 = new byte[1];

    @ObfuscatedName("cj.y")
    public int field1370 = 0;

    @ObfuscatedName("cj.p")
    public int[] field1403;

    @ObfuscatedName("cj.j")
    public int[] field1372;

    @ObfuscatedName("cj.m")
    public int[] field1373;

    @ObfuscatedName("cj.a")
    public int field1385 = 0;

    @ObfuscatedName("cj.i")
    public int[] field1425;

    @ObfuscatedName("cj.s")
    public int[] field1376;

    @ObfuscatedName("cj.k")
    public int[] field1408;

    @ObfuscatedName("cj.f")
    public int[] field1413;

    @ObfuscatedName("cj.o")
    public int[] field1417;

    @ObfuscatedName("cj.q")
    public int[] field1380;

    @ObfuscatedName("cj.c")
    public byte[] field1384;

    @ObfuscatedName("cj.b")
    public byte[] field1382;

    @ObfuscatedName("cj.w")
    public byte[] field1383;

    @ObfuscatedName("cj.l")
    public short[] field1375;

    @ObfuscatedName("cj.r")
    public byte field1397 = 0;

    @ObfuscatedName("cj.u")
    public int field1386 = 0;

    @ObfuscatedName("cj.e")
    public int[] field1387;

    @ObfuscatedName("cj.h")
    public int[] field1388;

    @ObfuscatedName("cj.d")
    public int[] field1381;

    @ObfuscatedName("cj.z")
    public int[][] field1390;

    @ObfuscatedName("cj.t")
    public int[][] field1391;

    @ObfuscatedName("cj.ab")
    public boolean field1389 = false;

    @ObfuscatedName("cj.ac")
    public int field1393;

    @ObfuscatedName("cj.au")
    public int field1394;

    @ObfuscatedName("cj.al")
    public int field1395;

    @ObfuscatedName("cj.ae")
    public int field1396;

    @ObfuscatedName("cj.ad")
    public int field1426;

    @ObfuscatedName("cj.aa")
    public static boolean[] field1423 = new boolean[4700];

    @ObfuscatedName("cj.af")
    public static boolean[] field1400 = new boolean[4700];

    @ObfuscatedName("cj.as")
    public static int[] field1401 = new int[4700];

    @ObfuscatedName("cj.ao")
    public static int[] field1402 = new int[4700];

    @ObfuscatedName("cj.ax")
    public static int[] field1379 = new int[4700];

    @ObfuscatedName("cj.an")
    public static int[] field1404 = new int[4700];

    @ObfuscatedName("cj.ag")
    public static int[] field1405 = new int[4700];

    @ObfuscatedName("cj.aj")
    public static int[] field1406 = new int[4700];

    @ObfuscatedName("cj.az")
    public static int[] field1366 = new int[1600];

    @ObfuscatedName("cj.av")
    public static int[][] field1409 = new int[1600][512];

    @ObfuscatedName("cj.ap")
    public static int[] field1399 = new int[12];

    @ObfuscatedName("cj.aw")
    public static int[][] field1377 = new int[12][2000];

    @ObfuscatedName("cj.ay")
    public static int[] field1412 = new int[2000];

    @ObfuscatedName("cj.ai")
    public static int[] field1392 = new int[2000];

    @ObfuscatedName("cj.at")
    public static int[] field1414 = new int[12];

    @ObfuscatedName("cj.ah")
    public static int[] field1415 = new int[10];

    @ObfuscatedName("cj.am")
    public static int[] field1416 = new int[10];

    @ObfuscatedName("cj.ak")
    public static int[] field1422 = new int[10];

    @ObfuscatedName("cj.bi")
    public static boolean field1374 = false;

    @ObfuscatedName("cj.br")
    public static int field1411 = 0;

    @ObfuscatedName("cj.bn")
    public static int field1369 = 0;

    @ObfuscatedName("cj.bx")
    public static int field1424 = 0;

    @ObfuscatedName("cj.bl")
    public static int[] field1421 = new int[1000];

    @ObfuscatedName("cj.be")
    public static int[] field1371 = class85.field1461;

    @ObfuscatedName("cj.bv")
    public static int[] field1427 = class85.field1447;

    @ObfuscatedName("cj.bu")
    public static int[] field1428 = class85.field1462;

    @ObfuscatedName("cj.bb")
    public static int[] field1429 = class85.field1460;

    public class83() {
    }

    public class83(class83[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1370 = 0;
        this.field1385 = 0;
        this.field1386 = 0;
        this.field1397 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class83 var8 = arg0[var7];
            if (var8 != null) {
                this.field1370 += var8.field1370;
                this.field1385 += var8.field1385;
                this.field1386 += var8.field1386;
                if (var8.field1384 == null) {
                    if (this.field1397 == -1) {
                        this.field1397 = var8.field1397;
                    }
                    if (this.field1397 != var8.field1397) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1382 != null;
                var5 |= var8.field1375 != null;
                var6 |= var8.field1383 != null;
            }
        }
        this.field1403 = new int[this.field1370];
        this.field1372 = new int[this.field1370];
        this.field1373 = new int[this.field1370];
        this.field1425 = new int[this.field1385];
        this.field1376 = new int[this.field1385];
        this.field1408 = new int[this.field1385];
        this.field1413 = new int[this.field1385];
        this.field1417 = new int[this.field1385];
        this.field1380 = new int[this.field1385];
        if (var3) {
            this.field1384 = new byte[this.field1385];
        }
        if (var4) {
            this.field1382 = new byte[this.field1385];
        }
        if (var5) {
            this.field1375 = new short[this.field1385];
        }
        if (var6) {
            this.field1383 = new byte[this.field1385];
        }
        if (this.field1386 > 0) {
            this.field1387 = new int[this.field1386];
            this.field1388 = new int[this.field1386];
            this.field1381 = new int[this.field1386];
        }
        this.field1370 = 0;
        this.field1385 = 0;
        this.field1386 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class83 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1385; var11++) {
                    this.field1425[this.field1385] = var10.field1425[var11] + this.field1370;
                    this.field1376[this.field1385] = var10.field1376[var11] + this.field1370;
                    this.field1408[this.field1385] = var10.field1408[var11] + this.field1370;
                    this.field1413[this.field1385] = var10.field1413[var11];
                    this.field1417[this.field1385] = var10.field1417[var11];
                    this.field1380[this.field1385] = var10.field1380[var11];
                    if (var3) {
                        if (var10.field1384 == null) {
                            this.field1384[this.field1385] = var10.field1397;
                        } else {
                            this.field1384[this.field1385] = var10.field1384[var11];
                        }
                    }
                    if (var4 && var10.field1382 != null) {
                        this.field1382[this.field1385] = var10.field1382[var11];
                    }
                    if (var5) {
                        if (var10.field1375 == null) {
                            this.field1375[this.field1385] = -1;
                        } else {
                            this.field1375[this.field1385] = var10.field1375[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1383 == null || var10.field1383[var11] == -1) {
                            this.field1383[this.field1385] = -1;
                        } else {
                            this.field1383[this.field1385] = (byte) (var10.field1383[var11] + this.field1386);
                        }
                    }
                    this.field1385++;
                }
                for (int var12 = 0; var12 < var10.field1386; var12++) {
                    this.field1387[this.field1386] = var10.field1387[var12] + this.field1370;
                    this.field1388[this.field1386] = var10.field1388[var12] + this.field1370;
                    this.field1381[this.field1386] = var10.field1381[var12] + this.field1370;
                    this.field1386++;
                }
                for (int var13 = 0; var13 < var10.field1370; var13++) {
                    this.field1403[this.field1370] = var10.field1403[var13];
                    this.field1372[this.field1370] = var10.field1372[var13];
                    this.field1373[this.field1370] = var10.field1373[var13];
                    this.field1370++;
                }
            }
        }
    }

    @ObfuscatedName("cj.x([[IIIIZI)Lcj;")
    public class83 method1576(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1571();
        int var7 = arg1 - this.field1395;
        int var8 = this.field1395 + arg1;
        int var9 = arg3 - this.field1395;
        int var10 = this.field1395 + arg3;
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
            var15.field1370 = this.field1370;
            var15.field1385 = this.field1385;
            var15.field1386 = this.field1386;
            var15.field1403 = this.field1403;
            var15.field1373 = this.field1373;
            var15.field1425 = this.field1425;
            var15.field1376 = this.field1376;
            var15.field1408 = this.field1408;
            var15.field1413 = this.field1413;
            var15.field1417 = this.field1417;
            var15.field1380 = this.field1380;
            var15.field1384 = this.field1384;
            var15.field1382 = this.field1382;
            var15.field1383 = this.field1383;
            var15.field1375 = this.field1375;
            var15.field1397 = this.field1397;
            var15.field1387 = this.field1387;
            var15.field1388 = this.field1388;
            var15.field1381 = this.field1381;
            var15.field1390 = this.field1390;
            var15.field1391 = this.field1391;
            var15.field1389 = this.field1389;
            var15.field1372 = new int[var15.field1370];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1370; var16++) {
                int var17 = this.field1403[var16] + arg1;
                int var18 = this.field1373[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1372[var16] = this.field1372[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1370; var26++) {
                int var27 = (-this.field1372[var26] << 16) / this.field1551;
                if (var27 < arg5) {
                    int var28 = this.field1403[var26] + arg1;
                    int var29 = this.field1373[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1372[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1372[var26];
                }
            }
        }
        var15.field1393 = 0;
        return var15;
    }

    @ObfuscatedName("cj.n(Z)Lcj;")
    public class83 method1619(boolean arg0) {
        if (!arg0 && field1367.length < this.field1385) {
            field1367 = new byte[this.field1385 + 100];
        }
        return this.method1586(arg0, field1378, field1367);
    }

    @ObfuscatedName("cj.v(Z)Lcj;")
    public class83 method1569(boolean arg0) {
        if (!arg0 && field1431.length < this.field1385) {
            field1431 = new byte[this.field1385 + 100];
        }
        return this.method1586(arg0, field1368, field1431);
    }

    @ObfuscatedName("cj.y(ZLcj;[B)Lcj;")
    public class83 method1586(boolean arg0, class83 arg1, byte[] arg2) {
        arg1.field1370 = this.field1370;
        arg1.field1385 = this.field1385;
        arg1.field1386 = this.field1386;
        if (arg1.field1403 == null || arg1.field1403.length < this.field1370) {
            arg1.field1403 = new int[this.field1370 + 100];
            arg1.field1372 = new int[this.field1370 + 100];
            arg1.field1373 = new int[this.field1370 + 100];
        }
        for (int var4 = 0; var4 < this.field1370; var4++) {
            arg1.field1403[var4] = this.field1403[var4];
            arg1.field1372[var4] = this.field1372[var4];
            arg1.field1373[var4] = this.field1373[var4];
        }
        if (arg0) {
            arg1.field1382 = this.field1382;
        } else {
            arg1.field1382 = arg2;
            if (this.field1382 == null) {
                for (int var5 = 0; var5 < this.field1385; var5++) {
                    arg1.field1382[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1385; var6++) {
                    arg1.field1382[var6] = this.field1382[var6];
                }
            }
        }
        arg1.field1425 = this.field1425;
        arg1.field1376 = this.field1376;
        arg1.field1408 = this.field1408;
        arg1.field1413 = this.field1413;
        arg1.field1417 = this.field1417;
        arg1.field1380 = this.field1380;
        arg1.field1384 = this.field1384;
        arg1.field1383 = this.field1383;
        arg1.field1375 = this.field1375;
        arg1.field1397 = this.field1397;
        arg1.field1387 = this.field1387;
        arg1.field1388 = this.field1388;
        arg1.field1381 = this.field1381;
        arg1.field1390 = this.field1390;
        arg1.field1391 = this.field1391;
        arg1.field1389 = this.field1389;
        arg1.field1393 = 0;
        return arg1;
    }

    @ObfuscatedName("cj.p()V")
    public void method1571() {
        if (this.field1393 == 1) {
            return;
        }
        this.field1393 = 1;
        this.field1551 = 0;
        this.field1394 = 0;
        this.field1395 = 0;
        for (int var1 = 0; var1 < this.field1370; var1++) {
            int var2 = this.field1403[var1];
            int var3 = this.field1372[var1];
            int var4 = this.field1373[var1];
            if (-var3 > this.field1551) {
                this.field1551 = -var3;
            }
            if (var3 > this.field1394) {
                this.field1394 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1395) {
                this.field1395 = var5;
            }
        }
        this.field1395 = (int) (Math.sqrt((double) this.field1395) + 0.99D);
        this.field1426 = (int) (Math.sqrt((double) (this.field1551 * this.field1551 + this.field1395 * this.field1395)) + 0.99D);
        this.field1396 = this.field1426 + (int) (Math.sqrt((double) (this.field1395 * this.field1395 + this.field1394 * this.field1394)) + 0.99D);
    }

    @ObfuscatedName("cj.j()V")
    public void method1572() {
        if (this.field1393 == 2) {
            return;
        }
        this.field1393 = 2;
        this.field1395 = 0;
        for (int var1 = 0; var1 < this.field1370; var1++) {
            int var2 = this.field1403[var1];
            int var3 = this.field1372[var1];
            int var4 = this.field1373[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1395) {
                this.field1395 = var5;
            }
        }
        this.field1395 = (int) (Math.sqrt((double) this.field1395) + 0.99D);
        this.field1426 = this.field1395;
        this.field1396 = this.field1395 + this.field1395;
    }

    @ObfuscatedName("cj.s()I")
    public int method1573() {
        this.method1571();
        return this.field1395;
    }

    @ObfuscatedName("cj.k(Lcs;I)V")
    public void method1574(class93 arg0, int arg1) {
        if (this.field1390 == null || arg1 == -1) {
            return;
        }
        class81 var3 = arg0.field1582[arg1];
        class87 var4 = var3.field1328;
        Statics.field1418 = 0;
        Statics.field1419 = 0;
        Statics.field1420 = 0;
        for (int var5 = 0; var5 < var3.field1332; var5++) {
            int var6 = var3.field1330[var5];
            this.method1581(var4.field1472[var6], var4.field1474[var6], var3.field1335[var5], var3.field1336[var5], var3.field1334[var5]);
        }
        this.field1393 = 0;
    }

    @ObfuscatedName("cj.f(Lcs;ILcs;I[I)V")
    public void method1575(class93 arg0, int arg1, class93 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method1574(arg0, arg1);
            return;
        }
        class81 var6 = arg0.field1582[arg1];
        class81 var7 = arg2.field1582[arg3];
        class87 var8 = var6.field1328;
        Statics.field1418 = 0;
        Statics.field1419 = 0;
        Statics.field1420 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1332; var11++) {
            int var12 = var6.field1330[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1472[var12] == 0) {
                this.method1581(var8.field1472[var12], var8.field1474[var12], var6.field1335[var11], var6.field1336[var11], var6.field1334[var11]);
            }
        }
        Statics.field1418 = 0;
        Statics.field1419 = 0;
        Statics.field1420 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1332; var15++) {
            int var16 = var7.field1330[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1472[var16] == 0) {
                this.method1581(var8.field1472[var16], var8.field1474[var16], var7.field1335[var15], var7.field1336[var15], var7.field1334[var15]);
            }
        }
        this.field1393 = 0;
    }

    @ObfuscatedName("cj.o(I[IIII)V")
    public void method1581(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1418 = 0;
            Statics.field1419 = 0;
            Statics.field1420 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1390.length) {
                    int[] var10 = this.field1390[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1418 += this.field1403[var12];
                        Statics.field1419 += this.field1372[var12];
                        Statics.field1420 += this.field1373[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1418 = Statics.field1418 / var7 + arg2;
                Statics.field1419 = Statics.field1419 / var7 + arg3;
                Statics.field1420 = Statics.field1420 / var7 + arg4;
            } else {
                Statics.field1418 = arg2;
                Statics.field1419 = arg3;
                Statics.field1420 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1390.length) {
                    int[] var15 = this.field1390[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1403[var17] += arg2;
                        this.field1372[var17] += arg3;
                        this.field1373[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1390.length) {
                    int[] var20 = this.field1390[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1403[var22] -= Statics.field1418;
                        this.field1372[var22] -= Statics.field1419;
                        this.field1373[var22] -= Statics.field1420;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1371[var25];
                            int var27 = field1427[var25];
                            int var28 = this.field1403[var22] * var27 + this.field1372[var22] * var26 >> 16;
                            this.field1372[var22] = this.field1372[var22] * var27 - this.field1403[var22] * var26 >> 16;
                            this.field1403[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1371[var23];
                            int var30 = field1427[var23];
                            int var31 = this.field1372[var22] * var30 - this.field1373[var22] * var29 >> 16;
                            this.field1373[var22] = this.field1373[var22] * var30 + this.field1372[var22] * var29 >> 16;
                            this.field1372[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1371[var24];
                            int var33 = field1427[var24];
                            int var34 = this.field1403[var22] * var33 + this.field1373[var22] * var32 >> 16;
                            this.field1373[var22] = this.field1373[var22] * var33 - this.field1403[var22] * var32 >> 16;
                            this.field1403[var22] = var34;
                        }
                        this.field1403[var22] += Statics.field1418;
                        this.field1372[var22] += Statics.field1419;
                        this.field1373[var22] += Statics.field1420;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1390.length) {
                    int[] var37 = this.field1390[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1403[var39] -= Statics.field1418;
                        this.field1372[var39] -= Statics.field1419;
                        this.field1373[var39] -= Statics.field1420;
                        this.field1403[var39] = this.field1403[var39] * arg2 / 128;
                        this.field1372[var39] = this.field1372[var39] * arg3 / 128;
                        this.field1373[var39] = this.field1373[var39] * arg4 / 128;
                        this.field1403[var39] += Statics.field1418;
                        this.field1372[var39] += Statics.field1419;
                        this.field1373[var39] += Statics.field1420;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1391 != null && this.field1382 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1391.length) {
                    int[] var42 = this.field1391[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1382[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1382[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("cj.q()V")
    public void method1640() {
        for (int var1 = 0; var1 < this.field1370; var1++) {
            int var2 = this.field1403[var1];
            this.field1403[var1] = this.field1373[var1];
            this.field1373[var1] = -var2;
        }
        this.field1393 = 0;
    }

    @ObfuscatedName("cj.c()V")
    public void method1622() {
        for (int var1 = 0; var1 < this.field1370; var1++) {
            this.field1403[var1] = -this.field1403[var1];
            this.field1373[var1] = -this.field1373[var1];
        }
        this.field1393 = 0;
    }

    @ObfuscatedName("cj.l()V")
    public void method1641() {
        for (int var1 = 0; var1 < this.field1370; var1++) {
            int var2 = this.field1373[var1];
            this.field1373[var1] = this.field1403[var1];
            this.field1403[var1] = -var2;
        }
        this.field1393 = 0;
    }

    @ObfuscatedName("cj.r(I)V")
    public void method1598(int arg0) {
        int var2 = field1371[arg0];
        int var3 = field1427[arg0];
        for (int var4 = 0; var4 < this.field1370; var4++) {
            int var5 = this.field1372[var4] * var3 - this.field1373[var4] * var2 >> 16;
            this.field1373[var4] = this.field1373[var4] * var3 + this.field1372[var4] * var2 >> 16;
            this.field1372[var4] = var5;
        }
        this.field1393 = 0;
    }

    @ObfuscatedName("cj.u(III)V")
    public void method1616(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1370; var4++) {
            this.field1403[var4] += arg0;
            this.field1372[var4] += arg1;
            this.field1373[var4] += arg2;
        }
        this.field1393 = 0;
    }

    @ObfuscatedName("cj.e(III)V")
    public void method1582(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1370; var4++) {
            this.field1403[var4] = this.field1403[var4] * arg0 / 128;
            this.field1372[var4] = this.field1372[var4] * arg1 / 128;
            this.field1373[var4] = this.field1373[var4] * arg2 / 128;
        }
        this.field1393 = 0;
    }

    @ObfuscatedName("cj.h(IIIIIII)V")
    public final void method1583(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1366[0] = -1;
        if (this.field1393 != 2 && this.field1393 != 1) {
            this.method1572();
        }
        int var8 = Statics.field1448;
        int var9 = Statics.field1449;
        int var10 = field1371[arg0];
        int var11 = field1427[arg0];
        int var12 = field1371[arg1];
        int var13 = field1427[arg1];
        int var14 = field1371[arg2];
        int var15 = field1427[arg2];
        int var16 = field1371[arg3];
        int var17 = field1427[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1370; var19++) {
            int var20 = this.field1403[var19];
            int var21 = this.field1372[var19];
            int var22 = this.field1373[var19];
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
            field1379[var19] = var30 - var18;
            field1401[var19] = class85.field1454 * var26 / var30 + var8;
            field1402[var19] = class85.field1454 * var29 / var30 + var9;
            if (this.field1386 > 0) {
                field1404[var19] = var26;
                field1405[var19] = var29;
                field1406[var19] = var30;
            }
        }
        try {
            this.method1600(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("cj.d(IIIIIIII)V")
    public final void method1584(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1366[0] = -1;
        if (this.field1393 != 2 && this.field1393 != 1) {
            this.method1572();
        }
        int var9 = Statics.field1448;
        int var10 = Statics.field1449;
        int var11 = field1371[arg0];
        int var12 = field1427[arg0];
        int var13 = field1371[arg1];
        int var14 = field1427[arg1];
        int var15 = field1371[arg2];
        int var16 = field1427[arg2];
        int var17 = field1371[arg3];
        int var18 = field1427[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1370; var20++) {
            int var21 = this.field1403[var20];
            int var22 = this.field1372[var20];
            int var23 = this.field1373[var20];
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
            field1379[var20] = var31 - var19;
            field1401[var20] = class85.field1454 * var27 / arg7 + var9;
            field1402[var20] = class85.field1454 * var30 / arg7 + var10;
            if (this.field1386 > 0) {
                field1404[var20] = var27;
                field1405[var20] = var30;
                field1406[var20] = var31;
            }
        }
        try {
            this.method1600(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("cj.ca(IIIIIIIII)V")
    public void method1568(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1366[0] = -1;
        if (this.field1393 != 1) {
            this.method1571();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1395 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1395) * class85.field1454;
        if (var15 / var13 >= Statics.field1453) {
            return;
        }
        int var16 = (this.field1395 + var14) * class85.field1454;
        if (var16 / var13 <= Statics.field1451) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1395 * arg1 >> 16;
        int var19 = (var17 + var18) * class85.field1454;
        if (var19 / var13 <= Statics.field1452) {
            return;
        }
        int var20 = (this.field1551 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class85.field1454;
        if (var21 / var13 >= Statics.field1459) {
            return;
        }
        int var22 = (this.field1551 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1386 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1374) {
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
            int var32 = field1411 - Statics.field1448;
            int var33 = field1369 - Statics.field1449;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1389) {
                    field1421[field1424++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1448;
        int var35 = Statics.field1449;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1371[arg0];
            var37 = field1427[arg0];
        }
        for (int var38 = 0; var38 < this.field1370; var38++) {
            int var39 = this.field1403[var38];
            int var40 = this.field1372[var38];
            int var41 = this.field1373[var38];
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
            field1379[var38] = var50 - var11;
            if (var50 >= 50) {
                field1401[var38] = class85.field1454 * var46 / var50 + var34;
                field1402[var38] = class85.field1454 * var49 / var50 + var35;
            } else {
                field1401[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1404[var38] = var46;
                field1405[var38] = var49;
                field1406[var38] = var50;
            }
        }
        try {
            this.method1600(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("cj.z(ZZI)V")
    public final void method1600(boolean arg0, boolean arg1, int arg2) {
        if (this.field1396 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1396; var4++) {
            field1366[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1385; var5++) {
            if (this.field1380[var5] != -2) {
                int var6 = this.field1425[var5];
                int var7 = this.field1376[var5];
                int var8 = this.field1408[var5];
                int var9 = field1401[var6];
                int var10 = field1401[var7];
                int var11 = field1401[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1404[var6];
                    int var13 = field1404[var7];
                    int var14 = field1404[var8];
                    int var15 = field1405[var6];
                    int var16 = field1405[var7];
                    int var17 = field1405[var8];
                    int var18 = field1406[var6];
                    int var19 = field1406[var7];
                    int var20 = field1406[var8];
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
                        field1400[var5] = true;
                        int var30 = (field1379[var6] + field1379[var7] + field1379[var8]) / 3 + this.field1426;
                        field1409[var30][field1366[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method1589(field1411, field1369, field1402[var6], field1402[var7], field1402[var8], var9, var10, var11)) {
                        field1421[field1424++] = arg2;
                        arg1 = false;
                    }
                    if ((field1402[var8] - field1402[var7]) * (var9 - var10) - (field1402[var6] - field1402[var7]) * (var11 - var10) > 0) {
                        field1400[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1450 && var10 <= Statics.field1450 && var11 <= Statics.field1450) {
                            field1423[var5] = false;
                        } else {
                            field1423[var5] = true;
                        }
                        int var31 = (field1379[var6] + field1379[var7] + field1379[var8]) / 3 + this.field1426;
                        field1409[var31][field1366[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1384 == null) {
            for (int var32 = this.field1396 - 1; var32 >= 0; var32--) {
                int var33 = field1366[var32];
                if (var33 > 0) {
                    int[] var34 = field1409[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method1587(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1399[var36] = 0;
            field1414[var36] = 0;
        }
        for (int var37 = this.field1396 - 1; var37 >= 0; var37--) {
            int var38 = field1366[var37];
            if (var38 > 0) {
                int[] var39 = field1409[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1384[var41];
                    int var43 = field1399[var42]++;
                    field1377[var42][var43] = var41;
                    if (var42 < 10) {
                        field1414[var42] += var37;
                    } else if (var42 == 10) {
                        field1412[var43] = var37;
                    } else {
                        field1392[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1399[1] > 0 || field1399[2] > 0) {
            var44 = (field1414[1] + field1414[2]) / (field1399[1] + field1399[2]);
        }
        int var45 = 0;
        if (field1399[3] > 0 || field1399[4] > 0) {
            var45 = (field1414[3] + field1414[4]) / (field1399[3] + field1399[4]);
        }
        int var46 = 0;
        if (field1399[6] > 0 || field1399[8] > 0) {
            var46 = (field1414[6] + field1414[8]) / (field1399[6] + field1399[8]);
        }
        int var47 = 0;
        int var48 = field1399[10];
        int[] var49 = field1377[10];
        int[] var50 = field1412;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1399[11];
            var49 = field1377[11];
            var50 = field1392;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method1587(var49[var47++]);
                if (var47 == var48 && field1377[11] != var49) {
                    var47 = 0;
                    var48 = field1399[11];
                    var49 = field1377[11];
                    var50 = field1392;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method1587(var49[var47++]);
                if (var47 == var48 && field1377[11] != var49) {
                    var47 = 0;
                    var48 = field1399[11];
                    var49 = field1377[11];
                    var50 = field1392;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method1587(var49[var47++]);
                if (var47 == var48 && field1377[11] != var49) {
                    var47 = 0;
                    var48 = field1399[11];
                    var49 = field1377[11];
                    var50 = field1392;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1399[var52];
            int[] var54 = field1377[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method1587(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method1587(var49[var47++]);
            if (var47 == var48 && field1377[11] != var49) {
                var47 = 0;
                var49 = field1377[11];
                var48 = field1399[11];
                var50 = field1392;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("cj.t(I)V")
    public final void method1587(int arg0) {
        if (field1400[arg0]) {
            this.method1639(arg0);
            return;
        }
        int var2 = this.field1425[arg0];
        int var3 = this.field1376[arg0];
        int var4 = this.field1408[arg0];
        class85.field1457 = field1423[arg0];
        if (this.field1382 == null) {
            class85.field1442 = 0;
        } else {
            class85.field1442 = this.field1382[arg0] & 0xFF;
        }
        if (this.field1375 != null && this.field1375[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1383 == null || this.field1383[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1383[arg0] & 0xFF;
                var6 = this.field1387[var5];
                var7 = this.field1388[var5];
                var8 = this.field1381[var5];
            }
            if (this.field1380[arg0] == -1) {
                class85.method1658(field1402[var2], field1402[var3], field1402[var4], field1401[var2], field1401[var3], field1401[var4], this.field1413[arg0], this.field1413[arg0], this.field1413[arg0], field1404[var6], field1404[var7], field1404[var8], field1405[var6], field1405[var7], field1405[var8], field1406[var6], field1406[var7], field1406[var8], this.field1375[arg0]);
            } else {
                class85.method1658(field1402[var2], field1402[var3], field1402[var4], field1401[var2], field1401[var3], field1401[var4], this.field1413[arg0], this.field1417[arg0], this.field1380[arg0], field1404[var6], field1404[var7], field1404[var8], field1405[var6], field1405[var7], field1405[var8], field1406[var6], field1406[var7], field1406[var8], this.field1375[arg0]);
            }
        } else if (this.field1380[arg0] == -1) {
            class85.method1656(field1402[var2], field1402[var3], field1402[var4], field1401[var2], field1401[var3], field1401[var4], field1428[this.field1413[arg0]]);
        } else {
            class85.method1654(field1402[var2], field1402[var3], field1402[var4], field1401[var2], field1401[var3], field1401[var4], this.field1413[arg0], this.field1417[arg0], this.field1380[arg0]);
        }
    }

    @ObfuscatedName("cj.ab(I)V")
    public final void method1639(int arg0) {
        int var2 = Statics.field1448;
        int var3 = Statics.field1449;
        int var4 = 0;
        int var5 = this.field1425[arg0];
        int var6 = this.field1376[arg0];
        int var7 = this.field1408[arg0];
        int var8 = field1406[var5];
        int var9 = field1406[var6];
        int var10 = field1406[var7];
        if (this.field1382 == null) {
            class85.field1442 = 0;
        } else {
            class85.field1442 = this.field1382[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1415[var4] = field1401[var5];
            field1416[var4] = field1402[var5];
            field1422[var4++] = this.field1413[arg0];
        } else {
            int var11 = field1404[var5];
            int var12 = field1405[var5];
            int var13 = this.field1413[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1429[var10 - var8];
                field1415[var4] = (((field1404[var7] - var11) * var14 >> 16) + var11) * class85.field1454 / 50 + var2;
                field1416[var4] = (((field1405[var7] - var12) * var14 >> 16) + var12) * class85.field1454 / 50 + var3;
                field1422[var4++] = ((this.field1380[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1429[var9 - var8];
                field1415[var4] = (((field1404[var6] - var11) * var15 >> 16) + var11) * class85.field1454 / 50 + var2;
                field1416[var4] = (((field1405[var6] - var12) * var15 >> 16) + var12) * class85.field1454 / 50 + var3;
                field1422[var4++] = ((this.field1417[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1415[var4] = field1401[var6];
            field1416[var4] = field1402[var6];
            field1422[var4++] = this.field1417[arg0];
        } else {
            int var16 = field1404[var6];
            int var17 = field1405[var6];
            int var18 = this.field1417[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1429[var8 - var9];
                field1415[var4] = (((field1404[var5] - var16) * var19 >> 16) + var16) * class85.field1454 / 50 + var2;
                field1416[var4] = (((field1405[var5] - var17) * var19 >> 16) + var17) * class85.field1454 / 50 + var3;
                field1422[var4++] = ((this.field1413[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1429[var10 - var9];
                field1415[var4] = (((field1404[var7] - var16) * var20 >> 16) + var16) * class85.field1454 / 50 + var2;
                field1416[var4] = (((field1405[var7] - var17) * var20 >> 16) + var17) * class85.field1454 / 50 + var3;
                field1422[var4++] = ((this.field1380[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1415[var4] = field1401[var7];
            field1416[var4] = field1402[var7];
            field1422[var4++] = this.field1380[arg0];
        } else {
            int var21 = field1404[var7];
            int var22 = field1405[var7];
            int var23 = this.field1380[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1429[var9 - var10];
                field1415[var4] = (((field1404[var6] - var21) * var24 >> 16) + var21) * class85.field1454 / 50 + var2;
                field1416[var4] = (((field1405[var6] - var22) * var24 >> 16) + var22) * class85.field1454 / 50 + var3;
                field1422[var4++] = ((this.field1417[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1429[var8 - var10];
                field1415[var4] = (((field1404[var5] - var21) * var25 >> 16) + var21) * class85.field1454 / 50 + var2;
                field1416[var4] = (((field1405[var5] - var22) * var25 >> 16) + var22) * class85.field1454 / 50 + var3;
                field1422[var4++] = ((this.field1413[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1415[0];
        int var27 = field1415[1];
        int var28 = field1415[2];
        int var29 = field1416[0];
        int var30 = field1416[1];
        int var31 = field1416[2];
        class85.field1457 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1450 || var27 > Statics.field1450 || var28 > Statics.field1450) {
                class85.field1457 = true;
            }
            if (this.field1375 != null && this.field1375[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1383 == null || this.field1383[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1383[arg0] & 0xFF;
                    var33 = this.field1387[var32];
                    var34 = this.field1388[var32];
                    var35 = this.field1381[var32];
                }
                if (this.field1380[arg0] == -1) {
                    class85.method1658(var29, var30, var31, var26, var27, var28, this.field1413[arg0], this.field1413[arg0], this.field1413[arg0], field1404[var33], field1404[var34], field1404[var35], field1405[var33], field1405[var34], field1405[var35], field1406[var33], field1406[var34], field1406[var35], this.field1375[arg0]);
                } else {
                    class85.method1658(var29, var30, var31, var26, var27, var28, field1422[0], field1422[1], field1422[2], field1404[var33], field1404[var34], field1404[var35], field1405[var33], field1405[var34], field1405[var35], field1406[var33], field1406[var34], field1406[var35], this.field1375[arg0]);
                }
            } else if (this.field1380[arg0] == -1) {
                class85.method1656(var29, var30, var31, var26, var27, var28, field1428[this.field1413[arg0]]);
            } else {
                class85.method1654(var29, var30, var31, var26, var27, var28, field1422[0], field1422[1], field1422[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1450 || var27 > Statics.field1450 || var28 > Statics.field1450 || field1415[3] < 0 || field1415[3] > Statics.field1450) {
            class85.field1457 = true;
        }
        if (this.field1375 != null && this.field1375[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1383 == null || this.field1383[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1383[arg0] & 0xFF;
                var37 = this.field1387[var36];
                var38 = this.field1388[var36];
                var39 = this.field1381[var36];
            }
            short var40 = this.field1375[arg0];
            if (this.field1380[arg0] == -1) {
                class85.method1658(var29, var30, var31, var26, var27, var28, this.field1413[arg0], this.field1413[arg0], this.field1413[arg0], field1404[var37], field1404[var38], field1404[var39], field1405[var37], field1405[var38], field1405[var39], field1406[var37], field1406[var38], field1406[var39], var40);
                class85.method1658(var29, var31, field1416[3], var26, var28, field1415[3], this.field1413[arg0], this.field1413[arg0], this.field1413[arg0], field1404[var37], field1404[var38], field1404[var39], field1405[var37], field1405[var38], field1405[var39], field1406[var37], field1406[var38], field1406[var39], var40);
            } else {
                class85.method1658(var29, var30, var31, var26, var27, var28, field1422[0], field1422[1], field1422[2], field1404[var37], field1404[var38], field1404[var39], field1405[var37], field1405[var38], field1405[var39], field1406[var37], field1406[var38], field1406[var39], var40);
                class85.method1658(var29, var31, field1416[3], var26, var28, field1415[3], field1422[0], field1422[2], field1422[3], field1404[var37], field1404[var38], field1404[var39], field1405[var37], field1405[var38], field1405[var39], field1406[var37], field1406[var38], field1406[var39], var40);
            }
        } else if (this.field1380[arg0] == -1) {
            int var41 = field1428[this.field1413[arg0]];
            class85.method1656(var29, var30, var31, var26, var27, var28, var41);
            class85.method1656(var29, var31, field1416[3], var26, var28, field1415[3], var41);
        } else {
            class85.method1654(var29, var30, var31, var26, var27, var28, field1422[0], field1422[1], field1422[2]);
            class85.method1654(var29, var31, field1416[3], var26, var28, field1415[3], field1422[0], field1422[2], field1422[3]);
        }
    }

    @ObfuscatedName("cj.ac(IIIIIIII)Z")
    public final boolean method1589(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
