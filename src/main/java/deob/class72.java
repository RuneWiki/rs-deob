package deob;

import java.util.Random;

@ObfuscatedName("bf")
public class class72 {

    @ObfuscatedName("bf.d")
    public class58 field1336;

    @ObfuscatedName("bf.p")
    public class58 field1324;

    @ObfuscatedName("bf.v")
    public class58 field1345;

    @ObfuscatedName("bf.l")
    public class58 field1330;

    @ObfuscatedName("bf.y")
    public class58 field1327;

    @ObfuscatedName("bf.w")
    public class58 field1340;

    @ObfuscatedName("bf.u")
    public class58 field1329;

    @ObfuscatedName("bf.a")
    public class58 field1344;

    @ObfuscatedName("bf.e")
    public int[] field1325 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bf.b")
    public int[] field1332 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bf.o")
    public int[] field1333 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bf.m")
    public int field1334 = 0;

    @ObfuscatedName("bf.x")
    public int field1335 = 100;

    @ObfuscatedName("bf.k")
    public class64 field1323;

    @ObfuscatedName("bf.n")
    public class58 field1337;

    @ObfuscatedName("bf.j")
    public int field1338 = 500;

    @ObfuscatedName("bf.t")
    public int field1339 = 0;

    @ObfuscatedName("bf.z")
    public static int[] field1328;

    @ObfuscatedName("bf.h")
    public static int[] field1341 = new int[32768];

    @ObfuscatedName("bf.i")
    public static int[] field1342;

    @ObfuscatedName("bf.r")
    public static int[] field1331;

    @ObfuscatedName("bf.s")
    public static int[] field1326;

    @ObfuscatedName("bf.g")
    public static int[] field1346;

    @ObfuscatedName("bf.f")
    public static int[] field1347;

