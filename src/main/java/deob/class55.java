package deob;

@ObfuscatedName("cl")
public class class55 extends class505 {

    @ObfuscatedName("cl.aq")
    public byte[][] field376;

    @ObfuscatedName("cl.ad")
    public int field349;

    @ObfuscatedName("cl.ag")
    public int field350;

    @ObfuscatedName("cl.ak")
    public int field370;

    @ObfuscatedName("cl.ap")
    public int field357;

    @ObfuscatedName("cl.an")
    public boolean field352;

    @ObfuscatedName("cl.aj")
    public static class61 field354 = new class61();

    @ObfuscatedName("cl.ac")
    public static boolean field353 = false;

    @ObfuscatedName("cl.al")
    public float[] field364;

    @ObfuscatedName("cl.ay")
    public int field365;

    @ObfuscatedName("cl.ao")
    public int field366;

    @ObfuscatedName("cl.aa")
    public boolean field367;

    @ObfuscatedName("cl.as")
    public float[] field368;

    @ObfuscatedName("cl.bm")
    public byte[] field377;

    @ObfuscatedName("cl.bo")
    public int field378;

    @ObfuscatedName("cl.bi")
    public int field379;

    @ObfuscatedName("cl.aq(I)F")
    public static float method1035(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @ObfuscatedName("cl.ad([B)V")
    public void method1034(byte[] arg0) {
        class547 var2 = new class547(arg0);
        this.field349 = var2.method8734();
        this.field350 = var2.method8734();
        this.field370 = var2.method8734();
        this.field357 = var2.method8734();
        if (this.field357 < 0) {
            this.field357 = ~this.field357;
            this.field352 = true;
        }
        int var3 = var2.method8734();
        this.field376 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method8804();
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method8742(var7, 0, var5);
            this.field376[var4] = var7;
        }
    }

    @ObfuscatedName("cl.ag([B)V")
    public static void method1039(byte[] arg0) {
        class61 var1 = field354;
        var1.method1094(arg0, 0);
        Statics.field355 = 0x1 << var1.method1104(4);
        Statics.field356 = 0x1 << var1.method1104(4);
        for (int var2 = 0; var2 < 2; var2++) {
            int var3 = var2 == 0 ? Statics.field355 : Statics.field356;
            int var4 = var3 >> 1;
            int var5 = var3 >> 2;
            int var6 = var3 >> 3;
            float[] var7 = new float[var4];
            for (int var8 = 0; var8 < var5; var8++) {
                var7[var8 * 2] = (float) Math.cos((double) (var8 * 4) * 3.141592653589793D / (double) var3);
                var7[var8 * 2 + 1] = -((float) Math.sin((double) (var8 * 4) * 3.141592653589793D / (double) var3));
            }
            float[] var9 = new float[var4];
            for (int var10 = 0; var10 < var5; var10++) {
                var9[var10 * 2] = (float) Math.cos((double) (var10 * 2 + 1) * 3.141592653589793D / (double) (var3 * 2));
                var9[var10 * 2 + 1] = (float) Math.sin((double) (var10 * 2 + 1) * 3.141592653589793D / (double) (var3 * 2));
            }
            float[] var11 = new float[var5];
            for (int var12 = 0; var12 < var6; var12++) {
                var11[var12 * 2] = (float) Math.cos((double) (var12 * 4 + 2) * 3.141592653589793D / (double) var3);
                var11[var12 * 2 + 1] = -((float) Math.sin((double) (var12 * 4 + 2) * 3.141592653589793D / (double) var3));
            }
            int[] var13 = new int[var6];
            int var14 = class329.method3232(var6 - 1);
            for (int var15 = 0; var15 < var6; var15++) {
                var13[var15] = class329.method2235(var15, var14);
            }
            if (var2 == 0) {
                Statics.field369 = var7;
                Statics.field360 = var9;
                Statics.field363 = var11;
                Statics.field375 = var13;
            } else {
                Statics.field372 = var7;
                Statics.field373 = var9;
                Statics.field374 = var11;
                Statics.field359 = var13;
            }
        }
        int var16 = var1.method1104(8) + 1;
        Statics.field348 = new class53[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            Statics.field348[var17] = new class53();
        }
        int var18 = var1.method1104(6) + 1;
        for (int var19 = 0; var19 < var18; var19++) {
            var1.method1104(16);
        }
        int var20 = var1.method1104(6) + 1;
        Statics.field358 = new class42[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            Statics.field358[var21] = new class42();
        }
        int var22 = var1.method1104(6) + 1;
        Statics.field371 = new class47[var22];
        for (int var23 = 0; var23 < var22; var23++) {
            Statics.field371[var23] = new class47();
        }
        int var24 = var1.method1104(6) + 1;
        Statics.field351 = new class51[var24];
        for (int var25 = 0; var25 < var24; var25++) {
            Statics.field351[var25] = new class51();
        }
        int var26 = var1.method1104(6) + 1;
        Statics.field361 = new boolean[var26];
        Statics.field362 = new int[var26];
        for (int var27 = 0; var27 < var26; var27++) {
            Statics.field361[var27] = var1.method1092() != 0;
            var1.method1104(16);
            var1.method1104(16);
            Statics.field362[var27] = var1.method1104(8);
        }
    }

