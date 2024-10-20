package deob;

import java.util.Random;

@ObfuscatedName("bd")
public class class53 {

    @ObfuscatedName("bd.c")
    public class55 field1140;

    @ObfuscatedName("bd.j")
    public class55 field1157;

    @ObfuscatedName("bd.f")
    public class55 field1134;

    @ObfuscatedName("bd.y")
    public class55 field1142;

    @ObfuscatedName("bd.x")
    public class55 field1136;

    @ObfuscatedName("bd.e")
    public class55 field1137;

    @ObfuscatedName("bd.m")
    public class55 field1138;

    @ObfuscatedName("bd.s")
    public class55 field1152;

    @ObfuscatedName("bd.p")
    public int[] field1135 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bd.w")
    public int[] field1141 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bd.r")
    public int[] field1133 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bd.n")
    public int field1143 = 0;

    @ObfuscatedName("bd.b")
    public int field1144 = 100;

    @ObfuscatedName("bd.z")
    public class63 field1155;

    @ObfuscatedName("bd.h")
    public class55 field1154;

    @ObfuscatedName("bd.q")
    public int field1139 = 500;

    @ObfuscatedName("bd.l")
    public int field1148 = 0;

    @ObfuscatedName("bd.t")
    public static int[] field1149;

    @ObfuscatedName("bd.g")
    public static int[] field1150 = new int[32768];

    @ObfuscatedName("bd.a")
    public static int[] field1151;

    @ObfuscatedName("bd.i")
    public static int[] field1153;

    @ObfuscatedName("bd.k")
    public static int[] field1132;

    @ObfuscatedName("bd.o")
    public static int[] field1146;

    @ObfuscatedName("bd.d")
    public static int[] field1156;

