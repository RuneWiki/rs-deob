package deob;

import java.util.Random;

@ObfuscatedName("bw")
public class class65 {

    @ObfuscatedName("bw.t")
    public class51 field1245;

    @ObfuscatedName("bw.o")
    public class51 field1225;

    @ObfuscatedName("bw.i")
    public class51 field1226;

    @ObfuscatedName("bw.p")
    public class51 field1227;

    @ObfuscatedName("bw.c")
    public class51 field1228;

    @ObfuscatedName("bw.y")
    public class51 field1229;

    @ObfuscatedName("bw.g")
    public class51 field1230;

    @ObfuscatedName("bw.l")
    public class51 field1231;

    @ObfuscatedName("bw.h")
    public int[] field1247 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bw.n")
    public int[] field1236 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bw.w")
    public int[] field1244 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bw.m")
    public int field1235 = 0;

    @ObfuscatedName("bw.x")
    public int field1239 = 100;

    @ObfuscatedName("bw.b")
    public class57 field1237;

    @ObfuscatedName("bw.u")
    public class51 field1238;

    @ObfuscatedName("bw.r")
    public int field1240 = 500;

    @ObfuscatedName("bw.z")
    public int field1233 = 0;

    @ObfuscatedName("bw.v")
    public static int[] field1241;

    @ObfuscatedName("bw.k")
    public static int[] field1242 = new int[32768];

    @ObfuscatedName("bw.a")
    public static int[] field1243;

    @ObfuscatedName("bw.j")
    public static int[] field1224;

    @ObfuscatedName("bw.s")
    public static int[] field1246;

    @ObfuscatedName("bw.f")
    public static int[] field1232;

    @ObfuscatedName("bw.e")
    public static int[] field1248;

    @ObfuscatedName("bw.q")
    public static int[] field1249;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1242[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1243 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1243[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1241 = new int[220500];
        field1224 = new int[5];
        field1246 = new int[5];
        field1232 = new int[5];
        field1248 = new int[5];
        field1249 = new int[5];
    }

    @ObfuscatedName("bw.t(II)[I")
    public final int[] method1292(int arg0, int arg1) {
        class108.method2312(field1241, 0, arg0);
        if (arg1 < 10) {
            return field1241;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1245.method1002();
        this.field1225.method1002();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1226 != null) {
            this.field1226.method1002();
            this.field1227.method1002();
            var5 = (int) ((double) (this.field1226.field1102 - this.field1226.field1101) * 32.768D / var3);
            var6 = (int) ((double) this.field1226.field1101 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1228 != null) {
            this.field1228.method1002();
            this.field1229.method1002();
            var8 = (int) ((double) (this.field1228.field1102 - this.field1228.field1101) * 32.768D / var3);
            var9 = (int) ((double) this.field1228.field1101 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1247[var11] != 0) {
                field1224[var11] = 0;
                field1246[var11] = (int) ((double) this.field1244[var11] * var3);
                field1232[var11] = (this.field1247[var11] << 14) / 100;
                field1248[var11] = (int) ((double) (this.field1245.field1102 - this.field1245.field1101) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1236[var11]) / var3);
                field1249[var11] = (int) ((double) this.field1245.field1101 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1245.method1003(arg0);
            int var14 = this.field1225.method1003(arg0);
            if (this.field1226 != null) {
                int var15 = this.field1226.method1003(arg0);
                int var16 = this.field1227.method1003(arg0);
                var13 += this.method1300(var7, var16, this.field1226.field1098) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1228 != null) {
                int var17 = this.field1228.method1003(arg0);
                int var18 = this.field1229.method1003(arg0);
                var14 = var14 * ((this.method1300(var10, var18, this.field1228.field1098) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1247[var19] != 0) {
                    int var20 = field1246[var19] + var12;
                    if (var20 < arg0) {
                        field1241[var20] += this.method1300(field1224[var19], field1232[var19] * var14 >> 15, this.field1245.field1098);
                        field1224[var19] += (field1248[var19] * var13 >> 16) + field1249[var19];
                    }
                }
            }
        }
        if (this.field1230 != null) {
            this.field1230.method1002();
            this.field1231.method1002();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1230.method1003(arg0);
                int var26 = this.field1231.method1003(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1230.field1102 - this.field1230.field1101) * var25 >> 8) + this.field1230.field1101;
                } else {
                    var27 = ((this.field1230.field1102 - this.field1230.field1101) * var26 >> 8) + this.field1230.field1101;
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
        if (this.field1235 > 0 && this.field1239 > 0) {
            int var28 = (int) ((double) this.field1235 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1241[var29] += field1241[var29 - var28] * this.field1239 / 100;
            }
        }
        if (this.field1237.field1147[0] > 0 || this.field1237.field1147[1] > 0) {
            this.field1238.method1002();
            int var30 = this.field1238.method1003(arg0 + 1);
            int var31 = this.field1237.method1061(0, (float) var30 / 65536.0F);
            int var32 = this.field1237.method1061(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1241[var31 + var33] * (long) Statics.field1138 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1241[var31 + var33 - 1 - var36] * (long) class57.field1144[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1241[var33 - 1 - var37] * (long) class57.field1144[1][var37] >> 16);
                    }
                    field1241[var33] = var35;
                    var30 = this.field1238.method1003(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1241[var31 + var33] * (long) Statics.field1138 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1241[var31 + var33 - 1 - var40] * (long) class57.field1144[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1241[var33 - 1 - var41] * (long) class57.field1144[1][var41] >> 16);
                        }
                        field1241[var33] = var39;
                        var30 = this.field1238.method1003(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1241[var31 + var33 - 1 - var43] * (long) class57.field1144[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1241[var33 - 1 - var44] * (long) class57.field1144[1][var44] >> 16);
                            }
                            field1241[var33] = var42;
                            this.field1238.method1003(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1237.method1061(0, (float) var30 / 65536.0F);
                    var32 = this.field1237.method1061(1, (float) var30 / 65536.0F);
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

    @ObfuscatedName("bw.o(III)I")
    public final int method1300(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1243[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1242[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bw.i(Ldg;)V")
    public final void method1294(class107 arg0) {
        this.field1245 = new class51();
        this.field1245.method1000(arg0);
        this.field1225 = new class51();
        this.field1225.method1000(arg0);
        int var2 = arg0.method2118();
        if (var2 != 0) {
            arg0.field1827--;
            this.field1226 = new class51();
            this.field1226.method1000(arg0);
            this.field1227 = new class51();
            this.field1227.method1000(arg0);
        }
        int var3 = arg0.method2118();
        if (var3 != 0) {
            arg0.field1827--;
            this.field1228 = new class51();
            this.field1228.method1000(arg0);
            this.field1229 = new class51();
            this.field1229.method1000(arg0);
        }
        int var4 = arg0.method2118();
        if (var4 != 0) {
            arg0.field1827--;
            this.field1230 = new class51();
            this.field1230.method1000(arg0);
            this.field1231 = new class51();
            this.field1231.method1000(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2198();
            if (var6 == 0) {
                break;
            }
            this.field1247[var5] = var6;
            this.field1236[var5] = arg0.method2127();
            this.field1244[var5] = arg0.method2198();
        }
        this.field1235 = arg0.method2198();
        this.field1239 = arg0.method2198();
        this.field1240 = arg0.method2120();
        this.field1233 = arg0.method2120();
        this.field1237 = new class57();
        this.field1238 = new class51();
        this.field1237.method1066(arg0, this.field1238);
    }
}
