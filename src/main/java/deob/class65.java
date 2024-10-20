package deob;

import java.util.Random;

@ObfuscatedName("bi")
public class class65 {

    @ObfuscatedName("bi.g")
    public class51 field1227;

    @ObfuscatedName("bi.i")
    public class51 field1222;

    @ObfuscatedName("bi.k")
    public class51 field1230;

    @ObfuscatedName("bi.e")
    public class51 field1224;

    @ObfuscatedName("bi.w")
    public class51 field1225;

    @ObfuscatedName("bi.m")
    public class51 field1226;

    @ObfuscatedName("bi.u")
    public class51 field1229;

    @ObfuscatedName("bi.j")
    public class51 field1246;

    @ObfuscatedName("bi.o")
    public int[] field1235 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bi.h")
    public int[] field1231 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bi.b")
    public int[] field1234 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bi.r")
    public int field1232 = 0;

    @ObfuscatedName("bi.l")
    public int field1233 = 100;

    @ObfuscatedName("bi.x")
    public class57 field1239;

    @ObfuscatedName("bi.q")
    public class51 field1245;

    @ObfuscatedName("bi.t")
    public int field1236 = 500;

    @ObfuscatedName("bi.y")
    public int field1237 = 0;

    @ObfuscatedName("bi.d")
    public static int[] field1238;

    @ObfuscatedName("bi.z")
    public static int[] field1223 = new int[32768];

    @ObfuscatedName("bi.n")
    public static int[] field1240;

    @ObfuscatedName("bi.f")
    public static int[] field1242;

    @ObfuscatedName("bi.a")
    public static int[] field1243;

    @ObfuscatedName("bi.p")
    public static int[] field1244;

    @ObfuscatedName("bi.s")
    public static int[] field1228;