    @ObfuscatedName("bd.u")
    public static int[] field1147;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1150[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1151 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1151[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1149 = new int[220500];
        field1153 = new int[5];
        field1132 = new int[5];
        field1146 = new int[5];
        field1156 = new int[5];
        field1147 = new int[5];
    }

    @ObfuscatedName("bd.c(II)[I")
    public final int[] method1181(int arg0, int arg1) {
        class127.method2535(field1149, 0, arg0);
        if (arg1 < 10) {
            return field1149;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1140.method1194();
        this.field1157.method1194();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1134 != null) {
            this.field1134.method1194();
            this.field1142.method1194();
            var5 = (int) ((double) (this.field1134.field1167 - this.field1134.field1169) * 32.768D / var3);
            var6 = (int) ((double) this.field1134.field1169 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1136 != null) {
            this.field1136.method1194();
            this.field1137.method1194();
            var8 = (int) ((double) (this.field1136.field1167 - this.field1136.field1169) * 32.768D / var3);
            var9 = (int) ((double) this.field1136.field1169 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1135[var11] != 0) {
                field1153[var11] = 0;
                field1132[var11] = (int) ((double) this.field1133[var11] * var3);
                field1146[var11] = (this.field1135[var11] << 14) / 100;
                field1156[var11] = (int) ((double) (this.field1140.field1167 - this.field1140.field1169) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1141[var11]) / var3);
                field1147[var11] = (int) ((double) this.field1140.field1169 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1140.method1206(arg0);
            int var14 = this.field1157.method1206(arg0);
            if (this.field1134 != null) {
                int var15 = this.field1134.method1206(arg0);
                int var16 = this.field1142.method1206(arg0);
                var13 += this.method1177(var7, var16, this.field1134.field1170) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1136 != null) {
                int var17 = this.field1136.method1206(arg0);
                int var18 = this.field1137.method1206(arg0);
                var14 = var14 * ((this.method1177(var10, var18, this.field1136.field1170) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1135[var19] != 0) {
                    int var20 = field1132[var19] + var12;
                    if (var20 < arg0) {
                        field1149[var20] += this.method1177(field1153[var19], field1146[var19] * var14 >> 15, this.field1140.field1170);
                        field1153[var19] += (field1156[var19] * var13 >> 16) + field1147[var19];
                    }
                }
            }
        }
        if (this.field1138 != null) {
            this.field1138.method1194();
            this.field1152.method1194();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1138.method1206(arg0);
                int var26 = this.field1152.method1206(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1138.field1167 - this.field1138.field1169) * var25 >> 8) + this.field1138.field1169;
                } else {
                    var27 = ((this.field1138.field1167 - this.field1138.field1169) * var26 >> 8) + this.field1138.field1169;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1149[var24] = 0;
                }
            }
        }
        if (this.field1143 > 0 && this.field1144 > 0) {
            int var28 = (int) ((double) this.field1143 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1149[var29] += field1149[var29 - var28] * this.field1144 / 100;
            }
        }
        if (this.field1155.field1228[0] > 0 || this.field1155.field1228[1] > 0) {
            this.field1154.method1194();
            int var30 = this.field1154.method1206(arg0 + 1);
            int var31 = this.field1155.method1293(0, (float) var30 / 65536.0F);
            int var32 = this.field1155.method1293(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1149[var31 + var33] * (long) Statics.field1226 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1149[var31 + var33 - 1 - var36] * (long) class63.field1224[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1149[var33 - 1 - var37] * (long) class63.field1224[1][var37] >> 16);
                    }
                    field1149[var33] = var35;
                    var30 = this.field1154.method1206(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1149[var31 + var33] * (long) Statics.field1226 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1149[var31 + var33 - 1 - var40] * (long) class63.field1224[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1149[var33 - 1 - var41] * (long) class63.field1224[1][var41] >> 16);
                        }
                        field1149[var33] = var39;
                        var30 = this.field1154.method1206(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1149[var31 + var33 - 1 - var43] * (long) class63.field1224[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1149[var33 - 1 - var44] * (long) class63.field1224[1][var44] >> 16);
                            }
                            field1149[var33] = var42;
                            this.field1154.method1206(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1155.method1293(0, (float) var30 / 65536.0F);
                    var32 = this.field1155.method1293(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1149[var46] < -32768) {
                field1149[var46] = -32768;
            }
            if (field1149[var46] > 32767) {
                field1149[var46] = 32767;
            }
        }
        return field1149;
    }

    @ObfuscatedName("bd.j(III)I")
    public final int method1177(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1151[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1150[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bd.f(Ldl;)V")
    public final void method1178(class125 arg0) {
        this.field1140 = new class55();
        this.field1140.method1196(arg0);
        this.field1157 = new class55();
        this.field1157.method1196(arg0);
        int var2 = arg0.method2326();
        if (var2 != 0) {
            arg0.field2003--;
            this.field1134 = new class55();
            this.field1134.method1196(arg0);
            this.field1142 = new class55();
            this.field1142.method1196(arg0);
        }
        int var3 = arg0.method2326();
        if (var3 != 0) {
            arg0.field2003--;
            this.field1136 = new class55();
            this.field1136.method1196(arg0);
            this.field1137 = new class55();
            this.field1137.method1196(arg0);
        }
        int var4 = arg0.method2326();
        if (var4 != 0) {
            arg0.field2003--;
            this.field1138 = new class55();
            this.field1138.method1196(arg0);
            this.field1152 = new class55();
            this.field1152.method1196(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2377();
            if (var6 == 0) {
                break;
            }
            this.field1135[var5] = var6;
            this.field1141[var5] = arg0.method2338();
            this.field1133[var5] = arg0.method2377();
        }
        this.field1143 = arg0.method2377();
        this.field1144 = arg0.method2377();
        this.field1139 = arg0.method2328();
        this.field1148 = arg0.method2328();
        this.field1155 = new class63();
        this.field1154 = new class55();
        this.field1155.method1283(arg0, this.field1154);
    }
}
