package deob;

@ObfuscatedName("ti")
public class class511 extends class457 {

    @ObfuscatedName("ti.bj")
    public static int field5087 = 0;

    @ObfuscatedName("ti.bo")
    public static int field5092 = 0;

    @ObfuscatedName("ti.bq")
    public static int field5093 = 0;

    @ObfuscatedName("ti.bg")
    public static int field5094 = 0;

    @ObfuscatedName("ti.et([III[F)V")
    public static void method8458(int[] arg0, int arg1, int arg2, float[] arg3) {
        Statics.field5091 = arg0;
        Statics.field5086 = arg1;
        Statics.field5088 = arg2;
        Statics.field5089 = arg3;
        method8523(0, 0, arg1, arg2);
    }

    @ObfuscatedName("ti.ek()V")
    public static void method8459() {
        field5093 = 0;
        field5087 = 0;
        field5094 = Statics.field5086;
        field5092 = Statics.field5088;
    }

    @ObfuscatedName("ti.ec(IIII)V")
    public static void method8523(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field5086) {
            arg2 = Statics.field5086;
        }
        if (arg3 > Statics.field5088) {
            arg3 = Statics.field5088;
        }
        field5093 = arg0;
        field5087 = arg1;
        field5094 = arg2;
        field5092 = arg3;
    }

    @ObfuscatedName("ti.el(IIII)V")
    public static void method8500(int arg0, int arg1, int arg2, int arg3) {
        if (field5093 < arg0) {
            field5093 = arg0;
        }
        if (field5087 < arg1) {
            field5087 = arg1;
        }
        if (field5094 > arg2) {
            field5094 = arg2;
        }
        if (field5092 > arg3) {
            field5092 = arg3;
        }
    }

    @ObfuscatedName("ti.ed([I)V")
    public static void method8462(int[] arg0) {
        arg0[0] = field5093;
        arg0[1] = field5087;
        arg0[2] = field5094;
        arg0[3] = field5092;
    }

    @ObfuscatedName("ti.ep([I)V")
    public static void method8463(int[] arg0) {
        field5093 = arg0[0];
        field5087 = arg0[1];
        field5094 = arg0[2];
        field5092 = arg0[3];
    }

    @ObfuscatedName("ti.ew()V")
    public static void method8464() {
        int var0 = 0;
        int var1 = Statics.field5088 * Statics.field5086 - 7;
        while (var0 < var1) {
            Statics.field5091[var0++] = 0;
            Statics.field5091[var0++] = 0;
            Statics.field5091[var0++] = 0;
            Statics.field5091[var0++] = 0;
            Statics.field5091[var0++] = 0;
            Statics.field5091[var0++] = 0;
            Statics.field5091[var0++] = 0;
            Statics.field5091[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field5091[var0++] = 0;
        }
        method8481();
    }

    @ObfuscatedName("ti.eb(IIII)V")
    public static void method8465(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method8479(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field5087) {
            var4 = field5087;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field5092) {
            var5 = field5092;
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
            if (var12 < field5093) {
                var12 = field5093;
            }
            int var13 = arg0 + var8;
            if (var13 > field5094) {
                var13 = field5094;
            }
            int var14 = Statics.field5086 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                Statics.field5091[var14++] = arg3;
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
            if (var21 < field5093) {
                var21 = field5093;
            }
            int var22 = arg0 + var16;
            if (var22 > field5094 - 1) {
                var22 = field5094 - 1;
            }
            int var23 = Statics.field5086 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                Statics.field5091[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @ObfuscatedName("ti.eo(IIIII)V")
    public static void method8460(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method8465(arg0, arg1, arg2, arg3);
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
        if (var9 < field5087) {
            var9 = field5087;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field5092) {
            var10 = field5092;
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
            if (var17 < field5093) {
                var17 = field5093;
            }
            int var18 = arg0 + var13;
            if (var18 > field5094) {
                var18 = field5094;
            }
            int var19 = Statics.field5086 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (Statics.field5091[var19] >> 16 & 0xFF) * var5;
                int var22 = (Statics.field5091[var19] >> 8 & 0xFF) * var5;
                int var23 = (Statics.field5091[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                Statics.field5091[var19++] = var24;
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
            if (var30 < field5093) {
                var30 = field5093;
            }
            int var31 = arg0 + var25;
            if (var31 > field5094 - 1) {
                var31 = field5094 - 1;
            }
            int var32 = Statics.field5086 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (Statics.field5091[var32] >> 16 & 0xFF) * var5;
                int var35 = (Statics.field5091[var32] >> 8 & 0xFF) * var5;
                int var36 = (Statics.field5091[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                Statics.field5091[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @ObfuscatedName("ti.es(IIIIII)V")
    public static void method8524(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field5093) {
            arg2 -= field5093 - arg0;
            arg0 = field5093;
        }
        if (arg1 < field5087) {
            arg3 -= field5087 - arg1;
            arg1 = field5087;
        }
        if (arg0 + arg2 > field5094) {
            arg2 = field5094 - arg0;
        }
        if (arg1 + arg3 > field5092) {
            arg3 = field5092 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field5086 - arg2;
        int var9 = Statics.field5086 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field5091[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field5091[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("ti.ei(IIIII)V")
    public static void method8468(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field5093) {
            arg2 -= field5093 - arg0;
            arg0 = field5093;
        }
        if (arg1 < field5087) {
            arg3 -= field5087 - arg1;
            arg1 = field5087;
        }
        if (arg0 + arg2 > field5094) {
            arg2 = field5094 - arg0;
        }
        if (arg1 + arg3 > field5092) {
            arg3 = field5092 - arg1;
        }
        int var5 = Statics.field5086 - arg2;
        int var6 = Statics.field5086 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field5091[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("ti.eq(IIIIII)V")
    public static void method8469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field5093) {
            arg2 -= field5093 - arg0;
            arg0 = field5093;
        }
        if (arg1 < field5087) {
            var6 += (field5087 - arg1) * var7;
            arg3 -= field5087 - arg1;
            arg1 = field5087;
        }
        if (arg0 + arg2 > field5094) {
            arg2 = field5094 - arg0;
        }
        if (arg1 + arg3 > field5092) {
            arg3 = field5092 - arg1;
        }
        int var8 = Statics.field5086 - arg2;
        int var9 = Statics.field5086 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field5091[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("ti.fg(IIIIIIII)V")
    public static void method8489(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        int var8 = 0;
        int var9 = 65536 / arg3;
        if (arg0 < field5093) {
            arg2 -= field5093 - arg0;
            arg0 = field5093;
        }
        if (arg1 < field5087) {
            var8 += (field5087 - arg1) * var9;
            arg3 -= field5087 - arg1;
            arg1 = field5087;
        }
        if (arg0 + arg2 > field5094) {
            arg2 = field5094 - arg0;
        }
        if (arg1 + arg3 > field5092) {
            arg3 = field5092 - arg1;
        }
        int var10 = Statics.field5086 - arg2;
        int var11 = Statics.field5086 * arg1 + arg0;
        for (int var12 = -arg3; var12 < 0; var12++) {
            int var13 = 65536 - var8 >> 8;
            int var14 = var8 >> 8;
            int var15 = (arg6 * var13 + arg7 * var14 & 0xFF00) >>> 8;
            if (var15 == 0) {
                var11 += Statics.field5086;
                var8 += var9;
            } else {
                int var16 = ((arg4 & 0xFF00FF) * var13 + (arg5 & 0xFF00FF) * var14 & 0xFF00FF00) + ((arg4 & 0xFF00) * var13 + (arg5 & 0xFF00) * var14 & 0xFF0000) >>> 8;
                int var17 = 255 - var15;
                int var18 = ((var16 & 0xFF00FF) * var15 >> 8 & 0xFF00FF) + ((var16 & 0xFF00) * var15 >> 8 & 0xFF00);
                for (int var19 = -arg2; var19 < 0; var19++) {
                    int var20 = Statics.field5091[var11];
                    if (var20 == 0) {
                        Statics.field5091[var11++] = var18;
                    } else {
                        int var21 = ((var20 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var20 & 0xFF00) * var17 >> 8 & 0xFF00);
                        Statics.field5091[var11++] = var18 + var21;
                    }
                }
                var11 += var10;
                var8 += var9;
            }
        }
    }

    @ObfuscatedName("ti.fa(IIIIII[BIZ)V")
    public static void method8470(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        if (arg0 + arg2 < 0 || arg1 + arg3 < 0 || arg0 >= Statics.field5086 || arg1 >= Statics.field5088) {
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
        if (arg0 + arg2 > Statics.field5086) {
            arg2 = Statics.field5086 - arg0;
        }
        if (arg1 + arg3 > Statics.field5088) {
            arg3 = Statics.field5088 - arg1;
        }
        int var11 = arg6.length / arg7;
        int var12 = Statics.field5086 - arg2;
        int var13 = arg4 >>> 24;
        int var14 = arg5 >>> 24;
        if (!arg8 || var13 == 255 && var14 == 255) {
            int var25 = (arg1 + var10) * Statics.field5086 + arg0 + var9;
            for (int var26 = arg1 + var10; var26 < arg1 + var10 + arg3; var26++) {
                for (int var27 = arg0 + var9; var27 < arg0 + var9 + arg2; var27++) {
                    int var28 = (var26 - arg1) % var11;
                    int var29 = (var27 - arg0) % arg7;
                    if (arg6[arg7 * var28 + var29] == 0) {
                        Statics.field5091[var25++] = arg4;
                    } else {
                        Statics.field5091[var25++] = arg5;
                    }
                }
                var25 += var12;
            }
            return;
        }
        int var15 = (arg1 + var10) * Statics.field5086 + arg0 + var9;
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
                int var23 = Statics.field5091[var15];
                int var24 = ((var20 & 0xFF00FF) * var21 + (var23 & 0xFF00FF) * var22 & 0xFF00FF00) + ((var20 & 0xFF00) * var21 + (var23 & 0xFF00) * var22 & 0xFF0000) >> 8;
                Statics.field5091[var15++] = var24;
            }
            var15 += var12;
        }
    }

    @ObfuscatedName("ti.fm(IIIII)V")
    public static void method8472(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method8474(arg0, arg1, arg2, arg4);
        method8474(arg0, arg1 + arg3 - 1, arg2, arg4);
        method8476(arg0, arg1, arg3, arg4);
        method8476(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("ti.fc(IIIIII)V")
    public static void method8473(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method8475(arg0, arg1, arg2, arg4, arg5);
        method8475(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method8477(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method8477(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("ti.fl(IIII)V")
    public static void method8474(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field5087 || arg1 >= field5092) {
            return;
        }
        if (arg0 < field5093) {
            arg2 -= field5093 - arg0;
            arg0 = field5093;
        }
        if (arg0 + arg2 > field5094) {
            arg2 = field5094 - arg0;
        }
        int var4 = Statics.field5086 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field5091[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("ti.fe(IIIII)V")
    public static void method8475(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field5087 || arg1 >= field5092) {
            return;
        }
        if (arg0 < field5093) {
            arg2 -= field5093 - arg0;
            arg0 = field5093;
        }
        if (arg0 + arg2 > field5094) {
            arg2 = field5094 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field5086 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field5091[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field5091[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field5091[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field5091[var9++] = var14;
        }
    }

    @ObfuscatedName("ti.fz(IIII)V")
    public static void method8476(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field5093 || arg0 >= field5094) {
            return;
        }
        if (arg1 < field5087) {
            arg2 -= field5087 - arg1;
            arg1 = field5087;
        }
        if (arg1 + arg2 > field5092) {
            arg2 = field5092 - arg1;
        }
        int var4 = Statics.field5086 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field5091[Statics.field5086 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("ti.fp(IIIII)V")
    public static void method8477(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field5093 || arg0 >= field5094) {
            return;
        }
        if (arg1 < field5087) {
            arg2 -= field5087 - arg1;
            arg1 = field5087;
        }
        if (arg1 + arg2 > field5092) {
            arg2 = field5092 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field5086 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field5091[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field5091[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field5091[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field5091[var9] = var14;
            var9 += Statics.field5086;
        }
    }

    @ObfuscatedName("ti.fw(IIIII)V")
    public static void method8478(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method8474(arg0, arg1, var5 + 1, arg4);
            } else {
                method8474(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field5093) {
                    var8 += (field5093 - arg0) * var10;
                    arg0 = field5093;
                }
                if (var11 >= field5094) {
                    var11 = field5094 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field5087 && var12 < field5092) {
                        Statics.field5091[Statics.field5086 * var12 + arg0] = arg4;
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
                if (arg1 < field5087) {
                    var14 += (field5087 - arg1) * var16;
                    arg1 = field5087;
                }
                if (var17 >= field5092) {
                    var17 = field5092 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field5093 && var18 < field5094) {
                        Statics.field5091[Statics.field5086 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method8476(arg0, arg1, var6 + 1, arg4);
        } else {
            method8476(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("ti.ff(III)V")
    public static void method8479(int arg0, int arg1, int arg2) {
        if (arg0 >= field5093 && arg1 >= field5087 && arg0 < field5094 && arg1 < field5092) {
            Statics.field5091[Statics.field5086 * arg1 + arg0] = arg2;
        }
    }

    @ObfuscatedName("ti.ft(III[I[I)V")
    public static void method8480(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field5086 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field5091[var7++] = arg2;
            }
            var5 += Statics.field5086;
        }
    }

    @ObfuscatedName("ti.fv()V")
    public static void method8481() {
        if (Statics.field5089 == null) {
            return;
        }
        if (field5093 == 0 && Statics.field5086 == field5094 && field5087 == 0 && Statics.field5088 == field5092) {
            int var0 = Statics.field5089.length;
            int var1 = var0 - (var0 & 0x7);
            int var2 = 0;
            while (var2 < var1) {
                Statics.field5089[var2++] = 0.0F;
                Statics.field5089[var2++] = 0.0F;
                Statics.field5089[var2++] = 0.0F;
                Statics.field5089[var2++] = 0.0F;
                Statics.field5089[var2++] = 0.0F;
                Statics.field5089[var2++] = 0.0F;
                Statics.field5089[var2++] = 0.0F;
                Statics.field5089[var2++] = 0.0F;
            }
            while (var2 < var0) {
                Statics.field5089[var2++] = 0.0F;
            }
            return;
        }
        int var3 = field5094 - field5093;
        int var4 = field5092 - field5087;
        int var5 = Statics.field5086 - var3;
        int var6 = Statics.field5086 * field5087 + field5093;
        int var7 = var3 >> 3;
        int var8 = var3 & 0x7;
        int var9 = var6 - 1;
        for (int var10 = -var4; var10 < 0; var10++) {
            if (var7 > 0) {
                int var11 = var7;
                do {
                    var9++;
                    Statics.field5089[var9] = 0.0F;
                    var9++;
                    Statics.field5089[var9] = 0.0F;
                    var9++;
                    Statics.field5089[var9] = 0.0F;
                    var9++;
                    Statics.field5089[var9] = 0.0F;
                    var9++;
                    Statics.field5089[var9] = 0.0F;
                    var9++;
                    Statics.field5089[var9] = 0.0F;
                    var9++;
                    Statics.field5089[var9] = 0.0F;
                    var9++;
                    Statics.field5089[var9] = 0.0F;
                    var11--;
                } while (var11 > 0);
            }
            if (var8 > 0) {
                int var12 = var8;
                do {
                    var9++;
                    Statics.field5089[var9] = 0.0F;
                    var12--;
                } while (var12 > 0);
            }
            var9 += var5;
        }
    }

    @ObfuscatedName("ti.fu()V")
    public static void method8482() {
        if (Statics.field5089 == null) {
            return;
        }
        int var0 = Statics.field5089.length;
        for (int var1 = 0; var1 < var0; var1++) {
            if (var1 % Statics.field5086 < Statics.field5086 / 2 && Statics.field5089[var1] > 0.0F) {
                float var2 = Statics.field5089[var1];
                float var3 = 75.0F;
                float var4 = 10000.0F;
                float var5 = 750000.0F / (10000.0F - var2 * 9925.0F);
                float var6 = (var5 - 75.0F) / 9925.0F;
                int var7 = (int) (var6 * 255.0F);
                Statics.field5091[var1] = var7 << 16 | var7 << 8 | var7;
            }
        }
    }
}
