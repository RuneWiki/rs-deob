package deob;

@ObfuscatedName("eg")
public class class141 extends class48 {

    @ObfuscatedName("eg.j")
    public class175 field2367 = new class175(128);

    @ObfuscatedName("eg.r")
    public int field2346 = 256;

    @ObfuscatedName("eg.v")
    public int field2347 = 1000000;

    @ObfuscatedName("eg.p")
    public int[] field2348 = new int[16];

    @ObfuscatedName("eg.e")
    public int[] field2349 = new int[16];

    @ObfuscatedName("eg.d")
    public int[] field2350 = new int[16];

    @ObfuscatedName("eg.y")
    public int[] field2351 = new int[16];

    @ObfuscatedName("eg.x")
    public int[] field2352 = new int[16];

    @ObfuscatedName("eg.t")
    public int[] field2345 = new int[16];

    @ObfuscatedName("eg.i")
    public int[] field2354 = new int[16];

    @ObfuscatedName("eg.z")
    public int[] field2355 = new int[16];

    @ObfuscatedName("eg.o")
    public int[] field2364 = new int[16];

    @ObfuscatedName("eg.l")
    public int[] field2359 = new int[16];

    @ObfuscatedName("eg.m")
    public int[] field2369 = new int[16];

    @ObfuscatedName("eg.b")
    public int[] field2361 = new int[16];

    @ObfuscatedName("eg.h")
    public int[] field2362 = new int[16];

    @ObfuscatedName("eg.n")
    public int[] field2353 = new int[16];

    @ObfuscatedName("eg.s")
    public int[] field2363 = new int[16];

    @ObfuscatedName("eg.c")
    public class145[][] field2365 = new class145[16][128];

    @ObfuscatedName("eg.am")
    public class145[][] field2366 = new class145[16][128];

    @ObfuscatedName("eg.ap")
    public class144 field2370 = new class144();

    @ObfuscatedName("eg.au")
    public boolean field2368;

    @ObfuscatedName("eg.ab")
    public int field2358;

    @ObfuscatedName("eg.ae")
    public int field2360;

    @ObfuscatedName("eg.as")
    public long field2371;

    @ObfuscatedName("eg.av")
    public long field2372;

    @ObfuscatedName("eg.ar")
    public class143 field2373 = new class143(this);

    public class141() {
        this.method2740();
    }

    @ObfuscatedName("eg.j(II)V")
    public synchronized void method2748(int arg0) {
        this.field2346 = arg0;
    }

    @ObfuscatedName("eg.r(I)I")
    public int method2721() {
        return this.field2346;
    }

