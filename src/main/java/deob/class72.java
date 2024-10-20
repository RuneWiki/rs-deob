package deob;

import java.util.Random;

@ObfuscatedName("bm")
public class class72 {

    @ObfuscatedName("bm.b")
    public class58 field1301;

    @ObfuscatedName("bm.g")
    public class58 field1291;

    @ObfuscatedName("bm.j")
    public class58 field1298;

    @ObfuscatedName("bm.d")
    public class58 field1310;

    @ObfuscatedName("bm.x")
    public class58 field1294;

    @ObfuscatedName("bm.y")
    public class58 field1295;

    @ObfuscatedName("bm.r")
    public class58 field1296;

    @ObfuscatedName("bm.c")
    public class58 field1297;

    @ObfuscatedName("bm.l")
    public int[] field1293 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bm.u")
    public int[] field1299 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bm.p")
    public int[] field1300 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bm.n")
    public int field1309 = 0;

    @ObfuscatedName("bm.w")
    public int field1302 = 100;

    @ObfuscatedName("bm.z")
    public class64 field1303;

    @ObfuscatedName("bm.k")
    public class58 field1315;

    @ObfuscatedName("bm.o")
    public int field1308 = 500;

    @ObfuscatedName("bm.t")
    public int field1311 = 0;

    @ObfuscatedName("bm.h")
    public static int[] field1307;

    @ObfuscatedName("bm.v")
    public static int[] field1304 = new int[32768];

    @ObfuscatedName("bm.a")
    public static int[] field1292;

    @ObfuscatedName("bm.q")
    public static int[] field1305;

    @ObfuscatedName("bm.m")
    public static int[] field1312;

    @ObfuscatedName("bm.s")
    public static int[] field1313;

    @ObfuscatedName("bm.i")
    public static int[] field1314;

    @ObfuscatedName("bm.e")
    public static int[] field1290;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1304[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1292 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1292[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1307 = new int[220500];
        field1305 = new int[5];
        field1312 = new int[5];
        field1313 = new int[5];
        field1314 = new int[5];
        field1290 = new int[5];
    }

    @ObfuscatedName("bm.b(II)[I")
    public final int[] method1473(int arg0, int arg1) {
        class121.method2598(field1307, 0, arg0);
        if (arg1 < 10) {
            return field1307;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1301.method1187();
        this.field1291.method1187();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1298 != null) {
            this.field1298.method1187();
            this.field1310.method1187();
            var5 = (int) ((double) (this.field1298.field1174 - this.field1298.field1173) * 32.768D / var3);
            var6 = (int) ((double) this.field1298.field1173 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1294 != null) {
            this.field1294.method1187();
            this.field1295.method1187();
            var8 = (int) ((double) (this.field1294.field1174 - this.field1294.field1173) * 32.768D / var3);
            var9 = (int) ((double) this.field1294.field1173 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1293[var11] != 0) {
                field1305[var11] = 0;
                field1312[var11] = (int) ((double) this.field1300[var11] * var3);
                field1313[var11] = (this.field1293[var11] << 14) / 100;
                field1314[var11] = (int) ((double) (this.field1301.field1174 - this.field1301.field1173) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1299[var11]) / var3);
                field1290[var11] = (int) ((double) this.field1301.field1173 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1301.method1188(arg0);
            int var14 = this.field1291.method1188(arg0);
            if (this.field1298 != null) {
                int var15 = this.field1298.method1188(arg0);
                int var16 = this.field1310.method1188(arg0);
                var13 += this.method1474(var7, var16, this.field1298.field1179) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1294 != null) {
                int var17 = this.field1294.method1188(arg0);
                int var18 = this.field1295.method1188(arg0);
                var14 = var14 * ((this.method1474(var10, var18, this.field1294.field1179) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1293[var19] != 0) {
                    int var20 = field1312[var19] + var12;
                    if (var20 < arg0) {
                        field1307[var20] += this.method1474(field1305[var19], field1313[var19] * var14 >> 15, this.field1301.field1179);
                        field1305[var19] += (field1314[var19] * var13 >> 16) + field1290[var19];
                    }
                }
            }
        }
        if (this.field1296 != null) {
            this.field1296.method1187();
            this.field1297.method1187();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1296.method1188(arg0);
                int var26 = this.field1297.method1188(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1296.field1174 - this.field1296.field1173) * var25 >> 8) + this.field1296.field1173;
                } else {
                    var27 = ((this.field1296.field1174 - this.field1296.field1173) * var26 >> 8) + this.field1296.field1173;
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
        if (this.field1309 > 0 && this.field1302 > 0) {
            int var28 = (int) ((double) this.field1309 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1307[var29] += field1307[var29 - var28] * this.field1302 / 100;
            }
        }
        if (this.field1303.field1205[0] > 0 || this.field1303.field1205[1] > 0) {
            this.field1315.method1187();
            int var30 = this.field1315.method1188(arg0 + 1);
            int var31 = this.field1303.method1245(0, (float) var30 / 65536.0F);
            int var32 = this.field1303.method1245(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1307[var31 + var33] * (long) Statics.field1212 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1307[var31 + var33 - 1 - var36] * (long) class64.field1210[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1307[var33 - 1 - var37] * (long) class64.field1210[1][var37] >> 16);
                    }
                    field1307[var33] = var35;
                    var30 = this.field1315.method1188(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1307[var31 + var33] * (long) Statics.field1212 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1307[var31 + var33 - 1 - var40] * (long) class64.field1210[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1307[var33 - 1 - var41] * (long) class64.field1210[1][var41] >> 16);
                        }
                        field1307[var33] = var39;
                        var30 = this.field1315.method1188(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1307[var31 + var33 - 1 - var43] * (long) class64.field1210[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1307[var33 - 1 - var44] * (long) class64.field1210[1][var44] >> 16);
                            }
                            field1307[var33] = var42;
                            this.field1315.method1188(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1303.method1245(0, (float) var30 / 65536.0F);
                    var32 = this.field1303.method1245(1, (float) var30 / 65536.0F);
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

    @ObfuscatedName("bm.g(III)I")
    public final int method1474(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1292[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1304[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bm.j(Lds;)V")
    public final void method1479(class120 arg0) {
        this.field1301 = new class58();
        this.field1301.method1186(arg0);
        this.field1291 = new class58();
        this.field1291.method1186(arg0);
        int var2 = arg0.method2344();
        if (var2 != 0) {
            arg0.field1977--;
            this.field1298 = new class58();
            this.field1298.method1186(arg0);
            this.field1310 = new class58();
            this.field1310.method1186(arg0);
        }
        int var3 = arg0.method2344();
        if (var3 != 0) {
            arg0.field1977--;
            this.field1294 = new class58();
            this.field1294.method1186(arg0);
            this.field1295 = new class58();
            this.field1295.method1186(arg0);
        }
        int var4 = arg0.method2344();
        if (var4 != 0) {
            arg0.field1977--;
            this.field1296 = new class58();
            this.field1296.method1186(arg0);
            this.field1297 = new class58();
            this.field1297.method1186(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2472();
            if (var6 == 0) {
                break;
            }
            this.field1293[var5] = var6;
            this.field1299[var5] = arg0.method2519();
            this.field1300[var5] = arg0.method2472();
        }
        this.field1309 = arg0.method2472();
        this.field1302 = arg0.method2472();
        this.field1308 = arg0.method2346();
        this.field1311 = arg0.method2346();
        this.field1303 = new class64();
        this.field1315 = new class58();
        this.field1303.method1246(arg0, this.field1315);
    }
}
