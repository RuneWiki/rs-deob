package deob;

@ObfuscatedName("ek")
public class class140 extends class47 {

    @ObfuscatedName("ek.v")
    public class174 field2352 = new class174(128);

    @ObfuscatedName("ek.f")
    public int field2347 = 256;

    @ObfuscatedName("ek.n")
    public int field2358 = 1000000;

    @ObfuscatedName("ek.c")
    public int[] field2349 = new int[16];

    @ObfuscatedName("ek.r")
    public int[] field2350 = new int[16];

    @ObfuscatedName("ek.k")
    public int[] field2351 = new int[16];

    @ObfuscatedName("ek.e")
    public int[] field2366 = new int[16];

    @ObfuscatedName("ek.q")
    public int[] field2369 = new int[16];

    @ObfuscatedName("ek.u")
    public int[] field2354 = new int[16];

    @ObfuscatedName("ek.s")
    public int[] field2355 = new int[16];

    @ObfuscatedName("ek.l")
    public int[] field2353 = new int[16];

    @ObfuscatedName("ek.o")
    public int[] field2357 = new int[16];

    @ObfuscatedName("ek.j")
    public int[] field2356 = new int[16];

    @ObfuscatedName("ek.a")
    public int[] field2359 = new int[16];

    @ObfuscatedName("ek.g")
    public int[] field2360 = new int[16];

    @ObfuscatedName("ek.x")
    public int[] field2361 = new int[16];

    @ObfuscatedName("ek.b")
    public int[] field2362 = new int[16];

    @ObfuscatedName("ek.w")
    public int[] field2363 = new int[16];

    @ObfuscatedName("ek.y")
    public class144[][] field2364 = new class144[16][128];

    @ObfuscatedName("ek.au")
    public class144[][] field2348 = new class144[16][128];

    @ObfuscatedName("ek.az")
    public class143 field2346 = new class143();

    @ObfuscatedName("ek.ak")
    public boolean field2367;

    @ObfuscatedName("ek.ah")
    public int field2368;

    @ObfuscatedName("ek.aa")
    public int field2365;

    @ObfuscatedName("ek.am")
    public long field2370;

    @ObfuscatedName("ek.al")
    public long field2371;

    @ObfuscatedName("ek.ae")
    public class142 field2372 = new class142(this);

    public class140() {
        this.method2740();
    }

    @ObfuscatedName("ek.v(IB)V")
    public synchronized void method2771(int arg0) {
        this.field2347 = arg0;
    }

    @ObfuscatedName("ek.f(I)I")
    public int method2816() {
        return this.field2347;
    }

