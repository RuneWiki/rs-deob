package deob;

import java.util.Random;

@ObfuscatedName("bi")
public class class67 {

    @ObfuscatedName("bi.o")
    public class53 field1250;

    @ObfuscatedName("bi.l")
    public class53 field1246;

    @ObfuscatedName("bi.g")
    public class53 field1247;

    @ObfuscatedName("bi.u")
    public class53 field1255;

    @ObfuscatedName("bi.q")
    public class53 field1245;

    @ObfuscatedName("bi.r")
    public class53 field1267;

    @ObfuscatedName("bi.v")
    public class53 field1251;

    @ObfuscatedName("bi.y")
    public class53 field1252;

    @ObfuscatedName("bi.k")
    public int[] field1253 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bi.c")
    public int[] field1254 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bi.j")
    public int[] field1262 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bi.m")
    public int field1270 = 0;

    @ObfuscatedName("bi.a")
    public int field1257 = 100;

    @ObfuscatedName("bi.f")
    public class59 field1258;

    @ObfuscatedName("bi.i")
    public class53 field1259;

    @ObfuscatedName("bi.n")
    public int field1268 = 500;

    @ObfuscatedName("bi.x")
    public int field1261 = 0;

    @ObfuscatedName("bi.h")
    public static int[] field1248;

    @ObfuscatedName("bi.t")
    public static int[] field1263 = new int[32768];

    @ObfuscatedName("bi.w")
    public static int[] field1264;

    @ObfuscatedName("bi.z")
    public static int[] field1266;

    @ObfuscatedName("bi.s")
    public static int[] field1260;

    @ObfuscatedName("bi.d")
    public static int[] field1256;

    @ObfuscatedName("bi.b")
    public static int[] field1269;

