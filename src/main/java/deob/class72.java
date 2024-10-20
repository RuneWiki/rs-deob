package deob;

import java.util.Random;

@ObfuscatedName("bw")
public class class72 {

    @ObfuscatedName("bw.n")
    public class58 field1323;

    @ObfuscatedName("bw.d")
    public class58 field1308;

    @ObfuscatedName("bw.s")
    public class58 field1310;

    @ObfuscatedName("bw.q")
    public class58 field1311;

    @ObfuscatedName("bw.j")
    public class58 field1312;

    @ObfuscatedName("bw.k")
    public class58 field1313;

    @ObfuscatedName("bw.i")
    public class58 field1322;

    @ObfuscatedName("bw.m")
    public class58 field1314;

    @ObfuscatedName("bw.p")
    public int[] field1316 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bw.h")
    public int[] field1317 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bw.e")
    public int[] field1332 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bw.g")
    public int field1319 = 0;

    @ObfuscatedName("bw.b")
    public int field1309 = 100;

    @ObfuscatedName("bw.f")
    public class64 field1321;

    @ObfuscatedName("bw.y")
    public class58 field1318;

    @ObfuscatedName("bw.z")
    public int field1320 = 500;

    @ObfuscatedName("bw.t")
    public int field1324 = 0;

    @ObfuscatedName("bw.o")
    public static int[] field1325;

    @ObfuscatedName("bw.r")
    public static int[] field1315 = new int[32768];

    @ObfuscatedName("bw.u")
    public static int[] field1327;

    @ObfuscatedName("bw.a")
    public static int[] field1329;

    @ObfuscatedName("bw.c")
    public static int[] field1330;

    @ObfuscatedName("bw.l")
    public static int[] field1331;

    @ObfuscatedName("bw.x")
    public static int[] field1326;

