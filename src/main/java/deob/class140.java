package deob;

@ObfuscatedName("eb")
public class class140 extends class47 {

    @ObfuscatedName("eb.j")
    public class173 field2355 = new class173(128);

    @ObfuscatedName("eb.y")
    public int field2337 = 256;

    @ObfuscatedName("eb.x")
    public int field2338 = 1000000;

    @ObfuscatedName("eb.z")
    public int[] field2340 = new int[16];

    @ObfuscatedName("eb.c")
    public int[] field2349 = new int[16];

    @ObfuscatedName("eb.e")
    public int[] field2341 = new int[16];

    @ObfuscatedName("eb.s")
    public int[] field2350 = new int[16];

    @ObfuscatedName("eb.i")
    public int[] field2343 = new int[16];

    @ObfuscatedName("eb.g")
    public int[] field2344 = new int[16];

    @ObfuscatedName("eb.q")
    public int[] field2345 = new int[16];

    @ObfuscatedName("eb.k")
    public int[] field2346 = new int[16];

    @ObfuscatedName("eb.v")
    public int[] field2347 = new int[16];

    @ObfuscatedName("eb.b")
    public int[] field2348 = new int[16];

    @ObfuscatedName("eb.p")
    public int[] field2353 = new int[16];

    @ObfuscatedName("eb.t")
    public int[] field2336 = new int[16];

    @ObfuscatedName("eb.l")
    public int[] field2363 = new int[16];

    @ObfuscatedName("eb.a")
    public int[] field2352 = new int[16];

    @ObfuscatedName("eb.f")
    public int[] field2356 = new int[16];

    @ObfuscatedName("eb.h")
    public class144[][] field2354 = new class144[16][128];

    @ObfuscatedName("eb.az")
    public class144[][] field2351 = new class144[16][128];

    @ObfuscatedName("eb.ao")
    public class143 field2339 = new class143();

    @ObfuscatedName("eb.au")
    public boolean field2357;

    @ObfuscatedName("eb.aw")
    public int field2358;

    @ObfuscatedName("eb.ad")
    public int field2362;

    @ObfuscatedName("eb.av")
    public long field2360;

    @ObfuscatedName("eb.am")
    public long field2361;

    @ObfuscatedName("eb.an")
    public class142 field2342 = new class142(this);

    public class140() {
        this.method2683();
    }

    @ObfuscatedName("eb.j(II)V")
    public synchronized void method2666(int arg0) {
        this.field2337 = arg0;
    }

    @ObfuscatedName("eb.y(I)I")
    public int method2667() {
        return this.field2337;
    }

