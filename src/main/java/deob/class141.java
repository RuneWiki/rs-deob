package deob;

@ObfuscatedName("ey")
public class class141 extends class48 {

    @ObfuscatedName("ey.i")
    public class175 field2364 = new class175(128);

    @ObfuscatedName("ey.f")
    public int field2391 = 256;

    @ObfuscatedName("ey.e")
    public int field2366 = 1000000;

    @ObfuscatedName("ey.t")
    public int[] field2378 = new int[16];

    @ObfuscatedName("ey.d")
    public int[] field2374 = new int[16];

    @ObfuscatedName("ey.p")
    public int[] field2369 = new int[16];

    @ObfuscatedName("ey.k")
    public int[] field2370 = new int[16];

    @ObfuscatedName("ey.r")
    public int[] field2371 = new int[16];

    @ObfuscatedName("ey.l")
    public int[] field2372 = new int[16];

    @ObfuscatedName("ey.a")
    public int[] field2367 = new int[16];

    @ObfuscatedName("ey.z")
    public int[] field2368 = new int[16];

    @ObfuscatedName("ey.s")
    public int[] field2375 = new int[16];

    @ObfuscatedName("ey.n")
    public int[] field2385 = new int[16];

    @ObfuscatedName("ey.q")
    public int[] field2365 = new int[16];

    @ObfuscatedName("ey.c")
    public int[] field2379 = new int[16];

    @ObfuscatedName("ey.h")
    public int[] field2380 = new int[16];

    @ObfuscatedName("ey.b")
    public int[] field2381 = new int[16];

    @ObfuscatedName("ey.y")
    public int[] field2382 = new int[16];

    @ObfuscatedName("ey.x")
    public class145[][] field2383 = new class145[16][128];

    @ObfuscatedName("ey.ao")
    public class145[][] field2384 = new class145[16][128];

    @ObfuscatedName("ey.ae")
    public class144 field2373 = new class144();

    @ObfuscatedName("ey.aa")
    public boolean field2386;

    @ObfuscatedName("ey.ah")
    public int field2387;

    @ObfuscatedName("ey.aw")
    public int field2388;

    @ObfuscatedName("ey.an")
    public long field2389;

    @ObfuscatedName("ey.av")
    public long field2390;

    @ObfuscatedName("ey.ak")
    public class143 field2376 = new class143(this);

    public class141() {
        this.method2735();
    }

    @ObfuscatedName("ey.i(IS)V")
    public synchronized void method2763(int arg0) {
        this.field2391 = arg0;
    }

    @ObfuscatedName("ey.w(S)I")
    public int method2716() {
        return this.field2391;
    }

