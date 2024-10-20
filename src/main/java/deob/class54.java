package deob;

import java.util.Random;

@ObfuscatedName("bt")
public class class54 {

    @ObfuscatedName("bt.i")
    public class56 field1165;

    @ObfuscatedName("bt.p")
    public class56 field1154;

    @ObfuscatedName("bt.a")
    public class56 field1170;

    @ObfuscatedName("bt.l")
    public class56 field1167;

    @ObfuscatedName("bt.q")
    public class56 field1157;

    @ObfuscatedName("bt.b")
    public class56 field1158;

    @ObfuscatedName("bt.u")
    public class56 field1177;

    @ObfuscatedName("bt.d")
    public class56 field1153;

    @ObfuscatedName("bt.m")
    public int[] field1155 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bt.v")
    public int[] field1162 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bt.j")
    public int[] field1163 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bt.f")
    public int field1164 = 0;

    @ObfuscatedName("bt.h")
    public int field1156 = 100;

    @ObfuscatedName("bt.o")
    public class64 field1166;

    @ObfuscatedName("bt.z")
    public class56 field1161;

    @ObfuscatedName("bt.k")
    public int field1168 = 500;

    @ObfuscatedName("bt.y")
    public int field1169 = 0;

    @ObfuscatedName("bt.g")
    public static int[] field1159;

    @ObfuscatedName("bt.e")
    public static int[] field1172 = new int[32768];

    @ObfuscatedName("bt.s")
    public static int[] field1174;

    @ObfuscatedName("bt.r")
    public static int[] field1160;

    @ObfuscatedName("bt.w")
    public static int[] field1175;

    @ObfuscatedName("bt.x")
    public static int[] field1176;

    @ObfuscatedName("bt.n")
    public static int[] field1171;