    @ObfuscatedName("ek.c(Len;Ley;Lbp;II)Z")
    public synchronized boolean method2722(class138 arg0, class151 arg1, class57 arg2, int arg3) {
        arg0.method2705();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class175 var7 = (class175) arg0.field2334.method3275(); var7 != null; var7 = (class175) arg0.field2334.method3274()) {
            int var8 = (int) var7.field2814;
            class139 var9 = (class139) this.field2352.method3270((long) var8);
            if (var9 == null) {
                var9 = class139.method1436(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2352.method3284(var9, (long) var8);
            }
            if (!var9.method2710(arg2, var7.field2807, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2700();
        }
        return var5;
    }

    @ObfuscatedName("ek.r(I)V")
    public synchronized void method2723() {
        for (class139 var1 = (class139) this.field2352.method3275(); var1 != null; var1 = (class139) this.field2352.method3274()) {
            var1.method2709();
        }
    }

    @ObfuscatedName("ek.k(B)V")
    public synchronized void method2724() {
        for (class139 var1 = (class139) this.field2352.method3275(); var1 != null; var1 = (class139) this.field2352.method3274()) {
            var1.method3320();
        }
    }

    @ObfuscatedName("ek.e(Len;ZB)V")
    public synchronized void method2768(class138 arg0, boolean arg1) {
        this.method2726();
        this.field2346.method2827(arg0.field2335);
        this.field2367 = arg1;
        this.field2370 = 0L;
        int var3 = this.field2346.method2849();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2346.method2832(var4);
            this.field2346.method2835(var4);
            this.field2346.method2831(var4);
        }
        this.field2368 = this.field2346.method2833();
        this.field2365 = this.field2346.field2395[this.field2368];
        this.field2371 = this.field2346.method2838(this.field2365);
    }

    @ObfuscatedName("ek.q(I)V")
    public synchronized void method2726() {
        this.field2346.method2829();
        this.method2740();
    }

    @ObfuscatedName("ek.u(I)Z")
    public synchronized boolean method2793() {
        return this.field2346.method2828();
    }

    @ObfuscatedName("ek.s(IIB)V")
    public synchronized void method2728(int arg0, int arg1) {
        this.method2725(arg0, arg1);
    }

    @ObfuscatedName("ek.l(IIB)V")
    public void method2725(int arg0, int arg1) {
        this.field2366[arg0] = arg1;
        this.field2354[arg0] = arg1 & 0xFFFFFF80;
        this.method2730(arg0, arg1);
    }

    @ObfuscatedName("ek.o(IIB)V")
    public void method2730(int arg0, int arg1) {
        if (this.field2369[arg0] != arg1) {
            this.field2369[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2348[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ek.h(IIIB)V")
    public void method2731(int arg0, int arg1, int arg2) {
        this.method2733(arg0, arg1, 64);
        if ((this.field2356[arg0] & 0x2) != 0) {
            for (class144 var4 = (class144) this.field2372.field2386.method3295(); var4 != null; var4 = (class144) this.field2372.field2386.method3287()) {
                if (var4.field2422 == arg0 && var4.field2419 < 0) {
                    this.field2364[arg0][var4.field2420] = null;
                    this.field2364[arg0][arg1] = var4;
                    int var5 = (var4.field2425 * var4.field2415 >> 12) + var4.field2413;
                    var4.field2413 += arg1 - var4.field2420 << 8;
                    var4.field2425 = var5 - var4.field2413;
                    var4.field2415 = 4096;
                    var4.field2420 = arg1;
                    return;
                }
            }
        }
        class139 var6 = (class139) this.field2352.method3270((long) this.field2369[arg0]);
        if (var6 == null) {
            return;
        }
        class62 var7 = var6.field2337[arg1];
        if (var7 == null) {
            return;
        }
        class144 var8 = new class144();
        var8.field2422 = arg0;
        var8.field2406 = var6;
        var8.field2407 = var7;
        var8.field2408 = var6.field2341[arg1];
        var8.field2409 = var6.field2342[arg1];
        var8.field2420 = arg1;
        var8.field2405 = var6.field2336 * arg2 * arg2 * var6.field2338[arg1] + 1024 >> 11;
        var8.field2412 = var6.field2340[arg1] & 0xFF;
        var8.field2413 = (arg1 << 8) - (var6.field2345[arg1] & 0x7FFF);
        var8.field2423 = 0;
        var8.field2414 = 0;
        var8.field2417 = 0;
        var8.field2419 = -1;
        var8.field2411 = 0;
        if (this.field2361[arg0] == 0) {
            var8.field2410 = class44.method1032(var7, this.method2745(var8), this.method2746(var8), this.method2747(var8));
        } else {
            var8.field2410 = class44.method1032(var7, this.method2745(var8), 0, this.method2747(var8));
            this.method2732(var8, var6.field2345[arg1] < 0);
        }
        if (var6.field2345[arg1] < 0) {
            var8.field2410.method1101(-1);
        }
        if (var8.field2409 >= 0) {
            class144 var9 = this.field2348[arg0][var8.field2409];
            if (var9 != null && var9.field2419 < 0) {
                this.field2364[arg0][var9.field2420] = null;
                var9.field2419 = 0;
            }
            this.field2348[arg0][var8.field2409] = var8;
        }
        this.field2372.field2386.method3316(var8);
        this.field2364[arg0][arg1] = var8;
    }

    @ObfuscatedName("ek.p(Lex;ZI)V")
    public void method2732(class144 arg0, boolean arg1) {
        int var3 = arg0.field2407.field1216.length;
        int var5;
        if (arg1 && arg0.field2407.field1217) {
            int var4 = var3 + var3 - arg0.field2407.field1218;
            var5 = (int) ((long) this.field2361[arg0.field2422] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2410.method1001(true);
            }
        } else {
            var5 = (int) ((long) this.field2361[arg0.field2422] * (long) var3 >> 6);
        }
        arg0.field2410.method972(var5);
    }

    @ObfuscatedName("ek.d(IIII)V")
    public void method2733(int arg0, int arg1, int arg2) {
        class144 var4 = this.field2364[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2364[arg0][arg1] = null;
        if ((this.field2356[arg0] & 0x2) == 0) {
            var4.field2419 = 0;
            return;
        }
        for (class144 var5 = (class144) this.field2372.field2386.method3294(); var5 != null; var5 = (class144) this.field2372.field2386.method3296()) {
            if (var4.field2422 == var5.field2422 && var5.field2419 < 0 && var4 != var5) {
                var4.field2419 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ek.m(IIII)V")
    public void method2734(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ek.z(III)V")
    public void method2735(int arg0, int arg1) {
    }

    @ObfuscatedName("ek.t(IIS)V")
    public void method2751(int arg0, int arg1) {
        this.field2355[arg0] = arg1;
    }

    @ObfuscatedName("ek.i(II)V")
    public void method2737(int arg0) {
        for (class144 var2 = (class144) this.field2372.field2386.method3294(); var2 != null; var2 = (class144) this.field2372.field2386.method3296()) {
            if (arg0 < 0 || var2.field2422 == arg0) {
                if (var2.field2410 != null) {
                    var2.field2410.method977(Statics.field1076 / 100);
                    if (var2.field2410.method981()) {
                        this.field2372.field2385.method1120(var2.field2410);
                    }
                    var2.method2873();
                }
                if (var2.field2419 < 0) {
                    this.field2364[var2.field2422][var2.field2420] = null;
                }
                var2.method3320();
            }
        }
    }

    @ObfuscatedName("ek.j(II)V")
    public void method2738(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2738(var2);
            }
            return;
        }
        this.field2349[arg0] = 12800;
        this.field2350[arg0] = 8192;
        this.field2351[arg0] = 16383;
        this.field2355[arg0] = 8192;
        this.field2353[arg0] = 0;
        this.field2357[arg0] = 8192;
        this.method2741(arg0);
        this.method2767(arg0);
        this.field2356[arg0] = 0;
        this.field2359[arg0] = 32767;
        this.field2360[arg0] = 256;
        this.field2361[arg0] = 0;
        this.method2744(arg0, 8192);
    }

    @ObfuscatedName("ek.a(IB)V")
    public void method2788(int arg0) {
        for (class144 var2 = (class144) this.field2372.field2386.method3294(); var2 != null; var2 = (class144) this.field2372.field2386.method3296()) {
            if ((arg0 < 0 || var2.field2422 == arg0) && var2.field2419 < 0) {
                this.field2364[var2.field2422][var2.field2420] = null;
                var2.field2419 = 0;
            }
        }
    }

    @ObfuscatedName("ek.g(I)V")
    public void method2740() {
        this.method2737(-1);
        this.method2738(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2369[var1] = this.field2366[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2354[var2] = this.field2366[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ek.az(II)V")
    public void method2741(int arg0) {
        if ((this.field2356[arg0] & 0x2) == 0) {
            return;
        }
        for (class144 var2 = (class144) this.field2372.field2386.method3294(); var2 != null; var2 = (class144) this.field2372.field2386.method3296()) {
            if (var2.field2422 == arg0 && this.field2364[arg0][var2.field2420] == null && var2.field2419 < 0) {
                var2.field2419 = 0;
            }
        }
    }

    @ObfuscatedName("ek.ak(IB)V")
    public void method2767(int arg0) {
        if ((this.field2356[arg0] & 0x4) == 0) {
            return;
        }
        for (class144 var2 = (class144) this.field2372.field2386.method3294(); var2 != null; var2 = (class144) this.field2372.field2386.method3296()) {
            if (var2.field2422 == arg0) {
                var2.field2426 = 0;
            }
        }
    }

    @ObfuscatedName("ek.ah(II)V")
    public void method2743(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2733(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2731(var6, var7, var8);
            } else {
                this.method2733(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2734(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2354[var12] = (var14 << 14) + (this.field2354[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2354[var12] = (var14 << 7) + (this.field2354[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2353[var12] = (var14 << 7) + (this.field2353[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2353[var12] = (this.field2353[var12] & 0xFFFFFF80) + var14;
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
                this.field2350[var12] = (var14 << 7) + (this.field2350[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2350[var12] = (this.field2350[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2351[var12] = (var14 << 7) + (this.field2351[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2351[var12] = (this.field2351[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2356[var12] |= 0x1;
                } else {
                    this.field2356[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2356[var12] |= 0x2;
                } else {
                    this.method2741(var12);
                    this.field2356[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2359[var12] = (var14 << 7) + (this.field2359[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2359[var12] = (this.field2359[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2359[var12] = (var14 << 7) + (this.field2359[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2359[var12] = (this.field2359[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2737(var12);
            }
            if (var13 == 121) {
                this.method2738(var12);
            }
            if (var13 == 123) {
                this.method2788(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2359[var12];
                if (var15 == 16384) {
                    this.field2360[var12] = (var14 << 7) + (this.field2360[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2359[var12];
                if (var16 == 16384) {
                    this.field2360[var12] = (this.field2360[var12] & 0xFFFFFF80) + var14;
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
                    this.field2356[var12] |= 0x4;
                } else {
                    this.method2767(var12);
                    this.field2356[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2744(var12, (var14 << 7) + (this.field2362[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2744(var12, (this.field2362[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2730(var17, this.field2354[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2735(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method2751(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2740();
            }
        }
    }

    @ObfuscatedName("ek.aa(III)V")
    public void method2744(int arg0, int arg1) {
        this.field2362[arg0] = arg1;
        this.field2363[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ek.am(Lex;I)I")
    public int method2745(class144 arg0) {
        int var2 = (arg0.field2425 * arg0.field2415 >> 12) + arg0.field2413;
        int var3 = ((this.field2355[arg0.field2422] - 8192) * this.field2360[arg0.field2422] >> 12) + var2;
        class141 var4 = arg0.field2408;
        if (var4.field2381 > 0 && (var4.field2382 > 0 || this.field2353[arg0.field2422] > 0)) {
            int var5 = var4.field2382 << 2;
            int var6 = var4.field2374 << 1;
            if (arg0.field2421 < var6) {
                var5 = arg0.field2421 * var5 / var6;
            }
            int var7 = (this.field2353[arg0.field2422] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2418 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2407.field1219 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1076 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ek.al(Lex;I)I")
    public int method2746(class144 arg0) {
        class141 var2 = arg0.field2408;
        int var3 = this.field2351[arg0.field2422] * this.field2349[arg0.field2422] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2405 * var4 + 16384 >> 15;
        int var6 = this.field2347 * var5 + 128 >> 8;
        if (var2.field2376 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2423 * 1.953125E-5D * (double) var2.field2376) + 0.5D);
        }
        if (var2.field2378 != null) {
            int var7 = arg0.field2414;
            int var8 = var2.field2378[arg0.field2417 + 1];
            if (arg0.field2417 < var2.field2378.length - 2) {
                int var9 = (var2.field2378[arg0.field2417] & 0xFF) << 8;
                int var10 = (var2.field2378[arg0.field2417 + 2] & 0xFF) << 8;
                var8 += (var2.field2378[arg0.field2417 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2419 > 0 && var2.field2380 != null) {
            int var11 = arg0.field2419;
            int var12 = var2.field2380[arg0.field2411 + 1];
            if (arg0.field2411 < var2.field2380.length - 2) {
                int var13 = (var2.field2380[arg0.field2411] & 0xFF) << 8;
                int var14 = (var2.field2380[arg0.field2411 + 2] & 0xFF) << 8;
                var12 += (var2.field2380[arg0.field2411 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ek.ae(Lex;S)I")
    public int method2747(class144 arg0) {
        int var2 = this.field2350[arg0.field2422];
        return var2 < 8192 ? arg0.field2412 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2412) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ek.x()Lag;")
    public synchronized class47 method962() {
        return this.field2372;
    }

    @ObfuscatedName("ek.b()Lag;")
    public synchronized class47 method983() {
        return null;
    }

    @ObfuscatedName("ek.w()I")
    public synchronized int method984() {
        return 0;
    }

    @ObfuscatedName("ek.y([III)V")
    public synchronized void method969(int[] arg0, int arg1, int arg2) {
        if (this.field2346.method2828()) {
            int var4 = this.field2358 * this.field2346.field2392 / Statics.field1076;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2370;
                if (this.field2371 - var5 >= 0L) {
                    this.field2370 = var5;
                    break;
                }
                int var7 = (int) ((this.field2371 - this.field2370 + (long) var4 - 1L) / (long) var4);
                this.field2370 += (long) var4 * (long) var7;
                this.field2372.method969(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2807();
            } while (this.field2346.method2828());
        }
        this.field2372.method969(arg0, arg1, arg2);
    }

    @ObfuscatedName("ek.au(I)V")
    public synchronized void method986(int arg0) {
        if (this.field2346.method2828()) {
            int var2 = this.field2358 * this.field2346.field2392 / Statics.field1076;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2370;
                if (this.field2371 - var3 >= 0L) {
                    this.field2370 = var3;
                    break;
                }
                int var5 = (int) ((this.field2371 - this.field2370 + (long) var2 - 1L) / (long) var2);
                this.field2370 += (long) var2 * (long) var5;
                this.field2372.method986(var5);
                arg0 -= var5;
                this.method2807();
            } while (this.field2346.method2828());
        }
        this.field2372.method986(arg0);
    }

    @ObfuscatedName("ek.ab(I)V")
    public void method2807() {
        int var1 = this.field2368;
        int var2 = this.field2365;
        long var3 = this.field2371;
        while (this.field2365 == var2) {
            while (this.field2346.field2395[var1] == var2) {
                this.field2346.method2832(var1);
                int var5 = this.field2346.method2836(var1);
                if (var5 == 1) {
                    this.field2346.method2834();
                    this.field2346.method2831(var1);
                    if (this.field2346.method2840()) {
                        if (!this.field2367 || var2 == 0) {
                            this.method2740();
                            this.field2346.method2829();
                            return;
                        }
                        this.field2346.method2864(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2743(var5);
                }
                this.field2346.method2835(var1);
                this.field2346.method2831(var1);
            }
            var1 = this.field2346.method2833();
            var2 = this.field2346.field2395[var1];
            var3 = this.field2346.method2838(var2);
        }
        this.field2368 = var1;
        this.field2365 = var2;
        this.field2371 = var3;
    }

    @ObfuscatedName("ek.as(Lex;I)Z")
    public boolean method2739(class144 arg0) {
        if (arg0.field2410 != null) {
            return false;
        }
        if (arg0.field2419 >= 0) {
            arg0.method3320();
            if (arg0.field2409 > 0 && this.field2348[arg0.field2422][arg0.field2409] == arg0) {
                this.field2348[arg0.field2422][arg0.field2409] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ek.ai(Lex;[IIII)Z")
    public boolean method2750(class144 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2424 = Statics.field1076 / 100;
        if (arg0.field2419 >= 0 && arg0.field2410 == null || arg0.field2410.method1027()) {
            arg0.method2873();
            arg0.method3320();
            if (arg0.field2409 > 0 && this.field2348[arg0.field2422][arg0.field2409] == arg0) {
                this.field2348[arg0.field2422][arg0.field2409] = null;
            }
            return true;
        }
        int var5 = arg0.field2415;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2357[arg0.field2422] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2415 = var6;
        }
        arg0.field2410.method978(this.method2745(arg0));
        class141 var7 = arg0.field2408;
        boolean var8 = false;
        arg0.field2421++;
        arg0.field2418 += var7.field2381;
        double var9 = (double) ((arg0.field2420 - 60 << 8) + (arg0.field2425 * arg0.field2415 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2376 > 0) {
            if (var7.field2379 > 0) {
                arg0.field2423 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2379 * var9) + 0.5D);
            } else {
                arg0.field2423 += 128;
            }
        }
        if (var7.field2378 != null) {
            if (var7.field2377 > 0) {
                arg0.field2414 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2377 * var9) + 0.5D);
            } else {
                arg0.field2414 += 128;
            }
            while (arg0.field2417 < var7.field2378.length - 2 && arg0.field2414 > (var7.field2378[arg0.field2417 + 2] & 0xFF) << 8) {
                arg0.field2417 += 2;
            }
            if (arg0.field2417 == var7.field2378.length - 2 && var7.field2378[arg0.field2417 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2419 >= 0 && var7.field2380 != null && (this.field2356[arg0.field2422] & 0x1) == 0 && (arg0.field2409 < 0 || this.field2348[arg0.field2422][arg0.field2409] != arg0)) {
            if (var7.field2375 > 0) {
                arg0.field2419 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2375 * var9) + 0.5D);
            } else {
                arg0.field2419 += 128;
            }
            while (arg0.field2411 < var7.field2380.length - 2 && arg0.field2419 > (var7.field2380[arg0.field2411 + 2] & 0xFF) << 8) {
                arg0.field2411 += 2;
            }
            if (arg0.field2411 == var7.field2380.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2410.method976(arg0.field2424, this.method2746(arg0), this.method2747(arg0));
            return false;
        }
        arg0.field2410.method977(arg0.field2424);
        if (arg1 == null) {
            arg0.field2410.method986(arg3);
        } else {
            arg0.field2410.method969(arg1, arg2, arg3);
        }
        if (arg0.field2410.method981()) {
            this.field2372.field2385.method1120(arg0.field2410);
        }
        arg0.method2873();
        if (arg0.field2419 >= 0) {
            arg0.method3320();
            if (arg0.field2409 > 0 && this.field2348[arg0.field2422][arg0.field2409] == arg0) {
                this.field2348[arg0.field2422][arg0.field2409] = null;
            }
        }
        return true;
    }
}
