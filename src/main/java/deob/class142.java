package deob;

@ObfuscatedName("em")
public class class142 extends class48 {

    @ObfuscatedName("em.p")
    public class175 field2392 = new class175(128);

    @ObfuscatedName("em.l")
    public int field2377 = 256;

    @ObfuscatedName("em.d")
    public int field2401 = 1000000;

    @ObfuscatedName("em.x")
    public int[] field2379 = new int[16];

    @ObfuscatedName("em.o")
    public int[] field2380 = new int[16];

    @ObfuscatedName("em.a")
    public int[] field2376 = new int[16];

    @ObfuscatedName("em.i")
    public int[] field2403 = new int[16];

    @ObfuscatedName("em.y")
    public int[] field2383 = new int[16];

    @ObfuscatedName("em.m")
    public int[] field2384 = new int[16];

    @ObfuscatedName("em.u")
    public int[] field2385 = new int[16];

    @ObfuscatedName("em.s")
    public int[] field2386 = new int[16];

    @ObfuscatedName("em.e")
    public int[] field2387 = new int[16];

    @ObfuscatedName("em.k")
    public int[] field2400 = new int[16];

    @ObfuscatedName("em.t")
    public int[] field2390 = new int[16];

    @ObfuscatedName("em.f")
    public int[] field2391 = new int[16];

    @ObfuscatedName("em.h")
    public int[] field2395 = new int[16];

    @ObfuscatedName("em.j")
    public int[] field2393 = new int[16];

    @ObfuscatedName("em.q")
    public int[] field2381 = new int[16];

    @ObfuscatedName("em.z")
    public class146[][] field2389 = new class146[16][128];

    @ObfuscatedName("em.af")
    public class146[][] field2396 = new class146[16][128];

    @ObfuscatedName("em.ap")
    public class145 field2397 = new class145();

    @ObfuscatedName("em.ah")
    public boolean field2382;

    @ObfuscatedName("em.at")
    public int field2399;

    @ObfuscatedName("em.aa")
    public int field2398;

    @ObfuscatedName("em.ae")
    public long field2394;

    @ObfuscatedName("em.aw")
    public long field2402;

    @ObfuscatedName("em.ar")
    public class144 field2378 = new class144(this);

    public class142() {
        this.method2827();
    }

    @ObfuscatedName("em.p(IB)V")
    public synchronized void method2808(int arg0) {
        this.field2377 = arg0;
    }

    @ObfuscatedName("em.l(I)I")
    public int method2862() {
        return this.field2377;
    }

