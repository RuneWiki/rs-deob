package deob;

import java.util.Random;

@ObfuscatedName("bj")
public class class53 {

    @ObfuscatedName("bj.u")
    public class55 field1146;

    @ObfuscatedName("bj.k")
    public class55 field1139;

    @ObfuscatedName("bj.x")
    public class55 field1140;

    @ObfuscatedName("bj.m")
    public class55 field1141;

    @ObfuscatedName("bj.n")
    public class55 field1142;

    @ObfuscatedName("bj.q")
    public class55 field1148;

    @ObfuscatedName("bj.a")
    public class55 field1144;

    @ObfuscatedName("bj.g")
    public class55 field1138;

    @ObfuscatedName("bj.j")
    public int[] field1143 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bj.l")
    public int[] field1147 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bj.w")
    public int[] field1145 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bj.z")
    public int field1160 = 0;

    @ObfuscatedName("bj.e")
    public int field1150 = 100;

    @ObfuscatedName("bj.b")
    public class63 field1151;

    @ObfuscatedName("bj.c")
    public class55 field1152;

    @ObfuscatedName("bj.d")
    public int field1153 = 500;

    @ObfuscatedName("bj.h")
    public int field1163 = 0;

    @ObfuscatedName("bj.i")
    public static int[] field1155;

    @ObfuscatedName("bj.v")
    public static int[] field1156 = new int[32768];

    @ObfuscatedName("bj.s")
    public static int[] field1154;

    @ObfuscatedName("bj.y")
    public static int[] field1149;

    @ObfuscatedName("bj.t")
    public static int[] field1159;

    @ObfuscatedName("bj.r")
    public static int[] field1161;

    @ObfuscatedName("bj.p")
    public static int[] field1162;

