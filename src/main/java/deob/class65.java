package deob;

import java.util.Random;

@ObfuscatedName("bs")
public class class65 {

    @ObfuscatedName("bs.z")
    public class51 field1202;

    @ObfuscatedName("bs.j")
    public class51 field1207;

    @ObfuscatedName("bs.a")
    public class51 field1211;

    @ObfuscatedName("bs.y")
    public class51 field1193;

    @ObfuscatedName("bs.i")
    public class51 field1194;

    @ObfuscatedName("bs.b")
    public class51 field1195;

    @ObfuscatedName("bs.s")
    public class51 field1213;

    @ObfuscatedName("bs.q")
    public class51 field1197;

    @ObfuscatedName("bs.p")
    public int[] field1212 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bs.h")
    public int[] field1199 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bs.r")
    public int[] field1200 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bs.o")
    public int field1201 = 0;

    @ObfuscatedName("bs.f")
    public int field1196 = 100;

    @ObfuscatedName("bs.u")
    public class57 field1203;

    @ObfuscatedName("bs.c")
    public class51 field1204;

    @ObfuscatedName("bs.l")
    public int field1205 = 500;

    @ObfuscatedName("bs.w")
    public int field1198 = 0;

    @ObfuscatedName("bs.x")
    public static int[] field1210;

    @ObfuscatedName("bs.t")
    public static int[] field1208 = new int[32768];

    @ObfuscatedName("bs.k")
    public static int[] field1209;

    @ObfuscatedName("bs.v")
    public static int[] field1206;

    @ObfuscatedName("bs.n")
    public static int[] field1190;

    @ObfuscatedName("bs.d")
    public static int[] field1191;

    @ObfuscatedName("bs.m")
    public static int[] field1214;

