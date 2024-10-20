package deob;

@ObfuscatedName("ec")
public class class141 extends class48 {

    @ObfuscatedName("ec.x")
    public class175 field2350 = new class175(128);

    @ObfuscatedName("ec.p")
    public int field2338 = 256;

    @ObfuscatedName("ec.k")
    public int field2335 = 1000000;

    @ObfuscatedName("ec.a")
    public int[] field2336 = new int[16];

    @ObfuscatedName("ec.q")
    public int[] field2339 = new int[16];

    @ObfuscatedName("ec.j")
    public int[] field2340 = new int[16];

    @ObfuscatedName("ec.v")
    public int[] field2345 = new int[16];

    @ObfuscatedName("ec.l")
    public int[] field2341 = new int[16];

    @ObfuscatedName("ec.s")
    public int[] field2343 = new int[16];

    @ObfuscatedName("ec.n")
    public int[] field2344 = new int[16];

    @ObfuscatedName("ec.c")
    public int[] field2366 = new int[16];

    @ObfuscatedName("ec.h")
    public int[] field2346 = new int[16];

    @ObfuscatedName("ec.m")
    public int[] field2347 = new int[16];

    @ObfuscatedName("ec.o")
    public int[] field2348 = new int[16];

    @ObfuscatedName("ec.e")
    public int[] field2349 = new int[16];

    @ObfuscatedName("ec.f")
    public int[] field2337 = new int[16];

    @ObfuscatedName("ec.i")
    public int[] field2351 = new int[16];

    @ObfuscatedName("ec.d")
    public int[] field2352 = new int[16];

    @ObfuscatedName("ec.z")
    public class145[][] field2353 = new class145[16][128];

    @ObfuscatedName("ec.ai")
    public class145[][] field2354 = new class145[16][128];

    @ObfuscatedName("ec.ag")
    public class144 field2355 = new class144();

    @ObfuscatedName("ec.as")
    public boolean field2356;

    @ObfuscatedName("ec.al")
    public int field2357;

    @ObfuscatedName("ec.aj")
    public int field2362;

    @ObfuscatedName("ec.am")
    public long field2359;

    @ObfuscatedName("ec.ab")
    public long field2358;

    @ObfuscatedName("ec.ao")
    public class143 field2361 = new class143(this);

    public class141() {
        this.method2706();
    }

    @ObfuscatedName("ec.x(II)V")
    public synchronized void method2687(int arg0) {
        this.field2338 = arg0;
    }

    @ObfuscatedName("ec.p(S)I")
    public int method2688() {
        return this.field2338;
    }

