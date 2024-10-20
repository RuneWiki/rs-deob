package deob;

import java.util.Random;

@ObfuscatedName("bc")
public class class54 {

    @ObfuscatedName("bc.i")
    public class56 field1177;

    @ObfuscatedName("bc.v")
    public class56 field1156;

    @ObfuscatedName("bc.m")
    public class56 field1157;

    @ObfuscatedName("bc.j")
    public class56 field1166;

    @ObfuscatedName("bc.o")
    public class56 field1176;

    @ObfuscatedName("bc.l")
    public class56 field1160;

    @ObfuscatedName("bc.g")
    public class56 field1158;

    @ObfuscatedName("bc.w")
    public class56 field1162;

    @ObfuscatedName("bc.c")
    public int[] field1173 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bc.z")
    public int[] field1164 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bc.f")
    public int[] field1165 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bc.a")
    public int field1161 = 0;

    @ObfuscatedName("bc.d")
    public int field1167 = 100;

    @ObfuscatedName("bc.e")
    public class64 field1168;

    @ObfuscatedName("bc.y")
    public class56 field1169;

    @ObfuscatedName("bc.k")
    public int field1170 = 500;

    @ObfuscatedName("bc.h")
    public int field1171 = 0;

    @ObfuscatedName("bc.x")
    public static int[] field1172;

    @ObfuscatedName("bc.b")
    public static int[] field1155 = new int[32768];

    @ObfuscatedName("bc.n")
    public static int[] field1159;

    @ObfuscatedName("bc.r")
    public static int[] field1179;

    @ObfuscatedName("bc.u")
    public static int[] field1163;

    @ObfuscatedName("bc.p")
    public static int[] field1178;

    @ObfuscatedName("bc.t")
    public static int[] field1174;

