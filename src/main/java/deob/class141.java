package deob;

@ObfuscatedName("eg")
public class class141 extends class48 {

    @ObfuscatedName("eg.y")
    public class175 field2375 = new class175(128);

    @ObfuscatedName("eg.m")
    public int field2377 = 256;

    @ObfuscatedName("eg.d")
    public int field2353 = 1000000;

    @ObfuscatedName("eg.k")
    public int[] field2354 = new int[16];

    @ObfuscatedName("eg.n")
    public int[] field2355 = new int[16];

    @ObfuscatedName("eg.s")
    public int[] field2356 = new int[16];

    @ObfuscatedName("eg.x")
    public int[] field2357 = new int[16];

    @ObfuscatedName("eg.b")
    public int[] field2362 = new int[16];

    @ObfuscatedName("eg.j")
    public int[] field2359 = new int[16];

    @ObfuscatedName("eg.p")
    public int[] field2360 = new int[16];

    @ObfuscatedName("eg.l")
    public int[] field2361 = new int[16];

    @ObfuscatedName("eg.i")
    public int[] field2363 = new int[16];

    @ObfuscatedName("eg.z")
    public int[] field2365 = new int[16];

    @ObfuscatedName("eg.v")
    public int[] field2373 = new int[16];

    @ObfuscatedName("eg.w")
    public int[] field2367 = new int[16];

    @ObfuscatedName("eg.h")
    public int[] field2351 = new int[16];

    @ObfuscatedName("eg.q")
    public int[] field2368 = new int[16];

    @ObfuscatedName("eg.g")
    public int[] field2369 = new int[16];

    @ObfuscatedName("eg.e")
    public class145[][] field2352 = new class145[16][128];

    @ObfuscatedName("eg.as")
    public class145[][] field2371 = new class145[16][128];

    @ObfuscatedName("eg.an")
    public class144 field2372 = new class144();

    @ObfuscatedName("eg.aj")
    public boolean field2366;

    @ObfuscatedName("eg.ax")
    public int field2374;

    @ObfuscatedName("eg.av")
    public int field2370;

    @ObfuscatedName("eg.ae")
    public long field2364;

    @ObfuscatedName("eg.am")
    public long field2378;

    @ObfuscatedName("eg.aq")
    public class143 field2358 = new class143(this);

    public class141() {
        this.method2760();
    }

    @ObfuscatedName("eg.y(IB)V")
    public synchronized void method2742(int arg0) {
        this.field2377 = arg0;
    }

    @ObfuscatedName("eg.m(B)I")
    public int method2840() {
        return this.field2377;
    }