    @ObfuscatedName("ey.e(Let;Leg;Lbr;II)Z")
    public synchronized boolean method2717(class139 arg0, class152 arg1, class58 arg2, int arg3) {
        arg0.method2695();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class176 var7 = (class176) arg0.field2349.method3276(); var7 != null; var7 = (class176) arg0.field2349.method3277()) {
            int var8 = (int) var7.field2817;
            class140 var9 = (class140) this.field2364.method3273((long) var8);
            if (var9 == null) {
                var9 = Statics.method1226(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2364.method3278(var9, (long) var8);
            }
            if (!var9.method2707(arg2, var7.field2811, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2693();
        }
        return var5;
    }

    @ObfuscatedName("ey.t(I)V")
    public synchronized void method2718() {
        for (class140 var1 = (class140) this.field2364.method3276(); var1 != null; var1 = (class140) this.field2364.method3277()) {
            var1.method2708();
        }
    }

    @ObfuscatedName("ey.d(I)V")
    public synchronized void method2719() {
        for (class140 var1 = (class140) this.field2364.method3276(); var1 != null; var1 = (class140) this.field2364.method3277()) {
            var1.method3328();
        }
    }

    @ObfuscatedName("ey.p(Let;ZB)V")
    public synchronized void method2720(class139 arg0, boolean arg1) {
        this.method2747();
        this.field2373.method2877(arg0.field2350);
        this.field2386 = arg1;
        this.field2389 = 0L;
        int var3 = this.field2373.method2834();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2373.method2836(var4);
            this.field2373.method2839(var4);
            this.field2373.method2837(var4);
        }
        this.field2387 = this.field2373.method2853();
        this.field2388 = this.field2373.field2414[this.field2387];
        this.field2390 = this.field2373.method2843(this.field2388);
    }

    @ObfuscatedName("ey.k(I)V")
    public synchronized void method2747() {
        this.field2373.method2833();
        this.method2735();
    }

    @ObfuscatedName("ey.r(I)Z")
    public synchronized boolean method2722() {
        return this.field2373.method2832();
    }

    @ObfuscatedName("ey.l(IIS)V")
    public synchronized void method2740(int arg0, int arg1) {
        this.method2724(arg0, arg1);
    }

    @ObfuscatedName("ey.a(IIB)V")
    public void method2724(int arg0, int arg1) {
        this.field2370[arg0] = arg1;
        this.field2372[arg0] = arg1 & 0xFFFFFF80;
        this.method2725(arg0, arg1);
    }

    @ObfuscatedName("ey.z(III)V")
    public void method2725(int arg0, int arg1) {
        if (this.field2371[arg0] != arg1) {
            this.field2371[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2384[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ey.s(IIII)V")
    public void method2726(int arg0, int arg1, int arg2) {
        this.method2810(arg0, arg1, 64);
        if ((this.field2385[arg0] & 0x2) != 0) {
            for (class145 var4 = (class145) this.field2376.field2404.method3315(); var4 != null; var4 = (class145) this.field2376.field2404.method3322()) {
                if (var4.field2427 == arg0 && var4.field2444 < 0) {
                    this.field2383[arg0][var4.field2428] = null;
                    this.field2383[arg0][arg1] = var4;
                    int var5 = (var4.field2437 * var4.field2433 >> 12) + var4.field2431;
                    var4.field2431 += arg1 - var4.field2428 << 8;
                    var4.field2437 = var5 - var4.field2431;
                    var4.field2433 = 4096;
                    var4.field2428 = arg1;
                    return;
                }
            }
        }
        class140 var6 = (class140) this.field2364.method3273((long) this.field2371[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2351[arg1];
        if (var7 == null) {
            return;
        }
        class145 var8 = new class145();
        var8.field2427 = arg0;
        var8.field2434 = var6;
        var8.field2425 = var7;
        var8.field2426 = var6.field2356[arg1];
        var8.field2440 = var6.field2357[arg1];
        var8.field2428 = arg1;
        var8.field2429 = var6.field2352 * arg2 * arg2 * var6.field2354[arg1] + 1024 >> 11;
        var8.field2430 = var6.field2361[arg1] & 0xFF;
        var8.field2431 = (arg1 << 8) - (var6.field2353[arg1] & 0x7FFF);
        var8.field2435 = 0;
        var8.field2424 = 0;
        var8.field2441 = 0;
        var8.field2444 = -1;
        var8.field2438 = 0;
        if (this.field2380[arg0] == 0) {
            var8.field2423 = class45.method956(var7, this.method2739(var8), this.method2780(var8), this.method2825(var8));
        } else {
            var8.field2423 = class45.method956(var7, this.method2739(var8), 0, this.method2825(var8));
            this.method2727(var8, var6.field2353[arg1] < 0);
        }
        if (var6.field2353[arg1] < 0) {
            var8.field2423.method1032(-1);
        }
        if (var8.field2440 >= 0) {
            class145 var9 = this.field2384[arg0][var8.field2440];
            if (var9 != null && var9.field2444 < 0) {
                this.field2383[arg0][var9.field2428] = null;
                var9.field2444 = 0;
            }
            this.field2384[arg0][var8.field2440] = var8;
        }
        this.field2376.field2404.method3289(var8);
        this.field2383[arg0][arg1] = var8;
    }

    @ObfuscatedName("ey.m(Ler;ZI)V")
    public void method2727(class145 arg0, boolean arg1) {
        int var3 = arg0.field2425.field1238.length;
        int var5;
        if (arg1 && arg0.field2425.field1242) {
            int var4 = var3 + var3 - arg0.field2425.field1240;
            var5 = (int) ((long) this.field2380[arg0.field2427] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2423.method965(true);
            }
        } else {
            var5 = (int) ((long) this.field2380[arg0.field2427] * (long) var3 >> 6);
        }
        arg0.field2423.method964(var5);
    }

    @ObfuscatedName("ey.u(IIIB)V")
    public void method2810(int arg0, int arg1, int arg2) {
        class145 var4 = this.field2383[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2383[arg0][arg1] = null;
        if ((this.field2385[arg0] & 0x2) == 0) {
            var4.field2444 = 0;
            return;
        }
        for (class145 var5 = (class145) this.field2376.field2404.method3294(); var5 != null; var5 = (class145) this.field2376.field2404.method3296()) {
            if (var4.field2427 == var5.field2427 && var5.field2444 < 0 && var4 != var5) {
                var4.field2444 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ey.g(IIII)V")
    public void method2729(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ey.o(III)V")
    public void method2730(int arg0, int arg1) {
    }

    @ObfuscatedName("ey.v(III)V")
    public void method2731(int arg0, int arg1) {
        this.field2367[arg0] = arg1;
    }

    @ObfuscatedName("ey.j(IB)V")
    public void method2732(int arg0) {
        for (class145 var2 = (class145) this.field2376.field2404.method3294(); var2 != null; var2 = (class145) this.field2376.field2404.method3296()) {
            if (arg0 < 0 || var2.field2427 == arg0) {
                if (var2.field2423 != null) {
                    var2.field2423.method969(Statics.field1100 / 100);
                    if (var2.field2423.method973()) {
                        this.field2376.field2408.method1102(var2.field2423);
                    }
                    var2.method2884();
                }
                if (var2.field2444 < 0) {
                    this.field2383[var2.field2427][var2.field2428] = null;
                }
                var2.method3328();
            }
        }
    }

    @ObfuscatedName("ey.n(II)V")
    public void method2821(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2821(var2);
            }
            return;
        }
        this.field2378[arg0] = 12800;
        this.field2374[arg0] = 8192;
        this.field2369[arg0] = 16383;
        this.field2367[arg0] = 8192;
        this.field2368[arg0] = 0;
        this.field2375[arg0] = 8192;
        this.method2736(arg0);
        this.method2788(arg0);
        this.field2385[arg0] = 0;
        this.field2365[arg0] = 32767;
        this.field2379[arg0] = 256;
        this.field2380[arg0] = 0;
        this.method2784(arg0, 8192);
    }

    @ObfuscatedName("ey.q(II)V")
    public void method2766(int arg0) {
        for (class145 var2 = (class145) this.field2376.field2404.method3294(); var2 != null; var2 = (class145) this.field2376.field2404.method3296()) {
            if ((arg0 < 0 || var2.field2427 == arg0) && var2.field2444 < 0) {
                this.field2383[var2.field2427][var2.field2428] = null;
                var2.field2444 = 0;
            }
        }
    }

    @ObfuscatedName("ey.c(I)V")
    public void method2735() {
        this.method2732(-1);
        this.method2821(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2371[var1] = this.field2370[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2372[var2] = this.field2370[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ey.ae(II)V")
    public void method2736(int arg0) {
        if ((this.field2385[arg0] & 0x2) == 0) {
            return;
        }
        for (class145 var2 = (class145) this.field2376.field2404.method3294(); var2 != null; var2 = (class145) this.field2376.field2404.method3296()) {
            if (var2.field2427 == arg0 && this.field2383[arg0][var2.field2428] == null && var2.field2444 < 0) {
                var2.field2444 = 0;
            }
        }
    }

    @ObfuscatedName("ey.aa(II)V")
    public void method2788(int arg0) {
        if ((this.field2385[arg0] & 0x4) == 0) {
            return;
        }
        for (class145 var2 = (class145) this.field2376.field2404.method3294(); var2 != null; var2 = (class145) this.field2376.field2404.method3296()) {
            if (var2.field2427 == arg0) {
                var2.field2443 = 0;
            }
        }
    }

    @ObfuscatedName("ey.ah(II)V")
    public void method2714(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2810(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2726(var6, var7, var8);
            } else {
                this.method2810(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2729(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2372[var12] = (var14 << 14) + (this.field2372[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2372[var12] = (var14 << 7) + (this.field2372[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2368[var12] = (var14 << 7) + (this.field2368[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2368[var12] = (this.field2368[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2375[var12] = (var14 << 7) + (this.field2375[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2375[var12] = (this.field2375[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2378[var12] = (var14 << 7) + (this.field2378[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2378[var12] = (this.field2378[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2374[var12] = (var14 << 7) + (this.field2374[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2374[var12] = (this.field2374[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2369[var12] = (var14 << 7) + (this.field2369[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2369[var12] = (this.field2369[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2385[var12] |= 0x1;
                } else {
                    this.field2385[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2385[var12] |= 0x2;
                } else {
                    this.method2736(var12);
                    this.field2385[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2365[var12] = (var14 << 7) + (this.field2365[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2365[var12] = (this.field2365[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2365[var12] = (var14 << 7) + (this.field2365[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2365[var12] = (this.field2365[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2732(var12);
            }
            if (var13 == 121) {
                this.method2821(var12);
            }
            if (var13 == 123) {
                this.method2766(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2365[var12];
                if (var15 == 16384) {
                    this.field2379[var12] = (var14 << 7) + (this.field2379[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2365[var12];
                if (var16 == 16384) {
                    this.field2379[var12] = (this.field2379[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2380[var12] = (var14 << 7) + (this.field2380[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2380[var12] = (this.field2380[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2385[var12] |= 0x4;
                } else {
                    this.method2788(var12);
                    this.field2385[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2784(var12, (var14 << 7) + (this.field2381[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2784(var12, (this.field2381[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2725(var17, this.field2372[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2730(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method2731(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2735();
            }
        }
    }

    @ObfuscatedName("ey.aw(III)V")
    public void method2784(int arg0, int arg1) {
        this.field2381[arg0] = arg1;
        this.field2382[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ey.an(Ler;B)I")
    public int method2739(class145 arg0) {
        int var2 = (arg0.field2437 * arg0.field2433 >> 12) + arg0.field2431;
        int var3 = ((this.field2367[arg0.field2427] - 8192) * this.field2379[arg0.field2427] >> 12) + var2;
        class142 var4 = arg0.field2426;
        if (var4.field2393 > 0 && (var4.field2398 > 0 || this.field2368[arg0.field2427] > 0)) {
            int var5 = var4.field2398 << 2;
            int var6 = var4.field2400 << 1;
            if (arg0.field2439 < var6) {
                var5 = arg0.field2439 * var5 / var6;
            }
            int var7 = (this.field2368[arg0.field2427] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2436 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2425.field1241 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1100 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ey.av(Ler;I)I")
    public int method2780(class145 arg0) {
        class142 var2 = arg0.field2426;
        int var3 = this.field2378[arg0.field2427] * this.field2369[arg0.field2427] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2429 * var4 + 16384 >> 15;
        int var6 = this.field2391 * var5 + 128 >> 8;
        if (var2.field2394 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2435 * 1.953125E-5D * (double) var2.field2394) + 0.5D);
        }
        if (var2.field2402 != null) {
            int var7 = arg0.field2424;
            int var8 = var2.field2402[arg0.field2441 + 1];
            if (arg0.field2441 < var2.field2402.length - 2) {
                int var9 = (var2.field2402[arg0.field2441] & 0xFF) << 8;
                int var10 = (var2.field2402[arg0.field2441 + 2] & 0xFF) << 8;
                var8 += (var2.field2402[arg0.field2441 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2444 > 0 && var2.field2399 != null) {
            int var11 = arg0.field2444;
            int var12 = var2.field2399[arg0.field2438 + 1];
            if (arg0.field2438 < var2.field2399.length - 2) {
                int var13 = (var2.field2399[arg0.field2438] & 0xFF) << 8;
                int var14 = (var2.field2399[arg0.field2438 + 2] & 0xFF) << 8;
                var12 += (var2.field2399[arg0.field2438 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ey.ak(Ler;I)I")
    public int method2825(class145 arg0) {
        int var2 = this.field2374[arg0.field2427];
        return var2 < 8192 ? arg0.field2430 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2430) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ey.h()Lar;")
    public synchronized class48 method974() {
        return this.field2376;
    }

    @ObfuscatedName("ey.b()Lar;")
    public synchronized class48 method975() {
        return null;
    }

    @ObfuscatedName("ey.y()I")
    public synchronized int method976() {
        return 0;
    }

    @ObfuscatedName("ey.x([III)V")
    public synchronized void method1005(int[] arg0, int arg1, int arg2) {
        if (this.field2373.method2832()) {
            int var4 = this.field2366 * this.field2373.field2410 / Statics.field1100;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2389;
                if (this.field2390 - var5 >= 0L) {
                    this.field2389 = var5;
                    break;
                }
                int var7 = (int) ((this.field2390 - this.field2389 + (long) var4 - 1L) / (long) var4);
                this.field2389 += (long) var4 * (long) var7;
                this.field2376.method1005(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2744();
            } while (this.field2373.method2832());
        }
        this.field2376.method1005(arg0, arg1, arg2);
    }

    @ObfuscatedName("ey.ao(I)V")
    public synchronized void method988(int arg0) {
        if (this.field2373.method2832()) {
            int var2 = this.field2366 * this.field2373.field2410 / Statics.field1100;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2389;
                if (this.field2390 - var3 >= 0L) {
                    this.field2389 = var3;
                    break;
                }
                int var5 = (int) ((this.field2390 - this.field2389 + (long) var2 - 1L) / (long) var2);
                this.field2389 += (long) var2 * (long) var5;
                this.field2376.method988(var5);
                arg0 -= var5;
                this.method2744();
            } while (this.field2373.method2832());
        }
        this.field2376.method988(arg0);
    }

    @ObfuscatedName("ey.ax(S)V")
    public void method2744() {
        int var1 = this.field2387;
        int var2 = this.field2388;
        long var3 = this.field2390;
        while (this.field2388 == var2) {
            while (this.field2373.field2414[var1] == var2) {
                this.field2373.method2836(var1);
                int var5 = this.field2373.method2840(var1);
                if (var5 == 1) {
                    this.field2373.method2849();
                    this.field2373.method2837(var1);
                    if (this.field2373.method2845()) {
                        if (!this.field2386 || var2 == 0) {
                            this.method2735();
                            this.field2373.method2833();
                            return;
                        }
                        this.field2373.method2846(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2714(var5);
                }
                this.field2373.method2839(var1);
                this.field2373.method2837(var1);
            }
            var1 = this.field2373.method2853();
            var2 = this.field2373.field2414[var1];
            var3 = this.field2373.method2843(var2);
        }
        this.field2387 = var1;
        this.field2388 = var2;
        this.field2390 = var3;
    }

    @ObfuscatedName("ey.ab(Ler;I)Z")
    public boolean method2745(class145 arg0) {
        if (arg0.field2423 != null) {
            return false;
        }
        if (arg0.field2444 >= 0) {
            arg0.method3328();
            if (arg0.field2440 > 0 && this.field2384[arg0.field2427][arg0.field2440] == arg0) {
                this.field2384[arg0.field2427][arg0.field2440] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ey.af(Ler;[IIII)Z")
    public boolean method2746(class145 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2442 = Statics.field1100 / 100;
        if (arg0.field2444 >= 0 && arg0.field2423 == null || arg0.field2423.method972()) {
            arg0.method2884();
            arg0.method3328();
            if (arg0.field2440 > 0 && this.field2384[arg0.field2427][arg0.field2440] == arg0) {
                this.field2384[arg0.field2427][arg0.field2440] = null;
            }
            return true;
        }
        int var5 = arg0.field2433;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2375[arg0.field2427] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2433 = var6;
        }
        arg0.field2423.method970(this.method2739(arg0));
        class142 var7 = arg0.field2426;
        boolean var8 = false;
        arg0.field2439++;
        arg0.field2436 += var7.field2393;
        double var9 = (double) ((arg0.field2428 - 60 << 8) + (arg0.field2437 * arg0.field2433 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2394 > 0) {
            if (var7.field2392 > 0) {
                arg0.field2435 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2392 * var9) + 0.5D);
            } else {
                arg0.field2435 += 128;
            }
        }
        if (var7.field2402 != null) {
            if (var7.field2395 > 0) {
                arg0.field2424 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2395 * var9) + 0.5D);
            } else {
                arg0.field2424 += 128;
            }
            while (arg0.field2441 < var7.field2402.length - 2 && arg0.field2424 > (var7.field2402[arg0.field2441 + 2] & 0xFF) << 8) {
                arg0.field2441 += 2;
            }
            if (arg0.field2441 == var7.field2402.length - 2 && var7.field2402[arg0.field2441 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2444 >= 0 && var7.field2399 != null && (this.field2385[arg0.field2427] & 0x1) == 0 && (arg0.field2440 < 0 || this.field2384[arg0.field2427][arg0.field2440] != arg0)) {
            if (var7.field2396 > 0) {
                arg0.field2444 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2396 * var9) + 0.5D);
            } else {
                arg0.field2444 += 128;
            }
            while (arg0.field2438 < var7.field2399.length - 2 && arg0.field2444 > (var7.field2399[arg0.field2438 + 2] & 0xFF) << 8) {
                arg0.field2438 += 2;
            }
            if (arg0.field2438 == var7.field2399.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2423.method1038(arg0.field2442, this.method2780(arg0), this.method2825(arg0));
            return false;
        }
        arg0.field2423.method969(arg0.field2442);
        if (arg1 == null) {
            arg0.field2423.method988(arg3);
        } else {
            arg0.field2423.method1005(arg1, arg2, arg3);
        }
        if (arg0.field2423.method973()) {
            this.field2376.field2408.method1102(arg0.field2423);
        }
        arg0.method2884();
        if (arg0.field2444 >= 0) {
            arg0.method3328();
            if (arg0.field2440 > 0 && this.field2384[arg0.field2427][arg0.field2440] == arg0) {
                this.field2384[arg0.field2427][arg0.field2440] = null;
            }
        }
        return true;
    }
}
