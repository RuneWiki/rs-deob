package deob;

import java.util.Random;

@ObfuscatedName("bi")
public class class66 {

    @ObfuscatedName("bi.e")
    public class52 field1261;

    @ObfuscatedName("bi.v")
    public class52 field1266;

    @ObfuscatedName("bi.k")
    public class52 field1256;

    @ObfuscatedName("bi.g")
    public class52 field1247;

    @ObfuscatedName("bi.q")
    public class52 field1248;

    @ObfuscatedName("bi.l")
    public class52 field1249;

    @ObfuscatedName("bi.a")
    public class52 field1244;

    @ObfuscatedName("bi.b")
    public class52 field1251;

    @ObfuscatedName("bi.z")
    public int[] field1252 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bi.w")
    public int[] field1253 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bi.j")
    public int[] field1254 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bi.p")
    public int field1255 = 0;

    @ObfuscatedName("bi.n")
    public int field1265 = 100;

    @ObfuscatedName("bi.r")
    public class58 field1257;

    @ObfuscatedName("bi.s")
    public class52 field1246;

    @ObfuscatedName("bi.f")
    public int field1259 = 500;

    @ObfuscatedName("bi.c")
    public int field1260 = 0;

    @ObfuscatedName("bi.t")
    public static int[] field1264;

    @ObfuscatedName("bi.i")
    public static int[] field1262 = new int[32768];

    @ObfuscatedName("bi.u")
    public static int[] field1263;

    @ObfuscatedName("bi.o")
    public static int[] field1245;

    @ObfuscatedName("bi.m")
    public static int[] field1250;

    @ObfuscatedName("bi.h")
    public static int[] field1267;

    @ObfuscatedName("bi.x")
    public static int[] field1268;

