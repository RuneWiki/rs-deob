package deob;

@ObfuscatedName("ev")
public class class140 extends class47 {

    @ObfuscatedName("ev.c")
    public class173 field2353 = new class173(128);

    @ObfuscatedName("ev.j")
    public int field2338 = 256;

    @ObfuscatedName("ev.f")
    public int field2339 = 1000000;

    @ObfuscatedName("ev.y")
    public int[] field2340 = new int[16];

    @ObfuscatedName("ev.x")
    public int[] field2364 = new int[16];

    @ObfuscatedName("ev.e")
    public int[] field2345 = new int[16];

    @ObfuscatedName("ev.m")
    public int[] field2343 = new int[16];

    @ObfuscatedName("ev.s")
    public int[] field2344 = new int[16];

    @ObfuscatedName("ev.p")
    public int[] field2342 = new int[16];

    @ObfuscatedName("ev.r")
    public int[] field2346 = new int[16];

    @ObfuscatedName("ev.n")
    public int[] field2347 = new int[16];

    @ObfuscatedName("ev.b")
    public int[] field2361 = new int[16];

    @ObfuscatedName("ev.a")
    public int[] field2348 = new int[16];

    @ObfuscatedName("ev.v")
    public int[] field2350 = new int[16];

    @ObfuscatedName("ev.i")
    public int[] field2351 = new int[16];

    @ObfuscatedName("ev.k")
    public int[] field2352 = new int[16];

    @ObfuscatedName("ev.o")
    public int[] field2349 = new int[16];

    @ObfuscatedName("ev.d")
    public int[] field2354 = new int[16];

    @ObfuscatedName("ev.u")
    public class144[][] field2355 = new class144[16][128];

    @ObfuscatedName("ev.ap")
    public class144[][] field2356 = new class144[16][128];

    @ObfuscatedName("ev.ad")
    public class143 field2341 = new class143();

    @ObfuscatedName("ev.ao")
    public boolean field2358;

    @ObfuscatedName("ev.av")
    public int field2359;

    @ObfuscatedName("ev.af")
    public int field2360;

    @ObfuscatedName("ev.ae")
    public long field2365;

    @ObfuscatedName("ev.ax")
    public long field2362;

    @ObfuscatedName("ev.aw")
    public class142 field2363 = new class142(this);

    public class140() {
        this.method2622();
    }

    @ObfuscatedName("ev.c(II)V")
    public synchronized void method2629(int arg0) {
        this.field2338 = arg0;
    }

    @ObfuscatedName("ev.j(I)I")
    public int method2605() {
        return this.field2338;
    }

