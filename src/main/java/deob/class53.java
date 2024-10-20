package deob;

@ObfuscatedName("bn")
public class class53 extends class179 {

    @ObfuscatedName("bn.g")
    public byte[][] field1135;

    @ObfuscatedName("bn.h")
    public int field1116;

    @ObfuscatedName("bn.s")
    public int field1122;

    @ObfuscatedName("bn.o")
    public int field1123;

    @ObfuscatedName("bn.p")
    public int field1130;

    @ObfuscatedName("bn.x")
    public boolean field1120;

    @ObfuscatedName("bn.m")
    public static boolean field1132 = false;

    @ObfuscatedName("bn.a")
    public float[] field1115;

    @ObfuscatedName("bn.f")
    public int field1139;

    @ObfuscatedName("bn.y")
    public int field1137;

    @ObfuscatedName("bn.v")
    public boolean field1136;

    @ObfuscatedName("bn.ak")
    public byte[] field1146;

    @ObfuscatedName("bn.ar")
    public int field1147;

    @ObfuscatedName("bn.az")
    public int field1148;

    @ObfuscatedName("bn.g(I)F")
    public static float method1242(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @ObfuscatedName("bn.h([BI)V")
    public static void method1217(byte[] arg0, int arg1) {
        Statics.field1121 = arg0;
        Statics.field1133 = arg1;
        Statics.field1119 = 0;
    }

    @ObfuscatedName("bn.s()I")
    public static int method1236() {
        int var0 = Statics.field1121[Statics.field1133] >> Statics.field1119 & 0x1;
        Statics.field1119++;
        Statics.field1133 += Statics.field1119 >> 3;
        Statics.field1119 &= 0x7;
        return var0;
    }

    @ObfuscatedName("bn.o(I)I")
    public static int method1219(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - Statics.field1119) {
            int var3 = 8 - Statics.field1119;
            int var4 = (0x1 << var3) - 1;
            var1 += (Statics.field1121[Statics.field1133] >> Statics.field1119 & var4) << var2;
            Statics.field1119 = 0;
            Statics.field1133++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (Statics.field1121[Statics.field1133] >> Statics.field1119 & var5) << var2;
            Statics.field1119 += arg0;
        }
        return var1;
    }

