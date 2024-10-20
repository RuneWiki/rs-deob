package deob;

import java.util.Random;

@ObfuscatedName("bi")
public class class67 {

    @ObfuscatedName("bi.p")
    public class53 field1269;

    @ObfuscatedName("bi.k")
    public class53 field1262;

    @ObfuscatedName("bi.e")
    public class53 field1263;

    @ObfuscatedName("bi.f")
    public class53 field1274;

    @ObfuscatedName("bi.w")
    public class53 field1265;

    @ObfuscatedName("bi.t")
    public class53 field1280;

    @ObfuscatedName("bi.s")
    public class53 field1267;

    @ObfuscatedName("bi.c")
    public class53 field1268;

    @ObfuscatedName("bi.d")
    public int[] field1266 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bi.v")
    public int[] field1270 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bi.m")
    public int[] field1271 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bi.h")
    public int field1272 = 0;

    @ObfuscatedName("bi.n")
    public int field1273 = 100;

    @ObfuscatedName("bi.x")
    public class59 field1261;

    @ObfuscatedName("bi.o")
    public class53 field1275;

    @ObfuscatedName("bi.r")
    public int field1276 = 500;

    @ObfuscatedName("bi.y")
    public int field1277 = 0;

    @ObfuscatedName("bi.i")
    public static int[] field1281;

    @ObfuscatedName("bi.q")
    public static int[] field1279 = new int[32768];

    @ObfuscatedName("bi.g")
    public static int[] field1264;

    @ObfuscatedName("bi.u")
    public static int[] field1282;

    @ObfuscatedName("bi.j")
    public static int[] field1283;

    @ObfuscatedName("bi.z")
    public static int[] field1284;

    @ObfuscatedName("bi.b")
    public static int[] field1285;

