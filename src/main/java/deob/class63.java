package deob;

@ObfuscatedName("br")
public class class63 extends class353 {

    @ObfuscatedName("br.f")
    public byte[][] field505;

    @ObfuscatedName("br.e")
    public int field487;

    @ObfuscatedName("br.v")
    public int field513;

    @ObfuscatedName("br.y")
    public int field489;

    @ObfuscatedName("br.j")
    public int field517;

    @ObfuscatedName("br.o")
    public boolean field502;

    @ObfuscatedName("br.u")
    public static boolean field503 = false;

    @ObfuscatedName("br.q")
    public float[] field504;

    @ObfuscatedName("br.s")
    public int field509;

    @ObfuscatedName("br.p")
    public int field491;

    @ObfuscatedName("br.c")
    public boolean field488;

    @ObfuscatedName("br.az")
    public byte[] field497;

    @ObfuscatedName("br.ap")
    public int field518;

    @ObfuscatedName("br.ag")
    public int field506;

    @ObfuscatedName("br.f(I)F")
    public static float method915(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @ObfuscatedName("br.e([BI)V")
    public static void method896(byte[] arg0, int arg1) {
        Statics.field492 = arg0;
        Statics.field493 = arg1;
        Statics.field494 = 0;
    }

    @ObfuscatedName("br.v()I")
    public static int method897() {
        int var0 = Statics.field492[Statics.field493] >> Statics.field494 & 0x1;
        Statics.field494++;
        Statics.field493 += Statics.field494 >> 3;
        Statics.field494 &= 0x7;
        return var0;
    }

    @ObfuscatedName("br.y(I)I")
    public static int method898(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - Statics.field494) {
            int var3 = 8 - Statics.field494;
            int var4 = (0x1 << var3) - 1;
            var1 += (Statics.field492[Statics.field493] >> Statics.field494 & var4) << var2;
            Statics.field494 = 0;
            Statics.field493++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (Statics.field492[Statics.field493] >> Statics.field494 & var5) << var2;
            Statics.field494 += arg0;
        }
        return var1;
    }