    @ObfuscatedName("bi.d")
    public static int[] field1269;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1262[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1263 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1263[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1264 = new int[220500];
        field1245 = new int[5];
        field1250 = new int[5];
        field1267 = new int[5];
        field1268 = new int[5];
        field1269 = new int[5];
    }

    @ObfuscatedName("bi.e(II)[I")
    public final int[] method1316(int arg0, int arg1) {
        class109.method2328(field1264, 0, arg0);
        if (arg1 < 10) {
            return field1264;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1261.method1030();
        this.field1266.method1030();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1256 != null) {
            this.field1256.method1030();
            this.field1247.method1030();
            var5 = (int) ((double) (this.field1256.field1123 - this.field1256.field1122) * 32.768D / var3);
            var6 = (int) ((double) this.field1256.field1122 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1248 != null) {
            this.field1248.method1030();
            this.field1249.method1030();
            var8 = (int) ((double) (this.field1248.field1123 - this.field1248.field1122) * 32.768D / var3);
            var9 = (int) ((double) this.field1248.field1122 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1252[var11] != 0) {
                field1245[var11] = 0;
                field1250[var11] = (int) ((double) this.field1254[var11] * var3);
                field1267[var11] = (this.field1252[var11] << 14) / 100;
                field1268[var11] = (int) ((double) (this.field1261.field1123 - this.field1261.field1122) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1253[var11]) / var3);
                field1269[var11] = (int) ((double) this.field1261.field1122 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1261.method1031(arg0);
            int var14 = this.field1266.method1031(arg0);
            if (this.field1256 != null) {
                int var15 = this.field1256.method1031(arg0);
                int var16 = this.field1247.method1031(arg0);
                var13 += this.method1317(var7, var16, this.field1256.field1121) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1248 != null) {
                int var17 = this.field1248.method1031(arg0);
                int var18 = this.field1249.method1031(arg0);
                var14 = var14 * ((this.method1317(var10, var18, this.field1248.field1121) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1252[var19] != 0) {
                    int var20 = field1250[var19] + var12;
                    if (var20 < arg0) {
                        field1264[var20] += this.method1317(field1245[var19], field1267[var19] * var14 >> 15, this.field1261.field1121);
                        field1245[var19] += (field1268[var19] * var13 >> 16) + field1269[var19];
                    }
                }
            }
        }
        if (this.field1244 != null) {
            this.field1244.method1030();
            this.field1251.method1030();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1244.method1031(arg0);
                int var26 = this.field1251.method1031(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1244.field1123 - this.field1244.field1122) * var25 >> 8) + this.field1244.field1122;
                } else {
                    var27 = ((this.field1244.field1123 - this.field1244.field1122) * var26 >> 8) + this.field1244.field1122;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1264[var24] = 0;
                }
            }
        }
        if (this.field1255 > 0 && this.field1265 > 0) {
            int var28 = (int) ((double) this.field1255 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1264[var29] += field1264[var29 - var28] * this.field1265 / 100;
            }
        }
        if (this.field1257.field1161[0] > 0 || this.field1257.field1161[1] > 0) {
            this.field1246.method1030();
            int var30 = this.field1246.method1031(arg0 + 1);
            int var31 = this.field1257.method1094(0, (float) var30 / 65536.0F);
            int var32 = this.field1257.method1094(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1264[var31 + var33] * (long) Statics.field1166 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1264[var31 + var33 - 1 - var36] * (long) class58.field1169[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1264[var33 - 1 - var37] * (long) class58.field1169[1][var37] >> 16);
                    }
                    field1264[var33] = var35;
                    var30 = this.field1246.method1031(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1264[var31 + var33] * (long) Statics.field1166 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1264[var31 + var33 - 1 - var40] * (long) class58.field1169[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1264[var33 - 1 - var41] * (long) class58.field1169[1][var41] >> 16);
                        }
                        field1264[var33] = var39;
                        var30 = this.field1246.method1031(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1264[var31 + var33 - 1 - var43] * (long) class58.field1169[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1264[var33 - 1 - var44] * (long) class58.field1169[1][var44] >> 16);
                            }
                            field1264[var33] = var42;
                            this.field1246.method1031(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1257.method1094(0, (float) var30 / 65536.0F);
                    var32 = this.field1257.method1094(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1264[var46] < -32768) {
                field1264[var46] = -32768;
            }
            if (field1264[var46] > 32767) {
                field1264[var46] = 32767;
            }
        }
        return field1264;
    }

    @ObfuscatedName("bi.v(III)I")
    public final int method1317(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1263[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1262[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bi.k(Ldd;)V")
    public final void method1318(class108 arg0) {
        this.field1261 = new class52();
        this.field1261.method1029(arg0);
        this.field1266 = new class52();
        this.field1266.method1029(arg0);
        int var2 = arg0.method2122();
        if (var2 != 0) {
            arg0.field1841--;
            this.field1256 = new class52();
            this.field1256.method1029(arg0);
            this.field1247 = new class52();
            this.field1247.method1029(arg0);
        }
        int var3 = arg0.method2122();
        if (var3 != 0) {
            arg0.field1841--;
            this.field1248 = new class52();
            this.field1248.method1029(arg0);
            this.field1249 = new class52();
            this.field1249.method1029(arg0);
        }
        int var4 = arg0.method2122();
        if (var4 != 0) {
            arg0.field1841--;
            this.field1244 = new class52();
            this.field1244.method1029(arg0);
            this.field1251 = new class52();
            this.field1251.method1029(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2135();
            if (var6 == 0) {
                break;
            }
            this.field1252[var5] = var6;
            this.field1253[var5] = arg0.method2210();
            this.field1254[var5] = arg0.method2135();
        }
        this.field1255 = arg0.method2135();
        this.field1265 = arg0.method2135();
        this.field1259 = arg0.method2124();
        this.field1260 = arg0.method2124();
        this.field1257 = new class58();
        this.field1246 = new class52();
        this.field1257.method1095(arg0, this.field1246);
    }
}
