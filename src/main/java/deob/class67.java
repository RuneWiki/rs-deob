package deob;

import java.util.Random;

@ObfuscatedName("bg")
public class class67 {

    @ObfuscatedName("bg.y")
    public class53 field1266;

    @ObfuscatedName("bg.k")
    public class53 field1271;

    @ObfuscatedName("bg.g")
    public class53 field1253;

    @ObfuscatedName("bg.n")
    public class53 field1254;

    @ObfuscatedName("bg.t")
    public class53 field1255;

    @ObfuscatedName("bg.e")
    public class53 field1265;

    @ObfuscatedName("bg.q")
    public class53 field1257;

    @ObfuscatedName("bg.z")
    public class53 field1262;

    @ObfuscatedName("bg.v")
    public int[] field1252 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bg.b")
    public int[] field1260 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bg.f")
    public int[] field1251 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bg.i")
    public int field1258 = 0;

    @ObfuscatedName("bg.w")
    public int field1263 = 100;

    @ObfuscatedName("bg.l")
    public class59 field1264;

    @ObfuscatedName("bg.j")
    public class53 field1259;

    @ObfuscatedName("bg.s")
    public int field1270 = 500;

    @ObfuscatedName("bg.r")
    public int field1267 = 0;

    @ObfuscatedName("bg.h")
    public static int[] field1268;

    @ObfuscatedName("bg.x")
    public static int[] field1269 = new int[32768];

    @ObfuscatedName("bg.m")
    public static int[] field1261;

    @ObfuscatedName("bg.p")
    public static int[] field1272;

    @ObfuscatedName("bg.c")
    public static int[] field1273;

    @ObfuscatedName("bg.u")
    public static int[] field1274;

    @ObfuscatedName("bg.d")
    public static int[] field1275;

