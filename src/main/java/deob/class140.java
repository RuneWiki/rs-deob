package deob;

@ObfuscatedName("ez")
public class class140 extends class47 {

    @ObfuscatedName("ez.z")
    public class173 field2327 = new class173(128);

    @ObfuscatedName("ez.h")
    public int field2319 = 256;

    @ObfuscatedName("ez.c")
    public int field2322 = 1000000;

    @ObfuscatedName("ez.p")
    public int[] field2321 = new int[16];

    @ObfuscatedName("ez.i")
    public int[] field2340 = new int[16];

    @ObfuscatedName("ez.v")
    public int[] field2323 = new int[16];

    @ObfuscatedName("ez.l")
    public int[] field2342 = new int[16];

    @ObfuscatedName("ez.m")
    public int[] field2325 = new int[16];

    @ObfuscatedName("ez.g")
    public int[] field2326 = new int[16];

    @ObfuscatedName("ez.t")
    public int[] field2320 = new int[16];

    @ObfuscatedName("ez.o")
    public int[] field2328 = new int[16];

    @ObfuscatedName("ez.b")
    public int[] field2329 = new int[16];

    @ObfuscatedName("ez.y")
    public int[] field2331 = new int[16];

    @ObfuscatedName("ez.a")
    public int[] field2332 = new int[16];

    @ObfuscatedName("ez.r")
    public int[] field2333 = new int[16];

    @ObfuscatedName("ez.x")
    public int[] field2324 = new int[16];

    @ObfuscatedName("ez.w")
    public int[] field2338 = new int[16];

    @ObfuscatedName("ez.j")
    public int[] field2336 = new int[16];

    @ObfuscatedName("ez.s")
    public class144[][] field2337 = new class144[16][128];

    @ObfuscatedName("ez.au")
    public class144[][] field2330 = new class144[16][128];

    @ObfuscatedName("ez.ay")
    public class143 field2339 = new class143();

    @ObfuscatedName("ez.ar")
    public boolean field2345;

    @ObfuscatedName("ez.aj")
    public int field2341;

    @ObfuscatedName("ez.ad")
    public int field2318;

    @ObfuscatedName("ez.at")
    public long field2343;

    @ObfuscatedName("ez.as")
    public long field2344;

    @ObfuscatedName("ez.aw")
    public class142 field2347 = new class142(this);

    public class140() {
        this.method2785();
    }

    @ObfuscatedName("ez.z(II)V")
    public synchronized void method2728(int arg0) {
        this.field2319 = arg0;
    }

    @ObfuscatedName("ez.h(B)I")
    public int method2715() {
        return this.field2319;
    }

