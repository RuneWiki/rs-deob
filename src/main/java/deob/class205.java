package deob;

@ObfuscatedName("ga")
public class class205 extends class120 {

    @ObfuscatedName("ga.a")
    public class191 field2529 = new class191(128);

    @ObfuscatedName("ga.j")
    public int field2516 = 256;

    @ObfuscatedName("ga.n")
    public int field2518 = 1000000;

    @ObfuscatedName("ga.r")
    public int[] field2535 = new int[16];

    @ObfuscatedName("ga.v")
    public int[] field2520 = new int[16];

    @ObfuscatedName("ga.e")
    public int[] field2524 = new int[16];

    @ObfuscatedName("ga.l")
    public int[] field2521 = new int[16];

    @ObfuscatedName("ga.s")
    public int[] field2522 = new int[16];

    @ObfuscatedName("ga.p")
    public int[] field2523 = new int[16];

    @ObfuscatedName("ga.m")
    public int[] field2531 = new int[16];

    @ObfuscatedName("ga.u")
    public int[] field2525 = new int[16];

    @ObfuscatedName("ga.g")
    public int[] field2526 = new int[16];

    @ObfuscatedName("ga.h")
    public int[] field2527 = new int[16];

    @ObfuscatedName("ga.z")
    public int[] field2528 = new int[16];

    @ObfuscatedName("ga.i")
    public int[] field2519 = new int[16];

    @ObfuscatedName("ga.d")
    public int[] field2517 = new int[16];

    @ObfuscatedName("ga.b")
    public int[] field2515 = new int[16];

    @ObfuscatedName("ga.q")
    public int[] field2532 = new int[16];

    @ObfuscatedName("ga.y")
    public class206[][] field2533 = new class206[16][128];

    @ObfuscatedName("ga.ai")
    public class206[][] field2534 = new class206[16][128];

    @ObfuscatedName("ga.ae")
    public class207 field2530 = new class207();

    @ObfuscatedName("ga.au")
    public boolean field2536;

    @ObfuscatedName("ga.ak")
    public int field2537;

    @ObfuscatedName("ga.ap")
    public int field2538;

    @ObfuscatedName("ga.ar")
    public long field2539;

    @ObfuscatedName("ga.am")
    public long field2540;

    @ObfuscatedName("ga.aw")
    public class209 field2541 = new class209(this);

    public class205() {
        this.method3440();
    }

    @ObfuscatedName("ga.a(II)V")
    public synchronized void method3421(int arg0) {
        this.field2516 = arg0;
    }

    @ObfuscatedName("ga.j(I)I")
    public int method3422() {
        return this.field2516;
    }

