package deob;

import java.util.Random;

@ObfuscatedName("bs")
public class class71 {

    @ObfuscatedName("bs.d")
    public class59 field1139;

    @ObfuscatedName("bs.c")
    public class59 field1132;

    @ObfuscatedName("bs.n")
    public class59 field1140;

    @ObfuscatedName("bs.q")
    public class59 field1144;

    @ObfuscatedName("bs.t")
    public class59 field1135;

    @ObfuscatedName("bs.p")
    public class59 field1136;

    @ObfuscatedName("bs.u")
    public class59 field1137;

    @ObfuscatedName("bs.z")
    public class59 field1138;

    @ObfuscatedName("bs.l")
    public int[] field1131 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bs.v")
    public int[] field1147 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bs.g")
    public int[] field1141 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bs.w")
    public int field1142 = 0;

    @ObfuscatedName("bs.r")
    public int field1143 = 100;

    @ObfuscatedName("bs.s")
    public class68 field1148;

    @ObfuscatedName("bs.k")
    public class59 field1145;

    @ObfuscatedName("bs.e")
    public int field1146 = 500;

    @ObfuscatedName("bs.j")
    public int field1134 = 0;

    @ObfuscatedName("bs.i")
    public static int[] field1156;

    @ObfuscatedName("bs.a")
    public static int[] field1150 = new int[32768];

    @ObfuscatedName("bs.x")
    public static int[] field1152;

    @ObfuscatedName("bs.b")
    public static int[] field1151;

    @ObfuscatedName("bs.f")
    public static int[] field1153;

    @ObfuscatedName("bs.o")
    public static int[] field1154;

    @ObfuscatedName("bs.m")
    public static int[] field1155;

    @ObfuscatedName("bs.y")
    public static int[] field1133;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1150[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1152 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1152[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1156 = new int[220500];
        field1151 = new int[5];
        field1153 = new int[5];
        field1154 = new int[5];
        field1155 = new int[5];
        field1133 = new int[5];
    }

    @ObfuscatedName("bs.d(II)[I")
    public final int[] method1300(int arg0, int arg1) {
        class140.method2515(field1156, 0, arg0);
        if (arg1 < 10) {
            return field1156;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1139.method1094();
        this.field1132.method1094();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1140 != null) {
            this.field1140.method1094();
            this.field1144.method1094();
            var5 = (int) ((double) (this.field1140.field1055 - this.field1140.field1054) * 32.768D / var3);
            var6 = (int) ((double) this.field1140.field1054 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1135 != null) {
            this.field1135.method1094();
            this.field1136.method1094();
            var8 = (int) ((double) (this.field1135.field1055 - this.field1135.field1054) * 32.768D / var3);
            var9 = (int) ((double) this.field1135.field1054 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1131[var11] != 0) {
                field1151[var11] = 0;
                field1153[var11] = (int) ((double) this.field1141[var11] * var3);
                field1154[var11] = (this.field1131[var11] << 14) / 100;
                field1155[var11] = (int) ((double) (this.field1139.field1055 - this.field1139.field1054) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1147[var11]) / var3);
                field1133[var11] = (int) ((double) this.field1139.field1054 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1139.method1095(arg0);
            int var14 = this.field1132.method1095(arg0);
            if (this.field1140 != null) {
                int var15 = this.field1140.method1095(arg0);
                int var16 = this.field1144.method1095(arg0);
                var13 += this.method1299(var7, var16, this.field1140.field1059) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1135 != null) {
                int var17 = this.field1135.method1095(arg0);
                int var18 = this.field1136.method1095(arg0);
                var14 = var14 * ((this.method1299(var10, var18, this.field1135.field1059) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1131[var19] != 0) {
                    int var20 = field1153[var19] + var12;
                    if (var20 < arg0) {
                        field1156[var20] += this.method1299(field1151[var19], field1154[var19] * var14 >> 15, this.field1139.field1059);
                        field1151[var19] += (field1155[var19] * var13 >> 16) + field1133[var19];
                    }
                }
            }
        }
        if (this.field1137 != null) {
            this.field1137.method1094();
            this.field1138.method1094();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1137.method1095(arg0);
                int var26 = this.field1138.method1095(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1137.field1055 - this.field1137.field1054) * var25 >> 8) + this.field1137.field1054;
                } else {
                    var27 = ((this.field1137.field1055 - this.field1137.field1054) * var26 >> 8) + this.field1137.field1054;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1156[var24] = 0;
                }
            }
        }
        if (this.field1142 > 0 && this.field1143 > 0) {
            int var28 = (int) ((double) this.field1142 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1156[var29] += field1156[var29 - var28] * this.field1143 / 100;
            }
        }
        if (this.field1148.field1115[0] > 0 || this.field1148.field1115[1] > 0) {
            this.field1145.method1094();
            int var30 = this.field1145.method1095(arg0 + 1);
            int var31 = this.field1148.method1283(0, (float) var30 / 65536.0F);
            int var32 = this.field1148.method1283(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1156[var31 + var33] * (long) Statics.field1119 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1156[var31 + var33 - 1 - var36] * (long) class68.field1112[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1156[var33 - 1 - var37] * (long) class68.field1112[1][var37] >> 16);
                    }
                    field1156[var33] = var35;
                    var30 = this.field1145.method1095(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1156[var31 + var33] * (long) Statics.field1119 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1156[var31 + var33 - 1 - var40] * (long) class68.field1112[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1156[var33 - 1 - var41] * (long) class68.field1112[1][var41] >> 16);
                        }
                        field1156[var33] = var39;
                        var30 = this.field1145.method1095(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1156[var31 + var33 - 1 - var43] * (long) class68.field1112[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1156[var33 - 1 - var44] * (long) class68.field1112[1][var44] >> 16);
                            }
                            field1156[var33] = var42;
                            this.field1145.method1095(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1148.method1283(0, (float) var30 / 65536.0F);
                    var32 = this.field1148.method1283(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1156[var46] < -32768) {
                field1156[var46] = -32768;
            }
            if (field1156[var46] > 32767) {
                field1156[var46] = 32767;
            }
        }
        return field1156;
    }

    @ObfuscatedName("bs.c(III)I")
    public final int method1299(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1152[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1150[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bs.n(Ldu;)V")
    public final void method1301(class130 arg0) {
        this.field1139 = new class59();
        this.field1139.method1092(arg0);
        this.field1132 = new class59();
        this.field1132.method1092(arg0);
        int var2 = arg0.method2379();
        if (var2 != 0) {
            arg0.field1956--;
            this.field1140 = new class59();
            this.field1140.method1092(arg0);
            this.field1144 = new class59();
            this.field1144.method1092(arg0);
        }
        int var3 = arg0.method2379();
        if (var3 != 0) {
            arg0.field1956--;
            this.field1135 = new class59();
            this.field1135.method1092(arg0);
            this.field1136 = new class59();
            this.field1136.method1092(arg0);
        }
        int var4 = arg0.method2379();
        if (var4 != 0) {
            arg0.field1956--;
            this.field1137 = new class59();
            this.field1137.method1092(arg0);
            this.field1138 = new class59();
            this.field1138.method1092(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2242();
            if (var6 == 0) {
                break;
            }
            this.field1131[var5] = var6;
            this.field1147[var5] = arg0.method2241();
            this.field1141[var5] = arg0.method2242();
        }
        this.field1142 = arg0.method2242();
        this.field1143 = arg0.method2242();
        this.field1146 = arg0.method2232();
        this.field1134 = arg0.method2232();
        this.field1148 = new class68();
        this.field1145 = new class59();
        this.field1148.method1294(arg0, this.field1145);
    }
}
