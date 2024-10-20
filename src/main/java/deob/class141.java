package deob;

@ObfuscatedName("eu")
public class class141 extends class48 {

    @ObfuscatedName("eu.a")
    public class175 field2355 = new class175(128);

    @ObfuscatedName("eu.r")
    public int field2348 = 256;

    @ObfuscatedName("eu.u")
    public int field2351 = 1000000;

    @ObfuscatedName("eu.t")
    public int[] field2350 = new int[16];

    @ObfuscatedName("eu.k")
    public int[] field2373 = new int[16];

    @ObfuscatedName("eu.x")
    public int[] field2356 = new int[16];

    @ObfuscatedName("eu.v")
    public int[] field2353 = new int[16];

    @ObfuscatedName("eu.g")
    public int[] field2358 = new int[16];

    @ObfuscatedName("eu.n")
    public int[] field2360 = new int[16];

    @ObfuscatedName("eu.q")
    public int[] field2354 = new int[16];

    @ObfuscatedName("eu.i")
    public int[] field2366 = new int[16];

    @ObfuscatedName("eu.p")
    public int[] field2357 = new int[16];

    @ObfuscatedName("eu.z")
    public int[] field2359 = new int[16];

    @ObfuscatedName("eu.h")
    public int[] field2372 = new int[16];

    @ObfuscatedName("eu.f")
    public int[] field2361 = new int[16];

    @ObfuscatedName("eu.w")
    public int[] field2362 = new int[16];

    @ObfuscatedName("eu.l")
    public int[] field2352 = new int[16];

    @ObfuscatedName("eu.d")
    public int[] field2364 = new int[16];

    @ObfuscatedName("eu.y")
    public class145[][] field2365 = new class145[16][128];

    @ObfuscatedName("eu.ah")
    public class145[][] field2371 = new class145[16][128];

    @ObfuscatedName("eu.ad")
    public class144 field2367 = new class144();

    @ObfuscatedName("eu.au")
    public boolean field2368;

    @ObfuscatedName("eu.as")
    public int field2369;

    @ObfuscatedName("eu.ag")
    public int field2370;

    @ObfuscatedName("eu.ab")
    public long field2349;

    @ObfuscatedName("eu.aq")
    public long field2363;

    @ObfuscatedName("eu.af")
    public class143 field2347 = new class143(this);

    public class141() {
        this.method2695();
    }

    @ObfuscatedName("eu.a(II)V")
    public synchronized void method2769(int arg0) {
        this.field2348 = arg0;
    }

    @ObfuscatedName("eu.r(I)I")
    public int method2721() {
        return this.field2348;
    }

