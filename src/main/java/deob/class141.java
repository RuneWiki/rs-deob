package deob;

@ObfuscatedName("el")
public class class141 extends class48 {

    @ObfuscatedName("el.i")
    public class175 field2374 = new class175(128);

    @ObfuscatedName("el.p")
    public int field2366 = 256;

    @ObfuscatedName("el.a")
    public int field2369 = 1000000;

    @ObfuscatedName("el.l")
    public int[] field2367 = new int[16];

    @ObfuscatedName("el.q")
    public int[] field2380 = new int[16];

    @ObfuscatedName("el.b")
    public int[] field2370 = new int[16];

    @ObfuscatedName("el.u")
    public int[] field2371 = new int[16];

    @ObfuscatedName("el.d")
    public int[] field2372 = new int[16];

    @ObfuscatedName("el.m")
    public int[] field2390 = new int[16];

    @ObfuscatedName("el.v")
    public int[] field2393 = new int[16];

    @ObfuscatedName("el.j")
    public int[] field2377 = new int[16];

    @ObfuscatedName("el.f")
    public int[] field2376 = new int[16];

    @ObfuscatedName("el.s")
    public int[] field2381 = new int[16];

    @ObfuscatedName("el.t")
    public int[] field2378 = new int[16];

    @ObfuscatedName("el.r")
    public int[] field2379 = new int[16];

    @ObfuscatedName("el.w")
    public int[] field2365 = new int[16];

    @ObfuscatedName("el.x")
    public int[] field2375 = new int[16];

    @ObfuscatedName("el.n")
    public int[] field2382 = new int[16];

    @ObfuscatedName("el.c")
    public class145[][] field2383 = new class145[16][128];

    @ObfuscatedName("el.az")
    public class145[][] field2384 = new class145[16][128];

    @ObfuscatedName("el.ax")
    public class144 field2385 = new class144();

    @ObfuscatedName("el.aq")
    public boolean field2386;

    @ObfuscatedName("el.ap")
    public int field2387;

    @ObfuscatedName("el.aa")
    public int field2388;

    @ObfuscatedName("el.ai")
    public long field2389;

    @ObfuscatedName("el.ar")
    public long field2373;

    @ObfuscatedName("el.ag")
    public class143 field2391 = new class143(this);

    public class141() {
        this.method2785();
    }

    @ObfuscatedName("el.i(II)V")
    public synchronized void method2704(int arg0) {
        this.field2366 = arg0;
    }

    @ObfuscatedName("el.p(I)I")
    public int method2705() {
        return this.field2366;
    }

