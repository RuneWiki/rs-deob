package deob;

import java.util.Random;

@ObfuscatedName("bv")
public class class65 {

    @ObfuscatedName("bv.y")
    public class51 field1224;

    @ObfuscatedName("bv.u")
    public class51 field1207;

    @ObfuscatedName("bv.k")
    public class51 field1208;

    @ObfuscatedName("bv.v")
    public class51 field1211;

    @ObfuscatedName("bv.l")
    public class51 field1209;

    @ObfuscatedName("bv.g")
    public class51 field1223;

    @ObfuscatedName("bv.a")
    public class51 field1212;

    @ObfuscatedName("bv.x")
    public class51 field1213;

    @ObfuscatedName("bv.r")
    public int[] field1214 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bv.w")
    public int[] field1215 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bv.c")
    public int[] field1231 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bv.f")
    public int field1226 = 0;

    @ObfuscatedName("bv.o")
    public int field1218 = 100;

    @ObfuscatedName("bv.p")
    public class57 field1206;

    @ObfuscatedName("bv.n")
    public class51 field1220;

    @ObfuscatedName("bv.m")
    public int field1216 = 500;

    @ObfuscatedName("bv.s")
    public int field1222 = 0;

    @ObfuscatedName("bv.t")
    public static int[] field1217;

    @ObfuscatedName("bv.j")
    public static int[] field1221 = new int[32768];

    @ObfuscatedName("bv.b")
    public static int[] field1225;

    @ObfuscatedName("bv.h")
    public static int[] field1227;

    @ObfuscatedName("bv.q")
    public static int[] field1228;

    @ObfuscatedName("bv.d")
    public static int[] field1229;

    @ObfuscatedName("bv.z")
    public static int[] field1230;

