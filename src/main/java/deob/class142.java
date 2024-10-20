package deob;

@ObfuscatedName("ek")
public class class142 extends class48 {

    @ObfuscatedName("ek.b")
    public class175 field2403 = new class175(128);

    @ObfuscatedName("ek.c")
    public int field2405 = 256;

    @ObfuscatedName("ek.j")
    public int field2397 = 1000000;

    @ObfuscatedName("ek.i")
    public int[] field2406 = new int[16];

    @ObfuscatedName("ek.k")
    public int[] field2426 = new int[16];

    @ObfuscatedName("ek.q")
    public int[] field2402 = new int[16];

    @ObfuscatedName("ek.t")
    public int[] field2400 = new int[16];

    @ObfuscatedName("ek.v")
    public int[] field2413 = new int[16];

    @ObfuscatedName("ek.y")
    public int[] field2398 = new int[16];

    @ObfuscatedName("ek.g")
    public int[] field2423 = new int[16];

    @ObfuscatedName("ek.s")
    public int[] field2407 = new int[16];

    @ObfuscatedName("ek.n")
    public int[] field2408 = new int[16];

    @ObfuscatedName("ek.m")
    public int[] field2409 = new int[16];

    @ObfuscatedName("ek.f")
    public int[] field2410 = new int[16];

    @ObfuscatedName("ek.a")
    public int[] field2411 = new int[16];

    @ObfuscatedName("ek.h")
    public int[] field2412 = new int[16];

    @ObfuscatedName("ek.p")
    public int[] field2399 = new int[16];

    @ObfuscatedName("ek.e")
    public int[] field2414 = new int[16];

    @ObfuscatedName("ek.r")
    public class146[][] field2415 = new class146[16][128];

    @ObfuscatedName("ek.av")
    public class146[][] field2416 = new class146[16][128];

    @ObfuscatedName("ek.an")
    public class145 field2417 = new class145();

    @ObfuscatedName("ek.ae")
    public boolean field2418;

    @ObfuscatedName("ek.au")
    public int field2419;

    @ObfuscatedName("ek.ag")
    public int field2420;

    @ObfuscatedName("ek.at")
    public long field2421;

    @ObfuscatedName("ek.ac")
    public long field2422;

    @ObfuscatedName("ek.aw")
    public class144 field2404 = new class144(this);

    public class142() {
        this.method2777();
    }

    @ObfuscatedName("ek.b(II)V")
    public synchronized void method2754(int arg0) {
        this.field2405 = arg0;
    }

    @ObfuscatedName("ek.c(I)I")
    public int method2728() {
        return this.field2405;
    }