    @ObfuscatedName("ev.y(Lex;Lew;Lbx;II)Z")
    public synchronized boolean method2630(class138 arg0, class150 arg1, class57 arg2, int arg3) {
        arg0.method2594();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class174 var7 = (class174) arg0.field2322.method3141(); var7 != null; var7 = (class174) arg0.field2322.method3128()) {
            int var8 = (int) var7.field2759;
            class139 var9 = (class139) this.field2353.method3129((long) var8);
            if (var9 == null) {
                var9 = class139.method556(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2353.method3137(var9, (long) var8);
            }
            if (!var9.method2597(arg2, var7.field2753, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2592();
        }
        return var5;
    }

    @ObfuscatedName("ev.x(B)V")
    public synchronized void method2607() {
        for (class139 var1 = (class139) this.field2353.method3141(); var1 != null; var1 = (class139) this.field2353.method3128()) {
            var1.method2599();
        }
    }

    @ObfuscatedName("ev.e(I)V")
    public synchronized void method2666() {
        for (class139 var1 = (class139) this.field2353.method3141(); var1 != null; var1 = (class139) this.field2353.method3128()) {
            var1.method3182();
        }
    }

    @ObfuscatedName("ev.m(Lex;ZI)V")
    public synchronized void method2609(class138 arg0, boolean arg1) {
        this.method2610();
        this.field2341.method2729(arg0.field2323);
        this.field2358 = arg1;
        this.field2365 = 0L;
        int var3 = this.field2341.method2712();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2341.method2713(var4);
            this.field2341.method2714(var4);
            this.field2341.method2744(var4);
        }
        this.field2359 = this.field2341.method2715();
        this.field2360 = this.field2341.field2390[this.field2359];
        this.field2362 = this.field2341.method2720(this.field2360);
    }

    @ObfuscatedName("ev.s(B)V")
    public synchronized void method2610() {
        this.field2341.method2710();
        this.method2622();
    }

    @ObfuscatedName("ev.p(I)Z")
    public synchronized boolean method2611() {
        return this.field2341.method2711();
    }

    @ObfuscatedName("ev.w(III)V")
    public synchronized void method2612(int arg0, int arg1) {
        this.method2639(arg0, arg1);
    }

    @ObfuscatedName("ev.r(III)V")
    public void method2639(int arg0, int arg1) {
        this.field2343[arg0] = arg1;
        this.field2342[arg0] = arg1 & 0xFFFFFF80;
        this.method2613(arg0, arg1);
    }

    @ObfuscatedName("ev.n(IIB)V")
    public void method2613(int arg0, int arg1) {
        if (this.field2344[arg0] != arg1) {
            this.field2344[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2356[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ev.b(IIII)V")
    public void method2614(int arg0, int arg1, int arg2) {
        this.method2665(arg0, arg1, 64);
        if ((this.field2348[arg0] & 0x2) != 0) {
            for (class144 var4 = (class144) this.field2363.field2380.method3153(); var4 != null; var4 = (class144) this.field2363.field2380.method3155()) {
                if (var4.field2418 == arg0 && var4.field2414 < 0) {
                    this.field2355[arg0][var4.field2405] = null;
                    this.field2355[arg0][arg1] = var4;
                    int var5 = (var4.field2403 * var4.field2402 >> 12) + var4.field2408;
                    var4.field2408 += arg1 - var4.field2405 << 8;
                    var4.field2403 = var5 - var4.field2408;
                    var4.field2402 = 4096;
                    var4.field2405 = arg1;
                    return;
                }
            }
        }
        class139 var6 = (class139) this.field2353.method3129((long) this.field2344[arg0]);
        if (var6 == null) {
            return;
        }
        class62 var7 = var6.field2324[arg1];
        if (var7 == null) {
            return;
        }
        class144 var8 = new class144();
        var8.field2418 = arg0;
        var8.field2401 = var6;
        var8.field2413 = var7;
        var8.field2410 = var6.field2325[arg1];
        var8.field2412 = var6.field2329[arg1];
        var8.field2405 = arg1;
        var8.field2406 = var6.field2336 * arg2 * arg2 * var6.field2327[arg1] + 1024 >> 11;
        var8.field2407 = var6.field2328[arg1] & 0xFF;
        var8.field2408 = (arg1 << 8) - (var6.field2326[arg1] & 0x7FFF);
        var8.field2411 = 0;
        var8.field2404 = 0;
        var8.field2400 = 0;
        var8.field2414 = -1;
        var8.field2415 = 0;
        if (this.field2352[arg0] == 0) {
            var8.field2422 = class44.method908(var7, this.method2627(var8), this.method2652(var8), this.method2636(var8));
        } else {
            var8.field2422 = class44.method908(var7, this.method2627(var8), 0, this.method2636(var8));
            this.method2615(var8, var6.field2326[arg1] < 0);
        }
        if (var6.field2326[arg1] < 0) {
            var8.field2422.method910(-1);
        }
        if (var8.field2412 >= 0) {
            class144 var9 = this.field2356[arg0][var8.field2412];
            if (var9 != null && var9.field2414 < 0) {
                this.field2355[arg0][var9.field2405] = null;
                var9.field2414 = 0;
            }
            this.field2356[arg0][var8.field2412] = var8;
        }
        this.field2363.field2380.method3147(var8);
        this.field2355[arg0][arg1] = var8;
    }

    @ObfuscatedName("ev.z(Leu;ZB)V")
    public void method2615(class144 arg0, boolean arg1) {
        int var3 = arg0.field2413.field1214.length;
        int var5;
        if (arg1 && arg0.field2413.field1217) {
            int var4 = var3 + var3 - arg0.field2413.field1213;
            var5 = (int) ((long) this.field2352[arg0.field2418] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2422.method917(true);
            }
        } else {
            var5 = (int) ((long) this.field2352[arg0.field2418] * (long) var3 >> 6);
        }
        arg0.field2422.method916(var5);
    }

    @ObfuscatedName("ev.h(IIIB)V")
    public void method2665(int arg0, int arg1, int arg2) {
        class144 var4 = this.field2355[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2355[arg0][arg1] = null;
        if ((this.field2348[arg0] & 0x2) == 0) {
            var4.field2414 = 0;
            return;
        }
        for (class144 var5 = (class144) this.field2363.field2380.method3145(); var5 != null; var5 = (class144) this.field2363.field2380.method3154()) {
            if (var4.field2418 == var5.field2418 && var5.field2414 < 0 && var4 != var5) {
                var4.field2414 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ev.q(IIIB)V")
    public void method2617(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ev.l(III)V")
    public void method2646(int arg0, int arg1) {
    }

    @ObfuscatedName("ev.t(III)V")
    public void method2619(int arg0, int arg1) {
        this.field2346[arg0] = arg1;
    }

    @ObfuscatedName("ev.g(II)V")
    public void method2620(int arg0) {
        for (class144 var2 = (class144) this.field2363.field2380.method3145(); var2 != null; var2 = (class144) this.field2363.field2380.method3154()) {
            if (arg0 < 0 || var2.field2418 == arg0) {
                if (var2.field2422 != null) {
                    var2.field2422.method966(Statics.field1090 / 100);
                    if (var2.field2422.method944()) {
                        this.field2363.field2382.method1054(var2.field2422);
                    }
                    var2.method2763();
                }
                if (var2.field2414 < 0) {
                    this.field2355[var2.field2418][var2.field2405] = null;
                }
                var2.method3182();
            }
        }
    }

    @ObfuscatedName("ev.a(IB)V")
    public void method2675(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2675(var2);
            }
            return;
        }
        this.field2340[arg0] = 12800;
        this.field2364[arg0] = 8192;
        this.field2345[arg0] = 16383;
        this.field2346[arg0] = 8192;
        this.field2347[arg0] = 0;
        this.field2361[arg0] = 8192;
        this.method2623(arg0);
        this.method2624(arg0);
        this.field2348[arg0] = 0;
        this.field2350[arg0] = 32767;
        this.field2351[arg0] = 256;
        this.field2352[arg0] = 0;
        this.method2662(arg0, 8192);
    }

    @ObfuscatedName("ev.v(II)V")
    public void method2689(int arg0) {
        for (class144 var2 = (class144) this.field2363.field2380.method3145(); var2 != null; var2 = (class144) this.field2363.field2380.method3154()) {
            if ((arg0 < 0 || var2.field2418 == arg0) && var2.field2414 < 0) {
                this.field2355[var2.field2418][var2.field2405] = null;
                var2.field2414 = 0;
            }
        }
    }

    @ObfuscatedName("ev.i(I)V")
    public void method2622() {
        this.method2620(-1);
        this.method2675(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2344[var1] = this.field2343[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2342[var2] = this.field2343[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ev.ad(II)V")
    public void method2623(int arg0) {
        if ((this.field2348[arg0] & 0x2) == 0) {
            return;
        }
        for (class144 var2 = (class144) this.field2363.field2380.method3145(); var2 != null; var2 = (class144) this.field2363.field2380.method3154()) {
            if (var2.field2418 == arg0 && this.field2355[arg0][var2.field2405] == null && var2.field2414 < 0) {
                var2.field2414 = 0;
            }
        }
    }

    @ObfuscatedName("ev.ao(II)V")
    public void method2624(int arg0) {
        if ((this.field2348[arg0] & 0x4) == 0) {
            return;
        }
        for (class144 var2 = (class144) this.field2363.field2380.method3145(); var2 != null; var2 = (class144) this.field2363.field2380.method3154()) {
            if (var2.field2418 == arg0) {
                var2.field2421 = 0;
            }
        }
    }

    @ObfuscatedName("ev.av(IB)V")
    public void method2625(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2665(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2614(var6, var7, var8);
            } else {
                this.method2665(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2617(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2342[var12] = (var14 << 14) + (this.field2342[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2342[var12] = (var14 << 7) + (this.field2342[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2347[var12] = (var14 << 7) + (this.field2347[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2347[var12] = (this.field2347[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2361[var12] = (var14 << 7) + (this.field2361[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2361[var12] = (this.field2361[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2340[var12] = (var14 << 7) + (this.field2340[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2340[var12] = (this.field2340[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2364[var12] = (var14 << 7) + (this.field2364[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2364[var12] = (this.field2364[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2345[var12] = (var14 << 7) + (this.field2345[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2345[var12] = (this.field2345[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2348[var12] |= 0x1;
                } else {
                    this.field2348[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2348[var12] |= 0x2;
                } else {
                    this.method2623(var12);
                    this.field2348[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2350[var12] = (var14 << 7) + (this.field2350[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2350[var12] = (this.field2350[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2350[var12] = (var14 << 7) + (this.field2350[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2350[var12] = (this.field2350[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2620(var12);
            }
            if (var13 == 121) {
                this.method2675(var12);
            }
            if (var13 == 123) {
                this.method2689(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2350[var12];
                if (var15 == 16384) {
                    this.field2351[var12] = (var14 << 7) + (this.field2351[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2350[var12];
                if (var16 == 16384) {
                    this.field2351[var12] = (this.field2351[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2352[var12] = (var14 << 7) + (this.field2352[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2352[var12] = (this.field2352[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2348[var12] |= 0x4;
                } else {
                    this.method2624(var12);
                    this.field2348[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2662(var12, (var14 << 7) + (this.field2349[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2662(var12, (this.field2349[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2613(var17, this.field2342[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2646(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method2619(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2622();
            }
        }
    }

    @ObfuscatedName("ev.af(III)V")
    public void method2662(int arg0, int arg1) {
        this.field2349[arg0] = arg1;
        this.field2354[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ev.ae(Leu;I)I")
    public int method2627(class144 arg0) {
        int var2 = (arg0.field2403 * arg0.field2402 >> 12) + arg0.field2408;
        int var3 = ((this.field2346[arg0.field2418] - 8192) * this.field2351[arg0.field2418] >> 12) + var2;
        class141 var4 = arg0.field2410;
        if (var4.field2371 > 0 && (var4.field2378 > 0 || this.field2347[arg0.field2418] > 0)) {
            int var5 = var4.field2378 << 2;
            int var6 = var4.field2373 << 1;
            if (arg0.field2416 < var6) {
                var5 = arg0.field2416 * var5 / var6;
            }
            int var7 = (this.field2347[arg0.field2418] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2417 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2413.field1215 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1090 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ev.ax(Leu;B)I")
    public int method2652(class144 arg0) {
        class141 var2 = arg0.field2410;
        int var3 = this.field2345[arg0.field2418] * this.field2340[arg0.field2418] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2406 * var4 + 16384 >> 15;
        int var6 = this.field2338 * var5 + 128 >> 8;
        if (var2.field2369 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2411 * 1.953125E-5D * (double) var2.field2369) + 0.5D);
        }
        if (var2.field2375 != null) {
            int var7 = arg0.field2404;
            int var8 = var2.field2375[arg0.field2400 + 1];
            if (arg0.field2400 < var2.field2375.length - 2) {
                int var9 = (var2.field2375[arg0.field2400] & 0xFF) << 8;
                int var10 = (var2.field2375[arg0.field2400 + 2] & 0xFF) << 8;
                var8 += (var2.field2375[arg0.field2400 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2414 > 0 && var2.field2368 != null) {
            int var11 = arg0.field2414;
            int var12 = var2.field2368[arg0.field2415 + 1];
            if (arg0.field2415 < var2.field2368.length - 2) {
                int var13 = (var2.field2368[arg0.field2415] & 0xFF) << 8;
                int var14 = (var2.field2368[arg0.field2415 + 2] & 0xFF) << 8;
                var12 += (var2.field2368[arg0.field2415 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ev.aw(Leu;B)I")
    public int method2636(class144 arg0) {
        int var2 = this.field2364[arg0.field2418];
        return var2 < 8192 ? arg0.field2407 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2407) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ev.k()Lau;")
    public synchronized class47 method926() {
        return this.field2363;
    }

    @ObfuscatedName("ev.o()Lau;")
    public synchronized class47 method927() {
        return null;
    }

    @ObfuscatedName("ev.d()I")
    public synchronized int method928() {
        return 0;
    }

    @ObfuscatedName("ev.u([III)V")
    public synchronized void method929(int[] arg0, int arg1, int arg2) {
        if (this.field2341.method2711()) {
            int var4 = this.field2339 * this.field2341.field2387 / Statics.field1090;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2365;
                if (this.field2362 - var5 >= 0L) {
                    this.field2365 = var5;
                    break;
                }
                int var7 = (int) ((this.field2362 - this.field2365 + (long) var4 - 1L) / (long) var4);
                this.field2365 += (long) var4 * (long) var7;
                this.field2363.method929(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2688();
            } while (this.field2341.method2711());
        }
        this.field2363.method929(arg0, arg1, arg2);
    }

    @ObfuscatedName("ev.ap(I)V")
    public synchronized void method1014(int arg0) {
        if (this.field2341.method2711()) {
            int var2 = this.field2339 * this.field2341.field2387 / Statics.field1090;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2365;
                if (this.field2362 - var3 >= 0L) {
                    this.field2365 = var3;
                    break;
                }
                int var5 = (int) ((this.field2362 - this.field2365 + (long) var2 - 1L) / (long) var2);
                this.field2365 += (long) var2 * (long) var5;
                this.field2363.method1014(var5);
                arg0 -= var5;
                this.method2688();
            } while (this.field2341.method2711());
        }
        this.field2363.method1014(arg0);
    }

    @ObfuscatedName("ev.an(I)V")
    public void method2688() {
        int var1 = this.field2359;
        int var2 = this.field2360;
        long var3 = this.field2362;
        while (this.field2360 == var2) {
            while (this.field2341.field2390[var1] == var2) {
                this.field2341.method2713(var1);
                int var5 = this.field2341.method2709(var1);
                if (var5 == 1) {
                    this.field2341.method2717();
                    this.field2341.method2744(var1);
                    if (this.field2341.method2722()) {
                        if (!this.field2358 || var2 == 0) {
                            this.method2622();
                            this.field2341.method2710();
                            return;
                        }
                        this.field2341.method2726(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2625(var5);
                }
                this.field2341.method2714(var1);
                this.field2341.method2744(var1);
            }
            var1 = this.field2341.method2715();
            var2 = this.field2341.field2390[var1];
            var3 = this.field2341.method2720(var2);
        }
        this.field2359 = var1;
        this.field2360 = var2;
        this.field2362 = var3;
    }

    @ObfuscatedName("ev.az(Leu;B)Z")
    public boolean method2634(class144 arg0) {
        if (arg0.field2422 != null) {
            return false;
        }
        if (arg0.field2414 >= 0) {
            arg0.method3182();
            if (arg0.field2412 > 0 && this.field2356[arg0.field2418][arg0.field2412] == arg0) {
                this.field2356[arg0.field2418][arg0.field2412] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ev.as(Leu;[IIIB)Z")
    public boolean method2635(class144 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2419 = Statics.field1090 / 100;
        if (arg0.field2414 >= 0 && arg0.field2422 == null || arg0.field2422.method924()) {
            arg0.method2763();
            arg0.method3182();
            if (arg0.field2412 > 0 && this.field2356[arg0.field2418][arg0.field2412] == arg0) {
                this.field2356[arg0.field2418][arg0.field2412] = null;
            }
            return true;
        }
        int var5 = arg0.field2402;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2361[arg0.field2418] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2402 = var6;
        }
        arg0.field2422.method922(this.method2627(arg0));
        class141 var7 = arg0.field2410;
        boolean var8 = false;
        arg0.field2416++;
        arg0.field2417 += var7.field2371;
        double var9 = (double) ((arg0.field2405 - 60 << 8) + (arg0.field2403 * arg0.field2402 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2369 > 0) {
            if (var7.field2372 > 0) {
                arg0.field2411 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2372 * var9) + 0.5D);
            } else {
                arg0.field2411 += 128;
            }
        }
        if (var7.field2375 != null) {
            if (var7.field2370 > 0) {
                arg0.field2404 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2370 * var9) + 0.5D);
            } else {
                arg0.field2404 += 128;
            }
            while (arg0.field2400 < var7.field2375.length - 2 && arg0.field2404 > (var7.field2375[arg0.field2400 + 2] & 0xFF) << 8) {
                arg0.field2400 += 2;
            }
            if (arg0.field2400 == var7.field2375.length - 2 && var7.field2375[arg0.field2400 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2414 >= 0 && var7.field2368 != null && (this.field2348[arg0.field2418] & 0x1) == 0 && (arg0.field2412 < 0 || this.field2356[arg0.field2418][arg0.field2412] != arg0)) {
            if (var7.field2367 > 0) {
                arg0.field2414 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2367 * var9) + 0.5D);
            } else {
                arg0.field2414 += 128;
            }
            while (arg0.field2415 < var7.field2368.length - 2 && arg0.field2414 > (var7.field2368[arg0.field2415 + 2] & 0xFF) << 8) {
                arg0.field2415 += 2;
            }
            if (arg0.field2415 == var7.field2368.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2422.method920(arg0.field2419, this.method2652(arg0), this.method2636(arg0));
            return false;
        }
        arg0.field2422.method966(arg0.field2419);
        if (arg1 == null) {
            arg0.field2422.method1014(arg3);
        } else {
            arg0.field2422.method929(arg1, arg2, arg3);
        }
        if (arg0.field2422.method944()) {
            this.field2363.field2382.method1054(arg0.field2422);
        }
        arg0.method2763();
        if (arg0.field2414 >= 0) {
            arg0.method3182();
            if (arg0.field2412 > 0 && this.field2356[arg0.field2418][arg0.field2412] == arg0) {
                this.field2356[arg0.field2418][arg0.field2412] = null;
            }
        }
        return true;
    }
}
