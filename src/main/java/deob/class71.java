package deob;

import java.util.Random;

@ObfuscatedName("bs")
public class class71 {

    @ObfuscatedName("bs.x")
    public class59 field1159;

    @ObfuscatedName("bs.j")
    public class59 field1156;

    @ObfuscatedName("bs.c")
    public class59 field1158;

    @ObfuscatedName("bs.d")
    public class59 field1157;

    @ObfuscatedName("bs.w")
    public class59 field1160;

    @ObfuscatedName("bs.h")
    public class59 field1171;

    @ObfuscatedName("bs.u")
    public class59 field1162;

    @ObfuscatedName("bs.k")
    public class59 field1176;

    @ObfuscatedName("bs.g")
    public int[] field1164 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bs.y")
    public int[] field1165 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bs.e")
    public int[] field1166 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bs.q")
    public int field1167 = 0;

    @ObfuscatedName("bs.v")
    public int field1168 = 100;

    @ObfuscatedName("bs.l")
    public class68 field1169;

    @ObfuscatedName("bs.s")
    public class59 field1170;

    @ObfuscatedName("bs.r")
    public int field1174 = 500;

    @ObfuscatedName("bs.m")
    public int field1172 = 0;

    @ObfuscatedName("bs.i")
    public static int[] field1161;

    @ObfuscatedName("bs.f")
    public static int[] field1173 = new int[32768];

    @ObfuscatedName("bs.b")
    public static int[] field1175;

    @ObfuscatedName("bs.z")
    public static int[] field1177;

    @ObfuscatedName("bs.p")
    public static int[] field1178;

    @ObfuscatedName("bs.n")
    public static int[] field1179;

    @ObfuscatedName("bs.a")
    public static int[] field1180;

