package deob;

import java.util.Random;

@ObfuscatedName("bu")
public class class53 {

    @ObfuscatedName("bu.g")
    public class55 field1141;

    @ObfuscatedName("bu.e")
    public class55 field1139;

    @ObfuscatedName("bu.n")
    public class55 field1151;

    @ObfuscatedName("bu.j")
    public class55 field1146;

    @ObfuscatedName("bu.i")
    public class55 field1142;

    @ObfuscatedName("bu.o")
    public class55 field1143;

    @ObfuscatedName("bu.l")
    public class55 field1144;

    @ObfuscatedName("bu.p")
    public class55 field1145;

    @ObfuscatedName("bu.t")
    public int[] field1159 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bu.w")
    public int[] field1147 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bu.r")
    public int[] field1148 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bu.a")
    public int field1149 = 0;

    @ObfuscatedName("bu.q")
    public int field1150 = 100;

    @ObfuscatedName("bu.z")
    public class63 field1153;

    @ObfuscatedName("bu.d")
    public class55 field1152;

    @ObfuscatedName("bu.x")
    public int field1161 = 500;

    @ObfuscatedName("bu.s")
    public int field1163 = 0;

    @ObfuscatedName("bu.m")
    public static int[] field1155;

    @ObfuscatedName("bu.y")
    public static int[] field1156 = new int[32768];

    @ObfuscatedName("bu.b")
    public static int[] field1154;

    @ObfuscatedName("bu.f")
    public static int[] field1157;

    @ObfuscatedName("bu.v")
    public static int[] field1160;

    @ObfuscatedName("bu.u")
    public static int[] field1138;

    @ObfuscatedName("bu.k")
    public static int[] field1162;

    @ObfuscatedName("bu.c")
    public static int[] field1140;

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
        field1157 = new int[5];
        field1160 = new int[5];
        field1138 = new int[5];
        field1162 = new int[5];
        field1140 = new int[5];
    }

    @ObfuscatedName("bu.g(II)[I")
    public final int[] method1216(int arg0, int arg1) {
        class127.method2687(field1155, 0, arg0);
        if (arg1 < 10) {
            return field1155;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1141.method1235();
        this.field1139.method1235();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1151 != null) {
            this.field1151.method1235();
            this.field1146.method1235();
            var5 = (int) ((double) (this.field1151.field1174 - this.field1151.field1175) * 32.768D / var3);
            var6 = (int) ((double) this.field1151.field1175 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1142 != null) {
            this.field1142.method1235();
            this.field1143.method1235();
            var8 = (int) ((double) (this.field1142.field1174 - this.field1142.field1175) * 32.768D / var3);
            var9 = (int) ((double) this.field1142.field1175 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1159[var11] != 0) {
                field1157[var11] = 0;
                field1160[var11] = (int) ((double) this.field1148[var11] * var3);
                field1138[var11] = (this.field1159[var11] << 14) / 100;
                field1162[var11] = (int) ((double) (this.field1141.field1174 - this.field1141.field1175) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1147[var11]) / var3);
                field1140[var11] = (int) ((double) this.field1141.field1175 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1141.method1228(arg0);
            int var14 = this.field1139.method1228(arg0);
            if (this.field1151 != null) {
                int var15 = this.field1151.method1228(arg0);
                int var16 = this.field1146.method1228(arg0);
                var13 += this.method1207(var7, var16, this.field1151.field1178) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1142 != null) {
                int var17 = this.field1142.method1228(arg0);
                int var18 = this.field1143.method1228(arg0);
                var14 = var14 * ((this.method1207(var10, var18, this.field1142.field1178) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1159[var19] != 0) {
                    int var20 = field1160[var19] + var12;
                    if (var20 < arg0) {
                        field1155[var20] += this.method1207(field1157[var19], field1138[var19] * var14 >> 15, this.field1141.field1178);
                        field1157[var19] += (field1162[var19] * var13 >> 16) + field1140[var19];
                    }
                }
            }
        }
        if (this.field1144 != null) {
            this.field1144.method1235();
            this.field1145.method1235();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1144.method1228(arg0);
                int var26 = this.field1145.method1228(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1144.field1174 - this.field1144.field1175) * var25 >> 8) + this.field1144.field1175;
                } else {
                    var27 = ((this.field1144.field1174 - this.field1144.field1175) * var26 >> 8) + this.field1144.field1175;
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
        if (this.field1149 > 0 && this.field1150 > 0) {
            int var28 = (int) ((double) this.field1149 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1155[var29] += field1155[var29 - var28] * this.field1150 / 100;
            }
        }
        if (this.field1153.field1233[0] > 0 || this.field1153.field1233[1] > 0) {
            this.field1152.method1235();
            int var30 = this.field1152.method1228(arg0 + 1);
            int var31 = this.field1153.method1317(0, (float) var30 / 65536.0F);
            int var32 = this.field1153.method1317(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1155[var31 + var33] * (long) Statics.field1234 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1155[var31 + var33 - 1 - var36] * (long) class63.field1231[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1155[var33 - 1 - var37] * (long) class63.field1231[1][var37] >> 16);
                    }
                    field1155[var33] = var35;
                    var30 = this.field1152.method1228(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1155[var31 + var33] * (long) Statics.field1234 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1155[var31 + var33 - 1 - var40] * (long) class63.field1231[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1155[var33 - 1 - var41] * (long) class63.field1231[1][var41] >> 16);
                        }
                        field1155[var33] = var39;
                        var30 = this.field1152.method1228(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1155[var31 + var33 - 1 - var43] * (long) class63.field1231[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1155[var33 - 1 - var44] * (long) class63.field1231[1][var44] >> 16);
                            }
                            field1155[var33] = var42;
                            this.field1152.method1228(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1153.method1317(0, (float) var30 / 65536.0F);
                    var32 = this.field1153.method1317(1, (float) var30 / 65536.0F);
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

    @ObfuscatedName("bu.e(III)I")
    public final int method1207(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("bu.n(Ldu;)V")
    public final void method1208(class126 arg0) {
        this.field1141 = new class55();
        this.field1141.method1225(arg0);
        this.field1139 = new class55();
        this.field1139.method1225(arg0);
        int var2 = arg0.method2485();
        if (var2 != 0) {
            arg0.field2016--;
            this.field1151 = new class55();
            this.field1151.method1225(arg0);
            this.field1146 = new class55();
            this.field1146.method1225(arg0);
        }
        int var3 = arg0.method2485();
        if (var3 != 0) {
            arg0.field2016--;
            this.field1142 = new class55();
            this.field1142.method1225(arg0);
            this.field1143 = new class55();
            this.field1143.method1225(arg0);
        }
        int var4 = arg0.method2485();
        if (var4 != 0) {
            arg0.field2016--;
            this.field1144 = new class55();
            this.field1144.method1225(arg0);
            this.field1145 = new class55();
            this.field1145.method1225(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2628();
            if (var6 == 0) {
                break;
            }
            this.field1159[var5] = var6;
            this.field1147[var5] = arg0.method2497();
            this.field1148[var5] = arg0.method2628();
        }
        this.field1149 = arg0.method2628();
        this.field1150 = arg0.method2628();
        this.field1161 = arg0.method2487();
        this.field1163 = arg0.method2487();
        this.field1153 = new class63();
        this.field1152 = new class55();
        this.field1153.method1326(arg0, this.field1152);
    }
}
