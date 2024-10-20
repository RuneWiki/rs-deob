package deob;

@ObfuscatedName("er")
public class class142 extends class48 {

    @ObfuscatedName("er.f")
    public class175 field2376 = new class175(128);

    @ObfuscatedName("er.t")
    public int field2369 = 256;

    @ObfuscatedName("er.n")
    public int field2394 = 1000000;

    @ObfuscatedName("er.e")
    public int[] field2371 = new int[16];

    @ObfuscatedName("er.l")
    public int[] field2372 = new int[16];

    @ObfuscatedName("er.d")
    public int[] field2388 = new int[16];

    @ObfuscatedName("er.r")
    public int[] field2374 = new int[16];

    @ObfuscatedName("er.k")
    public int[] field2389 = new int[16];

    @ObfuscatedName("er.u")
    public int[] field2373 = new int[16];

    @ObfuscatedName("er.o")
    public int[] field2377 = new int[16];

    @ObfuscatedName("er.g")
    public int[] field2378 = new int[16];

    @ObfuscatedName("er.s")
    public int[] field2379 = new int[16];

    @ObfuscatedName("er.z")
    public int[] field2386 = new int[16];

    @ObfuscatedName("er.w")
    public int[] field2382 = new int[16];

    @ObfuscatedName("er.h")
    public int[] field2383 = new int[16];

    @ObfuscatedName("er.y")
    public int[] field2384 = new int[16];

    @ObfuscatedName("er.x")
    public int[] field2385 = new int[16];

    @ObfuscatedName("er.p")
    public int[] field2380 = new int[16];

    @ObfuscatedName("er.i")
    public class146[][] field2387 = new class146[16][128];

    @ObfuscatedName("er.aa")
    public class146[][] field2368 = new class146[16][128];

    @ObfuscatedName("er.ax")
    public class145 field2381 = new class145();

    @ObfuscatedName("er.ad")
    public boolean field2390;

    @ObfuscatedName("er.af")
    public int field2391;

    @ObfuscatedName("er.ai")
    public int field2392;

    @ObfuscatedName("er.ag")
    public long field2393;

    @ObfuscatedName("er.an")
    public long field2370;

    @ObfuscatedName("er.ac")
    public class144 field2395 = new class144(this);

    public class142() {
        this.method2810();
    }

    @ObfuscatedName("er.f(IB)V")
    public synchronized void method2790(int arg0) {
        this.field2369 = arg0;
    }

    @ObfuscatedName("er.t(I)I")
    public int method2884() {
        return this.field2369;
    }

