package deob;

@ObfuscatedName("bu")
public class class53 extends class179 {

    @ObfuscatedName("bu.b")
    public byte[][] field1104;

    @ObfuscatedName("bu.e")
    public int field1105;

    @ObfuscatedName("bu.g")
    public int field1128;

    @ObfuscatedName("bu.o")
    public int field1107;

    @ObfuscatedName("bu.a")
    public int field1134;

    @ObfuscatedName("bu.h")
    public boolean field1123;

    @ObfuscatedName("bu.v")
    public static boolean field1121 = false;

    @ObfuscatedName("bu.y")
    public float[] field1122;

    @ObfuscatedName("bu.k")
    public int field1106;

    @ObfuscatedName("bu.p")
    public int field1124;

    @ObfuscatedName("bu.s")
    public boolean field1125;

    @ObfuscatedName("bu.am")
    public byte[] field1136;

    @ObfuscatedName("bu.al")
    public int field1109;

    @ObfuscatedName("bu.ab")
    public int field1114;

    @ObfuscatedName("bu.b(I)F")
    public static float method1175(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @ObfuscatedName("bu.e([BI)V")
    public static void method1171(byte[] arg0, int arg1) {
        Statics.field1110 = arg0;
        Statics.field1111 = arg1;
        Statics.field1112 = 0;
    }

    @ObfuscatedName("bu.g()I")
    public static int method1172() {
        int var0 = Statics.field1110[Statics.field1111] >> Statics.field1112 & 0x1;
        Statics.field1112++;
        Statics.field1111 += Statics.field1112 >> 3;
        Statics.field1112 &= 0x7;
        return var0;
    }

    @ObfuscatedName("bu.o(I)I")
    public static int method1173(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - Statics.field1112) {
            int var3 = 8 - Statics.field1112;
            int var4 = (0x1 << var3) - 1;
            var1 += (Statics.field1110[Statics.field1111] >> Statics.field1112 & var4) << var2;
            Statics.field1112 = 0;
            Statics.field1111++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (Statics.field1110[Statics.field1111] >> Statics.field1112 & var5) << var2;
            Statics.field1112 += arg0;
        }
        return var1;
    }

