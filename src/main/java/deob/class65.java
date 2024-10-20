package deob;

import java.util.Random;

@ObfuscatedName("bm")
public class class65 {

    @ObfuscatedName("bm.g")
    public class51 field1242;

    @ObfuscatedName("bm.s")
    public class51 field1219;

    @ObfuscatedName("bm.h")
    public class51 field1220;

    @ObfuscatedName("bm.m")
    public class51 field1224;

    @ObfuscatedName("bm.u")
    public class51 field1222;

    @ObfuscatedName("bm.j")
    public class51 field1223;

    @ObfuscatedName("bm.b")
    public class51 field1234;

    @ObfuscatedName("bm.v")
    public class51 field1225;

    @ObfuscatedName("bm.y")
    public int[] field1218 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bm.w")
    public int[] field1227 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bm.x")
    public int[] field1228 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bm.k")
    public int field1229 = 0;

    @ObfuscatedName("bm.o")
    public int field1230 = 100;

    @ObfuscatedName("bm.a")
    public class57 field1231;

    @ObfuscatedName("bm.f")
    public class51 field1232;

    @ObfuscatedName("bm.r")
    public int field1233 = 500;

    @ObfuscatedName("bm.e")
    public int field1243 = 0;

    @ObfuscatedName("bm.t")
    public static int[] field1235;

    @ObfuscatedName("bm.c")
    public static int[] field1236 = new int[32768];

    @ObfuscatedName("bm.l")
    public static int[] field1237;

    @ObfuscatedName("bm.d")
    public static int[] field1239;

    @ObfuscatedName("bm.p")
    public static int[] field1240;

    @ObfuscatedName("bm.z")
    public static int[] field1241;

    @ObfuscatedName("bm.q")
    public static int[] field1221;

