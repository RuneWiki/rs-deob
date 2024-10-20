package deob;

import java.util.Random;

@ObfuscatedName("bz")
public class class67 {

    @ObfuscatedName("bz.t")
    public class53 field1250;

    @ObfuscatedName("bz.b")
    public class53 field1255;

    @ObfuscatedName("bz.p")
    public class53 field1248;

    @ObfuscatedName("bz.e")
    public class53 field1235;

    @ObfuscatedName("bz.i")
    public class53 field1236;

    @ObfuscatedName("bz.o")
    public class53 field1242;

    @ObfuscatedName("bz.f")
    public class53 field1238;

    @ObfuscatedName("bz.d")
    public class53 field1239;

    @ObfuscatedName("bz.j")
    public int[] field1240 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bz.x")
    public int[] field1241 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bz.v")
    public int[] field1253 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bz.a")
    public int field1234 = 0;

    @ObfuscatedName("bz.l")
    public int field1244 = 100;

    @ObfuscatedName("bz.h")
    public class59 field1245;

    @ObfuscatedName("bz.c")
    public class53 field1246;

    @ObfuscatedName("bz.u")
    public int field1247 = 500;

    @ObfuscatedName("bz.r")
    public int field1249 = 0;

    @ObfuscatedName("bz.k")
    public static int[] field1251;

    @ObfuscatedName("bz.w")
    public static int[] field1233 = new int[32768];

    @ObfuscatedName("bz.q")
    public static int[] field1243;

    @ObfuscatedName("bz.z")
    public static int[] field1232;

    @ObfuscatedName("bz.m")
    public static int[] field1254;

    @ObfuscatedName("bz.y")
    public static int[] field1237;

    @ObfuscatedName("bz.n")
    public static int[] field1256;

