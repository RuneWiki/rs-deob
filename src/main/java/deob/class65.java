package deob;

import java.util.Random;

@ObfuscatedName("bk")
public class class65 {

    @ObfuscatedName("bk.e")
    public class51 field1229;

    @ObfuscatedName("bk.o")
    public class51 field1227;

    @ObfuscatedName("bk.y")
    public class51 field1228;

    @ObfuscatedName("bk.b")
    public class51 field1239;

    @ObfuscatedName("bk.w")
    public class51 field1231;

    @ObfuscatedName("bk.r")
    public class51 field1242;

    @ObfuscatedName("bk.l")
    public class51 field1232;

    @ObfuscatedName("bk.s")
    public class51 field1233;

    @ObfuscatedName("bk.f")
    public int[] field1234 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bk.x")
    public int[] field1241 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bk.h")
    public int[] field1236 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bk.a")
    public int field1237 = 0;

    @ObfuscatedName("bk.u")
    public int field1238 = 100;

    @ObfuscatedName("bk.v")
    public class57 field1226;

    @ObfuscatedName("bk.i")
    public class51 field1240;

    @ObfuscatedName("bk.n")
    public int field1244 = 500;

    @ObfuscatedName("bk.d")
    public int field1235 = 0;

    @ObfuscatedName("bk.k")
    public static int[] field1243;

    @ObfuscatedName("bk.p")
    public static int[] field1247 = new int[32768];

    @ObfuscatedName("bk.j")
    public static int[] field1245;

    @ObfuscatedName("bk.t")
    public static int[] field1230;

    @ObfuscatedName("bk.c")
    public static int[] field1248;

    @ObfuscatedName("bk.q")
    public static int[] field1249;

    @ObfuscatedName("bk.g")
    public static int[] field1250;

