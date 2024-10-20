package deob;

import java.util.Random;

@ObfuscatedName("ba")
public class class54 {

    @ObfuscatedName("ba.i")
    public class56 field1175;

    @ObfuscatedName("ba.w")
    public class56 field1178;

    @ObfuscatedName("ba.f")
    public class56 field1158;

    @ObfuscatedName("ba.e")
    public class56 field1159;

    @ObfuscatedName("ba.t")
    public class56 field1160;

    @ObfuscatedName("ba.d")
    public class56 field1161;

    @ObfuscatedName("ba.p")
    public class56 field1173;

    @ObfuscatedName("ba.k")
    public class56 field1163;

    @ObfuscatedName("ba.r")
    public int[] field1164 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("ba.l")
    public int[] field1165 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("ba.a")
    public int[] field1166 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("ba.z")
    public int field1167 = 0;

    @ObfuscatedName("ba.s")
    public int field1168 = 100;

    @ObfuscatedName("ba.m")
    public class64 field1169;

    @ObfuscatedName("ba.u")
    public class56 field1170;

    @ObfuscatedName("ba.g")
    public int field1171 = 500;

    @ObfuscatedName("ba.o")
    public int field1157 = 0;

    @ObfuscatedName("ba.v")
    public static int[] field1174;

    @ObfuscatedName("ba.j")
    public static int[] field1177 = new int[32768];

    @ObfuscatedName("ba.n")
    public static int[] field1180;

    @ObfuscatedName("ba.c")
    public static int[] field1156;

    @ObfuscatedName("ba.h")
    public static int[] field1162;

    @ObfuscatedName("ba.b")
    public static int[] field1179;

    @ObfuscatedName("ba.y")
    public static int[] field1172;

