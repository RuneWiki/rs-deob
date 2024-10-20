package deob;

@ObfuscatedName("ca")
public class class83 extends class90 {

    @ObfuscatedName("ca.n")
    public static class83 field1359 = new class83();

    @ObfuscatedName("ca.d")
    public static byte[] field1350 = new byte[1];

    @ObfuscatedName("ca.m")
    public static class83 field1360 = new class83();

    @ObfuscatedName("ca.h")
    public static byte[] field1353 = new byte[1];

    @ObfuscatedName("ca.w")
    public int field1352 = 0;

    @ObfuscatedName("ca.r")
    public int[] field1354;

    @ObfuscatedName("ca.c")
    public int[] field1355;

    @ObfuscatedName("ca.p")
    public int[] field1378;

    @ObfuscatedName("ca.g")
    public int field1357 = 0;

    @ObfuscatedName("ca.z")
    public int[] field1358;

    @ObfuscatedName("ca.q")
    public int[] field1375;

    @ObfuscatedName("ca.l")
    public int[] field1351;

    @ObfuscatedName("ca.y")
    public int[] field1361;

    @ObfuscatedName("ca.e")
    public int[] field1362;

    @ObfuscatedName("ca.x")
    public int[] field1363;

    @ObfuscatedName("ca.f")
    public byte[] field1411;

    @ObfuscatedName("ca.s")
    public byte[] field1365;

    @ObfuscatedName("ca.o")
    public byte[] field1366;

    @ObfuscatedName("ca.i")
    public short[] field1367;

    @ObfuscatedName("ca.a")
    public byte field1368 = 0;

    @ObfuscatedName("ca.b")
    public int field1369 = 0;

    @ObfuscatedName("ca.j")
    public int[] field1407;

    @ObfuscatedName("ca.k")
    public int[] field1356;

    @ObfuscatedName("ca.v")
    public int[] field1372;

    @ObfuscatedName("ca.u")
    public int[][] field1373;

    @ObfuscatedName("ca.t")
    public int[][] field1370;

    @ObfuscatedName("ca.av")
    public boolean field1400 = false;

    @ObfuscatedName("ca.aw")
    public int field1386;

    @ObfuscatedName("ca.ay")
    public int field1377;

    @ObfuscatedName("ca.as")
    public int field1379;

    @ObfuscatedName("ca.ai")
    public int field1390;

    @ObfuscatedName("ca.aq")
    public int field1380;

    @ObfuscatedName("ca.ae")
    public static boolean[] field1382 = new boolean[4700];

    @ObfuscatedName("ca.ag")
    public static boolean[] field1374 = new boolean[4700];

    @ObfuscatedName("ca.am")
    public static int[] field1384 = new int[4700];

    @ObfuscatedName("ca.af")
    public static int[] field1385 = new int[4700];

    @ObfuscatedName("ca.ap")
    public static int[] field1404 = new int[4700];

    @ObfuscatedName("ca.az")
    public static int[] field1387 = new int[4700];

    @ObfuscatedName("ca.ab")
    public static int[] field1388 = new int[4700];

    @ObfuscatedName("ca.ax")
    public static int[] field1389 = new int[4700];

    @ObfuscatedName("ca.ah")
    public static int[] field1391 = new int[1600];

    @ObfuscatedName("ca.al")
    public static int[][] field1392 = new int[1600][512];

    @ObfuscatedName("ca.aa")
    public static int[] field1393 = new int[12];

    @ObfuscatedName("ca.an")
    public static int[][] field1394 = new int[12][2000];

    @ObfuscatedName("ca.at")
    public static int[] field1395 = new int[2000];

    @ObfuscatedName("ca.au")
    public static int[] field1396 = new int[2000];

    @ObfuscatedName("ca.ak")
    public static int[] field1397 = new int[12];

    @ObfuscatedName("ca.ar")
    public static int[] field1398 = new int[10];

    @ObfuscatedName("ca.aj")
    public static int[] field1399 = new int[10];

    @ObfuscatedName("ca.ao")
    public static int[] field1371 = new int[10];

    @ObfuscatedName("ca.bd")
    public static boolean field1349 = false;

    @ObfuscatedName("ca.bm")
    public static int field1414 = 0;

    @ObfuscatedName("ca.bl")
    public static int field1405 = 0;

    @ObfuscatedName("ca.bo")
    public static int field1408 = 0;

    @ObfuscatedName("ca.by")
    public static int[] field1383 = new int[1000];

    @ObfuscatedName("ca.br")
    public static int[] field1409 = class85.field1445;

    @ObfuscatedName("ca.bi")
    public static int[] field1410 = class85.field1446;

    @ObfuscatedName("ca.be")
    public static int[] field1406 = class85.field1441;