    @ObfuscatedName("bg.o")
    public static int[] field1276;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1269[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1261 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1261[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1268 = new int[220500];
        field1272 = new int[5];
        field1273 = new int[5];
        field1274 = new int[5];
        field1275 = new int[5];
        field1276 = new int[5];
    }

    @ObfuscatedName("bg.y(II)[I")
    public final int[] method1350(int arg0, int arg1) {
        class112.method2378(field1268, 0, arg0);
        if (arg1 < 10) {
            return field1268;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1266.method1091();
        this.field1271.method1091();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1253 != null) {
            this.field1253.method1091();
            this.field1254.method1091();
            var5 = (int) ((double) (this.field1253.field1128 - this.field1253.field1131) * 32.768D / var3);
            var6 = (int) ((double) this.field1253.field1131 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1255 != null) {
            this.field1255.method1091();
            this.field1265.method1091();
            var8 = (int) ((double) (this.field1255.field1128 - this.field1255.field1131) * 32.768D / var3);
            var9 = (int) ((double) this.field1255.field1131 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1252[var11] != 0) {
                field1272[var11] = 0;
                field1273[var11] = (int) ((double) this.field1251[var11] * var3);
                field1274[var11] = (this.field1252[var11] << 14) / 100;
                field1275[var11] = (int) ((double) (this.field1266.field1128 - this.field1266.field1131) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1260[var11]) / var3);
                field1276[var11] = (int) ((double) this.field1266.field1131 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1266.method1087(arg0);
            int var14 = this.field1271.method1087(arg0);
            if (this.field1253 != null) {
                int var15 = this.field1253.method1087(arg0);
                int var16 = this.field1254.method1087(arg0);
                var13 += this.method1353(var7, var16, this.field1253.field1134) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1255 != null) {
                int var17 = this.field1255.method1087(arg0);
                int var18 = this.field1265.method1087(arg0);
                var14 = var14 * ((this.method1353(var10, var18, this.field1255.field1134) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1252[var19] != 0) {
                    int var20 = field1273[var19] + var12;
                    if (var20 < arg0) {
                        field1268[var20] += this.method1353(field1272[var19], field1274[var19] * var14 >> 15, this.field1266.field1134);
                        field1272[var19] += (field1275[var19] * var13 >> 16) + field1276[var19];
                    }
                }
            }
        }
        if (this.field1257 != null) {
            this.field1257.method1091();
            this.field1262.method1091();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1257.method1087(arg0);
                int var26 = this.field1262.method1087(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1257.field1128 - this.field1257.field1131) * var25 >> 8) + this.field1257.field1131;
                } else {
                    var27 = ((this.field1257.field1128 - this.field1257.field1131) * var26 >> 8) + this.field1257.field1131;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1268[var24] = 0;
                }
            }
        }
        if (this.field1258 > 0 && this.field1263 > 0) {
            int var28 = (int) ((double) this.field1258 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1268[var29] += field1268[var29 - var28] * this.field1263 / 100;
            }
        }
        if (this.field1264.field1175[0] > 0 || this.field1264.field1175[1] > 0) {
            this.field1259.method1091();
            int var30 = this.field1259.method1087(arg0 + 1);
            int var31 = this.field1264.method1142(0, (float) var30 / 65536.0F);
            int var32 = this.field1264.method1142(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1268[var31 + var33] * (long) Statics.field1173 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1268[var31 + var33 - 1 - var36] * (long) class59.field1170[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1268[var33 - 1 - var37] * (long) class59.field1170[1][var37] >> 16);
                    }
                    field1268[var33] = var35;
                    var30 = this.field1259.method1087(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1268[var31 + var33] * (long) Statics.field1173 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1268[var31 + var33 - 1 - var40] * (long) class59.field1170[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1268[var33 - 1 - var41] * (long) class59.field1170[1][var41] >> 16);
                        }
                        field1268[var33] = var39;
                        var30 = this.field1259.method1087(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1268[var31 + var33 - 1 - var43] * (long) class59.field1170[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1268[var33 - 1 - var44] * (long) class59.field1170[1][var44] >> 16);
                            }
                            field1268[var33] = var42;
                            this.field1259.method1087(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1264.method1142(0, (float) var30 / 65536.0F);
                    var32 = this.field1264.method1142(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1268[var46] < -32768) {
                field1268[var46] = -32768;
            }
            if (field1268[var46] > 32767) {
                field1268[var46] = 32767;
            }
        }
        return field1268;
    }

    @ObfuscatedName("bg.k(III)I")
    public final int method1353(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1261[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1269[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bg.g(Ldw;)V")
    public final void method1359(class111 arg0) {
        this.field1266 = new class53();
        this.field1266.method1084(arg0);
        this.field1271 = new class53();
        this.field1271.method1084(arg0);
        int var2 = arg0.method2205();
        if (var2 != 0) {
            arg0.field1902--;
            this.field1253 = new class53();
            this.field1253.method1084(arg0);
            this.field1254 = new class53();
            this.field1254.method1084(arg0);
        }
        int var3 = arg0.method2205();
        if (var3 != 0) {
            arg0.field1902--;
            this.field1255 = new class53();
            this.field1255.method1084(arg0);
            this.field1265 = new class53();
            this.field1265.method1084(arg0);
        }
        int var4 = arg0.method2205();
        if (var4 != 0) {
            arg0.field1902--;
            this.field1257 = new class53();
            this.field1257.method1084(arg0);
            this.field1262 = new class53();
            this.field1262.method1084(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2173();
            if (var6 == 0) {
                break;
            }
            this.field1252[var5] = var6;
            this.field1260[var5] = arg0.method2172();
            this.field1251[var5] = arg0.method2173();
        }
        this.field1258 = arg0.method2173();
        this.field1263 = arg0.method2173();
        this.field1270 = arg0.method2339();
        this.field1267 = arg0.method2339();
        this.field1264 = new class59();
        this.field1259 = new class53();
        this.field1264.method1144(arg0, this.field1259);
    }
}
