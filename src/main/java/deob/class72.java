package deob;

import java.util.Random;

@ObfuscatedName("bl")
public class class72 {

    @ObfuscatedName("bl.k")
    public class58 field1317;

    @ObfuscatedName("bl.h")
    public class58 field1318;

    @ObfuscatedName("bl.o")
    public class58 field1301;

    @ObfuscatedName("bl.z")
    public class58 field1302;

    @ObfuscatedName("bl.c")
    public class58 field1323;

    @ObfuscatedName("bl.d")
    public class58 field1322;

    @ObfuscatedName("bl.l")
    public class58 field1305;

    @ObfuscatedName("bl.b")
    public class58 field1306;

    @ObfuscatedName("bl.j")
    public int[] field1303 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bl.f")
    public int[] field1308 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bl.i")
    public int[] field1312 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bl.g")
    public int field1310 = 0;

    @ObfuscatedName("bl.t")
    public int field1311 = 100;

    @ObfuscatedName("bl.e")
    public class64 field1299;

    @ObfuscatedName("bl.q")
    public class58 field1314;

    @ObfuscatedName("bl.u")
    public int field1300 = 500;

    @ObfuscatedName("bl.r")
    public int field1315 = 0;

    @ObfuscatedName("bl.a")
    public static int[] field1316;

    @ObfuscatedName("bl.m")
    public static int[] field1313 = new int[32768];

    @ObfuscatedName("bl.y")
    public static int[] field1304;

    @ObfuscatedName("bl.n")
    public static int[] field1320;

    @ObfuscatedName("bl.v")
    public static int[] field1307;

    @ObfuscatedName("bl.s")
    public static int[] field1309;

    @ObfuscatedName("bl.w")
    public static int[] field1321;