    @ObfuscatedName("bz.s")
    public static int[] field1257;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1233[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1243 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1243[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1251 = new int[220500];
        field1232 = new int[5];
        field1254 = new int[5];
        field1237 = new int[5];
        field1256 = new int[5];
        field1257 = new int[5];
    }

    @ObfuscatedName("bz.t(II)[I")
    public final int[] method1381(int arg0, int arg1) {
        class112.method2386(field1251, 0, arg0);
        if (arg1 < 10) {
            return field1251;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1250.method1121();
        this.field1255.method1121();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1248 != null) {
            this.field1248.method1121();
            this.field1235.method1121();
            var5 = (int) ((double) (this.field1248.field1117 - this.field1248.field1116) * 32.768D / var3);
            var6 = (int) ((double) this.field1248.field1116 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1236 != null) {
            this.field1236.method1121();
            this.field1242.method1121();
            var8 = (int) ((double) (this.field1236.field1117 - this.field1236.field1116) * 32.768D / var3);
            var9 = (int) ((double) this.field1236.field1116 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1240[var11] != 0) {
                field1232[var11] = 0;
                field1254[var11] = (int) ((double) this.field1253[var11] * var3);
                field1237[var11] = (this.field1240[var11] << 14) / 100;
                field1256[var11] = (int) ((double) (this.field1250.field1117 - this.field1250.field1116) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1241[var11]) / var3);
                field1257[var11] = (int) ((double) this.field1250.field1116 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1250.method1118(arg0);
            int var14 = this.field1255.method1118(arg0);
            if (this.field1248 != null) {
                int var15 = this.field1248.method1118(arg0);
                int var16 = this.field1235.method1118(arg0);
                var13 += this.method1382(var7, var16, this.field1248.field1118) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1236 != null) {
                int var17 = this.field1236.method1118(arg0);
                int var18 = this.field1242.method1118(arg0);
                var14 = var14 * ((this.method1382(var10, var18, this.field1236.field1118) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1240[var19] != 0) {
                    int var20 = field1254[var19] + var12;
                    if (var20 < arg0) {
                        field1251[var20] += this.method1382(field1232[var19], field1237[var19] * var14 >> 15, this.field1250.field1118);
                        field1232[var19] += (field1256[var19] * var13 >> 16) + field1257[var19];
                    }
                }
            }
        }
        if (this.field1238 != null) {
            this.field1238.method1121();
            this.field1239.method1121();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1238.method1118(arg0);
                int var26 = this.field1239.method1118(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1238.field1117 - this.field1238.field1116) * var25 >> 8) + this.field1238.field1116;
                } else {
                    var27 = ((this.field1238.field1117 - this.field1238.field1116) * var26 >> 8) + this.field1238.field1116;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1251[var24] = 0;
                }
            }
        }
        if (this.field1234 > 0 && this.field1244 > 0) {
            int var28 = (int) ((double) this.field1234 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1251[var29] += field1251[var29 - var28] * this.field1244 / 100;
            }
        }
        if (this.field1245.field1157[0] > 0 || this.field1245.field1157[1] > 0) {
            this.field1246.method1121();
            int var30 = this.field1246.method1118(arg0 + 1);
            int var31 = this.field1245.method1170(0, (float) var30 / 65536.0F);
            int var32 = this.field1245.method1170(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1251[var31 + var33] * (long) Statics.field1154 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1251[var31 + var33 - 1 - var36] * (long) class59.field1152[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1251[var33 - 1 - var37] * (long) class59.field1152[1][var37] >> 16);
                    }
                    field1251[var33] = var35;
                    var30 = this.field1246.method1118(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1251[var31 + var33] * (long) Statics.field1154 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1251[var31 + var33 - 1 - var40] * (long) class59.field1152[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1251[var33 - 1 - var41] * (long) class59.field1152[1][var41] >> 16);
                        }
                        field1251[var33] = var39;
                        var30 = this.field1246.method1118(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1251[var31 + var33 - 1 - var43] * (long) class59.field1152[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1251[var33 - 1 - var44] * (long) class59.field1152[1][var44] >> 16);
                            }
                            field1251[var33] = var42;
                            this.field1246.method1118(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1245.method1170(0, (float) var30 / 65536.0F);
                    var32 = this.field1245.method1170(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1251[var46] < -32768) {
                field1251[var46] = -32768;
            }
            if (field1251[var46] > 32767) {
                field1251[var46] = 32767;
            }
        }
        return field1251;
    }

    @ObfuscatedName("bz.b(III)I")
    public final int method1382(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1243[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1233[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bz.p(Ldc;)V")
    public final void method1390(class111 arg0) {
        this.field1250 = new class53();
        this.field1250.method1115(arg0);
        this.field1255 = new class53();
        this.field1255.method1115(arg0);
        int var2 = arg0.method2172();
        if (var2 != 0) {
            arg0.field1867--;
            this.field1248 = new class53();
            this.field1248.method1115(arg0);
            this.field1235 = new class53();
            this.field1235.method1115(arg0);
        }
        int var3 = arg0.method2172();
        if (var3 != 0) {
            arg0.field1867--;
            this.field1236 = new class53();
            this.field1236.method1115(arg0);
            this.field1242 = new class53();
            this.field1242.method1115(arg0);
        }
        int var4 = arg0.method2172();
        if (var4 != 0) {
            arg0.field1867--;
            this.field1238 = new class53();
            this.field1238.method1115(arg0);
            this.field1239 = new class53();
            this.field1239.method1115(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2185();
            if (var6 == 0) {
                break;
            }
            this.field1240[var5] = var6;
            this.field1241[var5] = arg0.method2184();
            this.field1253[var5] = arg0.method2185();
        }
        this.field1234 = arg0.method2185();
        this.field1244 = arg0.method2185();
        this.field1247 = arg0.method2255();
        this.field1249 = arg0.method2255();
        this.field1245 = new class59();
        this.field1246 = new class53();
        this.field1245.method1167(arg0, this.field1246);
    }
}