    @ObfuscatedName("ga.n(Lhc;Lif;Ldu;II)Z")
    public synchronized boolean method3423(class210 arg0, class236 arg1, class113 arg2, int arg3) {
        arg0.method3584();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class200 var7 = (class200) arg0.field2598.method3262(); var7 != null; var7 = (class200) arg0.field2598.method3263()) {
            int var8 = (int) var7.field2467;
            class208 var9 = (class208) this.field2529.method3264((long) var8);
            if (var9 == null) {
                var9 = class208.method3419(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2529.method3260(var9, (long) var8);
            }
            if (!var9.method3564(arg2, var7.field2481, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3585();
        }
        return var5;
    }

    @ObfuscatedName("ga.r(I)V")
    public synchronized void method3494() {
        for (class208 var1 = (class208) this.field2529.method3262(); var1 != null; var1 = (class208) this.field2529.method3263()) {
            var1.method3565();
        }
    }

    @ObfuscatedName("ga.v(I)V")
    public synchronized void method3425() {
        for (class208 var1 = (class208) this.field2529.method3262(); var1 != null; var1 = (class208) this.field2529.method3263()) {
            var1.method3308();
        }
    }

    @ObfuscatedName("ga.p(Lhc;ZB)V")
    public synchronized void method3426(class210 arg0, boolean arg1) {
        this.method3427();
        this.field2530.method3514(arg0.field2599);
        this.field2536 = arg1;
        this.field2539 = 0L;
        int var3 = this.field2530.method3517();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2530.method3518(var4);
            this.field2530.method3521(var4);
            this.field2530.method3519(var4);
        }
        this.field2537 = this.field2530.method3538();
        this.field2538 = this.field2530.field2570[this.field2537];
        this.field2540 = this.field2530.method3539(this.field2538);
    }

    @ObfuscatedName("ga.u(I)V")
    public synchronized void method3427() {
        this.field2530.method3546();
        this.method3440();
    }

    @ObfuscatedName("ga.g(I)Z")
    public synchronized boolean method3428() {
        return this.field2530.method3523();
    }

    @ObfuscatedName("ga.k(IIB)V")
    public synchronized void method3452(int arg0, int arg1) {
        this.method3429(arg0, arg1);
    }

    @ObfuscatedName("ga.c(IIB)V")
    public void method3429(int arg0, int arg1) {
        this.field2521[arg0] = arg1;
        this.field2523[arg0] = arg1 & 0xFFFFFF80;
        this.method3469(arg0, arg1);
    }

    @ObfuscatedName("ga.o(III)V")
    public void method3469(int arg0, int arg1) {
        if (this.field2522[arg0] != arg1) {
            this.field2522[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2534[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ga.x(IIII)V")
    public void method3430(int arg0, int arg1, int arg2) {
        this.method3432(arg0, arg1, 64);
        if ((this.field2527[arg0] & 0x2) != 0) {
            for (class206 var4 = (class206) this.field2541.field2591.method3336(); var4 != null; var4 = (class206) this.field2541.field2591.method3328()) {
                if (var4.field2546 == arg0 && var4.field2552 < 0) {
                    this.field2533[arg0][var4.field2547] = null;
                    this.field2533[arg0][arg1] = var4;
                    int var5 = (var4.field2557 * var4.field2551 >> 12) + var4.field2550;
                    var4.field2550 += arg1 - var4.field2547 << 8;
                    var4.field2551 = var5 - var4.field2550;
                    var4.field2557 = 4096;
                    var4.field2547 = arg1;
                    return;
                }
            }
        }
        class208 var6 = (class208) this.field2529.method3264((long) this.field2522[arg0]);
        if (var6 == null) {
            return;
        }
        class108 var7 = var6.field2580[arg1];
        if (var7 == null) {
            return;
        }
        class206 var8 = new class206();
        var8.field2546 = arg0;
        var8.field2543 = var6;
        var8.field2544 = var7;
        var8.field2545 = var6.field2579[arg1];
        var8.field2549 = var6.field2585[arg1];
        var8.field2547 = arg1;
        var8.field2548 = var6.field2582 * arg2 * arg2 * var6.field2584[arg1] + 1024 >> 11;
        var8.field2564 = var6.field2583[arg1] & 0xFF;
        var8.field2550 = (arg1 << 8) - (var6.field2581[arg1] & 0x7FFF);
        var8.field2553 = 0;
        var8.field2554 = 0;
        var8.field2555 = 0;
        var8.field2552 = -1;
        var8.field2556 = 0;
        if (this.field2517[arg0] == 0) {
            var8.field2558 = class118.method1980(var7, this.method3444(var8), this.method3508(var8), this.method3446(var8));
        } else {
            var8.field2558 = class118.method1980(var7, this.method3444(var8), 0, this.method3446(var8));
            this.method3431(var8, var6.field2581[arg1] < 0);
        }
        if (var6.field2581[arg1] < 0) {
            var8.field2558.method2011(-1);
        }
        if (var8.field2549 >= 0) {
            class206 var9 = this.field2534[arg0][var8.field2549];
            if (var9 != null && var9.field2552 < 0) {
                this.field2533[arg0][var9.field2547] = null;
                var9.field2552 = 0;
            }
            this.field2534[arg0][var8.field2549] = var8;
        }
        this.field2541.field2591.method3320(var8);
        this.field2533[arg0][arg1] = var8;
    }

    @ObfuscatedName("ga.h(Lgq;ZB)V")
    public void method3431(class206 arg0, boolean arg1) {
        int var3 = arg0.field2544.field1608.length;
        int var5;
        if (arg1 && arg0.field2544.field1605) {
            int var4 = var3 + var3 - arg0.field2544.field1606;
            var5 = (int) ((long) this.field2517[arg0.field2546] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2558.method1933(true);
            }
        } else {
            var5 = (int) ((long) this.field2517[arg0.field2546] * (long) var3 >> 6);
        }
        arg0.field2558.method1967(var5);
    }

    @ObfuscatedName("ga.z(IIIB)V")
    public void method3432(int arg0, int arg1, int arg2) {
        class206 var4 = this.field2533[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2533[arg0][arg1] = null;
        if ((this.field2527[arg0] & 0x2) == 0) {
            var4.field2552 = 0;
            return;
        }
        for (class206 var5 = (class206) this.field2541.field2591.method3318(); var5 != null; var5 = (class206) this.field2541.field2591.method3338()) {
            if (var4.field2546 == var5.field2546 && var5.field2552 < 0 && var4 != var5) {
                var4.field2552 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ga.i(IIII)V")
    public void method3450(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ga.d(IIB)V")
    public void method3434(int arg0, int arg1) {
    }

    @ObfuscatedName("ga.aa(III)V")
    public void method3435(int arg0, int arg1) {
        this.field2531[arg0] = arg1;
    }

    @ObfuscatedName("ga.ag(II)V")
    public void method3436(int arg0) {
        for (class206 var2 = (class206) this.field2541.field2591.method3318(); var2 != null; var2 = (class206) this.field2541.field2591.method3338()) {
            if (arg0 < 0 || var2.field2546 == arg0) {
                if (var2.field2558 != null) {
                    var2.field2558.method1937(Statics.field1552 / 100);
                    if (var2.field2558.method1941()) {
                        this.field2541.field2592.method1720(var2.field2558);
                    }
                    var2.method3511();
                }
                if (var2.field2552 < 0) {
                    this.field2533[var2.field2546][var2.field2547] = null;
                }
                var2.method3308();
            }
        }
    }

    @ObfuscatedName("ga.aj(II)V")
    public void method3437(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3437(var2);
            }
            return;
        }
        this.field2535[arg0] = 12800;
        this.field2520[arg0] = 8192;
        this.field2524[arg0] = 16383;
        this.field2531[arg0] = 8192;
        this.field2525[arg0] = 0;
        this.field2526[arg0] = 8192;
        this.method3458(arg0);
        this.method3441(arg0);
        this.field2527[arg0] = 0;
        this.field2528[arg0] = 32767;
        this.field2519[arg0] = 256;
        this.field2517[arg0] = 0;
        this.method3443(arg0, 8192);
    }

    @ObfuscatedName("ga.as(II)V")
    public void method3438(int arg0) {
        for (class206 var2 = (class206) this.field2541.field2591.method3318(); var2 != null; var2 = (class206) this.field2541.field2591.method3338()) {
            if ((arg0 < 0 || var2.field2546 == arg0) && var2.field2552 < 0) {
                this.field2533[var2.field2546][var2.field2547] = null;
                var2.field2552 = 0;
            }
        }
    }

    @ObfuscatedName("ga.av(B)V")
    public void method3440() {
        this.method3436(-1);
        this.method3437(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2522[var1] = this.field2521[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2523[var2] = this.field2521[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ga.ab(IS)V")
    public void method3458(int arg0) {
        if ((this.field2527[arg0] & 0x2) == 0) {
            return;
        }
        for (class206 var2 = (class206) this.field2541.field2591.method3318(); var2 != null; var2 = (class206) this.field2541.field2591.method3338()) {
            if (var2.field2546 == arg0 && this.field2533[arg0][var2.field2547] == null && var2.field2552 < 0) {
                var2.field2552 = 0;
            }
        }
    }

    @ObfuscatedName("ga.at(IB)V")
    public void method3441(int arg0) {
        if ((this.field2527[arg0] & 0x4) == 0) {
            return;
        }
        for (class206 var2 = (class206) this.field2541.field2591.method3318(); var2 != null; var2 = (class206) this.field2541.field2591.method3338()) {
            if (var2.field2546 == arg0) {
                var2.field2562 = 0;
            }
        }
    }

    @ObfuscatedName("ga.ah(IS)V")
    public void method3442(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3432(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3430(var6, var7, var8);
            } else {
                this.method3432(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3450(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2523[var12] = (var14 << 14) + (this.field2523[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2523[var12] = (var14 << 7) + (this.field2523[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2525[var12] = (var14 << 7) + (this.field2525[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2525[var12] = (this.field2525[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2526[var12] = (var14 << 7) + (this.field2526[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2526[var12] = (this.field2526[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2535[var12] = (var14 << 7) + (this.field2535[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2535[var12] = (this.field2535[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2520[var12] = (var14 << 7) + (this.field2520[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2520[var12] = (this.field2520[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2524[var12] = (var14 << 7) + (this.field2524[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2524[var12] = (this.field2524[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2527[var12] |= 0x1;
                } else {
                    this.field2527[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2527[var12] |= 0x2;
                } else {
                    this.method3458(var12);
                    this.field2527[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2528[var12] = (var14 << 7) + (this.field2528[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2528[var12] = (this.field2528[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2528[var12] = (var14 << 7) + (this.field2528[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2528[var12] = (this.field2528[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3436(var12);
            }
            if (var13 == 121) {
                this.method3437(var12);
            }
            if (var13 == 123) {
                this.method3438(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2528[var12];
                if (var15 == 16384) {
                    this.field2519[var12] = (var14 << 7) + (this.field2519[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2528[var12];
                if (var16 == 16384) {
                    this.field2519[var12] = (this.field2519[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2517[var12] = (var14 << 7) + (this.field2517[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2517[var12] = (this.field2517[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2527[var12] |= 0x4;
                } else {
                    this.method3441(var12);
                    this.field2527[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3443(var12, (var14 << 7) + (this.field2515[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3443(var12, (this.field2515[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3469(var17, this.field2523[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3434(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3435(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3440();
            }
        }
    }

    @ObfuscatedName("ga.an(IIB)V")
    public void method3443(int arg0, int arg1) {
        this.field2515[arg0] = arg1;
        this.field2532[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ga.ay(Lgq;I)I")
    public int method3444(class206 arg0) {
        int var2 = (arg0.field2557 * arg0.field2551 >> 12) + arg0.field2550;
        int var3 = ((this.field2531[arg0.field2546] - 8192) * this.field2519[arg0.field2546] >> 12) + var2;
        class203 var4 = arg0.field2545;
        if (var4.field2493 > 0 && (var4.field2492 > 0 || this.field2525[arg0.field2546] > 0)) {
            int var5 = var4.field2492 << 2;
            int var6 = var4.field2494 << 1;
            if (arg0.field2563 < var6) {
                var5 = arg0.field2563 * var5 / var6;
            }
            int var7 = (this.field2525[arg0.field2546] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2559 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2544.field1604 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1552 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ga.ao(Lgq;I)I")
    public int method3508(class206 arg0) {
        class203 var2 = arg0.field2545;
        int var3 = this.field2535[arg0.field2546] * this.field2524[arg0.field2546] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2548 * var4 + 16384 >> 15;
        int var6 = this.field2516 * var5 + 128 >> 8;
        if (var2.field2495 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2553 * 1.953125E-5D * (double) var2.field2495) + 0.5D);
        }
        if (var2.field2489 != null) {
            int var7 = arg0.field2554;
            int var8 = var2.field2489[arg0.field2555 + 1];
            if (arg0.field2555 < var2.field2489.length - 2) {
                int var9 = (var2.field2489[arg0.field2555] & 0xFF) << 8;
                int var10 = (var2.field2489[arg0.field2555 + 2] & 0xFF) << 8;
                var8 += (var2.field2489[arg0.field2555 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2552 > 0 && var2.field2487 != null) {
            int var11 = arg0.field2552;
            int var12 = var2.field2487[arg0.field2556 + 1];
            if (arg0.field2556 < var2.field2487.length - 2) {
                int var13 = (var2.field2487[arg0.field2556] & 0xFF) << 8;
                int var14 = (var2.field2487[arg0.field2556 + 2] & 0xFF) << 8;
                var12 += (var2.field2487[arg0.field2556 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ga.ac(Lgq;I)I")
    public int method3446(class206 arg0) {
        int var2 = this.field2520[arg0.field2546];
        return var2 < 8192 ? arg0.field2564 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2564) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ga.e()Ldf;")
    public synchronized class120 method1698() {
        return this.field2541;
    }

    @ObfuscatedName("ga.l()Ldf;")
    public synchronized class120 method1719() {
        return null;
    }

    @ObfuscatedName("ga.s()I")
    public synchronized int method1700() {
        return 0;
    }

    @ObfuscatedName("ga.w([III)V")
    public synchronized void method1721(int[] arg0, int arg1, int arg2) {
        if (this.field2530.method3523()) {
            int var4 = this.field2518 * this.field2530.field2566 / Statics.field1552;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2539;
                if (this.field2540 - var5 >= 0L) {
                    this.field2539 = var5;
                    break;
                }
                int var7 = (int) ((this.field2540 - this.field2539 + (long) var4 - 1L) / (long) var4);
                this.field2539 += (long) var4 * (long) var7;
                this.field2541.method1721(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3447();
            } while (this.field2530.method3523());
        }
        this.field2541.method1721(arg0, arg1, arg2);
    }

    @ObfuscatedName("ga.m(I)V")
    public synchronized void method1703(int arg0) {
        if (this.field2530.method3523()) {
            int var2 = this.field2518 * this.field2530.field2566 / Statics.field1552;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2539;
                if (this.field2540 - var3 >= 0L) {
                    this.field2539 = var3;
                    break;
                }
                int var5 = (int) ((this.field2540 - this.field2539 + (long) var2 - 1L) / (long) var2);
                this.field2539 += (long) var2 * (long) var5;
                this.field2541.method1703(var5);
                arg0 -= var5;
                this.method3447();
            } while (this.field2530.method3523());
        }
        this.field2541.method1703(arg0);
    }

    @ObfuscatedName("ga.af(B)V")
    public void method3447() {
        int var1 = this.field2537;
        int var2 = this.field2538;
        long var3 = this.field2540;
        while (this.field2538 == var2) {
            while (this.field2530.field2570[var1] == var2) {
                this.field2530.method3518(var1);
                int var5 = this.field2530.method3556(var1);
                if (var5 == 1) {
                    this.field2530.method3520();
                    this.field2530.method3519(var1);
                    if (this.field2530.method3526()) {
                        if (!this.field2536 || var2 == 0) {
                            this.method3440();
                            this.field2530.method3546();
                            return;
                        }
                        this.field2530.method3527(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3442(var5);
                }
                this.field2530.method3521(var1);
                this.field2530.method3519(var1);
            }
            var1 = this.field2530.method3538();
            var2 = this.field2530.field2570[var1];
            var3 = this.field2530.method3539(var2);
        }
        this.field2537 = var1;
        this.field2538 = var2;
        this.field2540 = var3;
    }

    @ObfuscatedName("ga.bp(Lgq;I)Z")
    public boolean method3448(class206 arg0) {
        if (arg0.field2558 != null) {
            return false;
        }
        if (arg0.field2552 >= 0) {
            arg0.method3308();
            if (arg0.field2549 > 0 && this.field2534[arg0.field2546][arg0.field2549] == arg0) {
                this.field2534[arg0.field2546][arg0.field2549] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ga.bi(Lgq;[IIII)Z")
    public boolean method3488(class206 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2561 = Statics.field1552 / 100;
        if (arg0.field2552 >= 0 && arg0.field2558 == null || arg0.field2558.method1940()) {
            arg0.method3511();
            arg0.method3308();
            if (arg0.field2549 > 0 && this.field2534[arg0.field2546][arg0.field2549] == arg0) {
                this.field2534[arg0.field2546][arg0.field2549] = null;
            }
            return true;
        }
        int var5 = arg0.field2557;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2526[arg0.field2546] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2557 = var6;
        }
        arg0.field2558.method1938(this.method3444(arg0));
        class203 var7 = arg0.field2545;
        boolean var8 = false;
        arg0.field2563++;
        arg0.field2559 += var7.field2493;
        double var9 = (double) ((arg0.field2547 - 60 << 8) + (arg0.field2557 * arg0.field2551 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2495 > 0) {
            if (var7.field2491 > 0) {
                arg0.field2553 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2491 * var9) + 0.5D);
            } else {
                arg0.field2553 += 128;
            }
        }
        if (var7.field2489 != null) {
            if (var7.field2488 > 0) {
                arg0.field2554 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2488 * var9) + 0.5D);
            } else {
                arg0.field2554 += 128;
            }
            while (arg0.field2555 < var7.field2489.length - 2 && arg0.field2554 > (var7.field2489[arg0.field2555 + 2] & 0xFF) << 8) {
                arg0.field2555 += 2;
            }
            if (arg0.field2555 == var7.field2489.length - 2 && var7.field2489[arg0.field2555 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2552 >= 0 && var7.field2487 != null && (this.field2527[arg0.field2546] & 0x1) == 0 && (arg0.field2549 < 0 || this.field2534[arg0.field2546][arg0.field2549] != arg0)) {
            if (var7.field2490 > 0) {
                arg0.field2552 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2490 * var9) + 0.5D);
            } else {
                arg0.field2552 += 128;
            }
            while (arg0.field2556 < var7.field2487.length - 2 && arg0.field2552 > (var7.field2487[arg0.field2556 + 2] & 0xFF) << 8) {
                arg0.field2556 += 2;
            }
            if (arg0.field2556 == var7.field2487.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2558.method1927(arg0.field2561, this.method3508(arg0), this.method3446(arg0));
            return false;
        }
        arg0.field2558.method1937(arg0.field2561);
        if (arg1 == null) {
            arg0.field2558.method1703(arg3);
        } else {
            arg0.field2558.method1721(arg1, arg2, arg3);
        }
        if (arg0.field2558.method1941()) {
            this.field2541.field2592.method1720(arg0.field2558);
        }
        arg0.method3511();
        if (arg0.field2552 >= 0) {
            arg0.method3308();
            if (arg0.field2549 > 0 && this.field2534[arg0.field2546][arg0.field2549] == arg0) {
                this.field2534[arg0.field2546][arg0.field2549] = null;
            }
        }
        return true;
    }
}