    @ObfuscatedName("bl.p")
    public static int[] field1324;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1313[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1304 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1304[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1316 = new int[220500];
        field1320 = new int[5];
        field1307 = new int[5];
        field1309 = new int[5];
        field1321 = new int[5];
        field1324 = new int[5];
    }

    @ObfuscatedName("bl.k(II)[I")
    public final int[] method1443(int arg0, int arg1) {
        class120.method2549(field1316, 0, arg0);
        if (arg1 < 10) {
            return field1316;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1317.method1168();
        this.field1318.method1168();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1301 != null) {
            this.field1301.method1168();
            this.field1302.method1168();
            var5 = (int) ((double) (this.field1301.field1181 - this.field1301.field1180) * 32.768D / var3);
            var6 = (int) ((double) this.field1301.field1180 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1323 != null) {
            this.field1323.method1168();
            this.field1322.method1168();
            var8 = (int) ((double) (this.field1323.field1181 - this.field1323.field1180) * 32.768D / var3);
            var9 = (int) ((double) this.field1323.field1180 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1303[var11] != 0) {
                field1320[var11] = 0;
                field1307[var11] = (int) ((double) this.field1312[var11] * var3);
                field1309[var11] = (this.field1303[var11] << 14) / 100;
                field1321[var11] = (int) ((double) (this.field1317.field1181 - this.field1317.field1180) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1308[var11]) / var3);
                field1324[var11] = (int) ((double) this.field1317.field1180 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1317.method1169(arg0);
            int var14 = this.field1318.method1169(arg0);
            if (this.field1301 != null) {
                int var15 = this.field1301.method1169(arg0);
                int var16 = this.field1302.method1169(arg0);
                var13 += this.method1444(var7, var16, this.field1301.field1182) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1323 != null) {
                int var17 = this.field1323.method1169(arg0);
                int var18 = this.field1322.method1169(arg0);
                var14 = var14 * ((this.method1444(var10, var18, this.field1323.field1182) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1303[var19] != 0) {
                    int var20 = field1307[var19] + var12;
                    if (var20 < arg0) {
                        field1316[var20] += this.method1444(field1320[var19], field1309[var19] * var14 >> 15, this.field1317.field1182);
                        field1320[var19] += (field1321[var19] * var13 >> 16) + field1324[var19];
                    }
                }
            }
        }
        if (this.field1305 != null) {
            this.field1305.method1168();
            this.field1306.method1168();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1305.method1169(arg0);
                int var26 = this.field1306.method1169(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1305.field1181 - this.field1305.field1180) * var25 >> 8) + this.field1305.field1180;
                } else {
                    var27 = ((this.field1305.field1181 - this.field1305.field1180) * var26 >> 8) + this.field1305.field1180;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1316[var24] = 0;
                }
            }
        }
        if (this.field1310 > 0 && this.field1311 > 0) {
            int var28 = (int) ((double) this.field1310 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1316[var29] += field1316[var29 - var28] * this.field1311 / 100;
            }
        }
        if (this.field1299.field1224[0] > 0 || this.field1299.field1224[1] > 0) {
            this.field1314.method1168();
            int var30 = this.field1314.method1169(arg0 + 1);
            int var31 = this.field1299.method1231(0, (float) var30 / 65536.0F);
            int var32 = this.field1299.method1231(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1316[var31 + var33] * (long) Statics.field1221 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1316[var31 + var33 - 1 - var36] * (long) class64.field1223[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1316[var33 - 1 - var37] * (long) class64.field1223[1][var37] >> 16);
                    }
                    field1316[var33] = var35;
                    var30 = this.field1314.method1169(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1316[var31 + var33] * (long) Statics.field1221 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1316[var31 + var33 - 1 - var40] * (long) class64.field1223[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1316[var33 - 1 - var41] * (long) class64.field1223[1][var41] >> 16);
                        }
                        field1316[var33] = var39;
                        var30 = this.field1314.method1169(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1316[var31 + var33 - 1 - var43] * (long) class64.field1223[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1316[var33 - 1 - var44] * (long) class64.field1223[1][var44] >> 16);
                            }
                            field1316[var33] = var42;
                            this.field1314.method1169(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1299.method1231(0, (float) var30 / 65536.0F);
                    var32 = this.field1299.method1231(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1316[var46] < -32768) {
                field1316[var46] = -32768;
            }
            if (field1316[var46] > 32767) {
                field1316[var46] = 32767;
            }
        }
        return field1316;
    }

    @ObfuscatedName("bl.h(III)I")
    public final int method1444(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1304[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1313[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bl.o(Ldk;)V")
    public final void method1445(class119 arg0) {
        this.field1317 = new class58();
        this.field1317.method1166(arg0);
        this.field1318 = new class58();
        this.field1318.method1166(arg0);
        int var2 = arg0.method2330();
        if (var2 != 0) {
            arg0.field1949--;
            this.field1301 = new class58();
            this.field1301.method1166(arg0);
            this.field1302 = new class58();
            this.field1302.method1166(arg0);
        }
        int var3 = arg0.method2330();
        if (var3 != 0) {
            arg0.field1949--;
            this.field1323 = new class58();
            this.field1323.method1166(arg0);
            this.field1322 = new class58();
            this.field1322.method1166(arg0);
        }
        int var4 = arg0.method2330();
        if (var4 != 0) {
            arg0.field1949--;
            this.field1305 = new class58();
            this.field1305.method1166(arg0);
            this.field1306 = new class58();
            this.field1306.method1166(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2314();
            if (var6 == 0) {
                break;
            }
            this.field1303[var5] = var6;
            this.field1308[var5] = arg0.method2341();
            this.field1312[var5] = arg0.method2314();
        }
        this.field1310 = arg0.method2314();
        this.field1311 = arg0.method2314();
        this.field1300 = arg0.method2332();
        this.field1315 = arg0.method2332();
        this.field1299 = new class64();
        this.field1314 = new class58();
        this.field1299.method1232(arg0, this.field1314);
    }
}
