package deob;

import java.util.Random;

@ObfuscatedName("bb")
public class class72 {

    @ObfuscatedName("bb.v")
    public class58 field1324;

    @ObfuscatedName("bb.f")
    public class58 field1320;

    @ObfuscatedName("bb.i")
    public class58 field1321;

    @ObfuscatedName("bb.d")
    public class58 field1322;

    @ObfuscatedName("bb.o")
    public class58 field1323;

    @ObfuscatedName("bb.c")
    public class58 field1339;

    @ObfuscatedName("bb.p")
    public class58 field1325;

    @ObfuscatedName("bb.j")
    public class58 field1338;

    @ObfuscatedName("bb.a")
    public int[] field1327 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bb.y")
    public int[] field1328 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bb.h")
    public int[] field1329 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bb.z")
    public int field1337 = 0;

    @ObfuscatedName("bb.w")
    public int field1331 = 100;

    @ObfuscatedName("bb.l")
    public class64 field1330;

    @ObfuscatedName("bb.q")
    public class58 field1319;

    @ObfuscatedName("bb.x")
    public int field1334 = 500;

    @ObfuscatedName("bb.s")
    public int field1335 = 0;

    @ObfuscatedName("bb.n")
    public static int[] field1332;

    @ObfuscatedName("bb.u")
    public static int[] field1326 = new int[32768];

    @ObfuscatedName("bb.m")
    public static int[] field1333;

    @ObfuscatedName("bb.k")
    public static int[] field1340;

    @ObfuscatedName("bb.r")
    public static int[] field1341;

    @ObfuscatedName("bb.b")
    public static int[] field1342;

    @ObfuscatedName("bb.t")
    public static int[] field1343;

    @ObfuscatedName("bb.g")
    public static int[] field1344;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1326[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1333 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1333[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1332 = new int[220500];
        field1340 = new int[5];
        field1341 = new int[5];
        field1342 = new int[5];
        field1343 = new int[5];
        field1344 = new int[5];
    }

    @ObfuscatedName("bb.v(II)[I")
    public final int[] method1466(int arg0, int arg1) {
        class120.method2570(field1332, 0, arg0);
        if (arg1 < 10) {
            return field1332;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1324.method1195();
        this.field1320.method1195();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1321 != null) {
            this.field1321.method1195();
            this.field1322.method1195();
            var5 = (int) ((double) (this.field1321.field1200 - this.field1321.field1203) * 32.768D / var3);
            var6 = (int) ((double) this.field1321.field1203 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1323 != null) {
            this.field1323.method1195();
            this.field1339.method1195();
            var8 = (int) ((double) (this.field1323.field1200 - this.field1323.field1203) * 32.768D / var3);
            var9 = (int) ((double) this.field1323.field1203 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1327[var11] != 0) {
                field1340[var11] = 0;
                field1341[var11] = (int) ((double) this.field1329[var11] * var3);
                field1342[var11] = (this.field1327[var11] << 14) / 100;
                field1343[var11] = (int) ((double) (this.field1324.field1200 - this.field1324.field1203) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1328[var11]) / var3);
                field1344[var11] = (int) ((double) this.field1324.field1203 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1324.method1196(arg0);
            int var14 = this.field1320.method1196(arg0);
            if (this.field1321 != null) {
                int var15 = this.field1321.method1196(arg0);
                int var16 = this.field1322.method1196(arg0);
                var13 += this.method1467(var7, var16, this.field1321.field1198) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1323 != null) {
                int var17 = this.field1323.method1196(arg0);
                int var18 = this.field1339.method1196(arg0);
                var14 = var14 * ((this.method1467(var10, var18, this.field1323.field1198) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1327[var19] != 0) {
                    int var20 = field1341[var19] + var12;
                    if (var20 < arg0) {
                        field1332[var20] += this.method1467(field1340[var19], field1342[var19] * var14 >> 15, this.field1324.field1198);
                        field1340[var19] += (field1343[var19] * var13 >> 16) + field1344[var19];
                    }
                }
            }
        }
        if (this.field1325 != null) {
            this.field1325.method1195();
            this.field1338.method1195();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1325.method1196(arg0);
                int var26 = this.field1338.method1196(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1325.field1200 - this.field1325.field1203) * var25 >> 8) + this.field1325.field1203;
                } else {
                    var27 = ((this.field1325.field1200 - this.field1325.field1203) * var26 >> 8) + this.field1325.field1203;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1332[var24] = 0;
                }
            }
        }
        if (this.field1337 > 0 && this.field1331 > 0) {
            int var28 = (int) ((double) this.field1337 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1332[var29] += field1332[var29 - var28] * this.field1331 / 100;
            }
        }
        if (this.field1330.field1240[0] > 0 || this.field1330.field1240[1] > 0) {
            this.field1319.method1195();
            int var30 = this.field1319.method1196(arg0 + 1);
            int var31 = this.field1330.method1260(0, (float) var30 / 65536.0F);
            int var32 = this.field1330.method1260(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1332[var31 + var33] * (long) Statics.field1241 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1332[var31 + var33 - 1 - var36] * (long) class64.field1239[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1332[var33 - 1 - var37] * (long) class64.field1239[1][var37] >> 16);
                    }
                    field1332[var33] = var35;
                    var30 = this.field1319.method1196(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1332[var31 + var33] * (long) Statics.field1241 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1332[var31 + var33 - 1 - var40] * (long) class64.field1239[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1332[var33 - 1 - var41] * (long) class64.field1239[1][var41] >> 16);
                        }
                        field1332[var33] = var39;
                        var30 = this.field1319.method1196(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1332[var31 + var33 - 1 - var43] * (long) class64.field1239[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1332[var33 - 1 - var44] * (long) class64.field1239[1][var44] >> 16);
                            }
                            field1332[var33] = var42;
                            this.field1319.method1196(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1330.method1260(0, (float) var30 / 65536.0F);
                    var32 = this.field1330.method1260(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1332[var46] < -32768) {
                field1332[var46] = -32768;
            }
            if (field1332[var46] > 32767) {
                field1332[var46] = 32767;
            }
        }
        return field1332;
    }

    @ObfuscatedName("bb.f(III)I")
    public final int method1467(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1333[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1326[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bb.i(Ldx;)V")
    public final void method1468(class119 arg0) {
        this.field1324 = new class58();
        this.field1324.method1205(arg0);
        this.field1320 = new class58();
        this.field1320.method1205(arg0);
        int var2 = arg0.method2400();
        if (var2 != 0) {
            arg0.field1984--;
            this.field1321 = new class58();
            this.field1321.method1205(arg0);
            this.field1322 = new class58();
            this.field1322.method1205(arg0);
        }
        int var3 = arg0.method2400();
        if (var3 != 0) {
            arg0.field1984--;
            this.field1323 = new class58();
            this.field1323.method1205(arg0);
            this.field1339 = new class58();
            this.field1339.method1205(arg0);
        }
        int var4 = arg0.method2400();
        if (var4 != 0) {
            arg0.field1984--;
            this.field1325 = new class58();
            this.field1325.method1205(arg0);
            this.field1338 = new class58();
            this.field1338.method1205(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2362();
            if (var6 == 0) {
                break;
            }
            this.field1327[var5] = var6;
            this.field1328[var5] = arg0.method2361();
            this.field1329[var5] = arg0.method2362();
        }
        this.field1337 = arg0.method2362();
        this.field1331 = arg0.method2362();
        this.field1334 = arg0.method2334();
        this.field1335 = arg0.method2334();
        this.field1330 = new class64();
        this.field1319 = new class58();
        this.field1330.method1253(arg0, this.field1319);
    }
}
