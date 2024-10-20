package deob;

import java.util.Random;

@ObfuscatedName("bd")
public class class71 {

    @ObfuscatedName("bd.f")
    public class59 field1182;

    @ObfuscatedName("bd.i")
    public class59 field1174;

    @ObfuscatedName("bd.u")
    public class59 field1175;

    @ObfuscatedName("bd.h")
    public class59 field1194;

    @ObfuscatedName("bd.r")
    public class59 field1184;

    @ObfuscatedName("bd.o")
    public class59 field1193;

    @ObfuscatedName("bd.l")
    public class59 field1179;

    @ObfuscatedName("bd.n")
    public class59 field1176;

    @ObfuscatedName("bd.m")
    public int[] field1181 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bd.w")
    public int[] field1180 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bd.j")
    public int[] field1178 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bd.s")
    public int field1188 = 0;

    @ObfuscatedName("bd.q")
    public int field1185 = 100;

    @ObfuscatedName("bd.d")
    public class68 field1183;

    @ObfuscatedName("bd.p")
    public class59 field1187;

    @ObfuscatedName("bd.y")
    public int field1177 = 500;

    @ObfuscatedName("bd.a")
    public int field1189 = 0;

    @ObfuscatedName("bd.v")
    public static int[] field1190;

    @ObfuscatedName("bd.z")
    public static int[] field1191 = new int[32768];

    @ObfuscatedName("bd.x")
    public static int[] field1192;

    @ObfuscatedName("bd.b")
    public static int[] field1198;

    @ObfuscatedName("bd.k")
    public static int[] field1195;

    @ObfuscatedName("bd.t")
    public static int[] field1196;

    @ObfuscatedName("bd.c")
    public static int[] field1197;

