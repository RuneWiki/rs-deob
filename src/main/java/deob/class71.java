package deob;

import java.util.Random;

@ObfuscatedName("bw")
public class class71 {

    @ObfuscatedName("bw.x")
    public class59 field1187;

    @ObfuscatedName("bw.n")
    public class59 field1165;

    @ObfuscatedName("bw.g")
    public class59 field1167;

    @ObfuscatedName("bw.v")
    public class59 field1168;

    @ObfuscatedName("bw.y")
    public class59 field1166;

    @ObfuscatedName("bw.p")
    public class59 field1170;

    @ObfuscatedName("bw.j")
    public class59 field1188;

    @ObfuscatedName("bw.m")
    public class59 field1171;

    @ObfuscatedName("bw.a")
    public int[] field1173 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bw.i")
    public int[] field1174 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bw.s")
    public int[] field1175 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bw.k")
    public int field1176 = 0;

    @ObfuscatedName("bw.f")
    public int field1177 = 100;

    @ObfuscatedName("bw.o")
    public class68 field1178;

    @ObfuscatedName("bw.q")
    public class59 field1169;

    @ObfuscatedName("bw.c")
    public int field1180 = 500;

    @ObfuscatedName("bw.b")
    public int field1181 = 0;

    @ObfuscatedName("bw.w")
    public static int[] field1182;

    @ObfuscatedName("bw.l")
    public static int[] field1179 = new int[32768];

    @ObfuscatedName("bw.r")
    public static int[] field1184;

    @ObfuscatedName("bw.e")
    public static int[] field1172;

    @ObfuscatedName("bw.h")
    public static int[] field1183;

    @ObfuscatedName("bw.d")
    public static int[] field1186;

    @ObfuscatedName("bw.z")
    public static int[] field1189;

