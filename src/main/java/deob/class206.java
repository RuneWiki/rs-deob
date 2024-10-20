package deob;

@ObfuscatedName("gx")
public class class206 extends class121 {

    @ObfuscatedName("gx.j")
    public class192 field2516 = new class192(128);

    @ObfuscatedName("gx.h")
    public int field2512 = 256;

    @ObfuscatedName("gx.f")
    public int field2513 = 1000000;

    @ObfuscatedName("gx.p")
    public int[] field2514 = new int[16];

    @ObfuscatedName("gx.x")
    public int[] field2534 = new int[16];

    @ObfuscatedName("gx.g")
    public int[] field2511 = new int[16];

    @ObfuscatedName("gx.c")
    public int[] field2529 = new int[16];

    @ObfuscatedName("gx.l")
    public int[] field2518 = new int[16];

    @ObfuscatedName("gx.b")
    public int[] field2519 = new int[16];

    @ObfuscatedName("gx.o")
    public int[] field2515 = new int[16];

    @ObfuscatedName("gx.m")
    public int[] field2521 = new int[16];

    @ObfuscatedName("gx.i")
    public int[] field2522 = new int[16];

    @ObfuscatedName("gx.y")
    public int[] field2524 = new int[16];

    @ObfuscatedName("gx.z")
    public int[] field2525 = new int[16];

    @ObfuscatedName("gx.u")
    public int[] field2526 = new int[16];

    @ObfuscatedName("gx.k")
    public int[] field2527 = new int[16];

    @ObfuscatedName("gx.q")
    public int[] field2528 = new int[16];

    @ObfuscatedName("gx.n")
    public int[] field2517 = new int[16];

    @ObfuscatedName("gx.d")
    public class207[][] field2530 = new class207[16][128];

    @ObfuscatedName("gx.ax")
    public class207[][] field2531 = new class207[16][128];

    @ObfuscatedName("gx.ao")
    public class208 field2532 = new class208();

    @ObfuscatedName("gx.an")
    public boolean field2520;

    @ObfuscatedName("gx.ar")
    public int field2533;

    @ObfuscatedName("gx.ag")
    public int field2535;

    @ObfuscatedName("gx.av")
    public long field2536;

    @ObfuscatedName("gx.ab")
    public long field2537;

    @ObfuscatedName("gx.aj")
    public class210 field2538 = new class210(this);

    public class206() {
        this.method3425();
    }

    @ObfuscatedName("gx.j(IB)V")
    public synchronized void method3406(int arg0) {
        this.field2512 = arg0;
    }

    @ObfuscatedName("gx.h(B)I")
    public int method3420() {
        return this.field2512;
    }

