package deob;

import java.util.Random;

@ObfuscatedName("bw")
public class class71 {

    @ObfuscatedName("bw.o")
    public class59 field1155;

    @ObfuscatedName("bw.m")
    public class59 field1157;

    @ObfuscatedName("bw.b")
    public class59 field1171;

    @ObfuscatedName("bw.g")
    public class59 field1153;

    @ObfuscatedName("bw.h")
    public class59 field1156;

    @ObfuscatedName("bw.v")
    public class59 field1164;

    @ObfuscatedName("bw.l")
    public class59 field1158;

    @ObfuscatedName("bw.c")
    public class59 field1159;

    @ObfuscatedName("bw.u")
    public int[] field1160 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bw.k")
    public int[] field1161 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bw.z")
    public int[] field1165 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bw.y")
    public int field1154 = 0;

    @ObfuscatedName("bw.j")
    public int field1163 = 100;

    @ObfuscatedName("bw.f")
    public class68 field1176;

    @ObfuscatedName("bw.p")
    public class59 field1166;

    @ObfuscatedName("bw.i")
    public int field1167 = 500;

    @ObfuscatedName("bw.s")
    public int field1168 = 0;

    @ObfuscatedName("bw.x")
    public static int[] field1162;

    @ObfuscatedName("bw.d")
    public static int[] field1170 = new int[32768];

    @ObfuscatedName("bw.w")
    public static int[] field1169;

    @ObfuscatedName("bw.q")
    public static int[] field1173;

    @ObfuscatedName("bw.t")
    public static int[] field1174;

    @ObfuscatedName("bw.r")
    public static int[] field1175;

    @ObfuscatedName("bw.a")
    public static int[] field1152;

    @ObfuscatedName("bw.e")
    public static int[] field1177;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1170[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1169 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1169[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1162 = new int[220500];
        field1173 = new int[5];
        field1174 = new int[5];
        field1175 = new int[5];
        field1152 = new int[5];
        field1177 = new int[5];
    }

    @ObfuscatedName("bw.o(II)[I")
    public final int[] method1268(int arg0, int arg1) {
        class164.method2839(field1162, 0, arg0);
        if (arg1 < 10) {
            return field1162;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1155.method1064();
        this.field1157.method1064();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1171 != null) {
            this.field1171.method1064();
            this.field1153.method1064();
            var5 = (int) ((double) (this.field1171.field1068 - this.field1171.field1067) * 32.768D / var3);
            var6 = (int) ((double) this.field1171.field1067 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1156 != null) {
            this.field1156.method1064();
            this.field1164.method1064();
            var8 = (int) ((double) (this.field1156.field1068 - this.field1156.field1067) * 32.768D / var3);
            var9 = (int) ((double) this.field1156.field1067 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1160[var11] != 0) {
                field1173[var11] = 0;
                field1174[var11] = (int) ((double) this.field1165[var11] * var3);
                field1175[var11] = (this.field1160[var11] << 14) / 100;
                field1152[var11] = (int) ((double) (this.field1155.field1068 - this.field1155.field1067) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1161[var11]) / var3);
                field1177[var11] = (int) ((double) this.field1155.field1067 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1155.method1063(arg0);
            int var14 = this.field1157.method1063(arg0);
            if (this.field1171 != null) {
                int var15 = this.field1171.method1063(arg0);
                int var16 = this.field1153.method1063(arg0);
                var13 += this.method1269(var7, var16, this.field1171.field1064) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1156 != null) {
                int var17 = this.field1156.method1063(arg0);
                int var18 = this.field1164.method1063(arg0);
                var14 = var14 * ((this.method1269(var10, var18, this.field1156.field1064) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1160[var19] != 0) {
                    int var20 = field1174[var19] + var12;
                    if (var20 < arg0) {
                        field1162[var20] += this.method1269(field1173[var19], field1175[var19] * var14 >> 15, this.field1155.field1064);
                        field1173[var19] += (field1152[var19] * var13 >> 16) + field1177[var19];
                    }
                }
            }
        }
        if (this.field1158 != null) {
            this.field1158.method1064();
            this.field1159.method1064();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1158.method1063(arg0);
                int var26 = this.field1159.method1063(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1158.field1068 - this.field1158.field1067) * var25 >> 8) + this.field1158.field1067;
                } else {
                    var27 = ((this.field1158.field1068 - this.field1158.field1067) * var26 >> 8) + this.field1158.field1067;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1162[var24] = 0;
                }
            }
        }
        if (this.field1154 > 0 && this.field1163 > 0) {
            int var28 = (int) ((double) this.field1154 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1162[var29] += field1162[var29 - var28] * this.field1163 / 100;
            }
        }
        if (this.field1176.field1142[0] > 0 || this.field1176.field1142[1] > 0) {
            this.field1166.method1064();
            int var30 = this.field1166.method1063(arg0 + 1);
            int var31 = this.field1176.method1248(0, (float) var30 / 65536.0F);
            int var32 = this.field1176.method1248(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1162[var31 + var33] * (long) Statics.field1141 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1162[var31 + var33 - 1 - var36] * (long) class68.field1138[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1162[var33 - 1 - var37] * (long) class68.field1138[1][var37] >> 16);
                    }
                    field1162[var33] = var35;
                    var30 = this.field1166.method1063(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1162[var31 + var33] * (long) Statics.field1141 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1162[var31 + var33 - 1 - var40] * (long) class68.field1138[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1162[var33 - 1 - var41] * (long) class68.field1138[1][var41] >> 16);
                        }
                        field1162[var33] = var39;
                        var30 = this.field1166.method1063(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1162[var31 + var33 - 1 - var43] * (long) class68.field1138[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1162[var33 - 1 - var44] * (long) class68.field1138[1][var44] >> 16);
                            }
                            field1162[var33] = var42;
                            this.field1166.method1063(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1176.method1248(0, (float) var30 / 65536.0F);
                    var32 = this.field1176.method1248(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1162[var46] < -32768) {
                field1162[var46] = -32768;
            }
            if (field1162[var46] > 32767) {
                field1162[var46] = 32767;
            }
        }
        return field1162;
    }

    @ObfuscatedName("bw.m(III)I")
    public final int method1269(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1169[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1170[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bw.b(Lez;)V")
    public final void method1270(class154 arg0) {
        this.field1155 = new class59();
        this.field1155.method1060(arg0);
        this.field1157 = new class59();
        this.field1157.method1060(arg0);
        int var2 = arg0.method2552();
        if (var2 != 0) {
            arg0.field2105--;
            this.field1171 = new class59();
            this.field1171.method1060(arg0);
            this.field1153 = new class59();
            this.field1153.method1060(arg0);
        }
        int var3 = arg0.method2552();
        if (var3 != 0) {
            arg0.field2105--;
            this.field1156 = new class59();
            this.field1156.method1060(arg0);
            this.field1164 = new class59();
            this.field1164.method1060(arg0);
        }
        int var4 = arg0.method2552();
        if (var4 != 0) {
            arg0.field2105--;
            this.field1158 = new class59();
            this.field1158.method1060(arg0);
            this.field1159 = new class59();
            this.field1159.method1060(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2668();
            if (var6 == 0) {
                break;
            }
            this.field1160[var5] = var6;
            this.field1161[var5] = arg0.method2564();
            this.field1165[var5] = arg0.method2668();
        }
        this.field1154 = arg0.method2668();
        this.field1163 = arg0.method2668();
        this.field1167 = arg0.method2554();
        this.field1168 = arg0.method2554();
        this.field1176 = new class68();
        this.field1166 = new class59();
        this.field1176.method1251(arg0, this.field1166);
    }
}
