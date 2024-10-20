package deob;

@ObfuscatedName("co")
public class class83 extends class90 {

    @ObfuscatedName("co.b")
    public static class83 field1387 = new class83();

    @ObfuscatedName("co.e")
    public static byte[] field1362 = new byte[1];

    @ObfuscatedName("co.c")
    public static class83 field1363 = new class83();

    @ObfuscatedName("co.l")
    public static byte[] field1364 = new byte[1];

    @ObfuscatedName("co.y")
    public int field1365 = 0;

    @ObfuscatedName("co.j")
    public int[] field1386;

    @ObfuscatedName("co.g")
    public int[] field1367;

    @ObfuscatedName("co.s")
    public int[] field1368;

    @ObfuscatedName("co.r")
    public int field1384 = 0;

    @ObfuscatedName("co.t")
    public int[] field1411;

    @ObfuscatedName("co.k")
    public int[] field1413;

    @ObfuscatedName("co.f")
    public int[] field1371;

    @ObfuscatedName("co.a")
    public int[] field1373;

    @ObfuscatedName("co.v")
    public int[] field1374;

    @ObfuscatedName("co.d")
    public int[] field1375;

    @ObfuscatedName("co.o")
    public byte[] field1376;

    @ObfuscatedName("co.q")
    public byte[] field1377;

    @ObfuscatedName("co.i")
    public byte[] field1415;

    @ObfuscatedName("co.x")
    public short[] field1379;

    @ObfuscatedName("co.z")
    public byte field1380 = 0;

    @ObfuscatedName("co.n")
    public int field1381 = 0;

    @ObfuscatedName("co.w")
    public int[] field1382;

    @ObfuscatedName("co.h")
    public int[] field1418;

    @ObfuscatedName("co.u")
    public int[] field1361;

    @ObfuscatedName("co.m")
    public int[][] field1385;

    @ObfuscatedName("co.p")
    public int[][] field1420;

    @ObfuscatedName("co.aq")
    public boolean field1397 = false;

    @ObfuscatedName("co.aj")
    public int field1388;

    @ObfuscatedName("co.ae")
    public int field1406;

    @ObfuscatedName("co.au")
    public int field1390;

    @ObfuscatedName("co.aa")
    public int field1391;

    @ObfuscatedName("co.af")
    public int field1392;

    @ObfuscatedName("co.ap")
    public static boolean[] field1383 = new boolean[4700];

    @ObfuscatedName("co.aw")
    public static boolean[] field1395 = new boolean[4700];

    @ObfuscatedName("co.ah")
    public static int[] field1396 = new int[4700];

    @ObfuscatedName("co.ao")
    public static int[] field1370 = new int[4700];

    @ObfuscatedName("co.ag")
    public static int[] field1398 = new int[4700];

    @ObfuscatedName("co.az")
    public static int[] field1399 = new int[4700];

    @ObfuscatedName("co.ai")
    public static int[] field1400 = new int[4700];

    @ObfuscatedName("co.as")
    public static int[] field1401 = new int[4700];

    @ObfuscatedName("co.an")
    public static int[] field1403 = new int[1600];

    @ObfuscatedName("co.av")
    public static int[][] field1404 = new int[1600][512];

    @ObfuscatedName("co.ab")
    public static int[] field1405 = new int[12];

    @ObfuscatedName("co.ay")
    public static int[][] field1378 = new int[12][2000];

    @ObfuscatedName("co.am")
    public static int[] field1407 = new int[2000];

    @ObfuscatedName("co.ar")
    public static int[] field1394 = new int[2000];

    @ObfuscatedName("co.ad")
    public static int[] field1409 = new int[12];

    @ObfuscatedName("co.ax")
    public static int[] field1410 = new int[10];

    @ObfuscatedName("co.ac")
    public static int[] field1419 = new int[10];

    @ObfuscatedName("co.al")
    public static int[] field1412 = new int[10];

    @ObfuscatedName("co.bo")
    public static boolean field1416 = false;

    @ObfuscatedName("co.ba")
    public static int field1417 = 0;

    @ObfuscatedName("co.bf")
    public static int field1421 = 0;

    @ObfuscatedName("co.be")
    public static int field1426 = 0;

    @ObfuscatedName("co.bq")
    public static int[] field1425 = new int[1000];

    @ObfuscatedName("co.bv")
    public static int[] field1366 = class85.field1460;

    @ObfuscatedName("co.bc")
    public static int[] field1422 = class85.field1461;

    @ObfuscatedName("co.bh")
    public static int[] field1423 = class85.field1456;

    @ObfuscatedName("co.bg")
    public static int[] field1424 = class85.field1459;

    public class83() {
    }

