package deob;

import java.util.Random;

@ObfuscatedName("bs")
public class class71 {

    @ObfuscatedName("bs.b")
    public class59 field1183;

    @ObfuscatedName("bs.e")
    public class59 field1161;

    @ObfuscatedName("bs.c")
    public class59 field1176;

    @ObfuscatedName("bs.l")
    public class59 field1160;

    @ObfuscatedName("bs.y")
    public class59 field1164;

    @ObfuscatedName("bs.j")
    public class59 field1165;

    @ObfuscatedName("bs.g")
    public class59 field1166;

    @ObfuscatedName("bs.s")
    public class59 field1167;

    @ObfuscatedName("bs.r")
    public int[] field1178 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bs.t")
    public int[] field1169 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bs.k")
    public int[] field1170 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bs.f")
    public int field1171 = 0;

    @ObfuscatedName("bs.a")
    public int field1174 = 100;

    @ObfuscatedName("bs.v")
    public class68 field1173;

    @ObfuscatedName("bs.d")
    public class59 field1175;

    @ObfuscatedName("bs.o")
    public int field1181 = 500;

    @ObfuscatedName("bs.q")
    public int field1172 = 0;

    @ObfuscatedName("bs.i")
    public static int[] field1177;

    @ObfuscatedName("bs.x")
    public static int[] field1180 = new int[32768];

    @ObfuscatedName("bs.z")
    public static int[] field1179;

    @ObfuscatedName("bs.w")
    public static int[] field1162;

    @ObfuscatedName("bs.h")
    public static int[] field1182;

    @ObfuscatedName("bs.u")
    public static int[] field1185;

    @ObfuscatedName("bs.m")
    public static int[] field1184;

    @ObfuscatedName("bs.p")
    public static int[] field1163;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1180[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1179 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1179[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1177 = new int[220500];
        field1162 = new int[5];
        field1182 = new int[5];
        field1185 = new int[5];
        field1184 = new int[5];
        field1163 = new int[5];
    }

    @ObfuscatedName("bs.b(II)[I")
    public final int[] method1320(int arg0, int arg1) {
        class164.method2961(field1177, 0, arg0);
        if (arg1 < 10) {
            return field1177;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1183.method1102();
        this.field1161.method1102();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1176 != null) {
            this.field1176.method1102();
            this.field1160.method1102();
            var5 = (int) ((double) (this.field1176.field1077 - this.field1176.field1076) * 32.768D / var3);
            var6 = (int) ((double) this.field1176.field1076 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1164 != null) {
            this.field1164.method1102();
            this.field1165.method1102();
            var8 = (int) ((double) (this.field1164.field1077 - this.field1164.field1076) * 32.768D / var3);
            var9 = (int) ((double) this.field1164.field1076 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1178[var11] != 0) {
                field1162[var11] = 0;
                field1182[var11] = (int) ((double) this.field1170[var11] * var3);
                field1185[var11] = (this.field1178[var11] << 14) / 100;
                field1184[var11] = (int) ((double) (this.field1183.field1077 - this.field1183.field1076) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1169[var11]) / var3);
                field1163[var11] = (int) ((double) this.field1183.field1076 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1183.method1099(arg0);
            int var14 = this.field1161.method1099(arg0);
            if (this.field1176 != null) {
                int var15 = this.field1176.method1099(arg0);
                int var16 = this.field1160.method1099(arg0);
                var13 += this.method1323(var7, var16, this.field1176.field1078) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1164 != null) {
                int var17 = this.field1164.method1099(arg0);
                int var18 = this.field1165.method1099(arg0);
                var14 = var14 * ((this.method1323(var10, var18, this.field1164.field1078) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1178[var19] != 0) {
                    int var20 = field1182[var19] + var12;
                    if (var20 < arg0) {
                        field1177[var20] += this.method1323(field1162[var19], field1185[var19] * var14 >> 15, this.field1183.field1078);
                        field1162[var19] += (field1184[var19] * var13 >> 16) + field1163[var19];
                    }
                }
            }
        }
        if (this.field1166 != null) {
            this.field1166.method1102();
            this.field1167.method1102();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1166.method1099(arg0);
                int var26 = this.field1167.method1099(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1166.field1077 - this.field1166.field1076) * var25 >> 8) + this.field1166.field1076;
                } else {
                    var27 = ((this.field1166.field1077 - this.field1166.field1076) * var26 >> 8) + this.field1166.field1076;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1177[var24] = 0;
                }
            }
        }
        if (this.field1171 > 0 && this.field1174 > 0) {
            int var28 = (int) ((double) this.field1171 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1177[var29] += field1177[var29 - var28] * this.field1174 / 100;
            }
        }
        if (this.field1173.field1147[0] > 0 || this.field1173.field1147[1] > 0) {
            this.field1175.method1102();
            int var30 = this.field1175.method1099(arg0 + 1);
            int var31 = this.field1173.method1304(0, (float) var30 / 65536.0F);
            int var32 = this.field1173.method1304(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1177[var31 + var33] * (long) Statics.field1148 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1177[var31 + var33 - 1 - var36] * (long) class68.field1142[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1177[var33 - 1 - var37] * (long) class68.field1142[1][var37] >> 16);
                    }
                    field1177[var33] = var35;
                    var30 = this.field1175.method1099(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1177[var31 + var33] * (long) Statics.field1148 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1177[var31 + var33 - 1 - var40] * (long) class68.field1142[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1177[var33 - 1 - var41] * (long) class68.field1142[1][var41] >> 16);
                        }
                        field1177[var33] = var39;
                        var30 = this.field1175.method1099(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1177[var31 + var33 - 1 - var43] * (long) class68.field1142[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1177[var33 - 1 - var44] * (long) class68.field1142[1][var44] >> 16);
                            }
                            field1177[var33] = var42;
                            this.field1175.method1099(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1173.method1304(0, (float) var30 / 65536.0F);
                    var32 = this.field1173.method1304(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1177[var46] < -32768) {
                field1177[var46] = -32768;
            }
            if (field1177[var46] > 32767) {
                field1177[var46] = 32767;
            }
        }
        return field1177;
    }

    @ObfuscatedName("bs.e(III)I")
    public final int method1323(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1179[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1180[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bs.c(Lec;)V")
    public final void method1321(class154 arg0) {
        this.field1183 = new class59();
        this.field1183.method1100(arg0);
        this.field1161 = new class59();
        this.field1161.method1100(arg0);
        int var2 = arg0.method2669();
        if (var2 != 0) {
            arg0.field2079--;
            this.field1176 = new class59();
            this.field1176.method1100(arg0);
            this.field1160 = new class59();
            this.field1160.method1100(arg0);
        }
        int var3 = arg0.method2669();
        if (var3 != 0) {
            arg0.field2079--;
            this.field1164 = new class59();
            this.field1164.method1100(arg0);
            this.field1165 = new class59();
            this.field1165.method1100(arg0);
        }
        int var4 = arg0.method2669();
        if (var4 != 0) {
            arg0.field2079--;
            this.field1166 = new class59();
            this.field1166.method1100(arg0);
            this.field1167 = new class59();
            this.field1167.method1100(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2682();
            if (var6 == 0) {
                break;
            }
            this.field1178[var5] = var6;
            this.field1169[var5] = arg0.method2819();
            this.field1170[var5] = arg0.method2682();
        }
        this.field1171 = arg0.method2682();
        this.field1174 = arg0.method2682();
        this.field1181 = arg0.method2671();
        this.field1172 = arg0.method2671();
        this.field1173 = new class68();
        this.field1175 = new class59();
        this.field1173.method1312(arg0, this.field1175);
    }
}
