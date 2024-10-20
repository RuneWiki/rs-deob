package deob;

@ObfuscatedName("cr")
public class class95 extends class207 {

    @ObfuscatedName("cr.f")
    public byte[][] field1290;

    @ObfuscatedName("cr.h")
    public int field1319;

    @ObfuscatedName("cr.e")
    public int field1291;

    @ObfuscatedName("cr.b")
    public int field1301;

    @ObfuscatedName("cr.l")
    public int field1293;

    @ObfuscatedName("cr.w")
    public boolean field1294;

    @ObfuscatedName("cr.o")
    public static boolean field1303 = false;

    @ObfuscatedName("cr.t")
    public float[] field1307;

    @ObfuscatedName("cr.v")
    public int field1308;

    @ObfuscatedName("cr.p")
    public int field1309;

    @ObfuscatedName("cr.z")
    public boolean field1306;

    @ObfuscatedName("cr.aa")
    public byte[] field1320;

    @ObfuscatedName("cr.ag")
    public int field1321;

    @ObfuscatedName("cr.aj")
    public int field1322;

    @ObfuscatedName("cr.f(I)F")
    public static float method1985(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @ObfuscatedName("cr.h([BI)V")
    public static void method1976(byte[] arg0, int arg1) {
        Statics.field1295 = arg0;
        Statics.field1296 = arg1;
        Statics.field1311 = 0;
    }

    @ObfuscatedName("cr.e()I")
    public static int method1977() {
        int var0 = Statics.field1295[Statics.field1296] >> Statics.field1311 & 0x1;
        Statics.field1311++;
        Statics.field1296 += Statics.field1311 >> 3;
        Statics.field1311 &= 0x7;
        return var0;
    }

    @ObfuscatedName("cr.b(I)I")
    public static int method1994(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - Statics.field1311) {
            int var3 = 8 - Statics.field1311;
            int var4 = (0x1 << var3) - 1;
            var1 += (Statics.field1295[Statics.field1296] >> Statics.field1311 & var4) << var2;
            Statics.field1311 = 0;
            Statics.field1296++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (Statics.field1295[Statics.field1296] >> Statics.field1311 & var5) << var2;
            Statics.field1311 += arg0;
        }
        return var1;
    }

