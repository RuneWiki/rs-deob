package deob;

@ObfuscatedName("cz")
public class class55 extends class474 {

    @ObfuscatedName("cz.aw")
    public byte[][] field401;

    @ObfuscatedName("cz.ay")
    public int field405;

    @ObfuscatedName("cz.ar")
    public int field399;

    @ObfuscatedName("cz.am")
    public int field400;

    @ObfuscatedName("cz.as")
    public int field424;

    @ObfuscatedName("cz.aj")
    public boolean field402;

    @ObfuscatedName("cz.ag")
    public static class61 field416 = new class61();

    @ObfuscatedName("cz.au")
    public static boolean field412 = false;

    @ObfuscatedName("cz.ae")
    public float[] field413;

    @ObfuscatedName("cz.ab")
    public int field414;

    @ObfuscatedName("cz.ad")
    public int field415;

    @ObfuscatedName("cz.ao")
    public boolean field410;

    @ObfuscatedName("cz.ac")
    public float[] field417;

    @ObfuscatedName("cz.ba")
    public byte[] field426;

    @ObfuscatedName("cz.bf")
    public int field427;

    @ObfuscatedName("cz.bs")
    public int field428;

    @ObfuscatedName("cz.aw(I)F")
    public static float method1036(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @ObfuscatedName("cz.ay([B)V")
    public void method1037(byte[] arg0) {
        class514 var2 = new class514(arg0);
        this.field405 = var2.method8496();
        this.field399 = var2.method8496();
        this.field400 = var2.method8496();
        this.field424 = var2.method8496();
        if (this.field424 < 0) {
            this.field424 = ~this.field424;
            this.field402 = true;
        }
        int var3 = var2.method8496();
        this.field401 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method8244();
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method8392(var7, 0, var5);
            this.field401[var4] = var7;
        }
    }

    @ObfuscatedName("cz.ar([B)V")
    public static void method1038(byte[] arg0) {
        class61 var1 = field416;
        var1.method1116(arg0, 0);
        Statics.field404 = 0x1 << var1.method1114(4);
        Statics.field411 = 0x1 << var1.method1114(4);
        for (int var2 = 0; var2 < 2; var2++) {
            int var3 = var2 == 0 ? Statics.field404 : Statics.field411;
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
            int var14 = class305.method4918(var6 - 1);
            for (int var15 = 0; var15 < var6; var15++) {
                var13[var15] = class305.method5105(var15, var14);
            }
            if (var2 == 0) {
                Statics.field418 = var7;
                Statics.field419 = var9;
                Statics.field398 = var11;
                Statics.field420 = var13;
            } else {
                Statics.field421 = var7;
                Statics.field422 = var9;
                Statics.field423 = var11;
                Statics.field406 = var13;
            }
        }
        int var16 = var1.method1114(8) + 1;
        Statics.field403 = new class53[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            Statics.field403[var17] = new class53();
        }
        int var18 = var1.method1114(6) + 1;
        for (int var19 = 0; var19 < var18; var19++) {
            var1.method1114(16);
        }
        int var20 = var1.method1114(6) + 1;
        Statics.field407 = new class42[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            Statics.field407[var21] = new class42();
        }
        int var22 = var1.method1114(6) + 1;
        Statics.field425 = new class47[var22];
        for (int var23 = 0; var23 < var22; var23++) {
            Statics.field425[var23] = new class47();
        }
        int var24 = var1.method1114(6) + 1;
        Statics.field409 = new class51[var24];
        for (int var25 = 0; var25 < var24; var25++) {
            Statics.field409[var25] = new class51();
        }
        int var26 = var1.method1114(6) + 1;
        Statics.field408 = new boolean[var26];
        Statics.field397 = new int[var26];
        for (int var27 = 0; var27 < var26; var27++) {
            Statics.field408[var27] = var1.method1115() != 0;
            var1.method1114(16);
            var1.method1114(16);
            Statics.field397[var27] = var1.method1114(8);
        }
    }

