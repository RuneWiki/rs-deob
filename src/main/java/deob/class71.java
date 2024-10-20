package deob;

import java.util.Random;

@ObfuscatedName("bt")
public class class71 {

    @ObfuscatedName("bt.b")
    public class59 field1158;

    @ObfuscatedName("bt.l")
    public class59 field1134;

    @ObfuscatedName("bt.i")
    public class59 field1135;

    @ObfuscatedName("bt.t")
    public class59 field1136;

    @ObfuscatedName("bt.k")
    public class59 field1157;

    @ObfuscatedName("bt.h")
    public class59 field1138;

    @ObfuscatedName("bt.n")
    public class59 field1139;

    @ObfuscatedName("bt.f")
    public class59 field1140;

    @ObfuscatedName("bt.a")
    public int[] field1141 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bt.r")
    public int[] field1147 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bt.x")
    public int[] field1142 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bt.z")
    public int field1148 = 0;

    @ObfuscatedName("bt.p")
    public int field1145 = 100;

    @ObfuscatedName("bt.s")
    public class68 field1146;

    @ObfuscatedName("bt.o")
    public class59 field1150;

    @ObfuscatedName("bt.y")
    public int field1144 = 500;

    @ObfuscatedName("bt.w")
    public int field1149 = 0;

    @ObfuscatedName("bt.m")
    public static int[] field1133;

    @ObfuscatedName("bt.u")
    public static int[] field1151 = new int[32768];

    @ObfuscatedName("bt.q")
    public static int[] field1152;

    @ObfuscatedName("bt.v")
    public static int[] field1154;

    @ObfuscatedName("bt.e")
    public static int[] field1155;

    @ObfuscatedName("bt.j")
    public static int[] field1137;

    @ObfuscatedName("bt.d")
    public static int[] field1143;