    @ObfuscatedName("cl.ak(I)[F")
    public float[] method1048(int arg0) {
        class61 var2 = new class61();
        var2.method1094(this.field376[arg0], 0);
        this.field368 = new float[Statics.field356];
        var2.method1092();
        int var3 = var2.method1104(class329.method3232(Statics.field362.length - 1));
        boolean var4 = Statics.field361[var3];
        int var5 = var4 ? Statics.field356 : Statics.field355;
        boolean var6 = false;
        boolean var7 = false;
        if (var4) {
            var6 = var2.method1092() != 0;
            var7 = var2.method1092() != 0;
        }
        int var8 = var5 >> 1;
        int var9;
        int var10;
        int var11;
        if (var4 && !var6) {
            var9 = (var5 >> 2) - (Statics.field355 >> 2);
            var10 = (Statics.field355 >> 2) + (var5 >> 2);
            var11 = Statics.field355 >> 1;
        } else {
            var9 = 0;
            var10 = var8;
            var11 = var5 >> 1;
        }
        int var12;
        int var13;
        int var14;
        if (var4 && !var7) {
            var12 = var5 - (var5 >> 2) - (Statics.field355 >> 2);
            var13 = (Statics.field355 >> 2) + (var5 - (var5 >> 2));
            var14 = Statics.field355 >> 1;
        } else {
            var12 = var8;
            var13 = var5;
            var14 = var5 >> 1;
        }
        class51 var15 = Statics.field351[Statics.field362[var3]];
        int var16 = var15.field336;
        int var17 = var15.field337[var16];
        class60 var18 = Statics.field358[var17].method776(var2);
        boolean var19 = !var18.method1087();
        for (int var20 = 0; var20 < var15.field338; var20++) {
            class47 var21 = Statics.field371[var15.field335[var20]];
            float[] var22 = this.field368;
            var21.method868(var22, var5 >> 1, var19, var2);
        }
        if (var18.method1087()) {
            int var23 = var15.field336;
            int var10000 = var15.field337[var23];
            var18.method1084(this.field368, var5 >> 1);
        }
        if (var18.method1087()) {
            int var26 = var5 >> 1;
            int var27 = var5 >> 2;
            int var28 = var5 >> 3;
            float[] var29 = this.field368;
            for (int var30 = 0; var30 < var26; var30++) {
                var29[var30] *= 0.5F;
            }
            for (int var31 = var26; var31 < var5; var31++) {
                var29[var31] = -var29[var5 - var31 - 1];
            }
            float[] var32 = var4 ? Statics.field372 : Statics.field369;
            float[] var33 = var4 ? Statics.field373 : Statics.field360;
            float[] var34 = var4 ? Statics.field374 : Statics.field363;
            int[] var35 = var4 ? Statics.field359 : Statics.field375;
            for (int var36 = 0; var36 < var27; var36++) {
                float var37 = var29[var36 * 4] - var29[var5 - var36 * 4 - 1];
                float var38 = var29[var36 * 4 + 2] - var29[var5 - var36 * 4 - 3];
                float var39 = var32[var36 * 2];
                float var40 = var32[var36 * 2 + 1];
                var29[var5 - var36 * 4 - 1] = var37 * var39 - var38 * var40;
                var29[var5 - var36 * 4 - 3] = var37 * var40 + var38 * var39;
            }
            for (int var41 = 0; var41 < var28; var41++) {
                float var42 = var29[var41 * 4 + var26 + 3];
                float var43 = var29[var41 * 4 + var26 + 1];
                float var44 = var29[var41 * 4 + 3];
                float var45 = var29[var41 * 4 + 1];
                var29[var41 * 4 + var26 + 3] = var42 + var44;
                var29[var41 * 4 + var26 + 1] = var43 + var45;
                float var46 = var32[var26 - 4 - var41 * 4];
                float var47 = var32[var26 - 3 - var41 * 4];
                var29[var41 * 4 + 3] = (var42 - var44) * var46 - (var43 - var45) * var47;
                var29[var41 * 4 + 1] = (var42 - var44) * var47 + (var43 - var45) * var46;
            }
            int var48 = class329.method3232(var5 - 1);
            for (int var49 = 0; var49 < var48 - 3; var49++) {
                int var50 = var5 >> var49 + 2;
                int var51 = 0x8 << var49;
                for (int var52 = 0; var52 < 0x2 << var49; var52++) {
                    int var53 = var5 - var50 * 2 * var52;
                    int var54 = var5 - (var52 * 2 + 1) * var50;
                    for (int var55 = 0; var55 < var5 >> var49 + 4; var55++) {
                        int var56 = var55 * 4;
                        float var57 = var29[var53 - 1 - var56];
                        float var58 = var29[var53 - 3 - var56];
                        float var59 = var29[var54 - 1 - var56];
                        float var60 = var29[var54 - 3 - var56];
                        var29[var53 - 1 - var56] = var57 + var59;
                        var29[var53 - 3 - var56] = var58 + var60;
                        float var61 = var32[var51 * var55];
                        float var62 = var32[var51 * var55 + 1];
                        var29[var54 - 1 - var56] = (var57 - var59) * var61 - (var58 - var60) * var62;
                        var29[var54 - 3 - var56] = (var57 - var59) * var62 + (var58 - var60) * var61;
                    }
                }
            }
            for (int var63 = 1; var63 < var28 - 1; var63++) {
                int var64 = var35[var63];
                if (var63 < var64) {
                    int var65 = var63 * 8;
                    int var66 = var64 * 8;
                    float var67 = var29[var65 + 1];
                    var29[var65 + 1] = var29[var66 + 1];
                    var29[var66 + 1] = var67;
                    float var68 = var29[var65 + 3];
                    var29[var65 + 3] = var29[var66 + 3];
                    var29[var66 + 3] = var68;
                    float var69 = var29[var65 + 5];
                    var29[var65 + 5] = var29[var66 + 5];
                    var29[var66 + 5] = var69;
                    float var70 = var29[var65 + 7];
                    var29[var65 + 7] = var29[var66 + 7];
                    var29[var66 + 7] = var70;
                }
            }
            for (int var71 = 0; var71 < var26; var71++) {
                var29[var71] = var29[var71 * 2 + 1];
            }
            for (int var72 = 0; var72 < var28; var72++) {
                var29[var5 - 1 - var72 * 2] = var29[var72 * 4];
                var29[var5 - 2 - var72 * 2] = var29[var72 * 4 + 1];
                var29[var5 - var27 - 1 - var72 * 2] = var29[var72 * 4 + 2];
                var29[var5 - var27 - 2 - var72 * 2] = var29[var72 * 4 + 3];
            }
            for (int var73 = 0; var73 < var28; var73++) {
                float var74 = var34[var73 * 2];
                float var75 = var34[var73 * 2 + 1];
                float var76 = var29[var73 * 2 + var26];
                float var77 = var29[var73 * 2 + var26 + 1];
                float var78 = var29[var5 - 2 - var73 * 2];
                float var79 = var29[var5 - 1 - var73 * 2];
                float var80 = (var76 - var78) * var75 + (var77 + var79) * var74;
                var29[var73 * 2 + var26] = (var76 + var78 + var80) * 0.5F;
                var29[var5 - 2 - var73 * 2] = (var76 + var78 - var80) * 0.5F;
                float var81 = (var77 + var79) * var75 - (var76 - var78) * var74;
                var29[var73 * 2 + var26 + 1] = (var77 - var79 + var81) * 0.5F;
                var29[var5 - 1 - var73 * 2] = (-var77 + var79 + var81) * 0.5F;
            }
            for (int var82 = 0; var82 < var27; var82++) {
                var29[var82] = var33[var82 * 2] * var29[var82 * 2 + var26] + var33[var82 * 2 + 1] * var29[var82 * 2 + 1 + var26];
                var29[var26 - 1 - var82] = var29[var82 * 2 + var26] * var33[var82 * 2 + 1] - var33[var82 * 2] * var29[var82 * 2 + 1 + var26];
            }
            for (int var83 = 0; var83 < var27; var83++) {
                var29[var5 - var27 + var83] = -var29[var83];
            }
            for (int var84 = 0; var84 < var27; var84++) {
                var29[var84] = var29[var27 + var84];
            }
            for (int var85 = 0; var85 < var27; var85++) {
                var29[var27 + var85] = -var29[var27 - var85 - 1];
            }
            for (int var86 = 0; var86 < var27; var86++) {
                var29[var26 + var86] = var29[var5 - var86 - 1];
            }
            for (int var87 = var9; var87 < var10; var87++) {
                float var88 = (float) Math.sin(((double) (var87 - var9) + 0.5D) / (double) var11 * 0.5D * 3.141592653589793D);
                this.field368[var87] *= (float) Math.sin((double) var88 * 1.5707963267948966D * (double) var88);
            }
            for (int var89 = var12; var89 < var13; var89++) {
                float var90 = (float) Math.sin(((double) (var89 - var12) + 0.5D) / (double) var14 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                this.field368[var89] *= (float) Math.sin((double) var90 * 1.5707963267948966D * (double) var90);
            }
        } else {
            for (int var25 = var5 >> 1; var25 < var5; var25++) {
                this.field368[var25] = 0.0F;
            }
        }
        float[] var91 = null;
        if (this.field365 > 0) {
            int var92 = this.field365 + var5 >> 2;
            var91 = new float[var92];
            if (!this.field367) {
                for (int var93 = 0; var93 < this.field366; var93++) {
                    int var94 = (this.field365 >> 1) + var93;
                    var91[var93] += this.field364[var94];
                }
            }
            if (var18.method1087()) {
                for (int var95 = var9; var95 < var5 >> 1; var95++) {
                    int var96 = var91.length - (var5 >> 1) + var95;
                    var91[var96] += this.field368[var95];
                }
            }
        }
        float[] var97 = this.field364;
        this.field364 = this.field368;
        this.field368 = var97;
        this.field365 = var5;
        this.field366 = var13 - (var5 >> 1);
        this.field367 = !var18.method1087();
        return var91;
    }

    @ObfuscatedName("cl.ap(Lok;)Z")
    public static boolean method1037(class388 arg0) {
        if (!field353) {
            byte[] var1 = arg0.method6539(0, 0);
            if (var1 == null) {
                return false;
            }
            method1039(var1);
            field353 = true;
        }
        return true;
    }

    @ObfuscatedName("cl.an(Lok;II)Lcl;")
    public static class55 method1038(class388 arg0, int arg1, int arg2) {
        if (method1037(arg0)) {
            byte[] var3 = arg0.method6539(arg1, arg2);
            return var3 == null ? null : new class55(var3);
        } else {
            arg0.method6541(arg1, arg2);
            return null;
        }
    }

    public class55(byte[] arg0) {
        this.method1034(arg0);
    }

    @ObfuscatedName("cl.aj([I)Lbl;")
    public class41 method1040(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field377 == null) {
            this.field365 = 0;
            this.field364 = new float[Statics.field356];
            this.field377 = new byte[this.field350];
            this.field378 = 0;
            this.field379 = 0;
        }
        while (this.field379 < this.field376.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method1048(this.field379);
            if (var2 != null) {
                int var3 = this.field378;
                int var4 = var2.length;
                if (var4 > this.field350 - var3) {
                    var4 = this.field350 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field377[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field378;
                }
                this.field378 = var3;
            }
            this.field379++;
        }
        this.field364 = null;
        byte[] var7 = this.field377;
        this.field377 = null;
        return new class41(this.field349, var7, this.field370, this.field357, this.field352);
    }
}
