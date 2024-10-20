package deob;

import java.util.Random;

@ObfuscatedName("ba")
public class class65 {

    @ObfuscatedName("ba.k")
    public class51 field1238;

    @ObfuscatedName("ba.r")
    public class51 field1221;

    @ObfuscatedName("ba.y")
    public class51 field1220;

    @ObfuscatedName("ba.w")
    public class51 field1223;

    @ObfuscatedName("ba.m")
    public class51 field1241;

    @ObfuscatedName("ba.j")
    public class51 field1225;

    @ObfuscatedName("ba.g")
    public class51 field1226;

    @ObfuscatedName("ba.p")
    public class51 field1224;

    @ObfuscatedName("ba.o")
    public int[] field1228 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("ba.b")
    public int[] field1229 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("ba.x")
    public int[] field1227 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("ba.n")
    public int field1243 = 0;

    @ObfuscatedName("ba.d")
    public int field1232 = 100;

    @ObfuscatedName("ba.s")
    public class57 field1233;

    @ObfuscatedName("ba.v")
    public class51 field1222;

    @ObfuscatedName("ba.t")
    public int field1235 = 500;

    @ObfuscatedName("ba.u")
    public int field1236 = 0;

    @ObfuscatedName("ba.l")
    public static int[] field1237;

    @ObfuscatedName("ba.i")
    public static int[] field1234 = new int[32768];

    @ObfuscatedName("ba.h")
    public static int[] field1239;

    @ObfuscatedName("ba.a")
    public static int[] field1231;

    @ObfuscatedName("ba.c")
    public static int[] field1242;

    @ObfuscatedName("ba.f")
    public static int[] field1230;

    @ObfuscatedName("ba.q")
    public static int[] field1244;