    @ObfuscatedName("gx.f(Lhe;Lia;Ldy;II)Z")
    public synchronized boolean method3407(class211 arg0, class237 arg1, class114 arg2, int arg3) {
        arg0.method3594();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class201 var7 = (class201) arg0.field2593.method3276(); var7 != null; var7 = (class201) arg0.field2593.method3277()) {
            int var8 = (int) var7.field2469;
            class209 var9 = (class209) this.field2516.method3281((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3779(var8);
                class209 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class209(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2516.method3274(var11, (long) var8);
            }
            if (!var9.method3576(arg2, var7.field2484, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3596();
        }
        return var5;
    }

    @ObfuscatedName("gx.p(B)V")
    public synchronized void method3408() {
        for (class209 var1 = (class209) this.field2516.method3276(); var1 != null; var1 = (class209) this.field2516.method3277()) {
            var1.method3578();
        }
    }

    @ObfuscatedName("gx.x(B)V")
    public synchronized void method3409() {
        for (class209 var1 = (class209) this.field2516.method3276(); var1 != null; var1 = (class209) this.field2516.method3277()) {
            var1.method3314();
        }
    }

    @ObfuscatedName("gx.b(Lhe;ZB)V")
    public synchronized void method3433(class211 arg0, boolean arg1) {
        this.method3460();
        this.field2532.method3519(arg0.field2594);
        this.field2520 = arg1;
        this.field2536 = 0L;
        int var3 = this.field2532.method3550();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2532.method3523(var4);
            this.field2532.method3521(var4);
            this.field2532.method3524(var4);
        }
        this.field2533 = this.field2532.method3530();
        this.field2535 = this.field2532.field2573[this.field2533];
        this.field2537 = this.field2532.method3529(this.field2535);
    }

    @ObfuscatedName("gx.m(B)V")
    public synchronized void method3460() {
        this.field2532.method3525();
        this.method3425();
    }

    @ObfuscatedName("gx.e(I)Z")
    public synchronized boolean method3412() {
        return this.field2532.method3553();
    }

    @ObfuscatedName("gx.a(III)V")
    public synchronized void method3413(int arg0, int arg1) {
        this.method3414(arg0, arg1);
    }

    @ObfuscatedName("gx.v(III)V")
    public void method3414(int arg0, int arg1) {
        this.field2529[arg0] = arg1;
        this.field2519[arg0] = arg1 & 0xFFFFFF80;
        this.method3505(arg0, arg1);
    }

    @ObfuscatedName("gx.t(III)V")
    public void method3505(int arg0, int arg1) {
        if (this.field2518[arg0] != arg1) {
            this.field2518[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2531[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gx.y(IIII)V")
    public void method3465(int arg0, int arg1, int arg2) {
        this.method3418(arg0, arg1, 64);
        if ((this.field2524[arg0] & 0x2) != 0) {
            for (class207 var4 = (class207) this.field2538.field2592.method3322(); var4 != null; var4 = (class207) this.field2538.field2592.method3324()) {
                if (var4.field2545 == arg0 && var4.field2554 < 0) {
                    this.field2530[arg0][var4.field2560] = null;
                    this.field2530[arg0][arg1] = var4;
                    int var5 = (var4.field2550 * var4.field2549 >> 12) + var4.field2548;
                    var4.field2548 += arg1 - var4.field2560 << 8;
                    var4.field2549 = var5 - var4.field2548;
                    var4.field2550 = 4096;
                    var4.field2560 = arg1;
                    return;
                }
            }
        }
        class209 var6 = (class209) this.field2516.method3281((long) this.field2518[arg0]);
        if (var6 == null) {
            return;
        }
        class109 var7 = var6.field2579[arg1];
        if (var7 == null) {
            return;
        }
        class207 var8 = new class207();
        var8.field2545 = arg0;
        var8.field2541 = var6;
        var8.field2543 = var7;
        var8.field2542 = var6.field2583[arg1];
        var8.field2544 = var6.field2584[arg1];
        var8.field2560 = arg1;
        var8.field2546 = var6.field2582 * arg2 * arg2 * var6.field2585[arg1] + 1024 >> 11;
        var8.field2547 = var6.field2588[arg1] & 0xFF;
        var8.field2548 = (arg1 << 8) - (var6.field2580[arg1] & 0x7FFF);
        var8.field2551 = 0;
        var8.field2540 = 0;
        var8.field2553 = 0;
        var8.field2554 = -1;
        var8.field2556 = 0;
        if (this.field2527[arg0] == 0) {
            var8.field2558 = class119.method2063(var7, this.method3430(var8), this.method3431(var8), this.method3432(var8));
        } else {
            var8.field2558 = class119.method2063(var7, this.method3430(var8), 0, this.method3432(var8));
            this.method3426(var8, var6.field2580[arg1] < 0);
        }
        if (var6.field2580[arg1] < 0) {
            var8.field2558.method1998(-1);
        }
        if (var8.field2544 >= 0) {
            class207 var9 = this.field2531[arg0][var8.field2544];
            if (var9 != null && var9.field2554 < 0) {
                this.field2530[arg0][var9.field2560] = null;
                var9.field2554 = 0;
            }
            this.field2531[arg0][var8.field2544] = var8;
        }
        this.field2538.field2592.method3317(var8);
        this.field2530[arg0][arg1] = var8;
    }

    @ObfuscatedName("gx.u(Lgm;ZI)V")
    public void method3426(class207 arg0, boolean arg1) {
        int var3 = arg0.field2543.field1619.length;
        int var5;
        if (arg1 && arg0.field2543.field1618) {
            int var4 = var3 + var3 - arg0.field2543.field1617;
            var5 = (int) ((long) this.field2527[arg0.field2545] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2558.method1971(true);
            }
        } else {
            var5 = (int) ((long) this.field2527[arg0.field2545] * (long) var3 >> 6);
        }
        arg0.field2558.method2004(var5);
    }

    @ObfuscatedName("gx.n(IIII)V")
    public void method3418(int arg0, int arg1, int arg2) {
        class207 var4 = this.field2530[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2530[arg0][arg1] = null;
        if ((this.field2524[arg0] & 0x2) == 0) {
            var4.field2554 = 0;
            return;
        }
        for (class207 var5 = (class207) this.field2538.field2592.method3326(); var5 != null; var5 = (class207) this.field2538.field2592.method3323()) {
            if (var4.field2545 == var5.field2545 && var5.field2554 < 0 && var4 != var5) {
                var4.field2554 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gx.d(IIIB)V")
    public void method3419(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gx.ax(III)V")
    public void method3472(int arg0, int arg1) {
    }

    @ObfuscatedName("gx.ao(III)V")
    public void method3421(int arg0, int arg1) {
        this.field2515[arg0] = arg1;
    }

    @ObfuscatedName("gx.an(II)V")
    public void method3446(int arg0) {
        for (class207 var2 = (class207) this.field2538.field2592.method3326(); var2 != null; var2 = (class207) this.field2538.field2592.method3323()) {
            if (arg0 < 0 || var2.field2545 == arg0) {
                if (var2.field2558 != null) {
                    var2.field2558.method2003(Statics.field1652 / 100);
                    if (var2.field2558.method2007()) {
                        this.field2538.field2590.method1737(var2.field2558);
                    }
                    var2.method3516();
                }
                if (var2.field2554 < 0) {
                    this.field2530[var2.field2545][var2.field2560] = null;
                }
                var2.method3314();
            }
        }
    }

    @ObfuscatedName("gx.ar(II)V")
    public void method3434(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3434(var2);
            }
            return;
        }
        this.field2514[arg0] = 12800;
        this.field2534[arg0] = 8192;
        this.field2511[arg0] = 16383;
        this.field2515[arg0] = 8192;
        this.field2521[arg0] = 0;
        this.field2522[arg0] = 8192;
        this.method3485(arg0);
        this.method3427(arg0);
        this.field2524[arg0] = 0;
        this.field2525[arg0] = 32767;
        this.field2526[arg0] = 256;
        this.field2527[arg0] = 0;
        this.method3429(arg0, 8192);
    }

    @ObfuscatedName("gx.ag(IB)V")
    public void method3424(int arg0) {
        for (class207 var2 = (class207) this.field2538.field2592.method3326(); var2 != null; var2 = (class207) this.field2538.field2592.method3323()) {
            if ((arg0 < 0 || var2.field2545 == arg0) && var2.field2554 < 0) {
                this.field2530[var2.field2545][var2.field2560] = null;
                var2.field2554 = 0;
            }
        }
    }

    @ObfuscatedName("gx.ap(I)V")
    public void method3425() {
        this.method3446(-1);
        this.method3434(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2518[var1] = this.field2529[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2519[var2] = this.field2529[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gx.ad(II)V")
    public void method3485(int arg0) {
        if ((this.field2524[arg0] & 0x2) == 0) {
            return;
        }
        for (class207 var2 = (class207) this.field2538.field2592.method3326(); var2 != null; var2 = (class207) this.field2538.field2592.method3323()) {
            if (var2.field2545 == arg0 && this.field2530[arg0][var2.field2560] == null && var2.field2554 < 0) {
                var2.field2554 = 0;
            }
        }
    }

    @ObfuscatedName("gx.aa(II)V")
    public void method3427(int arg0) {
        if ((this.field2524[arg0] & 0x4) == 0) {
            return;
        }
        for (class207 var2 = (class207) this.field2538.field2592.method3326(); var2 != null; var2 = (class207) this.field2538.field2592.method3323()) {
            if (var2.field2545 == arg0) {
                var2.field2561 = 0;
            }
        }
    }

    @ObfuscatedName("gx.ai(II)V")
    public void method3428(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3418(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3465(var6, var7, var8);
            } else {
                this.method3418(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3419(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2519[var12] = (var14 << 14) + (this.field2519[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2519[var12] = (var14 << 7) + (this.field2519[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2521[var12] = (var14 << 7) + (this.field2521[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2521[var12] = (this.field2521[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2522[var12] = (var14 << 7) + (this.field2522[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2522[var12] = (this.field2522[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2514[var12] = (var14 << 7) + (this.field2514[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2514[var12] = (this.field2514[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2534[var12] = (var14 << 7) + (this.field2534[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2534[var12] = (this.field2534[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2511[var12] = (var14 << 7) + (this.field2511[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2511[var12] = (this.field2511[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2524[var12] |= 0x1;
                } else {
                    this.field2524[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2524[var12] |= 0x2;
                } else {
                    this.method3485(var12);
                    this.field2524[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2525[var12] = (var14 << 7) + (this.field2525[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2525[var12] = (this.field2525[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2525[var12] = (var14 << 7) + (this.field2525[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2525[var12] = (this.field2525[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3446(var12);
            }
            if (var13 == 121) {
                this.method3434(var12);
            }
            if (var13 == 123) {
                this.method3424(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2525[var12];
                if (var15 == 16384) {
                    this.field2526[var12] = (var14 << 7) + (this.field2526[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2525[var12];
                if (var16 == 16384) {
                    this.field2526[var12] = (this.field2526[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2527[var12] = (var14 << 7) + (this.field2527[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2527[var12] = (this.field2527[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2524[var12] |= 0x4;
                } else {
                    this.method3427(var12);
                    this.field2524[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3429(var12, (var14 << 7) + (this.field2528[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3429(var12, (this.field2528[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3505(var17, this.field2519[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3472(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3421(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3425();
            }
        }
    }

    @ObfuscatedName("gx.ak(III)V")
    public void method3429(int arg0, int arg1) {
        this.field2528[arg0] = arg1;
        this.field2517[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gx.ac(Lgm;I)I")
    public int method3430(class207 arg0) {
        int var2 = (arg0.field2550 * arg0.field2549 >> 12) + arg0.field2548;
        int var3 = ((this.field2515[arg0.field2545] - 8192) * this.field2526[arg0.field2545] >> 12) + var2;
        class204 var4 = arg0.field2542;
        if (var4.field2496 > 0 && (var4.field2489 > 0 || this.field2521[arg0.field2545] > 0)) {
            int var5 = var4.field2489 << 2;
            int var6 = var4.field2497 << 1;
            if (arg0.field2557 < var6) {
                var5 = arg0.field2557 * var5 / var6;
            }
            int var7 = (this.field2521[arg0.field2545] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2555 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2543.field1616 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1652 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gx.bk(Lgm;I)I")
    public int method3431(class207 arg0) {
        class204 var2 = arg0.field2542;
        int var3 = this.field2514[arg0.field2545] * this.field2511[arg0.field2545] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2546 * var4 + 16384 >> 15;
        int var6 = this.field2512 * var5 + 128 >> 8;
        if (var2.field2495 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2551 * 1.953125E-5D * (double) var2.field2495) + 0.5D);
        }
        if (var2.field2491 != null) {
            int var7 = arg0.field2540;
            int var8 = var2.field2491[arg0.field2553 + 1];
            if (arg0.field2553 < var2.field2491.length - 2) {
                int var9 = (var2.field2491[arg0.field2553] & 0xFF) << 8;
                int var10 = (var2.field2491[arg0.field2553 + 2] & 0xFF) << 8;
                var8 += (var2.field2491[arg0.field2553 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2554 > 0 && var2.field2490 != null) {
            int var11 = arg0.field2554;
            int var12 = var2.field2490[arg0.field2556 + 1];
            if (arg0.field2556 < var2.field2490.length - 2) {
                int var13 = (var2.field2490[arg0.field2556] & 0xFF) << 8;
                int var14 = (var2.field2490[arg0.field2556 + 2] & 0xFF) << 8;
                var12 += (var2.field2490[arg0.field2556 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gx.bi(Lgm;I)I")
    public int method3432(class207 arg0) {
        int var2 = this.field2534[arg0.field2545];
        return var2 < 8192 ? arg0.field2547 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2547) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gx.g()Lda;")
    public synchronized class121 method1742() {
        return this.field2538;
    }

    @ObfuscatedName("gx.c()Lda;")
    public synchronized class121 method1743() {
        return null;
    }

    @ObfuscatedName("gx.l()I")
    public synchronized int method1744() {
        return 0;
    }

    @ObfuscatedName("gx.w([III)V")
    public synchronized void method1745(int[] arg0, int arg1, int arg2) {
        if (this.field2532.method3553()) {
            int var4 = this.field2513 * this.field2532.field2577 / Statics.field1652;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2536;
                if (this.field2537 - var5 >= 0L) {
                    this.field2536 = var5;
                    break;
                }
                int var7 = (int) ((this.field2537 - this.field2536 + (long) var4 - 1L) / (long) var4);
                this.field2536 += (long) var4 * (long) var7;
                this.field2538.method1745(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3436();
            } while (this.field2532.method3553());
        }
        this.field2538.method1745(arg0, arg1, arg2);
    }

    @ObfuscatedName("gx.o(I)V")
    public synchronized void method1747(int arg0) {
        if (this.field2532.method3553()) {
            int var2 = this.field2513 * this.field2532.field2577 / Statics.field1652;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2536;
                if (this.field2537 - var3 >= 0L) {
                    this.field2536 = var3;
                    break;
                }
                int var5 = (int) ((this.field2537 - this.field2536 + (long) var2 - 1L) / (long) var2);
                this.field2536 += (long) var2 * (long) var5;
                this.field2538.method1747(var5);
                arg0 -= var5;
                this.method3436();
            } while (this.field2532.method3553());
        }
        this.field2538.method1747(arg0);
    }

    @ObfuscatedName("gx.ba(I)V")
    public void method3436() {
        int var1 = this.field2533;
        int var2 = this.field2535;
        long var3 = this.field2537;
        while (this.field2535 == var2) {
            while (this.field2532.field2573[var1] == var2) {
                this.field2532.method3523(var1);
                int var5 = this.field2532.method3568(var1);
                if (var5 == 1) {
                    this.field2532.method3546();
                    this.field2532.method3524(var1);
                    if (this.field2532.method3540()) {
                        if (!this.field2520 || var2 == 0) {
                            this.method3425();
                            this.field2532.method3525();
                            return;
                        }
                        this.field2532.method3532(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3428(var5);
                }
                this.field2532.method3521(var1);
                this.field2532.method3524(var1);
            }
            var1 = this.field2532.method3530();
            var2 = this.field2532.field2573[var1];
            var3 = this.field2532.method3529(var2);
        }
        this.field2533 = var1;
        this.field2535 = var2;
        this.field2537 = var3;
    }

    @ObfuscatedName("gx.bn(Lgm;I)Z")
    public boolean method3411(class207 arg0) {
        if (arg0.field2558 != null) {
            return false;
        }
        if (arg0.field2554 >= 0) {
            arg0.method3314();
            if (arg0.field2544 > 0 && this.field2531[arg0.field2545][arg0.field2544] == arg0) {
                this.field2531[arg0.field2545][arg0.field2544] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gx.by(Lgm;[IIIB)Z")
    public boolean method3506(class207 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2559 = Statics.field1652 / 100;
        if (arg0.field2554 >= 0 && arg0.field2558 == null || arg0.field2558.method1978()) {
            arg0.method3516();
            arg0.method3314();
            if (arg0.field2544 > 0 && this.field2531[arg0.field2545][arg0.field2544] == arg0) {
                this.field2531[arg0.field2545][arg0.field2544] = null;
            }
            return true;
        }
        int var5 = arg0.field2550;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2522[arg0.field2545] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2550 = var6;
        }
        arg0.field2558.method1976(this.method3430(arg0));
        class204 var7 = arg0.field2542;
        boolean var8 = false;
        arg0.field2557++;
        arg0.field2555 += var7.field2496;
        double var9 = (double) ((arg0.field2560 - 60 << 8) + (arg0.field2550 * arg0.field2549 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2495 > 0) {
            if (var7.field2494 > 0) {
                arg0.field2551 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2494 * var9) + 0.5D);
            } else {
                arg0.field2551 += 128;
            }
        }
        if (var7.field2491 != null) {
            if (var7.field2492 > 0) {
                arg0.field2540 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2492 * var9) + 0.5D);
            } else {
                arg0.field2540 += 128;
            }
            while (arg0.field2553 < var7.field2491.length - 2 && arg0.field2540 > (var7.field2491[arg0.field2553 + 2] & 0xFF) << 8) {
                arg0.field2553 += 2;
            }
            if (arg0.field2553 == var7.field2491.length - 2 && var7.field2491[arg0.field2553 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2554 >= 0 && var7.field2490 != null && (this.field2524[arg0.field2545] & 0x1) == 0 && (arg0.field2544 < 0 || this.field2531[arg0.field2545][arg0.field2544] != arg0)) {
            if (var7.field2493 > 0) {
                arg0.field2554 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2493 * var9) + 0.5D);
            } else {
                arg0.field2554 += 128;
            }
            while (arg0.field2556 < var7.field2490.length - 2 && arg0.field2554 > (var7.field2490[arg0.field2556 + 2] & 0xFF) << 8) {
                arg0.field2556 += 2;
            }
            if (arg0.field2556 == var7.field2490.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2558.method1974(arg0.field2559, this.method3431(arg0), this.method3432(arg0));
            return false;
        }
        arg0.field2558.method2003(arg0.field2559);
        if (arg1 == null) {
            arg0.field2558.method1747(arg3);
        } else {
            arg0.field2558.method1745(arg1, arg2, arg3);
        }
        if (arg0.field2558.method2007()) {
            this.field2538.field2590.method1737(arg0.field2558);
        }
        arg0.method3516();
        if (arg0.field2554 >= 0) {
            arg0.method3314();
            if (arg0.field2544 > 0 && this.field2531[arg0.field2545][arg0.field2544] == arg0) {
                this.field2531[arg0.field2545][arg0.field2544] = null;
            }
        }
        return true;
    }
}
