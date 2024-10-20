package deob;

import java.util.Random;

@ObfuscatedName("w")
public class class19 {

    @ObfuscatedName("w.q")
    public class21 field264;

    @ObfuscatedName("w.l")
    public class21 field265;

    @ObfuscatedName("w.a")
    public class21 field266;

    @ObfuscatedName("w.o")
    public class21 field279;

    @ObfuscatedName("w.c")
    public class21 field268;

    @ObfuscatedName("w.h")
    public class21 field269;

    @ObfuscatedName("w.r")
    public class21 field271;

    @ObfuscatedName("w.d")
    public class21 field285;

    @ObfuscatedName("w.k")
    public int[] field272 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("w.u")
    public int[] field273 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("w.v")
    public int[] field274 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("w.f")
    public int field267 = 0;

    @ObfuscatedName("w.s")
    public int field276 = 100;

    @ObfuscatedName("w.j")
    public class27 field277;

    @ObfuscatedName("w.e")
    public class21 field278;

    @ObfuscatedName("w.t")
    public int field286 = 500;

    @ObfuscatedName("w.y")
    public int field280 = 0;

    @ObfuscatedName("w.b")
    public static int[] field281;

    @ObfuscatedName("w.w")
    public static int[] field282 = new int[32768];

    @ObfuscatedName("w.g")
    public static int[] field283;

    @ObfuscatedName("w.z")
    public static int[] field270;

    @ObfuscatedName("w.n")
    public static int[] field289;

    @ObfuscatedName("w.x")
    public static int[] field287;

    @ObfuscatedName("w.i")
    public static int[] field288;

    @ObfuscatedName("w.m")
    public static int[] field275;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field282[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field283 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field283[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field281 = new int[220500];
        field270 = new int[5];
        field289 = new int[5];
        field287 = new int[5];
        field288 = new int[5];
        field275 = new int[5];
    }

    @ObfuscatedName("w.q(II)[I")
    public final int[] method237(int arg0, int arg1) {
        class69.method867(field281, 0, arg0);
        if (arg1 < 10) {
            return field281;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field264.method246();
        this.field265.method246();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field266 != null) {
            this.field266.method246();
            this.field279.method246();
            var5 = (int) ((double) (this.field266.field300 - this.field266.field299) * 32.768D / var3);
            var6 = (int) ((double) this.field266.field299 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field268 != null) {
            this.field268.method246();
            this.field269.method246();
            var8 = (int) ((double) (this.field268.field300 - this.field268.field299) * 32.768D / var3);
            var9 = (int) ((double) this.field268.field299 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field272[var11] != 0) {
                field270[var11] = 0;
                field289[var11] = (int) ((double) this.field274[var11] * var3);
                field287[var11] = (this.field272[var11] << 14) / 100;
                field288[var11] = (int) ((double) (this.field264.field300 - this.field264.field299) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field273[var11]) / var3);
                field275[var11] = (int) ((double) this.field264.field299 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field264.method250(arg0);
            int var14 = this.field265.method250(arg0);
            if (this.field266 != null) {
                int var15 = this.field266.method250(arg0);
                int var16 = this.field279.method250(arg0);
                var13 += this.method232(var7, var16, this.field266.field301) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field268 != null) {
                int var17 = this.field268.method250(arg0);
                int var18 = this.field269.method250(arg0);
                var14 = var14 * ((this.method232(var10, var18, this.field268.field301) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field272[var19] != 0) {
                    int var20 = field289[var19] + var12;
                    if (var20 < arg0) {
                        field281[var20] += this.method232(field270[var19], field287[var19] * var14 >> 15, this.field264.field301);
                        field270[var19] += (field288[var19] * var13 >> 16) + field275[var19];
                    }
                }
            }
        }
        if (this.field271 != null) {
            this.field271.method246();
            this.field285.method246();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field271.method250(arg0);
                int var26 = this.field285.method250(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field271.field300 - this.field271.field299) * var25 >> 8) + this.field271.field299;
                } else {
                    var27 = ((this.field271.field300 - this.field271.field299) * var26 >> 8) + this.field271.field299;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field281[var24] = 0;
                }
            }
        }
        if (this.field267 > 0 && this.field276 > 0) {
            int var28 = (int) ((double) this.field267 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field281[var29] += field281[var29 - var28] * this.field276 / 100;
            }
        }
        if (this.field277.field339[0] > 0 || this.field277.field339[1] > 0) {
            this.field278.method246();
            int var30 = this.field278.method250(arg0 + 1);
            int var31 = this.field277.method318(0, (float) var30 / 65536.0F);
            int var32 = this.field277.method318(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field281[var31 + var33] * (long) Statics.field345 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field281[var31 + var33 - 1 - var36] * (long) class27.field343[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field281[var33 - 1 - var37] * (long) class27.field343[1][var37] >> 16);
                    }
                    field281[var33] = var35;
                    var30 = this.field278.method250(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field281[var31 + var33] * (long) Statics.field345 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field281[var31 + var33 - 1 - var40] * (long) class27.field343[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field281[var33 - 1 - var41] * (long) class27.field343[1][var41] >> 16);
                        }
                        field281[var33] = var39;
                        var30 = this.field278.method250(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field281[var31 + var33 - 1 - var43] * (long) class27.field343[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field281[var33 - 1 - var44] * (long) class27.field343[1][var44] >> 16);
                            }
                            field281[var33] = var42;
                            this.field278.method250(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field277.method318(0, (float) var30 / 65536.0F);
                    var32 = this.field277.method318(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field281[var46] < -32768) {
                field281[var46] = -32768;
            }
            if (field281[var46] > 32767) {
                field281[var46] = 32767;
            }
        }
        return field281;
    }

    @ObfuscatedName("w.l(III)I")
    public final int method232(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field283[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field282[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("w.a(Let;)V")
    public final void method233(class136 arg0) {
        this.field264 = new class21();
        this.field264.method247(arg0);
        this.field265 = new class21();
        this.field265.method247(arg0);
        int var2 = arg0.method1602();
        if (var2 != 0) {
            arg0.field1722--;
            this.field266 = new class21();
            this.field266.method247(arg0);
            this.field279 = new class21();
            this.field279.method247(arg0);
        }
        int var3 = arg0.method1602();
        if (var3 != 0) {
            arg0.field1722--;
            this.field268 = new class21();
            this.field268.method247(arg0);
            this.field269 = new class21();
            this.field269.method247(arg0);
        }
        int var4 = arg0.method1602();
        if (var4 != 0) {
            arg0.field1722--;
            this.field271 = new class21();
            this.field271.method247(arg0);
            this.field285 = new class21();
            this.field285.method247(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1615();
            if (var6 == 0) {
                break;
            }
            this.field272[var5] = var6;
            this.field273[var5] = arg0.method1614();
            this.field274[var5] = arg0.method1615();
        }
        this.field267 = arg0.method1615();
        this.field276 = arg0.method1615();
        this.field286 = arg0.method1712();
        this.field280 = arg0.method1712();
        this.field277 = new class27();
        this.field278 = new class21();
        this.field277.method311(arg0, this.field278);
    }
}