    @ObfuscatedName("bd.e")
    public static int[] field1186;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1191[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1192 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1192[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1190 = new int[220500];
        field1198 = new int[5];
        field1195 = new int[5];
        field1196 = new int[5];
        field1197 = new int[5];
        field1186 = new int[5];
    }

    @ObfuscatedName("bd.f(II)[I")
    public final int[] method1315(int arg0, int arg1) {
        class164.method2942(field1190, 0, arg0);
        if (arg1 < 10) {
            return field1190;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1182.method1118();
        this.field1174.method1118();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1175 != null) {
            this.field1175.method1118();
            this.field1194.method1118();
            var5 = (int) ((double) (this.field1175.field1090 - this.field1175.field1089) * 32.768D / var3);
            var6 = (int) ((double) this.field1175.field1089 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1184 != null) {
            this.field1184.method1118();
            this.field1193.method1118();
            var8 = (int) ((double) (this.field1184.field1090 - this.field1184.field1089) * 32.768D / var3);
            var9 = (int) ((double) this.field1184.field1089 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1181[var11] != 0) {
                field1198[var11] = 0;
                field1195[var11] = (int) ((double) this.field1178[var11] * var3);
                field1196[var11] = (this.field1181[var11] << 14) / 100;
                field1197[var11] = (int) ((double) (this.field1182.field1090 - this.field1182.field1089) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1180[var11]) / var3);
                field1186[var11] = (int) ((double) this.field1182.field1089 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1182.method1119(arg0);
            int var14 = this.field1174.method1119(arg0);
            if (this.field1175 != null) {
                int var15 = this.field1175.method1119(arg0);
                int var16 = this.field1194.method1119(arg0);
                var13 += this.method1319(var7, var16, this.field1175.field1088) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1184 != null) {
                int var17 = this.field1184.method1119(arg0);
                int var18 = this.field1193.method1119(arg0);
                var14 = var14 * ((this.method1319(var10, var18, this.field1184.field1088) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1181[var19] != 0) {
                    int var20 = field1195[var19] + var12;
                    if (var20 < arg0) {
                        field1190[var20] += this.method1319(field1198[var19], field1196[var19] * var14 >> 15, this.field1182.field1088);
                        field1198[var19] += (field1197[var19] * var13 >> 16) + field1186[var19];
                    }
                }
            }
        }
        if (this.field1179 != null) {
            this.field1179.method1118();
            this.field1176.method1118();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1179.method1119(arg0);
                int var26 = this.field1176.method1119(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1179.field1090 - this.field1179.field1089) * var25 >> 8) + this.field1179.field1089;
                } else {
                    var27 = ((this.field1179.field1090 - this.field1179.field1089) * var26 >> 8) + this.field1179.field1089;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1190[var24] = 0;
                }
            }
        }
        if (this.field1188 > 0 && this.field1185 > 0) {
            int var28 = (int) ((double) this.field1188 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1190[var29] += field1190[var29 - var28] * this.field1185 / 100;
            }
        }
        if (this.field1183.field1156[0] > 0 || this.field1183.field1156[1] > 0) {
            this.field1187.method1118();
            int var30 = this.field1187.method1119(arg0 + 1);
            int var31 = this.field1183.method1305(0, (float) var30 / 65536.0F);
            int var32 = this.field1183.method1305(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1190[var31 + var33] * (long) Statics.field1161 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1190[var31 + var33 - 1 - var36] * (long) class68.field1159[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1190[var33 - 1 - var37] * (long) class68.field1159[1][var37] >> 16);
                    }
                    field1190[var33] = var35;
                    var30 = this.field1187.method1119(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1190[var31 + var33] * (long) Statics.field1161 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1190[var31 + var33 - 1 - var40] * (long) class68.field1159[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1190[var33 - 1 - var41] * (long) class68.field1159[1][var41] >> 16);
                        }
                        field1190[var33] = var39;
                        var30 = this.field1187.method1119(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1190[var31 + var33 - 1 - var43] * (long) class68.field1159[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1190[var33 - 1 - var44] * (long) class68.field1159[1][var44] >> 16);
                            }
                            field1190[var33] = var42;
                            this.field1187.method1119(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1183.method1305(0, (float) var30 / 65536.0F);
                    var32 = this.field1183.method1305(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1190[var46] < -32768) {
                field1190[var46] = -32768;
            }
            if (field1190[var46] > 32767) {
                field1190[var46] = 32767;
            }
        }
        return field1190;
    }

    @ObfuscatedName("bd.i(III)I")
    public final int method1319(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1192[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1191[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bd.u(Leo;)V")
    public final void method1321(class154 arg0) {
        this.field1182 = new class59();
        this.field1182.method1116(arg0);
        this.field1174 = new class59();
        this.field1174.method1116(arg0);
        int var2 = arg0.method2666();
        if (var2 != 0) {
            arg0.field2111--;
            this.field1175 = new class59();
            this.field1175.method1116(arg0);
            this.field1194 = new class59();
            this.field1194.method1116(arg0);
        }
        int var3 = arg0.method2666();
        if (var3 != 0) {
            arg0.field2111--;
            this.field1184 = new class59();
            this.field1184.method1116(arg0);
            this.field1193 = new class59();
            this.field1193.method1116(arg0);
        }
        int var4 = arg0.method2666();
        if (var4 != 0) {
            arg0.field2111--;
            this.field1179 = new class59();
            this.field1179.method1116(arg0);
            this.field1176 = new class59();
            this.field1176.method1116(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2679();
            if (var6 == 0) {
                break;
            }
            this.field1181[var5] = var6;
            this.field1180[var5] = arg0.method2719();
            this.field1178[var5] = arg0.method2679();
        }
        this.field1188 = arg0.method2679();
        this.field1185 = arg0.method2679();
        this.field1177 = arg0.method2668();
        this.field1189 = arg0.method2668();
        this.field1183 = new class68();
        this.field1187 = new class59();
        this.field1183.method1297(arg0, this.field1187);
    }
}