    @ObfuscatedName("eu.t(Leq;Lev;Lbe;II)Z")
    public synchronized boolean method2733(class139 arg0, class152 arg1, class58 arg2, int arg3) {
        arg0.method2652();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class176 var7 = (class176) arg0.field2333.method3255(); var7 != null; var7 = (class176) arg0.field2333.method3256()) {
            int var8 = (int) var7.field2817;
            class140 var9 = (class140) this.field2355.method3252((long) var8);
            if (var9 == null) {
                var9 = class140.method1288(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2355.method3254(var9, (long) var8);
            }
            if (!var9.method2669(arg2, var7.field2810, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2653();
        }
        return var5;
    }

    @ObfuscatedName("eu.k(I)V")
    public synchronized void method2753() {
        for (class140 var1 = (class140) this.field2355.method3255(); var1 != null; var1 = (class140) this.field2355.method3256()) {
            var1.method2663();
        }
    }

    @ObfuscatedName("eu.x(I)V")
    public synchronized void method2679() {
        for (class140 var1 = (class140) this.field2355.method3255(); var1 != null; var1 = (class140) this.field2355.method3256()) {
            var1.method3311();
        }
    }

    @ObfuscatedName("eu.v(Leq;ZI)V")
    public synchronized void method2680(class139 arg0, boolean arg1) {
        this.method2681();
        this.field2367.method2824(arg0.field2334);
        this.field2368 = arg1;
        this.field2349 = 0L;
        int var3 = this.field2367.method2802();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2367.method2826(var4);
            this.field2367.method2806(var4);
            this.field2367.method2804(var4);
        }
        this.field2369 = this.field2367.method2810();
        this.field2370 = this.field2367.field2397[this.field2369];
        this.field2363 = this.field2367.method2809(this.field2370);
    }

    @ObfuscatedName("eu.g(I)V")
    public synchronized void method2681() {
        this.field2367.method2799();
        this.method2695();
    }

    @ObfuscatedName("eu.n(I)Z")
    public synchronized boolean method2682() {
        return this.field2367.method2801();
    }

    @ObfuscatedName("eu.q(III)V")
    public synchronized void method2683(int arg0, int arg1) {
        this.method2701(arg0, arg1);
    }

    @ObfuscatedName("eu.i(III)V")
    public void method2701(int arg0, int arg1) {
        this.field2353[arg0] = arg1;
        this.field2360[arg0] = arg1 & 0xFFFFFF80;
        this.method2685(arg0, arg1);
    }

    @ObfuscatedName("eu.p(IIS)V")
    public void method2685(int arg0, int arg1) {
        if (this.field2358[arg0] != arg1) {
            this.field2358[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2371[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("eu.e(IIIB)V")
    public void method2686(int arg0, int arg1, int arg2) {
        this.method2688(arg0, arg1, 64);
        if ((this.field2359[arg0] & 0x2) != 0) {
            for (class145 var4 = (class145) this.field2347.field2389.method3277(); var4 != null; var4 = (class145) this.field2347.field2389.method3297()) {
                if (var4.field2415 == arg0 && var4.field2432 < 0) {
                    this.field2365[arg0][var4.field2407] = null;
                    this.field2365[arg0][arg1] = var4;
                    int var5 = (var4.field2431 * var4.field2417 >> 12) + var4.field2419;
                    var4.field2419 += arg1 - var4.field2407 << 8;
                    var4.field2431 = var5 - var4.field2419;
                    var4.field2417 = 4096;
                    var4.field2407 = arg1;
                    return;
                }
            }
        }
        class140 var6 = (class140) this.field2355.method3252((long) this.field2358[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2336[arg1];
        if (var7 == null) {
            return;
        }
        class145 var8 = new class145();
        var8.field2415 = arg0;
        var8.field2416 = var6;
        var8.field2408 = var7;
        var8.field2410 = var6.field2340[arg1];
        var8.field2411 = var6.field2341[arg1];
        var8.field2407 = arg1;
        var8.field2413 = var6.field2339 * arg2 * arg2 * var6.field2338[arg1] + 1024 >> 11;
        var8.field2414 = var6.field2345[arg1] & 0xFF;
        var8.field2419 = (arg1 << 8) - (var6.field2335[arg1] & 0x7FFF);
        var8.field2418 = 0;
        var8.field2412 = 0;
        var8.field2420 = 0;
        var8.field2432 = -1;
        var8.field2421 = 0;
        if (this.field2362[arg0] == 0) {
            var8.field2425 = class45.method890(var7, this.method2699(var8), this.method2677(var8), this.method2713(var8));
        } else {
            var8.field2425 = class45.method890(var7, this.method2699(var8), 0, this.method2713(var8));
            this.method2784(var8, var6.field2335[arg1] < 0);
        }
        if (var6.field2335[arg1] < 0) {
            var8.field2425.method892(-1);
        }
        if (var8.field2411 >= 0) {
            class145 var9 = this.field2371[arg0][var8.field2411];
            if (var9 != null && var9.field2432 < 0) {
                this.field2365[arg0][var9.field2407] = null;
                var9.field2432 = 0;
            }
            this.field2371[arg0][var8.field2411] = var8;
        }
        this.field2347.field2389.method3271(var8);
        this.field2365[arg0][arg1] = var8;
    }

    @ObfuscatedName("eu.o(Let;ZI)V")
    public void method2784(class145 arg0, boolean arg1) {
        int var3 = arg0.field2408.field1219.length;
        int var5;
        if (arg1 && arg0.field2408.field1218) {
            int var4 = var3 + var3 - arg0.field2408.field1220;
            var5 = (int) ((long) this.field2362[arg0.field2415] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2425.method980(true);
            }
        } else {
            var5 = (int) ((long) this.field2362[arg0.field2415] * (long) var3 >> 6);
        }
        arg0.field2425.method898(var5);
    }

    @ObfuscatedName("eu.j(IIIB)V")
    public void method2688(int arg0, int arg1, int arg2) {
        class145 var4 = this.field2365[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2365[arg0][arg1] = null;
        if ((this.field2359[arg0] & 0x2) == 0) {
            var4.field2432 = 0;
            return;
        }
        for (class145 var5 = (class145) this.field2347.field2389.method3276(); var5 != null; var5 = (class145) this.field2347.field2389.method3278()) {
            if (var4.field2415 == var5.field2415 && var5.field2432 < 0 && var4 != var5) {
                var4.field2432 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("eu.s(IIII)V")
    public void method2689(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("eu.b(IIB)V")
    public void method2690(int arg0, int arg1) {
    }

    @ObfuscatedName("eu.c(IIB)V")
    public void method2709(int arg0, int arg1) {
        this.field2354[arg0] = arg1;
    }

    @ObfuscatedName("eu.m(II)V")
    public void method2692(int arg0) {
        for (class145 var2 = (class145) this.field2347.field2389.method3276(); var2 != null; var2 = (class145) this.field2347.field2389.method3278()) {
            if (arg0 < 0 || var2.field2415 == arg0) {
                if (var2.field2425 != null) {
                    var2.field2425.method903(Statics.field1080 / 100);
                    if (var2.field2425.method907()) {
                        this.field2347.field2390.method1030(var2.field2425);
                    }
                    var2.method2850();
                }
                if (var2.field2432 < 0) {
                    this.field2365[var2.field2415][var2.field2407] = null;
                }
                var2.method3311();
            }
        }
    }

    @ObfuscatedName("eu.z(II)V")
    public void method2693(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2693(var2);
            }
            return;
        }
        this.field2350[arg0] = 12800;
        this.field2373[arg0] = 8192;
        this.field2356[arg0] = 16383;
        this.field2354[arg0] = 8192;
        this.field2366[arg0] = 0;
        this.field2357[arg0] = 8192;
        this.method2746(arg0);
        this.method2696(arg0);
        this.field2359[arg0] = 0;
        this.field2372[arg0] = 32767;
        this.field2361[arg0] = 256;
        this.field2362[arg0] = 0;
        this.method2760(arg0, 8192);
    }

    @ObfuscatedName("eu.h(II)V")
    public void method2694(int arg0) {
        for (class145 var2 = (class145) this.field2347.field2389.method3276(); var2 != null; var2 = (class145) this.field2347.field2389.method3278()) {
            if ((arg0 < 0 || var2.field2415 == arg0) && var2.field2432 < 0) {
                this.field2365[var2.field2415][var2.field2407] = null;
                var2.field2432 = 0;
            }
        }
    }

    @ObfuscatedName("eu.f(I)V")
    public void method2695() {
        this.method2692(-1);
        this.method2693(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2358[var1] = this.field2353[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2360[var2] = this.field2353[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("eu.ad(II)V")
    public void method2746(int arg0) {
        if ((this.field2359[arg0] & 0x2) == 0) {
            return;
        }
        for (class145 var2 = (class145) this.field2347.field2389.method3276(); var2 != null; var2 = (class145) this.field2347.field2389.method3278()) {
            if (var2.field2415 == arg0 && this.field2365[arg0][var2.field2407] == null && var2.field2432 < 0) {
                var2.field2432 = 0;
            }
        }
    }

    @ObfuscatedName("eu.au(II)V")
    public void method2696(int arg0) {
        if ((this.field2359[arg0] & 0x4) == 0) {
            return;
        }
        for (class145 var2 = (class145) this.field2347.field2389.method3276(); var2 != null; var2 = (class145) this.field2347.field2389.method3278()) {
            if (var2.field2415 == arg0) {
                var2.field2428 = 0;
            }
        }
    }

    @ObfuscatedName("eu.as(IB)V")
    public void method2710(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2688(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2686(var6, var7, var8);
            } else {
                this.method2688(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2689(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2360[var12] = (var14 << 14) + (this.field2360[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2360[var12] = (var14 << 7) + (this.field2360[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2366[var12] = (var14 << 7) + (this.field2366[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2366[var12] = (this.field2366[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2357[var12] = (var14 << 7) + (this.field2357[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2357[var12] = (this.field2357[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2350[var12] = (var14 << 7) + (this.field2350[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2350[var12] = (this.field2350[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2373[var12] = (var14 << 7) + (this.field2373[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2373[var12] = (this.field2373[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2356[var12] = (var14 << 7) + (this.field2356[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2356[var12] = (this.field2356[var12] & 0xFFFFFF80) + var14;
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
                    this.method2746(var12);
                    this.field2359[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2372[var12] = (var14 << 7) + (this.field2372[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2372[var12] = (this.field2372[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2372[var12] = (var14 << 7) + (this.field2372[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2372[var12] = (this.field2372[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2692(var12);
            }
            if (var13 == 121) {
                this.method2693(var12);
            }
            if (var13 == 123) {
                this.method2694(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2372[var12];
                if (var15 == 16384) {
                    this.field2361[var12] = (var14 << 7) + (this.field2361[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2372[var12];
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
                    this.method2696(var12);
                    this.field2359[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2760(var12, (var14 << 7) + (this.field2352[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2760(var12, (this.field2352[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2685(var17, this.field2360[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2690(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method2709(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2695();
            }
        }
    }

    @ObfuscatedName("eu.ag(III)V")
    public void method2760(int arg0, int arg1) {
        this.field2352[arg0] = arg1;
        this.field2364[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("eu.ab(Let;I)I")
    public int method2699(class145 arg0) {
        int var2 = (arg0.field2431 * arg0.field2417 >> 12) + arg0.field2419;
        int var3 = ((this.field2354[arg0.field2415] - 8192) * this.field2361[arg0.field2415] >> 12) + var2;
        class142 var4 = arg0.field2410;
        if (var4.field2379 > 0 && (var4.field2384 > 0 || this.field2366[arg0.field2415] > 0)) {
            int var5 = var4.field2384 << 2;
            int var6 = var4.field2385 << 1;
            if (arg0.field2423 < var6) {
                var5 = arg0.field2423 * var5 / var6;
            }
            int var7 = (this.field2366[arg0.field2415] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2424 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2408.field1222 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1080 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("eu.aq(Let;I)I")
    public int method2677(class145 arg0) {
        class142 var2 = arg0.field2410;
        int var3 = this.field2350[arg0.field2415] * this.field2356[arg0.field2415] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2413 * var4 + 16384 >> 15;
        int var6 = this.field2348 * var5 + 128 >> 8;
        if (var2.field2377 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2418 * 1.953125E-5D * (double) var2.field2377) + 0.5D);
        }
        if (var2.field2380 != null) {
            int var7 = arg0.field2412;
            int var8 = var2.field2380[arg0.field2420 + 1];
            if (arg0.field2420 < var2.field2380.length - 2) {
                int var9 = (var2.field2380[arg0.field2420] & 0xFF) << 8;
                int var10 = (var2.field2380[arg0.field2420 + 2] & 0xFF) << 8;
                var8 += (var2.field2380[arg0.field2420 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2432 > 0 && var2.field2378 != null) {
            int var11 = arg0.field2432;
            int var12 = var2.field2378[arg0.field2421 + 1];
            if (arg0.field2421 < var2.field2378.length - 2) {
                int var13 = (var2.field2378[arg0.field2421] & 0xFF) << 8;
                int var14 = (var2.field2378[arg0.field2421 + 2] & 0xFF) << 8;
                var12 += (var2.field2378[arg0.field2421 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("eu.af(Let;B)I")
    public int method2713(class145 arg0) {
        int var2 = this.field2373[arg0.field2415];
        return var2 < 8192 ? arg0.field2414 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2414) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("eu.w()Lam;")
    public synchronized class48 method908() {
        return this.field2347;
    }

    @ObfuscatedName("eu.l()Lam;")
    public synchronized class48 method1015() {
        return null;
    }

    @ObfuscatedName("eu.d()I")
    public synchronized int method945() {
        return 0;
    }

    @ObfuscatedName("eu.y([III)V")
    public synchronized void method955(int[] arg0, int arg1, int arg2) {
        if (this.field2367.method2801()) {
            int var4 = this.field2351 * this.field2367.field2394 / Statics.field1080;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2349;
                if (this.field2363 - var5 >= 0L) {
                    this.field2349 = var5;
                    break;
                }
                int var7 = (int) ((this.field2363 - this.field2349 + (long) var4 - 1L) / (long) var4);
                this.field2349 += (long) var4 * (long) var7;
                this.field2347.method955(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2703();
            } while (this.field2367.method2801());
        }
        this.field2347.method955(arg0, arg1, arg2);
    }

    @ObfuscatedName("eu.ah(I)V")
    public synchronized void method912(int arg0) {
        if (this.field2367.method2801()) {
            int var2 = this.field2351 * this.field2367.field2394 / Statics.field1080;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2349;
                if (this.field2363 - var3 >= 0L) {
                    this.field2349 = var3;
                    break;
                }
                int var5 = (int) ((this.field2363 - this.field2349 + (long) var2 - 1L) / (long) var2);
                this.field2349 += (long) var2 * (long) var5;
                this.field2347.method912(var5);
                arg0 -= var5;
                this.method2703();
            } while (this.field2367.method2801());
        }
        this.field2347.method912(arg0);
    }

    @ObfuscatedName("eu.ay(I)V")
    public void method2703() {
        int var1 = this.field2369;
        int var2 = this.field2370;
        long var3 = this.field2363;
        while (this.field2370 == var2) {
            while (this.field2367.field2397[var1] == var2) {
                this.field2367.method2826(var1);
                int var5 = this.field2367.method2812(var1);
                if (var5 == 1) {
                    this.field2367.method2800();
                    this.field2367.method2804(var1);
                    if (this.field2367.method2803()) {
                        if (!this.field2368 || var2 == 0) {
                            this.method2695();
                            this.field2367.method2799();
                            return;
                        }
                        this.field2367.method2805(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2710(var5);
                }
                this.field2367.method2806(var1);
                this.field2367.method2804(var1);
            }
            var1 = this.field2367.method2810();
            var2 = this.field2367.field2397[var1];
            var3 = this.field2367.method2809(var2);
        }
        this.field2369 = var1;
        this.field2370 = var2;
        this.field2363 = var3;
    }

    @ObfuscatedName("eu.ax(Let;I)Z")
    public boolean method2704(class145 arg0) {
        if (arg0.field2425 != null) {
            return false;
        }
        if (arg0.field2432 >= 0) {
            arg0.method3311();
            if (arg0.field2411 > 0 && this.field2371[arg0.field2415][arg0.field2411] == arg0) {
                this.field2371[arg0.field2415][arg0.field2411] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("eu.aa(Let;[IIIB)Z")
    public boolean method2705(class145 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2426 = Statics.field1080 / 100;
        if (arg0.field2432 >= 0 && arg0.field2425 == null || arg0.field2425.method901()) {
            arg0.method2850();
            arg0.method3311();
            if (arg0.field2411 > 0 && this.field2371[arg0.field2415][arg0.field2411] == arg0) {
                this.field2371[arg0.field2415][arg0.field2411] = null;
            }
            return true;
        }
        int var5 = arg0.field2417;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2357[arg0.field2415] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2417 = var6;
        }
        arg0.field2425.method927(this.method2699(arg0));
        class142 var7 = arg0.field2410;
        boolean var8 = false;
        arg0.field2423++;
        arg0.field2424 += var7.field2379;
        double var9 = (double) ((arg0.field2407 - 60 << 8) + (arg0.field2431 * arg0.field2417 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2377 > 0) {
            if (var7.field2382 > 0) {
                arg0.field2418 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2382 * var9) + 0.5D);
            } else {
                arg0.field2418 += 128;
            }
        }
        if (var7.field2380 != null) {
            if (var7.field2386 > 0) {
                arg0.field2412 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2386 * var9) + 0.5D);
            } else {
                arg0.field2412 += 128;
            }
            while (arg0.field2420 < var7.field2380.length - 2 && arg0.field2412 > (var7.field2380[arg0.field2420 + 2] & 0xFF) << 8) {
                arg0.field2420 += 2;
            }
            if (arg0.field2420 == var7.field2380.length - 2 && var7.field2380[arg0.field2420 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2432 >= 0 && var7.field2378 != null && (this.field2359[arg0.field2415] & 0x1) == 0 && (arg0.field2411 < 0 || this.field2371[arg0.field2415][arg0.field2411] != arg0)) {
            if (var7.field2381 > 0) {
                arg0.field2432 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2381 * var9) + 0.5D);
            } else {
                arg0.field2432 += 128;
            }
            while (arg0.field2421 < var7.field2378.length - 2 && arg0.field2432 > (var7.field2378[arg0.field2421 + 2] & 0xFF) << 8) {
                arg0.field2421 += 2;
            }
            if (arg0.field2421 == var7.field2378.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2425.method989(arg0.field2426, this.method2677(arg0), this.method2713(arg0));
            return false;
        }
        arg0.field2425.method903(arg0.field2426);
        if (arg1 == null) {
            arg0.field2425.method912(arg3);
        } else {
            arg0.field2425.method955(arg1, arg2, arg3);
        }
        if (arg0.field2425.method907()) {
            this.field2347.field2390.method1030(arg0.field2425);
        }
        arg0.method2850();
        if (arg0.field2432 >= 0) {
            arg0.method3311();
            if (arg0.field2411 > 0 && this.field2371[arg0.field2415][arg0.field2411] == arg0) {
                this.field2371[arg0.field2415][arg0.field2411] = null;
            }
        }
        return true;
    }
}
