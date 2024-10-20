package deob;

import java.util.Random;

@ObfuscatedName("bz")
public class class66 {

    @ObfuscatedName("bz.c")
    public class52 field1238;

    @ObfuscatedName("bz.j")
    public class52 field1221;

    @ObfuscatedName("bz.y")
    public class52 field1237;

    @ObfuscatedName("bz.r")
    public class52 field1242;

    @ObfuscatedName("bz.f")
    public class52 field1240;

    @ObfuscatedName("bz.l")
    public class52 field1225;

    @ObfuscatedName("bz.b")
    public class52 field1226;

    @ObfuscatedName("bz.k")
    public class52 field1227;

    @ObfuscatedName("bz.g")
    public int[] field1228 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bz.v")
    public int[] field1229 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bz.i")
    public int[] field1230 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bz.x")
    public int field1231 = 0;

    @ObfuscatedName("bz.h")
    public int field1239 = 100;

    @ObfuscatedName("bz.w")
    public class58 field1233;

    @ObfuscatedName("bz.s")
    public class52 field1234;

    @ObfuscatedName("bz.p")
    public int field1235 = 500;

    @ObfuscatedName("bz.z")
    public int field1245 = 0;

    @ObfuscatedName("bz.n")
    public static int[] field1232;

    @ObfuscatedName("bz.u")
    public static int[] field1236 = new int[32768];

    @ObfuscatedName("bz.a")
    public static int[] field1223;

    @ObfuscatedName("bz.m")
    public static int[] field1241;

    @ObfuscatedName("bz.q")
    public static int[] field1224;

    @ObfuscatedName("bz.e")
    public static int[] field1243;

    @ObfuscatedName("bz.t")
    public static int[] field1222;

