package deob;

import java.util.Random;

@ObfuscatedName("bf")
public class class65 {

    @ObfuscatedName("bf.b")
    public class51 field1230;

    @ObfuscatedName("bf.u")
    public class51 field1217;

    @ObfuscatedName("bf.x")
    public class51 field1241;

    @ObfuscatedName("bf.j")
    public class51 field1239;

    @ObfuscatedName("bf.o")
    public class51 field1220;

    @ObfuscatedName("bf.n")
    public class51 field1221;

    @ObfuscatedName("bf.y")
    public class51 field1222;

    @ObfuscatedName("bf.f")
    public class51 field1216;

    @ObfuscatedName("bf.p")
    public int[] field1224 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bf.l")
    public int[] field1225 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bf.k")
    public int[] field1218 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bf.q")
    public int field1226 = 0;

    @ObfuscatedName("bf.e")
    public int field1228 = 100;

    @ObfuscatedName("bf.t")
    public class57 field1229;

    @ObfuscatedName("bf.g")
    public class51 field1232;

    @ObfuscatedName("bf.c")
    public int field1231 = 500;

    @ObfuscatedName("bf.m")
    public int field1237 = 0;

    @ObfuscatedName("bf.i")
    public static int[] field1233;

    @ObfuscatedName("bf.h")
    public static int[] field1234 = new int[32768];

    @ObfuscatedName("bf.a")
    public static int[] field1236;

    @ObfuscatedName("bf.z")
    public static int[] field1227;

    @ObfuscatedName("bf.v")
    public static int[] field1238;

    @ObfuscatedName("bf.s")
    public static int[] field1223;

    @ObfuscatedName("bf.r")
    public static int[] field1240;

    @ObfuscatedName("bf.d")
    public static int[] field1235;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1234[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1236 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1236[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1233 = new int[220500];
        field1227 = new int[5];
        field1238 = new int[5];
        field1223 = new int[5];
        field1240 = new int[5];
        field1235 = new int[5];
    }

    @ObfuscatedName("bf.b(II)[I")
    public final int[] method1307(int arg0, int arg1) {
        class108.method2371(field1233, 0, arg0);
        if (arg1 < 10) {
            return field1233;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1230.method1013();
        this.field1217.method1013();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1241 != null) {
            this.field1241.method1013();
            this.field1239.method1013();
            var5 = (int) ((double) (this.field1241.field1096 - this.field1241.field1099) * 32.768D / var3);
            var6 = (int) ((double) this.field1241.field1099 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1220 != null) {
            this.field1220.method1013();
            this.field1221.method1013();
            var8 = (int) ((double) (this.field1220.field1096 - this.field1220.field1099) * 32.768D / var3);
            var9 = (int) ((double) this.field1220.field1099 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1224[var11] != 0) {
                field1227[var11] = 0;
                field1238[var11] = (int) ((double) this.field1218[var11] * var3);
                field1223[var11] = (this.field1224[var11] << 14) / 100;
                field1240[var11] = (int) ((double) (this.field1230.field1096 - this.field1230.field1099) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1225[var11]) / var3);
                field1235[var11] = (int) ((double) this.field1230.field1099 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1230.method1011(arg0);
            int var14 = this.field1217.method1011(arg0);
            if (this.field1241 != null) {
                int var15 = this.field1241.method1011(arg0);
                int var16 = this.field1239.method1011(arg0);
                var13 += this.method1310(var7, var16, this.field1241.field1101) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1220 != null) {
                int var17 = this.field1220.method1011(arg0);
                int var18 = this.field1221.method1011(arg0);
                var14 = var14 * ((this.method1310(var10, var18, this.field1220.field1101) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1224[var19] != 0) {
                    int var20 = field1238[var19] + var12;
                    if (var20 < arg0) {
                        field1233[var20] += this.method1310(field1227[var19], field1223[var19] * var14 >> 15, this.field1230.field1101);
                        field1227[var19] += (field1240[var19] * var13 >> 16) + field1235[var19];
                    }
                }
            }
        }
        if (this.field1222 != null) {
            this.field1222.method1013();
            this.field1216.method1013();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1222.method1011(arg0);
                int var26 = this.field1216.method1011(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1222.field1096 - this.field1222.field1099) * var25 >> 8) + this.field1222.field1099;
                } else {
                    var27 = ((this.field1222.field1096 - this.field1222.field1099) * var26 >> 8) + this.field1222.field1099;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1233[var24] = 0;
                }
            }
        }
        if (this.field1226 > 0 && this.field1228 > 0) {
            int var28 = (int) ((double) this.field1226 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1233[var29] += field1233[var29 - var28] * this.field1228 / 100;
            }
        }
        if (this.field1229.field1137[0] > 0 || this.field1229.field1137[1] > 0) {
            this.field1232.method1013();
            int var30 = this.field1232.method1011(arg0 + 1);
            int var31 = this.field1229.method1071(0, (float) var30 / 65536.0F);
            int var32 = this.field1229.method1071(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1233[var31 + var33] * (long) Statics.field1138 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1233[var31 + var33 - 1 - var36] * (long) class57.field1136[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1233[var33 - 1 - var37] * (long) class57.field1136[1][var37] >> 16);
                    }
                    field1233[var33] = var35;
                    var30 = this.field1232.method1011(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1233[var31 + var33] * (long) Statics.field1138 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1233[var31 + var33 - 1 - var40] * (long) class57.field1136[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1233[var33 - 1 - var41] * (long) class57.field1136[1][var41] >> 16);
                        }
                        field1233[var33] = var39;
                        var30 = this.field1232.method1011(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1233[var31 + var33 - 1 - var43] * (long) class57.field1136[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1233[var33 - 1 - var44] * (long) class57.field1136[1][var44] >> 16);
                            }
                            field1233[var33] = var42;
                            this.field1232.method1011(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1229.method1071(0, (float) var30 / 65536.0F);
                    var32 = this.field1229.method1071(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1233[var46] < -32768) {
                field1233[var46] = -32768;
            }
            if (field1233[var46] > 32767) {
                field1233[var46] = 32767;
            }
        }
        return field1233;
    }

    @ObfuscatedName("bf.u(III)I")
    public final int method1310(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1236[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1234[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bf.x(Ldh;)V")
    public final void method1309(class107 arg0) {
        this.field1230 = new class51();
        this.field1230.method1012(arg0);
        this.field1217 = new class51();
        this.field1217.method1012(arg0);
        int var2 = arg0.method2134();
        if (var2 != 0) {
            arg0.field1845--;
            this.field1241 = new class51();
            this.field1241.method1012(arg0);
            this.field1239 = new class51();
            this.field1239.method1012(arg0);
        }
        int var3 = arg0.method2134();
        if (var3 != 0) {
            arg0.field1845--;
            this.field1220 = new class51();
            this.field1220.method1012(arg0);
            this.field1221 = new class51();
            this.field1221.method1012(arg0);
        }
        int var4 = arg0.method2134();
        if (var4 != 0) {
            arg0.field1845--;
            this.field1222 = new class51();
            this.field1222.method1012(arg0);
            this.field1216 = new class51();
            this.field1216.method1012(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2147();
            if (var6 == 0) {
                break;
            }
            this.field1224[var5] = var6;
            this.field1225[var5] = arg0.method2184();
            this.field1218[var5] = arg0.method2147();
        }
        this.field1226 = arg0.method2147();
        this.field1228 = arg0.method2147();
        this.field1231 = arg0.method2136();
        this.field1237 = arg0.method2136();
        this.field1229 = new class57();
        this.field1232 = new class51();
        this.field1229.method1067(arg0, this.field1232);
    }
}
