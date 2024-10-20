package deob;

import java.util.Random;

@ObfuscatedName("bl")
public class class67 {

    @ObfuscatedName("bl.q")
    public class53 field1230;

    @ObfuscatedName("bl.s")
    public class53 field1223;

    @ObfuscatedName("bl.h")
    public class53 field1235;

    @ObfuscatedName("bl.e")
    public class53 field1225;

    @ObfuscatedName("bl.n")
    public class53 field1224;

    @ObfuscatedName("bl.t")
    public class53 field1227;

    @ObfuscatedName("bl.l")
    public class53 field1228;

    @ObfuscatedName("bl.m")
    public class53 field1231;

    @ObfuscatedName("bl.o")
    public int[] field1244 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bl.k")
    public int[] field1222 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bl.p")
    public int[] field1232 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bl.u")
    public int field1233 = 0;

    @ObfuscatedName("bl.g")
    public int field1234 = 100;

    @ObfuscatedName("bl.a")
    public class59 field1226;

    @ObfuscatedName("bl.y")
    public class53 field1236;

    @ObfuscatedName("bl.d")
    public int field1237 = 500;

    @ObfuscatedName("bl.b")
    public int field1238 = 0;

    @ObfuscatedName("bl.j")
    public static int[] field1239;

    @ObfuscatedName("bl.f")
    public static int[] field1240 = new int[32768];

    @ObfuscatedName("bl.w")
    public static int[] field1241;

    @ObfuscatedName("bl.x")
    public static int[] field1243;

    @ObfuscatedName("bl.v")
    public static int[] field1245;

    @ObfuscatedName("bl.i")
    public static int[] field1242;

    @ObfuscatedName("bl.c")
    public static int[] field1246;

