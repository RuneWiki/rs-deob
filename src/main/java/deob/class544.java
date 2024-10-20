package deob;

@ObfuscatedName("uv")
public class class544 extends class488 {

    @ObfuscatedName("uv.bd")
    public static int field5277 = 0;

    @ObfuscatedName("uv.bi")
    public static int field5274 = 0;

    @ObfuscatedName("uv.bq")
    public static int field5273 = 0;

    @ObfuscatedName("uv.ba")
    public static int field5278 = 0;

    @ObfuscatedName("uv.eh([III[F)V")
    public static void method8934(int[] arg0, int arg1, int arg2, float[] arg3) {
        Statics.field5276 = arg0;
        Statics.field5271 = arg1;
        Statics.field5272 = arg2;
        Statics.field5270 = arg3;
        method8892(0, 0, arg1, arg2);
    }

    @ObfuscatedName("uv.ep()V")
    public static void method8944() {
        field5273 = 0;
        field5277 = 0;
        field5278 = Statics.field5271;
        field5274 = Statics.field5272;
    }

    @ObfuscatedName("uv.ed(IIII)V")
    public static void method8892(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field5271) {
            arg2 = Statics.field5271;
        }
        if (arg3 > Statics.field5272) {
            arg3 = Statics.field5272;
        }
        field5273 = arg0;
        field5277 = arg1;
        field5278 = arg2;
        field5274 = arg3;
    }

    @ObfuscatedName("uv.em(IIII)V")
    public static void method8919(int arg0, int arg1, int arg2, int arg3) {
        if (field5273 < arg0) {
            field5273 = arg0;
        }
        if (field5277 < arg1) {
            field5277 = arg1;
        }
        if (field5278 > arg2) {
            field5278 = arg2;
        }
        if (field5274 > arg3) {
            field5274 = arg3;
        }
    }

    @ObfuscatedName("uv.ew([I)V")
    public static void method8890(int[] arg0) {
        arg0[0] = field5273;
        arg0[1] = field5277;
        arg0[2] = field5278;
        arg0[3] = field5274;
    }

    @ObfuscatedName("uv.eo([I)V")
    public static void method8895(int[] arg0) {
        field5273 = arg0[0];
        field5277 = arg0[1];
        field5278 = arg0[2];
        field5274 = arg0[3];
    }

    @ObfuscatedName("uv.eq()V")
    public static void method8956() {
        int var0 = 0;
        int var1 = Statics.field5272 * Statics.field5271 - 7;
        while (var0 < var1) {
            Statics.field5276[var0++] = 0;
            Statics.field5276[var0++] = 0;
            Statics.field5276[var0++] = 0;
            Statics.field5276[var0++] = 0;
            Statics.field5276[var0++] = 0;
            Statics.field5276[var0++] = 0;
            Statics.field5276[var0++] = 0;
            Statics.field5276[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field5276[var0++] = 0;
        }
        method8913();
    }

    @ObfuscatedName("uv.ez(IIII)V")
    public static void method8897(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method8893(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field5277) {
            var4 = field5277;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field5274) {
            var5 = field5274;
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
            if (var12 < field5273) {
                var12 = field5273;
            }
            int var13 = arg0 + var8;
            if (var13 > field5278) {
                var13 = field5278;
            }
            int var14 = Statics.field5271 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                Statics.field5276[var14++] = arg3;
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
            if (var21 < field5273) {
                var21 = field5273;
            }
            int var22 = arg0 + var16;
            if (var22 > field5278 - 1) {
                var22 = field5278 - 1;
            }
            int var23 = Statics.field5271 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                Statics.field5276[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @ObfuscatedName("uv.fh(IIIII)V")
    public static void method8898(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method8897(arg0, arg1, arg2, arg3);
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
        if (var9 < field5277) {
            var9 = field5277;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field5274) {
            var10 = field5274;
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
            if (var17 < field5273) {
                var17 = field5273;
            }
            int var18 = arg0 + var13;
            if (var18 > field5278) {
                var18 = field5278;
            }
            int var19 = Statics.field5271 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (Statics.field5276[var19] >> 16 & 0xFF) * var5;
                int var22 = (Statics.field5276[var19] >> 8 & 0xFF) * var5;
                int var23 = (Statics.field5276[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                Statics.field5276[var19++] = var24;
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
            if (var30 < field5273) {
                var30 = field5273;
            }
            int var31 = arg0 + var25;
            if (var31 > field5278 - 1) {
                var31 = field5278 - 1;
            }
            int var32 = Statics.field5271 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (Statics.field5276[var32] >> 16 & 0xFF) * var5;
                int var35 = (Statics.field5276[var32] >> 8 & 0xFF) * var5;
                int var36 = (Statics.field5276[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                Statics.field5276[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @ObfuscatedName("uv.fi(IIIIII)V")
    public static void method8899(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field5273) {
            arg2 -= field5273 - arg0;
            arg0 = field5273;
        }
        if (arg1 < field5277) {
            arg3 -= field5277 - arg1;
            arg1 = field5277;
        }
        if (arg0 + arg2 > field5278) {
            arg2 = field5278 - arg0;
        }
        if (arg1 + arg3 > field5274) {
            arg3 = field5274 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field5271 - arg2;
        int var9 = Statics.field5271 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field5276[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field5276[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("uv.fr(IIIII)V")
    public static void method8900(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field5273) {
            arg2 -= field5273 - arg0;
            arg0 = field5273;
        }
        if (arg1 < field5277) {
            arg3 -= field5277 - arg1;
            arg1 = field5277;
        }
        if (arg0 + arg2 > field5278) {
            arg2 = field5278 - arg0;
        }
        if (arg1 + arg3 > field5274) {
            arg3 = field5274 - arg1;
        }
        int var5 = Statics.field5271 - arg2;
        int var6 = Statics.field5271 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field5276[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("uv.fv(IIIIII)V")
    public static void method8901(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field5273) {
            arg2 -= field5273 - arg0;
            arg0 = field5273;
        }
        if (arg1 < field5277) {
            var6 += (field5277 - arg1) * var7;
            arg3 -= field5277 - arg1;
            arg1 = field5277;
        }
        if (arg0 + arg2 > field5278) {
            arg2 = field5278 - arg0;
        }
        if (arg1 + arg3 > field5274) {
            arg3 = field5274 - arg1;
        }
        int var8 = Statics.field5271 - arg2;
        int var9 = Statics.field5271 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field5276[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("uv.fj(IIIIIIII)V")
    public static void method8959(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        int var8 = 0;
        int var9 = 65536 / arg3;
        if (arg0 < field5273) {
            arg2 -= field5273 - arg0;
            arg0 = field5273;
        }
        if (arg1 < field5277) {
            var8 += (field5277 - arg1) * var9;
            arg3 -= field5277 - arg1;
            arg1 = field5277;
        }
        if (arg0 + arg2 > field5278) {
            arg2 = field5278 - arg0;
        }
        if (arg1 + arg3 > field5274) {
            arg3 = field5274 - arg1;
        }
        int var10 = Statics.field5271 - arg2;
        int var11 = Statics.field5271 * arg1 + arg0;
        for (int var12 = -arg3; var12 < 0; var12++) {
            int var13 = 65536 - var8 >> 8;
            int var14 = var8 >> 8;
            int var15 = (arg6 * var13 + arg7 * var14 & 0xFF00) >>> 8;
            if (var15 == 0) {
                var11 += Statics.field5271;
                var8 += var9;
            } else {
                int var16 = ((arg4 & 0xFF00FF) * var13 + (arg5 & 0xFF00FF) * var14 & 0xFF00FF00) + ((arg4 & 0xFF00) * var13 + (arg5 & 0xFF00) * var14 & 0xFF0000) >>> 8;
                int var17 = 255 - var15;
                int var18 = ((var16 & 0xFF00FF) * var15 >> 8 & 0xFF00FF) + ((var16 & 0xFF00) * var15 >> 8 & 0xFF00);
                for (int var19 = -arg2; var19 < 0; var19++) {
                    int var20 = Statics.field5276[var11];
                    if (var20 == 0) {
                        Statics.field5276[var11++] = var18;
                    } else {
                        int var21 = ((var20 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var20 & 0xFF00) * var17 >> 8 & 0xFF00);
                        Statics.field5276[var11++] = var18 + var21;
                    }
                }
                var11 += var10;
                var8 += var9;
            }
        }
    }

    @ObfuscatedName("uv.fa(IIIIII[BIZ)V")
    public static void method8903(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        if (arg0 + arg2 < 0 || arg1 + arg3 < 0 || arg0 >= Statics.field5271 || arg1 >= Statics.field5272) {
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
        if (arg0 + arg2 > Statics.field5271) {
            arg2 = Statics.field5271 - arg0;
        }
        if (arg1 + arg3 > Statics.field5272) {
            arg3 = Statics.field5272 - arg1;
        }
        int var11 = arg6.length / arg7;
        int var12 = Statics.field5271 - arg2;
        int var13 = arg4 >>> 24;
        int var14 = arg5 >>> 24;
        if (!arg8 || var13 == 255 && var14 == 255) {
            int var25 = (arg1 + var10) * Statics.field5271 + arg0 + var9;
            for (int var26 = arg1 + var10; var26 < arg1 + var10 + arg3; var26++) {
                for (int var27 = arg0 + var9; var27 < arg0 + var9 + arg2; var27++) {
                    int var28 = (var26 - arg1) % var11;
                    int var29 = (var27 - arg0) % arg7;
                    if (arg6[arg7 * var28 + var29] == 0) {
                        Statics.field5276[var25++] = arg4;
                    } else {
                        Statics.field5276[var25++] = arg5;
                    }
                }
                var25 += var12;
            }
            return;
        }
        int var15 = (arg1 + var10) * Statics.field5271 + arg0 + var9;
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
                int var23 = Statics.field5276[var15];
                int var24 = ((var20 & 0xFF00FF) * var21 + (var23 & 0xFF00FF) * var22 & 0xFF00FF00) + ((var20 & 0xFF00) * var21 + (var23 & 0xFF00) * var22 & 0xFF0000) >> 8;
                Statics.field5276[var15++] = var24;
            }
            var15 += var12;
        }
    }

    @ObfuscatedName("uv.fq(IIIII)V")
    public static void method8945(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method8906(arg0, arg1, arg2, arg4);
        method8906(arg0, arg1 + arg3 - 1, arg2, arg4);
        method8908(arg0, arg1, arg3, arg4);
        method8908(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("uv.fk(IIIIII)V")
    public static void method8905(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method8966(arg0, arg1, arg2, arg4, arg5);
        method8966(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method8909(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method8909(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("uv.fn(IIII)V")
    public static void method8906(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field5277 || arg1 >= field5274) {
            return;
        }
        if (arg0 < field5273) {
            arg2 -= field5273 - arg0;
            arg0 = field5273;
        }
        if (arg0 + arg2 > field5278) {
            arg2 = field5278 - arg0;
        }
        int var4 = Statics.field5271 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field5276[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("uv.fd(IIIII)V")
    public static void method8966(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field5277 || arg1 >= field5274) {
            return;
        }
        if (arg0 < field5273) {
            arg2 -= field5273 - arg0;
            arg0 = field5273;
        }
        if (arg0 + arg2 > field5278) {
            arg2 = field5278 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field5271 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field5276[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field5276[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field5276[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field5276[var9++] = var14;
        }
    }

    @ObfuscatedName("uv.fc(IIII)V")
    public static void method8908(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field5273 || arg0 >= field5278) {
            return;
        }
        if (arg1 < field5277) {
            arg2 -= field5277 - arg1;
            arg1 = field5277;
        }
        if (arg1 + arg2 > field5274) {
            arg2 = field5274 - arg1;
        }
        int var4 = Statics.field5271 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field5276[Statics.field5271 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("uv.fm(IIIII)V")
    public static void method8909(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field5273 || arg0 >= field5278) {
            return;
        }
        if (arg1 < field5277) {
            arg2 -= field5277 - arg1;
            arg1 = field5277;
        }
        if (arg1 + arg2 > field5274) {
            arg2 = field5274 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field5271 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field5276[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field5276[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field5276[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field5276[var9] = var14;
            var9 += Statics.field5271;
        }
    }

    @ObfuscatedName("uv.fy(IIIII)V")
    public static void method8911(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method8906(arg0, arg1, var5 + 1, arg4);
            } else {
                method8906(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field5273) {
                    var8 += (field5273 - arg0) * var10;
                    arg0 = field5273;
                }
                if (var11 >= field5278) {
                    var11 = field5278 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field5277 && var12 < field5274) {
                        Statics.field5276[Statics.field5271 * var12 + arg0] = arg4;
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
                if (arg1 < field5277) {
                    var14 += (field5277 - arg1) * var16;
                    arg1 = field5277;
                }
                if (var17 >= field5274) {
                    var17 = field5274 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field5273 && var18 < field5278) {
                        Statics.field5276[Statics.field5271 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method8908(arg0, arg1, var6 + 1, arg4);
        } else {
            method8908(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("uv.fx(III)V")
    public static void method8893(int arg0, int arg1, int arg2) {
        if (arg0 >= field5273 && arg1 >= field5277 && arg0 < field5278 && arg1 < field5274) {
            Statics.field5276[Statics.field5271 * arg1 + arg0] = arg2;
        }
    }

    @ObfuscatedName("uv.ft(III[I[I)V")
    public static void method8891(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field5271 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field5276[var7++] = arg2;
            }
            var5 += Statics.field5271;
        }
    }

    @ObfuscatedName("uv.fu()V")
    public static void method8913() {
        if (Statics.field5270 == null) {
            return;
        }
        if (field5273 == 0 && Statics.field5271 == field5278 && field5277 == 0 && Statics.field5272 == field5274) {
            int var0 = Statics.field5270.length;
            int var1 = var0 - (var0 & 0x7);
            int var2 = 0;
            while (var2 < var1) {
                Statics.field5270[var2++] = 0.0F;
                Statics.field5270[var2++] = 0.0F;
                Statics.field5270[var2++] = 0.0F;
                Statics.field5270[var2++] = 0.0F;
                Statics.field5270[var2++] = 0.0F;
                Statics.field5270[var2++] = 0.0F;
                Statics.field5270[var2++] = 0.0F;
                Statics.field5270[var2++] = 0.0F;
            }
            while (var2 < var0) {
                Statics.field5270[var2++] = 0.0F;
            }
            return;
        }
        int var3 = field5278 - field5273;
        int var4 = field5274 - field5277;
        int var5 = Statics.field5271 - var3;
        int var6 = Statics.field5271 * field5277 + field5273;
        int var7 = var3 >> 3;
        int var8 = var3 & 0x7;
        int var9 = var6 - 1;
        for (int var10 = -var4; var10 < 0; var10++) {
            if (var7 > 0) {
                int var11 = var7;
                do {
                    var9++;
                    Statics.field5270[var9] = 0.0F;
                    var9++;
                    Statics.field5270[var9] = 0.0F;
                    var9++;
                    Statics.field5270[var9] = 0.0F;
                    var9++;
                    Statics.field5270[var9] = 0.0F;
                    var9++;
                    Statics.field5270[var9] = 0.0F;
                    var9++;
                    Statics.field5270[var9] = 0.0F;
                    var9++;
                    Statics.field5270[var9] = 0.0F;
                    var9++;
                    Statics.field5270[var9] = 0.0F;
                    var11--;
                } while (var11 > 0);
            }
            if (var8 > 0) {
                int var12 = var8;
                do {
                    var9++;
                    Statics.field5270[var9] = 0.0F;
                    var12--;
                } while (var12 > 0);
            }
            var9 += var5;
        }
    }

    @ObfuscatedName("uv.ff()V")
    public static void method8914() {
        if (Statics.field5270 == null) {
            return;
        }
        int var0 = Statics.field5270.length;
        for (int var1 = 0; var1 < var0; var1++) {
            if (var1 % Statics.field5271 < Statics.field5271 / 2 && Statics.field5270[var1] > 0.0F) {
                float var2 = Statics.field5270[var1];
                float var3 = 75.0F;
                float var4 = 10000.0F;
                float var5 = 750000.0F / (10000.0F - var2 * 9925.0F);
                float var6 = (var5 - 75.0F) / 9925.0F;
                int var7 = (int) (var6 * 255.0F);
                Statics.field5276[var1] = var7 << 16 | var7 << 8 | var7;
            }
        }
    }
}
