package deob;

import java.util.Random;

@ObfuscatedName("bf")
public class class65 {

    @ObfuscatedName("bf.p")
    public class51 field1235;

    @ObfuscatedName("bf.g")
    public class51 field1213;

    @ObfuscatedName("bf.x")
    public class51 field1237;

    @ObfuscatedName("bf.c")
    public class51 field1217;

    @ObfuscatedName("bf.n")
    public class51 field1216;

    @ObfuscatedName("bf.s")
    public class51 field1218;

    @ObfuscatedName("bf.r")
    public class51 field1215;

    @ObfuscatedName("bf.w")
    public class51 field1219;

    @ObfuscatedName("bf.u")
    public int[] field1220 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bf.d")
    public int[] field1221 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bf.h")
    public int[] field1222 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bf.a")
    public int field1223 = 0;

    @ObfuscatedName("bf.y")
    public int field1224 = 100;

    @ObfuscatedName("bf.v")
    public class57 field1236;

    @ObfuscatedName("bf.e")
    public class51 field1214;

    @ObfuscatedName("bf.b")
    public int field1226 = 500;

    @ObfuscatedName("bf.z")
    public int field1228 = 0;

    @ObfuscatedName("bf.l")
    public static int[] field1225;

    @ObfuscatedName("bf.t")
    public static int[] field1230 = new int[32768];

    @ObfuscatedName("bf.q")
    public static int[] field1231;

    @ObfuscatedName("bf.o")
    public static int[] field1233;

    @ObfuscatedName("bf.i")
    public static int[] field1234;

    @ObfuscatedName("bf.m")
    public static int[] field1229;

    @ObfuscatedName("bf.f")
    public static int[] field1212;

    @ObfuscatedName("bf.k")
    public static int[] field1227;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1230[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1231 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1231[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1225 = new int[220500];
        field1233 = new int[5];
        field1234 = new int[5];
        field1229 = new int[5];
        field1212 = new int[5];
        field1227 = new int[5];
    }

    @ObfuscatedName("bf.p(II)[I")
    public final int[] method1355(int arg0, int arg1) {
        class108.method2375(field1225, 0, arg0);
        if (arg1 < 10) {
            return field1225;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1235.method1075();
        this.field1213.method1075();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1237 != null) {
            this.field1237.method1075();
            this.field1217.method1075();
            var5 = (int) ((double) (this.field1237.field1094 - this.field1237.field1092) * 32.768D / var3);
            var6 = (int) ((double) this.field1237.field1092 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1216 != null) {
            this.field1216.method1075();
            this.field1218.method1075();
            var8 = (int) ((double) (this.field1216.field1094 - this.field1216.field1092) * 32.768D / var3);
            var9 = (int) ((double) this.field1216.field1092 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1220[var11] != 0) {
                field1233[var11] = 0;
                field1234[var11] = (int) ((double) this.field1222[var11] * var3);
                field1229[var11] = (this.field1220[var11] << 14) / 100;
                field1212[var11] = (int) ((double) (this.field1235.field1094 - this.field1235.field1092) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1221[var11]) / var3);
                field1227[var11] = (int) ((double) this.field1235.field1092 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1235.method1076(arg0);
            int var14 = this.field1213.method1076(arg0);
            if (this.field1237 != null) {
                int var15 = this.field1237.method1076(arg0);
                int var16 = this.field1217.method1076(arg0);
                var13 += this.method1356(var7, var16, this.field1237.field1095) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1216 != null) {
                int var17 = this.field1216.method1076(arg0);
                int var18 = this.field1218.method1076(arg0);
                var14 = var14 * ((this.method1356(var10, var18, this.field1216.field1095) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1220[var19] != 0) {
                    int var20 = field1234[var19] + var12;
                    if (var20 < arg0) {
                        field1225[var20] += this.method1356(field1233[var19], field1229[var19] * var14 >> 15, this.field1235.field1095);
                        field1233[var19] += (field1212[var19] * var13 >> 16) + field1227[var19];
                    }
                }
            }
        }
        if (this.field1215 != null) {
            this.field1215.method1075();
            this.field1219.method1075();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1215.method1076(arg0);
                int var26 = this.field1219.method1076(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1215.field1094 - this.field1215.field1092) * var25 >> 8) + this.field1215.field1092;
                } else {
                    var27 = ((this.field1215.field1094 - this.field1215.field1092) * var26 >> 8) + this.field1215.field1092;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1225[var24] = 0;
                }
            }
        }
        if (this.field1223 > 0 && this.field1224 > 0) {
            int var28 = (int) ((double) this.field1223 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1225[var29] += field1225[var29 - var28] * this.field1224 / 100;
            }
        }
        if (this.field1236.field1130[0] > 0 || this.field1236.field1130[1] > 0) {
            this.field1214.method1075();
            int var30 = this.field1214.method1076(arg0 + 1);
            int var31 = this.field1236.method1133(0, (float) var30 / 65536.0F);
            int var32 = this.field1236.method1133(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1225[var31 + var33] * (long) Statics.field1137 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1225[var31 + var33 - 1 - var36] * (long) class57.field1132[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1225[var33 - 1 - var37] * (long) class57.field1132[1][var37] >> 16);
                    }
                    field1225[var33] = var35;
                    var30 = this.field1214.method1076(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1225[var31 + var33] * (long) Statics.field1137 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1225[var31 + var33 - 1 - var40] * (long) class57.field1132[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1225[var33 - 1 - var41] * (long) class57.field1132[1][var41] >> 16);
                        }
                        field1225[var33] = var39;
                        var30 = this.field1214.method1076(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1225[var31 + var33 - 1 - var43] * (long) class57.field1132[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1225[var33 - 1 - var44] * (long) class57.field1132[1][var44] >> 16);
                            }
                            field1225[var33] = var42;
                            this.field1214.method1076(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1236.method1133(0, (float) var30 / 65536.0F);
                    var32 = this.field1236.method1133(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1225[var46] < -32768) {
                field1225[var46] = -32768;
            }
            if (field1225[var46] > 32767) {
                field1225[var46] = 32767;
            }
        }
        return field1225;
    }

    @ObfuscatedName("bf.g(III)I")
    public final int method1356(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1231[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1230[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bf.x(Ldp;)V")
    public final void method1357(class107 arg0) {
        this.field1235 = new class51();
        this.field1235.method1073(arg0);
        this.field1213 = new class51();
        this.field1213.method1073(arg0);
        int var2 = arg0.method2173();
        if (var2 != 0) {
            arg0.field1837--;
            this.field1237 = new class51();
            this.field1237.method1073(arg0);
            this.field1217 = new class51();
            this.field1217.method1073(arg0);
        }
        int var3 = arg0.method2173();
        if (var3 != 0) {
            arg0.field1837--;
            this.field1216 = new class51();
            this.field1216.method1073(arg0);
            this.field1218 = new class51();
            this.field1218.method1073(arg0);
        }
        int var4 = arg0.method2173();
        if (var4 != 0) {
            arg0.field1837--;
            this.field1215 = new class51();
            this.field1215.method1073(arg0);
            this.field1219 = new class51();
            this.field1219.method1073(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2186();
            if (var6 == 0) {
                break;
            }
            this.field1220[var5] = var6;
            this.field1221[var5] = arg0.method2197();
            this.field1222[var5] = arg0.method2186();
        }
        this.field1223 = arg0.method2186();
        this.field1224 = arg0.method2186();
        this.field1226 = arg0.method2175();
        this.field1228 = arg0.method2175();
        this.field1236 = new class57();
        this.field1214 = new class51();
        this.field1236.method1134(arg0, this.field1214);
    }
}
