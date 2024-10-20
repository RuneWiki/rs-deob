package deob;

@ObfuscatedName("bx")
public class class74 extends class212 {

    @ObfuscatedName("bx.e")
    public byte[][] field1388;

    @ObfuscatedName("bx.l")
    public int field1359;

    @ObfuscatedName("bx.c")
    public int field1360;

    @ObfuscatedName("bx.h")
    public int field1375;

    @ObfuscatedName("bx.r")
    public int field1382;

    @ObfuscatedName("bx.a")
    public boolean field1384;

    @ObfuscatedName("bx.t")
    public static boolean field1389 = false;

    @ObfuscatedName("bx.z")
    public float[] field1376;

    @ObfuscatedName("bx.y")
    public int field1377;

    @ObfuscatedName("bx.m")
    public int field1378;

    @ObfuscatedName("bx.v")
    public boolean field1391;

    @ObfuscatedName("bx.av")
    public byte[] field1370;

    @ObfuscatedName("bx.al")
    public int field1390;

    @ObfuscatedName("bx.ap")
    public int field1363;

    @ObfuscatedName("bx.e(I)F")
    public static float method1555(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @ObfuscatedName("bx.l([BI)V")
    public static void method1536(byte[] arg0, int arg1) {
        Statics.field1364 = arg0;
        Statics.field1365 = arg1;
        Statics.field1366 = 0;
    }

    @ObfuscatedName("bx.c()I")
    public static int method1542() {
        int var0 = Statics.field1364[Statics.field1365] >> Statics.field1366 & 0x1;
        Statics.field1366++;
        Statics.field1365 += Statics.field1366 >> 3;
        Statics.field1366 &= 0x7;
        return var0;
    }

    @ObfuscatedName("bx.h(I)I")
    public static int method1538(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - Statics.field1366) {
            int var3 = 8 - Statics.field1366;
            int var4 = (0x1 << var3) - 1;
            var1 += (Statics.field1364[Statics.field1365] >> Statics.field1366 & var4) << var2;
            Statics.field1366 = 0;
            Statics.field1365++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (Statics.field1364[Statics.field1365] >> Statics.field1366 & var5) << var2;
            Statics.field1366 += arg0;
        }
        return var1;
    }

