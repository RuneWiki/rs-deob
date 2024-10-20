package deob;

import java.util.Random;

@ObfuscatedName("bq")
public class class67 {

    @ObfuscatedName("bq.n")
    public class53 field1253;

    @ObfuscatedName("bq.w")
    public class53 field1277;

    @ObfuscatedName("bq.i")
    public class53 field1273;

    @ObfuscatedName("bq.e")
    public class53 field1255;

    @ObfuscatedName("bq.h")
    public class53 field1254;

    @ObfuscatedName("bq.q")
    public class53 field1257;

    @ObfuscatedName("bq.l")
    public class53 field1258;

    @ObfuscatedName("bq.c")
    public class53 field1265;

    @ObfuscatedName("bq.f")
    public int[] field1266 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bq.s")
    public int[] field1261 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bq.m")
    public int[] field1260 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bq.y")
    public int field1263 = 0;

    @ObfuscatedName("bq.b")
    public int field1264 = 100;

    @ObfuscatedName("bq.v")
    public class59 field1252;

    @ObfuscatedName("bq.z")
    public class53 field1259;

    @ObfuscatedName("bq.u")
    public int field1267 = 500;

    @ObfuscatedName("bq.g")
    public int field1268 = 0;

    @ObfuscatedName("bq.k")
    public static int[] field1269;

    @ObfuscatedName("bq.o")
    public static int[] field1270 = new int[32768];

    @ObfuscatedName("bq.a")
    public static int[] field1271;

    @ObfuscatedName("bq.t")
    public static int[] field1262;

    @ObfuscatedName("bq.x")
    public static int[] field1274;

    @ObfuscatedName("bq.d")
    public static int[] field1275;

    @ObfuscatedName("bq.j")
    public static int[] field1276;

