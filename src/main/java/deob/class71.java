package deob;

import java.util.Random;

@ObfuscatedName("bn")
public class class71 {

    @ObfuscatedName("bn.k")
    public class59 field1161;

    @ObfuscatedName("bn.y")
    public class59 field1151;

    @ObfuscatedName("bn.o")
    public class59 field1153;

    @ObfuscatedName("bn.r")
    public class59 field1154;

    @ObfuscatedName("bn.w")
    public class59 field1163;

    @ObfuscatedName("bn.j")
    public class59 field1156;

    @ObfuscatedName("bn.q")
    public class59 field1155;

    @ObfuscatedName("bn.d")
    public class59 field1158;

    @ObfuscatedName("bn.n")
    public int[] field1159 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bn.c")
    public int[] field1160 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bn.s")
    public int[] field1174 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bn.g")
    public int field1162 = 0;

    @ObfuscatedName("bn.i")
    public int field1166 = 100;

    @ObfuscatedName("bn.v")
    public class68 field1157;

    @ObfuscatedName("bn.a")
    public class59 field1165;

    @ObfuscatedName("bn.h")
    public int field1175 = 500;

    @ObfuscatedName("bn.p")
    public int field1172 = 0;

    @ObfuscatedName("bn.t")
    public static int[] field1168;

    @ObfuscatedName("bn.f")
    public static int[] field1169 = new int[32768];

    @ObfuscatedName("bn.z")
    public static int[] field1170;

    @ObfuscatedName("bn.b")
    public static int[] field1152;

    @ObfuscatedName("bn.m")
    public static int[] field1173;

    @ObfuscatedName("bn.e")
    public static int[] field1167;

    @ObfuscatedName("bn.l")
    public static int[] field1164;

