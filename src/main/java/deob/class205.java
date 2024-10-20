package deob;

@ObfuscatedName("gv")
public class class205 extends class120 {

    @ObfuscatedName("gv.i")
    public class191 field2531 = new class191(128);

    @ObfuscatedName("gv.a")
    public int field2519 = 256;

    @ObfuscatedName("gv.t")
    public int field2521 = 1000000;

    @ObfuscatedName("gv.s")
    public int[] field2522 = new int[16];

    @ObfuscatedName("gv.r")
    public int[] field2523 = new int[16];

    @ObfuscatedName("gv.v")
    public int[] field2543 = new int[16];

    @ObfuscatedName("gv.y")
    public int[] field2520 = new int[16];

    @ObfuscatedName("gv.j")
    public int[] field2529 = new int[16];

    @ObfuscatedName("gv.k")
    public int[] field2527 = new int[16];

    @ObfuscatedName("gv.e")
    public int[] field2528 = new int[16];

    @ObfuscatedName("gv.o")
    public int[] field2535 = new int[16];

    @ObfuscatedName("gv.z")
    public int[] field2538 = new int[16];

    @ObfuscatedName("gv.u")
    public int[] field2532 = new int[16];

    @ObfuscatedName("gv.p")
    public int[] field2526 = new int[16];

    @ObfuscatedName("gv.q")
    public int[] field2533 = new int[16];

    @ObfuscatedName("gv.d")
    public int[] field2534 = new int[16];

    @ObfuscatedName("gv.h")
    public int[] field2530 = new int[16];

    @ObfuscatedName("gv.g")
    public int[] field2536 = new int[16];

    @ObfuscatedName("gv.x")
    public class206[][] field2537 = new class206[16][128];

    @ObfuscatedName("gv.ah")
    public class206[][] field2540 = new class206[16][128];

    @ObfuscatedName("gv.ab")
    public class207 field2539 = new class207();

    @ObfuscatedName("gv.aw")
    public boolean field2544;

    @ObfuscatedName("gv.ai")
    public int field2541;

    @ObfuscatedName("gv.an")
    public int field2542;

    @ObfuscatedName("gv.au")
    public long field2525;

    @ObfuscatedName("gv.ar")
    public long field2524;

    @ObfuscatedName("gv.ay")
    public class209 field2545 = new class209(this);

    public class205() {
        this.method3405();
    }

    @ObfuscatedName("gv.i(II)V")
    public synchronized void method3411(int arg0) {
        this.field2519 = arg0;
    }

    @ObfuscatedName("gv.w(I)I")
    public int method3387() {
        return this.field2519;
    }

