package deob;

import java.util.Random;

@ObfuscatedName("bs")
public class class53 {

    @ObfuscatedName("bs.p")
    public class55 field1146;

    @ObfuscatedName("bs.j")
    public class55 field1143;

    @ObfuscatedName("bs.w")
    public class55 field1144;

    @ObfuscatedName("bs.h")
    public class55 field1155;

    @ObfuscatedName("bs.v")
    public class55 field1151;

    @ObfuscatedName("bs.k")
    public class55 field1147;

    @ObfuscatedName("bs.g")
    public class55 field1148;

    @ObfuscatedName("bs.n")
    public class55 field1149;

    @ObfuscatedName("bs.c")
    public int[] field1150 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bs.o")
    public int[] field1157 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bs.u")
    public int[] field1152 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bs.z")
    public int field1153 = 0;

    @ObfuscatedName("bs.e")
    public int field1154 = 100;

    @ObfuscatedName("bs.l")
    public class63 field1162;

    @ObfuscatedName("bs.m")
    public class55 field1156;

    @ObfuscatedName("bs.s")
    public int field1145 = 500;

    @ObfuscatedName("bs.i")
    public int field1158 = 0;

    @ObfuscatedName("bs.y")
    public static int[] field1159;

    @ObfuscatedName("bs.d")
    public static int[] field1160 = new int[32768];

    @ObfuscatedName("bs.f")
    public static int[] field1165;

    @ObfuscatedName("bs.x")
    public static int[] field1163;

    @ObfuscatedName("bs.r")
    public static int[] field1164;

    @ObfuscatedName("bs.t")
    public static int[] field1142;

    @ObfuscatedName("bs.b")
    public static int[] field1166;

    @ObfuscatedName("bs.q")
    public static int[] field1167;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1160[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1165 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1165[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1159 = new int[220500];
        field1163 = new int[5];
        field1164 = new int[5];
        field1142 = new int[5];
        field1166 = new int[5];
        field1167 = new int[5];
    }

    @ObfuscatedName("bs.p(II)[I")
    public final int[] method1191(int arg0, int arg1) {
        class127.method2594(field1159, 0, arg0);
        if (arg1 < 10) {
            return field1159;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1146.method1203();
        this.field1143.method1203();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1144 != null) {
            this.field1144.method1203();
            this.field1155.method1203();
            var5 = (int) ((double) (this.field1144.field1183 - this.field1144.field1182) * 32.768D / var3);
            var6 = (int) ((double) this.field1144.field1182 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1151 != null) {
            this.field1151.method1203();
            this.field1147.method1203();
            var8 = (int) ((double) (this.field1151.field1183 - this.field1151.field1182) * 32.768D / var3);
            var9 = (int) ((double) this.field1151.field1182 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1150[var11] != 0) {
                field1163[var11] = 0;
                field1164[var11] = (int) ((double) this.field1152[var11] * var3);
                field1142[var11] = (this.field1150[var11] << 14) / 100;
                field1166[var11] = (int) ((double) (this.field1146.field1183 - this.field1146.field1182) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1157[var11]) / var3);
                field1167[var11] = (int) ((double) this.field1146.field1182 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1146.method1205(arg0);
            int var14 = this.field1143.method1205(arg0);
            if (this.field1144 != null) {
                int var15 = this.field1144.method1205(arg0);
                int var16 = this.field1155.method1205(arg0);
                var13 += this.method1188(var7, var16, this.field1144.field1181) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1151 != null) {
                int var17 = this.field1151.method1205(arg0);
                int var18 = this.field1147.method1205(arg0);
                var14 = var14 * ((this.method1188(var10, var18, this.field1151.field1181) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1150[var19] != 0) {
                    int var20 = field1164[var19] + var12;
                    if (var20 < arg0) {
                        field1159[var20] += this.method1188(field1163[var19], field1142[var19] * var14 >> 15, this.field1146.field1181);
                        field1163[var19] += (field1166[var19] * var13 >> 16) + field1167[var19];
                    }
                }
            }
        }
        if (this.field1148 != null) {
            this.field1148.method1203();
            this.field1149.method1203();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1148.method1205(arg0);
                int var26 = this.field1149.method1205(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1148.field1183 - this.field1148.field1182) * var25 >> 8) + this.field1148.field1182;
                } else {
                    var27 = ((this.field1148.field1183 - this.field1148.field1182) * var26 >> 8) + this.field1148.field1182;
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
        if (this.field1153 > 0 && this.field1154 > 0) {
            int var28 = (int) ((double) this.field1153 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1159[var29] += field1159[var29 - var28] * this.field1154 / 100;
            }
        }
        if (this.field1162.field1242[0] > 0 || this.field1162.field1242[1] > 0) {
            this.field1156.method1203();
            int var30 = this.field1156.method1205(arg0 + 1);
            int var31 = this.field1162.method1292(0, (float) var30 / 65536.0F);
            int var32 = this.field1162.method1292(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1159[var31 + var33] * (long) Statics.field1240 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1159[var31 + var33 - 1 - var36] * (long) class63.field1238[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1159[var33 - 1 - var37] * (long) class63.field1238[1][var37] >> 16);
                    }
                    field1159[var33] = var35;
                    var30 = this.field1156.method1205(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1159[var31 + var33] * (long) Statics.field1240 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1159[var31 + var33 - 1 - var40] * (long) class63.field1238[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1159[var33 - 1 - var41] * (long) class63.field1238[1][var41] >> 16);
                        }
                        field1159[var33] = var39;
                        var30 = this.field1156.method1205(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1159[var31 + var33 - 1 - var43] * (long) class63.field1238[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1159[var33 - 1 - var44] * (long) class63.field1238[1][var44] >> 16);
                            }
                            field1159[var33] = var42;
                            this.field1156.method1205(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1162.method1292(0, (float) var30 / 65536.0F);
                    var32 = this.field1162.method1292(1, (float) var30 / 65536.0F);
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

    @ObfuscatedName("bs.j(III)I")
    public final int method1188(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1165[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1160[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bs.w(Ldv;)V")
    public final void method1185(class126 arg0) {
        this.field1146 = new class55();
        this.field1146.method1211(arg0);
        this.field1143 = new class55();
        this.field1143.method1211(arg0);
        int var2 = arg0.method2544();
        if (var2 != 0) {
            arg0.field2043--;
            this.field1144 = new class55();
            this.field1144.method1211(arg0);
            this.field1155 = new class55();
            this.field1155.method1211(arg0);
        }
        int var3 = arg0.method2544();
        if (var3 != 0) {
            arg0.field2043--;
            this.field1151 = new class55();
            this.field1151.method1211(arg0);
            this.field1147 = new class55();
            this.field1147.method1211(arg0);
        }
        int var4 = arg0.method2544();
        if (var4 != 0) {
            arg0.field2043--;
            this.field1148 = new class55();
            this.field1148.method1211(arg0);
            this.field1149 = new class55();
            this.field1149.method1211(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2388();
            if (var6 == 0) {
                break;
            }
            this.field1150[var5] = var6;
            this.field1157[var5] = arg0.method2361();
            this.field1152[var5] = arg0.method2388();
        }
        this.field1153 = arg0.method2388();
        this.field1154 = arg0.method2388();
        this.field1145 = arg0.method2489();
        this.field1158 = arg0.method2489();
        this.field1162 = new class63();
        this.field1156 = new class55();
        this.field1162.method1289(arg0, this.field1156);
    }
}
