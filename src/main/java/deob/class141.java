package deob;

@ObfuscatedName("ez")
public class class141 extends class48 {

    @ObfuscatedName("ez.g")
    public class175 field2372 = new class175(128);

    @ObfuscatedName("ez.m")
    public int field2347 = 256;

    @ObfuscatedName("ez.v")
    public int field2348 = 1000000;

    @ObfuscatedName("ez.r")
    public int[] field2349 = new int[16];

    @ObfuscatedName("ez.n")
    public int[] field2354 = new int[16];

    @ObfuscatedName("ez.i")
    public int[] field2351 = new int[16];

    @ObfuscatedName("ez.s")
    public int[] field2352 = new int[16];

    @ObfuscatedName("ez.d")
    public int[] field2364 = new int[16];

    @ObfuscatedName("ez.t")
    public int[] field2350 = new int[16];

    @ObfuscatedName("ez.f")
    public int[] field2355 = new int[16];

    @ObfuscatedName("ez.b")
    public int[] field2356 = new int[16];

    @ObfuscatedName("ez.z")
    public int[] field2357 = new int[16];

    @ObfuscatedName("ez.x")
    public int[] field2359 = new int[16];

    @ObfuscatedName("ez.k")
    public int[] field2360 = new int[16];

    @ObfuscatedName("ez.a")
    public int[] field2361 = new int[16];

    @ObfuscatedName("ez.y")
    public int[] field2370 = new int[16];

    @ObfuscatedName("ez.q")
    public int[] field2363 = new int[16];

    @ObfuscatedName("ez.c")
    public int[] field2346 = new int[16];

    @ObfuscatedName("ez.u")
    public class145[][] field2365 = new class145[16][128];

    @ObfuscatedName("ez.ah")
    public class145[][] field2366 = new class145[16][128];

    @ObfuscatedName("ez.az")
    public class144 field2353 = new class144();

    @ObfuscatedName("ez.au")
    public boolean field2362;

    @ObfuscatedName("ez.ae")
    public int field2369;

    @ObfuscatedName("ez.aa")
    public int field2377;

    @ObfuscatedName("ez.av")
    public long field2371;

    @ObfuscatedName("ez.aq")
    public long field2368;

    @ObfuscatedName("ez.ak")
    public class143 field2373 = new class143(this);

    public class141() {
        this.method2711();
    }

    @ObfuscatedName("ez.g(IB)V")
    public synchronized void method2715(int arg0) {
        this.field2347 = arg0;
    }

    @ObfuscatedName("ez.m(I)I")
    public int method2702() {
        return this.field2347;
    }

