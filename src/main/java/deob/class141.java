package deob;

@ObfuscatedName("el")
public class class141 extends class48 {

    @ObfuscatedName("el.p")
    public class175 field2379 = new class175(128);

    @ObfuscatedName("el.i")
    public int field2362 = 256;

    @ObfuscatedName("el.o")
    public int field2377 = 1000000;

    @ObfuscatedName("el.n")
    public int[] field2364 = new int[16];

    @ObfuscatedName("el.l")
    public int[] field2365 = new int[16];

    @ObfuscatedName("el.v")
    public int[] field2366 = new int[16];

    @ObfuscatedName("el.g")
    public int[] field2361 = new int[16];

    @ObfuscatedName("el.x")
    public int[] field2376 = new int[16];

    @ObfuscatedName("el.c")
    public int[] field2369 = new int[16];

    @ObfuscatedName("el.f")
    public int[] field2370 = new int[16];

    @ObfuscatedName("el.r")
    public int[] field2371 = new int[16];

    @ObfuscatedName("el.d")
    public int[] field2372 = new int[16];

    @ObfuscatedName("el.j")
    public int[] field2381 = new int[16];

    @ObfuscatedName("el.h")
    public int[] field2375 = new int[16];

    @ObfuscatedName("el.m")
    public int[] field2367 = new int[16];

    @ObfuscatedName("el.y")
    public int[] field2384 = new int[16];

    @ObfuscatedName("el.t")
    public int[] field2390 = new int[16];

    @ObfuscatedName("el.k")
    public int[] field2392 = new int[16];

    @ObfuscatedName("el.z")
    public class145[][] field2380 = new class145[16][128];

    @ObfuscatedName("el.at")
    public class145[][] field2374 = new class145[16][128];

    @ObfuscatedName("el.ay")
    public class144 field2382 = new class144();

    @ObfuscatedName("el.ae")
    public boolean field2383;

    @ObfuscatedName("el.af")
    public int field2378;

    @ObfuscatedName("el.ao")
    public int field2385;

    @ObfuscatedName("el.ad")
    public long field2386;

    @ObfuscatedName("el.aj")
    public long field2387;

    @ObfuscatedName("el.ah")
    public class143 field2368 = new class143(this);

    public class141() {
        this.method2767();
    }

    @ObfuscatedName("el.p(II)V")
    public synchronized void method2766(int arg0) {
        this.field2362 = arg0;
    }

    @ObfuscatedName("el.i(S)I")
    public int method2768() {
        return this.field2362;
    }

