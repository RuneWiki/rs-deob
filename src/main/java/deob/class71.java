package deob;

import java.util.Random;

@ObfuscatedName("bf")
public class class71 {

    @ObfuscatedName("bf.n")
    public class59 field1149;

    @ObfuscatedName("bf.d")
    public class59 field1143;

    @ObfuscatedName("bf.m")
    public class59 field1142;

    @ObfuscatedName("bf.h")
    public class59 field1145;

    @ObfuscatedName("bf.w")
    public class59 field1165;

    @ObfuscatedName("bf.r")
    public class59 field1158;

    @ObfuscatedName("bf.c")
    public class59 field1148;

    @ObfuscatedName("bf.p")
    public class59 field1152;

    @ObfuscatedName("bf.g")
    public int[] field1150 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bf.z")
    public int[] field1151 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bf.q")
    public int[] field1144 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bf.l")
    public int field1153 = 0;

    @ObfuscatedName("bf.y")
    public int field1154 = 100;

    @ObfuscatedName("bf.e")
    public class68 field1155;

    @ObfuscatedName("bf.x")
    public class59 field1156;

    @ObfuscatedName("bf.f")
    public int field1157 = 500;

    @ObfuscatedName("bf.s")
    public int field1161 = 0;

    @ObfuscatedName("bf.o")
    public static int[] field1146;

    @ObfuscatedName("bf.i")
    public static int[] field1160 = new int[32768];

    @ObfuscatedName("bf.a")
    public static int[] field1159;

    @ObfuscatedName("bf.j")
    public static int[] field1163;

    @ObfuscatedName("bf.k")
    public static int[] field1164;

    @ObfuscatedName("bf.v")
    public static int[] field1147;

    @ObfuscatedName("bf.u")
    public static int[] field1166;

