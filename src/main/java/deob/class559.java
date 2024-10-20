package deob;

@ObfuscatedName("vx")
public class class559 extends class502 {

    @ObfuscatedName("vx.bj")
    public static int field5449 = 0;

    @ObfuscatedName("vx.bc")
    public static int field5454 = 0;

    @ObfuscatedName("vx.bo")
    public static int field5447 = 0;

    @ObfuscatedName("vx.bm")
    public static int field5455 = 0;

    @ObfuscatedName("vx.eq([III[F)V")
    public static void method9114(int[] arg0, int arg1, int arg2, float[] arg3) {
        Statics.field5453 = arg0;
        Statics.field5448 = arg1;
        Statics.field5452 = arg2;
        Statics.field5450 = arg3;
        method9119(0, 0, arg1, arg2);
    }

    @ObfuscatedName("vx.ei()V")
    public static void method9184() {
        field5447 = 0;
        field5449 = 0;
        field5455 = Statics.field5448;
        field5454 = Statics.field5452;
    }

    @ObfuscatedName("vx.ex(IIII)V")
    public static void method9119(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field5448) {
            arg2 = Statics.field5448;
        }
        if (arg3 > Statics.field5452) {
            arg3 = Statics.field5452;
        }
        field5447 = arg0;
        field5449 = arg1;
        field5455 = arg2;
        field5454 = arg3;
    }

    @ObfuscatedName("vx.el(IIII)V")
    public static void method9123(int arg0, int arg1, int arg2, int arg3) {
        if (field5447 < arg0) {
            field5447 = arg0;
        }
        if (field5449 < arg1) {
            field5449 = arg1;
        }
        if (field5455 > arg2) {
            field5455 = arg2;
        }
        if (field5454 > arg3) {
            field5454 = arg3;
        }
    }

    @ObfuscatedName("vx.ee([I)V")
    public static void method9143(int[] arg0) {
        arg0[0] = field5447;
        arg0[1] = field5449;
        arg0[2] = field5455;
        arg0[3] = field5454;
    }

    @ObfuscatedName("vx.ev([I)V")
    public static void method9178(int[] arg0) {
        field5447 = arg0[0];
        field5449 = arg0[1];
        field5455 = arg0[2];
        field5454 = arg0[3];
    }

    @ObfuscatedName("vx.ej()V")
    public static void method9196() {
        int var0 = 0;
        int var1 = Statics.field5452 * Statics.field5448 - 7;
        while (var0 < var1) {
            Statics.field5453[var0++] = 0;
            Statics.field5453[var0++] = 0;
            Statics.field5453[var0++] = 0;
            Statics.field5453[var0++] = 0;
            Statics.field5453[var0++] = 0;
            Statics.field5453[var0++] = 0;
            Statics.field5453[var0++] = 0;
            Statics.field5453[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field5453[var0++] = 0;
        }
        method9136();
    }

    @ObfuscatedName("vx.ez(IIII)V")
    public static void method9120(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method9134(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field5449) {
            var4 = field5449;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field5454) {
            var5 = field5454;
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
            if (var12 < field5447) {
                var12 = field5447;
            }
            int var13 = arg0 + var8;
            if (var13 > field5455) {
                var13 = field5455;
            }
            int var14 = Statics.field5448 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                Statics.field5453[var14++] = arg3;
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
            if (var21 < field5447) {
                var21 = field5447;
            }
            int var22 = arg0 + var16;
            if (var22 > field5455 - 1) {
                var22 = field5455 - 1;
            }
            int var23 = Statics.field5448 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                Statics.field5453[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @ObfuscatedName("vx.es(IIIII)V")
    public static void method9146(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method9120(arg0, arg1, arg2, arg3);
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
        if (var9 < field5449) {
            var9 = field5449;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field5454) {
            var10 = field5454;
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
            if (var17 < field5447) {
                var17 = field5447;
            }
            int var18 = arg0 + var13;
            if (var18 > field5455) {
                var18 = field5455;
            }
            int var19 = Statics.field5448 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (Statics.field5453[var19] >> 16 & 0xFF) * var5;
                int var22 = (Statics.field5453[var19] >> 8 & 0xFF) * var5;
                int var23 = (Statics.field5453[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                Statics.field5453[var19++] = var24;
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
            if (var30 < field5447) {
                var30 = field5447;
            }
            int var31 = arg0 + var25;
            if (var31 > field5455 - 1) {
                var31 = field5455 - 1;
            }
            int var32 = Statics.field5448 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (Statics.field5453[var32] >> 16 & 0xFF) * var5;
                int var35 = (Statics.field5453[var32] >> 8 & 0xFF) * var5;
                int var36 = (Statics.field5453[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                Statics.field5453[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @ObfuscatedName("vx.ey(IIIIII)V")
    public static void method9122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field5447) {
            arg2 -= field5447 - arg0;
            arg0 = field5447;
        }
        if (arg1 < field5449) {
            arg3 -= field5449 - arg1;
            arg1 = field5449;
        }
        if (arg0 + arg2 > field5455) {
            arg2 = field5455 - arg0;
        }
        if (arg1 + arg3 > field5454) {
            arg3 = field5454 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field5448 - arg2;
        int var9 = Statics.field5448 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field5453[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field5453[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("vx.ew(IIIII)V")
    public static void method9145(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field5447) {
            arg2 -= field5447 - arg0;
            arg0 = field5447;
        }
        if (arg1 < field5449) {
            arg3 -= field5449 - arg1;
            arg1 = field5449;
        }
        if (arg0 + arg2 > field5455) {
            arg2 = field5455 - arg0;
        }
        if (arg1 + arg3 > field5454) {
            arg3 = field5454 - arg1;
        }
        int var5 = Statics.field5448 - arg2;
        int var6 = Statics.field5448 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field5453[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("vx.eu(IIIIII)V")
    public static void method9124(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field5447) {
            arg2 -= field5447 - arg0;
            arg0 = field5447;
        }
        if (arg1 < field5449) {
            var6 += (field5449 - arg1) * var7;
            arg3 -= field5449 - arg1;
            arg1 = field5449;
        }
        if (arg0 + arg2 > field5455) {
            arg2 = field5455 - arg0;
        }
        if (arg1 + arg3 > field5454) {
            arg3 = field5454 - arg1;
        }
        int var8 = Statics.field5448 - arg2;
        int var9 = Statics.field5448 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field5453[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("vx.ef(IIIIIIII)V")
    public static void method9117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        int var8 = 0;
        int var9 = 65536 / arg3;
        if (arg0 < field5447) {
            arg2 -= field5447 - arg0;
            arg0 = field5447;
        }
        if (arg1 < field5449) {
            var8 += (field5449 - arg1) * var9;
            arg3 -= field5449 - arg1;
            arg1 = field5449;
        }
        if (arg0 + arg2 > field5455) {
            arg2 = field5455 - arg0;
        }
        if (arg1 + arg3 > field5454) {
            arg3 = field5454 - arg1;
        }
        int var10 = Statics.field5448 - arg2;
        int var11 = Statics.field5448 * arg1 + arg0;
        for (int var12 = -arg3; var12 < 0; var12++) {
            int var13 = 65536 - var8 >> 8;
            int var14 = var8 >> 8;
            int var15 = (arg6 * var13 + arg7 * var14 & 0xFF00) >>> 8;
            if (var15 == 0) {
                var11 += Statics.field5448;
                var8 += var9;
            } else {
                int var16 = ((arg4 & 0xFF00FF) * var13 + (arg5 & 0xFF00FF) * var14 & 0xFF00FF00) + ((arg4 & 0xFF00) * var13 + (arg5 & 0xFF00) * var14 & 0xFF0000) >>> 8;
                int var17 = 255 - var15;
                int var18 = ((var16 & 0xFF00FF) * var15 >> 8 & 0xFF00FF) + ((var16 & 0xFF00) * var15 >> 8 & 0xFF00);
                for (int var19 = -arg2; var19 < 0; var19++) {
                    int var20 = Statics.field5453[var11];
                    if (var20 == 0) {
                        Statics.field5453[var11++] = var18;
                    } else {
                        int var21 = ((var20 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var20 & 0xFF00) * var17 >> 8 & 0xFF00);
                        Statics.field5453[var11++] = var18 + var21;
                    }
                }
                var11 += var10;
                var8 += var9;
            }
        }
    }

    @ObfuscatedName("vx.ea(IIIIII[BIZ)V")
    public static void method9118(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        if (arg0 + arg2 < 0 || arg1 + arg3 < 0 || arg0 >= Statics.field5448 || arg1 >= Statics.field5452) {
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
        if (arg0 + arg2 > Statics.field5448) {
            arg2 = Statics.field5448 - arg0;
        }
        if (arg1 + arg3 > Statics.field5452) {
            arg3 = Statics.field5452 - arg1;
        }
        int var11 = arg6.length / arg7;
        int var12 = Statics.field5448 - arg2;
        int var13 = arg4 >>> 24;
        int var14 = arg5 >>> 24;
        if (!arg8 || var13 == 255 && var14 == 255) {
            int var25 = (arg1 + var10) * Statics.field5448 + arg0 + var9;
            for (int var26 = arg1 + var10; var26 < arg1 + var10 + arg3; var26++) {
                for (int var27 = arg0 + var9; var27 < arg0 + var9 + arg2; var27++) {
                    int var28 = (var26 - arg1) % var11;
                    int var29 = (var27 - arg0) % arg7;
                    if (arg6[arg7 * var28 + var29] == 0) {
                        Statics.field5453[var25++] = arg4;
                    } else {
                        Statics.field5453[var25++] = arg5;
                    }
                }
                var25 += var12;
            }
            return;
        }
        int var15 = (arg1 + var10) * Statics.field5448 + arg0 + var9;
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
                int var23 = Statics.field5453[var15];
                int var24 = ((var20 & 0xFF00FF) * var21 + (var23 & 0xFF00FF) * var22 & 0xFF00FF00) + ((var20 & 0xFF00) * var21 + (var23 & 0xFF00) * var22 & 0xFF0000) >> 8;
                Statics.field5453[var15++] = var24;
            }
            var15 += var12;
        }
    }

    @ObfuscatedName("vx.ec(IIIII)V")
    public static void method9127(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method9129(arg0, arg1, arg2, arg4);
        method9129(arg0, arg1 + arg3 - 1, arg2, arg4);
        method9131(arg0, arg1, arg3, arg4);
        method9131(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("vx.eg(IIIIII)V")
    public static void method9141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method9130(arg0, arg1, arg2, arg4, arg5);
        method9130(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method9132(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method9132(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("vx.fn(IIII)V")
    public static void method9129(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field5449 || arg1 >= field5454) {
            return;
        }
        if (arg0 < field5447) {
            arg2 -= field5447 - arg0;
            arg0 = field5447;
        }
        if (arg0 + arg2 > field5455) {
            arg2 = field5455 - arg0;
        }
        int var4 = Statics.field5448 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field5453[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("vx.fm(IIIII)V")
    public static void method9130(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field5449 || arg1 >= field5454) {
            return;
        }
        if (arg0 < field5447) {
            arg2 -= field5447 - arg0;
            arg0 = field5447;
        }
        if (arg0 + arg2 > field5455) {
            arg2 = field5455 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field5448 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field5453[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field5453[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field5453[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field5453[var9++] = var14;
        }
    }

    @ObfuscatedName("vx.fk(IIII)V")
    public static void method9131(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field5447 || arg0 >= field5455) {
            return;
        }
        if (arg1 < field5449) {
            arg2 -= field5449 - arg1;
            arg1 = field5449;
        }
        if (arg1 + arg2 > field5454) {
            arg2 = field5454 - arg1;
        }
        int var4 = Statics.field5448 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field5453[Statics.field5448 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("vx.fg(IIIII)V")
    public static void method9132(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field5447 || arg0 >= field5455) {
            return;
        }
        if (arg1 < field5449) {
            arg2 -= field5449 - arg1;
            arg1 = field5449;
        }
        if (arg1 + arg2 > field5454) {
            arg2 = field5454 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field5448 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field5453[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field5453[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field5453[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field5453[var9] = var14;
            var9 += Statics.field5448;
        }
    }

    @ObfuscatedName("vx.fb(IIIII)V")
    public static void method9133(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method9129(arg0, arg1, var5 + 1, arg4);
            } else {
                method9129(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field5447) {
                    var8 += (field5447 - arg0) * var10;
                    arg0 = field5447;
                }
                if (var11 >= field5455) {
                    var11 = field5455 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field5449 && var12 < field5454) {
                        Statics.field5453[Statics.field5448 * var12 + arg0] = arg4;
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
                if (arg1 < field5449) {
                    var14 += (field5449 - arg1) * var16;
                    arg1 = field5449;
                }
                if (var17 >= field5454) {
                    var17 = field5454 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field5447 && var18 < field5455) {
                        Statics.field5453[Statics.field5448 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method9131(arg0, arg1, var6 + 1, arg4);
        } else {
            method9131(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("vx.ff(III)V")
    public static void method9134(int arg0, int arg1, int arg2) {
        if (arg0 >= field5447 && arg1 >= field5449 && arg0 < field5455 && arg1 < field5454) {
            Statics.field5453[Statics.field5448 * arg1 + arg0] = arg2;
        }
    }

    @ObfuscatedName("vx.fe(III[I[I)V")
    public static void method9135(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field5448 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field5453[var7++] = arg2;
            }
            var5 += Statics.field5448;
        }
    }

    @ObfuscatedName("vx.fi()V")
    public static void method9136() {
        if (Statics.field5450 == null) {
            return;
        }
        if (field5447 == 0 && Statics.field5448 == field5455 && field5449 == 0 && Statics.field5452 == field5454) {
            int var0 = Statics.field5450.length;
            int var1 = var0 - (var0 & 0x7);
            int var2 = 0;
            while (var2 < var1) {
                Statics.field5450[var2++] = 0.0F;
                Statics.field5450[var2++] = 0.0F;
                Statics.field5450[var2++] = 0.0F;
                Statics.field5450[var2++] = 0.0F;
                Statics.field5450[var2++] = 0.0F;
                Statics.field5450[var2++] = 0.0F;
                Statics.field5450[var2++] = 0.0F;
                Statics.field5450[var2++] = 0.0F;
            }
            while (var2 < var0) {
                Statics.field5450[var2++] = 0.0F;
            }
            return;
        }
        int var3 = field5455 - field5447;
        int var4 = field5454 - field5449;
        int var5 = Statics.field5448 - var3;
        int var6 = Statics.field5448 * field5449 + field5447;
        int var7 = var3 >> 3;
        int var8 = var3 & 0x7;
        int var9 = var6 - 1;
        for (int var10 = -var4; var10 < 0; var10++) {
            if (var7 > 0) {
                int var11 = var7;
                do {
                    var9++;
                    Statics.field5450[var9] = 0.0F;
                    var9++;
                    Statics.field5450[var9] = 0.0F;
                    var9++;
                    Statics.field5450[var9] = 0.0F;
                    var9++;
                    Statics.field5450[var9] = 0.0F;
                    var9++;
                    Statics.field5450[var9] = 0.0F;
                    var9++;
                    Statics.field5450[var9] = 0.0F;
                    var9++;
                    Statics.field5450[var9] = 0.0F;
                    var9++;
                    Statics.field5450[var9] = 0.0F;
                    var11--;
                } while (var11 > 0);
            }
            if (var8 > 0) {
                int var12 = var8;
                do {
                    var9++;
                    Statics.field5450[var9] = 0.0F;
                    var12--;
                } while (var12 > 0);
            }
            var9 += var5;
        }
    }

    @ObfuscatedName("vx.fo()V")
    public static void method9137() {
        if (Statics.field5450 == null) {
            return;
        }
        int var0 = Statics.field5450.length;
        for (int var1 = 0; var1 < var0; var1++) {
            if (var1 % Statics.field5448 < Statics.field5448 / 2 && Statics.field5450[var1] > 0.0F) {
                int var2 = (int) (255.0F * class196.method7520(Statics.field5450[var1]));
                Statics.field5453[var1] = var2 << 16 | var2 << 8 | var2;
            }
        }
    }
}