    @ObfuscatedName("er.e(Les;Leo;Lbo;II)Z")
    public synchronized boolean method2870(class140 arg0, class153 arg1, class58 arg2, int arg3) {
        arg0.method2775();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class176 var7 = (class176) arg0.field2356.method3315(); var7 != null; var7 = (class176) arg0.field2356.method3316()) {
            int var8 = (int) var7.field2812;
            class141 var9 = (class141) this.field2376.method3312((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3039(var8);
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
                this.field2376.method3329(var11, (long) var8);
            }
            if (!var9.method2786(arg2, var7.field2807, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2781();
        }
        return var5;
    }

    @ObfuscatedName("er.l(I)V")
    public synchronized void method2860() {
        for (class141 var1 = (class141) this.field2376.method3315(); var1 != null; var1 = (class141) this.field2376.method3316()) {
            var1.method2783();
        }
    }

    @ObfuscatedName("er.d(I)V")
    public synchronized void method2794() {
        for (class141 var1 = (class141) this.field2376.method3315(); var1 != null; var1 = (class141) this.field2376.method3316()) {
            var1.method3374();
        }
    }

    @ObfuscatedName("er.r(Les;ZI)V")
    public synchronized void method2795(class140 arg0, boolean arg1) {
        this.method2796();
        this.field2381.method2903(arg0.field2357);
        this.field2390 = arg1;
        this.field2393 = 0L;
        int var3 = this.field2381.method2905();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2381.method2906(var4);
            this.field2381.method2909(var4);
            this.field2381.method2907(var4);
        }
        this.field2391 = this.field2381.method2914();
        this.field2392 = this.field2381.field2416[this.field2391];
        this.field2370 = this.field2381.method2913(this.field2392);
    }

    @ObfuscatedName("er.k(B)V")
    public synchronized void method2796() {
        this.field2381.method2925();
        this.method2810();
    }

    @ObfuscatedName("er.u(I)Z")
    public synchronized boolean method2797() {
        return this.field2381.method2939();
    }

    @ObfuscatedName("er.o(III)V")
    public synchronized void method2807(int arg0, int arg1) {
        this.method2798(arg0, arg1);
    }

    @ObfuscatedName("er.g(III)V")
    public void method2798(int arg0, int arg1) {
        this.field2374[arg0] = arg1;
        this.field2373[arg0] = arg1 & 0xFFFFFF80;
        this.method2800(arg0, arg1);
    }

    @ObfuscatedName("er.s(III)V")
    public void method2800(int arg0, int arg1) {
        if (this.field2389[arg0] != arg1) {
            this.field2389[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2368[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("er.b(IIII)V")
    public void method2801(int arg0, int arg1, int arg2) {
        this.method2803(arg0, arg1, 64);
        if ((this.field2386[arg0] & 0x2) != 0) {
            for (class146 var4 = (class146) this.field2395.field2411.method3339(); var4 != null; var4 = (class146) this.field2395.field2411.method3341()) {
                if (var4.field2446 == arg0 && var4.field2426 < 0) {
                    this.field2387[arg0][var4.field2433] = null;
                    this.field2387[arg0][arg1] = var4;
                    int var5 = (var4.field2439 * var4.field2436 >> 12) + var4.field2434;
                    var4.field2434 += arg1 - var4.field2433 << 8;
                    var4.field2439 = var5 - var4.field2434;
                    var4.field2436 = 4096;
                    var4.field2433 = arg1;
                    return;
                }
            }
        }
        class141 var6 = (class141) this.field2376.method3312((long) this.field2389[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2359[arg1];
        if (var7 == null) {
            return;
        }
        class146 var8 = new class146();
        var8.field2446 = arg0;
        var8.field2427 = var6;
        var8.field2428 = var7;
        var8.field2429 = var6.field2360[arg1];
        var8.field2430 = var6.field2361[arg1];
        var8.field2433 = arg1;
        var8.field2432 = var6.field2367 * arg2 * arg2 * var6.field2363[arg1] + 1024 >> 11;
        var8.field2442 = var6.field2362[arg1] & 0xFF;
        var8.field2434 = (arg1 << 8) - (var6.field2364[arg1] & 0x7FFF);
        var8.field2437 = 0;
        var8.field2438 = 0;
        var8.field2440 = 0;
        var8.field2426 = -1;
        var8.field2441 = 0;
        if (this.field2384[arg0] == 0) {
            var8.field2431 = class45.method966(var7, this.method2822(var8), this.method2806(var8), this.method2791(var8));
        } else {
            var8.field2431 = class45.method966(var7, this.method2822(var8), 0, this.method2791(var8));
            this.method2804(var8, var6.field2364[arg1] < 0);
        }
        if (var6.field2364[arg1] < 0) {
            var8.field2431.method947(-1);
        }
        if (var8.field2430 >= 0) {
            class146 var9 = this.field2368[arg0][var8.field2430];
            if (var9 != null && var9.field2426 < 0) {
                this.field2387[arg0][var9.field2433] = null;
                var9.field2426 = 0;
            }
            this.field2368[arg0][var8.field2430] = var8;
        }
        this.field2395.field2411.method3333(var8);
        this.field2387[arg0][arg1] = var8;
    }

    @ObfuscatedName("er.v(Lek;ZI)V")
    public void method2804(class146 arg0, boolean arg1) {
        int var3 = arg0.field2428.field1219.length;
        int var5;
        if (arg1 && arg0.field2428.field1223) {
            int var4 = var3 + var3 - arg0.field2428.field1220;
            var5 = (int) ((long) this.field2384[arg0.field2446] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2431.method953(true);
            }
        } else {
            var5 = (int) ((long) this.field2384[arg0.field2446] * (long) var3 >> 6);
        }
        arg0.field2431.method1041(var5);
    }

    @ObfuscatedName("er.j(IIII)V")
    public void method2803(int arg0, int arg1, int arg2) {
        class146 var4 = this.field2387[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2387[arg0][arg1] = null;
        if ((this.field2386[arg0] & 0x2) == 0) {
            var4.field2426 = 0;
            return;
        }
        for (class146 var5 = (class146) this.field2395.field2411.method3362(); var5 != null; var5 = (class146) this.field2395.field2411.method3350()) {
            if (var4.field2446 == var5.field2446 && var5.field2426 < 0 && var4 != var5) {
                var4.field2426 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("er.q(IIII)V")
    public void method2831(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("er.a(IIB)V")
    public void method2805(int arg0, int arg1) {
    }

    @ObfuscatedName("er.c(IIS)V")
    public void method2858(int arg0, int arg1) {
        this.field2377[arg0] = arg1;
    }

    @ObfuscatedName("er.m(II)V")
    public void method2847(int arg0) {
        for (class146 var2 = (class146) this.field2395.field2411.method3362(); var2 != null; var2 = (class146) this.field2395.field2411.method3350()) {
            if (arg0 < 0 || var2.field2446 == arg0) {
                if (var2.field2431 != null) {
                    var2.field2431.method1026(Statics.field1089 / 100);
                    if (var2.field2431.method1067()) {
                        this.field2395.field2410.method1096(var2.field2431);
                    }
                    var2.method2957();
                }
                if (var2.field2426 < 0) {
                    this.field2387[var2.field2446][var2.field2433] = null;
                }
                var2.method3374();
            }
        }
    }

    @ObfuscatedName("er.z(II)V")
    public void method2808(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2808(var2);
            }
            return;
        }
        this.field2371[arg0] = 12800;
        this.field2372[arg0] = 8192;
        this.field2388[arg0] = 16383;
        this.field2377[arg0] = 8192;
        this.field2378[arg0] = 0;
        this.field2379[arg0] = 8192;
        this.method2811(arg0);
        this.method2812(arg0);
        this.field2386[arg0] = 0;
        this.field2382[arg0] = 32767;
        this.field2383[arg0] = 256;
        this.field2384[arg0] = 0;
        this.method2813(arg0, 8192);
    }

    @ObfuscatedName("er.w(II)V")
    public void method2809(int arg0) {
        for (class146 var2 = (class146) this.field2395.field2411.method3362(); var2 != null; var2 = (class146) this.field2395.field2411.method3350()) {
            if ((arg0 < 0 || var2.field2446 == arg0) && var2.field2426 < 0) {
                this.field2387[var2.field2446][var2.field2433] = null;
                var2.field2426 = 0;
            }
        }
    }

    @ObfuscatedName("er.h(I)V")
    public void method2810() {
        this.method2847(-1);
        this.method2808(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2389[var1] = this.field2374[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2373[var2] = this.field2374[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("er.ax(IB)V")
    public void method2811(int arg0) {
        if ((this.field2386[arg0] & 0x2) == 0) {
            return;
        }
        for (class146 var2 = (class146) this.field2395.field2411.method3362(); var2 != null; var2 = (class146) this.field2395.field2411.method3350()) {
            if (var2.field2446 == arg0 && this.field2387[arg0][var2.field2433] == null && var2.field2426 < 0) {
                var2.field2426 = 0;
            }
        }
    }

    @ObfuscatedName("er.ad(II)V")
    public void method2812(int arg0) {
        if ((this.field2386[arg0] & 0x4) == 0) {
            return;
        }
        for (class146 var2 = (class146) this.field2395.field2411.method3362(); var2 != null; var2 = (class146) this.field2395.field2411.method3350()) {
            if (var2.field2446 == arg0) {
                var2.field2435 = 0;
            }
        }
    }

    @ObfuscatedName("er.af(IB)V")
    public void method2816(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2803(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2801(var6, var7, var8);
            } else {
                this.method2803(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2831(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2373[var12] = (var14 << 14) + (this.field2373[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2373[var12] = (var14 << 7) + (this.field2373[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2378[var12] = (var14 << 7) + (this.field2378[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2378[var12] = (this.field2378[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2379[var12] = (var14 << 7) + (this.field2379[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2379[var12] = (this.field2379[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2371[var12] = (var14 << 7) + (this.field2371[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2371[var12] = (this.field2371[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2372[var12] = (var14 << 7) + (this.field2372[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2372[var12] = (this.field2372[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2388[var12] = (var14 << 7) + (this.field2388[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2388[var12] = (this.field2388[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2386[var12] |= 0x1;
                } else {
                    this.field2386[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2386[var12] |= 0x2;
                } else {
                    this.method2811(var12);
                    this.field2386[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2382[var12] = (var14 << 7) + (this.field2382[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2382[var12] = (this.field2382[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2382[var12] = (var14 << 7) + (this.field2382[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2382[var12] = (this.field2382[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2847(var12);
            }
            if (var13 == 121) {
                this.method2808(var12);
            }
            if (var13 == 123) {
                this.method2809(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2382[var12];
                if (var15 == 16384) {
                    this.field2383[var12] = (var14 << 7) + (this.field2383[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2382[var12];
                if (var16 == 16384) {
                    this.field2383[var12] = (this.field2383[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2384[var12] = (var14 << 7) + (this.field2384[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2384[var12] = (this.field2384[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2386[var12] |= 0x4;
                } else {
                    this.method2812(var12);
                    this.field2386[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2813(var12, (var14 << 7) + (this.field2385[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2813(var12, (this.field2385[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2800(var17, this.field2373[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2805(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method2858(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2810();
            }
        }
    }

    @ObfuscatedName("er.ai(III)V")
    public void method2813(int arg0, int arg1) {
        this.field2385[arg0] = arg1;
        this.field2380[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("er.ag(Lek;B)I")
    public int method2822(class146 arg0) {
        int var2 = (arg0.field2439 * arg0.field2436 >> 12) + arg0.field2434;
        int var3 = ((this.field2377[arg0.field2446] - 8192) * this.field2383[arg0.field2446] >> 12) + var2;
        class143 var4 = arg0.field2429;
        if (var4.field2399 > 0 && (var4.field2404 > 0 || this.field2378[arg0.field2446] > 0)) {
            int var5 = var4.field2404 << 2;
            int var6 = var4.field2406 << 1;
            if (arg0.field2443 < var6) {
                var5 = arg0.field2443 * var5 / var6;
            }
            int var7 = (this.field2378[arg0.field2446] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2444 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2428.field1221 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1089 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("er.an(Lek;I)I")
    public int method2806(class146 arg0) {
        class143 var2 = arg0.field2429;
        int var3 = this.field2388[arg0.field2446] * this.field2371[arg0.field2446] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2432 * var4 + 16384 >> 15;
        int var6 = this.field2369 * var5 + 128 >> 8;
        if (var2.field2400 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2437 * 1.953125E-5D * (double) var2.field2400) + 0.5D);
        }
        if (var2.field2401 != null) {
            int var7 = arg0.field2438;
            int var8 = var2.field2401[arg0.field2440 + 1];
            if (arg0.field2440 < var2.field2401.length - 2) {
                int var9 = (var2.field2401[arg0.field2440] & 0xFF) << 8;
                int var10 = (var2.field2401[arg0.field2440 + 2] & 0xFF) << 8;
                var8 += (var2.field2401[arg0.field2440 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2426 > 0 && var2.field2405 != null) {
            int var11 = arg0.field2426;
            int var12 = var2.field2405[arg0.field2441 + 1];
            if (arg0.field2441 < var2.field2405.length - 2) {
                int var13 = (var2.field2405[arg0.field2441] & 0xFF) << 8;
                int var14 = (var2.field2405[arg0.field2441 + 2] & 0xFF) << 8;
                var12 += (var2.field2405[arg0.field2441 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("er.ac(Lek;B)I")
    public int method2791(class146 arg0) {
        int var2 = this.field2372[arg0.field2446];
        return var2 < 8192 ? arg0.field2442 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2442) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("er.y()Laj;")
    public synchronized class48 method1069() {
        return this.field2395;
    }

    @ObfuscatedName("er.x()Laj;")
    public synchronized class48 method964() {
        return null;
    }

    @ObfuscatedName("er.p()I")
    public synchronized int method1000() {
        return 0;
    }

    @ObfuscatedName("er.i([III)V")
    public synchronized void method954(int[] arg0, int arg1, int arg2) {
        if (this.field2381.method2939()) {
            int var4 = this.field2394 * this.field2381.field2412 / Statics.field1089;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2393;
                if (this.field2370 - var5 >= 0L) {
                    this.field2393 = var5;
                    break;
                }
                int var7 = (int) ((this.field2370 - this.field2393 + (long) var4 - 1L) / (long) var4);
                this.field2393 += (long) var4 * (long) var7;
                this.field2395.method954(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2819();
            } while (this.field2381.method2939());
        }
        this.field2395.method954(arg0, arg1, arg2);
    }

    @ObfuscatedName("er.aa(I)V")
    public synchronized void method1085(int arg0) {
        if (this.field2381.method2939()) {
            int var2 = this.field2394 * this.field2381.field2412 / Statics.field1089;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2393;
                if (this.field2370 - var3 >= 0L) {
                    this.field2393 = var3;
                    break;
                }
                int var5 = (int) ((this.field2370 - this.field2393 + (long) var2 - 1L) / (long) var2);
                this.field2393 += (long) var2 * (long) var5;
                this.field2395.method1085(var5);
                arg0 -= var5;
                this.method2819();
            } while (this.field2381.method2939());
        }
        this.field2395.method1085(arg0);
    }

    @ObfuscatedName("er.al(B)V")
    public void method2819() {
        int var1 = this.field2391;
        int var2 = this.field2392;
        long var3 = this.field2370;
        while (this.field2392 == var2) {
            while (this.field2381.field2416[var1] == var2) {
                this.field2381.method2906(var1);
                int var5 = this.field2381.method2910(var1);
                if (var5 == 1) {
                    this.field2381.method2931();
                    this.field2381.method2907(var1);
                    if (this.field2381.method2911()) {
                        if (!this.field2390 || var2 == 0) {
                            this.method2810();
                            this.field2381.method2925();
                            return;
                        }
                        this.field2381.method2916(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2816(var5);
                }
                this.field2381.method2909(var1);
                this.field2381.method2907(var1);
            }
            var1 = this.field2381.method2914();
            var2 = this.field2381.field2416[var1];
            var3 = this.field2381.method2913(var2);
        }
        this.field2391 = var1;
        this.field2392 = var2;
        this.field2370 = var3;
    }

    @ObfuscatedName("er.at(Lek;I)Z")
    public boolean method2817(class146 arg0) {
        if (arg0.field2431 != null) {
            return false;
        }
        if (arg0.field2426 >= 0) {
            arg0.method3374();
            if (arg0.field2430 > 0 && this.field2368[arg0.field2446][arg0.field2430] == arg0) {
                this.field2368[arg0.field2446][arg0.field2430] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("er.ah(Lek;[IIII)Z")
    public boolean method2820(class146 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2445 = Statics.field1089 / 100;
        if (arg0.field2426 >= 0 && arg0.field2431 == null || arg0.field2431.method1021()) {
            arg0.method2957();
            arg0.method3374();
            if (arg0.field2430 > 0 && this.field2368[arg0.field2446][arg0.field2430] == arg0) {
                this.field2368[arg0.field2446][arg0.field2430] = null;
            }
            return true;
        }
        int var5 = arg0.field2436;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2379[arg0.field2446] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2436 = var6;
        }
        arg0.field2431.method959(this.method2822(arg0));
        class143 var7 = arg0.field2429;
        boolean var8 = false;
        arg0.field2443++;
        arg0.field2444 += var7.field2399;
        double var9 = (double) ((arg0.field2433 - 60 << 8) + (arg0.field2439 * arg0.field2436 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2400 > 0) {
            if (var7.field2403 > 0) {
                arg0.field2437 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2403 * var9) + 0.5D);
            } else {
                arg0.field2437 += 128;
            }
        }
        if (var7.field2401 != null) {
            if (var7.field2398 > 0) {
                arg0.field2438 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2398 * var9) + 0.5D);
            } else {
                arg0.field2438 += 128;
            }
            while (arg0.field2440 < var7.field2401.length - 2 && arg0.field2438 > (var7.field2401[arg0.field2440 + 2] & 0xFF) << 8) {
                arg0.field2440 += 2;
            }
            if (arg0.field2440 == var7.field2401.length - 2 && var7.field2401[arg0.field2440 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2426 >= 0 && var7.field2405 != null && (this.field2386[arg0.field2446] & 0x1) == 0 && (arg0.field2430 < 0 || this.field2368[arg0.field2446][arg0.field2430] != arg0)) {
            if (var7.field2402 > 0) {
                arg0.field2426 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2402 * var9) + 0.5D);
            } else {
                arg0.field2426 += 128;
            }
            while (arg0.field2441 < var7.field2405.length - 2 && arg0.field2426 > (var7.field2405[arg0.field2441 + 2] & 0xFF) << 8) {
                arg0.field2441 += 2;
            }
            if (arg0.field2441 == var7.field2405.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2431.method957(arg0.field2445, this.method2806(arg0), this.method2791(arg0));
            return false;
        }
        arg0.field2431.method1026(arg0.field2445);
        if (arg1 == null) {
            arg0.field2431.method1085(arg3);
        } else {
            arg0.field2431.method954(arg1, arg2, arg3);
        }
        if (arg0.field2431.method1067()) {
            this.field2395.field2410.method1096(arg0.field2431);
        }
        arg0.method2957();
        if (arg0.field2426 >= 0) {
            arg0.method3374();
            if (arg0.field2430 > 0 && this.field2368[arg0.field2446][arg0.field2430] == arg0) {
                this.field2368[arg0.field2446][arg0.field2430] = null;
            }
        }
        return true;
    }
}
