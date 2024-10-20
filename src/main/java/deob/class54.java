package deob;

import java.util.Random;

@ObfuscatedName("br")
public class class54 {

    @ObfuscatedName("br.f")
    public class56 field1154;

    @ObfuscatedName("br.t")
    public class56 field1136;

    @ObfuscatedName("br.n")
    public class56 field1146;

    @ObfuscatedName("br.e")
    public class56 field1138;

    @ObfuscatedName("br.l")
    public class56 field1139;

    @ObfuscatedName("br.d")
    public class56 field1140;

    @ObfuscatedName("br.r")
    public class56 field1141;

    @ObfuscatedName("br.k")
    public class56 field1143;

    @ObfuscatedName("br.u")
    public int[] field1142 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("br.o")
    public int[] field1148 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("br.g")
    public int[] field1145 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("br.s")
    public int field1151 = 0;

    @ObfuscatedName("br.b")
    public int field1147 = 100;

    @ObfuscatedName("br.v")
    public class64 field1135;

    @ObfuscatedName("br.j")
    public class56 field1149;

    @ObfuscatedName("br.q")
    public int field1150 = 500;

    @ObfuscatedName("br.a")
    public int field1137 = 0;

    @ObfuscatedName("br.c")
    public static int[] field1152;

    @ObfuscatedName("br.m")
    public static int[] field1153 = new int[32768];

    @ObfuscatedName("br.z")
    public static int[] field1144;

    @ObfuscatedName("br.h")
    public static int[] field1156;

    @ObfuscatedName("br.y")
    public static int[] field1157;

    @ObfuscatedName("br.x")
    public static int[] field1158;

    @ObfuscatedName("br.p")
    public static int[] field1159;

    @ObfuscatedName("br.i")
    public static int[] field1160;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1153[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1144 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1144[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1152 = new int[220500];
        field1156 = new int[5];
        field1157 = new int[5];
        field1158 = new int[5];
        field1159 = new int[5];
        field1160 = new int[5];
    }

    @ObfuscatedName("br.f(II)[I")
    public final int[] method1237(int arg0, int arg1) {
        class128.method2662(field1152, 0, arg0);
        if (arg1 < 10) {
            return field1152;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1154.method1256();
        this.field1136.method1256();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1146 != null) {
            this.field1146.method1256();
            this.field1138.method1256();
            var5 = (int) ((double) (this.field1146.field1176 - this.field1146.field1180) * 32.768D / var3);
            var6 = (int) ((double) this.field1146.field1180 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1139 != null) {
            this.field1139.method1256();
            this.field1140.method1256();
            var8 = (int) ((double) (this.field1139.field1176 - this.field1139.field1180) * 32.768D / var3);
            var9 = (int) ((double) this.field1139.field1180 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1142[var11] != 0) {
                field1156[var11] = 0;
                field1157[var11] = (int) ((double) this.field1145[var11] * var3);
                field1158[var11] = (this.field1142[var11] << 14) / 100;
                field1159[var11] = (int) ((double) (this.field1154.field1176 - this.field1154.field1180) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1148[var11]) / var3);
                field1160[var11] = (int) ((double) this.field1154.field1180 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1154.method1257(arg0);
            int var14 = this.field1136.method1257(arg0);
            if (this.field1146 != null) {
                int var15 = this.field1146.method1257(arg0);
                int var16 = this.field1138.method1257(arg0);
                var13 += this.method1236(var7, var16, this.field1146.field1175) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1139 != null) {
                int var17 = this.field1139.method1257(arg0);
                int var18 = this.field1140.method1257(arg0);
                var14 = var14 * ((this.method1236(var10, var18, this.field1139.field1175) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1142[var19] != 0) {
                    int var20 = field1157[var19] + var12;
                    if (var20 < arg0) {
                        field1152[var20] += this.method1236(field1156[var19], field1158[var19] * var14 >> 15, this.field1154.field1175);
                        field1156[var19] += (field1159[var19] * var13 >> 16) + field1160[var19];
                    }
                }
            }
        }
        if (this.field1141 != null) {
            this.field1141.method1256();
            this.field1143.method1256();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1141.method1257(arg0);
                int var26 = this.field1143.method1257(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1141.field1176 - this.field1141.field1180) * var25 >> 8) + this.field1141.field1180;
                } else {
                    var27 = ((this.field1141.field1176 - this.field1141.field1180) * var26 >> 8) + this.field1141.field1180;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1152[var24] = 0;
                }
            }
        }
        if (this.field1151 > 0 && this.field1147 > 0) {
            int var28 = (int) ((double) this.field1151 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1152[var29] += field1152[var29 - var28] * this.field1147 / 100;
            }
        }
        if (this.field1135.field1226[0] > 0 || this.field1135.field1226[1] > 0) {
            this.field1149.method1256();
            int var30 = this.field1149.method1257(arg0 + 1);
            int var31 = this.field1135.method1357(0, (float) var30 / 65536.0F);
            int var32 = this.field1135.method1357(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1152[var31 + var33] * (long) Statics.field1232 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1152[var31 + var33 - 1 - var36] * (long) class64.field1230[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1152[var33 - 1 - var37] * (long) class64.field1230[1][var37] >> 16);
                    }
                    field1152[var33] = var35;
                    var30 = this.field1149.method1257(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1152[var31 + var33] * (long) Statics.field1232 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1152[var31 + var33 - 1 - var40] * (long) class64.field1230[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1152[var33 - 1 - var41] * (long) class64.field1230[1][var41] >> 16);
                        }
                        field1152[var33] = var39;
                        var30 = this.field1149.method1257(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1152[var31 + var33 - 1 - var43] * (long) class64.field1230[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1152[var33 - 1 - var44] * (long) class64.field1230[1][var44] >> 16);
                            }
                            field1152[var33] = var42;
                            this.field1149.method1257(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1135.method1357(0, (float) var30 / 65536.0F);
                    var32 = this.field1135.method1357(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1152[var46] < -32768) {
                field1152[var46] = -32768;
            }
            if (field1152[var46] > 32767) {
                field1152[var46] = 32767;
            }
        }
        return field1152;
    }

    @ObfuscatedName("br.t(III)I")
    public final int method1236(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1144[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1153[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("br.n(Ldq;)V")
    public final void method1239(class127 arg0) {
        this.field1154 = new class56();
        this.field1154.method1266(arg0);
        this.field1136 = new class56();
        this.field1136.method1266(arg0);
        int var2 = arg0.method2458();
        if (var2 != 0) {
            arg0.field2033--;
            this.field1146 = new class56();
            this.field1146.method1266(arg0);
            this.field1138 = new class56();
            this.field1138.method1266(arg0);
        }
        int var3 = arg0.method2458();
        if (var3 != 0) {
            arg0.field2033--;
            this.field1139 = new class56();
            this.field1139.method1266(arg0);
            this.field1140 = new class56();
            this.field1140.method1266(arg0);
        }
        int var4 = arg0.method2458();
        if (var4 != 0) {
            arg0.field2033--;
            this.field1141 = new class56();
            this.field1141.method1266(arg0);
            this.field1143 = new class56();
            this.field1143.method1266(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2471();
            if (var6 == 0) {
                break;
            }
            this.field1142[var5] = var6;
            this.field1148[var5] = arg0.method2521();
            this.field1145[var5] = arg0.method2471();
        }
        this.field1151 = arg0.method2471();
        this.field1147 = arg0.method2471();
        this.field1150 = arg0.method2460();
        this.field1137 = arg0.method2460();
        this.field1135 = new class64();
        this.field1149 = new class56();
        this.field1135.method1351(arg0, this.field1149);
    }
}