    @ObfuscatedName("bn.x")
    public static int[] field1176;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1169[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1170 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1170[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1168 = new int[220500];
        field1152 = new int[5];
        field1173 = new int[5];
        field1167 = new int[5];
        field1164 = new int[5];
        field1176 = new int[5];
    }

    @ObfuscatedName("bn.k(II)[I")
    public final int[] method1298(int arg0, int arg1) {
        class171.method3022(field1168, 0, arg0);
        if (arg1 < 10) {
            return field1168;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1161.method1079();
        this.field1151.method1079();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1153 != null) {
            this.field1153.method1079();
            this.field1154.method1079();
            var5 = (int) ((double) (this.field1153.field1068 - this.field1153.field1064) * 32.768D / var3);
            var6 = (int) ((double) this.field1153.field1064 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1163 != null) {
            this.field1163.method1079();
            this.field1156.method1079();
            var8 = (int) ((double) (this.field1163.field1068 - this.field1163.field1064) * 32.768D / var3);
            var9 = (int) ((double) this.field1163.field1064 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1159[var11] != 0) {
                field1152[var11] = 0;
                field1173[var11] = (int) ((double) this.field1174[var11] * var3);
                field1167[var11] = (this.field1159[var11] << 14) / 100;
                field1164[var11] = (int) ((double) (this.field1161.field1068 - this.field1161.field1064) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1160[var11]) / var3);
                field1176[var11] = (int) ((double) this.field1161.field1064 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1161.method1083(arg0);
            int var14 = this.field1151.method1083(arg0);
            if (this.field1153 != null) {
                int var15 = this.field1153.method1083(arg0);
                int var16 = this.field1154.method1083(arg0);
                var13 += this.method1297(var7, var16, this.field1153.field1067) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1163 != null) {
                int var17 = this.field1163.method1083(arg0);
                int var18 = this.field1156.method1083(arg0);
                var14 = var14 * ((this.method1297(var10, var18, this.field1163.field1067) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1159[var19] != 0) {
                    int var20 = field1173[var19] + var12;
                    if (var20 < arg0) {
                        field1168[var20] += this.method1297(field1152[var19], field1167[var19] * var14 >> 15, this.field1161.field1067);
                        field1152[var19] += (field1164[var19] * var13 >> 16) + field1176[var19];
                    }
                }
            }
        }
        if (this.field1155 != null) {
            this.field1155.method1079();
            this.field1158.method1079();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1155.method1083(arg0);
                int var26 = this.field1158.method1083(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1155.field1068 - this.field1155.field1064) * var25 >> 8) + this.field1155.field1064;
                } else {
                    var27 = ((this.field1155.field1068 - this.field1155.field1064) * var26 >> 8) + this.field1155.field1064;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1168[var24] = 0;
                }
            }
        }
        if (this.field1162 > 0 && this.field1166 > 0) {
            int var28 = (int) ((double) this.field1162 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1168[var29] += field1168[var29 - var28] * this.field1166 / 100;
            }
        }
        if (this.field1157.field1138[0] > 0 || this.field1157.field1138[1] > 0) {
            this.field1165.method1079();
            int var30 = this.field1165.method1083(arg0 + 1);
            int var31 = this.field1157.method1278(0, (float) var30 / 65536.0F);
            int var32 = this.field1157.method1278(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1168[var31 + var33] * (long) Statics.field1139 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1168[var31 + var33 - 1 - var36] * (long) class68.field1137[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1168[var33 - 1 - var37] * (long) class68.field1137[1][var37] >> 16);
                    }
                    field1168[var33] = var35;
                    var30 = this.field1165.method1083(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1168[var31 + var33] * (long) Statics.field1139 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1168[var31 + var33 - 1 - var40] * (long) class68.field1137[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1168[var33 - 1 - var41] * (long) class68.field1137[1][var41] >> 16);
                        }
                        field1168[var33] = var39;
                        var30 = this.field1165.method1083(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1168[var31 + var33 - 1 - var43] * (long) class68.field1137[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1168[var33 - 1 - var44] * (long) class68.field1137[1][var44] >> 16);
                            }
                            field1168[var33] = var42;
                            this.field1165.method1083(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1157.method1278(0, (float) var30 / 65536.0F);
                    var32 = this.field1157.method1278(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1168[var46] < -32768) {
                field1168[var46] = -32768;
            }
            if (field1168[var46] > 32767) {
                field1168[var46] = 32767;
            }
        }
        return field1168;
    }

    @ObfuscatedName("bn.y(III)I")
    public final int method1297(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1170[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1169[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bn.o(Lfm;)V")
    public final void method1292(class161 arg0) {
        this.field1161 = new class59();
        this.field1161.method1089(arg0);
        this.field1151 = new class59();
        this.field1151.method1089(arg0);
        int var2 = arg0.method2733();
        if (var2 != 0) {
            arg0.field2267--;
            this.field1153 = new class59();
            this.field1153.method1089(arg0);
            this.field1154 = new class59();
            this.field1154.method1089(arg0);
        }
        int var3 = arg0.method2733();
        if (var3 != 0) {
            arg0.field2267--;
            this.field1163 = new class59();
            this.field1163.method1089(arg0);
            this.field1156 = new class59();
            this.field1156.method1089(arg0);
        }
        int var4 = arg0.method2733();
        if (var4 != 0) {
            arg0.field2267--;
            this.field1155 = new class59();
            this.field1155.method1089(arg0);
            this.field1158 = new class59();
            this.field1158.method1089(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2745();
            if (var6 == 0) {
                break;
            }
            this.field1159[var5] = var6;
            this.field1160[var5] = arg0.method2853();
            this.field1174[var5] = arg0.method2745();
        }
        this.field1162 = arg0.method2745();
        this.field1166 = arg0.method2745();
        this.field1175 = arg0.method2735();
        this.field1172 = arg0.method2735();
        this.field1157 = new class68();
        this.field1165 = new class59();
        this.field1157.method1279(arg0, this.field1165);
    }
}
