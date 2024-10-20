package deob;

import java.util.Random;

@ObfuscatedName("bk")
public class class66 {

    @ObfuscatedName("bk.b")
    public class52 field1248;

    @ObfuscatedName("bk.e")
    public class52 field1225;

    @ObfuscatedName("bk.i")
    public class52 field1226;

    @ObfuscatedName("bk.k")
    public class52 field1245;

    @ObfuscatedName("bk.h")
    public class52 field1228;

    @ObfuscatedName("bk.p")
    public class52 field1249;

    @ObfuscatedName("bk.n")
    public class52 field1229;

    @ObfuscatedName("bk.o")
    public class52 field1231;

    @ObfuscatedName("bk.g")
    public int[] field1232 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bk.z")
    public int[] field1233 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bk.t")
    public int[] field1234 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bk.y")
    public int field1235 = 0;

    @ObfuscatedName("bk.w")
    public int field1238 = 100;

    @ObfuscatedName("bk.x")
    public class58 field1237;

    @ObfuscatedName("bk.v")
    public class52 field1230;

    @ObfuscatedName("bk.q")
    public int field1227 = 500;

    @ObfuscatedName("bk.f")
    public int field1240 = 0;

    @ObfuscatedName("bk.s")
    public static int[] field1241;

    @ObfuscatedName("bk.a")
    public static int[] field1242 = new int[32768];

    @ObfuscatedName("bk.m")
    public static int[] field1239;

    @ObfuscatedName("bk.j")
    public static int[] field1224;

    @ObfuscatedName("bk.d")
    public static int[] field1246;

    @ObfuscatedName("bk.l")
    public static int[] field1247;

    @ObfuscatedName("bk.u")
    public static int[] field1243;