    @ObfuscatedName("bi.e")
    public static int[] field1249;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1263[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1264 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1264[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1248 = new int[220500];
        field1266 = new int[5];
        field1260 = new int[5];
        field1256 = new int[5];
        field1269 = new int[5];
        field1249 = new int[5];
    }

    @ObfuscatedName("bi.o(II)[I")
    public final int[] method1362(int arg0, int arg1) {
        class112.method2450(field1248, 0, arg0);
        if (arg1 < 10) {
            return field1248;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1250.method1110();
        this.field1246.method1110();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1247 != null) {
            this.field1247.method1110();
            this.field1255.method1110();
            var5 = (int) ((double) (this.field1247.field1123 - this.field1247.field1120) * 32.768D / var3);
            var6 = (int) ((double) this.field1247.field1120 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1245 != null) {
            this.field1245.method1110();
            this.field1267.method1110();
            var8 = (int) ((double) (this.field1245.field1123 - this.field1245.field1120) * 32.768D / var3);
            var9 = (int) ((double) this.field1245.field1120 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1253[var11] != 0) {
                field1266[var11] = 0;
                field1260[var11] = (int) ((double) this.field1262[var11] * var3);
                field1256[var11] = (this.field1253[var11] << 14) / 100;
                field1269[var11] = (int) ((double) (this.field1250.field1123 - this.field1250.field1120) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1254[var11]) / var3);
                field1249[var11] = (int) ((double) this.field1250.field1120 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1250.method1113(arg0);
            int var14 = this.field1246.method1113(arg0);
            if (this.field1247 != null) {
                int var15 = this.field1247.method1113(arg0);
                int var16 = this.field1255.method1113(arg0);
                var13 += this.method1363(var7, var16, this.field1247.field1125) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1245 != null) {
                int var17 = this.field1245.method1113(arg0);
                int var18 = this.field1267.method1113(arg0);
                var14 = var14 * ((this.method1363(var10, var18, this.field1245.field1125) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1253[var19] != 0) {
                    int var20 = field1260[var19] + var12;
                    if (var20 < arg0) {
                        field1248[var20] += this.method1363(field1266[var19], field1256[var19] * var14 >> 15, this.field1250.field1125);
                        field1266[var19] += (field1269[var19] * var13 >> 16) + field1249[var19];
                    }
                }
            }
        }
        if (this.field1251 != null) {
            this.field1251.method1110();
            this.field1252.method1110();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1251.method1113(arg0);
                int var26 = this.field1252.method1113(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1251.field1123 - this.field1251.field1120) * var25 >> 8) + this.field1251.field1120;
                } else {
                    var27 = ((this.field1251.field1123 - this.field1251.field1120) * var26 >> 8) + this.field1251.field1120;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1248[var24] = 0;
                }
            }
        }
        if (this.field1270 > 0 && this.field1257 > 0) {
            int var28 = (int) ((double) this.field1270 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1248[var29] += field1248[var29 - var28] * this.field1257 / 100;
            }
        }
        if (this.field1258.field1166[0] > 0 || this.field1258.field1166[1] > 0) {
            this.field1259.method1110();
            int var30 = this.field1259.method1113(arg0 + 1);
            int var31 = this.field1258.method1167(0, (float) var30 / 65536.0F);
            int var32 = this.field1258.method1167(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1248[var31 + var33] * (long) Statics.field1167 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1248[var31 + var33 - 1 - var36] * (long) class59.field1165[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1248[var33 - 1 - var37] * (long) class59.field1165[1][var37] >> 16);
                    }
                    field1248[var33] = var35;
                    var30 = this.field1259.method1113(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1248[var31 + var33] * (long) Statics.field1167 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1248[var31 + var33 - 1 - var40] * (long) class59.field1165[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1248[var33 - 1 - var41] * (long) class59.field1165[1][var41] >> 16);
                        }
                        field1248[var33] = var39;
                        var30 = this.field1259.method1113(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1248[var31 + var33 - 1 - var43] * (long) class59.field1165[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1248[var33 - 1 - var44] * (long) class59.field1165[1][var44] >> 16);
                            }
                            field1248[var33] = var42;
                            this.field1259.method1113(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1258.method1167(0, (float) var30 / 65536.0F);
                    var32 = this.field1258.method1167(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1248[var46] < -32768) {
                field1248[var46] = -32768;
            }
            if (field1248[var46] > 32767) {
                field1248[var46] = 32767;
            }
        }
        return field1248;
    }

    @ObfuscatedName("bi.l(III)I")
    public final int method1363(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1264[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1263[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bi.g(Ldk;)V")
    public final void method1364(class111 arg0) {
        this.field1250 = new class53();
        this.field1250.method1111(arg0);
        this.field1246 = new class53();
        this.field1246.method1111(arg0);
        int var2 = arg0.method2219();
        if (var2 != 0) {
            arg0.field1861--;
            this.field1247 = new class53();
            this.field1247.method1111(arg0);
            this.field1255 = new class53();
            this.field1255.method1111(arg0);
        }
        int var3 = arg0.method2219();
        if (var3 != 0) {
            arg0.field1861--;
            this.field1245 = new class53();
            this.field1245.method1111(arg0);
            this.field1267 = new class53();
            this.field1267.method1111(arg0);
        }
        int var4 = arg0.method2219();
        if (var4 != 0) {
            arg0.field1861--;
            this.field1251 = new class53();
            this.field1251.method1111(arg0);
            this.field1252 = new class53();
            this.field1252.method1111(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2368();
            if (var6 == 0) {
                break;
            }
            this.field1253[var5] = var6;
            this.field1254[var5] = arg0.method2231();
            this.field1262[var5] = arg0.method2368();
        }
        this.field1270 = arg0.method2368();
        this.field1257 = arg0.method2368();
        this.field1268 = arg0.method2397();
        this.field1261 = arg0.method2397();
        this.field1258 = new class59();
        this.field1259 = new class53();
        this.field1258.method1168(arg0, this.field1259);
    }
}
