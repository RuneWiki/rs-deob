package deob;

@ObfuscatedName("en")
public class class141 extends class48 {

    @ObfuscatedName("en.d")
    public class175 field2382 = new class175(128);

    @ObfuscatedName("en.g")
    public int field2380 = 256;

    @ObfuscatedName("en.a")
    public int field2365 = 1000000;

    @ObfuscatedName("en.t")
    public int[] field2366 = new int[16];

    @ObfuscatedName("en.f")
    public int[] field2381 = new int[16];

    @ObfuscatedName("en.c")
    public int[] field2368 = new int[16];

    @ObfuscatedName("en.p")
    public int[] field2369 = new int[16];

    @ObfuscatedName("en.s")
    public int[] field2370 = new int[16];

    @ObfuscatedName("en.k")
    public int[] field2371 = new int[16];

    @ObfuscatedName("en.m")
    public int[] field2372 = new int[16];

    @ObfuscatedName("en.y")
    public int[] field2373 = new int[16];

    @ObfuscatedName("en.b")
    public int[] field2374 = new int[16];

    @ObfuscatedName("en.i")
    public int[] field2364 = new int[16];

    @ObfuscatedName("en.e")
    public int[] field2377 = new int[16];

    @ObfuscatedName("en.n")
    public int[] field2378 = new int[16];

    @ObfuscatedName("en.q")
    public int[] field2379 = new int[16];

    @ObfuscatedName("en.w")
    public int[] field2367 = new int[16];

    @ObfuscatedName("en.o")
    public int[] field2385 = new int[16];

    @ObfuscatedName("en.j")
    public class145[][] field2391 = new class145[16][128];

    @ObfuscatedName("en.ae")
    public class145[][] field2363 = new class145[16][128];

    @ObfuscatedName("en.aq")
    public class144 field2384 = new class144();

    @ObfuscatedName("en.ap")
    public boolean field2383;

    @ObfuscatedName("en.ah")
    public int field2386;

    @ObfuscatedName("en.ax")
    public int field2387;

    @ObfuscatedName("en.ai")
    public long field2388;

    @ObfuscatedName("en.aa")
    public long field2389;

    @ObfuscatedName("en.ar")
    public class143 field2390 = new class143(this);

    public class141() {
        this.method2706();
    }

    @ObfuscatedName("en.d(II)V")
    public synchronized void method2752(int arg0) {
        this.field2380 = arg0;
    }

    @ObfuscatedName("en.g(I)I")
    public int method2773() {
        return this.field2380;
    }