    @ObfuscatedName("bs.o")
    public static int[] field1181;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1173[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1175 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1175[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1161 = new int[220500];
        field1177 = new int[5];
        field1178 = new int[5];
        field1179 = new int[5];
        field1180 = new int[5];
        field1181 = new int[5];
    }

    @ObfuscatedName("bs.x(II)[I")
    public final int[] method1349(int arg0, int arg1) {
        class164.method2932(field1161, 0, arg0);
        if (arg1 < 10) {
            return field1161;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1159.method1159();
        this.field1156.method1159();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1158 != null) {
            this.field1158.method1159();
            this.field1157.method1159();
            var5 = (int) ((double) (this.field1158.field1072 - this.field1158.field1076) * 32.768D / var3);
            var6 = (int) ((double) this.field1158.field1076 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1160 != null) {
            this.field1160.method1159();
            this.field1171.method1159();
            var8 = (int) ((double) (this.field1160.field1072 - this.field1160.field1076) * 32.768D / var3);
            var9 = (int) ((double) this.field1160.field1076 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1164[var11] != 0) {
                field1177[var11] = 0;
                field1178[var11] = (int) ((double) this.field1166[var11] * var3);
                field1179[var11] = (this.field1164[var11] << 14) / 100;
                field1180[var11] = (int) ((double) (this.field1159.field1072 - this.field1159.field1076) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1165[var11]) / var3);
                field1181[var11] = (int) ((double) this.field1159.field1076 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1159.method1154(arg0);
            int var14 = this.field1156.method1154(arg0);
            if (this.field1158 != null) {
                int var15 = this.field1158.method1154(arg0);
                int var16 = this.field1157.method1154(arg0);
                var13 += this.method1358(var7, var16, this.field1158.field1079) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1160 != null) {
                int var17 = this.field1160.method1154(arg0);
                int var18 = this.field1171.method1154(arg0);
                var14 = var14 * ((this.method1358(var10, var18, this.field1160.field1079) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1164[var19] != 0) {
                    int var20 = field1178[var19] + var12;
                    if (var20 < arg0) {
                        field1161[var20] += this.method1358(field1177[var19], field1179[var19] * var14 >> 15, this.field1159.field1079);
                        field1177[var19] += (field1180[var19] * var13 >> 16) + field1181[var19];
                    }
                }
            }
        }
        if (this.field1162 != null) {
            this.field1162.method1159();
            this.field1176.method1159();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1162.method1154(arg0);
                int var26 = this.field1176.method1154(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1162.field1072 - this.field1162.field1076) * var25 >> 8) + this.field1162.field1076;
                } else {
                    var27 = ((this.field1162.field1072 - this.field1162.field1076) * var26 >> 8) + this.field1162.field1076;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1161[var24] = 0;
                }
            }
        }
        if (this.field1167 > 0 && this.field1168 > 0) {
            int var28 = (int) ((double) this.field1167 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1161[var29] += field1161[var29 - var28] * this.field1168 / 100;
            }
        }
        if (this.field1169.field1140[0] > 0 || this.field1169.field1140[1] > 0) {
            this.field1170.method1159();
            int var30 = this.field1170.method1154(arg0 + 1);
            int var31 = this.field1169.method1335(0, (float) var30 / 65536.0F);
            int var32 = this.field1169.method1335(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1161[var31 + var33] * (long) Statics.field1144 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1161[var31 + var33 - 1 - var36] * (long) class68.field1142[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1161[var33 - 1 - var37] * (long) class68.field1142[1][var37] >> 16);
                    }
                    field1161[var33] = var35;
                    var30 = this.field1170.method1154(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1161[var31 + var33] * (long) Statics.field1144 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1161[var31 + var33 - 1 - var40] * (long) class68.field1142[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1161[var33 - 1 - var41] * (long) class68.field1142[1][var41] >> 16);
                        }
                        field1161[var33] = var39;
                        var30 = this.field1170.method1154(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1161[var31 + var33 - 1 - var43] * (long) class68.field1142[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1161[var33 - 1 - var44] * (long) class68.field1142[1][var44] >> 16);
                            }
                            field1161[var33] = var42;
                            this.field1170.method1154(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1169.method1335(0, (float) var30 / 65536.0F);
                    var32 = this.field1169.method1335(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1161[var46] < -32768) {
                field1161[var46] = -32768;
            }
            if (field1161[var46] > 32767) {
                field1161[var46] = 32767;
            }
        }
        return field1161;
    }

    @ObfuscatedName("bs.j(III)I")
    public final int method1358(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1175[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1173[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bs.c(Lek;)V")
    public final void method1352(class154 arg0) {
        this.field1159 = new class59();
        this.field1159.method1156(arg0);
        this.field1156 = new class59();
        this.field1156.method1156(arg0);
        int var2 = arg0.method2701();
        if (var2 != 0) {
            arg0.field2086--;
            this.field1158 = new class59();
            this.field1158.method1156(arg0);
            this.field1157 = new class59();
            this.field1157.method1156(arg0);
        }
        int var3 = arg0.method2701();
        if (var3 != 0) {
            arg0.field2086--;
            this.field1160 = new class59();
            this.field1160.method1156(arg0);
            this.field1171 = new class59();
            this.field1171.method1156(arg0);
        }
        int var4 = arg0.method2701();
        if (var4 != 0) {
            arg0.field2086--;
            this.field1162 = new class59();
            this.field1162.method1156(arg0);
            this.field1176 = new class59();
            this.field1176.method1156(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2821();
            if (var6 == 0) {
                break;
            }
            this.field1164[var5] = var6;
            this.field1165[var5] = arg0.method2700();
            this.field1166[var5] = arg0.method2821();
        }
        this.field1167 = arg0.method2821();
        this.field1168 = arg0.method2821();
        this.field1174 = arg0.method2745();
        this.field1172 = arg0.method2745();
        this.field1169 = new class68();
        this.field1170 = new class59();
        this.field1169.method1337(arg0, this.field1170);
    }
}
