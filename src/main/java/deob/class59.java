package deob;

import java.util.Random;

@ObfuscatedName("bg")
public class class59 {

    @ObfuscatedName("bg.a")
    public class45 field443;

    @ObfuscatedName("bg.f")
    public class45 field435;

    @ObfuscatedName("bg.c")
    public class45 field447;

    @ObfuscatedName("bg.x")
    public class45 field437;

    @ObfuscatedName("bg.h")
    public class45 field438;

    @ObfuscatedName("bg.j")
    public class45 field439;

    @ObfuscatedName("bg.y")
    public class45 field440;

    @ObfuscatedName("bg.d")
    public class45 field450;

    @ObfuscatedName("bg.n")
    public int[] field459 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bg.r")
    public int[] field434 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bg.l")
    public int[] field444 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bg.s")
    public int field445 = 0;

    @ObfuscatedName("bg.p")
    public int field442 = 100;

    @ObfuscatedName("bg.b")
    public class58 field446;

    @ObfuscatedName("bg.o")
    public class45 field448;

    @ObfuscatedName("bg.u")
    public int field449 = 500;

    @ObfuscatedName("bg.z")
    public int field441 = 0;

    @ObfuscatedName("bg.t")
    public static int[] field451;

    @ObfuscatedName("bg.w")
    public static int[] field452 = new int[32768];

    @ObfuscatedName("bg.m")
    public static int[] field453;

    @ObfuscatedName("bg.i")
    public static int[] field455;

    @ObfuscatedName("bg.e")
    public static int[] field456;

    @ObfuscatedName("bg.g")
    public static int[] field457;

    @ObfuscatedName("bg.k")
    public static int[] field458;