    @ObfuscatedName("el.l(Lei;Lef;Lbw;IB)Z")
    public synchronized boolean method2782(class139 arg0, class152 arg1, class58 arg2, int arg3) {
        arg0.method2694();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class176 var7 = (class176) arg0.field2353.method3271(); var7 != null; var7 = (class176) arg0.field2353.method3272()) {
            int var8 = (int) var7.field2818;
            class140 var9 = (class140) this.field2374.method3268((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method2940(var8);
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
                this.field2374.method3269(var11, (long) var8);
            }
            if (!var9.method2695(arg2, var7.field2812, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2689();
        }
        return var5;
    }

    @ObfuscatedName("el.q(B)V")
    public synchronized void method2707() {
        for (class140 var1 = (class140) this.field2374.method3271(); var1 != null; var1 = (class140) this.field2374.method3272()) {
            var1.method2698();
        }
    }

    @ObfuscatedName("el.b(I)V")
    public synchronized void method2708() {
        for (class140 var1 = (class140) this.field2374.method3271(); var1 != null; var1 = (class140) this.field2374.method3272()) {
            var1.method3319();
        }
    }

    @ObfuscatedName("el.u(Lei;ZI)V")
    public synchronized void method2709(class139 arg0, boolean arg1) {
        this.method2710();
        this.field2385.method2820(arg0.field2352);
        this.field2386 = arg1;
        this.field2389 = 0L;
        int var3 = this.field2385.method2823();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2385.method2824(var4);
            this.field2385.method2826(var4);
            this.field2385.method2850(var4);
        }
        this.field2387 = this.field2385.method2831();
        this.field2388 = this.field2385.field2415[this.field2387];
        this.field2373 = this.field2385.method2860(this.field2388);
    }

    @ObfuscatedName("el.d(I)V")
    public synchronized void method2710() {
        this.field2385.method2821();
        this.method2785();
    }

    @ObfuscatedName("el.m(I)Z")
    public synchronized boolean method2711() {
        return this.field2385.method2822();
    }

    @ObfuscatedName("el.v(III)V")
    public synchronized void method2742(int arg0, int arg1) {
        this.method2713(arg0, arg1);
    }

    @ObfuscatedName("el.j(III)V")
    public void method2713(int arg0, int arg1) {
        this.field2371[arg0] = arg1;
        this.field2390[arg0] = arg1 & 0xFFFFFF80;
        this.method2714(arg0, arg1);
    }

    @ObfuscatedName("el.f(III)V")
    public void method2714(int arg0, int arg1) {
        if (this.field2372[arg0] != arg1) {
            this.field2372[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2384[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("el.h(IIII)V")
    public void method2715(int arg0, int arg1, int arg2) {
        this.method2717(arg0, arg1, 64);
        if ((this.field2381[arg0] & 0x2) != 0) {
            for (class145 var4 = (class145) this.field2391.field2406.method3291(); var4 != null; var4 = (class145) this.field2391.field2406.method3293()) {
                if (var4.field2442 == arg0 && var4.field2439 < 0) {
                    this.field2383[arg0][var4.field2430] = null;
                    this.field2383[arg0][arg1] = var4;
                    int var5 = (var4.field2435 * var4.field2434 >> 12) + var4.field2433;
                    var4.field2433 += arg1 - var4.field2430 << 8;
                    var4.field2434 = var5 - var4.field2433;
                    var4.field2435 = 4096;
                    var4.field2430 = arg1;
                    return;
                }
            }
        }
        class140 var6 = (class140) this.field2374.method3268((long) this.field2372[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2355[arg1];
        if (var7 == null) {
            return;
        }
        class145 var8 = new class145();
        var8.field2442 = arg0;
        var8.field2440 = var6;
        var8.field2427 = var7;
        var8.field2443 = var6.field2359[arg1];
        var8.field2429 = var6.field2360[arg1];
        var8.field2430 = arg1;
        var8.field2438 = var6.field2362 * arg2 * arg2 * var6.field2357[arg1] + 1024 >> 11;
        var8.field2426 = var6.field2358[arg1] & 0xFF;
        var8.field2433 = (arg1 << 8) - (var6.field2356[arg1] & 0x7FFF);
        var8.field2436 = 0;
        var8.field2431 = 0;
        var8.field2425 = 0;
        var8.field2439 = -1;
        var8.field2432 = 0;
        if (this.field2365[arg0] == 0) {
            var8.field2428 = class45.method922(var7, this.method2727(var8), this.method2728(var8), this.method2729(var8));
        } else {
            var8.field2428 = class45.method922(var7, this.method2727(var8), 0, this.method2729(var8));
            this.method2716(var8, var6.field2356[arg1] < 0);
        }
        if (var6.field2356[arg1] < 0) {
            var8.field2428.method1040(-1);
        }
        if (var8.field2429 >= 0) {
            class145 var9 = this.field2384[arg0][var8.field2429];
            if (var9 != null && var9.field2439 < 0) {
                this.field2383[arg0][var9.field2430] = null;
                var9.field2439 = 0;
            }
            this.field2384[arg0][var8.field2429] = var8;
        }
        this.field2391.field2406.method3308(var8);
        this.field2383[arg0][arg1] = var8;
    }

    @ObfuscatedName("el.o(Leo;ZI)V")
    public void method2716(class145 arg0, boolean arg1) {
        int var3 = arg0.field2427.field1238.length;
        int var5;
        if (arg1 && arg0.field2427.field1242) {
            int var4 = var3 + var3 - arg0.field2427.field1239;
            var5 = (int) ((long) this.field2365[arg0.field2442] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2428.method931(true);
            }
        } else {
            var5 = (int) ((long) this.field2365[arg0.field2442] * (long) var3 >> 6);
        }
        arg0.field2428.method930(var5);
    }

    @ObfuscatedName("el.z(IIII)V")
    public void method2717(int arg0, int arg1, int arg2) {
        class145 var4 = this.field2383[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2383[arg0][arg1] = null;
        if ((this.field2381[arg0] & 0x2) == 0) {
            var4.field2439 = 0;
            return;
        }
        for (class145 var5 = (class145) this.field2391.field2406.method3313(); var5 != null; var5 = (class145) this.field2391.field2406.method3292()) {
            if (var4.field2442 == var5.field2442 && var5.field2439 < 0 && var4 != var5) {
                var4.field2439 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("el.k(IIIB)V")
    public void method2718(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("el.y(IIB)V")
    public void method2719(int arg0, int arg1) {
    }

    @ObfuscatedName("el.g(III)V")
    public void method2720(int arg0, int arg1) {
        this.field2393[arg0] = arg1;
    }

    @ObfuscatedName("el.e(IB)V")
    public void method2751(int arg0) {
        for (class145 var2 = (class145) this.field2391.field2406.method3313(); var2 != null; var2 = (class145) this.field2391.field2406.method3292()) {
            if (arg0 < 0 || var2.field2442 == arg0) {
                if (var2.field2428 != null) {
                    var2.field2428.method936(Statics.field763 / 100);
                    if (var2.field2428.method939()) {
                        this.field2391.field2409.method1057(var2.field2428);
                    }
                    var2.method2870();
                }
                if (var2.field2439 < 0) {
                    this.field2383[var2.field2442][var2.field2430] = null;
                }
                var2.method3319();
            }
        }
    }

    @ObfuscatedName("el.s(II)V")
    public void method2749(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2749(var2);
            }
            return;
        }
        this.field2367[arg0] = 12800;
        this.field2380[arg0] = 8192;
        this.field2370[arg0] = 16383;
        this.field2393[arg0] = 8192;
        this.field2377[arg0] = 0;
        this.field2376[arg0] = 8192;
        this.method2746(arg0);
        this.method2724(arg0);
        this.field2381[arg0] = 0;
        this.field2378[arg0] = 32767;
        this.field2379[arg0] = 256;
        this.field2365[arg0] = 0;
        this.method2791(arg0, 8192);
    }

    @ObfuscatedName("el.t(IB)V")
    public void method2712(int arg0) {
        for (class145 var2 = (class145) this.field2391.field2406.method3313(); var2 != null; var2 = (class145) this.field2391.field2406.method3292()) {
            if ((arg0 < 0 || var2.field2442 == arg0) && var2.field2439 < 0) {
                this.field2383[var2.field2442][var2.field2430] = null;
                var2.field2439 = 0;
            }
        }
    }

    @ObfuscatedName("el.r(I)V")
    public void method2785() {
        this.method2751(-1);
        this.method2749(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2372[var1] = this.field2371[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2390[var2] = this.field2371[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("el.ax(IB)V")
    public void method2746(int arg0) {
        if ((this.field2381[arg0] & 0x2) == 0) {
            return;
        }
        for (class145 var2 = (class145) this.field2391.field2406.method3313(); var2 != null; var2 = (class145) this.field2391.field2406.method3292()) {
            if (var2.field2442 == arg0 && this.field2383[arg0][var2.field2430] == null && var2.field2439 < 0) {
                var2.field2439 = 0;
            }
        }
    }

    @ObfuscatedName("el.aq(IB)V")
    public void method2724(int arg0) {
        if ((this.field2381[arg0] & 0x4) == 0) {
            return;
        }
        for (class145 var2 = (class145) this.field2391.field2406.method3313(); var2 != null; var2 = (class145) this.field2391.field2406.method3292()) {
            if (var2.field2442 == arg0) {
                var2.field2445 = 0;
            }
        }
    }

    @ObfuscatedName("el.ap(IB)V")
    public void method2725(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2717(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2715(var6, var7, var8);
            } else {
                this.method2717(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2718(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2390[var12] = (var14 << 14) + (this.field2390[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2390[var12] = (var14 << 7) + (this.field2390[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2377[var12] = (var14 << 7) + (this.field2377[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2377[var12] = (this.field2377[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2376[var12] = (var14 << 7) + (this.field2376[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2376[var12] = (this.field2376[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2367[var12] = (var14 << 7) + (this.field2367[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2367[var12] = (this.field2367[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2380[var12] = (var14 << 7) + (this.field2380[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2380[var12] = (this.field2380[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2370[var12] = (var14 << 7) + (this.field2370[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2370[var12] = (this.field2370[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2381[var12] |= 0x1;
                } else {
                    this.field2381[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2381[var12] |= 0x2;
                } else {
                    this.method2746(var12);
                    this.field2381[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2378[var12] = (var14 << 7) + (this.field2378[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2378[var12] = (this.field2378[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2378[var12] = (var14 << 7) + (this.field2378[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2378[var12] = (this.field2378[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2751(var12);
            }
            if (var13 == 121) {
                this.method2749(var12);
            }
            if (var13 == 123) {
                this.method2712(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2378[var12];
                if (var15 == 16384) {
                    this.field2379[var12] = (var14 << 7) + (this.field2379[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2378[var12];
                if (var16 == 16384) {
                    this.field2379[var12] = (this.field2379[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2365[var12] = (var14 << 7) + (this.field2365[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2365[var12] = (this.field2365[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2381[var12] |= 0x4;
                } else {
                    this.method2724(var12);
                    this.field2381[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2791(var12, (var14 << 7) + (this.field2375[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2791(var12, (this.field2375[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2714(var17, this.field2390[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2719(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method2720(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2785();
            }
        }
    }

    @ObfuscatedName("el.aa(III)V")
    public void method2791(int arg0, int arg1) {
        this.field2375[arg0] = arg1;
        this.field2382[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("el.ai(Leo;I)I")
    public int method2727(class145 arg0) {
        int var2 = (arg0.field2435 * arg0.field2434 >> 12) + arg0.field2433;
        int var3 = ((this.field2393[arg0.field2442] - 8192) * this.field2379[arg0.field2442] >> 12) + var2;
        class142 var4 = arg0.field2443;
        if (var4.field2400 > 0 && (var4.field2397 > 0 || this.field2377[arg0.field2442] > 0)) {
            int var5 = var4.field2397 << 2;
            int var6 = var4.field2402 << 1;
            if (arg0.field2441 < var6) {
                var5 = arg0.field2441 * var5 / var6;
            }
            int var7 = (this.field2377[arg0.field2442] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2437 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2427.field1240 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field763 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("el.ar(Leo;S)I")
    public int method2728(class145 arg0) {
        class142 var2 = arg0.field2443;
        int var3 = this.field2370[arg0.field2442] * this.field2367[arg0.field2442] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2438 * var4 + 16384 >> 15;
        int var6 = this.field2366 * var5 + 128 >> 8;
        if (var2.field2396 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2436 * 1.953125E-5D * (double) var2.field2396) + 0.5D);
        }
        if (var2.field2395 != null) {
            int var7 = arg0.field2431;
            int var8 = var2.field2395[arg0.field2425 + 1];
            if (arg0.field2425 < var2.field2395.length - 2) {
                int var9 = (var2.field2395[arg0.field2425] & 0xFF) << 8;
                int var10 = (var2.field2395[arg0.field2425 + 2] & 0xFF) << 8;
                var8 += (var2.field2395[arg0.field2425 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2439 > 0 && var2.field2394 != null) {
            int var11 = arg0.field2439;
            int var12 = var2.field2394[arg0.field2432 + 1];
            if (arg0.field2432 < var2.field2394.length - 2) {
                int var13 = (var2.field2394[arg0.field2432] & 0xFF) << 8;
                int var14 = (var2.field2394[arg0.field2432 + 2] & 0xFF) << 8;
                var12 += (var2.field2394[arg0.field2432 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("el.ag(Leo;I)I")
    public int method2729(class145 arg0) {
        int var2 = this.field2380[arg0.field2442];
        return var2 < 8192 ? arg0.field2426 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2426) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("el.w()Lay;")
    public synchronized class48 method940() {
        return this.field2391;
    }

    @ObfuscatedName("el.x()Lay;")
    public synchronized class48 method941() {
        return null;
    }

    @ObfuscatedName("el.n()I")
    public synchronized int method1019() {
        return 0;
    }

    @ObfuscatedName("el.c([III)V")
    public synchronized void method943(int[] arg0, int arg1, int arg2) {
        if (this.field2385.method2822()) {
            int var4 = this.field2369 * this.field2385.field2413 / Statics.field763;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2389;
                if (this.field2373 - var5 >= 0L) {
                    this.field2389 = var5;
                    break;
                }
                int var7 = (int) ((this.field2373 - this.field2389 + (long) var4 - 1L) / (long) var4);
                this.field2389 += (long) var4 * (long) var7;
                this.field2391.method943(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2733();
            } while (this.field2385.method2822());
        }
        this.field2391.method943(arg0, arg1, arg2);
    }

    @ObfuscatedName("el.az(I)V")
    public synchronized void method1018(int arg0) {
        if (this.field2385.method2822()) {
            int var2 = this.field2369 * this.field2385.field2413 / Statics.field763;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2389;
                if (this.field2373 - var3 >= 0L) {
                    this.field2389 = var3;
                    break;
                }
                int var5 = (int) ((this.field2373 - this.field2389 + (long) var2 - 1L) / (long) var2);
                this.field2389 += (long) var2 * (long) var5;
                this.field2391.method1018(var5);
                arg0 -= var5;
                this.method2733();
            } while (this.field2385.method2822());
        }
        this.field2391.method1018(arg0);
    }

    @ObfuscatedName("el.as(B)V")
    public void method2733() {
        int var1 = this.field2387;
        int var2 = this.field2388;
        long var3 = this.field2373;
        while (this.field2388 == var2) {
            while (this.field2385.field2415[var1] == var2) {
                this.field2385.method2824(var1);
                int var5 = this.field2385.method2827(var1);
                if (var5 == 1) {
                    this.field2385.method2830();
                    this.field2385.method2850(var1);
                    if (this.field2385.method2832()) {
                        if (!this.field2386 || var2 == 0) {
                            this.method2785();
                            this.field2385.method2821();
                            return;
                        }
                        this.field2385.method2833(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2725(var5);
                }
                this.field2385.method2826(var1);
                this.field2385.method2850(var1);
            }
            var1 = this.field2385.method2831();
            var2 = this.field2385.field2415[var1];
            var3 = this.field2385.method2860(var2);
        }
        this.field2387 = var1;
        this.field2388 = var2;
        this.field2373 = var3;
    }

    @ObfuscatedName("el.ak(Leo;I)Z")
    public boolean method2758(class145 arg0) {
        if (arg0.field2428 != null) {
            return false;
        }
        if (arg0.field2439 >= 0) {
            arg0.method3319();
            if (arg0.field2429 > 0 && this.field2384[arg0.field2442][arg0.field2429] == arg0) {
                this.field2384[arg0.field2442][arg0.field2429] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("el.al(Leo;[IIII)Z")
    public boolean method2734(class145 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2444 = Statics.field763 / 100;
        if (arg0.field2439 >= 0 && arg0.field2428 == null || arg0.field2428.method938()) {
            arg0.method2870();
            arg0.method3319();
            if (arg0.field2429 > 0 && this.field2384[arg0.field2442][arg0.field2429] == arg0) {
                this.field2384[arg0.field2442][arg0.field2429] = null;
            }
            return true;
        }
        int var5 = arg0.field2435;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2376[arg0.field2442] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2435 = var6;
        }
        arg0.field2428.method946(this.method2727(arg0));
        class142 var7 = arg0.field2443;
        boolean var8 = false;
        arg0.field2441++;
        arg0.field2437 += var7.field2400;
        double var9 = (double) ((arg0.field2430 - 60 << 8) + (arg0.field2435 * arg0.field2434 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2396 > 0) {
            if (var7.field2399 > 0) {
                arg0.field2436 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2399 * var9) + 0.5D);
            } else {
                arg0.field2436 += 128;
            }
        }
        if (var7.field2395 != null) {
            if (var7.field2401 > 0) {
                arg0.field2431 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2401 * var9) + 0.5D);
            } else {
                arg0.field2431 += 128;
            }
            while (arg0.field2425 < var7.field2395.length - 2 && arg0.field2431 > (var7.field2395[arg0.field2425 + 2] & 0xFF) << 8) {
                arg0.field2425 += 2;
            }
            if (arg0.field2425 == var7.field2395.length - 2 && var7.field2395[arg0.field2425 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2439 >= 0 && var7.field2394 != null && (this.field2381[arg0.field2442] & 0x1) == 0 && (arg0.field2429 < 0 || this.field2384[arg0.field2442][arg0.field2429] != arg0)) {
            if (var7.field2398 > 0) {
                arg0.field2439 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2398 * var9) + 0.5D);
            } else {
                arg0.field2439 += 128;
            }
            while (arg0.field2432 < var7.field2394.length - 2 && arg0.field2439 > (var7.field2394[arg0.field2432 + 2] & 0xFF) << 8) {
                arg0.field2432 += 2;
            }
            if (arg0.field2432 == var7.field2394.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2428.method934(arg0.field2444, this.method2728(arg0), this.method2729(arg0));
            return false;
        }
        arg0.field2428.method936(arg0.field2444);
        if (arg1 == null) {
            arg0.field2428.method1018(arg3);
        } else {
            arg0.field2428.method943(arg1, arg2, arg3);
        }
        if (arg0.field2428.method939()) {
            this.field2391.field2409.method1057(arg0.field2428);
        }
        arg0.method2870();
        if (arg0.field2439 >= 0) {
            arg0.method3319();
            if (arg0.field2429 > 0 && this.field2384[arg0.field2442][arg0.field2429] == arg0) {
                this.field2384[arg0.field2442][arg0.field2429] = null;
            }
        }
        return true;
    }
}
