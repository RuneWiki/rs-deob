package deob;

@ObfuscatedName("vr")
public class class561 extends class504 {

    @ObfuscatedName("vr.bd")
    public static int field5482 = 0;

    @ObfuscatedName("vr.bx")
    public static int field5488 = 0;

    @ObfuscatedName("vr.bf")
    public static int field5486 = 0;

    @ObfuscatedName("vr.bm")
    public static int field5487 = 0;

    @ObfuscatedName("vr.ej([III[F)V")
    public static void method9344(int[] arg0, int arg1, int arg2, float[] arg3) {
        Statics.field5489 = arg0;
        Statics.field5483 = arg1;
        Statics.field5484 = arg2;
        Statics.field5485 = arg3;
        method9294(0, 0, arg1, arg2);
    }

    @ObfuscatedName("vr.ec()V")
    public static void method9355() {
        field5486 = 0;
        field5482 = 0;
        field5487 = Statics.field5483;
        field5488 = Statics.field5484;
    }

    @ObfuscatedName("vr.et(IIII)V")
    public static void method9294(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field5483) {
            arg2 = Statics.field5483;
        }
        if (arg3 > Statics.field5484) {
            arg3 = Statics.field5484;
        }
        field5486 = arg0;
        field5482 = arg1;
        field5487 = arg2;
        field5488 = arg3;
    }

    @ObfuscatedName("vr.fv(IIII)V")
    public static void method9295(int arg0, int arg1, int arg2, int arg3) {
        if (field5486 < arg0) {
            field5486 = arg0;
        }
        if (field5482 < arg1) {
            field5482 = arg1;
        }
        if (field5487 > arg2) {
            field5487 = arg2;
        }
        if (field5488 > arg3) {
            field5488 = arg3;
        }
    }

    @ObfuscatedName("vr.ff([I)V")
    public static void method9296(int[] arg0) {
        arg0[0] = field5486;
        arg0[1] = field5482;
        arg0[2] = field5487;
        arg0[3] = field5488;
    }

    @ObfuscatedName("vr.fe([I)V")
    public static void method9293(int[] arg0) {
        field5486 = arg0[0];
        field5482 = arg0[1];
        field5487 = arg0[2];
        field5488 = arg0[3];
    }

    @ObfuscatedName("vr.ft()V")
    public static void method9298() {
        int var0 = 0;
        int var1 = Statics.field5484 * Statics.field5483 - 7;
        while (var0 < var1) {
            Statics.field5489[var0++] = 0;
            Statics.field5489[var0++] = 0;
            Statics.field5489[var0++] = 0;
            Statics.field5489[var0++] = 0;
            Statics.field5489[var0++] = 0;
            Statics.field5489[var0++] = 0;
            Statics.field5489[var0++] = 0;
            Statics.field5489[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field5489[var0++] = 0;
        }
        method9315();
    }

    @ObfuscatedName("vr.fb(IIII)V")
    public static void method9292(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method9317(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field5482) {
            var4 = field5482;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field5488) {
            var5 = field5488;
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
            if (var12 < field5486) {
                var12 = field5486;
            }
            int var13 = arg0 + var8;
            if (var13 > field5487) {
                var13 = field5487;
            }
            int var14 = Statics.field5483 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                Statics.field5489[var14++] = arg3;
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
            if (var21 < field5486) {
                var21 = field5486;
            }
            int var22 = arg0 + var16;
            if (var22 > field5487 - 1) {
                var22 = field5487 - 1;
            }
            int var23 = Statics.field5483 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                Statics.field5489[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @ObfuscatedName("vr.fk(IIIII)V")
    public static void method9372(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method9292(arg0, arg1, arg2, arg3);
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
        if (var9 < field5482) {
            var9 = field5482;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field5488) {
            var10 = field5488;
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
            if (var17 < field5486) {
                var17 = field5486;
            }
            int var18 = arg0 + var13;
            if (var18 > field5487) {
                var18 = field5487;
            }
            int var19 = Statics.field5483 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (Statics.field5489[var19] >> 16 & 0xFF) * var5;
                int var22 = (Statics.field5489[var19] >> 8 & 0xFF) * var5;
                int var23 = (Statics.field5489[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                Statics.field5489[var19++] = var24;
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
            if (var30 < field5486) {
                var30 = field5486;
            }
            int var31 = arg0 + var25;
            if (var31 > field5487 - 1) {
                var31 = field5487 - 1;
            }
            int var32 = Statics.field5483 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (Statics.field5489[var32] >> 16 & 0xFF) * var5;
                int var35 = (Statics.field5489[var32] >> 8 & 0xFF) * var5;
                int var36 = (Statics.field5489[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                Statics.field5489[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @ObfuscatedName("vr.fp(IIIIII)V")
    public static void method9301(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field5486) {
            arg2 -= field5486 - arg0;
            arg0 = field5486;
        }
        if (arg1 < field5482) {
            arg3 -= field5482 - arg1;
            arg1 = field5482;
        }
        if (arg0 + arg2 > field5487) {
            arg2 = field5487 - arg0;
        }
        if (arg1 + arg3 > field5488) {
            arg3 = field5488 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field5483 - arg2;
        int var9 = Statics.field5483 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field5489[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field5489[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("vr.fr(IIIII)V")
    public static void method9302(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field5486) {
            arg2 -= field5486 - arg0;
            arg0 = field5486;
        }
        if (arg1 < field5482) {
            arg3 -= field5482 - arg1;
            arg1 = field5482;
        }
        if (arg0 + arg2 > field5487) {
            arg2 = field5487 - arg0;
        }
        if (arg1 + arg3 > field5488) {
            arg3 = field5488 - arg1;
        }
        int var5 = Statics.field5483 - arg2;
        int var6 = Statics.field5483 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field5489[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("vr.fg(IIIIII)V")
    public static void method9303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field5486) {
            arg2 -= field5486 - arg0;
            arg0 = field5486;
        }
        if (arg1 < field5482) {
            var6 += (field5482 - arg1) * var7;
            arg3 -= field5482 - arg1;
            arg1 = field5482;
        }
        if (arg0 + arg2 > field5487) {
            arg2 = field5487 - arg0;
        }
        if (arg1 + arg3 > field5488) {
            arg3 = field5488 - arg1;
        }
        int var8 = Statics.field5483 - arg2;
        int var9 = Statics.field5483 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field5489[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("vr.fu(IIIIIIII)V")
    public static void method9304(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        int var8 = 0;
        int var9 = 65536 / arg3;
        if (arg0 < field5486) {
            arg2 -= field5486 - arg0;
            arg0 = field5486;
        }
        if (arg1 < field5482) {
            var8 += (field5482 - arg1) * var9;
            arg3 -= field5482 - arg1;
            arg1 = field5482;
        }
        if (arg0 + arg2 > field5487) {
            arg2 = field5487 - arg0;
        }
        if (arg1 + arg3 > field5488) {
            arg3 = field5488 - arg1;
        }
        int var10 = Statics.field5483 - arg2;
        int var11 = Statics.field5483 * arg1 + arg0;
        for (int var12 = -arg3; var12 < 0; var12++) {
            int var13 = 65536 - var8 >> 8;
            int var14 = var8 >> 8;
            int var15 = (arg6 * var13 + arg7 * var14 & 0xFF00) >>> 8;
            if (var15 == 0) {
                var11 += Statics.field5483;
                var8 += var9;
            } else {
                int var16 = ((arg4 & 0xFF00FF) * var13 + (arg5 & 0xFF00FF) * var14 & 0xFF00FF00) + ((arg4 & 0xFF00) * var13 + (arg5 & 0xFF00) * var14 & 0xFF0000) >>> 8;
                int var17 = 255 - var15;
                int var18 = ((var16 & 0xFF00FF) * var15 >> 8 & 0xFF00FF) + ((var16 & 0xFF00) * var15 >> 8 & 0xFF00);
                for (int var19 = -arg2; var19 < 0; var19++) {
                    int var20 = Statics.field5489[var11];
                    if (var20 == 0) {
                        Statics.field5489[var11++] = var18;
                    } else {
                        int var21 = ((var20 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var20 & 0xFF00) * var17 >> 8 & 0xFF00);
                        Statics.field5489[var11++] = var18 + var21;
                    }
                }
                var11 += var10;
                var8 += var9;
            }
        }
    }

    @ObfuscatedName("vr.fj(IIIIII[BIZ)V")
    public static void method9305(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        if (arg0 + arg2 < 0 || arg1 + arg3 < 0 || arg0 >= Statics.field5483 || arg1 >= Statics.field5484) {
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
        if (arg0 + arg2 > Statics.field5483) {
            arg2 = Statics.field5483 - arg0;
        }
        if (arg1 + arg3 > Statics.field5484) {
            arg3 = Statics.field5484 - arg1;
        }
        int var11 = arg6.length / arg7;
        int var12 = Statics.field5483 - arg2;
        int var13 = arg4 >>> 24;
        int var14 = arg5 >>> 24;
        if (!arg8 || var13 == 255 && var14 == 255) {
            int var25 = (arg1 + var10) * Statics.field5483 + arg0 + var9;
            for (int var26 = arg1 + var10; var26 < arg1 + var10 + arg3; var26++) {
                for (int var27 = arg0 + var9; var27 < arg0 + var9 + arg2; var27++) {
                    int var28 = (var26 - arg1) % var11;
                    int var29 = (var27 - arg0) % arg7;
                    if (arg6[arg7 * var28 + var29] == 0) {
                        Statics.field5489[var25++] = arg4;
                    } else {
                        Statics.field5489[var25++] = arg5;
                    }
                }
                var25 += var12;
            }
            return;
        }
        int var15 = (arg1 + var10) * Statics.field5483 + arg0 + var9;
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
                int var23 = Statics.field5489[var15];
                int var24 = ((var20 & 0xFF00FF) * var21 + (var23 & 0xFF00FF) * var22 & 0xFF00FF00) + ((var20 & 0xFF00) * var21 + (var23 & 0xFF00) * var22 & 0xFF0000) >> 8;
                Statics.field5489[var15++] = var24;
            }
            var15 += var12;
        }
    }

    @ObfuscatedName("vr.fs(IIIII)V")
    public static void method9306(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method9374(arg0, arg1, arg2, arg4);
        method9374(arg0, arg1 + arg3 - 1, arg2, arg4);
        method9310(arg0, arg1, arg3, arg4);
        method9310(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("vr.fq(IIIIII)V")
    public static void method9307(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method9309(arg0, arg1, arg2, arg4, arg5);
        method9309(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method9311(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method9311(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("vr.fn(IIII)V")
    public static void method9374(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field5482 || arg1 >= field5488) {
            return;
        }
        if (arg0 < field5486) {
            arg2 -= field5486 - arg0;
            arg0 = field5486;
        }
        if (arg0 + arg2 > field5487) {
            arg2 = field5487 - arg0;
        }
        int var4 = Statics.field5483 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field5489[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("vr.fh(IIIII)V")
    public static void method9309(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field5482 || arg1 >= field5488) {
            return;
        }
        if (arg0 < field5486) {
            arg2 -= field5486 - arg0;
            arg0 = field5486;
        }
        if (arg0 + arg2 > field5487) {
            arg2 = field5487 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field5483 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field5489[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field5489[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field5489[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field5489[var9++] = var14;
        }
    }

    @ObfuscatedName("vr.fo(IIII)V")
    public static void method9310(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field5486 || arg0 >= field5487) {
            return;
        }
        if (arg1 < field5482) {
            arg2 -= field5482 - arg1;
            arg1 = field5482;
        }
        if (arg1 + arg2 > field5488) {
            arg2 = field5488 - arg1;
        }
        int var4 = Statics.field5483 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field5489[Statics.field5483 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("vr.fw(IIIII)V")
    public static void method9311(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field5486 || arg0 >= field5487) {
            return;
        }
        if (arg1 < field5482) {
            arg2 -= field5482 - arg1;
            arg1 = field5482;
        }
        if (arg1 + arg2 > field5488) {
            arg2 = field5488 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field5483 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field5489[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field5489[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field5489[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field5489[var9] = var14;
            var9 += Statics.field5483;
        }
    }

    @ObfuscatedName("vr.fd(IIIII)V")
    public static void method9363(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method9374(arg0, arg1, var5 + 1, arg4);
            } else {
                method9374(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field5486) {
                    var8 += (field5486 - arg0) * var10;
                    arg0 = field5486;
                }
                if (var11 >= field5487) {
                    var11 = field5487 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field5482 && var12 < field5488) {
                        Statics.field5489[Statics.field5483 * var12 + arg0] = arg4;
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
                if (arg1 < field5482) {
                    var14 += (field5482 - arg1) * var16;
                    arg1 = field5482;
                }
                if (var17 >= field5488) {
                    var17 = field5488 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field5486 && var18 < field5487) {
                        Statics.field5489[Statics.field5483 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method9310(arg0, arg1, var6 + 1, arg4);
        } else {
            method9310(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("vr.fi(III)V")
    public static void method9317(int arg0, int arg1, int arg2) {
        if (arg0 >= field5486 && arg1 >= field5482 && arg0 < field5487 && arg1 < field5488) {
            Statics.field5489[Statics.field5483 * arg1 + arg0] = arg2;
        }
    }

    @ObfuscatedName("vr.fc(III[I[I)V")
    public static void method9314(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field5483 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field5489[var7++] = arg2;
            }
            var5 += Statics.field5483;
        }
    }

    @ObfuscatedName("vr.fm()V")
    public static void method9315() {
        if (Statics.field5485 == null) {
            return;
        }
        if (field5486 == 0 && Statics.field5483 == field5487 && field5482 == 0 && Statics.field5484 == field5488) {
            int var0 = Statics.field5485.length;
            int var1 = var0 - (var0 & 0x7);
            int var2 = 0;
            while (var2 < var1) {
                Statics.field5485[var2++] = 0.0F;
                Statics.field5485[var2++] = 0.0F;
                Statics.field5485[var2++] = 0.0F;
                Statics.field5485[var2++] = 0.0F;
                Statics.field5485[var2++] = 0.0F;
                Statics.field5485[var2++] = 0.0F;
                Statics.field5485[var2++] = 0.0F;
                Statics.field5485[var2++] = 0.0F;
            }
            while (var2 < var0) {
                Statics.field5485[var2++] = 0.0F;
            }
            return;
        }
        int var3 = field5487 - field5486;
        int var4 = field5488 - field5482;
        int var5 = Statics.field5483 - var3;
        int var6 = Statics.field5483 * field5482 + field5486;
        int var7 = var3 >> 3;
        int var8 = var3 & 0x7;
        int var9 = var6 - 1;
        for (int var10 = -var4; var10 < 0; var10++) {
            if (var7 > 0) {
                int var11 = var7;
                do {
                    var9++;
                    Statics.field5485[var9] = 0.0F;
                    var9++;
                    Statics.field5485[var9] = 0.0F;
                    var9++;
                    Statics.field5485[var9] = 0.0F;
                    var9++;
                    Statics.field5485[var9] = 0.0F;
                    var9++;
                    Statics.field5485[var9] = 0.0F;
                    var9++;
                    Statics.field5485[var9] = 0.0F;
                    var9++;
                    Statics.field5485[var9] = 0.0F;
                    var9++;
                    Statics.field5485[var9] = 0.0F;
                    var11--;
                } while (var11 > 0);
            }
            if (var8 > 0) {
                int var12 = var8;
                do {
                    var9++;
                    Statics.field5485[var9] = 0.0F;
                    var12--;
                } while (var12 > 0);
            }
            var9 += var5;
        }
    }

    @ObfuscatedName("vr.fx()V")
    public static void method9316() {
        if (Statics.field5485 == null) {
            return;
        }
        int var0 = Statics.field5485.length;
        for (int var1 = 0; var1 < var0; var1++) {
            if (var1 % Statics.field5483 < Statics.field5483 / 2 && Statics.field5485[var1] > 0.0F) {
                int var2 = (int) (255.0F * class255.method4744(Statics.field5485[var1]));
                Statics.field5489[var1] = var2 << 16 | var2 << 8 | var2;
            }
        }
    }
}
