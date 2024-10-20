package deob;

import java.util.Random;

@ObfuscatedName("bm")
public class class55 {

    @ObfuscatedName("bm.e")
    public class57 field1172;

    @ObfuscatedName("bm.i")
    public class57 field1168;

    @ObfuscatedName("bm.k")
    public class57 field1182;

    @ObfuscatedName("bm.q")
    public class57 field1170;

    @ObfuscatedName("bm.j")
    public class57 field1178;

    @ObfuscatedName("bm.z")
    public class57 field1187;

    @ObfuscatedName("bm.m")
    public class57 field1173;

    @ObfuscatedName("bm.w")
    public class57 field1167;

    @ObfuscatedName("bm.a")
    public int[] field1175 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bm.d")
    public int[] field1176 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bm.u")
    public int[] field1177 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bm.p")
    public int field1179 = 0;

    @ObfuscatedName("bm.t")
    public int field1169 = 100;

    @ObfuscatedName("bm.g")
    public class65 field1171;

    @ObfuscatedName("bm.o")
    public class57 field1181;

    @ObfuscatedName("bm.x")
    public int field1188 = 500;

    @ObfuscatedName("bm.c")
    public int field1183 = 0;

    @ObfuscatedName("bm.b")
    public static int[] field1184;

    @ObfuscatedName("bm.f")
    public static int[] field1185 = new int[32768];

    @ObfuscatedName("bm.s")
    public static int[] field1186;

    @ObfuscatedName("bm.r")
    public static int[] field1192;

    @ObfuscatedName("bm.l")
    public static int[] field1189;

    @ObfuscatedName("bm.n")
    public static int[] field1190;

    @ObfuscatedName("bm.h")
    public static int[] field1191;