    @ObfuscatedName("bt.g")
    public static int[] field1156;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1151[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1152 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1152[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1133 = new int[220500];
        field1154 = new int[5];
        field1155 = new int[5];
        field1137 = new int[5];
        field1143 = new int[5];
        field1156 = new int[5];
    }

    @ObfuscatedName("bt.b(II)[I")
    public final int[] method1343(int arg0, int arg1) {
        class164.method2999(field1133, 0, arg0);
        if (arg1 < 10) {
            return field1133;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1158.method1138();
        this.field1134.method1138();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1135 != null) {
            this.field1135.method1138();
            this.field1136.method1138();
            var5 = (int) ((double) (this.field1135.field1052 - this.field1135.field1051) * 32.768D / var3);
            var6 = (int) ((double) this.field1135.field1051 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1157 != null) {
            this.field1157.method1138();
            this.field1138.method1138();
            var8 = (int) ((double) (this.field1157.field1052 - this.field1157.field1051) * 32.768D / var3);
            var9 = (int) ((double) this.field1157.field1051 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1141[var11] != 0) {
                field1154[var11] = 0;
                field1155[var11] = (int) ((double) this.field1142[var11] * var3);
                field1137[var11] = (this.field1141[var11] << 14) / 100;
                field1143[var11] = (int) ((double) (this.field1158.field1052 - this.field1158.field1051) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1147[var11]) / var3);
                field1156[var11] = (int) ((double) this.field1158.field1051 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1158.method1137(arg0);
            int var14 = this.field1134.method1137(arg0);
            if (this.field1135 != null) {
                int var15 = this.field1135.method1137(arg0);
                int var16 = this.field1136.method1137(arg0);
                var13 += this.method1352(var7, var16, this.field1135.field1053) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1157 != null) {
                int var17 = this.field1157.method1137(arg0);
                int var18 = this.field1138.method1137(arg0);
                var14 = var14 * ((this.method1352(var10, var18, this.field1157.field1053) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1141[var19] != 0) {
                    int var20 = field1155[var19] + var12;
                    if (var20 < arg0) {
                        field1133[var20] += this.method1352(field1154[var19], field1137[var19] * var14 >> 15, this.field1158.field1053);
                        field1154[var19] += (field1143[var19] * var13 >> 16) + field1156[var19];
                    }
                }
            }
        }
        if (this.field1139 != null) {
            this.field1139.method1138();
            this.field1140.method1138();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1139.method1137(arg0);
                int var26 = this.field1140.method1137(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1139.field1052 - this.field1139.field1051) * var25 >> 8) + this.field1139.field1051;
                } else {
                    var27 = ((this.field1139.field1052 - this.field1139.field1051) * var26 >> 8) + this.field1139.field1051;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1133[var24] = 0;
                }
            }
        }
        if (this.field1148 > 0 && this.field1145 > 0) {
            int var28 = (int) ((double) this.field1148 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1133[var29] += field1133[var29 - var28] * this.field1145 / 100;
            }
        }
        if (this.field1146.field1124[0] > 0 || this.field1146.field1124[1] > 0) {
            this.field1150.method1138();
            int var30 = this.field1150.method1137(arg0 + 1);
            int var31 = this.field1146.method1325(0, (float) var30 / 65536.0F);
            int var32 = this.field1146.method1325(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1133[var31 + var33] * (long) Statics.field1121 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1133[var31 + var33 - 1 - var36] * (long) class68.field1119[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1133[var33 - 1 - var37] * (long) class68.field1119[1][var37] >> 16);
                    }
                    field1133[var33] = var35;
                    var30 = this.field1150.method1137(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1133[var31 + var33] * (long) Statics.field1121 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1133[var31 + var33 - 1 - var40] * (long) class68.field1119[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1133[var33 - 1 - var41] * (long) class68.field1119[1][var41] >> 16);
                        }
                        field1133[var33] = var39;
                        var30 = this.field1150.method1137(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1133[var31 + var33 - 1 - var43] * (long) class68.field1119[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1133[var33 - 1 - var44] * (long) class68.field1119[1][var44] >> 16);
                            }
                            field1133[var33] = var42;
                            this.field1150.method1137(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1146.method1325(0, (float) var30 / 65536.0F);
                    var32 = this.field1146.method1325(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1133[var46] < -32768) {
                field1133[var46] = -32768;
            }
            if (field1133[var46] > 32767) {
                field1133[var46] = 32767;
            }
        }
        return field1133;
    }

    @ObfuscatedName("bt.l(III)I")
    public final int method1352(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1152[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1151[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bt.i(Leg;)V")
    public final void method1353(class154 arg0) {
        this.field1158 = new class59();
        this.field1158.method1135(arg0);
        this.field1134 = new class59();
        this.field1134.method1135(arg0);
        int var2 = arg0.method2678();
        if (var2 != 0) {
            arg0.field2085--;
            this.field1135 = new class59();
            this.field1135.method1135(arg0);
            this.field1136 = new class59();
            this.field1136.method1135(arg0);
        }
        int var3 = arg0.method2678();
        if (var3 != 0) {
            arg0.field2085--;
            this.field1157 = new class59();
            this.field1157.method1135(arg0);
            this.field1138 = new class59();
            this.field1138.method1135(arg0);
        }
        int var4 = arg0.method2678();
        if (var4 != 0) {
            arg0.field2085--;
            this.field1139 = new class59();
            this.field1139.method1135(arg0);
            this.field1140 = new class59();
            this.field1140.method1135(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2813();
            if (var6 == 0) {
                break;
            }
            this.field1141[var5] = var6;
            this.field1147[var5] = arg0.method2690();
            this.field1142[var5] = arg0.method2813();
        }
        this.field1148 = arg0.method2813();
        this.field1145 = arg0.method2813();
        this.field1144 = arg0.method2801();
        this.field1149 = arg0.method2801();
        this.field1146 = new class68();
        this.field1150 = new class59();
        this.field1146.method1326(arg0, this.field1150);
    }
}
