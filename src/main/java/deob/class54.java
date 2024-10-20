package deob;

import java.util.Random;

@ObfuscatedName("bd")
public class class54 {

    @ObfuscatedName("bd.y")
    public class56 field1156;

    @ObfuscatedName("bd.m")
    public class56 field1161;

    @ObfuscatedName("bd.d")
    public class56 field1147;

    @ObfuscatedName("bd.k")
    public class56 field1139;

    @ObfuscatedName("bd.n")
    public class56 field1141;

    @ObfuscatedName("bd.s")
    public class56 field1142;

    @ObfuscatedName("bd.x")
    public class56 field1138;

    @ObfuscatedName("bd.b")
    public class56 field1144;

    @ObfuscatedName("bd.j")
    public int[] field1152 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bd.p")
    public int[] field1146 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bd.l")
    public int[] field1137 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bd.i")
    public int field1148 = 0;

    @ObfuscatedName("bd.r")
    public int field1143 = 100;

    @ObfuscatedName("bd.o")
    public class64 field1150;

    @ObfuscatedName("bd.c")
    public class56 field1151;

    @ObfuscatedName("bd.f")
    public int field1140 = 500;

    @ObfuscatedName("bd.a")
    public int field1158 = 0;

    @ObfuscatedName("bd.t")
    public static int[] field1154;

    @ObfuscatedName("bd.u")
    public static int[] field1155 = new int[32768];

    @ObfuscatedName("bd.z")
    public static int[] field1153;

    @ObfuscatedName("bd.w")
    public static int[] field1149;

    @ObfuscatedName("bd.h")
    public static int[] field1159;

    @ObfuscatedName("bd.q")
    public static int[] field1160;

    @ObfuscatedName("bd.g")
    public static int[] field1145;

