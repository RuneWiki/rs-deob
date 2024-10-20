package deob;

import java.util.Random;

@ObfuscatedName("bx")
public class class68 {

    @ObfuscatedName("bx.v")
    public class54 field578;

    @ObfuscatedName("bx.n")
    public class54 field568;

    @ObfuscatedName("bx.f")
    public class54 field569;

    @ObfuscatedName("bx.y")
    public class54 field570;

    @ObfuscatedName("bx.p")
    public class54 field572;

    @ObfuscatedName("bx.j")
    public class54 field567;

    @ObfuscatedName("bx.r")
    public class54 field573;

    @ObfuscatedName("bx.b")
    public class54 field574;

    @ObfuscatedName("bx.d")
    public int[] field575 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bx.s")
    public int[] field576 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bx.u")
    public int[] field577 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("bx.l")
    public int field580 = 0;

    @ObfuscatedName("bx.o")
    public int field589 = 100;

    @ObfuscatedName("bx.c")
    public class67 field571;

    @ObfuscatedName("bx.e")
    public class54 field581;

    @ObfuscatedName("bx.g")
    public int field585 = 500;

    @ObfuscatedName("bx.a")
    public int field583 = 0;

    @ObfuscatedName("bx.k")
    public static int[] field584;

    @ObfuscatedName("bx.m")
    public static int[] field586 = new int[32768];

    @ObfuscatedName("bx.x")
    public static int[] field579;

    @ObfuscatedName("bx.w")
    public static int[] field588;

    @ObfuscatedName("bx.t")
    public static int[] field582;

    @ObfuscatedName("bx.h")
    public static int[] field590;

    @ObfuscatedName("bx.q")
    public static int[] field591;

    @ObfuscatedName("bx.i")
    public static int[] field592;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field586[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field579 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field579[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field584 = new int[220500];
        field588 = new int[5];
        field582 = new int[5];
        field590 = new int[5];
        field591 = new int[5];
        field592 = new int[5];
    }

    @ObfuscatedName("bx.v(II)[I")
    public final int[] method933(int arg0, int arg1) {
        class307.method5073(field584, 0, arg0);
        if (arg1 < 10) {
            return field584;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field578.method668();
        this.field568.method668();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field569 != null) {
            this.field569.method668();
            this.field570.method668();
            var5 = (int) ((double) (this.field569.field453 - this.field569.field448) * 32.768D / var3);
            var6 = (int) ((double) this.field569.field448 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field572 != null) {
            this.field572.method668();
            this.field567.method668();
            var8 = (int) ((double) (this.field572.field453 - this.field572.field448) * 32.768D / var3);
            var9 = (int) ((double) this.field572.field448 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field575[var11] != 0) {
                field588[var11] = 0;
                field582[var11] = (int) ((double) this.field577[var11] * var3);
                field590[var11] = (this.field575[var11] << 14) / 100;
                field591[var11] = (int) ((double) (this.field578.field453 - this.field578.field448) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field576[var11]) / var3);
                field592[var11] = (int) ((double) this.field578.field448 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field578.method669(arg0);
            int var14 = this.field568.method669(arg0);
            if (this.field569 != null) {
                int var15 = this.field569.method669(arg0);
                int var16 = this.field570.method669(arg0);
                var13 += this.method939(var7, var16, this.field569.field450) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field572 != null) {
                int var17 = this.field572.method669(arg0);
                int var18 = this.field567.method669(arg0);
                var14 = var14 * ((this.method939(var10, var18, this.field572.field450) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field575[var19] != 0) {
                    int var20 = field582[var19] + var12;
                    if (var20 < arg0) {
                        field584[var20] += this.method939(field588[var19], field590[var19] * var14 >> 15, this.field578.field450);
                        field588[var19] += (field591[var19] * var13 >> 16) + field592[var19];
                    }
                }
            }
        }
        if (this.field573 != null) {
            this.field573.method668();
            this.field574.method668();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field573.method669(arg0);
                int var26 = this.field574.method669(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field573.field453 - this.field573.field448) * var25 >> 8) + this.field573.field448;
                } else {
                    var27 = ((this.field573.field453 - this.field573.field448) * var26 >> 8) + this.field573.field448;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field584[var24] = 0;
                }
            }
        }
        if (this.field580 > 0 && this.field589 > 0) {
            int var28 = (int) ((double) this.field580 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field584[var29] += field584[var29 - var28] * this.field589 / 100;
            }
        }
        if (this.field571.field564[0] > 0 || this.field571.field564[1] > 0) {
            this.field581.method668();
            int var30 = this.field581.method669(arg0 + 1);
            int var31 = this.field571.method915(0, (float) var30 / 65536.0F);
            int var32 = this.field571.method915(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field584[var31 + var33] * (long) Statics.field558 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field584[var31 + var33 - 1 - var36] * (long) class67.field560[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field584[var33 - 1 - var37] * (long) class67.field560[1][var37] >> 16);
                    }
                    field584[var33] = var35;
                    var30 = this.field581.method669(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field584[var31 + var33] * (long) Statics.field558 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field584[var31 + var33 - 1 - var40] * (long) class67.field560[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field584[var33 - 1 - var41] * (long) class67.field560[1][var41] >> 16);
                        }
                        field584[var33] = var39;
                        var30 = this.field581.method669(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field584[var31 + var33 - 1 - var43] * (long) class67.field560[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field584[var33 - 1 - var44] * (long) class67.field560[1][var44] >> 16);
                            }
                            field584[var33] = var42;
                            this.field581.method669(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field571.method915(0, (float) var30 / 65536.0F);
                    var32 = this.field571.method915(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field584[var46] < -32768) {
                field584[var46] = -32768;
            }
            if (field584[var46] > 32767) {
                field584[var46] = 32767;
            }
        }
        return field584;
    }

    @ObfuscatedName("bx.n(III)I")
    public final int method939(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field579[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field586[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bx.f(Lnd;)V")
    public final void method935(class383 arg0) {
        this.field578 = new class54();
        this.field578.method667(arg0);
        this.field568 = new class54();
        this.field568.method667(arg0);
        int var2 = arg0.method5965();
        if (var2 != 0) {
            arg0.field4158--;
            this.field569 = new class54();
            this.field569.method667(arg0);
            this.field570 = new class54();
            this.field570.method667(arg0);
        }
        int var3 = arg0.method5965();
        if (var3 != 0) {
            arg0.field4158--;
            this.field572 = new class54();
            this.field572.method667(arg0);
            this.field567 = new class54();
            this.field567.method667(arg0);
        }
        int var4 = arg0.method5965();
        if (var4 != 0) {
            arg0.field4158--;
            this.field573 = new class54();
            this.field573.method667(arg0);
            this.field574 = new class54();
            this.field574.method667(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method5979();
            if (var6 == 0) {
                break;
            }
            this.field575[var5] = var6;
            this.field576[var5] = arg0.method5978();
            this.field577[var5] = arg0.method5979();
        }
        this.field580 = arg0.method5979();
        this.field589 = arg0.method5979();
        this.field585 = arg0.method5967();
        this.field583 = arg0.method5967();
        this.field571 = new class67();
        this.field581 = new class54();
        this.field571.method919(arg0, this.field581);
    }
}