    @ObfuscatedName("eb.z(Ley;Leh;Lby;II)Z")
    public synchronized boolean method2742(class138 arg0, class150 arg1, class57 arg2, int arg3) {
        arg0.method2647();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class174 var7 = (class174) arg0.field2322.method3225(); var7 != null; var7 = (class174) arg0.field2322.method3230()) {
            int var8 = (int) var7.field2758;
            class139 var9 = (class139) this.field2355.method3222((long) var8);
            if (var9 == null) {
                var9 = class139.method137(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2355.method3223(var9, (long) var8);
            }
            if (!var9.method2659(arg2, var7.field2753, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2650();
        }
        return var5;
    }

    @ObfuscatedName("eb.c(I)V")
    public synchronized void method2699() {
        for (class139 var1 = (class139) this.field2355.method3225(); var1 != null; var1 = (class139) this.field2355.method3230()) {
            var1.method2660();
        }
    }

    @ObfuscatedName("eb.e(I)V")
    public synchronized void method2712() {
        for (class139 var1 = (class139) this.field2355.method3225(); var1 != null; var1 = (class139) this.field2355.method3230()) {
            var1.method3289();
        }
    }

    @ObfuscatedName("eb.s(Ley;ZB)V")
    public synchronized void method2730(class138 arg0, boolean arg1) {
        this.method2672();
        this.field2339.method2791(arg0.field2321);
        this.field2357 = arg1;
        this.field2360 = 0L;
        int var3 = this.field2339.method2794();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2339.method2795(var4);
            this.field2339.method2825(var4);
            this.field2339.method2796(var4);
        }
        this.field2358 = this.field2339.method2802();
        this.field2362 = this.field2339.field2383[this.field2358];
        this.field2361 = this.field2339.method2813(this.field2362);
    }

    @ObfuscatedName("eb.i(B)V")
    public synchronized void method2672() {
        this.field2339.method2792();
        this.method2683();
    }

    @ObfuscatedName("eb.g(I)Z")
    public synchronized boolean method2673() {
        return this.field2339.method2798();
    }

    @ObfuscatedName("eb.q(III)V")
    public synchronized void method2674(int arg0, int arg1) {
        this.method2733(arg0, arg1);
    }

    @ObfuscatedName("eb.w(IIS)V")
    public void method2733(int arg0, int arg1) {
        this.field2350[arg0] = arg1;
        this.field2344[arg0] = arg1 & 0xFFFFFF80;
        this.method2741(arg0, arg1);
    }

    @ObfuscatedName("eb.k(III)V")
    public void method2741(int arg0, int arg1) {
        if (this.field2343[arg0] != arg1) {
            this.field2343[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2351[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("eb.v(IIIB)V")
    public void method2675(int arg0, int arg1, int arg2) {
        this.method2765(arg0, arg1, 64);
        if ((this.field2348[arg0] & 0x2) != 0) {
            for (class144 var4 = (class144) this.field2342.field2377.method3264(); var4 != null; var4 = (class144) this.field2342.field2377.method3248()) {
                if (var4.field2416 == arg0 && var4.field2409 < 0) {
                    this.field2354[arg0][var4.field2398] = null;
                    this.field2354[arg0][arg1] = var4;
                    int var5 = (var4.field2413 * var4.field2402 >> 12) + var4.field2401;
                    var4.field2401 += arg1 - var4.field2398 << 8;
                    var4.field2402 = var5 - var4.field2401;
                    var4.field2413 = 4096;
                    var4.field2398 = arg1;
                    return;
                }
            }
        }
        class139 var6 = (class139) this.field2355.method3222((long) this.field2343[arg0]);
        if (var6 == null) {
            return;
        }
        class62 var7 = var6.field2324[arg1];
        if (var7 == null) {
            return;
        }
        class144 var8 = new class144();
        var8.field2416 = arg0;
        var8.field2394 = var6;
        var8.field2393 = var7;
        var8.field2396 = var6.field2327[arg1];
        var8.field2397 = var6.field2329[arg1];
        var8.field2398 = arg1;
        var8.field2399 = var6.field2328 * arg2 * arg2 * var6.field2326[arg1] + 1024 >> 11;
        var8.field2400 = var6.field2331[arg1] & 0xFF;
        var8.field2401 = (arg1 << 8) - (var6.field2325[arg1] & 0x7FFF);
        var8.field2411 = 0;
        var8.field2405 = 0;
        var8.field2406 = 0;
        var8.field2409 = -1;
        var8.field2408 = 0;
        if (this.field2363[arg0] == 0) {
            var8.field2403 = class44.method931(var7, this.method2723(var8), this.method2688(var8), this.method2690(var8));
        } else {
            var8.field2403 = class44.method931(var7, this.method2723(var8), 0, this.method2690(var8));
            this.method2693(var8, var6.field2325[arg1] < 0);
        }
        if (var6.field2325[arg1] < 0) {
            var8.field2403.method933(-1);
        }
        if (var8.field2397 >= 0) {
            class144 var9 = this.field2351[arg0][var8.field2397];
            if (var9 != null && var9.field2409 < 0) {
                this.field2354[arg0][var9.field2398] = null;
                var9.field2409 = 0;
            }
            this.field2351[arg0][var8.field2397] = var8;
        }
        this.field2342.field2377.method3283(var8);
        this.field2354[arg0][arg1] = var8;
    }

    @ObfuscatedName("eb.o(Lei;ZB)V")
    public void method2693(class144 arg0, boolean arg1) {
        int var3 = arg0.field2393.field1211.length;
        int var5;
        if (arg1 && arg0.field2393.field1215) {
            int var4 = var3 + var3 - arg0.field2393.field1214;
            var5 = (int) ((long) this.field2363[arg0.field2416] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2403.method939(true);
            }
        } else {
            var5 = (int) ((long) this.field2363[arg0.field2416] * (long) var3 >> 6);
        }
        arg0.field2403.method1071(var5);
    }

    @ObfuscatedName("eb.m(IIII)V")
    public void method2765(int arg0, int arg1, int arg2) {
        class144 var4 = this.field2354[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2354[arg0][arg1] = null;
        if ((this.field2348[arg0] & 0x2) == 0) {
            var4.field2409 = 0;
            return;
        }
        for (class144 var5 = (class144) this.field2342.field2377.method3279(); var5 != null; var5 = (class144) this.field2342.field2377.method3249()) {
            if (var4.field2416 == var5.field2416 && var5.field2409 < 0 && var4 != var5) {
                var4.field2409 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("eb.u(IIII)V")
    public void method2677(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("eb.r(III)V")
    public void method2678(int arg0, int arg1) {
    }

    @ObfuscatedName("eb.d(IIB)V")
    public void method2679(int arg0, int arg1) {
        this.field2345[arg0] = arg1;
    }

    @ObfuscatedName("eb.n(IB)V")
    public void method2680(int arg0) {
        for (class144 var2 = (class144) this.field2342.field2377.method3279(); var2 != null; var2 = (class144) this.field2342.field2377.method3249()) {
            if (arg0 < 0 || var2.field2416 == arg0) {
                if (var2.field2403 != null) {
                    var2.field2403.method943(Statics.field1091 / 100);
                    if (var2.field2403.method1049()) {
                        this.field2342.field2376.method1099(var2.field2403);
                    }
                    var2.method2840();
                }
                if (var2.field2409 < 0) {
                    this.field2354[var2.field2416][var2.field2398] = null;
                }
                var2.method3289();
            }
        }
    }

    @ObfuscatedName("eb.b(II)V")
    public void method2681(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2681(var2);
            }
            return;
        }
        this.field2340[arg0] = 12800;
        this.field2349[arg0] = 8192;
        this.field2341[arg0] = 16383;
        this.field2345[arg0] = 8192;
        this.field2346[arg0] = 0;
        this.field2347[arg0] = 8192;
        this.method2734(arg0);
        this.method2669(arg0);
        this.field2348[arg0] = 0;
        this.field2353[arg0] = 32767;
        this.field2336[arg0] = 256;
        this.field2363[arg0] = 0;
        this.method2686(arg0, 8192);
    }

    @ObfuscatedName("eb.p(II)V")
    public void method2682(int arg0) {
        for (class144 var2 = (class144) this.field2342.field2377.method3279(); var2 != null; var2 = (class144) this.field2342.field2377.method3249()) {
            if ((arg0 < 0 || var2.field2416 == arg0) && var2.field2409 < 0) {
                this.field2354[var2.field2416][var2.field2398] = null;
                var2.field2409 = 0;
            }
        }
    }

    @ObfuscatedName("eb.t(I)V")
    public void method2683() {
        this.method2680(-1);
        this.method2681(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2343[var1] = this.field2350[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2344[var2] = this.field2350[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("eb.ao(II)V")
    public void method2734(int arg0) {
        if ((this.field2348[arg0] & 0x2) == 0) {
            return;
        }
        for (class144 var2 = (class144) this.field2342.field2377.method3279(); var2 != null; var2 = (class144) this.field2342.field2377.method3249()) {
            if (var2.field2416 == arg0 && this.field2354[arg0][var2.field2398] == null && var2.field2409 < 0) {
                var2.field2409 = 0;
            }
        }
    }

    @ObfuscatedName("eb.au(II)V")
    public void method2669(int arg0) {
        if ((this.field2348[arg0] & 0x4) == 0) {
            return;
        }
        for (class144 var2 = (class144) this.field2342.field2377.method3279(); var2 != null; var2 = (class144) this.field2342.field2377.method3249()) {
            if (var2.field2416 == arg0) {
                var2.field2407 = 0;
            }
        }
    }

    @ObfuscatedName("eb.aw(IB)V")
    public void method2685(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2765(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2675(var6, var7, var8);
            } else {
                this.method2765(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2677(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2344[var12] = (var14 << 14) + (this.field2344[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2344[var12] = (var14 << 7) + (this.field2344[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2346[var12] = (var14 << 7) + (this.field2346[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2346[var12] = (this.field2346[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2347[var12] = (var14 << 7) + (this.field2347[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2347[var12] = (this.field2347[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2340[var12] = (var14 << 7) + (this.field2340[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2340[var12] = (this.field2340[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2349[var12] = (var14 << 7) + (this.field2349[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2349[var12] = (this.field2349[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2341[var12] = (var14 << 7) + (this.field2341[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2341[var12] = (this.field2341[var12] & 0xFFFFFF80) + var14;
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
                    this.method2734(var12);
                    this.field2348[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2353[var12] = (var14 << 7) + (this.field2353[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2353[var12] = (this.field2353[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2353[var12] = (var14 << 7) + (this.field2353[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2353[var12] = (this.field2353[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2680(var12);
            }
            if (var13 == 121) {
                this.method2681(var12);
            }
            if (var13 == 123) {
                this.method2682(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2353[var12];
                if (var15 == 16384) {
                    this.field2336[var12] = (var14 << 7) + (this.field2336[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2353[var12];
                if (var16 == 16384) {
                    this.field2336[var12] = (this.field2336[var12] & 0xFFFFFF80) + var14;
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
                    this.field2348[var12] |= 0x4;
                } else {
                    this.method2669(var12);
                    this.field2348[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2686(var12, (var14 << 7) + (this.field2352[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2686(var12, (this.field2352[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2741(var17, this.field2344[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2678(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method2679(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2683();
            }
        }
    }

    @ObfuscatedName("eb.ad(III)V")
    public void method2686(int arg0, int arg1) {
        this.field2352[arg0] = arg1;
        this.field2356[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("eb.av(Lei;B)I")
    public int method2723(class144 arg0) {
        int var2 = (arg0.field2413 * arg0.field2402 >> 12) + arg0.field2401;
        int var3 = ((this.field2345[arg0.field2416] - 8192) * this.field2336[arg0.field2416] >> 12) + var2;
        class141 var4 = arg0.field2396;
        if (var4.field2371 > 0 && (var4.field2370 > 0 || this.field2346[arg0.field2416] > 0)) {
            int var5 = var4.field2370 << 2;
            int var6 = var4.field2364 << 1;
            if (arg0.field2417 < var6) {
                var5 = arg0.field2417 * var5 / var6;
            }
            int var7 = (this.field2346[arg0.field2416] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2410 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2393.field1213 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1091 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("eb.am(Lei;I)I")
    public int method2688(class144 arg0) {
        class141 var2 = arg0.field2396;
        int var3 = this.field2341[arg0.field2416] * this.field2340[arg0.field2416] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2399 * var4 + 16384 >> 15;
        int var6 = this.field2337 * var5 + 128 >> 8;
        if (var2.field2366 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2411 * 1.953125E-5D * (double) var2.field2366) + 0.5D);
        }
        if (var2.field2373 != null) {
            int var7 = arg0.field2405;
            int var8 = var2.field2373[arg0.field2406 + 1];
            if (arg0.field2406 < var2.field2373.length - 2) {
                int var9 = (var2.field2373[arg0.field2406] & 0xFF) << 8;
                int var10 = (var2.field2373[arg0.field2406 + 2] & 0xFF) << 8;
                var8 += (var2.field2373[arg0.field2406 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2409 > 0 && var2.field2365 != null) {
            int var11 = arg0.field2409;
            int var12 = var2.field2365[arg0.field2408 + 1];
            if (arg0.field2408 < var2.field2365.length - 2) {
                int var13 = (var2.field2365[arg0.field2408] & 0xFF) << 8;
                int var14 = (var2.field2365[arg0.field2408 + 2] & 0xFF) << 8;
                var12 += (var2.field2365[arg0.field2408 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("eb.an(Lei;B)I")
    public int method2690(class144 arg0) {
        int var2 = this.field2349[arg0.field2416];
        return var2 < 8192 ? arg0.field2400 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2400) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("eb.l()Lak;")
    public synchronized class47 method947() {
        return this.field2342;
    }

    @ObfuscatedName("eb.a()Lak;")
    public synchronized class47 method977() {
        return null;
    }

    @ObfuscatedName("eb.f()I")
    public synchronized int method981() {
        return 0;
    }

    @ObfuscatedName("eb.h([III)V")
    public synchronized void method1077(int[] arg0, int arg1, int arg2) {
        if (this.field2339.method2798()) {
            int var4 = this.field2338 * this.field2339.field2380 / Statics.field1091;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2360;
                if (this.field2361 - var5 >= 0L) {
                    this.field2360 = var5;
                    break;
                }
                int var7 = (int) ((this.field2361 - this.field2360 + (long) var4 - 1L) / (long) var4);
                this.field2360 += (long) var4 * (long) var7;
                this.field2342.method1077(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2694();
            } while (this.field2339.method2798());
        }
        this.field2342.method1077(arg0, arg1, arg2);
    }

    @ObfuscatedName("eb.az(I)V")
    public synchronized void method951(int arg0) {
        if (this.field2339.method2798()) {
            int var2 = this.field2338 * this.field2339.field2380 / Statics.field1091;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2360;
                if (this.field2361 - var3 >= 0L) {
                    this.field2360 = var3;
                    break;
                }
                int var5 = (int) ((this.field2361 - this.field2360 + (long) var2 - 1L) / (long) var2);
                this.field2360 += (long) var2 * (long) var5;
                this.field2342.method951(var5);
                arg0 -= var5;
                this.method2694();
            } while (this.field2339.method2798());
        }
        this.field2342.method951(arg0);
    }

    @ObfuscatedName("eb.ac(B)V")
    public void method2694() {
        int var1 = this.field2358;
        int var2 = this.field2362;
        long var3 = this.field2361;
        while (this.field2362 == var2) {
            while (this.field2339.field2383[var1] == var2) {
                this.field2339.method2795(var1);
                int var5 = this.field2339.method2799(var1);
                if (var5 == 1) {
                    this.field2339.method2797();
                    this.field2339.method2796(var1);
                    if (this.field2339.method2803()) {
                        if (!this.field2357 || var2 == 0) {
                            this.method2683();
                            this.field2339.method2792();
                            return;
                        }
                        this.field2339.method2790(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2685(var5);
                }
                this.field2339.method2825(var1);
                this.field2339.method2796(var1);
            }
            var1 = this.field2339.method2802();
            var2 = this.field2339.field2383[var1];
            var3 = this.field2339.method2813(var2);
        }
        this.field2358 = var1;
        this.field2362 = var2;
        this.field2361 = var3;
    }

    @ObfuscatedName("eb.at(Lei;I)Z")
    public boolean method2670(class144 arg0) {
        if (arg0.field2403 != null) {
            return false;
        }
        if (arg0.field2409 >= 0) {
            arg0.method3289();
            if (arg0.field2397 > 0 && this.field2351[arg0.field2416][arg0.field2397] == arg0) {
                this.field2351[arg0.field2416][arg0.field2397] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("eb.ax(Lei;[IIII)Z")
    public boolean method2738(class144 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2412 = Statics.field1091 / 100;
        if (arg0.field2409 >= 0 && arg0.field2403 == null || arg0.field2403.method969()) {
            arg0.method2840();
            arg0.method3289();
            if (arg0.field2397 > 0 && this.field2351[arg0.field2416][arg0.field2397] == arg0) {
                this.field2351[arg0.field2416][arg0.field2397] = null;
            }
            return true;
        }
        int var5 = arg0.field2413;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2347[arg0.field2416] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2413 = var6;
        }
        arg0.field2403.method944(this.method2723(arg0));
        class141 var7 = arg0.field2396;
        boolean var8 = false;
        arg0.field2417++;
        arg0.field2410 += var7.field2371;
        double var9 = (double) ((arg0.field2398 - 60 << 8) + (arg0.field2413 * arg0.field2402 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2366 > 0) {
            if (var7.field2369 > 0) {
                arg0.field2411 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2369 * var9) + 0.5D);
            } else {
                arg0.field2411 += 128;
            }
        }
        if (var7.field2373 != null) {
            if (var7.field2372 > 0) {
                arg0.field2405 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2372 * var9) + 0.5D);
            } else {
                arg0.field2405 += 128;
            }
            while (arg0.field2406 < var7.field2373.length - 2 && arg0.field2405 > (var7.field2373[arg0.field2406 + 2] & 0xFF) << 8) {
                arg0.field2406 += 2;
            }
            if (arg0.field2406 == var7.field2373.length - 2 && var7.field2373[arg0.field2406 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2409 >= 0 && var7.field2365 != null && (this.field2348[arg0.field2416] & 0x1) == 0 && (arg0.field2397 < 0 || this.field2351[arg0.field2416][arg0.field2397] != arg0)) {
            if (var7.field2375 > 0) {
                arg0.field2409 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2375 * var9) + 0.5D);
            } else {
                arg0.field2409 += 128;
            }
            while (arg0.field2408 < var7.field2365.length - 2 && arg0.field2409 > (var7.field2365[arg0.field2408 + 2] & 0xFF) << 8) {
                arg0.field2408 += 2;
            }
            if (arg0.field2408 == var7.field2365.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2403.method942(arg0.field2412, this.method2688(arg0), this.method2690(arg0));
            return false;
        }
        arg0.field2403.method943(arg0.field2412);
        if (arg1 == null) {
            arg0.field2403.method951(arg3);
        } else {
            arg0.field2403.method1077(arg1, arg2, arg3);
        }
        if (arg0.field2403.method1049()) {
            this.field2342.field2376.method1099(arg0.field2403);
        }
        arg0.method2840();
        if (arg0.field2409 >= 0) {
            arg0.method3289();
            if (arg0.field2397 > 0 && this.field2351[arg0.field2416][arg0.field2397] == arg0) {
                this.field2351[arg0.field2416][arg0.field2397] = null;
            }
        }
        return true;
    }
}
