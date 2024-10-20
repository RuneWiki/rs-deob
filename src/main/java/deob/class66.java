package deob;

import java.util.Random;

@ObfuscatedName("bl")
public class class66 {

    @ObfuscatedName("bl.x")
    public class52 field1255;

    @ObfuscatedName("bl.v")
    public class52 field1236;

    @ObfuscatedName("bl.m")
    public class52 field1237;

    @ObfuscatedName("bl.e")
    public class52 field1238;

    @ObfuscatedName("bl.h")
    public class52 field1235;

    @ObfuscatedName("bl.p")
    public class52 field1246;

    @ObfuscatedName("bl.j")
    public class52 field1247;

    @ObfuscatedName("bl.i")
    public class52 field1242;

    @ObfuscatedName("bl.u")
    public int[] field1243 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bl.l")
    public int[] field1260 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bl.k")
    public int[] field1241 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bl.q")
    public int field1248 = 0;

    @ObfuscatedName("bl.b")
    public int field1239 = 100;

    @ObfuscatedName("bl.w")
    public class58 field1245;

    @ObfuscatedName("bl.g")
    public class52 field1249;

    @ObfuscatedName("bl.s")
    public int field1244 = 500;

    @ObfuscatedName("bl.c")
    public int field1251 = 0;

    @ObfuscatedName("bl.r")
    public static int[] field1252;

    @ObfuscatedName("bl.f")
    public static int[] field1253 = new int[32768];

    @ObfuscatedName("bl.t")
    public static int[] field1254;

    @ObfuscatedName("bl.z")
    public static int[] field1256;

    @ObfuscatedName("bl.d")
    public static int[] field1257;

    @ObfuscatedName("bl.y")
    public static int[] field1258;

    @ObfuscatedName("bl.a")
    public static int[] field1259;

