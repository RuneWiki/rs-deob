package deob;

import java.util.Random;

@ObfuscatedName("bk")
public class class54 {

    @ObfuscatedName("bk.b")
    public class56 field1165;

    @ObfuscatedName("bk.c")
    public class56 field1179;

    @ObfuscatedName("bk.j")
    public class56 field1175;

    @ObfuscatedName("bk.i")
    public class56 field1177;

    @ObfuscatedName("bk.k")
    public class56 field1163;

    @ObfuscatedName("bk.q")
    public class56 field1164;

    @ObfuscatedName("bk.t")
    public class56 field1160;

    @ObfuscatedName("bk.v")
    public class56 field1166;

    @ObfuscatedName("bk.y")
    public int[] field1167 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bk.w")
    public int[] field1168 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bk.g")
    public int[] field1180 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bk.s")
    public int field1170 = 0;

    @ObfuscatedName("bk.n")
    public int field1171 = 100;

    @ObfuscatedName("bk.x")
    public class64 field1172;

    @ObfuscatedName("bk.o")
    public class56 field1173;

    @ObfuscatedName("bk.l")
    public int field1159 = 500;

    @ObfuscatedName("bk.u")
    public int field1174 = 0;

    @ObfuscatedName("bk.z")
    public static int[] field1176;

    @ObfuscatedName("bk.d")
    public static int[] field1162 = new int[32768];

    @ObfuscatedName("bk.m")
    public static int[] field1178;

    @ObfuscatedName("bk.a")
    public static int[] field1183;

    @ObfuscatedName("bk.h")
    public static int[] field1181;

    @ObfuscatedName("bk.p")
    public static int[] field1182;

    @ObfuscatedName("bk.e")
    public static int[] field1161;

