package deob;

import java.util.Random;

@ObfuscatedName("bc")
public class class67 {

    @ObfuscatedName("bc.b")
    public class53 field1260;

    @ObfuscatedName("bc.e")
    public class53 field1258;

    @ObfuscatedName("bc.a")
    public class53 field1259;

    @ObfuscatedName("bc.k")
    public class53 field1276;

    @ObfuscatedName("bc.p")
    public class53 field1261;

    @ObfuscatedName("bc.l")
    public class53 field1257;

    @ObfuscatedName("bc.u")
    public class53 field1275;

    @ObfuscatedName("bc.o")
    public class53 field1278;

    @ObfuscatedName("bc.m")
    public int[] field1265 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bc.q")
    public int[] field1262 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bc.v")
    public int[] field1267 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bc.n")
    public int field1268 = 0;

    @ObfuscatedName("bc.z")
    public int field1264 = 100;

    @ObfuscatedName("bc.r")
    public class59 field1263;

    @ObfuscatedName("bc.i")
    public class53 field1269;

    @ObfuscatedName("bc.s")
    public int field1272 = 500;

    @ObfuscatedName("bc.c")
    public int field1273 = 0;

    @ObfuscatedName("bc.t")
    public static int[] field1270;

    @ObfuscatedName("bc.h")
    public static int[] field1274 = new int[32768];

    @ObfuscatedName("bc.w")
    public static int[] field1266;

    @ObfuscatedName("bc.f")
    public static int[] field1271;

    @ObfuscatedName("bc.y")
    public static int[] field1279;

    @ObfuscatedName("bc.j")
    public static int[] field1280;

    @ObfuscatedName("bc.x")
    public static int[] field1281;

    @ObfuscatedName("bc.d")
    public static int[] field1282;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1274[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1266 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1266[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1270 = new int[220500];
        field1271 = new int[5];
        field1279 = new int[5];
        field1280 = new int[5];
        field1281 = new int[5];
        field1282 = new int[5];
    }

    @ObfuscatedName("bc.b(II)[I")
    public final int[] method1312(int arg0, int arg1) {
        class112.method2349(field1270, 0, arg0);
        if (arg1 < 10) {
            return field1270;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1260.method1047();
        this.field1258.method1047();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1259 != null) {
            this.field1259.method1047();
            this.field1276.method1047();
            var5 = (int) ((double) (this.field1259.field1133 - this.field1259.field1132) * 32.768D / var3);
            var6 = (int) ((double) this.field1259.field1132 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1261 != null) {
            this.field1261.method1047();
            this.field1257.method1047();
            var8 = (int) ((double) (this.field1261.field1133 - this.field1261.field1132) * 32.768D / var3);
            var9 = (int) ((double) this.field1261.field1132 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1265[var11] != 0) {
                field1271[var11] = 0;
                field1279[var11] = (int) ((double) this.field1267[var11] * var3);
                field1280[var11] = (this.field1265[var11] << 14) / 100;
                field1281[var11] = (int) ((double) (this.field1260.field1133 - this.field1260.field1132) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1262[var11]) / var3);
                field1282[var11] = (int) ((double) this.field1260.field1132 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1260.method1042(arg0);
            int var14 = this.field1258.method1042(arg0);
            if (this.field1259 != null) {
                int var15 = this.field1259.method1042(arg0);
                int var16 = this.field1276.method1042(arg0);
                var13 += this.method1306(var7, var16, this.field1259.field1134) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1261 != null) {
                int var17 = this.field1261.method1042(arg0);
                int var18 = this.field1257.method1042(arg0);
                var14 = var14 * ((this.method1306(var10, var18, this.field1261.field1134) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1265[var19] != 0) {
                    int var20 = field1279[var19] + var12;
                    if (var20 < arg0) {
                        field1270[var20] += this.method1306(field1271[var19], field1280[var19] * var14 >> 15, this.field1260.field1134);
                        field1271[var19] += (field1281[var19] * var13 >> 16) + field1282[var19];
                    }
                }
            }
        }
        if (this.field1275 != null) {
            this.field1275.method1047();
            this.field1278.method1047();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1275.method1042(arg0);
                int var26 = this.field1278.method1042(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1275.field1133 - this.field1275.field1132) * var25 >> 8) + this.field1275.field1132;
                } else {
                    var27 = ((this.field1275.field1133 - this.field1275.field1132) * var26 >> 8) + this.field1275.field1132;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1270[var24] = 0;
                }
            }
        }
        if (this.field1268 > 0 && this.field1264 > 0) {
            int var28 = (int) ((double) this.field1268 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1270[var29] += field1270[var29 - var28] * this.field1264 / 100;
            }
        }
        if (this.field1263.field1173[0] > 0 || this.field1263.field1173[1] > 0) {
            this.field1269.method1047();
            int var30 = this.field1269.method1042(arg0 + 1);
            int var31 = this.field1263.method1102(0, (float) var30 / 65536.0F);
            int var32 = this.field1263.method1102(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1270[var31 + var33] * (long) Statics.field1175 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1270[var31 + var33 - 1 - var36] * (long) class59.field1177[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1270[var33 - 1 - var37] * (long) class59.field1177[1][var37] >> 16);
                    }
                    field1270[var33] = var35;
                    var30 = this.field1269.method1042(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1270[var31 + var33] * (long) Statics.field1175 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1270[var31 + var33 - 1 - var40] * (long) class59.field1177[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1270[var33 - 1 - var41] * (long) class59.field1177[1][var41] >> 16);
                        }
                        field1270[var33] = var39;
                        var30 = this.field1269.method1042(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1270[var31 + var33 - 1 - var43] * (long) class59.field1177[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1270[var33 - 1 - var44] * (long) class59.field1177[1][var44] >> 16);
                            }
                            field1270[var33] = var42;
                            this.field1269.method1042(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1263.method1102(0, (float) var30 / 65536.0F);
                    var32 = this.field1263.method1102(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1270[var46] < -32768) {
                field1270[var46] = -32768;
            }
            if (field1270[var46] > 32767) {
                field1270[var46] = 32767;
            }
        }
        return field1270;
    }

    @ObfuscatedName("bc.e(III)I")
    public final int method1306(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1266[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1274[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bc.a(Ldj;)V")
    public final void method1307(class111 arg0) {
        this.field1260 = new class53();
        this.field1260.method1039(arg0);
        this.field1258 = new class53();
        this.field1258.method1039(arg0);
        int var2 = arg0.method2127();
        if (var2 != 0) {
            arg0.field1894--;
            this.field1259 = new class53();
            this.field1259.method1039(arg0);
            this.field1276 = new class53();
            this.field1276.method1039(arg0);
        }
        int var3 = arg0.method2127();
        if (var3 != 0) {
            arg0.field1894--;
            this.field1261 = new class53();
            this.field1261.method1039(arg0);
            this.field1257 = new class53();
            this.field1257.method1039(arg0);
        }
        int var4 = arg0.method2127();
        if (var4 != 0) {
            arg0.field1894--;
            this.field1275 = new class53();
            this.field1275.method1039(arg0);
            this.field1278 = new class53();
            this.field1278.method1039(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2140();
            if (var6 == 0) {
                break;
            }
            this.field1265[var5] = var6;
            this.field1262[var5] = arg0.method2139();
            this.field1267[var5] = arg0.method2140();
        }
        this.field1268 = arg0.method2140();
        this.field1264 = arg0.method2140();
        this.field1272 = arg0.method2129();
        this.field1273 = arg0.method2129();
        this.field1263 = new class59();
        this.field1269 = new class53();
        this.field1263.method1101(arg0, this.field1269);
    }
}
