package deob;

import java.util.Random;

@ObfuscatedName("bv")
public class class72 {

    @ObfuscatedName("bv.y")
    public class58 field1325;

    @ObfuscatedName("bv.d")
    public class58 field1328;

    @ObfuscatedName("bv.g")
    public class58 field1324;

    @ObfuscatedName("bv.w")
    public class58 field1339;

    @ObfuscatedName("bv.e")
    public class58 field1326;

    @ObfuscatedName("bv.c")
    public class58 field1323;

    @ObfuscatedName("bv.a")
    public class58 field1332;

    @ObfuscatedName("bv.q")
    public class58 field1329;

    @ObfuscatedName("bv.m")
    public int[] field1330 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bv.n")
    public int[] field1331 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bv.k")
    public int[] field1344 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bv.o")
    public int field1333 = 0;

    @ObfuscatedName("bv.f")
    public int field1334 = 100;

    @ObfuscatedName("bv.s")
    public class64 field1337;

    @ObfuscatedName("bv.z")
    public class58 field1322;

    @ObfuscatedName("bv.b")
    public int field1336 = 500;

    @ObfuscatedName("bv.p")
    public int field1338 = 0;

    @ObfuscatedName("bv.r")
    public static int[] field1327;

    @ObfuscatedName("bv.x")
    public static int[] field1340 = new int[32768];

    @ObfuscatedName("bv.h")
    public static int[] field1341;

    @ObfuscatedName("bv.v")
    public static int[] field1343;

    @ObfuscatedName("bv.l")
    public static int[] field1335;

    @ObfuscatedName("bv.u")
    public static int[] field1345;

    @ObfuscatedName("bv.t")
    public static int[] field1346;

    @ObfuscatedName("bv.i")
    public static int[] field1347;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1340[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1341 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1341[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1327 = new int[220500];
        field1343 = new int[5];
        field1335 = new int[5];
        field1345 = new int[5];
        field1346 = new int[5];
        field1347 = new int[5];
    }

    @ObfuscatedName("bv.y(II)[I")
    public final int[] method1467(int arg0, int arg1) {
        class120.method2546(field1327, 0, arg0);
        if (arg1 < 10) {
            return field1327;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1325.method1191();
        this.field1328.method1191();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1324 != null) {
            this.field1324.method1191();
            this.field1339.method1191();
            var5 = (int) ((double) (this.field1324.field1201 - this.field1324.field1200) * 32.768D / var3);
            var6 = (int) ((double) this.field1324.field1200 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1326 != null) {
            this.field1326.method1191();
            this.field1323.method1191();
            var8 = (int) ((double) (this.field1326.field1201 - this.field1326.field1200) * 32.768D / var3);
            var9 = (int) ((double) this.field1326.field1200 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1330[var11] != 0) {
                field1343[var11] = 0;
                field1335[var11] = (int) ((double) this.field1344[var11] * var3);
                field1345[var11] = (this.field1330[var11] << 14) / 100;
                field1346[var11] = (int) ((double) (this.field1325.field1201 - this.field1325.field1200) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1331[var11]) / var3);
                field1347[var11] = (int) ((double) this.field1325.field1200 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1325.method1193(arg0);
            int var14 = this.field1328.method1193(arg0);
            if (this.field1324 != null) {
                int var15 = this.field1324.method1193(arg0);
                int var16 = this.field1339.method1193(arg0);
                var13 += this.method1468(var7, var16, this.field1324.field1207) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1326 != null) {
                int var17 = this.field1326.method1193(arg0);
                int var18 = this.field1323.method1193(arg0);
                var14 = var14 * ((this.method1468(var10, var18, this.field1326.field1207) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1330[var19] != 0) {
                    int var20 = field1335[var19] + var12;
                    if (var20 < arg0) {
                        field1327[var20] += this.method1468(field1343[var19], field1345[var19] * var14 >> 15, this.field1325.field1207);
                        field1343[var19] += (field1346[var19] * var13 >> 16) + field1347[var19];
                    }
                }
            }
        }
        if (this.field1332 != null) {
            this.field1332.method1191();
            this.field1329.method1191();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1332.method1193(arg0);
                int var26 = this.field1329.method1193(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1332.field1201 - this.field1332.field1200) * var25 >> 8) + this.field1332.field1200;
                } else {
                    var27 = ((this.field1332.field1201 - this.field1332.field1200) * var26 >> 8) + this.field1332.field1200;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1327[var24] = 0;
                }
            }
        }
        if (this.field1333 > 0 && this.field1334 > 0) {
            int var28 = (int) ((double) this.field1333 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1327[var29] += field1327[var29 - var28] * this.field1334 / 100;
            }
        }
        if (this.field1337.field1239[0] > 0 || this.field1337.field1239[1] > 0) {
            this.field1322.method1191();
            int var30 = this.field1322.method1193(arg0 + 1);
            int var31 = this.field1337.method1251(0, (float) var30 / 65536.0F);
            int var32 = this.field1337.method1251(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1327[var31 + var33] * (long) Statics.field1242 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1327[var31 + var33 - 1 - var36] * (long) class64.field1236[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1327[var33 - 1 - var37] * (long) class64.field1236[1][var37] >> 16);
                    }
                    field1327[var33] = var35;
                    var30 = this.field1322.method1193(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1327[var31 + var33] * (long) Statics.field1242 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1327[var31 + var33 - 1 - var40] * (long) class64.field1236[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1327[var33 - 1 - var41] * (long) class64.field1236[1][var41] >> 16);
                        }
                        field1327[var33] = var39;
                        var30 = this.field1322.method1193(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1327[var31 + var33 - 1 - var43] * (long) class64.field1236[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1327[var33 - 1 - var44] * (long) class64.field1236[1][var44] >> 16);
                            }
                            field1327[var33] = var42;
                            this.field1322.method1193(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1337.method1251(0, (float) var30 / 65536.0F);
                    var32 = this.field1337.method1251(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1327[var46] < -32768) {
                field1327[var46] = -32768;
            }
            if (field1327[var46] > 32767) {
                field1327[var46] = 32767;
            }
        }
        return field1327;
    }

    @ObfuscatedName("bv.d(III)I")
    public final int method1468(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1341[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1340[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bv.g(Ldd;)V")
    public final void method1470(class119 arg0) {
        this.field1325 = new class58();
        this.field1325.method1195(arg0);
        this.field1328 = new class58();
        this.field1328.method1195(arg0);
        int var2 = arg0.method2326();
        if (var2 != 0) {
            arg0.field1973--;
            this.field1324 = new class58();
            this.field1324.method1195(arg0);
            this.field1339 = new class58();
            this.field1339.method1195(arg0);
        }
        int var3 = arg0.method2326();
        if (var3 != 0) {
            arg0.field1973--;
            this.field1326 = new class58();
            this.field1326.method1195(arg0);
            this.field1323 = new class58();
            this.field1323.method1195(arg0);
        }
        int var4 = arg0.method2326();
        if (var4 != 0) {
            arg0.field1973--;
            this.field1332 = new class58();
            this.field1332.method1195(arg0);
            this.field1329 = new class58();
            this.field1329.method1195(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2321();
            if (var6 == 0) {
                break;
            }
            this.field1330[var5] = var6;
            this.field1331[var5] = arg0.method2338();
            this.field1344[var5] = arg0.method2321();
        }
        this.field1333 = arg0.method2321();
        this.field1334 = arg0.method2321();
        this.field1336 = arg0.method2525();
        this.field1338 = arg0.method2525();
        this.field1337 = new class64();
        this.field1322 = new class58();
        this.field1337.method1252(arg0, this.field1322);
    }
}
