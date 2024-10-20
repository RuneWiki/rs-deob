package deob;

import java.util.Random;

@ObfuscatedName("bl")
public class class65 {

    @ObfuscatedName("bl.t")
    public class51 field1224;

    @ObfuscatedName("bl.s")
    public class51 field1210;

    @ObfuscatedName("bl.f")
    public class51 field1223;

    @ObfuscatedName("bl.e")
    public class51 field1212;

    @ObfuscatedName("bl.d")
    public class51 field1209;

    @ObfuscatedName("bl.n")
    public class51 field1214;

    @ObfuscatedName("bl.v")
    public class51 field1215;

    @ObfuscatedName("bl.z")
    public class51 field1219;

    @ObfuscatedName("bl.j")
    public int[] field1217 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bl.u")
    public int[] field1218 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bl.g")
    public int[] field1231 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bl.a")
    public int field1230 = 0;

    @ObfuscatedName("bl.c")
    public int field1221 = 100;

    @ObfuscatedName("bl.w")
    public class57 field1222;

    @ObfuscatedName("bl.l")
    public class51 field1225;

    @ObfuscatedName("bl.q")
    public int field1228 = 500;

    @ObfuscatedName("bl.x")
    public int field1220 = 0;

    @ObfuscatedName("bl.p")
    public static int[] field1226;

    @ObfuscatedName("bl.y")
    public static int[] field1211 = new int[32768];

    @ObfuscatedName("bl.r")
    public static int[] field1216;

    @ObfuscatedName("bl.b")
    public static int[] field1234;

    @ObfuscatedName("bl.h")
    public static int[] field1213;

    @ObfuscatedName("bl.i")
    public static int[] field1232;

    @ObfuscatedName("bl.o")
    public static int[] field1233;

    @ObfuscatedName("bl.m")
    public static int[] field1227;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1211[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1216 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1216[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1226 = new int[220500];
        field1234 = new int[5];
        field1213 = new int[5];
        field1232 = new int[5];
        field1233 = new int[5];
        field1227 = new int[5];
    }

    @ObfuscatedName("bl.t(II)[I")
    public final int[] method1285(int arg0, int arg1) {
        class108.method2318(field1226, 0, arg0);
        if (arg1 < 10) {
            return field1226;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1224.method998();
        this.field1210.method998();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1223 != null) {
            this.field1223.method998();
            this.field1212.method998();
            var5 = (int) ((double) (this.field1223.field1092 - this.field1223.field1091) * 32.768D / var3);
            var6 = (int) ((double) this.field1223.field1091 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1209 != null) {
            this.field1209.method998();
            this.field1214.method998();
            var8 = (int) ((double) (this.field1209.field1092 - this.field1209.field1091) * 32.768D / var3);
            var9 = (int) ((double) this.field1209.field1091 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1217[var11] != 0) {
                field1234[var11] = 0;
                field1213[var11] = (int) ((double) this.field1231[var11] * var3);
                field1232[var11] = (this.field1217[var11] << 14) / 100;
                field1233[var11] = (int) ((double) (this.field1224.field1092 - this.field1224.field1091) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1218[var11]) / var3);
                field1227[var11] = (int) ((double) this.field1224.field1091 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1224.method996(arg0);
            int var14 = this.field1210.method996(arg0);
            if (this.field1223 != null) {
                int var15 = this.field1223.method996(arg0);
                int var16 = this.field1212.method996(arg0);
                var13 += this.method1284(var7, var16, this.field1223.field1094) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1209 != null) {
                int var17 = this.field1209.method996(arg0);
                int var18 = this.field1214.method996(arg0);
                var14 = var14 * ((this.method1284(var10, var18, this.field1209.field1094) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1217[var19] != 0) {
                    int var20 = field1213[var19] + var12;
                    if (var20 < arg0) {
                        field1226[var20] += this.method1284(field1234[var19], field1232[var19] * var14 >> 15, this.field1224.field1094);
                        field1234[var19] += (field1233[var19] * var13 >> 16) + field1227[var19];
                    }
                }
            }
        }
        if (this.field1215 != null) {
            this.field1215.method998();
            this.field1219.method998();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1215.method996(arg0);
                int var26 = this.field1219.method996(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1215.field1092 - this.field1215.field1091) * var25 >> 8) + this.field1215.field1091;
                } else {
                    var27 = ((this.field1215.field1092 - this.field1215.field1091) * var26 >> 8) + this.field1215.field1091;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1226[var24] = 0;
                }
            }
        }
        if (this.field1230 > 0 && this.field1221 > 0) {
            int var28 = (int) ((double) this.field1230 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1226[var29] += field1226[var29 - var28] * this.field1221 / 100;
            }
        }
        if (this.field1222.field1130[0] > 0 || this.field1222.field1130[1] > 0) {
            this.field1225.method998();
            int var30 = this.field1225.method996(arg0 + 1);
            int var31 = this.field1222.method1056(0, (float) var30 / 65536.0F);
            int var32 = this.field1222.method1056(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1226[var31 + var33] * (long) Statics.field1131 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1226[var31 + var33 - 1 - var36] * (long) class57.field1133[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1226[var33 - 1 - var37] * (long) class57.field1133[1][var37] >> 16);
                    }
                    field1226[var33] = var35;
                    var30 = this.field1225.method996(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1226[var31 + var33] * (long) Statics.field1131 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1226[var31 + var33 - 1 - var40] * (long) class57.field1133[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1226[var33 - 1 - var41] * (long) class57.field1133[1][var41] >> 16);
                        }
                        field1226[var33] = var39;
                        var30 = this.field1225.method996(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1226[var31 + var33 - 1 - var43] * (long) class57.field1133[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1226[var33 - 1 - var44] * (long) class57.field1133[1][var44] >> 16);
                            }
                            field1226[var33] = var42;
                            this.field1225.method996(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1222.method1056(0, (float) var30 / 65536.0F);
                    var32 = this.field1222.method1056(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1226[var46] < -32768) {
                field1226[var46] = -32768;
            }
            if (field1226[var46] > 32767) {
                field1226[var46] = 32767;
            }
        }
        return field1226;
    }

    @ObfuscatedName("bl.s(III)I")
    public final int method1284(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1216[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1211[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bl.f(Ldb;)V")
    public final void method1288(class107 arg0) {
        this.field1224 = new class51();
        this.field1224.method1005(arg0);
        this.field1210 = new class51();
        this.field1210.method1005(arg0);
        int var2 = arg0.method2101();
        if (var2 != 0) {
            arg0.field1830--;
            this.field1223 = new class51();
            this.field1223.method1005(arg0);
            this.field1212 = new class51();
            this.field1212.method1005(arg0);
        }
        int var3 = arg0.method2101();
        if (var3 != 0) {
            arg0.field1830--;
            this.field1209 = new class51();
            this.field1209.method1005(arg0);
            this.field1214 = new class51();
            this.field1214.method1005(arg0);
        }
        int var4 = arg0.method2101();
        if (var4 != 0) {
            arg0.field1830--;
            this.field1215 = new class51();
            this.field1215.method1005(arg0);
            this.field1219 = new class51();
            this.field1219.method1005(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2114();
            if (var6 == 0) {
                break;
            }
            this.field1217[var5] = var6;
            this.field1218[var5] = arg0.method2213();
            this.field1231[var5] = arg0.method2114();
        }
        this.field1230 = arg0.method2114();
        this.field1221 = arg0.method2114();
        this.field1228 = arg0.method2103();
        this.field1220 = arg0.method2103();
        this.field1222 = new class57();
        this.field1225 = new class51();
        this.field1222.method1062(arg0, this.field1225);
    }
}
