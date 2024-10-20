package deob;

import java.util.Random;

@ObfuscatedName("bz")
public class class54 {

    @ObfuscatedName("bz.d")
    public class56 field1148;

    @ObfuscatedName("bz.g")
    public class56 field1149;

    @ObfuscatedName("bz.a")
    public class56 field1166;

    @ObfuscatedName("bz.t")
    public class56 field1155;

    @ObfuscatedName("bz.f")
    public class56 field1152;

    @ObfuscatedName("bz.c")
    public class56 field1153;

    @ObfuscatedName("bz.p")
    public class56 field1154;

    @ObfuscatedName("bz.s")
    public class56 field1150;

    @ObfuscatedName("bz.k")
    public int[] field1156 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bz.m")
    public int[] field1157 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bz.y")
    public int[] field1167 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bz.b")
    public int field1159 = 0;

    @ObfuscatedName("bz.l")
    public int field1160 = 100;

    @ObfuscatedName("bz.x")
    public class64 field1161;

    @ObfuscatedName("bz.z")
    public class56 field1151;

    @ObfuscatedName("bz.r")
    public int field1158 = 500;

    @ObfuscatedName("bz.h")
    public int field1164 = 0;

    @ObfuscatedName("bz.v")
    public static int[] field1165;

    @ObfuscatedName("bz.u")
    public static int[] field1163 = new int[32768];

    @ObfuscatedName("bz.i")
    public static int[] field1162;

    @ObfuscatedName("bz.n")
    public static int[] field1169;

    @ObfuscatedName("bz.q")
    public static int[] field1170;

    @ObfuscatedName("bz.w")
    public static int[] field1171;

    @ObfuscatedName("bz.o")
    public static int[] field1172;

