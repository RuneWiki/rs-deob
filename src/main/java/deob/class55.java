package deob;

@ObfuscatedName("cm")
public class class55 extends class473 {

    @ObfuscatedName("cm.au")
    public byte[][] field407;

    @ObfuscatedName("cm.ae")
    public int field416;

    @ObfuscatedName("cm.ao")
    public int field389;

    @ObfuscatedName("cm.at")
    public int field391;

    @ObfuscatedName("cm.ac")
    public int field392;

    @ObfuscatedName("cm.ai")
    public boolean field393;

    @ObfuscatedName("cm.az")
    public static class61 field394 = new class61();

    @ObfuscatedName("cm.ab")
    public static boolean field419 = false;

    @ObfuscatedName("cm.ag")
    public float[] field409;

    @ObfuscatedName("cm.am")
    public int field405;

    @ObfuscatedName("cm.ax")
    public int field406;

    @ObfuscatedName("cm.ah")
    public boolean field408;

    @ObfuscatedName("cm.as")
    public float[] field411;

    @ObfuscatedName("cm.bv")
    public byte[] field417;

    @ObfuscatedName("cm.bt")
    public int field388;

    @ObfuscatedName("cm.bd")
    public int field403;

    @ObfuscatedName("cm.au(I)F")
    public static float method1055(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @ObfuscatedName("cm.ae([B)V")
    public void method1040(byte[] arg0) {
        class515 var2 = new class515(arg0);
        this.field416 = var2.method8306();
        this.field389 = var2.method8306();
        this.field391 = var2.method8306();
        this.field392 = var2.method8306();
        if (this.field392 < 0) {
            this.field392 = ~this.field392;
            this.field393 = true;
        }
        int var3 = var2.method8306();
        this.field407 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method8300();
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method8314(var7, 0, var5);
            this.field407[var4] = var7;
        }
    }

    @ObfuscatedName("cm.ao([B)V")
    public static void method1041(byte[] arg0) {
        class61 var1 = field394;
        var1.method1103(arg0, 0);
        Statics.field395 = 0x1 << var1.method1101(4);
        Statics.field396 = 0x1 << var1.method1101(4);
        for (int var2 = 0; var2 < 2; var2++) {
            int var3 = var2 == 0 ? Statics.field395 : Statics.field396;
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
            int var14 = class304.method203(var6 - 1);
            for (int var15 = 0; var15 < var6; var15++) {
                int var18 = var15;
                int var19 = var14;
                int var20 = 0;
                while (var19 > 0) {
                    var20 = var20 << 1 | var18 & 0x1;
                    var18 >>>= 0x1;
                    var19--;
                }
                var13[var15] = var20;
            }
            if (var2 == 0) {
                Statics.field418 = var7;
                Statics.field410 = var9;
                Statics.field404 = var11;
                Statics.field415 = var13;
            } else {
                Statics.field412 = var7;
                Statics.field413 = var9;
                Statics.field414 = var11;
                Statics.field390 = var13;
            }
        }
        int var22 = var1.method1101(8) + 1;
        Statics.field397 = new class53[var22];
        for (int var23 = 0; var23 < var22; var23++) {
            Statics.field397[var23] = new class53();
        }
        int var24 = var1.method1101(6) + 1;
        for (int var25 = 0; var25 < var24; var25++) {
            var1.method1101(16);
        }
        int var26 = var1.method1101(6) + 1;
        Statics.field398 = new class42[var26];
        for (int var27 = 0; var27 < var26; var27++) {
            Statics.field398[var27] = new class42();
        }
        int var28 = var1.method1101(6) + 1;
        Statics.field399 = new class47[var28];
        for (int var29 = 0; var29 < var28; var29++) {
            Statics.field399[var29] = new class47();
        }
        int var30 = var1.method1101(6) + 1;
        Statics.field400 = new class51[var30];
        for (int var31 = 0; var31 < var30; var31++) {
            Statics.field400[var31] = new class51();
        }
        int var32 = var1.method1101(6) + 1;
        Statics.field401 = new boolean[var32];
        Statics.field402 = new int[var32];
        for (int var33 = 0; var33 < var32; var33++) {
            Statics.field401[var33] = var1.method1102() != 0;
            var1.method1101(16);
            var1.method1101(16);
            Statics.field402[var33] = var1.method1101(8);
        }
    }

