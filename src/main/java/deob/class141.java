package deob;

@ObfuscatedName("eo")
public class class141 extends class48 {

    @ObfuscatedName("eo.a")
    public class175 field2356 = new class175(128);

    @ObfuscatedName("eo.x")
    public int field2348 = 256;

    @ObfuscatedName("eo.e")
    public int field2364 = 1000000;

    @ObfuscatedName("eo.r")
    public int[] field2374 = new int[16];

    @ObfuscatedName("eo.p")
    public int[] field2367 = new int[16];

    @ObfuscatedName("eo.n")
    public int[] field2352 = new int[16];

    @ObfuscatedName("eo.o")
    public int[] field2365 = new int[16];

    @ObfuscatedName("eo.l")
    public int[] field2354 = new int[16];

    @ObfuscatedName("eo.t")
    public int[] field2355 = new int[16];

    @ObfuscatedName("eo.q")
    public int[] field2347 = new int[16];

    @ObfuscatedName("eo.c")
    public int[] field2357 = new int[16];

    @ObfuscatedName("eo.z")
    public int[] field2358 = new int[16];

    @ObfuscatedName("eo.v")
    public int[] field2359 = new int[16];

    @ObfuscatedName("eo.b")
    public int[] field2362 = new int[16];

    @ObfuscatedName("eo.j")
    public int[] field2349 = new int[16];

    @ObfuscatedName("eo.m")
    public int[] field2361 = new int[16];

    @ObfuscatedName("eo.k")
    public int[] field2350 = new int[16];

    @ObfuscatedName("eo.u")
    public int[] field2366 = new int[16];

    @ObfuscatedName("eo.i")
    public class145[][] field2376 = new class145[16][128];

    @ObfuscatedName("eo.ah")
    public class145[][] field2351 = new class145[16][128];

    @ObfuscatedName("eo.ag")
    public class144 field2369 = new class144();

    @ObfuscatedName("eo.ay")
    public boolean field2353;

    @ObfuscatedName("eo.as")
    public int field2371;

    @ObfuscatedName("eo.aq")
    public int field2372;

    @ObfuscatedName("eo.am")
    public long field2373;

    @ObfuscatedName("eo.an")
    public long field2368;

    @ObfuscatedName("eo.av")
    public class143 field2375 = new class143(this);

    public class141() {
        this.method2732();
    }

    @ObfuscatedName("eo.a(IB)V")
    public synchronized void method2778(int arg0) {
        this.field2348 = arg0;
    }

    @ObfuscatedName("eo.x(I)I")
    public int method2798() {
        return this.field2348;
    }

