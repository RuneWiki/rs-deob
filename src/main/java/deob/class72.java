package deob;

import java.util.Random;

@ObfuscatedName("by")
public class class72 {

    @ObfuscatedName("by.h")
    public class58 field1346;

    @ObfuscatedName("by.q")
    public class58 field1339;

    @ObfuscatedName("by.v")
    public class58 field1348;

    @ObfuscatedName("by.n")
    public class58 field1330;

    @ObfuscatedName("by.f")
    public class58 field1331;

    @ObfuscatedName("by.g")
    public class58 field1332;

    @ObfuscatedName("by.o")
    public class58 field1328;

    @ObfuscatedName("by.s")
    public class58 field1334;

    @ObfuscatedName("by.k")
    public int[] field1335 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("by.b")
    public int[] field1336 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("by.c")
    public int[] field1337 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("by.l")
    public int field1333 = 0;

    @ObfuscatedName("by.p")
    public int field1329 = 100;

    @ObfuscatedName("by.d")
    public class64 field1340;

    @ObfuscatedName("by.i")
    public class58 field1341;

    @ObfuscatedName("by.x")
    public int field1342 = 500;

    @ObfuscatedName("by.j")
    public int field1345 = 0;

    @ObfuscatedName("by.w")
    public static int[] field1344;

    @ObfuscatedName("by.r")
    public static int[] field1338 = new int[32768];

    @ObfuscatedName("by.u")
    public static int[] field1343;

    @ObfuscatedName("by.t")
    public static int[] field1327;

    @ObfuscatedName("by.z")
    public static int[] field1349;

    @ObfuscatedName("by.e")
    public static int[] field1350;

    @ObfuscatedName("by.y")
    public static int[] field1351;