    @ObfuscatedName("bs.g")
    public static int[] field1192;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1208[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1209 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1209[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1210 = new int[220500];
        field1206 = new int[5];
        field1190 = new int[5];
        field1191 = new int[5];
        field1214 = new int[5];
        field1192 = new int[5];
    }

    @ObfuscatedName("bs.z(II)[I")
    public final int[] method1285(int arg0, int arg1) {
        class108.method2333(field1210, 0, arg0);
        if (arg1 < 10) {
            return field1210;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1202.method1001();
        this.field1207.method1001();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1211 != null) {
            this.field1211.method1001();
            this.field1193.method1001();
            var5 = (int) ((double) (this.field1211.field1068 - this.field1211.field1069) * 32.768D / var3);
            var6 = (int) ((double) this.field1211.field1069 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1194 != null) {
            this.field1194.method1001();
            this.field1195.method1001();
            var8 = (int) ((double) (this.field1194.field1068 - this.field1194.field1069) * 32.768D / var3);
            var9 = (int) ((double) this.field1194.field1069 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1212[var11] != 0) {
                field1206[var11] = 0;
                field1190[var11] = (int) ((double) this.field1200[var11] * var3);
                field1191[var11] = (this.field1212[var11] << 14) / 100;
                field1214[var11] = (int) ((double) (this.field1202.field1068 - this.field1202.field1069) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1199[var11]) / var3);
                field1192[var11] = (int) ((double) this.field1202.field1069 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1202.method1003(arg0);
            int var14 = this.field1207.method1003(arg0);
            if (this.field1211 != null) {
                int var15 = this.field1211.method1003(arg0);
                int var16 = this.field1193.method1003(arg0);
                var13 += this.method1282(var7, var16, this.field1211.field1071) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1194 != null) {
                int var17 = this.field1194.method1003(arg0);
                int var18 = this.field1195.method1003(arg0);
                var14 = var14 * ((this.method1282(var10, var18, this.field1194.field1071) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1212[var19] != 0) {
                    int var20 = field1190[var19] + var12;
                    if (var20 < arg0) {
                        field1210[var20] += this.method1282(field1206[var19], field1191[var19] * var14 >> 15, this.field1202.field1071);
                        field1206[var19] += (field1214[var19] * var13 >> 16) + field1192[var19];
                    }
                }
            }
        }
        if (this.field1213 != null) {
            this.field1213.method1001();
            this.field1197.method1001();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1213.method1003(arg0);
                int var26 = this.field1197.method1003(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1213.field1068 - this.field1213.field1069) * var25 >> 8) + this.field1213.field1069;
                } else {
                    var27 = ((this.field1213.field1068 - this.field1213.field1069) * var26 >> 8) + this.field1213.field1069;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1210[var24] = 0;
                }
            }
        }
        if (this.field1201 > 0 && this.field1196 > 0) {
            int var28 = (int) ((double) this.field1201 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1210[var29] += field1210[var29 - var28] * this.field1196 / 100;
            }
        }
        if (this.field1203.field1114[0] > 0 || this.field1203.field1114[1] > 0) {
            this.field1204.method1001();
            int var30 = this.field1204.method1003(arg0 + 1);
            int var31 = this.field1203.method1049(0, (float) var30 / 65536.0F);
            int var32 = this.field1203.method1049(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1210[var31 + var33] * (long) Statics.field1112 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1210[var31 + var33 - 1 - var36] * (long) class57.field1104[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1210[var33 - 1 - var37] * (long) class57.field1104[1][var37] >> 16);
                    }
                    field1210[var33] = var35;
                    var30 = this.field1204.method1003(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1210[var31 + var33] * (long) Statics.field1112 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1210[var31 + var33 - 1 - var40] * (long) class57.field1104[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1210[var33 - 1 - var41] * (long) class57.field1104[1][var41] >> 16);
                        }
                        field1210[var33] = var39;
                        var30 = this.field1204.method1003(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1210[var31 + var33 - 1 - var43] * (long) class57.field1104[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1210[var33 - 1 - var44] * (long) class57.field1104[1][var44] >> 16);
                            }
                            field1210[var33] = var42;
                            this.field1204.method1003(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1203.method1049(0, (float) var30 / 65536.0F);
                    var32 = this.field1203.method1049(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1210[var46] < -32768) {
                field1210[var46] = -32768;
            }
            if (field1210[var46] > 32767) {
                field1210[var46] = 32767;
            }
        }
        return field1210;
    }

    @ObfuscatedName("bs.j(III)I")
    public final int method1282(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1209[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1208[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bs.a(Ldq;)V")
    public final void method1283(class107 arg0) {
        this.field1202 = new class51();
        this.field1202.method1000(arg0);
        this.field1207 = new class51();
        this.field1207.method1000(arg0);
        int var2 = arg0.method2122();
        if (var2 != 0) {
            arg0.field1819--;
            this.field1211 = new class51();
            this.field1211.method1000(arg0);
            this.field1193 = new class51();
            this.field1193.method1000(arg0);
        }
        int var3 = arg0.method2122();
        if (var3 != 0) {
            arg0.field1819--;
            this.field1194 = new class51();
            this.field1194.method1000(arg0);
            this.field1195 = new class51();
            this.field1195.method1000(arg0);
        }
        int var4 = arg0.method2122();
        if (var4 != 0) {
            arg0.field1819--;
            this.field1213 = new class51();
            this.field1213.method1000(arg0);
            this.field1197 = new class51();
            this.field1197.method1000(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2197();
            if (var6 == 0) {
                break;
            }
            this.field1212[var5] = var6;
            this.field1199[var5] = arg0.method2134();
            this.field1200[var5] = arg0.method2197();
        }
        this.field1201 = arg0.method2197();
        this.field1196 = arg0.method2197();
        this.field1205 = arg0.method2239();
        this.field1198 = arg0.method2239();
        this.field1203 = new class57();
        this.field1204 = new class51();
        this.field1203.method1054(arg0, this.field1204);
    }
}
