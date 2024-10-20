package deob;

@ObfuscatedName("en")
public class class140 extends class47 {

    @ObfuscatedName("en.g")
    public class173 field2344 = new class173(128);

    @ObfuscatedName("en.e")
    public int field2334 = 256;

    @ObfuscatedName("en.n")
    public int field2335 = 1000000;

    @ObfuscatedName("en.j")
    public int[] field2336 = new int[16];

    @ObfuscatedName("en.i")
    public int[] field2337 = new int[16];

    @ObfuscatedName("en.o")
    public int[] field2338 = new int[16];

    @ObfuscatedName("en.l")
    public int[] field2339 = new int[16];

    @ObfuscatedName("en.p")
    public int[] field2359 = new int[16];

    @ObfuscatedName("en.t")
    public int[] field2340 = new int[16];

    @ObfuscatedName("en.r")
    public int[] field2342 = new int[16];

    @ObfuscatedName("en.a")
    public int[] field2343 = new int[16];

    @ObfuscatedName("en.q")
    public int[] field2357 = new int[16];

    @ObfuscatedName("en.b")
    public int[] field2341 = new int[16];

    @ObfuscatedName("en.h")
    public int[] field2346 = new int[16];

    @ObfuscatedName("en.f")
    public int[] field2347 = new int[16];

    @ObfuscatedName("en.v")
    public int[] field2353 = new int[16];

    @ObfuscatedName("en.u")
    public int[] field2333 = new int[16];

    @ObfuscatedName("en.k")
    public int[] field2350 = new int[16];

    @ObfuscatedName("en.c")
    public class144[][] field2351 = new class144[16][128];

    @ObfuscatedName("en.al")
    public class144[][] field2352 = new class144[16][128];

    @ObfuscatedName("en.ai")
    public class143 field2349 = new class143();

    @ObfuscatedName("en.ad")
    public boolean field2345;

    @ObfuscatedName("en.aw")
    public int field2355;

    @ObfuscatedName("en.af")
    public int field2358;

    @ObfuscatedName("en.an")
    public long field2354;

    @ObfuscatedName("en.ao")
    public long field2348;

    @ObfuscatedName("en.ak")
    public class142 field2356 = new class142(this);

    public class140() {
        this.method2790();
    }

    @ObfuscatedName("en.g(II)V")
    public synchronized void method2771(int arg0) {
        this.field2334 = arg0;
    }

    @ObfuscatedName("en.e(I)I")
    public int method2791() {
        return this.field2334;
    }