    @ObfuscatedName("bg.v")
    public static int[] field436;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field452[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field453 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field453[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field451 = new int[220500];
        field455 = new int[5];
        field456 = new int[5];
        field457 = new int[5];
        field458 = new int[5];
        field436 = new int[5];
    }

    @ObfuscatedName("bg.a(II)[I")
    public final int[] method1069(int arg0, int arg1) {
        class371.method6541(field451, 0, arg0);
        if (arg1 < 10) {
            return field451;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field443.method825();
        this.field435.method825();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field447 != null) {
            this.field447.method825();
            this.field437.method825();
            var5 = (int) ((double) (this.field447.field323 - this.field447.field322) * 32.768D / var3);
            var6 = (int) ((double) this.field447.field322 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field438 != null) {
            this.field438.method825();
            this.field439.method825();
            var8 = (int) ((double) (this.field438.field323 - this.field438.field322) * 32.768D / var3);
            var9 = (int) ((double) this.field438.field322 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field459[var11] != 0) {
                field455[var11] = 0;
                field456[var11] = (int) ((double) this.field444[var11] * var3);
                field457[var11] = (this.field459[var11] << 14) / 100;
                field458[var11] = (int) ((double) (this.field443.field323 - this.field443.field322) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field434[var11]) / var3);
                field436[var11] = (int) ((double) this.field443.field322 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field443.method821(arg0);
            int var14 = this.field435.method821(arg0);
            if (this.field447 != null) {
                int var15 = this.field447.method821(arg0);
                int var16 = this.field437.method821(arg0);
                var13 += this.method1070(var7, var16, this.field447.field324) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field438 != null) {
                int var17 = this.field438.method821(arg0);
                int var18 = this.field439.method821(arg0);
                var14 = var14 * ((this.method1070(var10, var18, this.field438.field324) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field459[var19] != 0) {
                    int var20 = field456[var19] + var12;
                    if (var20 < arg0) {
                        field451[var20] += this.method1070(field455[var19], field457[var19] * var14 >> 15, this.field443.field324);
                        field455[var19] += (field458[var19] * var13 >> 16) + field436[var19];
                    }
                }
            }
        }
        if (this.field440 != null) {
            this.field440.method825();
            this.field450.method825();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field440.method821(arg0);
                int var26 = this.field450.method821(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field440.field323 - this.field440.field322) * var25 >> 8) + this.field440.field322;
                } else {
                    var27 = ((this.field440.field323 - this.field440.field322) * var26 >> 8) + this.field440.field322;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field451[var24] = 0;
                }
            }
        }
        if (this.field445 > 0 && this.field442 > 0) {
            int var28 = (int) ((double) this.field445 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field451[var29] += field451[var29 - var28] * this.field442 / 100;
            }
        }
        if (this.field446.field433[0] > 0 || this.field446.field433[1] > 0) {
            this.field448.method825();
            int var30 = this.field448.method821(arg0 + 1);
            int var31 = this.field446.method1059(0, (float) var30 / 65536.0F);
            int var32 = this.field446.method1059(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field451[var31 + var33] * (long) Statics.field423 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field451[var31 + var33 - 1 - var36] * (long) class58.field428[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field451[var33 - 1 - var37] * (long) class58.field428[1][var37] >> 16);
                    }
                    field451[var33] = var35;
                    var30 = this.field448.method821(arg0 + 1);
                    var33++;
                }
                boolean var38 = true;
                int var39 = 128;
                while (true) {
                    if (var39 > arg0 - var31) {
                        var39 = arg0 - var31;
                    }
                    while (var33 < var39) {
                        int var40 = (int) ((long) field451[var31 + var33] * (long) Statics.field423 >> 16);
                        for (int var41 = 0; var41 < var31; var41++) {
                            var40 += (int) ((long) field451[var31 + var33 - 1 - var41] * (long) class58.field428[0][var41] >> 16);
                        }
                        for (int var42 = 0; var42 < var32; var42++) {
                            var40 -= (int) ((long) field451[var33 - 1 - var42] * (long) class58.field428[1][var42] >> 16);
                        }
                        field451[var33] = var40;
                        var30 = this.field448.method821(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var43 = 0;
                            for (int var44 = var31 + var33 - arg0; var44 < var31; var44++) {
                                var43 += (int) ((long) field451[var31 + var33 - 1 - var44] * (long) class58.field428[0][var44] >> 16);
                            }
                            for (int var45 = 0; var45 < var32; var45++) {
                                var43 -= (int) ((long) field451[var33 - 1 - var45] * (long) class58.field428[1][var45] >> 16);
                            }
                            field451[var33] = var43;
                            this.field448.method821(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field446.method1059(0, (float) var30 / 65536.0F);
                    var32 = this.field446.method1059(1, (float) var30 / 65536.0F);
                    var39 += 128;
                }
            }
        }
        for (int var47 = 0; var47 < arg0; var47++) {
            if (field451[var47] < -32768) {
                field451[var47] = -32768;
            }
            if (field451[var47] > 32767) {
                field451[var47] = 32767;
            }
        }
        return field451;
    }

    @ObfuscatedName("bg.f(III)I")
    public final int method1070(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field453[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field452[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bg.c(Lqr;)V")
    public final void method1071(class464 arg0) {
        this.field443 = new class45();
        this.field443.method820(arg0);
        this.field435 = new class45();
        this.field435.method820(arg0);
        int var2 = arg0.method7735();
        if (var2 != 0) {
            arg0.field4864--;
            this.field447 = new class45();
            this.field447.method820(arg0);
            this.field437 = new class45();
            this.field437.method820(arg0);
        }
        int var3 = arg0.method7735();
        if (var3 != 0) {
            arg0.field4864--;
            this.field438 = new class45();
            this.field438.method820(arg0);
            this.field439 = new class45();
            this.field439.method820(arg0);
        }
        int var4 = arg0.method7735();
        if (var4 != 0) {
            arg0.field4864--;
            this.field440 = new class45();
            this.field440.method820(arg0);
            this.field450 = new class45();
            this.field450.method820(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method7801();
            if (var6 == 0) {
                break;
            }
            this.field459[var5] = var6;
            this.field434[var5] = arg0.method7813();
            this.field444[var5] = arg0.method7801();
        }
        this.field445 = arg0.method7801();
        this.field442 = arg0.method7801();
        this.field449 = arg0.method7716();
        this.field441 = arg0.method7716();
        this.field446 = new class58();
        this.field448 = new class45();
        this.field446.method1055(arg0, this.field448);
    }
}
