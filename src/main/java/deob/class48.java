package deob;

@ObfuscatedName("ar")
public class class48 extends class409 {

    @ObfuscatedName("ar.v")
    public byte[][] field375;

    @ObfuscatedName("ar.c")
    public int field358;

    @ObfuscatedName("ar.i")
    public int field359;

    @ObfuscatedName("ar.f")
    public int field360;

    @ObfuscatedName("ar.b")
    public int field361;

    @ObfuscatedName("ar.n")
    public boolean field374;

    @ObfuscatedName("ar.t")
    public static boolean field370 = false;

    @ObfuscatedName("ar.g")
    public float[] field378;

    @ObfuscatedName("ar.x")
    public int field376;

    @ObfuscatedName("ar.a")
    public int field377;

    @ObfuscatedName("ar.y")
    public boolean field390;

    @ObfuscatedName("ar.ao")
    public byte[] field381;

    @ObfuscatedName("ar.aj")
    public int field389;

    @ObfuscatedName("ar.al")
    public int field365;

    @ObfuscatedName("ar.v(I)F")
    public static float method954(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @ObfuscatedName("ar.c([BI)V")
    public static void method949(byte[] arg0, int arg1) {
        Statics.field363 = arg0;
        Statics.field369 = arg1;
        Statics.field366 = 0;
    }

    @ObfuscatedName("ar.i()I")
    public static int method933() {
        int var0 = Statics.field363[Statics.field369] >> Statics.field366 & 0x1;
        Statics.field366++;
        Statics.field369 += Statics.field366 >> 3;
        Statics.field366 &= 0x7;
        return var0;
    }

    @ObfuscatedName("ar.f(I)I")
    public static int method934(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - Statics.field366) {
            int var3 = 8 - Statics.field366;
            int var4 = (0x1 << var3) - 1;
            var1 += (Statics.field363[Statics.field369] >> Statics.field366 & var4) << var2;
            Statics.field366 = 0;
            Statics.field369++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (Statics.field363[Statics.field369] >> Statics.field366 & var5) << var2;
            Statics.field366 += arg0;
        }
        return var1;
    }