    @ObfuscatedName("en.j(Lel;Lez;Lbb;II)Z")
    public synchronized boolean method2773(class138 arg0, class150 arg1, class57 arg2, int arg3) {
        arg0.method2746();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class174 var7 = (class174) arg0.field2321.method3357(); var7 != null; var7 = (class174) arg0.field2321.method3372()) {
            int var8 = (int) var7.field2760;
            class139 var9 = (class139) this.field2344.method3354((long) var8);
            if (var9 == null) {
                var9 = class139.method2226(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2344.method3353(var9, (long) var8);
            }
            if (!var9.method2759(arg2, var7.field2755, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2748();
        }
        return var5;
    }

    @ObfuscatedName("en.i(I)V")
    public synchronized void method2774() {
        for (class139 var1 = (class139) this.field2344.method3357(); var1 != null; var1 = (class139) this.field2344.method3372()) {
            var1.method2758();
        }
    }

    @ObfuscatedName("en.o(B)V")
    public synchronized void method2775() {
        for (class139 var1 = (class139) this.field2344.method3357(); var1 != null; var1 = (class139) this.field2344.method3372()) {
            var1.method3415();
        }
    }

    @ObfuscatedName("en.l(Lel;ZI)V")
    public synchronized void method2804(class138 arg0, boolean arg1) {
        this.method2776();
        this.field2349.method2900(arg0.field2322);
        this.field2345 = arg1;
        this.field2354 = 0L;
        int var3 = this.field2349.method2903();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2349.method2904(var4);
            this.field2349.method2907(var4);
            this.field2349.method2905(var4);
        }
        this.field2355 = this.field2349.method2936();
        this.field2358 = this.field2349.field2385[this.field2355];
        this.field2348 = this.field2349.method2911(this.field2358);
    }

    @ObfuscatedName("en.p(I)V")
    public synchronized void method2776() {
        this.field2349.method2901();
        this.method2790();
    }

    @ObfuscatedName("en.t(I)Z")
    public synchronized boolean method2777() {
        return this.field2349.method2902();
    }

    @ObfuscatedName("en.w(IIB)V")
    public synchronized void method2778(int arg0, int arg1) {
        this.method2793(arg0, arg1);
    }

    @ObfuscatedName("en.r(III)V")
    public void method2793(int arg0, int arg1) {
        this.field2339[arg0] = arg1;
        this.field2340[arg0] = arg1 & 0xFFFFFF80;
        this.method2780(arg0, arg1);
    }

    @ObfuscatedName("en.a(III)V")
    public void method2780(int arg0, int arg1) {
        if (this.field2359[arg0] != arg1) {
            this.field2359[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2352[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("en.q(IIIS)V")
    public void method2781(int arg0, int arg1, int arg2) {
        this.method2779(arg0, arg1, 64);
        if ((this.field2341[arg0] & 0x2) != 0) {
            for (class144 var4 = (class144) this.field2356.field2376.method3407(); var4 != null; var4 = (class144) this.field2356.field2376.method3385()) {
                if (var4.field2418 == arg0 && var4.field2409 < 0) {
                    this.field2351[arg0][var4.field2400] = null;
                    this.field2351[arg0][arg1] = var4;
                    int var5 = (var4.field2404 * var4.field2395 >> 12) + var4.field2413;
                    var4.field2413 += arg1 - var4.field2400 << 8;
                    var4.field2404 = var5 - var4.field2413;
                    var4.field2395 = 4096;
                    var4.field2400 = arg1;
                    return;
                }
            }
        }
        class139 var6 = (class139) this.field2344.method3354((long) this.field2359[arg0]);
        if (var6 == null) {
            return;
        }
        class62 var7 = var6.field2324[arg1];
        if (var7 == null) {
            return;
        }
        class144 var8 = new class144();
        var8.field2418 = arg0;
        var8.field2405 = var6;
        var8.field2417 = var7;
        var8.field2398 = var6.field2328[arg1];
        var8.field2399 = var6.field2329[arg1];
        var8.field2400 = arg1;
        var8.field2397 = var6.field2326 * arg2 * arg2 * var6.field2331[arg1] + 1024 >> 11;
        var8.field2396 = var6.field2327[arg1] & 0xFF;
        var8.field2413 = (arg1 << 8) - (var6.field2325[arg1] & 0x7FFF);
        var8.field2406 = 0;
        var8.field2403 = 0;
        var8.field2408 = 0;
        var8.field2409 = -1;
        var8.field2410 = 0;
        if (this.field2353[arg0] == 0) {
            var8.field2407 = class44.method952(var7, this.method2795(var8), this.method2796(var8), this.method2798(var8));
        } else {
            var8.field2407 = class44.method952(var7, this.method2795(var8), 0, this.method2798(var8));
            this.method2782(var8, var6.field2325[arg1] < 0);
        }
        if (var6.field2325[arg1] < 0) {
            var8.field2407.method954(-1);
        }
        if (var8.field2399 >= 0) {
            class144 var9 = this.field2352[arg0][var8.field2399];
            if (var9 != null && var9.field2409 < 0) {
                this.field2351[arg0][var9.field2400] = null;
                var9.field2409 = 0;
            }
            this.field2352[arg0][var8.field2399] = var8;
        }
        this.field2356.field2376.method3379(var8);
        this.field2351[arg0][arg1] = var8;
    }

    @ObfuscatedName("en.z(Lem;ZB)V")
    public void method2782(class144 arg0, boolean arg1) {
        int var3 = arg0.field2417.field1221.length;
        int var5;
        if (arg1 && arg0.field2417.field1220) {
            int var4 = var3 + var3 - arg0.field2417.field1222;
            var5 = (int) ((long) this.field2353[arg0.field2418] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2407.method961(true);
            }
        } else {
            var5 = (int) ((long) this.field2353[arg0.field2418] * (long) var3 >> 6);
        }
        arg0.field2407.method960(var5);
    }

    @ObfuscatedName("en.d(IIIS)V")
    public void method2779(int arg0, int arg1, int arg2) {
        class144 var4 = this.field2351[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2351[arg0][arg1] = null;
        if ((this.field2341[arg0] & 0x2) == 0) {
            var4.field2409 = 0;
            return;
        }
        for (class144 var5 = (class144) this.field2356.field2376.method3382(); var5 != null; var5 = (class144) this.field2356.field2376.method3388()) {
            if (var4.field2418 == var5.field2418 && var5.field2409 < 0 && var4 != var5) {
                var4.field2409 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("en.x(IIIB)V")
    public void method2784(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("en.s(IIS)V")
    public void method2785(int arg0, int arg1) {
    }

    @ObfuscatedName("en.m(III)V")
    public void method2786(int arg0, int arg1) {
        this.field2342[arg0] = arg1;
    }

    @ObfuscatedName("en.y(II)V")
    public void method2787(int arg0) {
        for (class144 var2 = (class144) this.field2356.field2376.method3382(); var2 != null; var2 = (class144) this.field2356.field2376.method3388()) {
            if (arg0 < 0 || var2.field2418 == arg0) {
                if (var2.field2407 != null) {
                    var2.field2407.method1084(Statics.field1989 / 100);
                    if (var2.field2407.method969()) {
                        this.field2356.field2378.method1107(var2.field2407);
                    }
                    var2.method2947();
                }
                if (var2.field2409 < 0) {
                    this.field2351[var2.field2418][var2.field2400] = null;
                }
                var2.method3415();
            }
        }
    }

    @ObfuscatedName("en.b(IB)V")
    public void method2788(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2788(var2);
            }
            return;
        }
        this.field2336[arg0] = 12800;
        this.field2337[arg0] = 8192;
        this.field2338[arg0] = 16383;
        this.field2342[arg0] = 8192;
        this.field2343[arg0] = 0;
        this.field2357[arg0] = 8192;
        this.method2863(arg0);
        this.method2817(arg0);
        this.field2341[arg0] = 0;
        this.field2346[arg0] = 32767;
        this.field2347[arg0] = 256;
        this.field2353[arg0] = 0;
        this.method2794(arg0, 8192);
    }

    @ObfuscatedName("en.h(II)V")
    public void method2789(int arg0) {
        for (class144 var2 = (class144) this.field2356.field2376.method3382(); var2 != null; var2 = (class144) this.field2356.field2376.method3388()) {
            if ((arg0 < 0 || var2.field2418 == arg0) && var2.field2409 < 0) {
                this.field2351[var2.field2418][var2.field2400] = null;
                var2.field2409 = 0;
            }
        }
    }

    @ObfuscatedName("en.f(I)V")
    public void method2790() {
        this.method2787(-1);
        this.method2788(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2359[var1] = this.field2339[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2340[var2] = this.field2339[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("en.ai(II)V")
    public void method2863(int arg0) {
        if ((this.field2341[arg0] & 0x2) == 0) {
            return;
        }
        for (class144 var2 = (class144) this.field2356.field2376.method3382(); var2 != null; var2 = (class144) this.field2356.field2376.method3388()) {
            if (var2.field2418 == arg0 && this.field2351[arg0][var2.field2400] == null && var2.field2409 < 0) {
                var2.field2409 = 0;
            }
        }
    }

    @ObfuscatedName("en.ad(II)V")
    public void method2817(int arg0) {
        if ((this.field2341[arg0] & 0x4) == 0) {
            return;
        }
        for (class144 var2 = (class144) this.field2356.field2376.method3382(); var2 != null; var2 = (class144) this.field2356.field2376.method3388()) {
            if (var2.field2418 == arg0) {
                var2.field2416 = 0;
            }
        }
    }

    @ObfuscatedName("en.aw(II)V")
    public void method2887(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2779(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2781(var6, var7, var8);
            } else {
                this.method2779(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2784(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2340[var12] = (var14 << 14) + (this.field2340[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2340[var12] = (var14 << 7) + (this.field2340[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2343[var12] = (var14 << 7) + (this.field2343[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2343[var12] = (this.field2343[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2357[var12] = (var14 << 7) + (this.field2357[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2357[var12] = (this.field2357[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2336[var12] = (var14 << 7) + (this.field2336[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2336[var12] = (this.field2336[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2337[var12] = (var14 << 7) + (this.field2337[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2337[var12] = (this.field2337[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2338[var12] = (var14 << 7) + (this.field2338[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2338[var12] = (this.field2338[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2341[var12] |= 0x1;
                } else {
                    this.field2341[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2341[var12] |= 0x2;
                } else {
                    this.method2863(var12);
                    this.field2341[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2346[var12] = (var14 << 7) + (this.field2346[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2346[var12] = (this.field2346[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2346[var12] = (var14 << 7) + (this.field2346[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2346[var12] = (this.field2346[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2787(var12);
            }
            if (var13 == 121) {
                this.method2788(var12);
            }
            if (var13 == 123) {
                this.method2789(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2346[var12];
                if (var15 == 16384) {
                    this.field2347[var12] = (var14 << 7) + (this.field2347[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2346[var12];
                if (var16 == 16384) {
                    this.field2347[var12] = (this.field2347[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2353[var12] = (var14 << 7) + (this.field2353[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2353[var12] = (this.field2353[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2341[var12] |= 0x4;
                } else {
                    this.method2817(var12);
                    this.field2341[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2794(var12, (var14 << 7) + (this.field2333[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2794(var12, (this.field2333[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2780(var17, this.field2340[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2785(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method2786(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2790();
            }
        }
    }

    @ObfuscatedName("en.af(IIB)V")
    public void method2794(int arg0, int arg1) {
        this.field2333[arg0] = arg1;
        this.field2350[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("en.an(Lem;B)I")
    public int method2795(class144 arg0) {
        int var2 = (arg0.field2404 * arg0.field2395 >> 12) + arg0.field2413;
        int var3 = ((this.field2342[arg0.field2418] - 8192) * this.field2347[arg0.field2418] >> 12) + var2;
        class141 var4 = arg0.field2398;
        if (var4.field2367 > 0 && (var4.field2364 > 0 || this.field2343[arg0.field2418] > 0)) {
            int var5 = var4.field2364 << 2;
            int var6 = var4.field2365 << 1;
            if (arg0.field2411 < var6) {
                var5 = arg0.field2411 * var5 / var6;
            }
            int var7 = (this.field2343[arg0.field2418] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2412 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2417.field1224 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1989 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("en.ao(Lem;I)I")
    public int method2796(class144 arg0) {
        class141 var2 = arg0.field2398;
        int var3 = this.field2338[arg0.field2418] * this.field2336[arg0.field2418] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2397 * var4 + 16384 >> 15;
        int var6 = this.field2334 * var5 + 128 >> 8;
        if (var2.field2362 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2406 * 1.953125E-5D * (double) var2.field2362) + 0.5D);
        }
        if (var2.field2366 != null) {
            int var7 = arg0.field2403;
            int var8 = var2.field2366[arg0.field2408 + 1];
            if (arg0.field2408 < var2.field2366.length - 2) {
                int var9 = (var2.field2366[arg0.field2408] & 0xFF) << 8;
                int var10 = (var2.field2366[arg0.field2408 + 2] & 0xFF) << 8;
                var8 += (var2.field2366[arg0.field2408 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2409 > 0 && var2.field2363 != null) {
            int var11 = arg0.field2409;
            int var12 = var2.field2363[arg0.field2410 + 1];
            if (arg0.field2410 < var2.field2363.length - 2) {
                int var13 = (var2.field2363[arg0.field2410] & 0xFF) << 8;
                int var14 = (var2.field2363[arg0.field2410 + 2] & 0xFF) << 8;
                var12 += (var2.field2363[arg0.field2410 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("en.ak(Lem;B)I")
    public int method2798(class144 arg0) {
        int var2 = this.field2337[arg0.field2418];
        return var2 < 8192 ? arg0.field2396 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2396) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("en.v()Laz;")
    public synchronized class47 method1030() {
        return this.field2356;
    }

    @ObfuscatedName("en.u()Laz;")
    public synchronized class47 method971() {
        return null;
    }

    @ObfuscatedName("en.k()I")
    public synchronized int method972() {
        return 0;
    }

    @ObfuscatedName("en.c([III)V")
    public synchronized void method973(int[] arg0, int arg1, int arg2) {
        if (this.field2349.method2902()) {
            int var4 = this.field2335 * this.field2349.field2390 / Statics.field1989;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2354;
                if (this.field2348 - var5 >= 0L) {
                    this.field2354 = var5;
                    break;
                }
                int var7 = (int) ((this.field2348 - this.field2354 + (long) var4 - 1L) / (long) var4);
                this.field2354 += (long) var4 * (long) var7;
                this.field2356.method973(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2845();
            } while (this.field2349.method2902());
        }
        this.field2356.method973(arg0, arg1, arg2);
    }

    @ObfuscatedName("en.al(I)V")
    public synchronized void method974(int arg0) {
        if (this.field2349.method2902()) {
            int var2 = this.field2335 * this.field2349.field2390 / Statics.field1989;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2354;
                if (this.field2348 - var3 >= 0L) {
                    this.field2354 = var3;
                    break;
                }
                int var5 = (int) ((this.field2348 - this.field2354 + (long) var2 - 1L) / (long) var2);
                this.field2354 += (long) var2 * (long) var5;
                this.field2356.method974(var5);
                arg0 -= var5;
                this.method2845();
            } while (this.field2349.method2902());
        }
        this.field2356.method974(arg0);
    }

    @ObfuscatedName("en.ah(I)V")
    public void method2845() {
        int var1 = this.field2355;
        int var2 = this.field2358;
        long var3 = this.field2348;
        while (this.field2358 == var2) {
            while (this.field2349.field2385[var1] == var2) {
                this.field2349.method2904(var1);
                int var5 = this.field2349.method2908(var1);
                if (var5 == 1) {
                    this.field2349.method2906();
                    this.field2349.method2905(var1);
                    if (this.field2349.method2913()) {
                        if (!this.field2345 || var2 == 0) {
                            this.method2790();
                            this.field2349.method2901();
                            return;
                        }
                        this.field2349.method2914(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2887(var5);
                }
                this.field2349.method2907(var1);
                this.field2349.method2905(var1);
            }
            var1 = this.field2349.method2936();
            var2 = this.field2349.field2385[var1];
            var3 = this.field2349.method2911(var2);
        }
        this.field2355 = var1;
        this.field2358 = var2;
        this.field2348 = var3;
    }

    @ObfuscatedName("en.aq(Lem;B)Z")
    public boolean method2800(class144 arg0) {
        if (arg0.field2407 != null) {
            return false;
        }
        if (arg0.field2409 >= 0) {
            arg0.method3415();
            if (arg0.field2399 > 0 && this.field2352[arg0.field2418][arg0.field2399] == arg0) {
                this.field2352[arg0.field2418][arg0.field2399] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("en.ax(Lem;[IIII)Z")
    public boolean method2801(class144 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2414 = Statics.field1989 / 100;
        if (arg0.field2409 >= 0 && arg0.field2407 == null || arg0.field2407.method968()) {
            arg0.method2947();
            arg0.method3415();
            if (arg0.field2399 > 0 && this.field2352[arg0.field2418][arg0.field2399] == arg0) {
                this.field2352[arg0.field2418][arg0.field2399] = null;
            }
            return true;
        }
        int var5 = arg0.field2395;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2357[arg0.field2418] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2395 = var6;
        }
        arg0.field2407.method1026(this.method2795(arg0));
        class141 var7 = arg0.field2398;
        boolean var8 = false;
        arg0.field2411++;
        arg0.field2412 += var7.field2367;
        double var9 = (double) ((arg0.field2400 - 60 << 8) + (arg0.field2404 * arg0.field2395 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2362 > 0) {
            if (var7.field2368 > 0) {
                arg0.field2406 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2368 * var9) + 0.5D);
            } else {
                arg0.field2406 += 128;
            }
        }
        if (var7.field2366 != null) {
            if (var7.field2360 > 0) {
                arg0.field2403 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2360 * var9) + 0.5D);
            } else {
                arg0.field2403 += 128;
            }
            while (arg0.field2408 < var7.field2366.length - 2 && arg0.field2403 > (var7.field2366[arg0.field2408 + 2] & 0xFF) << 8) {
                arg0.field2408 += 2;
            }
            if (arg0.field2408 == var7.field2366.length - 2 && var7.field2366[arg0.field2408 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2409 >= 0 && var7.field2363 != null && (this.field2341[arg0.field2418] & 0x1) == 0 && (arg0.field2399 < 0 || this.field2352[arg0.field2418][arg0.field2399] != arg0)) {
            if (var7.field2361 > 0) {
                arg0.field2409 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2361 * var9) + 0.5D);
            } else {
                arg0.field2409 += 128;
            }
            while (arg0.field2410 < var7.field2363.length - 2 && arg0.field2409 > (var7.field2363[arg0.field2410 + 2] & 0xFF) << 8) {
                arg0.field2410 += 2;
            }
            if (arg0.field2410 == var7.field2363.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2407.method964(arg0.field2414, this.method2796(arg0), this.method2798(arg0));
            return false;
        }
        arg0.field2407.method1084(arg0.field2414);
        if (arg1 == null) {
            arg0.field2407.method974(arg3);
        } else {
            arg0.field2407.method973(arg1, arg2, arg3);
        }
        if (arg0.field2407.method969()) {
            this.field2356.field2378.method1107(arg0.field2407);
        }
        arg0.method2947();
        if (arg0.field2409 >= 0) {
            arg0.method3415();
            if (arg0.field2399 > 0 && this.field2352[arg0.field2418][arg0.field2399] == arg0) {
                this.field2352[arg0.field2418][arg0.field2399] = null;
            }
        }
        return true;
    }
}
