package deob;

@ObfuscatedName("hg")
public class class219 extends class106 {

    @ObfuscatedName("hg.z")
    public class203 field2482 = new class203(128);

    @ObfuscatedName("hg.s")
    public int field2467 = 256;

    @ObfuscatedName("hg.l")
    public int field2475 = 1000000;

    @ObfuscatedName("hg.u")
    public int[] field2469 = new int[16];

    @ObfuscatedName("hg.q")
    public int[] field2470 = new int[16];

    @ObfuscatedName("hg.k")
    public int[] field2474 = new int[16];

    @ObfuscatedName("hg.i")
    public int[] field2485 = new int[16];

    @ObfuscatedName("hg.x")
    public int[] field2473 = new int[16];

    @ObfuscatedName("hg.e")
    public int[] field2468 = new int[16];

    @ObfuscatedName("hg.p")
    public int[] field2466 = new int[16];

    @ObfuscatedName("hg.b")
    public int[] field2476 = new int[16];

    @ObfuscatedName("hg.n")
    public int[] field2477 = new int[16];

    @ObfuscatedName("hg.y")
    public int[] field2479 = new int[16];

    @ObfuscatedName("hg.a")
    public int[] field2480 = new int[16];

    @ObfuscatedName("hg.j")
    public int[] field2481 = new int[16];

    @ObfuscatedName("hg.d")
    public int[] field2472 = new int[16];

    @ObfuscatedName("hg.h")
    public int[] field2483 = new int[16];

    @ObfuscatedName("hg.c")
    public int[] field2484 = new int[16];

    @ObfuscatedName("hg.v")
    public class220[][] field2471 = new class220[16][128];

    @ObfuscatedName("hg.af")
    public class220[][] field2486 = new class220[16][128];

    @ObfuscatedName("hg.ah")
    public class221 field2487 = new class221();

    @ObfuscatedName("hg.ab")
    public boolean field2488;

    @ObfuscatedName("hg.aw")
    public int field2489;

    @ObfuscatedName("hg.ak")
    public int field2490;

    @ObfuscatedName("hg.as")
    public long field2491;

    @ObfuscatedName("hg.an")
    public long field2492;

    @ObfuscatedName("hg.ao")
    public class223 field2493 = new class223(this);

    public class219() {
        this.method3891();
    }

    @ObfuscatedName("hg.z(II)V")
    public synchronized void method3901(int arg0) {
        this.field2467 = arg0;
    }

    @ObfuscatedName("hg.w(I)I")
    public int method3944() {
        return this.field2467;
    }

