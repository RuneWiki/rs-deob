package deob;

import java.util.Random;

@ObfuscatedName("bk")
public class class67 {

    @ObfuscatedName("bk.n")
    public class53 field1294;

    @ObfuscatedName("bk.o")
    public class53 field1272;

    @ObfuscatedName("bk.a")
    public class53 field1273;

    @ObfuscatedName("bk.w")
    public class53 field1285;

    @ObfuscatedName("bk.m")
    public class53 field1274;

    @ObfuscatedName("bk.h")
    public class53 field1276;

    @ObfuscatedName("bk.i")
    public class53 field1277;

    @ObfuscatedName("bk.r")
    public class53 field1278;

    @ObfuscatedName("bk.l")
    public int[] field1283 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bk.f")
    public int[] field1280 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bk.e")
    public int[] field1279 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bk.z")
    public int field1287 = 0;

    @ObfuscatedName("bk.v")
    public int field1275 = 100;

    @ObfuscatedName("bk.x")
    public class59 field1284;

    @ObfuscatedName("bk.q")
    public class53 field1296;

    @ObfuscatedName("bk.b")
    public int field1286 = 500;

    @ObfuscatedName("bk.u")
    public int field1271 = 0;

    @ObfuscatedName("bk.t")
    public static int[] field1288;

    @ObfuscatedName("bk.s")
    public static int[] field1282 = new int[32768];

    @ObfuscatedName("bk.p")
    public static int[] field1290;

    @ObfuscatedName("bk.j")
    public static int[] field1292;

    @ObfuscatedName("bk.k")
    public static int[] field1293;

    @ObfuscatedName("bk.y")
    public static int[] field1281;

    @ObfuscatedName("bk.c")
    public static int[] field1295;