    @ObfuscatedName("bm.i")
    public static int[] field1226;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1236[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1237 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1237[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1235 = new int[220500];
        field1239 = new int[5];
        field1240 = new int[5];
        field1241 = new int[5];
        field1221 = new int[5];
        field1226 = new int[5];
    }

    @ObfuscatedName("bm.g(II)[I")
    public final int[] method1296(int arg0, int arg1) {
        class108.method2316(field1235, 0, arg0);
        if (arg1 < 10) {
            return field1235;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1242.method1020();
        this.field1219.method1020();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1220 != null) {
            this.field1220.method1020();
            this.field1224.method1020();
            var5 = (int) ((double) (this.field1220.field1096 - this.field1220.field1092) * 32.768D / var3);
            var6 = (int) ((double) this.field1220.field1092 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1222 != null) {
            this.field1222.method1020();
            this.field1223.method1020();
            var8 = (int) ((double) (this.field1222.field1096 - this.field1222.field1092) * 32.768D / var3);
            var9 = (int) ((double) this.field1222.field1092 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1218[var11] != 0) {
                field1239[var11] = 0;
                field1240[var11] = (int) ((double) this.field1228[var11] * var3);
                field1241[var11] = (this.field1218[var11] << 14) / 100;
                field1221[var11] = (int) ((double) (this.field1242.field1096 - this.field1242.field1092) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1227[var11]) / var3);
                field1226[var11] = (int) ((double) this.field1242.field1092 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1242.method1021(arg0);
            int var14 = this.field1219.method1021(arg0);
            if (this.field1220 != null) {
                int var15 = this.field1220.method1021(arg0);
                int var16 = this.field1224.method1021(arg0);
                var13 += this.method1297(var7, var16, this.field1220.field1097) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1222 != null) {
                int var17 = this.field1222.method1021(arg0);
                int var18 = this.field1223.method1021(arg0);
                var14 = var14 * ((this.method1297(var10, var18, this.field1222.field1097) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1218[var19] != 0) {
                    int var20 = field1240[var19] + var12;
                    if (var20 < arg0) {
                        field1235[var20] += this.method1297(field1239[var19], field1241[var19] * var14 >> 15, this.field1242.field1097);
                        field1239[var19] += (field1221[var19] * var13 >> 16) + field1226[var19];
                    }
                }
            }
        }
        if (this.field1234 != null) {
            this.field1234.method1020();
            this.field1225.method1020();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1234.method1021(arg0);
                int var26 = this.field1225.method1021(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1234.field1096 - this.field1234.field1092) * var25 >> 8) + this.field1234.field1092;
                } else {
                    var27 = ((this.field1234.field1096 - this.field1234.field1092) * var26 >> 8) + this.field1234.field1092;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1235[var24] = 0;
                }
            }
        }
        if (this.field1229 > 0 && this.field1230 > 0) {
            int var28 = (int) ((double) this.field1229 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1235[var29] += field1235[var29 - var28] * this.field1230 / 100;
            }
        }
        if (this.field1231.field1140[0] > 0 || this.field1231.field1140[1] > 0) {
            this.field1232.method1020();
            int var30 = this.field1232.method1021(arg0 + 1);
            int var31 = this.field1231.method1081(0, (float) var30 / 65536.0F);
            int var32 = this.field1231.method1081(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1235[var31 + var33] * (long) Statics.field1143 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1235[var31 + var33 - 1 - var36] * (long) class57.field1138[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1235[var33 - 1 - var37] * (long) class57.field1138[1][var37] >> 16);
                    }
                    field1235[var33] = var35;
                    var30 = this.field1232.method1021(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1235[var31 + var33] * (long) Statics.field1143 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1235[var31 + var33 - 1 - var40] * (long) class57.field1138[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1235[var33 - 1 - var41] * (long) class57.field1138[1][var41] >> 16);
                        }
                        field1235[var33] = var39;
                        var30 = this.field1232.method1021(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1235[var31 + var33 - 1 - var43] * (long) class57.field1138[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1235[var33 - 1 - var44] * (long) class57.field1138[1][var44] >> 16);
                            }
                            field1235[var33] = var42;
                            this.field1232.method1021(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1231.method1081(0, (float) var30 / 65536.0F);
                    var32 = this.field1231.method1081(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1235[var46] < -32768) {
                field1235[var46] = -32768;
            }
            if (field1235[var46] > 32767) {
                field1235[var46] = 32767;
            }
        }
        return field1235;
    }

    @ObfuscatedName("bm.s(III)I")
    public final int method1297(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1237[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1236[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bm.h(Ldi;)V")
    public final void method1298(class107 arg0) {
        this.field1242 = new class51();
        this.field1242.method1017(arg0);
        this.field1219 = new class51();
        this.field1219.method1017(arg0);
        int var2 = arg0.method2101();
        if (var2 != 0) {
            arg0.field1835--;
            this.field1220 = new class51();
            this.field1220.method1017(arg0);
            this.field1224 = new class51();
            this.field1224.method1017(arg0);
        }
        int var3 = arg0.method2101();
        if (var3 != 0) {
            arg0.field1835--;
            this.field1222 = new class51();
            this.field1222.method1017(arg0);
            this.field1223 = new class51();
            this.field1223.method1017(arg0);
        }
        int var4 = arg0.method2101();
        if (var4 != 0) {
            arg0.field1835--;
            this.field1234 = new class51();
            this.field1234.method1017(arg0);
            this.field1225 = new class51();
            this.field1225.method1017(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2114();
            if (var6 == 0) {
                break;
            }
            this.field1218[var5] = var6;
            this.field1227[var5] = arg0.method2113();
            this.field1228[var5] = arg0.method2114();
        }
        this.field1229 = arg0.method2114();
        this.field1230 = arg0.method2114();
        this.field1233 = arg0.method2166();
        this.field1243 = arg0.method2166();
        this.field1231 = new class57();
        this.field1232 = new class51();
        this.field1231.method1082(arg0, this.field1232);
    }
}