    @ObfuscatedName("bl.r")
    public static int[] field1229;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1240[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1241 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1241[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1239 = new int[220500];
        field1243 = new int[5];
        field1245 = new int[5];
        field1242 = new int[5];
        field1246 = new int[5];
        field1229 = new int[5];
    }

    @ObfuscatedName("bl.q(II)[I")
    public final int[] method1308(int arg0, int arg1) {
        class112.method2349(field1239, 0, arg0);
        if (arg1 < 10) {
            return field1239;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1230.method1033();
        this.field1223.method1033();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1235 != null) {
            this.field1235.method1033();
            this.field1225.method1033();
            var5 = (int) ((double) (this.field1235.field1113 - this.field1235.field1106) * 32.768D / var3);
            var6 = (int) ((double) this.field1235.field1106 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1224 != null) {
            this.field1224.method1033();
            this.field1227.method1033();
            var8 = (int) ((double) (this.field1224.field1113 - this.field1224.field1106) * 32.768D / var3);
            var9 = (int) ((double) this.field1224.field1106 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1244[var11] != 0) {
                field1243[var11] = 0;
                field1245[var11] = (int) ((double) this.field1232[var11] * var3);
                field1242[var11] = (this.field1244[var11] << 14) / 100;
                field1246[var11] = (int) ((double) (this.field1230.field1113 - this.field1230.field1106) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1222[var11]) / var3);
                field1229[var11] = (int) ((double) this.field1230.field1106 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1230.method1039(arg0);
            int var14 = this.field1223.method1039(arg0);
            if (this.field1235 != null) {
                int var15 = this.field1235.method1039(arg0);
                int var16 = this.field1225.method1039(arg0);
                var13 += this.method1310(var7, var16, this.field1235.field1107) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1224 != null) {
                int var17 = this.field1224.method1039(arg0);
                int var18 = this.field1227.method1039(arg0);
                var14 = var14 * ((this.method1310(var10, var18, this.field1224.field1107) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1244[var19] != 0) {
                    int var20 = field1245[var19] + var12;
                    if (var20 < arg0) {
                        field1239[var20] += this.method1310(field1243[var19], field1242[var19] * var14 >> 15, this.field1230.field1107);
                        field1243[var19] += (field1246[var19] * var13 >> 16) + field1229[var19];
                    }
                }
            }
        }
        if (this.field1228 != null) {
            this.field1228.method1033();
            this.field1231.method1033();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1228.method1039(arg0);
                int var26 = this.field1231.method1039(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1228.field1113 - this.field1228.field1106) * var25 >> 8) + this.field1228.field1106;
                } else {
                    var27 = ((this.field1228.field1113 - this.field1228.field1106) * var26 >> 8) + this.field1228.field1106;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1239[var24] = 0;
                }
            }
        }
        if (this.field1233 > 0 && this.field1234 > 0) {
            int var28 = (int) ((double) this.field1233 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1239[var29] += field1239[var29 - var28] * this.field1234 / 100;
            }
        }
        if (this.field1226.field1146[0] > 0 || this.field1226.field1146[1] > 0) {
            this.field1236.method1033();
            int var30 = this.field1236.method1039(arg0 + 1);
            int var31 = this.field1226.method1088(0, (float) var30 / 65536.0F);
            int var32 = this.field1226.method1088(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1239[var31 + var33] * (long) Statics.field1144 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1239[var31 + var33 - 1 - var36] * (long) class59.field1142[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1239[var33 - 1 - var37] * (long) class59.field1142[1][var37] >> 16);
                    }
                    field1239[var33] = var35;
                    var30 = this.field1236.method1039(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1239[var31 + var33] * (long) Statics.field1144 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1239[var31 + var33 - 1 - var40] * (long) class59.field1142[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1239[var33 - 1 - var41] * (long) class59.field1142[1][var41] >> 16);
                        }
                        field1239[var33] = var39;
                        var30 = this.field1236.method1039(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1239[var31 + var33 - 1 - var43] * (long) class59.field1142[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1239[var33 - 1 - var44] * (long) class59.field1142[1][var44] >> 16);
                            }
                            field1239[var33] = var42;
                            this.field1236.method1039(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1226.method1088(0, (float) var30 / 65536.0F);
                    var32 = this.field1226.method1088(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1239[var46] < -32768) {
                field1239[var46] = -32768;
            }
            if (field1239[var46] > 32767) {
                field1239[var46] = 32767;
            }
        }
        return field1239;
    }

    @ObfuscatedName("bl.s(III)I")
    public final int method1310(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1241[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1240[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bl.h(Ldx;)V")
    public final void method1311(class111 arg0) {
        this.field1230 = new class53();
        this.field1230.method1031(arg0);
        this.field1223 = new class53();
        this.field1223.method1031(arg0);
        int var2 = arg0.method2231();
        if (var2 != 0) {
            arg0.field1852--;
            this.field1235 = new class53();
            this.field1235.method1031(arg0);
            this.field1225 = new class53();
            this.field1225.method1031(arg0);
        }
        int var3 = arg0.method2231();
        if (var3 != 0) {
            arg0.field1852--;
            this.field1224 = new class53();
            this.field1224.method1031(arg0);
            this.field1227 = new class53();
            this.field1227.method1031(arg0);
        }
        int var4 = arg0.method2231();
        if (var4 != 0) {
            arg0.field1852--;
            this.field1228 = new class53();
            this.field1228.method1031(arg0);
            this.field1231 = new class53();
            this.field1231.method1031(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2279();
            if (var6 == 0) {
                break;
            }
            this.field1244[var5] = var6;
            this.field1222[var5] = arg0.method2327();
            this.field1232[var5] = arg0.method2279();
        }
        this.field1233 = arg0.method2279();
        this.field1234 = arg0.method2279();
        this.field1237 = arg0.method2307();
        this.field1238 = arg0.method2307();
        this.field1226 = new class59();
        this.field1236 = new class53();
        this.field1226.method1101(arg0, this.field1236);
    }
}
