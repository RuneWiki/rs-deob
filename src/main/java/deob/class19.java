package deob;

import java.util.Random;

@ObfuscatedName("x")
public class class19 {

    @ObfuscatedName("x.t")
    public class21 field263;

    @ObfuscatedName("x.n")
    public class21 field284;

    @ObfuscatedName("x.q")
    public class21 field267;

    @ObfuscatedName("x.h")
    public class21 field264;

    @ObfuscatedName("x.k")
    public class21 field265;

    @ObfuscatedName("x.r")
    public class21 field261;

    @ObfuscatedName("x.l")
    public class21 field271;

    @ObfuscatedName("x.i")
    public class21 field268;

    @ObfuscatedName("x.e")
    public int[] field269 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("x.a")
    public int[] field270 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("x.g")
    public int[] field283 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("x.w")
    public int field272 = 0;

    @ObfuscatedName("x.v")
    public int field273 = 100;

    @ObfuscatedName("x.u")
    public class27 field281;

    @ObfuscatedName("x.m")
    public class21 field275;

    @ObfuscatedName("x.b")
    public int field279 = 500;

    @ObfuscatedName("x.f")
    public int field277 = 0;

    @ObfuscatedName("x.d")
    public static int[] field278;

    @ObfuscatedName("x.x")
    public static int[] field274 = new int[32768];

    @ObfuscatedName("x.z")
    public static int[] field280;

    @ObfuscatedName("x.c")
    public static int[] field282;

    @ObfuscatedName("x.y")
    public static int[] field266;

    @ObfuscatedName("x.j")
    public static int[] field262;

    @ObfuscatedName("x.s")
    public static int[] field285;

    @ObfuscatedName("x.p")
    public static int[] field286;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field274[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field280 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field280[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field278 = new int[220500];
        field282 = new int[5];
        field266 = new int[5];
        field262 = new int[5];
        field285 = new int[5];
        field286 = new int[5];
    }

    @ObfuscatedName("x.t(II)[I")
    public final int[] method256(int arg0, int arg1) {
        class68.method838(field278, 0, arg0);
        if (arg1 < 10) {
            return field278;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field263.method276();
        this.field284.method276();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field267 != null) {
            this.field267.method276();
            this.field264.method276();
            var5 = (int) ((double) (this.field267.field295 - this.field267.field300) * 32.768D / var3);
            var6 = (int) ((double) this.field267.field300 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field265 != null) {
            this.field265.method276();
            this.field261.method276();
            var8 = (int) ((double) (this.field265.field295 - this.field265.field300) * 32.768D / var3);
            var9 = (int) ((double) this.field265.field300 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field269[var11] != 0) {
                field282[var11] = 0;
                field266[var11] = (int) ((double) this.field283[var11] * var3);
                field262[var11] = (this.field269[var11] << 14) / 100;
                field285[var11] = (int) ((double) (this.field263.field295 - this.field263.field300) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field270[var11]) / var3);
                field286[var11] = (int) ((double) this.field263.field300 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field263.method277(arg0);
            int var14 = this.field284.method277(arg0);
            if (this.field267 != null) {
                int var15 = this.field267.method277(arg0);
                int var16 = this.field264.method277(arg0);
                var13 += this.method257(var7, var16, this.field267.field296) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field265 != null) {
                int var17 = this.field265.method277(arg0);
                int var18 = this.field261.method277(arg0);
                var14 = var14 * ((this.method257(var10, var18, this.field265.field296) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field269[var19] != 0) {
                    int var20 = field266[var19] + var12;
                    if (var20 < arg0) {
                        field278[var20] += this.method257(field282[var19], field262[var19] * var14 >> 15, this.field263.field296);
                        field282[var19] += (field285[var19] * var13 >> 16) + field286[var19];
                    }
                }
            }
        }
        if (this.field271 != null) {
            this.field271.method276();
            this.field268.method276();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field271.method277(arg0);
                int var26 = this.field268.method277(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field271.field295 - this.field271.field300) * var25 >> 8) + this.field271.field300;
                } else {
                    var27 = ((this.field271.field295 - this.field271.field300) * var26 >> 8) + this.field271.field300;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field278[var24] = 0;
                }
            }
        }
        if (this.field272 > 0 && this.field273 > 0) {
            int var28 = (int) ((double) this.field272 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field278[var29] += field278[var29 - var28] * this.field273 / 100;
            }
        }
        if (this.field281.field333[0] > 0 || this.field281.field333[1] > 0) {
            this.field275.method276();
            int var30 = this.field275.method277(arg0 + 1);
            int var31 = this.field281.method340(0, (float) var30 / 65536.0F);
            int var32 = this.field281.method340(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field278[var31 + var33] * (long) Statics.field340 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field278[var31 + var33 - 1 - var36] * (long) class27.field339[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field278[var33 - 1 - var37] * (long) class27.field339[1][var37] >> 16);
                    }
                    field278[var33] = var35;
                    var30 = this.field275.method277(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field278[var31 + var33] * (long) Statics.field340 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field278[var31 + var33 - 1 - var40] * (long) class27.field339[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field278[var33 - 1 - var41] * (long) class27.field339[1][var41] >> 16);
                        }
                        field278[var33] = var39;
                        var30 = this.field275.method277(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field278[var31 + var33 - 1 - var43] * (long) class27.field339[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field278[var33 - 1 - var44] * (long) class27.field339[1][var44] >> 16);
                            }
                            field278[var33] = var42;
                            this.field275.method277(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field281.method340(0, (float) var30 / 65536.0F);
                    var32 = this.field281.method340(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field278[var46] < -32768) {
                field278[var46] = -32768;
            }
            if (field278[var46] > 32767) {
                field278[var46] = 32767;
            }
        }
        return field278;
    }

    @ObfuscatedName("x.n(III)I")
    public final int method257(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field280[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field274[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("x.q(Lec;)V")
    public final void method258(class135 arg0) {
        this.field263 = new class21();
        this.field263.method282(arg0);
        this.field284 = new class21();
        this.field284.method282(arg0);
        int var2 = arg0.method1571();
        if (var2 != 0) {
            arg0.field1722--;
            this.field267 = new class21();
            this.field267.method282(arg0);
            this.field264 = new class21();
            this.field264.method282(arg0);
        }
        int var3 = arg0.method1571();
        if (var3 != 0) {
            arg0.field1722--;
            this.field265 = new class21();
            this.field265.method282(arg0);
            this.field261 = new class21();
            this.field261.method282(arg0);
        }
        int var4 = arg0.method1571();
        if (var4 != 0) {
            arg0.field1722--;
            this.field271 = new class21();
            this.field271.method282(arg0);
            this.field268 = new class21();
            this.field268.method282(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1603();
            if (var6 == 0) {
                break;
            }
            this.field269[var5] = var6;
            this.field270[var5] = arg0.method1583();
            this.field283[var5] = arg0.method1603();
        }
        this.field272 = arg0.method1603();
        this.field273 = arg0.method1603();
        this.field279 = arg0.method1725();
        this.field277 = arg0.method1725();
        this.field281 = new class27();
        this.field275 = new class21();
        this.field281.method331(arg0, this.field275);
    }
}