    @ObfuscatedName("eo.r(Lex;Leb;Lba;II)Z")
    public synchronized boolean method2708(class139 arg0, class152 arg1, class58 arg2, int arg3) {
        arg0.method2690();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class176 var7 = (class176) arg0.field2335.method3232(); var7 != null; var7 = (class176) arg0.field2335.method3233()) {
            int var8 = (int) var7.field2816;
            class140 var9 = (class140) this.field2356.method3242((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method2934(var8);
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
                this.field2356.method3234(var11, (long) var8);
            }
            if (!var9.method2699(arg2, var7.field2810, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2688();
        }
        return var5;
    }

    @ObfuscatedName("eo.p(I)V")
    public synchronized void method2709() {
        for (class140 var1 = (class140) this.field2356.method3232(); var1 != null; var1 = (class140) this.field2356.method3233()) {
            var1.method2702();
        }
    }

    @ObfuscatedName("eo.n(I)V")
    public synchronized void method2730() {
        for (class140 var1 = (class140) this.field2356.method3232(); var1 != null; var1 = (class140) this.field2356.method3233()) {
            var1.method3288();
        }
    }

    @ObfuscatedName("eo.o(Lex;ZI)V")
    public synchronized void method2711(class139 arg0, boolean arg1) {
        this.method2712();
        this.field2369.method2814(arg0.field2334);
        this.field2353 = arg1;
        this.field2373 = 0L;
        int var3 = this.field2369.method2847();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2369.method2818(var4);
            this.field2369.method2844(var4);
            this.field2369.method2819(var4);
        }
        this.field2371 = this.field2369.method2851();
        this.field2372 = this.field2369.field2402[this.field2371];
        this.field2368 = this.field2369.method2824(this.field2372);
    }

    @ObfuscatedName("eo.l(I)V")
    public synchronized void method2712() {
        this.field2369.method2815();
        this.method2732();
    }

    @ObfuscatedName("eo.t(I)Z")
    public synchronized boolean method2713() {
        return this.field2369.method2816();
    }

    @ObfuscatedName("eo.q(IIB)V")
    public synchronized void method2776(int arg0, int arg1) {
        this.method2714(arg0, arg1);
    }

    @ObfuscatedName("eo.c(III)V")
    public void method2714(int arg0, int arg1) {
        this.field2365[arg0] = arg1;
        this.field2355[arg0] = arg1 & 0xFFFFFF80;
        this.method2715(arg0, arg1);
    }

    @ObfuscatedName("eo.z(III)V")
    public void method2715(int arg0, int arg1) {
        if (this.field2354[arg0] != arg1) {
            this.field2354[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2351[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("eo.s(IIII)V")
    public void method2797(int arg0, int arg1, int arg2) {
        this.method2718(arg0, arg1, 64);
        if ((this.field2359[arg0] & 0x2) != 0) {
            for (class145 var4 = (class145) this.field2375.field2396.method3253(); var4 != null; var4 = (class145) this.field2375.field2396.method3255()) {
                if (var4.field2423 == arg0 && var4.field2426 < 0) {
                    this.field2376[arg0][var4.field2417] = null;
                    this.field2376[arg0][arg1] = var4;
                    int var5 = (var4.field2422 * var4.field2420 >> 12) + var4.field2432;
                    var4.field2432 += arg1 - var4.field2417 << 8;
                    var4.field2420 = var5 - var4.field2432;
                    var4.field2422 = 4096;
                    var4.field2417 = arg1;
                    return;
                }
            }
        }
        class140 var6 = (class140) this.field2356.method3242((long) this.field2354[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2343[arg1];
        if (var7 == null) {
            return;
        }
        class145 var8 = new class145();
        var8.field2423 = arg0;
        var8.field2421 = var6;
        var8.field2414 = var7;
        var8.field2415 = var6.field2341[arg1];
        var8.field2416 = var6.field2342[arg1];
        var8.field2417 = arg1;
        var8.field2418 = var6.field2345 * arg2 * arg2 * var6.field2336[arg1] + 1024 >> 11;
        var8.field2419 = var6.field2340[arg1] & 0xFF;
        var8.field2432 = (arg1 << 8) - (var6.field2338[arg1] & 0x7FFF);
        var8.field2429 = 0;
        var8.field2412 = 0;
        var8.field2425 = 0;
        var8.field2426 = -1;
        var8.field2427 = 0;
        if (this.field2361[arg0] == 0) {
            var8.field2424 = class45.method1044(var7, this.method2786(var8), this.method2706(var8), this.method2731(var8));
        } else {
            var8.field2424 = class45.method1044(var7, this.method2786(var8), 0, this.method2731(var8));
            this.method2717(var8, var6.field2338[arg1] < 0);
        }
        if (var6.field2338[arg1] < 0) {
            var8.field2424.method956(-1);
        }
        if (var8.field2416 >= 0) {
            class145 var9 = this.field2351[arg0][var8.field2416];
            if (var9 != null && var9.field2426 < 0) {
                this.field2376[arg0][var9.field2417] = null;
                var9.field2426 = 0;
            }
            this.field2351[arg0][var8.field2416] = var8;
        }
        this.field2375.field2396.method3247(var8);
        this.field2376[arg0][arg1] = var8;
    }

    @ObfuscatedName("eo.h(Lea;ZI)V")
    public void method2717(class145 arg0, boolean arg1) {
        int var3 = arg0.field2414.field1245.length;
        int var5;
        if (arg1 && arg0.field2414.field1248) {
            int var4 = var3 + var3 - arg0.field2414.field1246;
            var5 = (int) ((long) this.field2361[arg0.field2423] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2424.method1051(true);
            }
        } else {
            var5 = (int) ((long) this.field2361[arg0.field2423] * (long) var3 >> 6);
        }
        arg0.field2424.method962(var5);
    }

    @ObfuscatedName("eo.f(IIII)V")
    public void method2718(int arg0, int arg1, int arg2) {
        class145 var4 = this.field2376[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2376[arg0][arg1] = null;
        if ((this.field2359[arg0] & 0x2) == 0) {
            var4.field2426 = 0;
            return;
        }
        for (class145 var5 = (class145) this.field2375.field2396.method3252(); var5 != null; var5 = (class145) this.field2375.field2396.method3268()) {
            if (var4.field2423 == var5.field2423 && var5.field2426 < 0 && var4 != var5) {
                var4.field2426 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("eo.w(IIII)V")
    public void method2719(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("eo.d(III)V")
    public void method2710(int arg0, int arg1) {
    }

    @ObfuscatedName("eo.y(III)V")
    public void method2720(int arg0, int arg1) {
        this.field2347[arg0] = arg1;
    }

    @ObfuscatedName("eo.g(IS)V")
    public void method2721(int arg0) {
        for (class145 var2 = (class145) this.field2375.field2396.method3252(); var2 != null; var2 = (class145) this.field2375.field2396.method3268()) {
            if (arg0 < 0 || var2.field2423 == arg0) {
                if (var2.field2424 != null) {
                    var2.field2424.method967(Statics.field1989 / 100);
                    if (var2.field2424.method971()) {
                        this.field2375.field2392.method1094(var2.field2424);
                    }
                    var2.method2854();
                }
                if (var2.field2426 < 0) {
                    this.field2376[var2.field2423][var2.field2417] = null;
                }
                var2.method3288();
            }
        }
    }

    @ObfuscatedName("eo.v(IB)V")
    public void method2722(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2722(var2);
            }
            return;
        }
        this.field2374[arg0] = 12800;
        this.field2367[arg0] = 8192;
        this.field2352[arg0] = 16383;
        this.field2347[arg0] = 8192;
        this.field2357[arg0] = 0;
        this.field2358[arg0] = 8192;
        this.method2725(arg0);
        this.method2726(arg0);
        this.field2359[arg0] = 0;
        this.field2362[arg0] = 32767;
        this.field2349[arg0] = 256;
        this.field2361[arg0] = 0;
        this.method2754(arg0, 8192);
    }

    @ObfuscatedName("eo.b(II)V")
    public void method2723(int arg0) {
        for (class145 var2 = (class145) this.field2375.field2396.method3252(); var2 != null; var2 = (class145) this.field2375.field2396.method3268()) {
            if ((arg0 < 0 || var2.field2423 == arg0) && var2.field2426 < 0) {
                this.field2376[var2.field2423][var2.field2417] = null;
                var2.field2426 = 0;
            }
        }
    }

    @ObfuscatedName("eo.j(I)V")
    public void method2732() {
        this.method2721(-1);
        this.method2722(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2354[var1] = this.field2365[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2355[var2] = this.field2365[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("eo.ag(II)V")
    public void method2725(int arg0) {
        if ((this.field2359[arg0] & 0x2) == 0) {
            return;
        }
        for (class145 var2 = (class145) this.field2375.field2396.method3252(); var2 != null; var2 = (class145) this.field2375.field2396.method3268()) {
            if (var2.field2423 == arg0 && this.field2376[arg0][var2.field2417] == null && var2.field2426 < 0) {
                var2.field2426 = 0;
            }
        }
    }

    @ObfuscatedName("eo.ay(II)V")
    public void method2726(int arg0) {
        if ((this.field2359[arg0] & 0x4) == 0) {
            return;
        }
        for (class145 var2 = (class145) this.field2375.field2396.method3252(); var2 != null; var2 = (class145) this.field2375.field2396.method3268()) {
            if (var2.field2423 == arg0) {
                var2.field2430 = 0;
            }
        }
    }

    @ObfuscatedName("eo.as(II)V")
    public void method2764(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2718(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2797(var6, var7, var8);
            } else {
                this.method2718(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2719(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2355[var12] = (var14 << 14) + (this.field2355[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2355[var12] = (var14 << 7) + (this.field2355[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2357[var12] = (var14 << 7) + (this.field2357[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2357[var12] = (this.field2357[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2358[var12] = (var14 << 7) + (this.field2358[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2358[var12] = (this.field2358[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2374[var12] = (var14 << 7) + (this.field2374[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2374[var12] = (this.field2374[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2367[var12] = (var14 << 7) + (this.field2367[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2367[var12] = (this.field2367[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2352[var12] = (var14 << 7) + (this.field2352[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2352[var12] = (this.field2352[var12] & 0xFFFFFF80) + var14;
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
                    this.method2725(var12);
                    this.field2359[var12] &= 0xFFFFFFFD;
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
                this.method2721(var12);
            }
            if (var13 == 121) {
                this.method2722(var12);
            }
            if (var13 == 123) {
                this.method2723(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2362[var12];
                if (var15 == 16384) {
                    this.field2349[var12] = (var14 << 7) + (this.field2349[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2362[var12];
                if (var16 == 16384) {
                    this.field2349[var12] = (this.field2349[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2361[var12] = (var14 << 7) + (this.field2361[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2361[var12] = (this.field2361[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2359[var12] |= 0x4;
                } else {
                    this.method2726(var12);
                    this.field2359[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2754(var12, (var14 << 7) + (this.field2350[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2754(var12, (this.field2350[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2715(var17, this.field2355[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2710(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method2720(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2732();
            }
        }
    }

    @ObfuscatedName("eo.aq(III)V")
    public void method2754(int arg0, int arg1) {
        this.field2350[arg0] = arg1;
        this.field2366[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("eo.am(Lea;I)I")
    public int method2786(class145 arg0) {
        int var2 = (arg0.field2422 * arg0.field2420 >> 12) + arg0.field2432;
        int var3 = ((this.field2347[arg0.field2423] - 8192) * this.field2349[arg0.field2423] >> 12) + var2;
        class142 var4 = arg0.field2415;
        if (var4.field2386 > 0 && (var4.field2388 > 0 || this.field2357[arg0.field2423] > 0)) {
            int var5 = var4.field2388 << 2;
            int var6 = var4.field2387 << 1;
            if (arg0.field2428 < var6) {
                var5 = arg0.field2428 * var5 / var6;
            }
            int var7 = (this.field2357[arg0.field2423] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2431 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2414.field1244 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1989 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("eo.an(Lea;I)I")
    public int method2706(class145 arg0) {
        class142 var2 = arg0.field2415;
        int var3 = this.field2374[arg0.field2423] * this.field2352[arg0.field2423] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2418 * var4 + 16384 >> 15;
        int var6 = this.field2348 * var5 + 128 >> 8;
        if (var2.field2381 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2429 * 1.953125E-5D * (double) var2.field2381) + 0.5D);
        }
        if (var2.field2379 != null) {
            int var7 = arg0.field2412;
            int var8 = var2.field2379[arg0.field2425 + 1];
            if (arg0.field2425 < var2.field2379.length - 2) {
                int var9 = (var2.field2379[arg0.field2425] & 0xFF) << 8;
                int var10 = (var2.field2379[arg0.field2425 + 2] & 0xFF) << 8;
                var8 += (var2.field2379[arg0.field2425 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2426 > 0 && var2.field2380 != null) {
            int var11 = arg0.field2426;
            int var12 = var2.field2380[arg0.field2427 + 1];
            if (arg0.field2427 < var2.field2380.length - 2) {
                int var13 = (var2.field2380[arg0.field2427] & 0xFF) << 8;
                int var14 = (var2.field2380[arg0.field2427 + 2] & 0xFF) << 8;
                var12 += (var2.field2380[arg0.field2427 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("eo.av(Lea;I)I")
    public int method2731(class145 arg0) {
        int var2 = this.field2367[arg0.field2423];
        return var2 < 8192 ? arg0.field2419 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2419) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("eo.m()Law;")
    public synchronized class48 method972() {
        return this.field2375;
    }

    @ObfuscatedName("eo.k()Law;")
    public synchronized class48 method1041() {
        return null;
    }

    @ObfuscatedName("eo.u()I")
    public synchronized int method974() {
        return 0;
    }

    @ObfuscatedName("eo.i([III)V")
    public synchronized void method992(int[] arg0, int arg1, int arg2) {
        if (this.field2369.method2816()) {
            int var4 = this.field2364 * this.field2369.field2409 / Statics.field1989;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2373;
                if (this.field2368 - var5 >= 0L) {
                    this.field2373 = var5;
                    break;
                }
                int var7 = (int) ((this.field2368 - this.field2373 + (long) var4 - 1L) / (long) var4);
                this.field2373 += (long) var4 * (long) var7;
                this.field2375.method992(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2765();
            } while (this.field2369.method2816());
        }
        this.field2375.method992(arg0, arg1, arg2);
    }

    @ObfuscatedName("eo.ah(I)V")
    public synchronized void method976(int arg0) {
        if (this.field2369.method2816()) {
            int var2 = this.field2364 * this.field2369.field2409 / Statics.field1989;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2373;
                if (this.field2368 - var3 >= 0L) {
                    this.field2373 = var3;
                    break;
                }
                int var5 = (int) ((this.field2368 - this.field2373 + (long) var2 - 1L) / (long) var2);
                this.field2373 += (long) var2 * (long) var5;
                this.field2375.method976(var5);
                arg0 -= var5;
                this.method2765();
            } while (this.field2369.method2816());
        }
        this.field2375.method976(arg0);
    }

    @ObfuscatedName("eo.at(I)V")
    public void method2765() {
        int var1 = this.field2371;
        int var2 = this.field2372;
        long var3 = this.field2368;
        while (this.field2372 == var2) {
            while (this.field2369.field2402[var1] == var2) {
                this.field2369.method2818(var1);
                int var5 = this.field2369.method2837(var1);
                if (var5 == 1) {
                    this.field2369.method2820();
                    this.field2369.method2819(var1);
                    if (this.field2369.method2826()) {
                        if (!this.field2353 || var2 == 0) {
                            this.method2732();
                            this.field2369.method2815();
                            return;
                        }
                        this.field2369.method2827(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2764(var5);
                }
                this.field2369.method2844(var1);
                this.field2369.method2819(var1);
            }
            var1 = this.field2369.method2851();
            var2 = this.field2369.field2402[var1];
            var3 = this.field2369.method2824(var2);
        }
        this.field2371 = var1;
        this.field2372 = var2;
        this.field2368 = var3;
    }

    @ObfuscatedName("eo.ap(Lea;B)Z")
    public boolean method2734(class145 arg0) {
        if (arg0.field2424 != null) {
            return false;
        }
        if (arg0.field2426 >= 0) {
            arg0.method3288();
            if (arg0.field2416 > 0 && this.field2351[arg0.field2423][arg0.field2416] == arg0) {
                this.field2351[arg0.field2423][arg0.field2416] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("eo.ae(Lea;[IIIB)Z")
    public boolean method2792(class145 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2413 = Statics.field1989 / 100;
        if (arg0.field2426 >= 0 && arg0.field2424 == null || arg0.field2424.method949()) {
            arg0.method2854();
            arg0.method3288();
            if (arg0.field2416 > 0 && this.field2351[arg0.field2423][arg0.field2416] == arg0) {
                this.field2351[arg0.field2423][arg0.field2416] = null;
            }
            return true;
        }
        int var5 = arg0.field2422;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2358[arg0.field2423] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2422 = var6;
        }
        arg0.field2424.method968(this.method2786(arg0));
        class142 var7 = arg0.field2415;
        boolean var8 = false;
        arg0.field2428++;
        arg0.field2431 += var7.field2386;
        double var9 = (double) ((arg0.field2417 - 60 << 8) + (arg0.field2422 * arg0.field2420 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2381 > 0) {
            if (var7.field2383 > 0) {
                arg0.field2429 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2383 * var9) + 0.5D);
            } else {
                arg0.field2429 += 128;
            }
        }
        if (var7.field2379 != null) {
            if (var7.field2382 > 0) {
                arg0.field2412 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2382 * var9) + 0.5D);
            } else {
                arg0.field2412 += 128;
            }
            while (arg0.field2425 < var7.field2379.length - 2 && arg0.field2412 > (var7.field2379[arg0.field2425 + 2] & 0xFF) << 8) {
                arg0.field2425 += 2;
            }
            if (arg0.field2425 == var7.field2379.length - 2 && var7.field2379[arg0.field2425 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2426 >= 0 && var7.field2380 != null && (this.field2359[arg0.field2423] & 0x1) == 0 && (arg0.field2416 < 0 || this.field2351[arg0.field2423][arg0.field2416] != arg0)) {
            if (var7.field2391 > 0) {
                arg0.field2426 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2391 * var9) + 0.5D);
            } else {
                arg0.field2426 += 128;
            }
            while (arg0.field2427 < var7.field2380.length - 2 && arg0.field2426 > (var7.field2380[arg0.field2427 + 2] & 0xFF) << 8) {
                arg0.field2427 += 2;
            }
            if (arg0.field2427 == var7.field2380.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2424.method954(arg0.field2413, this.method2706(arg0), this.method2731(arg0));
            return false;
        }
        arg0.field2424.method967(arg0.field2413);
        if (arg1 == null) {
            arg0.field2424.method976(arg3);
        } else {
            arg0.field2424.method992(arg1, arg2, arg3);
        }
        if (arg0.field2424.method971()) {
            this.field2375.field2392.method1094(arg0.field2424);
        }
        arg0.method2854();
        if (arg0.field2426 >= 0) {
            arg0.method3288();
            if (arg0.field2416 > 0 && this.field2351[arg0.field2423][arg0.field2416] == arg0) {
                this.field2351[arg0.field2423][arg0.field2416] = null;
            }
        }
        return true;
    }
}
