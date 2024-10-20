package deob;

import java.util.Random;

@ObfuscatedName("bv")
public class class53 {

    @ObfuscatedName("bv.j")
    public class55 field1143;

    @ObfuscatedName("bv.y")
    public class55 field1130;

    @ObfuscatedName("bv.x")
    public class55 field1131;

    @ObfuscatedName("bv.z")
    public class55 field1132;

    @ObfuscatedName("bv.c")
    public class55 field1133;

    @ObfuscatedName("bv.e")
    public class55 field1134;

    @ObfuscatedName("bv.s")
    public class55 field1135;

    @ObfuscatedName("bv.i")
    public class55 field1144;

    @ObfuscatedName("bv.g")
    public int[] field1137 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bv.q")
    public int[] field1149 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bv.w")
    public int[] field1152 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bv.k")
    public int field1140 = 0;

    @ObfuscatedName("bv.v")
    public int field1142 = 100;

    @ObfuscatedName("bv.o")
    public class63 field1139;

    @ObfuscatedName("bv.m")
    public class55 field1147;

    @ObfuscatedName("bv.u")
    public int field1146 = 500;

    @ObfuscatedName("bv.r")
    public int field1136 = 0;

    @ObfuscatedName("bv.d")
    public static int[] field1141;

    @ObfuscatedName("bv.n")
    public static int[] field1145 = new int[32768];

    @ObfuscatedName("bv.b")
    public static int[] field1148;

    @ObfuscatedName("bv.t")
    public static int[] field1150;

    @ObfuscatedName("bv.l")
    public static int[] field1151;

    @ObfuscatedName("bv.a")
    public static int[] field1154;

    @ObfuscatedName("bv.f")
    public static int[] field1153;

