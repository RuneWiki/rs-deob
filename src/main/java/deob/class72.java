package deob;

import java.util.Random;

@ObfuscatedName("bz")
public class class72 {

    @ObfuscatedName("bz.j")
    public class58 field1327;

    @ObfuscatedName("bz.m")
    public class58 field1311;

    @ObfuscatedName("bz.f")
    public class58 field1312;

    @ObfuscatedName("bz.l")
    public class58 field1323;

    @ObfuscatedName("bz.u")
    public class58 field1320;

    @ObfuscatedName("bz.a")
    public class58 field1315;

    @ObfuscatedName("bz.h")
    public class58 field1316;

    @ObfuscatedName("bz.i")
    public class58 field1329;

    @ObfuscatedName("bz.t")
    public int[] field1318 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bz.k")
    public int[] field1319 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bz.s")
    public int[] field1313 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bz.w")
    public int field1321 = 0;

    @ObfuscatedName("bz.e")
    public int field1322 = 100;

    @ObfuscatedName("bz.z")
    public class64 field1328;

    @ObfuscatedName("bz.p")
    public class58 field1324;

    @ObfuscatedName("bz.r")
    public int field1325 = 500;

    @ObfuscatedName("bz.g")
    public int field1326 = 0;

    @ObfuscatedName("bz.n")
    public static int[] field1314;

    @ObfuscatedName("bz.y")
    public static int[] field1334 = new int[32768];

    @ObfuscatedName("bz.v")
    public static int[] field1310;

    @ObfuscatedName("bz.x")
    public static int[] field1317;

    @ObfuscatedName("bz.d")
    public static int[] field1332;

    @ObfuscatedName("bz.o")
    public static int[] field1333;

    @ObfuscatedName("bz.c")
    public static int[] field1331;

