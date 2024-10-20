package deob;

@ObfuscatedName("ev")
public class class141 extends class48 {

    @ObfuscatedName("ev.i")
    public class175 field2358 = new class175(128);

    @ObfuscatedName("ev.v")
    public int field2356 = 256;

    @ObfuscatedName("ev.m")
    public int field2372 = 1000000;

    @ObfuscatedName("ev.j")
    public int[] field2369 = new int[16];

    @ObfuscatedName("ev.o")
    public int[] field2359 = new int[16];

    @ObfuscatedName("ev.l")
    public int[] field2360 = new int[16];

    @ObfuscatedName("ev.g")
    public int[] field2361 = new int[16];

    @ObfuscatedName("ev.c")
    public int[] field2355 = new int[16];

    @ObfuscatedName("ev.z")
    public int[] field2363 = new int[16];

    @ObfuscatedName("ev.f")
    public int[] field2364 = new int[16];

    @ObfuscatedName("ev.a")
    public int[] field2365 = new int[16];

    @ObfuscatedName("ev.d")
    public int[] field2373 = new int[16];

    @ObfuscatedName("ev.n")
    public int[] field2368 = new int[16];

    @ObfuscatedName("ev.q")
    public int[] field2362 = new int[16];

    @ObfuscatedName("ev.r")
    public int[] field2370 = new int[16];

    @ObfuscatedName("ev.u")
    public int[] field2371 = new int[16];

    @ObfuscatedName("ev.p")
    public int[] field2366 = new int[16];

    @ObfuscatedName("ev.t")
    public int[] field2357 = new int[16];

    @ObfuscatedName("ev.s")
    public class145[][] field2374 = new class145[16][128];

    @ObfuscatedName("ev.ah")
    public class145[][] field2375 = new class145[16][128];

    @ObfuscatedName("ev.ar")
    public class144 field2376 = new class144();

    @ObfuscatedName("ev.ac")
    public boolean field2378;

    @ObfuscatedName("ev.as")
    public int field2377;

    @ObfuscatedName("ev.ag")
    public int field2379;

    @ObfuscatedName("ev.ak")
    public long field2380;

    @ObfuscatedName("ev.am")
    public long field2381;

    @ObfuscatedName("ev.ap")
    public class143 field2382 = new class143(this);

    public class141() {
        this.method2807();
    }

    @ObfuscatedName("ev.i(IB)V")
    public synchronized void method2822(int arg0) {
        this.field2356 = arg0;
    }

    @ObfuscatedName("ev.v(B)I")
    public int method2790() {
        return this.field2356;
    }