    @ObfuscatedName("bf.t")
    public static int[] field1167;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1160[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1159 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1159[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1146 = new int[220500];
        field1163 = new int[5];
        field1164 = new int[5];
        field1147 = new int[5];
        field1166 = new int[5];
        field1167 = new int[5];
    }

    @ObfuscatedName("bf.n(II)[I")
    public final int[] method1305(int arg0, int arg1) {
        class171.method3069(field1146, 0, arg0);
        if (arg1 < 10) {
            return field1146;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1149.method1065();
        this.field1143.method1065();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1142 != null) {
            this.field1142.method1065();
            this.field1145.method1065();
            var5 = (int) ((double) (this.field1142.field1064 - this.field1142.field1059) * 32.768D / var3);
            var6 = (int) ((double) this.field1142.field1059 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1165 != null) {
            this.field1165.method1065();
            this.field1158.method1065();
            var8 = (int) ((double) (this.field1165.field1064 - this.field1165.field1059) * 32.768D / var3);
            var9 = (int) ((double) this.field1165.field1059 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1150[var11] != 0) {
                field1163[var11] = 0;
                field1164[var11] = (int) ((double) this.field1144[var11] * var3);
                field1147[var11] = (this.field1150[var11] << 14) / 100;
                field1166[var11] = (int) ((double) (this.field1149.field1064 - this.field1149.field1059) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1151[var11]) / var3);
                field1167[var11] = (int) ((double) this.field1149.field1059 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1149.method1066(arg0);
            int var14 = this.field1143.method1066(arg0);
            if (this.field1142 != null) {
                int var15 = this.field1142.method1066(arg0);
                int var16 = this.field1145.method1066(arg0);
                var13 += this.method1306(var7, var16, this.field1142.field1062) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1165 != null) {
                int var17 = this.field1165.method1066(arg0);
                int var18 = this.field1158.method1066(arg0);
                var14 = var14 * ((this.method1306(var10, var18, this.field1165.field1062) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1150[var19] != 0) {
                    int var20 = field1164[var19] + var12;
                    if (var20 < arg0) {
                        field1146[var20] += this.method1306(field1163[var19], field1147[var19] * var14 >> 15, this.field1149.field1062);
                        field1163[var19] += (field1166[var19] * var13 >> 16) + field1167[var19];
                    }
                }
            }
        }
        if (this.field1148 != null) {
            this.field1148.method1065();
            this.field1152.method1065();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1148.method1066(arg0);
                int var26 = this.field1152.method1066(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1148.field1064 - this.field1148.field1059) * var25 >> 8) + this.field1148.field1059;
                } else {
                    var27 = ((this.field1148.field1064 - this.field1148.field1059) * var26 >> 8) + this.field1148.field1059;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1146[var24] = 0;
                }
            }
        }
        if (this.field1153 > 0 && this.field1154 > 0) {
            int var28 = (int) ((double) this.field1153 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1146[var29] += field1146[var29 - var28] * this.field1154 / 100;
            }
        }
        if (this.field1155.field1127[0] > 0 || this.field1155.field1127[1] > 0) {
            this.field1156.method1065();
            int var30 = this.field1156.method1066(arg0 + 1);
            int var31 = this.field1155.method1297(0, (float) var30 / 65536.0F);
            int var32 = this.field1155.method1297(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1146[var31 + var33] * (long) Statics.field1130 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1146[var31 + var33 - 1 - var36] * (long) class68.field1128[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1146[var33 - 1 - var37] * (long) class68.field1128[1][var37] >> 16);
                    }
                    field1146[var33] = var35;
                    var30 = this.field1156.method1066(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1146[var31 + var33] * (long) Statics.field1130 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1146[var31 + var33 - 1 - var40] * (long) class68.field1128[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1146[var33 - 1 - var41] * (long) class68.field1128[1][var41] >> 16);
                        }
                        field1146[var33] = var39;
                        var30 = this.field1156.method1066(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1146[var31 + var33 - 1 - var43] * (long) class68.field1128[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1146[var33 - 1 - var44] * (long) class68.field1128[1][var44] >> 16);
                            }
                            field1146[var33] = var42;
                            this.field1156.method1066(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1155.method1297(0, (float) var30 / 65536.0F);
                    var32 = this.field1155.method1297(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1146[var46] < -32768) {
                field1146[var46] = -32768;
            }
            if (field1146[var46] > 32767) {
                field1146[var46] = 32767;
            }
        }
        return field1146;
    }

    @ObfuscatedName("bf.d(III)I")
    public final int method1306(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1159[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1160[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bf.m(Lfa;)V")
    public final void method1307(class161 arg0) {
        this.field1149 = new class59();
        this.field1149.method1063(arg0);
        this.field1143 = new class59();
        this.field1143.method1063(arg0);
        int var2 = arg0.method2823();
        if (var2 != 0) {
            arg0.field2285--;
            this.field1142 = new class59();
            this.field1142.method1063(arg0);
            this.field1145 = new class59();
            this.field1145.method1063(arg0);
        }
        int var3 = arg0.method2823();
        if (var3 != 0) {
            arg0.field2285--;
            this.field1165 = new class59();
            this.field1165.method1063(arg0);
            this.field1158 = new class59();
            this.field1158.method1063(arg0);
        }
        int var4 = arg0.method2823();
        if (var4 != 0) {
            arg0.field2285--;
            this.field1148 = new class59();
            this.field1148.method1063(arg0);
            this.field1152 = new class59();
            this.field1152.method1063(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2793();
            if (var6 == 0) {
                break;
            }
            this.field1150[var5] = var6;
            this.field1151[var5] = arg0.method2792();
            this.field1144[var5] = arg0.method2793();
        }
        this.field1153 = arg0.method2793();
        this.field1154 = arg0.method2793();
        this.field1157 = arg0.method2887();
        this.field1161 = arg0.method2887();
        this.field1155 = new class68();
        this.field1156 = new class59();
        this.field1155.method1299(arg0, this.field1156);
    }
}
