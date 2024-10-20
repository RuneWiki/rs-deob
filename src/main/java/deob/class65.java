package deob;

import java.util.Random;

@ObfuscatedName("br")
public class class65 {

    @ObfuscatedName("br.j")
    public class51 field1248;

    @ObfuscatedName("br.z")
    public class51 field1228;

    @ObfuscatedName("br.y")
    public class51 field1229;

    @ObfuscatedName("br.h")
    public class51 field1230;

    @ObfuscatedName("br.r")
    public class51 field1231;

    @ObfuscatedName("br.e")
    public class51 field1235;

    @ObfuscatedName("br.k")
    public class51 field1233;

    @ObfuscatedName("br.b")
    public class51 field1244;

    @ObfuscatedName("br.n")
    public int[] field1232 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("br.a")
    public int[] field1236 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("br.q")
    public int[] field1237 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("br.i")
    public int field1238 = 0;

    @ObfuscatedName("br.f")
    public int field1227 = 100;

    @ObfuscatedName("br.o")
    public class57 field1240;

    @ObfuscatedName("br.t")
    public class51 field1241;

    @ObfuscatedName("br.c")
    public int field1242 = 500;

    @ObfuscatedName("br.d")
    public int field1243 = 0;

    @ObfuscatedName("br.g")
    public static int[] field1239;

    @ObfuscatedName("br.s")
    public static int[] field1247 = new int[32768];

    @ObfuscatedName("br.m")
    public static int[] field1246;

    @ObfuscatedName("br.u")
    public static int[] field1245;

    @ObfuscatedName("br.p")
    public static int[] field1249;

    @ObfuscatedName("br.l")
    public static int[] field1250;

    @ObfuscatedName("br.w")
    public static int[] field1251;

