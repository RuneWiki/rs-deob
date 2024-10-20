package deob;

@ObfuscatedName("eu")
public class class144 extends class49 {

    @ObfuscatedName("eu.i")
    public class177 field2415 = new class177(128);

    @ObfuscatedName("eu.b")
    public int field2396 = 256;

    @ObfuscatedName("eu.r")
    public int field2398 = 1000000;

    @ObfuscatedName("eu.l")
    public int[] field2399 = new int[16];

    @ObfuscatedName("eu.s")
    public int[] field2416 = new int[16];

    @ObfuscatedName("eu.d")
    public int[] field2401 = new int[16];

    @ObfuscatedName("eu.e")
    public int[] field2402 = new int[16];

    @ObfuscatedName("eu.u")
    public int[] field2403 = new int[16];

    @ObfuscatedName("eu.q")
    public int[] field2408 = new int[16];

    @ObfuscatedName("eu.o")
    public int[] field2405 = new int[16];

    @ObfuscatedName("eu.v")
    public int[] field2406 = new int[16];

    @ObfuscatedName("eu.m")
    public int[] field2407 = new int[16];

    @ObfuscatedName("eu.k")
    public int[] field2409 = new int[16];

    @ObfuscatedName("eu.n")
    public int[] field2419 = new int[16];

    @ObfuscatedName("eu.t")
    public int[] field2400 = new int[16];

    @ObfuscatedName("eu.y")
    public int[] field2411 = new int[16];

    @ObfuscatedName("eu.g")
    public int[] field2412 = new int[16];

    @ObfuscatedName("eu.f")
    public int[] field2413 = new int[16];

    @ObfuscatedName("eu.j")
    public class148[][] field2414 = new class148[16][128];

    @ObfuscatedName("eu.af")
    public class148[][] field2410 = new class148[16][128];

    @ObfuscatedName("eu.ar")
    public class147 field2397 = new class147();

    @ObfuscatedName("eu.ax")
    public boolean field2417;

    @ObfuscatedName("eu.at")
    public int field2418;

    @ObfuscatedName("eu.ah")
    public int field2404;

    @ObfuscatedName("eu.ap")
    public long field2420;

    @ObfuscatedName("eu.ay")
    public long field2421;

    @ObfuscatedName("eu.ag")
    public class146 field2422 = new class146(this);

    public class144() {
        this.method2804();
    }

    @ObfuscatedName("eu.i(II)V")
    public synchronized void method2786(int arg0) {
        this.field2396 = arg0;
    }

    @ObfuscatedName("eu.b(I)I")
    public int method2854() {
        return this.field2396;
    }