    @ObfuscatedName("ez.p(Lep;Len;Lbu;II)Z")
    public synchronized boolean method2716(class138 arg0, class150 arg1, class57 arg2, int arg3) {
        arg0.method2698();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class174 var7 = (class174) arg0.field2305.method3285(); var7 != null; var7 = (class174) arg0.field2305.method3286()) {
            int var8 = (int) var7.field2755;
            class139 var9 = (class139) this.field2327.method3281((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method2956(var8);
                class139 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class139(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2327.method3283(var11, (long) var8);
            }
            if (!var9.method2705(arg2, var7.field2749, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2699();
        }
        return var5;
    }

    @ObfuscatedName("ez.i(I)V")
    public synchronized void method2717() {
        for (class139 var1 = (class139) this.field2327.method3285(); var1 != null; var1 = (class139) this.field2327.method3286()) {
            var1.method2711();
        }
    }

    @ObfuscatedName("ez.v(I)V")
    public synchronized void method2718() {
        for (class139 var1 = (class139) this.field2327.method3285(); var1 != null; var1 = (class139) this.field2327.method3286()) {
            var1.method3346();
        }
    }

    @ObfuscatedName("ez.l(Lep;ZB)V")
    public synchronized void method2719(class138 arg0, boolean arg1) {
        this.method2720();
        this.field2339.method2882(arg0.field2304);
        this.field2345 = arg1;
        this.field2343 = 0L;
        int var3 = this.field2339.method2850();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2339.method2878(var4);
            this.field2339.method2854(var4);
            this.field2339.method2852(var4);
        }
        this.field2341 = this.field2339.method2858();
        this.field2318 = this.field2339.field2371[this.field2341];
        this.field2344 = this.field2339.method2857(this.field2318);
    }

    @ObfuscatedName("ez.m(B)V")
    public synchronized void method2720() {
        this.field2339.method2848();
        this.method2785();
    }

    @ObfuscatedName("ez.g(I)Z")
    public synchronized boolean method2721() {
        return this.field2339.method2853();
    }

    @ObfuscatedName("ez.t(III)V")
    public synchronized void method2787(int arg0, int arg1) {
        this.method2723(arg0, arg1);
    }

    @ObfuscatedName("ez.o(III)V")
    public void method2723(int arg0, int arg1) {
        this.field2342[arg0] = arg1;
        this.field2326[arg0] = arg1 & 0xFFFFFF80;
        this.method2803(arg0, arg1);
    }

    @ObfuscatedName("ez.b(III)V")
    public void method2803(int arg0, int arg1) {
        if (this.field2325[arg0] != arg1) {
            this.field2325[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2330[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ez.d(IIIB)V")
    public void method2823(int arg0, int arg1, int arg2) {
        this.method2727(arg0, arg1, 64);
        if ((this.field2331[arg0] & 0x2) != 0) {
            for (class144 var4 = (class144) this.field2347.field2364.method3309(); var4 != null; var4 = (class144) this.field2347.field2364.method3311()) {
                if (var4.field2387 == arg0 && var4.field2381 < 0) {
                    this.field2337[arg0][var4.field2386] = null;
                    this.field2337[arg0][arg1] = var4;
                    int var5 = (var4.field2403 * var4.field2391 >> 12) + var4.field2389;
                    var4.field2389 += arg1 - var4.field2386 << 8;
                    var4.field2403 = var5 - var4.field2389;
                    var4.field2391 = 4096;
                    var4.field2386 = arg1;
                    return;
                }
            }
        }
        class139 var6 = (class139) this.field2327.method3281((long) this.field2325[arg0]);
        if (var6 == null) {
            return;
        }
        class62 var7 = var6.field2307[arg1];
        if (var7 == null) {
            return;
        }
        class144 var8 = new class144();
        var8.field2387 = arg0;
        var8.field2382 = var6;
        var8.field2399 = var7;
        var8.field2384 = var6.field2309[arg1];
        var8.field2385 = var6.field2317[arg1];
        var8.field2386 = arg1;
        var8.field2392 = var6.field2314 * arg2 * arg2 * var6.field2312[arg1] + 1024 >> 11;
        var8.field2388 = var6.field2310[arg1] & 0xFF;
        var8.field2389 = (arg1 << 8) - (var6.field2306[arg1] & 0x7FFF);
        var8.field2394 = 0;
        var8.field2393 = 0;
        var8.field2395 = 0;
        var8.field2381 = -1;
        var8.field2396 = 0;
        if (this.field2324[arg0] == 0) {
            var8.field2383 = class44.method944(var7, this.method2739(var8), this.method2722(var8), this.method2741(var8));
        } else {
            var8.field2383 = class44.method944(var7, this.method2739(var8), 0, this.method2741(var8));
            this.method2726(var8, var6.field2306[arg1] < 0);
        }
        if (var6.field2306[arg1] < 0) {
            var8.field2383.method946(-1);
        }
        if (var8.field2385 >= 0) {
            class144 var9 = this.field2330[arg0][var8.field2385];
            if (var9 != null && var9.field2381 < 0) {
                this.field2337[arg0][var9.field2386] = null;
                var9.field2381 = 0;
            }
            this.field2330[arg0][var8.field2385] = var8;
        }
        this.field2347.field2364.method3303(var8);
        this.field2337[arg0][arg1] = var8;
    }

    @ObfuscatedName("ez.k(Les;ZI)V")
    public void method2726(class144 arg0, boolean arg1) {
        int var3 = arg0.field2399.field1236.length;
        int var5;
        if (arg1 && arg0.field2399.field1238) {
            int var4 = var3 + var3 - arg0.field2399.field1237;
            var5 = (int) ((long) this.field2324[arg0.field2387] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2383.method1043(true);
            }
        } else {
            var5 = (int) ((long) this.field2324[arg0.field2387] * (long) var3 >> 6);
        }
        arg0.field2383.method1011(var5);
    }

    @ObfuscatedName("ez.f(IIII)V")
    public void method2727(int arg0, int arg1, int arg2) {
        class144 var4 = this.field2337[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2337[arg0][arg1] = null;
        if ((this.field2331[arg0] & 0x2) == 0) {
            var4.field2381 = 0;
            return;
        }
        for (class144 var5 = (class144) this.field2347.field2364.method3317(); var5 != null; var5 = (class144) this.field2347.field2364.method3310()) {
            if (var4.field2387 == var5.field2387 && var5.field2381 < 0 && var4 != var5) {
                var4.field2381 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ez.e(IIII)V")
    public void method2829(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ez.u(III)V")
    public void method2729(int arg0, int arg1) {
    }

    @ObfuscatedName("ez.n(III)V")
    public void method2730(int arg0, int arg1) {
        this.field2320[arg0] = arg1;
    }

    @ObfuscatedName("ez.q(II)V")
    public void method2731(int arg0) {
        for (class144 var2 = (class144) this.field2347.field2364.method3317(); var2 != null; var2 = (class144) this.field2347.field2364.method3310()) {
            if (arg0 < 0 || var2.field2387 == arg0) {
                if (var2.field2383 != null) {
                    var2.field2383.method957(Statics.field2409 / 100);
                    if (var2.field2383.method960()) {
                        this.field2347.field2361.method1094(var2.field2383);
                    }
                    var2.method2887();
                }
                if (var2.field2381 < 0) {
                    this.field2337[var2.field2387][var2.field2386] = null;
                }
                var2.method3346();
            }
        }
    }

    @ObfuscatedName("ez.y(II)V")
    public void method2732(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2732(var2);
            }
            return;
        }
        this.field2321[arg0] = 12800;
        this.field2340[arg0] = 8192;
        this.field2323[arg0] = 16383;
        this.field2320[arg0] = 8192;
        this.field2328[arg0] = 0;
        this.field2329[arg0] = 8192;
        this.method2735(arg0);
        this.method2736(arg0);
        this.field2331[arg0] = 0;
        this.field2332[arg0] = 32767;
        this.field2333[arg0] = 256;
        this.field2324[arg0] = 0;
        this.method2826(arg0, 8192);
    }

    @ObfuscatedName("ez.a(IB)V")
    public void method2743(int arg0) {
        for (class144 var2 = (class144) this.field2347.field2364.method3317(); var2 != null; var2 = (class144) this.field2347.field2364.method3310()) {
            if ((arg0 < 0 || var2.field2387 == arg0) && var2.field2381 < 0) {
                this.field2337[var2.field2387][var2.field2386] = null;
                var2.field2381 = 0;
            }
        }
    }

    @ObfuscatedName("ez.r(I)V")
    public void method2785() {
        this.method2731(-1);
        this.method2732(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2325[var1] = this.field2342[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2326[var2] = this.field2342[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ez.ay(II)V")
    public void method2735(int arg0) {
        if ((this.field2331[arg0] & 0x2) == 0) {
            return;
        }
        for (class144 var2 = (class144) this.field2347.field2364.method3317(); var2 != null; var2 = (class144) this.field2347.field2364.method3310()) {
            if (var2.field2387 == arg0 && this.field2337[arg0][var2.field2386] == null && var2.field2381 < 0) {
                var2.field2381 = 0;
            }
        }
    }

    @ObfuscatedName("ez.ar(II)V")
    public void method2736(int arg0) {
        if ((this.field2331[arg0] & 0x4) == 0) {
            return;
        }
        for (class144 var2 = (class144) this.field2347.field2364.method3317(); var2 != null; var2 = (class144) this.field2347.field2364.method3310()) {
            if (var2.field2387 == arg0) {
                var2.field2402 = 0;
            }
        }
    }

    @ObfuscatedName("ez.aj(IB)V")
    public void method2761(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2727(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2823(var6, var7, var8);
            } else {
                this.method2727(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2829(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2326[var12] = (var14 << 14) + (this.field2326[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2326[var12] = (var14 << 7) + (this.field2326[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2328[var12] = (var14 << 7) + (this.field2328[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2328[var12] = (this.field2328[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2329[var12] = (var14 << 7) + (this.field2329[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2329[var12] = (this.field2329[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2321[var12] = (var14 << 7) + (this.field2321[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2321[var12] = (this.field2321[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2340[var12] = (var14 << 7) + (this.field2340[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2340[var12] = (this.field2340[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2323[var12] = (var14 << 7) + (this.field2323[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2323[var12] = (this.field2323[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2331[var12] |= 0x1;
                } else {
                    this.field2331[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2331[var12] |= 0x2;
                } else {
                    this.method2735(var12);
                    this.field2331[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2332[var12] = (var14 << 7) + (this.field2332[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2332[var12] = (this.field2332[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2332[var12] = (var14 << 7) + (this.field2332[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2332[var12] = (this.field2332[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2731(var12);
            }
            if (var13 == 121) {
                this.method2732(var12);
            }
            if (var13 == 123) {
                this.method2743(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2332[var12];
                if (var15 == 16384) {
                    this.field2333[var12] = (var14 << 7) + (this.field2333[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2332[var12];
                if (var16 == 16384) {
                    this.field2333[var12] = (this.field2333[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2324[var12] = (var14 << 7) + (this.field2324[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2324[var12] = (this.field2324[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2331[var12] |= 0x4;
                } else {
                    this.method2736(var12);
                    this.field2331[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2826(var12, (var14 << 7) + (this.field2338[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2826(var12, (this.field2338[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2803(var17, this.field2326[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2729(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method2730(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2785();
            }
        }
    }

    @ObfuscatedName("ez.ad(III)V")
    public void method2826(int arg0, int arg1) {
        this.field2338[arg0] = arg1;
        this.field2336[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ez.at(Les;I)I")
    public int method2739(class144 arg0) {
        int var2 = (arg0.field2403 * arg0.field2391 >> 12) + arg0.field2389;
        int var3 = ((this.field2320[arg0.field2387] - 8192) * this.field2333[arg0.field2387] >> 12) + var2;
        class141 var4 = arg0.field2384;
        if (var4.field2356 > 0 && (var4.field2355 > 0 || this.field2328[arg0.field2387] > 0)) {
            int var5 = var4.field2355 << 2;
            int var6 = var4.field2357 << 1;
            if (arg0.field2397 < var6) {
                var5 = arg0.field2397 * var5 / var6;
            }
            int var7 = (this.field2328[arg0.field2387] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2398 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2399.field1235 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field2409 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ez.as(Les;I)I")
    public int method2722(class144 arg0) {
        class141 var2 = arg0.field2384;
        int var3 = this.field2321[arg0.field2387] * this.field2323[arg0.field2387] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2392 * var4 + 16384 >> 15;
        int var6 = this.field2319 * var5 + 128 >> 8;
        if (var2.field2349 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2394 * 1.953125E-5D * (double) var2.field2349) + 0.5D);
        }
        if (var2.field2353 != null) {
            int var7 = arg0.field2393;
            int var8 = var2.field2353[arg0.field2395 + 1];
            if (arg0.field2395 < var2.field2353.length - 2) {
                int var9 = (var2.field2353[arg0.field2395] & 0xFF) << 8;
                int var10 = (var2.field2353[arg0.field2395 + 2] & 0xFF) << 8;
                var8 += (var2.field2353[arg0.field2395 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2381 > 0 && var2.field2350 != null) {
            int var11 = arg0.field2381;
            int var12 = var2.field2350[arg0.field2396 + 1];
            if (arg0.field2396 < var2.field2350.length - 2) {
                int var13 = (var2.field2350[arg0.field2396] & 0xFF) << 8;
                int var14 = (var2.field2350[arg0.field2396 + 2] & 0xFF) << 8;
                var12 += (var2.field2350[arg0.field2396 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ez.aw(Les;I)I")
    public int method2741(class144 arg0) {
        int var2 = this.field2340[arg0.field2387];
        return var2 < 8192 ? arg0.field2388 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2388) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ez.x()Laa;")
    public synchronized class47 method987() {
        return this.field2347;
    }

    @ObfuscatedName("ez.w()Laa;")
    public synchronized class47 method962() {
        return null;
    }

    @ObfuscatedName("ez.j()I")
    public synchronized int method963() {
        return 0;
    }

    @ObfuscatedName("ez.s([III)V")
    public synchronized void method976(int[] arg0, int arg1, int arg2) {
        if (this.field2339.method2853()) {
            int var4 = this.field2322 * this.field2339.field2368 / Statics.field2409;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2343;
                if (this.field2344 - var5 >= 0L) {
                    this.field2343 = var5;
                    break;
                }
                int var7 = (int) ((this.field2344 - this.field2343 + (long) var4 - 1L) / (long) var4);
                this.field2343 += (long) var4 * (long) var7;
                this.field2347.method976(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2834();
            } while (this.field2339.method2853());
        }
        this.field2347.method976(arg0, arg1, arg2);
    }

    @ObfuscatedName("ez.au(I)V")
    public synchronized void method965(int arg0) {
        if (this.field2339.method2853()) {
            int var2 = this.field2322 * this.field2339.field2368 / Statics.field2409;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2343;
                if (this.field2344 - var3 >= 0L) {
                    this.field2343 = var3;
                    break;
                }
                int var5 = (int) ((this.field2344 - this.field2343 + (long) var2 - 1L) / (long) var2);
                this.field2343 += (long) var2 * (long) var5;
                this.field2347.method965(var5);
                arg0 -= var5;
                this.method2834();
            } while (this.field2339.method2853());
        }
        this.field2347.method965(arg0);
    }

    @ObfuscatedName("ez.ax(I)V")
    public void method2834() {
        int var1 = this.field2341;
        int var2 = this.field2318;
        long var3 = this.field2344;
        while (this.field2318 == var2) {
            while (this.field2339.field2371[var1] == var2) {
                this.field2339.method2878(var1);
                int var5 = this.field2339.method2855(var1);
                if (var5 == 1) {
                    this.field2339.method2865();
                    this.field2339.method2852(var1);
                    if (this.field2339.method2859()) {
                        if (!this.field2345 || var2 == 0) {
                            this.method2785();
                            this.field2339.method2848();
                            return;
                        }
                        this.field2339.method2860(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2761(var5);
                }
                this.field2339.method2854(var1);
                this.field2339.method2852(var1);
            }
            var1 = this.field2339.method2858();
            var2 = this.field2339.field2371[var1];
            var3 = this.field2339.method2857(var2);
        }
        this.field2341 = var1;
        this.field2318 = var2;
        this.field2344 = var3;
    }

    @ObfuscatedName("ez.am(Les;B)Z")
    public boolean method2774(class144 arg0) {
        if (arg0.field2383 != null) {
            return false;
        }
        if (arg0.field2381 >= 0) {
            arg0.method3346();
            if (arg0.field2385 > 0 && this.field2330[arg0.field2387][arg0.field2385] == arg0) {
                this.field2330[arg0.field2387][arg0.field2385] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ez.an(Les;[IIIB)Z")
    public boolean method2745(class144 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2400 = Statics.field2409 / 100;
        if (arg0.field2381 >= 0 && arg0.field2383 == null || arg0.field2383.method1028()) {
            arg0.method2887();
            arg0.method3346();
            if (arg0.field2385 > 0 && this.field2330[arg0.field2387][arg0.field2385] == arg0) {
                this.field2330[arg0.field2387][arg0.field2385] = null;
            }
            return true;
        }
        int var5 = arg0.field2391;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2329[arg0.field2387] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2391 = var6;
        }
        arg0.field2383.method958(this.method2739(arg0));
        class141 var7 = arg0.field2384;
        boolean var8 = false;
        arg0.field2397++;
        arg0.field2398 += var7.field2356;
        double var9 = (double) ((arg0.field2386 - 60 << 8) + (arg0.field2403 * arg0.field2391 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2349 > 0) {
            if (var7.field2354 > 0) {
                arg0.field2394 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2354 * var9) + 0.5D);
            } else {
                arg0.field2394 += 128;
            }
        }
        if (var7.field2353 != null) {
            if (var7.field2352 > 0) {
                arg0.field2393 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2352 * var9) + 0.5D);
            } else {
                arg0.field2393 += 128;
            }
            while (arg0.field2395 < var7.field2353.length - 2 && arg0.field2393 > (var7.field2353[arg0.field2395 + 2] & 0xFF) << 8) {
                arg0.field2395 += 2;
            }
            if (arg0.field2395 == var7.field2353.length - 2 && var7.field2353[arg0.field2395 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2381 >= 0 && var7.field2350 != null && (this.field2331[arg0.field2387] & 0x1) == 0 && (arg0.field2385 < 0 || this.field2330[arg0.field2387][arg0.field2385] != arg0)) {
            if (var7.field2351 > 0) {
                arg0.field2381 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2351 * var9) + 0.5D);
            } else {
                arg0.field2381 += 128;
            }
            while (arg0.field2396 < var7.field2350.length - 2 && arg0.field2381 > (var7.field2350[arg0.field2396 + 2] & 0xFF) << 8) {
                arg0.field2396 += 2;
            }
            if (arg0.field2396 == var7.field2350.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2383.method956(arg0.field2400, this.method2722(arg0), this.method2741(arg0));
            return false;
        }
        arg0.field2383.method957(arg0.field2400);
        if (arg1 == null) {
            arg0.field2383.method965(arg3);
        } else {
            arg0.field2383.method976(arg1, arg2, arg3);
        }
        if (arg0.field2383.method960()) {
            this.field2347.field2361.method1094(arg0.field2383);
        }
        arg0.method2887();
        if (arg0.field2381 >= 0) {
            arg0.method3346();
            if (arg0.field2385 > 0 && this.field2330[arg0.field2387][arg0.field2385] == arg0) {
                this.field2330[arg0.field2387][arg0.field2385] = null;
            }
        }
        return true;
    }
}
