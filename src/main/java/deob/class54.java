package deob;

import java.util.Random;

@ObfuscatedName("bb")
public class class54 {

    @ObfuscatedName("bb.q")
    public class56 field1165;

    @ObfuscatedName("bb.c")
    public class56 field1142;

    @ObfuscatedName("bb.p")
    public class56 field1154;

    @ObfuscatedName("bb.z")
    public class56 field1144;

    @ObfuscatedName("bb.m")
    public class56 field1145;

    @ObfuscatedName("bb.k")
    public class56 field1146;

    @ObfuscatedName("bb.v")
    public class56 field1147;

    @ObfuscatedName("bb.y")
    public class56 field1141;

    @ObfuscatedName("bb.d")
    public int[] field1149 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bb.l")
    public int[] field1150 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bb.h")
    public int[] field1151 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bb.b")
    public int field1152 = 0;

    @ObfuscatedName("bb.r")
    public int field1161 = 100;

    @ObfuscatedName("bb.t")
    public class64 field1157;

    @ObfuscatedName("bb.u")
    public class56 field1155;

    @ObfuscatedName("bb.g")
    public int field1143 = 500;

    @ObfuscatedName("bb.e")
    public int field1164 = 0;

    @ObfuscatedName("bb.n")
    public static int[] field1158;

    @ObfuscatedName("bb.o")
    public static int[] field1159 = new int[32768];

    @ObfuscatedName("bb.a")
    public static int[] field1160;

    @ObfuscatedName("bb.s")
    public static int[] field1162;

    @ObfuscatedName("bb.w")
    public static int[] field1163;

    @ObfuscatedName("bb.x")
    public static int[] field1148;

    @ObfuscatedName("bb.j")
    public static int[] field1153;