    @ObfuscatedName("bw.t")
    public static int[] field1190;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1179[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1184 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1184[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1182 = new int[220500];
        field1172 = new int[5];
        field1183 = new int[5];
        field1186 = new int[5];
        field1189 = new int[5];
        field1190 = new int[5];
    }

    @ObfuscatedName("bw.x(II)[I")
    public final int[] method1375(int arg0, int arg1) {
        class164.method3001(field1182, 0, arg0);
        if (arg1 < 10) {
            return field1182;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1187.method1159();
        this.field1165.method1159();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1167 != null) {
            this.field1167.method1159();
            this.field1168.method1159();
            var5 = (int) ((double) (this.field1167.field1080 - this.field1167.field1078) * 32.768D / var3);
            var6 = (int) ((double) this.field1167.field1078 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1166 != null) {
            this.field1166.method1159();
            this.field1170.method1159();
            var8 = (int) ((double) (this.field1166.field1080 - this.field1166.field1078) * 32.768D / var3);
            var9 = (int) ((double) this.field1166.field1078 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1173[var11] != 0) {
                field1172[var11] = 0;
                field1183[var11] = (int) ((double) this.field1175[var11] * var3);
                field1186[var11] = (this.field1173[var11] << 14) / 100;
                field1189[var11] = (int) ((double) (this.field1187.field1080 - this.field1187.field1078) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1174[var11]) / var3);
                field1190[var11] = (int) ((double) this.field1187.field1078 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1187.method1174(arg0);
            int var14 = this.field1165.method1174(arg0);
            if (this.field1167 != null) {
                int var15 = this.field1167.method1174(arg0);
                int var16 = this.field1168.method1174(arg0);
                var13 += this.method1376(var7, var16, this.field1167.field1083) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1166 != null) {
                int var17 = this.field1166.method1174(arg0);
                int var18 = this.field1170.method1174(arg0);
                var14 = var14 * ((this.method1376(var10, var18, this.field1166.field1083) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1173[var19] != 0) {
                    int var20 = field1183[var19] + var12;
                    if (var20 < arg0) {
                        field1182[var20] += this.method1376(field1172[var19], field1186[var19] * var14 >> 15, this.field1187.field1083);
                        field1172[var19] += (field1189[var19] * var13 >> 16) + field1190[var19];
                    }
                }
            }
        }
        if (this.field1188 != null) {
            this.field1188.method1159();
            this.field1171.method1159();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1188.method1174(arg0);
                int var26 = this.field1171.method1174(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1188.field1080 - this.field1188.field1078) * var25 >> 8) + this.field1188.field1078;
                } else {
                    var27 = ((this.field1188.field1080 - this.field1188.field1078) * var26 >> 8) + this.field1188.field1078;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1182[var24] = 0;
                }
            }
        }
        if (this.field1176 > 0 && this.field1177 > 0) {
            int var28 = (int) ((double) this.field1176 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1182[var29] += field1182[var29 - var28] * this.field1177 / 100;
            }
        }
        if (this.field1178.field1153[0] > 0 || this.field1178.field1153[1] > 0) {
            this.field1169.method1159();
            int var30 = this.field1169.method1174(arg0 + 1);
            int var31 = this.field1178.method1356(0, (float) var30 / 65536.0F);
            int var32 = this.field1178.method1356(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1182[var31 + var33] * (long) Statics.field1148 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1182[var31 + var33 - 1 - var36] * (long) class68.field1151[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1182[var33 - 1 - var37] * (long) class68.field1151[1][var37] >> 16);
                    }
                    field1182[var33] = var35;
                    var30 = this.field1169.method1174(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1182[var31 + var33] * (long) Statics.field1148 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1182[var31 + var33 - 1 - var40] * (long) class68.field1151[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1182[var33 - 1 - var41] * (long) class68.field1151[1][var41] >> 16);
                        }
                        field1182[var33] = var39;
                        var30 = this.field1169.method1174(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1182[var31 + var33 - 1 - var43] * (long) class68.field1151[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1182[var33 - 1 - var44] * (long) class68.field1151[1][var44] >> 16);
                            }
                            field1182[var33] = var42;
                            this.field1169.method1174(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1178.method1356(0, (float) var30 / 65536.0F);
                    var32 = this.field1178.method1356(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1182[var46] < -32768) {
                field1182[var46] = -32768;
            }
            if (field1182[var46] > 32767) {
                field1182[var46] = 32767;
            }
        }
        return field1182;
    }

    @ObfuscatedName("bw.n(III)I")
    public final int method1376(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1184[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1179[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bw.g(Leq;)V")
    public final void method1377(class154 arg0) {
        this.field1187 = new class59();
        this.field1187.method1160(arg0);
        this.field1165 = new class59();
        this.field1165.method1160(arg0);
        int var2 = arg0.method2878();
        if (var2 != 0) {
            arg0.field2087--;
            this.field1167 = new class59();
            this.field1167.method1160(arg0);
            this.field1168 = new class59();
            this.field1168.method1160(arg0);
        }
        int var3 = arg0.method2878();
        if (var3 != 0) {
            arg0.field2087--;
            this.field1166 = new class59();
            this.field1166.method1160(arg0);
            this.field1170 = new class59();
            this.field1170.method1160(arg0);
        }
        int var4 = arg0.method2878();
        if (var4 != 0) {
            arg0.field2087--;
            this.field1188 = new class59();
            this.field1188.method1160(arg0);
            this.field1171 = new class59();
            this.field1171.method1160(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2854();
            if (var6 == 0) {
                break;
            }
            this.field1173[var5] = var6;
            this.field1174[var5] = arg0.method2843();
            this.field1175[var5] = arg0.method2854();
        }
        this.field1176 = arg0.method2854();
        this.field1177 = arg0.method2854();
        this.field1180 = arg0.method2833();
        this.field1181 = arg0.method2833();
        this.field1178 = new class68();
        this.field1169 = new class59();
        this.field1178.method1352(arg0, this.field1169);
    }
}