    @ObfuscatedName("eu.l(Lem;Leg;Lbo;II)Z")
    public synchronized boolean method2876(class142 arg0, class155 arg1, class59 arg2, int arg3) {
        arg0.method2770();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class178 var7 = (class178) arg0.field2384.method3318(); var7 != null; var7 = (class178) arg0.field2384.method3321()) {
            int var8 = (int) var7.field2839;
            class143 var9 = (class143) this.field2415.method3315((long) var8);
            if (var9 == null) {
                var9 = class143.method696(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2415.method3329(var9, (long) var8);
            }
            if (!var9.method2782(arg2, var7.field2833, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2771();
        }
        return var5;
    }

    @ObfuscatedName("eu.s(I)V")
    public synchronized void method2853() {
        for (class143 var1 = (class143) this.field2415.method3318(); var1 != null; var1 = (class143) this.field2415.method3321()) {
            var1.method2777();
        }
    }

    @ObfuscatedName("eu.d(I)V")
    public synchronized void method2789() {
        for (class143 var1 = (class143) this.field2415.method3318(); var1 != null; var1 = (class143) this.field2415.method3321()) {
            var1.method3363();
        }
    }

    @ObfuscatedName("eu.e(Lem;ZS)V")
    public synchronized void method2790(class142 arg0, boolean arg1) {
        this.method2791();
        this.field2397.method2930(arg0.field2385);
        this.field2417 = arg1;
        this.field2420 = 0L;
        int var3 = this.field2397.method2922();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2397.method2923(var4);
            this.field2397.method2926(var4);
            this.field2397.method2952(var4);
        }
        this.field2418 = this.field2397.method2924();
        this.field2404 = this.field2397.field2443[this.field2418];
        this.field2421 = this.field2397.method2945(this.field2404);
    }

    @ObfuscatedName("eu.u(I)V")
    public synchronized void method2791() {
        this.field2397.method2920();
        this.method2804();
    }

    @ObfuscatedName("eu.q(B)Z")
    public synchronized boolean method2792() {
        return this.field2397.method2921();
    }

    @ObfuscatedName("eu.o(III)V")
    public synchronized void method2814(int arg0, int arg1) {
        this.method2884(arg0, arg1);
    }

    @ObfuscatedName("eu.v(III)V")
    public void method2884(int arg0, int arg1) {
        this.field2402[arg0] = arg1;
        this.field2408[arg0] = arg1 & 0xFFFFFF80;
        this.method2795(arg0, arg1);
    }

    @ObfuscatedName("eu.m(IIB)V")
    public void method2795(int arg0, int arg1) {
        if (this.field2403[arg0] != arg1) {
            this.field2403[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2410[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("eu.x(IIII)V")
    public void method2895(int arg0, int arg1, int arg2) {
        this.method2796(arg0, arg1, 64);
        if ((this.field2409[arg0] & 0x2) != 0) {
            for (class148 var4 = (class148) this.field2422.field2435.method3340(); var4 != null; var4 = (class148) this.field2422.field2435.method3342()) {
                if (var4.field2465 == arg0 && var4.field2453 < 0) {
                    this.field2414[arg0][var4.field2467] = null;
                    this.field2414[arg0][arg1] = var4;
                    int var5 = (var4.field2463 * var4.field2462 >> 12) + var4.field2473;
                    var4.field2473 += arg1 - var4.field2467 << 8;
                    var4.field2462 = var5 - var4.field2473;
                    var4.field2463 = 4096;
                    var4.field2467 = arg1;
                    return;
                }
            }
        }
        class143 var6 = (class143) this.field2415.method3315((long) this.field2403[arg0]);
        if (var6 == null) {
            return;
        }
        class64 var7 = var6.field2387[arg1];
        if (var7 == null) {
            return;
        }
        class148 var8 = new class148();
        var8.field2465 = arg0;
        var8.field2455 = var6;
        var8.field2460 = var7;
        var8.field2456 = var6.field2393[arg1];
        var8.field2457 = var6.field2392[arg1];
        var8.field2467 = arg1;
        var8.field2459 = var6.field2389 * arg2 * arg2 * var6.field2394[arg1] + 1024 >> 11;
        var8.field2471 = var6.field2386[arg1] & 0xFF;
        var8.field2473 = (arg1 << 8) - (var6.field2388[arg1] & 0x7FFF);
        var8.field2464 = 0;
        var8.field2474 = 0;
        var8.field2466 = 0;
        var8.field2453 = -1;
        var8.field2468 = 0;
        if (this.field2411[arg0] == 0) {
            var8.field2458 = class46.method958(var7, this.method2809(var8), this.method2872(var8), this.method2887(var8));
        } else {
            var8.field2458 = class46.method958(var7, this.method2809(var8), 0, this.method2887(var8));
            this.method2797(var8, var6.field2388[arg1] < 0);
        }
        if (var6.field2388[arg1] < 0) {
            var8.field2458.method1033(-1);
        }
        if (var8.field2457 >= 0) {
            class148 var9 = this.field2410[arg0][var8.field2457];
            if (var9 != null && var9.field2453 < 0) {
                this.field2414[arg0][var9.field2467] = null;
                var9.field2453 = 0;
            }
            this.field2410[arg0][var8.field2457] = var8;
        }
        this.field2422.field2435.method3334(var8);
        this.field2414[arg0][arg1] = var8;
    }

    @ObfuscatedName("eu.w(Lez;ZB)V")
    public void method2797(class148 arg0, boolean arg1) {
        int var3 = arg0.field2460.field1243.length;
        int var5;
        if (arg1 && arg0.field2460.field1245) {
            int var4 = var3 + var3 - arg0.field2460.field1241;
            var5 = (int) ((long) this.field2411[arg0.field2465] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2458.method966(true);
            }
        } else {
            var5 = (int) ((long) this.field2411[arg0.field2465] * (long) var3 >> 6);
        }
        arg0.field2458.method965(var5);
    }

    @ObfuscatedName("eu.p(IIIB)V")
    public void method2796(int arg0, int arg1, int arg2) {
        class148 var4 = this.field2414[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2414[arg0][arg1] = null;
        if ((this.field2409[arg0] & 0x2) == 0) {
            var4.field2453 = 0;
            return;
        }
        for (class148 var5 = (class148) this.field2422.field2435.method3339(); var5 != null; var5 = (class148) this.field2422.field2435.method3353()) {
            if (var4.field2465 == var5.field2465 && var5.field2453 < 0 && var4 != var5) {
                var4.field2453 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("eu.z(IIII)V")
    public void method2799(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("eu.h(III)V")
    public void method2877(int arg0, int arg1) {
    }

    @ObfuscatedName("eu.a(III)V")
    public void method2803(int arg0, int arg1) {
        this.field2405[arg0] = arg1;
    }

    @ObfuscatedName("eu.c(II)V")
    public void method2801(int arg0) {
        for (class148 var2 = (class148) this.field2422.field2435.method3339(); var2 != null; var2 = (class148) this.field2422.field2435.method3353()) {
            if (arg0 < 0 || var2.field2465 == arg0) {
                if (var2.field2458 != null) {
                    var2.field2458.method970(Statics.field2014 / 100);
                    if (var2.field2458.method986()) {
                        this.field2422.field2436.method1120(var2.field2458);
                    }
                    var2.method2972();
                }
                if (var2.field2453 < 0) {
                    this.field2414[var2.field2465][var2.field2467] = null;
                }
                var2.method3363();
            }
        }
    }

    @ObfuscatedName("eu.k(II)V")
    public void method2802(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2802(var2);
            }
            return;
        }
        this.field2399[arg0] = 12800;
        this.field2416[arg0] = 8192;
        this.field2401[arg0] = 16383;
        this.field2405[arg0] = 8192;
        this.field2406[arg0] = 0;
        this.field2407[arg0] = 8192;
        this.method2864(arg0);
        this.method2858(arg0);
        this.field2409[arg0] = 0;
        this.field2419[arg0] = 32767;
        this.field2400[arg0] = 256;
        this.field2411[arg0] = 0;
        this.method2808(arg0, 8192);
    }

    @ObfuscatedName("eu.n(II)V")
    public void method2834(int arg0) {
        for (class148 var2 = (class148) this.field2422.field2435.method3339(); var2 != null; var2 = (class148) this.field2422.field2435.method3353()) {
            if ((arg0 < 0 || var2.field2465 == arg0) && var2.field2453 < 0) {
                this.field2414[var2.field2465][var2.field2467] = null;
                var2.field2453 = 0;
            }
        }
    }

    @ObfuscatedName("eu.t(B)V")
    public void method2804() {
        this.method2801(-1);
        this.method2802(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2403[var1] = this.field2402[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2408[var2] = this.field2402[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("eu.ar(II)V")
    public void method2864(int arg0) {
        if ((this.field2409[arg0] & 0x2) == 0) {
            return;
        }
        for (class148 var2 = (class148) this.field2422.field2435.method3339(); var2 != null; var2 = (class148) this.field2422.field2435.method3353()) {
            if (var2.field2465 == arg0 && this.field2414[arg0][var2.field2467] == null && var2.field2453 < 0) {
                var2.field2453 = 0;
            }
        }
    }

    @ObfuscatedName("eu.ax(IB)V")
    public void method2858(int arg0) {
        if ((this.field2409[arg0] & 0x4) == 0) {
            return;
        }
        for (class148 var2 = (class148) this.field2422.field2435.method3339(); var2 != null; var2 = (class148) this.field2422.field2435.method3353()) {
            if (var2.field2465 == arg0) {
                var2.field2461 = 0;
            }
        }
    }

    @ObfuscatedName("eu.at(IS)V")
    public void method2788(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2796(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2895(var6, var7, var8);
            } else {
                this.method2796(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2799(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2408[var12] = (var14 << 14) + (this.field2408[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2408[var12] = (var14 << 7) + (this.field2408[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2406[var12] = (var14 << 7) + (this.field2406[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2406[var12] = (this.field2406[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2407[var12] = (var14 << 7) + (this.field2407[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2407[var12] = (this.field2407[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2399[var12] = (var14 << 7) + (this.field2399[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2399[var12] = (this.field2399[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2416[var12] = (var14 << 7) + (this.field2416[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2416[var12] = (this.field2416[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2401[var12] = (var14 << 7) + (this.field2401[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2401[var12] = (this.field2401[var12] & 0xFFFFFF80) + var14;
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
                    this.method2864(var12);
                    this.field2409[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2419[var12] = (var14 << 7) + (this.field2419[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2419[var12] = (this.field2419[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2419[var12] = (var14 << 7) + (this.field2419[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2419[var12] = (this.field2419[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2801(var12);
            }
            if (var13 == 121) {
                this.method2802(var12);
            }
            if (var13 == 123) {
                this.method2834(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2419[var12];
                if (var15 == 16384) {
                    this.field2400[var12] = (var14 << 7) + (this.field2400[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2419[var12];
                if (var16 == 16384) {
                    this.field2400[var12] = (this.field2400[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2411[var12] = (var14 << 7) + (this.field2411[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2411[var12] = (this.field2411[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2409[var12] |= 0x4;
                } else {
                    this.method2858(var12);
                    this.field2409[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2808(var12, (var14 << 7) + (this.field2412[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2808(var12, (this.field2412[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2795(var17, this.field2408[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2877(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method2803(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2804();
            }
        }
    }

    @ObfuscatedName("eu.ah(IIB)V")
    public void method2808(int arg0, int arg1) {
        this.field2412[arg0] = arg1;
        this.field2413[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("eu.ap(Lez;I)I")
    public int method2809(class148 arg0) {
        int var2 = (arg0.field2463 * arg0.field2462 >> 12) + arg0.field2473;
        int var3 = ((this.field2405[arg0.field2465] - 8192) * this.field2400[arg0.field2465] >> 12) + var2;
        class145 var4 = arg0.field2456;
        if (var4.field2424 > 0 && (var4.field2431 > 0 || this.field2406[arg0.field2465] > 0)) {
            int var5 = var4.field2431 << 2;
            int var6 = var4.field2432 << 1;
            if (arg0.field2469 < var6) {
                var5 = arg0.field2469 * var5 / var6;
            }
            int var7 = (this.field2406[arg0.field2465] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2470 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2460.field1242 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field2014 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("eu.ay(Lez;I)I")
    public int method2872(class148 arg0) {
        class145 var2 = arg0.field2456;
        int var3 = this.field2401[arg0.field2465] * this.field2399[arg0.field2465] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2459 * var4 + 16384 >> 15;
        int var6 = this.field2396 * var5 + 128 >> 8;
        if (var2.field2430 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2464 * 1.953125E-5D * (double) var2.field2430) + 0.5D);
        }
        if (var2.field2429 != null) {
            int var7 = arg0.field2474;
            int var8 = var2.field2429[arg0.field2466 + 1];
            if (arg0.field2466 < var2.field2429.length - 2) {
                int var9 = (var2.field2429[arg0.field2466] & 0xFF) << 8;
                int var10 = (var2.field2429[arg0.field2466 + 2] & 0xFF) << 8;
                var8 += (var2.field2429[arg0.field2466 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2453 > 0 && var2.field2425 != null) {
            int var11 = arg0.field2453;
            int var12 = var2.field2425[arg0.field2468 + 1];
            if (arg0.field2468 < var2.field2425.length - 2) {
                int var13 = (var2.field2425[arg0.field2468] & 0xFF) << 8;
                int var14 = (var2.field2425[arg0.field2468 + 2] & 0xFF) << 8;
                var12 += (var2.field2425[arg0.field2468 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("eu.ag(Lez;I)I")
    public int method2887(class148 arg0) {
        int var2 = this.field2416[arg0.field2465];
        return var2 < 8192 ? arg0.field2471 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2471) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("eu.y()Laz;")
    public synchronized class49 method969() {
        return this.field2422;
    }

    @ObfuscatedName("eu.g()Laz;")
    public synchronized class49 method1008() {
        return null;
    }

    @ObfuscatedName("eu.f()I")
    public synchronized int method1068() {
        return 0;
    }

    @ObfuscatedName("eu.j([III)V")
    public synchronized void method978(int[] arg0, int arg1, int arg2) {
        if (this.field2397.method2921()) {
            int var4 = this.field2398 * this.field2397.field2440 / Statics.field2014;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2420;
                if (this.field2421 - var5 >= 0L) {
                    this.field2420 = var5;
                    break;
                }
                int var7 = (int) ((this.field2421 - this.field2420 + (long) var4 - 1L) / (long) var4);
                this.field2420 += (long) var4 * (long) var7;
                this.field2422.method978(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2903();
            } while (this.field2397.method2921());
        }
        this.field2422.method978(arg0, arg1, arg2);
    }

    @ObfuscatedName("eu.af(I)V")
    public synchronized void method974(int arg0) {
        if (this.field2397.method2921()) {
            int var2 = this.field2398 * this.field2397.field2440 / Statics.field2014;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2420;
                if (this.field2421 - var3 >= 0L) {
                    this.field2420 = var3;
                    break;
                }
                int var5 = (int) ((this.field2421 - this.field2420 + (long) var2 - 1L) / (long) var2);
                this.field2420 += (long) var2 * (long) var5;
                this.field2422.method974(var5);
                arg0 -= var5;
                this.method2903();
            } while (this.field2397.method2921());
        }
        this.field2422.method974(arg0);
    }

    @ObfuscatedName("eu.ai(I)V")
    public void method2903() {
        int var1 = this.field2418;
        int var2 = this.field2404;
        long var3 = this.field2421;
        while (this.field2404 == var2) {
            while (this.field2397.field2443[var1] == var2) {
                this.field2397.method2923(var1);
                int var5 = this.field2397.method2927(var1);
                if (var5 == 1) {
                    this.field2397.method2925();
                    this.field2397.method2952(var1);
                    if (this.field2397.method2932()) {
                        if (!this.field2417 || var2 == 0) {
                            this.method2804();
                            this.field2397.method2920();
                            return;
                        }
                        this.field2397.method2933(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2788(var5);
                }
                this.field2397.method2926(var1);
                this.field2397.method2952(var1);
            }
            var1 = this.field2397.method2924();
            var2 = this.field2397.field2443[var1];
            var3 = this.field2397.method2945(var2);
        }
        this.field2418 = var1;
        this.field2404 = var2;
        this.field2421 = var3;
    }

    @ObfuscatedName("eu.aw(Lez;I)Z")
    public boolean method2812(class148 arg0) {
        if (arg0.field2458 != null) {
            return false;
        }
        if (arg0.field2453 >= 0) {
            arg0.method3363();
            if (arg0.field2457 > 0 && this.field2410[arg0.field2465][arg0.field2457] == arg0) {
                this.field2410[arg0.field2465][arg0.field2457] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("eu.am(Lez;[IIII)Z")
    public boolean method2813(class148 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2472 = Statics.field2014 / 100;
        if (arg0.field2453 >= 0 && arg0.field2458 == null || arg0.field2458.method973()) {
            arg0.method2972();
            arg0.method3363();
            if (arg0.field2457 > 0 && this.field2410[arg0.field2465][arg0.field2457] == arg0) {
                this.field2410[arg0.field2465][arg0.field2457] = null;
            }
            return true;
        }
        int var5 = arg0.field2463;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2407[arg0.field2465] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2463 = var6;
        }
        arg0.field2458.method971(this.method2809(arg0));
        class145 var7 = arg0.field2456;
        boolean var8 = false;
        arg0.field2469++;
        arg0.field2470 += var7.field2424;
        double var9 = (double) ((arg0.field2467 - 60 << 8) + (arg0.field2463 * arg0.field2462 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2430 > 0) {
            if (var7.field2426 > 0) {
                arg0.field2464 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2426 * var9) + 0.5D);
            } else {
                arg0.field2464 += 128;
            }
        }
        if (var7.field2429 != null) {
            if (var7.field2427 > 0) {
                arg0.field2474 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2427 * var9) + 0.5D);
            } else {
                arg0.field2474 += 128;
            }
            while (arg0.field2466 < var7.field2429.length - 2 && arg0.field2474 > (var7.field2429[arg0.field2466 + 2] & 0xFF) << 8) {
                arg0.field2466 += 2;
            }
            if (arg0.field2466 == var7.field2429.length - 2 && var7.field2429[arg0.field2466 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2453 >= 0 && var7.field2425 != null && (this.field2409[arg0.field2465] & 0x1) == 0 && (arg0.field2457 < 0 || this.field2410[arg0.field2465][arg0.field2457] != arg0)) {
            if (var7.field2428 > 0) {
                arg0.field2453 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2428 * var9) + 0.5D);
            } else {
                arg0.field2453 += 128;
            }
            while (arg0.field2468 < var7.field2425.length - 2 && arg0.field2453 > (var7.field2425[arg0.field2468 + 2] & 0xFF) << 8) {
                arg0.field2468 += 2;
            }
            if (arg0.field2468 == var7.field2425.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2458.method1027(arg0.field2472, this.method2872(arg0), this.method2887(arg0));
            return false;
        }
        arg0.field2458.method970(arg0.field2472);
        if (arg1 == null) {
            arg0.field2458.method974(arg3);
        } else {
            arg0.field2458.method978(arg1, arg2, arg3);
        }
        if (arg0.field2458.method986()) {
            this.field2422.field2436.method1120(arg0.field2458);
        }
        arg0.method2972();
        if (arg0.field2453 >= 0) {
            arg0.method3363();
            if (arg0.field2457 > 0 && this.field2410[arg0.field2465][arg0.field2457] == arg0) {
                this.field2410[arg0.field2465][arg0.field2457] = null;
            }
        }
        return true;
    }
}