    @ObfuscatedName("em.x(Leq;Leh;Lbd;II)Z")
    public synchronized boolean method2810(class140 arg0, class153 arg1, class58 arg2, int arg3) {
        arg0.method2795();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class176 var7 = (class176) arg0.field2364.method3408(); var7 != null; var7 = (class176) arg0.field2364.method3415()) {
            int var8 = (int) var7.field2821;
            class141 var9 = (class141) this.field2392.method3405((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3083(var8);
                class141 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class141(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2392.method3406(var11, (long) var8);
            }
            if (!var9.method2804(arg2, var7.field2814, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2791();
        }
        return var5;
    }

    @ObfuscatedName("em.o(I)V")
    public synchronized void method2811() {
        for (class141 var1 = (class141) this.field2392.method3408(); var1 != null; var1 = (class141) this.field2392.method3415()) {
            var1.method2801();
        }
    }

    @ObfuscatedName("em.a(B)V")
    public synchronized void method2812() {
        for (class141 var1 = (class141) this.field2392.method3408(); var1 != null; var1 = (class141) this.field2392.method3415()) {
            var1.method3455();
        }
    }

    @ObfuscatedName("em.w(Leq;ZB)V")
    public synchronized void method2813(class140 arg0, boolean arg1) {
        this.method2925();
        this.field2397.method2945(arg0.field2363);
        this.field2382 = arg1;
        this.field2394 = 0L;
        int var3 = this.field2397.method2939();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2397.method2981(var4);
            this.field2397.method2946(var4);
            this.field2397.method2970(var4);
        }
        this.field2399 = this.field2397.method2951();
        this.field2398 = this.field2397.field2430[this.field2399];
        this.field2402 = this.field2397.method2950(this.field2398);
    }

    @ObfuscatedName("em.i(I)V")
    public synchronized void method2925() {
        this.field2397.method2940();
        this.method2827();
    }

    @ObfuscatedName("em.y(I)Z")
    public synchronized boolean method2815() {
        return this.field2397.method2948();
    }

    @ObfuscatedName("em.m(III)V")
    public synchronized void method2816(int arg0, int arg1) {
        this.method2817(arg0, arg1);
    }

    @ObfuscatedName("em.u(III)V")
    public void method2817(int arg0, int arg1) {
        this.field2403[arg0] = arg1;
        this.field2384[arg0] = arg1 & 0xFFFFFF80;
        this.method2846(arg0, arg1);
    }

    @ObfuscatedName("em.s(III)V")
    public void method2846(int arg0, int arg1) {
        if (this.field2383[arg0] != arg1) {
            this.field2383[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2396[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("em.e(IIII)V")
    public void method2818(int arg0, int arg1, int arg2) {
        this.method2851(arg0, arg1, 64);
        if ((this.field2400[arg0] & 0x2) != 0) {
            for (class146 var4 = (class146) this.field2378.field2421.method3421(); var4 != null; var4 = (class146) this.field2378.field2421.method3430()) {
                if (var4.field2448 == arg0 && var4.field2451 < 0) {
                    this.field2389[arg0][var4.field2445] = null;
                    this.field2389[arg0][arg1] = var4;
                    int var5 = (var4.field2450 * var4.field2444 >> 12) + var4.field2440;
                    var4.field2440 += arg1 - var4.field2445 << 8;
                    var4.field2444 = var5 - var4.field2440;
                    var4.field2450 = 4096;
                    var4.field2445 = arg1;
                    return;
                }
            }
        }
        class141 var6 = (class141) this.field2392.method3405((long) this.field2383[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2366[arg1];
        if (var7 == null) {
            return;
        }
        class146 var8 = new class146();
        var8.field2448 = arg0;
        var8.field2441 = var6;
        var8.field2442 = var7;
        var8.field2446 = var6.field2367[arg1];
        var8.field2455 = var6.field2371[arg1];
        var8.field2445 = arg1;
        var8.field2465 = var6.field2375 * arg2 * arg2 * var6.field2368[arg1] + 1024 >> 11;
        var8.field2447 = var6.field2369[arg1] & 0xFF;
        var8.field2440 = (arg1 << 8) - (var6.field2365[arg1] & 0x7FFF);
        var8.field2449 = 0;
        var8.field2452 = 0;
        var8.field2456 = 0;
        var8.field2451 = -1;
        var8.field2443 = 0;
        if (this.field2395[arg0] == 0) {
            var8.field2458 = class45.method968(var7, this.method2832(var8), this.method2855(var8), this.method2878(var8));
        } else {
            var8.field2458 = class45.method968(var7, this.method2832(var8), 0, this.method2878(var8));
            this.method2819(var8, var6.field2365[arg1] < 0);
        }
        if (var6.field2365[arg1] < 0) {
            var8.field2458.method970(-1);
        }
        if (var8.field2455 >= 0) {
            class146 var9 = this.field2396[arg0][var8.field2455];
            if (var9 != null && var9.field2451 < 0) {
                this.field2389[arg0][var9.field2445] = null;
                var9.field2451 = 0;
            }
            this.field2396[arg0][var8.field2455] = var8;
        }
        this.field2378.field2421.method3422(var8);
        this.field2389[arg0][arg1] = var8;
    }

    @ObfuscatedName("em.r(Let;ZI)V")
    public void method2819(class146 arg0, boolean arg1) {
        int var3 = arg0.field2442.field1235.length;
        int var5;
        if (arg1 && arg0.field2442.field1239) {
            int var4 = var3 + var3 - arg0.field2442.field1237;
            var5 = (int) ((long) this.field2395[arg0.field2448] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2458.method1126(true);
            }
        } else {
            var5 = (int) ((long) this.field2395[arg0.field2448] * (long) var3 >> 6);
        }
        arg0.field2458.method976(var5);
    }

    @ObfuscatedName("em.n(IIII)V")
    public void method2851(int arg0, int arg1, int arg2) {
        class146 var4 = this.field2389[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2389[arg0][arg1] = null;
        if ((this.field2400[arg0] & 0x2) == 0) {
            var4.field2451 = 0;
            return;
        }
        for (class146 var5 = (class146) this.field2378.field2421.method3446(); var5 != null; var5 = (class146) this.field2378.field2421.method3428()) {
            if (var4.field2448 == var5.field2448 && var5.field2451 < 0 && var4 != var5) {
                var4.field2451 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("em.g(IIIB)V")
    public void method2901(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("em.c(III)V")
    public void method2822(int arg0, int arg1) {
    }

    @ObfuscatedName("em.v(III)V")
    public void method2823(int arg0, int arg1) {
        this.field2385[arg0] = arg1;
    }

    @ObfuscatedName("em.b(IB)V")
    public void method2824(int arg0) {
        for (class146 var2 = (class146) this.field2378.field2421.method3446(); var2 != null; var2 = (class146) this.field2378.field2421.method3428()) {
            if (arg0 < 0 || var2.field2448 == arg0) {
                if (var2.field2458 != null) {
                    var2.field2458.method1115(Statics.field1099 / 100);
                    if (var2.field2458.method985()) {
                        this.field2378.field2424.method1143(var2.field2458);
                    }
                    var2.method2994();
                }
                if (var2.field2451 < 0) {
                    this.field2389[var2.field2448][var2.field2445] = null;
                }
                var2.method3455();
            }
        }
    }

    @ObfuscatedName("em.k(IB)V")
    public void method2825(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2825(var2);
            }
            return;
        }
        this.field2379[arg0] = 12800;
        this.field2380[arg0] = 8192;
        this.field2376[arg0] = 16383;
        this.field2385[arg0] = 8192;
        this.field2386[arg0] = 0;
        this.field2387[arg0] = 8192;
        this.method2828(arg0);
        this.method2829(arg0);
        this.field2400[arg0] = 0;
        this.field2390[arg0] = 32767;
        this.field2391[arg0] = 256;
        this.field2395[arg0] = 0;
        this.method2831(arg0, 8192);
    }

    @ObfuscatedName("em.t(II)V")
    public void method2826(int arg0) {
        for (class146 var2 = (class146) this.field2378.field2421.method3446(); var2 != null; var2 = (class146) this.field2378.field2421.method3428()) {
            if ((arg0 < 0 || var2.field2448 == arg0) && var2.field2451 < 0) {
                this.field2389[var2.field2448][var2.field2445] = null;
                var2.field2451 = 0;
            }
        }
    }

    @ObfuscatedName("em.f(I)V")
    public void method2827() {
        this.method2824(-1);
        this.method2825(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2383[var1] = this.field2403[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2384[var2] = this.field2403[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("em.ap(II)V")
    public void method2828(int arg0) {
        if ((this.field2400[arg0] & 0x2) == 0) {
            return;
        }
        for (class146 var2 = (class146) this.field2378.field2421.method3446(); var2 != null; var2 = (class146) this.field2378.field2421.method3428()) {
            if (var2.field2448 == arg0 && this.field2389[arg0][var2.field2445] == null && var2.field2451 < 0) {
                var2.field2451 = 0;
            }
        }
    }

    @ObfuscatedName("em.ah(IB)V")
    public void method2829(int arg0) {
        if ((this.field2400[arg0] & 0x4) == 0) {
            return;
        }
        for (class146 var2 = (class146) this.field2378.field2421.method3446(); var2 != null; var2 = (class146) this.field2378.field2421.method3428()) {
            if (var2.field2448 == arg0) {
                var2.field2460 = 0;
            }
        }
    }

    @ObfuscatedName("em.at(II)V")
    public void method2830(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2851(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2818(var6, var7, var8);
            } else {
                this.method2851(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2901(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2384[var12] = (var14 << 14) + (this.field2384[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2384[var12] = (var14 << 7) + (this.field2384[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2386[var12] = (var14 << 7) + (this.field2386[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2386[var12] = (this.field2386[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2387[var12] = (var14 << 7) + (this.field2387[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2387[var12] = (this.field2387[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2379[var12] = (var14 << 7) + (this.field2379[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2379[var12] = (this.field2379[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2380[var12] = (var14 << 7) + (this.field2380[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2380[var12] = (this.field2380[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2376[var12] = (var14 << 7) + (this.field2376[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2376[var12] = (this.field2376[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2400[var12] |= 0x1;
                } else {
                    this.field2400[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2400[var12] |= 0x2;
                } else {
                    this.method2828(var12);
                    this.field2400[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2390[var12] = (var14 << 7) + (this.field2390[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2390[var12] = (this.field2390[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2390[var12] = (var14 << 7) + (this.field2390[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2390[var12] = (this.field2390[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2824(var12);
            }
            if (var13 == 121) {
                this.method2825(var12);
            }
            if (var13 == 123) {
                this.method2826(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2390[var12];
                if (var15 == 16384) {
                    this.field2391[var12] = (var14 << 7) + (this.field2391[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2390[var12];
                if (var16 == 16384) {
                    this.field2391[var12] = (this.field2391[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2395[var12] = (var14 << 7) + (this.field2395[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2395[var12] = (this.field2395[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2400[var12] |= 0x4;
                } else {
                    this.method2829(var12);
                    this.field2400[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2831(var12, (var14 << 7) + (this.field2393[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2831(var12, (this.field2393[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2846(var17, this.field2384[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2822(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method2823(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2827();
            }
        }
    }

    @ObfuscatedName("em.aa(III)V")
    public void method2831(int arg0, int arg1) {
        this.field2393[arg0] = arg1;
        this.field2381[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("em.ae(Let;B)I")
    public int method2832(class146 arg0) {
        int var2 = (arg0.field2450 * arg0.field2444 >> 12) + arg0.field2440;
        int var3 = ((this.field2385[arg0.field2448] - 8192) * this.field2391[arg0.field2448] >> 12) + var2;
        class143 var4 = arg0.field2446;
        if (var4.field2416 > 0 && (var4.field2419 > 0 || this.field2386[arg0.field2448] > 0)) {
            int var5 = var4.field2419 << 2;
            int var6 = var4.field2412 << 1;
            if (arg0.field2453 < var6) {
                var5 = arg0.field2453 * var5 / var6;
            }
            int var7 = (this.field2386[arg0.field2448] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2457 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2442.field1236 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1099 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("em.aw(Let;I)I")
    public int method2855(class146 arg0) {
        class143 var2 = arg0.field2446;
        int var3 = this.field2379[arg0.field2448] * this.field2376[arg0.field2448] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2465 * var4 + 16384 >> 15;
        int var6 = this.field2377 * var5 + 128 >> 8;
        if (var2.field2409 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2449 * 1.953125E-5D * (double) var2.field2409) + 0.5D);
        }
        if (var2.field2413 != null) {
            int var7 = arg0.field2452;
            int var8 = var2.field2413[arg0.field2456 + 1];
            if (arg0.field2456 < var2.field2413.length - 2) {
                int var9 = (var2.field2413[arg0.field2456] & 0xFF) << 8;
                int var10 = (var2.field2413[arg0.field2456 + 2] & 0xFF) << 8;
                var8 += (var2.field2413[arg0.field2456 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2451 > 0 && var2.field2405 != null) {
            int var11 = arg0.field2451;
            int var12 = var2.field2405[arg0.field2443 + 1];
            if (arg0.field2443 < var2.field2405.length - 2) {
                int var13 = (var2.field2405[arg0.field2443] & 0xFF) << 8;
                int var14 = (var2.field2405[arg0.field2443 + 2] & 0xFF) << 8;
                var12 += (var2.field2405[arg0.field2443 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("em.ar(Let;B)I")
    public int method2878(class146 arg0) {
        int var2 = this.field2380[arg0.field2448];
        return var2 < 8192 ? arg0.field2447 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2447) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("em.h()Lax;")
    public synchronized class48 method1009() {
        return this.field2378;
    }

    @ObfuscatedName("em.j()Lax;")
    public synchronized class48 method987() {
        return null;
    }

    @ObfuscatedName("em.q()I")
    public synchronized int method1123() {
        return 0;
    }

    @ObfuscatedName("em.z([III)V")
    public synchronized void method978(int[] arg0, int arg1, int arg2) {
        if (this.field2397.method2948()) {
            int var4 = this.field2401 * this.field2397.field2427 / Statics.field1099;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2394;
                if (this.field2402 - var5 >= 0L) {
                    this.field2394 = var5;
                    break;
                }
                int var7 = (int) ((this.field2402 - this.field2394 + (long) var4 - 1L) / (long) var4);
                this.field2394 += (long) var4 * (long) var7;
                this.field2378.method978(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2893();
            } while (this.field2397.method2948());
        }
        this.field2378.method978(arg0, arg1, arg2);
    }

    @ObfuscatedName("em.af(I)V")
    public synchronized void method990(int arg0) {
        if (this.field2397.method2948()) {
            int var2 = this.field2401 * this.field2397.field2427 / Statics.field1099;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2394;
                if (this.field2402 - var3 >= 0L) {
                    this.field2394 = var3;
                    break;
                }
                int var5 = (int) ((this.field2402 - this.field2394 + (long) var2 - 1L) / (long) var2);
                this.field2394 += (long) var2 * (long) var5;
                this.field2378.method990(var5);
                arg0 -= var5;
                this.method2893();
            } while (this.field2397.method2948());
        }
        this.field2378.method990(arg0);
    }

    @ObfuscatedName("em.ai(S)V")
    public void method2893() {
        int var1 = this.field2399;
        int var2 = this.field2398;
        long var3 = this.field2402;
        while (this.field2398 == var2) {
            while (this.field2397.field2430[var1] == var2) {
                this.field2397.method2981(var1);
                int var5 = this.field2397.method2952(var1);
                if (var5 == 1) {
                    this.field2397.method2943();
                    this.field2397.method2970(var1);
                    if (this.field2397.method2971()) {
                        if (!this.field2382 || var2 == 0) {
                            this.method2827();
                            this.field2397.method2940();
                            return;
                        }
                        this.field2397.method2953(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2830(var5);
                }
                this.field2397.method2946(var1);
                this.field2397.method2970(var1);
            }
            var1 = this.field2397.method2951();
            var2 = this.field2397.field2430[var1];
            var3 = this.field2397.method2950(var2);
        }
        this.field2399 = var1;
        this.field2398 = var2;
        this.field2402 = var3;
    }

    @ObfuscatedName("em.au(Let;B)Z")
    public boolean method2839(class146 arg0) {
        if (arg0.field2458 != null) {
            return false;
        }
        if (arg0.field2451 >= 0) {
            arg0.method3455();
            if (arg0.field2455 > 0 && this.field2396[arg0.field2448][arg0.field2455] == arg0) {
                this.field2396[arg0.field2448][arg0.field2455] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("em.ay(Let;[IIIB)Z")
    public boolean method2909(class146 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2459 = Statics.field1099 / 100;
        if (arg0.field2451 >= 0 && arg0.field2458 == null || arg0.field2458.method1092()) {
            arg0.method2994();
            arg0.method3455();
            if (arg0.field2455 > 0 && this.field2396[arg0.field2448][arg0.field2455] == arg0) {
                this.field2396[arg0.field2448][arg0.field2455] = null;
            }
            return true;
        }
        int var5 = arg0.field2450;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2387[arg0.field2448] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2450 = var6;
        }
        arg0.field2458.method982(this.method2832(arg0));
        class143 var7 = arg0.field2446;
        boolean var8 = false;
        arg0.field2453++;
        arg0.field2457 += var7.field2416;
        double var9 = (double) ((arg0.field2445 - 60 << 8) + (arg0.field2450 * arg0.field2444 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2409 > 0) {
            if (var7.field2404 > 0) {
                arg0.field2449 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2404 * var9) + 0.5D);
            } else {
                arg0.field2449 += 128;
            }
        }
        if (var7.field2413 != null) {
            if (var7.field2407 > 0) {
                arg0.field2452 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2407 * var9) + 0.5D);
            } else {
                arg0.field2452 += 128;
            }
            while (arg0.field2456 < var7.field2413.length - 2 && arg0.field2452 > (var7.field2413[arg0.field2456 + 2] & 0xFF) << 8) {
                arg0.field2456 += 2;
            }
            if (arg0.field2456 == var7.field2413.length - 2 && var7.field2413[arg0.field2456 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2451 >= 0 && var7.field2405 != null && (this.field2400[arg0.field2448] & 0x1) == 0 && (arg0.field2455 < 0 || this.field2396[arg0.field2448][arg0.field2455] != arg0)) {
            if (var7.field2411 > 0) {
                arg0.field2451 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2411 * var9) + 0.5D);
            } else {
                arg0.field2451 += 128;
            }
            while (arg0.field2443 < var7.field2405.length - 2 && arg0.field2451 > (var7.field2405[arg0.field2443 + 2] & 0xFF) << 8) {
                arg0.field2443 += 2;
            }
            if (arg0.field2443 == var7.field2405.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2458.method980(arg0.field2459, this.method2855(arg0), this.method2878(arg0));
            return false;
        }
        arg0.field2458.method1115(arg0.field2459);
        if (arg1 == null) {
            arg0.field2458.method990(arg3);
        } else {
            arg0.field2458.method978(arg1, arg2, arg3);
        }
        if (arg0.field2458.method985()) {
            this.field2378.field2424.method1143(arg0.field2458);
        }
        arg0.method2994();
        if (arg0.field2451 >= 0) {
            arg0.method3455();
            if (arg0.field2455 > 0 && this.field2396[arg0.field2448][arg0.field2455] == arg0) {
                this.field2396[arg0.field2448][arg0.field2455] = null;
            }
        }
        return true;
    }
}
