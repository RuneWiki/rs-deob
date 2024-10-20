package deob;

@ObfuscatedName("hm")
public class class216 extends class114 {

    @ObfuscatedName("hm.m")
    public class319 field2514 = new class319(128);

    @ObfuscatedName("hm.f")
    public int field2512 = 256;

    @ObfuscatedName("hm.q")
    public int field2513 = 1000000;

    @ObfuscatedName("hm.o")
    public int[] field2530 = new int[16];

    @ObfuscatedName("hm.u")
    public int[] field2515 = new int[16];

    @ObfuscatedName("hm.g")
    public int[] field2522 = new int[16];

    @ObfuscatedName("hm.l")
    public int[] field2517 = new int[16];

    @ObfuscatedName("hm.e")
    public int[] field2518 = new int[16];

    @ObfuscatedName("hm.x")
    public int[] field2519 = new int[16];

    @ObfuscatedName("hm.d")
    public int[] field2520 = new int[16];

    @ObfuscatedName("hm.k")
    public int[] field2521 = new int[16];

    @ObfuscatedName("hm.n")
    public int[] field2539 = new int[16];

    @ObfuscatedName("hm.y")
    public int[] field2523 = new int[16];

    @ObfuscatedName("hm.h")
    public int[] field2538 = new int[16];

    @ObfuscatedName("hm.b")
    public int[] field2525 = new int[16];

    @ObfuscatedName("hm.c")
    public int[] field2526 = new int[16];

    @ObfuscatedName("hm.r")
    public int[] field2527 = new int[16];

    @ObfuscatedName("hm.p")
    public int[] field2528 = new int[16];

    @ObfuscatedName("hm.v")
    public class217[][] field2529 = new class217[16][128];

    @ObfuscatedName("hm.ag")
    public class217[][] field2532 = new class217[16][128];

    @ObfuscatedName("hm.aq")
    public class218 field2531 = new class218();

    @ObfuscatedName("hm.aj")
    public boolean field2516;

    @ObfuscatedName("hm.av")
    public int field2533;

    @ObfuscatedName("hm.ar")
    public int field2534;

    @ObfuscatedName("hm.ac")
    public long field2535;

    @ObfuscatedName("hm.ay")
    public long field2524;

    @ObfuscatedName("hm.ah")
    public class220 field2537 = new class220(this);

    public class216() {
        this.method3842();
    }

    @ObfuscatedName("hm.m(IB)V")
    public synchronized void method3801(int arg0) {
        this.field2512 = arg0;
    }

    @ObfuscatedName("hm.f(I)I")
    public int method3838() {
        return this.field2512;
    }