    @ObfuscatedName("bz.j")
    public static int[] field1173;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1163[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1162 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1162[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1165 = new int[220500];
        field1169 = new int[5];
        field1170 = new int[5];
        field1171 = new int[5];
        field1172 = new int[5];
        field1173 = new int[5];
    }

    @ObfuscatedName("bz.d(II)[I")
    public final int[] method1199(int arg0, int arg1) {
        class128.method2595(field1165, 0, arg0);
        if (arg1 < 10) {
            return field1165;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1148.method1213();
        this.field1149.method1213();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1166 != null) {
            this.field1166.method1213();
            this.field1155.method1213();
            var5 = (int) ((double) (this.field1166.field1183 - this.field1166.field1187) * 32.768D / var3);
            var6 = (int) ((double) this.field1166.field1187 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1152 != null) {
            this.field1152.method1213();
            this.field1153.method1213();
            var8 = (int) ((double) (this.field1152.field1183 - this.field1152.field1187) * 32.768D / var3);
            var9 = (int) ((double) this.field1152.field1187 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1156[var11] != 0) {
                field1169[var11] = 0;
                field1170[var11] = (int) ((double) this.field1167[var11] * var3);
                field1171[var11] = (this.field1156[var11] << 14) / 100;
                field1172[var11] = (int) ((double) (this.field1148.field1183 - this.field1148.field1187) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1157[var11]) / var3);
                field1173[var11] = (int) ((double) this.field1148.field1187 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1148.method1214(arg0);
            int var14 = this.field1149.method1214(arg0);
            if (this.field1166 != null) {
                int var15 = this.field1166.method1214(arg0);
                int var16 = this.field1155.method1214(arg0);
                var13 += this.method1198(var7, var16, this.field1166.field1185) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1152 != null) {
                int var17 = this.field1152.method1214(arg0);
                int var18 = this.field1153.method1214(arg0);
                var14 = var14 * ((this.method1198(var10, var18, this.field1152.field1185) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1156[var19] != 0) {
                    int var20 = field1170[var19] + var12;
                    if (var20 < arg0) {
                        field1165[var20] += this.method1198(field1169[var19], field1171[var19] * var14 >> 15, this.field1148.field1185);
                        field1169[var19] += (field1172[var19] * var13 >> 16) + field1173[var19];
                    }
                }
            }
        }
        if (this.field1154 != null) {
            this.field1154.method1213();
            this.field1150.method1213();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1154.method1214(arg0);
                int var26 = this.field1150.method1214(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1154.field1183 - this.field1154.field1187) * var25 >> 8) + this.field1154.field1187;
                } else {
                    var27 = ((this.field1154.field1183 - this.field1154.field1187) * var26 >> 8) + this.field1154.field1187;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1165[var24] = 0;
                }
            }
        }
        if (this.field1159 > 0 && this.field1160 > 0) {
            int var28 = (int) ((double) this.field1159 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1165[var29] += field1165[var29 - var28] * this.field1160 / 100;
            }
        }
        if (this.field1161.field1245[0] > 0 || this.field1161.field1245[1] > 0) {
            this.field1151.method1213();
            int var30 = this.field1151.method1214(arg0 + 1);
            int var31 = this.field1161.method1299(0, (float) var30 / 65536.0F);
            int var32 = this.field1161.method1299(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1165[var31 + var33] * (long) Statics.field1237 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1165[var31 + var33 - 1 - var36] * (long) class64.field1242[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1165[var33 - 1 - var37] * (long) class64.field1242[1][var37] >> 16);
                    }
                    field1165[var33] = var35;
                    var30 = this.field1151.method1214(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1165[var31 + var33] * (long) Statics.field1237 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1165[var31 + var33 - 1 - var40] * (long) class64.field1242[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1165[var33 - 1 - var41] * (long) class64.field1242[1][var41] >> 16);
                        }
                        field1165[var33] = var39;
                        var30 = this.field1151.method1214(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1165[var31 + var33 - 1 - var43] * (long) class64.field1242[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1165[var33 - 1 - var44] * (long) class64.field1242[1][var44] >> 16);
                            }
                            field1165[var33] = var42;
                            this.field1151.method1214(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1161.method1299(0, (float) var30 / 65536.0F);
                    var32 = this.field1161.method1299(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1165[var46] < -32768) {
                field1165[var46] = -32768;
            }
            if (field1165[var46] > 32767) {
                field1165[var46] = 32767;
            }
        }
        return field1165;
    }

    @ObfuscatedName("bz.g(III)I")
    public final int method1198(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1162[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1163[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bz.a(Ldo;)V")
    public final void method1200(class127 arg0) {
        this.field1148 = new class56();
        this.field1148.method1211(arg0);
        this.field1149 = new class56();
        this.field1149.method1211(arg0);
        int var2 = arg0.method2509();
        if (var2 != 0) {
            arg0.field2042--;
            this.field1166 = new class56();
            this.field1166.method1211(arg0);
            this.field1155 = new class56();
            this.field1155.method1211(arg0);
        }
        int var3 = arg0.method2509();
        if (var3 != 0) {
            arg0.field2042--;
            this.field1152 = new class56();
            this.field1152.method1211(arg0);
            this.field1153 = new class56();
            this.field1153.method1211(arg0);
        }
        int var4 = arg0.method2509();
        if (var4 != 0) {
            arg0.field2042--;
            this.field1154 = new class56();
            this.field1154.method1211(arg0);
            this.field1150 = new class56();
            this.field1150.method1211(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2413();
            if (var6 == 0) {
                break;
            }
            this.field1156[var5] = var6;
            this.field1157[var5] = arg0.method2412();
            this.field1167[var5] = arg0.method2413();
        }
        this.field1159 = arg0.method2413();
        this.field1160 = arg0.method2413();
        this.field1158 = arg0.method2512();
        this.field1164 = arg0.method2512();
        this.field1161 = new class64();
        this.field1151 = new class56();
        this.field1161.method1305(arg0, this.field1151);
    }
}