    @ObfuscatedName("bw.w")
    public static int[] field1333;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1315[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1327 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1327[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1325 = new int[220500];
        field1329 = new int[5];
        field1330 = new int[5];
        field1331 = new int[5];
        field1326 = new int[5];
        field1333 = new int[5];
    }

    @ObfuscatedName("bw.n(II)[I")
    public final int[] method1437(int arg0, int arg1) {
        class120.method2550(field1325, 0, arg0);
        if (arg1 < 10) {
            return field1325;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1323.method1174();
        this.field1308.method1174();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1310 != null) {
            this.field1310.method1174();
            this.field1311.method1174();
            var5 = (int) ((double) (this.field1310.field1189 - this.field1310.field1188) * 32.768D / var3);
            var6 = (int) ((double) this.field1310.field1188 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1312 != null) {
            this.field1312.method1174();
            this.field1313.method1174();
            var8 = (int) ((double) (this.field1312.field1189 - this.field1312.field1188) * 32.768D / var3);
            var9 = (int) ((double) this.field1312.field1188 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1316[var11] != 0) {
                field1329[var11] = 0;
                field1330[var11] = (int) ((double) this.field1332[var11] * var3);
                field1331[var11] = (this.field1316[var11] << 14) / 100;
                field1326[var11] = (int) ((double) (this.field1323.field1189 - this.field1323.field1188) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1317[var11]) / var3);
                field1333[var11] = (int) ((double) this.field1323.field1188 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1323.method1169(arg0);
            int var14 = this.field1308.method1169(arg0);
            if (this.field1310 != null) {
                int var15 = this.field1310.method1169(arg0);
                int var16 = this.field1311.method1169(arg0);
                var13 += this.method1438(var7, var16, this.field1310.field1190) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1312 != null) {
                int var17 = this.field1312.method1169(arg0);
                int var18 = this.field1313.method1169(arg0);
                var14 = var14 * ((this.method1438(var10, var18, this.field1312.field1190) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1316[var19] != 0) {
                    int var20 = field1330[var19] + var12;
                    if (var20 < arg0) {
                        field1325[var20] += this.method1438(field1329[var19], field1331[var19] * var14 >> 15, this.field1323.field1190);
                        field1329[var19] += (field1326[var19] * var13 >> 16) + field1333[var19];
                    }
                }
            }
        }
        if (this.field1322 != null) {
            this.field1322.method1174();
            this.field1314.method1174();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1322.method1169(arg0);
                int var26 = this.field1314.method1169(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1322.field1189 - this.field1322.field1188) * var25 >> 8) + this.field1322.field1188;
                } else {
                    var27 = ((this.field1322.field1189 - this.field1322.field1188) * var26 >> 8) + this.field1322.field1188;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1325[var24] = 0;
                }
            }
        }
        if (this.field1319 > 0 && this.field1309 > 0) {
            int var28 = (int) ((double) this.field1319 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1325[var29] += field1325[var29 - var28] * this.field1309 / 100;
            }
        }
        if (this.field1321.field1227[0] > 0 || this.field1321.field1227[1] > 0) {
            this.field1318.method1174();
            int var30 = this.field1318.method1169(arg0 + 1);
            int var31 = this.field1321.method1229(0, (float) var30 / 65536.0F);
            int var32 = this.field1321.method1229(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1325[var31 + var33] * (long) Statics.field1230 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1325[var31 + var33 - 1 - var36] * (long) class64.field1228[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1325[var33 - 1 - var37] * (long) class64.field1228[1][var37] >> 16);
                    }
                    field1325[var33] = var35;
                    var30 = this.field1318.method1169(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1325[var31 + var33] * (long) Statics.field1230 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1325[var31 + var33 - 1 - var40] * (long) class64.field1228[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1325[var33 - 1 - var41] * (long) class64.field1228[1][var41] >> 16);
                        }
                        field1325[var33] = var39;
                        var30 = this.field1318.method1169(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1325[var31 + var33 - 1 - var43] * (long) class64.field1228[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1325[var33 - 1 - var44] * (long) class64.field1228[1][var44] >> 16);
                            }
                            field1325[var33] = var42;
                            this.field1318.method1169(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1321.method1229(0, (float) var30 / 65536.0F);
                    var32 = this.field1321.method1229(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1325[var46] < -32768) {
                field1325[var46] = -32768;
            }
            if (field1325[var46] > 32767) {
                field1325[var46] = 32767;
            }
        }
        return field1325;
    }

    @ObfuscatedName("bw.d(III)I")
    public final int method1438(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1327[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1315[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bw.s(Ldq;)V")
    public final void method1440(class119 arg0) {
        this.field1323 = new class58();
        this.field1323.method1166(arg0);
        this.field1308 = new class58();
        this.field1308.method1166(arg0);
        int var2 = arg0.method2338();
        if (var2 != 0) {
            arg0.field1977--;
            this.field1310 = new class58();
            this.field1310.method1166(arg0);
            this.field1311 = new class58();
            this.field1311.method1166(arg0);
        }
        int var3 = arg0.method2338();
        if (var3 != 0) {
            arg0.field1977--;
            this.field1312 = new class58();
            this.field1312.method1166(arg0);
            this.field1313 = new class58();
            this.field1313.method1166(arg0);
        }
        int var4 = arg0.method2338();
        if (var4 != 0) {
            arg0.field1977--;
            this.field1322 = new class58();
            this.field1322.method1166(arg0);
            this.field1314 = new class58();
            this.field1314.method1166(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2351();
            if (var6 == 0) {
                break;
            }
            this.field1316[var5] = var6;
            this.field1317[var5] = arg0.method2536();
            this.field1332[var5] = arg0.method2351();
        }
        this.field1319 = arg0.method2351();
        this.field1309 = arg0.method2351();
        this.field1320 = arg0.method2377();
        this.field1324 = arg0.method2377();
        this.field1321 = new class64();
        this.field1318 = new class58();
        this.field1321.method1223(arg0, this.field1318);
    }
}
