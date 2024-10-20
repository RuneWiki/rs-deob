package deob;

import java.util.Random;

@ObfuscatedName("ak")
public class class40 {

    @ObfuscatedName("ak.s")
    public class26 field341;

    @ObfuscatedName("ak.t")
    public class26 field325;

    @ObfuscatedName("ak.v")
    public class26 field345;

    @ObfuscatedName("ak.j")
    public class26 field327;

    @ObfuscatedName("ak.l")
    public class26 field330;

    @ObfuscatedName("ak.n")
    public class26 field329;

    @ObfuscatedName("ak.w")
    public class26 field336;

    @ObfuscatedName("ak.f")
    public class26 field331;

    @ObfuscatedName("ak.o")
    public int[] field332 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("ak.x")
    public int[] field333 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("ak.r")
    public int[] field339 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("ak.p")
    public int field335 = 0;

    @ObfuscatedName("ak.h")
    public int field328 = 100;

    @ObfuscatedName("ak.k")
    public class39 field337;

    @ObfuscatedName("ak.a")
    public class26 field338;

    @ObfuscatedName("ak.q")
    public int field344 = 500;

    @ObfuscatedName("ak.u")
    public int field340 = 0;

    @ObfuscatedName("ak.e")
    public static int[] field326;

    @ObfuscatedName("ak.c")
    public static int[] field347 = new int[32768];

    @ObfuscatedName("ak.i")
    public static int[] field343;

    @ObfuscatedName("ak.b")
    public static int[] field334;

    @ObfuscatedName("ak.z")
    public static int[] field324;

    @ObfuscatedName("ak.d")
    public static int[] field342;

    @ObfuscatedName("ak.y")
    public static int[] field348;

    @ObfuscatedName("ak.g")
    public static int[] field349;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field347[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field343 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field343[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field326 = new int[220500];
        field334 = new int[5];
        field324 = new int[5];
        field342 = new int[5];
        field348 = new int[5];
        field349 = new int[5];
    }

    @ObfuscatedName("ak.s(II)[I")
    public final int[] method771(int arg0, int arg1) {
        class309.method5060(field326, 0, arg0);
        if (arg1 < 10) {
            return field326;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field341.method490();
        this.field325.method490();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field345 != null) {
            this.field345.method490();
            this.field327.method490();
            var5 = (int) ((double) (this.field345.field207 - this.field345.field208) * 32.768D / var3);
            var6 = (int) ((double) this.field345.field208 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field330 != null) {
            this.field330.method490();
            this.field329.method490();
            var8 = (int) ((double) (this.field330.field207 - this.field330.field208) * 32.768D / var3);
            var9 = (int) ((double) this.field330.field208 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field332[var11] != 0) {
                field334[var11] = 0;
                field324[var11] = (int) ((double) this.field339[var11] * var3);
                field342[var11] = (this.field332[var11] << 14) / 100;
                field348[var11] = (int) ((double) (this.field341.field207 - this.field341.field208) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field333[var11]) / var3);
                field349[var11] = (int) ((double) this.field341.field208 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field341.method491(arg0);
            int var14 = this.field325.method491(arg0);
            if (this.field345 != null) {
                int var15 = this.field345.method491(arg0);
                int var16 = this.field327.method491(arg0);
                var13 += this.method761(var7, var16, this.field345.field213) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field330 != null) {
                int var17 = this.field330.method491(arg0);
                int var18 = this.field329.method491(arg0);
                var14 = var14 * ((this.method761(var10, var18, this.field330.field213) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field332[var19] != 0) {
                    int var20 = field324[var19] + var12;
                    if (var20 < arg0) {
                        field326[var20] += this.method761(field334[var19], field342[var19] * var14 >> 15, this.field341.field213);
                        field334[var19] += (field348[var19] * var13 >> 16) + field349[var19];
                    }
                }
            }
        }
        if (this.field336 != null) {
            this.field336.method490();
            this.field331.method490();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field336.method491(arg0);
                int var26 = this.field331.method491(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field336.field207 - this.field336.field208) * var25 >> 8) + this.field336.field208;
                } else {
                    var27 = ((this.field336.field207 - this.field336.field208) * var26 >> 8) + this.field336.field208;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field326[var24] = 0;
                }
            }
        }
        if (this.field335 > 0 && this.field328 > 0) {
            int var28 = (int) ((double) this.field335 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field326[var29] += field326[var29 - var28] * this.field328 / 100;
            }
        }
        if (this.field337.field321[0] > 0 || this.field337.field321[1] > 0) {
            this.field338.method490();
            int var30 = this.field338.method491(arg0 + 1);
            int var31 = this.field337.method756(0, (float) var30 / 65536.0F);
            int var32 = this.field337.method756(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field326[var31 + var33] * (long) Statics.field320 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field326[var31 + var33 - 1 - var36] * (long) class39.field318[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field326[var33 - 1 - var37] * (long) class39.field318[1][var37] >> 16);
                    }
                    field326[var33] = var35;
                    var30 = this.field338.method491(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field326[var31 + var33] * (long) Statics.field320 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field326[var31 + var33 - 1 - var40] * (long) class39.field318[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field326[var33 - 1 - var41] * (long) class39.field318[1][var41] >> 16);
                        }
                        field326[var33] = var39;
                        var30 = this.field338.method491(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field326[var31 + var33 - 1 - var43] * (long) class39.field318[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field326[var33 - 1 - var44] * (long) class39.field318[1][var44] >> 16);
                            }
                            field326[var33] = var42;
                            this.field338.method491(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field337.method756(0, (float) var30 / 65536.0F);
                    var32 = this.field337.method756(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field326[var46] < -32768) {
                field326[var46] = -32768;
            }
            if (field326[var46] > 32767) {
                field326[var46] = 32767;
            }
        }
        return field326;
    }

    @ObfuscatedName("ak.t(III)I")
    public final int method761(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field343[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field347[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ak.v(Lnv;)V")
    public final void method762(class385 arg0) {
        this.field341 = new class26();
        this.field341.method488(arg0);
        this.field325 = new class26();
        this.field325.method488(arg0);
        int var2 = arg0.method5958();
        if (var2 != 0) {
            arg0.field4182--;
            this.field345 = new class26();
            this.field345.method488(arg0);
            this.field327 = new class26();
            this.field327.method488(arg0);
        }
        int var3 = arg0.method5958();
        if (var3 != 0) {
            arg0.field4182--;
            this.field330 = new class26();
            this.field330.method488(arg0);
            this.field329 = new class26();
            this.field329.method488(arg0);
        }
        int var4 = arg0.method5958();
        if (var4 != 0) {
            arg0.field4182--;
            this.field336 = new class26();
            this.field336.method488(arg0);
            this.field331 = new class26();
            this.field331.method488(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method5972();
            if (var6 == 0) {
                break;
            }
            this.field332[var5] = var6;
            this.field333[var5] = arg0.method5971();
            this.field339[var5] = arg0.method5972();
        }
        this.field335 = arg0.method5972();
        this.field328 = arg0.method5972();
        this.field344 = arg0.method6053();
        this.field340 = arg0.method6053();
        this.field337 = new class39();
        this.field338 = new class26();
        this.field337.method748(arg0, this.field338);
    }
}
