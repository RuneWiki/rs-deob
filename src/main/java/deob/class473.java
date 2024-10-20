package deob;

@ObfuscatedName("rq")
public class class473 extends class425 {

    @ObfuscatedName("rq.ac")
    public static int field4937 = 0;

    @ObfuscatedName("rq.af")
    public static int field4940 = 0;

    @ObfuscatedName("rq.ad")
    public static int field4939 = 0;

    @ObfuscatedName("rq.av")
    public static int field4938 = 0;

    @ObfuscatedName("rq.cp([III)V")
    public static void method8013(int[] arg0, int arg1, int arg2) {
        Statics.field4934 = arg0;
        Statics.field4935 = arg1;
        Statics.field4936 = arg2;
        method8015(0, 0, arg1, arg2);
    }

    @ObfuscatedName("rq.ds()V")
    public static void method8077() {
        field4939 = 0;
        field4937 = 0;
        field4938 = Statics.field4935;
        field4940 = Statics.field4936;
    }

    @ObfuscatedName("rq.df(IIII)V")
    public static void method8015(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field4935) {
            arg2 = Statics.field4935;
        }
        if (arg3 > Statics.field4936) {
            arg3 = Statics.field4936;
        }
        field4939 = arg0;
        field4937 = arg1;
        field4938 = arg2;
        field4940 = arg3;
    }

    @ObfuscatedName("rq.dc(IIII)V")
    public static void method8086(int arg0, int arg1, int arg2, int arg3) {
        if (field4939 < arg0) {
            field4939 = arg0;
        }
        if (field4937 < arg1) {
            field4937 = arg1;
        }
        if (field4938 > arg2) {
            field4938 = arg2;
        }
        if (field4940 > arg3) {
            field4940 = arg3;
        }
    }

    @ObfuscatedName("rq.dk([I)V")
    public static void method8080(int[] arg0) {
        arg0[0] = field4939;
        arg0[1] = field4937;
        arg0[2] = field4938;
        arg0[3] = field4940;
    }

    @ObfuscatedName("rq.du([I)V")
    public static void method8017(int[] arg0) {
        field4939 = arg0[0];
        field4937 = arg0[1];
        field4938 = arg0[2];
        field4940 = arg0[3];
    }

    @ObfuscatedName("rq.de()V")
    public static void method8018() {
        int var0 = 0;
        int var1 = Statics.field4936 * Statics.field4935 - 7;
        while (var0 < var1) {
            Statics.field4934[var0++] = 0;
            Statics.field4934[var0++] = 0;
            Statics.field4934[var0++] = 0;
            Statics.field4934[var0++] = 0;
            Statics.field4934[var0++] = 0;
            Statics.field4934[var0++] = 0;
            Statics.field4934[var0++] = 0;
            Statics.field4934[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field4934[var0++] = 0;
        }
    }

    @ObfuscatedName("rq.dt(IIII)V")
    public static void method8019(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method8090(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field4937) {
            var4 = field4937;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field4940) {
            var5 = field4940;
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
            if (var12 < field4939) {
                var12 = field4939;
            }
            int var13 = arg0 + var8;
            if (var13 > field4938) {
                var13 = field4938;
            }
            int var14 = Statics.field4935 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                Statics.field4934[var14++] = arg3;
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
            if (var21 < field4939) {
                var21 = field4939;
            }
            int var22 = arg0 + var16;
            if (var22 > field4938 - 1) {
                var22 = field4938 - 1;
            }
            int var23 = Statics.field4935 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                Statics.field4934[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @ObfuscatedName("rq.da(IIIII)V")
    public static void method8020(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method8019(arg0, arg1, arg2, arg3);
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
        if (var9 < field4937) {
            var9 = field4937;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field4940) {
            var10 = field4940;
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
            if (var17 < field4939) {
                var17 = field4939;
            }
            int var18 = arg0 + var13;
            if (var18 > field4938) {
                var18 = field4938;
            }
            int var19 = Statics.field4935 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (Statics.field4934[var19] >> 16 & 0xFF) * var5;
                int var22 = (Statics.field4934[var19] >> 8 & 0xFF) * var5;
                int var23 = (Statics.field4934[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                Statics.field4934[var19++] = var24;
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
            if (var30 < field4939) {
                var30 = field4939;
            }
            int var31 = arg0 + var25;
            if (var31 > field4938 - 1) {
                var31 = field4938 - 1;
            }
            int var32 = Statics.field4935 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (Statics.field4934[var32] >> 16 & 0xFF) * var5;
                int var35 = (Statics.field4934[var32] >> 8 & 0xFF) * var5;
                int var36 = (Statics.field4934[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                Statics.field4934[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @ObfuscatedName("rq.dx(IIIIII)V")
    public static void method8021(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field4939) {
            arg2 -= field4939 - arg0;
            arg0 = field4939;
        }
        if (arg1 < field4937) {
            arg3 -= field4937 - arg1;
            arg1 = field4937;
        }
        if (arg0 + arg2 > field4938) {
            arg2 = field4938 - arg0;
        }
        if (arg1 + arg3 > field4940) {
            arg3 = field4940 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field4935 - arg2;
        int var9 = Statics.field4935 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field4934[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field4934[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("rq.dp(IIIII)V")
    public static void method8022(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field4939) {
            arg2 -= field4939 - arg0;
            arg0 = field4939;
        }
        if (arg1 < field4937) {
            arg3 -= field4937 - arg1;
            arg1 = field4937;
        }
        if (arg0 + arg2 > field4938) {
            arg2 = field4938 - arg0;
        }
        if (arg1 + arg3 > field4940) {
            arg3 = field4940 - arg1;
        }
        int var5 = Statics.field4935 - arg2;
        int var6 = Statics.field4935 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field4934[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("rq.dm(IIIIII)V")
    public static void method8048(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field4939) {
            arg2 -= field4939 - arg0;
            arg0 = field4939;
        }
        if (arg1 < field4937) {
            var6 += (field4937 - arg1) * var7;
            arg3 -= field4937 - arg1;
            arg1 = field4937;
        }
        if (arg0 + arg2 > field4938) {
            arg2 = field4938 - arg0;
        }
        if (arg1 + arg3 > field4940) {
            arg3 = field4940 - arg1;
        }
        int var8 = Statics.field4935 - arg2;
        int var9 = Statics.field4935 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field4934[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("rq.dg(IIIIIIII)V")
    public static void method8047(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        int var8 = 0;
        int var9 = 65536 / arg3;
        if (arg0 < field4939) {
            arg2 -= field4939 - arg0;
            arg0 = field4939;
        }
        if (arg1 < field4937) {
            var8 += (field4937 - arg1) * var9;
            arg3 -= field4937 - arg1;
            arg1 = field4937;
        }
        if (arg0 + arg2 > field4938) {
            arg2 = field4938 - arg0;
        }
        if (arg1 + arg3 > field4940) {
            arg3 = field4940 - arg1;
        }
        int var10 = Statics.field4935 - arg2;
        int var11 = Statics.field4935 * arg1 + arg0;
        for (int var12 = -arg3; var12 < 0; var12++) {
            int var13 = 65536 - var8 >> 8;
            int var14 = var8 >> 8;
            int var15 = (arg6 * var13 + arg7 * var14 & 0xFF00) >>> 8;
            if (var15 == 0) {
                var11 += Statics.field4935;
                var8 += var9;
            } else {
                int var16 = ((arg4 & 0xFF00FF) * var13 + (arg5 & 0xFF00FF) * var14 & 0xFF00FF00) + ((arg4 & 0xFF00) * var13 + (arg5 & 0xFF00) * var14 & 0xFF0000) >>> 8;
                int var17 = 255 - var15;
                int var18 = ((var16 & 0xFF00FF) * var15 >> 8 & 0xFF00FF) + ((var16 & 0xFF00) * var15 >> 8 & 0xFF00);
                for (int var19 = -arg2; var19 < 0; var19++) {
                    int var20 = Statics.field4934[var11];
                    if (var20 == 0) {
                        Statics.field4934[var11++] = var18;
                    } else {
                        int var21 = ((var20 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var20 & 0xFF00) * var17 >> 8 & 0xFF00);
                        Statics.field4934[var11++] = var18 + var21;
                    }
                }
                var11 += var10;
                var8 += var9;
            }
        }
    }

    @ObfuscatedName("rq.dr(IIIIII[BIZ)V")
    public static void method8023(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        if (arg0 + arg2 < 0 || arg1 + arg3 < 0 || arg0 >= Statics.field4935 || arg1 >= Statics.field4936) {
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
        if (arg0 + arg2 > Statics.field4935) {
            arg2 = Statics.field4935 - arg0;
        }
        if (arg1 + arg3 > Statics.field4936) {
            arg3 = Statics.field4936 - arg1;
        }
        int var11 = arg6.length / arg7;
        int var12 = Statics.field4935 - arg2;
        int var13 = arg4 >>> 24;
        int var14 = arg5 >>> 24;
        if (!arg8 || var13 == 255 && var14 == 255) {
            int var25 = (arg1 + var10) * Statics.field4935 + arg0 + var9;
            for (int var26 = arg1 + var10; var26 < arg1 + var10 + arg3; var26++) {
                for (int var27 = arg0 + var9; var27 < arg0 + var9 + arg2; var27++) {
                    int var28 = (var26 - arg1) % var11;
                    int var29 = (var27 - arg0) % arg7;
                    if (arg6[arg7 * var28 + var29] == 0) {
                        Statics.field4934[var25++] = arg4;
                    } else {
                        Statics.field4934[var25++] = arg5;
                    }
                }
                var25 += var12;
            }
            return;
        }
        int var15 = (arg1 + var10) * Statics.field4935 + arg0 + var9;
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
                int var23 = Statics.field4934[var15];
                int var24 = ((var20 & 0xFF00FF) * var21 + (var23 & 0xFF00FF) * var22 & 0xFF00FF00) + ((var20 & 0xFF00) * var21 + (var23 & 0xFF00) * var22 & 0xFF0000) >> 8;
                Statics.field4934[var15++] = var24;
            }
            var15 += var12;
        }
    }

    @ObfuscatedName("rq.dl(IIIII)V")
    public static void method8026(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method8028(arg0, arg1, arg2, arg4);
        method8028(arg0, arg1 + arg3 - 1, arg2, arg4);
        method8029(arg0, arg1, arg3, arg4);
        method8029(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("rq.dy(IIIIII)V")
    public static void method8030(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method8059(arg0, arg1, arg2, arg4, arg5);
        method8059(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method8031(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method8031(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("rq.do(IIII)V")
    public static void method8028(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field4937 || arg1 >= field4940) {
            return;
        }
        if (arg0 < field4939) {
            arg2 -= field4939 - arg0;
            arg0 = field4939;
        }
        if (arg0 + arg2 > field4938) {
            arg2 = field4938 - arg0;
        }
        int var4 = Statics.field4935 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field4934[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("rq.dw(IIIII)V")
    public static void method8059(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field4937 || arg1 >= field4940) {
            return;
        }
        if (arg0 < field4939) {
            arg2 -= field4939 - arg0;
            arg0 = field4939;
        }
        if (arg0 + arg2 > field4938) {
            arg2 = field4938 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field4935 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field4934[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field4934[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field4934[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field4934[var9++] = var14;
        }
    }

    @ObfuscatedName("rq.di(IIII)V")
    public static void method8029(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field4939 || arg0 >= field4938) {
            return;
        }
        if (arg1 < field4937) {
            arg2 -= field4937 - arg1;
            arg1 = field4937;
        }
        if (arg1 + arg2 > field4940) {
            arg2 = field4940 - arg1;
        }
        int var4 = Statics.field4935 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field4934[Statics.field4935 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("rq.dn(IIIII)V")
    public static void method8031(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field4939 || arg0 >= field4938) {
            return;
        }
        if (arg1 < field4937) {
            arg2 -= field4937 - arg1;
            arg1 = field4937;
        }
        if (arg1 + arg2 > field4940) {
            arg2 = field4940 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field4935 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field4934[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field4934[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field4934[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field4934[var9] = var14;
            var9 += Statics.field4935;
        }
    }

    @ObfuscatedName("rq.db(IIIII)V")
    public static void method8032(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method8028(arg0, arg1, var5 + 1, arg4);
            } else {
                method8028(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field4939) {
                    var8 += (field4939 - arg0) * var10;
                    arg0 = field4939;
                }
                if (var11 >= field4938) {
                    var11 = field4938 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field4937 && var12 < field4940) {
                        Statics.field4934[Statics.field4935 * var12 + arg0] = arg4;
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
                if (arg1 < field4937) {
                    var14 += (field4937 - arg1) * var16;
                    arg1 = field4937;
                }
                if (var17 >= field4940) {
                    var17 = field4940 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field4939 && var18 < field4938) {
                        Statics.field4934[Statics.field4935 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method8029(arg0, arg1, var6 + 1, arg4);
        } else {
            method8029(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("rq.dv(III)V")
    public static void method8090(int arg0, int arg1, int arg2) {
        if (arg0 >= field4939 && arg1 >= field4937 && arg0 < field4938 && arg1 < field4940) {
            Statics.field4934[Statics.field4935 * arg1 + arg0] = arg2;
        }
    }

    @ObfuscatedName("rq.dq(III[I[I)V")
    public static void method8075(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field4935 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field4934[var7++] = arg2;
            }
            var5 += Statics.field4935;
        }
    }
}