    @ObfuscatedName("bx.r([B)V")
    public void method1550(byte[] arg0) {
        class123 var2 = new class123(arg0);
        this.field1359 = var2.method2468();
        this.field1360 = var2.method2468();
        this.field1375 = var2.method2468();
        this.field1382 = var2.method2468();
        if (this.field1382 < 0) {
            this.field1382 = ~this.field1382;
            this.field1384 = true;
        }
        int var3 = var2.method2468();
        this.field1388 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method2464();
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method2591(var7, 0, var5);
            this.field1388[var4] = var7;
        }
    }

    @ObfuscatedName("bx.a([B)V")
    public static void method1540(byte[] arg0) {
        method1536(arg0, 0);
        Statics.field1367 = 0x1 << method1538(4);
        Statics.field1380 = 0x1 << method1538(4);
        Statics.field1362 = new float[Statics.field1380];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? Statics.field1367 : Statics.field1380;
            int var3 = var2 >> 1;
            int var4 = var2 >> 2;
            int var5 = var2 >> 3;
            float[] var6 = new float[var3];
            for (int var7 = 0; var7 < var4; var7++) {
                var6[var7 * 2] = (float) Math.cos((double) (var7 * 4) * 3.141592653589793D / (double) var2);
                var6[var7 * 2 + 1] = -((float) Math.sin((double) (var7 * 4) * 3.141592653589793D / (double) var2));
            }
            float[] var8 = new float[var3];
            for (int var9 = 0; var9 < var4; var9++) {
                var8[var9 * 2] = (float) Math.cos((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
                var8[var9 * 2 + 1] = (float) Math.sin((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
            }
            float[] var10 = new float[var4];
            for (int var11 = 0; var11 < var5; var11++) {
                var10[var11 * 2] = (float) Math.cos((double) (var11 * 4 + 2) * 3.141592653589793D / (double) var2);
                var10[var11 * 2 + 1] = -((float) Math.sin((double) (var11 * 4 + 2) * 3.141592653589793D / (double) var2));
            }
            int[] var12 = new int[var5];
            int var13 = class130.method770(var5 - 1);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class130.method1088(var14, var13);
            }
            if (var1 == 0) {
                Statics.field1381 = var6;
                Statics.field1374 = var8;
                Statics.field1383 = var10;
                Statics.field1387 = var12;
            } else {
                Statics.field1379 = var6;
                Statics.field1385 = var8;
                Statics.field1386 = var10;
                Statics.field1368 = var12;
            }
        }
        int var15 = method1538(8) + 1;
        Statics.field1369 = new class77[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            Statics.field1369[var16] = new class77();
        }
        int var17 = method1538(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method1538(16);
        }
        int var19 = method1538(6) + 1;
        Statics.field1371 = new class71[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            Statics.field1371[var20] = new class71();
        }
        int var21 = method1538(6) + 1;
        Statics.field1358 = new class64[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            Statics.field1358[var22] = new class64();
        }
        int var23 = method1538(6) + 1;
        Statics.field1372 = new class72[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            Statics.field1372[var24] = new class72();
        }
        int var25 = method1538(6) + 1;
        Statics.field1373 = new boolean[var25];
        Statics.field1361 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            Statics.field1373[var26] = method1542() != 0;
            method1538(16);
            method1538(16);
            Statics.field1361[var26] = method1538(8);
        }
    }

    @ObfuscatedName("bx.b(I)[F")
    public float[] method1541(int arg0) {
        method1536(this.field1388[arg0], 0);
        method1542();
        int var2 = method1538(class130.method770(Statics.field1361.length - 1));
        boolean var3 = Statics.field1373[var2];
        int var4 = var3 ? Statics.field1380 : Statics.field1367;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1542() != 0;
            var6 = method1542() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (Statics.field1367 >> 2);
            var9 = (Statics.field1367 >> 2) + (var4 >> 2);
            var10 = Statics.field1367 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (Statics.field1367 >> 2);
            var12 = (Statics.field1367 >> 2) + (var4 - (var4 >> 2));
            var13 = Statics.field1367 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class72 var14 = Statics.field1372[Statics.field1361[var2]];
        int var15 = var14.field1350;
        int var16 = var14.field1352[var15];
        boolean var17 = !Statics.field1371[var16].method1527();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1351; var19++) {
            class64 var20 = Statics.field1358[var14.field1353[var19]];
            float[] var21 = Statics.field1362;
            var20.method1339(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field1350;
            int var23 = var14.field1352[var22];
            Statics.field1371[var23].method1515(Statics.field1362, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                Statics.field1362[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = Statics.field1362;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? Statics.field1379 : Statics.field1381;
            float[] var32 = var3 ? Statics.field1385 : Statics.field1374;
            float[] var33 = var3 ? Statics.field1386 : Statics.field1383;
            int[] var34 = var3 ? Statics.field1368 : Statics.field1387;
            for (int var35 = 0; var35 < var26; var35++) {
                float var36 = var28[var35 * 4] - var28[var4 - var35 * 4 - 1];
                float var37 = var28[var35 * 4 + 2] - var28[var4 - var35 * 4 - 3];
                float var38 = var31[var35 * 2];
                float var39 = var31[var35 * 2 + 1];
                var28[var4 - var35 * 4 - 1] = var36 * var38 - var37 * var39;
                var28[var4 - var35 * 4 - 3] = var36 * var39 + var37 * var38;
            }
            for (int var40 = 0; var40 < var27; var40++) {
                float var41 = var28[var40 * 4 + var25 + 3];
                float var42 = var28[var40 * 4 + var25 + 1];
                float var43 = var28[var40 * 4 + 3];
                float var44 = var28[var40 * 4 + 1];
                var28[var40 * 4 + var25 + 3] = var41 + var43;
                var28[var40 * 4 + var25 + 1] = var42 + var44;
                float var45 = var31[var25 - 4 - var40 * 4];
                float var46 = var31[var25 - 3 - var40 * 4];
                var28[var40 * 4 + 3] = (var41 - var43) * var45 - (var42 - var44) * var46;
                var28[var40 * 4 + 1] = (var41 - var43) * var46 + (var42 - var44) * var45;
            }
            int var47 = class130.method770(var4 - 1);
            for (int var48 = 0; var48 < var47 - 3; var48++) {
                int var49 = var4 >> var48 + 2;
                int var50 = 0x8 << var48;
                for (int var51 = 0; var51 < 0x2 << var48; var51++) {
                    int var52 = var4 - var49 * 2 * var51;
                    int var53 = var4 - (var51 * 2 + 1) * var49;
                    for (int var54 = 0; var54 < var4 >> var48 + 4; var54++) {
                        int var55 = var54 * 4;
                        float var56 = var28[var52 - 1 - var55];
                        float var57 = var28[var52 - 3 - var55];
                        float var58 = var28[var53 - 1 - var55];
                        float var59 = var28[var53 - 3 - var55];
                        var28[var52 - 1 - var55] = var56 + var58;
                        var28[var52 - 3 - var55] = var57 + var59;
                        float var60 = var31[var50 * var54];
                        float var61 = var31[var50 * var54 + 1];
                        var28[var53 - 1 - var55] = (var56 - var58) * var60 - (var57 - var59) * var61;
                        var28[var53 - 3 - var55] = (var56 - var58) * var61 + (var57 - var59) * var60;
                    }
                }
            }
            for (int var62 = 1; var62 < var27 - 1; var62++) {
                int var63 = var34[var62];
                if (var62 < var63) {
                    int var64 = var62 * 8;
                    int var65 = var63 * 8;
                    float var66 = var28[var64 + 1];
                    var28[var64 + 1] = var28[var65 + 1];
                    var28[var65 + 1] = var66;
                    float var67 = var28[var64 + 3];
                    var28[var64 + 3] = var28[var65 + 3];
                    var28[var65 + 3] = var67;
                    float var68 = var28[var64 + 5];
                    var28[var64 + 5] = var28[var65 + 5];
                    var28[var65 + 5] = var68;
                    float var69 = var28[var64 + 7];
                    var28[var64 + 7] = var28[var65 + 7];
                    var28[var65 + 7] = var69;
                }
            }
            for (int var70 = 0; var70 < var25; var70++) {
                var28[var70] = var28[var70 * 2 + 1];
            }
            for (int var71 = 0; var71 < var27; var71++) {
                var28[var4 - 1 - var71 * 2] = var28[var71 * 4];
                var28[var4 - 2 - var71 * 2] = var28[var71 * 4 + 1];
                var28[var4 - var26 - 1 - var71 * 2] = var28[var71 * 4 + 2];
                var28[var4 - var26 - 2 - var71 * 2] = var28[var71 * 4 + 3];
            }
            for (int var72 = 0; var72 < var27; var72++) {
                float var73 = var33[var72 * 2];
                float var74 = var33[var72 * 2 + 1];
                float var75 = var28[var72 * 2 + var25];
                float var76 = var28[var72 * 2 + var25 + 1];
                float var77 = var28[var4 - 2 - var72 * 2];
                float var78 = var28[var4 - 1 - var72 * 2];
                float var79 = (var75 - var77) * var74 + (var76 + var78) * var73;
                var28[var72 * 2 + var25] = (var75 + var77 + var79) * 0.5F;
                var28[var4 - 2 - var72 * 2] = (var75 + var77 - var79) * 0.5F;
                float var80 = (var76 + var78) * var74 - (var75 - var77) * var73;
                var28[var72 * 2 + var25 + 1] = (var76 - var78 + var80) * 0.5F;
                var28[var4 - 1 - var72 * 2] = (-var76 + var78 + var80) * 0.5F;
            }
            for (int var81 = 0; var81 < var26; var81++) {
                var28[var81] = var32[var81 * 2] * var28[var81 * 2 + var25] + var32[var81 * 2 + 1] * var28[var81 * 2 + 1 + var25];
                var28[var25 - 1 - var81] = var28[var81 * 2 + var25] * var32[var81 * 2 + 1] - var32[var81 * 2] * var28[var81 * 2 + 1 + var25];
            }
            for (int var82 = 0; var82 < var26; var82++) {
                var28[var4 - var26 + var82] = -var28[var82];
            }
            for (int var83 = 0; var83 < var26; var83++) {
                var28[var83] = var28[var26 + var83];
            }
            for (int var84 = 0; var84 < var26; var84++) {
                var28[var26 + var84] = -var28[var26 - var84 - 1];
            }
            for (int var85 = 0; var85 < var26; var85++) {
                var28[var25 + var85] = var28[var4 - var85 - 1];
            }
            for (int var86 = var8; var86 < var9; var86++) {
                float var87 = (float) Math.sin(((double) (var86 - var8) + 0.5D) / (double) var10 * 0.5D * 3.141592653589793D);
                Statics.field1362[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                Statics.field1362[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field1377 > 0) {
            int var91 = this.field1377 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field1391) {
                for (int var92 = 0; var92 < this.field1378; var92++) {
                    int var93 = (this.field1377 >> 1) + var92;
                    var90[var92] += this.field1376[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length - (var4 >> 1) + var94;
                    var90[var95] += Statics.field1362[var94];
                }
            }
        }
        float[] var96 = this.field1376;
        this.field1376 = Statics.field1362;
        Statics.field1362 = var96;
        this.field1377 = var4;
        this.field1378 = var12 - (var4 >> 1);
        this.field1391 = var17;
        return var90;
    }

    @ObfuscatedName("bx.u(Lfe;)Z")
    public static boolean method1556(class171 arg0) {
        if (!field1389) {
            byte[] var1 = arg0.method3130(0, 0);
            if (var1 == null) {
                return false;
            }
            method1540(var1);
            field1389 = true;
        }
        return true;
    }

    @ObfuscatedName("bx.o(Lfe;II)Lbx;")
    public static class74 method1544(class171 arg0, int arg1, int arg2) {
        if (method1556(arg0)) {
            byte[] var3 = arg0.method3130(arg1, arg2);
            return var3 == null ? null : new class74(var3);
        } else {
            arg0.method3134(arg1, arg2);
            return null;
        }
    }

    public class74(byte[] arg0) {
        this.method1550(arg0);
    }

    @ObfuscatedName("bx.p([I)Lbf;")
    public class66 method1545(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field1370 == null) {
            this.field1377 = 0;
            this.field1376 = new float[Statics.field1380];
            this.field1370 = new byte[this.field1360];
            this.field1390 = 0;
            this.field1363 = 0;
        }
        while (this.field1363 < this.field1388.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method1541(this.field1363);
            if (var2 != null) {
                int var3 = this.field1390;
                int var4 = var2.length;
                if (var4 > this.field1360 - var3) {
                    var4 = this.field1360 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field1370[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field1390;
                }
                this.field1390 = var3;
            }
            this.field1363++;
        }
        this.field1376 = null;
        byte[] var7 = this.field1370;
        this.field1370 = null;
        return new class66(this.field1359, var7, this.field1375, this.field1382, this.field1384);
    }
}