    @ObfuscatedName("bi.c")
    public static int[] field1221;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1223[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1240 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1240[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1238 = new int[220500];
        field1242 = new int[5];
        field1243 = new int[5];
        field1244 = new int[5];
        field1228 = new int[5];
        field1221 = new int[5];
    }

    @ObfuscatedName("bi.g(II)[I")
    public final int[] method1268(int arg0, int arg1) {
        class108.method2293(field1238, 0, arg0);
        if (arg1 < 10) {
            return field1238;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1227.method1014();
        this.field1222.method1014();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1230 != null) {
            this.field1230.method1014();
            this.field1224.method1014();
            var5 = (int) ((double) (this.field1230.field1097 - this.field1230.field1103) * 32.768D / var3);
            var6 = (int) ((double) this.field1230.field1103 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1225 != null) {
            this.field1225.method1014();
            this.field1226.method1014();
            var8 = (int) ((double) (this.field1225.field1097 - this.field1225.field1103) * 32.768D / var3);
            var9 = (int) ((double) this.field1225.field1103 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1235[var11] != 0) {
                field1242[var11] = 0;
                field1243[var11] = (int) ((double) this.field1234[var11] * var3);
                field1244[var11] = (this.field1235[var11] << 14) / 100;
                field1228[var11] = (int) ((double) (this.field1227.field1097 - this.field1227.field1103) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1231[var11]) / var3);
                field1221[var11] = (int) ((double) this.field1227.field1103 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1227.method1015(arg0);
            int var14 = this.field1222.method1015(arg0);
            if (this.field1230 != null) {
                int var15 = this.field1230.method1015(arg0);
                int var16 = this.field1224.method1015(arg0);
                var13 += this.method1274(var7, var16, this.field1230.field1102) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1225 != null) {
                int var17 = this.field1225.method1015(arg0);
                int var18 = this.field1226.method1015(arg0);
                var14 = var14 * ((this.method1274(var10, var18, this.field1225.field1102) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1235[var19] != 0) {
                    int var20 = field1243[var19] + var12;
                    if (var20 < arg0) {
                        field1238[var20] += this.method1274(field1242[var19], field1244[var19] * var14 >> 15, this.field1227.field1102);
                        field1242[var19] += (field1228[var19] * var13 >> 16) + field1221[var19];
                    }
                }
            }
        }
        if (this.field1229 != null) {
            this.field1229.method1014();
            this.field1246.method1014();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1229.method1015(arg0);
                int var26 = this.field1246.method1015(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1229.field1097 - this.field1229.field1103) * var25 >> 8) + this.field1229.field1103;
                } else {
                    var27 = ((this.field1229.field1097 - this.field1229.field1103) * var26 >> 8) + this.field1229.field1103;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1238[var24] = 0;
                }
            }
        }
        if (this.field1232 > 0 && this.field1233 > 0) {
            int var28 = (int) ((double) this.field1232 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1238[var29] += field1238[var29 - var28] * this.field1233 / 100;
            }
        }
        if (this.field1239.field1137[0] > 0 || this.field1239.field1137[1] > 0) {
            this.field1245.method1014();
            int var30 = this.field1245.method1015(arg0 + 1);
            int var31 = this.field1239.method1062(0, (float) var30 / 65536.0F);
            int var32 = this.field1239.method1062(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1238[var31 + var33] * (long) Statics.field1143 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1238[var31 + var33 - 1 - var36] * (long) class57.field1139[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1238[var33 - 1 - var37] * (long) class57.field1139[1][var37] >> 16);
                    }
                    field1238[var33] = var35;
                    var30 = this.field1245.method1015(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1238[var31 + var33] * (long) Statics.field1143 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1238[var31 + var33 - 1 - var40] * (long) class57.field1139[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1238[var33 - 1 - var41] * (long) class57.field1139[1][var41] >> 16);
                        }
                        field1238[var33] = var39;
                        var30 = this.field1245.method1015(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1238[var31 + var33 - 1 - var43] * (long) class57.field1139[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1238[var33 - 1 - var44] * (long) class57.field1139[1][var44] >> 16);
                            }
                            field1238[var33] = var42;
                            this.field1245.method1015(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1239.method1062(0, (float) var30 / 65536.0F);
                    var32 = this.field1239.method1062(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1238[var46] < -32768) {
                field1238[var46] = -32768;
            }
            if (field1238[var46] > 32767) {
                field1238[var46] = 32767;
            }
        }
        return field1238;
    }

    @ObfuscatedName("bi.i(III)I")
    public final int method1274(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1240[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1223[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bi.k(Ldk;)V")
    public final void method1269(class107 arg0) {
        this.field1227 = new class51();
        this.field1227.method1013(arg0);
        this.field1222 = new class51();
        this.field1222.method1013(arg0);
        int var2 = arg0.method2092();
        if (var2 != 0) {
            arg0.field1844--;
            this.field1230 = new class51();
            this.field1230.method1013(arg0);
            this.field1224 = new class51();
            this.field1224.method1013(arg0);
        }
        int var3 = arg0.method2092();
        if (var3 != 0) {
            arg0.field1844--;
            this.field1225 = new class51();
            this.field1225.method1013(arg0);
            this.field1226 = new class51();
            this.field1226.method1013(arg0);
        }
        int var4 = arg0.method2092();
        if (var4 != 0) {
            arg0.field1844--;
            this.field1229 = new class51();
            this.field1229.method1013(arg0);
            this.field1246 = new class51();
            this.field1246.method1013(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2105();
            if (var6 == 0) {
                break;
            }
            this.field1235[var5] = var6;
            this.field1231[var5] = arg0.method2104();
            this.field1234[var5] = arg0.method2105();
        }
        this.field1232 = arg0.method2105();
        this.field1233 = arg0.method2105();
        this.field1236 = arg0.method2094();
        this.field1237 = arg0.method2094();
        this.field1239 = new class57();
        this.field1245 = new class51();
        this.field1239.method1068(arg0, this.field1245);
    }
}
