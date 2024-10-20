package deob;

import java.util.Random;

@ObfuscatedName("bz")
public class class54 {

    @ObfuscatedName("bz.x")
    public class56 field1141;

    @ObfuscatedName("bz.p")
    public class56 field1126;

    @ObfuscatedName("bz.k")
    public class56 field1127;

    @ObfuscatedName("bz.a")
    public class56 field1134;

    @ObfuscatedName("bz.q")
    public class56 field1129;

    @ObfuscatedName("bz.j")
    public class56 field1132;

    @ObfuscatedName("bz.v")
    public class56 field1137;

    @ObfuscatedName("bz.w")
    public class56 field1131;

    @ObfuscatedName("bz.l")
    public int[] field1133 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bz.s")
    public int[] field1150 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bz.n")
    public int[] field1135 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bz.c")
    public int field1136 = 0;

    @ObfuscatedName("bz.h")
    public int field1128 = 100;

    @ObfuscatedName("bz.u")
    public class64 field1138;

    @ObfuscatedName("bz.y")
    public class56 field1139;

    @ObfuscatedName("bz.b")
    public int field1140 = 500;

    @ObfuscatedName("bz.t")
    public int field1130 = 0;

    @ObfuscatedName("bz.r")
    public static int[] field1142;

    @ObfuscatedName("bz.g")
    public static int[] field1149 = new int[32768];

    @ObfuscatedName("bz.m")
    public static int[] field1144;

    @ObfuscatedName("bz.e")
    public static int[] field1146;

    @ObfuscatedName("bz.f")
    public static int[] field1147;

    @ObfuscatedName("bz.i")
    public static int[] field1148;

    @ObfuscatedName("bz.d")
    public static int[] field1145;