    @ObfuscatedName("bc.s")
    public static int[] field1180;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1155[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1159 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1159[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1172 = new int[220500];
        field1179 = new int[5];
        field1163 = new int[5];
        field1178 = new int[5];
        field1174 = new int[5];
        field1180 = new int[5];
    }

    @ObfuscatedName("bc.i(II)[I")
    public final int[] method1248(int arg0, int arg1) {
        class128.method2711(field1172, 0, arg0);
        if (arg1 < 10) {
            return field1172;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1177.method1271();
        this.field1156.method1271();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1157 != null) {
            this.field1157.method1271();
            this.field1166.method1271();
            var5 = (int) ((double) (this.field1157.field1198 - this.field1157.field1192) * 32.768D / var3);
            var6 = (int) ((double) this.field1157.field1192 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1176 != null) {
            this.field1176.method1271();
            this.field1160.method1271();
            var8 = (int) ((double) (this.field1176.field1198 - this.field1176.field1192) * 32.768D / var3);
            var9 = (int) ((double) this.field1176.field1192 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1173[var11] != 0) {
                field1179[var11] = 0;
                field1163[var11] = (int) ((double) this.field1165[var11] * var3);
                field1178[var11] = (this.field1173[var11] << 14) / 100;
                field1174[var11] = (int) ((double) (this.field1177.field1198 - this.field1177.field1192) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1164[var11]) / var3);
                field1180[var11] = (int) ((double) this.field1177.field1192 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1177.method1268(arg0);
            int var14 = this.field1156.method1268(arg0);
            if (this.field1157 != null) {
                int var15 = this.field1157.method1268(arg0);
                int var16 = this.field1166.method1268(arg0);
                var13 += this.method1252(var7, var16, this.field1157.field1194) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1176 != null) {
                int var17 = this.field1176.method1268(arg0);
                int var18 = this.field1160.method1268(arg0);
                var14 = var14 * ((this.method1252(var10, var18, this.field1176.field1194) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1173[var19] != 0) {
                    int var20 = field1163[var19] + var12;
                    if (var20 < arg0) {
                        field1172[var20] += this.method1252(field1179[var19], field1178[var19] * var14 >> 15, this.field1177.field1194);
                        field1179[var19] += (field1174[var19] * var13 >> 16) + field1180[var19];
                    }
                }
            }
        }
        if (this.field1158 != null) {
            this.field1158.method1271();
            this.field1162.method1271();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1158.method1268(arg0);
                int var26 = this.field1162.method1268(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1158.field1198 - this.field1158.field1192) * var25 >> 8) + this.field1158.field1192;
                } else {
                    var27 = ((this.field1158.field1198 - this.field1158.field1192) * var26 >> 8) + this.field1158.field1192;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1172[var24] = 0;
                }
            }
        }
        if (this.field1161 > 0 && this.field1167 > 0) {
            int var28 = (int) ((double) this.field1161 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1172[var29] += field1172[var29 - var28] * this.field1167 / 100;
            }
        }
        if (this.field1168.field1254[0] > 0 || this.field1168.field1254[1] > 0) {
            this.field1169.method1271();
            int var30 = this.field1169.method1268(arg0 + 1);
            int var31 = this.field1168.method1352(0, (float) var30 / 65536.0F);
            int var32 = this.field1168.method1352(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1172[var31 + var33] * (long) Statics.field1248 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1172[var31 + var33 - 1 - var36] * (long) class64.field1251[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1172[var33 - 1 - var37] * (long) class64.field1251[1][var37] >> 16);
                    }
                    field1172[var33] = var35;
                    var30 = this.field1169.method1268(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1172[var31 + var33] * (long) Statics.field1248 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1172[var31 + var33 - 1 - var40] * (long) class64.field1251[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1172[var33 - 1 - var41] * (long) class64.field1251[1][var41] >> 16);
                        }
                        field1172[var33] = var39;
                        var30 = this.field1169.method1268(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1172[var31 + var33 - 1 - var43] * (long) class64.field1251[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1172[var33 - 1 - var44] * (long) class64.field1251[1][var44] >> 16);
                            }
                            field1172[var33] = var42;
                            this.field1169.method1268(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1168.method1352(0, (float) var30 / 65536.0F);
                    var32 = this.field1168.method1352(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1172[var46] < -32768) {
                field1172[var46] = -32768;
            }
            if (field1172[var46] > 32767) {
                field1172[var46] = 32767;
            }
        }
        return field1172;
    }

    @ObfuscatedName("bc.v(III)I")
    public final int method1252(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1159[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1155[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bc.m(Lda;)V")
    public final void method1251(class127 arg0) {
        this.field1177 = new class56();
        this.field1177.method1267(arg0);
        this.field1156 = new class56();
        this.field1156.method1267(arg0);
        int var2 = arg0.method2491();
        if (var2 != 0) {
            arg0.field2039--;
            this.field1157 = new class56();
            this.field1157.method1267(arg0);
            this.field1166 = new class56();
            this.field1166.method1267(arg0);
        }
        int var3 = arg0.method2491();
        if (var3 != 0) {
            arg0.field2039--;
            this.field1176 = new class56();
            this.field1176.method1267(arg0);
            this.field1160 = new class56();
            this.field1160.method1267(arg0);
        }
        int var4 = arg0.method2491();
        if (var4 != 0) {
            arg0.field2039--;
            this.field1158 = new class56();
            this.field1158.method1267(arg0);
            this.field1162 = new class56();
            this.field1162.method1267(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2570();
            if (var6 == 0) {
                break;
            }
            this.field1173[var5] = var6;
            this.field1164[var5] = arg0.method2502();
            this.field1165[var5] = arg0.method2570();
        }
        this.field1161 = arg0.method2570();
        this.field1167 = arg0.method2570();
        this.field1170 = arg0.method2493();
        this.field1171 = arg0.method2493();
        this.field1168 = new class64();
        this.field1169 = new class56();
        this.field1168.method1353(arg0, this.field1169);
    }
}