    @ObfuscatedName("hm.q(Lhe;Lir;Ldt;II)Z")
    public synchronized boolean method3881(class221 arg0, class245 arg1, class107 arg2, int arg3) {
        arg0.method3985();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class183 var7 = (class183) arg0.field2591.method5411(); var7 != null; var7 = (class183) arg0.field2591.method5415()) {
            int var8 = (int) var7.field2139;
            class219 var9 = (class219) this.field2514.method5416((long) var8);
            if (var9 == null) {
                var9 = class219.method1867(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2514.method5412(var9, (long) var8);
            }
            if (!var9.method3967(arg2, var7.field2135, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3993();
        }
        return var5;
    }

    @ObfuscatedName("hm.w(B)V")
    public synchronized void method3803() {
        for (class219 var1 = (class219) this.field2514.method5411(); var1 != null; var1 = (class219) this.field2514.method5415()) {
            var1.method3968();
        }
    }

    @ObfuscatedName("hm.o(B)V")
    public synchronized void method3804() {
        for (class219 var1 = (class219) this.field2514.method5411(); var1 != null; var1 = (class219) this.field2514.method5415()) {
            var1.method3306();
        }
    }

    @ObfuscatedName("hm.x(Lhe;ZI)V")
    public synchronized void method3805(class221 arg0, boolean arg1) {
        this.method3806();
        this.field2531.method3904(arg0.field2592);
        this.field2516 = arg1;
        this.field2535 = 0L;
        int var3 = this.field2531.method3930();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2531.method3908(var4);
            this.field2531.method3911(var4);
            this.field2531.method3909(var4);
        }
        this.field2533 = this.field2531.method3916();
        this.field2534 = this.field2531.field2576[this.field2533];
        this.field2524 = this.field2531.method3915(this.field2534);
    }

    @ObfuscatedName("hm.a(I)V")
    public synchronized void method3806() {
        this.field2531.method3965();
        this.method3842();
    }

    @ObfuscatedName("hm.z(I)Z")
    public synchronized boolean method3807() {
        return this.field2531.method3906();
    }

    @ObfuscatedName("hm.j(III)V")
    public synchronized void method3808(int arg0, int arg1) {
        this.method3809(arg0, arg1);
    }

    @ObfuscatedName("hm.s(III)V")
    public void method3809(int arg0, int arg1) {
        this.field2517[arg0] = arg1;
        this.field2519[arg0] = arg1 & 0xFFFFFF80;
        this.method3810(arg0, arg1);
    }

    @ObfuscatedName("hm.t(III)V")
    public void method3810(int arg0, int arg1) {
        if (this.field2518[arg0] != arg1) {
            this.field2518[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2532[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("hm.y(IIIB)V")
    public void method3811(int arg0, int arg1, int arg2) {
        this.method3830(arg0, arg1, 64);
        if ((this.field2523[arg0] & 0x2) != 0) {
            for (class217 var4 = (class217) this.field2537.field2586.method4857(); var4 != null; var4 = (class217) this.field2537.field2586.method4859()) {
                if (var4.field2545 == arg0 && var4.field2554 < 0) {
                    this.field2529[arg0][var4.field2559] = null;
                    this.field2529[arg0][arg1] = var4;
                    int var5 = (var4.field2550 * var4.field2549 >> 12) + var4.field2555;
                    var4.field2555 += arg1 - var4.field2559 << 8;
                    var4.field2549 = var5 - var4.field2555;
                    var4.field2550 = 4096;
                    var4.field2559 = arg1;
                    return;
                }
            }
        }
        class219 var6 = (class219) this.field2514.method5416((long) this.field2518[arg0]);
        if (var6 == null) {
            return;
        }
        class102 var7 = var6.field2582[arg1];
        if (var7 == null) {
            return;
        }
        class217 var8 = new class217();
        var8.field2545 = arg0;
        var8.field2541 = var6;
        var8.field2542 = var7;
        var8.field2543 = var6.field2578[arg1];
        var8.field2544 = var6.field2583[arg1];
        var8.field2559 = arg1;
        var8.field2546 = var6.field2579 * arg2 * arg2 * var6.field2580[arg1] + 1024 >> 11;
        var8.field2547 = var6.field2577[arg1] & 0xFF;
        var8.field2555 = (arg1 << 8) - (var6.field2581[arg1] & 0x7FFF);
        var8.field2561 = 0;
        var8.field2548 = 0;
        var8.field2553 = 0;
        var8.field2554 = -1;
        var8.field2560 = 0;
        if (this.field2526[arg0] == 0) {
            var8.field2558 = class112.method2305(var7, this.method3824(var8), this.method3825(var8), this.method3826(var8));
        } else {
            var8.field2558 = class112.method2305(var7, this.method3824(var8), 0, this.method3826(var8));
            this.method3812(var8, var6.field2581[arg1] < 0);
        }
        if (var6.field2581[arg1] < 0) {
            var8.field2558.method2308(-1);
        }
        if (var8.field2544 >= 0) {
            class217 var9 = this.field2532[arg0][var8.field2544];
            if (var9 != null && var9.field2554 < 0) {
                this.field2529[arg0][var9.field2559] = null;
                var9.field2554 = 0;
            }
            this.field2532[arg0][var8.field2544] = var8;
        }
        this.field2537.field2586.method4851(var8);
        this.field2529[arg0][arg1] = var8;
    }

    @ObfuscatedName("hm.h(Lha;ZI)V")
    public void method3812(class217 arg0, boolean arg1) {
        int var3 = arg0.field2542.field1348.length;
        int var5;
        if (arg1 && arg0.field2542.field1351) {
            int var4 = var3 + var3 - arg0.field2542.field1349;
            var5 = (int) ((long) this.field2526[arg0.field2545] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2558.method2292(true);
            }
        } else {
            var5 = (int) ((long) this.field2526[arg0.field2545] * (long) var3 >> 6);
        }
        arg0.field2558.method2316(var5);
    }

    @ObfuscatedName("hm.b(IIII)V")
    public void method3830(int arg0, int arg1, int arg2) {
        class217 var4 = this.field2529[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2529[arg0][arg1] = null;
        if ((this.field2523[arg0] & 0x2) == 0) {
            var4.field2554 = 0;
            return;
        }
        for (class217 var5 = (class217) this.field2537.field2586.method4856(); var5 != null; var5 = (class217) this.field2537.field2586.method4858()) {
            if (var4.field2545 == var5.field2545 && var5.field2554 < 0 && var4 != var5) {
                var4.field2554 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("hm.c(IIII)V")
    public void method3839(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("hm.p(IIB)V")
    public void method3814(int arg0, int arg1) {
    }

    @ObfuscatedName("hm.v(IIB)V")
    public void method3815(int arg0, int arg1) {
        this.field2520[arg0] = arg1;
    }

    @ObfuscatedName("hm.ah(II)V")
    public void method3816(int arg0) {
        for (class217 var2 = (class217) this.field2537.field2586.method4856(); var2 != null; var2 = (class217) this.field2537.field2586.method4858()) {
            if (arg0 < 0 || var2.field2545 == arg0) {
                if (var2.field2558 != null) {
                    var2.field2558.method2296(Statics.field3803 / 100);
                    if (var2.field2558.method2300()) {
                        this.field2537.field2585.method2095(var2.field2558);
                    }
                    var2.method3900();
                }
                if (var2.field2554 < 0) {
                    this.field2529[var2.field2545][var2.field2559] = null;
                }
                var2.method3306();
            }
        }
    }

    @ObfuscatedName("hm.ab(II)V")
    public void method3817(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3817(var2);
            }
            return;
        }
        this.field2530[arg0] = 12800;
        this.field2515[arg0] = 8192;
        this.field2522[arg0] = 16383;
        this.field2520[arg0] = 8192;
        this.field2521[arg0] = 0;
        this.field2539[arg0] = 8192;
        this.method3820(arg0);
        this.method3821(arg0);
        this.field2523[arg0] = 0;
        this.field2538[arg0] = 32767;
        this.field2525[arg0] = 256;
        this.field2526[arg0] = 0;
        this.method3823(arg0, 8192);
    }

    @ObfuscatedName("hm.ae(II)V")
    public void method3818(int arg0) {
        for (class217 var2 = (class217) this.field2537.field2586.method4856(); var2 != null; var2 = (class217) this.field2537.field2586.method4858()) {
            if ((arg0 < 0 || var2.field2545 == arg0) && var2.field2554 < 0) {
                this.field2529[var2.field2545][var2.field2559] = null;
                var2.field2554 = 0;
            }
        }
    }

    @ObfuscatedName("hm.at(I)V")
    public void method3842() {
        this.method3816(-1);
        this.method3817(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2518[var1] = this.field2517[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2519[var2] = this.field2517[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("hm.ad(II)V")
    public void method3820(int arg0) {
        if ((this.field2523[arg0] & 0x2) == 0) {
            return;
        }
        for (class217 var2 = (class217) this.field2537.field2586.method4856(); var2 != null; var2 = (class217) this.field2537.field2586.method4858()) {
            if (var2.field2545 == arg0 && this.field2529[arg0][var2.field2559] == null && var2.field2554 < 0) {
                var2.field2554 = 0;
            }
        }
    }

    @ObfuscatedName("hm.ap(II)V")
    public void method3821(int arg0) {
        if ((this.field2523[arg0] & 0x4) == 0) {
            return;
        }
        for (class217 var2 = (class217) this.field2537.field2586.method4856(); var2 != null; var2 = (class217) this.field2537.field2586.method4858()) {
            if (var2.field2545 == arg0) {
                var2.field2540 = 0;
            }
        }
    }

    @ObfuscatedName("hm.au(II)V")
    public void method3847(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3830(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3811(var6, var7, var8);
            } else {
                this.method3830(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3839(var9, var10, var11);
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
                this.field2539[var12] = (var14 << 7) + (this.field2539[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2539[var12] = (this.field2539[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2530[var12] = (var14 << 7) + (this.field2530[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2530[var12] = (this.field2530[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2515[var12] = (var14 << 7) + (this.field2515[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2515[var12] = (this.field2515[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2522[var12] = (var14 << 7) + (this.field2522[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2522[var12] = (this.field2522[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2523[var12] |= 0x1;
                } else {
                    this.field2523[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2523[var12] |= 0x2;
                } else {
                    this.method3820(var12);
                    this.field2523[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2538[var12] = (var14 << 7) + (this.field2538[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2538[var12] = (this.field2538[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2538[var12] = (var14 << 7) + (this.field2538[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2538[var12] = (this.field2538[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3816(var12);
            }
            if (var13 == 121) {
                this.method3817(var12);
            }
            if (var13 == 123) {
                this.method3818(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2538[var12];
                if (var15 == 16384) {
                    this.field2525[var12] = (var14 << 7) + (this.field2525[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2538[var12];
                if (var16 == 16384) {
                    this.field2525[var12] = (this.field2525[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2526[var12] = (var14 << 7) + (this.field2526[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2526[var12] = (this.field2526[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2523[var12] |= 0x4;
                } else {
                    this.method3821(var12);
                    this.field2523[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3823(var12, (var14 << 7) + (this.field2527[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3823(var12, (this.field2527[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3810(var17, this.field2519[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3814(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3815(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3842();
            }
        }
    }

    @ObfuscatedName("hm.ao(III)V")
    public void method3823(int arg0, int arg1) {
        this.field2527[arg0] = arg1;
        this.field2528[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("hm.aa(Lha;I)I")
    public int method3824(class217 arg0) {
        int var2 = (arg0.field2550 * arg0.field2549 >> 12) + arg0.field2555;
        int var3 = ((this.field2520[arg0.field2545] - 8192) * this.field2525[arg0.field2545] >> 12) + var2;
        class214 var4 = arg0.field2543;
        if (var4.field2500 > 0 && (var4.field2498 > 0 || this.field2521[arg0.field2545] > 0)) {
            int var5 = var4.field2498 << 2;
            int var6 = var4.field2499 << 1;
            if (arg0.field2552 < var6) {
                var5 = arg0.field2552 * var5 / var6;
            }
            int var7 = (this.field2521[arg0.field2545] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2557 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2542.field1350 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field3803 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("hm.ax(Lha;I)I")
    public int method3825(class217 arg0) {
        class214 var2 = arg0.field2543;
        int var3 = this.field2530[arg0.field2545] * this.field2522[arg0.field2545] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2546 * var4 + 16384 >> 15;
        int var6 = this.field2512 * var5 + 128 >> 8;
        if (var2.field2495 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2561 * 1.953125E-5D * (double) var2.field2495) + 0.5D);
        }
        if (var2.field2501 != null) {
            int var7 = arg0.field2548;
            int var8 = var2.field2501[arg0.field2553 + 1];
            if (arg0.field2553 < var2.field2501.length - 2) {
                int var9 = (var2.field2501[arg0.field2553] & 0xFF) << 8;
                int var10 = (var2.field2501[arg0.field2553 + 2] & 0xFF) << 8;
                var8 += (var2.field2501[arg0.field2553 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2554 > 0 && var2.field2494 != null) {
            int var11 = arg0.field2554;
            int var12 = var2.field2494[arg0.field2560 + 1];
            if (arg0.field2560 < var2.field2494.length - 2) {
                int var13 = (var2.field2494[arg0.field2560] & 0xFF) << 8;
                int var14 = (var2.field2494[arg0.field2560 + 2] & 0xFF) << 8;
                var12 += (var2.field2494[arg0.field2560 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("hm.af(Lha;I)I")
    public int method3826(class217 arg0) {
        int var2 = this.field2515[arg0.field2545];
        return var2 < 8192 ? arg0.field2547 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2547) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("hm.u()Ldc;")
    public synchronized class114 method2078() {
        return this.field2537;
    }

    @ObfuscatedName("hm.g()Ldc;")
    public synchronized class114 method2104() {
        return null;
    }

    @ObfuscatedName("hm.l()I")
    public synchronized int method2080() {
        return 0;
    }

    @ObfuscatedName("hm.e([III)V")
    public synchronized void method2081(int[] arg0, int arg1, int arg2) {
        if (this.field2531.method3906()) {
            int var4 = this.field2513 * this.field2531.field2564 / Statics.field3803;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2535;
                if (this.field2524 - var5 >= 0L) {
                    this.field2535 = var5;
                    break;
                }
                int var7 = (int) ((this.field2524 - this.field2535 + (long) var4 - 1L) / (long) var4);
                this.field2535 += (long) var4 * (long) var7;
                this.field2537.method2081(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3886();
            } while (this.field2531.method3906());
        }
        this.field2537.method2081(arg0, arg1, arg2);
    }

    @ObfuscatedName("hm.d(I)V")
    public synchronized void method2083(int arg0) {
        if (this.field2531.method3906()) {
            int var2 = this.field2513 * this.field2531.field2564 / Statics.field3803;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2535;
                if (this.field2524 - var3 >= 0L) {
                    this.field2535 = var3;
                    break;
                }
                int var5 = (int) ((this.field2524 - this.field2535 + (long) var2 - 1L) / (long) var2);
                this.field2535 += (long) var2 * (long) var5;
                this.field2537.method2083(var5);
                arg0 -= var5;
                this.method3886();
            } while (this.field2531.method3906());
        }
        this.field2537.method2083(arg0);
    }

    @ObfuscatedName("hm.ai(B)V")
    public void method3886() {
        int var1 = this.field2533;
        int var2 = this.field2534;
        long var3 = this.field2524;
        while (this.field2534 == var2) {
            while (this.field2531.field2576[var1] == var2) {
                this.field2531.method3908(var1);
                int var5 = this.field2531.method3912(var1);
                if (var5 == 1) {
                    this.field2531.method3910();
                    this.field2531.method3909(var1);
                    if (this.field2531.method3935()) {
                        if (!this.field2516 || var2 == 0) {
                            this.method3842();
                            this.field2531.method3965();
                            return;
                        }
                        this.field2531.method3918(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3847(var5);
                }
                this.field2531.method3911(var1);
                this.field2531.method3909(var1);
            }
            var1 = this.field2531.method3916();
            var2 = this.field2531.field2576[var1];
            var3 = this.field2531.method3915(var2);
        }
        this.field2533 = var1;
        this.field2534 = var2;
        this.field2524 = var3;
    }

    @ObfuscatedName("hm.ba(Lha;I)Z")
    public boolean method3819(class217 arg0) {
        if (arg0.field2558 != null) {
            return false;
        }
        if (arg0.field2554 >= 0) {
            arg0.method3306();
            if (arg0.field2544 > 0 && this.field2532[arg0.field2545][arg0.field2544] == arg0) {
                this.field2532[arg0.field2545][arg0.field2544] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("hm.bb(Lha;[IIII)Z")
    public boolean method3852(class217 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2556 = Statics.field3803 / 100;
        if (arg0.field2554 >= 0 && arg0.field2558 == null || arg0.field2558.method2299()) {
            arg0.method3900();
            arg0.method3306();
            if (arg0.field2544 > 0 && this.field2532[arg0.field2545][arg0.field2544] == arg0) {
                this.field2532[arg0.field2545][arg0.field2544] = null;
            }
            return true;
        }
        int var5 = arg0.field2550;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2539[arg0.field2545] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2550 = var6;
        }
        arg0.field2558.method2320(this.method3824(arg0));
        class214 var7 = arg0.field2543;
        boolean var8 = false;
        arg0.field2552++;
        arg0.field2557 += var7.field2500;
        double var9 = (double) ((arg0.field2559 - 60 << 8) + (arg0.field2550 * arg0.field2549 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2495 > 0) {
            if (var7.field2493 > 0) {
                arg0.field2561 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2493 * var9) + 0.5D);
            } else {
                arg0.field2561 += 128;
            }
        }
        if (var7.field2501 != null) {
            if (var7.field2496 > 0) {
                arg0.field2548 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2496 * var9) + 0.5D);
            } else {
                arg0.field2548 += 128;
            }
            while (arg0.field2553 < var7.field2501.length - 2 && arg0.field2548 > (var7.field2501[arg0.field2553 + 2] & 0xFF) << 8) {
                arg0.field2553 += 2;
            }
            if (arg0.field2553 == var7.field2501.length - 2 && var7.field2501[arg0.field2553 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2554 >= 0 && var7.field2494 != null && (this.field2523[arg0.field2545] & 0x1) == 0 && (arg0.field2544 < 0 || this.field2532[arg0.field2545][arg0.field2544] != arg0)) {
            if (var7.field2497 > 0) {
                arg0.field2554 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2497 * var9) + 0.5D);
            } else {
                arg0.field2554 += 128;
            }
            while (arg0.field2560 < var7.field2494.length - 2 && arg0.field2554 > (var7.field2494[arg0.field2560 + 2] & 0xFF) << 8) {
                arg0.field2560 += 2;
            }
            if (arg0.field2560 == var7.field2494.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2558.method2362(arg0.field2556, this.method3825(arg0), this.method3826(arg0));
            return false;
        }
        arg0.field2558.method2296(arg0.field2556);
        if (arg1 == null) {
            arg0.field2558.method2083(arg3);
        } else {
            arg0.field2558.method2081(arg1, arg2, arg3);
        }
        if (arg0.field2558.method2300()) {
            this.field2537.field2585.method2095(arg0.field2558);
        }
        arg0.method3900();
        if (arg0.field2554 >= 0) {
            arg0.method3306();
            if (arg0.field2544 > 0 && this.field2532[arg0.field2545][arg0.field2544] == arg0) {
                this.field2532[arg0.field2545][arg0.field2544] = null;
            }
        }
        return true;
    }
}