    @ObfuscatedName("bj.o")
    public static int[] field1157;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1156[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1154 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1154[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1155 = new int[220500];
        field1149 = new int[5];
        field1159 = new int[5];
        field1161 = new int[5];
        field1162 = new int[5];
        field1157 = new int[5];
    }

    @ObfuscatedName("bj.u(II)[I")
    public final int[] method1214(int arg0, int arg1) {
        class127.method2654(field1155, 0, arg0);
        if (arg1 < 10) {
            return field1155;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1146.method1239();
        this.field1139.method1239();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1140 != null) {
            this.field1140.method1239();
            this.field1141.method1239();
            var5 = (int) ((double) (this.field1140.field1176 - this.field1140.field1173) * 32.768D / var3);
            var6 = (int) ((double) this.field1140.field1173 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1142 != null) {
            this.field1142.method1239();
            this.field1148.method1239();
            var8 = (int) ((double) (this.field1142.field1176 - this.field1142.field1173) * 32.768D / var3);
            var9 = (int) ((double) this.field1142.field1173 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1143[var11] != 0) {
                field1149[var11] = 0;
                field1159[var11] = (int) ((double) this.field1145[var11] * var3);
                field1161[var11] = (this.field1143[var11] << 14) / 100;
                field1162[var11] = (int) ((double) (this.field1146.field1176 - this.field1146.field1173) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1147[var11]) / var3);
                field1157[var11] = (int) ((double) this.field1146.field1173 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1146.method1236(arg0);
            int var14 = this.field1139.method1236(arg0);
            if (this.field1140 != null) {
                int var15 = this.field1140.method1236(arg0);
                int var16 = this.field1141.method1236(arg0);
                var13 += this.method1216(var7, var16, this.field1140.field1177) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1142 != null) {
                int var17 = this.field1142.method1236(arg0);
                int var18 = this.field1148.method1236(arg0);
                var14 = var14 * ((this.method1216(var10, var18, this.field1142.field1177) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1143[var19] != 0) {
                    int var20 = field1159[var19] + var12;
                    if (var20 < arg0) {
                        field1155[var20] += this.method1216(field1149[var19], field1161[var19] * var14 >> 15, this.field1146.field1177);
                        field1149[var19] += (field1162[var19] * var13 >> 16) + field1157[var19];
                    }
                }
            }
        }
        if (this.field1144 != null) {
            this.field1144.method1239();
            this.field1138.method1239();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1144.method1236(arg0);
                int var26 = this.field1138.method1236(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1144.field1176 - this.field1144.field1173) * var25 >> 8) + this.field1144.field1173;
                } else {
                    var27 = ((this.field1144.field1176 - this.field1144.field1173) * var26 >> 8) + this.field1144.field1173;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1155[var24] = 0;
                }
            }
        }
        if (this.field1160 > 0 && this.field1150 > 0) {
            int var28 = (int) ((double) this.field1160 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1155[var29] += field1155[var29 - var28] * this.field1150 / 100;
            }
        }
        if (this.field1151.field1237[0] > 0 || this.field1151.field1237[1] > 0) {
            this.field1152.method1239();
            int var30 = this.field1152.method1236(arg0 + 1);
            int var31 = this.field1151.method1328(0, (float) var30 / 65536.0F);
            int var32 = this.field1151.method1328(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1155[var31 + var33] * (long) Statics.field1235 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1155[var31 + var33 - 1 - var36] * (long) class63.field1233[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1155[var33 - 1 - var37] * (long) class63.field1233[1][var37] >> 16);
                    }
                    field1155[var33] = var35;
                    var30 = this.field1152.method1236(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1155[var31 + var33] * (long) Statics.field1235 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1155[var31 + var33 - 1 - var40] * (long) class63.field1233[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1155[var33 - 1 - var41] * (long) class63.field1233[1][var41] >> 16);
                        }
                        field1155[var33] = var39;
                        var30 = this.field1152.method1236(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1155[var31 + var33 - 1 - var43] * (long) class63.field1233[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1155[var33 - 1 - var44] * (long) class63.field1233[1][var44] >> 16);
                            }
                            field1155[var33] = var42;
                            this.field1152.method1236(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1151.method1328(0, (float) var30 / 65536.0F);
                    var32 = this.field1151.method1328(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1155[var46] < -32768) {
                field1155[var46] = -32768;
            }
            if (field1155[var46] > 32767) {
                field1155[var46] = 32767;
            }
        }
        return field1155;
    }

    @ObfuscatedName("bj.k(III)I")
    public final int method1216(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1154[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1156[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bj.x(Ldl;)V")
    public final void method1221(class126 arg0) {
        this.field1146 = new class55();
        this.field1146.method1233(arg0);
        this.field1139 = new class55();
        this.field1139.method1233(arg0);
        int var2 = arg0.method2559();
        if (var2 != 0) {
            arg0.field2024--;
            this.field1140 = new class55();
            this.field1140.method1233(arg0);
            this.field1141 = new class55();
            this.field1141.method1233(arg0);
        }
        int var3 = arg0.method2559();
        if (var3 != 0) {
            arg0.field2024--;
            this.field1142 = new class55();
            this.field1142.method1233(arg0);
            this.field1148 = new class55();
            this.field1148.method1233(arg0);
        }
        int var4 = arg0.method2559();
        if (var4 != 0) {
            arg0.field2024--;
            this.field1144 = new class55();
            this.field1144.method1233(arg0);
            this.field1138 = new class55();
            this.field1138.method1233(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2580();
            if (var6 == 0) {
                break;
            }
            this.field1143[var5] = var6;
            this.field1147[var5] = arg0.method2506();
            this.field1145[var5] = arg0.method2580();
        }
        this.field1160 = arg0.method2580();
        this.field1150 = arg0.method2580();
        this.field1153 = arg0.method2450();
        this.field1163 = arg0.method2450();
        this.field1151 = new class63();
        this.field1152 = new class55();
        this.field1151.method1317(arg0, this.field1152);
    }
}