    @ObfuscatedName("en.t(Lek;Lej;Lbi;IB)Z")
    public synchronized boolean method2690(class139 arg0, class152 arg1, class58 arg2, int arg3) {
        arg0.method2666();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class176 var7 = (class176) arg0.field2349.method3257(); var7 != null; var7 = (class176) arg0.field2349.method3258()) {
            int var8 = (int) var7.field2818;
            class140 var9 = (class140) this.field2382.method3255((long) var8);
            if (var9 == null) {
                var9 = class140.method1996(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2382.method3268(var9, (long) var8);
            }
            if (!var9.method2674(arg2, var7.field2813, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2665();
        }
        return var5;
    }

    @ObfuscatedName("en.f(B)V")
    public synchronized void method2775() {
        for (class140 var1 = (class140) this.field2382.method3257(); var1 != null; var1 = (class140) this.field2382.method3258()) {
            var1.method2675();
        }
    }

    @ObfuscatedName("en.c(I)V")
    public synchronized void method2692() {
        for (class140 var1 = (class140) this.field2382.method3257(); var1 != null; var1 = (class140) this.field2382.method3258()) {
            var1.method3306();
        }
    }

    @ObfuscatedName("en.p(Lek;ZI)V")
    public synchronized void method2700(class139 arg0, boolean arg1) {
        this.method2694();
        this.field2384.method2796(arg0.field2348);
        this.field2383 = arg1;
        this.field2388 = 0L;
        int var3 = this.field2384.method2799();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2384.method2800(var4);
            this.field2384.method2803(var4);
            this.field2384.method2801(var4);
        }
        this.field2386 = this.field2384.method2808();
        this.field2387 = this.field2384.field2417[this.field2386];
        this.field2389 = this.field2384.method2812(this.field2387);
    }

    @ObfuscatedName("en.s(I)V")
    public synchronized void method2694() {
        this.field2384.method2797();
        this.method2706();
    }

    @ObfuscatedName("en.k(I)Z")
    public synchronized boolean method2695() {
        return this.field2384.method2819();
    }

    @ObfuscatedName("en.m(III)V")
    public synchronized void method2720(int arg0, int arg1) {
        this.method2697(arg0, arg1);
    }

    @ObfuscatedName("en.y(III)V")
    public void method2697(int arg0, int arg1) {
        this.field2369[arg0] = arg1;
        this.field2371[arg0] = arg1 & 0xFFFFFF80;
        this.method2698(arg0, arg1);
    }

    @ObfuscatedName("en.b(III)V")
    public void method2698(int arg0, int arg1) {
        if (this.field2370[arg0] != arg1) {
            this.field2370[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2363[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("en.l(IIIB)V")
    public void method2778(int arg0, int arg1, int arg2) {
        this.method2758(arg0, arg1, 64);
        if ((this.field2364[arg0] & 0x2) != 0) {
            for (class145 var4 = (class145) this.field2390.field2408.method3282(); var4 != null; var4 = (class145) this.field2390.field2408.method3281()) {
                if (var4.field2440 == arg0 && var4.field2433 < 0) {
                    this.field2391[arg0][var4.field2432] = null;
                    this.field2391[arg0][arg1] = var4;
                    int var5 = (var4.field2442 * var4.field2427 >> 12) + var4.field2435;
                    var4.field2435 += arg1 - var4.field2432 << 8;
                    var4.field2427 = var5 - var4.field2435;
                    var4.field2442 = 4096;
                    var4.field2432 = arg1;
                    return;
                }
            }
        }
        class140 var6 = (class140) this.field2382.method3255((long) this.field2370[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2358[arg1];
        if (var7 == null) {
            return;
        }
        class145 var8 = new class145();
        var8.field2440 = arg0;
        var8.field2428 = var6;
        var8.field2429 = var7;
        var8.field2430 = var6.field2354[arg1];
        var8.field2449 = var6.field2356[arg1];
        var8.field2432 = arg1;
        var8.field2439 = var6.field2359 * arg2 * arg2 * var6.field2353[arg1] + 1024 >> 11;
        var8.field2434 = var6.field2350[arg1] & 0xFF;
        var8.field2435 = (arg1 << 8) - (var6.field2352[arg1] & 0x7FFF);
        var8.field2436 = 0;
        var8.field2431 = 0;
        var8.field2438 = 0;
        var8.field2433 = -1;
        var8.field2441 = 0;
        if (this.field2379[arg0] == 0) {
            var8.field2445 = class45.method932(var7, this.method2711(var8), this.method2736(var8), this.method2712(var8));
        } else {
            var8.field2445 = class45.method932(var7, this.method2711(var8), 0, this.method2712(var8));
            this.method2704(var8, var6.field2352[arg1] < 0);
        }
        if (var6.field2352[arg1] < 0) {
            var8.field2445.method943(-1);
        }
        if (var8.field2449 >= 0) {
            class145 var9 = this.field2363[arg0][var8.field2449];
            if (var9 != null && var9.field2433 < 0) {
                this.field2391[arg0][var9.field2432] = null;
                var9.field2433 = 0;
            }
            this.field2363[arg0][var8.field2449] = var8;
        }
        this.field2390.field2408.method3273(var8);
        this.field2391[arg0][arg1] = var8;
    }

    @ObfuscatedName("en.x(Ler;ZI)V")
    public void method2704(class145 arg0, boolean arg1) {
        int var3 = arg0.field2429.field1232.length;
        int var5;
        if (arg1 && arg0.field2429.field1235) {
            int var4 = var3 + var3 - arg0.field2429.field1231;
            var5 = (int) ((long) this.field2379[arg0.field2440] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2445.method941(true);
            }
        } else {
            var5 = (int) ((long) this.field2379[arg0.field2440] * (long) var3 >> 6);
        }
        arg0.field2445.method1001(var5);
    }

    @ObfuscatedName("en.z(IIII)V")
    public void method2758(int arg0, int arg1, int arg2) {
        class145 var4 = this.field2391[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2391[arg0][arg1] = null;
        if ((this.field2364[arg0] & 0x2) == 0) {
            var4.field2433 = 0;
            return;
        }
        for (class145 var5 = (class145) this.field2390.field2408.method3278(); var5 != null; var5 = (class145) this.field2390.field2408.method3280()) {
            if (var4.field2440 == var5.field2440 && var5.field2433 < 0 && var4 != var5) {
                var4.field2433 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("en.r(IIIB)V")
    public void method2785(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("en.h(III)V")
    public void method2702(int arg0, int arg1) {
    }

    @ObfuscatedName("en.v(III)V")
    public void method2703(int arg0, int arg1) {
        this.field2372[arg0] = arg1;
    }

    @ObfuscatedName("en.u(II)V")
    public void method2689(int arg0) {
        for (class145 var2 = (class145) this.field2390.field2408.method3278(); var2 != null; var2 = (class145) this.field2390.field2408.method3280()) {
            if (arg0 < 0 || var2.field2440 == arg0) {
                if (var2.field2445 != null) {
                    var2.field2445.method990(Statics.field2328 / 100);
                    if (var2.field2445.method1017()) {
                        this.field2390.field2410.method1090(var2.field2445);
                    }
                    var2.method2851();
                }
                if (var2.field2433 < 0) {
                    this.field2391[var2.field2440][var2.field2432] = null;
                }
                var2.method3306();
            }
        }
    }

    @ObfuscatedName("en.i(IB)V")
    public void method2783(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2783(var2);
            }
            return;
        }
        this.field2366[arg0] = 12800;
        this.field2381[arg0] = 8192;
        this.field2368[arg0] = 16383;
        this.field2372[arg0] = 8192;
        this.field2373[arg0] = 0;
        this.field2374[arg0] = 8192;
        this.method2707(arg0);
        this.method2708(arg0);
        this.field2364[arg0] = 0;
        this.field2377[arg0] = 32767;
        this.field2378[arg0] = 256;
        this.field2379[arg0] = 0;
        this.method2710(arg0, 8192);
    }

    @ObfuscatedName("en.e(II)V")
    public void method2779(int arg0) {
        for (class145 var2 = (class145) this.field2390.field2408.method3278(); var2 != null; var2 = (class145) this.field2390.field2408.method3280()) {
            if ((arg0 < 0 || var2.field2440 == arg0) && var2.field2433 < 0) {
                this.field2391[var2.field2440][var2.field2432] = null;
                var2.field2433 = 0;
            }
        }
    }

    @ObfuscatedName("en.n(I)V")
    public void method2706() {
        this.method2689(-1);
        this.method2783(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2370[var1] = this.field2369[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2371[var2] = this.field2369[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("en.aq(II)V")
    public void method2707(int arg0) {
        if ((this.field2364[arg0] & 0x2) == 0) {
            return;
        }
        for (class145 var2 = (class145) this.field2390.field2408.method3278(); var2 != null; var2 = (class145) this.field2390.field2408.method3280()) {
            if (var2.field2440 == arg0 && this.field2391[arg0][var2.field2432] == null && var2.field2433 < 0) {
                var2.field2433 = 0;
            }
        }
    }

    @ObfuscatedName("en.ap(IB)V")
    public void method2708(int arg0) {
        if ((this.field2364[arg0] & 0x4) == 0) {
            return;
        }
        for (class145 var2 = (class145) this.field2390.field2408.method3278(); var2 != null; var2 = (class145) this.field2390.field2408.method3280()) {
            if (var2.field2440 == arg0) {
                var2.field2448 = 0;
            }
        }
    }

    @ObfuscatedName("en.ah(II)V")
    public void method2732(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2758(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2778(var6, var7, var8);
            } else {
                this.method2758(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2785(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2371[var12] = (var14 << 14) + (this.field2371[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2371[var12] = (var14 << 7) + (this.field2371[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2373[var12] = (var14 << 7) + (this.field2373[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2373[var12] = (this.field2373[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2374[var12] = (var14 << 7) + (this.field2374[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2374[var12] = (this.field2374[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2366[var12] = (var14 << 7) + (this.field2366[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2366[var12] = (this.field2366[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2381[var12] = (var14 << 7) + (this.field2381[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2381[var12] = (this.field2381[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2368[var12] = (var14 << 7) + (this.field2368[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2368[var12] = (this.field2368[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2364[var12] |= 0x1;
                } else {
                    this.field2364[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2364[var12] |= 0x2;
                } else {
                    this.method2707(var12);
                    this.field2364[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2377[var12] = (var14 << 7) + (this.field2377[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2377[var12] = (this.field2377[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2377[var12] = (var14 << 7) + (this.field2377[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2377[var12] = (this.field2377[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2689(var12);
            }
            if (var13 == 121) {
                this.method2783(var12);
            }
            if (var13 == 123) {
                this.method2779(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2377[var12];
                if (var15 == 16384) {
                    this.field2378[var12] = (var14 << 7) + (this.field2378[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2377[var12];
                if (var16 == 16384) {
                    this.field2378[var12] = (this.field2378[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2379[var12] = (var14 << 7) + (this.field2379[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2379[var12] = (this.field2379[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2364[var12] |= 0x4;
                } else {
                    this.method2708(var12);
                    this.field2364[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2710(var12, (var14 << 7) + (this.field2367[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2710(var12, (this.field2367[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2698(var17, this.field2371[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2702(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method2703(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2706();
            }
        }
    }

    @ObfuscatedName("en.ax(III)V")
    public void method2710(int arg0, int arg1) {
        this.field2367[arg0] = arg1;
        this.field2385[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("en.ai(Ler;I)I")
    public int method2711(class145 arg0) {
        int var2 = (arg0.field2442 * arg0.field2427 >> 12) + arg0.field2435;
        int var3 = ((this.field2372[arg0.field2440] - 8192) * this.field2378[arg0.field2440] >> 12) + var2;
        class142 var4 = arg0.field2430;
        if (var4.field2401 > 0 && (var4.field2400 > 0 || this.field2373[arg0.field2440] > 0)) {
            int var5 = var4.field2400 << 2;
            int var6 = var4.field2403 << 1;
            if (arg0.field2443 < var6) {
                var5 = arg0.field2443 * var5 / var6;
            }
            int var7 = (this.field2373[arg0.field2440] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2444 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2429.field1233 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field2328 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("en.aa(Ler;I)I")
    public int method2736(class145 arg0) {
        class142 var2 = arg0.field2430;
        int var3 = this.field2368[arg0.field2440] * this.field2366[arg0.field2440] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2439 * var4 + 16384 >> 15;
        int var6 = this.field2380 * var5 + 128 >> 8;
        if (var2.field2398 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2436 * 1.953125E-5D * (double) var2.field2398) + 0.5D);
        }
        if (var2.field2396 != null) {
            int var7 = arg0.field2431;
            int var8 = var2.field2396[arg0.field2438 + 1];
            if (arg0.field2438 < var2.field2396.length - 2) {
                int var9 = (var2.field2396[arg0.field2438] & 0xFF) << 8;
                int var10 = (var2.field2396[arg0.field2438 + 2] & 0xFF) << 8;
                var8 += (var2.field2396[arg0.field2438 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2433 > 0 && var2.field2402 != null) {
            int var11 = arg0.field2433;
            int var12 = var2.field2402[arg0.field2441 + 1];
            if (arg0.field2441 < var2.field2402.length - 2) {
                int var13 = (var2.field2402[arg0.field2441] & 0xFF) << 8;
                int var14 = (var2.field2402[arg0.field2441 + 2] & 0xFF) << 8;
                var12 += (var2.field2402[arg0.field2441 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("en.ar(Ler;I)I")
    public int method2712(class145 arg0) {
        int var2 = this.field2381[arg0.field2440];
        return var2 < 8192 ? arg0.field2434 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2434) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("en.q()Lao;")
    public synchronized class48 method974() {
        return this.field2390;
    }

    @ObfuscatedName("en.w()Lao;")
    public synchronized class48 method951() {
        return null;
    }

    @ObfuscatedName("en.o()I")
    public synchronized int method952() {
        return 0;
    }

    @ObfuscatedName("en.j([III)V")
    public synchronized void method1018(int[] arg0, int arg1, int arg2) {
        if (this.field2384.method2819()) {
            int var4 = this.field2365 * this.field2384.field2423 / Statics.field2328;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2388;
                if (this.field2389 - var5 >= 0L) {
                    this.field2388 = var5;
                    break;
                }
                int var7 = (int) ((this.field2389 - this.field2388 + (long) var4 - 1L) / (long) var4);
                this.field2388 += (long) var4 * (long) var7;
                this.field2390.method1018(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2748();
            } while (this.field2384.method2819());
        }
        this.field2390.method1018(arg0, arg1, arg2);
    }

    @ObfuscatedName("en.ae(I)V")
    public synchronized void method954(int arg0) {
        if (this.field2384.method2819()) {
            int var2 = this.field2365 * this.field2384.field2423 / Statics.field2328;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2388;
                if (this.field2389 - var3 >= 0L) {
                    this.field2388 = var3;
                    break;
                }
                int var5 = (int) ((this.field2389 - this.field2388 + (long) var2 - 1L) / (long) var2);
                this.field2388 += (long) var2 * (long) var5;
                this.field2390.method954(var5);
                arg0 -= var5;
                this.method2748();
            } while (this.field2384.method2819());
        }
        this.field2390.method954(arg0);
    }

    @ObfuscatedName("en.ak(S)V")
    public void method2748() {
        int var1 = this.field2386;
        int var2 = this.field2387;
        long var3 = this.field2389;
        while (this.field2387 == var2) {
            while (this.field2384.field2417[var1] == var2) {
                this.field2384.method2800(var1);
                int var5 = this.field2384.method2804(var1);
                if (var5 == 1) {
                    this.field2384.method2802();
                    this.field2384.method2801(var1);
                    if (this.field2384.method2809()) {
                        if (!this.field2383 || var2 == 0) {
                            this.method2706();
                            this.field2384.method2797();
                            return;
                        }
                        this.field2384.method2810(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2732(var5);
                }
                this.field2384.method2803(var1);
                this.field2384.method2801(var1);
            }
            var1 = this.field2384.method2808();
            var2 = this.field2384.field2417[var1];
            var3 = this.field2384.method2812(var2);
        }
        this.field2386 = var1;
        this.field2387 = var2;
        this.field2389 = var3;
    }

    @ObfuscatedName("en.al(Ler;I)Z")
    public boolean method2725(class145 arg0) {
        if (arg0.field2445 != null) {
            return false;
        }
        if (arg0.field2433 >= 0) {
            arg0.method3306();
            if (arg0.field2449 > 0 && this.field2363[arg0.field2440][arg0.field2449] == arg0) {
                this.field2363[arg0.field2440][arg0.field2449] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("en.au(Ler;[IIII)Z")
    public boolean method2717(class145 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2446 = Statics.field2328 / 100;
        if (arg0.field2433 >= 0 && arg0.field2445 == null || arg0.field2445.method948()) {
            arg0.method2851();
            arg0.method3306();
            if (arg0.field2449 > 0 && this.field2363[arg0.field2440][arg0.field2449] == arg0) {
                this.field2363[arg0.field2440][arg0.field2449] = null;
            }
            return true;
        }
        int var5 = arg0.field2442;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2374[arg0.field2440] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2442 = var6;
        }
        arg0.field2445.method1032(this.method2711(arg0));
        class142 var7 = arg0.field2430;
        boolean var8 = false;
        arg0.field2443++;
        arg0.field2444 += var7.field2401;
        double var9 = (double) ((arg0.field2432 - 60 << 8) + (arg0.field2442 * arg0.field2427 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2398 > 0) {
            if (var7.field2399 > 0) {
                arg0.field2436 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2399 * var9) + 0.5D);
            } else {
                arg0.field2436 += 128;
            }
        }
        if (var7.field2396 != null) {
            if (var7.field2397 > 0) {
                arg0.field2431 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2397 * var9) + 0.5D);
            } else {
                arg0.field2431 += 128;
            }
            while (arg0.field2438 < var7.field2396.length - 2 && arg0.field2431 > (var7.field2396[arg0.field2438 + 2] & 0xFF) << 8) {
                arg0.field2438 += 2;
            }
            if (arg0.field2438 == var7.field2396.length - 2 && var7.field2396[arg0.field2438 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2433 >= 0 && var7.field2402 != null && (this.field2364[arg0.field2440] & 0x1) == 0 && (arg0.field2449 < 0 || this.field2363[arg0.field2440][arg0.field2449] != arg0)) {
            if (var7.field2395 > 0) {
                arg0.field2433 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2395 * var9) + 0.5D);
            } else {
                arg0.field2433 += 128;
            }
            while (arg0.field2441 < var7.field2402.length - 2 && arg0.field2433 > (var7.field2402[arg0.field2441 + 2] & 0xFF) << 8) {
                arg0.field2441 += 2;
            }
            if (arg0.field2441 == var7.field2402.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2445.method1046(arg0.field2446, this.method2736(arg0), this.method2712(arg0));
            return false;
        }
        arg0.field2445.method990(arg0.field2446);
        if (arg1 == null) {
            arg0.field2445.method954(arg3);
        } else {
            arg0.field2445.method1018(arg1, arg2, arg3);
        }
        if (arg0.field2445.method1017()) {
            this.field2390.field2410.method1090(arg0.field2445);
        }
        arg0.method2851();
        if (arg0.field2433 >= 0) {
            arg0.method3306();
            if (arg0.field2449 > 0 && this.field2363[arg0.field2440][arg0.field2449] == arg0) {
                this.field2363[arg0.field2440][arg0.field2449] = null;
            }
        }
        return true;
    }
}
