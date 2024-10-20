package deob;

import java.util.Random;

@ObfuscatedName("bc")
public class class72 {

    @ObfuscatedName("bc.e")
    public class58 field1309;

    @ObfuscatedName("bc.w")
    public class58 field1295;

    @ObfuscatedName("bc.f")
    public class58 field1296;

    @ObfuscatedName("bc.s")
    public class58 field1297;

    @ObfuscatedName("bc.p")
    public class58 field1298;

    @ObfuscatedName("bc.h")
    public class58 field1299;

    @ObfuscatedName("bc.g")
    public class58 field1300;

    @ObfuscatedName("bc.a")
    public class58 field1301;

    @ObfuscatedName("bc.r")
    public int[] field1302 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bc.k")
    public int[] field1310 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bc.m")
    public int[] field1311 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bc.n")
    public int field1305 = 0;

    @ObfuscatedName("bc.y")
    public int field1304 = 100;

    @ObfuscatedName("bc.i")
    public class64 field1306;

    @ObfuscatedName("bc.j")
    public class58 field1308;

    @ObfuscatedName("bc.l")
    public int field1303 = 500;

    @ObfuscatedName("bc.o")
    public int field1314 = 0;

    @ObfuscatedName("bc.c")
    public static int[] field1307;

    @ObfuscatedName("bc.x")
    public static int[] field1312 = new int[32768];

    @ObfuscatedName("bc.b")
    public static int[] field1313;

    @ObfuscatedName("bc.u")
    public static int[] field1315;

    @ObfuscatedName("bc.t")
    public static int[] field1316;

    @ObfuscatedName("bc.d")
    public static int[] field1317;

    @ObfuscatedName("bc.z")
    public static int[] field1318;