    @ObfuscatedName("bb.i")
    public static int[] field1166;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1159[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1160 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1160[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1158 = new int[220500];
        field1162 = new int[5];
        field1163 = new int[5];
        field1148 = new int[5];
        field1153 = new int[5];
        field1166 = new int[5];
    }

    @ObfuscatedName("bb.q(II)[I")
    public final int[] method1243(int arg0, int arg1) {
        class128.method2610(field1158, 0, arg0);
        if (arg1 < 10) {
            return field1158;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1165.method1261();
        this.field1142.method1261();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1154 != null) {
            this.field1154.method1261();
            this.field1144.method1261();
            var5 = (int) ((double) (this.field1154.field1180 - this.field1154.field1178) * 32.768D / var3);
            var6 = (int) ((double) this.field1154.field1178 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1145 != null) {
            this.field1145.method1261();
            this.field1146.method1261();
            var8 = (int) ((double) (this.field1145.field1180 - this.field1145.field1178) * 32.768D / var3);
            var9 = (int) ((double) this.field1145.field1178 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1149[var11] != 0) {
                field1162[var11] = 0;
                field1163[var11] = (int) ((double) this.field1151[var11] * var3);
                field1148[var11] = (this.field1149[var11] << 14) / 100;
                field1153[var11] = (int) ((double) (this.field1165.field1180 - this.field1165.field1178) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1150[var11]) / var3);
                field1166[var11] = (int) ((double) this.field1165.field1178 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1165.method1263(arg0);
            int var14 = this.field1142.method1263(arg0);
            if (this.field1154 != null) {
                int var15 = this.field1154.method1263(arg0);
                int var16 = this.field1144.method1263(arg0);
                var13 += this.method1244(var7, var16, this.field1154.field1179) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1145 != null) {
                int var17 = this.field1145.method1263(arg0);
                int var18 = this.field1146.method1263(arg0);
                var14 = var14 * ((this.method1244(var10, var18, this.field1145.field1179) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1149[var19] != 0) {
                    int var20 = field1163[var19] + var12;
                    if (var20 < arg0) {
                        field1158[var20] += this.method1244(field1162[var19], field1148[var19] * var14 >> 15, this.field1165.field1179);
                        field1162[var19] += (field1153[var19] * var13 >> 16) + field1166[var19];
                    }
                }
            }
        }
        if (this.field1147 != null) {
            this.field1147.method1261();
            this.field1141.method1261();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1147.method1263(arg0);
                int var26 = this.field1141.method1263(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1147.field1180 - this.field1147.field1178) * var25 >> 8) + this.field1147.field1178;
                } else {
                    var27 = ((this.field1147.field1180 - this.field1147.field1178) * var26 >> 8) + this.field1147.field1178;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1158[var24] = 0;
                }
            }
        }
        if (this.field1152 > 0 && this.field1161 > 0) {
            int var28 = (int) ((double) this.field1152 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1158[var29] += field1158[var29 - var28] * this.field1161 / 100;
            }
        }
        if (this.field1157.field1234[0] > 0 || this.field1157.field1234[1] > 0) {
            this.field1155.method1261();
            int var30 = this.field1155.method1263(arg0 + 1);
            int var31 = this.field1157.method1349(0, (float) var30 / 65536.0F);
            int var32 = this.field1157.method1349(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1158[var31 + var33] * (long) Statics.field1242 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1158[var31 + var33 - 1 - var36] * (long) class64.field1237[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1158[var33 - 1 - var37] * (long) class64.field1237[1][var37] >> 16);
                    }
                    field1158[var33] = var35;
                    var30 = this.field1155.method1263(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1158[var31 + var33] * (long) Statics.field1242 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1158[var31 + var33 - 1 - var40] * (long) class64.field1237[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1158[var33 - 1 - var41] * (long) class64.field1237[1][var41] >> 16);
                        }
                        field1158[var33] = var39;
                        var30 = this.field1155.method1263(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1158[var31 + var33 - 1 - var43] * (long) class64.field1237[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1158[var33 - 1 - var44] * (long) class64.field1237[1][var44] >> 16);
                            }
                            field1158[var33] = var42;
                            this.field1155.method1263(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1157.method1349(0, (float) var30 / 65536.0F);
                    var32 = this.field1157.method1349(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1158[var46] < -32768) {
                field1158[var46] = -32768;
            }
            if (field1158[var46] > 32767) {
                field1158[var46] = 32767;
            }
        }
        return field1158;
    }

    @ObfuscatedName("bb.c(III)I")
    public final int method1244(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1160[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1159[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bb.p(Ldo;)V")
    public final void method1253(class127 arg0) {
        this.field1165 = new class56();
        this.field1165.method1259(arg0);
        this.field1142 = new class56();
        this.field1142.method1259(arg0);
        int var2 = arg0.method2534();
        if (var2 != 0) {
            arg0.field2039--;
            this.field1154 = new class56();
            this.field1154.method1259(arg0);
            this.field1144 = new class56();
            this.field1144.method1259(arg0);
        }
        int var3 = arg0.method2534();
        if (var3 != 0) {
            arg0.field2039--;
            this.field1145 = new class56();
            this.field1145.method1259(arg0);
            this.field1146 = new class56();
            this.field1146.method1259(arg0);
        }
        int var4 = arg0.method2534();
        if (var4 != 0) {
            arg0.field2039--;
            this.field1147 = new class56();
            this.field1147.method1259(arg0);
            this.field1141 = new class56();
            this.field1141.method1259(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2596();
            if (var6 == 0) {
                break;
            }
            this.field1149[var5] = var6;
            this.field1150[var5] = arg0.method2437();
            this.field1151[var5] = arg0.method2596();
        }
        this.field1152 = arg0.method2596();
        this.field1161 = arg0.method2596();
        this.field1143 = arg0.method2427();
        this.field1164 = arg0.method2427();
        this.field1157 = new class64();
        this.field1155 = new class56();
        this.field1157.method1346(arg0, this.field1155);
    }
}
