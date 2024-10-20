package deob;

import java.util.Random;

@ObfuscatedName("bs")
public class class67 {

    @ObfuscatedName("bs.n")
    public class53 field1294;

    @ObfuscatedName("bs.g")
    public class53 field1278;

    @ObfuscatedName("bs.a")
    public class53 field1279;

    @ObfuscatedName("bs.m")
    public class53 field1280;

    @ObfuscatedName("bs.s")
    public class53 field1281;

    @ObfuscatedName("bs.j")
    public class53 field1282;

    @ObfuscatedName("bs.f")
    public class53 field1293;

    @ObfuscatedName("bs.b")
    public class53 field1284;

    @ObfuscatedName("bs.t")
    public int[] field1283 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bs.i")
    public int[] field1301 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bs.c")
    public int[] field1287 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bs.k")
    public int field1298 = 0;

    @ObfuscatedName("bs.x")
    public int field1289 = 100;

    @ObfuscatedName("bs.e")
    public class59 field1277;

    @ObfuscatedName("bs.q")
    public class53 field1291;

    @ObfuscatedName("bs.o")
    public int field1292 = 500;

    @ObfuscatedName("bs.r")
    public int field1288 = 0;

    @ObfuscatedName("bs.v")
    public static int[] field1299;

    @ObfuscatedName("bs.h")
    public static int[] field1295 = new int[32768];

    @ObfuscatedName("bs.p")
    public static int[] field1296;

    @ObfuscatedName("bs.z")
    public static int[] field1286;

    @ObfuscatedName("bs.u")
    public static int[] field1285;

    @ObfuscatedName("bs.w")
    public static int[] field1300;

    @ObfuscatedName("bs.d")
    public static int[] field1290;

