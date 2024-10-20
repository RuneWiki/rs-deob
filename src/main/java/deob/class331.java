package deob;

@ObfuscatedName("lv")
public class class331 extends class185 {

    @ObfuscatedName("lv.an")
    public static int field3881 = 0;

    @ObfuscatedName("lv.am")
    public static int field3878 = 0;

    @ObfuscatedName("lv.ap")
    public static int field3883 = 0;

    @ObfuscatedName("lv.au")
    public static int field3884 = 0;

    @ObfuscatedName("lv.cs([III)V")
    public static void method5651(int[] arg0, int arg1, int arg2) {
        Statics.field3882 = arg0;
        Statics.field3879 = arg1;
        Statics.field3880 = arg2;
        method5653(0, 0, arg1, arg2);
    }

    @ObfuscatedName("lv.ck()V")
    public static void method5678() {
        field3883 = 0;
        field3881 = 0;
        field3884 = Statics.field3879;
        field3878 = Statics.field3880;
    }

    @ObfuscatedName("lv.co(IIII)V")
    public static void method5653(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field3879) {
            arg2 = Statics.field3879;
        }
        if (arg3 > Statics.field3880) {
            arg3 = Statics.field3880;
        }
        field3883 = arg0;
        field3881 = arg1;
        field3884 = arg2;
        field3878 = arg3;
    }

    @ObfuscatedName("lv.cz(IIII)V")
    public static void method5654(int arg0, int arg1, int arg2, int arg3) {
        if (field3883 < arg0) {
            field3883 = arg0;
        }
        if (field3881 < arg1) {
            field3881 = arg1;
        }
        if (field3884 > arg2) {
            field3884 = arg2;
        }
        if (field3878 > arg3) {
            field3878 = arg3;
        }
    }

    @ObfuscatedName("lv.cy([I)V")
    public static void method5685(int[] arg0) {
        arg0[0] = field3883;
        arg0[1] = field3881;
        arg0[2] = field3884;
        arg0[3] = field3878;
    }

    @ObfuscatedName("lv.cb([I)V")
    public static void method5656(int[] arg0) {
        field3883 = arg0[0];
        field3881 = arg0[1];
        field3884 = arg0[2];
        field3878 = arg0[3];
    }

    @ObfuscatedName("lv.cl()V")
    public static void method5657() {
        int var0 = 0;
        int var1 = Statics.field3880 * Statics.field3879 - 7;
        while (var0 < var1) {
            Statics.field3882[var0++] = 0;
            Statics.field3882[var0++] = 0;
            Statics.field3882[var0++] = 0;
            Statics.field3882[var0++] = 0;
            Statics.field3882[var0++] = 0;
            Statics.field3882[var0++] = 0;
            Statics.field3882[var0++] = 0;
            Statics.field3882[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field3882[var0++] = 0;
        }
    }

    @ObfuscatedName("lv.dx(IIII)V")
    public static void method5700(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method5672(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field3881) {
            var4 = field3881;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field3878) {
            var5 = field3878;
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
            if (var12 < field3883) {
                var12 = field3883;
            }
            int var13 = arg0 + var8;
            if (var13 > field3884) {
                var13 = field3884;
            }
            int var14 = Statics.field3879 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                Statics.field3882[var14++] = arg3;
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
            if (var21 < field3883) {
                var21 = field3883;
            }
            int var22 = arg0 + var16;
            if (var22 > field3884 - 1) {
                var22 = field3884 - 1;
            }
            int var23 = Statics.field3879 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                Statics.field3882[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @ObfuscatedName("lv.dh(IIIII)V")
    public static void method5659(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method5700(arg0, arg1, arg2, arg3);
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
        if (var9 < field3881) {
            var9 = field3881;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field3878) {
            var10 = field3878;
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
            if (var17 < field3883) {
                var17 = field3883;
            }
            int var18 = arg0 + var13;
            if (var18 > field3884) {
                var18 = field3884;
            }
            int var19 = Statics.field3879 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (Statics.field3882[var19] >> 16 & 0xFF) * var5;
                int var22 = (Statics.field3882[var19] >> 8 & 0xFF) * var5;
                int var23 = (Statics.field3882[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                Statics.field3882[var19++] = var24;
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
            if (var30 < field3883) {
                var30 = field3883;
            }
            int var31 = arg0 + var25;
            if (var31 > field3884 - 1) {
                var31 = field3884 - 1;
            }
            int var32 = Statics.field3879 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (Statics.field3882[var32] >> 16 & 0xFF) * var5;
                int var35 = (Statics.field3882[var32] >> 8 & 0xFF) * var5;
                int var36 = (Statics.field3882[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                Statics.field3882[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @ObfuscatedName("lv.dd(IIIIII)V")
    public static void method5660(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field3883) {
            arg2 -= field3883 - arg0;
            arg0 = field3883;
        }
        if (arg1 < field3881) {
            arg3 -= field3881 - arg1;
            arg1 = field3881;
        }
        if (arg0 + arg2 > field3884) {
            arg2 = field3884 - arg0;
        }
        if (arg1 + arg3 > field3878) {
            arg3 = field3878 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field3879 - arg2;
        int var9 = Statics.field3879 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field3882[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field3882[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("lv.db(IIIII)V")
    public static void method5661(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3883) {
            arg2 -= field3883 - arg0;
            arg0 = field3883;
        }
        if (arg1 < field3881) {
            arg3 -= field3881 - arg1;
            arg1 = field3881;
        }
        if (arg0 + arg2 > field3884) {
            arg2 = field3884 - arg0;
        }
        if (arg1 + arg3 > field3878) {
            arg3 = field3878 - arg1;
        }
        int var5 = Statics.field3879 - arg2;
        int var6 = Statics.field3879 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field3882[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("lv.dj(IIIIII)V")
    public static void method5719(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field3883) {
            arg2 -= field3883 - arg0;
            arg0 = field3883;
        }
        if (arg1 < field3881) {
            var6 += (field3881 - arg1) * var7;
            arg3 -= field3881 - arg1;
            arg1 = field3881;
        }
        if (arg0 + arg2 > field3884) {
            arg2 = field3884 - arg0;
        }
        if (arg1 + arg3 > field3878) {
            arg3 = field3878 - arg1;
        }
        int var8 = Statics.field3879 - arg2;
        int var9 = Statics.field3879 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field3882[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("lv.dk(IIIIIIII)V")
    public static void method5663(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        int var8 = 0;
        int var9 = 65536 / arg3;
        if (arg0 < field3883) {
            arg2 -= field3883 - arg0;
            arg0 = field3883;
        }
        if (arg1 < field3881) {
            var8 += (field3881 - arg1) * var9;
            arg3 -= field3881 - arg1;
            arg1 = field3881;
        }
        if (arg0 + arg2 > field3884) {
            arg2 = field3884 - arg0;
        }
        if (arg1 + arg3 > field3878) {
            arg3 = field3878 - arg1;
        }
        int var10 = Statics.field3879 - arg2;
        int var11 = Statics.field3879 * arg1 + arg0;
        for (int var12 = -arg3; var12 < 0; var12++) {
            int var13 = 65536 - var8 >> 8;
            int var14 = var8 >> 8;
            int var15 = (arg6 * var13 + arg7 * var14 & 0xFF00) >>> 8;
            if (var15 == 0) {
                var11 += Statics.field3879;
                var8 += var9;
            } else {
                int var16 = ((arg4 & 0xFF00FF) * var13 + (arg5 & 0xFF00FF) * var14 & 0xFF00FF00) + ((arg4 & 0xFF00) * var13 + (arg5 & 0xFF00) * var14 & 0xFF0000) >>> 8;
                int var17 = 255 - var15;
                int var18 = ((var16 & 0xFF00FF) * var15 >> 8 & 0xFF00FF) + ((var16 & 0xFF00) * var15 >> 8 & 0xFF00);
                for (int var19 = -arg2; var19 < 0; var19++) {
                    int var20 = Statics.field3882[var11];
                    if (var20 == 0) {
                        Statics.field3882[var11++] = var18;
                    } else {
                        int var21 = ((var20 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var20 & 0xFF00) * var17 >> 8 & 0xFF00);
                        Statics.field3882[var11++] = var18 + var21;
                    }
                }
                var11 += var10;
                var8 += var9;
            }
        }
    }

    @ObfuscatedName("lv.de(IIIIII[BIZ)V")
    public static void method5664(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        if (arg0 + arg2 < 0 || arg1 + arg3 < 0 || arg0 >= Statics.field3879 || arg1 >= Statics.field3880) {
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
        if (arg0 + arg2 > Statics.field3879) {
            arg2 = Statics.field3879 - arg0;
        }
        if (arg1 + arg3 > Statics.field3880) {
            arg3 = Statics.field3880 - arg1;
        }
        int var11 = arg6.length / arg7;
        int var12 = Statics.field3879 - arg2;
        int var13 = arg4 >>> 24;
        int var14 = arg5 >>> 24;
        if (!arg8 || var13 == 255 && var14 == 255) {
            int var25 = (arg1 + var10) * Statics.field3879 + arg0 + var9;
            for (int var26 = arg1 + var10; var26 < arg1 + var10 + arg3; var26++) {
                for (int var27 = arg0 + var9; var27 < arg0 + var9 + arg2; var27++) {
                    int var28 = (var26 - arg1) % var11;
                    int var29 = (var27 - arg0) % arg7;
                    if (arg6[arg7 * var28 + var29] == 0) {
                        Statics.field3882[var25++] = arg4;
                    } else {
                        Statics.field3882[var25++] = arg5;
                    }
                }
                var25 += var12;
            }
            return;
        }
        int var15 = (arg1 + var10) * Statics.field3879 + arg0 + var9;
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
                int var23 = Statics.field3882[var15];
                int var24 = ((var20 & 0xFF00FF) * var21 + (var23 & 0xFF00FF) * var22 & 0xFF00FF00) + ((var20 & 0xFF00) * var21 + (var23 & 0xFF00) * var22 & 0xFF0000) >> 8;
                Statics.field3882[var15++] = var24;
            }
            var15 += var12;
        }
    }

    @ObfuscatedName("lv.da(IIIII)V")
    public static void method5665(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method5686(arg0, arg1, arg2, arg4);
        method5686(arg0, arg1 + arg3 - 1, arg2, arg4);
        method5669(arg0, arg1, arg3, arg4);
        method5669(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("lv.dr(IIIIII)V")
    public static void method5666(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method5722(arg0, arg1, arg2, arg4, arg5);
        method5722(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method5670(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method5670(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("lv.dw(IIII)V")
    public static void method5686(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field3881 || arg1 >= field3878) {
            return;
        }
        if (arg0 < field3883) {
            arg2 -= field3883 - arg0;
            arg0 = field3883;
        }
        if (arg0 + arg2 > field3884) {
            arg2 = field3884 - arg0;
        }
        int var4 = Statics.field3879 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field3882[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("lv.dy(IIIII)V")
    public static void method5722(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field3881 || arg1 >= field3878) {
            return;
        }
        if (arg0 < field3883) {
            arg2 -= field3883 - arg0;
            arg0 = field3883;
        }
        if (arg0 + arg2 > field3884) {
            arg2 = field3884 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field3879 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field3882[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field3882[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field3882[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field3882[var9++] = var14;
        }
    }

    @ObfuscatedName("lv.ds(IIII)V")
    public static void method5669(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field3883 || arg0 >= field3884) {
            return;
        }
        if (arg1 < field3881) {
            arg2 -= field3881 - arg1;
            arg1 = field3881;
        }
        if (arg1 + arg2 > field3878) {
            arg2 = field3878 - arg1;
        }
        int var4 = Statics.field3879 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field3882[Statics.field3879 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("lv.dl(IIIII)V")
    public static void method5670(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3883 || arg0 >= field3884) {
            return;
        }
        if (arg1 < field3881) {
            arg2 -= field3881 - arg1;
            arg1 = field3881;
        }
        if (arg1 + arg2 > field3878) {
            arg2 = field3878 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field3879 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field3882[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field3882[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field3882[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field3882[var9] = var14;
            var9 += Statics.field3879;
        }
    }

    @ObfuscatedName("lv.di(IIIII)V")
    public static void method5671(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method5686(arg0, arg1, var5 + 1, arg4);
            } else {
                method5686(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field3883) {
                    var8 += (field3883 - arg0) * var10;
                    arg0 = field3883;
                }
                if (var11 >= field3884) {
                    var11 = field3884 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field3881 && var12 < field3878) {
                        Statics.field3882[Statics.field3879 * var12 + arg0] = arg4;
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
                if (arg1 < field3881) {
                    var14 += (field3881 - arg1) * var16;
                    arg1 = field3881;
                }
                if (var17 >= field3878) {
                    var17 = field3878 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field3883 && var18 < field3884) {
                        Statics.field3882[Statics.field3879 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method5669(arg0, arg1, var6 + 1, arg4);
        } else {
            method5669(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("lv.do(III)V")
    public static void method5672(int arg0, int arg1, int arg2) {
        if (arg0 >= field3883 && arg1 >= field3881 && arg0 < field3884 && arg1 < field3878) {
            Statics.field3882[Statics.field3879 * arg1 + arg0] = arg2;
        }
    }

    @ObfuscatedName("lv.df(III[I[I)V")
    public static void method5673(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field3879 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field3882[var7++] = arg2;
            }
            var5 += Statics.field3879;
        }
    }
}