    @ObfuscatedName("ev.j(Lew;Ler;Lbs;IS)Z")
    public synchronized boolean method2791(class139 arg0, class152 arg1, class58 arg2, int arg3) {
        arg0.method2771();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class176 var7 = (class176) arg0.field2341.method3351(); var7 != null; var7 = (class176) arg0.field2341.method3352()) {
            int var8 = (int) var7.field2818;
            class140 var9 = (class140) this.field2358.method3348((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3037(var8);
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
                this.field2358.method3349(var11, (long) var8);
            }
            if (!var9.method2786(arg2, var7.field2812, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2773();
        }
        return var5;
    }

    @ObfuscatedName("ev.o(I)V")
    public synchronized void method2792() {
        for (class140 var1 = (class140) this.field2358.method3351(); var1 != null; var1 = (class140) this.field2358.method3352()) {
            var1.method2780();
        }
    }

    @ObfuscatedName("ev.l(I)V")
    public synchronized void method2793() {
        for (class140 var1 = (class140) this.field2358.method3351(); var1 != null; var1 = (class140) this.field2358.method3352()) {
            var1.method3409();
        }
    }

    @ObfuscatedName("ev.g(Lew;ZI)V")
    public synchronized void method2794(class139 arg0, boolean arg1) {
        this.method2795();
        this.field2376.method2908(arg0.field2342);
        this.field2378 = arg1;
        this.field2380 = 0L;
        int var3 = this.field2376.method2949();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2376.method2912(var4);
            this.field2376.method2915(var4);
            this.field2376.method2913(var4);
        }
        this.field2377 = this.field2376.method2920();
        this.field2379 = this.field2376.field2407[this.field2377];
        this.field2381 = this.field2376.method2924(this.field2379);
    }

    @ObfuscatedName("ev.w(I)V")
    public synchronized void method2795() {
        this.field2376.method2934();
        this.method2807();
    }

    @ObfuscatedName("ev.c(I)Z")
    public synchronized boolean method2863() {
        return this.field2376.method2910();
    }

    @ObfuscatedName("ev.z(III)V")
    public synchronized void method2788(int arg0, int arg1) {
        this.method2798(arg0, arg1);
    }

    @ObfuscatedName("ev.f(III)V")
    public void method2798(int arg0, int arg1) {
        this.field2361[arg0] = arg1;
        this.field2363[arg0] = arg1 & 0xFFFFFF80;
        this.method2797(arg0, arg1);
    }

    @ObfuscatedName("ev.a(III)V")
    public void method2797(int arg0, int arg1) {
        if (this.field2355[arg0] != arg1) {
            this.field2355[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2375[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ev.d(IIII)V")
    public void method2861(int arg0, int arg1, int arg2) {
        this.method2849(arg0, arg1, 64);
        if ((this.field2368[arg0] & 0x2) != 0) {
            for (class145 var4 = (class145) this.field2382.field2400.method3370(); var4 != null; var4 = (class145) this.field2382.field2400.method3372()) {
                if (var4.field2432 == arg0 && var4.field2417 < 0) {
                    this.field2374[arg0][var4.field2433] = null;
                    this.field2374[arg0][arg1] = var4;
                    int var5 = (var4.field2436 * var4.field2427 >> 12) + var4.field2431;
                    var4.field2431 += arg1 - var4.field2433 << 8;
                    var4.field2436 = var5 - var4.field2431;
                    var4.field2427 = 4096;
                    var4.field2433 = arg1;
                    return;
                }
            }
        }
        class140 var6 = (class140) this.field2358.method3348((long) this.field2355[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2349[arg1];
        if (var7 == null) {
            return;
        }
        class145 var8 = new class145();
        var8.field2432 = arg0;
        var8.field2418 = var6;
        var8.field2419 = var7;
        var8.field2420 = var6.field2348[arg1];
        var8.field2421 = var6.field2344[arg1];
        var8.field2433 = arg1;
        var8.field2423 = var6.field2343 * arg2 * arg2 * var6.field2346[arg1] + 1024 >> 11;
        var8.field2422 = var6.field2350[arg1] & 0xFF;
        var8.field2431 = (arg1 << 8) - (var6.field2345[arg1] & 0x7FFF);
        var8.field2428 = 0;
        var8.field2429 = 0;
        var8.field2430 = 0;
        var8.field2417 = -1;
        var8.field2425 = 0;
        if (this.field2371[arg0] == 0) {
            var8.field2437 = class45.method980(var7, this.method2821(var8), this.method2812(var8), this.method2813(var8));
        } else {
            var8.field2437 = class45.method980(var7, this.method2821(var8), 0, this.method2813(var8));
            this.method2801(var8, var6.field2345[arg1] < 0);
        }
        if (var6.field2345[arg1] < 0) {
            var8.field2437.method982(-1);
        }
        if (var8.field2421 >= 0) {
            class145 var9 = this.field2375[arg0][var8.field2421];
            if (var9 != null && var9.field2417 < 0) {
                this.field2374[arg0][var9.field2433] = null;
                var9.field2417 = 0;
            }
            this.field2375[arg0][var8.field2421] = var8;
        }
        this.field2382.field2400.method3364(var8);
        this.field2374[arg0][arg1] = var8;
    }

    @ObfuscatedName("ev.e(Lec;ZI)V")
    public void method2801(class145 arg0, boolean arg1) {
        int var3 = arg0.field2419.field1241.length;
        int var5;
        if (arg1 && arg0.field2419.field1240) {
            int var4 = var3 + var3 - arg0.field2419.field1242;
            var5 = (int) ((long) this.field2371[arg0.field2432] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2437.method989(true);
            }
        } else {
            var5 = (int) ((long) this.field2371[arg0.field2432] * (long) var3 >> 6);
        }
        arg0.field2437.method988(var5);
    }

    @ObfuscatedName("ev.y(IIIB)V")
    public void method2849(int arg0, int arg1, int arg2) {
        class145 var4 = this.field2374[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2374[arg0][arg1] = null;
        if ((this.field2368[arg0] & 0x2) == 0) {
            var4.field2417 = 0;
            return;
        }
        for (class145 var5 = (class145) this.field2382.field2400.method3369(); var5 != null; var5 = (class145) this.field2382.field2400.method3371()) {
            if (var4.field2432 == var5.field2432 && var5.field2417 < 0 && var4 != var5) {
                var4.field2417 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ev.k(IIII)V")
    public void method2866(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ev.h(III)V")
    public void method2862(int arg0, int arg1) {
    }

    @ObfuscatedName("ev.x(IIB)V")
    public void method2802(int arg0, int arg1) {
        this.field2364[arg0] = arg1;
    }

    @ObfuscatedName("ev.b(II)V")
    public void method2805(int arg0) {
        for (class145 var2 = (class145) this.field2382.field2400.method3369(); var2 != null; var2 = (class145) this.field2382.field2400.method3371()) {
            if (arg0 < 0 || var2.field2432 == arg0) {
                if (var2.field2437 != null) {
                    var2.field2437.method993(Statics.field87 / 100);
                    if (var2.field2437.method1016()) {
                        this.field2382.field2396.method1132(var2.field2437);
                    }
                    var2.method2956();
                }
                if (var2.field2417 < 0) {
                    this.field2374[var2.field2432][var2.field2433] = null;
                }
                var2.method3409();
            }
        }
    }

    @ObfuscatedName("ev.n(IS)V")
    public void method2820(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2820(var2);
            }
            return;
        }
        this.field2369[arg0] = 12800;
        this.field2359[arg0] = 8192;
        this.field2360[arg0] = 16383;
        this.field2364[arg0] = 8192;
        this.field2365[arg0] = 0;
        this.field2373[arg0] = 8192;
        this.method2828(arg0);
        this.method2808(arg0);
        this.field2368[arg0] = 0;
        this.field2362[arg0] = 32767;
        this.field2370[arg0] = 256;
        this.field2371[arg0] = 0;
        this.method2817(arg0, 8192);
    }

    @ObfuscatedName("ev.q(IS)V")
    public void method2806(int arg0) {
        for (class145 var2 = (class145) this.field2382.field2400.method3369(); var2 != null; var2 = (class145) this.field2382.field2400.method3371()) {
            if ((arg0 < 0 || var2.field2432 == arg0) && var2.field2417 < 0) {
                this.field2374[var2.field2432][var2.field2433] = null;
                var2.field2417 = 0;
            }
        }
    }

    @ObfuscatedName("ev.r(B)V")
    public void method2807() {
        this.method2805(-1);
        this.method2820(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2355[var1] = this.field2361[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2363[var2] = this.field2361[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ev.ar(II)V")
    public void method2828(int arg0) {
        if ((this.field2368[arg0] & 0x2) == 0) {
            return;
        }
        for (class145 var2 = (class145) this.field2382.field2400.method3369(); var2 != null; var2 = (class145) this.field2382.field2400.method3371()) {
            if (var2.field2432 == arg0 && this.field2374[arg0][var2.field2433] == null && var2.field2417 < 0) {
                var2.field2417 = 0;
            }
        }
    }

    @ObfuscatedName("ev.ac(II)V")
    public void method2808(int arg0) {
        if ((this.field2368[arg0] & 0x4) == 0) {
            return;
        }
        for (class145 var2 = (class145) this.field2382.field2400.method3369(); var2 != null; var2 = (class145) this.field2382.field2400.method3371()) {
            if (var2.field2432 == arg0) {
                var2.field2424 = 0;
            }
        }
    }

    @ObfuscatedName("ev.as(II)V")
    public void method2809(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2849(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2861(var6, var7, var8);
            } else {
                this.method2849(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2866(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2363[var12] = (var14 << 14) + (this.field2363[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2363[var12] = (var14 << 7) + (this.field2363[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2365[var12] = (var14 << 7) + (this.field2365[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2365[var12] = (this.field2365[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2373[var12] = (var14 << 7) + (this.field2373[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2373[var12] = (this.field2373[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2369[var12] = (var14 << 7) + (this.field2369[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2369[var12] = (this.field2369[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2359[var12] = (var14 << 7) + (this.field2359[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2359[var12] = (this.field2359[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2360[var12] = (var14 << 7) + (this.field2360[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2360[var12] = (this.field2360[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2368[var12] |= 0x1;
                } else {
                    this.field2368[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2368[var12] |= 0x2;
                } else {
                    this.method2828(var12);
                    this.field2368[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2362[var12] = (var14 << 7) + (this.field2362[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2362[var12] = (this.field2362[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2362[var12] = (var14 << 7) + (this.field2362[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2362[var12] = (this.field2362[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2805(var12);
            }
            if (var13 == 121) {
                this.method2820(var12);
            }
            if (var13 == 123) {
                this.method2806(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2362[var12];
                if (var15 == 16384) {
                    this.field2370[var12] = (var14 << 7) + (this.field2370[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2362[var12];
                if (var16 == 16384) {
                    this.field2370[var12] = (this.field2370[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2371[var12] = (var14 << 7) + (this.field2371[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2371[var12] = (this.field2371[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2368[var12] |= 0x4;
                } else {
                    this.method2808(var12);
                    this.field2368[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2817(var12, (var14 << 7) + (this.field2366[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2817(var12, (this.field2366[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2797(var17, this.field2363[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2862(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method2802(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2807();
            }
        }
    }

    @ObfuscatedName("ev.ag(IIB)V")
    public void method2817(int arg0, int arg1) {
        this.field2366[arg0] = arg1;
        this.field2357[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ev.ak(Lec;I)I")
    public int method2821(class145 arg0) {
        int var2 = (arg0.field2436 * arg0.field2427 >> 12) + arg0.field2431;
        int var3 = ((this.field2364[arg0.field2432] - 8192) * this.field2370[arg0.field2432] >> 12) + var2;
        class142 var4 = arg0.field2420;
        if (var4.field2391 > 0 && (var4.field2390 > 0 || this.field2365[arg0.field2432] > 0)) {
            int var5 = var4.field2390 << 2;
            int var6 = var4.field2392 << 1;
            if (arg0.field2426 < var6) {
                var5 = arg0.field2426 * var5 / var6;
            }
            int var7 = (this.field2365[arg0.field2432] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2434 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2419.field1244 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field87 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ev.am(Lec;S)I")
    public int method2812(class145 arg0) {
        class142 var2 = arg0.field2420;
        int var3 = this.field2369[arg0.field2432] * this.field2360[arg0.field2432] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2423 * var4 + 16384 >> 15;
        int var6 = this.field2356 * var5 + 128 >> 8;
        if (var2.field2386 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2428 * 1.953125E-5D * (double) var2.field2386) + 0.5D);
        }
        if (var2.field2394 != null) {
            int var7 = arg0.field2429;
            int var8 = var2.field2394[arg0.field2430 + 1];
            if (arg0.field2430 < var2.field2394.length - 2) {
                int var9 = (var2.field2394[arg0.field2430] & 0xFF) << 8;
                int var10 = (var2.field2394[arg0.field2430 + 2] & 0xFF) << 8;
                var8 += (var2.field2394[arg0.field2430 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2417 > 0 && var2.field2385 != null) {
            int var11 = arg0.field2417;
            int var12 = var2.field2385[arg0.field2425 + 1];
            if (arg0.field2425 < var2.field2385.length - 2) {
                int var13 = (var2.field2385[arg0.field2425] & 0xFF) << 8;
                int var14 = (var2.field2385[arg0.field2425 + 2] & 0xFF) << 8;
                var12 += (var2.field2385[arg0.field2425 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ev.ap(Lec;I)I")
    public int method2813(class145 arg0) {
        int var2 = this.field2359[arg0.field2432];
        return var2 < 8192 ? arg0.field2422 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2422) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ev.u()Lan;")
    public synchronized class48 method998() {
        return this.field2382;
    }

    @ObfuscatedName("ev.p()Lan;")
    public synchronized class48 method1003() {
        return null;
    }

    @ObfuscatedName("ev.t()I")
    public synchronized int method1000() {
        return 0;
    }

    @ObfuscatedName("ev.s([III)V")
    public synchronized void method990(int[] arg0, int arg1, int arg2) {
        if (this.field2376.method2910()) {
            int var4 = this.field2372 * this.field2376.field2404 / Statics.field87;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2380;
                if (this.field2381 - var5 >= 0L) {
                    this.field2380 = var5;
                    break;
                }
                int var7 = (int) ((this.field2381 - this.field2380 + (long) var4 - 1L) / (long) var4);
                this.field2380 += (long) var4 * (long) var7;
                this.field2382.method990(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2816();
            } while (this.field2376.method2910());
        }
        this.field2382.method990(arg0, arg1, arg2);
    }

    @ObfuscatedName("ev.ah(I)V")
    public synchronized void method1002(int arg0) {
        if (this.field2376.method2910()) {
            int var2 = this.field2372 * this.field2376.field2404 / Statics.field87;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2380;
                if (this.field2381 - var3 >= 0L) {
                    this.field2380 = var3;
                    break;
                }
                int var5 = (int) ((this.field2381 - this.field2380 + (long) var2 - 1L) / (long) var2);
                this.field2380 += (long) var2 * (long) var5;
                this.field2382.method1002(var5);
                arg0 -= var5;
                this.method2816();
            } while (this.field2376.method2910());
        }
        this.field2382.method1002(arg0);
    }

    @ObfuscatedName("ev.au(I)V")
    public void method2816() {
        int var1 = this.field2377;
        int var2 = this.field2379;
        long var3 = this.field2381;
        while (this.field2379 == var2) {
            while (this.field2376.field2407[var1] == var2) {
                this.field2376.method2912(var1);
                int var5 = this.field2376.method2916(var1);
                if (var5 == 1) {
                    this.field2376.method2933();
                    this.field2376.method2913(var1);
                    if (this.field2376.method2921()) {
                        if (!this.field2378 || var2 == 0) {
                            this.method2807();
                            this.field2376.method2934();
                            return;
                        }
                        this.field2376.method2922(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2809(var5);
                }
                this.field2376.method2915(var1);
                this.field2376.method2913(var1);
            }
            var1 = this.field2376.method2920();
            var2 = this.field2376.field2407[var1];
            var3 = this.field2376.method2924(var2);
        }
        this.field2377 = var1;
        this.field2379 = var2;
        this.field2381 = var3;
    }

    @ObfuscatedName("ev.aq(Lec;I)Z")
    public boolean method2804(class145 arg0) {
        if (arg0.field2437 != null) {
            return false;
        }
        if (arg0.field2417 >= 0) {
            arg0.method3409();
            if (arg0.field2421 > 0 && this.field2375[arg0.field2432][arg0.field2421] == arg0) {
                this.field2375[arg0.field2432][arg0.field2421] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ev.at(Lec;[IIII)Z")
    public boolean method2818(class145 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2435 = Statics.field87 / 100;
        if (arg0.field2417 >= 0 && arg0.field2437 == null || arg0.field2437.method996()) {
            arg0.method2956();
            arg0.method3409();
            if (arg0.field2421 > 0 && this.field2375[arg0.field2432][arg0.field2421] == arg0) {
                this.field2375[arg0.field2432][arg0.field2421] = null;
            }
            return true;
        }
        int var5 = arg0.field2427;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2373[arg0.field2432] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2427 = var6;
        }
        arg0.field2437.method994(this.method2821(arg0));
        class142 var7 = arg0.field2420;
        boolean var8 = false;
        arg0.field2426++;
        arg0.field2434 += var7.field2391;
        double var9 = (double) ((arg0.field2433 - 60 << 8) + (arg0.field2436 * arg0.field2427 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2386 > 0) {
            if (var7.field2389 > 0) {
                arg0.field2428 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2389 * var9) + 0.5D);
            } else {
                arg0.field2428 += 128;
            }
        }
        if (var7.field2394 != null) {
            if (var7.field2387 > 0) {
                arg0.field2429 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2387 * var9) + 0.5D);
            } else {
                arg0.field2429 += 128;
            }
            while (arg0.field2430 < var7.field2394.length - 2 && arg0.field2429 > (var7.field2394[arg0.field2430 + 2] & 0xFF) << 8) {
                arg0.field2430 += 2;
            }
            if (arg0.field2430 == var7.field2394.length - 2 && var7.field2394[arg0.field2430 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2417 >= 0 && var7.field2385 != null && (this.field2368[arg0.field2432] & 0x1) == 0 && (arg0.field2421 < 0 || this.field2375[arg0.field2432][arg0.field2421] != arg0)) {
            if (var7.field2393 > 0) {
                arg0.field2417 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2393 * var9) + 0.5D);
            } else {
                arg0.field2417 += 128;
            }
            while (arg0.field2425 < var7.field2385.length - 2 && arg0.field2417 > (var7.field2385[arg0.field2425 + 2] & 0xFF) << 8) {
                arg0.field2425 += 2;
            }
            if (arg0.field2425 == var7.field2385.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2437.method992(arg0.field2435, this.method2812(arg0), this.method2813(arg0));
            return false;
        }
        arg0.field2437.method993(arg0.field2435);
        if (arg1 == null) {
            arg0.field2437.method1002(arg3);
        } else {
            arg0.field2437.method990(arg1, arg2, arg3);
        }
        if (arg0.field2437.method1016()) {
            this.field2382.field2396.method1132(arg0.field2437);
        }
        arg0.method2956();
        if (arg0.field2417 >= 0) {
            arg0.method3409();
            if (arg0.field2421 > 0 && this.field2375[arg0.field2432][arg0.field2421] == arg0) {
                this.field2375[arg0.field2432][arg0.field2421] = null;
            }
        }
        return true;
    }
}
