package deob;

import java.util.Random;

@ObfuscatedName("bd")
public class class54 {

    @ObfuscatedName("bd.a")
    public class56 field1156;

    @ObfuscatedName("bd.r")
    public class56 field1141;

    @ObfuscatedName("bd.u")
    public class56 field1136;

    @ObfuscatedName("bd.t")
    public class56 field1137;

    @ObfuscatedName("bd.k")
    public class56 field1149;

    @ObfuscatedName("bd.x")
    public class56 field1139;

    @ObfuscatedName("bd.v")
    public class56 field1155;

    @ObfuscatedName("bd.g")
    public class56 field1144;

    @ObfuscatedName("bd.n")
    public int[] field1140 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bd.q")
    public int[] field1143 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bd.i")
    public int[] field1138 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bd.p")
    public int field1148 = 0;

    @ObfuscatedName("bd.e")
    public int field1146 = 100;

    @ObfuscatedName("bd.o")
    public class64 field1147;

    @ObfuscatedName("bd.j")
    public class56 field1134;

    @ObfuscatedName("bd.s")
    public int field1145 = 500;

    @ObfuscatedName("bd.b")
    public int field1150 = 0;

    @ObfuscatedName("bd.c")
    public static int[] field1151;

    @ObfuscatedName("bd.m")
    public static int[] field1152 = new int[32768];

    @ObfuscatedName("bd.z")
    public static int[] field1153;

    @ObfuscatedName("bd.f")
    public static int[] field1142;

    @ObfuscatedName("bd.w")
    public static int[] field1135;

    @ObfuscatedName("bd.l")
    public static int[] field1157;

    @ObfuscatedName("bd.d")
    public static int[] field1158;

    @ObfuscatedName("bd.y")
    public static int[] field1159;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1152[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1153 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1153[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1151 = new int[220500];
        field1142 = new int[5];
        field1135 = new int[5];
        field1157 = new int[5];
        field1158 = new int[5];
        field1159 = new int[5];
    }

    @ObfuscatedName("bd.a(II)[I")
    public final int[] method1159(int arg0, int arg1) {
        class128.method2607(field1151, 0, arg0);
        if (arg1 < 10) {
            return field1151;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1156.method1187();
        this.field1141.method1187();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1136 != null) {
            this.field1136.method1187();
            this.field1137.method1187();
            var5 = (int) ((double) (this.field1136.field1169 - this.field1136.field1172) * 32.768D / var3);
            var6 = (int) ((double) this.field1136.field1172 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1149 != null) {
            this.field1149.method1187();
            this.field1139.method1187();
            var8 = (int) ((double) (this.field1149.field1169 - this.field1149.field1172) * 32.768D / var3);
            var9 = (int) ((double) this.field1149.field1172 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1140[var11] != 0) {
                field1142[var11] = 0;
                field1135[var11] = (int) ((double) this.field1138[var11] * var3);
                field1157[var11] = (this.field1140[var11] << 14) / 100;
                field1158[var11] = (int) ((double) (this.field1156.field1169 - this.field1156.field1172) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1143[var11]) / var3);
                field1159[var11] = (int) ((double) this.field1156.field1172 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1156.method1176(arg0);
            int var14 = this.field1141.method1176(arg0);
            if (this.field1136 != null) {
                int var15 = this.field1136.method1176(arg0);
                int var16 = this.field1137.method1176(arg0);
                var13 += this.method1160(var7, var16, this.field1136.field1170) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1149 != null) {
                int var17 = this.field1149.method1176(arg0);
                int var18 = this.field1139.method1176(arg0);
                var14 = var14 * ((this.method1160(var10, var18, this.field1149.field1170) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1140[var19] != 0) {
                    int var20 = field1135[var19] + var12;
                    if (var20 < arg0) {
                        field1151[var20] += this.method1160(field1142[var19], field1157[var19] * var14 >> 15, this.field1156.field1170);
                        field1142[var19] += (field1158[var19] * var13 >> 16) + field1159[var19];
                    }
                }
            }
        }
        if (this.field1155 != null) {
            this.field1155.method1187();
            this.field1144.method1187();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1155.method1176(arg0);
                int var26 = this.field1144.method1176(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1155.field1169 - this.field1155.field1172) * var25 >> 8) + this.field1155.field1172;
                } else {
                    var27 = ((this.field1155.field1169 - this.field1155.field1172) * var26 >> 8) + this.field1155.field1172;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1151[var24] = 0;
                }
            }
        }
        if (this.field1148 > 0 && this.field1146 > 0) {
            int var28 = (int) ((double) this.field1148 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1151[var29] += field1151[var29 - var28] * this.field1146 / 100;
            }
        }
        if (this.field1147.field1225[0] > 0 || this.field1147.field1225[1] > 0) {
            this.field1134.method1187();
            int var30 = this.field1134.method1176(arg0 + 1);
            int var31 = this.field1147.method1263(0, (float) var30 / 65536.0F);
            int var32 = this.field1147.method1263(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1151[var31 + var33] * (long) Statics.field1231 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1151[var31 + var33 - 1 - var36] * (long) class64.field1229[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1151[var33 - 1 - var37] * (long) class64.field1229[1][var37] >> 16);
                    }
                    field1151[var33] = var35;
                    var30 = this.field1134.method1176(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1151[var31 + var33] * (long) Statics.field1231 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1151[var31 + var33 - 1 - var40] * (long) class64.field1229[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1151[var33 - 1 - var41] * (long) class64.field1229[1][var41] >> 16);
                        }
                        field1151[var33] = var39;
                        var30 = this.field1134.method1176(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1151[var31 + var33 - 1 - var43] * (long) class64.field1229[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1151[var33 - 1 - var44] * (long) class64.field1229[1][var44] >> 16);
                            }
                            field1151[var33] = var42;
                            this.field1134.method1176(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1147.method1263(0, (float) var30 / 65536.0F);
                    var32 = this.field1147.method1263(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1151[var46] < -32768) {
                field1151[var46] = -32768;
            }
            if (field1151[var46] > 32767) {
                field1151[var46] = 32767;
            }
        }
        return field1151;
    }

    @ObfuscatedName("bd.r(III)I")
    public final int method1160(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1153[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1152[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bd.u(Ldf;)V")
    public final void method1161(class126 arg0) {
        this.field1156 = new class56();
        this.field1156.method1173(arg0);
        this.field1141 = new class56();
        this.field1141.method1173(arg0);
        int var2 = arg0.method2481();
        if (var2 != 0) {
            arg0.field2016--;
            this.field1136 = new class56();
            this.field1136.method1173(arg0);
            this.field1137 = new class56();
            this.field1137.method1173(arg0);
        }
        int var3 = arg0.method2481();
        if (var3 != 0) {
            arg0.field2016--;
            this.field1149 = new class56();
            this.field1149.method1173(arg0);
            this.field1139 = new class56();
            this.field1139.method1173(arg0);
        }
        int var4 = arg0.method2481();
        if (var4 != 0) {
            arg0.field2016--;
            this.field1155 = new class56();
            this.field1155.method1173(arg0);
            this.field1144 = new class56();
            this.field1144.method1173(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2391();
            if (var6 == 0) {
                break;
            }
            this.field1140[var5] = var6;
            this.field1143[var5] = arg0.method2390();
            this.field1138[var5] = arg0.method2391();
        }
        this.field1148 = arg0.method2391();
        this.field1146 = arg0.method2391();
        this.field1145 = arg0.method2373();
        this.field1150 = arg0.method2373();
        this.field1147 = new class64();
        this.field1134 = new class56();
        this.field1147.method1264(arg0, this.field1134);
    }
}