    @ObfuscatedName("ez.r(Les;Leo;Lbe;II)Z")
    public synchronized boolean method2703(class139 arg0, class152 arg1, class58 arg2, int arg3) {
        arg0.method2682();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class176 var7 = (class176) arg0.field2328.method3312(); var7 != null; var7 = (class176) arg0.field2328.method3297()) {
            int var8 = (int) var7.field2814;
            class140 var9 = (class140) this.field2372.method3293((long) var8);
            if (var9 == null) {
                var9 = class140.method1385(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2372.method3303(var9, (long) var8);
            }
            if (!var9.method2691(arg2, var7.field2808, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2683();
        }
        return var5;
    }

    @ObfuscatedName("ez.n(I)V")
    public synchronized void method2759() {
        for (class140 var1 = (class140) this.field2372.method3312(); var1 != null; var1 = (class140) this.field2372.method3297()) {
            var1.method2694();
        }
    }

    @ObfuscatedName("ez.i(I)V")
    public synchronized void method2705() {
        for (class140 var1 = (class140) this.field2372.method3312(); var1 != null; var1 = (class140) this.field2372.method3297()) {
            var1.method3346();
        }
    }

    @ObfuscatedName("ez.s(Les;ZI)V")
    public synchronized void method2706(class139 arg0, boolean arg1) {
        this.method2712();
        this.field2353.method2824(arg0.field2327);
        this.field2362 = arg1;
        this.field2371 = 0L;
        int var3 = this.field2353.method2827();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2353.method2828(var4);
            this.field2353.method2831(var4);
            this.field2353.method2829(var4);
        }
        this.field2369 = this.field2353.method2835();
        this.field2377 = this.field2353.field2402[this.field2369];
        this.field2368 = this.field2353.method2834(this.field2377);
    }

    @ObfuscatedName("ez.w(I)V")
    public synchronized void method2712() {
        this.field2353.method2867();
        this.method2711();
    }

    @ObfuscatedName("ez.d(B)Z")
    public synchronized boolean method2708() {
        return this.field2353.method2869();
    }

    @ObfuscatedName("ez.t(IIB)V")
    public synchronized void method2709(int arg0, int arg1) {
        this.method2710(arg0, arg1);
    }

    @ObfuscatedName("ez.f(III)V")
    public void method2710(int arg0, int arg1) {
        this.field2352[arg0] = arg1;
        this.field2350[arg0] = arg1 & 0xFFFFFF80;
        this.method2793(arg0, arg1);
    }

    @ObfuscatedName("ez.b(III)V")
    public void method2793(int arg0, int arg1) {
        if (this.field2364[arg0] != arg1) {
            this.field2364[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2366[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ez.z(IIII)V")
    public void method2773(int arg0, int arg1, int arg2) {
        this.method2713(arg0, arg1, 64);
        if ((this.field2359[arg0] & 0x2) != 0) {
            for (class145 var4 = (class145) this.field2373.field2393.method3318(); var4 != null; var4 = (class145) this.field2373.field2393.method3314()) {
                if (var4.field2418 == arg0 && var4.field2423 < 0) {
                    this.field2365[arg0][var4.field2417] = null;
                    this.field2365[arg0][arg1] = var4;
                    int var5 = (var4.field2422 * var4.field2415 >> 12) + var4.field2414;
                    var4.field2414 += arg1 - var4.field2417 << 8;
                    var4.field2415 = var5 - var4.field2414;
                    var4.field2422 = 4096;
                    var4.field2417 = arg1;
                    return;
                }
            }
        }
        class140 var6 = (class140) this.field2372.method3293((long) this.field2364[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2344[arg1];
        if (var7 == null) {
            return;
        }
        class145 var8 = new class145();
        var8.field2418 = arg0;
        var8.field2432 = var6;
        var8.field2420 = var7;
        var8.field2419 = var6.field2334[arg1];
        var8.field2416 = var6.field2343[arg1];
        var8.field2417 = arg1;
        var8.field2412 = var6.field2341 * arg2 * arg2 * var6.field2332[arg1] + 1024 >> 11;
        var8.field2413 = var6.field2333[arg1] & 0xFF;
        var8.field2414 = (arg1 << 8) - (var6.field2331[arg1] & 0x7FFF);
        var8.field2421 = 0;
        var8.field2424 = 0;
        var8.field2425 = 0;
        var8.field2423 = -1;
        var8.field2427 = 0;
        if (this.field2370[arg0] == 0) {
            var8.field2430 = class45.method936(var7, this.method2724(var8), this.method2725(var8), this.method2726(var8));
        } else {
            var8.field2430 = class45.method936(var7, this.method2724(var8), 0, this.method2726(var8));
            this.method2789(var8, var6.field2331[arg1] < 0);
        }
        if (var6.field2331[arg1] < 0) {
            var8.field2430.method938(-1);
        }
        if (var8.field2416 >= 0) {
            class145 var9 = this.field2366[arg0][var8.field2416];
            if (var9 != null && var9.field2423 < 0) {
                this.field2365[arg0][var9.field2417] = null;
                var9.field2423 = 0;
            }
            this.field2366[arg0][var8.field2416] = var8;
        }
        this.field2373.field2393.method3326(var8);
        this.field2365[arg0][arg1] = var8;
    }

    @ObfuscatedName("ez.l(Lew;ZI)V")
    public void method2789(class145 arg0, boolean arg1) {
        int var3 = arg0.field2420.field1227.length;
        int var5;
        if (arg1 && arg0.field2420.field1230) {
            int var4 = var3 + var3 - arg0.field2420.field1228;
            var5 = (int) ((long) this.field2370[arg0.field2418] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2430.method1032(true);
            }
        } else {
            var5 = (int) ((long) this.field2370[arg0.field2418] * (long) var3 >> 6);
        }
        arg0.field2430.method1057(var5);
    }

    @ObfuscatedName("ez.e(IIII)V")
    public void method2713(int arg0, int arg1, int arg2) {
        class145 var4 = this.field2365[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2365[arg0][arg1] = null;
        if ((this.field2359[arg0] & 0x2) == 0) {
            var4.field2423 = 0;
            return;
        }
        for (class145 var5 = (class145) this.field2373.field2393.method3321(); var5 != null; var5 = (class145) this.field2373.field2393.method3323()) {
            if (var4.field2418 == var5.field2418 && var5.field2423 < 0 && var4 != var5) {
                var4.field2423 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ez.p(IIIB)V")
    public void method2714(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ez.o(IIB)V")
    public void method2731(int arg0, int arg1) {
    }

    @ObfuscatedName("ez.h(IIB)V")
    public void method2812(int arg0, int arg1) {
        this.field2355[arg0] = arg1;
    }

    @ObfuscatedName("ez.j(II)V")
    public void method2717(int arg0) {
        for (class145 var2 = (class145) this.field2373.field2393.method3321(); var2 != null; var2 = (class145) this.field2373.field2393.method3323()) {
            if (arg0 < 0 || var2.field2418 == arg0) {
                if (var2.field2430 != null) {
                    var2.field2430.method949(Statics.field1096 / 100);
                    if (var2.field2430.method953()) {
                        this.field2373.field2395.method1103(var2.field2430);
                    }
                    var2.method2878();
                }
                if (var2.field2423 < 0) {
                    this.field2365[var2.field2418][var2.field2417] = null;
                }
                var2.method3346();
            }
        }
    }

    @ObfuscatedName("ez.x(II)V")
    public void method2718(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2718(var2);
            }
            return;
        }
        this.field2349[arg0] = 12800;
        this.field2354[arg0] = 8192;
        this.field2351[arg0] = 16383;
        this.field2355[arg0] = 8192;
        this.field2356[arg0] = 0;
        this.field2357[arg0] = 8192;
        this.method2720(arg0);
        this.method2721(arg0);
        this.field2359[arg0] = 0;
        this.field2360[arg0] = 32767;
        this.field2361[arg0] = 256;
        this.field2370[arg0] = 0;
        this.method2723(arg0, 8192);
    }

    @ObfuscatedName("ez.k(II)V")
    public void method2745(int arg0) {
        for (class145 var2 = (class145) this.field2373.field2393.method3321(); var2 != null; var2 = (class145) this.field2373.field2393.method3323()) {
            if ((arg0 < 0 || var2.field2418 == arg0) && var2.field2423 < 0) {
                this.field2365[var2.field2418][var2.field2417] = null;
                var2.field2423 = 0;
            }
        }
    }

    @ObfuscatedName("ez.a(I)V")
    public void method2711() {
        this.method2717(-1);
        this.method2718(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2364[var1] = this.field2352[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2350[var2] = this.field2352[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ez.az(IB)V")
    public void method2720(int arg0) {
        if ((this.field2359[arg0] & 0x2) == 0) {
            return;
        }
        for (class145 var2 = (class145) this.field2373.field2393.method3321(); var2 != null; var2 = (class145) this.field2373.field2393.method3323()) {
            if (var2.field2418 == arg0 && this.field2365[arg0][var2.field2417] == null && var2.field2423 < 0) {
                var2.field2423 = 0;
            }
        }
    }

    @ObfuscatedName("ez.au(IB)V")
    public void method2721(int arg0) {
        if ((this.field2359[arg0] & 0x4) == 0) {
            return;
        }
        for (class145 var2 = (class145) this.field2373.field2393.method3321(); var2 != null; var2 = (class145) this.field2373.field2393.method3323()) {
            if (var2.field2418 == arg0) {
                var2.field2426 = 0;
            }
        }
    }

    @ObfuscatedName("ez.ae(II)V")
    public void method2722(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2713(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2773(var6, var7, var8);
            } else {
                this.method2713(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2714(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2350[var12] = (var14 << 14) + (this.field2350[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2350[var12] = (var14 << 7) + (this.field2350[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2356[var12] = (var14 << 7) + (this.field2356[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2356[var12] = (this.field2356[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2357[var12] = (var14 << 7) + (this.field2357[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2357[var12] = (this.field2357[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2349[var12] = (var14 << 7) + (this.field2349[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2349[var12] = (this.field2349[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2354[var12] = (var14 << 7) + (this.field2354[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2354[var12] = (this.field2354[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2351[var12] = (var14 << 7) + (this.field2351[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2351[var12] = (this.field2351[var12] & 0xFFFFFF80) + var14;
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
                    this.method2720(var12);
                    this.field2359[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2360[var12] = (var14 << 7) + (this.field2360[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2360[var12] = (this.field2360[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2360[var12] = (var14 << 7) + (this.field2360[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2360[var12] = (this.field2360[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2717(var12);
            }
            if (var13 == 121) {
                this.method2718(var12);
            }
            if (var13 == 123) {
                this.method2745(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2360[var12];
                if (var15 == 16384) {
                    this.field2361[var12] = (var14 << 7) + (this.field2361[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2360[var12];
                if (var16 == 16384) {
                    this.field2361[var12] = (this.field2361[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2370[var12] = (var14 << 7) + (this.field2370[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2370[var12] = (this.field2370[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2359[var12] |= 0x4;
                } else {
                    this.method2721(var12);
                    this.field2359[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2723(var12, (var14 << 7) + (this.field2363[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2723(var12, (this.field2363[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2793(var17, this.field2350[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2731(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method2812(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2711();
            }
        }
    }

    @ObfuscatedName("ez.aa(III)V")
    public void method2723(int arg0, int arg1) {
        this.field2363[arg0] = arg1;
        this.field2346[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ez.av(Lew;S)I")
    public int method2724(class145 arg0) {
        int var2 = (arg0.field2422 * arg0.field2415 >> 12) + arg0.field2414;
        int var3 = ((this.field2355[arg0.field2418] - 8192) * this.field2361[arg0.field2418] >> 12) + var2;
        class142 var4 = arg0.field2419;
        if (var4.field2380 > 0 && (var4.field2386 > 0 || this.field2356[arg0.field2418] > 0)) {
            int var5 = var4.field2386 << 2;
            int var6 = var4.field2388 << 1;
            if (arg0.field2428 < var6) {
                var5 = arg0.field2428 * var5 / var6;
            }
            int var7 = (this.field2356[arg0.field2418] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2429 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2420.field1229 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1096 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ez.aq(Lew;I)I")
    public int method2725(class145 arg0) {
        class142 var2 = arg0.field2419;
        int var3 = this.field2351[arg0.field2418] * this.field2349[arg0.field2418] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2412 * var4 + 16384 >> 15;
        int var6 = this.field2347 * var5 + 128 >> 8;
        if (var2.field2381 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2421 * 1.953125E-5D * (double) var2.field2381) + 0.5D);
        }
        if (var2.field2382 != null) {
            int var7 = arg0.field2424;
            int var8 = var2.field2382[arg0.field2425 + 1];
            if (arg0.field2425 < var2.field2382.length - 2) {
                int var9 = (var2.field2382[arg0.field2425] & 0xFF) << 8;
                int var10 = (var2.field2382[arg0.field2425 + 2] & 0xFF) << 8;
                var8 += (var2.field2382[arg0.field2425 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2423 > 0 && var2.field2387 != null) {
            int var11 = arg0.field2423;
            int var12 = var2.field2387[arg0.field2427 + 1];
            if (arg0.field2427 < var2.field2387.length - 2) {
                int var13 = (var2.field2387[arg0.field2427] & 0xFF) << 8;
                int var14 = (var2.field2387[arg0.field2427 + 2] & 0xFF) << 8;
                var12 += (var2.field2387[arg0.field2427 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ez.ak(Lew;I)I")
    public int method2726(class145 arg0) {
        int var2 = this.field2354[arg0.field2418];
        return var2 < 8192 ? arg0.field2413 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2413) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ez.y()Lax;")
    public synchronized class48 method935() {
        return this.field2373;
    }

    @ObfuscatedName("ez.q()Lax;")
    public synchronized class48 method1044() {
        return null;
    }

    @ObfuscatedName("ez.c()I")
    public synchronized int method946() {
        return 0;
    }

    @ObfuscatedName("ez.u([III)V")
    public synchronized void method957(int[] arg0, int arg1, int arg2) {
        if (this.field2353.method2869()) {
            int var4 = this.field2348 * this.field2353.field2401 / Statics.field1096;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2371;
                if (this.field2368 - var5 >= 0L) {
                    this.field2371 = var5;
                    break;
                }
                int var7 = (int) ((this.field2368 - this.field2371 + (long) var4 - 1L) / (long) var4);
                this.field2371 += (long) var4 * (long) var7;
                this.field2373.method957(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2728();
            } while (this.field2353.method2869());
        }
        this.field2373.method957(arg0, arg1, arg2);
    }

    @ObfuscatedName("ez.ah(I)V")
    public synchronized void method958(int arg0) {
        if (this.field2353.method2869()) {
            int var2 = this.field2348 * this.field2353.field2401 / Statics.field1096;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2371;
                if (this.field2368 - var3 >= 0L) {
                    this.field2371 = var3;
                    break;
                }
                int var5 = (int) ((this.field2368 - this.field2371 + (long) var2 - 1L) / (long) var2);
                this.field2371 += (long) var2 * (long) var5;
                this.field2373.method958(var5);
                arg0 -= var5;
                this.method2728();
            } while (this.field2353.method2869());
        }
        this.field2373.method958(arg0);
    }

    @ObfuscatedName("ez.ad(I)V")
    public void method2728() {
        int var1 = this.field2369;
        int var2 = this.field2377;
        long var3 = this.field2368;
        while (this.field2377 == var2) {
            while (this.field2353.field2402[var1] == var2) {
                this.field2353.method2828(var1);
                int var5 = this.field2353.method2840(var1);
                if (var5 == 1) {
                    this.field2353.method2830();
                    this.field2353.method2829(var1);
                    if (this.field2353.method2826()) {
                        if (!this.field2362 || var2 == 0) {
                            this.method2711();
                            this.field2353.method2867();
                            return;
                        }
                        this.field2353.method2837(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2722(var5);
                }
                this.field2353.method2831(var1);
                this.field2353.method2829(var1);
            }
            var1 = this.field2353.method2835();
            var2 = this.field2353.field2402[var1];
            var3 = this.field2353.method2834(var2);
        }
        this.field2369 = var1;
        this.field2377 = var2;
        this.field2368 = var3;
    }

    @ObfuscatedName("ez.at(Lew;I)Z")
    public boolean method2729(class145 arg0) {
        if (arg0.field2430 != null) {
            return false;
        }
        if (arg0.field2423 >= 0) {
            arg0.method3346();
            if (arg0.field2416 > 0 && this.field2366[arg0.field2418][arg0.field2416] == arg0) {
                this.field2366[arg0.field2418][arg0.field2416] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ez.an(Lew;[IIII)Z")
    public boolean method2730(class145 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2431 = Statics.field1096 / 100;
        if (arg0.field2423 >= 0 && arg0.field2430 == null || arg0.field2430.method952()) {
            arg0.method2878();
            arg0.method3346();
            if (arg0.field2416 > 0 && this.field2366[arg0.field2418][arg0.field2416] == arg0) {
                this.field2366[arg0.field2418][arg0.field2416] = null;
            }
            return true;
        }
        int var5 = arg0.field2422;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2357[arg0.field2418] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2422 = var6;
        }
        arg0.field2430.method963(this.method2724(arg0));
        class142 var7 = arg0.field2419;
        boolean var8 = false;
        arg0.field2428++;
        arg0.field2429 += var7.field2380;
        double var9 = (double) ((arg0.field2417 - 60 << 8) + (arg0.field2422 * arg0.field2415 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2381 > 0) {
            if (var7.field2385 > 0) {
                arg0.field2421 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2385 * var9) + 0.5D);
            } else {
                arg0.field2421 += 128;
            }
        }
        if (var7.field2382 != null) {
            if (var7.field2383 > 0) {
                arg0.field2424 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2383 * var9) + 0.5D);
            } else {
                arg0.field2424 += 128;
            }
            while (arg0.field2425 < var7.field2382.length - 2 && arg0.field2424 > (var7.field2382[arg0.field2425 + 2] & 0xFF) << 8) {
                arg0.field2425 += 2;
            }
            if (arg0.field2425 == var7.field2382.length - 2 && var7.field2382[arg0.field2425 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2423 >= 0 && var7.field2387 != null && (this.field2359[arg0.field2418] & 0x1) == 0 && (arg0.field2416 < 0 || this.field2366[arg0.field2418][arg0.field2416] != arg0)) {
            if (var7.field2384 > 0) {
                arg0.field2423 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2384 * var9) + 0.5D);
            } else {
                arg0.field2423 += 128;
            }
            while (arg0.field2427 < var7.field2387.length - 2 && arg0.field2423 > (var7.field2387[arg0.field2427 + 2] & 0xFF) << 8) {
                arg0.field2427 += 2;
            }
            if (arg0.field2427 == var7.field2387.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2430.method993(arg0.field2431, this.method2725(arg0), this.method2726(arg0));
            return false;
        }
        arg0.field2430.method949(arg0.field2431);
        if (arg1 == null) {
            arg0.field2430.method958(arg3);
        } else {
            arg0.field2430.method957(arg1, arg2, arg3);
        }
        if (arg0.field2430.method953()) {
            this.field2373.field2395.method1103(arg0.field2430);
        }
        arg0.method2878();
        if (arg0.field2423 >= 0) {
            arg0.method3346();
            if (arg0.field2416 > 0 && this.field2366[arg0.field2418][arg0.field2416] == arg0) {
                this.field2366[arg0.field2418][arg0.field2416] = null;
            }
        }
        return true;
    }
}