    @ObfuscatedName("bz.z")
    public static int[] field1143;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1149[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1144 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1144[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1142 = new int[220500];
        field1146 = new int[5];
        field1147 = new int[5];
        field1148 = new int[5];
        field1145 = new int[5];
        field1143 = new int[5];
    }

    @ObfuscatedName("bz.x(II)[I")
    public final int[] method1193(int arg0, int arg1) {
        class128.method2594(field1142, 0, arg0);
        if (arg1 < 10) {
            return field1142;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1141.method1213();
        this.field1126.method1213();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1127 != null) {
            this.field1127.method1213();
            this.field1134.method1213();
            var5 = (int) ((double) (this.field1127.field1164 - this.field1127.field1163) * 32.768D / var3);
            var6 = (int) ((double) this.field1127.field1163 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1129 != null) {
            this.field1129.method1213();
            this.field1132.method1213();
            var8 = (int) ((double) (this.field1129.field1164 - this.field1129.field1163) * 32.768D / var3);
            var9 = (int) ((double) this.field1129.field1163 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1133[var11] != 0) {
                field1146[var11] = 0;
                field1147[var11] = (int) ((double) this.field1135[var11] * var3);
                field1148[var11] = (this.field1133[var11] << 14) / 100;
                field1145[var11] = (int) ((double) (this.field1141.field1164 - this.field1141.field1163) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1150[var11]) / var3);
                field1143[var11] = (int) ((double) this.field1141.field1163 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1141.method1212(arg0);
            int var14 = this.field1126.method1212(arg0);
            if (this.field1127 != null) {
                int var15 = this.field1127.method1212(arg0);
                int var16 = this.field1134.method1212(arg0);
                var13 += this.method1194(var7, var16, this.field1127.field1165) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1129 != null) {
                int var17 = this.field1129.method1212(arg0);
                int var18 = this.field1132.method1212(arg0);
                var14 = var14 * ((this.method1194(var10, var18, this.field1129.field1165) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1133[var19] != 0) {
                    int var20 = field1147[var19] + var12;
                    if (var20 < arg0) {
                        field1142[var20] += this.method1194(field1146[var19], field1148[var19] * var14 >> 15, this.field1141.field1165);
                        field1146[var19] += (field1145[var19] * var13 >> 16) + field1143[var19];
                    }
                }
            }
        }
        if (this.field1137 != null) {
            this.field1137.method1213();
            this.field1131.method1213();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1137.method1212(arg0);
                int var26 = this.field1131.method1212(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1137.field1164 - this.field1137.field1163) * var25 >> 8) + this.field1137.field1163;
                } else {
                    var27 = ((this.field1137.field1164 - this.field1137.field1163) * var26 >> 8) + this.field1137.field1163;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1142[var24] = 0;
                }
            }
        }
        if (this.field1136 > 0 && this.field1128 > 0) {
            int var28 = (int) ((double) this.field1136 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1142[var29] += field1142[var29 - var28] * this.field1128 / 100;
            }
        }
        if (this.field1138.field1219[0] > 0 || this.field1138.field1219[1] > 0) {
            this.field1139.method1213();
            int var30 = this.field1139.method1212(arg0 + 1);
            int var31 = this.field1138.method1313(0, (float) var30 / 65536.0F);
            int var32 = this.field1138.method1313(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1142[var31 + var33] * (long) Statics.field1216 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1142[var31 + var33 - 1 - var36] * (long) class64.field1217[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1142[var33 - 1 - var37] * (long) class64.field1217[1][var37] >> 16);
                    }
                    field1142[var33] = var35;
                    var30 = this.field1139.method1212(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1142[var31 + var33] * (long) Statics.field1216 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1142[var31 + var33 - 1 - var40] * (long) class64.field1217[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1142[var33 - 1 - var41] * (long) class64.field1217[1][var41] >> 16);
                        }
                        field1142[var33] = var39;
                        var30 = this.field1139.method1212(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1142[var31 + var33 - 1 - var43] * (long) class64.field1217[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1142[var33 - 1 - var44] * (long) class64.field1217[1][var44] >> 16);
                            }
                            field1142[var33] = var42;
                            this.field1139.method1212(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1138.method1313(0, (float) var30 / 65536.0F);
                    var32 = this.field1138.method1313(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1142[var46] < -32768) {
                field1142[var46] = -32768;
            }
            if (field1142[var46] > 32767) {
                field1142[var46] = 32767;
            }
        }
        return field1142;
    }

    @ObfuscatedName("bz.p(III)I")
    public final int method1194(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1144[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1149[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bz.k(Ldg;)V")
    public final void method1192(class127 arg0) {
        this.field1141 = new class56();
        this.field1141.method1216(arg0);
        this.field1126 = new class56();
        this.field1126.method1216(arg0);
        int var2 = arg0.method2484();
        if (var2 != 0) {
            arg0.field2008--;
            this.field1127 = new class56();
            this.field1127.method1216(arg0);
            this.field1134 = new class56();
            this.field1134.method1216(arg0);
        }
        int var3 = arg0.method2484();
        if (var3 != 0) {
            arg0.field2008--;
            this.field1129 = new class56();
            this.field1129.method1216(arg0);
            this.field1132 = new class56();
            this.field1132.method1216(arg0);
        }
        int var4 = arg0.method2484();
        if (var4 != 0) {
            arg0.field2008--;
            this.field1137 = new class56();
            this.field1137.method1216(arg0);
            this.field1131 = new class56();
            this.field1131.method1216(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2437();
            if (var6 == 0) {
                break;
            }
            this.field1133[var5] = var6;
            this.field1150[var5] = arg0.method2565();
            this.field1135[var5] = arg0.method2437();
        }
        this.field1136 = arg0.method2437();
        this.field1128 = arg0.method2437();
        this.field1140 = arg0.method2539();
        this.field1130 = arg0.method2539();
        this.field1138 = new class64();
        this.field1139 = new class56();
        this.field1138.method1303(arg0, this.field1139);
    }
}