    @ObfuscatedName("bk.g")
    public static int[] field1289;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1282[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1290 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1290[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1288 = new int[220500];
        field1292 = new int[5];
        field1293 = new int[5];
        field1281 = new int[5];
        field1295 = new int[5];
        field1289 = new int[5];
    }

    @ObfuscatedName("bk.n(II)[I")
    public final int[] method1390(int arg0, int arg1) {
        class112.method2463(field1288, 0, arg0);
        if (arg1 < 10) {
            return field1288;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1294.method1110();
        this.field1272.method1110();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1273 != null) {
            this.field1273.method1110();
            this.field1285.method1110();
            var5 = (int) ((double) (this.field1273.field1152 - this.field1273.field1156) * 32.768D / var3);
            var6 = (int) ((double) this.field1273.field1156 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1274 != null) {
            this.field1274.method1110();
            this.field1276.method1110();
            var8 = (int) ((double) (this.field1274.field1152 - this.field1274.field1156) * 32.768D / var3);
            var9 = (int) ((double) this.field1274.field1156 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1283[var11] != 0) {
                field1292[var11] = 0;
                field1293[var11] = (int) ((double) this.field1279[var11] * var3);
                field1281[var11] = (this.field1283[var11] << 14) / 100;
                field1295[var11] = (int) ((double) (this.field1294.field1152 - this.field1294.field1156) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1280[var11]) / var3);
                field1289[var11] = (int) ((double) this.field1294.field1156 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1294.method1120(arg0);
            int var14 = this.field1272.method1120(arg0);
            if (this.field1273 != null) {
                int var15 = this.field1273.method1120(arg0);
                int var16 = this.field1285.method1120(arg0);
                var13 += this.method1391(var7, var16, this.field1273.field1151) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1274 != null) {
                int var17 = this.field1274.method1120(arg0);
                int var18 = this.field1276.method1120(arg0);
                var14 = var14 * ((this.method1391(var10, var18, this.field1274.field1151) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1283[var19] != 0) {
                    int var20 = field1293[var19] + var12;
                    if (var20 < arg0) {
                        field1288[var20] += this.method1391(field1292[var19], field1281[var19] * var14 >> 15, this.field1294.field1151);
                        field1292[var19] += (field1295[var19] * var13 >> 16) + field1289[var19];
                    }
                }
            }
        }
        if (this.field1277 != null) {
            this.field1277.method1110();
            this.field1278.method1110();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1277.method1120(arg0);
                int var26 = this.field1278.method1120(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1277.field1152 - this.field1277.field1156) * var25 >> 8) + this.field1277.field1156;
                } else {
                    var27 = ((this.field1277.field1152 - this.field1277.field1156) * var26 >> 8) + this.field1277.field1156;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1288[var24] = 0;
                }
            }
        }
        if (this.field1287 > 0 && this.field1275 > 0) {
            int var28 = (int) ((double) this.field1287 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1288[var29] += field1288[var29 - var28] * this.field1275 / 100;
            }
        }
        if (this.field1284.field1190[0] > 0 || this.field1284.field1190[1] > 0) {
            this.field1296.method1110();
            int var30 = this.field1296.method1120(arg0 + 1);
            int var31 = this.field1284.method1166(0, (float) var30 / 65536.0F);
            int var32 = this.field1284.method1166(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1288[var31 + var33] * (long) Statics.field1193 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1288[var31 + var33 - 1 - var36] * (long) class59.field1191[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1288[var33 - 1 - var37] * (long) class59.field1191[1][var37] >> 16);
                    }
                    field1288[var33] = var35;
                    var30 = this.field1296.method1120(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1288[var31 + var33] * (long) Statics.field1193 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1288[var31 + var33 - 1 - var40] * (long) class59.field1191[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1288[var33 - 1 - var41] * (long) class59.field1191[1][var41] >> 16);
                        }
                        field1288[var33] = var39;
                        var30 = this.field1296.method1120(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1288[var31 + var33 - 1 - var43] * (long) class59.field1191[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1288[var33 - 1 - var44] * (long) class59.field1191[1][var44] >> 16);
                            }
                            field1288[var33] = var42;
                            this.field1296.method1120(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1284.method1166(0, (float) var30 / 65536.0F);
                    var32 = this.field1284.method1166(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1288[var46] < -32768) {
                field1288[var46] = -32768;
            }
            if (field1288[var46] > 32767) {
                field1288[var46] = 32767;
            }
        }
        return field1288;
    }

    @ObfuscatedName("bk.o(III)I")
    public final int method1391(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1290[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1282[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bk.a(Ldl;)V")
    public final void method1392(class111 arg0) {
        this.field1294 = new class53();
        this.field1294.method1107(arg0);
        this.field1272 = new class53();
        this.field1272.method1107(arg0);
        int var2 = arg0.method2234();
        if (var2 != 0) {
            arg0.field1890--;
            this.field1273 = new class53();
            this.field1273.method1107(arg0);
            this.field1285 = new class53();
            this.field1285.method1107(arg0);
        }
        int var3 = arg0.method2234();
        if (var3 != 0) {
            arg0.field1890--;
            this.field1274 = new class53();
            this.field1274.method1107(arg0);
            this.field1276 = new class53();
            this.field1276.method1107(arg0);
        }
        int var4 = arg0.method2234();
        if (var4 != 0) {
            arg0.field1890--;
            this.field1277 = new class53();
            this.field1277.method1107(arg0);
            this.field1278 = new class53();
            this.field1278.method1107(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2247();
            if (var6 == 0) {
                break;
            }
            this.field1283[var5] = var6;
            this.field1280[var5] = arg0.method2246();
            this.field1279[var5] = arg0.method2247();
        }
        this.field1287 = arg0.method2247();
        this.field1275 = arg0.method2247();
        this.field1286 = arg0.method2236();
        this.field1271 = arg0.method2236();
        this.field1284 = new class59();
        this.field1296 = new class53();
        this.field1284.method1167(arg0, this.field1296);
    }
}