    @ObfuscatedName("bk.r")
    public static int[] field1236;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1242[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1239 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1239[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1241 = new int[220500];
        field1224 = new int[5];
        field1246 = new int[5];
        field1247 = new int[5];
        field1243 = new int[5];
        field1236 = new int[5];
    }

    @ObfuscatedName("bk.b(II)[I")
    public final int[] method1288(int arg0, int arg1) {
        class111.method2337(field1241, 0, arg0);
        if (arg1 < 10) {
            return field1241;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1248.method1015();
        this.field1225.method1015();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1226 != null) {
            this.field1226.method1015();
            this.field1245.method1015();
            var5 = (int) ((double) (this.field1226.field1107 - this.field1226.field1111) * 32.768D / var3);
            var6 = (int) ((double) this.field1226.field1111 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1228 != null) {
            this.field1228.method1015();
            this.field1249.method1015();
            var8 = (int) ((double) (this.field1228.field1107 - this.field1228.field1111) * 32.768D / var3);
            var9 = (int) ((double) this.field1228.field1111 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1232[var11] != 0) {
                field1224[var11] = 0;
                field1246[var11] = (int) ((double) this.field1234[var11] * var3);
                field1247[var11] = (this.field1232[var11] << 14) / 100;
                field1243[var11] = (int) ((double) (this.field1248.field1107 - this.field1248.field1111) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1233[var11]) / var3);
                field1236[var11] = (int) ((double) this.field1248.field1111 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1248.method1016(arg0);
            int var14 = this.field1225.method1016(arg0);
            if (this.field1226 != null) {
                int var15 = this.field1226.method1016(arg0);
                int var16 = this.field1245.method1016(arg0);
                var13 += this.method1289(var7, var16, this.field1226.field1108) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1228 != null) {
                int var17 = this.field1228.method1016(arg0);
                int var18 = this.field1249.method1016(arg0);
                var14 = var14 * ((this.method1289(var10, var18, this.field1228.field1108) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1232[var19] != 0) {
                    int var20 = field1246[var19] + var12;
                    if (var20 < arg0) {
                        field1241[var20] += this.method1289(field1224[var19], field1247[var19] * var14 >> 15, this.field1248.field1108);
                        field1224[var19] += (field1243[var19] * var13 >> 16) + field1236[var19];
                    }
                }
            }
        }
        if (this.field1229 != null) {
            this.field1229.method1015();
            this.field1231.method1015();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1229.method1016(arg0);
                int var26 = this.field1231.method1016(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1229.field1107 - this.field1229.field1111) * var25 >> 8) + this.field1229.field1111;
                } else {
                    var27 = ((this.field1229.field1107 - this.field1229.field1111) * var26 >> 8) + this.field1229.field1111;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1241[var24] = 0;
                }
            }
        }
        if (this.field1235 > 0 && this.field1238 > 0) {
            int var28 = (int) ((double) this.field1235 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1241[var29] += field1241[var29 - var28] * this.field1238 / 100;
            }
        }
        if (this.field1237.field1143[0] > 0 || this.field1237.field1143[1] > 0) {
            this.field1230.method1015();
            int var30 = this.field1230.method1016(arg0 + 1);
            int var31 = this.field1237.method1068(0, (float) var30 / 65536.0F);
            int var32 = this.field1237.method1068(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1241[var31 + var33] * (long) Statics.field1146 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1241[var31 + var33 - 1 - var36] * (long) class58.field1144[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1241[var33 - 1 - var37] * (long) class58.field1144[1][var37] >> 16);
                    }
                    field1241[var33] = var35;
                    var30 = this.field1230.method1016(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1241[var31 + var33] * (long) Statics.field1146 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1241[var31 + var33 - 1 - var40] * (long) class58.field1144[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1241[var33 - 1 - var41] * (long) class58.field1144[1][var41] >> 16);
                        }
                        field1241[var33] = var39;
                        var30 = this.field1230.method1016(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1241[var31 + var33 - 1 - var43] * (long) class58.field1144[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1241[var33 - 1 - var44] * (long) class58.field1144[1][var44] >> 16);
                            }
                            field1241[var33] = var42;
                            this.field1230.method1016(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1237.method1068(0, (float) var30 / 65536.0F);
                    var32 = this.field1237.method1068(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1241[var46] < -32768) {
                field1241[var46] = -32768;
            }
            if (field1241[var46] > 32767) {
                field1241[var46] = 32767;
            }
        }
        return field1241;
    }

    @ObfuscatedName("bk.e(III)I")
    public final int method1289(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1239[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1242[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bk.i(Ldc;)V")
    public final void method1295(class110 arg0) {
        this.field1248 = new class52();
        this.field1248.method1013(arg0);
        this.field1225 = new class52();
        this.field1225.method1013(arg0);
        int var2 = arg0.method2142();
        if (var2 != 0) {
            arg0.field1855--;
            this.field1226 = new class52();
            this.field1226.method1013(arg0);
            this.field1245 = new class52();
            this.field1245.method1013(arg0);
        }
        int var3 = arg0.method2142();
        if (var3 != 0) {
            arg0.field1855--;
            this.field1228 = new class52();
            this.field1228.method1013(arg0);
            this.field1249 = new class52();
            this.field1249.method1013(arg0);
        }
        int var4 = arg0.method2142();
        if (var4 != 0) {
            arg0.field1855--;
            this.field1229 = new class52();
            this.field1229.method1013(arg0);
            this.field1231 = new class52();
            this.field1231.method1013(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2155();
            if (var6 == 0) {
                break;
            }
            this.field1232[var5] = var6;
            this.field1233[var5] = arg0.method2154();
            this.field1234[var5] = arg0.method2155();
        }
        this.field1235 = arg0.method2155();
        this.field1238 = arg0.method2155();
        this.field1227 = arg0.method2292();
        this.field1240 = arg0.method2292();
        this.field1237 = new class58();
        this.field1230 = new class52();
        this.field1237.method1067(arg0, this.field1230);
    }
}