    @ObfuscatedName("bl.n")
    public static int[] field1250;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1253[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1254 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1254[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1252 = new int[220500];
        field1256 = new int[5];
        field1257 = new int[5];
        field1258 = new int[5];
        field1259 = new int[5];
        field1250 = new int[5];
    }

    @ObfuscatedName("bl.x(II)[I")
    public final int[] method1326(int arg0, int arg1) {
        class109.method2349(field1252, 0, arg0);
        if (arg1 < 10) {
            return field1252;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1255.method1064();
        this.field1236.method1064();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1237 != null) {
            this.field1237.method1064();
            this.field1238.method1064();
            var5 = (int) ((double) (this.field1237.field1108 - this.field1237.field1112) * 32.768D / var3);
            var6 = (int) ((double) this.field1237.field1112 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1235 != null) {
            this.field1235.method1064();
            this.field1246.method1064();
            var8 = (int) ((double) (this.field1235.field1108 - this.field1235.field1112) * 32.768D / var3);
            var9 = (int) ((double) this.field1235.field1112 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1243[var11] != 0) {
                field1256[var11] = 0;
                field1257[var11] = (int) ((double) this.field1241[var11] * var3);
                field1258[var11] = (this.field1243[var11] << 14) / 100;
                field1259[var11] = (int) ((double) (this.field1255.field1108 - this.field1255.field1112) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1260[var11]) / var3);
                field1250[var11] = (int) ((double) this.field1255.field1112 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1255.method1065(arg0);
            int var14 = this.field1236.method1065(arg0);
            if (this.field1237 != null) {
                int var15 = this.field1237.method1065(arg0);
                int var16 = this.field1238.method1065(arg0);
                var13 += this.method1318(var7, var16, this.field1237.field1109) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1235 != null) {
                int var17 = this.field1235.method1065(arg0);
                int var18 = this.field1246.method1065(arg0);
                var14 = var14 * ((this.method1318(var10, var18, this.field1235.field1109) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1243[var19] != 0) {
                    int var20 = field1257[var19] + var12;
                    if (var20 < arg0) {
                        field1252[var20] += this.method1318(field1256[var19], field1258[var19] * var14 >> 15, this.field1255.field1109);
                        field1256[var19] += (field1259[var19] * var13 >> 16) + field1250[var19];
                    }
                }
            }
        }
        if (this.field1247 != null) {
            this.field1247.method1064();
            this.field1242.method1064();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1247.method1065(arg0);
                int var26 = this.field1242.method1065(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1247.field1108 - this.field1247.field1112) * var25 >> 8) + this.field1247.field1112;
                } else {
                    var27 = ((this.field1247.field1108 - this.field1247.field1112) * var26 >> 8) + this.field1247.field1112;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1252[var24] = 0;
                }
            }
        }
        if (this.field1248 > 0 && this.field1239 > 0) {
            int var28 = (int) ((double) this.field1248 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1252[var29] += field1252[var29 - var28] * this.field1239 / 100;
            }
        }
        if (this.field1245.field1151[0] > 0 || this.field1245.field1151[1] > 0) {
            this.field1249.method1064();
            int var30 = this.field1249.method1065(arg0 + 1);
            int var31 = this.field1245.method1117(0, (float) var30 / 65536.0F);
            int var32 = this.field1245.method1117(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1252[var31 + var33] * (long) Statics.field1157 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1252[var31 + var33 - 1 - var36] * (long) class58.field1154[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1252[var33 - 1 - var37] * (long) class58.field1154[1][var37] >> 16);
                    }
                    field1252[var33] = var35;
                    var30 = this.field1249.method1065(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1252[var31 + var33] * (long) Statics.field1157 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1252[var31 + var33 - 1 - var40] * (long) class58.field1154[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1252[var33 - 1 - var41] * (long) class58.field1154[1][var41] >> 16);
                        }
                        field1252[var33] = var39;
                        var30 = this.field1249.method1065(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1252[var31 + var33 - 1 - var43] * (long) class58.field1154[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1252[var33 - 1 - var44] * (long) class58.field1154[1][var44] >> 16);
                            }
                            field1252[var33] = var42;
                            this.field1249.method1065(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1245.method1117(0, (float) var30 / 65536.0F);
                    var32 = this.field1245.method1117(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1252[var46] < -32768) {
                field1252[var46] = -32768;
            }
            if (field1252[var46] > 32767) {
                field1252[var46] = 32767;
            }
        }
        return field1252;
    }

    @ObfuscatedName("bl.v(III)I")
    public final int method1318(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1254[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1253[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bl.m(Ldm;)V")
    public final void method1319(class108 arg0) {
        this.field1255 = new class52();
        this.field1255.method1057(arg0);
        this.field1236 = new class52();
        this.field1236.method1057(arg0);
        int var2 = arg0.method2299();
        if (var2 != 0) {
            arg0.field1841--;
            this.field1237 = new class52();
            this.field1237.method1057(arg0);
            this.field1238 = new class52();
            this.field1238.method1057(arg0);
        }
        int var3 = arg0.method2299();
        if (var3 != 0) {
            arg0.field1841--;
            this.field1235 = new class52();
            this.field1235.method1057(arg0);
            this.field1246 = new class52();
            this.field1246.method1057(arg0);
        }
        int var4 = arg0.method2299();
        if (var4 != 0) {
            arg0.field1841--;
            this.field1247 = new class52();
            this.field1247.method1057(arg0);
            this.field1242 = new class52();
            this.field1242.method1057(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2125();
            if (var6 == 0) {
                break;
            }
            this.field1243[var5] = var6;
            this.field1260[var5] = arg0.method2139();
            this.field1241[var5] = arg0.method2125();
        }
        this.field1248 = arg0.method2125();
        this.field1239 = arg0.method2125();
        this.field1244 = arg0.method2129();
        this.field1251 = arg0.method2129();
        this.field1245 = new class58();
        this.field1249 = new class52();
        this.field1245.method1115(arg0, this.field1249);
    }
}
