package deob;

import java.util.Random;

@ObfuscatedName("bp")
public class class66 {

    @ObfuscatedName("bp.g")
    public class52 field1249;

    @ObfuscatedName("bp.j")
    public class52 field1229;

    @ObfuscatedName("bp.z")
    public class52 field1230;

    @ObfuscatedName("bp.b")
    public class52 field1231;

    @ObfuscatedName("bp.k")
    public class52 field1232;

    @ObfuscatedName("bp.c")
    public class52 field1233;

    @ObfuscatedName("bp.w")
    public class52 field1244;

    @ObfuscatedName("bp.l")
    public class52 field1247;

    @ObfuscatedName("bp.n")
    public int[] field1236 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bp.d")
    public int[] field1242 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bp.h")
    public int[] field1238 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bp.y")
    public int field1239 = 0;

    @ObfuscatedName("bp.p")
    public int field1240 = 100;

    @ObfuscatedName("bp.i")
    public class58 field1241;

    @ObfuscatedName("bp.s")
    public class52 field1237;

    @ObfuscatedName("bp.f")
    public int field1243 = 500;

    @ObfuscatedName("bp.u")
    public int field1248 = 0;

    @ObfuscatedName("bp.v")
    public static int[] field1245;

    @ObfuscatedName("bp.r")
    public static int[] field1246 = new int[32768];

    @ObfuscatedName("bp.q")
    public static int[] field1228;

    @ObfuscatedName("bp.t")
    public static int[] field1252;

    @ObfuscatedName("bp.e")
    public static int[] field1250;

    @ObfuscatedName("bp.m")
    public static int[] field1251;

    @ObfuscatedName("bp.o")
    public static int[] field1234;

    @ObfuscatedName("bp.a")
    public static int[] field1253;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1246[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1228 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1228[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1245 = new int[220500];
        field1252 = new int[5];
        field1250 = new int[5];
        field1251 = new int[5];
        field1234 = new int[5];
        field1253 = new int[5];
    }

    @ObfuscatedName("bp.g(II)[I")
    public final int[] method1250(int arg0, int arg1) {
        class109.method2282(field1245, 0, arg0);
        if (arg1 < 10) {
            return field1245;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1249.method999();
        this.field1229.method999();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1230 != null) {
            this.field1230.method999();
            this.field1231.method999();
            var5 = (int) ((double) (this.field1230.field1108 - this.field1230.field1112) * 32.768D / var3);
            var6 = (int) ((double) this.field1230.field1112 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1232 != null) {
            this.field1232.method999();
            this.field1233.method999();
            var8 = (int) ((double) (this.field1232.field1108 - this.field1232.field1112) * 32.768D / var3);
            var9 = (int) ((double) this.field1232.field1112 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1236[var11] != 0) {
                field1252[var11] = 0;
                field1250[var11] = (int) ((double) this.field1238[var11] * var3);
                field1251[var11] = (this.field1236[var11] << 14) / 100;
                field1234[var11] = (int) ((double) (this.field1249.field1108 - this.field1249.field1112) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1242[var11]) / var3);
                field1253[var11] = (int) ((double) this.field1249.field1112 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1249.method1007(arg0);
            int var14 = this.field1229.method1007(arg0);
            if (this.field1230 != null) {
                int var15 = this.field1230.method1007(arg0);
                int var16 = this.field1231.method1007(arg0);
                var13 += this.method1251(var7, var16, this.field1230.field1109) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1232 != null) {
                int var17 = this.field1232.method1007(arg0);
                int var18 = this.field1233.method1007(arg0);
                var14 = var14 * ((this.method1251(var10, var18, this.field1232.field1109) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1236[var19] != 0) {
                    int var20 = field1250[var19] + var12;
                    if (var20 < arg0) {
                        field1245[var20] += this.method1251(field1252[var19], field1251[var19] * var14 >> 15, this.field1249.field1109);
                        field1252[var19] += (field1234[var19] * var13 >> 16) + field1253[var19];
                    }
                }
            }
        }
        if (this.field1244 != null) {
            this.field1244.method999();
            this.field1247.method999();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1244.method1007(arg0);
                int var26 = this.field1247.method1007(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1244.field1108 - this.field1244.field1112) * var25 >> 8) + this.field1244.field1112;
                } else {
                    var27 = ((this.field1244.field1108 - this.field1244.field1112) * var26 >> 8) + this.field1244.field1112;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1245[var24] = 0;
                }
            }
        }
        if (this.field1239 > 0 && this.field1240 > 0) {
            int var28 = (int) ((double) this.field1239 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1245[var29] += field1245[var29 - var28] * this.field1240 / 100;
            }
        }
        if (this.field1241.field1149[0] > 0 || this.field1241.field1149[1] > 0) {
            this.field1237.method999();
            int var30 = this.field1237.method1007(arg0 + 1);
            int var31 = this.field1241.method1059(0, (float) var30 / 65536.0F);
            int var32 = this.field1241.method1059(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1245[var31 + var33] * (long) Statics.field1152 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1245[var31 + var33 - 1 - var36] * (long) class58.field1148[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1245[var33 - 1 - var37] * (long) class58.field1148[1][var37] >> 16);
                    }
                    field1245[var33] = var35;
                    var30 = this.field1237.method1007(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1245[var31 + var33] * (long) Statics.field1152 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1245[var31 + var33 - 1 - var40] * (long) class58.field1148[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1245[var33 - 1 - var41] * (long) class58.field1148[1][var41] >> 16);
                        }
                        field1245[var33] = var39;
                        var30 = this.field1237.method1007(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1245[var31 + var33 - 1 - var43] * (long) class58.field1148[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1245[var33 - 1 - var44] * (long) class58.field1148[1][var44] >> 16);
                            }
                            field1245[var33] = var42;
                            this.field1237.method1007(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1241.method1059(0, (float) var30 / 65536.0F);
                    var32 = this.field1241.method1059(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1245[var46] < -32768) {
                field1245[var46] = -32768;
            }
            if (field1245[var46] > 32767) {
                field1245[var46] = 32767;
            }
        }
        return field1245;
    }

    @ObfuscatedName("bp.j(III)I")
    public final int method1251(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1228[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1246[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bp.z(Ldf;)V")
    public final void method1252(class108 arg0) {
        this.field1249 = new class52();
        this.field1249.method997(arg0);
        this.field1229 = new class52();
        this.field1229.method997(arg0);
        int var2 = arg0.method2083();
        if (var2 != 0) {
            arg0.field1824--;
            this.field1230 = new class52();
            this.field1230.method997(arg0);
            this.field1231 = new class52();
            this.field1231.method997(arg0);
        }
        int var3 = arg0.method2083();
        if (var3 != 0) {
            arg0.field1824--;
            this.field1232 = new class52();
            this.field1232.method997(arg0);
            this.field1233 = new class52();
            this.field1233.method997(arg0);
        }
        int var4 = arg0.method2083();
        if (var4 != 0) {
            arg0.field1824--;
            this.field1244 = new class52();
            this.field1244.method997(arg0);
            this.field1247 = new class52();
            this.field1247.method997(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2215();
            if (var6 == 0) {
                break;
            }
            this.field1236[var5] = var6;
            this.field1242[var5] = arg0.method2179();
            this.field1238[var5] = arg0.method2215();
        }
        this.field1239 = arg0.method2215();
        this.field1240 = arg0.method2215();
        this.field1243 = arg0.method2263();
        this.field1248 = arg0.method2263();
        this.field1241 = new class58();
        this.field1237 = new class52();
        this.field1241.method1051(arg0, this.field1237);
    }
}