    @ObfuscatedName("bd.e")
    public static int[] field1162;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1155[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1153 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1153[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1154 = new int[220500];
        field1149 = new int[5];
        field1159 = new int[5];
        field1160 = new int[5];
        field1145 = new int[5];
        field1162 = new int[5];
    }

    @ObfuscatedName("bd.y(II)[I")
    public final int[] method1233(int arg0, int arg1) {
        class128.method2667(field1154, 0, arg0);
        if (arg1 < 10) {
            return field1154;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1156.method1249();
        this.field1161.method1249();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1147 != null) {
            this.field1147.method1249();
            this.field1139.method1249();
            var5 = (int) ((double) (this.field1147.field1178 - this.field1147.field1177) * 32.768D / var3);
            var6 = (int) ((double) this.field1147.field1177 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1141 != null) {
            this.field1141.method1249();
            this.field1142.method1249();
            var8 = (int) ((double) (this.field1141.field1178 - this.field1141.field1177) * 32.768D / var3);
            var9 = (int) ((double) this.field1141.field1177 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1152[var11] != 0) {
                field1149[var11] = 0;
                field1159[var11] = (int) ((double) this.field1137[var11] * var3);
                field1160[var11] = (this.field1152[var11] << 14) / 100;
                field1145[var11] = (int) ((double) (this.field1156.field1178 - this.field1156.field1177) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1146[var11]) / var3);
                field1162[var11] = (int) ((double) this.field1156.field1177 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1156.method1250(arg0);
            int var14 = this.field1161.method1250(arg0);
            if (this.field1147 != null) {
                int var15 = this.field1147.method1250(arg0);
                int var16 = this.field1139.method1250(arg0);
                var13 += this.method1234(var7, var16, this.field1147.field1179) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1141 != null) {
                int var17 = this.field1141.method1250(arg0);
                int var18 = this.field1142.method1250(arg0);
                var14 = var14 * ((this.method1234(var10, var18, this.field1141.field1179) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1152[var19] != 0) {
                    int var20 = field1159[var19] + var12;
                    if (var20 < arg0) {
                        field1154[var20] += this.method1234(field1149[var19], field1160[var19] * var14 >> 15, this.field1156.field1179);
                        field1149[var19] += (field1145[var19] * var13 >> 16) + field1162[var19];
                    }
                }
            }
        }
        if (this.field1138 != null) {
            this.field1138.method1249();
            this.field1144.method1249();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1138.method1250(arg0);
                int var26 = this.field1144.method1250(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1138.field1178 - this.field1138.field1177) * var25 >> 8) + this.field1138.field1177;
                } else {
                    var27 = ((this.field1138.field1178 - this.field1138.field1177) * var26 >> 8) + this.field1138.field1177;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1154[var24] = 0;
                }
            }
        }
        if (this.field1148 > 0 && this.field1143 > 0) {
            int var28 = (int) ((double) this.field1148 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1154[var29] += field1154[var29 - var28] * this.field1143 / 100;
            }
        }
        if (this.field1150.field1232[0] > 0 || this.field1150.field1232[1] > 0) {
            this.field1151.method1249();
            int var30 = this.field1151.method1250(arg0 + 1);
            int var31 = this.field1150.method1331(0, (float) var30 / 65536.0F);
            int var32 = this.field1150.method1331(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1154[var31 + var33] * (long) Statics.field1237 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1154[var31 + var33 - 1 - var36] * (long) class64.field1231[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1154[var33 - 1 - var37] * (long) class64.field1231[1][var37] >> 16);
                    }
                    field1154[var33] = var35;
                    var30 = this.field1151.method1250(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1154[var31 + var33] * (long) Statics.field1237 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1154[var31 + var33 - 1 - var40] * (long) class64.field1231[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1154[var33 - 1 - var41] * (long) class64.field1231[1][var41] >> 16);
                        }
                        field1154[var33] = var39;
                        var30 = this.field1151.method1250(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1154[var31 + var33 - 1 - var43] * (long) class64.field1231[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1154[var33 - 1 - var44] * (long) class64.field1231[1][var44] >> 16);
                            }
                            field1154[var33] = var42;
                            this.field1151.method1250(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1150.method1331(0, (float) var30 / 65536.0F);
                    var32 = this.field1150.method1331(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1154[var46] < -32768) {
                field1154[var46] = -32768;
            }
            if (field1154[var46] > 32767) {
                field1154[var46] = 32767;
            }
        }
        return field1154;
    }

    @ObfuscatedName("bd.m(III)I")
    public final int method1234(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1153[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1155[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bd.d(Ldp;)V")
    public final void method1232(class127 arg0) {
        this.field1156 = new class56();
        this.field1156.method1248(arg0);
        this.field1161 = new class56();
        this.field1161.method1248(arg0);
        int var2 = arg0.method2534();
        if (var2 != 0) {
            arg0.field2036--;
            this.field1147 = new class56();
            this.field1147.method1248(arg0);
            this.field1139 = new class56();
            this.field1139.method1248(arg0);
        }
        int var3 = arg0.method2534();
        if (var3 != 0) {
            arg0.field2036--;
            this.field1141 = new class56();
            this.field1141.method1248(arg0);
            this.field1142 = new class56();
            this.field1142.method1248(arg0);
        }
        int var4 = arg0.method2534();
        if (var4 != 0) {
            arg0.field2036--;
            this.field1138 = new class56();
            this.field1138.method1248(arg0);
            this.field1144 = new class56();
            this.field1144.method1248(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2637();
            if (var6 == 0) {
                break;
            }
            this.field1152[var5] = var6;
            this.field1146[var5] = arg0.method2470();
            this.field1137[var5] = arg0.method2637();
        }
        this.field1148 = arg0.method2637();
        this.field1143 = arg0.method2637();
        this.field1140 = arg0.method2460();
        this.field1158 = arg0.method2460();
        this.field1150 = new class64();
        this.field1151 = new class56();
        this.field1150.method1332(arg0, this.field1151);
    }
}