    @ObfuscatedName("bn.p([B)V")
    public void method1230(byte[] arg0) {
        class127 var2 = new class127(arg0);
        this.field1116 = var2.method2548();
        this.field1122 = var2.method2548();
        this.field1123 = var2.method2548();
        this.field1130 = var2.method2548();
        if (this.field1130 < 0) {
            this.field1130 = ~this.field1130;
            this.field1120 = true;
        }
        int var3 = var2.method2548();
        this.field1135 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method2499();
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method2510(var7, 0, var5);
            this.field1135[var4] = var7;
        }
    }

    @ObfuscatedName("bn.x([B)V")
    public static void method1220(byte[] arg0) {
        method1217(arg0, 0);
        Statics.field1124 = 0x1 << method1219(4);
        Statics.field1125 = 0x1 << method1219(4);
        Statics.field1117 = new float[Statics.field1125];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? Statics.field1124 : Statics.field1125;
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
            int var13 = class124.method2394(var5 - 1);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class124.method1434(var14, var13);
            }
            if (var1 == 0) {
                Statics.field1138 = var6;
                Statics.field1141 = var8;
                Statics.field1140 = var10;
                Statics.field1131 = var12;
            } else {
                Statics.field1118 = var6;
                Statics.field1142 = var8;
                Statics.field1143 = var10;
                Statics.field1145 = var12;
            }
        }
        int var15 = method1219(8) + 1;
        Statics.field1126 = new class60[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            Statics.field1126[var16] = new class60();
        }
        int var17 = method1219(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method1219(16);
        }
        int var19 = method1219(6) + 1;
        Statics.field1127 = new class49[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            Statics.field1127[var20] = new class49();
        }
        int var21 = method1219(6) + 1;
        Statics.field1128 = new class59[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            Statics.field1128[var22] = new class59();
        }
        int var23 = method1219(6) + 1;
        Statics.field1129 = new class50[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            Statics.field1129[var24] = new class50();
        }
        int var25 = method1219(6) + 1;
        Statics.field1144 = new boolean[var25];
        Statics.field1134 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            Statics.field1144[var26] = method1236() != 0;
            method1219(16);
            method1219(16);
            Statics.field1134[var26] = method1219(8);
        }
    }

    @ObfuscatedName("bn.k(I)[F")
    public float[] method1221(int arg0) {
        method1217(this.field1135[arg0], 0);
        method1236();
        int var2 = method1219(class124.method2394(Statics.field1134.length - 1));
        boolean var3 = Statics.field1144[var2];
        int var4 = var3 ? Statics.field1125 : Statics.field1124;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1236() != 0;
            var6 = method1236() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (Statics.field1124 >> 2);
            var9 = (Statics.field1124 >> 2) + (var4 >> 2);
            var10 = Statics.field1124 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (Statics.field1124 >> 2);
            var12 = (Statics.field1124 >> 2) + (var4 - (var4 >> 2));
            var13 = Statics.field1124 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class50 var14 = Statics.field1129[Statics.field1134[var2]];
        int var15 = var14.field1084;
        int var16 = var14.field1083[var15];
        boolean var17 = !Statics.field1127[var16].method1160();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1086; var19++) {
            class59 var20 = Statics.field1128[var14.field1085[var19]];
            float[] var21 = Statics.field1117;
            var20.method1300(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field1084;
            int var23 = var14.field1083[var22];
            Statics.field1127[var23].method1173(Statics.field1117, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                Statics.field1117[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = Statics.field1117;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? Statics.field1118 : Statics.field1138;
            float[] var32 = var3 ? Statics.field1142 : Statics.field1141;
            float[] var33 = var3 ? Statics.field1143 : Statics.field1140;
            int[] var34 = var3 ? Statics.field1145 : Statics.field1131;
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
            int var47 = class124.method2394(var4 - 1);
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
                Statics.field1117[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                Statics.field1117[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field1139 > 0) {
            int var91 = this.field1139 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field1136) {
                for (int var92 = 0; var92 < this.field1137; var92++) {
                    int var93 = (this.field1139 >> 1) + var92;
                    var90[var92] += this.field1115[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length - (var4 >> 1) + var94;
                    var90[var95] += Statics.field1117[var94];
                }
            }
        }
        float[] var96 = this.field1115;
        this.field1115 = Statics.field1117;
        Statics.field1117 = var96;
        this.field1139 = var4;
        this.field1137 = var12 - (var4 >> 1);
        this.field1136 = var17;
        return var90;
    }

    @ObfuscatedName("bn.r(Leu;)Z")
    public static boolean method1225(class153 arg0) {
        if (!field1132) {
            byte[] var1 = arg0.method3080(0, 0);
            if (var1 == null) {
                return false;
            }
            method1220(var1);
            field1132 = true;
        }
        return true;
    }

    @ObfuscatedName("bn.z(Leu;II)Lbn;")
    public static class53 method1238(class153 arg0, int arg1, int arg2) {
        if (method1225(arg0)) {
            byte[] var3 = arg0.method3080(arg1, arg2);
            return var3 == null ? null : new class53(var3);
        } else {
            arg0.method3084(arg1, arg2);
            return null;
        }
    }

    public class53(byte[] arg0) {
        this.method1230(arg0);
    }

    @ObfuscatedName("bn.n([I)Lbk;")
    public class63 method1224(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field1146 == null) {
            this.field1139 = 0;
            this.field1115 = new float[Statics.field1125];
            this.field1146 = new byte[this.field1122];
            this.field1147 = 0;
            this.field1148 = 0;
        }
        while (this.field1148 < this.field1135.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method1221(this.field1148);
            if (var2 != null) {
                int var3 = this.field1147;
                int var4 = var2.length;
                if (var4 > this.field1122 - var3) {
                    var4 = this.field1122 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field1146[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field1147;
                }
                this.field1147 = var3;
            }
            this.field1148++;
        }
        this.field1115 = null;
        byte[] var7 = this.field1146;
        this.field1146 = null;
        return new class63(this.field1116, var7, this.field1123, this.field1130, this.field1120);
    }
}