    @ObfuscatedName("ba.x")
    public static int[] field1181;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1177[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1180 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1180[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1174 = new int[220500];
        field1156 = new int[5];
        field1162 = new int[5];
        field1179 = new int[5];
        field1172 = new int[5];
        field1181 = new int[5];
    }

    @ObfuscatedName("ba.i(II)[I")
    public final int[] method1216(int arg0, int arg1) {
        class128.method2653(field1174, 0, arg0);
        if (arg1 < 10) {
            return field1174;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1175.method1232();
        this.field1178.method1232();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1158 != null) {
            this.field1158.method1232();
            this.field1159.method1232();
            var5 = (int) ((double) (this.field1158.field1196 - this.field1158.field1202) * 32.768D / var3);
            var6 = (int) ((double) this.field1158.field1202 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1160 != null) {
            this.field1160.method1232();
            this.field1161.method1232();
            var8 = (int) ((double) (this.field1160.field1196 - this.field1160.field1202) * 32.768D / var3);
            var9 = (int) ((double) this.field1160.field1202 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1164[var11] != 0) {
                field1156[var11] = 0;
                field1162[var11] = (int) ((double) this.field1166[var11] * var3);
                field1179[var11] = (this.field1164[var11] << 14) / 100;
                field1172[var11] = (int) ((double) (this.field1175.field1196 - this.field1175.field1202) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1165[var11]) / var3);
                field1181[var11] = (int) ((double) this.field1175.field1202 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1175.method1229(arg0);
            int var14 = this.field1178.method1229(arg0);
            if (this.field1158 != null) {
                int var15 = this.field1158.method1229(arg0);
                int var16 = this.field1159.method1229(arg0);
                var13 += this.method1215(var7, var16, this.field1158.field1195) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1160 != null) {
                int var17 = this.field1160.method1229(arg0);
                int var18 = this.field1161.method1229(arg0);
                var14 = var14 * ((this.method1215(var10, var18, this.field1160.field1195) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1164[var19] != 0) {
                    int var20 = field1162[var19] + var12;
                    if (var20 < arg0) {
                        field1174[var20] += this.method1215(field1156[var19], field1179[var19] * var14 >> 15, this.field1175.field1195);
                        field1156[var19] += (field1172[var19] * var13 >> 16) + field1181[var19];
                    }
                }
            }
        }
        if (this.field1173 != null) {
            this.field1173.method1232();
            this.field1163.method1232();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1173.method1229(arg0);
                int var26 = this.field1163.method1229(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1173.field1196 - this.field1173.field1202) * var25 >> 8) + this.field1173.field1202;
                } else {
                    var27 = ((this.field1173.field1196 - this.field1173.field1202) * var26 >> 8) + this.field1173.field1202;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1174[var24] = 0;
                }
            }
        }
        if (this.field1167 > 0 && this.field1168 > 0) {
            int var28 = (int) ((double) this.field1167 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1174[var29] += field1174[var29 - var28] * this.field1168 / 100;
            }
        }
        if (this.field1169.field1244[0] > 0 || this.field1169.field1244[1] > 0) {
            this.field1170.method1232();
            int var30 = this.field1170.method1229(arg0 + 1);
            int var31 = this.field1169.method1318(0, (float) var30 / 65536.0F);
            int var32 = this.field1169.method1318(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1174[var31 + var33] * (long) Statics.field1251 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1174[var31 + var33 - 1 - var36] * (long) class64.field1243[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1174[var33 - 1 - var37] * (long) class64.field1243[1][var37] >> 16);
                    }
                    field1174[var33] = var35;
                    var30 = this.field1170.method1229(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1174[var31 + var33] * (long) Statics.field1251 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1174[var31 + var33 - 1 - var40] * (long) class64.field1243[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1174[var33 - 1 - var41] * (long) class64.field1243[1][var41] >> 16);
                        }
                        field1174[var33] = var39;
                        var30 = this.field1170.method1229(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1174[var31 + var33 - 1 - var43] * (long) class64.field1243[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1174[var33 - 1 - var44] * (long) class64.field1243[1][var44] >> 16);
                            }
                            field1174[var33] = var42;
                            this.field1170.method1229(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1169.method1318(0, (float) var30 / 65536.0F);
                    var32 = this.field1169.method1318(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1174[var46] < -32768) {
                field1174[var46] = -32768;
            }
            if (field1174[var46] > 32767) {
                field1174[var46] = 32767;
            }
        }
        return field1174;
    }

    @ObfuscatedName("ba.w(III)I")
    public final int method1215(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1180[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1177[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ba.f(Ldz;)V")
    public final void method1218(class127 arg0) {
        this.field1175 = new class56();
        this.field1175.method1230(arg0);
        this.field1178 = new class56();
        this.field1178.method1230(arg0);
        int var2 = arg0.method2472();
        if (var2 != 0) {
            arg0.field2045--;
            this.field1158 = new class56();
            this.field1158.method1230(arg0);
            this.field1159 = new class56();
            this.field1159.method1230(arg0);
        }
        int var3 = arg0.method2472();
        if (var3 != 0) {
            arg0.field2045--;
            this.field1160 = new class56();
            this.field1160.method1230(arg0);
            this.field1161 = new class56();
            this.field1161.method1230(arg0);
        }
        int var4 = arg0.method2472();
        if (var4 != 0) {
            arg0.field2045--;
            this.field1173 = new class56();
            this.field1173.method1230(arg0);
            this.field1163 = new class56();
            this.field1163.method1230(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2465();
            if (var6 == 0) {
                break;
            }
            this.field1164[var5] = var6;
            this.field1165[var5] = arg0.method2464();
            this.field1166[var5] = arg0.method2465();
        }
        this.field1167 = arg0.method2465();
        this.field1168 = arg0.method2465();
        this.field1171 = arg0.method2615();
        this.field1157 = arg0.method2615();
        this.field1169 = new class64();
        this.field1170 = new class56();
        this.field1169.method1319(arg0, this.field1170);
    }
}