    @ObfuscatedName("br.x")
    public static int[] field1252;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1247[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1246 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1246[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1239 = new int[220500];
        field1245 = new int[5];
        field1249 = new int[5];
        field1250 = new int[5];
        field1251 = new int[5];
        field1252 = new int[5];
    }

    @ObfuscatedName("br.j(II)[I")
    public final int[] method1298(int arg0, int arg1) {
        class108.method2336(field1239, 0, arg0);
        if (arg1 < 10) {
            return field1239;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1248.method1007();
        this.field1228.method1007();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1229 != null) {
            this.field1229.method1007();
            this.field1230.method1007();
            var5 = (int) ((double) (this.field1229.field1107 - this.field1229.field1106) * 32.768D / var3);
            var6 = (int) ((double) this.field1229.field1106 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1231 != null) {
            this.field1231.method1007();
            this.field1235.method1007();
            var8 = (int) ((double) (this.field1231.field1107 - this.field1231.field1106) * 32.768D / var3);
            var9 = (int) ((double) this.field1231.field1106 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1232[var11] != 0) {
                field1245[var11] = 0;
                field1249[var11] = (int) ((double) this.field1237[var11] * var3);
                field1250[var11] = (this.field1232[var11] << 14) / 100;
                field1251[var11] = (int) ((double) (this.field1248.field1107 - this.field1248.field1106) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1236[var11]) / var3);
                field1252[var11] = (int) ((double) this.field1248.field1106 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1248.method1009(arg0);
            int var14 = this.field1228.method1009(arg0);
            if (this.field1229 != null) {
                int var15 = this.field1229.method1009(arg0);
                int var16 = this.field1230.method1009(arg0);
                var13 += this.method1299(var7, var16, this.field1229.field1104) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1231 != null) {
                int var17 = this.field1231.method1009(arg0);
                int var18 = this.field1235.method1009(arg0);
                var14 = var14 * ((this.method1299(var10, var18, this.field1231.field1104) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1232[var19] != 0) {
                    int var20 = field1249[var19] + var12;
                    if (var20 < arg0) {
                        field1239[var20] += this.method1299(field1245[var19], field1250[var19] * var14 >> 15, this.field1248.field1104);
                        field1245[var19] += (field1251[var19] * var13 >> 16) + field1252[var19];
                    }
                }
            }
        }
        if (this.field1233 != null) {
            this.field1233.method1007();
            this.field1244.method1007();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1233.method1009(arg0);
                int var26 = this.field1244.method1009(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1233.field1107 - this.field1233.field1106) * var25 >> 8) + this.field1233.field1106;
                } else {
                    var27 = ((this.field1233.field1107 - this.field1233.field1106) * var26 >> 8) + this.field1233.field1106;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1239[var24] = 0;
                }
            }
        }
        if (this.field1238 > 0 && this.field1227 > 0) {
            int var28 = (int) ((double) this.field1238 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1239[var29] += field1239[var29 - var28] * this.field1227 / 100;
            }
        }
        if (this.field1240.field1146[0] > 0 || this.field1240.field1146[1] > 0) {
            this.field1241.method1007();
            int var30 = this.field1241.method1009(arg0 + 1);
            int var31 = this.field1240.method1072(0, (float) var30 / 65536.0F);
            int var32 = this.field1240.method1072(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1239[var31 + var33] * (long) Statics.field1149 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1239[var31 + var33 - 1 - var36] * (long) class57.field1144[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1239[var33 - 1 - var37] * (long) class57.field1144[1][var37] >> 16);
                    }
                    field1239[var33] = var35;
                    var30 = this.field1241.method1009(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1239[var31 + var33] * (long) Statics.field1149 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1239[var31 + var33 - 1 - var40] * (long) class57.field1144[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1239[var33 - 1 - var41] * (long) class57.field1144[1][var41] >> 16);
                        }
                        field1239[var33] = var39;
                        var30 = this.field1241.method1009(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1239[var31 + var33 - 1 - var43] * (long) class57.field1144[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1239[var33 - 1 - var44] * (long) class57.field1144[1][var44] >> 16);
                            }
                            field1239[var33] = var42;
                            this.field1241.method1009(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1240.method1072(0, (float) var30 / 65536.0F);
                    var32 = this.field1240.method1072(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1239[var46] < -32768) {
                field1239[var46] = -32768;
            }
            if (field1239[var46] > 32767) {
                field1239[var46] = 32767;
            }
        }
        return field1239;
    }

    @ObfuscatedName("br.z(III)I")
    public final int method1299(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1246[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1247[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("br.y(Lde;)V")
    public final void method1300(class107 arg0) {
        this.field1248 = new class51();
        this.field1248.method1006(arg0);
        this.field1228 = new class51();
        this.field1228.method1006(arg0);
        int var2 = arg0.method2130();
        if (var2 != 0) {
            arg0.field1847--;
            this.field1229 = new class51();
            this.field1229.method1006(arg0);
            this.field1230 = new class51();
            this.field1230.method1006(arg0);
        }
        int var3 = arg0.method2130();
        if (var3 != 0) {
            arg0.field1847--;
            this.field1231 = new class51();
            this.field1231.method1006(arg0);
            this.field1235 = new class51();
            this.field1235.method1006(arg0);
        }
        int var4 = arg0.method2130();
        if (var4 != 0) {
            arg0.field1847--;
            this.field1233 = new class51();
            this.field1233.method1006(arg0);
            this.field1244 = new class51();
            this.field1244.method1006(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2197();
            if (var6 == 0) {
                break;
            }
            this.field1232[var5] = var6;
            this.field1236[var5] = arg0.method2142();
            this.field1237[var5] = arg0.method2197();
        }
        this.field1238 = arg0.method2197();
        this.field1227 = arg0.method2197();
        this.field1242 = arg0.method2132();
        this.field1243 = arg0.method2132();
        this.field1240 = new class57();
        this.field1241 = new class51();
        this.field1240.method1083(arg0, this.field1241);
    }
}
