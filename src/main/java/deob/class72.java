package deob;

import java.util.Random;

@ObfuscatedName("bh")
public class class72 {

    @ObfuscatedName("bh.m")
    public class58 field1291;

    @ObfuscatedName("bh.l")
    public class58 field1284;

    @ObfuscatedName("bh.y")
    public class58 field1278;

    @ObfuscatedName("bh.u")
    public class58 field1281;

    @ObfuscatedName("bh.k")
    public class58 field1282;

    @ObfuscatedName("bh.j")
    public class58 field1290;

    @ObfuscatedName("bh.i")
    public class58 field1280;

    @ObfuscatedName("bh.x")
    public class58 field1294;

    @ObfuscatedName("bh.g")
    public int[] field1285 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bh.e")
    public int[] field1287 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bh.p")
    public int[] field1288 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bh.a")
    public int field1289 = 0;

    @ObfuscatedName("bh.v")
    public int field1279 = 100;

    @ObfuscatedName("bh.c")
    public class64 field1286;

    @ObfuscatedName("bh.s")
    public class58 field1292;

    @ObfuscatedName("bh.r")
    public int field1293 = 500;

    @ObfuscatedName("bh.h")
    public int field1296 = 0;

    @ObfuscatedName("bh.n")
    public static int[] field1295;

    @ObfuscatedName("bh.b")
    public static int[] field1283 = new int[32768];

    @ObfuscatedName("bh.f")
    public static int[] field1297;

    @ObfuscatedName("bh.q")
    public static int[] field1299;

    @ObfuscatedName("bh.o")
    public static int[] field1300;

    @ObfuscatedName("bh.w")
    public static int[] field1301;

    @ObfuscatedName("bh.z")
    public static int[] field1302;