    @ObfuscatedName("bi.a")
    public static int[] field1286;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1279[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1264 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1264[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1281 = new int[220500];
        field1282 = new int[5];
        field1283 = new int[5];
        field1284 = new int[5];
        field1285 = new int[5];
        field1286 = new int[5];
    }

    @ObfuscatedName("bi.p(II)[I")
    public final int[] method1339(int arg0, int arg1) {
        class112.method2378(field1281, 0, arg0);
        if (arg1 < 10) {
            return field1281;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1269.method1064();
        this.field1262.method1064();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1263 != null) {
            this.field1263.method1064();
            this.field1274.method1064();
            var5 = (int) ((double) (this.field1263.field1146 - this.field1263.field1152) * 32.768D / var3);
            var6 = (int) ((double) this.field1263.field1152 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1265 != null) {
            this.field1265.method1064();
            this.field1280.method1064();
            var8 = (int) ((double) (this.field1265.field1146 - this.field1265.field1152) * 32.768D / var3);
            var9 = (int) ((double) this.field1265.field1152 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1266[var11] != 0) {
                field1282[var11] = 0;
                field1283[var11] = (int) ((double) this.field1271[var11] * var3);
                field1284[var11] = (this.field1266[var11] << 14) / 100;
                field1285[var11] = (int) ((double) (this.field1269.field1146 - this.field1269.field1152) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1270[var11]) / var3);
                field1286[var11] = (int) ((double) this.field1269.field1152 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1269.method1065(arg0);
            int var14 = this.field1262.method1065(arg0);
            if (this.field1263 != null) {
                int var15 = this.field1263.method1065(arg0);
                int var16 = this.field1274.method1065(arg0);
                var13 += this.method1347(var7, var16, this.field1263.field1144) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1265 != null) {
                int var17 = this.field1265.method1065(arg0);
                int var18 = this.field1280.method1065(arg0);
                var14 = var14 * ((this.method1347(var10, var18, this.field1265.field1144) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1266[var19] != 0) {
                    int var20 = field1283[var19] + var12;
                    if (var20 < arg0) {
                        field1281[var20] += this.method1347(field1282[var19], field1284[var19] * var14 >> 15, this.field1269.field1144);
                        field1282[var19] += (field1285[var19] * var13 >> 16) + field1286[var19];
                    }
                }
            }
        }
        if (this.field1267 != null) {
            this.field1267.method1064();
            this.field1268.method1064();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1267.method1065(arg0);
                int var26 = this.field1268.method1065(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1267.field1146 - this.field1267.field1152) * var25 >> 8) + this.field1267.field1152;
                } else {
                    var27 = ((this.field1267.field1146 - this.field1267.field1152) * var26 >> 8) + this.field1267.field1152;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1281[var24] = 0;
                }
            }
        }
        if (this.field1272 > 0 && this.field1273 > 0) {
            int var28 = (int) ((double) this.field1272 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1281[var29] += field1281[var29 - var28] * this.field1273 / 100;
            }
        }
        if (this.field1261.field1181[0] > 0 || this.field1261.field1181[1] > 0) {
            this.field1275.method1064();
            int var30 = this.field1275.method1065(arg0 + 1);
            int var31 = this.field1261.method1120(0, (float) var30 / 65536.0F);
            int var32 = this.field1261.method1120(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1281[var31 + var33] * (long) Statics.field1178 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1281[var31 + var33 - 1 - var36] * (long) class59.field1177[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1281[var33 - 1 - var37] * (long) class59.field1177[1][var37] >> 16);
                    }
                    field1281[var33] = var35;
                    var30 = this.field1275.method1065(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1281[var31 + var33] * (long) Statics.field1178 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1281[var31 + var33 - 1 - var40] * (long) class59.field1177[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1281[var33 - 1 - var41] * (long) class59.field1177[1][var41] >> 16);
                        }
                        field1281[var33] = var39;
                        var30 = this.field1275.method1065(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1281[var31 + var33 - 1 - var43] * (long) class59.field1177[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1281[var33 - 1 - var44] * (long) class59.field1177[1][var44] >> 16);
                            }
                            field1281[var33] = var42;
                            this.field1275.method1065(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1261.method1120(0, (float) var30 / 65536.0F);
                    var32 = this.field1261.method1120(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1281[var46] < -32768) {
                field1281[var46] = -32768;
            }
            if (field1281[var46] > 32767) {
                field1281[var46] = 32767;
            }
        }
        return field1281;
    }

    @ObfuscatedName("bi.k(III)I")
    public final int method1347(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1264[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1279[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bi.e(Lde;)V")
    public final void method1340(class111 arg0) {
        this.field1269 = new class53();
        this.field1269.method1062(arg0);
        this.field1262 = new class53();
        this.field1262.method1062(arg0);
        int var2 = arg0.method2314();
        if (var2 != 0) {
            arg0.field1885--;
            this.field1263 = new class53();
            this.field1263.method1062(arg0);
            this.field1274 = new class53();
            this.field1274.method1062(arg0);
        }
        int var3 = arg0.method2314();
        if (var3 != 0) {
            arg0.field1885--;
            this.field1265 = new class53();
            this.field1265.method1062(arg0);
            this.field1280 = new class53();
            this.field1280.method1062(arg0);
        }
        int var4 = arg0.method2314();
        if (var4 != 0) {
            arg0.field1885--;
            this.field1267 = new class53();
            this.field1267.method1062(arg0);
            this.field1268 = new class53();
            this.field1268.method1062(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2188();
            if (var6 == 0) {
                break;
            }
            this.field1266[var5] = var6;
            this.field1270[var5] = arg0.method2183();
            this.field1271[var5] = arg0.method2188();
        }
        this.field1272 = arg0.method2188();
        this.field1273 = arg0.method2188();
        this.field1276 = arg0.method2177();
        this.field1277 = arg0.method2177();
        this.field1261 = new class59();
        this.field1275 = new class53();
        this.field1261.method1122(arg0, this.field1275);
    }
}