    @ObfuscatedName("bu.a([B)V")
    public void method1170(byte[] arg0) {
        class126 var2 = new class126(arg0);
        this.field1105 = var2.method2439();
        this.field1128 = var2.method2439();
        this.field1107 = var2.method2439();
        this.field1134 = var2.method2439();
        if (this.field1134 < 0) {
            this.field1134 = ~this.field1134;
            this.field1123 = true;
        }
        int var3 = var2.method2439();
        this.field1104 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method2436();
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method2466(var7, 0, var5);
            this.field1104[var4] = var7;
        }
    }

    @ObfuscatedName("bu.h([B)V")
    public static void method1191(byte[] arg0) {
        method1171(arg0, 0);
        Statics.field1113 = 0x1 << method1173(4);
        Statics.field1135 = 0x1 << method1173(4);
        Statics.field1126 = new float[Statics.field1135];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? Statics.field1113 : Statics.field1135;
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
            int var13 = class124.method22(var5 - 1);
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
                Statics.field1108 = var6;
                Statics.field1117 = var8;
                Statics.field1129 = var10;
                Statics.field1133 = var12;
            } else {
                Statics.field1130 = var6;
                Statics.field1131 = var8;
                Statics.field1132 = var10;
                Statics.field1127 = var12;
            }
        }
        int var21 = method1173(8) + 1;
        Statics.field1115 = new class60[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            Statics.field1115[var22] = new class60();
        }
        int var23 = method1173(6) + 1;
        for (int var24 = 0; var24 < var23; var24++) {
            method1173(16);
        }
        int var25 = method1173(6) + 1;
        Statics.field1116 = new class49[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            Statics.field1116[var26] = new class49();
        }
        int var27 = method1173(6) + 1;
        Statics.field1137 = new class59[var27];
        for (int var28 = 0; var28 < var27; var28++) {
            Statics.field1137[var28] = new class59();
        }
        int var29 = method1173(6) + 1;
        Statics.field1118 = new class50[var29];
        for (int var30 = 0; var30 < var29; var30++) {
            Statics.field1118[var30] = new class50();
        }
        int var31 = method1173(6) + 1;
        Statics.field1119 = new boolean[var31];
        Statics.field1120 = new int[var31];
        for (int var32 = 0; var32 < var31; var32++) {
            Statics.field1119[var32] = method1172() != 0;
            method1173(16);
            method1173(16);
            Statics.field1120[var32] = method1173(8);
        }
    }

    @ObfuscatedName("bu.j(I)[F")
    public float[] method1176(int arg0) {
        method1171(this.field1104[arg0], 0);
        method1172();
        int var2 = method1173(class124.method22(Statics.field1120.length - 1));
        boolean var3 = Statics.field1119[var2];
        int var4 = var3 ? Statics.field1135 : Statics.field1113;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1172() != 0;
            var6 = method1172() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (Statics.field1113 >> 2);
            var9 = (Statics.field1113 >> 2) + (var4 >> 2);
            var10 = Statics.field1113 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (Statics.field1113 >> 2);
            var12 = (Statics.field1113 >> 2) + (var4 - (var4 >> 2));
            var13 = Statics.field1113 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class50 var14 = Statics.field1118[Statics.field1120[var2]];
        int var15 = var14.field1069;
        int var16 = var14.field1071[var15];
        boolean var17 = !Statics.field1116[var16].method1110();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1070; var19++) {
            class59 var20 = Statics.field1137[var14.field1072[var19]];
            float[] var21 = Statics.field1126;
            var20.method1267(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field1069;
            int var23 = var14.field1071[var22];
            Statics.field1116[var23].method1130(Statics.field1126, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                Statics.field1126[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = Statics.field1126;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? Statics.field1130 : Statics.field1108;
            float[] var32 = var3 ? Statics.field1131 : Statics.field1117;
            float[] var33 = var3 ? Statics.field1132 : Statics.field1129;
            int[] var34 = var3 ? Statics.field1127 : Statics.field1133;
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
            int var47 = class124.method22(var4 - 1);
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
                Statics.field1126[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                Statics.field1126[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field1106 > 0) {
            int var91 = this.field1106 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field1125) {
                for (int var92 = 0; var92 < this.field1124; var92++) {
                    int var93 = (this.field1106 >> 1) + var92;
                    var90[var92] += this.field1122[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length - (var4 >> 1) + var94;
                    var90[var95] += Statics.field1126[var94];
                }
            }
        }
        float[] var96 = this.field1122;
        this.field1122 = Statics.field1126;
        Statics.field1126 = var96;
        this.field1106 = var4;
        this.field1124 = var12 - (var4 >> 1);
        this.field1125 = var17;
        return var90;
    }

    @ObfuscatedName("bu.f(Lej;)Z")
    public static boolean method1177(class153 arg0) {
        if (!field1121) {
            byte[] var1 = arg0.method3026(0, 0);
            if (var1 == null) {
                return false;
            }
            method1191(var1);
            field1121 = true;
        }
        return true;
    }

    @ObfuscatedName("bu.q(Lej;II)Lbu;")
    public static class53 method1178(class153 arg0, int arg1, int arg2) {
        if (method1177(arg0)) {
            byte[] var3 = arg0.method3026(arg1, arg2);
            return var3 == null ? null : new class53(var3);
        } else {
            arg0.method2998(arg1, arg2);
            return null;
        }
    }

    public class53(byte[] arg0) {
        this.method1170(arg0);
    }

    @ObfuscatedName("bu.l([I)Lbv;")
    public class63 method1179(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field1136 == null) {
            this.field1106 = 0;
            this.field1122 = new float[Statics.field1135];
            this.field1136 = new byte[this.field1128];
            this.field1109 = 0;
            this.field1114 = 0;
        }
        while (this.field1114 < this.field1104.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method1176(this.field1114);
            if (var2 != null) {
                int var3 = this.field1109;
                int var4 = var2.length;
                if (var4 > this.field1128 - var3) {
                    var4 = this.field1128 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field1136[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field1109;
                }
                this.field1109 = var3;
            }
            this.field1114++;
        }
        this.field1122 = null;
        byte[] var7 = this.field1136;
        this.field1136 = null;
        return new class63(this.field1105, var7, this.field1107, this.field1134, this.field1123);
    }
}