    @ObfuscatedName("hg.s(Lhq;Lir;Lcn;II)Z")
    public synchronized boolean method3873(class224 arg0, class248 arg1, class99 arg2, int arg3) {
        arg0.method4046();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class214 var7 = (class214) arg0.field2548.method3710(); var7 != null; var7 = (class214) arg0.field2548.method3711()) {
            int var8 = (int) var7.field2422;
            class222 var9 = (class222) this.field2482.method3712((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method4311(var8);
                class222 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class222(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2482.method3708(var11, (long) var8);
            }
            if (!var9.method4027(arg2, var7.field2441, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method4047();
        }
        return var5;
    }

    @ObfuscatedName("hg.l(I)V")
    public synchronized void method3874() {
        for (class222 var1 = (class222) this.field2482.method3710(); var1 != null; var1 = (class222) this.field2482.method3711()) {
            var1.method4028();
        }
    }

    @ObfuscatedName("hg.u(I)V")
    public synchronized void method3875() {
        for (class222 var1 = (class222) this.field2482.method3710(); var1 != null; var1 = (class222) this.field2482.method3711()) {
            var1.method3756();
        }
    }

    @ObfuscatedName("hg.p(Lhq;ZI)V")
    public synchronized void method3924(class224 arg0, boolean arg1) {
        this.method3877();
        this.field2487.method3983(arg0.field2547);
        this.field2488 = arg1;
        this.field2491 = 0L;
        int var3 = this.field2487.method3986();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2487.method4005(var4);
            this.field2487.method3990(var4);
            this.field2487.method3988(var4);
        }
        this.field2489 = this.field2487.method3994();
        this.field2490 = this.field2487.field2526[this.field2489];
        this.field2492 = this.field2487.method3993(this.field2490);
    }

    @ObfuscatedName("hg.n(B)V")
    public synchronized void method3877() {
        this.field2487.method3984();
        this.method3891();
    }

    @ObfuscatedName("hg.f(I)Z")
    public synchronized boolean method3878() {
        return this.field2487.method4000();
    }

    @ObfuscatedName("hg.g(III)V")
    public synchronized void method3914(int arg0, int arg1) {
        this.method3880(arg0, arg1);
    }

    @ObfuscatedName("hg.m(IIS)V")
    public void method3880(int arg0, int arg1) {
        this.field2485[arg0] = arg1;
        this.field2468[arg0] = arg1 & 0xFFFFFF80;
        this.method3881(arg0, arg1);
    }

    @ObfuscatedName("hg.r(IIB)V")
    public void method3881(int arg0, int arg1) {
        if (this.field2473[arg0] != arg1) {
            this.field2473[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2486[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("hg.t(IIII)V")
    public void method3961(int arg0, int arg1, int arg2) {
        this.method3884(arg0, arg1, 64);
        if ((this.field2479[arg0] & 0x2) != 0) {
            for (class220 var4 = (class220) this.field2493.field2544.method3775(); var4 != null; var4 = (class220) this.field2493.field2544.method3785()) {
                if (var4.field2501 == arg0 && var4.field2509 < 0) {
                    this.field2471[arg0][var4.field2503] = null;
                    this.field2471[arg0][arg1] = var4;
                    int var5 = (var4.field2505 * var4.field2504 >> 12) + var4.field2517;
                    var4.field2517 += arg1 - var4.field2503 << 8;
                    var4.field2504 = var5 - var4.field2517;
                    var4.field2505 = 4096;
                    var4.field2503 = arg1;
                    return;
                }
            }
        }
        class222 var6 = (class222) this.field2482.method3712((long) this.field2473[arg0]);
        if (var6 == null) {
            return;
        }
        class94 var7 = var6.field2534[arg1];
        if (var7 == null) {
            return;
        }
        class220 var8 = new class220();
        var8.field2501 = arg0;
        var8.field2518 = var6;
        var8.field2497 = var7;
        var8.field2512 = var6.field2538[arg1];
        var8.field2499 = var6.field2539[arg1];
        var8.field2503 = arg1;
        var8.field2508 = var6.field2541 * arg2 * arg2 * var6.field2533[arg1] + 1024 >> 11;
        var8.field2502 = var6.field2537[arg1] & 0xFF;
        var8.field2517 = (arg1 << 8) - (var6.field2535[arg1] & 0x7FFF);
        var8.field2506 = 0;
        var8.field2507 = 0;
        var8.field2498 = 0;
        var8.field2509 = -1;
        var8.field2496 = 0;
        if (this.field2472[arg0] == 0) {
            var8.field2513 = class104.method2097(var7, this.method3906(var8), this.method3896(var8), this.method3942(var8));
        } else {
            var8.field2513 = class104.method2097(var7, this.method3906(var8), 0, this.method3942(var8));
            this.method3883(var8, var6.field2535[arg1] < 0);
        }
        if (var6.field2535[arg1] < 0) {
            var8.field2513.method2099(-1);
        }
        if (var8.field2499 >= 0) {
            class220 var9 = this.field2486[arg0][var8.field2499];
            if (var9 != null && var9.field2509 < 0) {
                this.field2471[arg0][var9.field2503] = null;
                var9.field2509 = 0;
            }
            this.field2486[arg0][var8.field2499] = var8;
        }
        this.field2493.field2544.method3765(var8);
        this.field2471[arg0][arg1] = var8;
    }

    @ObfuscatedName("hg.o(Lhn;ZI)V")
    public void method3883(class220 arg0, boolean arg1) {
        int var3 = arg0.field2497.field1279.length;
        int var5;
        if (arg1 && arg0.field2497.field1282) {
            int var4 = var3 + var3 - arg0.field2497.field1278;
            var5 = (int) ((long) this.field2472[arg0.field2501] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2513.method2138(true);
            }
        } else {
            var5 = (int) ((long) this.field2472[arg0.field2501] * (long) var3 >> 6);
        }
        arg0.field2513.method2105(var5);
    }

    @ObfuscatedName("hg.y(IIII)V")
    public void method3884(int arg0, int arg1, int arg2) {
        class220 var4 = this.field2471[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2471[arg0][arg1] = null;
        if ((this.field2479[arg0] & 0x2) == 0) {
            var4.field2509 = 0;
            return;
        }
        for (class220 var5 = (class220) this.field2493.field2544.method3790(); var5 != null; var5 = (class220) this.field2493.field2544.method3771()) {
            if (var4.field2501 == var5.field2501 && var5.field2509 < 0 && var4 != var5) {
                var4.field2509 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("hg.a(IIII)V")
    public void method3885(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("hg.c(III)V")
    public void method3886(int arg0, int arg1) {
    }

    @ObfuscatedName("hg.v(IIS)V")
    public void method3887(int arg0, int arg1) {
        this.field2466[arg0] = arg1;
    }

    @ObfuscatedName("hg.ai(IB)V")
    public void method3888(int arg0) {
        for (class220 var2 = (class220) this.field2493.field2544.method3790(); var2 != null; var2 = (class220) this.field2493.field2544.method3771()) {
            if (arg0 < 0 || var2.field2501 == arg0) {
                if (var2.field2513 != null) {
                    var2.field2513.method2110(Statics.field1301 / 100);
                    if (var2.field2513.method2114()) {
                        this.field2493.field2545.method1899(var2.field2513);
                    }
                    var2.method3977();
                }
                if (var2.field2509 < 0) {
                    this.field2471[var2.field2501][var2.field2503] = null;
                }
                var2.method3756();
            }
        }
    }

    @ObfuscatedName("hg.ac(II)V")
    public void method3902(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3902(var2);
            }
            return;
        }
        this.field2469[arg0] = 12800;
        this.field2470[arg0] = 8192;
        this.field2474[arg0] = 16383;
        this.field2466[arg0] = 8192;
        this.field2476[arg0] = 0;
        this.field2477[arg0] = 8192;
        this.method3934(arg0);
        this.method3893(arg0);
        this.field2479[arg0] = 0;
        this.field2480[arg0] = 32767;
        this.field2481[arg0] = 256;
        this.field2472[arg0] = 0;
        this.method3965(arg0, 8192);
    }

    @ObfuscatedName("hg.ap(II)V")
    public void method3890(int arg0) {
        for (class220 var2 = (class220) this.field2493.field2544.method3790(); var2 != null; var2 = (class220) this.field2493.field2544.method3771()) {
            if ((arg0 < 0 || var2.field2501 == arg0) && var2.field2509 < 0) {
                this.field2471[var2.field2501][var2.field2503] = null;
                var2.field2509 = 0;
            }
        }
    }

    @ObfuscatedName("hg.aa(I)V")
    public void method3891() {
        this.method3888(-1);
        this.method3902(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2473[var1] = this.field2485[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2468[var2] = this.field2485[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("hg.al(II)V")
    public void method3934(int arg0) {
        if ((this.field2479[arg0] & 0x2) == 0) {
            return;
        }
        for (class220 var2 = (class220) this.field2493.field2544.method3790(); var2 != null; var2 = (class220) this.field2493.field2544.method3771()) {
            if (var2.field2501 == arg0 && this.field2471[arg0][var2.field2503] == null && var2.field2509 < 0) {
                var2.field2509 = 0;
            }
        }
    }

    @ObfuscatedName("hg.ae(IS)V")
    public void method3893(int arg0) {
        if ((this.field2479[arg0] & 0x4) == 0) {
            return;
        }
        for (class220 var2 = (class220) this.field2493.field2544.method3790(); var2 != null; var2 = (class220) this.field2493.field2544.method3771()) {
            if (var2.field2501 == arg0) {
                var2.field2515 = 0;
            }
        }
    }

    @ObfuscatedName("hg.am(II)V")
    public void method3894(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3884(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3961(var6, var7, var8);
            } else {
                this.method3884(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3885(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2468[var12] = (var14 << 14) + (this.field2468[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2468[var12] = (var14 << 7) + (this.field2468[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2476[var12] = (var14 << 7) + (this.field2476[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2476[var12] = (this.field2476[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2477[var12] = (var14 << 7) + (this.field2477[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2477[var12] = (this.field2477[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2469[var12] = (var14 << 7) + (this.field2469[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2469[var12] = (this.field2469[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2470[var12] = (var14 << 7) + (this.field2470[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2470[var12] = (this.field2470[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2474[var12] = (var14 << 7) + (this.field2474[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2474[var12] = (this.field2474[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2479[var12] |= 0x1;
                } else {
                    this.field2479[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2479[var12] |= 0x2;
                } else {
                    this.method3934(var12);
                    this.field2479[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2480[var12] = (var14 << 7) + (this.field2480[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2480[var12] = (this.field2480[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2480[var12] = (var14 << 7) + (this.field2480[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2480[var12] = (this.field2480[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3888(var12);
            }
            if (var13 == 121) {
                this.method3902(var12);
            }
            if (var13 == 123) {
                this.method3890(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2480[var12];
                if (var15 == 16384) {
                    this.field2481[var12] = (var14 << 7) + (this.field2481[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2480[var12];
                if (var16 == 16384) {
                    this.field2481[var12] = (this.field2481[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2472[var12] = (var14 << 7) + (this.field2472[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2472[var12] = (this.field2472[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2479[var12] |= 0x4;
                } else {
                    this.method3893(var12);
                    this.field2479[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3965(var12, (var14 << 7) + (this.field2483[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3965(var12, (this.field2483[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3881(var17, this.field2468[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3886(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3887(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3891();
            }
        }
    }

    @ObfuscatedName("hg.ay(III)V")
    public void method3965(int arg0, int arg1) {
        this.field2483[arg0] = arg1;
        this.field2484[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("hg.ag(Lhn;I)I")
    public int method3906(class220 arg0) {
        int var2 = (arg0.field2505 * arg0.field2504 >> 12) + arg0.field2517;
        int var3 = ((this.field2466[arg0.field2501] - 8192) * this.field2481[arg0.field2501] >> 12) + var2;
        class217 var4 = arg0.field2512;
        if (var4.field2453 > 0 && (var4.field2454 > 0 || this.field2476[arg0.field2501] > 0)) {
            int var5 = var4.field2454 << 2;
            int var6 = var4.field2455 << 1;
            if (arg0.field2500 < var6) {
                var5 = arg0.field2500 * var5 / var6;
            }
            int var7 = (this.field2476[arg0.field2501] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2510 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2497.field1280 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1301 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("hg.bk(Lhn;I)I")
    public int method3896(class220 arg0) {
        class217 var2 = arg0.field2512;
        int var3 = this.field2474[arg0.field2501] * this.field2469[arg0.field2501] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2508 * var4 + 16384 >> 15;
        int var6 = this.field2467 * var5 + 128 >> 8;
        if (var2.field2449 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2506 * 1.953125E-5D * (double) var2.field2449) + 0.5D);
        }
        if (var2.field2448 != null) {
            int var7 = arg0.field2507;
            int var8 = var2.field2448[arg0.field2498 + 1];
            if (arg0.field2498 < var2.field2448.length - 2) {
                int var9 = (var2.field2448[arg0.field2498] & 0xFF) << 8;
                int var10 = (var2.field2448[arg0.field2498 + 2] & 0xFF) << 8;
                var8 += (var2.field2448[arg0.field2498 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2509 > 0 && var2.field2450 != null) {
            int var11 = arg0.field2509;
            int var12 = var2.field2450[arg0.field2496 + 1];
            if (arg0.field2496 < var2.field2450.length - 2) {
                int var13 = (var2.field2450[arg0.field2496] & 0xFF) << 8;
                int var14 = (var2.field2450[arg0.field2496 + 2] & 0xFF) << 8;
                var12 += (var2.field2450[arg0.field2496 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("hg.bp(Lhn;I)I")
    public int method3942(class220 arg0) {
        int var2 = this.field2470[arg0.field2501];
        return var2 < 8192 ? arg0.field2502 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2502) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("hg.q()Ldo;")
    public synchronized class106 method1880() {
        return this.field2493;
    }

    @ObfuscatedName("hg.i()Ldo;")
    public synchronized class106 method1881() {
        return null;
    }

    @ObfuscatedName("hg.x()I")
    public synchronized int method1903() {
        return 0;
    }

    @ObfuscatedName("hg.e([III)V")
    public synchronized void method1883(int[] arg0, int arg1, int arg2) {
        if (this.field2487.method4000()) {
            int var4 = this.field2475 * this.field2487.field2520 / Statics.field1301;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2491;
                if (this.field2492 - var5 >= 0L) {
                    this.field2491 = var5;
                    break;
                }
                int var7 = (int) ((this.field2492 - this.field2491 + (long) var4 - 1L) / (long) var4);
                this.field2491 += (long) var4 * (long) var7;
                this.field2493.method1883(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3933();
            } while (this.field2487.method4000());
        }
        this.field2493.method1883(arg0, arg1, arg2);
    }

    @ObfuscatedName("hg.b(I)V")
    public synchronized void method1885(int arg0) {
        if (this.field2487.method4000()) {
            int var2 = this.field2475 * this.field2487.field2520 / Statics.field1301;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2491;
                if (this.field2492 - var3 >= 0L) {
                    this.field2491 = var3;
                    break;
                }
                int var5 = (int) ((this.field2492 - this.field2491 + (long) var2 - 1L) / (long) var2);
                this.field2491 += (long) var2 * (long) var5;
                this.field2493.method1885(var5);
                arg0 -= var5;
                this.method3933();
            } while (this.field2487.method4000());
        }
        this.field2493.method1885(arg0);
    }

    @ObfuscatedName("hg.bi(I)V")
    public void method3933() {
        int var1 = this.field2489;
        int var2 = this.field2490;
        long var3 = this.field2492;
        while (this.field2490 == var2) {
            while (this.field2487.field2526[var1] == var2) {
                this.field2487.method4005(var1);
                int var5 = this.field2487.method3991(var1);
                if (var5 == 1) {
                    this.field2487.method3989();
                    this.field2487.method3988(var1);
                    if (this.field2487.method3995()) {
                        if (!this.field2488 || var2 == 0) {
                            this.method3891();
                            this.field2487.method3984();
                            return;
                        }
                        this.field2487.method3996(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3894(var5);
                }
                this.field2487.method3990(var1);
                this.field2487.method3988(var1);
            }
            var1 = this.field2487.method3994();
            var2 = this.field2487.field2526[var1];
            var3 = this.field2487.method3993(var2);
        }
        this.field2489 = var1;
        this.field2490 = var2;
        this.field2492 = var3;
    }

    @ObfuscatedName("hg.bj(Lhn;I)Z")
    public boolean method3898(class220 arg0) {
        if (arg0.field2513 != null) {
            return false;
        }
        if (arg0.field2509 >= 0) {
            arg0.method3756();
            if (arg0.field2499 > 0 && this.field2486[arg0.field2501][arg0.field2499] == arg0) {
                this.field2486[arg0.field2501][arg0.field2499] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("hg.bo(Lhn;[IIII)Z")
    public boolean method3899(class220 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2514 = Statics.field1301 / 100;
        if (arg0.field2509 >= 0 && arg0.field2513 == null || arg0.field2513.method2113()) {
            arg0.method3977();
            arg0.method3756();
            if (arg0.field2499 > 0 && this.field2486[arg0.field2501][arg0.field2499] == arg0) {
                this.field2486[arg0.field2501][arg0.field2499] = null;
            }
            return true;
        }
        int var5 = arg0.field2505;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2477[arg0.field2501] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2505 = var6;
        }
        arg0.field2513.method2111(this.method3906(arg0));
        class217 var7 = arg0.field2512;
        boolean var8 = false;
        arg0.field2500++;
        arg0.field2510 += var7.field2453;
        double var9 = (double) ((arg0.field2503 - 60 << 8) + (arg0.field2505 * arg0.field2504 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2449 > 0) {
            if (var7.field2452 > 0) {
                arg0.field2506 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2452 * var9) + 0.5D);
            } else {
                arg0.field2506 += 128;
            }
        }
        if (var7.field2448 != null) {
            if (var7.field2451 > 0) {
                arg0.field2507 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2451 * var9) + 0.5D);
            } else {
                arg0.field2507 += 128;
            }
            while (arg0.field2498 < var7.field2448.length - 2 && arg0.field2507 > (var7.field2448[arg0.field2498 + 2] & 0xFF) << 8) {
                arg0.field2498 += 2;
            }
            if (arg0.field2498 == var7.field2448.length - 2 && var7.field2448[arg0.field2498 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2509 >= 0 && var7.field2450 != null && (this.field2479[arg0.field2501] & 0x1) == 0 && (arg0.field2499 < 0 || this.field2486[arg0.field2501][arg0.field2499] != arg0)) {
            if (var7.field2447 > 0) {
                arg0.field2509 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2447 * var9) + 0.5D);
            } else {
                arg0.field2509 += 128;
            }
            while (arg0.field2496 < var7.field2450.length - 2 && arg0.field2509 > (var7.field2450[arg0.field2496 + 2] & 0xFF) << 8) {
                arg0.field2496 += 2;
            }
            if (arg0.field2496 == var7.field2450.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2513.method2109(arg0.field2514, this.method3896(arg0), this.method3942(arg0));
            return false;
        }
        arg0.field2513.method2110(arg0.field2514);
        if (arg1 == null) {
            arg0.field2513.method1885(arg3);
        } else {
            arg0.field2513.method1883(arg1, arg2, arg3);
        }
        if (arg0.field2513.method2114()) {
            this.field2493.field2545.method1899(arg0.field2513);
        }
        arg0.method3977();
        if (arg0.field2509 >= 0) {
            arg0.method3756();
            if (arg0.field2499 > 0 && this.field2486[arg0.field2501][arg0.field2499] == arg0) {
                this.field2486[arg0.field2501][arg0.field2499] = null;
            }
        }
        return true;
    }
}