    @ObfuscatedName("bc.v")
    public static int[] field1319;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1312[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1313 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1313[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1307 = new int[220500];
        field1315 = new int[5];
        field1316 = new int[5];
        field1317 = new int[5];
        field1318 = new int[5];
        field1319 = new int[5];
    }

    @ObfuscatedName("bc.e(II)[I")
    public final int[] method1457(int arg0, int arg1) {
        class121.method2556(field1307, 0, arg0);
        if (arg1 < 10) {
            return field1307;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1309.method1183();
        this.field1295.method1183();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1296 != null) {
            this.field1296.method1183();
            this.field1297.method1183();
            var5 = (int) ((double) (this.field1296.field1175 - this.field1296.field1180) * 32.768D / var3);
            var6 = (int) ((double) this.field1296.field1180 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1298 != null) {
            this.field1298.method1183();
            this.field1299.method1183();
            var8 = (int) ((double) (this.field1298.field1175 - this.field1298.field1180) * 32.768D / var3);
            var9 = (int) ((double) this.field1298.field1180 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1302[var11] != 0) {
                field1315[var11] = 0;
                field1316[var11] = (int) ((double) this.field1311[var11] * var3);
                field1317[var11] = (this.field1302[var11] << 14) / 100;
                field1318[var11] = (int) ((double) (this.field1309.field1175 - this.field1309.field1180) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1310[var11]) / var3);
                field1319[var11] = (int) ((double) this.field1309.field1180 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1309.method1184(arg0);
            int var14 = this.field1295.method1184(arg0);
            if (this.field1296 != null) {
                int var15 = this.field1296.method1184(arg0);
                int var16 = this.field1297.method1184(arg0);
                var13 += this.method1455(var7, var16, this.field1296.field1176) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1298 != null) {
                int var17 = this.field1298.method1184(arg0);
                int var18 = this.field1299.method1184(arg0);
                var14 = var14 * ((this.method1455(var10, var18, this.field1298.field1176) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1302[var19] != 0) {
                    int var20 = field1316[var19] + var12;
                    if (var20 < arg0) {
                        field1307[var20] += this.method1455(field1315[var19], field1317[var19] * var14 >> 15, this.field1309.field1176);
                        field1315[var19] += (field1318[var19] * var13 >> 16) + field1319[var19];
                    }
                }
            }
        }
        if (this.field1300 != null) {
            this.field1300.method1183();
            this.field1301.method1183();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1300.method1184(arg0);
                int var26 = this.field1301.method1184(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1300.field1175 - this.field1300.field1180) * var25 >> 8) + this.field1300.field1180;
                } else {
                    var27 = ((this.field1300.field1175 - this.field1300.field1180) * var26 >> 8) + this.field1300.field1180;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1307[var24] = 0;
                }
            }
        }
        if (this.field1305 > 0 && this.field1304 > 0) {
            int var28 = (int) ((double) this.field1305 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1307[var29] += field1307[var29 - var28] * this.field1304 / 100;
            }
        }
        if (this.field1306.field1215[0] > 0 || this.field1306.field1215[1] > 0) {
            this.field1308.method1183();
            int var30 = this.field1308.method1184(arg0 + 1);
            int var31 = this.field1306.method1237(0, (float) var30 / 65536.0F);
            int var32 = this.field1306.method1237(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1307[var31 + var33] * (long) Statics.field1216 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1307[var31 + var33 - 1 - var36] * (long) class64.field1214[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1307[var33 - 1 - var37] * (long) class64.field1214[1][var37] >> 16);
                    }
                    field1307[var33] = var35;
                    var30 = this.field1308.method1184(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1307[var31 + var33] * (long) Statics.field1216 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1307[var31 + var33 - 1 - var40] * (long) class64.field1214[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1307[var33 - 1 - var41] * (long) class64.field1214[1][var41] >> 16);
                        }
                        field1307[var33] = var39;
                        var30 = this.field1308.method1184(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1307[var31 + var33 - 1 - var43] * (long) class64.field1214[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1307[var33 - 1 - var44] * (long) class64.field1214[1][var44] >> 16);
                            }
                            field1307[var33] = var42;
                            this.field1308.method1184(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1306.method1237(0, (float) var30 / 65536.0F);
                    var32 = this.field1306.method1237(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1307[var46] < -32768) {
                field1307[var46] = -32768;
            }
            if (field1307[var46] > 32767) {
                field1307[var46] = 32767;
            }
        }
        return field1307;
    }

    @ObfuscatedName("bc.w(III)I")
    public final int method1455(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1313[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1312[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bc.f(Ldq;)V")
    public final void method1456(class120 arg0) {
        this.field1309 = new class58();
        this.field1309.method1187(arg0);
        this.field1295 = new class58();
        this.field1295.method1187(arg0);
        int var2 = arg0.method2355();
        if (var2 != 0) {
            arg0.field1977--;
            this.field1296 = new class58();
            this.field1296.method1187(arg0);
            this.field1297 = new class58();
            this.field1297.method1187(arg0);
        }
        int var3 = arg0.method2355();
        if (var3 != 0) {
            arg0.field1977--;
            this.field1298 = new class58();
            this.field1298.method1187(arg0);
            this.field1299 = new class58();
            this.field1299.method1187(arg0);
        }
        int var4 = arg0.method2355();
        if (var4 != 0) {
            arg0.field1977--;
            this.field1300 = new class58();
            this.field1300.method1187(arg0);
            this.field1301 = new class58();
            this.field1301.method1187(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2368();
            if (var6 == 0) {
                break;
            }
            this.field1302[var5] = var6;
            this.field1310[var5] = arg0.method2367();
            this.field1311[var5] = arg0.method2368();
        }
        this.field1305 = arg0.method2368();
        this.field1304 = arg0.method2368();
        this.field1303 = arg0.method2532();
        this.field1314 = arg0.method2532();
        this.field1306 = new class64();
        this.field1308 = new class58();
        this.field1306.method1238(arg0, this.field1308);
    }
}