    @ObfuscatedName("cm.at(I)[F")
    public float[] method1042(int arg0) {
        class61 var2 = new class61();
        var2.method1103(this.field407[arg0], 0);
        this.field411 = new float[Statics.field396];
        var2.method1102();
        int var3 = var2.method1101(class304.method203(Statics.field402.length - 1));
        boolean var4 = Statics.field401[var3];
        int var5 = var4 ? Statics.field396 : Statics.field395;
        boolean var6 = false;
        boolean var7 = false;
        if (var4) {
            var6 = var2.method1102() != 0;
            var7 = var2.method1102() != 0;
        }
        int var8 = var5 >> 1;
        int var9;
        int var10;
        int var11;
        if (var4 && !var6) {
            var9 = (var5 >> 2) - (Statics.field395 >> 2);
            var10 = (Statics.field395 >> 2) + (var5 >> 2);
            var11 = Statics.field395 >> 1;
        } else {
            var9 = 0;
            var10 = var8;
            var11 = var5 >> 1;
        }
        int var12;
        int var13;
        int var14;
        if (var4 && !var7) {
            var12 = var5 - (var5 >> 2) - (Statics.field395 >> 2);
            var13 = (Statics.field395 >> 2) + (var5 - (var5 >> 2));
            var14 = Statics.field395 >> 1;
        } else {
            var12 = var8;
            var13 = var5;
            var14 = var5 >> 1;
        }
        class51 var15 = Statics.field400[Statics.field402[var3]];
        int var16 = var15.field375;
        int var17 = var15.field377[var16];
        class60 var18 = Statics.field398[var17].method778(var2);
        boolean var19 = !var18.method1094();
        for (int var20 = 0; var20 < var15.field376; var20++) {
            class47 var21 = Statics.field399[var15.field378[var20]];
            float[] var22 = this.field411;
            var21.method873(var22, var5 >> 1, var19, var2);
        }
        if (var18.method1094()) {
            int var23 = var15.field375;
            int var10000 = var15.field377[var23];
            var18.method1093(this.field411, var5 >> 1);
        }
        if (var18.method1094()) {
            int var26 = var5 >> 1;
            int var27 = var5 >> 2;
            int var28 = var5 >> 3;
            float[] var29 = this.field411;
            for (int var30 = 0; var30 < var26; var30++) {
                var29[var30] *= 0.5F;
            }
            for (int var31 = var26; var31 < var5; var31++) {
                var29[var31] = -var29[var5 - var31 - 1];
            }
            float[] var32 = var4 ? Statics.field412 : Statics.field418;
            float[] var33 = var4 ? Statics.field413 : Statics.field410;
            float[] var34 = var4 ? Statics.field414 : Statics.field404;
            int[] var35 = var4 ? Statics.field390 : Statics.field415;
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
            int var48 = class304.method203(var5 - 1);
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
                this.field411[var87] *= (float) Math.sin((double) var88 * 1.5707963267948966D * (double) var88);
            }
            for (int var89 = var12; var89 < var13; var89++) {
                float var90 = (float) Math.sin(((double) (var89 - var12) + 0.5D) / (double) var14 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                this.field411[var89] *= (float) Math.sin((double) var90 * 1.5707963267948966D * (double) var90);
            }
        } else {
            for (int var25 = var5 >> 1; var25 < var5; var25++) {
                this.field411[var25] = 0.0F;
            }
        }
        float[] var91 = null;
        if (this.field405 > 0) {
            int var92 = this.field405 + var5 >> 2;
            var91 = new float[var92];
            if (!this.field408) {
                for (int var93 = 0; var93 < this.field406; var93++) {
                    int var94 = (this.field405 >> 1) + var93;
                    var91[var93] += this.field409[var94];
                }
            }
            if (var18.method1094()) {
                for (int var95 = var9; var95 < var5 >> 1; var95++) {
                    int var96 = var91.length - (var5 >> 1) + var95;
                    var91[var96] += this.field411[var95];
                }
            }
        }
        float[] var97 = this.field409;
        this.field409 = this.field411;
        this.field411 = var97;
        this.field405 = var5;
        this.field406 = var13 - (var5 >> 1);
        this.field408 = !var18.method1094();
        return var91;
    }

    @ObfuscatedName("cm.ac(Lnu;)Z")
    public static boolean method1043(class359 arg0) {
        if (!field419) {
            byte[] var1 = arg0.method6128(0, 0);
            if (var1 == null) {
                return false;
            }
            method1041(var1);
            field419 = true;
        }
        return true;
    }

    @ObfuscatedName("cm.ai(Lnu;II)Lcm;")
    public static class55 method1044(class359 arg0, int arg1, int arg2) {
        if (method1043(arg0)) {
            byte[] var3 = arg0.method6128(arg1, arg2);
            return var3 == null ? null : new class55(var3);
        } else {
            arg0.method6130(arg1, arg2);
            return null;
        }
    }

    public class55(byte[] arg0) {
        this.method1040(arg0);
    }

    @ObfuscatedName("cm.az([I)Lbu;")
    public class41 method1045(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field417 == null) {
            this.field405 = 0;
            this.field409 = new float[Statics.field396];
            this.field417 = new byte[this.field389];
            this.field388 = 0;
            this.field403 = 0;
        }
        while (this.field403 < this.field407.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method1042(this.field403);
            if (var2 != null) {
                int var3 = this.field388;
                int var4 = var2.length;
                if (var4 > this.field389 - var3) {
                    var4 = this.field389 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field417[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field388;
                }
                this.field388 = var3;
            }
            this.field403++;
        }
        this.field409 = null;
        byte[] var7 = this.field417;
        this.field417 = null;
        return new class41(this.field416, var7, this.field391, this.field392, this.field393);
    }
}
