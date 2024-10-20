package deob;

@ObfuscatedName("kj")
public class class306 extends class206 {

    @ObfuscatedName("kj.an")
    public static int field3874 = 0;

    @ObfuscatedName("kj.af")
    public static int field3873 = 0;

    @ObfuscatedName("kj.as")
    public static int field3877 = 0;

    @ObfuscatedName("kj.ax")
    public static int field3875 = 0;

    @ObfuscatedName("kj.cy([III)V")
    public static void method5179(int[] arg0, int arg1, int arg2) {
        Statics.field3876 = arg0;
        Statics.field3872 = arg1;
        Statics.field3871 = arg2;
        method5181(0, 0, arg1, arg2);
    }

    @ObfuscatedName("kj.cs()V")
    public static void method5228() {
        field3877 = 0;
        field3874 = 0;
        field3875 = Statics.field3872;
        field3873 = Statics.field3871;
    }

    @ObfuscatedName("kj.cq(IIII)V")
    public static void method5181(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field3872) {
            arg2 = Statics.field3872;
        }
        if (arg3 > Statics.field3871) {
            arg3 = Statics.field3871;
        }
        field3877 = arg0;
        field3874 = arg1;
        field3875 = arg2;
        field3873 = arg3;
    }

    @ObfuscatedName("kj.cz(IIII)V")
    public static void method5182(int arg0, int arg1, int arg2, int arg3) {
        if (field3877 < arg0) {
            field3877 = arg0;
        }
        if (field3874 < arg1) {
            field3874 = arg1;
        }
        if (field3875 > arg2) {
            field3875 = arg2;
        }
        if (field3873 > arg3) {
            field3873 = arg3;
        }
    }

    @ObfuscatedName("kj.ct([I)V")
    public static void method5180(int[] arg0) {
        arg0[0] = field3877;
        arg0[1] = field3874;
        arg0[2] = field3875;
        arg0[3] = field3873;
    }

    @ObfuscatedName("kj.dr([I)V")
    public static void method5184(int[] arg0) {
        field3877 = arg0[0];
        field3874 = arg0[1];
        field3875 = arg0[2];
        field3873 = arg0[3];
    }

    @ObfuscatedName("kj.dc()V")
    public static void method5178() {
        int var0 = 0;
        int var1 = Statics.field3872 * Statics.field3871 - 7;
        while (var0 < var1) {
            Statics.field3876[var0++] = 0;
            Statics.field3876[var0++] = 0;
            Statics.field3876[var0++] = 0;
            Statics.field3876[var0++] = 0;
            Statics.field3876[var0++] = 0;
            Statics.field3876[var0++] = 0;
            Statics.field3876[var0++] = 0;
            Statics.field3876[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field3876[var0++] = 0;
        }
    }

    @ObfuscatedName("kj.dz(IIII)V")
    public static void method5208(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method5235(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field3874) {
            var4 = field3874;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field3873) {
            var5 = field3873;
        }
        int var6 = var4;
        int var7 = arg2 * arg2;
        int var8 = 0;
        int var9 = arg1 - var4;
        int var10 = var9 * var9;
        int var11 = var10 - var9;
        if (arg1 > var5) {
            arg1 = var5;
        }
        while (var6 < arg1) {
            while (var11 <= var7 || var10 <= var7) {
                var10 += var8 + var8;
                var11 += var8++ + var8;
            }
            int var12 = arg0 - var8 + 1;
            if (var12 < field3877) {
                var12 = field3877;
            }
            int var13 = arg0 + var8;
            if (var13 > field3875) {
                var13 = field3875;
            }
            int var14 = Statics.field3872 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                Statics.field3876[var14++] = arg3;
            }
            var6++;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
        }
        int var16 = arg2;
        int var17 = var6 - arg1;
        int var18 = var17 * var17 + var7;
        int var19 = var18 - arg2;
        int var20 = var18 - var17;
        while (var6 < var5) {
            while (var20 > var7 && var19 > var7) {
                var20 -= var16-- + var16;
                var19 -= var16 + var16;
            }
            int var21 = arg0 - var16;
            if (var21 < field3877) {
                var21 = field3877;
            }
            int var22 = arg0 + var16;
            if (var22 > field3875 - 1) {
                var22 = field3875 - 1;
            }
            int var23 = Statics.field3872 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                Statics.field3876[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @ObfuscatedName("kj.ds(IIIII)V")
    public static void method5187(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method5208(arg0, arg1, arg2, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = arg1 - arg2;
        if (var9 < field3874) {
            var9 = field3874;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field3873) {
            var10 = field3873;
        }
        int var11 = var9;
        int var12 = arg2 * arg2;
        int var13 = 0;
        int var14 = arg1 - var9;
        int var15 = var14 * var14;
        int var16 = var15 - var14;
        if (arg1 > var10) {
            arg1 = var10;
        }
        while (var11 < arg1) {
            while (var16 <= var12 || var15 <= var12) {
                var15 += var13 + var13;
                var16 += var13++ + var13;
            }
            int var17 = arg0 - var13 + 1;
            if (var17 < field3877) {
                var17 = field3877;
            }
            int var18 = arg0 + var13;
            if (var18 > field3875) {
                var18 = field3875;
            }
            int var19 = Statics.field3872 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (Statics.field3876[var19] >> 16 & 0xFF) * var5;
                int var22 = (Statics.field3876[var19] >> 8 & 0xFF) * var5;
                int var23 = (Statics.field3876[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                Statics.field3876[var19++] = var24;
            }
            var11++;
            var15 -= var14-- + var14;
            var16 -= var14 + var14;
        }
        int var25 = arg2;
        int var26 = -var14;
        int var27 = var26 * var26 + var12;
        int var28 = var27 - arg2;
        int var29 = var27 - var26;
        while (var11 < var10) {
            while (var29 > var12 && var28 > var12) {
                var29 -= var25-- + var25;
                var28 -= var25 + var25;
            }
            int var30 = arg0 - var25;
            if (var30 < field3877) {
                var30 = field3877;
            }
            int var31 = arg0 + var25;
            if (var31 > field3875 - 1) {
                var31 = field3875 - 1;
            }
            int var32 = Statics.field3872 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (Statics.field3876[var32] >> 16 & 0xFF) * var5;
                int var35 = (Statics.field3876[var32] >> 8 & 0xFF) * var5;
                int var36 = (Statics.field3876[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                Statics.field3876[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @ObfuscatedName("kj.df(IIIIII)V")
    public static void method5188(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field3877) {
            arg2 -= field3877 - arg0;
            arg0 = field3877;
        }
        if (arg1 < field3874) {
            arg3 -= field3874 - arg1;
            arg1 = field3874;
        }
        if (arg0 + arg2 > field3875) {
            arg2 = field3875 - arg0;
        }
        if (arg1 + arg3 > field3873) {
            arg3 = field3873 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field3872 - arg2;
        int var9 = Statics.field3872 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field3876[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field3876[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("kj.dl(IIIII)V")
    public static void method5225(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3877) {
            arg2 -= field3877 - arg0;
            arg0 = field3877;
        }
        if (arg1 < field3874) {
            arg3 -= field3874 - arg1;
            arg1 = field3874;
        }
        if (arg0 + arg2 > field3875) {
            arg2 = field3875 - arg0;
        }
        if (arg1 + arg3 > field3873) {
            arg3 = field3873 - arg1;
        }
        int var5 = Statics.field3872 - arg2;
        int var6 = Statics.field3872 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field3876[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("kj.da(IIIIIIII)V")
    public static void method5190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        int var9 = arg4 == arg5 && arg6 == arg7 ? -1 : 65536 / arg3;
        int var10 = arg6;
        int var11 = 256 - arg6;
        int var12 = arg4;
        if (arg0 < field3877) {
            arg2 -= field3877 - arg0;
            arg0 = field3877;
        }
        if (arg1 < field3874) {
            var8 += (field3874 - arg1) * var9;
            arg3 -= field3874 - arg1;
            arg1 = field3874;
        }
        if (arg0 + arg2 > field3875) {
            arg2 = field3875 - arg0;
        }
        if (arg1 + arg3 > field3873) {
            arg3 = field3873 - arg1;
        }
        int var13 = Statics.field3872 - arg2;
        int var14 = Statics.field3872 * arg1 + arg0;
        for (int var15 = -arg3; var15 < 0; var15++) {
            for (int var16 = -arg2; var16 < 0; var16++) {
                int var17 = Statics.field3876[var14];
                int var18 = var12 + var17;
                int var19 = (var12 & 0xFF00FF) + (var17 & 0xFF00FF);
                int var20 = (var18 - var19 & 0x10000) + (var19 & 0x1000100);
                if (var11 == 0) {
                    Statics.field3876[var14++] = var18 - var20 | var20 - (var20 >>> 8);
                } else {
                    int var21 = var18 - var20 | var20 - (var20 >>> 8);
                    Statics.field3876[var14++] = ((var17 & 0xFF00) * var11 >> 8 & 0xFF00) + ((var17 & 0xFF00FF) * var11 >> 8 & 0xFF00FF) + ((var21 & 0xFF00FF) * var10 >> 8 & 0xFF00FF) + ((var21 & 0xFF00) * var10 >> 8 & 0xFF00);
                }
            }
            if (var9 > 0) {
                var8 += var9;
                int var22 = 65536 - var8 >> 8;
                int var23 = var8 >> 8;
                if (arg6 != arg7) {
                    var10 = (65536 - var8) * arg6 + arg7 * var8 >> 16;
                    var11 = 256 - var10;
                }
                if (arg4 != arg5) {
                    var12 = ((arg4 & 0xFF00FF) * var22 + (arg5 & 0xFF00FF) * var23 & 0xFF00FF00) + ((arg4 & 0xFF00) * var22 + (arg5 & 0xFF00) * var23 & 0xFF0000) >>> 8;
                }
            }
            var14 += var13;
        }
    }

    @ObfuscatedName("kj.dh(IIIIIIII)V")
    public static void method5191(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        int var9 = arg4 == arg5 && arg6 == arg7 ? -1 : 65536 / arg3;
        int var10 = arg6;
        int var11 = 256 - arg6;
        if (arg0 < field3877) {
            arg2 -= field3877 - arg0;
            arg0 = field3877;
        }
        if (arg1 < field3874) {
            var8 += (field3874 - arg1) * var9;
            arg3 -= field3874 - arg1;
            arg1 = field3874;
        }
        if (arg0 + arg2 > field3875) {
            arg2 = field3875 - arg0;
        }
        if (arg1 + arg3 > field3873) {
            arg3 = field3873 - arg1;
        }
        int var12 = arg4 >> 16;
        int var13 = (arg4 & 0xFF00) >> 8;
        int var14 = arg4 & 0xFF;
        int var15 = Statics.field3872 - arg2;
        int var16 = Statics.field3872 * arg1 + arg0;
        for (int var17 = 0; var17 < arg3; var17++) {
            for (int var18 = -arg2; var18 < 0; var18++) {
                int var19 = Statics.field3876[var16];
                int var20 = var19 >> 16;
                int var21 = (var19 & 0xFF00) >> 8;
                int var22 = var19 & 0xFF;
                int var23;
                int var24;
                int var25;
                if (var11 == 0) {
                    var23 = var20 < 127 ? var12 * var20 >> 7 : 255 - ((255 - var12) * (255 - var20) >> 7);
                    var24 = var21 < 127 ? var13 * var21 >> 7 : 255 - ((255 - var13) * (255 - var21) >> 7);
                    var25 = var22 < 127 ? var14 * var22 >> 7 : 255 - ((255 - var14) * (255 - var22) >> 7);
                } else {
                    var23 = var20 < 127 ? (var12 * var20 * var10 >> 7) + var11 * var20 >> 8 : (255 - ((255 - var12) * (255 - var20) >> 7)) * var10 + var11 * var20 >> 8;
                    var24 = var21 < 127 ? (var13 * var21 * var10 >> 7) + var11 * var21 >> 8 : (255 - ((255 - var13) * (255 - var21) >> 7)) * var10 + var11 * var21 >> 8;
                    var25 = var22 < 127 ? (var14 * var22 * var10 >> 7) + var11 * var22 >> 8 : (255 - ((255 - var14) * (255 - var22) >> 7)) * var10 + var11 * var22 >> 8;
                }
                Statics.field3876[var16++] = (var23 << 16) + (var24 << 8) + var25;
            }
            if (var9 > 0) {
                var8 += var9;
                int var26 = 65536 - var8 >> 8;
                int var27 = var8 >> 8;
                if (arg6 != arg7) {
                    var10 = (65536 - var8) * arg6 + arg7 * var8 >> 16;
                    var11 = 256 - var10;
                }
                if (arg4 != arg5) {
                    int var28 = ((arg4 & 0xFF00FF) * var26 + (arg5 & 0xFF00FF) * var27 & 0xFF00FF00) + ((arg4 & 0xFF00) * var26 + (arg5 & 0xFF00) * var27 & 0xFF0000) >>> 8;
                    var12 = var28 >> 16;
                    var13 = (var28 & 0xFF00) >> 8;
                    var14 = var28 & 0xFF;
                }
            }
            var16 += var15;
        }
    }

    @ObfuscatedName("kj.dj(IIIIIIII)V")
    public static void method5192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        int var9 = 65536 / arg3;
        int var10 = arg6;
        int var11 = 256 - arg6;
        if (arg0 < field3877) {
            arg2 -= field3877 - arg0;
            arg0 = field3877;
        }
        if (arg1 < field3874) {
            var8 += (field3874 - arg1) * var9;
            arg3 -= field3874 - arg1;
            arg1 = field3874;
        }
        if (arg0 + arg2 > field3875) {
            arg2 = field3875 - arg0;
        }
        if (arg1 + arg3 > field3873) {
            arg3 = field3873 - arg1;
        }
        int var12 = arg4 & 0xFF0000;
        int var13 = arg4 & 0xFF00;
        int var14 = arg4 & 0xFF;
        int var15 = arg6 * var12 >> 8;
        int var16 = arg6 * var13 >> 8;
        int var17 = arg6 * var14 >> 8;
        int var18 = Statics.field3872 - arg2;
        int var19 = Statics.field3872 * arg1 + arg0;
        for (int var20 = 0; var20 < arg3; var20++) {
            for (int var21 = -arg2; var21 < 0; var21++) {
                int var22 = Statics.field3876[var19];
                int var23 = var22 & 0xFF0000;
                int var24 = var23 <= var12 ? var23 : (var11 == 0 ? var12 : (var11 * var23 >> 8) + var15 & 0xFF0000);
                int var25 = var22 & 0xFF00;
                int var26 = var25 <= var13 ? var25 : (var11 == 0 ? var13 : (var11 * var25 >> 8) + var16 & 0xFF00);
                int var27 = var22 & 0xFF;
                int var28 = var27 <= var14 ? var27 : (var11 == 0 ? var14 : (var11 * var27 >> 8) + var17);
                Statics.field3876[var19++] = var24 + var26 + var28;
            }
            if (var9 > 0) {
                var8 += var9;
                int var29 = 65536 - var8 >> 8;
                int var30 = var8 >> 8;
                if (arg6 != arg7) {
                    var10 = (65536 - var8) * arg6 + arg7 * var8 >> 16;
                    var11 = 256 - var10;
                }
                if (arg4 != arg5) {
                    int var31 = ((arg4 & 0xFF00FF) * var29 + (arg5 & 0xFF00FF) * var30 & 0xFF00FF00) + ((arg4 & 0xFF00) * var29 + (arg5 & 0xFF00) * var30 & 0xFF0000) >>> 8;
                    var12 = var31 & 0xFF0000;
                    var13 = var31 & 0xFF00;
                    var14 = var31 & 0xFF;
                    var15 = var10 * var12 >> 8;
                    var16 = var10 * var13 >> 8;
                    var17 = var10 * var14 >> 8;
                }
            }
            var19 += var18;
        }
    }

    @ObfuscatedName("kj.do(IIIIIIII)V")
    public static void method5193(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        int var9 = 65536 / arg3;
        int var10 = arg6;
        int var11 = 256 - arg6;
        if (arg0 < field3877) {
            arg2 -= field3877 - arg0;
            arg0 = field3877;
        }
        if (arg1 < field3874) {
            var8 += (field3874 - arg1) * var9;
            arg3 -= field3874 - arg1;
            arg1 = field3874;
        }
        if (arg0 + arg2 > field3875) {
            arg2 = field3875 - arg0;
        }
        if (arg1 + arg3 > field3873) {
            arg3 = field3873 - arg1;
        }
        int var12 = arg4 & 0xFF0000;
        int var13 = arg4 & 0xFF00;
        int var14 = arg4 & 0xFF;
        int var15 = arg6 * var12 >> 8;
        int var16 = arg6 * var13 >> 8;
        int var17 = arg6 * var14 >> 8;
        int var18 = Statics.field3872 - arg2;
        int var19 = Statics.field3872 * arg1 + arg0;
        for (int var20 = 0; var20 < arg3; var20++) {
            for (int var21 = -arg2; var21 < 0; var21++) {
                int var22 = Statics.field3876[var19];
                int var23 = var22 & 0xFF0000;
                int var24 = var23 >= var12 ? var23 : (var11 == 0 ? var12 : (var11 * var23 >> 8) + var15 & 0xFF0000);
                int var25 = var22 & 0xFF00;
                int var26 = var25 >= var13 ? var25 : (var11 == 0 ? var13 : (var11 * var25 >> 8) + var16 & 0xFF00);
                int var27 = var22 & 0xFF;
                int var28 = var27 >= var14 ? var27 : (var11 == 0 ? var14 : (var11 * var27 >> 8) + var17);
                Statics.field3876[var19++] = var24 + var26 + var28;
            }
            if (var9 > 0) {
                var8 += var9;
                int var29 = 65536 - var8 >> 8;
                int var30 = var8 >> 8;
                if (arg6 != arg7) {
                    var10 = (65536 - var8) * arg6 + arg7 * var8 >> 16;
                    var11 = 256 - var10;
                }
                if (arg4 != arg5) {
                    int var31 = ((arg4 & 0xFF00FF) * var29 + (arg5 & 0xFF00FF) * var30 & 0xFF00FF00) + ((arg4 & 0xFF00) * var29 + (arg5 & 0xFF00) * var30 & 0xFF0000) >>> 8;
                    var12 = var31 & 0xFF0000;
                    var13 = var31 & 0xFF00;
                    var14 = var31 & 0xFF;
                    var15 = var10 * var12 >> 8;
                    var16 = var10 * var13 >> 8;
                    var17 = var10 * var14 >> 8;
                }
            }
            var19 += var18;
        }
    }

    @ObfuscatedName("kj.dv(IIIIII)V")
    public static void method5194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field3877) {
            arg2 -= field3877 - arg0;
            arg0 = field3877;
        }
        if (arg1 < field3874) {
            var6 += (field3874 - arg1) * var7;
            arg3 -= field3874 - arg1;
            arg1 = field3874;
        }
        if (arg0 + arg2 > field3875) {
            arg2 = field3875 - arg0;
        }
        if (arg1 + arg3 > field3873) {
            arg3 = field3873 - arg1;
        }
        int var8 = Statics.field3872 - arg2;
        int var9 = Statics.field3872 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field3876[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("kj.dg(IIIIII[BIZ)V")
    public static void method5195(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        if (arg0 + arg2 < 0 || arg1 + arg3 < 0 || arg0 >= Statics.field3872 || arg1 >= Statics.field3871) {
            return;
        }
        int var9 = 0;
        int var10 = 0;
        if (arg0 < 0) {
            var9 -= arg0;
            arg2 += arg0;
        }
        if (arg1 < 0) {
            var10 -= arg1;
            arg3 += arg1;
        }
        if (arg0 + arg2 > Statics.field3872) {
            arg2 = Statics.field3872 - arg0;
        }
        if (arg1 + arg3 > Statics.field3871) {
            arg3 = Statics.field3871 - arg1;
        }
        int var11 = arg6.length / arg7;
        int var12 = Statics.field3872 - arg2;
        int var13 = arg4 >>> 24;
        int var14 = arg5 >>> 24;
        if (!arg8 || var13 == 255 && var14 == 255) {
            int var25 = (arg1 + var10) * Statics.field3872 + arg0 + var9;
            for (int var26 = arg1 + var10; var26 < arg1 + var10 + arg3; var26++) {
                for (int var27 = arg0 + var9; var27 < arg0 + var9 + arg2; var27++) {
                    int var28 = (var26 - arg1) % var11;
                    int var29 = (var27 - arg0) % arg7;
                    if (arg6[arg7 * var28 + var29] == 0) {
                        Statics.field3876[var25++] = arg4;
                    } else {
                        Statics.field3876[var25++] = arg5;
                    }
                }
                var25 += var12;
            }
            return;
        }
        int var15 = (arg1 + var10) * Statics.field3872 + arg0 + var9;
        for (int var16 = arg1 + var10; var16 < arg1 + var10 + arg3; var16++) {
            for (int var17 = arg0 + var9; var17 < arg0 + var9 + arg2; var17++) {
                int var18 = (var16 - arg1) % var11;
                int var19 = (var17 - arg0) % arg7;
                int var20 = arg4;
                if (arg6[arg7 * var18 + var19] != 0) {
                    var20 = arg5;
                }
                int var21 = var20 >>> 24;
                int var22 = 255 - var21;
                int var23 = Statics.field3876[var15];
                int var24 = ((var20 & 0xFF00FF) * var21 + (var23 & 0xFF00FF) * var22 & 0xFF00FF00) + ((var20 & 0xFF00) * var21 + (var23 & 0xFF00) * var22 & 0xFF0000) >> 8;
                Statics.field3876[var15++] = var24;
            }
            var15 += var12;
        }
    }

    @ObfuscatedName("kj.dt(IIIII)V")
    public static void method5196(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method5198(arg0, arg1, arg2, arg4);
        method5198(arg0, arg1 + arg3 - 1, arg2, arg4);
        method5200(arg0, arg1, arg3, arg4);
        method5200(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("kj.dx(IIIIII)V")
    public static void method5197(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method5237(arg0, arg1, arg2, arg4, arg5);
        method5237(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method5215(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method5215(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("kj.db(IIII)V")
    public static void method5198(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field3874 || arg1 >= field3873) {
            return;
        }
        if (arg0 < field3877) {
            arg2 -= field3877 - arg0;
            arg0 = field3877;
        }
        if (arg0 + arg2 > field3875) {
            arg2 = field3875 - arg0;
        }
        int var4 = Statics.field3872 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field3876[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("kj.dd(IIIII)V")
    public static void method5237(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field3874 || arg1 >= field3873) {
            return;
        }
        if (arg0 < field3877) {
            arg2 -= field3877 - arg0;
            arg0 = field3877;
        }
        if (arg0 + arg2 > field3875) {
            arg2 = field3875 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field3872 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field3876[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field3876[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field3876[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field3876[var9++] = var14;
        }
    }

    @ObfuscatedName("kj.dk(IIII)V")
    public static void method5200(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field3877 || arg0 >= field3875) {
            return;
        }
        if (arg1 < field3874) {
            arg2 -= field3874 - arg1;
            arg1 = field3874;
        }
        if (arg1 + arg2 > field3873) {
            arg2 = field3873 - arg1;
        }
        int var4 = Statics.field3872 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field3876[Statics.field3872 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("kj.dq(IIIII)V")
    public static void method5215(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3877 || arg0 >= field3875) {
            return;
        }
        if (arg1 < field3874) {
            arg2 -= field3874 - arg1;
            arg1 = field3874;
        }
        if (arg1 + arg2 > field3873) {
            arg2 = field3873 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field3872 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field3876[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field3876[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field3876[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field3876[var9] = var14;
            var9 += Statics.field3872;
        }
    }

    @ObfuscatedName("kj.dp(IIIII)V")
    public static void method5183(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method5198(arg0, arg1, var5 + 1, arg4);
            } else {
                method5198(arg0 + var5, arg1, -var5 + 1, arg4);
            }
        } else if (var5 != 0) {
            if (var5 + var6 < 0) {
                arg0 += var5;
                var5 = -var5;
                arg1 += var6;
                var6 = -var6;
            }
            if (var5 > var6) {
                int var7 = arg1 << 16;
                int var8 = var7 + 32768;
                int var9 = var6 << 16;
                int var10 = (int) Math.floor((double) var9 / (double) var5 + 0.5D);
                int var11 = arg0 + var5;
                if (arg0 < field3877) {
                    var8 += (field3877 - arg0) * var10;
                    arg0 = field3877;
                }
                if (var11 >= field3875) {
                    var11 = field3875 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field3874 && var12 < field3873) {
                        Statics.field3876[Statics.field3872 * var12 + arg0] = arg4;
                    }
                    var8 += var10;
                    arg0++;
                }
            } else {
                int var13 = arg0 << 16;
                int var14 = var13 + 32768;
                int var15 = var5 << 16;
                int var16 = (int) Math.floor((double) var15 / (double) var6 + 0.5D);
                int var17 = arg1 + var6;
                if (arg1 < field3874) {
                    var14 += (field3874 - arg1) * var16;
                    arg1 = field3874;
                }
                if (var17 >= field3873) {
                    var17 = field3873 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field3877 && var18 < field3875) {
                        Statics.field3876[Statics.field3872 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method5200(arg0, arg1, var6 + 1, arg4);
        } else {
            method5200(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("kj.dm(III)V")
    public static void method5235(int arg0, int arg1, int arg2) {
        if (arg0 >= field3877 && arg1 >= field3874 && arg0 < field3875 && arg1 < field3873) {
            Statics.field3876[Statics.field3872 * arg1 + arg0] = arg2;
        }
    }

    @ObfuscatedName("kj.dw(III[I[I)V")
    public static void method5223(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field3872 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field3876[var7++] = arg2;
            }
            var5 += Statics.field3872;
        }
    }
}