    @ObfuscatedName("cr.l([B)V")
    public void method1979(byte[] arg0) {
        class185 var2 = new class185(arg0);
        this.field1319 = var2.method3328();
        this.field1291 = var2.method3328();
        this.field1301 = var2.method3328();
        this.field1293 = var2.method3328();
        if (this.field1293 < 0) {
            this.field1293 = ~this.field1293;
            this.field1294 = true;
        }
        int var3 = var2.method3328();
        this.field1290 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method3323();
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method3326(var7, 0, var5);
            this.field1290[var4] = var7;
        }
    }

    @ObfuscatedName("cr.w([B)V")
    public static void method1996(byte[] arg0) {
        method1976(arg0, 0);
        Statics.field1310 = 0x1 << method1994(4);
        Statics.field1299 = 0x1 << method1994(4);
        Statics.field1314 = new float[Statics.field1299];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? Statics.field1310 : Statics.field1299;
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
            int var13 = Statics.method643(var5 - 1);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class190.method2092(var14, var13);
            }
            if (var1 == 0) {
                Statics.field1312 = var6;
                Statics.field1313 = var8;
                Statics.field1289 = var10;
                Statics.field1318 = var12;
            } else {
                Statics.field1315 = var6;
                Statics.field1298 = var8;
                Statics.field1317 = var10;
                Statics.field1297 = var12;
            }
        }
        int var15 = method1994(8) + 1;
        Statics.field1300 = new class93[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            Statics.field1300[var16] = new class93();
        }
        int var17 = method1994(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method1994(16);
        }
        int var19 = method1994(6) + 1;
        Statics.field1292 = new class97[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            Statics.field1292[var20] = new class97();
        }
        int var21 = method1994(6) + 1;
        Statics.field1302 = new class104[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            Statics.field1302[var22] = new class104();
        }
        int var23 = method1994(6) + 1;
        Statics.field1316 = new class109[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            Statics.field1316[var24] = new class109();
        }
        int var25 = method1994(6) + 1;
        Statics.field1304 = new boolean[var25];
        Statics.field1305 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            Statics.field1304[var26] = method1977() != 0;
            method1994(16);
            method1994(16);
            Statics.field1305[var26] = method1994(8);
        }
    }

    @ObfuscatedName("cr.d(I)[F")
    public float[] method1981(int arg0) {
        method1976(this.field1290[arg0], 0);
        method1977();
        int var2 = method1994(Statics.method643(Statics.field1305.length - 1));
        boolean var3 = Statics.field1304[var2];
        int var4 = var3 ? Statics.field1299 : Statics.field1310;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1977() != 0;
            var6 = method1977() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (Statics.field1310 >> 2);
            var9 = (Statics.field1310 >> 2) + (var4 >> 2);
            var10 = Statics.field1310 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (Statics.field1310 >> 2);
            var12 = (Statics.field1310 >> 2) + (var4 - (var4 >> 2));
            var13 = Statics.field1310 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class109 var14 = Statics.field1316[Statics.field1305[var2]];
        int var15 = var14.field1432;
        int var16 = var14.field1433[var15];
        boolean var17 = !Statics.field1292[var16].method2017();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1434; var19++) {
            class104 var20 = Statics.field1302[var14.field1435[var19]];
            float[] var21 = Statics.field1314;
            var20.method2114(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field1432;
            int var23 = var14.field1433[var22];
            Statics.field1292[var23].method2019(Statics.field1314, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                Statics.field1314[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = Statics.field1314;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? Statics.field1315 : Statics.field1312;
            float[] var32 = var3 ? Statics.field1298 : Statics.field1313;
            float[] var33 = var3 ? Statics.field1317 : Statics.field1289;
            int[] var34 = var3 ? Statics.field1297 : Statics.field1318;
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
            int var47 = Statics.method643(var4 - 1);
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
                Statics.field1314[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                Statics.field1314[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field1308 > 0) {
            int var91 = this.field1308 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field1306) {
                for (int var92 = 0; var92 < this.field1309; var92++) {
                    int var93 = (this.field1308 >> 1) + var92;
                    var90[var92] += this.field1307[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length - (var4 >> 1) + var94;
                    var90[var95] += Statics.field1314[var94];
                }
            }
        }
        float[] var96 = this.field1307;
        this.field1307 = Statics.field1314;
        Statics.field1314 = var96;
        this.field1308 = var4;
        this.field1309 = var12 - (var4 >> 1);
        this.field1306 = var17;
        return var90;
    }

    @ObfuscatedName("cr.n(Lie;)Z")
    public static boolean method1982(class250 arg0) {
        if (!field1303) {
            byte[] var1 = arg0.method4267(0, 0);
            if (var1 == null) {
                return false;
            }
            method1996(var1);
            field1303 = true;
        }
        return true;
    }

    @ObfuscatedName("cr.s(Lie;II)Lcr;")
    public static class95 method1983(class250 arg0, int arg1, int arg2) {
        if (method1982(arg0)) {
            byte[] var3 = arg0.method4267(arg1, arg2);
            return var3 == null ? null : new class95(var3);
        } else {
            arg0.method4316(arg1, arg2);
            return null;
        }
    }

    public class95(byte[] arg0) {
        this.method1979(arg0);
    }

    @ObfuscatedName("cr.g([I)Lcb;")
    public class96 method1975(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field1320 == null) {
            this.field1308 = 0;
            this.field1307 = new float[Statics.field1299];
            this.field1320 = new byte[this.field1291];
            this.field1321 = 0;
            this.field1322 = 0;
        }
        while (this.field1322 < this.field1290.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method1981(this.field1322);
            if (var2 != null) {
                int var3 = this.field1321;
                int var4 = var2.length;
                if (var4 > this.field1291 - var3) {
                    var4 = this.field1291 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field1320[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field1321;
                }
                this.field1321 = var3;
            }
            this.field1322++;
        }
        this.field1307 = null;
        byte[] var7 = this.field1320;
        this.field1320 = null;
        return new class96(this.field1319, var7, this.field1301, this.field1293, this.field1294);
    }
}