    public class83(class83[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1365 = 0;
        this.field1384 = 0;
        this.field1381 = 0;
        this.field1380 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class83 var8 = arg0[var7];
            if (var8 != null) {
                this.field1365 += var8.field1365;
                this.field1384 += var8.field1384;
                this.field1381 += var8.field1381;
                if (var8.field1376 == null) {
                    if (this.field1380 == -1) {
                        this.field1380 = var8.field1380;
                    }
                    if (this.field1380 != var8.field1380) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1377 != null;
                var5 |= var8.field1379 != null;
                var6 |= var8.field1415 != null;
            }
        }
        this.field1386 = new int[this.field1365];
        this.field1367 = new int[this.field1365];
        this.field1368 = new int[this.field1365];
        this.field1411 = new int[this.field1384];
        this.field1413 = new int[this.field1384];
        this.field1371 = new int[this.field1384];
        this.field1373 = new int[this.field1384];
        this.field1374 = new int[this.field1384];
        this.field1375 = new int[this.field1384];
        if (var3) {
            this.field1376 = new byte[this.field1384];
        }
        if (var4) {
            this.field1377 = new byte[this.field1384];
        }
        if (var5) {
            this.field1379 = new short[this.field1384];
        }
        if (var6) {
            this.field1415 = new byte[this.field1384];
        }
        if (this.field1381 > 0) {
            this.field1382 = new int[this.field1381];
            this.field1418 = new int[this.field1381];
            this.field1361 = new int[this.field1381];
        }
        this.field1365 = 0;
        this.field1384 = 0;
        this.field1381 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class83 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1384; var11++) {
                    this.field1411[this.field1384] = var10.field1411[var11] + this.field1365;
                    this.field1413[this.field1384] = var10.field1413[var11] + this.field1365;
                    this.field1371[this.field1384] = var10.field1371[var11] + this.field1365;
                    this.field1373[this.field1384] = var10.field1373[var11];
                    this.field1374[this.field1384] = var10.field1374[var11];
                    this.field1375[this.field1384] = var10.field1375[var11];
                    if (var3) {
                        if (var10.field1376 == null) {
                            this.field1376[this.field1384] = var10.field1380;
                        } else {
                            this.field1376[this.field1384] = var10.field1376[var11];
                        }
                    }
                    if (var4 && var10.field1377 != null) {
                        this.field1377[this.field1384] = var10.field1377[var11];
                    }
                    if (var5) {
                        if (var10.field1379 == null) {
                            this.field1379[this.field1384] = -1;
                        } else {
                            this.field1379[this.field1384] = var10.field1379[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1415 == null || var10.field1415[var11] == -1) {
                            this.field1415[this.field1384] = -1;
                        } else {
                            this.field1415[this.field1384] = (byte) (var10.field1415[var11] + this.field1381);
                        }
                    }
                    this.field1384++;
                }
                for (int var12 = 0; var12 < var10.field1381; var12++) {
                    this.field1382[this.field1381] = var10.field1382[var12] + this.field1365;
                    this.field1418[this.field1381] = var10.field1418[var12] + this.field1365;
                    this.field1361[this.field1381] = var10.field1361[var12] + this.field1365;
                    this.field1381++;
                }
                for (int var13 = 0; var13 < var10.field1365; var13++) {
                    this.field1386[this.field1365] = var10.field1386[var13];
                    this.field1367[this.field1365] = var10.field1367[var13];
                    this.field1368[this.field1365] = var10.field1368[var13];
                    this.field1365++;
                }
            }
        }
    }

    @ObfuscatedName("co.b([[IIIIZI)Lco;")
    public class83 method1501(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1505();
        int var7 = arg1 - this.field1390;
        int var8 = this.field1390 + arg1;
        int var9 = arg3 - this.field1390;
        int var10 = this.field1390 + arg3;
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
            var15.field1365 = this.field1365;
            var15.field1384 = this.field1384;
            var15.field1381 = this.field1381;
            var15.field1386 = this.field1386;
            var15.field1368 = this.field1368;
            var15.field1411 = this.field1411;
            var15.field1413 = this.field1413;
            var15.field1371 = this.field1371;
            var15.field1373 = this.field1373;
            var15.field1374 = this.field1374;
            var15.field1375 = this.field1375;
            var15.field1376 = this.field1376;
            var15.field1377 = this.field1377;
            var15.field1415 = this.field1415;
            var15.field1379 = this.field1379;
            var15.field1380 = this.field1380;
            var15.field1382 = this.field1382;
            var15.field1418 = this.field1418;
            var15.field1361 = this.field1361;
            var15.field1385 = this.field1385;
            var15.field1420 = this.field1420;
            var15.field1397 = this.field1397;
            var15.field1367 = new int[var15.field1365];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1365; var16++) {
                int var17 = this.field1386[var16] + arg1;
                int var18 = this.field1368[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1367[var16] = this.field1367[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1365; var26++) {
                int var27 = (-this.field1367[var26] << 16) / this.field1548;
                if (var27 < arg5) {
                    int var28 = this.field1386[var26] + arg1;
                    int var29 = this.field1368[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1367[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1367[var26];
                }
            }
        }
        var15.field1388 = 0;
        return var15;
    }

    @ObfuscatedName("co.e(Z)Lco;")
    public class83 method1502(boolean arg0) {
        if (!arg0 && field1362.length < this.field1384) {
            field1362 = new byte[this.field1384 + 100];
        }
        return this.method1530(arg0, field1387, field1362);
    }

    @ObfuscatedName("co.l(Z)Lco;")
    public class83 method1503(boolean arg0) {
        if (!arg0 && field1364.length < this.field1384) {
            field1364 = new byte[this.field1384 + 100];
        }
        return this.method1530(arg0, field1363, field1364);
    }

    @ObfuscatedName("co.y(ZLco;[B)Lco;")
    public class83 method1530(boolean arg0, class83 arg1, byte[] arg2) {
        arg1.field1365 = this.field1365;
        arg1.field1384 = this.field1384;
        arg1.field1381 = this.field1381;
        if (arg1.field1386 == null || arg1.field1386.length < this.field1365) {
            arg1.field1386 = new int[this.field1365 + 100];
            arg1.field1367 = new int[this.field1365 + 100];
            arg1.field1368 = new int[this.field1365 + 100];
        }
        for (int var4 = 0; var4 < this.field1365; var4++) {
            arg1.field1386[var4] = this.field1386[var4];
            arg1.field1367[var4] = this.field1367[var4];
            arg1.field1368[var4] = this.field1368[var4];
        }
        if (arg0) {
            arg1.field1377 = this.field1377;
        } else {
            arg1.field1377 = arg2;
            if (this.field1377 == null) {
                for (int var5 = 0; var5 < this.field1384; var5++) {
                    arg1.field1377[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1384; var6++) {
                    arg1.field1377[var6] = this.field1377[var6];
                }
            }
        }
        arg1.field1411 = this.field1411;
        arg1.field1413 = this.field1413;
        arg1.field1371 = this.field1371;
        arg1.field1373 = this.field1373;
        arg1.field1374 = this.field1374;
        arg1.field1375 = this.field1375;
        arg1.field1376 = this.field1376;
        arg1.field1415 = this.field1415;
        arg1.field1379 = this.field1379;
        arg1.field1380 = this.field1380;
        arg1.field1382 = this.field1382;
        arg1.field1418 = this.field1418;
        arg1.field1361 = this.field1361;
        arg1.field1385 = this.field1385;
        arg1.field1420 = this.field1420;
        arg1.field1397 = this.field1397;
        arg1.field1388 = 0;
        return arg1;
    }

    @ObfuscatedName("co.j()V")
    public void method1505() {
        if (this.field1388 == 1) {
            return;
        }
        this.field1388 = 1;
        this.field1548 = 0;
        this.field1406 = 0;
        this.field1390 = 0;
        for (int var1 = 0; var1 < this.field1365; var1++) {
            int var2 = this.field1386[var1];
            int var3 = this.field1367[var1];
            int var4 = this.field1368[var1];
            if (-var3 > this.field1548) {
                this.field1548 = -var3;
            }
            if (var3 > this.field1406) {
                this.field1406 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1390) {
                this.field1390 = var5;
            }
        }
        this.field1390 = (int) (Math.sqrt((double) this.field1390) + 0.99D);
        this.field1392 = (int) (Math.sqrt((double) (this.field1548 * this.field1548 + this.field1390 * this.field1390)) + 0.99D);
        this.field1391 = this.field1392 + (int) (Math.sqrt((double) (this.field1406 * this.field1406 + this.field1390 * this.field1390)) + 0.99D);
    }

    @ObfuscatedName("co.t()V")
    public void method1506() {
        if (this.field1388 == 2) {
            return;
        }
        this.field1388 = 2;
        this.field1390 = 0;
        for (int var1 = 0; var1 < this.field1365; var1++) {
            int var2 = this.field1386[var1];
            int var3 = this.field1367[var1];
            int var4 = this.field1368[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1390) {
                this.field1390 = var5;
            }
        }
        this.field1390 = (int) (Math.sqrt((double) this.field1390) + 0.99D);
        this.field1392 = this.field1390;
        this.field1391 = this.field1390 + this.field1390;
    }

    @ObfuscatedName("co.k()I")
    public int method1507() {
        this.method1505();
        return this.field1390;
    }

    @ObfuscatedName("co.f(Lcm;I)V")
    public void method1508(class93 arg0, int arg1) {
        if (this.field1385 == null || arg1 == -1) {
            return;
        }
        class81 var3 = arg0.field1568[arg1];
        class87 var4 = var3.field1328;
        Statics.field1372 = 0;
        Statics.field1389 = 0;
        Statics.field1369 = 0;
        for (int var5 = 0; var5 < var3.field1327; var5++) {
            int var6 = var3.field1324[var5];
            this.method1515(var4.field1474[var6], var4.field1475[var6], var3.field1329[var5], var3.field1326[var5], var3.field1331[var5]);
        }
        this.field1388 = 0;
    }

    @ObfuscatedName("co.a(Lcm;ILcm;I[I)V")
    public void method1509(class93 arg0, int arg1, class93 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method1508(arg0, arg1);
            return;
        }
        class81 var6 = arg0.field1568[arg1];
        class81 var7 = arg2.field1568[arg3];
        class87 var8 = var6.field1328;
        Statics.field1372 = 0;
        Statics.field1389 = 0;
        Statics.field1369 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1327; var11++) {
            int var12 = var6.field1324[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1474[var12] == 0) {
                this.method1515(var8.field1474[var12], var8.field1475[var12], var6.field1329[var11], var6.field1326[var11], var6.field1331[var11]);
            }
        }
        Statics.field1372 = 0;
        Statics.field1389 = 0;
        Statics.field1369 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1327; var15++) {
            int var16 = var7.field1324[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1474[var16] == 0) {
                this.method1515(var8.field1474[var16], var8.field1475[var16], var7.field1329[var15], var7.field1326[var15], var7.field1331[var15]);
            }
        }
        this.field1388 = 0;
    }

    @ObfuscatedName("co.v(I[IIII)V")
    public void method1515(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1372 = 0;
            Statics.field1389 = 0;
            Statics.field1369 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1385.length) {
                    int[] var10 = this.field1385[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1372 += this.field1386[var12];
                        Statics.field1389 += this.field1367[var12];
                        Statics.field1369 += this.field1368[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1372 = Statics.field1372 / var7 + arg2;
                Statics.field1389 = Statics.field1389 / var7 + arg3;
                Statics.field1369 = Statics.field1369 / var7 + arg4;
            } else {
                Statics.field1372 = arg2;
                Statics.field1389 = arg3;
                Statics.field1369 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1385.length) {
                    int[] var15 = this.field1385[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1386[var17] += arg2;
                        this.field1367[var17] += arg3;
                        this.field1368[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1385.length) {
                    int[] var20 = this.field1385[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1386[var22] -= Statics.field1372;
                        this.field1367[var22] -= Statics.field1389;
                        this.field1368[var22] -= Statics.field1369;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1366[var25];
                            int var27 = field1422[var25];
                            int var28 = this.field1386[var22] * var27 + this.field1367[var22] * var26 >> 16;
                            this.field1367[var22] = this.field1367[var22] * var27 - this.field1386[var22] * var26 >> 16;
                            this.field1386[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1366[var23];
                            int var30 = field1422[var23];
                            int var31 = this.field1367[var22] * var30 - this.field1368[var22] * var29 >> 16;
                            this.field1368[var22] = this.field1368[var22] * var30 + this.field1367[var22] * var29 >> 16;
                            this.field1367[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1366[var24];
                            int var33 = field1422[var24];
                            int var34 = this.field1386[var22] * var33 + this.field1368[var22] * var32 >> 16;
                            this.field1368[var22] = this.field1368[var22] * var33 - this.field1386[var22] * var32 >> 16;
                            this.field1386[var22] = var34;
                        }
                        this.field1386[var22] += Statics.field1372;
                        this.field1367[var22] += Statics.field1389;
                        this.field1368[var22] += Statics.field1369;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1385.length) {
                    int[] var37 = this.field1385[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1386[var39] -= Statics.field1372;
                        this.field1367[var39] -= Statics.field1389;
                        this.field1368[var39] -= Statics.field1369;
                        this.field1386[var39] = this.field1386[var39] * arg2 / 128;
                        this.field1367[var39] = this.field1367[var39] * arg3 / 128;
                        this.field1368[var39] = this.field1368[var39] * arg4 / 128;
                        this.field1386[var39] += Statics.field1372;
                        this.field1367[var39] += Statics.field1389;
                        this.field1368[var39] += Statics.field1369;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1420 != null && this.field1377 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1420.length) {
                    int[] var42 = this.field1420[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1377[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1377[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("co.i()V")
    public void method1511() {
        for (int var1 = 0; var1 < this.field1365; var1++) {
            int var2 = this.field1386[var1];
            this.field1386[var1] = this.field1368[var1];
            this.field1368[var1] = -var2;
        }
        this.field1388 = 0;
    }

    @ObfuscatedName("co.x()V")
    public void method1537() {
        for (int var1 = 0; var1 < this.field1365; var1++) {
            this.field1386[var1] = -this.field1386[var1];
            this.field1368[var1] = -this.field1368[var1];
        }
        this.field1388 = 0;
    }

    @ObfuscatedName("co.z()V")
    public void method1512() {
        for (int var1 = 0; var1 < this.field1365; var1++) {
            int var2 = this.field1368[var1];
            this.field1368[var1] = this.field1386[var1];
            this.field1386[var1] = -var2;
        }
        this.field1388 = 0;
    }

    @ObfuscatedName("co.n(I)V")
    public void method1540(int arg0) {
        int var2 = field1366[arg0];
        int var3 = field1422[arg0];
        for (int var4 = 0; var4 < this.field1365; var4++) {
            int var5 = this.field1367[var4] * var3 - this.field1368[var4] * var2 >> 16;
            this.field1368[var4] = this.field1368[var4] * var3 + this.field1367[var4] * var2 >> 16;
            this.field1367[var4] = var5;
        }
        this.field1388 = 0;
    }

    @ObfuscatedName("co.w(III)V")
    public void method1513(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1365; var4++) {
            this.field1386[var4] += arg0;
            this.field1367[var4] += arg1;
            this.field1368[var4] += arg2;
        }
        this.field1388 = 0;
    }

    @ObfuscatedName("co.h(III)V")
    public void method1514(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1365; var4++) {
            this.field1386[var4] = this.field1386[var4] * arg0 / 128;
            this.field1367[var4] = this.field1367[var4] * arg1 / 128;
            this.field1368[var4] = this.field1368[var4] * arg2 / 128;
        }
        this.field1388 = 0;
    }

    @ObfuscatedName("co.u(IIIIIII)V")
    public final void method1558(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1403[0] = -1;
        if (this.field1388 != 2 && this.field1388 != 1) {
            this.method1506();
        }
        int var8 = Statics.field1444;
        int var9 = Statics.field1449;
        int var10 = field1366[arg0];
        int var11 = field1422[arg0];
        int var12 = field1366[arg1];
        int var13 = field1422[arg1];
        int var14 = field1366[arg2];
        int var15 = field1422[arg2];
        int var16 = field1366[arg3];
        int var17 = field1422[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1365; var19++) {
            int var20 = this.field1386[var19];
            int var21 = this.field1367[var19];
            int var22 = this.field1368[var19];
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
            field1398[var19] = var30 - var18;
            field1396[var19] = class85.field1446 * var26 / var30 + var8;
            field1370[var19] = class85.field1446 * var29 / var30 + var9;
            if (this.field1381 > 0) {
                field1399[var19] = var26;
                field1400[var19] = var29;
                field1401[var19] = var30;
            }
        }
        try {
            this.method1518(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("co.m(IIIIIIII)V")
    public final void method1516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1403[0] = -1;
        if (this.field1388 != 2 && this.field1388 != 1) {
            this.method1506();
        }
        int var9 = Statics.field1444;
        int var10 = Statics.field1449;
        int var11 = field1366[arg0];
        int var12 = field1422[arg0];
        int var13 = field1366[arg1];
        int var14 = field1422[arg1];
        int var15 = field1366[arg2];
        int var16 = field1422[arg2];
        int var17 = field1366[arg3];
        int var18 = field1422[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1365; var20++) {
            int var21 = this.field1386[var20];
            int var22 = this.field1367[var20];
            int var23 = this.field1368[var20];
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
            field1398[var20] = var31 - var19;
            field1396[var20] = class85.field1446 * var27 / arg7 + var9;
            field1370[var20] = class85.field1446 * var30 / arg7 + var10;
            if (this.field1381 > 0) {
                field1399[var20] = var27;
                field1400[var20] = var30;
                field1401[var20] = var31;
            }
        }
        try {
            this.method1518(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("co.cl(IIIIIIIII)V")
    public void method1517(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1403[0] = -1;
        if (this.field1388 != 1) {
            this.method1505();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1390 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1390) * class85.field1446;
        if (var15 / var13 >= Statics.field1452) {
            return;
        }
        int var16 = (this.field1390 + var14) * class85.field1446;
        if (var16 / var13 <= Statics.field1451) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1390 * arg1 >> 16;
        int var19 = (var17 + var18) * class85.field1446;
        if (var19 / var13 <= Statics.field1453) {
            return;
        }
        int var20 = (this.field1548 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class85.field1446;
        if (var21 / var13 >= Statics.field1438) {
            return;
        }
        int var22 = (this.field1548 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1381 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1416) {
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
            int var32 = field1417 - Statics.field1444;
            int var33 = field1421 - Statics.field1449;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1397) {
                    field1425[field1426++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1444;
        int var35 = Statics.field1449;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1366[arg0];
            var37 = field1422[arg0];
        }
        for (int var38 = 0; var38 < this.field1365; var38++) {
            int var39 = this.field1386[var38];
            int var40 = this.field1367[var38];
            int var41 = this.field1368[var38];
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
            field1398[var38] = var50 - var11;
            if (var50 >= 50) {
                field1396[var38] = class85.field1446 * var46 / var50 + var34;
                field1370[var38] = class85.field1446 * var49 / var50 + var35;
            } else {
                field1396[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1399[var38] = var46;
                field1400[var38] = var49;
                field1401[var38] = var50;
            }
        }
        try {
            this.method1518(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("co.p(ZZI)V")
    public final void method1518(boolean arg0, boolean arg1, int arg2) {
        if (this.field1391 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1391; var4++) {
            field1403[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1384; var5++) {
            if (this.field1375[var5] != -2) {
                int var6 = this.field1411[var5];
                int var7 = this.field1413[var5];
                int var8 = this.field1371[var5];
                int var9 = field1396[var6];
                int var10 = field1396[var7];
                int var11 = field1396[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1399[var6];
                    int var13 = field1399[var7];
                    int var14 = field1399[var8];
                    int var15 = field1400[var6];
                    int var16 = field1400[var7];
                    int var17 = field1400[var8];
                    int var18 = field1401[var6];
                    int var19 = field1401[var7];
                    int var20 = field1401[var8];
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
                        field1395[var5] = true;
                        int var30 = (field1398[var6] + field1398[var7] + field1398[var8]) / 3 + this.field1392;
                        field1404[var30][field1403[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method1500(field1417, field1421, field1370[var6], field1370[var7], field1370[var8], var9, var10, var11)) {
                        field1425[field1426++] = arg2;
                        arg1 = false;
                    }
                    if ((field1370[var8] - field1370[var7]) * (var9 - var10) - (field1370[var6] - field1370[var7]) * (var11 - var10) > 0) {
                        field1395[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1437 && var10 <= Statics.field1437 && var11 <= Statics.field1437) {
                            field1383[var5] = false;
                        } else {
                            field1383[var5] = true;
                        }
                        int var31 = (field1398[var6] + field1398[var7] + field1398[var8]) / 3 + this.field1392;
                        field1404[var31][field1403[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1376 == null) {
            for (int var32 = this.field1391 - 1; var32 >= 0; var32--) {
                int var33 = field1403[var32];
                if (var33 > 0) {
                    int[] var34 = field1404[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method1519(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1405[var36] = 0;
            field1409[var36] = 0;
        }
        for (int var37 = this.field1391 - 1; var37 >= 0; var37--) {
            int var38 = field1403[var37];
            if (var38 > 0) {
                int[] var39 = field1404[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1376[var41];
                    int var43 = field1405[var42]++;
                    field1378[var42][var43] = var41;
                    if (var42 < 10) {
                        field1409[var42] += var37;
                    } else if (var42 == 10) {
                        field1407[var43] = var37;
                    } else {
                        field1394[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1405[1] > 0 || field1405[2] > 0) {
            var44 = (field1409[1] + field1409[2]) / (field1405[1] + field1405[2]);
        }
        int var45 = 0;
        if (field1405[3] > 0 || field1405[4] > 0) {
            var45 = (field1409[3] + field1409[4]) / (field1405[3] + field1405[4]);
        }
        int var46 = 0;
        if (field1405[6] > 0 || field1405[8] > 0) {
            var46 = (field1409[6] + field1409[8]) / (field1405[6] + field1405[8]);
        }
        int var47 = 0;
        int var48 = field1405[10];
        int[] var49 = field1378[10];
        int[] var50 = field1407;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1405[11];
            var49 = field1378[11];
            var50 = field1394;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method1519(var49[var47++]);
                if (var47 == var48 && field1378[11] != var49) {
                    var47 = 0;
                    var48 = field1405[11];
                    var49 = field1378[11];
                    var50 = field1394;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method1519(var49[var47++]);
                if (var47 == var48 && field1378[11] != var49) {
                    var47 = 0;
                    var48 = field1405[11];
                    var49 = field1378[11];
                    var50 = field1394;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method1519(var49[var47++]);
                if (var47 == var48 && field1378[11] != var49) {
                    var47 = 0;
                    var48 = field1405[11];
                    var49 = field1378[11];
                    var50 = field1394;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1405[var52];
            int[] var54 = field1378[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method1519(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method1519(var49[var47++]);
            if (var47 == var48 && field1378[11] != var49) {
                var47 = 0;
                var49 = field1378[11];
                var48 = field1405[11];
                var50 = field1394;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("co.aq(I)V")
    public final void method1519(int arg0) {
        if (field1395[arg0]) {
            this.method1520(arg0);
            return;
        }
        int var2 = this.field1411[arg0];
        int var3 = this.field1413[arg0];
        int var4 = this.field1371[arg0];
        class85.field1441 = field1383[arg0];
        if (this.field1377 == null) {
            class85.field1448 = 0;
        } else {
            class85.field1448 = this.field1377[arg0] & 0xFF;
        }
        if (this.field1379 != null && this.field1379[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1415 == null || this.field1415[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1415[arg0] & 0xFF;
                var6 = this.field1382[var5];
                var7 = this.field1418[var5];
                var8 = this.field1361[var5];
            }
            if (this.field1375[arg0] == -1) {
                class85.method1592(field1370[var2], field1370[var3], field1370[var4], field1396[var2], field1396[var3], field1396[var4], this.field1373[arg0], this.field1373[arg0], this.field1373[arg0], field1399[var6], field1399[var7], field1399[var8], field1400[var6], field1400[var7], field1400[var8], field1401[var6], field1401[var7], field1401[var8], this.field1379[arg0]);
            } else {
                class85.method1592(field1370[var2], field1370[var3], field1370[var4], field1396[var2], field1396[var3], field1396[var4], this.field1373[arg0], this.field1374[arg0], this.field1375[arg0], field1399[var6], field1399[var7], field1399[var8], field1400[var6], field1400[var7], field1400[var8], field1401[var6], field1401[var7], field1401[var8], this.field1379[arg0]);
            }
        } else if (this.field1375[arg0] == -1) {
            class85.method1603(field1370[var2], field1370[var3], field1370[var4], field1396[var2], field1396[var3], field1396[var4], field1423[this.field1373[arg0]]);
        } else {
            class85.method1588(field1370[var2], field1370[var3], field1370[var4], field1396[var2], field1396[var3], field1396[var4], this.field1373[arg0], this.field1374[arg0], this.field1375[arg0]);
        }
    }

    @ObfuscatedName("co.aj(I)V")
    public final void method1520(int arg0) {
        int var2 = Statics.field1444;
        int var3 = Statics.field1449;
        int var4 = 0;
        int var5 = this.field1411[arg0];
        int var6 = this.field1413[arg0];
        int var7 = this.field1371[arg0];
        int var8 = field1401[var5];
        int var9 = field1401[var6];
        int var10 = field1401[var7];
        if (this.field1377 == null) {
            class85.field1448 = 0;
        } else {
            class85.field1448 = this.field1377[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1410[var4] = field1396[var5];
            field1419[var4] = field1370[var5];
            field1412[var4++] = this.field1373[arg0];
        } else {
            int var11 = field1399[var5];
            int var12 = field1400[var5];
            int var13 = this.field1373[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1424[var10 - var8];
                field1410[var4] = (((field1399[var7] - var11) * var14 >> 16) + var11) * class85.field1446 / 50 + var2;
                field1419[var4] = (((field1400[var7] - var12) * var14 >> 16) + var12) * class85.field1446 / 50 + var3;
                field1412[var4++] = ((this.field1375[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1424[var9 - var8];
                field1410[var4] = (((field1399[var6] - var11) * var15 >> 16) + var11) * class85.field1446 / 50 + var2;
                field1419[var4] = (((field1400[var6] - var12) * var15 >> 16) + var12) * class85.field1446 / 50 + var3;
                field1412[var4++] = ((this.field1374[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1410[var4] = field1396[var6];
            field1419[var4] = field1370[var6];
            field1412[var4++] = this.field1374[arg0];
        } else {
            int var16 = field1399[var6];
            int var17 = field1400[var6];
            int var18 = this.field1374[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1424[var8 - var9];
                field1410[var4] = (((field1399[var5] - var16) * var19 >> 16) + var16) * class85.field1446 / 50 + var2;
                field1419[var4] = (((field1400[var5] - var17) * var19 >> 16) + var17) * class85.field1446 / 50 + var3;
                field1412[var4++] = ((this.field1373[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1424[var10 - var9];
                field1410[var4] = (((field1399[var7] - var16) * var20 >> 16) + var16) * class85.field1446 / 50 + var2;
                field1419[var4] = (((field1400[var7] - var17) * var20 >> 16) + var17) * class85.field1446 / 50 + var3;
                field1412[var4++] = ((this.field1375[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1410[var4] = field1396[var7];
            field1419[var4] = field1370[var7];
            field1412[var4++] = this.field1375[arg0];
        } else {
            int var21 = field1399[var7];
            int var22 = field1400[var7];
            int var23 = this.field1375[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1424[var9 - var10];
                field1410[var4] = (((field1399[var6] - var21) * var24 >> 16) + var21) * class85.field1446 / 50 + var2;
                field1419[var4] = (((field1400[var6] - var22) * var24 >> 16) + var22) * class85.field1446 / 50 + var3;
                field1412[var4++] = ((this.field1374[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1424[var8 - var10];
                field1410[var4] = (((field1399[var5] - var21) * var25 >> 16) + var21) * class85.field1446 / 50 + var2;
                field1419[var4] = (((field1400[var5] - var22) * var25 >> 16) + var22) * class85.field1446 / 50 + var3;
                field1412[var4++] = ((this.field1373[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1410[0];
        int var27 = field1410[1];
        int var28 = field1410[2];
        int var29 = field1419[0];
        int var30 = field1419[1];
        int var31 = field1419[2];
        class85.field1441 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1437 || var27 > Statics.field1437 || var28 > Statics.field1437) {
                class85.field1441 = true;
            }
            if (this.field1379 != null && this.field1379[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1415 == null || this.field1415[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1415[arg0] & 0xFF;
                    var33 = this.field1382[var32];
                    var34 = this.field1418[var32];
                    var35 = this.field1361[var32];
                }
                if (this.field1375[arg0] == -1) {
                    class85.method1592(var29, var30, var31, var26, var27, var28, this.field1373[arg0], this.field1373[arg0], this.field1373[arg0], field1399[var33], field1399[var34], field1399[var35], field1400[var33], field1400[var34], field1400[var35], field1401[var33], field1401[var34], field1401[var35], this.field1379[arg0]);
                } else {
                    class85.method1592(var29, var30, var31, var26, var27, var28, field1412[0], field1412[1], field1412[2], field1399[var33], field1399[var34], field1399[var35], field1400[var33], field1400[var34], field1400[var35], field1401[var33], field1401[var34], field1401[var35], this.field1379[arg0]);
                }
            } else if (this.field1375[arg0] == -1) {
                class85.method1603(var29, var30, var31, var26, var27, var28, field1423[this.field1373[arg0]]);
            } else {
                class85.method1588(var29, var30, var31, var26, var27, var28, field1412[0], field1412[1], field1412[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1437 || var27 > Statics.field1437 || var28 > Statics.field1437 || field1410[3] < 0 || field1410[3] > Statics.field1437) {
            class85.field1441 = true;
        }
        if (this.field1379 != null && this.field1379[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1415 == null || this.field1415[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1415[arg0] & 0xFF;
                var37 = this.field1382[var36];
                var38 = this.field1418[var36];
                var39 = this.field1361[var36];
            }
            short var40 = this.field1379[arg0];
            if (this.field1375[arg0] == -1) {
                class85.method1592(var29, var30, var31, var26, var27, var28, this.field1373[arg0], this.field1373[arg0], this.field1373[arg0], field1399[var37], field1399[var38], field1399[var39], field1400[var37], field1400[var38], field1400[var39], field1401[var37], field1401[var38], field1401[var39], var40);
                class85.method1592(var29, var31, field1419[3], var26, var28, field1410[3], this.field1373[arg0], this.field1373[arg0], this.field1373[arg0], field1399[var37], field1399[var38], field1399[var39], field1400[var37], field1400[var38], field1400[var39], field1401[var37], field1401[var38], field1401[var39], var40);
            } else {
                class85.method1592(var29, var30, var31, var26, var27, var28, field1412[0], field1412[1], field1412[2], field1399[var37], field1399[var38], field1399[var39], field1400[var37], field1400[var38], field1400[var39], field1401[var37], field1401[var38], field1401[var39], var40);
                class85.method1592(var29, var31, field1419[3], var26, var28, field1410[3], field1412[0], field1412[2], field1412[3], field1399[var37], field1399[var38], field1399[var39], field1400[var37], field1400[var38], field1400[var39], field1401[var37], field1401[var38], field1401[var39], var40);
            }
        } else if (this.field1375[arg0] == -1) {
            int var41 = field1423[this.field1373[arg0]];
            class85.method1603(var29, var30, var31, var26, var27, var28, var41);
            class85.method1603(var29, var31, field1419[3], var26, var28, field1410[3], var41);
        } else {
            class85.method1588(var29, var30, var31, var26, var27, var28, field1412[0], field1412[1], field1412[2]);
            class85.method1588(var29, var31, field1419[3], var26, var28, field1410[3], field1412[0], field1412[2], field1412[3]);
        }
    }

    @ObfuscatedName("co.ae(IIIIIIII)Z")
    public final boolean method1500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
