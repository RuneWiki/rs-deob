package deob;

import java.util.Random;

@ObfuscatedName("bj")
public class class71 {

    @ObfuscatedName("bj.i")
    public class59 field1168;

    @ObfuscatedName("bj.e")
    public class59 field1155;

    @ObfuscatedName("bj.f")
    public class59 field1156;

    @ObfuscatedName("bj.k")
    public class59 field1157;

    @ObfuscatedName("bj.g")
    public class59 field1158;

    @ObfuscatedName("bj.n")
    public class59 field1159;

    @ObfuscatedName("bj.a")
    public class59 field1154;

    @ObfuscatedName("bj.q")
    public class59 field1161;

    @ObfuscatedName("bj.w")
    public int[] field1162 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bj.v")
    public int[] field1163 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bj.h")
    public int[] field1164 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bj.p")
    public int field1165 = 0;

    @ObfuscatedName("bj.l")
    public int field1166 = 100;

    @ObfuscatedName("bj.c")
    public class68 field1170;

    @ObfuscatedName("bj.m")
    public class59 field1171;

    @ObfuscatedName("bj.r")
    public int field1160 = 500;

    @ObfuscatedName("bj.u")
    public int field1167 = 0;

    @ObfuscatedName("bj.j")
    public static int[] field1175;

    @ObfuscatedName("bj.x")
    public static int[] field1172 = new int[32768];

    @ObfuscatedName("bj.d")
    public static int[] field1173;

    @ObfuscatedName("bj.s")
    public static int[] field1176;

    @ObfuscatedName("bj.t")
    public static int[] field1169;

    @ObfuscatedName("bj.z")
    public static int[] field1177;

    @ObfuscatedName("bj.b")
    public static int[] field1178;

