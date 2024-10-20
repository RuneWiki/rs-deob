package deob;

@ObfuscatedName("ld")
public class class331 extends class185 {

    @ObfuscatedName("ld.ax")
    public static int field3873 = 0;

    @ObfuscatedName("ld.ag")
    public static int field3874 = 0;

    @ObfuscatedName("ld.ab")
    public static int field3875 = 0;

    @ObfuscatedName("ld.am")
    public static int field3876 = 0;

    @ObfuscatedName("ld.dp([III)V")
    public static void method5678(int[] arg0, int arg1, int arg2) {
        Statics.field3870 = arg0;
        Statics.field3871 = arg1;
        Statics.field3872 = arg2;
        method5691(0, 0, arg1, arg2);
    }

    @ObfuscatedName("ld.dc()V")
    public static void method5695() {
        field3875 = 0;
        field3873 = 0;
        field3876 = Statics.field3871;
        field3874 = Statics.field3872;
    }

    @ObfuscatedName("ld.dt(IIII)V")
    public static void method5691(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field3871) {
            arg2 = Statics.field3871;
        }
        if (arg3 > Statics.field3872) {
            arg3 = Statics.field3872;
        }
        field3875 = arg0;
        field3873 = arg1;
        field3876 = arg2;
        field3874 = arg3;
    }

    @ObfuscatedName("ld.ds(IIII)V")
    public static void method5679(int arg0, int arg1, int arg2, int arg3) {
        if (field3875 < arg0) {
            field3875 = arg0;
        }
        if (field3873 < arg1) {
            field3873 = arg1;
        }
        if (field3876 > arg2) {
            field3876 = arg2;
        }
        if (field3874 > arg3) {
            field3874 = arg3;
        }
    }

    @ObfuscatedName("ld.dg([I)V")
    public static void method5680(int[] arg0) {
        arg0[0] = field3875;
        arg0[1] = field3873;
        arg0[2] = field3876;
        arg0[3] = field3874;
    }

    @ObfuscatedName("ld.do([I)V")
    public static void method5681(int[] arg0) {
        field3875 = arg0[0];
        field3873 = arg0[1];
        field3876 = arg0[2];
        field3874 = arg0[3];
    }

    @ObfuscatedName("ld.dn()V")
    public static void method5682() {
        int var0 = 0;
        int var1 = Statics.field3872 * Statics.field3871 - 7;
        while (var0 < var1) {
            Statics.field3870[var0++] = 0;
            Statics.field3870[var0++] = 0;
            Statics.field3870[var0++] = 0;
            Statics.field3870[var0++] = 0;
            Statics.field3870[var0++] = 0;
            Statics.field3870[var0++] = 0;
            Statics.field3870[var0++] = 0;
            Statics.field3870[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field3870[var0++] = 0;
        }
    }

    @ObfuscatedName("ld.db(IIII)V")
    public static void method5683(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method5697(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field3873) {
            var4 = field3873;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field3874) {
            var5 = field3874;
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
            if (var12 < field3875) {
                var12 = field3875;
            }
            int var13 = arg0 + var8;
            if (var13 > field3876) {
                var13 = field3876;
            }
            int var14 = Statics.field3871 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                Statics.field3870[var14++] = arg3;
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
            if (var21 < field3875) {
                var21 = field3875;
            }
            int var22 = arg0 + var16;
            if (var22 > field3876 - 1) {
                var22 = field3876 - 1;
            }
            int var23 = Statics.field3871 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                Statics.field3870[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @ObfuscatedName("ld.de(IIIII)V")
    public static void method5684(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method5683(arg0, arg1, arg2, arg3);
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
        if (var9 < field3873) {
            var9 = field3873;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field3874) {
            var10 = field3874;
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
            if (var17 < field3875) {
                var17 = field3875;
            }
            int var18 = arg0 + var13;
            if (var18 > field3876) {
                var18 = field3876;
            }
            int var19 = Statics.field3871 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (Statics.field3870[var19] >> 16 & 0xFF) * var5;
                int var22 = (Statics.field3870[var19] >> 8 & 0xFF) * var5;
                int var23 = (Statics.field3870[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                Statics.field3870[var19++] = var24;
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
            if (var30 < field3875) {
                var30 = field3875;
            }
            int var31 = arg0 + var25;
            if (var31 > field3876 - 1) {
                var31 = field3876 - 1;
            }
            int var32 = Statics.field3871 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (Statics.field3870[var32] >> 16 & 0xFF) * var5;
                int var35 = (Statics.field3870[var32] >> 8 & 0xFF) * var5;
                int var36 = (Statics.field3870[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                Statics.field3870[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @ObfuscatedName("ld.dv(IIIIII)V")
    public static void method5685(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field3875) {
            arg2 -= field3875 - arg0;
            arg0 = field3875;
        }
        if (arg1 < field3873) {
            arg3 -= field3873 - arg1;
            arg1 = field3873;
        }
        if (arg0 + arg2 > field3876) {
            arg2 = field3876 - arg0;
        }
        if (arg1 + arg3 > field3874) {
            arg3 = field3874 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field3871 - arg2;
        int var9 = Statics.field3871 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field3870[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field3870[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("ld.dk(IIIII)V")
    public static void method5686(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3875) {
            arg2 -= field3875 - arg0;
            arg0 = field3875;
        }
        if (arg1 < field3873) {
            arg3 -= field3873 - arg1;
            arg1 = field3873;
        }
        if (arg0 + arg2 > field3876) {
            arg2 = field3876 - arg0;
        }
        if (arg1 + arg3 > field3874) {
            arg3 = field3874 - arg1;
        }
        int var5 = Statics.field3871 - arg2;
        int var6 = Statics.field3871 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field3870[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("ld.da(IIIIII)V")
    public static void method5722(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field3875) {
            arg2 -= field3875 - arg0;
            arg0 = field3875;
        }
        if (arg1 < field3873) {
            var6 += (field3873 - arg1) * var7;
            arg3 -= field3873 - arg1;
            arg1 = field3873;
        }
        if (arg0 + arg2 > field3876) {
            arg2 = field3876 - arg0;
        }
        if (arg1 + arg3 > field3874) {
            arg3 = field3874 - arg1;
        }
        int var8 = Statics.field3871 - arg2;
        int var9 = Statics.field3871 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field3870[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("ld.df(IIIIIIII)V")
    public static void method5688(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        int var8 = 0;
        int var9 = 65536 / arg3;
        if (arg0 < field3875) {
            arg2 -= field3875 - arg0;
            arg0 = field3875;
        }
        if (arg1 < field3873) {
            var8 += (field3873 - arg1) * var9;
            arg3 -= field3873 - arg1;
            arg1 = field3873;
        }
        if (arg0 + arg2 > field3876) {
            arg2 = field3876 - arg0;
        }
        if (arg1 + arg3 > field3874) {
            arg3 = field3874 - arg1;
        }
        int var10 = Statics.field3871 - arg2;
        int var11 = Statics.field3871 * arg1 + arg0;
        for (int var12 = -arg3; var12 < 0; var12++) {
            int var13 = 65536 - var8 >> 8;
            int var14 = var8 >> 8;
            int var15 = (arg6 * var13 + arg7 * var14 & 0xFF00) >>> 8;
            if (var15 == 0) {
                var11 += Statics.field3871;
                var8 += var9;
            } else {
                int var16 = ((arg4 & 0xFF00FF) * var13 + (arg5 & 0xFF00FF) * var14 & 0xFF00FF00) + ((arg4 & 0xFF00) * var13 + (arg5 & 0xFF00) * var14 & 0xFF0000) >>> 8;
                int var17 = 255 - var15;
                int var18 = ((var16 & 0xFF00FF) * var15 >> 8 & 0xFF00FF) + ((var16 & 0xFF00) * var15 >> 8 & 0xFF00);
                for (int var19 = -arg2; var19 < 0; var19++) {
                    int var20 = Statics.field3870[var11];
                    if (var20 == 0) {
                        Statics.field3870[var11++] = var18;
                    } else {
                        int var21 = ((var20 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var20 & 0xFF00) * var17 >> 8 & 0xFF00);
                        Statics.field3870[var11++] = var18 + var21;
                    }
                }
                var11 += var10;
                var8 += var9;
            }
        }
    }

    @ObfuscatedName("ld.dz(IIIIII[BIZ)V")
    public static void method5704(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        if (arg0 + arg2 < 0 || arg1 + arg3 < 0 || arg0 >= Statics.field3871 || arg1 >= Statics.field3872) {
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
        if (arg0 + arg2 > Statics.field3871) {
            arg2 = Statics.field3871 - arg0;
        }
        if (arg1 + arg3 > Statics.field3872) {
            arg3 = Statics.field3872 - arg1;
        }
        int var11 = arg6.length / arg7;
        int var12 = Statics.field3871 - arg2;
        int var13 = arg4 >>> 24;
        int var14 = arg5 >>> 24;
        if (!arg8 || var13 == 255 && var14 == 255) {
            int var25 = (arg1 + var10) * Statics.field3871 + arg0 + var9;
            for (int var26 = arg1 + var10; var26 < arg1 + var10 + arg3; var26++) {
                for (int var27 = arg0 + var9; var27 < arg0 + var9 + arg2; var27++) {
                    int var28 = (var26 - arg1) % var11;
                    int var29 = (var27 - arg0) % arg7;
                    if (arg6[arg7 * var28 + var29] == 0) {
                        Statics.field3870[var25++] = arg4;
                    } else {
                        Statics.field3870[var25++] = arg5;
                    }
                }
                var25 += var12;
            }
            return;
        }
        int var15 = (arg1 + var10) * Statics.field3871 + arg0 + var9;
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
                int var23 = Statics.field3870[var15];
                int var24 = ((var20 & 0xFF00FF) * var21 + (var23 & 0xFF00FF) * var22 & 0xFF00FF00) + ((var20 & 0xFF00) * var21 + (var23 & 0xFF00) * var22 & 0xFF0000) >> 8;
                Statics.field3870[var15++] = var24;
            }
            var15 += var12;
        }
    }

    @ObfuscatedName("ld.dq(IIIII)V")
    public static void method5690(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method5724(arg0, arg1, arg2, arg4);
        method5724(arg0, arg1 + arg3 - 1, arg2, arg4);
        method5694(arg0, arg1, arg3, arg4);
        method5694(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("ld.dy(IIIIII)V")
    public static void method5726(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method5693(arg0, arg1, arg2, arg4, arg5);
        method5693(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method5728(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method5728(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("ld.du(IIII)V")
    public static void method5724(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field3873 || arg1 >= field3874) {
            return;
        }
        if (arg0 < field3875) {
            arg2 -= field3875 - arg0;
            arg0 = field3875;
        }
        if (arg0 + arg2 > field3876) {
            arg2 = field3876 - arg0;
        }
        int var4 = Statics.field3871 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field3870[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("ld.dj(IIIII)V")
    public static void method5693(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field3873 || arg1 >= field3874) {
            return;
        }
        if (arg0 < field3875) {
            arg2 -= field3875 - arg0;
            arg0 = field3875;
        }
        if (arg0 + arg2 > field3876) {
            arg2 = field3876 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field3871 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field3870[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field3870[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field3870[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field3870[var9++] = var14;
        }
    }

    @ObfuscatedName("ld.ek(IIII)V")
    public static void method5694(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field3875 || arg0 >= field3876) {
            return;
        }
        if (arg1 < field3873) {
            arg2 -= field3873 - arg1;
            arg1 = field3873;
        }
        if (arg1 + arg2 > field3874) {
            arg2 = field3874 - arg1;
        }
        int var4 = Statics.field3871 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field3870[Statics.field3871 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("ld.ej(IIIII)V")
    public static void method5728(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3875 || arg0 >= field3876) {
            return;
        }
        if (arg1 < field3873) {
            arg2 -= field3873 - arg1;
            arg1 = field3873;
        }
        if (arg1 + arg2 > field3874) {
            arg2 = field3874 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field3871 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field3870[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field3870[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field3870[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field3870[var9] = var14;
            var9 += Statics.field3871;
        }
    }

    @ObfuscatedName("ld.eu(IIIII)V")
    public static void method5675(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method5724(arg0, arg1, var5 + 1, arg4);
            } else {
                method5724(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field3875) {
                    var8 += (field3875 - arg0) * var10;
                    arg0 = field3875;
                }
                if (var11 >= field3876) {
                    var11 = field3876 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field3873 && var12 < field3874) {
                        Statics.field3870[Statics.field3871 * var12 + arg0] = arg4;
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
                if (arg1 < field3873) {
                    var14 += (field3873 - arg1) * var16;
                    arg1 = field3873;
                }
                if (var17 >= field3874) {
                    var17 = field3874 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field3875 && var18 < field3876) {
                        Statics.field3870[Statics.field3871 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method5694(arg0, arg1, var6 + 1, arg4);
        } else {
            method5694(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("ld.eo(III)V")
    public static void method5697(int arg0, int arg1, int arg2) {
        if (arg0 >= field3875 && arg1 >= field3873 && arg0 < field3876 && arg1 < field3874) {
            Statics.field3870[Statics.field3871 * arg1 + arg0] = arg2;
        }
    }

    @ObfuscatedName("ld.es(III[I[I)V")
    public static void method5676(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field3871 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field3870[var7++] = arg2;
            }
            var5 += Statics.field3871;
        }
    }
}