    @ObfuscatedName("bz.b")
    public static int[] field1335;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1334[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1310 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1310[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1314 = new int[220500];
        field1317 = new int[5];
        field1332 = new int[5];
        field1333 = new int[5];
        field1331 = new int[5];
        field1335 = new int[5];
    }

    @ObfuscatedName("bz.j(II)[I")
    public final int[] method1471(int arg0, int arg1) {
        class120.method2585(field1314, 0, arg0);
        if (arg1 < 10) {
            return field1314;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1327.method1215();
        this.field1311.method1215();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1312 != null) {
            this.field1312.method1215();
            this.field1323.method1215();
            var5 = (int) ((double) (this.field1312.field1185 - this.field1312.field1188) * 32.768D / var3);
            var6 = (int) ((double) this.field1312.field1188 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1320 != null) {
            this.field1320.method1215();
            this.field1315.method1215();
            var8 = (int) ((double) (this.field1320.field1185 - this.field1320.field1188) * 32.768D / var3);
            var9 = (int) ((double) this.field1320.field1188 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1318[var11] != 0) {
                field1317[var11] = 0;
                field1332[var11] = (int) ((double) this.field1313[var11] * var3);
                field1333[var11] = (this.field1318[var11] << 14) / 100;
                field1331[var11] = (int) ((double) (this.field1327.field1185 - this.field1327.field1188) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1319[var11]) / var3);
                field1335[var11] = (int) ((double) this.field1327.field1188 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1327.method1220(arg0);
            int var14 = this.field1311.method1220(arg0);
            if (this.field1312 != null) {
                int var15 = this.field1312.method1220(arg0);
                int var16 = this.field1323.method1220(arg0);
                var13 += this.method1472(var7, var16, this.field1312.field1190) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1320 != null) {
                int var17 = this.field1320.method1220(arg0);
                int var18 = this.field1315.method1220(arg0);
                var14 = var14 * ((this.method1472(var10, var18, this.field1320.field1190) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1318[var19] != 0) {
                    int var20 = field1332[var19] + var12;
                    if (var20 < arg0) {
                        field1314[var20] += this.method1472(field1317[var19], field1333[var19] * var14 >> 15, this.field1327.field1190);
                        field1317[var19] += (field1331[var19] * var13 >> 16) + field1335[var19];
                    }
                }
            }
        }
        if (this.field1316 != null) {
            this.field1316.method1215();
            this.field1329.method1215();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1316.method1220(arg0);
                int var26 = this.field1329.method1220(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1316.field1185 - this.field1316.field1188) * var25 >> 8) + this.field1316.field1188;
                } else {
                    var27 = ((this.field1316.field1185 - this.field1316.field1188) * var26 >> 8) + this.field1316.field1188;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1314[var24] = 0;
                }
            }
        }
        if (this.field1321 > 0 && this.field1322 > 0) {
            int var28 = (int) ((double) this.field1321 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1314[var29] += field1314[var29 - var28] * this.field1322 / 100;
            }
        }
        if (this.field1328.field1227[0] > 0 || this.field1328.field1227[1] > 0) {
            this.field1324.method1215();
            int var30 = this.field1324.method1220(arg0 + 1);
            int var31 = this.field1328.method1277(0, (float) var30 / 65536.0F);
            int var32 = this.field1328.method1277(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1314[var31 + var33] * (long) Statics.field1232 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1314[var31 + var33 - 1 - var36] * (long) class64.field1234[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1314[var33 - 1 - var37] * (long) class64.field1234[1][var37] >> 16);
                    }
                    field1314[var33] = var35;
                    var30 = this.field1324.method1220(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1314[var31 + var33] * (long) Statics.field1232 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1314[var31 + var33 - 1 - var40] * (long) class64.field1234[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1314[var33 - 1 - var41] * (long) class64.field1234[1][var41] >> 16);
                        }
                        field1314[var33] = var39;
                        var30 = this.field1324.method1220(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1314[var31 + var33 - 1 - var43] * (long) class64.field1234[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1314[var33 - 1 - var44] * (long) class64.field1234[1][var44] >> 16);
                            }
                            field1314[var33] = var42;
                            this.field1324.method1220(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1328.method1277(0, (float) var30 / 65536.0F);
                    var32 = this.field1328.method1277(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1314[var46] < -32768) {
                field1314[var46] = -32768;
            }
            if (field1314[var46] > 32767) {
                field1314[var46] = 32767;
            }
        }
        return field1314;
    }

    @ObfuscatedName("bz.m(III)I")
    public final int method1472(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1310[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1334[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bz.f(Ldc;)V")
    public final void method1476(class119 arg0) {
        this.field1327 = new class58();
        this.field1327.method1213(arg0);
        this.field1311 = new class58();
        this.field1311.method1213(arg0);
        int var2 = arg0.method2372();
        if (var2 != 0) {
            arg0.field1982--;
            this.field1312 = new class58();
            this.field1312.method1213(arg0);
            this.field1323 = new class58();
            this.field1323.method1213(arg0);
        }
        int var3 = arg0.method2372();
        if (var3 != 0) {
            arg0.field1982--;
            this.field1320 = new class58();
            this.field1320.method1213(arg0);
            this.field1315 = new class58();
            this.field1315.method1213(arg0);
        }
        int var4 = arg0.method2372();
        if (var4 != 0) {
            arg0.field1982--;
            this.field1316 = new class58();
            this.field1316.method1213(arg0);
            this.field1329 = new class58();
            this.field1329.method1213(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2384();
            if (var6 == 0) {
                break;
            }
            this.field1318[var5] = var6;
            this.field1319[var5] = arg0.method2502();
            this.field1313[var5] = arg0.method2384();
        }
        this.field1321 = arg0.method2384();
        this.field1322 = arg0.method2384();
        this.field1325 = arg0.method2374();
        this.field1326 = arg0.method2374();
        this.field1328 = new class64();
        this.field1324 = new class58();
        this.field1328.method1268(arg0, this.field1324);
    }
}