    @ObfuscatedName("bk.r")
    public static int[] field1184;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1162[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1178 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1178[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1176 = new int[220500];
        field1183 = new int[5];
        field1181 = new int[5];
        field1182 = new int[5];
        field1161 = new int[5];
        field1184 = new int[5];
    }

    @ObfuscatedName("bk.b(II)[I")
    public final int[] method1213(int arg0, int arg1) {
        class128.method2631(field1176, 0, arg0);
        if (arg1 < 10) {
            return field1176;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1165.method1223();
        this.field1179.method1223();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1175 != null) {
            this.field1175.method1223();
            this.field1177.method1223();
            var5 = (int) ((double) (this.field1175.field1198 - this.field1175.field1197) * 32.768D / var3);
            var6 = (int) ((double) this.field1175.field1197 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1163 != null) {
            this.field1163.method1223();
            this.field1164.method1223();
            var8 = (int) ((double) (this.field1163.field1198 - this.field1163.field1197) * 32.768D / var3);
            var9 = (int) ((double) this.field1163.field1197 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1167[var11] != 0) {
                field1183[var11] = 0;
                field1181[var11] = (int) ((double) this.field1180[var11] * var3);
                field1182[var11] = (this.field1167[var11] << 14) / 100;
                field1161[var11] = (int) ((double) (this.field1165.field1198 - this.field1165.field1197) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1168[var11]) / var3);
                field1184[var11] = (int) ((double) this.field1165.field1197 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1165.method1224(arg0);
            int var14 = this.field1179.method1224(arg0);
            if (this.field1175 != null) {
                int var15 = this.field1175.method1224(arg0);
                int var16 = this.field1177.method1224(arg0);
                var13 += this.method1206(var7, var16, this.field1175.field1195) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1163 != null) {
                int var17 = this.field1163.method1224(arg0);
                int var18 = this.field1164.method1224(arg0);
                var14 = var14 * ((this.method1206(var10, var18, this.field1163.field1195) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1167[var19] != 0) {
                    int var20 = field1181[var19] + var12;
                    if (var20 < arg0) {
                        field1176[var20] += this.method1206(field1183[var19], field1182[var19] * var14 >> 15, this.field1165.field1195);
                        field1183[var19] += (field1161[var19] * var13 >> 16) + field1184[var19];
                    }
                }
            }
        }
        if (this.field1160 != null) {
            this.field1160.method1223();
            this.field1166.method1223();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1160.method1224(arg0);
                int var26 = this.field1166.method1224(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1160.field1198 - this.field1160.field1197) * var25 >> 8) + this.field1160.field1197;
                } else {
                    var27 = ((this.field1160.field1198 - this.field1160.field1197) * var26 >> 8) + this.field1160.field1197;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1176[var24] = 0;
                }
            }
        }
        if (this.field1170 > 0 && this.field1171 > 0) {
            int var28 = (int) ((double) this.field1170 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1176[var29] += field1176[var29 - var28] * this.field1171 / 100;
            }
        }
        if (this.field1172.field1261[0] > 0 || this.field1172.field1261[1] > 0) {
            this.field1173.method1223();
            int var30 = this.field1173.method1224(arg0 + 1);
            int var31 = this.field1172.method1309(0, (float) var30 / 65536.0F);
            int var32 = this.field1172.method1309(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1176[var31 + var33] * (long) Statics.field1264 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1176[var31 + var33 - 1 - var36] * (long) class64.field1255[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1176[var33 - 1 - var37] * (long) class64.field1255[1][var37] >> 16);
                    }
                    field1176[var33] = var35;
                    var30 = this.field1173.method1224(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1176[var31 + var33] * (long) Statics.field1264 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1176[var31 + var33 - 1 - var40] * (long) class64.field1255[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1176[var33 - 1 - var41] * (long) class64.field1255[1][var41] >> 16);
                        }
                        field1176[var33] = var39;
                        var30 = this.field1173.method1224(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1176[var31 + var33 - 1 - var43] * (long) class64.field1255[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1176[var33 - 1 - var44] * (long) class64.field1255[1][var44] >> 16);
                            }
                            field1176[var33] = var42;
                            this.field1173.method1224(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1172.method1309(0, (float) var30 / 65536.0F);
                    var32 = this.field1172.method1309(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1176[var46] < -32768) {
                field1176[var46] = -32768;
            }
            if (field1176[var46] > 32767) {
                field1176[var46] = 32767;
            }
        }
        return field1176;
    }

    @ObfuscatedName("bk.c(III)I")
    public final int method1206(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1178[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1162[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bk.j(Ldv;)V")
    public final void method1208(class127 arg0) {
        this.field1165 = new class56();
        this.field1165.method1221(arg0);
        this.field1179 = new class56();
        this.field1179.method1221(arg0);
        int var2 = arg0.method2416();
        if (var2 != 0) {
            arg0.field2051--;
            this.field1175 = new class56();
            this.field1175.method1221(arg0);
            this.field1177 = new class56();
            this.field1177.method1221(arg0);
        }
        int var3 = arg0.method2416();
        if (var3 != 0) {
            arg0.field2051--;
            this.field1163 = new class56();
            this.field1163.method1221(arg0);
            this.field1164 = new class56();
            this.field1164.method1221(arg0);
        }
        int var4 = arg0.method2416();
        if (var4 != 0) {
            arg0.field2051--;
            this.field1160 = new class56();
            this.field1160.method1221(arg0);
            this.field1166 = new class56();
            this.field1166.method1221(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2409();
            if (var6 == 0) {
                break;
            }
            this.field1167[var5] = var6;
            this.field1168[var5] = arg0.method2408();
            this.field1180[var5] = arg0.method2409();
        }
        this.field1170 = arg0.method2409();
        this.field1171 = arg0.method2409();
        this.field1159 = arg0.method2394();
        this.field1174 = arg0.method2394();
        this.field1172 = new class64();
        this.field1173 = new class56();
        this.field1172.method1313(arg0, this.field1173);
    }
}