    @ObfuscatedName("ek.i(Ler;Leo;Lbo;IS)Z")
    public synchronized boolean method2729(class140 arg0, class153 arg1, class58 arg2, int arg3) {
        arg0.method2703();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class176 var7 = (class176) arg0.field2385.method3226(); var7 != null; var7 = (class176) arg0.field2385.method3231()) {
            int var8 = (int) var7.field2826;
            class141 var9 = (class141) this.field2403.method3232((long) var8);
            if (var9 == null) {
                var9 = class141.method1369(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2403.method3228(var9, (long) var8);
            }
            if (!var9.method2720(arg2, var7.field2820, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2704();
        }
        return var5;
    }

    @ObfuscatedName("ek.k(I)V")
    public synchronized void method2743() {
        for (class141 var1 = (class141) this.field2403.method3226(); var1 != null; var1 = (class141) this.field2403.method3231()) {
            var1.method2718();
        }
    }

    @ObfuscatedName("ek.q(I)V")
    public synchronized void method2731() {
        for (class141 var1 = (class141) this.field2403.method3226(); var1 != null; var1 = (class141) this.field2403.method3231()) {
            var1.method3282();
        }
    }

    @ObfuscatedName("ek.t(Ler;ZI)V")
    public synchronized void method2732(class140 arg0, boolean arg1) {
        this.method2755();
        this.field2417.method2836(arg0.field2386);
        this.field2418 = arg1;
        this.field2421 = 0L;
        int var3 = this.field2417.method2839();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2417.method2846(var4);
            this.field2417.method2842(var4);
            this.field2417.method2850(var4);
        }
        this.field2419 = this.field2417.method2847();
        this.field2420 = this.field2417.field2448[this.field2419];
        this.field2422 = this.field2417.method2880(this.field2420);
    }

    @ObfuscatedName("ek.v(I)V")
    public synchronized void method2755() {
        this.field2417.method2837();
        this.method2777();
    }

    @ObfuscatedName("ek.y(I)Z")
    public synchronized boolean method2733() {
        return this.field2417.method2838();
    }

    @ObfuscatedName("ek.w(III)V")
    public synchronized void method2769(int arg0, int arg1) {
        this.method2735(arg0, arg1);
    }

    @ObfuscatedName("ek.g(III)V")
    public void method2735(int arg0, int arg1) {
        this.field2400[arg0] = arg1;
        this.field2398[arg0] = arg1 & 0xFFFFFF80;
        this.method2726(arg0, arg1);
    }

    @ObfuscatedName("ek.s(III)V")
    public void method2726(int arg0, int arg1) {
        if (this.field2413[arg0] != arg1) {
            this.field2413[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2416[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ek.n(IIII)V")
    public void method2737(int arg0, int arg1, int arg2) {
        this.method2739(arg0, arg1, 64);
        if ((this.field2409[arg0] & 0x2) != 0) {
            for (class146 var4 = (class146) this.field2404.field2442.method3268(); var4 != null; var4 = (class146) this.field2404.field2442.method3249()) {
                if (var4.field2473 == arg0 && var4.field2472 < 0) {
                    this.field2415[arg0][var4.field2476] = null;
                    this.field2415[arg0][arg1] = var4;
                    int var5 = (var4.field2468 * var4.field2467 >> 12) + var4.field2466;
                    var4.field2466 += arg1 - var4.field2476 << 8;
                    var4.field2467 = var5 - var4.field2466;
                    var4.field2468 = 4096;
                    var4.field2476 = arg1;
                    return;
                }
            }
        }
        class141 var6 = (class141) this.field2403.method3232((long) this.field2413[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2393[arg1];
        if (var7 == null) {
            return;
        }
        class146 var8 = new class146();
        var8.field2473 = arg0;
        var8.field2459 = var6;
        var8.field2460 = var7;
        var8.field2474 = var6.field2392[arg1];
        var8.field2462 = var6.field2390[arg1];
        var8.field2476 = arg1;
        var8.field2464 = var6.field2387 * arg2 * arg2 * var6.field2388[arg1] + 1024 >> 11;
        var8.field2463 = var6.field2391[arg1] & 0xFF;
        var8.field2466 = (arg1 << 8) - (var6.field2389[arg1] & 0x7FFF);
        var8.field2469 = 0;
        var8.field2465 = 0;
        var8.field2471 = 0;
        var8.field2472 = -1;
        var8.field2470 = 0;
        if (this.field2412[arg0] == 0) {
            var8.field2458 = class45.method1085(var7, this.method2770(var8), this.method2752(var8), this.method2753(var8));
        } else {
            var8.field2458 = class45.method1085(var7, this.method2770(var8), 0, this.method2753(var8));
            this.method2738(var8, var6.field2389[arg1] < 0);
        }
        if (var6.field2389[arg1] < 0) {
            var8.field2458.method965(-1);
        }
        if (var8.field2462 >= 0) {
            class146 var9 = this.field2416[arg0][var8.field2462];
            if (var9 != null && var9.field2472 < 0) {
                this.field2415[arg0][var9.field2476] = null;
                var9.field2472 = 0;
            }
            this.field2416[arg0][var8.field2462] = var8;
        }
        this.field2404.field2442.method3261(var8);
        this.field2415[arg0][arg1] = var8;
    }

    @ObfuscatedName("ek.x(Lep;ZI)V")
    public void method2738(class146 arg0, boolean arg1) {
        int var3 = arg0.field2460.field1250.length;
        int var5;
        if (arg1 && arg0.field2460.field1251) {
            int var4 = var3 + var3 - arg0.field2460.field1249;
            var5 = (int) ((long) this.field2412[arg0.field2473] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2458.method950(true);
            }
        } else {
            var5 = (int) ((long) this.field2412[arg0.field2473] * (long) var3 >> 6);
        }
        arg0.field2458.method1073(var5);
    }

    @ObfuscatedName("ek.o(IIIS)V")
    public void method2739(int arg0, int arg1, int arg2) {
        class146 var4 = this.field2415[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2415[arg0][arg1] = null;
        if ((this.field2409[arg0] & 0x2) == 0) {
            var4.field2472 = 0;
            return;
        }
        for (class146 var5 = (class146) this.field2404.field2442.method3246(); var5 != null; var5 = (class146) this.field2404.field2442.method3248()) {
            if (var4.field2473 == var5.field2473 && var5.field2472 < 0 && var4 != var5) {
                var4.field2472 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ek.l(IIII)V")
    public void method2782(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ek.u(IIB)V")
    public void method2730(int arg0, int arg1) {
    }

    @ObfuscatedName("ek.z(III)V")
    public void method2734(int arg0, int arg1) {
        this.field2423[arg0] = arg1;
    }

    @ObfuscatedName("ek.d(IB)V")
    public void method2750(int arg0) {
        for (class146 var2 = (class146) this.field2404.field2442.method3246(); var2 != null; var2 = (class146) this.field2404.field2442.method3248()) {
            if (arg0 < 0 || var2.field2473 == arg0) {
                if (var2.field2458 != null) {
                    var2.field2458.method1075(Statics.field1117 / 100);
                    if (var2.field2458.method939()) {
                        this.field2404.field2440.method1087(var2.field2458);
                    }
                    var2.method2884();
                }
                if (var2.field2472 < 0) {
                    this.field2415[var2.field2473][var2.field2476] = null;
                }
                var2.method3282();
            }
        }
    }

    @ObfuscatedName("ek.m(II)V")
    public void method2744(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2744(var2);
            }
            return;
        }
        this.field2406[arg0] = 12800;
        this.field2426[arg0] = 8192;
        this.field2402[arg0] = 16383;
        this.field2423[arg0] = 8192;
        this.field2407[arg0] = 0;
        this.field2408[arg0] = 8192;
        this.method2747(arg0);
        this.method2748(arg0);
        this.field2409[arg0] = 0;
        this.field2410[arg0] = 32767;
        this.field2411[arg0] = 256;
        this.field2412[arg0] = 0;
        this.method2727(arg0, 8192);
    }

    @ObfuscatedName("ek.f(II)V")
    public void method2742(int arg0) {
        for (class146 var2 = (class146) this.field2404.field2442.method3246(); var2 != null; var2 = (class146) this.field2404.field2442.method3248()) {
            if ((arg0 < 0 || var2.field2473 == arg0) && var2.field2472 < 0) {
                this.field2415[var2.field2473][var2.field2476] = null;
                var2.field2472 = 0;
            }
        }
    }

    @ObfuscatedName("ek.a(B)V")
    public void method2777() {
        this.method2750(-1);
        this.method2744(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2413[var1] = this.field2400[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2398[var2] = this.field2400[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ek.an(IB)V")
    public void method2747(int arg0) {
        if ((this.field2409[arg0] & 0x2) == 0) {
            return;
        }
        for (class146 var2 = (class146) this.field2404.field2442.method3246(); var2 != null; var2 = (class146) this.field2404.field2442.method3248()) {
            if (var2.field2473 == arg0 && this.field2415[arg0][var2.field2476] == null && var2.field2472 < 0) {
                var2.field2472 = 0;
            }
        }
    }

    @ObfuscatedName("ek.ae(IS)V")
    public void method2748(int arg0) {
        if ((this.field2409[arg0] & 0x4) == 0) {
            return;
        }
        for (class146 var2 = (class146) this.field2404.field2442.method3246(); var2 != null; var2 = (class146) this.field2404.field2442.method3248()) {
            if (var2.field2473 == arg0) {
                var2.field2478 = 0;
            }
        }
    }

    @ObfuscatedName("ek.au(II)V")
    public void method2749(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2739(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2737(var6, var7, var8);
            } else {
                this.method2739(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2782(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2398[var12] = (var14 << 14) + (this.field2398[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2398[var12] = (var14 << 7) + (this.field2398[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2407[var12] = (var14 << 7) + (this.field2407[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2407[var12] = (this.field2407[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2408[var12] = (var14 << 7) + (this.field2408[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2408[var12] = (this.field2408[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2406[var12] = (var14 << 7) + (this.field2406[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2406[var12] = (this.field2406[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2426[var12] = (var14 << 7) + (this.field2426[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2426[var12] = (this.field2426[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2402[var12] = (var14 << 7) + (this.field2402[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2402[var12] = (this.field2402[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2409[var12] |= 0x1;
                } else {
                    this.field2409[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2409[var12] |= 0x2;
                } else {
                    this.method2747(var12);
                    this.field2409[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2410[var12] = (var14 << 7) + (this.field2410[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2410[var12] = (this.field2410[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2410[var12] = (var14 << 7) + (this.field2410[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2410[var12] = (this.field2410[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2750(var12);
            }
            if (var13 == 121) {
                this.method2744(var12);
            }
            if (var13 == 123) {
                this.method2742(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2410[var12];
                if (var15 == 16384) {
                    this.field2411[var12] = (var14 << 7) + (this.field2411[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2410[var12];
                if (var16 == 16384) {
                    this.field2411[var12] = (this.field2411[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2412[var12] = (var14 << 7) + (this.field2412[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2412[var12] = (this.field2412[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2409[var12] |= 0x4;
                } else {
                    this.method2748(var12);
                    this.field2409[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2727(var12, (var14 << 7) + (this.field2399[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2727(var12, (this.field2399[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2726(var17, this.field2398[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2730(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method2734(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2777();
            }
        }
    }

    @ObfuscatedName("ek.ag(III)V")
    public void method2727(int arg0, int arg1) {
        this.field2399[arg0] = arg1;
        this.field2414[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ek.at(Lep;B)I")
    public int method2770(class146 arg0) {
        int var2 = (arg0.field2468 * arg0.field2467 >> 12) + arg0.field2466;
        int var3 = ((this.field2423[arg0.field2473] - 8192) * this.field2411[arg0.field2473] >> 12) + var2;
        class143 var4 = arg0.field2474;
        if (var4.field2427 > 0 && (var4.field2433 > 0 || this.field2407[arg0.field2473] > 0)) {
            int var5 = var4.field2433 << 2;
            int var6 = var4.field2435 << 1;
            if (arg0.field2461 < var6) {
                var5 = arg0.field2461 * var5 / var6;
            }
            int var7 = (this.field2407[arg0.field2473] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2475 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2460.field1253 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1117 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ek.ac(Lep;I)I")
    public int method2752(class146 arg0) {
        class143 var2 = arg0.field2474;
        int var3 = this.field2402[arg0.field2473] * this.field2406[arg0.field2473] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2464 * var4 + 16384 >> 15;
        int var6 = this.field2405 * var5 + 128 >> 8;
        if (var2.field2429 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2469 * 1.953125E-5D * (double) var2.field2429) + 0.5D);
        }
        if (var2.field2432 != null) {
            int var7 = arg0.field2465;
            int var8 = var2.field2432[arg0.field2471 + 1];
            if (arg0.field2471 < var2.field2432.length - 2) {
                int var9 = (var2.field2432[arg0.field2471] & 0xFF) << 8;
                int var10 = (var2.field2432[arg0.field2471 + 2] & 0xFF) << 8;
                var8 += (var2.field2432[arg0.field2471 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2472 > 0 && var2.field2428 != null) {
            int var11 = arg0.field2472;
            int var12 = var2.field2428[arg0.field2470 + 1];
            if (arg0.field2470 < var2.field2428.length - 2) {
                int var13 = (var2.field2428[arg0.field2470] & 0xFF) << 8;
                int var14 = (var2.field2428[arg0.field2470 + 2] & 0xFF) << 8;
                var12 += (var2.field2428[arg0.field2470 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ek.aw(Lep;I)I")
    public int method2753(class146 arg0) {
        int var2 = this.field2426[arg0.field2473];
        return var2 < 8192 ? arg0.field2463 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2463) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ek.h()Lao;")
    public synchronized class48 method959() {
        return this.field2404;
    }

    @ObfuscatedName("ek.p()Lao;")
    public synchronized class48 method960() {
        return null;
    }

    @ObfuscatedName("ek.e()I")
    public synchronized int method961() {
        return 0;
    }

    @ObfuscatedName("ek.r([III)V")
    public synchronized void method962(int[] arg0, int arg1, int arg2) {
        if (this.field2417.method2838()) {
            int var4 = this.field2397 * this.field2417.field2457 / Statics.field1117;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2421;
                if (this.field2422 - var5 >= 0L) {
                    this.field2421 = var5;
                    break;
                }
                int var7 = (int) ((this.field2422 - this.field2421 + (long) var4 - 1L) / (long) var4);
                this.field2421 += (long) var4 * (long) var7;
                this.field2404.method962(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2802();
            } while (this.field2417.method2838());
        }
        this.field2404.method962(arg0, arg1, arg2);
    }

    @ObfuscatedName("ek.av(I)V")
    public synchronized void method963(int arg0) {
        if (this.field2417.method2838()) {
            int var2 = this.field2397 * this.field2417.field2457 / Statics.field1117;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2421;
                if (this.field2422 - var3 >= 0L) {
                    this.field2421 = var3;
                    break;
                }
                int var5 = (int) ((this.field2422 - this.field2421 + (long) var2 - 1L) / (long) var2);
                this.field2421 += (long) var2 * (long) var5;
                this.field2404.method963(var5);
                arg0 -= var5;
                this.method2802();
            } while (this.field2417.method2838());
        }
        this.field2404.method963(arg0);
    }

    @ObfuscatedName("ek.ah(I)V")
    public void method2802() {
        int var1 = this.field2419;
        int var2 = this.field2420;
        long var3 = this.field2422;
        while (this.field2420 == var2) {
            while (this.field2417.field2448[var1] == var2) {
                this.field2417.method2846(var1);
                int var5 = this.field2417.method2864(var1);
                if (var5 == 1) {
                    this.field2417.method2835();
                    this.field2417.method2850(var1);
                    if (this.field2417.method2848()) {
                        if (!this.field2418 || var2 == 0) {
                            this.method2777();
                            this.field2417.method2837();
                            return;
                        }
                        this.field2417.method2849(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2749(var5);
                }
                this.field2417.method2842(var1);
                this.field2417.method2850(var1);
            }
            var1 = this.field2417.method2847();
            var2 = this.field2417.field2448[var1];
            var3 = this.field2417.method2880(var2);
        }
        this.field2419 = var1;
        this.field2420 = var2;
        this.field2422 = var3;
    }

    @ObfuscatedName("ek.ai(Lep;I)Z")
    public boolean method2760(class146 arg0) {
        if (arg0.field2458 != null) {
            return false;
        }
        if (arg0.field2472 >= 0) {
            arg0.method3282();
            if (arg0.field2462 > 0 && this.field2416[arg0.field2473][arg0.field2462] == arg0) {
                this.field2416[arg0.field2473][arg0.field2462] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ek.ap(Lep;[IIIB)Z")
    public boolean method2803(class146 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2477 = Statics.field1117 / 100;
        if (arg0.field2472 >= 0 && arg0.field2458 == null || arg0.field2458.method957()) {
            arg0.method2884();
            arg0.method3282();
            if (arg0.field2462 > 0 && this.field2416[arg0.field2473][arg0.field2462] == arg0) {
                this.field2416[arg0.field2473][arg0.field2462] = null;
            }
            return true;
        }
        int var5 = arg0.field2468;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2408[arg0.field2473] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2468 = var6;
        }
        arg0.field2458.method1084(this.method2770(arg0));
        class143 var7 = arg0.field2474;
        boolean var8 = false;
        arg0.field2461++;
        arg0.field2475 += var7.field2427;
        double var9 = (double) ((arg0.field2476 - 60 << 8) + (arg0.field2468 * arg0.field2467 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2429 > 0) {
            if (var7.field2434 > 0) {
                arg0.field2469 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2434 * var9) + 0.5D);
            } else {
                arg0.field2469 += 128;
            }
        }
        if (var7.field2432 != null) {
            if (var7.field2430 > 0) {
                arg0.field2465 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2430 * var9) + 0.5D);
            } else {
                arg0.field2465 += 128;
            }
            while (arg0.field2471 < var7.field2432.length - 2 && arg0.field2465 > (var7.field2432[arg0.field2471 + 2] & 0xFF) << 8) {
                arg0.field2471 += 2;
            }
            if (arg0.field2471 == var7.field2432.length - 2 && var7.field2432[arg0.field2471 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2472 >= 0 && var7.field2428 != null && (this.field2409[arg0.field2473] & 0x1) == 0 && (arg0.field2462 < 0 || this.field2416[arg0.field2473][arg0.field2462] != arg0)) {
            if (var7.field2431 > 0) {
                arg0.field2472 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2431 * var9) + 0.5D);
            } else {
                arg0.field2472 += 128;
            }
            while (arg0.field2470 < var7.field2428.length - 2 && arg0.field2472 > (var7.field2428[arg0.field2470 + 2] & 0xFF) << 8) {
                arg0.field2470 += 2;
            }
            if (arg0.field2470 == var7.field2428.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2458.method1056(arg0.field2477, this.method2752(arg0), this.method2753(arg0));
            return false;
        }
        arg0.field2458.method1075(arg0.field2477);
        if (arg1 == null) {
            arg0.field2458.method963(arg3);
        } else {
            arg0.field2458.method962(arg1, arg2, arg3);
        }
        if (arg0.field2458.method939()) {
            this.field2404.field2440.method1087(arg0.field2458);
        }
        arg0.method2884();
        if (arg0.field2472 >= 0) {
            arg0.method3282();
            if (arg0.field2462 > 0 && this.field2416[arg0.field2473][arg0.field2462] == arg0) {
                this.field2416[arg0.field2473][arg0.field2462] = null;
            }
        }
        return true;
    }
}