    @ObfuscatedName("bj.o")
    public static int[] field1179;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1172[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1173 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1173[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1175 = new int[220500];
        field1176 = new int[5];
        field1169 = new int[5];
        field1177 = new int[5];
        field1178 = new int[5];
        field1179 = new int[5];
    }

    @ObfuscatedName("bj.i(II)[I")
    public final int[] method1268(int arg0, int arg1) {
        class164.method2823(field1175, 0, arg0);
        if (arg1 < 10) {
            return field1175;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1168.method1063();
        this.field1155.method1063();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1156 != null) {
            this.field1156.method1063();
            this.field1157.method1063();
            var5 = (int) ((double) (this.field1156.field1072 - this.field1156.field1071) * 32.768D / var3);
            var6 = (int) ((double) this.field1156.field1071 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1158 != null) {
            this.field1158.method1063();
            this.field1159.method1063();
            var8 = (int) ((double) (this.field1158.field1072 - this.field1158.field1071) * 32.768D / var3);
            var9 = (int) ((double) this.field1158.field1071 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1162[var11] != 0) {
                field1176[var11] = 0;
                field1169[var11] = (int) ((double) this.field1164[var11] * var3);
                field1177[var11] = (this.field1162[var11] << 14) / 100;
                field1178[var11] = (int) ((double) (this.field1168.field1072 - this.field1168.field1071) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1163[var11]) / var3);
                field1179[var11] = (int) ((double) this.field1168.field1071 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1168.method1058(arg0);
            int var14 = this.field1155.method1058(arg0);
            if (this.field1156 != null) {
                int var15 = this.field1156.method1058(arg0);
                int var16 = this.field1157.method1058(arg0);
                var13 += this.method1269(var7, var16, this.field1156.field1077) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1158 != null) {
                int var17 = this.field1158.method1058(arg0);
                int var18 = this.field1159.method1058(arg0);
                var14 = var14 * ((this.method1269(var10, var18, this.field1158.field1077) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1162[var19] != 0) {
                    int var20 = field1169[var19] + var12;
                    if (var20 < arg0) {
                        field1175[var20] += this.method1269(field1176[var19], field1177[var19] * var14 >> 15, this.field1168.field1077);
                        field1176[var19] += (field1178[var19] * var13 >> 16) + field1179[var19];
                    }
                }
            }
        }
        if (this.field1154 != null) {
            this.field1154.method1063();
            this.field1161.method1063();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1154.method1058(arg0);
                int var26 = this.field1161.method1058(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1154.field1072 - this.field1154.field1071) * var25 >> 8) + this.field1154.field1071;
                } else {
                    var27 = ((this.field1154.field1072 - this.field1154.field1071) * var26 >> 8) + this.field1154.field1071;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1175[var24] = 0;
                }
            }
        }
        if (this.field1165 > 0 && this.field1166 > 0) {
            int var28 = (int) ((double) this.field1165 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1175[var29] += field1175[var29 - var28] * this.field1166 / 100;
            }
        }
        if (this.field1170.field1142[0] > 0 || this.field1170.field1142[1] > 0) {
            this.field1171.method1063();
            int var30 = this.field1171.method1058(arg0 + 1);
            int var31 = this.field1170.method1251(0, (float) var30 / 65536.0F);
            int var32 = this.field1170.method1251(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1175[var31 + var33] * (long) Statics.field1135 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1175[var31 + var33 - 1 - var36] * (long) class68.field1140[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1175[var33 - 1 - var37] * (long) class68.field1140[1][var37] >> 16);
                    }
                    field1175[var33] = var35;
                    var30 = this.field1171.method1058(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1175[var31 + var33] * (long) Statics.field1135 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1175[var31 + var33 - 1 - var40] * (long) class68.field1140[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1175[var33 - 1 - var41] * (long) class68.field1140[1][var41] >> 16);
                        }
                        field1175[var33] = var39;
                        var30 = this.field1171.method1058(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1175[var31 + var33 - 1 - var43] * (long) class68.field1140[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1175[var33 - 1 - var44] * (long) class68.field1140[1][var44] >> 16);
                            }
                            field1175[var33] = var42;
                            this.field1171.method1058(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1170.method1251(0, (float) var30 / 65536.0F);
                    var32 = this.field1170.method1251(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1175[var46] < -32768) {
                field1175[var46] = -32768;
            }
            if (field1175[var46] > 32767) {
                field1175[var46] = 32767;
            }
        }
        return field1175;
    }

    @ObfuscatedName("bj.e(III)I")
    public final int method1269(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1173[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1172[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bj.f(Let;)V")
    public final void method1270(class154 arg0) {
        this.field1168 = new class59();
        this.field1168.method1055(arg0);
        this.field1155 = new class59();
        this.field1155.method1055(arg0);
        int var2 = arg0.method2573();
        if (var2 != 0) {
            arg0.field2091--;
            this.field1156 = new class59();
            this.field1156.method1055(arg0);
            this.field1157 = new class59();
            this.field1157.method1055(arg0);
        }
        int var3 = arg0.method2573();
        if (var3 != 0) {
            arg0.field2091--;
            this.field1158 = new class59();
            this.field1158.method1055(arg0);
            this.field1159 = new class59();
            this.field1159.method1055(arg0);
        }
        int var4 = arg0.method2573();
        if (var4 != 0) {
            arg0.field2091--;
            this.field1154 = new class59();
            this.field1154.method1055(arg0);
            this.field1161 = new class59();
            this.field1161.method1055(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2586();
            if (var6 == 0) {
                break;
            }
            this.field1162[var5] = var6;
            this.field1163[var5] = arg0.method2671();
            this.field1164[var5] = arg0.method2586();
        }
        this.field1165 = arg0.method2586();
        this.field1166 = arg0.method2586();
        this.field1160 = arg0.method2575();
        this.field1167 = arg0.method2575();
        this.field1170 = new class68();
        this.field1171 = new class59();
        this.field1170.method1252(arg0, this.field1171);
    }
}
