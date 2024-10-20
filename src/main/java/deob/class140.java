package deob;

@ObfuscatedName("en")
public class class140 extends class47 {

    @ObfuscatedName("en.u")
    public class174 field2360 = new class174(128);

    @ObfuscatedName("en.k")
    public int field2349 = 256;

    @ObfuscatedName("en.x")
    public int field2350 = 1000000;

    @ObfuscatedName("en.m")
    public int[] field2351 = new int[16];

    @ObfuscatedName("en.n")
    public int[] field2352 = new int[16];

    @ObfuscatedName("en.q")
    public int[] field2353 = new int[16];

    @ObfuscatedName("en.a")
    public int[] field2354 = new int[16];

    @ObfuscatedName("en.g")
    public int[] field2355 = new int[16];

    @ObfuscatedName("en.j")
    public int[] field2376 = new int[16];

    @ObfuscatedName("en.l")
    public int[] field2357 = new int[16];

    @ObfuscatedName("en.z")
    public int[] field2361 = new int[16];

    @ObfuscatedName("en.e")
    public int[] field2359 = new int[16];

    @ObfuscatedName("en.s")
    public int[] field2369 = new int[16];

    @ObfuscatedName("en.f")
    public int[] field2358 = new int[16];

    @ObfuscatedName("en.y")
    public int[] field2348 = new int[16];

    @ObfuscatedName("en.t")
    public int[] field2363 = new int[16];

    @ObfuscatedName("en.r")
    public int[] field2364 = new int[16];

    @ObfuscatedName("en.p")
    public int[] field2370 = new int[16];

    @ObfuscatedName("en.o")
    public class144[][] field2366 = new class144[16][128];

    @ObfuscatedName("en.ax")
    public class144[][] field2367 = new class144[16][128];

    @ObfuscatedName("en.aa")
    public class143 field2368 = new class143();

    @ObfuscatedName("en.af")
    public boolean field2373;

    @ObfuscatedName("en.al")
    public int field2371;

    @ObfuscatedName("en.av")
    public int field2362;

    @ObfuscatedName("en.ab")
    public long field2372;

    @ObfuscatedName("en.ad")
    public long field2365;

    @ObfuscatedName("en.ai")
    public class142 field2374 = new class142(this);

    public class140() {
        this.method2765();
    }

    @ObfuscatedName("en.u(IB)V")
    public synchronized void method2718(int arg0) {
        this.field2349 = arg0;
    }

    @ObfuscatedName("en.k(I)I")
    public int method2781() {
        return this.field2349;
    }