    @ObfuscatedName("bt.c")
    public static int[] field1178;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1172[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1174 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1174[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1159 = new int[220500];
        field1160 = new int[5];
        field1175 = new int[5];
        field1176 = new int[5];
        field1171 = new int[5];
        field1178 = new int[5];
    }

    @ObfuscatedName("bt.i(II)[I")
    public final int[] method1182(int arg0, int arg1) {
        class128.method2614(field1159, 0, arg0);
        if (arg1 < 10) {
            return field1159;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1165.method1199();
        this.field1154.method1199();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1170 != null) {
            this.field1170.method1199();
            this.field1167.method1199();
            var5 = (int) ((double) (this.field1170.field1193 - this.field1170.field1197) * 32.768D / var3);
            var6 = (int) ((double) this.field1170.field1197 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1157 != null) {
            this.field1157.method1199();
            this.field1158.method1199();
            var8 = (int) ((double) (this.field1157.field1193 - this.field1157.field1197) * 32.768D / var3);
            var9 = (int) ((double) this.field1157.field1197 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1155[var11] != 0) {
                field1160[var11] = 0;
                field1175[var11] = (int) ((double) this.field1163[var11] * var3);
                field1176[var11] = (this.field1155[var11] << 14) / 100;
                field1171[var11] = (int) ((double) (this.field1165.field1193 - this.field1165.field1197) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1162[var11]) / var3);
                field1178[var11] = (int) ((double) this.field1165.field1197 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1165.method1200(arg0);
            int var14 = this.field1154.method1200(arg0);
            if (this.field1170 != null) {
                int var15 = this.field1170.method1200(arg0);
                int var16 = this.field1167.method1200(arg0);
                var13 += this.method1184(var7, var16, this.field1170.field1195) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1157 != null) {
                int var17 = this.field1157.method1200(arg0);
                int var18 = this.field1158.method1200(arg0);
                var14 = var14 * ((this.method1184(var10, var18, this.field1157.field1195) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1155[var19] != 0) {
                    int var20 = field1175[var19] + var12;
                    if (var20 < arg0) {
                        field1159[var20] += this.method1184(field1160[var19], field1176[var19] * var14 >> 15, this.field1165.field1195);
                        field1160[var19] += (field1171[var19] * var13 >> 16) + field1178[var19];
                    }
                }
            }
        }
        if (this.field1177 != null) {
            this.field1177.method1199();
            this.field1153.method1199();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1177.method1200(arg0);
                int var26 = this.field1153.method1200(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1177.field1193 - this.field1177.field1197) * var25 >> 8) + this.field1177.field1197;
                } else {
                    var27 = ((this.field1177.field1193 - this.field1177.field1197) * var26 >> 8) + this.field1177.field1197;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1159[var24] = 0;
                }
            }
        }
        if (this.field1164 > 0 && this.field1156 > 0) {
            int var28 = (int) ((double) this.field1164 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1159[var29] += field1159[var29 - var28] * this.field1156 / 100;
            }
        }
        if (this.field1166.field1246[0] > 0 || this.field1166.field1246[1] > 0) {
            this.field1161.method1199();
            int var30 = this.field1161.method1200(arg0 + 1);
            int var31 = this.field1166.method1276(0, (float) var30 / 65536.0F);
            int var32 = this.field1166.method1276(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1159[var31 + var33] * (long) Statics.field1243 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1159[var31 + var33 - 1 - var36] * (long) class64.field1249[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1159[var33 - 1 - var37] * (long) class64.field1249[1][var37] >> 16);
                    }
                    field1159[var33] = var35;
                    var30 = this.field1161.method1200(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1159[var31 + var33] * (long) Statics.field1243 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1159[var31 + var33 - 1 - var40] * (long) class64.field1249[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1159[var33 - 1 - var41] * (long) class64.field1249[1][var41] >> 16);
                        }
                        field1159[var33] = var39;
                        var30 = this.field1161.method1200(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1159[var31 + var33 - 1 - var43] * (long) class64.field1249[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1159[var33 - 1 - var44] * (long) class64.field1249[1][var44] >> 16);
                            }
                            field1159[var33] = var42;
                            this.field1161.method1200(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1166.method1276(0, (float) var30 / 65536.0F);
                    var32 = this.field1166.method1276(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1159[var46] < -32768) {
                field1159[var46] = -32768;
            }
            if (field1159[var46] > 32767) {
                field1159[var46] = 32767;
            }
        }
        return field1159;
    }

    @ObfuscatedName("bt.p(III)I")
    public final int method1184(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1174[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1172[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bt.a(Ldn;)V")
    public final void method1183(class127 arg0) {
        this.field1165 = new class56();
        this.field1165.method1204(arg0);
        this.field1154 = new class56();
        this.field1154.method1204(arg0);
        int var2 = arg0.method2411();
        if (var2 != 0) {
            arg0.field2037--;
            this.field1170 = new class56();
            this.field1170.method1204(arg0);
            this.field1167 = new class56();
            this.field1167.method1204(arg0);
        }
        int var3 = arg0.method2411();
        if (var3 != 0) {
            arg0.field2037--;
            this.field1157 = new class56();
            this.field1157.method1204(arg0);
            this.field1158 = new class56();
            this.field1158.method1204(arg0);
        }
        int var4 = arg0.method2411();
        if (var4 != 0) {
            arg0.field2037--;
            this.field1177 = new class56();
            this.field1177.method1204(arg0);
            this.field1153 = new class56();
            this.field1153.method1204(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2424();
            if (var6 == 0) {
                break;
            }
            this.field1155[var5] = var6;
            this.field1162[var5] = arg0.method2423();
            this.field1163[var5] = arg0.method2424();
        }
        this.field1164 = arg0.method2424();
        this.field1156 = arg0.method2424();
        this.field1168 = arg0.method2413();
        this.field1169 = arg0.method2413();
        this.field1166 = new class64();
        this.field1161 = new class56();
        this.field1166.method1278(arg0, this.field1161);
    }
}