    @ObfuscatedName("bv.h")
    public static int[] field1129;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1145[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1148 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1148[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1141 = new int[220500];
        field1150 = new int[5];
        field1151 = new int[5];
        field1154 = new int[5];
        field1153 = new int[5];
        field1129 = new int[5];
    }

    @ObfuscatedName("bv.j(II)[I")
    public final int[] method1195(int arg0, int arg1) {
        class127.method2597(field1141, 0, arg0);
        if (arg1 < 10) {
            return field1141;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1143.method1214();
        this.field1130.method1214();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1131 != null) {
            this.field1131.method1214();
            this.field1132.method1214();
            var5 = (int) ((double) (this.field1131.field1170 - this.field1131.field1175) * 32.768D / var3);
            var6 = (int) ((double) this.field1131.field1175 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1133 != null) {
            this.field1133.method1214();
            this.field1134.method1214();
            var8 = (int) ((double) (this.field1133.field1170 - this.field1133.field1175) * 32.768D / var3);
            var9 = (int) ((double) this.field1133.field1175 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1137[var11] != 0) {
                field1150[var11] = 0;
                field1151[var11] = (int) ((double) this.field1152[var11] * var3);
                field1154[var11] = (this.field1137[var11] << 14) / 100;
                field1153[var11] = (int) ((double) (this.field1143.field1170 - this.field1143.field1175) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1149[var11]) / var3);
                field1129[var11] = (int) ((double) this.field1143.field1175 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1143.method1220(arg0);
            int var14 = this.field1130.method1220(arg0);
            if (this.field1131 != null) {
                int var15 = this.field1131.method1220(arg0);
                int var16 = this.field1132.method1220(arg0);
                var13 += this.method1196(var7, var16, this.field1131.field1168) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1133 != null) {
                int var17 = this.field1133.method1220(arg0);
                int var18 = this.field1134.method1220(arg0);
                var14 = var14 * ((this.method1196(var10, var18, this.field1133.field1168) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1137[var19] != 0) {
                    int var20 = field1151[var19] + var12;
                    if (var20 < arg0) {
                        field1141[var20] += this.method1196(field1150[var19], field1154[var19] * var14 >> 15, this.field1143.field1168);
                        field1150[var19] += (field1153[var19] * var13 >> 16) + field1129[var19];
                    }
                }
            }
        }
        if (this.field1135 != null) {
            this.field1135.method1214();
            this.field1144.method1214();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1135.method1220(arg0);
                int var26 = this.field1144.method1220(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1135.field1170 - this.field1135.field1175) * var25 >> 8) + this.field1135.field1175;
                } else {
                    var27 = ((this.field1135.field1170 - this.field1135.field1175) * var26 >> 8) + this.field1135.field1175;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1141[var24] = 0;
                }
            }
        }
        if (this.field1140 > 0 && this.field1142 > 0) {
            int var28 = (int) ((double) this.field1140 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1141[var29] += field1141[var29 - var28] * this.field1142 / 100;
            }
        }
        if (this.field1139.field1221[0] > 0 || this.field1139.field1221[1] > 0) {
            this.field1147.method1214();
            int var30 = this.field1147.method1220(arg0 + 1);
            int var31 = this.field1139.method1304(0, (float) var30 / 65536.0F);
            int var32 = this.field1139.method1304(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1141[var31 + var33] * (long) Statics.field1224 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1141[var31 + var33 - 1 - var36] * (long) class63.field1222[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1141[var33 - 1 - var37] * (long) class63.field1222[1][var37] >> 16);
                    }
                    field1141[var33] = var35;
                    var30 = this.field1147.method1220(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1141[var31 + var33] * (long) Statics.field1224 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1141[var31 + var33 - 1 - var40] * (long) class63.field1222[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1141[var33 - 1 - var41] * (long) class63.field1222[1][var41] >> 16);
                        }
                        field1141[var33] = var39;
                        var30 = this.field1147.method1220(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1141[var31 + var33 - 1 - var43] * (long) class63.field1222[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1141[var33 - 1 - var44] * (long) class63.field1222[1][var44] >> 16);
                            }
                            field1141[var33] = var42;
                            this.field1147.method1220(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1139.method1304(0, (float) var30 / 65536.0F);
                    var32 = this.field1139.method1304(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1141[var46] < -32768) {
                field1141[var46] = -32768;
            }
            if (field1141[var46] > 32767) {
                field1141[var46] = 32767;
            }
        }
        return field1141;
    }

    @ObfuscatedName("bv.y(III)I")
    public final int method1196(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1148[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1145[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bv.x(Ldr;)V")
    public final void method1197(class126 arg0) {
        this.field1143 = new class55();
        this.field1143.method1223(arg0);
        this.field1130 = new class55();
        this.field1130.method1223(arg0);
        int var2 = arg0.method2399();
        if (var2 != 0) {
            arg0.field2020--;
            this.field1131 = new class55();
            this.field1131.method1223(arg0);
            this.field1132 = new class55();
            this.field1132.method1223(arg0);
        }
        int var3 = arg0.method2399();
        if (var3 != 0) {
            arg0.field2020--;
            this.field1133 = new class55();
            this.field1133.method1223(arg0);
            this.field1134 = new class55();
            this.field1134.method1223(arg0);
        }
        int var4 = arg0.method2399();
        if (var4 != 0) {
            arg0.field2020--;
            this.field1135 = new class55();
            this.field1135.method1223(arg0);
            this.field1144 = new class55();
            this.field1144.method1223(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2395();
            if (var6 == 0) {
                break;
            }
            this.field1137[var5] = var6;
            this.field1149[var5] = arg0.method2394();
            this.field1152[var5] = arg0.method2395();
        }
        this.field1140 = arg0.method2395();
        this.field1142 = arg0.method2395();
        this.field1146 = arg0.method2405();
        this.field1136 = arg0.method2405();
        this.field1139 = new class63();
        this.field1147 = new class55();
        this.field1139.method1305(arg0, this.field1147);
    }
}