    @ObfuscatedName("el.n(Leh;Lep;Lbb;II)Z")
    public synchronized boolean method2769(class139 arg0, class152 arg1, class58 arg2, int arg3) {
        arg0.method2744();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class176 var7 = (class176) arg0.field2350.method3326(); var7 != null; var7 = (class176) arg0.field2350.method3316()) {
            int var8 = (int) var7.field2820;
            class140 var9 = (class140) this.field2379.method3312((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3070(var8);
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
                this.field2379.method3313(var11, (long) var8);
            }
            if (!var9.method2757(arg2, var7.field2814, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2747();
        }
        return var5;
    }

    @ObfuscatedName("el.l(I)V")
    public synchronized void method2839() {
        for (class140 var1 = (class140) this.field2379.method3326(); var1 != null; var1 = (class140) this.field2379.method3316()) {
            var1.method2764();
        }
    }

    @ObfuscatedName("el.v(B)V")
    public synchronized void method2862() {
        for (class140 var1 = (class140) this.field2379.method3326(); var1 != null; var1 = (class140) this.field2379.method3316()) {
            var1.method3360();
        }
    }

    @ObfuscatedName("el.g(Leh;ZI)V")
    public synchronized void method2772(class139 arg0, boolean arg1) {
        this.method2773();
        this.field2382.method2928(arg0.field2349);
        this.field2383 = arg1;
        this.field2386 = 0L;
        int var3 = this.field2382.method2917();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2382.method2880(var4);
            this.field2382.method2883(var4);
            this.field2382.method2922(var4);
        }
        this.field2378 = this.field2382.method2888();
        this.field2385 = this.field2382.field2415[this.field2378];
        this.field2387 = this.field2382.method2887(this.field2385);
    }

    @ObfuscatedName("el.x(B)V")
    public synchronized void method2773() {
        this.field2382.method2877();
        this.method2767();
    }

    @ObfuscatedName("el.c(I)Z")
    public synchronized boolean method2774() {
        return this.field2382.method2895();
    }

    @ObfuscatedName("el.f(III)V")
    public synchronized void method2775(int arg0, int arg1) {
        this.method2776(arg0, arg1);
    }

    @ObfuscatedName("el.r(IIB)V")
    public void method2776(int arg0, int arg1) {
        this.field2361[arg0] = arg1;
        this.field2369[arg0] = arg1 & 0xFFFFFF80;
        this.method2794(arg0, arg1);
    }

    @ObfuscatedName("el.d(IIB)V")
    public void method2794(int arg0, int arg1) {
        if (this.field2376[arg0] != arg1) {
            this.field2376[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2374[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("el.a(IIII)V")
    public void method2802(int arg0, int arg1, int arg2) {
        this.method2779(arg0, arg1, 64);
        if ((this.field2381[arg0] & 0x2) != 0) {
            for (class145 var4 = (class145) this.field2368.field2405.method3335(); var4 != null; var4 = (class145) this.field2368.field2405.method3336()) {
                if (var4.field2449 == arg0 && var4.field2437 < 0) {
                    this.field2380[arg0][var4.field2428] = null;
                    this.field2380[arg0][arg1] = var4;
                    int var5 = (var4.field2433 * var4.field2432 >> 12) + var4.field2435;
                    var4.field2435 += arg1 - var4.field2428 << 8;
                    var4.field2432 = var5 - var4.field2435;
                    var4.field2433 = 4096;
                    var4.field2428 = arg1;
                    return;
                }
            }
        }
        class140 var6 = (class140) this.field2379.method3312((long) this.field2376[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2352[arg1];
        if (var7 == null) {
            return;
        }
        class145 var8 = new class145();
        var8.field2449 = arg0;
        var8.field2424 = var6;
        var8.field2443 = var7;
        var8.field2426 = var6.field2351[arg1];
        var8.field2427 = var6.field2357[arg1];
        var8.field2428 = arg1;
        var8.field2429 = var6.field2355 * arg2 * arg2 * var6.field2354[arg1] + 1024 >> 11;
        var8.field2430 = var6.field2356[arg1] & 0xFF;
        var8.field2435 = (arg1 << 8) - (var6.field2353[arg1] & 0x7FFF);
        var8.field2434 = 0;
        var8.field2431 = 0;
        var8.field2438 = 0;
        var8.field2437 = -1;
        var8.field2445 = 0;
        if (this.field2384[arg0] == 0) {
            var8.field2441 = class45.method972(var7, this.method2791(var8), this.method2792(var8), this.method2793(var8));
        } else {
            var8.field2441 = class45.method972(var7, this.method2791(var8), 0, this.method2793(var8));
            this.method2858(var8, var6.field2353[arg1] < 0);
        }
        if (var6.field2353[arg1] < 0) {
            var8.field2441.method974(-1);
        }
        if (var8.field2427 >= 0) {
            class145 var9 = this.field2374[arg0][var8.field2427];
            if (var9 != null && var9.field2437 < 0) {
                this.field2380[arg0][var9.field2428] = null;
                var9.field2437 = 0;
            }
            this.field2374[arg0][var8.field2427] = var8;
        }
        this.field2368.field2405.method3328(var8);
        this.field2380[arg0][arg1] = var8;
    }

    @ObfuscatedName("el.q(Lev;ZI)V")
    public void method2858(class145 arg0, boolean arg1) {
        int var3 = arg0.field2443.field1242.length;
        int var5;
        if (arg1 && arg0.field2443.field1245) {
            int var4 = var3 + var3 - arg0.field2443.field1243;
            var5 = (int) ((long) this.field2384[arg0.field2449] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2441.method1060(true);
            }
        } else {
            var5 = (int) ((long) this.field2384[arg0.field2449] * (long) var3 >> 6);
        }
        arg0.field2441.method971(var5);
    }

    @ObfuscatedName("el.u(IIII)V")
    public void method2779(int arg0, int arg1, int arg2) {
        class145 var4 = this.field2380[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2380[arg0][arg1] = null;
        if ((this.field2381[arg0] & 0x2) == 0) {
            var4.field2437 = 0;
            return;
        }
        for (class145 var5 = (class145) this.field2368.field2405.method3334(); var5 != null; var5 = (class145) this.field2368.field2405.method3355()) {
            if (var4.field2449 == var5.field2449 && var5.field2437 < 0 && var4 != var5) {
                var4.field2437 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("el.w(IIIB)V")
    public void method2812(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("el.s(III)V")
    public void method2801(int arg0, int arg1) {
    }

    @ObfuscatedName("el.e(III)V")
    public void method2783(int arg0, int arg1) {
        this.field2370[arg0] = arg1;
    }

    @ObfuscatedName("el.b(II)V")
    public void method2784(int arg0) {
        for (class145 var2 = (class145) this.field2368.field2405.method3334(); var2 != null; var2 = (class145) this.field2368.field2405.method3355()) {
            if (arg0 < 0 || var2.field2449 == arg0) {
                if (var2.field2441 != null) {
                    var2.field2441.method985(Statics.field1112 / 100);
                    if (var2.field2441.method1042()) {
                        this.field2368.field2406.method1134(var2.field2441);
                    }
                    var2.method2930();
                }
                if (var2.field2437 < 0) {
                    this.field2380[var2.field2449][var2.field2428] = null;
                }
                var2.method3360();
            }
        }
    }

    @ObfuscatedName("el.j(II)V")
    public void method2850(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2850(var2);
            }
            return;
        }
        this.field2364[arg0] = 12800;
        this.field2365[arg0] = 8192;
        this.field2366[arg0] = 16383;
        this.field2370[arg0] = 8192;
        this.field2371[arg0] = 0;
        this.field2372[arg0] = 8192;
        this.method2788(arg0);
        this.method2789(arg0);
        this.field2381[arg0] = 0;
        this.field2375[arg0] = 32767;
        this.field2367[arg0] = 256;
        this.field2384[arg0] = 0;
        this.method2822(arg0, 8192);
    }

    @ObfuscatedName("el.h(II)V")
    public void method2786(int arg0) {
        for (class145 var2 = (class145) this.field2368.field2405.method3334(); var2 != null; var2 = (class145) this.field2368.field2405.method3355()) {
            if ((arg0 < 0 || var2.field2449 == arg0) && var2.field2437 < 0) {
                this.field2380[var2.field2449][var2.field2428] = null;
                var2.field2437 = 0;
            }
        }
    }

    @ObfuscatedName("el.m(B)V")
    public void method2767() {
        this.method2784(-1);
        this.method2850(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2376[var1] = this.field2361[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2369[var2] = this.field2361[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("el.ay(II)V")
    public void method2788(int arg0) {
        if ((this.field2381[arg0] & 0x2) == 0) {
            return;
        }
        for (class145 var2 = (class145) this.field2368.field2405.method3334(); var2 != null; var2 = (class145) this.field2368.field2405.method3355()) {
            if (var2.field2449 == arg0 && this.field2380[arg0][var2.field2428] == null && var2.field2437 < 0) {
                var2.field2437 = 0;
            }
        }
    }

    @ObfuscatedName("el.ae(IB)V")
    public void method2789(int arg0) {
        if ((this.field2381[arg0] & 0x4) == 0) {
            return;
        }
        for (class145 var2 = (class145) this.field2368.field2405.method3334(); var2 != null; var2 = (class145) this.field2368.field2405.method3355()) {
            if (var2.field2449 == arg0) {
                var2.field2444 = 0;
            }
        }
    }

    @ObfuscatedName("el.af(II)V")
    public void method2790(int arg0) {
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
                this.method2802(var6, var7, var8);
            } else {
                this.method2779(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2812(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2369[var12] = (var14 << 14) + (this.field2369[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2369[var12] = (var14 << 7) + (this.field2369[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2371[var12] = (var14 << 7) + (this.field2371[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2371[var12] = (this.field2371[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2372[var12] = (var14 << 7) + (this.field2372[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2372[var12] = (this.field2372[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2364[var12] = (var14 << 7) + (this.field2364[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2364[var12] = (this.field2364[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2365[var12] = (var14 << 7) + (this.field2365[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2365[var12] = (this.field2365[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2366[var12] = (var14 << 7) + (this.field2366[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2366[var12] = (this.field2366[var12] & 0xFFFFFF80) + var14;
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
                    this.method2788(var12);
                    this.field2381[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2375[var12] = (var14 << 7) + (this.field2375[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2375[var12] = (this.field2375[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2375[var12] = (var14 << 7) + (this.field2375[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2375[var12] = (this.field2375[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2784(var12);
            }
            if (var13 == 121) {
                this.method2850(var12);
            }
            if (var13 == 123) {
                this.method2786(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2375[var12];
                if (var15 == 16384) {
                    this.field2367[var12] = (var14 << 7) + (this.field2367[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2375[var12];
                if (var16 == 16384) {
                    this.field2367[var12] = (this.field2367[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2384[var12] = (var14 << 7) + (this.field2384[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2384[var12] = (this.field2384[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2381[var12] |= 0x4;
                } else {
                    this.method2789(var12);
                    this.field2381[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2822(var12, (var14 << 7) + (this.field2390[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2822(var12, (this.field2390[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2794(var17, this.field2369[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2801(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method2783(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2767();
            }
        }
    }

    @ObfuscatedName("el.ao(IIB)V")
    public void method2822(int arg0, int arg1) {
        this.field2390[arg0] = arg1;
        this.field2392[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("el.ad(Lev;B)I")
    public int method2791(class145 arg0) {
        int var2 = (arg0.field2433 * arg0.field2432 >> 12) + arg0.field2435;
        int var3 = ((this.field2370[arg0.field2449] - 8192) * this.field2367[arg0.field2449] >> 12) + var2;
        class142 var4 = arg0.field2426;
        if (var4.field2400 > 0 && (var4.field2399 > 0 || this.field2371[arg0.field2449] > 0)) {
            int var5 = var4.field2399 << 2;
            int var6 = var4.field2401 << 1;
            if (arg0.field2439 < var6) {
                var5 = arg0.field2439 * var5 / var6;
            }
            int var7 = (this.field2371[arg0.field2449] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2440 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2443.field1241 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1112 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("el.aj(Lev;I)I")
    public int method2792(class145 arg0) {
        class142 var2 = arg0.field2426;
        int var3 = this.field2366[arg0.field2449] * this.field2364[arg0.field2449] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2429 * var4 + 16384 >> 15;
        int var6 = this.field2362 * var5 + 128 >> 8;
        if (var2.field2395 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2434 * 1.953125E-5D * (double) var2.field2395) + 0.5D);
        }
        if (var2.field2398 != null) {
            int var7 = arg0.field2431;
            int var8 = var2.field2398[arg0.field2438 + 1];
            if (arg0.field2438 < var2.field2398.length - 2) {
                int var9 = (var2.field2398[arg0.field2438] & 0xFF) << 8;
                int var10 = (var2.field2398[arg0.field2438 + 2] & 0xFF) << 8;
                var8 += (var2.field2398[arg0.field2438 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2437 > 0 && var2.field2394 != null) {
            int var11 = arg0.field2437;
            int var12 = var2.field2394[arg0.field2445 + 1];
            if (arg0.field2445 < var2.field2394.length - 2) {
                int var13 = (var2.field2394[arg0.field2445] & 0xFF) << 8;
                int var14 = (var2.field2394[arg0.field2445 + 2] & 0xFF) << 8;
                var12 += (var2.field2394[arg0.field2445 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("el.ah(Lev;B)I")
    public int method2793(class145 arg0) {
        int var2 = this.field2365[arg0.field2449];
        return var2 < 8192 ? arg0.field2430 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2430) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("el.y()Law;")
    public synchronized class48 method990() {
        return this.field2368;
    }

    @ObfuscatedName("el.t()Law;")
    public synchronized class48 method989() {
        return null;
    }

    @ObfuscatedName("el.k()I")
    public synchronized int method1046() {
        return 0;
    }

    @ObfuscatedName("el.z([III)V")
    public synchronized void method1044(int[] arg0, int arg1, int arg2) {
        if (this.field2382.method2895()) {
            int var4 = this.field2377 * this.field2382.field2419 / Statics.field1112;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2386;
                if (this.field2387 - var5 >= 0L) {
                    this.field2386 = var5;
                    break;
                }
                int var7 = (int) ((this.field2387 - this.field2386 + (long) var4 - 1L) / (long) var4);
                this.field2386 += (long) var4 * (long) var7;
                this.field2368.method1044(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2795();
            } while (this.field2382.method2895());
        }
        this.field2368.method1044(arg0, arg1, arg2);
    }

    @ObfuscatedName("el.at(I)V")
    public synchronized void method988(int arg0) {
        if (this.field2382.method2895()) {
            int var2 = this.field2377 * this.field2382.field2419 / Statics.field1112;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2386;
                if (this.field2387 - var3 >= 0L) {
                    this.field2386 = var3;
                    break;
                }
                int var5 = (int) ((this.field2387 - this.field2386 + (long) var2 - 1L) / (long) var2);
                this.field2386 += (long) var2 * (long) var5;
                this.field2368.method988(var5);
                arg0 -= var5;
                this.method2795();
            } while (this.field2382.method2895());
        }
        this.field2368.method988(arg0);
    }

    @ObfuscatedName("el.aq(I)V")
    public void method2795() {
        int var1 = this.field2378;
        int var2 = this.field2385;
        long var3 = this.field2387;
        while (this.field2385 == var2) {
            while (this.field2382.field2415[var1] == var2) {
                this.field2382.method2880(var1);
                int var5 = this.field2382.method2884(var1);
                if (var5 == 1) {
                    this.field2382.method2882();
                    this.field2382.method2922(var1);
                    if (this.field2382.method2889()) {
                        if (!this.field2383 || var2 == 0) {
                            this.method2767();
                            this.field2382.method2877();
                            return;
                        }
                        this.field2382.method2890(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2790(var5);
                }
                this.field2382.method2883(var1);
                this.field2382.method2922(var1);
            }
            var1 = this.field2382.method2888();
            var2 = this.field2382.field2415[var1];
            var3 = this.field2382.method2887(var2);
        }
        this.field2378 = var1;
        this.field2385 = var2;
        this.field2387 = var3;
    }

    @ObfuscatedName("el.ar(Lev;B)Z")
    public boolean method2796(class145 arg0) {
        if (arg0.field2441 != null) {
            return false;
        }
        if (arg0.field2437 >= 0) {
            arg0.method3360();
            if (arg0.field2427 > 0 && this.field2374[arg0.field2449][arg0.field2427] == arg0) {
                this.field2374[arg0.field2449][arg0.field2427] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("el.aa(Lev;[IIII)Z")
    public boolean method2797(class145 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2442 = Statics.field1112 / 100;
        if (arg0.field2437 >= 0 && arg0.field2441 == null || arg0.field2441.method1057()) {
            arg0.method2930();
            arg0.method3360();
            if (arg0.field2427 > 0 && this.field2374[arg0.field2449][arg0.field2427] == arg0) {
                this.field2374[arg0.field2449][arg0.field2427] = null;
            }
            return true;
        }
        int var5 = arg0.field2433;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2372[arg0.field2449] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2433 = var6;
        }
        arg0.field2441.method986(this.method2791(arg0));
        class142 var7 = arg0.field2426;
        boolean var8 = false;
        arg0.field2439++;
        arg0.field2440 += var7.field2400;
        double var9 = (double) ((arg0.field2428 - 60 << 8) + (arg0.field2433 * arg0.field2432 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2395 > 0) {
            if (var7.field2402 > 0) {
                arg0.field2434 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2402 * var9) + 0.5D);
            } else {
                arg0.field2434 += 128;
            }
        }
        if (var7.field2398 != null) {
            if (var7.field2396 > 0) {
                arg0.field2431 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2396 * var9) + 0.5D);
            } else {
                arg0.field2431 += 128;
            }
            while (arg0.field2438 < var7.field2398.length - 2 && arg0.field2431 > (var7.field2398[arg0.field2438 + 2] & 0xFF) << 8) {
                arg0.field2438 += 2;
            }
            if (arg0.field2438 == var7.field2398.length - 2 && var7.field2398[arg0.field2438 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2437 >= 0 && var7.field2394 != null && (this.field2381[arg0.field2449] & 0x1) == 0 && (arg0.field2427 < 0 || this.field2374[arg0.field2449][arg0.field2427] != arg0)) {
            if (var7.field2397 > 0) {
                arg0.field2437 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2397 * var9) + 0.5D);
            } else {
                arg0.field2437 += 128;
            }
            while (arg0.field2445 < var7.field2394.length - 2 && arg0.field2437 > (var7.field2394[arg0.field2445 + 2] & 0xFF) << 8) {
                arg0.field2445 += 2;
            }
            if (arg0.field2445 == var7.field2394.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2441.method984(arg0.field2442, this.method2792(arg0), this.method2793(arg0));
            return false;
        }
        arg0.field2441.method985(arg0.field2442);
        if (arg1 == null) {
            arg0.field2441.method988(arg3);
        } else {
            arg0.field2441.method1044(arg1, arg2, arg3);
        }
        if (arg0.field2441.method1042()) {
            this.field2368.field2406.method1134(arg0.field2441);
        }
        arg0.method2930();
        if (arg0.field2437 >= 0) {
            arg0.method3360();
            if (arg0.field2427 > 0 && this.field2374[arg0.field2449][arg0.field2427] == arg0) {
                this.field2374[arg0.field2449][arg0.field2427] = null;
            }
        }
        return true;
    }
}