    @ObfuscatedName("cz.am(I)[F")
    public float[] method1039(int arg0) {
        class61 var2 = new class61();
        var2.method1116(this.field401[arg0], 0);
        this.field417 = new float[Statics.field411];
        var2.method1115();
        int var3 = var2.method1114(class305.method4918(Statics.field397.length - 1));
        boolean var4 = Statics.field408[var3];
        int var5 = var4 ? Statics.field411 : Statics.field404;
        boolean var6 = false;
        boolean var7 = false;
        if (var4) {
            var6 = var2.method1115() != 0;
            var7 = var2.method1115() != 0;
        }
        int var8 = var5 >> 1;
        int var9;
        int var10;
        int var11;
        if (var4 && !var6) {
            var9 = (var5 >> 2) - (Statics.field404 >> 2);
            var10 = (Statics.field404 >> 2) + (var5 >> 2);
            var11 = Statics.field404 >> 1;
        } else {
            var9 = 0;
            var10 = var8;
            var11 = var5 >> 1;
        }
        int var12;
        int var13;
        int var14;
        if (var4 && !var7) {
            var12 = var5 - (var5 >> 2) - (Statics.field404 >> 2);
            var13 = (Statics.field404 >> 2) + (var5 - (var5 >> 2));
            var14 = Statics.field404 >> 1;
        } else {
            var12 = var8;
            var13 = var5;
            var14 = var5 >> 1;
        }
        class51 var15 = Statics.field409[Statics.field397[var3]];
        int var16 = var15.field382;
        int var17 = var15.field381[var16];
        class60 var18 = Statics.field407[var17].method760(var2);
        boolean var19 = !var18.method1103();
        for (int var20 = 0; var20 < var15.field384; var20++) {
            class47 var21 = Statics.field425[var15.field383[var20]];
            float[] var22 = this.field417;
            var21.method850(var22, var5 >> 1, var19, var2);
        }
        if (var18.method1103()) {
            int var23 = var15.field382;
            int var10000 = var15.field381[var23];
            var18.method1099(this.field417, var5 >> 1);
        }
        if (var18.method1103()) {
            int var26 = var5 >> 1;
            int var27 = var5 >> 2;
            int var28 = var5 >> 3;
            float[] var29 = this.field417;
            for (int var30 = 0; var30 < var26; var30++) {
                var29[var30] *= 0.5F;
            }
            for (int var31 = var26; var31 < var5; var31++) {
                var29[var31] = -var29[var5 - var31 - 1];
            }
            float[] var32 = var4 ? Statics.field421 : Statics.field418;
            float[] var33 = var4 ? Statics.field422 : Statics.field419;
            float[] var34 = var4 ? Statics.field423 : Statics.field398;
            int[] var35 = var4 ? Statics.field406 : Statics.field420;
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
            int var48 = class305.method4918(var5 - 1);
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
                this.field417[var87] *= (float) Math.sin((double) var88 * 1.5707963267948966D * (double) var88);
            }
            for (int var89 = var12; var89 < var13; var89++) {
                float var90 = (float) Math.sin(((double) (var89 - var12) + 0.5D) / (double) var14 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                this.field417[var89] *= (float) Math.sin((double) var90 * 1.5707963267948966D * (double) var90);
            }
        } else {
            for (int var25 = var5 >> 1; var25 < var5; var25++) {
                this.field417[var25] = 0.0F;
            }
        }
        float[] var91 = null;
        if (this.field414 > 0) {
            int var92 = this.field414 + var5 >> 2;
            var91 = new float[var92];
            if (!this.field410) {
                for (int var93 = 0; var93 < this.field415; var93++) {
                    int var94 = (this.field414 >> 1) + var93;
                    var91[var93] += this.field413[var94];
                }
            }
            if (var18.method1103()) {
                for (int var95 = var9; var95 < var5 >> 1; var95++) {
                    int var96 = var91.length - (var5 >> 1) + var95;
                    var91[var96] += this.field417[var95];
                }
            }
        }
        float[] var97 = this.field413;
        this.field413 = this.field417;
        this.field417 = var97;
        this.field414 = var5;
        this.field415 = var13 - (var5 >> 1);
        this.field410 = !var18.method1103();
        return var91;
    }

    @ObfuscatedName("cz.as(Lnd;)Z")
    public static boolean method1040(class360 arg0) {
        if (!field412) {
            byte[] var1 = arg0.method6117(0, 0);
            if (var1 == null) {
                return false;
            }
            method1038(var1);
            field412 = true;
        }
        return true;
    }

    @ObfuscatedName("cz.aj(Lnd;II)Lcz;")
    public static class55 method1041(class360 arg0, int arg1, int arg2) {
        if (method1040(arg0)) {
            byte[] var3 = arg0.method6117(arg1, arg2);
            return var3 == null ? null : new class55(var3);
        } else {
            arg0.method6190(arg1, arg2);
            return null;
        }
    }

    public class55(byte[] arg0) {
        this.method1037(arg0);
    }

    @ObfuscatedName("cz.ag([I)Lbi;")
    public class41 method1049(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field426 == null) {
            this.field414 = 0;
            this.field413 = new float[Statics.field411];
            this.field426 = new byte[this.field399];
            this.field427 = 0;
            this.field428 = 0;
        }
        while (this.field428 < this.field401.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method1039(this.field428);
            if (var2 != null) {
                int var3 = this.field427;
                int var4 = var2.length;
                if (var4 > this.field399 - var3) {
                    var4 = this.field399 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field426[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field427;
                }
                this.field427 = var3;
            }
            this.field428++;
        }
        this.field413 = null;
        byte[] var7 = this.field426;
        this.field426 = null;
        return new class41(this.field405, var7, this.field400, this.field424, this.field402);
    }
}