    @ObfuscatedName("eg.k(Let;Lel;Lbh;IB)Z")
    public synchronized boolean method2761(class139 arg0, class152 arg1, class58 arg2, int arg3) {
        arg0.method2726();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class176 var7 = (class176) arg0.field2339.method3335(); var7 != null; var7 = (class176) arg0.field2339.method3342()) {
            int var8 = (int) var7.field2819;
            class140 var9 = (class140) this.field2375.method3337((long) var8);
            if (var9 == null) {
                var9 = class140.method2399(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2375.method3334(var9, (long) var8);
            }
            if (!var9.method2734(arg2, var7.field2812, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2723();
        }
        return var5;
    }

    @ObfuscatedName("eg.n(I)V")
    public synchronized void method2775() {
        for (class140 var1 = (class140) this.field2375.method3335(); var1 != null; var1 = (class140) this.field2375.method3342()) {
            var1.method2735();
        }
    }

    @ObfuscatedName("eg.s(B)V")
    public synchronized void method2746() {
        for (class140 var1 = (class140) this.field2375.method3335(); var1 != null; var1 = (class140) this.field2375.method3342()) {
            var1.method3395();
        }
    }

    @ObfuscatedName("eg.x(Let;ZI)V")
    public synchronized void method2820(class139 arg0, boolean arg1) {
        this.method2822();
        this.field2372.method2859(arg0.field2338);
        this.field2366 = arg1;
        this.field2364 = 0L;
        int var3 = this.field2372.method2862();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2372.method2863(var4);
            this.field2372.method2879(var4);
            this.field2372.method2864(var4);
        }
        this.field2374 = this.field2372.method2872();
        this.field2370 = this.field2372.field2402[this.field2374];
        this.field2378 = this.field2372.method2870(this.field2370);
    }

    @ObfuscatedName("eg.b(I)V")
    public synchronized void method2822() {
        this.field2372.method2860();
        this.method2760();
    }

    @ObfuscatedName("eg.j(I)Z")
    public synchronized boolean method2772() {
        return this.field2372.method2861();
    }

    @ObfuscatedName("eg.p(III)V")
    public synchronized void method2833(int arg0, int arg1) {
        this.method2839(arg0, arg1);
    }

    @ObfuscatedName("eg.l(III)V")
    public void method2839(int arg0, int arg1) {
        this.field2357[arg0] = arg1;
        this.field2359[arg0] = arg1 & 0xFFFFFF80;
        this.method2777(arg0, arg1);
    }

    @ObfuscatedName("eg.i(III)V")
    public void method2777(int arg0, int arg1) {
        if (this.field2362[arg0] != arg1) {
            this.field2362[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2371[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("eg.r(IIII)V")
    public void method2786(int arg0, int arg1, int arg2) {
        this.method2754(arg0, arg1, 64);
        if ((this.field2365[arg0] & 0x2) != 0) {
            for (class145 var4 = (class145) this.field2358.field2395.method3356(); var4 != null; var4 = (class145) this.field2358.field2395.method3382()) {
                if (var4.field2419 == arg0 && var4.field2426 < 0) {
                    this.field2352[arg0][var4.field2417] = null;
                    this.field2352[arg0][arg1] = var4;
                    int var5 = (var4.field2421 * var4.field2415 >> 12) + var4.field2427;
                    var4.field2427 += arg1 - var4.field2417 << 8;
                    var4.field2421 = var5 - var4.field2427;
                    var4.field2415 = 4096;
                    var4.field2417 = arg1;
                    return;
                }
            }
        }
        class140 var6 = (class140) this.field2375.method3337((long) this.field2362[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2340[arg1];
        if (var7 == null) {
            return;
        }
        class145 var8 = new class145();
        var8.field2419 = arg0;
        var8.field2412 = var6;
        var8.field2414 = var7;
        var8.field2429 = var6.field2345[arg1];
        var8.field2416 = var6.field2346[arg1];
        var8.field2417 = arg1;
        var8.field2422 = var6.field2350 * arg2 * arg2 * var6.field2343[arg1] + 1024 >> 11;
        var8.field2434 = var6.field2341[arg1] & 0xFF;
        var8.field2427 = (arg1 << 8) - (var6.field2342[arg1] & 0x7FFF);
        var8.field2423 = 0;
        var8.field2424 = 0;
        var8.field2425 = 0;
        var8.field2426 = -1;
        var8.field2413 = 0;
        if (this.field2351[arg0] == 0) {
            var8.field2430 = class45.method959(var7, this.method2744(var8), this.method2766(var8), this.method2767(var8));
        } else {
            var8.field2430 = class45.method959(var7, this.method2744(var8), 0, this.method2767(var8));
            this.method2848(var8, var6.field2342[arg1] < 0);
        }
        if (var6.field2342[arg1] < 0) {
            var8.field2430.method961(-1);
        }
        if (var8.field2416 >= 0) {
            class145 var9 = this.field2371[arg0][var8.field2416];
            if (var9 != null && var9.field2426 < 0) {
                this.field2352[arg0][var9.field2417] = null;
                var9.field2426 = 0;
            }
            this.field2371[arg0][var8.field2416] = var8;
        }
        this.field2358.field2395.method3350(var8);
        this.field2352[arg0][arg1] = var8;
    }

    @ObfuscatedName("eg.o(Ler;ZI)V")
    public void method2848(class145 arg0, boolean arg1) {
        int var3 = arg0.field2414.field1228.length;
        int var5;
        if (arg1 && arg0.field2414.field1230) {
            int var4 = var3 + var3 - arg0.field2414.field1229;
            var5 = (int) ((long) this.field2351[arg0.field2419] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2430.method1080(true);
            }
        } else {
            var5 = (int) ((long) this.field2351[arg0.field2419] * (long) var3 >> 6);
        }
        arg0.field2430.method967(var5);
    }

    @ObfuscatedName("eg.c(IIII)V")
    public void method2754(int arg0, int arg1, int arg2) {
        class145 var4 = this.field2352[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2352[arg0][arg1] = null;
        if ((this.field2365[arg0] & 0x2) == 0) {
            var4.field2426 = 0;
            return;
        }
        for (class145 var5 = (class145) this.field2358.field2395.method3355(); var5 != null; var5 = (class145) this.field2358.field2395.method3357()) {
            if (var4.field2419 == var5.field2419 && var5.field2426 < 0 && var4 != var5) {
                var4.field2426 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("eg.f(IIIB)V")
    public void method2755(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("eg.a(IIS)V")
    public void method2756(int arg0, int arg1) {
    }

    @ObfuscatedName("eg.t(III)V")
    public void method2812(int arg0, int arg1) {
        this.field2360[arg0] = arg1;
    }

    @ObfuscatedName("eg.u(IB)V")
    public void method2757(int arg0) {
        for (class145 var2 = (class145) this.field2358.field2395.method3355(); var2 != null; var2 = (class145) this.field2358.field2395.method3357()) {
            if (arg0 < 0 || var2.field2419 == arg0) {
                if (var2.field2430 != null) {
                    var2.field2430.method972(Statics.field1094 / 100);
                    if (var2.field2430.method976()) {
                        this.field2358.field2397.method1109(var2.field2430);
                    }
                    var2.method2905();
                }
                if (var2.field2426 < 0) {
                    this.field2352[var2.field2419][var2.field2417] = null;
                }
                var2.method3395();
            }
        }
    }

    @ObfuscatedName("eg.z(II)V")
    public void method2758(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2758(var2);
            }
            return;
        }
        this.field2354[arg0] = 12800;
        this.field2355[arg0] = 8192;
        this.field2356[arg0] = 16383;
        this.field2360[arg0] = 8192;
        this.field2361[arg0] = 0;
        this.field2363[arg0] = 8192;
        this.method2752(arg0);
        this.method2762(arg0);
        this.field2365[arg0] = 0;
        this.field2373[arg0] = 32767;
        this.field2367[arg0] = 256;
        this.field2351[arg0] = 0;
        this.method2830(arg0, 8192);
    }

    @ObfuscatedName("eg.v(II)V")
    public void method2768(int arg0) {
        for (class145 var2 = (class145) this.field2358.field2395.method3355(); var2 != null; var2 = (class145) this.field2358.field2395.method3357()) {
            if ((arg0 < 0 || var2.field2419 == arg0) && var2.field2426 < 0) {
                this.field2352[var2.field2419][var2.field2417] = null;
                var2.field2426 = 0;
            }
        }
    }

    @ObfuscatedName("eg.w(I)V")
    public void method2760() {
        this.method2757(-1);
        this.method2758(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2362[var1] = this.field2357[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2359[var2] = this.field2357[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("eg.an(II)V")
    public void method2752(int arg0) {
        if ((this.field2365[arg0] & 0x2) == 0) {
            return;
        }
        for (class145 var2 = (class145) this.field2358.field2395.method3355(); var2 != null; var2 = (class145) this.field2358.field2395.method3357()) {
            if (var2.field2419 == arg0 && this.field2352[arg0][var2.field2417] == null && var2.field2426 < 0) {
                var2.field2426 = 0;
            }
        }
    }

    @ObfuscatedName("eg.aj(IB)V")
    public void method2762(int arg0) {
        if ((this.field2365[arg0] & 0x4) == 0) {
            return;
        }
        for (class145 var2 = (class145) this.field2358.field2395.method3355(); var2 != null; var2 = (class145) this.field2358.field2395.method3357()) {
            if (var2.field2419 == arg0) {
                var2.field2432 = 0;
            }
        }
    }

    @ObfuscatedName("eg.ax(II)V")
    public void method2778(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2754(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2786(var6, var7, var8);
            } else {
                this.method2754(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2755(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2359[var12] = (var14 << 14) + (this.field2359[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2359[var12] = (var14 << 7) + (this.field2359[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2361[var12] = (var14 << 7) + (this.field2361[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2361[var12] = (this.field2361[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2363[var12] = (var14 << 7) + (this.field2363[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2363[var12] = (this.field2363[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2354[var12] = (var14 << 7) + (this.field2354[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2354[var12] = (this.field2354[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2355[var12] = (var14 << 7) + (this.field2355[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2355[var12] = (this.field2355[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2356[var12] = (var14 << 7) + (this.field2356[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2356[var12] = (this.field2356[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2365[var12] |= 0x1;
                } else {
                    this.field2365[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2365[var12] |= 0x2;
                } else {
                    this.method2752(var12);
                    this.field2365[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2373[var12] = (var14 << 7) + (this.field2373[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2373[var12] = (this.field2373[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2373[var12] = (var14 << 7) + (this.field2373[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2373[var12] = (this.field2373[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2757(var12);
            }
            if (var13 == 121) {
                this.method2758(var12);
            }
            if (var13 == 123) {
                this.method2768(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2373[var12];
                if (var15 == 16384) {
                    this.field2367[var12] = (var14 << 7) + (this.field2367[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2373[var12];
                if (var16 == 16384) {
                    this.field2367[var12] = (this.field2367[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2351[var12] = (var14 << 7) + (this.field2351[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2351[var12] = (this.field2351[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2365[var12] |= 0x4;
                } else {
                    this.method2762(var12);
                    this.field2365[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2830(var12, (var14 << 7) + (this.field2368[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2830(var12, (this.field2368[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2777(var17, this.field2359[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2756(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method2812(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2760();
            }
        }
    }

    @ObfuscatedName("eg.av(III)V")
    public void method2830(int arg0, int arg1) {
        this.field2368[arg0] = arg1;
        this.field2369[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("eg.ae(Ler;I)I")
    public int method2744(class145 arg0) {
        int var2 = (arg0.field2421 * arg0.field2415 >> 12) + arg0.field2427;
        int var3 = ((this.field2360[arg0.field2419] - 8192) * this.field2367[arg0.field2419] >> 12) + var2;
        class142 var4 = arg0.field2429;
        if (var4.field2388 > 0 && (var4.field2387 > 0 || this.field2361[arg0.field2419] > 0)) {
            int var5 = var4.field2387 << 2;
            int var6 = var4.field2386 << 1;
            if (arg0.field2428 < var6) {
                var5 = arg0.field2428 * var5 / var6;
            }
            int var7 = (this.field2361[arg0.field2419] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2418 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2414.field1227 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1094 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("eg.am(Ler;I)I")
    public int method2766(class145 arg0) {
        class142 var2 = arg0.field2429;
        int var3 = this.field2354[arg0.field2419] * this.field2356[arg0.field2419] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2422 * var4 + 16384 >> 15;
        int var6 = this.field2377 * var5 + 128 >> 8;
        if (var2.field2383 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2423 * 1.953125E-5D * (double) var2.field2383) + 0.5D);
        }
        if (var2.field2393 != null) {
            int var7 = arg0.field2424;
            int var8 = var2.field2393[arg0.field2425 + 1];
            if (arg0.field2425 < var2.field2393.length - 2) {
                int var9 = (var2.field2393[arg0.field2425] & 0xFF) << 8;
                int var10 = (var2.field2393[arg0.field2425 + 2] & 0xFF) << 8;
                var8 += (var2.field2393[arg0.field2425 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2426 > 0 && var2.field2382 != null) {
            int var11 = arg0.field2426;
            int var12 = var2.field2382[arg0.field2413 + 1];
            if (arg0.field2413 < var2.field2382.length - 2) {
                int var13 = (var2.field2382[arg0.field2413] & 0xFF) << 8;
                int var14 = (var2.field2382[arg0.field2413 + 2] & 0xFF) << 8;
                var12 += (var2.field2382[arg0.field2413 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("eg.aq(Ler;I)I")
    public int method2767(class145 arg0) {
        int var2 = this.field2355[arg0.field2419];
        return var2 < 8192 ? arg0.field2434 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2434) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("eg.h()Lad;")
    public synchronized class48 method977() {
        return this.field2358;
    }

    @ObfuscatedName("eg.q()Lad;")
    public synchronized class48 method978() {
        return null;
    }

    @ObfuscatedName("eg.g()I")
    public synchronized int method984() {
        return 0;
    }

    @ObfuscatedName("eg.e([III)V")
    public synchronized void method1066(int[] arg0, int arg1, int arg2) {
        if (this.field2372.method2861()) {
            int var4 = this.field2353 * this.field2372.field2404 / Statics.field1094;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2364;
                if (this.field2378 - var5 >= 0L) {
                    this.field2364 = var5;
                    break;
                }
                int var7 = (int) ((this.field2378 - this.field2364 + (long) var4 - 1L) / (long) var4);
                this.field2364 += (long) var4 * (long) var7;
                this.field2358.method1066(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2745();
            } while (this.field2372.method2861());
        }
        this.field2358.method1066(arg0, arg1, arg2);
    }

    @ObfuscatedName("eg.as(I)V")
    public synchronized void method981(int arg0) {
        if (this.field2372.method2861()) {
            int var2 = this.field2353 * this.field2372.field2404 / Statics.field1094;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2364;
                if (this.field2378 - var3 >= 0L) {
                    this.field2364 = var3;
                    break;
                }
                int var5 = (int) ((this.field2378 - this.field2364 + (long) var2 - 1L) / (long) var2);
                this.field2364 += (long) var2 * (long) var5;
                this.field2358.method981(var5);
                arg0 -= var5;
                this.method2745();
            } while (this.field2372.method2861());
        }
        this.field2358.method981(arg0);
    }

    @ObfuscatedName("eg.at(I)V")
    public void method2745() {
        int var1 = this.field2374;
        int var2 = this.field2370;
        long var3 = this.field2378;
        while (this.field2370 == var2) {
            while (this.field2372.field2402[var1] == var2) {
                this.field2372.method2863(var1);
                int var5 = this.field2372.method2880(var1);
                if (var5 == 1) {
                    this.field2372.method2902();
                    this.field2372.method2864(var1);
                    if (this.field2372.method2866()) {
                        if (!this.field2366 || var2 == 0) {
                            this.method2760();
                            this.field2372.method2860();
                            return;
                        }
                        this.field2372.method2877(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2778(var5);
                }
                this.field2372.method2879(var1);
                this.field2372.method2864(var1);
            }
            var1 = this.field2372.method2872();
            var2 = this.field2372.field2402[var1];
            var3 = this.field2372.method2870(var2);
        }
        this.field2374 = var1;
        this.field2370 = var2;
        this.field2378 = var3;
    }

    @ObfuscatedName("eg.ac(Ler;I)Z")
    public boolean method2771(class145 arg0) {
        if (arg0.field2430 != null) {
            return false;
        }
        if (arg0.field2426 >= 0) {
            arg0.method3395();
            if (arg0.field2416 > 0 && this.field2371[arg0.field2419][arg0.field2416] == arg0) {
                this.field2371[arg0.field2419][arg0.field2416] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("eg.al(Ler;[IIII)Z")
    public boolean method2818(class145 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2431 = Statics.field1094 / 100;
        if (arg0.field2426 >= 0 && arg0.field2430 == null || arg0.field2430.method975()) {
            arg0.method2905();
            arg0.method3395();
            if (arg0.field2416 > 0 && this.field2371[arg0.field2419][arg0.field2416] == arg0) {
                this.field2371[arg0.field2419][arg0.field2416] = null;
            }
            return true;
        }
        int var5 = arg0.field2415;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2363[arg0.field2419] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2415 = var6;
        }
        arg0.field2430.method973(this.method2744(arg0));
        class142 var7 = arg0.field2429;
        boolean var8 = false;
        arg0.field2428++;
        arg0.field2418 += var7.field2388;
        double var9 = (double) ((arg0.field2417 - 60 << 8) + (arg0.field2421 * arg0.field2415 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2383 > 0) {
            if (var7.field2391 > 0) {
                arg0.field2423 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2391 * var9) + 0.5D);
            } else {
                arg0.field2423 += 128;
            }
        }
        if (var7.field2393 != null) {
            if (var7.field2384 > 0) {
                arg0.field2424 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2384 * var9) + 0.5D);
            } else {
                arg0.field2424 += 128;
            }
            while (arg0.field2425 < var7.field2393.length - 2 && arg0.field2424 > (var7.field2393[arg0.field2425 + 2] & 0xFF) << 8) {
                arg0.field2425 += 2;
            }
            if (arg0.field2425 == var7.field2393.length - 2 && var7.field2393[arg0.field2425 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2426 >= 0 && var7.field2382 != null && (this.field2365[arg0.field2419] & 0x1) == 0 && (arg0.field2416 < 0 || this.field2371[arg0.field2419][arg0.field2416] != arg0)) {
            if (var7.field2385 > 0) {
                arg0.field2426 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2385 * var9) + 0.5D);
            } else {
                arg0.field2426 += 128;
            }
            while (arg0.field2413 < var7.field2382.length - 2 && arg0.field2426 > (var7.field2382[arg0.field2413 + 2] & 0xFF) << 8) {
                arg0.field2413 += 2;
            }
            if (arg0.field2413 == var7.field2382.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2430.method971(arg0.field2431, this.method2766(arg0), this.method2767(arg0));
            return false;
        }
        arg0.field2430.method972(arg0.field2431);
        if (arg1 == null) {
            arg0.field2430.method981(arg3);
        } else {
            arg0.field2430.method1066(arg1, arg2, arg3);
        }
        if (arg0.field2430.method976()) {
            this.field2358.field2397.method1109(arg0.field2430);
        }
        arg0.method2905();
        if (arg0.field2426 >= 0) {
            arg0.method3395();
            if (arg0.field2416 > 0 && this.field2371[arg0.field2419][arg0.field2416] == arg0) {
                this.field2371[arg0.field2419][arg0.field2416] = null;
            }
        }
        return true;
    }
}