    @ObfuscatedName("ba.z")
    public static int[] field1245;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1234[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1239 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1239[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1237 = new int[220500];
        field1231 = new int[5];
        field1242 = new int[5];
        field1230 = new int[5];
        field1244 = new int[5];
        field1245 = new int[5];
    }

    @ObfuscatedName("ba.k(II)[I")
    public final int[] method1322(int arg0, int arg1) {
        class108.method2313(field1237, 0, arg0);
        if (arg1 < 10) {
            return field1237;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1238.method1037();
        this.field1221.method1037();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1220 != null) {
            this.field1220.method1037();
            this.field1223.method1037();
            var5 = (int) ((double) (this.field1220.field1102 - this.field1220.field1101) * 32.768D / var3);
            var6 = (int) ((double) this.field1220.field1101 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1241 != null) {
            this.field1241.method1037();
            this.field1225.method1037();
            var8 = (int) ((double) (this.field1241.field1102 - this.field1241.field1101) * 32.768D / var3);
            var9 = (int) ((double) this.field1241.field1101 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1228[var11] != 0) {
                field1231[var11] = 0;
                field1242[var11] = (int) ((double) this.field1227[var11] * var3);
                field1230[var11] = (this.field1228[var11] << 14) / 100;
                field1244[var11] = (int) ((double) (this.field1238.field1102 - this.field1238.field1101) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1229[var11]) / var3);
                field1245[var11] = (int) ((double) this.field1238.field1101 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1238.method1038(arg0);
            int var14 = this.field1221.method1038(arg0);
            if (this.field1220 != null) {
                int var15 = this.field1220.method1038(arg0);
                int var16 = this.field1223.method1038(arg0);
                var13 += this.method1323(var7, var16, this.field1220.field1103) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1241 != null) {
                int var17 = this.field1241.method1038(arg0);
                int var18 = this.field1225.method1038(arg0);
                var14 = var14 * ((this.method1323(var10, var18, this.field1241.field1103) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1228[var19] != 0) {
                    int var20 = field1242[var19] + var12;
                    if (var20 < arg0) {
                        field1237[var20] += this.method1323(field1231[var19], field1230[var19] * var14 >> 15, this.field1238.field1103);
                        field1231[var19] += (field1244[var19] * var13 >> 16) + field1245[var19];
                    }
                }
            }
        }
        if (this.field1226 != null) {
            this.field1226.method1037();
            this.field1224.method1037();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1226.method1038(arg0);
                int var26 = this.field1224.method1038(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1226.field1102 - this.field1226.field1101) * var25 >> 8) + this.field1226.field1101;
                } else {
                    var27 = ((this.field1226.field1102 - this.field1226.field1101) * var26 >> 8) + this.field1226.field1101;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1237[var24] = 0;
                }
            }
        }
        if (this.field1243 > 0 && this.field1232 > 0) {
            int var28 = (int) ((double) this.field1243 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1237[var29] += field1237[var29 - var28] * this.field1232 / 100;
            }
        }
        if (this.field1233.field1145[0] > 0 || this.field1233.field1145[1] > 0) {
            this.field1222.method1037();
            int var30 = this.field1222.method1038(arg0 + 1);
            int var31 = this.field1233.method1105(0, (float) var30 / 65536.0F);
            int var32 = this.field1233.method1105(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1237[var31 + var33] * (long) Statics.field1142 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1237[var31 + var33 - 1 - var36] * (long) class57.field1134[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1237[var33 - 1 - var37] * (long) class57.field1134[1][var37] >> 16);
                    }
                    field1237[var33] = var35;
                    var30 = this.field1222.method1038(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1237[var31 + var33] * (long) Statics.field1142 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1237[var31 + var33 - 1 - var40] * (long) class57.field1134[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1237[var33 - 1 - var41] * (long) class57.field1134[1][var41] >> 16);
                        }
                        field1237[var33] = var39;
                        var30 = this.field1222.method1038(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1237[var31 + var33 - 1 - var43] * (long) class57.field1134[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1237[var33 - 1 - var44] * (long) class57.field1134[1][var44] >> 16);
                            }
                            field1237[var33] = var42;
                            this.field1222.method1038(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1233.method1105(0, (float) var30 / 65536.0F);
                    var32 = this.field1233.method1105(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1237[var46] < -32768) {
                field1237[var46] = -32768;
            }
            if (field1237[var46] > 32767) {
                field1237[var46] = 32767;
            }
        }
        return field1237;
    }

    @ObfuscatedName("ba.r(III)I")
    public final int method1323(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1239[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1234[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ba.y(Lde;)V")
    public final void method1324(class107 arg0) {
        this.field1238 = new class51();
        this.field1238.method1035(arg0);
        this.field1221 = new class51();
        this.field1221.method1035(arg0);
        int var2 = arg0.method2111();
        if (var2 != 0) {
            arg0.field1863--;
            this.field1220 = new class51();
            this.field1220.method1035(arg0);
            this.field1223 = new class51();
            this.field1223.method1035(arg0);
        }
        int var3 = arg0.method2111();
        if (var3 != 0) {
            arg0.field1863--;
            this.field1241 = new class51();
            this.field1241.method1035(arg0);
            this.field1225 = new class51();
            this.field1225.method1035(arg0);
        }
        int var4 = arg0.method2111();
        if (var4 != 0) {
            arg0.field1863--;
            this.field1226 = new class51();
            this.field1226.method1035(arg0);
            this.field1224 = new class51();
            this.field1224.method1035(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2124();
            if (var6 == 0) {
                break;
            }
            this.field1228[var5] = var6;
            this.field1229[var5] = arg0.method2123();
            this.field1227[var5] = arg0.method2124();
        }
        this.field1243 = arg0.method2124();
        this.field1232 = arg0.method2124();
        this.field1235 = arg0.method2232();
        this.field1236 = arg0.method2232();
        this.field1233 = new class57();
        this.field1222 = new class51();
        this.field1233.method1092(arg0, this.field1222);
    }
}