    @ObfuscatedName("bh.t")
    public static int[] field1303;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1283[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1297 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1297[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1295 = new int[220500];
        field1299 = new int[5];
        field1300 = new int[5];
        field1301 = new int[5];
        field1302 = new int[5];
        field1303 = new int[5];
    }

    @ObfuscatedName("bh.m(II)[I")
    public final int[] method1520(int arg0, int arg1) {
        class120.method2602(field1295, 0, arg0);
        if (arg1 < 10) {
            return field1295;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1291.method1227();
        this.field1284.method1227();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1278 != null) {
            this.field1278.method1227();
            this.field1281.method1227();
            var5 = (int) ((double) (this.field1278.field1162 - this.field1278.field1158) * 32.768D / var3);
            var6 = (int) ((double) this.field1278.field1158 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1282 != null) {
            this.field1282.method1227();
            this.field1290.method1227();
            var8 = (int) ((double) (this.field1282.field1162 - this.field1282.field1158) * 32.768D / var3);
            var9 = (int) ((double) this.field1282.field1158 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1285[var11] != 0) {
                field1299[var11] = 0;
                field1300[var11] = (int) ((double) this.field1288[var11] * var3);
                field1301[var11] = (this.field1285[var11] << 14) / 100;
                field1302[var11] = (int) ((double) (this.field1291.field1162 - this.field1291.field1158) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1287[var11]) / var3);
                field1303[var11] = (int) ((double) this.field1291.field1158 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1291.method1230(arg0);
            int var14 = this.field1284.method1230(arg0);
            if (this.field1278 != null) {
                int var15 = this.field1278.method1230(arg0);
                int var16 = this.field1281.method1230(arg0);
                var13 += this.method1514(var7, var16, this.field1278.field1163) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1282 != null) {
                int var17 = this.field1282.method1230(arg0);
                int var18 = this.field1290.method1230(arg0);
                var14 = var14 * ((this.method1514(var10, var18, this.field1282.field1163) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1285[var19] != 0) {
                    int var20 = field1300[var19] + var12;
                    if (var20 < arg0) {
                        field1295[var20] += this.method1514(field1299[var19], field1301[var19] * var14 >> 15, this.field1291.field1163);
                        field1299[var19] += (field1302[var19] * var13 >> 16) + field1303[var19];
                    }
                }
            }
        }
        if (this.field1280 != null) {
            this.field1280.method1227();
            this.field1294.method1227();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1280.method1230(arg0);
                int var26 = this.field1294.method1230(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1280.field1162 - this.field1280.field1158) * var25 >> 8) + this.field1280.field1158;
                } else {
                    var27 = ((this.field1280.field1162 - this.field1280.field1158) * var26 >> 8) + this.field1280.field1158;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1295[var24] = 0;
                }
            }
        }
        if (this.field1289 > 0 && this.field1279 > 0) {
            int var28 = (int) ((double) this.field1289 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1295[var29] += field1295[var29 - var28] * this.field1279 / 100;
            }
        }
        if (this.field1286.field1196[0] > 0 || this.field1286.field1196[1] > 0) {
            this.field1292.method1227();
            int var30 = this.field1292.method1230(arg0 + 1);
            int var31 = this.field1286.method1293(0, (float) var30 / 65536.0F);
            int var32 = this.field1286.method1293(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1295[var31 + var33] * (long) Statics.field1200 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1295[var31 + var33 - 1 - var36] * (long) class64.field1198[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1295[var33 - 1 - var37] * (long) class64.field1198[1][var37] >> 16);
                    }
                    field1295[var33] = var35;
                    var30 = this.field1292.method1230(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1295[var31 + var33] * (long) Statics.field1200 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1295[var31 + var33 - 1 - var40] * (long) class64.field1198[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1295[var33 - 1 - var41] * (long) class64.field1198[1][var41] >> 16);
                        }
                        field1295[var33] = var39;
                        var30 = this.field1292.method1230(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1295[var31 + var33 - 1 - var43] * (long) class64.field1198[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1295[var33 - 1 - var44] * (long) class64.field1198[1][var44] >> 16);
                            }
                            field1295[var33] = var42;
                            this.field1292.method1230(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1286.method1293(0, (float) var30 / 65536.0F);
                    var32 = this.field1286.method1293(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1295[var46] < -32768) {
                field1295[var46] = -32768;
            }
            if (field1295[var46] > 32767) {
                field1295[var46] = 32767;
            }
        }
        return field1295;
    }

    @ObfuscatedName("bh.l(III)I")
    public final int method1514(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1297[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1283[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bh.y(Ldx;)V")
    public final void method1512(class119 arg0) {
        this.field1291 = new class58();
        this.field1291.method1228(arg0);
        this.field1284 = new class58();
        this.field1284.method1228(arg0);
        int var2 = arg0.method2562();
        if (var2 != 0) {
            arg0.field1955--;
            this.field1278 = new class58();
            this.field1278.method1228(arg0);
            this.field1281 = new class58();
            this.field1281.method1228(arg0);
        }
        int var3 = arg0.method2562();
        if (var3 != 0) {
            arg0.field1955--;
            this.field1282 = new class58();
            this.field1282.method1228(arg0);
            this.field1290 = new class58();
            this.field1290.method1228(arg0);
        }
        int var4 = arg0.method2562();
        if (var4 != 0) {
            arg0.field1955--;
            this.field1280 = new class58();
            this.field1280.method1228(arg0);
            this.field1294 = new class58();
            this.field1294.method1228(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2394();
            if (var6 == 0) {
                break;
            }
            this.field1285[var5] = var6;
            this.field1287[var5] = arg0.method2393();
            this.field1288[var5] = arg0.method2394();
        }
        this.field1289 = arg0.method2394();
        this.field1279 = arg0.method2394();
        this.field1293 = arg0.method2541();
        this.field1296 = arg0.method2541();
        this.field1286 = new class64();
        this.field1292 = new class58();
        this.field1286.method1292(arg0, this.field1292);
    }
}