    @ObfuscatedName("bm.v")
    public static int[] field1180;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1185[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1186 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1186[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1184 = new int[220500];
        field1192 = new int[5];
        field1189 = new int[5];
        field1190 = new int[5];
        field1191 = new int[5];
        field1180 = new int[5];
    }

    @ObfuscatedName("bm.e(II)[I")
    public final int[] method1274(int arg0, int arg1) {
        class129.method2653(field1184, 0, arg0);
        if (arg1 < 10) {
            return field1184;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1172.method1291();
        this.field1168.method1291();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1182 != null) {
            this.field1182.method1291();
            this.field1170.method1291();
            var5 = (int) ((double) (this.field1182.field1209 - this.field1182.field1208) * 32.768D / var3);
            var6 = (int) ((double) this.field1182.field1208 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1178 != null) {
            this.field1178.method1291();
            this.field1187.method1291();
            var8 = (int) ((double) (this.field1178.field1209 - this.field1178.field1208) * 32.768D / var3);
            var9 = (int) ((double) this.field1178.field1208 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1175[var11] != 0) {
                field1192[var11] = 0;
                field1189[var11] = (int) ((double) this.field1177[var11] * var3);
                field1190[var11] = (this.field1175[var11] << 14) / 100;
                field1191[var11] = (int) ((double) (this.field1172.field1209 - this.field1172.field1208) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1176[var11]) / var3);
                field1180[var11] = (int) ((double) this.field1172.field1208 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1172.method1296(arg0);
            int var14 = this.field1168.method1296(arg0);
            if (this.field1182 != null) {
                int var15 = this.field1182.method1296(arg0);
                int var16 = this.field1170.method1296(arg0);
                var13 += this.method1278(var7, var16, this.field1182.field1210) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1178 != null) {
                int var17 = this.field1178.method1296(arg0);
                int var18 = this.field1187.method1296(arg0);
                var14 = var14 * ((this.method1278(var10, var18, this.field1178.field1210) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1175[var19] != 0) {
                    int var20 = field1189[var19] + var12;
                    if (var20 < arg0) {
                        field1184[var20] += this.method1278(field1192[var19], field1190[var19] * var14 >> 15, this.field1172.field1210);
                        field1192[var19] += (field1191[var19] * var13 >> 16) + field1180[var19];
                    }
                }
            }
        }
        if (this.field1173 != null) {
            this.field1173.method1291();
            this.field1167.method1291();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1173.method1296(arg0);
                int var26 = this.field1167.method1296(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1173.field1209 - this.field1173.field1208) * var25 >> 8) + this.field1173.field1208;
                } else {
                    var27 = ((this.field1173.field1209 - this.field1173.field1208) * var26 >> 8) + this.field1173.field1208;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1184[var24] = 0;
                }
            }
        }
        if (this.field1179 > 0 && this.field1169 > 0) {
            int var28 = (int) ((double) this.field1179 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1184[var29] += field1184[var29 - var28] * this.field1169 / 100;
            }
        }
        if (this.field1171.field1259[0] > 0 || this.field1171.field1259[1] > 0) {
            this.field1181.method1291();
            int var30 = this.field1181.method1296(arg0 + 1);
            int var31 = this.field1171.method1381(0, (float) var30 / 65536.0F);
            int var32 = this.field1171.method1381(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1184[var31 + var33] * (long) Statics.field1265 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1184[var31 + var33 - 1 - var36] * (long) class65.field1263[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1184[var33 - 1 - var37] * (long) class65.field1263[1][var37] >> 16);
                    }
                    field1184[var33] = var35;
                    var30 = this.field1181.method1296(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1184[var31 + var33] * (long) Statics.field1265 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1184[var31 + var33 - 1 - var40] * (long) class65.field1263[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1184[var33 - 1 - var41] * (long) class65.field1263[1][var41] >> 16);
                        }
                        field1184[var33] = var39;
                        var30 = this.field1181.method1296(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1184[var31 + var33 - 1 - var43] * (long) class65.field1263[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1184[var33 - 1 - var44] * (long) class65.field1263[1][var44] >> 16);
                            }
                            field1184[var33] = var42;
                            this.field1181.method1296(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1171.method1381(0, (float) var30 / 65536.0F);
                    var32 = this.field1171.method1381(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1184[var46] < -32768) {
                field1184[var46] = -32768;
            }
            if (field1184[var46] > 32767) {
                field1184[var46] = 32767;
            }
        }
        return field1184;
    }

    @ObfuscatedName("bm.i(III)I")
    public final int method1278(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1186[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1185[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bm.k(Ldl;)V")
    public final void method1273(class128 arg0) {
        this.field1172 = new class57();
        this.field1172.method1294(arg0);
        this.field1168 = new class57();
        this.field1168.method1294(arg0);
        int var2 = arg0.method2548();
        if (var2 != 0) {
            arg0.field2045--;
            this.field1182 = new class57();
            this.field1182.method1294(arg0);
            this.field1170 = new class57();
            this.field1170.method1294(arg0);
        }
        int var3 = arg0.method2548();
        if (var3 != 0) {
            arg0.field2045--;
            this.field1178 = new class57();
            this.field1178.method1294(arg0);
            this.field1187 = new class57();
            this.field1187.method1294(arg0);
        }
        int var4 = arg0.method2548();
        if (var4 != 0) {
            arg0.field2045--;
            this.field1173 = new class57();
            this.field1173.method1294(arg0);
            this.field1167 = new class57();
            this.field1167.method1294(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2536();
            if (var6 == 0) {
                break;
            }
            this.field1175[var5] = var6;
            this.field1176[var5] = arg0.method2478();
            this.field1177[var5] = arg0.method2536();
        }
        this.field1179 = arg0.method2536();
        this.field1169 = arg0.method2536();
        this.field1188 = arg0.method2456();
        this.field1183 = arg0.method2456();
        this.field1171 = new class65();
        this.field1181 = new class57();
        this.field1171.method1382(arg0, this.field1181);
    }
}
