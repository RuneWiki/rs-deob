package deob;

import java.util.Random;

@ObfuscatedName("bl")
public class class54 {

    @ObfuscatedName("bl.b")
    public class56 field1161;

    @ObfuscatedName("bl.e")
    public class56 field1139;

    @ObfuscatedName("bl.g")
    public class56 field1148;

    @ObfuscatedName("bl.o")
    public class56 field1141;

    @ObfuscatedName("bl.a")
    public class56 field1142;

    @ObfuscatedName("bl.h")
    public class56 field1143;

    @ObfuscatedName("bl.j")
    public class56 field1153;

    @ObfuscatedName("bl.f")
    public class56 field1145;

    @ObfuscatedName("bl.q")
    public int[] field1146 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bl.l")
    public int[] field1147 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bl.d")
    public int[] field1159 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bl.z")
    public int field1140 = 0;

    @ObfuscatedName("bl.n")
    public int field1150 = 100;

    @ObfuscatedName("bl.t")
    public class64 field1151;

    @ObfuscatedName("bl.w")
    public class56 field1152;

    @ObfuscatedName("bl.r")
    public int field1144 = 500;

    @ObfuscatedName("bl.x")
    public int field1138 = 0;

    @ObfuscatedName("bl.v")
    public static int[] field1157;

    @ObfuscatedName("bl.y")
    public static int[] field1156 = new int[32768];

    @ObfuscatedName("bl.k")
    public static int[] field1149;

    @ObfuscatedName("bl.s")
    public static int[] field1155;

    @ObfuscatedName("bl.m")
    public static int[] field1160;

    @ObfuscatedName("bl.c")
    public static int[] field1163;

    @ObfuscatedName("bl.i")
    public static int[] field1162;