    @ObfuscatedName("bv.e")
    public static int[] field1210;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1221[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1225 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1225[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1217 = new int[220500];
        field1227 = new int[5];
        field1228 = new int[5];
        field1229 = new int[5];
        field1230 = new int[5];
        field1210 = new int[5];
    }

    @ObfuscatedName("bv.y(II)[I")
    public final int[] method1289(int arg0, int arg1) {
        class108.method2305(field1217, 0, arg0);
        if (arg1 < 10) {
            return field1217;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1224.method1011();
        this.field1207.method1011();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1208 != null) {
            this.field1208.method1011();
            this.field1211.method1011();
            var5 = (int) ((double) (this.field1208.field1093 - this.field1208.field1088) * 32.768D / var3);
            var6 = (int) ((double) this.field1208.field1088 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1209 != null) {
            this.field1209.method1011();
            this.field1223.method1011();
            var8 = (int) ((double) (this.field1209.field1093 - this.field1209.field1088) * 32.768D / var3);
            var9 = (int) ((double) this.field1209.field1088 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1214[var11] != 0) {
                field1227[var11] = 0;
                field1228[var11] = (int) ((double) this.field1231[var11] * var3);
                field1229[var11] = (this.field1214[var11] << 14) / 100;
                field1230[var11] = (int) ((double) (this.field1224.field1093 - this.field1224.field1088) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1215[var11]) / var3);
                field1210[var11] = (int) ((double) this.field1224.field1088 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1224.method1015(arg0);
            int var14 = this.field1207.method1015(arg0);
            if (this.field1208 != null) {
                int var15 = this.field1208.method1015(arg0);
                int var16 = this.field1211.method1015(arg0);
                var13 += this.method1290(var7, var16, this.field1208.field1089) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1209 != null) {
                int var17 = this.field1209.method1015(arg0);
                int var18 = this.field1223.method1015(arg0);
                var14 = var14 * ((this.method1290(var10, var18, this.field1209.field1089) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1214[var19] != 0) {
                    int var20 = field1228[var19] + var12;
                    if (var20 < arg0) {
                        field1217[var20] += this.method1290(field1227[var19], field1229[var19] * var14 >> 15, this.field1224.field1089);
                        field1227[var19] += (field1230[var19] * var13 >> 16) + field1210[var19];
                    }
                }
            }
        }
        if (this.field1212 != null) {
            this.field1212.method1011();
            this.field1213.method1011();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1212.method1015(arg0);
                int var26 = this.field1213.method1015(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1212.field1093 - this.field1212.field1088) * var25 >> 8) + this.field1212.field1088;
                } else {
                    var27 = ((this.field1212.field1093 - this.field1212.field1088) * var26 >> 8) + this.field1212.field1088;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1217[var24] = 0;
                }
            }
        }
        if (this.field1226 > 0 && this.field1218 > 0) {
            int var28 = (int) ((double) this.field1226 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1217[var29] += field1217[var29 - var28] * this.field1218 / 100;
            }
        }
        if (this.field1206.field1122[0] > 0 || this.field1206.field1122[1] > 0) {
            this.field1220.method1011();
            int var30 = this.field1220.method1015(arg0 + 1);
            int var31 = this.field1206.method1070(0, (float) var30 / 65536.0F);
            int var32 = this.field1206.method1070(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1217[var31 + var33] * (long) Statics.field1124 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1217[var31 + var33 - 1 - var36] * (long) class57.field1126[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1217[var33 - 1 - var37] * (long) class57.field1126[1][var37] >> 16);
                    }
                    field1217[var33] = var35;
                    var30 = this.field1220.method1015(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1217[var31 + var33] * (long) Statics.field1124 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1217[var31 + var33 - 1 - var40] * (long) class57.field1126[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1217[var33 - 1 - var41] * (long) class57.field1126[1][var41] >> 16);
                        }
                        field1217[var33] = var39;
                        var30 = this.field1220.method1015(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1217[var31 + var33 - 1 - var43] * (long) class57.field1126[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1217[var33 - 1 - var44] * (long) class57.field1126[1][var44] >> 16);
                            }
                            field1217[var33] = var42;
                            this.field1220.method1015(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1206.method1070(0, (float) var30 / 65536.0F);
                    var32 = this.field1206.method1070(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1217[var46] < -32768) {
                field1217[var46] = -32768;
            }
            if (field1217[var46] > 32767) {
                field1217[var46] = 32767;
            }
        }
        return field1217;
    }

    @ObfuscatedName("bv.u(III)I")
    public final int method1290(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1225[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1221[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bv.k(Ldo;)V")
    public final void method1291(class107 arg0) {
        this.field1224 = new class51();
        this.field1224.method1012(arg0);
        this.field1207 = new class51();
        this.field1207.method1012(arg0);
        int var2 = arg0.method2109();
        if (var2 != 0) {
            arg0.field1854--;
            this.field1208 = new class51();
            this.field1208.method1012(arg0);
            this.field1211 = new class51();
            this.field1211.method1012(arg0);
        }
        int var3 = arg0.method2109();
        if (var3 != 0) {
            arg0.field1854--;
            this.field1209 = new class51();
            this.field1209.method1012(arg0);
            this.field1223 = new class51();
            this.field1223.method1012(arg0);
        }
        int var4 = arg0.method2109();
        if (var4 != 0) {
            arg0.field1854--;
            this.field1212 = new class51();
            this.field1212.method1012(arg0);
            this.field1213 = new class51();
            this.field1213.method1012(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2122();
            if (var6 == 0) {
                break;
            }
            this.field1214[var5] = var6;
            this.field1215[var5] = arg0.method2187();
            this.field1231[var5] = arg0.method2122();
        }
        this.field1226 = arg0.method2122();
        this.field1218 = arg0.method2122();
        this.field1216 = arg0.method2111();
        this.field1222 = arg0.method2111();
        this.field1206 = new class57();
        this.field1220 = new class51();
        this.field1206.method1071(arg0, this.field1220);
    }
}