    @ObfuscatedName("ca.ba")
    public static int[] field1412 = class85.field1444;

    public class83() {
    }

    public class83(class83[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1352 = 0;
        this.field1357 = 0;
        this.field1369 = 0;
        this.field1368 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class83 var8 = arg0[var7];
            if (var8 != null) {
                this.field1352 += var8.field1352;
                this.field1357 += var8.field1357;
                this.field1369 += var8.field1369;
                if (var8.field1411 == null) {
                    if (this.field1368 == -1) {
                        this.field1368 = var8.field1368;
                    }
                    if (this.field1368 != var8.field1368) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1365 != null;
                var5 |= var8.field1367 != null;
                var6 |= var8.field1366 != null;
            }
        }
        this.field1354 = new int[this.field1352];
        this.field1355 = new int[this.field1352];
        this.field1378 = new int[this.field1352];
        this.field1358 = new int[this.field1357];
        this.field1375 = new int[this.field1357];
        this.field1351 = new int[this.field1357];
        this.field1361 = new int[this.field1357];
        this.field1362 = new int[this.field1357];
        this.field1363 = new int[this.field1357];
        if (var3) {
            this.field1411 = new byte[this.field1357];
        }
        if (var4) {
            this.field1365 = new byte[this.field1357];
        }
        if (var5) {
            this.field1367 = new short[this.field1357];
        }
        if (var6) {
            this.field1366 = new byte[this.field1357];
        }
        if (this.field1369 > 0) {
            this.field1407 = new int[this.field1369];
            this.field1356 = new int[this.field1369];
            this.field1372 = new int[this.field1369];
        }
        this.field1352 = 0;
        this.field1357 = 0;
        this.field1369 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class83 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1357; var11++) {
                    this.field1358[this.field1357] = var10.field1358[var11] + this.field1352;
                    this.field1375[this.field1357] = var10.field1375[var11] + this.field1352;
                    this.field1351[this.field1357] = var10.field1351[var11] + this.field1352;
                    this.field1361[this.field1357] = var10.field1361[var11];
                    this.field1362[this.field1357] = var10.field1362[var11];
                    this.field1363[this.field1357] = var10.field1363[var11];
                    if (var3) {
                        if (var10.field1411 == null) {
                            this.field1411[this.field1357] = var10.field1368;
                        } else {
                            this.field1411[this.field1357] = var10.field1411[var11];
                        }
                    }
                    if (var4 && var10.field1365 != null) {
                        this.field1365[this.field1357] = var10.field1365[var11];
                    }
                    if (var5) {
                        if (var10.field1367 == null) {
                            this.field1367[this.field1357] = -1;
                        } else {
                            this.field1367[this.field1357] = var10.field1367[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1366 == null || var10.field1366[var11] == -1) {
                            this.field1366[this.field1357] = -1;
                        } else {
                            this.field1366[this.field1357] = (byte) (var10.field1366[var11] + this.field1369);
                        }
                    }
                    this.field1357++;
                }
                for (int var12 = 0; var12 < var10.field1369; var12++) {
                    this.field1407[this.field1369] = var10.field1407[var12] + this.field1352;
                    this.field1356[this.field1369] = var10.field1356[var12] + this.field1352;
                    this.field1372[this.field1369] = var10.field1372[var12] + this.field1352;
                    this.field1369++;
                }
                for (int var13 = 0; var13 < var10.field1352; var13++) {
                    this.field1354[this.field1352] = var10.field1354[var13];
                    this.field1355[this.field1352] = var10.field1355[var13];
                    this.field1378[this.field1352] = var10.field1378[var13];
                    this.field1352++;
                }
            }
        }
    }

    @ObfuscatedName("ca.n([[IIIIZI)Lca;")
    public class83 method1491(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1494();
        int var7 = arg1 - this.field1379;
        int var8 = this.field1379 + arg1;
        int var9 = arg3 - this.field1379;
        int var10 = this.field1379 + arg3;
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
            var15.field1352 = this.field1352;
            var15.field1357 = this.field1357;
            var15.field1369 = this.field1369;
            var15.field1354 = this.field1354;
            var15.field1378 = this.field1378;
            var15.field1358 = this.field1358;
            var15.field1375 = this.field1375;
            var15.field1351 = this.field1351;
            var15.field1361 = this.field1361;
            var15.field1362 = this.field1362;
            var15.field1363 = this.field1363;
            var15.field1411 = this.field1411;
            var15.field1365 = this.field1365;
            var15.field1366 = this.field1366;
            var15.field1367 = this.field1367;
            var15.field1368 = this.field1368;
            var15.field1407 = this.field1407;
            var15.field1356 = this.field1356;
            var15.field1372 = this.field1372;
            var15.field1373 = this.field1373;
            var15.field1370 = this.field1370;
            var15.field1400 = this.field1400;
            var15.field1355 = new int[var15.field1352];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1352; var16++) {
                int var17 = this.field1354[var16] + arg1;
                int var18 = this.field1378[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1355[var16] = this.field1355[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1352; var26++) {
                int var27 = (-this.field1355[var26] << 16) / this.field1535;
                if (var27 < arg5) {
                    int var28 = this.field1354[var26] + arg1;
                    int var29 = this.field1378[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1355[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1355[var26];
                }
            }
        }
        var15.field1386 = 0;
        return var15;
    }

    @ObfuscatedName("ca.d(Z)Lca;")
    public class83 method1492(boolean arg0) {
        if (!arg0 && field1350.length < this.field1357) {
            field1350 = new byte[this.field1357 + 100];
        }
        return this.method1517(arg0, field1359, field1350);
    }

    @ObfuscatedName("ca.h(Z)Lca;")
    public class83 method1493(boolean arg0) {
        if (!arg0 && field1353.length < this.field1357) {
            field1353 = new byte[this.field1357 + 100];
        }
        return this.method1517(arg0, field1360, field1353);
    }

    @ObfuscatedName("ca.w(ZLca;[B)Lca;")
    public class83 method1517(boolean arg0, class83 arg1, byte[] arg2) {
        arg1.field1352 = this.field1352;
        arg1.field1357 = this.field1357;
        arg1.field1369 = this.field1369;
        if (arg1.field1354 == null || arg1.field1354.length < this.field1352) {
            arg1.field1354 = new int[this.field1352 + 100];
            arg1.field1355 = new int[this.field1352 + 100];
            arg1.field1378 = new int[this.field1352 + 100];
        }
        for (int var4 = 0; var4 < this.field1352; var4++) {
            arg1.field1354[var4] = this.field1354[var4];
            arg1.field1355[var4] = this.field1355[var4];
            arg1.field1378[var4] = this.field1378[var4];
        }
        if (arg0) {
            arg1.field1365 = this.field1365;
        } else {
            arg1.field1365 = arg2;
            if (this.field1365 == null) {
                for (int var5 = 0; var5 < this.field1357; var5++) {
                    arg1.field1365[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1357; var6++) {
                    arg1.field1365[var6] = this.field1365[var6];
                }
            }
        }
        arg1.field1358 = this.field1358;
        arg1.field1375 = this.field1375;
        arg1.field1351 = this.field1351;
        arg1.field1361 = this.field1361;
        arg1.field1362 = this.field1362;
        arg1.field1363 = this.field1363;
        arg1.field1411 = this.field1411;
        arg1.field1366 = this.field1366;
        arg1.field1367 = this.field1367;
        arg1.field1368 = this.field1368;
        arg1.field1407 = this.field1407;
        arg1.field1356 = this.field1356;
        arg1.field1372 = this.field1372;
        arg1.field1373 = this.field1373;
        arg1.field1370 = this.field1370;
        arg1.field1400 = this.field1400;
        arg1.field1386 = 0;
        return arg1;
    }

    @ObfuscatedName("ca.r()V")
    public void method1494() {
        if (this.field1386 == 1) {
            return;
        }
        this.field1386 = 1;
        this.field1535 = 0;
        this.field1377 = 0;
        this.field1379 = 0;
        for (int var1 = 0; var1 < this.field1352; var1++) {
            int var2 = this.field1354[var1];
            int var3 = this.field1355[var1];
            int var4 = this.field1378[var1];
            if (-var3 > this.field1535) {
                this.field1535 = -var3;
            }
            if (var3 > this.field1377) {
                this.field1377 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1379) {
                this.field1379 = var5;
            }
        }
        this.field1379 = (int) (Math.sqrt((double) this.field1379) + 0.99D);
        this.field1380 = (int) (Math.sqrt((double) (this.field1535 * this.field1535 + this.field1379 * this.field1379)) + 0.99D);
        this.field1390 = this.field1380 + (int) (Math.sqrt((double) (this.field1379 * this.field1379 + this.field1377 * this.field1377)) + 0.99D);
    }

    @ObfuscatedName("ca.c()V")
    public void method1554() {
        if (this.field1386 == 2) {
            return;
        }
        this.field1386 = 2;
        this.field1379 = 0;
        for (int var1 = 0; var1 < this.field1352; var1++) {
            int var2 = this.field1354[var1];
            int var3 = this.field1355[var1];
            int var4 = this.field1378[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1379) {
                this.field1379 = var5;
            }
        }
        this.field1379 = (int) (Math.sqrt((double) this.field1379) + 0.99D);
        this.field1380 = this.field1379;
        this.field1390 = this.field1379 + this.field1379;
    }

    @ObfuscatedName("ca.z()I")
    public int method1519() {
        this.method1494();
        return this.field1379;
    }

    @ObfuscatedName("ca.q(Lcj;I)V")
    public void method1563(class93 arg0, int arg1) {
        if (this.field1373 == null || arg1 == -1) {
            return;
        }
        class81 var3 = arg0.field1568[arg1];
        class87 var4 = var3.field1316;
        Statics.field1401 = 0;
        Statics.field1402 = 0;
        Statics.field1403 = 0;
        for (int var5 = 0; var5 < var3.field1315; var5++) {
            int var6 = var3.field1311[var5];
            this.method1561(var4.field1468[var6], var4.field1463[var6], var3.field1317[var5], var3.field1318[var5], var3.field1319[var5]);
        }
        this.field1386 = 0;
    }

    @ObfuscatedName("ca.l(Lcj;ILcj;I[I)V")
    public void method1539(class93 arg0, int arg1, class93 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method1563(arg0, arg1);
            return;
        }
        class81 var6 = arg0.field1568[arg1];
        class81 var7 = arg2.field1568[arg3];
        class87 var8 = var6.field1316;
        Statics.field1401 = 0;
        Statics.field1402 = 0;
        Statics.field1403 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1315; var11++) {
            int var12 = var6.field1311[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1468[var12] == 0) {
                this.method1561(var8.field1468[var12], var8.field1463[var12], var6.field1317[var11], var6.field1318[var11], var6.field1319[var11]);
            }
        }
        Statics.field1401 = 0;
        Statics.field1402 = 0;
        Statics.field1403 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1315; var15++) {
            int var16 = var7.field1311[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1468[var16] == 0) {
                this.method1561(var8.field1468[var16], var8.field1463[var16], var7.field1317[var15], var7.field1318[var15], var7.field1319[var15]);
            }
        }
        this.field1386 = 0;
    }

    @ObfuscatedName("ca.y(I[IIII)V")
    public void method1561(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1401 = 0;
            Statics.field1402 = 0;
            Statics.field1403 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1373.length) {
                    int[] var10 = this.field1373[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1401 += this.field1354[var12];
                        Statics.field1402 += this.field1355[var12];
                        Statics.field1403 += this.field1378[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1401 = Statics.field1401 / var7 + arg2;
                Statics.field1402 = Statics.field1402 / var7 + arg3;
                Statics.field1403 = Statics.field1403 / var7 + arg4;
            } else {
                Statics.field1401 = arg2;
                Statics.field1402 = arg3;
                Statics.field1403 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1373.length) {
                    int[] var15 = this.field1373[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1354[var17] += arg2;
                        this.field1355[var17] += arg3;
                        this.field1378[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1373.length) {
                    int[] var20 = this.field1373[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1354[var22] -= Statics.field1401;
                        this.field1355[var22] -= Statics.field1402;
                        this.field1378[var22] -= Statics.field1403;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1409[var25];
                            int var27 = field1410[var25];
                            int var28 = this.field1355[var22] * var26 + this.field1354[var22] * var27 >> 16;
                            this.field1355[var22] = this.field1355[var22] * var27 - this.field1354[var22] * var26 >> 16;
                            this.field1354[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1409[var23];
                            int var30 = field1410[var23];
                            int var31 = this.field1355[var22] * var30 - this.field1378[var22] * var29 >> 16;
                            this.field1378[var22] = this.field1378[var22] * var30 + this.field1355[var22] * var29 >> 16;
                            this.field1355[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1409[var24];
                            int var33 = field1410[var24];
                            int var34 = this.field1378[var22] * var32 + this.field1354[var22] * var33 >> 16;
                            this.field1378[var22] = this.field1378[var22] * var33 - this.field1354[var22] * var32 >> 16;
                            this.field1354[var22] = var34;
                        }
                        this.field1354[var22] += Statics.field1401;
                        this.field1355[var22] += Statics.field1402;
                        this.field1378[var22] += Statics.field1403;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1373.length) {
                    int[] var37 = this.field1373[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1354[var39] -= Statics.field1401;
                        this.field1355[var39] -= Statics.field1402;
                        this.field1378[var39] -= Statics.field1403;
                        this.field1354[var39] = this.field1354[var39] * arg2 / 128;
                        this.field1355[var39] = this.field1355[var39] * arg3 / 128;
                        this.field1378[var39] = this.field1378[var39] * arg4 / 128;
                        this.field1354[var39] += Statics.field1401;
                        this.field1355[var39] += Statics.field1402;
                        this.field1378[var39] += Statics.field1403;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1370 != null && this.field1365 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1370.length) {
                    int[] var42 = this.field1370[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1365[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1365[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ca.e()V")
    public void method1500() {
        for (int var1 = 0; var1 < this.field1352; var1++) {
            int var2 = this.field1354[var1];
            this.field1354[var1] = this.field1378[var1];
            this.field1378[var1] = -var2;
        }
        this.field1386 = 0;
    }

    @ObfuscatedName("ca.x()V")
    public void method1499() {
        for (int var1 = 0; var1 < this.field1352; var1++) {
            this.field1354[var1] = -this.field1354[var1];
            this.field1378[var1] = -this.field1378[var1];
        }
        this.field1386 = 0;
    }

    @ObfuscatedName("ca.f()V")
    public void method1502() {
        for (int var1 = 0; var1 < this.field1352; var1++) {
            int var2 = this.field1378[var1];
            this.field1378[var1] = this.field1354[var1];
            this.field1354[var1] = -var2;
        }
        this.field1386 = 0;
    }

    @ObfuscatedName("ca.s(I)V")
    public void method1503(int arg0) {
        int var2 = field1409[arg0];
        int var3 = field1410[arg0];
        for (int var4 = 0; var4 < this.field1352; var4++) {
            int var5 = this.field1355[var4] * var3 - this.field1378[var4] * var2 >> 16;
            this.field1378[var4] = this.field1378[var4] * var3 + this.field1355[var4] * var2 >> 16;
            this.field1355[var4] = var5;
        }
        this.field1386 = 0;
    }

    @ObfuscatedName("ca.o(III)V")
    public void method1498(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1352; var4++) {
            this.field1354[var4] += arg0;
            this.field1355[var4] += arg1;
            this.field1378[var4] += arg2;
        }
        this.field1386 = 0;
    }

    @ObfuscatedName("ca.k(III)V")
    public void method1505(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1352; var4++) {
            this.field1354[var4] = this.field1354[var4] * arg0 / 128;
            this.field1355[var4] = this.field1355[var4] * arg1 / 128;
            this.field1378[var4] = this.field1378[var4] * arg2 / 128;
        }
        this.field1386 = 0;
    }

    @ObfuscatedName("ca.v(IIIIIII)V")
    public final void method1506(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1391[0] = -1;
        if (this.field1386 != 2 && this.field1386 != 1) {
            this.method1554();
        }
        int var8 = Statics.field1432;
        int var9 = Statics.field1436;
        int var10 = field1409[arg0];
        int var11 = field1410[arg0];
        int var12 = field1409[arg1];
        int var13 = field1410[arg1];
        int var14 = field1409[arg2];
        int var15 = field1410[arg2];
        int var16 = field1409[arg3];
        int var17 = field1410[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1352; var19++) {
            int var20 = this.field1354[var19];
            int var21 = this.field1355[var19];
            int var22 = this.field1378[var19];
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
            field1404[var19] = var30 - var18;
            field1384[var19] = class85.field1431 * var26 / var30 + var8;
            field1385[var19] = class85.field1431 * var29 / var30 + var9;
            if (this.field1369 > 0) {
                field1387[var19] = var26;
                field1388[var19] = var29;
                field1389[var19] = var30;
            }
        }
        try {
            this.method1504(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("ca.u(IIIIIIII)V")
    public final void method1507(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1391[0] = -1;
        if (this.field1386 != 2 && this.field1386 != 1) {
            this.method1554();
        }
        int var9 = Statics.field1432;
        int var10 = Statics.field1436;
        int var11 = field1409[arg0];
        int var12 = field1410[arg0];
        int var13 = field1409[arg1];
        int var14 = field1410[arg1];
        int var15 = field1409[arg2];
        int var16 = field1410[arg2];
        int var17 = field1409[arg3];
        int var18 = field1410[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1352; var20++) {
            int var21 = this.field1354[var20];
            int var22 = this.field1355[var20];
            int var23 = this.field1378[var20];
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
            field1404[var20] = var31 - var19;
            field1384[var20] = class85.field1431 * var27 / arg7 + var9;
            field1385[var20] = class85.field1431 * var30 / arg7 + var10;
            if (this.field1369 > 0) {
                field1387[var20] = var27;
                field1388[var20] = var30;
                field1389[var20] = var31;
            }
        }
        try {
            this.method1504(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("ca.cu(IIIIIIIII)V")
    public void method1571(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1391[0] = -1;
        if (this.field1386 != 1) {
            this.method1494();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1379 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1379) * class85.field1431;
        if (var15 / var13 >= Statics.field1437) {
            return;
        }
        int var16 = (this.field1379 + var14) * class85.field1431;
        if (var16 / var13 <= Statics.field1440) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1379 * arg1 >> 16;
        int var19 = (var17 + var18) * class85.field1431;
        if (var19 / var13 <= Statics.field1438) {
            return;
        }
        int var20 = (this.field1535 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class85.field1431;
        if (var21 / var13 >= Statics.field1439) {
            return;
        }
        int var22 = (this.field1535 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1369 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1349) {
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
            int var32 = field1414 - Statics.field1432;
            int var33 = field1405 - Statics.field1436;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1400) {
                    field1383[field1408++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1432;
        int var35 = Statics.field1436;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1409[arg0];
            var37 = field1410[arg0];
        }
        for (int var38 = 0; var38 < this.field1352; var38++) {
            int var39 = this.field1354[var38];
            int var40 = this.field1355[var38];
            int var41 = this.field1378[var38];
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
            field1404[var38] = var50 - var11;
            if (var50 >= 50) {
                field1384[var38] = class85.field1431 * var46 / var50 + var34;
                field1385[var38] = class85.field1431 * var49 / var50 + var35;
            } else {
                field1384[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1387[var38] = var46;
                field1388[var38] = var49;
                field1389[var38] = var50;
            }
        }
        try {
            this.method1504(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("ca.t(ZZI)V")
    public final void method1504(boolean arg0, boolean arg1, int arg2) {
        if (this.field1390 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1390; var4++) {
            field1391[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1357; var5++) {
            if (this.field1363[var5] != -2) {
                int var6 = this.field1358[var5];
                int var7 = this.field1375[var5];
                int var8 = this.field1351[var5];
                int var9 = field1384[var6];
                int var10 = field1384[var7];
                int var11 = field1384[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1387[var6];
                    int var13 = field1387[var7];
                    int var14 = field1387[var8];
                    int var15 = field1388[var6];
                    int var16 = field1388[var7];
                    int var17 = field1388[var8];
                    int var18 = field1389[var6];
                    int var19 = field1389[var7];
                    int var20 = field1389[var8];
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
                        int var30 = (field1404[var6] + field1404[var7] + field1404[var8]) / 3 + this.field1380;
                        field1392[var30][field1391[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method1512(field1414, field1405, field1385[var6], field1385[var7], field1385[var8], var9, var10, var11)) {
                        field1383[field1408++] = arg2;
                        arg1 = false;
                    }
                    if ((field1385[var8] - field1385[var7]) * (var9 - var10) - (field1385[var6] - field1385[var7]) * (var11 - var10) > 0) {
                        field1374[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1434 && var10 <= Statics.field1434 && var11 <= Statics.field1434) {
                            field1382[var5] = false;
                        } else {
                            field1382[var5] = true;
                        }
                        int var31 = (field1404[var6] + field1404[var7] + field1404[var8]) / 3 + this.field1380;
                        field1392[var31][field1391[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1411 == null) {
            for (int var32 = this.field1390 - 1; var32 >= 0; var32--) {
                int var33 = field1391[var32];
                if (var33 > 0) {
                    int[] var34 = field1392[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method1510(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1393[var36] = 0;
            field1397[var36] = 0;
        }
        for (int var37 = this.field1390 - 1; var37 >= 0; var37--) {
            int var38 = field1391[var37];
            if (var38 > 0) {
                int[] var39 = field1392[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1411[var41];
                    int var43 = field1393[var42]++;
                    field1394[var42][var43] = var41;
                    if (var42 < 10) {
                        field1397[var42] += var37;
                    } else if (var42 == 10) {
                        field1395[var43] = var37;
                    } else {
                        field1396[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1393[1] > 0 || field1393[2] > 0) {
            var44 = (field1397[1] + field1397[2]) / (field1393[1] + field1393[2]);
        }
        int var45 = 0;
        if (field1393[3] > 0 || field1393[4] > 0) {
            var45 = (field1397[3] + field1397[4]) / (field1393[3] + field1393[4]);
        }
        int var46 = 0;
        if (field1393[6] > 0 || field1393[8] > 0) {
            var46 = (field1397[6] + field1397[8]) / (field1393[6] + field1393[8]);
        }
        int var47 = 0;
        int var48 = field1393[10];
        int[] var49 = field1394[10];
        int[] var50 = field1395;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1393[11];
            var49 = field1394[11];
            var50 = field1396;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method1510(var49[var47++]);
                if (var47 == var48 && field1394[11] != var49) {
                    var47 = 0;
                    var48 = field1393[11];
                    var49 = field1394[11];
                    var50 = field1396;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method1510(var49[var47++]);
                if (var47 == var48 && field1394[11] != var49) {
                    var47 = 0;
                    var48 = field1393[11];
                    var49 = field1394[11];
                    var50 = field1396;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method1510(var49[var47++]);
                if (var47 == var48 && field1394[11] != var49) {
                    var47 = 0;
                    var48 = field1393[11];
                    var49 = field1394[11];
                    var50 = field1396;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1393[var52];
            int[] var54 = field1394[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method1510(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method1510(var49[var47++]);
            if (var47 == var48 && field1394[11] != var49) {
                var47 = 0;
                var49 = field1394[11];
                var48 = field1393[11];
                var50 = field1396;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("ca.av(I)V")
    public final void method1510(int arg0) {
        if (field1374[arg0]) {
            this.method1511(arg0);
            return;
        }
        int var2 = this.field1358[arg0];
        int var3 = this.field1375[arg0];
        int var4 = this.field1351[arg0];
        class85.field1443 = field1382[arg0];
        if (this.field1365 == null) {
            class85.field1426 = 0;
        } else {
            class85.field1426 = this.field1365[arg0] & 0xFF;
        }
        if (this.field1367 != null && this.field1367[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1366 == null || this.field1366[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1366[arg0] & 0xFF;
                var6 = this.field1407[var5];
                var7 = this.field1356[var5];
                var8 = this.field1372[var5];
            }
            if (this.field1363[arg0] == -1) {
                class85.method1636(field1385[var2], field1385[var3], field1385[var4], field1384[var2], field1384[var3], field1384[var4], this.field1361[arg0], this.field1361[arg0], this.field1361[arg0], field1387[var6], field1387[var7], field1387[var8], field1388[var6], field1388[var7], field1388[var8], field1389[var6], field1389[var7], field1389[var8], this.field1367[arg0]);
            } else {
                class85.method1636(field1385[var2], field1385[var3], field1385[var4], field1384[var2], field1384[var3], field1384[var4], this.field1361[arg0], this.field1362[arg0], this.field1363[arg0], field1387[var6], field1387[var7], field1387[var8], field1388[var6], field1388[var7], field1388[var8], field1389[var6], field1389[var7], field1389[var8], this.field1367[arg0]);
            }
        } else if (this.field1363[arg0] == -1) {
            class85.method1613(field1385[var2], field1385[var3], field1385[var4], field1384[var2], field1384[var3], field1384[var4], field1406[this.field1361[arg0]]);
        } else {
            class85.method1585(field1385[var2], field1385[var3], field1385[var4], field1384[var2], field1384[var3], field1384[var4], this.field1361[arg0], this.field1362[arg0], this.field1363[arg0]);
        }
    }

    @ObfuscatedName("ca.aw(I)V")
    public final void method1511(int arg0) {
        int var2 = Statics.field1432;
        int var3 = Statics.field1436;
        int var4 = 0;
        int var5 = this.field1358[arg0];
        int var6 = this.field1375[arg0];
        int var7 = this.field1351[arg0];
        int var8 = field1389[var5];
        int var9 = field1389[var6];
        int var10 = field1389[var7];
        if (this.field1365 == null) {
            class85.field1426 = 0;
        } else {
            class85.field1426 = this.field1365[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1398[var4] = field1384[var5];
            field1399[var4] = field1385[var5];
            field1371[var4++] = this.field1361[arg0];
        } else {
            int var11 = field1387[var5];
            int var12 = field1388[var5];
            int var13 = this.field1361[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1412[var10 - var8];
                field1398[var4] = (((field1387[var7] - var11) * var14 >> 16) + var11) * class85.field1431 / 50 + var2;
                field1399[var4] = (((field1388[var7] - var12) * var14 >> 16) + var12) * class85.field1431 / 50 + var3;
                field1371[var4++] = ((this.field1363[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1412[var9 - var8];
                field1398[var4] = (((field1387[var6] - var11) * var15 >> 16) + var11) * class85.field1431 / 50 + var2;
                field1399[var4] = (((field1388[var6] - var12) * var15 >> 16) + var12) * class85.field1431 / 50 + var3;
                field1371[var4++] = ((this.field1362[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1398[var4] = field1384[var6];
            field1399[var4] = field1385[var6];
            field1371[var4++] = this.field1362[arg0];
        } else {
            int var16 = field1387[var6];
            int var17 = field1388[var6];
            int var18 = this.field1362[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1412[var8 - var9];
                field1398[var4] = (((field1387[var5] - var16) * var19 >> 16) + var16) * class85.field1431 / 50 + var2;
                field1399[var4] = (((field1388[var5] - var17) * var19 >> 16) + var17) * class85.field1431 / 50 + var3;
                field1371[var4++] = ((this.field1361[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1412[var10 - var9];
                field1398[var4] = (((field1387[var7] - var16) * var20 >> 16) + var16) * class85.field1431 / 50 + var2;
                field1399[var4] = (((field1388[var7] - var17) * var20 >> 16) + var17) * class85.field1431 / 50 + var3;
                field1371[var4++] = ((this.field1363[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1398[var4] = field1384[var7];
            field1399[var4] = field1385[var7];
            field1371[var4++] = this.field1363[arg0];
        } else {
            int var21 = field1387[var7];
            int var22 = field1388[var7];
            int var23 = this.field1363[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1412[var9 - var10];
                field1398[var4] = (((field1387[var6] - var21) * var24 >> 16) + var21) * class85.field1431 / 50 + var2;
                field1399[var4] = (((field1388[var6] - var22) * var24 >> 16) + var22) * class85.field1431 / 50 + var3;
                field1371[var4++] = ((this.field1362[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1412[var8 - var10];
                field1398[var4] = (((field1387[var5] - var21) * var25 >> 16) + var21) * class85.field1431 / 50 + var2;
                field1399[var4] = (((field1388[var5] - var22) * var25 >> 16) + var22) * class85.field1431 / 50 + var3;
                field1371[var4++] = ((this.field1361[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1398[0];
        int var27 = field1398[1];
        int var28 = field1398[2];
        int var29 = field1399[0];
        int var30 = field1399[1];
        int var31 = field1399[2];
        class85.field1443 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1434 || var27 > Statics.field1434 || var28 > Statics.field1434) {
                class85.field1443 = true;
            }
            if (this.field1367 != null && this.field1367[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1366 == null || this.field1366[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1366[arg0] & 0xFF;
                    var33 = this.field1407[var32];
                    var34 = this.field1356[var32];
                    var35 = this.field1372[var32];
                }
                if (this.field1363[arg0] == -1) {
                    class85.method1636(var29, var30, var31, var26, var27, var28, this.field1361[arg0], this.field1361[arg0], this.field1361[arg0], field1387[var33], field1387[var34], field1387[var35], field1388[var33], field1388[var34], field1388[var35], field1389[var33], field1389[var34], field1389[var35], this.field1367[arg0]);
                } else {
                    class85.method1636(var29, var30, var31, var26, var27, var28, field1371[0], field1371[1], field1371[2], field1387[var33], field1387[var34], field1387[var35], field1388[var33], field1388[var34], field1388[var35], field1389[var33], field1389[var34], field1389[var35], this.field1367[arg0]);
                }
            } else if (this.field1363[arg0] == -1) {
                class85.method1613(var29, var30, var31, var26, var27, var28, field1406[this.field1361[arg0]]);
            } else {
                class85.method1585(var29, var30, var31, var26, var27, var28, field1371[0], field1371[1], field1371[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1434 || var27 > Statics.field1434 || var28 > Statics.field1434 || field1398[3] < 0 || field1398[3] > Statics.field1434) {
            class85.field1443 = true;
        }
        if (this.field1367 != null && this.field1367[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1366 == null || this.field1366[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1366[arg0] & 0xFF;
                var37 = this.field1407[var36];
                var38 = this.field1356[var36];
                var39 = this.field1372[var36];
            }
            short var40 = this.field1367[arg0];
            if (this.field1363[arg0] == -1) {
                class85.method1636(var29, var30, var31, var26, var27, var28, this.field1361[arg0], this.field1361[arg0], this.field1361[arg0], field1387[var37], field1387[var38], field1387[var39], field1388[var37], field1388[var38], field1388[var39], field1389[var37], field1389[var38], field1389[var39], var40);
                class85.method1636(var29, var31, field1399[3], var26, var28, field1398[3], this.field1361[arg0], this.field1361[arg0], this.field1361[arg0], field1387[var37], field1387[var38], field1387[var39], field1388[var37], field1388[var38], field1388[var39], field1389[var37], field1389[var38], field1389[var39], var40);
            } else {
                class85.method1636(var29, var30, var31, var26, var27, var28, field1371[0], field1371[1], field1371[2], field1387[var37], field1387[var38], field1387[var39], field1388[var37], field1388[var38], field1388[var39], field1389[var37], field1389[var38], field1389[var39], var40);
                class85.method1636(var29, var31, field1399[3], var26, var28, field1398[3], field1371[0], field1371[2], field1371[3], field1387[var37], field1387[var38], field1387[var39], field1388[var37], field1388[var38], field1388[var39], field1389[var37], field1389[var38], field1389[var39], var40);
            }
        } else if (this.field1363[arg0] == -1) {
            int var41 = field1406[this.field1361[arg0]];
            class85.method1613(var29, var30, var31, var26, var27, var28, var41);
            class85.method1613(var29, var31, field1399[3], var26, var28, field1398[3], var41);
        } else {
            class85.method1585(var29, var30, var31, var26, var27, var28, field1371[0], field1371[1], field1371[2]);
            class85.method1585(var29, var31, field1399[3], var26, var28, field1398[3], field1371[0], field1371[2], field1371[3]);
        }
    }

    @ObfuscatedName("ca.ay(IIIIIIII)Z")
    public final boolean method1512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