    @ObfuscatedName("bl.u")
    public static int[] field1154;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1156[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1149 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1149[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1157 = new int[220500];
        field1155 = new int[5];
        field1160 = new int[5];
        field1163 = new int[5];
        field1162 = new int[5];
        field1154 = new int[5];
    }

    @ObfuscatedName("bl.b(II)[I")
    public final int[] method1209(int arg0, int arg1) {
        class128.method2636(field1157, 0, arg0);
        if (arg1 < 10) {
            return field1157;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1161.method1228();
        this.field1139.method1228();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1148 != null) {
            this.field1148.method1228();
            this.field1141.method1228();
            var5 = (int) ((double) (this.field1148.field1178 - this.field1148.field1180) * 32.768D / var3);
            var6 = (int) ((double) this.field1148.field1180 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1142 != null) {
            this.field1142.method1228();
            this.field1143.method1228();
            var8 = (int) ((double) (this.field1142.field1178 - this.field1142.field1180) * 32.768D / var3);
            var9 = (int) ((double) this.field1142.field1180 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1146[var11] != 0) {
                field1155[var11] = 0;
                field1160[var11] = (int) ((double) this.field1159[var11] * var3);
                field1163[var11] = (this.field1146[var11] << 14) / 100;
                field1162[var11] = (int) ((double) (this.field1161.field1178 - this.field1161.field1180) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1147[var11]) / var3);
                field1154[var11] = (int) ((double) this.field1161.field1180 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1161.method1229(arg0);
            int var14 = this.field1139.method1229(arg0);
            if (this.field1148 != null) {
                int var15 = this.field1148.method1229(arg0);
                int var16 = this.field1141.method1229(arg0);
                var13 += this.method1206(var7, var16, this.field1148.field1174) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1142 != null) {
                int var17 = this.field1142.method1229(arg0);
                int var18 = this.field1143.method1229(arg0);
                var14 = var14 * ((this.method1206(var10, var18, this.field1142.field1174) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1146[var19] != 0) {
                    int var20 = field1160[var19] + var12;
                    if (var20 < arg0) {
                        field1157[var20] += this.method1206(field1155[var19], field1163[var19] * var14 >> 15, this.field1161.field1174);
                        field1155[var19] += (field1162[var19] * var13 >> 16) + field1154[var19];
                    }
                }
            }
        }
        if (this.field1153 != null) {
            this.field1153.method1228();
            this.field1145.method1228();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1153.method1229(arg0);
                int var26 = this.field1145.method1229(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1153.field1178 - this.field1153.field1180) * var25 >> 8) + this.field1153.field1180;
                } else {
                    var27 = ((this.field1153.field1178 - this.field1153.field1180) * var26 >> 8) + this.field1153.field1180;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1157[var24] = 0;
                }
            }
        }
        if (this.field1140 > 0 && this.field1150 > 0) {
            int var28 = (int) ((double) this.field1140 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1157[var29] += field1157[var29 - var28] * this.field1150 / 100;
            }
        }
        if (this.field1151.field1235[0] > 0 || this.field1151.field1235[1] > 0) {
            this.field1152.method1228();
            int var30 = this.field1152.method1229(arg0 + 1);
            int var31 = this.field1151.method1318(0, (float) var30 / 65536.0F);
            int var32 = this.field1151.method1318(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1157[var31 + var33] * (long) Statics.field1232 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1157[var31 + var33 - 1 - var36] * (long) class64.field1236[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1157[var33 - 1 - var37] * (long) class64.field1236[1][var37] >> 16);
                    }
                    field1157[var33] = var35;
                    var30 = this.field1152.method1229(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1157[var31 + var33] * (long) Statics.field1232 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1157[var31 + var33 - 1 - var40] * (long) class64.field1236[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1157[var33 - 1 - var41] * (long) class64.field1236[1][var41] >> 16);
                        }
                        field1157[var33] = var39;
                        var30 = this.field1152.method1229(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1157[var31 + var33 - 1 - var43] * (long) class64.field1236[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1157[var33 - 1 - var44] * (long) class64.field1236[1][var44] >> 16);
                            }
                            field1157[var33] = var42;
                            this.field1152.method1229(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1151.method1318(0, (float) var30 / 65536.0F);
                    var32 = this.field1151.method1318(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1157[var46] < -32768) {
                field1157[var46] = -32768;
            }
            if (field1157[var46] > 32767) {
                field1157[var46] = 32767;
            }
        }
        return field1157;
    }

    @ObfuscatedName("bl.e(III)I")
    public final int method1206(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1149[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1156[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bl.g(Ldv;)V")
    public final void method1207(class126 arg0) {
        this.field1161 = new class56();
        this.field1161.method1226(arg0);
        this.field1139 = new class56();
        this.field1139.method1226(arg0);
        int var2 = arg0.method2436();
        if (var2 != 0) {
            arg0.field2027--;
            this.field1148 = new class56();
            this.field1148.method1226(arg0);
            this.field1141 = new class56();
            this.field1141.method1226(arg0);
        }
        int var3 = arg0.method2436();
        if (var3 != 0) {
            arg0.field2027--;
            this.field1142 = new class56();
            this.field1142.method1226(arg0);
            this.field1143 = new class56();
            this.field1143.method1226(arg0);
        }
        int var4 = arg0.method2436();
        if (var4 != 0) {
            arg0.field2027--;
            this.field1153 = new class56();
            this.field1153.method1226(arg0);
            this.field1145 = new class56();
            this.field1145.method1226(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2560();
            if (var6 == 0) {
                break;
            }
            this.field1146[var5] = var6;
            this.field1147[var5] = arg0.method2448();
            this.field1159[var5] = arg0.method2560();
        }
        this.field1140 = arg0.method2560();
        this.field1150 = arg0.method2560();
        this.field1144 = arg0.method2572();
        this.field1138 = arg0.method2572();
        this.field1151 = new class64();
        this.field1152 = new class56();
        this.field1151.method1310(arg0, this.field1152);
    }
}
