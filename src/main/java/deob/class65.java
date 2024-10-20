package deob;

import java.util.Random;

@ObfuscatedName("bn")
public class class65 {

    @ObfuscatedName("bn.e")
    public class51 field1217;

    @ObfuscatedName("bn.v")
    public class51 field1216;

    @ObfuscatedName("bn.i")
    public class51 field1229;

    @ObfuscatedName("bn.g")
    public class51 field1226;

    @ObfuscatedName("bn.x")
    public class51 field1221;

    @ObfuscatedName("bn.b")
    public class51 field1239;

    @ObfuscatedName("bn.q")
    public class51 field1215;

    @ObfuscatedName("bn.l")
    public class51 field1222;

    @ObfuscatedName("bn.m")
    public int[] field1223 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bn.u")
    public int[] field1230 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bn.s")
    public int[] field1225 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bn.f")
    public int field1224 = 0;

    @ObfuscatedName("bn.p")
    public int field1227 = 100;

    @ObfuscatedName("bn.w")
    public class57 field1228;

    @ObfuscatedName("bn.y")
    public class51 field1219;

    @ObfuscatedName("bn.h")
    public int field1218 = 500;

    @ObfuscatedName("bn.j")
    public int field1231 = 0;

    @ObfuscatedName("bn.c")
    public static int[] field1232;

    @ObfuscatedName("bn.d")
    public static int[] field1233 = new int[32768];

    @ObfuscatedName("bn.a")
    public static int[] field1234;

    @ObfuscatedName("bn.r")
    public static int[] field1236;

    @ObfuscatedName("bn.t")
    public static int[] field1237;

    @ObfuscatedName("bn.k")
    public static int[] field1238;

    @ObfuscatedName("bn.n")
    public static int[] field1220;

    @ObfuscatedName("bn.z")
    public static int[] field1240;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1233[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1234 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1234[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1232 = new int[220500];
        field1236 = new int[5];
        field1237 = new int[5];
        field1238 = new int[5];
        field1220 = new int[5];
        field1240 = new int[5];
    }

    @ObfuscatedName("bn.e(II)[I")
    public final int[] method1297(int arg0, int arg1) {
        class108.method2324(field1232, 0, arg0);
        if (arg1 < 10) {
            return field1232;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1217.method1005();
        this.field1216.method1005();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1229 != null) {
            this.field1229.method1005();
            this.field1226.method1005();
            var5 = (int) ((double) (this.field1229.field1095 - this.field1229.field1094) * 32.768D / var3);
            var6 = (int) ((double) this.field1229.field1094 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1221 != null) {
            this.field1221.method1005();
            this.field1239.method1005();
            var8 = (int) ((double) (this.field1221.field1095 - this.field1221.field1094) * 32.768D / var3);
            var9 = (int) ((double) this.field1221.field1094 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1223[var11] != 0) {
                field1236[var11] = 0;
                field1237[var11] = (int) ((double) this.field1225[var11] * var3);
                field1238[var11] = (this.field1223[var11] << 14) / 100;
                field1220[var11] = (int) ((double) (this.field1217.field1095 - this.field1217.field1094) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1230[var11]) / var3);
                field1240[var11] = (int) ((double) this.field1217.field1094 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1217.method1012(arg0);
            int var14 = this.field1216.method1012(arg0);
            if (this.field1229 != null) {
                int var15 = this.field1229.method1012(arg0);
                int var16 = this.field1226.method1012(arg0);
                var13 += this.method1291(var7, var16, this.field1229.field1096) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1221 != null) {
                int var17 = this.field1221.method1012(arg0);
                int var18 = this.field1239.method1012(arg0);
                var14 = var14 * ((this.method1291(var10, var18, this.field1221.field1096) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1223[var19] != 0) {
                    int var20 = field1237[var19] + var12;
                    if (var20 < arg0) {
                        field1232[var20] += this.method1291(field1236[var19], field1238[var19] * var14 >> 15, this.field1217.field1096);
                        field1236[var19] += (field1220[var19] * var13 >> 16) + field1240[var19];
                    }
                }
            }
        }
        if (this.field1215 != null) {
            this.field1215.method1005();
            this.field1222.method1005();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1215.method1012(arg0);
                int var26 = this.field1222.method1012(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1215.field1095 - this.field1215.field1094) * var25 >> 8) + this.field1215.field1094;
                } else {
                    var27 = ((this.field1215.field1095 - this.field1215.field1094) * var26 >> 8) + this.field1215.field1094;
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
        if (this.field1224 > 0 && this.field1227 > 0) {
            int var28 = (int) ((double) this.field1224 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1232[var29] += field1232[var29 - var28] * this.field1227 / 100;
            }
        }
        if (this.field1228.field1132[0] > 0 || this.field1228.field1132[1] > 0) {
            this.field1219.method1005();
            int var30 = this.field1219.method1012(arg0 + 1);
            int var31 = this.field1228.method1069(0, (float) var30 / 65536.0F);
            int var32 = this.field1228.method1069(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1232[var31 + var33] * (long) Statics.field1137 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1232[var31 + var33 - 1 - var36] * (long) class57.field1140[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1232[var33 - 1 - var37] * (long) class57.field1140[1][var37] >> 16);
                    }
                    field1232[var33] = var35;
                    var30 = this.field1219.method1012(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1232[var31 + var33] * (long) Statics.field1137 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1232[var31 + var33 - 1 - var40] * (long) class57.field1140[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1232[var33 - 1 - var41] * (long) class57.field1140[1][var41] >> 16);
                        }
                        field1232[var33] = var39;
                        var30 = this.field1219.method1012(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1232[var31 + var33 - 1 - var43] * (long) class57.field1140[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1232[var33 - 1 - var44] * (long) class57.field1140[1][var44] >> 16);
                            }
                            field1232[var33] = var42;
                            this.field1219.method1012(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1228.method1069(0, (float) var30 / 65536.0F);
                    var32 = this.field1228.method1069(1, (float) var30 / 65536.0F);
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

    @ObfuscatedName("bn.v(III)I")
    public final int method1291(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1234[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1233[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bn.i(Ldk;)V")
    public final void method1292(class107 arg0) {
        this.field1217 = new class51();
        this.field1217.method1009(arg0);
        this.field1216 = new class51();
        this.field1216.method1009(arg0);
        int var2 = arg0.method2226();
        if (var2 != 0) {
            arg0.field1844--;
            this.field1229 = new class51();
            this.field1229.method1009(arg0);
            this.field1226 = new class51();
            this.field1226.method1009(arg0);
        }
        int var3 = arg0.method2226();
        if (var3 != 0) {
            arg0.field1844--;
            this.field1221 = new class51();
            this.field1221.method1009(arg0);
            this.field1239 = new class51();
            this.field1239.method1009(arg0);
        }
        int var4 = arg0.method2226();
        if (var4 != 0) {
            arg0.field1844--;
            this.field1215 = new class51();
            this.field1215.method1009(arg0);
            this.field1222 = new class51();
            this.field1222.method1009(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2129();
            if (var6 == 0) {
                break;
            }
            this.field1223[var5] = var6;
            this.field1230[var5] = arg0.method2128();
            this.field1225[var5] = arg0.method2129();
        }
        this.field1224 = arg0.method2129();
        this.field1227 = arg0.method2129();
        this.field1218 = arg0.method2152();
        this.field1231 = arg0.method2152();
        this.field1228 = new class57();
        this.field1219 = new class51();
        this.field1228.method1070(arg0, this.field1219);
    }
}