    @ObfuscatedName("en.m(Lej;Leb;Lbl;II)Z")
    public synchronized boolean method2720(class138 arg0, class151 arg1, class57 arg2, int arg3) {
        arg0.method2694();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class175 var7 = (class175) arg0.field2335.method3308(); var7 != null; var7 = (class175) arg0.field2335.method3309()) {
            int var8 = (int) var7.field2808;
            class139 var9 = (class139) this.field2360.method3311((long) var8);
            if (var9 == null) {
                var9 = class139.method2037(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2360.method3317(var9, (long) var8);
            }
            if (!var9.method2704(arg2, var7.field2801, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2695();
        }
        return var5;
    }

    @ObfuscatedName("en.n(B)V")
    public synchronized void method2719() {
        for (class139 var1 = (class139) this.field2360.method3308(); var1 != null; var1 = (class139) this.field2360.method3309()) {
            var1.method2708();
        }
    }

    @ObfuscatedName("en.q(I)V")
    public synchronized void method2722() {
        for (class139 var1 = (class139) this.field2360.method3308(); var1 != null; var1 = (class139) this.field2360.method3309()) {
            var1.method3357();
        }
    }

    @ObfuscatedName("en.a(Lej;ZI)V")
    public synchronized void method2724(class138 arg0, boolean arg1) {
        this.method2723();
        this.field2368.method2824(arg0.field2336);
        this.field2373 = arg1;
        this.field2372 = 0L;
        int var3 = this.field2368.method2848();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2368.method2828(var4);
            this.field2368.method2831(var4);
            this.field2368.method2829(var4);
        }
        this.field2371 = this.field2368.method2837();
        this.field2362 = this.field2368.field2396[this.field2371];
        this.field2365 = this.field2368.method2823(this.field2362);
    }

    @ObfuscatedName("en.g(B)V")
    public synchronized void method2723() {
        this.field2368.method2825();
        this.method2765();
    }

    @ObfuscatedName("en.j(S)Z")
    public synchronized boolean method2721() {
        return this.field2368.method2826();
    }

    @ObfuscatedName("en.l(III)V")
    public synchronized void method2725(int arg0, int arg1) {
        this.method2726(arg0, arg1);
    }

    @ObfuscatedName("en.w(III)V")
    public void method2726(int arg0, int arg1) {
        this.field2354[arg0] = arg1;
        this.field2376[arg0] = arg1 & 0xFFFFFF80;
        this.method2810(arg0, arg1);
    }

    @ObfuscatedName("en.z(III)V")
    public void method2810(int arg0, int arg1) {
        if (this.field2355[arg0] != arg1) {
            this.field2355[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2367[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("en.e(IIII)V")
    public void method2728(int arg0, int arg1, int arg2) {
        this.method2730(arg0, arg1, 64);
        if ((this.field2369[arg0] & 0x2) != 0) {
            for (class144 var4 = (class144) this.field2374.field2387.method3354(); var4 != null; var4 = (class144) this.field2374.field2387.method3331()) {
                if (var4.field2415 == arg0 && var4.field2422 < 0) {
                    this.field2366[arg0][var4.field2416] = null;
                    this.field2366[arg0][arg1] = var4;
                    int var5 = (var4.field2421 * var4.field2417 >> 12) + var4.field2426;
                    var4.field2426 += arg1 - var4.field2416 << 8;
                    var4.field2417 = var5 - var4.field2426;
                    var4.field2421 = 4096;
                    var4.field2416 = arg1;
                    return;
                }
            }
        }
        class139 var6 = (class139) this.field2360.method3311((long) this.field2355[arg0]);
        if (var6 == null) {
            return;
        }
        class62 var7 = var6.field2339[arg1];
        if (var7 == null) {
            return;
        }
        class144 var8 = new class144();
        var8.field2415 = arg0;
        var8.field2409 = var6;
        var8.field2410 = var7;
        var8.field2434 = var6.field2342[arg1];
        var8.field2408 = var6.field2337[arg1];
        var8.field2416 = arg1;
        var8.field2414 = var6.field2347 * arg2 * arg2 * var6.field2340[arg1] + 1024 >> 11;
        var8.field2413 = var6.field2341[arg1] & 0xFF;
        var8.field2426 = (arg1 << 8) - (var6.field2343[arg1] & 0x7FFF);
        var8.field2419 = 0;
        var8.field2420 = 0;
        var8.field2418 = 0;
        var8.field2422 = -1;
        var8.field2423 = 0;
        if (this.field2363[arg0] == 0) {
            var8.field2412 = class44.method946(var7, this.method2742(var8), this.method2774(var8), this.method2760(var8));
        } else {
            var8.field2412 = class44.method946(var7, this.method2742(var8), 0, this.method2760(var8));
            this.method2729(var8, var6.field2343[arg1] < 0);
        }
        if (var6.field2343[arg1] < 0) {
            var8.field2412.method948(-1);
        }
        if (var8.field2408 >= 0) {
            class144 var9 = this.field2367[arg0][var8.field2408];
            if (var9 != null && var9.field2422 < 0) {
                this.field2366[arg0][var9.field2416] = null;
                var9.field2422 = 0;
            }
            this.field2367[arg0][var8.field2408] = var8;
        }
        this.field2374.field2387.method3323(var8);
        this.field2366[arg0][arg1] = var8;
    }

    @ObfuscatedName("en.b(Lex;ZI)V")
    public void method2729(class144 arg0, boolean arg1) {
        int var3 = arg0.field2410.field1224.length;
        int var5;
        if (arg1 && arg0.field2410.field1226) {
            int var4 = var3 + var3 - arg0.field2410.field1223;
            var5 = (int) ((long) this.field2363[arg0.field2415] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2412.method955(true);
            }
        } else {
            var5 = (int) ((long) this.field2363[arg0.field2415] * (long) var3 >> 6);
        }
        arg0.field2412.method954(var5);
    }

    @ObfuscatedName("en.c(IIII)V")
    public void method2730(int arg0, int arg1, int arg2) {
        class144 var4 = this.field2366[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2366[arg0][arg1] = null;
        if ((this.field2369[arg0] & 0x2) == 0) {
            var4.field2422 = 0;
            return;
        }
        for (class144 var5 = (class144) this.field2374.field2387.method3326(); var5 != null; var5 = (class144) this.field2374.field2387.method3330()) {
            if (var4.field2415 == var5.field2415 && var5.field2422 < 0 && var4 != var5) {
                var4.field2422 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("en.d(IIIS)V")
    public void method2731(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("en.h(III)V")
    public void method2732(int arg0, int arg1) {
    }

    @ObfuscatedName("en.i(III)V")
    public void method2782(int arg0, int arg1) {
        this.field2357[arg0] = arg1;
    }

    @ObfuscatedName("en.v(II)V")
    public void method2734(int arg0) {
        for (class144 var2 = (class144) this.field2374.field2387.method3326(); var2 != null; var2 = (class144) this.field2374.field2387.method3330()) {
            if (arg0 < 0 || var2.field2415 == arg0) {
                if (var2.field2412 != null) {
                    var2.field2412.method959(Statics.field1083 / 100);
                    if (var2.field2412.method963()) {
                        this.field2374.field2392.method1095(var2.field2412);
                    }
                    var2.method2876();
                }
                if (var2.field2422 < 0) {
                    this.field2366[var2.field2415][var2.field2416] = null;
                }
                var2.method3357();
            }
        }
    }

    @ObfuscatedName("en.s(II)V")
    public void method2735(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2735(var2);
            }
            return;
        }
        this.field2351[arg0] = 12800;
        this.field2352[arg0] = 8192;
        this.field2353[arg0] = 16383;
        this.field2357[arg0] = 8192;
        this.field2361[arg0] = 0;
        this.field2359[arg0] = 8192;
        this.method2738(arg0);
        this.method2739(arg0);
        this.field2369[arg0] = 0;
        this.field2358[arg0] = 32767;
        this.field2348[arg0] = 256;
        this.field2363[arg0] = 0;
        this.method2744(arg0, 8192);
    }

    @ObfuscatedName("en.f(IB)V")
    public void method2736(int arg0) {
        for (class144 var2 = (class144) this.field2374.field2387.method3326(); var2 != null; var2 = (class144) this.field2374.field2387.method3330()) {
            if ((arg0 < 0 || var2.field2415 == arg0) && var2.field2422 < 0) {
                this.field2366[var2.field2415][var2.field2416] = null;
                var2.field2422 = 0;
            }
        }
    }

    @ObfuscatedName("en.y(I)V")
    public void method2765() {
        this.method2734(-1);
        this.method2735(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2355[var1] = this.field2354[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2376[var2] = this.field2354[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("en.aa(II)V")
    public void method2738(int arg0) {
        if ((this.field2369[arg0] & 0x2) == 0) {
            return;
        }
        for (class144 var2 = (class144) this.field2374.field2387.method3326(); var2 != null; var2 = (class144) this.field2374.field2387.method3330()) {
            if (var2.field2415 == arg0 && this.field2366[arg0][var2.field2416] == null && var2.field2422 < 0) {
                var2.field2422 = 0;
            }
        }
    }

    @ObfuscatedName("en.af(II)V")
    public void method2739(int arg0) {
        if ((this.field2369[arg0] & 0x4) == 0) {
            return;
        }
        for (class144 var2 = (class144) this.field2374.field2387.method3326(); var2 != null; var2 = (class144) this.field2374.field2387.method3330()) {
            if (var2.field2415 == arg0) {
                var2.field2428 = 0;
            }
        }
    }

    @ObfuscatedName("en.al(II)V")
    public void method2740(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2730(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2728(var6, var7, var8);
            } else {
                this.method2730(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2731(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2376[var12] = (var14 << 14) + (this.field2376[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2376[var12] = (var14 << 7) + (this.field2376[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2361[var12] = (var14 << 7) + (this.field2361[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2361[var12] = (this.field2361[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2359[var12] = (var14 << 7) + (this.field2359[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2359[var12] = (this.field2359[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2351[var12] = (var14 << 7) + (this.field2351[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2351[var12] = (this.field2351[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2352[var12] = (var14 << 7) + (this.field2352[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2352[var12] = (this.field2352[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2353[var12] = (var14 << 7) + (this.field2353[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2353[var12] = (this.field2353[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2369[var12] |= 0x1;
                } else {
                    this.field2369[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2369[var12] |= 0x2;
                } else {
                    this.method2738(var12);
                    this.field2369[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2358[var12] = (var14 << 7) + (this.field2358[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2358[var12] = (this.field2358[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2358[var12] = (var14 << 7) + (this.field2358[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2358[var12] = (this.field2358[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2734(var12);
            }
            if (var13 == 121) {
                this.method2735(var12);
            }
            if (var13 == 123) {
                this.method2736(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2358[var12];
                if (var15 == 16384) {
                    this.field2348[var12] = (var14 << 7) + (this.field2348[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2358[var12];
                if (var16 == 16384) {
                    this.field2348[var12] = (this.field2348[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2363[var12] = (var14 << 7) + (this.field2363[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2363[var12] = (this.field2363[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2369[var12] |= 0x4;
                } else {
                    this.method2739(var12);
                    this.field2369[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2744(var12, (var14 << 7) + (this.field2364[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2744(var12, (this.field2364[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2810(var17, this.field2376[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2732(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method2782(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2765();
            }
        }
    }

    @ObfuscatedName("en.av(III)V")
    public void method2744(int arg0, int arg1) {
        this.field2364[arg0] = arg1;
        this.field2370[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("en.ab(Lex;I)I")
    public int method2742(class144 arg0) {
        int var2 = (arg0.field2421 * arg0.field2417 >> 12) + arg0.field2426;
        int var3 = ((this.field2357[arg0.field2415] - 8192) * this.field2348[arg0.field2415] >> 12) + var2;
        class141 var4 = arg0.field2434;
        if (var4.field2384 > 0 && (var4.field2380 > 0 || this.field2361[arg0.field2415] > 0)) {
            int var5 = var4.field2380 << 2;
            int var6 = var4.field2382 << 1;
            if (arg0.field2424 < var6) {
                var5 = arg0.field2424 * var5 / var6;
            }
            int var7 = (this.field2361[arg0.field2415] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2425 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2410.field1222 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1083 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("en.ad(Lex;B)I")
    public int method2774(class144 arg0) {
        class141 var2 = arg0.field2434;
        int var3 = this.field2353[arg0.field2415] * this.field2351[arg0.field2415] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2414 * var4 + 16384 >> 15;
        int var6 = this.field2349 * var5 + 128 >> 8;
        if (var2.field2379 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2419 * 1.953125E-5D * (double) var2.field2379) + 0.5D);
        }
        if (var2.field2383 != null) {
            int var7 = arg0.field2420;
            int var8 = var2.field2383[arg0.field2418 + 1];
            if (arg0.field2418 < var2.field2383.length - 2) {
                int var9 = (var2.field2383[arg0.field2418] & 0xFF) << 8;
                int var10 = (var2.field2383[arg0.field2418 + 2] & 0xFF) << 8;
                var8 += (var2.field2383[arg0.field2418 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2422 > 0 && var2.field2378 != null) {
            int var11 = arg0.field2422;
            int var12 = var2.field2378[arg0.field2423 + 1];
            if (arg0.field2423 < var2.field2378.length - 2) {
                int var13 = (var2.field2378[arg0.field2423] & 0xFF) << 8;
                int var14 = (var2.field2378[arg0.field2423 + 2] & 0xFF) << 8;
                var12 += (var2.field2378[arg0.field2423 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("en.ai(Lex;S)I")
    public int method2760(class144 arg0) {
        int var2 = this.field2352[arg0.field2415];
        return var2 < 8192 ? arg0.field2413 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2413) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("en.t()Lac;")
    public synchronized class47 method964() {
        return this.field2374;
    }

    @ObfuscatedName("en.r()Lac;")
    public synchronized class47 method970() {
        return null;
    }

    @ObfuscatedName("en.p()I")
    public synchronized int method1056() {
        return 0;
    }

    @ObfuscatedName("en.o([III)V")
    public synchronized void method1066(int[] arg0, int arg1, int arg2) {
        if (this.field2368.method2826()) {
            int var4 = this.field2350 * this.field2368.field2395 / Statics.field1083;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2372;
                if (this.field2365 - var5 >= 0L) {
                    this.field2372 = var5;
                    break;
                }
                int var7 = (int) ((this.field2365 - this.field2372 + (long) var4 - 1L) / (long) var4);
                this.field2372 += (long) var4 * (long) var7;
                this.field2374.method1066(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2745();
            } while (this.field2368.method2826());
        }
        this.field2374.method1066(arg0, arg1, arg2);
    }

    @ObfuscatedName("en.ax(I)V")
    public synchronized void method968(int arg0) {
        if (this.field2368.method2826()) {
            int var2 = this.field2350 * this.field2368.field2395 / Statics.field1083;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2372;
                if (this.field2365 - var3 >= 0L) {
                    this.field2372 = var3;
                    break;
                }
                int var5 = (int) ((this.field2365 - this.field2372 + (long) var2 - 1L) / (long) var2);
                this.field2372 += (long) var2 * (long) var5;
                this.field2374.method968(var5);
                arg0 -= var5;
                this.method2745();
            } while (this.field2368.method2826());
        }
        this.field2374.method968(arg0);
    }

    @ObfuscatedName("en.ak(B)V")
    public void method2745() {
        int var1 = this.field2371;
        int var2 = this.field2362;
        long var3 = this.field2365;
        while (this.field2362 == var2) {
            while (this.field2368.field2396[var1] == var2) {
                this.field2368.method2828(var1);
                int var5 = this.field2368.method2854(var1);
                if (var5 == 1) {
                    this.field2368.method2830();
                    this.field2368.method2829(var1);
                    if (this.field2368.method2835()) {
                        if (!this.field2373 || var2 == 0) {
                            this.method2765();
                            this.field2368.method2825();
                            return;
                        }
                        this.field2368.method2838(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2740(var5);
                }
                this.field2368.method2831(var1);
                this.field2368.method2829(var1);
            }
            var1 = this.field2368.method2837();
            var2 = this.field2368.field2396[var1];
            var3 = this.field2368.method2823(var2);
        }
        this.field2371 = var1;
        this.field2362 = var2;
        this.field2365 = var3;
    }

    @ObfuscatedName("en.ao(Lex;B)Z")
    public boolean method2746(class144 arg0) {
        if (arg0.field2412 != null) {
            return false;
        }
        if (arg0.field2422 >= 0) {
            arg0.method3357();
            if (arg0.field2408 > 0 && this.field2367[arg0.field2415][arg0.field2408] == arg0) {
                this.field2367[arg0.field2415][arg0.field2408] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("en.aq(Lex;[IIII)Z")
    public boolean method2747(class144 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2411 = Statics.field1083 / 100;
        if (arg0.field2422 >= 0 && arg0.field2412 == null || arg0.field2412.method962()) {
            arg0.method2876();
            arg0.method3357();
            if (arg0.field2408 > 0 && this.field2367[arg0.field2415][arg0.field2408] == arg0) {
                this.field2367[arg0.field2415][arg0.field2408] = null;
            }
            return true;
        }
        int var5 = arg0.field2421;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2359[arg0.field2415] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2421 = var6;
        }
        arg0.field2412.method960(this.method2742(arg0));
        class141 var7 = arg0.field2434;
        boolean var8 = false;
        arg0.field2424++;
        arg0.field2425 += var7.field2384;
        double var9 = (double) ((arg0.field2416 - 60 << 8) + (arg0.field2421 * arg0.field2417 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2379 > 0) {
            if (var7.field2377 > 0) {
                arg0.field2419 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2377 * var9) + 0.5D);
            } else {
                arg0.field2419 += 128;
            }
        }
        if (var7.field2383 != null) {
            if (var7.field2385 > 0) {
                arg0.field2420 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2385 * var9) + 0.5D);
            } else {
                arg0.field2420 += 128;
            }
            while (arg0.field2418 < var7.field2383.length - 2 && arg0.field2420 > (var7.field2383[arg0.field2418 + 2] & 0xFF) << 8) {
                arg0.field2418 += 2;
            }
            if (arg0.field2418 == var7.field2383.length - 2 && var7.field2383[arg0.field2418 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2422 >= 0 && var7.field2378 != null && (this.field2369[arg0.field2415] & 0x1) == 0 && (arg0.field2408 < 0 || this.field2367[arg0.field2415][arg0.field2408] != arg0)) {
            if (var7.field2381 > 0) {
                arg0.field2422 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2381 * var9) + 0.5D);
            } else {
                arg0.field2422 += 128;
            }
            while (arg0.field2423 < var7.field2378.length - 2 && arg0.field2422 > (var7.field2378[arg0.field2423 + 2] & 0xFF) << 8) {
                arg0.field2423 += 2;
            }
            if (arg0.field2423 == var7.field2378.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2412.method1037(arg0.field2411, this.method2774(arg0), this.method2760(arg0));
            return false;
        }
        arg0.field2412.method959(arg0.field2411);
        if (arg1 == null) {
            arg0.field2412.method968(arg3);
        } else {
            arg0.field2412.method1066(arg1, arg2, arg3);
        }
        if (arg0.field2412.method963()) {
            this.field2374.field2392.method1095(arg0.field2412);
        }
        arg0.method2876();
        if (arg0.field2422 >= 0) {
            arg0.method3357();
            if (arg0.field2408 > 0 && this.field2367[arg0.field2415][arg0.field2408] == arg0) {
                this.field2367[arg0.field2415][arg0.field2408] = null;
            }
        }
        return true;
    }
}