    @ObfuscatedName("ar.b([B)V")
    public void method935(byte[] arg0) {
        class438 var2 = new class438(arg0);
        this.field358 = var2.method6976();
        this.field359 = var2.method6976();
        this.field360 = var2.method6976();
        this.field361 = var2.method6976();
        if (this.field361 < 0) {
            this.field361 = ~this.field361;
            this.field374 = true;
        }
        int var3 = var2.method6976();
        this.field375 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method6971();
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method7062(var7, 0, var5);
            this.field375[var4] = var7;
        }
    }

    @ObfuscatedName("ar.n([B)V")
    public static void method936(byte[] arg0) {
        method949(arg0, 0);
        Statics.field364 = 0x1 << method934(4);
        Statics.field367 = 0x1 << method934(4);
        Statics.field379 = new float[Statics.field367];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? Statics.field364 : Statics.field367;
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
            int var13 = class272.method2814(var5 - 1);
            for (int var14 = 0; var14 < var5; var14++) {
                int var17 = var14;
                int var18 = var13;
                int var19 = 0;
                while (var18 > 0) {
                    var19 = var19 << 1 | var17 & 0x1;
                    var17 >>>= 0x1;
                    var18--;
                }
                var12[var14] = var19;
            }
            if (var1 == 0) {
                Statics.field380 = var6;
                Statics.field357 = var8;
                Statics.field382 = var10;
                Statics.field386 = var12;
            } else {
                Statics.field383 = var6;
                Statics.field384 = var8;
                Statics.field385 = var10;
                Statics.field387 = var12;
            }
        }
        int var21 = method934(8) + 1;
        Statics.field368 = new class47[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            Statics.field368[var22] = new class47();
        }
        int var23 = method934(6) + 1;
        for (int var24 = 0; var24 < var23; var24++) {
            method934(16);
        }
        int var25 = method934(6) + 1;
        Statics.field362 = new class37[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            Statics.field362[var26] = new class37();
        }
        int var27 = method934(6) + 1;
        Statics.field388 = new class42[var27];
        for (int var28 = 0; var28 < var27; var28++) {
            Statics.field388[var28] = new class42();
        }
        int var29 = method934(6) + 1;
        Statics.field371 = new class45[var29];
        for (int var30 = 0; var30 < var29; var30++) {
            Statics.field371[var30] = new class45();
        }
        int var31 = method934(6) + 1;
        Statics.field372 = new boolean[var31];
        Statics.field373 = new int[var31];
        for (int var32 = 0; var32 < var31; var32++) {
            Statics.field372[var32] = method933() != 0;
            method934(16);
            method934(16);
            Statics.field373[var32] = method934(8);
        }
    }

    @ObfuscatedName("ar.s(I)[F")
    public float[] method937(int arg0) {
        method949(this.field375[arg0], 0);
        method933();
        int var2 = method934(class272.method2814(Statics.field373.length - 1));
        boolean var3 = Statics.field372[var2];
        int var4 = var3 ? Statics.field367 : Statics.field364;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method933() != 0;
            var6 = method933() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (Statics.field364 >> 2);
            var9 = (Statics.field364 >> 2) + (var4 >> 2);
            var10 = Statics.field364 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (Statics.field364 >> 2);
            var12 = (Statics.field364 >> 2) + (var4 - (var4 >> 2));
            var13 = Statics.field364 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class45 var14 = Statics.field371[Statics.field373[var2]];
        int var15 = var14.field348;
        int var16 = var14.field350[var15];
        boolean var17 = !Statics.field362[var16].method664();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field347; var19++) {
            class42 var20 = Statics.field388[var14.field349[var19]];
            float[] var21 = Statics.field379;
            var20.method758(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field348;
            int var23 = var14.field350[var22];
            Statics.field362[var23].method660(Statics.field379, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                Statics.field379[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = Statics.field379;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? Statics.field383 : Statics.field380;
            float[] var32 = var3 ? Statics.field384 : Statics.field357;
            float[] var33 = var3 ? Statics.field385 : Statics.field382;
            int[] var34 = var3 ? Statics.field387 : Statics.field386;
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
            int var47 = class272.method2814(var4 - 1);
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
                Statics.field379[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                Statics.field379[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field376 > 0) {
            int var91 = this.field376 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field390) {
                for (int var92 = 0; var92 < this.field377; var92++) {
                    int var93 = (this.field376 >> 1) + var92;
                    var90[var92] += this.field378[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length - (var4 >> 1) + var94;
                    var90[var95] += Statics.field379[var94];
                }
            }
        }
        float[] var96 = this.field378;
        this.field378 = Statics.field379;
        Statics.field379 = var96;
        this.field376 = var4;
        this.field377 = var12 - (var4 >> 1);
        this.field390 = var17;
        return var90;
    }

    @ObfuscatedName("ar.l(Lln;)Z")
    public static boolean method958(class316 arg0) {
        if (!field370) {
            byte[] var1 = arg0.method5296(0, 0);
            if (var1 == null) {
                return false;
            }
            method936(var1);
            field370 = true;
        }
        return true;
    }

    @ObfuscatedName("ar.q(Lln;II)Lar;")
    public static class48 method955(class316 arg0, int arg1, int arg2) {
        if (method958(arg0)) {
            byte[] var3 = arg0.method5296(arg1, arg2);
            return var3 == null ? null : new class48(var3);
        } else {
            arg0.method5359(arg1, arg2);
            return null;
        }
    }

    public class48(byte[] arg0) {
        this.method935(arg0);
    }

    @ObfuscatedName("ar.o([I)Lat;")
    public class36 method942(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field381 == null) {
            this.field376 = 0;
            this.field378 = new float[Statics.field367];
            this.field381 = new byte[this.field359];
            this.field389 = 0;
            this.field365 = 0;
        }
        while (this.field365 < this.field375.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method937(this.field365);
            if (var2 != null) {
                int var3 = this.field389;
                int var4 = var2.length;
                if (var4 > this.field359 - var3) {
                    var4 = this.field359 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field381[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field389;
                }
                this.field389 = var3;
            }
            this.field365++;
        }
        this.field378 = null;
        byte[] var7 = this.field381;
        this.field381 = null;
        return new class36(this.field358, var7, this.field360, this.field361, this.field374);
    }
}
