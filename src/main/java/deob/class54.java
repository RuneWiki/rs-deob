package deob;

import java.util.Random;

@ObfuscatedName("bl")
public class class54 {

    @ObfuscatedName("bl.g")
    public class56 field1157;

    @ObfuscatedName("bl.h")
    public class56 field1159;

    @ObfuscatedName("bl.s")
    public class56 field1174;

    @ObfuscatedName("bl.o")
    public class56 field1152;

    @ObfuscatedName("bl.p")
    public class56 field1151;

    @ObfuscatedName("bl.x")
    public class56 field1154;

    @ObfuscatedName("bl.k")
    public class56 field1150;

    @ObfuscatedName("bl.r")
    public class56 field1156;

    @ObfuscatedName("bl.z")
    public int[] field1155 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bl.n")
    public int[] field1158 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bl.j")
    public int[] field1167 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bl.b")
    public int field1153 = 0;

    @ObfuscatedName("bl.t")
    public int field1166 = 100;

    @ObfuscatedName("bl.q")
    public class64 field1162;

    @ObfuscatedName("bl.e")
    public class56 field1163;

    @ObfuscatedName("bl.l")
    public int field1164 = 500;

    @ObfuscatedName("bl.u")
    public int field1165 = 0;

    @ObfuscatedName("bl.m")
    public static int[] field1161;

    @ObfuscatedName("bl.a")
    public static int[] field1149 = new int[32768];

    @ObfuscatedName("bl.f")
    public static int[] field1168;

    @ObfuscatedName("bl.v")
    public static int[] field1170;

    @ObfuscatedName("bl.w")
    public static int[] field1171;

    @ObfuscatedName("bl.d")
    public static int[] field1172;

    @ObfuscatedName("bl.i")
    public static int[] field1173;

    @ObfuscatedName("bl.c")
    public static int[] field1160;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1149[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1168 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1168[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1161 = new int[220500];
        field1170 = new int[5];
        field1171 = new int[5];
        field1172 = new int[5];
        field1173 = new int[5];
        field1160 = new int[5];
    }

    @ObfuscatedName("bl.g(II)[I")
    public final int[] method1245(int arg0, int arg1) {
        class128.method2697(field1161, 0, arg0);
        if (arg1 < 10) {
            return field1161;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1157.method1272();
        this.field1159.method1272();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1174 != null) {
            this.field1174.method1272();
            this.field1152.method1272();
            var5 = (int) ((double) (this.field1174.field1192 - this.field1174.field1191) * 32.768D / var3);
            var6 = (int) ((double) this.field1174.field1191 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1151 != null) {
            this.field1151.method1272();
            this.field1154.method1272();
            var8 = (int) ((double) (this.field1151.field1192 - this.field1151.field1191) * 32.768D / var3);
            var9 = (int) ((double) this.field1151.field1191 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1155[var11] != 0) {
                field1170[var11] = 0;
                field1171[var11] = (int) ((double) this.field1167[var11] * var3);
                field1172[var11] = (this.field1155[var11] << 14) / 100;
                field1173[var11] = (int) ((double) (this.field1157.field1192 - this.field1157.field1191) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1158[var11]) / var3);
                field1160[var11] = (int) ((double) this.field1157.field1191 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1157.method1263(arg0);
            int var14 = this.field1159.method1263(arg0);
            if (this.field1174 != null) {
                int var15 = this.field1174.method1263(arg0);
                int var16 = this.field1152.method1263(arg0);
                var13 += this.method1248(var7, var16, this.field1174.field1189) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1151 != null) {
                int var17 = this.field1151.method1263(arg0);
                int var18 = this.field1154.method1263(arg0);
                var14 = var14 * ((this.method1248(var10, var18, this.field1151.field1189) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1155[var19] != 0) {
                    int var20 = field1171[var19] + var12;
                    if (var20 < arg0) {
                        field1161[var20] += this.method1248(field1170[var19], field1172[var19] * var14 >> 15, this.field1157.field1189);
                        field1170[var19] += (field1173[var19] * var13 >> 16) + field1160[var19];
                    }
                }
            }
        }
        if (this.field1150 != null) {
            this.field1150.method1272();
            this.field1156.method1272();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1150.method1263(arg0);
                int var26 = this.field1156.method1263(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1150.field1192 - this.field1150.field1191) * var25 >> 8) + this.field1150.field1191;
                } else {
                    var27 = ((this.field1150.field1192 - this.field1150.field1191) * var26 >> 8) + this.field1150.field1191;
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
        if (this.field1153 > 0 && this.field1166 > 0) {
            int var28 = (int) ((double) this.field1153 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1161[var29] += field1161[var29 - var28] * this.field1166 / 100;
            }
        }
        if (this.field1162.field1248[0] > 0 || this.field1162.field1248[1] > 0) {
            this.field1163.method1272();
            int var30 = this.field1163.method1263(arg0 + 1);
            int var31 = this.field1162.method1351(0, (float) var30 / 65536.0F);
            int var32 = this.field1162.method1351(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1161[var31 + var33] * (long) Statics.field1253 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1161[var31 + var33 - 1 - var36] * (long) class64.field1250[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1161[var33 - 1 - var37] * (long) class64.field1250[1][var37] >> 16);
                    }
                    field1161[var33] = var35;
                    var30 = this.field1163.method1263(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1161[var31 + var33] * (long) Statics.field1253 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1161[var31 + var33 - 1 - var40] * (long) class64.field1250[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1161[var33 - 1 - var41] * (long) class64.field1250[1][var41] >> 16);
                        }
                        field1161[var33] = var39;
                        var30 = this.field1163.method1263(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1161[var31 + var33 - 1 - var43] * (long) class64.field1250[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1161[var33 - 1 - var44] * (long) class64.field1250[1][var44] >> 16);
                            }
                            field1161[var33] = var42;
                            this.field1163.method1263(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1162.method1351(0, (float) var30 / 65536.0F);
                    var32 = this.field1162.method1351(1, (float) var30 / 65536.0F);
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

    @ObfuscatedName("bl.h(III)I")
    public final int method1248(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1168[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1149[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bl.s(Ldw;)V")
    public final void method1247(class127 arg0) {
        this.field1157 = new class56();
        this.field1157.method1260(arg0);
        this.field1159 = new class56();
        this.field1159.method1260(arg0);
        int var2 = arg0.method2499();
        if (var2 != 0) {
            arg0.field2027--;
            this.field1174 = new class56();
            this.field1174.method1260(arg0);
            this.field1152 = new class56();
            this.field1152.method1260(arg0);
        }
        int var3 = arg0.method2499();
        if (var3 != 0) {
            arg0.field2027--;
            this.field1151 = new class56();
            this.field1151.method1260(arg0);
            this.field1154 = new class56();
            this.field1154.method1260(arg0);
        }
        int var4 = arg0.method2499();
        if (var4 != 0) {
            arg0.field2027--;
            this.field1150 = new class56();
            this.field1150.method1260(arg0);
            this.field1156 = new class56();
            this.field1156.method1260(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2564();
            if (var6 == 0) {
                break;
            }
            this.field1155[var5] = var6;
            this.field1158[var5] = arg0.method2609();
            this.field1167[var5] = arg0.method2564();
        }
        this.field1153 = arg0.method2564();
        this.field1166 = arg0.method2564();
        this.field1164 = arg0.method2501();
        this.field1165 = arg0.method2501();
        this.field1162 = new class64();
        this.field1163 = new class56();
        this.field1162.method1347(arg0, this.field1163);
    }
}