    @ObfuscatedName("by.a")
    public static int[] field1352;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1338[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1343 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1343[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1344 = new int[220500];
        field1327 = new int[5];
        field1349 = new int[5];
        field1350 = new int[5];
        field1351 = new int[5];
        field1352 = new int[5];
    }

    @ObfuscatedName("by.h(II)[I")
    public final int[] method1482(int arg0, int arg1) {
        class120.method2618(field1344, 0, arg0);
        if (arg1 < 10) {
            return field1344;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1346.method1203();
        this.field1339.method1203();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1348 != null) {
            this.field1348.method1203();
            this.field1330.method1203();
            var5 = (int) ((double) (this.field1348.field1203 - this.field1348.field1201) * 32.768D / var3);
            var6 = (int) ((double) this.field1348.field1201 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1331 != null) {
            this.field1331.method1203();
            this.field1332.method1203();
            var8 = (int) ((double) (this.field1331.field1203 - this.field1331.field1201) * 32.768D / var3);
            var9 = (int) ((double) this.field1331.field1201 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1335[var11] != 0) {
                field1327[var11] = 0;
                field1349[var11] = (int) ((double) this.field1337[var11] * var3);
                field1350[var11] = (this.field1335[var11] << 14) / 100;
                field1351[var11] = (int) ((double) (this.field1346.field1203 - this.field1346.field1201) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1336[var11]) / var3);
                field1352[var11] = (int) ((double) this.field1346.field1201 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1346.method1211(arg0);
            int var14 = this.field1339.method1211(arg0);
            if (this.field1348 != null) {
                int var15 = this.field1348.method1211(arg0);
                int var16 = this.field1330.method1211(arg0);
                var13 += this.method1476(var7, var16, this.field1348.field1200) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1331 != null) {
                int var17 = this.field1331.method1211(arg0);
                int var18 = this.field1332.method1211(arg0);
                var14 = var14 * ((this.method1476(var10, var18, this.field1331.field1200) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1335[var19] != 0) {
                    int var20 = field1349[var19] + var12;
                    if (var20 < arg0) {
                        field1344[var20] += this.method1476(field1327[var19], field1350[var19] * var14 >> 15, this.field1346.field1200);
                        field1327[var19] += (field1351[var19] * var13 >> 16) + field1352[var19];
                    }
                }
            }
        }
        if (this.field1328 != null) {
            this.field1328.method1203();
            this.field1334.method1203();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1328.method1211(arg0);
                int var26 = this.field1334.method1211(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1328.field1203 - this.field1328.field1201) * var25 >> 8) + this.field1328.field1201;
                } else {
                    var27 = ((this.field1328.field1203 - this.field1328.field1201) * var26 >> 8) + this.field1328.field1201;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1344[var24] = 0;
                }
            }
        }
        if (this.field1333 > 0 && this.field1329 > 0) {
            int var28 = (int) ((double) this.field1333 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1344[var29] += field1344[var29 - var28] * this.field1329 / 100;
            }
        }
        if (this.field1340.field1249[0] > 0 || this.field1340.field1249[1] > 0) {
            this.field1341.method1203();
            int var30 = this.field1341.method1211(arg0 + 1);
            int var31 = this.field1340.method1267(0, (float) var30 / 65536.0F);
            int var32 = this.field1340.method1267(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1344[var31 + var33] * (long) Statics.field1243 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1344[var31 + var33 - 1 - var36] * (long) class64.field1246[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1344[var33 - 1 - var37] * (long) class64.field1246[1][var37] >> 16);
                    }
                    field1344[var33] = var35;
                    var30 = this.field1341.method1211(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1344[var31 + var33] * (long) Statics.field1243 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1344[var31 + var33 - 1 - var40] * (long) class64.field1246[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1344[var33 - 1 - var41] * (long) class64.field1246[1][var41] >> 16);
                        }
                        field1344[var33] = var39;
                        var30 = this.field1341.method1211(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1344[var31 + var33 - 1 - var43] * (long) class64.field1246[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1344[var33 - 1 - var44] * (long) class64.field1246[1][var44] >> 16);
                            }
                            field1344[var33] = var42;
                            this.field1341.method1211(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1340.method1267(0, (float) var30 / 65536.0F);
                    var32 = this.field1340.method1267(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1344[var46] < -32768) {
                field1344[var46] = -32768;
            }
            if (field1344[var46] > 32767) {
                field1344[var46] = 32767;
            }
        }
        return field1344;
    }

    @ObfuscatedName("by.q(III)I")
    public final int method1476(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1343[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1338[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("by.v(Ldm;)V")
    public final void method1478(class119 arg0) {
        this.field1346 = new class58();
        this.field1346.method1207(arg0);
        this.field1339 = new class58();
        this.field1339.method1207(arg0);
        int var2 = arg0.method2383();
        if (var2 != 0) {
            arg0.field1973--;
            this.field1348 = new class58();
            this.field1348.method1207(arg0);
            this.field1330 = new class58();
            this.field1330.method1207(arg0);
        }
        int var3 = arg0.method2383();
        if (var3 != 0) {
            arg0.field1973--;
            this.field1331 = new class58();
            this.field1331.method1207(arg0);
            this.field1332 = new class58();
            this.field1332.method1207(arg0);
        }
        int var4 = arg0.method2383();
        if (var4 != 0) {
            arg0.field1973--;
            this.field1328 = new class58();
            this.field1328.method1207(arg0);
            this.field1334 = new class58();
            this.field1334.method1207(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2484();
            if (var6 == 0) {
                break;
            }
            this.field1335[var5] = var6;
            this.field1336[var5] = arg0.method2429();
            this.field1337[var5] = arg0.method2484();
        }
        this.field1333 = arg0.method2484();
        this.field1329 = arg0.method2484();
        this.field1342 = arg0.method2385();
        this.field1345 = arg0.method2385();
        this.field1340 = new class64();
        this.field1341 = new class58();
        this.field1340.method1269(arg0, this.field1341);
    }
}