    @ObfuscatedName("br.j([B)V")
    public void method899(byte[] arg0) {
        class384 var2 = new class384(arg0);
        this.field487 = var2.method5965();
        this.field513 = var2.method5965();
        this.field489 = var2.method5965();
        this.field517 = var2.method5965();
        if (this.field517 < 0) {
            this.field517 = ~this.field517;
            this.field502 = true;
        }
        int var3 = var2.method5965();
        this.field505 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method5902();
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method5909(var7, 0, var5);
            this.field505[var4] = var7;
        }
    }

    @ObfuscatedName("br.o([B)V")
    public static void method904(byte[] arg0) {
        method896(arg0, 0);
        Statics.field495 = 0x1 << method898(4);
        Statics.field486 = 0x1 << method898(4);
        Statics.field508 = new float[Statics.field486];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? Statics.field495 : Statics.field486;
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
            int var13 = class232.method50(var5 - 1);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = Statics.method161(var14, var13);
            }
            if (var1 == 0) {
                Statics.field496 = var6;
                Statics.field510 = var8;
                Statics.field511 = var10;
                Statics.field515 = var12;
            } else {
                Statics.field512 = var6;
                Statics.field519 = var8;
                Statics.field514 = var10;
                Statics.field516 = var12;
            }
        }
        int var15 = method898(8) + 1;
        Statics.field507 = new class62[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            Statics.field507[var16] = new class62();
        }
        int var17 = method898(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method898(16);
        }
        int var19 = method898(6) + 1;
        Statics.field490 = new class52[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            Statics.field490[var20] = new class52();
        }
        int var21 = method898(6) + 1;
        Statics.field499 = new class57[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            Statics.field499[var22] = new class57();
        }
        int var23 = method898(6) + 1;
        Statics.field500 = new class60[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            Statics.field500[var24] = new class60();
        }
        int var25 = method898(6) + 1;
        Statics.field501 = new boolean[var25];
        Statics.field498 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            Statics.field501[var26] = method897() != 0;
            method898(16);
            method898(16);
            Statics.field498[var26] = method898(8);
        }
    }

    @ObfuscatedName("br.m(I)[F")
    public float[] method919(int arg0) {
        method896(this.field505[arg0], 0);
        method897();
        int var2 = method898(class232.method50(Statics.field498.length - 1));
        boolean var3 = Statics.field501[var2];
        int var4 = var3 ? Statics.field486 : Statics.field495;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method897() != 0;
            var6 = method897() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (Statics.field495 >> 2);
            var9 = (Statics.field495 >> 2) + (var4 >> 2);
            var10 = Statics.field495 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (Statics.field495 >> 2);
            var12 = (Statics.field495 >> 2) + (var4 - (var4 >> 2));
            var13 = Statics.field495 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class60 var14 = Statics.field500[Statics.field498[var2]];
        int var15 = var14.field477;
        int var16 = var14.field476[var15];
        boolean var17 = !Statics.field490[var16].method651();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field478; var19++) {
            class57 var20 = Statics.field499[var14.field479[var19]];
            float[] var21 = Statics.field508;
            var20.method750(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field477;
            int var23 = var14.field476[var22];
            Statics.field490[var23].method652(Statics.field508, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                Statics.field508[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = Statics.field508;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? Statics.field512 : Statics.field496;
            float[] var32 = var3 ? Statics.field519 : Statics.field510;
            float[] var33 = var3 ? Statics.field514 : Statics.field511;
            int[] var34 = var3 ? Statics.field516 : Statics.field515;
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
            int var47 = class232.method50(var4 - 1);
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
                Statics.field508[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                Statics.field508[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field509 > 0) {
            int var91 = this.field509 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field488) {
                for (int var92 = 0; var92 < this.field491; var92++) {
                    int var93 = (this.field509 >> 1) + var92;
                    var90[var92] += this.field504[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length - (var4 >> 1) + var94;
                    var90[var95] += Statics.field508[var94];
                }
            }
        }
        float[] var96 = this.field504;
        this.field504 = Statics.field508;
        Statics.field508 = var96;
        this.field509 = var4;
        this.field491 = var12 - (var4 >> 1);
        this.field488 = var17;
        return var90;
    }

    @ObfuscatedName("br.r(Ljp;)Z")
    public static boolean method902(class276 arg0) {
        if (!field503) {
            byte[] var1 = arg0.method4504(0, 0);
            if (var1 == null) {
                return false;
            }
            method904(var1);
            field503 = true;
        }
        return true;
    }

    @ObfuscatedName("br.h(Ljp;II)Lbr;")
    public static class63 method903(class276 arg0, int arg1, int arg2) {
        if (method902(arg0)) {
            byte[] var3 = arg0.method4504(arg1, arg2);
            return var3 == null ? null : new class63(var3);
        } else {
            arg0.method4506(arg1, arg2);
            return null;
        }
    }

    public class63(byte[] arg0) {
        this.method899(arg0);
    }

    @ObfuscatedName("br.d([I)Lar;")
    public class51 method905(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field497 == null) {
            this.field509 = 0;
            this.field504 = new float[Statics.field486];
            this.field497 = new byte[this.field513];
            this.field518 = 0;
            this.field506 = 0;
        }
        while (this.field506 < this.field505.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method919(this.field506);
            if (var2 != null) {
                int var3 = this.field518;
                int var4 = var2.length;
                if (var4 > this.field513 - var3) {
                    var4 = this.field513 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field497[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field518;
                }
                this.field518 = var3;
            }
            this.field506++;
        }
        this.field504 = null;
        byte[] var7 = this.field497;
        this.field497 = null;
        return new class51(this.field487, var7, this.field489, this.field517, this.field502);
    }
}