    @ObfuscatedName("eg.p(Ley;Lez;Lbe;II)Z")
    public synchronized boolean method2722(class139 arg0, class152 arg1, class58 arg2, int arg3) {
        arg0.method2702();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class176 var7 = (class176) arg0.field2334.method3316(); var7 != null; var7 = (class176) arg0.field2334.method3306()) {
            int var8 = (int) var7.field2809;
            class140 var9 = (class140) this.field2367.method3302((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method2964(var8);
                class140 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class140(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2367.method3318(var11, (long) var8);
            }
            if (!var9.method2714(arg2, var7.field2803, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2704();
        }
        return var5;
    }

    @ObfuscatedName("eg.e(I)V")
    public synchronized void method2778() {
        for (class140 var1 = (class140) this.field2367.method3316(); var1 != null; var1 = (class140) this.field2367.method3306()) {
            var1.method2715();
        }
    }

    @ObfuscatedName("eg.d(S)V")
    public synchronized void method2807() {
        for (class140 var1 = (class140) this.field2367.method3316(); var1 != null; var1 = (class140) this.field2367.method3306()) {
            var1.method3359();
        }
    }

    @ObfuscatedName("eg.y(Ley;ZB)V")
    public synchronized void method2725(class139 arg0, boolean arg1) {
        this.method2726();
        this.field2370.method2834(arg0.field2335);
        this.field2368 = arg1;
        this.field2371 = 0L;
        int var3 = this.field2370.method2837();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2370.method2838(var4);
            this.field2370.method2846(var4);
            this.field2370.method2839(var4);
        }
        this.field2358 = this.field2370.method2852();
        this.field2360 = this.field2370.field2393[this.field2358];
        this.field2372 = this.field2370.method2845(this.field2360);
    }

    @ObfuscatedName("eg.x(B)V")
    public synchronized void method2726() {
        this.field2370.method2835();
        this.method2740();
    }

    @ObfuscatedName("eg.t(B)Z")
    public synchronized boolean method2727() {
        return this.field2370.method2853();
    }

    @ObfuscatedName("eg.i(IIS)V")
    public synchronized void method2728(int arg0, int arg1) {
        this.method2729(arg0, arg1);
    }

    @ObfuscatedName("eg.z(III)V")
    public void method2729(int arg0, int arg1) {
        this.field2351[arg0] = arg1;
        this.field2345[arg0] = arg1 & 0xFFFFFF80;
        this.method2730(arg0, arg1);
    }

    @ObfuscatedName("eg.o(III)V")
    public void method2730(int arg0, int arg1) {
        if (this.field2352[arg0] != arg1) {
            this.field2352[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2366[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("eg.u(IIIB)V")
    public void method2731(int arg0, int arg1, int arg2) {
        this.method2733(arg0, arg1, 64);
        if ((this.field2359[arg0] & 0x2) != 0) {
            for (class145 var4 = (class145) this.field2373.field2384.method3335(); var4 != null; var4 = (class145) this.field2373.field2384.method3334()) {
                if (var4.field2415 == arg0 && var4.field2404 < 0) {
                    this.field2365[arg0][var4.field2408] = null;
                    this.field2365[arg0][arg1] = var4;
                    int var5 = (var4.field2426 * var4.field2413 >> 12) + var4.field2417;
                    var4.field2417 += arg1 - var4.field2408 << 8;
                    var4.field2426 = var5 - var4.field2417;
                    var4.field2413 = 4096;
                    var4.field2408 = arg1;
                    return;
                }
            }
        }
        class140 var6 = (class140) this.field2367.method3302((long) this.field2352[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2337[arg1];
        if (var7 == null) {
            return;
        }
        class145 var8 = new class145();
        var8.field2415 = arg0;
        var8.field2405 = var6;
        var8.field2410 = var7;
        var8.field2403 = var6.field2341[arg1];
        var8.field2407 = var6.field2343[arg1];
        var8.field2408 = arg1;
        var8.field2409 = var6.field2338 * arg2 * arg2 * var6.field2339[arg1] + 1024 >> 11;
        var8.field2428 = var6.field2336[arg1] & 0xFF;
        var8.field2417 = (arg1 << 8) - (var6.field2342[arg1] & 0x7FFF);
        var8.field2414 = 0;
        var8.field2423 = 0;
        var8.field2416 = 0;
        var8.field2404 = -1;
        var8.field2418 = 0;
        if (this.field2362[arg0] == 0) {
            var8.field2421 = class45.method1008(var7, this.method2770(var8), this.method2803(var8), this.method2723(var8));
        } else {
            var8.field2421 = class45.method1008(var7, this.method2770(var8), 0, this.method2723(var8));
            this.method2732(var8, var6.field2342[arg1] < 0);
        }
        if (var6.field2342[arg1] < 0) {
            var8.field2421.method967(-1);
        }
        if (var8.field2407 >= 0) {
            class145 var9 = this.field2366[arg0][var8.field2407];
            if (var9 != null && var9.field2404 < 0) {
                this.field2365[arg0][var9.field2408] = null;
                var9.field2404 = 0;
            }
            this.field2366[arg0][var8.field2407] = var8;
        }
        this.field2373.field2384.method3328(var8);
        this.field2365[arg0][arg1] = var8;
    }

    @ObfuscatedName("eg.f(Let;ZI)V")
    public void method2732(class145 arg0, boolean arg1) {
        int var3 = arg0.field2410.field1234.length;
        int var5;
        if (arg1 && arg0.field2410.field1238) {
            int var4 = var3 + var3 - arg0.field2410.field1236;
            var5 = (int) ((long) this.field2362[arg0.field2415] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2421.method977(true);
            }
        } else {
            var5 = (int) ((long) this.field2362[arg0.field2415] * (long) var3 >> 6);
        }
        arg0.field2421.method952(var5);
    }

    @ObfuscatedName("eg.k(IIIS)V")
    public void method2733(int arg0, int arg1, int arg2) {
        class145 var4 = this.field2365[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2365[arg0][arg1] = null;
        if ((this.field2359[arg0] & 0x2) == 0) {
            var4.field2404 = 0;
            return;
        }
        for (class145 var5 = (class145) this.field2373.field2384.method3326(); var5 != null; var5 = (class145) this.field2373.field2384.method3347()) {
            if (var4.field2415 == var5.field2415 && var5.field2404 < 0 && var4 != var5) {
                var4.field2404 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("eg.q(IIII)V")
    public void method2734(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("eg.a(IIB)V")
    public void method2735(int arg0, int arg1) {
    }

    @ObfuscatedName("eg.w(III)V")
    public void method2754(int arg0, int arg1) {
        this.field2354[arg0] = arg1;
    }

    @ObfuscatedName("eg.g(II)V")
    public void method2737(int arg0) {
        for (class145 var2 = (class145) this.field2373.field2384.method3326(); var2 != null; var2 = (class145) this.field2373.field2384.method3347()) {
            if (arg0 < 0 || var2.field2415 == arg0) {
                if (var2.field2421 != null) {
                    var2.field2421.method957(Statics.field1205 / 100);
                    if (var2.field2421.method961()) {
                        this.field2373.field2385.method1123(var2.field2421);
                    }
                    var2.method2885();
                }
                if (var2.field2404 < 0) {
                    this.field2365[var2.field2415][var2.field2408] = null;
                }
                var2.method3359();
            }
        }
    }

    @ObfuscatedName("eg.l(II)V")
    public void method2738(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2738(var2);
            }
            return;
        }
        this.field2348[arg0] = 12800;
        this.field2349[arg0] = 8192;
        this.field2350[arg0] = 16383;
        this.field2354[arg0] = 8192;
        this.field2355[arg0] = 0;
        this.field2364[arg0] = 8192;
        this.method2741(arg0);
        this.method2747(arg0);
        this.field2359[arg0] = 0;
        this.field2369[arg0] = 32767;
        this.field2361[arg0] = 256;
        this.field2362[arg0] = 0;
        this.method2744(arg0, 8192);
    }

    @ObfuscatedName("eg.m(II)V")
    public void method2739(int arg0) {
        for (class145 var2 = (class145) this.field2373.field2384.method3326(); var2 != null; var2 = (class145) this.field2373.field2384.method3347()) {
            if ((arg0 < 0 || var2.field2415 == arg0) && var2.field2404 < 0) {
                this.field2365[var2.field2415][var2.field2408] = null;
                var2.field2404 = 0;
            }
        }
    }

    @ObfuscatedName("eg.b(B)V")
    public void method2740() {
        this.method2737(-1);
        this.method2738(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2352[var1] = this.field2351[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2345[var2] = this.field2351[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("eg.ap(IB)V")
    public void method2741(int arg0) {
        if ((this.field2359[arg0] & 0x2) == 0) {
            return;
        }
        for (class145 var2 = (class145) this.field2373.field2384.method3326(); var2 != null; var2 = (class145) this.field2373.field2384.method3347()) {
            if (var2.field2415 == arg0 && this.field2365[arg0][var2.field2408] == null && var2.field2404 < 0) {
                var2.field2404 = 0;
            }
        }
    }

    @ObfuscatedName("eg.au(II)V")
    public void method2747(int arg0) {
        if ((this.field2359[arg0] & 0x4) == 0) {
            return;
        }
        for (class145 var2 = (class145) this.field2373.field2384.method3326(); var2 != null; var2 = (class145) this.field2373.field2384.method3347()) {
            if (var2.field2415 == arg0) {
                var2.field2406 = 0;
            }
        }
    }

    @ObfuscatedName("eg.ab(IB)V")
    public void method2760(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2733(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2731(var6, var7, var8);
            } else {
                this.method2733(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2734(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2345[var12] = (var14 << 14) + (this.field2345[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2345[var12] = (var14 << 7) + (this.field2345[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2355[var12] = (var14 << 7) + (this.field2355[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2355[var12] = (this.field2355[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2364[var12] = (var14 << 7) + (this.field2364[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2364[var12] = (this.field2364[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2348[var12] = (var14 << 7) + (this.field2348[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2348[var12] = (this.field2348[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2349[var12] = (var14 << 7) + (this.field2349[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2349[var12] = (this.field2349[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2350[var12] = (var14 << 7) + (this.field2350[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2350[var12] = (this.field2350[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2359[var12] |= 0x1;
                } else {
                    this.field2359[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2359[var12] |= 0x2;
                } else {
                    this.method2741(var12);
                    this.field2359[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2369[var12] = (var14 << 7) + (this.field2369[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2369[var12] = (this.field2369[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2369[var12] = (var14 << 7) + (this.field2369[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2369[var12] = (this.field2369[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2737(var12);
            }
            if (var13 == 121) {
                this.method2738(var12);
            }
            if (var13 == 123) {
                this.method2739(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2369[var12];
                if (var15 == 16384) {
                    this.field2361[var12] = (var14 << 7) + (this.field2361[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2369[var12];
                if (var16 == 16384) {
                    this.field2361[var12] = (this.field2361[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2362[var12] = (var14 << 7) + (this.field2362[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2362[var12] = (this.field2362[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2359[var12] |= 0x4;
                } else {
                    this.method2747(var12);
                    this.field2359[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2744(var12, (var14 << 7) + (this.field2353[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2744(var12, (this.field2353[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2730(var17, this.field2345[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2735(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method2754(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2740();
            }
        }
    }

    @ObfuscatedName("eg.ae(III)V")
    public void method2744(int arg0, int arg1) {
        this.field2353[arg0] = arg1;
        this.field2363[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("eg.as(Let;B)I")
    public int method2770(class145 arg0) {
        int var2 = (arg0.field2426 * arg0.field2413 >> 12) + arg0.field2417;
        int var3 = ((this.field2354[arg0.field2415] - 8192) * this.field2361[arg0.field2415] >> 12) + var2;
        class142 var4 = arg0.field2403;
        if (var4.field2381 > 0 && (var4.field2380 > 0 || this.field2355[arg0.field2415] > 0)) {
            int var5 = var4.field2380 << 2;
            int var6 = var4.field2382 << 1;
            if (arg0.field2419 < var6) {
                var5 = arg0.field2419 * var5 / var6;
            }
            int var7 = (this.field2355[arg0.field2415] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2420 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2410.field1235 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1205 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("eg.av(Let;B)I")
    public int method2803(class145 arg0) {
        class142 var2 = arg0.field2403;
        int var3 = this.field2350[arg0.field2415] * this.field2348[arg0.field2415] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2409 * var4 + 16384 >> 15;
        int var6 = this.field2346 * var5 + 128 >> 8;
        if (var2.field2376 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2414 * 1.953125E-5D * (double) var2.field2376) + 0.5D);
        }
        if (var2.field2383 != null) {
            int var7 = arg0.field2423;
            int var8 = var2.field2383[arg0.field2416 + 1];
            if (arg0.field2416 < var2.field2383.length - 2) {
                int var9 = (var2.field2383[arg0.field2416] & 0xFF) << 8;
                int var10 = (var2.field2383[arg0.field2416 + 2] & 0xFF) << 8;
                var8 += (var2.field2383[arg0.field2416 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2404 > 0 && var2.field2377 != null) {
            int var11 = arg0.field2404;
            int var12 = var2.field2377[arg0.field2418 + 1];
            if (arg0.field2418 < var2.field2377.length - 2) {
                int var13 = (var2.field2377[arg0.field2418] & 0xFF) << 8;
                int var14 = (var2.field2377[arg0.field2418 + 2] & 0xFF) << 8;
                var12 += (var2.field2377[arg0.field2418 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("eg.ar(Let;I)I")
    public int method2723(class145 arg0) {
        int var2 = this.field2349[arg0.field2415];
        return var2 < 8192 ? arg0.field2428 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2428) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("eg.h()Law;")
    public synchronized class48 method962() {
        return this.field2373;
    }

    @ObfuscatedName("eg.n()Law;")
    public synchronized class48 method963() {
        return null;
    }

    @ObfuscatedName("eg.s()I")
    public synchronized int method1080() {
        return 0;
    }

    @ObfuscatedName("eg.c([III)V")
    public synchronized void method965(int[] arg0, int arg1, int arg2) {
        if (this.field2370.method2853()) {
            int var4 = this.field2347 * this.field2370.field2390 / Statics.field1205;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2371;
                if (this.field2372 - var5 >= 0L) {
                    this.field2371 = var5;
                    break;
                }
                int var7 = (int) ((this.field2372 - this.field2371 + (long) var4 - 1L) / (long) var4);
                this.field2371 += (long) var4 * (long) var7;
                this.field2373.method965(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2749();
            } while (this.field2370.method2853());
        }
        this.field2373.method965(arg0, arg1, arg2);
    }

    @ObfuscatedName("eg.am(I)V")
    public synchronized void method966(int arg0) {
        if (this.field2370.method2853()) {
            int var2 = this.field2347 * this.field2370.field2390 / Statics.field1205;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2371;
                if (this.field2372 - var3 >= 0L) {
                    this.field2371 = var3;
                    break;
                }
                int var5 = (int) ((this.field2372 - this.field2371 + (long) var2 - 1L) / (long) var2);
                this.field2371 += (long) var2 * (long) var5;
                this.field2373.method966(var5);
                arg0 -= var5;
                this.method2749();
            } while (this.field2370.method2853());
        }
        this.field2373.method966(arg0);
    }

    @ObfuscatedName("eg.ad(I)V")
    public void method2749() {
        int var1 = this.field2358;
        int var2 = this.field2360;
        long var3 = this.field2372;
        while (this.field2360 == var2) {
            while (this.field2370.field2393[var1] == var2) {
                this.field2370.method2838(var1);
                int var5 = this.field2370.method2844(var1);
                if (var5 == 1) {
                    this.field2370.method2840();
                    this.field2370.method2839(var1);
                    if (this.field2370.method2847()) {
                        if (!this.field2368 || var2 == 0) {
                            this.method2740();
                            this.field2370.method2835();
                            return;
                        }
                        this.field2370.method2848(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2760(var5);
                }
                this.field2370.method2846(var1);
                this.field2370.method2839(var1);
            }
            var1 = this.field2370.method2852();
            var2 = this.field2370.field2393[var1];
            var3 = this.field2370.method2845(var2);
        }
        this.field2358 = var1;
        this.field2360 = var2;
        this.field2372 = var3;
    }

    @ObfuscatedName("eg.ac(Let;I)Z")
    public boolean method2783(class145 arg0) {
        if (arg0.field2421 != null) {
            return false;
        }
        if (arg0.field2404 >= 0) {
            arg0.method3359();
            if (arg0.field2407 > 0 && this.field2366[arg0.field2415][arg0.field2407] == arg0) {
                this.field2366[arg0.field2415][arg0.field2407] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("eg.ax(Let;[IIII)Z")
    public boolean method2751(class145 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2422 = Statics.field1205 / 100;
        if (arg0.field2404 >= 0 && arg0.field2421 == null || arg0.field2421.method960()) {
            arg0.method2885();
            arg0.method3359();
            if (arg0.field2407 > 0 && this.field2366[arg0.field2415][arg0.field2407] == arg0) {
                this.field2366[arg0.field2415][arg0.field2407] = null;
            }
            return true;
        }
        int var5 = arg0.field2413;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2364[arg0.field2415] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2413 = var6;
        }
        arg0.field2421.method958(this.method2770(arg0));
        class142 var7 = arg0.field2403;
        boolean var8 = false;
        arg0.field2419++;
        arg0.field2420 += var7.field2381;
        double var9 = (double) ((arg0.field2408 - 60 << 8) + (arg0.field2426 * arg0.field2413 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2376 > 0) {
            if (var7.field2379 > 0) {
                arg0.field2414 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2379 * var9) + 0.5D);
            } else {
                arg0.field2414 += 128;
            }
        }
        if (var7.field2383 != null) {
            if (var7.field2374 > 0) {
                arg0.field2423 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2374 * var9) + 0.5D);
            } else {
                arg0.field2423 += 128;
            }
            while (arg0.field2416 < var7.field2383.length - 2 && arg0.field2423 > (var7.field2383[arg0.field2416 + 2] & 0xFF) << 8) {
                arg0.field2416 += 2;
            }
            if (arg0.field2416 == var7.field2383.length - 2 && var7.field2383[arg0.field2416 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2404 >= 0 && var7.field2377 != null && (this.field2359[arg0.field2415] & 0x1) == 0 && (arg0.field2407 < 0 || this.field2366[arg0.field2415][arg0.field2407] != arg0)) {
            if (var7.field2378 > 0) {
                arg0.field2404 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2378 * var9) + 0.5D);
            } else {
                arg0.field2404 += 128;
            }
            while (arg0.field2418 < var7.field2377.length - 2 && arg0.field2404 > (var7.field2377[arg0.field2418 + 2] & 0xFF) << 8) {
                arg0.field2418 += 2;
            }
            if (arg0.field2418 == var7.field2377.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2421.method978(arg0.field2422, this.method2803(arg0), this.method2723(arg0));
            return false;
        }
        arg0.field2421.method957(arg0.field2422);
        if (arg1 == null) {
            arg0.field2421.method966(arg3);
        } else {
            arg0.field2421.method965(arg1, arg2, arg3);
        }
        if (arg0.field2421.method961()) {
            this.field2373.field2385.method1123(arg0.field2421);
        }
        arg0.method2885();
        if (arg0.field2404 >= 0) {
            arg0.method3359();
            if (arg0.field2407 > 0 && this.field2366[arg0.field2415][arg0.field2407] == arg0) {
                this.field2366[arg0.field2415][arg0.field2407] = null;
            }
        }
        return true;
    }
}