    @ObfuscatedName("bs.l")
    public static int[] field1302;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1295[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1296 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1296[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1299 = new int[220500];
        field1286 = new int[5];
        field1285 = new int[5];
        field1300 = new int[5];
        field1290 = new int[5];
        field1302 = new int[5];
    }

    @ObfuscatedName("bs.n(II)[I")
    public final int[] method1387(int arg0, int arg1) {
        class112.method2411(field1299, 0, arg0);
        if (arg1 < 10) {
            return field1299;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1294.method1078();
        this.field1278.method1078();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1279 != null) {
            this.field1279.method1078();
            this.field1280.method1078();
            var5 = (int) ((double) (this.field1279.field1155 - this.field1279.field1159) * 32.768D / var3);
            var6 = (int) ((double) this.field1279.field1159 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1281 != null) {
            this.field1281.method1078();
            this.field1282.method1078();
            var8 = (int) ((double) (this.field1281.field1155 - this.field1281.field1159) * 32.768D / var3);
            var9 = (int) ((double) this.field1281.field1159 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1283[var11] != 0) {
                field1286[var11] = 0;
                field1285[var11] = (int) ((double) this.field1287[var11] * var3);
                field1300[var11] = (this.field1283[var11] << 14) / 100;
                field1290[var11] = (int) ((double) (this.field1294.field1155 - this.field1294.field1159) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1301[var11]) / var3);
                field1302[var11] = (int) ((double) this.field1294.field1159 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1294.method1082(arg0);
            int var14 = this.field1278.method1082(arg0);
            if (this.field1279 != null) {
                int var15 = this.field1279.method1082(arg0);
                int var16 = this.field1280.method1082(arg0);
                var13 += this.method1388(var7, var16, this.field1279.field1160) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1281 != null) {
                int var17 = this.field1281.method1082(arg0);
                int var18 = this.field1282.method1082(arg0);
                var14 = var14 * ((this.method1388(var10, var18, this.field1281.field1160) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1283[var19] != 0) {
                    int var20 = field1285[var19] + var12;
                    if (var20 < arg0) {
                        field1299[var20] += this.method1388(field1286[var19], field1300[var19] * var14 >> 15, this.field1294.field1160);
                        field1286[var19] += (field1290[var19] * var13 >> 16) + field1302[var19];
                    }
                }
            }
        }
        if (this.field1293 != null) {
            this.field1293.method1078();
            this.field1284.method1078();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1293.method1082(arg0);
                int var26 = this.field1284.method1082(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1293.field1155 - this.field1293.field1159) * var25 >> 8) + this.field1293.field1159;
                } else {
                    var27 = ((this.field1293.field1155 - this.field1293.field1159) * var26 >> 8) + this.field1293.field1159;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1299[var24] = 0;
                }
            }
        }
        if (this.field1298 > 0 && this.field1289 > 0) {
            int var28 = (int) ((double) this.field1298 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1299[var29] += field1299[var29 - var28] * this.field1289 / 100;
            }
        }
        if (this.field1277.field1194[0] > 0 || this.field1277.field1194[1] > 0) {
            this.field1291.method1078();
            int var30 = this.field1291.method1082(arg0 + 1);
            int var31 = this.field1277.method1145(0, (float) var30 / 65536.0F);
            int var32 = this.field1277.method1145(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1299[var31 + var33] * (long) Statics.field1199 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1299[var31 + var33 - 1 - var36] * (long) class59.field1191[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1299[var33 - 1 - var37] * (long) class59.field1191[1][var37] >> 16);
                    }
                    field1299[var33] = var35;
                    var30 = this.field1291.method1082(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1299[var31 + var33] * (long) Statics.field1199 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1299[var31 + var33 - 1 - var40] * (long) class59.field1191[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1299[var33 - 1 - var41] * (long) class59.field1191[1][var41] >> 16);
                        }
                        field1299[var33] = var39;
                        var30 = this.field1291.method1082(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1299[var31 + var33 - 1 - var43] * (long) class59.field1191[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1299[var33 - 1 - var44] * (long) class59.field1191[1][var44] >> 16);
                            }
                            field1299[var33] = var42;
                            this.field1291.method1082(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1277.method1145(0, (float) var30 / 65536.0F);
                    var32 = this.field1277.method1145(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1299[var46] < -32768) {
                field1299[var46] = -32768;
            }
            if (field1299[var46] > 32767) {
                field1299[var46] = 32767;
            }
        }
        return field1299;
    }

    @ObfuscatedName("bs.g(III)I")
    public final int method1388(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1296[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1295[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bs.a(Ldp;)V")
    public final void method1389(class111 arg0) {
        this.field1294 = new class53();
        this.field1294.method1081(arg0);
        this.field1278 = new class53();
        this.field1278.method1081(arg0);
        int var2 = arg0.method2211();
        if (var2 != 0) {
            arg0.field1896--;
            this.field1279 = new class53();
            this.field1279.method1081(arg0);
            this.field1280 = new class53();
            this.field1280.method1081(arg0);
        }
        int var3 = arg0.method2211();
        if (var3 != 0) {
            arg0.field1896--;
            this.field1281 = new class53();
            this.field1281.method1081(arg0);
            this.field1282 = new class53();
            this.field1282.method1081(arg0);
        }
        int var4 = arg0.method2211();
        if (var4 != 0) {
            arg0.field1896--;
            this.field1293 = new class53();
            this.field1293.method1081(arg0);
            this.field1284 = new class53();
            this.field1284.method1081(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2378();
            if (var6 == 0) {
                break;
            }
            this.field1283[var5] = var6;
            this.field1301[var5] = arg0.method2207();
            this.field1287[var5] = arg0.method2378();
        }
        this.field1298 = arg0.method2378();
        this.field1289 = arg0.method2378();
        this.field1292 = arg0.method2395();
        this.field1288 = arg0.method2395();
        this.field1277 = new class59();
        this.field1291 = new class53();
        this.field1277.method1146(arg0, this.field1291);
    }
}
