package deob;

import java.util.Random;

@ObfuscatedName("by")
public class class70 {

    @ObfuscatedName("by.j")
    public class56 field1311;

    @ObfuscatedName("by.y")
    public class56 field1291;

    @ObfuscatedName("by.z")
    public class56 field1292;

    @ObfuscatedName("by.l")
    public class56 field1293;

    @ObfuscatedName("by.w")
    public class56 field1304;

    @ObfuscatedName("by.d")
    public class56 field1298;

    @ObfuscatedName("by.f")
    public class56 field1296;

    @ObfuscatedName("by.i")
    public class56 field1297;

    @ObfuscatedName("by.a")
    public int[] field1295 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("by.o")
    public int[] field1299 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("by.u")
    public int[] field1300 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("by.m")
    public int field1308 = 0;

    @ObfuscatedName("by.e")
    public int field1302 = 100;

    @ObfuscatedName("by.v")
    public class62 field1303;

    @ObfuscatedName("by.r")
    public class56 field1290;

    @ObfuscatedName("by.t")
    public int field1294 = 500;

    @ObfuscatedName("by.g")
    public int field1306 = 0;

    @ObfuscatedName("by.s")
    public static int[] field1307;

    @ObfuscatedName("by.n")
    public static int[] field1301 = new int[32768];

    @ObfuscatedName("by.h")
    public static int[] field1309;

    @ObfuscatedName("by.c")
    public static int[] field1305;

    @ObfuscatedName("by.x")
    public static int[] field1312;

    @ObfuscatedName("by.q")
    public static int[] field1313;

    @ObfuscatedName("by.b")
    public static int[] field1314;

    @ObfuscatedName("by.k")
    public static int[] field1315;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1301[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1309 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1309[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1307 = new int[220500];
        field1305 = new int[5];
        field1312 = new int[5];
        field1313 = new int[5];
        field1314 = new int[5];
        field1315 = new int[5];
    }

    @ObfuscatedName("by.j(II)[I")
    public final int[] method1514(int arg0, int arg1) {
        class115.method2532(field1307, 0, arg0);
        if (arg1 < 10) {
            return field1307;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1311.method1231();
        this.field1291.method1231();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1292 != null) {
            this.field1292.method1231();
            this.field1293.method1231();
            var5 = (int) ((double) (this.field1292.field1172 - this.field1292.field1171) * 32.768D / var3);
            var6 = (int) ((double) this.field1292.field1171 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1304 != null) {
            this.field1304.method1231();
            this.field1298.method1231();
            var8 = (int) ((double) (this.field1304.field1172 - this.field1304.field1171) * 32.768D / var3);
            var9 = (int) ((double) this.field1304.field1171 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1295[var11] != 0) {
                field1305[var11] = 0;
                field1312[var11] = (int) ((double) this.field1300[var11] * var3);
                field1313[var11] = (this.field1295[var11] << 14) / 100;
                field1314[var11] = (int) ((double) (this.field1311.field1172 - this.field1311.field1171) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1299[var11]) / var3);
                field1315[var11] = (int) ((double) this.field1311.field1171 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1311.method1233(arg0);
            int var14 = this.field1291.method1233(arg0);
            if (this.field1292 != null) {
                int var15 = this.field1292.method1233(arg0);
                int var16 = this.field1293.method1233(arg0);
                var13 += this.method1513(var7, var16, this.field1292.field1173) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1304 != null) {
                int var17 = this.field1304.method1233(arg0);
                int var18 = this.field1298.method1233(arg0);
                var14 = var14 * ((this.method1513(var10, var18, this.field1304.field1173) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1295[var19] != 0) {
                    int var20 = field1312[var19] + var12;
                    if (var20 < arg0) {
                        field1307[var20] += this.method1513(field1305[var19], field1313[var19] * var14 >> 15, this.field1311.field1173);
                        field1305[var19] += (field1314[var19] * var13 >> 16) + field1315[var19];
                    }
                }
            }
        }
        if (this.field1296 != null) {
            this.field1296.method1231();
            this.field1297.method1231();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1296.method1233(arg0);
                int var26 = this.field1297.method1233(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1296.field1172 - this.field1296.field1171) * var25 >> 8) + this.field1296.field1171;
                } else {
                    var27 = ((this.field1296.field1172 - this.field1296.field1171) * var26 >> 8) + this.field1296.field1171;
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
        if (this.field1308 > 0 && this.field1302 > 0) {
            int var28 = (int) ((double) this.field1308 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1307[var29] += field1307[var29 - var28] * this.field1302 / 100;
            }
        }
        if (this.field1303.field1208[0] > 0 || this.field1303.field1208[1] > 0) {
            this.field1290.method1231();
            int var30 = this.field1290.method1233(arg0 + 1);
            int var31 = this.field1303.method1289(0, (float) var30 / 65536.0F);
            int var32 = this.field1303.method1289(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1307[var31 + var33] * (long) Statics.field1209 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1307[var31 + var33 - 1 - var36] * (long) class62.field1210[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1307[var33 - 1 - var37] * (long) class62.field1210[1][var37] >> 16);
                    }
                    field1307[var33] = var35;
                    var30 = this.field1290.method1233(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1307[var31 + var33] * (long) Statics.field1209 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1307[var31 + var33 - 1 - var40] * (long) class62.field1210[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1307[var33 - 1 - var41] * (long) class62.field1210[1][var41] >> 16);
                        }
                        field1307[var33] = var39;
                        var30 = this.field1290.method1233(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1307[var31 + var33 - 1 - var43] * (long) class62.field1210[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1307[var33 - 1 - var44] * (long) class62.field1210[1][var44] >> 16);
                            }
                            field1307[var33] = var42;
                            this.field1290.method1233(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1303.method1289(0, (float) var30 / 65536.0F);
                    var32 = this.field1303.method1289(1, (float) var30 / 65536.0F);
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

    @ObfuscatedName("by.y(III)I")
    public final int method1513(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1309[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1301[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("by.z(Lde;)V")
    public final void method1518(class114 arg0) {
        this.field1311 = new class56();
        this.field1311.method1228(arg0);
        this.field1291 = new class56();
        this.field1291.method1228(arg0);
        int var2 = arg0.method2322();
        if (var2 != 0) {
            arg0.field1894--;
            this.field1292 = new class56();
            this.field1292.method1228(arg0);
            this.field1293 = new class56();
            this.field1293.method1228(arg0);
        }
        int var3 = arg0.method2322();
        if (var3 != 0) {
            arg0.field1894--;
            this.field1304 = new class56();
            this.field1304.method1228(arg0);
            this.field1298 = new class56();
            this.field1298.method1228(arg0);
        }
        int var4 = arg0.method2322();
        if (var4 != 0) {
            arg0.field1894--;
            this.field1296 = new class56();
            this.field1296.method1228(arg0);
            this.field1297 = new class56();
            this.field1297.method1228(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2401();
            if (var6 == 0) {
                break;
            }
            this.field1295[var5] = var6;
            this.field1299[var5] = arg0.method2473();
            this.field1300[var5] = arg0.method2401();
        }
        this.field1308 = arg0.method2401();
        this.field1302 = arg0.method2401();
        this.field1294 = arg0.method2324();
        this.field1306 = arg0.method2324();
        this.field1303 = new class62();
        this.field1290 = new class56();
        this.field1303.method1290(arg0, this.field1290);
    }
}