    @ObfuscatedName("bk.m")
    public static int[] field1251;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1247[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1245 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1245[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1243 = new int[220500];
        field1230 = new int[5];
        field1248 = new int[5];
        field1249 = new int[5];
        field1250 = new int[5];
        field1251 = new int[5];
    }

    @ObfuscatedName("bk.e(II)[I")
    public final int[] method1292(int arg0, int arg1) {
        class108.method2264(field1243, 0, arg0);
        if (arg1 < 10) {
            return field1243;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1229.method1002();
        this.field1227.method1002();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1228 != null) {
            this.field1228.method1002();
            this.field1239.method1002();
            var5 = (int) ((double) (this.field1228.field1109 - this.field1228.field1105) * 32.768D / var3);
            var6 = (int) ((double) this.field1228.field1105 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1231 != null) {
            this.field1231.method1002();
            this.field1242.method1002();
            var8 = (int) ((double) (this.field1231.field1109 - this.field1231.field1105) * 32.768D / var3);
            var9 = (int) ((double) this.field1231.field1105 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1234[var11] != 0) {
                field1230[var11] = 0;
                field1248[var11] = (int) ((double) this.field1236[var11] * var3);
                field1249[var11] = (this.field1234[var11] << 14) / 100;
                field1250[var11] = (int) ((double) (this.field1229.field1109 - this.field1229.field1105) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1241[var11]) / var3);
                field1251[var11] = (int) ((double) this.field1229.field1105 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1229.method1003(arg0);
            int var14 = this.field1227.method1003(arg0);
            if (this.field1228 != null) {
                int var15 = this.field1228.method1003(arg0);
                int var16 = this.field1239.method1003(arg0);
                var13 += this.method1284(var7, var16, this.field1228.field1110) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1231 != null) {
                int var17 = this.field1231.method1003(arg0);
                int var18 = this.field1242.method1003(arg0);
                var14 = var14 * ((this.method1284(var10, var18, this.field1231.field1110) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1234[var19] != 0) {
                    int var20 = field1248[var19] + var12;
                    if (var20 < arg0) {
                        field1243[var20] += this.method1284(field1230[var19], field1249[var19] * var14 >> 15, this.field1229.field1110);
                        field1230[var19] += (field1250[var19] * var13 >> 16) + field1251[var19];
                    }
                }
            }
        }
        if (this.field1232 != null) {
            this.field1232.method1002();
            this.field1233.method1002();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1232.method1003(arg0);
                int var26 = this.field1233.method1003(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1232.field1109 - this.field1232.field1105) * var25 >> 8) + this.field1232.field1105;
                } else {
                    var27 = ((this.field1232.field1109 - this.field1232.field1105) * var26 >> 8) + this.field1232.field1105;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1243[var24] = 0;
                }
            }
        }
        if (this.field1237 > 0 && this.field1238 > 0) {
            int var28 = (int) ((double) this.field1237 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1243[var29] += field1243[var29 - var28] * this.field1238 / 100;
            }
        }
        if (this.field1226.field1143[0] > 0 || this.field1226.field1143[1] > 0) {
            this.field1240.method1002();
            int var30 = this.field1240.method1003(arg0 + 1);
            int var31 = this.field1226.method1074(0, (float) var30 / 65536.0F);
            int var32 = this.field1226.method1074(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1243[var31 + var33] * (long) Statics.field1148 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1243[var31 + var33 - 1 - var36] * (long) class57.field1146[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1243[var33 - 1 - var37] * (long) class57.field1146[1][var37] >> 16);
                    }
                    field1243[var33] = var35;
                    var30 = this.field1240.method1003(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1243[var31 + var33] * (long) Statics.field1148 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1243[var31 + var33 - 1 - var40] * (long) class57.field1146[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1243[var33 - 1 - var41] * (long) class57.field1146[1][var41] >> 16);
                        }
                        field1243[var33] = var39;
                        var30 = this.field1240.method1003(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1243[var31 + var33 - 1 - var43] * (long) class57.field1146[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1243[var33 - 1 - var44] * (long) class57.field1146[1][var44] >> 16);
                            }
                            field1243[var33] = var42;
                            this.field1240.method1003(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1226.method1074(0, (float) var30 / 65536.0F);
                    var32 = this.field1226.method1074(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1243[var46] < -32768) {
                field1243[var46] = -32768;
            }
            if (field1243[var46] > 32767) {
                field1243[var46] = 32767;
            }
        }
        return field1243;
    }

    @ObfuscatedName("bk.o(III)I")
    public final int method1284(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1245[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1247[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bk.y(Ldl;)V")
    public final void method1285(class107 arg0) {
        this.field1229 = new class51();
        this.field1229.method1000(arg0);
        this.field1227 = new class51();
        this.field1227.method1000(arg0);
        int var2 = arg0.method2123();
        if (var2 != 0) {
            arg0.field1841--;
            this.field1228 = new class51();
            this.field1228.method1000(arg0);
            this.field1239 = new class51();
            this.field1239.method1000(arg0);
        }
        int var3 = arg0.method2123();
        if (var3 != 0) {
            arg0.field1841--;
            this.field1231 = new class51();
            this.field1231.method1000(arg0);
            this.field1242 = new class51();
            this.field1242.method1000(arg0);
        }
        int var4 = arg0.method2123();
        if (var4 != 0) {
            arg0.field1841--;
            this.field1232 = new class51();
            this.field1232.method1000(arg0);
            this.field1233 = new class51();
            this.field1233.method1000(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2078();
            if (var6 == 0) {
                break;
            }
            this.field1234[var5] = var6;
            this.field1241[var5] = arg0.method2225();
            this.field1236[var5] = arg0.method2078();
        }
        this.field1237 = arg0.method2078();
        this.field1238 = arg0.method2078();
        this.field1244 = arg0.method2232();
        this.field1235 = arg0.method2232();
        this.field1226 = new class57();
        this.field1240 = new class51();
        this.field1226.method1060(arg0, this.field1240);
    }
}