    @ObfuscatedName("ec.a(Les;Lej;Lbd;II)Z")
    public synchronized boolean method2689(class139 arg0, class152 arg1, class58 arg2, int arg3) {
        arg0.method2669();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class176 var7 = (class176) arg0.field2320.method3248(); var7 != null; var7 = (class176) arg0.field2320.method3247()) {
            int var8 = (int) var7.field2816;
            class140 var9 = (class140) this.field2350.method3259((long) var8);
            if (var9 == null) {
                var9 = class140.method1815(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2350.method3253(var9, (long) var8);
            }
            if (!var9.method2678(arg2, var7.field2809, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2670();
        }
        return var5;
    }

    @ObfuscatedName("ec.q(B)V")
    public synchronized void method2690() {
        for (class140 var1 = (class140) this.field2350.method3248(); var1 != null; var1 = (class140) this.field2350.method3247()) {
            var1.method2677();
        }
    }

    @ObfuscatedName("ec.j(I)V")
    public synchronized void method2691() {
        for (class140 var1 = (class140) this.field2350.method3248(); var1 != null; var1 = (class140) this.field2350.method3247()) {
            var1.method3301();
        }
    }

    @ObfuscatedName("ec.v(Les;ZB)V")
    public synchronized void method2692(class139 arg0, boolean arg1) {
        this.method2771();
        this.field2355.method2799(arg0.field2321);
        this.field2356 = arg1;
        this.field2359 = 0L;
        int var3 = this.field2355.method2814();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2355.method2803(var4);
            this.field2355.method2809(var4);
            this.field2355.method2820(var4);
        }
        this.field2357 = this.field2355.method2818();
        this.field2362 = this.field2355.field2395[this.field2357];
        this.field2358 = this.field2355.method2810(this.field2362);
    }

    @ObfuscatedName("ec.w(I)V")
    public synchronized void method2771() {
        this.field2355.method2800();
        this.method2706();
    }

    @ObfuscatedName("ec.l(I)Z")
    public synchronized boolean method2694() {
        return this.field2355.method2801();
    }

    @ObfuscatedName("ec.s(IIS)V")
    public synchronized void method2695(int arg0, int arg1) {
        this.method2696(arg0, arg1);
    }

    @ObfuscatedName("ec.n(IIS)V")
    public void method2696(int arg0, int arg1) {
        this.field2345[arg0] = arg1;
        this.field2343[arg0] = arg1 & 0xFFFFFF80;
        this.method2697(arg0, arg1);
    }

    @ObfuscatedName("ec.c(IIB)V")
    public void method2697(int arg0, int arg1) {
        if (this.field2341[arg0] != arg1) {
            this.field2341[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2354[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ec.h(IIII)V")
    public void method2718(int arg0, int arg1, int arg2) {
        this.method2786(arg0, arg1, 64);
        if ((this.field2347[arg0] & 0x2) != 0) {
            for (class145 var4 = (class145) this.field2361.field2389.method3274(); var4 != null; var4 = (class145) this.field2361.field2389.method3266()) {
                if (var4.field2415 == arg0 && var4.field2407 < 0) {
                    this.field2353[arg0][var4.field2408] = null;
                    this.field2353[arg0][arg1] = var4;
                    int var5 = (var4.field2413 * var4.field2405 >> 12) + var4.field2414;
                    var4.field2414 += arg1 - var4.field2408 << 8;
                    var4.field2405 = var5 - var4.field2414;
                    var4.field2413 = 4096;
                    var4.field2408 = arg1;
                    return;
                }
            }
        }
        class140 var6 = (class140) this.field2350.method3259((long) this.field2341[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2329[arg1];
        if (var7 == null) {
            return;
        }
        class145 var8 = new class145();
        var8.field2415 = arg0;
        var8.field2406 = var6;
        var8.field2410 = var7;
        var8.field2416 = var6.field2327[arg1];
        var8.field2409 = var6.field2328[arg1];
        var8.field2408 = arg1;
        var8.field2411 = var6.field2323 * arg2 * arg2 * var6.field2325[arg1] + 1024 >> 11;
        var8.field2412 = var6.field2326[arg1] & 0xFF;
        var8.field2414 = (arg1 << 8) - (var6.field2324[arg1] & 0x7FFF);
        var8.field2419 = 0;
        var8.field2417 = 0;
        var8.field2418 = 0;
        var8.field2407 = -1;
        var8.field2420 = 0;
        if (this.field2337[arg0] == 0) {
            var8.field2424 = class45.method928(var7, this.method2711(var8), this.method2743(var8), this.method2763(var8));
        } else {
            var8.field2424 = class45.method928(var7, this.method2711(var8), 0, this.method2763(var8));
            this.method2699(var8, var6.field2324[arg1] < 0);
        }
        if (var6.field2324[arg1] < 0) {
            var8.field2424.method1028(-1);
        }
        if (var8.field2409 >= 0) {
            class145 var9 = this.field2354[arg0][var8.field2409];
            if (var9 != null && var9.field2407 < 0) {
                this.field2353[arg0][var9.field2408] = null;
                var9.field2407 = 0;
            }
            this.field2354[arg0][var8.field2409] = var8;
        }
        this.field2361.field2389.method3264(var8);
        this.field2353[arg0][arg1] = var8;
    }

    @ObfuscatedName("ec.u(Lef;ZI)V")
    public void method2699(class145 arg0, boolean arg1) {
        int var3 = arg0.field2410.field1207.length;
        int var5;
        if (arg1 && arg0.field2410.field1206) {
            int var4 = var3 + var3 - arg0.field2410.field1208;
            var5 = (int) ((long) this.field2337[arg0.field2415] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2424.method937(true);
            }
        } else {
            var5 = (int) ((long) this.field2337[arg0.field2415] * (long) var3 >> 6);
        }
        arg0.field2424.method936(var5);
    }

    @ObfuscatedName("ec.y(IIII)V")
    public void method2786(int arg0, int arg1, int arg2) {
        class145 var4 = this.field2353[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2353[arg0][arg1] = null;
        if ((this.field2347[arg0] & 0x2) == 0) {
            var4.field2407 = 0;
            return;
        }
        for (class145 var5 = (class145) this.field2361.field2389.method3280(); var5 != null; var5 = (class145) this.field2361.field2389.method3269()) {
            if (var4.field2415 == var5.field2415 && var5.field2407 < 0 && var4 != var5) {
                var4.field2407 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ec.b(IIII)V")
    public void method2700(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ec.t(III)V")
    public void method2698(int arg0, int arg1) {
    }

    @ObfuscatedName("ec.r(III)V")
    public void method2710(int arg0, int arg1) {
        this.field2344[arg0] = arg1;
    }

    @ObfuscatedName("ec.g(IB)V")
    public void method2703(int arg0) {
        for (class145 var2 = (class145) this.field2361.field2389.method3280(); var2 != null; var2 = (class145) this.field2361.field2389.method3269()) {
            if (arg0 < 0 || var2.field2415 == arg0) {
                if (var2.field2424 != null) {
                    var2.field2424.method1069(Statics.field1082 / 100);
                    if (var2.field2424.method945()) {
                        this.field2361.field2382.method1074(var2.field2424);
                    }
                    var2.method2853();
                }
                if (var2.field2407 < 0) {
                    this.field2353[var2.field2415][var2.field2408] = null;
                }
                var2.method3301();
            }
        }
    }

    @ObfuscatedName("ec.m(II)V")
    public void method2704(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2704(var2);
            }
            return;
        }
        this.field2336[arg0] = 12800;
        this.field2339[arg0] = 8192;
        this.field2340[arg0] = 16383;
        this.field2344[arg0] = 8192;
        this.field2366[arg0] = 0;
        this.field2346[arg0] = 8192;
        this.method2707(arg0);
        this.method2708(arg0);
        this.field2347[arg0] = 0;
        this.field2348[arg0] = 32767;
        this.field2349[arg0] = 256;
        this.field2337[arg0] = 0;
        this.method2787(arg0, 8192);
    }

    @ObfuscatedName("ec.o(II)V")
    public void method2756(int arg0) {
        for (class145 var2 = (class145) this.field2361.field2389.method3280(); var2 != null; var2 = (class145) this.field2361.field2389.method3269()) {
            if ((arg0 < 0 || var2.field2415 == arg0) && var2.field2407 < 0) {
                this.field2353[var2.field2415][var2.field2408] = null;
                var2.field2407 = 0;
            }
        }
    }

    @ObfuscatedName("ec.e(B)V")
    public void method2706() {
        this.method2703(-1);
        this.method2704(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2341[var1] = this.field2345[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2343[var2] = this.field2345[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ec.ag(IB)V")
    public void method2707(int arg0) {
        if ((this.field2347[arg0] & 0x2) == 0) {
            return;
        }
        for (class145 var2 = (class145) this.field2361.field2389.method3280(); var2 != null; var2 = (class145) this.field2361.field2389.method3269()) {
            if (var2.field2415 == arg0 && this.field2353[arg0][var2.field2408] == null && var2.field2407 < 0) {
                var2.field2407 = 0;
            }
        }
    }

    @ObfuscatedName("ec.as(II)V")
    public void method2708(int arg0) {
        if ((this.field2347[arg0] & 0x4) == 0) {
            return;
        }
        for (class145 var2 = (class145) this.field2361.field2389.method3280(); var2 != null; var2 = (class145) this.field2361.field2389.method3269()) {
            if (var2.field2415 == arg0) {
                var2.field2425 = 0;
            }
        }
    }

    @ObfuscatedName("ec.al(II)V")
    public void method2748(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2786(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2718(var6, var7, var8);
            } else {
                this.method2786(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2700(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2343[var12] = (var14 << 14) + (this.field2343[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2343[var12] = (var14 << 7) + (this.field2343[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2366[var12] = (var14 << 7) + (this.field2366[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2366[var12] = (this.field2366[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2346[var12] = (var14 << 7) + (this.field2346[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2346[var12] = (this.field2346[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2336[var12] = (var14 << 7) + (this.field2336[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2336[var12] = (this.field2336[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2339[var12] = (var14 << 7) + (this.field2339[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2339[var12] = (this.field2339[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2340[var12] = (var14 << 7) + (this.field2340[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2340[var12] = (this.field2340[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2347[var12] |= 0x1;
                } else {
                    this.field2347[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2347[var12] |= 0x2;
                } else {
                    this.method2707(var12);
                    this.field2347[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2348[var12] = (var14 << 7) + (this.field2348[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2348[var12] = (this.field2348[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2348[var12] = (var14 << 7) + (this.field2348[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2348[var12] = (this.field2348[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2703(var12);
            }
            if (var13 == 121) {
                this.method2704(var12);
            }
            if (var13 == 123) {
                this.method2756(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2348[var12];
                if (var15 == 16384) {
                    this.field2349[var12] = (var14 << 7) + (this.field2349[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2348[var12];
                if (var16 == 16384) {
                    this.field2349[var12] = (this.field2349[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2337[var12] = (var14 << 7) + (this.field2337[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2337[var12] = (this.field2337[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2347[var12] |= 0x4;
                } else {
                    this.method2708(var12);
                    this.field2347[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2787(var12, (var14 << 7) + (this.field2351[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2787(var12, (this.field2351[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2697(var17, this.field2343[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2698(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method2710(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2706();
            }
        }
    }

    @ObfuscatedName("ec.aj(III)V")
    public void method2787(int arg0, int arg1) {
        this.field2351[arg0] = arg1;
        this.field2352[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ec.am(Lef;I)I")
    public int method2711(class145 arg0) {
        int var2 = (arg0.field2413 * arg0.field2405 >> 12) + arg0.field2414;
        int var3 = ((this.field2344[arg0.field2415] - 8192) * this.field2349[arg0.field2415] >> 12) + var2;
        class142 var4 = arg0.field2416;
        if (var4.field2374 > 0 && (var4.field2376 > 0 || this.field2366[arg0.field2415] > 0)) {
            int var5 = var4.field2376 << 2;
            int var6 = var4.field2375 << 1;
            if (arg0.field2421 < var6) {
                var5 = arg0.field2421 * var5 / var6;
            }
            int var7 = (this.field2366[arg0.field2415] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2422 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2410.field1210 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1082 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ec.ab(Lef;I)I")
    public int method2743(class145 arg0) {
        class142 var2 = arg0.field2416;
        int var3 = this.field2336[arg0.field2415] * this.field2340[arg0.field2415] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2411 * var4 + 16384 >> 15;
        int var6 = this.field2338 * var5 + 128 >> 8;
        if (var2.field2369 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2419 * 1.953125E-5D * (double) var2.field2369) + 0.5D);
        }
        if (var2.field2371 != null) {
            int var7 = arg0.field2417;
            int var8 = var2.field2371[arg0.field2418 + 1];
            if (arg0.field2418 < var2.field2371.length - 2) {
                int var9 = (var2.field2371[arg0.field2418] & 0xFF) << 8;
                int var10 = (var2.field2371[arg0.field2418 + 2] & 0xFF) << 8;
                var8 += (var2.field2371[arg0.field2418 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2407 > 0 && var2.field2367 != null) {
            int var11 = arg0.field2407;
            int var12 = var2.field2367[arg0.field2420 + 1];
            if (arg0.field2420 < var2.field2367.length - 2) {
                int var13 = (var2.field2367[arg0.field2420] & 0xFF) << 8;
                int var14 = (var2.field2367[arg0.field2420 + 2] & 0xFF) << 8;
                var12 += (var2.field2367[arg0.field2420 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ec.ao(Lef;I)I")
    public int method2763(class145 arg0) {
        int var2 = this.field2339[arg0.field2415];
        return var2 < 8192 ? arg0.field2412 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2412) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ec.f()Lau;")
    public synchronized class48 method946() {
        return this.field2361;
    }

    @ObfuscatedName("ec.i()Lau;")
    public synchronized class48 method947() {
        return null;
    }

    @ObfuscatedName("ec.d()I")
    public synchronized int method976() {
        return 0;
    }

    @ObfuscatedName("ec.z([III)V")
    public synchronized void method1006(int[] arg0, int arg1, int arg2) {
        if (this.field2355.method2801()) {
            int var4 = this.field2335 * this.field2355.field2392 / Statics.field1082;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2359;
                if (this.field2358 - var5 >= 0L) {
                    this.field2359 = var5;
                    break;
                }
                int var7 = (int) ((this.field2358 - this.field2359 + (long) var4 - 1L) / (long) var4);
                this.field2359 += (long) var4 * (long) var7;
                this.field2361.method1006(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2715();
            } while (this.field2355.method2801());
        }
        this.field2361.method1006(arg0, arg1, arg2);
    }

    @ObfuscatedName("ec.ai(I)V")
    public synchronized void method950(int arg0) {
        if (this.field2355.method2801()) {
            int var2 = this.field2335 * this.field2355.field2392 / Statics.field1082;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2359;
                if (this.field2358 - var3 >= 0L) {
                    this.field2359 = var3;
                    break;
                }
                int var5 = (int) ((this.field2358 - this.field2359 + (long) var2 - 1L) / (long) var2);
                this.field2359 += (long) var2 * (long) var5;
                this.field2361.method950(var5);
                arg0 -= var5;
                this.method2715();
            } while (this.field2355.method2801());
        }
        this.field2361.method950(arg0);
    }

    @ObfuscatedName("ec.ac(I)V")
    public void method2715() {
        int var1 = this.field2357;
        int var2 = this.field2362;
        long var3 = this.field2358;
        while (this.field2362 == var2) {
            while (this.field2355.field2395[var1] == var2) {
                this.field2355.method2803(var1);
                int var5 = this.field2355.method2807(var1);
                if (var5 == 1) {
                    this.field2355.method2806();
                    this.field2355.method2820(var1);
                    if (this.field2355.method2816()) {
                        if (!this.field2356 || var2 == 0) {
                            this.method2706();
                            this.field2355.method2800();
                            return;
                        }
                        this.field2355.method2834(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2748(var5);
                }
                this.field2355.method2809(var1);
                this.field2355.method2820(var1);
            }
            var1 = this.field2355.method2818();
            var2 = this.field2355.field2395[var1];
            var3 = this.field2355.method2810(var2);
        }
        this.field2357 = var1;
        this.field2362 = var2;
        this.field2358 = var3;
    }

    @ObfuscatedName("ec.ap(Lef;I)Z")
    public boolean method2736(class145 arg0) {
        if (arg0.field2424 != null) {
            return false;
        }
        if (arg0.field2407 >= 0) {
            arg0.method3301();
            if (arg0.field2409 > 0 && this.field2354[arg0.field2415][arg0.field2409] == arg0) {
                this.field2354[arg0.field2415][arg0.field2409] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ec.at(Lef;[IIII)Z")
    public boolean method2716(class145 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2423 = Statics.field1082 / 100;
        if (arg0.field2407 >= 0 && arg0.field2424 == null || arg0.field2424.method944()) {
            arg0.method2853();
            arg0.method3301();
            if (arg0.field2409 > 0 && this.field2354[arg0.field2415][arg0.field2409] == arg0) {
                this.field2354[arg0.field2415][arg0.field2409] = null;
            }
            return true;
        }
        int var5 = arg0.field2413;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2346[arg0.field2415] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2413 = var6;
        }
        arg0.field2424.method942(this.method2711(arg0));
        class142 var7 = arg0.field2416;
        boolean var8 = false;
        arg0.field2421++;
        arg0.field2422 += var7.field2374;
        double var9 = (double) ((arg0.field2408 - 60 << 8) + (arg0.field2413 * arg0.field2405 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2369 > 0) {
            if (var7.field2372 > 0) {
                arg0.field2419 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2372 * var9) + 0.5D);
            } else {
                arg0.field2419 += 128;
            }
        }
        if (var7.field2371 != null) {
            if (var7.field2370 > 0) {
                arg0.field2417 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2370 * var9) + 0.5D);
            } else {
                arg0.field2417 += 128;
            }
            while (arg0.field2418 < var7.field2371.length - 2 && arg0.field2417 > (var7.field2371[arg0.field2418 + 2] & 0xFF) << 8) {
                arg0.field2418 += 2;
            }
            if (arg0.field2418 == var7.field2371.length - 2 && var7.field2371[arg0.field2418 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2407 >= 0 && var7.field2367 != null && (this.field2347[arg0.field2415] & 0x1) == 0 && (arg0.field2409 < 0 || this.field2354[arg0.field2415][arg0.field2409] != arg0)) {
            if (var7.field2377 > 0) {
                arg0.field2407 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2377 * var9) + 0.5D);
            } else {
                arg0.field2407 += 128;
            }
            while (arg0.field2420 < var7.field2367.length - 2 && arg0.field2407 > (var7.field2367[arg0.field2420 + 2] & 0xFF) << 8) {
                arg0.field2420 += 2;
            }
            if (arg0.field2420 == var7.field2367.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2424.method940(arg0.field2423, this.method2743(arg0), this.method2763(arg0));
            return false;
        }
        arg0.field2424.method1069(arg0.field2423);
        if (arg1 == null) {
            arg0.field2424.method950(arg3);
        } else {
            arg0.field2424.method1006(arg1, arg2, arg3);
        }
        if (arg0.field2424.method945()) {
            this.field2361.field2382.method1074(arg0.field2424);
        }
        arg0.method2853();
        if (arg0.field2407 >= 0) {
            arg0.method3301();
            if (arg0.field2409 > 0 && this.field2354[arg0.field2415][arg0.field2409] == arg0) {
                this.field2354[arg0.field2415][arg0.field2409] = null;
            }
        }
        return true;
    }
}