    @ObfuscatedName("bq.r")
    public static int[] field1272;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1270[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1271 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1271[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1269 = new int[220500];
        field1262 = new int[5];
        field1274 = new int[5];
        field1275 = new int[5];
        field1276 = new int[5];
        field1272 = new int[5];
    }

    @ObfuscatedName("bq.n(II)[I")
    public final int[] method1331(int arg0, int arg1) {
        class112.method2371(field1269, 0, arg0);
        if (arg1 < 10) {
            return field1269;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1253.method1076();
        this.field1277.method1076();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1273 != null) {
            this.field1273.method1076();
            this.field1255.method1076();
            var5 = (int) ((double) (this.field1273.field1127 - this.field1273.field1130) * 32.768D / var3);
            var6 = (int) ((double) this.field1273.field1130 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1254 != null) {
            this.field1254.method1076();
            this.field1257.method1076();
            var8 = (int) ((double) (this.field1254.field1127 - this.field1254.field1130) * 32.768D / var3);
            var9 = (int) ((double) this.field1254.field1130 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1266[var11] != 0) {
                field1262[var11] = 0;
                field1274[var11] = (int) ((double) this.field1260[var11] * var3);
                field1275[var11] = (this.field1266[var11] << 14) / 100;
                field1276[var11] = (int) ((double) (this.field1253.field1127 - this.field1253.field1130) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1261[var11]) / var3);
                field1272[var11] = (int) ((double) this.field1253.field1130 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1253.method1072(arg0);
            int var14 = this.field1277.method1072(arg0);
            if (this.field1273 != null) {
                int var15 = this.field1273.method1072(arg0);
                int var16 = this.field1255.method1072(arg0);
                var13 += this.method1329(var7, var16, this.field1273.field1132) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1254 != null) {
                int var17 = this.field1254.method1072(arg0);
                int var18 = this.field1257.method1072(arg0);
                var14 = var14 * ((this.method1329(var10, var18, this.field1254.field1132) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1266[var19] != 0) {
                    int var20 = field1274[var19] + var12;
                    if (var20 < arg0) {
                        field1269[var20] += this.method1329(field1262[var19], field1275[var19] * var14 >> 15, this.field1253.field1132);
                        field1262[var19] += (field1276[var19] * var13 >> 16) + field1272[var19];
                    }
                }
            }
        }
        if (this.field1258 != null) {
            this.field1258.method1076();
            this.field1265.method1076();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1258.method1072(arg0);
                int var26 = this.field1265.method1072(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1258.field1127 - this.field1258.field1130) * var25 >> 8) + this.field1258.field1130;
                } else {
                    var27 = ((this.field1258.field1127 - this.field1258.field1130) * var26 >> 8) + this.field1258.field1130;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1269[var24] = 0;
                }
            }
        }
        if (this.field1263 > 0 && this.field1264 > 0) {
            int var28 = (int) ((double) this.field1263 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1269[var29] += field1269[var29 - var28] * this.field1264 / 100;
            }
        }
        if (this.field1252.field1171[0] > 0 || this.field1252.field1171[1] > 0) {
            this.field1259.method1076();
            int var30 = this.field1259.method1072(arg0 + 1);
            int var31 = this.field1252.method1126(0, (float) var30 / 65536.0F);
            int var32 = this.field1252.method1126(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1269[var31 + var33] * (long) Statics.field1166 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1269[var31 + var33 - 1 - var36] * (long) class59.field1176[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1269[var33 - 1 - var37] * (long) class59.field1176[1][var37] >> 16);
                    }
                    field1269[var33] = var35;
                    var30 = this.field1259.method1072(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1269[var31 + var33] * (long) Statics.field1166 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1269[var31 + var33 - 1 - var40] * (long) class59.field1176[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1269[var33 - 1 - var41] * (long) class59.field1176[1][var41] >> 16);
                        }
                        field1269[var33] = var39;
                        var30 = this.field1259.method1072(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1269[var31 + var33 - 1 - var43] * (long) class59.field1176[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1269[var33 - 1 - var44] * (long) class59.field1176[1][var44] >> 16);
                            }
                            field1269[var33] = var42;
                            this.field1259.method1072(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1252.method1126(0, (float) var30 / 65536.0F);
                    var32 = this.field1252.method1126(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1269[var46] < -32768) {
                field1269[var46] = -32768;
            }
            if (field1269[var46] > 32767) {
                field1269[var46] = 32767;
            }
        }
        return field1269;
    }

    @ObfuscatedName("bq.w(III)I")
    public final int method1329(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1271[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1270[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bq.i(Ldo;)V")
    public final void method1330(class111 arg0) {
        this.field1253 = new class53();
        this.field1253.method1070(arg0);
        this.field1277 = new class53();
        this.field1277.method1070(arg0);
        int var2 = arg0.method2155();
        if (var2 != 0) {
            arg0.field1888--;
            this.field1273 = new class53();
            this.field1273.method1070(arg0);
            this.field1255 = new class53();
            this.field1255.method1070(arg0);
        }
        int var3 = arg0.method2155();
        if (var3 != 0) {
            arg0.field1888--;
            this.field1254 = new class53();
            this.field1254.method1070(arg0);
            this.field1257 = new class53();
            this.field1257.method1070(arg0);
        }
        int var4 = arg0.method2155();
        if (var4 != 0) {
            arg0.field1888--;
            this.field1258 = new class53();
            this.field1258.method1070(arg0);
            this.field1265 = new class53();
            this.field1265.method1070(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2168();
            if (var6 == 0) {
                break;
            }
            this.field1266[var5] = var6;
            this.field1261[var5] = arg0.method2167();
            this.field1260[var5] = arg0.method2168();
        }
        this.field1263 = arg0.method2168();
        this.field1264 = arg0.method2168();
        this.field1267 = arg0.method2157();
        this.field1268 = arg0.method2157();
        this.field1252 = new class59();
        this.field1259 = new class53();
        this.field1252.method1124(arg0, this.field1259);
    }
}
