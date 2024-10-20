package deob;

import java.util.Random;

@ObfuscatedName("ba")
public class class71 {

    @ObfuscatedName("ba.q")
    public class59 field1183;

    @ObfuscatedName("ba.d")
    public class59 field1166;

    @ObfuscatedName("ba.h")
    public class59 field1167;

    @ObfuscatedName("ba.p")
    public class59 field1178;

    @ObfuscatedName("ba.j")
    public class59 field1187;

    @ObfuscatedName("ba.n")
    public class59 field1170;

    @ObfuscatedName("ba.r")
    public class59 field1171;

    @ObfuscatedName("ba.c")
    public class59 field1175;

    @ObfuscatedName("ba.i")
    public int[] field1173 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("ba.o")
    public int[] field1174 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("ba.m")
    public int[] field1168 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("ba.s")
    public int field1176 = 0;

    @ObfuscatedName("ba.u")
    public int field1177 = 100;

    @ObfuscatedName("ba.b")
    public class68 field1186;

    @ObfuscatedName("ba.v")
    public class59 field1179;

    @ObfuscatedName("ba.f")
    public int field1180 = 500;

    @ObfuscatedName("ba.z")
    public int field1172 = 0;

    @ObfuscatedName("ba.t")
    public static int[] field1165;

    @ObfuscatedName("ba.y")
    public static int[] field1182 = new int[32768];

    @ObfuscatedName("ba.w")
    public static int[] field1184;

    @ObfuscatedName("ba.k")
    public static int[] field1181;

    @ObfuscatedName("ba.l")
    public static int[] field1169;

    @ObfuscatedName("ba.x")
    public static int[] field1188;

    @ObfuscatedName("ba.g")
    public static int[] field1189;

    @ObfuscatedName("ba.e")
    public static int[] field1190;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1182[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1184 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1184[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1165 = new int[220500];
        field1181 = new int[5];
        field1169 = new int[5];
        field1188 = new int[5];
        field1189 = new int[5];
        field1190 = new int[5];
    }

    @ObfuscatedName("ba.q(II)[I")
    public final int[] method1355(int arg0, int arg1) {
        class164.method2977(field1165, 0, arg0);
        if (arg1 < 10) {
            return field1165;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1183.method1146();
        this.field1166.method1146();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1167 != null) {
            this.field1167.method1146();
            this.field1178.method1146();
            var5 = (int) ((double) (this.field1167.field1088 - this.field1167.field1087) * 32.768D / var3);
            var6 = (int) ((double) this.field1167.field1087 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1187 != null) {
            this.field1187.method1146();
            this.field1170.method1146();
            var8 = (int) ((double) (this.field1187.field1088 - this.field1187.field1087) * 32.768D / var3);
            var9 = (int) ((double) this.field1187.field1087 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1173[var11] != 0) {
                field1181[var11] = 0;
                field1169[var11] = (int) ((double) this.field1168[var11] * var3);
                field1188[var11] = (this.field1173[var11] << 14) / 100;
                field1189[var11] = (int) ((double) (this.field1183.field1088 - this.field1183.field1087) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1174[var11]) / var3);
                field1190[var11] = (int) ((double) this.field1183.field1087 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1183.method1147(arg0);
            int var14 = this.field1166.method1147(arg0);
            if (this.field1167 != null) {
                int var15 = this.field1167.method1147(arg0);
                int var16 = this.field1178.method1147(arg0);
                var13 += this.method1363(var7, var16, this.field1167.field1089) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1187 != null) {
                int var17 = this.field1187.method1147(arg0);
                int var18 = this.field1170.method1147(arg0);
                var14 = var14 * ((this.method1363(var10, var18, this.field1187.field1089) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1173[var19] != 0) {
                    int var20 = field1169[var19] + var12;
                    if (var20 < arg0) {
                        field1165[var20] += this.method1363(field1181[var19], field1188[var19] * var14 >> 15, this.field1183.field1089);
                        field1181[var19] += (field1189[var19] * var13 >> 16) + field1190[var19];
                    }
                }
            }
        }
        if (this.field1171 != null) {
            this.field1171.method1146();
            this.field1175.method1146();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1171.method1147(arg0);
                int var26 = this.field1175.method1147(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1171.field1088 - this.field1171.field1087) * var25 >> 8) + this.field1171.field1087;
                } else {
                    var27 = ((this.field1171.field1088 - this.field1171.field1087) * var26 >> 8) + this.field1171.field1087;
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
        if (this.field1176 > 0 && this.field1177 > 0) {
            int var28 = (int) ((double) this.field1176 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1165[var29] += field1165[var29 - var28] * this.field1177 / 100;
            }
        }
        if (this.field1186.field1154[0] > 0 || this.field1186.field1154[1] > 0) {
            this.field1179.method1146();
            int var30 = this.field1179.method1147(arg0 + 1);
            int var31 = this.field1186.method1335(0, (float) var30 / 65536.0F);
            int var32 = this.field1186.method1335(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1165[var31 + var33] * (long) Statics.field1149 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1165[var31 + var33 - 1 - var36] * (long) class68.field1146[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1165[var33 - 1 - var37] * (long) class68.field1146[1][var37] >> 16);
                    }
                    field1165[var33] = var35;
                    var30 = this.field1179.method1147(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1165[var31 + var33] * (long) Statics.field1149 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1165[var31 + var33 - 1 - var40] * (long) class68.field1146[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1165[var33 - 1 - var41] * (long) class68.field1146[1][var41] >> 16);
                        }
                        field1165[var33] = var39;
                        var30 = this.field1179.method1147(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1165[var31 + var33 - 1 - var43] * (long) class68.field1146[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1165[var33 - 1 - var44] * (long) class68.field1146[1][var44] >> 16);
                            }
                            field1165[var33] = var42;
                            this.field1179.method1147(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1186.method1335(0, (float) var30 / 65536.0F);
                    var32 = this.field1186.method1335(1, (float) var30 / 65536.0F);
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

    @ObfuscatedName("ba.d(III)I")
    public final int method1363(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1184[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1182[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ba.h(Lel;)V")
    public final void method1357(class154 arg0) {
        this.field1183 = new class59();
        this.field1183.method1144(arg0);
        this.field1166 = new class59();
        this.field1166.method1144(arg0);
        int var2 = arg0.method2666();
        if (var2 != 0) {
            arg0.field2091--;
            this.field1167 = new class59();
            this.field1167.method1144(arg0);
            this.field1178 = new class59();
            this.field1178.method1144(arg0);
        }
        int var3 = arg0.method2666();
        if (var3 != 0) {
            arg0.field2091--;
            this.field1187 = new class59();
            this.field1187.method1144(arg0);
            this.field1170 = new class59();
            this.field1170.method1144(arg0);
        }
        int var4 = arg0.method2666();
        if (var4 != 0) {
            arg0.field2091--;
            this.field1171 = new class59();
            this.field1171.method1144(arg0);
            this.field1175 = new class59();
            this.field1175.method1144(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2679();
            if (var6 == 0) {
                break;
            }
            this.field1173[var5] = var6;
            this.field1174[var5] = arg0.method2678();
            this.field1168[var5] = arg0.method2679();
        }
        this.field1176 = arg0.method2679();
        this.field1177 = arg0.method2679();
        this.field1180 = arg0.method2668();
        this.field1172 = arg0.method2668();
        this.field1186 = new class68();
        this.field1179 = new class59();
        this.field1186.method1331(arg0, this.field1179);
    }
}