    @ObfuscatedName("gv.a(Lhk;Liq;Ldt;IB)Z")
    public synchronized boolean method3388(class210 arg0, class236 arg1, class113 arg2, int arg3) {
        arg0.method3571();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class200 var7 = (class200) arg0.field2601.method3252(); var7 != null; var7 = (class200) arg0.field2601.method3257()) {
            int var8 = (int) var7.field2473;
            class208 var9 = (class208) this.field2531.method3249((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3774(var8);
                class208 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class208(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2531.method3248(var11, (long) var8);
            }
            if (!var9.method3558(arg2, var7.field2489, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3570();
        }
        return var5;
    }

    @ObfuscatedName("gv.t(I)V")
    public synchronized void method3385() {
        for (class208 var1 = (class208) this.field2531.method3252(); var1 != null; var1 = (class208) this.field2531.method3257()) {
            var1.method3557();
        }
    }

    @ObfuscatedName("gv.s(B)V")
    public synchronized void method3390() {
        for (class208 var1 = (class208) this.field2531.method3252(); var1 != null; var1 = (class208) this.field2531.method3257()) {
            var1.method3290();
        }
    }

    @ObfuscatedName("gv.k(Lhk;ZI)V")
    public synchronized void method3391(class210 arg0, boolean arg1) {
        this.method3443();
        this.field2539.method3554(arg0.field2600);
        this.field2544 = arg1;
        this.field2525 = 0L;
        int var3 = this.field2539.method3509();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2539.method3510(var4);
            this.field2539.method3513(var4);
            this.field2539.method3511(var4);
        }
        this.field2541 = this.field2539.method3550();
        this.field2542 = this.field2539.field2572[this.field2541];
        this.field2524 = this.field2539.method3526(this.field2542);
    }

    @ObfuscatedName("gv.o(I)V")
    public synchronized void method3443() {
        this.field2539.method3514();
        this.method3405();
    }

    @ObfuscatedName("gv.z(I)Z")
    public synchronized boolean method3393() {
        return this.field2539.method3508();
    }

    @ObfuscatedName("gv.l(III)V")
    public synchronized void method3394(int arg0, int arg1) {
        this.method3412(arg0, arg1);
    }

    @ObfuscatedName("gv.c(III)V")
    public void method3412(int arg0, int arg1) {
        this.field2520[arg0] = arg1;
        this.field2527[arg0] = arg1 & 0xFFFFFF80;
        this.method3396(arg0, arg1);
    }

    @ObfuscatedName("gv.b(III)V")
    public void method3396(int arg0, int arg1) {
        if (this.field2529[arg0] != arg1) {
            this.field2529[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2540[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gv.f(IIIB)V")
    public void method3435(int arg0, int arg1, int arg2) {
        this.method3398(arg0, arg1, 64);
        if ((this.field2532[arg0] & 0x2) != 0) {
            for (class206 var4 = (class206) this.field2545.field2595.method3304(); var4 != null; var4 = (class206) this.field2545.field2595.method3310()) {
                if (var4.field2560 == arg0 && var4.field2561 < 0) {
                    this.field2537[arg0][var4.field2552] = null;
                    this.field2537[arg0][arg1] = var4;
                    int var5 = (var4.field2566 * var4.field2550 >> 12) + var4.field2555;
                    var4.field2555 += arg1 - var4.field2552 << 8;
                    var4.field2566 = var5 - var4.field2555;
                    var4.field2550 = 4096;
                    var4.field2552 = arg1;
                    return;
                }
            }
        }
        class208 var6 = (class208) this.field2531.method3249((long) this.field2529[arg0]);
        if (var6 == null) {
            return;
        }
        class108 var7 = var6.field2587[arg1];
        if (var7 == null) {
            return;
        }
        class206 var8 = new class206();
        var8.field2560 = arg0;
        var8.field2548 = var6;
        var8.field2549 = var7;
        var8.field2567 = var6.field2582[arg1];
        var8.field2551 = var6.field2584[arg1];
        var8.field2552 = arg1;
        var8.field2553 = var6.field2589 * arg2 * arg2 * var6.field2585[arg1] + 1024 >> 11;
        var8.field2554 = var6.field2586[arg1] & 0xFF;
        var8.field2555 = (arg1 << 8) - (var6.field2591[arg1] & 0x7FFF);
        var8.field2558 = 0;
        var8.field2559 = 0;
        var8.field2547 = 0;
        var8.field2561 = -1;
        var8.field2562 = 0;
        if (this.field2534[arg0] == 0) {
            var8.field2565 = class118.method1947(var7, this.method3409(var8), this.method3410(var8), this.method3498(var8));
        } else {
            var8.field2565 = class118.method1947(var7, this.method3409(var8), 0, this.method3498(var8));
            this.method3424(var8, var6.field2591[arg1] < 0);
        }
        if (var6.field2591[arg1] < 0) {
            var8.field2565.method1946(-1);
        }
        if (var8.field2551 >= 0) {
            class206 var9 = this.field2540[arg0][var8.field2551];
            if (var9 != null && var9.field2561 < 0) {
                this.field2537[arg0][var9.field2552] = null;
                var9.field2561 = 0;
            }
            this.field2540[arg0][var8.field2551] = var8;
        }
        this.field2545.field2595.method3322(var8);
        this.field2537[arg0][arg1] = var8;
    }

    @ObfuscatedName("gv.n(Lgl;ZB)V")
    public void method3424(class206 arg0, boolean arg1) {
        int var3 = arg0.field2549.field1631.length;
        int var5;
        if (arg1 && arg0.field2549.field1633) {
            int var4 = var3 + var3 - arg0.field2549.field1630;
            var5 = (int) ((long) this.field2534[arg0.field2560] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2565.method1955(true);
            }
        } else {
            var5 = (int) ((long) this.field2534[arg0.field2560] * (long) var3 >> 6);
        }
        arg0.field2565.method1949(var5);
    }

    @ObfuscatedName("gv.u(IIII)V")
    public void method3398(int arg0, int arg1, int arg2) {
        class206 var4 = this.field2537[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2537[arg0][arg1] = null;
        if ((this.field2532[arg0] & 0x2) == 0) {
            var4.field2561 = 0;
            return;
        }
        for (class206 var5 = (class206) this.field2545.field2595.method3303(); var5 != null; var5 = (class206) this.field2545.field2595.method3297()) {
            if (var4.field2560 == var5.field2560 && var5.field2561 < 0 && var4 != var5) {
                var4.field2561 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gv.p(IIII)V")
    public void method3495(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gv.q(IIB)V")
    public void method3400(int arg0, int arg1) {
    }

    @ObfuscatedName("gv.d(III)V")
    public void method3401(int arg0, int arg1) {
        this.field2528[arg0] = arg1;
    }

    @ObfuscatedName("gv.h(II)V")
    public void method3402(int arg0) {
        for (class206 var2 = (class206) this.field2545.field2595.method3303(); var2 != null; var2 = (class206) this.field2545.field2595.method3297()) {
            if (arg0 < 0 || var2.field2560 == arg0) {
                if (var2.field2565 != null) {
                    var2.field2565.method1959(Statics.field3212 / 100);
                    if (var2.field2565.method2054()) {
                        this.field2545.field2596.method1733(var2.field2565);
                    }
                    var2.method3501();
                }
                if (var2.field2561 < 0) {
                    this.field2537[var2.field2560][var2.field2552] = null;
                }
                var2.method3290();
            }
        }
    }

    @ObfuscatedName("gv.g(II)V")
    public void method3403(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3403(var2);
            }
            return;
        }
        this.field2522[arg0] = 12800;
        this.field2523[arg0] = 8192;
        this.field2543[arg0] = 16383;
        this.field2528[arg0] = 8192;
        this.field2535[arg0] = 0;
        this.field2538[arg0] = 8192;
        this.method3446(arg0);
        this.method3407(arg0);
        this.field2532[arg0] = 0;
        this.field2526[arg0] = 32767;
        this.field2533[arg0] = 256;
        this.field2534[arg0] = 0;
        this.method3408(arg0, 8192);
    }

    @ObfuscatedName("gv.x(IB)V")
    public void method3404(int arg0) {
        for (class206 var2 = (class206) this.field2545.field2595.method3303(); var2 != null; var2 = (class206) this.field2545.field2595.method3297()) {
            if ((arg0 < 0 || var2.field2560 == arg0) && var2.field2561 < 0) {
                this.field2537[var2.field2560][var2.field2552] = null;
                var2.field2561 = 0;
            }
        }
    }

    @ObfuscatedName("gv.av(I)V")
    public void method3405() {
        this.method3402(-1);
        this.method3403(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2529[var1] = this.field2520[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2527[var2] = this.field2520[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gv.ad(IB)V")
    public void method3446(int arg0) {
        if ((this.field2532[arg0] & 0x2) == 0) {
            return;
        }
        for (class206 var2 = (class206) this.field2545.field2595.method3303(); var2 != null; var2 = (class206) this.field2545.field2595.method3297()) {
            if (var2.field2560 == arg0 && this.field2537[arg0][var2.field2552] == null && var2.field2561 < 0) {
                var2.field2561 = 0;
            }
        }
    }

    @ObfuscatedName("gv.ae(II)V")
    public void method3407(int arg0) {
        if ((this.field2532[arg0] & 0x4) == 0) {
            return;
        }
        for (class206 var2 = (class206) this.field2545.field2595.method3303(); var2 != null; var2 = (class206) this.field2545.field2595.method3297()) {
            if (var2.field2560 == arg0) {
                var2.field2557 = 0;
            }
        }
    }

    @ObfuscatedName("gv.ag(II)V")
    public void method3452(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3398(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3435(var6, var7, var8);
            } else {
                this.method3398(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3495(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2527[var12] = (var14 << 14) + (this.field2527[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2527[var12] = (var14 << 7) + (this.field2527[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2535[var12] = (var14 << 7) + (this.field2535[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2535[var12] = (this.field2535[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2538[var12] = (var14 << 7) + (this.field2538[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2538[var12] = (this.field2538[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2522[var12] = (var14 << 7) + (this.field2522[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2522[var12] = (this.field2522[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2523[var12] = (var14 << 7) + (this.field2523[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2523[var12] = (this.field2523[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2543[var12] = (var14 << 7) + (this.field2543[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2543[var12] = (this.field2543[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2532[var12] |= 0x1;
                } else {
                    this.field2532[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2532[var12] |= 0x2;
                } else {
                    this.method3446(var12);
                    this.field2532[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2526[var12] = (var14 << 7) + (this.field2526[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2526[var12] = (this.field2526[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2526[var12] = (var14 << 7) + (this.field2526[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2526[var12] = (this.field2526[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3402(var12);
            }
            if (var13 == 121) {
                this.method3403(var12);
            }
            if (var13 == 123) {
                this.method3404(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2526[var12];
                if (var15 == 16384) {
                    this.field2533[var12] = (var14 << 7) + (this.field2533[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2526[var12];
                if (var16 == 16384) {
                    this.field2533[var12] = (this.field2533[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2534[var12] = (var14 << 7) + (this.field2534[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2534[var12] = (this.field2534[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2532[var12] |= 0x4;
                } else {
                    this.method3407(var12);
                    this.field2532[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3408(var12, (var14 << 7) + (this.field2530[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3408(var12, (this.field2530[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3396(var17, this.field2527[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3400(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3401(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3405();
            }
        }
    }

    @ObfuscatedName("gv.ap(III)V")
    public void method3408(int arg0, int arg1) {
        this.field2530[arg0] = arg1;
        this.field2536[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gv.af(Lgl;I)I")
    public int method3409(class206 arg0) {
        int var2 = (arg0.field2566 * arg0.field2550 >> 12) + arg0.field2555;
        int var3 = ((this.field2528[arg0.field2560] - 8192) * this.field2533[arg0.field2560] >> 12) + var2;
        class203 var4 = arg0.field2567;
        if (var4.field2501 > 0 && (var4.field2505 > 0 || this.field2535[arg0.field2560] > 0)) {
            int var5 = var4.field2505 << 2;
            int var6 = var4.field2502 << 1;
            if (arg0.field2563 < var6) {
                var5 = arg0.field2563 * var5 / var6;
            }
            int var7 = (this.field2535[arg0.field2560] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2556 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2549.field1634 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field3212 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gv.aj(Lgl;B)I")
    public int method3410(class206 arg0) {
        class203 var2 = arg0.field2567;
        int var3 = this.field2522[arg0.field2560] * this.field2543[arg0.field2560] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2553 * var4 + 16384 >> 15;
        int var6 = this.field2519 * var5 + 128 >> 8;
        if (var2.field2496 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2558 * 1.953125E-5D * (double) var2.field2496) + 0.5D);
        }
        if (var2.field2504 != null) {
            int var7 = arg0.field2559;
            int var8 = var2.field2504[arg0.field2547 + 1];
            if (arg0.field2547 < var2.field2504.length - 2) {
                int var9 = (var2.field2504[arg0.field2547] & 0xFF) << 8;
                int var10 = (var2.field2504[arg0.field2547 + 2] & 0xFF) << 8;
                var8 += (var2.field2504[arg0.field2547 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2561 > 0 && var2.field2495 != null) {
            int var11 = arg0.field2561;
            int var12 = var2.field2495[arg0.field2562 + 1];
            if (arg0.field2562 < var2.field2495.length - 2) {
                int var13 = (var2.field2495[arg0.field2562] & 0xFF) << 8;
                int var14 = (var2.field2495[arg0.field2562 + 2] & 0xFF) << 8;
                var12 += (var2.field2495[arg0.field2562 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gv.bb(Lgl;I)I")
    public int method3498(class206 arg0) {
        int var2 = this.field2523[arg0.field2560];
        return var2 < 8192 ? arg0.field2554 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2554) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gv.r()Ldq;")
    public synchronized class120 method1734() {
        return this.field2545;
    }

    @ObfuscatedName("gv.v()Ldq;")
    public synchronized class120 method1742() {
        return null;
    }

    @ObfuscatedName("gv.y()I")
    public synchronized int method1748() {
        return 0;
    }

    @ObfuscatedName("gv.j([III)V")
    public synchronized void method1737(int[] arg0, int arg1, int arg2) {
        if (this.field2539.method3508()) {
            int var4 = this.field2521 * this.field2539.field2569 / Statics.field3212;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2525;
                if (this.field2524 - var5 >= 0L) {
                    this.field2525 = var5;
                    break;
                }
                int var7 = (int) ((this.field2524 - this.field2525 + (long) var4 - 1L) / (long) var4);
                this.field2525 += (long) var4 * (long) var7;
                this.field2545.method1737(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3413();
            } while (this.field2539.method3508());
        }
        this.field2545.method1737(arg0, arg1, arg2);
    }

    @ObfuscatedName("gv.e(I)V")
    public synchronized void method1739(int arg0) {
        if (this.field2539.method3508()) {
            int var2 = this.field2521 * this.field2539.field2569 / Statics.field3212;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2525;
                if (this.field2524 - var3 >= 0L) {
                    this.field2525 = var3;
                    break;
                }
                int var5 = (int) ((this.field2524 - this.field2525 + (long) var2 - 1L) / (long) var2);
                this.field2525 += (long) var2 * (long) var5;
                this.field2545.method1739(var5);
                arg0 -= var5;
                this.method3413();
            } while (this.field2539.method3508());
        }
        this.field2545.method1739(arg0);
    }

    @ObfuscatedName("gv.bc(I)V")
    public void method3413() {
        int var1 = this.field2541;
        int var2 = this.field2542;
        long var3 = this.field2524;
        while (this.field2542 == var2) {
            while (this.field2539.field2572[var1] == var2) {
                this.field2539.method3510(var1);
                int var5 = this.field2539.method3515(var1);
                if (var5 == 1) {
                    this.field2539.method3512();
                    this.field2539.method3511(var1);
                    if (this.field2539.method3521()) {
                        if (!this.field2544 || var2 == 0) {
                            this.method3405();
                            this.field2539.method3514();
                            return;
                        }
                        this.field2539.method3517(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3452(var5);
                }
                this.field2539.method3513(var1);
                this.field2539.method3511(var1);
            }
            var1 = this.field2539.method3550();
            var2 = this.field2539.field2572[var1];
            var3 = this.field2539.method3526(var2);
        }
        this.field2541 = var1;
        this.field2542 = var2;
        this.field2524 = var3;
    }

    @ObfuscatedName("gv.be(Lgl;B)Z")
    public boolean method3414(class206 arg0) {
        if (arg0.field2565 != null) {
            return false;
        }
        if (arg0.field2561 >= 0) {
            arg0.method3290();
            if (arg0.field2551 > 0 && this.field2540[arg0.field2560][arg0.field2551] == arg0) {
                this.field2540[arg0.field2560][arg0.field2551] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gv.bv(Lgl;[IIII)Z")
    public boolean method3415(class206 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2564 = Statics.field3212 / 100;
        if (arg0.field2561 >= 0 && arg0.field2565 == null || arg0.field2565.method1954()) {
            arg0.method3501();
            arg0.method3290();
            if (arg0.field2551 > 0 && this.field2540[arg0.field2560][arg0.field2551] == arg0) {
                this.field2540[arg0.field2560][arg0.field2551] = null;
            }
            return true;
        }
        int var5 = arg0.field2550;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2538[arg0.field2560] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2550 = var6;
        }
        arg0.field2565.method2006(this.method3409(arg0));
        class203 var7 = arg0.field2567;
        boolean var8 = false;
        arg0.field2563++;
        arg0.field2556 += var7.field2501;
        double var9 = (double) ((arg0.field2552 - 60 << 8) + (arg0.field2566 * arg0.field2550 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2496 > 0) {
            if (var7.field2500 > 0) {
                arg0.field2558 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2500 * var9) + 0.5D);
            } else {
                arg0.field2558 += 128;
            }
        }
        if (var7.field2504 != null) {
            if (var7.field2499 > 0) {
                arg0.field2559 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2499 * var9) + 0.5D);
            } else {
                arg0.field2559 += 128;
            }
            while (arg0.field2547 < var7.field2504.length - 2 && arg0.field2559 > (var7.field2504[arg0.field2547 + 2] & 0xFF) << 8) {
                arg0.field2547 += 2;
            }
            if (arg0.field2547 == var7.field2504.length - 2 && var7.field2504[arg0.field2547 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2561 >= 0 && var7.field2495 != null && (this.field2532[arg0.field2560] & 0x1) == 0 && (arg0.field2551 < 0 || this.field2540[arg0.field2560][arg0.field2551] != arg0)) {
            if (var7.field2498 > 0) {
                arg0.field2561 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2498 * var9) + 0.5D);
            } else {
                arg0.field2561 += 128;
            }
            while (arg0.field2562 < var7.field2495.length - 2 && arg0.field2561 > (var7.field2495[arg0.field2562 + 2] & 0xFF) << 8) {
                arg0.field2562 += 2;
            }
            if (arg0.field2562 == var7.field2495.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2565.method1958(arg0.field2564, this.method3410(arg0), this.method3498(arg0));
            return false;
        }
        arg0.field2565.method1959(arg0.field2564);
        if (arg1 == null) {
            arg0.field2565.method1739(arg3);
        } else {
            arg0.field2565.method1737(arg1, arg2, arg3);
        }
        if (arg0.field2565.method2054()) {
            this.field2545.field2596.method1733(arg0.field2565);
        }
        arg0.method3501();
        if (arg0.field2561 >= 0) {
            arg0.method3290();
            if (arg0.field2551 > 0 && this.field2540[arg0.field2560][arg0.field2551] == arg0) {
                this.field2540[arg0.field2560][arg0.field2551] = null;
            }
        }
        return true;
    }
}