    @ObfuscatedName("bz.o")
    public static int[] field1244;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1236[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1223 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1223[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1232 = new int[220500];
        field1241 = new int[5];
        field1224 = new int[5];
        field1243 = new int[5];
        field1222 = new int[5];
        field1244 = new int[5];
    }

    @ObfuscatedName("bz.c(II)[I")
    public final int[] method1299(int arg0, int arg1) {
        class109.method2370(field1232, 0, arg0);
        if (arg1 < 10) {
            return field1232;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1238.method1048();
        this.field1221.method1048();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1237 != null) {
            this.field1237.method1048();
            this.field1242.method1048();
            var5 = (int) ((double) (this.field1237.field1104 - this.field1237.field1110) * 32.768D / var3);
            var6 = (int) ((double) this.field1237.field1110 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1240 != null) {
            this.field1240.method1048();
            this.field1225.method1048();
            var8 = (int) ((double) (this.field1240.field1104 - this.field1240.field1110) * 32.768D / var3);
            var9 = (int) ((double) this.field1240.field1110 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1228[var11] != 0) {
                field1241[var11] = 0;
                field1224[var11] = (int) ((double) this.field1230[var11] * var3);
                field1243[var11] = (this.field1228[var11] << 14) / 100;
                field1222[var11] = (int) ((double) (this.field1238.field1104 - this.field1238.field1110) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1229[var11]) / var3);
                field1244[var11] = (int) ((double) this.field1238.field1110 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1238.method1047(arg0);
            int var14 = this.field1221.method1047(arg0);
            if (this.field1237 != null) {
                int var15 = this.field1237.method1047(arg0);
                int var16 = this.field1242.method1047(arg0);
                var13 += this.method1300(var7, var16, this.field1237.field1105) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1240 != null) {
                int var17 = this.field1240.method1047(arg0);
                int var18 = this.field1225.method1047(arg0);
                var14 = var14 * ((this.method1300(var10, var18, this.field1240.field1105) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1228[var19] != 0) {
                    int var20 = field1224[var19] + var12;
                    if (var20 < arg0) {
                        field1232[var20] += this.method1300(field1241[var19], field1243[var19] * var14 >> 15, this.field1238.field1105);
                        field1241[var19] += (field1222[var19] * var13 >> 16) + field1244[var19];
                    }
                }
            }
        }
        if (this.field1226 != null) {
            this.field1226.method1048();
            this.field1227.method1048();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1226.method1047(arg0);
                int var26 = this.field1227.method1047(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1226.field1104 - this.field1226.field1110) * var25 >> 8) + this.field1226.field1110;
                } else {
                    var27 = ((this.field1226.field1104 - this.field1226.field1110) * var26 >> 8) + this.field1226.field1110;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1232[var24] = 0;
                }
            }
        }
        if (this.field1231 > 0 && this.field1239 > 0) {
            int var28 = (int) ((double) this.field1231 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1232[var29] += field1232[var29 - var28] * this.field1239 / 100;
            }
        }
        if (this.field1233.field1134[0] > 0 || this.field1233.field1134[1] > 0) {
            this.field1234.method1048();
            int var30 = this.field1234.method1047(arg0 + 1);
            int var31 = this.field1233.method1093(0, (float) var30 / 65536.0F);
            int var32 = this.field1233.method1093(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1232[var31 + var33] * (long) Statics.field1141 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1232[var31 + var33 - 1 - var36] * (long) class58.field1140[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1232[var33 - 1 - var37] * (long) class58.field1140[1][var37] >> 16);
                    }
                    field1232[var33] = var35;
                    var30 = this.field1234.method1047(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1232[var31 + var33] * (long) Statics.field1141 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1232[var31 + var33 - 1 - var40] * (long) class58.field1140[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1232[var33 - 1 - var41] * (long) class58.field1140[1][var41] >> 16);
                        }
                        field1232[var33] = var39;
                        var30 = this.field1234.method1047(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1232[var31 + var33 - 1 - var43] * (long) class58.field1140[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1232[var33 - 1 - var44] * (long) class58.field1140[1][var44] >> 16);
                            }
                            field1232[var33] = var42;
                            this.field1234.method1047(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1233.method1093(0, (float) var30 / 65536.0F);
                    var32 = this.field1233.method1093(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1232[var46] < -32768) {
                field1232[var46] = -32768;
            }
            if (field1232[var46] > 32767) {
                field1232[var46] = 32767;
            }
        }
        return field1232;
    }

    @ObfuscatedName("bz.j(III)I")
    public final int method1300(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1223[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1236[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bz.y(Ldx;)V")
    public final void method1301(class108 arg0) {
        this.field1238 = new class52();
        this.field1238.method1044(arg0);
        this.field1221 = new class52();
        this.field1221.method1044(arg0);
        int var2 = arg0.method2134();
        if (var2 != 0) {
            arg0.field1826--;
            this.field1237 = new class52();
            this.field1237.method1044(arg0);
            this.field1242 = new class52();
            this.field1242.method1044(arg0);
        }
        int var3 = arg0.method2134();
        if (var3 != 0) {
            arg0.field1826--;
            this.field1240 = new class52();
            this.field1240.method1044(arg0);
            this.field1225 = new class52();
            this.field1225.method1044(arg0);
        }
        int var4 = arg0.method2134();
        if (var4 != 0) {
            arg0.field1826--;
            this.field1226 = new class52();
            this.field1226.method1044(arg0);
            this.field1227 = new class52();
            this.field1227.method1044(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2227();
            if (var6 == 0) {
                break;
            }
            this.field1228[var5] = var6;
            this.field1229[var5] = arg0.method2146();
            this.field1230[var5] = arg0.method2227();
        }
        this.field1231 = arg0.method2227();
        this.field1239 = arg0.method2227();
        this.field1235 = arg0.method2136();
        this.field1245 = arg0.method2136();
        this.field1233 = new class58();
        this.field1234 = new class52();
        this.field1233.method1097(arg0, this.field1234);
    }
}