    @ObfuscatedName("bf.c")
    public static int[] field1348;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1341[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1342 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1342[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1328 = new int[220500];
        field1331 = new int[5];
        field1326 = new int[5];
        field1346 = new int[5];
        field1347 = new int[5];
        field1348 = new int[5];
    }

    @ObfuscatedName("bf.d(II)[I")
    public final int[] method1463(int arg0, int arg1) {
        class120.method2578(field1328, 0, arg0);
        if (arg1 < 10) {
            return field1328;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1336.method1193();
        this.field1324.method1193();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1345 != null) {
            this.field1345.method1193();
            this.field1330.method1193();
            var5 = (int) ((double) (this.field1345.field1204 - this.field1345.field1201) * 32.768D / var3);
            var6 = (int) ((double) this.field1345.field1201 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1327 != null) {
            this.field1327.method1193();
            this.field1340.method1193();
            var8 = (int) ((double) (this.field1327.field1204 - this.field1327.field1201) * 32.768D / var3);
            var9 = (int) ((double) this.field1327.field1201 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1325[var11] != 0) {
                field1331[var11] = 0;
                field1326[var11] = (int) ((double) this.field1333[var11] * var3);
                field1346[var11] = (this.field1325[var11] << 14) / 100;
                field1347[var11] = (int) ((double) (this.field1336.field1204 - this.field1336.field1201) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1332[var11]) / var3);
                field1348[var11] = (int) ((double) this.field1336.field1201 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1336.method1194(arg0);
            int var14 = this.field1324.method1194(arg0);
            if (this.field1345 != null) {
                int var15 = this.field1345.method1194(arg0);
                int var16 = this.field1330.method1194(arg0);
                var13 += this.method1468(var7, var16, this.field1345.field1206) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1327 != null) {
                int var17 = this.field1327.method1194(arg0);
                int var18 = this.field1340.method1194(arg0);
                var14 = var14 * ((this.method1468(var10, var18, this.field1327.field1206) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1325[var19] != 0) {
                    int var20 = field1326[var19] + var12;
                    if (var20 < arg0) {
                        field1328[var20] += this.method1468(field1331[var19], field1346[var19] * var14 >> 15, this.field1336.field1206);
                        field1331[var19] += (field1347[var19] * var13 >> 16) + field1348[var19];
                    }
                }
            }
        }
        if (this.field1329 != null) {
            this.field1329.method1193();
            this.field1344.method1193();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1329.method1194(arg0);
                int var26 = this.field1344.method1194(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1329.field1204 - this.field1329.field1201) * var25 >> 8) + this.field1329.field1201;
                } else {
                    var27 = ((this.field1329.field1204 - this.field1329.field1201) * var26 >> 8) + this.field1329.field1201;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1328[var24] = 0;
                }
            }
        }
        if (this.field1334 > 0 && this.field1335 > 0) {
            int var28 = (int) ((double) this.field1334 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1328[var29] += field1328[var29 - var28] * this.field1335 / 100;
            }
        }
        if (this.field1323.field1247[0] > 0 || this.field1323.field1247[1] > 0) {
            this.field1337.method1193();
            int var30 = this.field1337.method1194(arg0 + 1);
            int var31 = this.field1323.method1239(0, (float) var30 / 65536.0F);
            int var32 = this.field1323.method1239(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1328[var31 + var33] * (long) Statics.field1245 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1328[var31 + var33 - 1 - var36] * (long) class64.field1243[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1328[var33 - 1 - var37] * (long) class64.field1243[1][var37] >> 16);
                    }
                    field1328[var33] = var35;
                    var30 = this.field1337.method1194(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1328[var31 + var33] * (long) Statics.field1245 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1328[var31 + var33 - 1 - var40] * (long) class64.field1243[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1328[var33 - 1 - var41] * (long) class64.field1243[1][var41] >> 16);
                        }
                        field1328[var33] = var39;
                        var30 = this.field1337.method1194(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1328[var31 + var33 - 1 - var43] * (long) class64.field1243[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1328[var33 - 1 - var44] * (long) class64.field1243[1][var44] >> 16);
                            }
                            field1328[var33] = var42;
                            this.field1337.method1194(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1323.method1239(0, (float) var30 / 65536.0F);
                    var32 = this.field1323.method1239(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1328[var46] < -32768) {
                field1328[var46] = -32768;
            }
            if (field1328[var46] > 32767) {
                field1328[var46] = 32767;
            }
        }
        return field1328;
    }

    @ObfuscatedName("bf.p(III)I")
    public final int method1468(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1342[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1341[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bf.v(Ldf;)V")
    public final void method1465(class119 arg0) {
        this.field1336 = new class58();
        this.field1336.method1191(arg0);
        this.field1324 = new class58();
        this.field1324.method1191(arg0);
        int var2 = arg0.method2357();
        if (var2 != 0) {
            arg0.field1966--;
            this.field1345 = new class58();
            this.field1345.method1191(arg0);
            this.field1330 = new class58();
            this.field1330.method1191(arg0);
        }
        int var3 = arg0.method2357();
        if (var3 != 0) {
            arg0.field1966--;
            this.field1327 = new class58();
            this.field1327.method1191(arg0);
            this.field1340 = new class58();
            this.field1340.method1191(arg0);
        }
        int var4 = arg0.method2357();
        if (var4 != 0) {
            arg0.field1966--;
            this.field1329 = new class58();
            this.field1329.method1191(arg0);
            this.field1344 = new class58();
            this.field1344.method1191(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2370();
            if (var6 == 0) {
                break;
            }
            this.field1325[var5] = var6;
            this.field1332[var5] = arg0.method2391();
            this.field1333[var5] = arg0.method2370();
        }
        this.field1334 = arg0.method2370();
        this.field1335 = arg0.method2370();
        this.field1338 = arg0.method2359();
        this.field1339 = arg0.method2359();
        this.field1323 = new class64();
        this.field1337 = new class58();
        this.field1323.method1244(arg0, this.field1337);
    }
}
