package deob;

@ObfuscatedName("es")
public class class142 extends class48 {

    @ObfuscatedName("es.b")
    public class175 field2395 = new class175(128);

    @ObfuscatedName("es.e")
    public int field2372 = 256;

    @ObfuscatedName("es.g")
    public int field2373 = 1000000;

    @ObfuscatedName("es.o")
    public int[] field2374 = new int[16];

    @ObfuscatedName("es.a")
    public int[] field2380 = new int[16];

    @ObfuscatedName("es.h")
    public int[] field2396 = new int[16];

    @ObfuscatedName("es.j")
    public int[] field2371 = new int[16];

    @ObfuscatedName("es.f")
    public int[] field2390 = new int[16];

    @ObfuscatedName("es.q")
    public int[] field2379 = new int[16];

    @ObfuscatedName("es.l")
    public int[] field2377 = new int[16];

    @ObfuscatedName("es.d")
    public int[] field2381 = new int[16];

    @ObfuscatedName("es.z")
    public int[] field2382 = new int[16];

    @ObfuscatedName("es.k")
    public int[] field2384 = new int[16];

    @ObfuscatedName("es.p")
    public int[] field2378 = new int[16];

    @ObfuscatedName("es.s")
    public int[] field2386 = new int[16];

    @ObfuscatedName("es.m")
    public int[] field2387 = new int[16];

    @ObfuscatedName("es.c")
    public int[] field2388 = new int[16];

    @ObfuscatedName("es.i")
    public int[] field2389 = new int[16];

    @ObfuscatedName("es.u")
    public class146[][] field2393 = new class146[16][128];

    @ObfuscatedName("es.at")
    public class146[][] field2391 = new class146[16][128];

    @ObfuscatedName("es.as")
    public class145 field2392 = new class145();

    @ObfuscatedName("es.ax")
    public boolean field2385;

    @ObfuscatedName("es.ao")
    public int field2394;

    @ObfuscatedName("es.aq")
    public int field2398;

    @ObfuscatedName("es.am")
    public long field2375;

    @ObfuscatedName("es.al")
    public long field2397;

    @ObfuscatedName("es.ab")
    public class144 field2376 = new class144(this);

    public class142() {
        this.method2800();
    }

    @ObfuscatedName("es.b(II)V")
    public synchronized void method2836(int arg0) {
        this.field2372 = arg0;
    }

    @ObfuscatedName("es.e(B)I")
    public int method2806() {
        return this.field2372;
    }

    @ObfuscatedName("es.o(Lel;Lej;Lbh;II)Z")
    public synchronized boolean method2740(class140 arg0, class153 arg1, class58 arg2, int arg3) {
        arg0.method2719();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class176 var7 = (class176) arg0.field2360.method3294(); var7 != null; var7 = (class176) arg0.field2360.method3302()) {
            int var8 = (int) var7.field2810;
            class141 var9 = (class141) this.field2395.method3291((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3037(var8);
                class141 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class141(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2395.method3292(var11, (long) var8);
            }
            if (!var9.method2728(arg2, var7.field2805, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2720();
        }
        return var5;
    }

    @ObfuscatedName("es.a(B)V")
    public synchronized void method2802() {
        for (class141 var1 = (class141) this.field2395.method3294(); var1 != null; var1 = (class141) this.field2395.method3302()) {
            var1.method2729();
        }
    }

    @ObfuscatedName("es.h(S)V")
    public synchronized void method2742() {
        for (class141 var1 = (class141) this.field2395.method3294(); var1 != null; var1 = (class141) this.field2395.method3302()) {
            var1.method3341();
        }
    }

    @ObfuscatedName("es.j(Lel;ZB)V")
    public synchronized void method2743(class140 arg0, boolean arg1) {
        this.method2744();
        this.field2392.method2863(arg0.field2359);
        this.field2385 = arg1;
        this.field2375 = 0L;
        int var3 = this.field2392.method2866();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2392.method2907(var4);
            this.field2392.method2889(var4);
            this.field2392.method2882(var4);
        }
        this.field2394 = this.field2392.method2888();
        this.field2398 = this.field2392.field2425[this.field2394];
        this.field2397 = this.field2392.method2867(this.field2398);
    }

    @ObfuscatedName("es.f(I)V")
    public synchronized void method2744() {
        this.field2392.method2906();
        this.method2800();
    }

    @ObfuscatedName("es.q(I)Z")
    public synchronized boolean method2818() {
        return this.field2392.method2865();
    }

    @ObfuscatedName("es.l(III)V")
    public synchronized void method2812(int arg0, int arg1) {
        this.method2747(arg0, arg1);
    }

    @ObfuscatedName("es.d(III)V")
    public void method2747(int arg0, int arg1) {
        this.field2371[arg0] = arg1;
        this.field2379[arg0] = arg1 & 0xFFFFFF80;
        this.method2748(arg0, arg1);
    }

    @ObfuscatedName("es.z(III)V")
    public void method2748(int arg0, int arg1) {
        if (this.field2390[arg0] != arg1) {
            this.field2390[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2391[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("es.n(IIII)V")
    public void method2749(int arg0, int arg1, int arg2) {
        this.method2751(arg0, arg1, 64);
        if ((this.field2384[arg0] & 0x2) != 0) {
            for (class146 var4 = (class146) this.field2376.field2415.method3307(); var4 != null; var4 = (class146) this.field2376.field2415.method3317()) {
                if (var4.field2454 == arg0 && var4.field2438 < 0) {
                    this.field2393[arg0][var4.field2457] = null;
                    this.field2393[arg0][arg1] = var4;
                    int var5 = (var4.field2444 * var4.field2440 >> 12) + var4.field2443;
                    var4.field2443 += arg1 - var4.field2457 << 8;
                    var4.field2444 = var5 - var4.field2443;
                    var4.field2440 = 4096;
                    var4.field2457 = arg1;
                    return;
                }
            }
        }
        class141 var6 = (class141) this.field2395.method3291((long) this.field2390[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2362[arg1];
        if (var7 == null) {
            return;
        }
        class146 var8 = new class146();
        var8.field2454 = arg0;
        var8.field2435 = var6;
        var8.field2437 = var7;
        var8.field2436 = var6.field2366[arg1];
        var8.field2439 = var6.field2363[arg1];
        var8.field2457 = arg1;
        var8.field2441 = var6.field2361 * arg2 * arg2 * var6.field2364[arg1] + 1024 >> 11;
        var8.field2442 = var6.field2365[arg1] & 0xFF;
        var8.field2443 = (arg1 << 8) - (var6.field2369[arg1] & 0x7FFF);
        var8.field2446 = 0;
        var8.field2447 = 0;
        var8.field2448 = 0;
        var8.field2438 = -1;
        var8.field2450 = 0;
        if (this.field2387[arg0] == 0) {
            var8.field2453 = class45.method1059(var7, this.method2817(var8), this.method2763(var8), this.method2764(var8));
        } else {
            var8.field2453 = class45.method1059(var7, this.method2817(var8), 0, this.method2764(var8));
            this.method2750(var8, var6.field2369[arg1] < 0);
        }
        if (var6.field2369[arg1] < 0) {
            var8.field2453.method1001(-1);
        }
        if (var8.field2439 >= 0) {
            class146 var9 = this.field2391[arg0][var8.field2439];
            if (var9 != null && var9.field2438 < 0) {
                this.field2393[arg0][var9.field2457] = null;
                var9.field2438 = 0;
            }
            this.field2391[arg0][var8.field2439] = var8;
        }
        this.field2376.field2415.method3318(var8);
        this.field2393[arg0][arg1] = var8;
    }

    @ObfuscatedName("es.t(Let;ZI)V")
    public void method2750(class146 arg0, boolean arg1) {
        int var3 = arg0.field2437.field1226.length;
        int var5;
        if (arg1 && arg0.field2437.field1229) {
            int var4 = var3 + var3 - arg0.field2437.field1225;
            var5 = (int) ((long) this.field2387[arg0.field2454] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2453.method933(true);
            }
        } else {
            var5 = (int) ((long) this.field2387[arg0.field2454] * (long) var3 >> 6);
        }
        arg0.field2453.method932(var5);
    }

    @ObfuscatedName("es.w(IIII)V")
    public void method2751(int arg0, int arg1, int arg2) {
        class146 var4 = this.field2393[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2393[arg0][arg1] = null;
        if ((this.field2384[arg0] & 0x2) == 0) {
            var4.field2438 = 0;
            return;
        }
        for (class146 var5 = (class146) this.field2376.field2415.method3314(); var5 != null; var5 = (class146) this.field2376.field2415.method3325()) {
            if (var4.field2454 == var5.field2454 && var5.field2438 < 0 && var4 != var5) {
                var4.field2438 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("es.r(IIIS)V")
    public void method2752(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("es.x(III)V")
    public void method2753(int arg0, int arg1) {
    }

    @ObfuscatedName("es.v(III)V")
    public void method2754(int arg0, int arg1) {
        this.field2377[arg0] = arg1;
    }

    @ObfuscatedName("es.y(IB)V")
    public void method2737(int arg0) {
        for (class146 var2 = (class146) this.field2376.field2415.method3314(); var2 != null; var2 = (class146) this.field2376.field2415.method3325()) {
            if (arg0 < 0 || var2.field2454 == arg0) {
                if (var2.field2453 != null) {
                    var2.field2453.method937(Statics.field1093 / 100);
                    if (var2.field2453.method941()) {
                        this.field2376.field2416.method1084(var2.field2453);
                    }
                    var2.method2913();
                }
                if (var2.field2438 < 0) {
                    this.field2393[var2.field2454][var2.field2457] = null;
                }
                var2.method3341();
            }
        }
    }

    @ObfuscatedName("es.k(IB)V")
    public void method2756(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2756(var2);
            }
            return;
        }
        this.field2374[arg0] = 12800;
        this.field2380[arg0] = 8192;
        this.field2396[arg0] = 16383;
        this.field2377[arg0] = 8192;
        this.field2381[arg0] = 0;
        this.field2382[arg0] = 8192;
        this.method2758(arg0);
        this.method2759(arg0);
        this.field2384[arg0] = 0;
        this.field2378[arg0] = 32767;
        this.field2386[arg0] = 256;
        this.field2387[arg0] = 0;
        this.method2745(arg0, 8192);
    }

    @ObfuscatedName("es.p(IB)V")
    public void method2838(int arg0) {
        for (class146 var2 = (class146) this.field2376.field2415.method3314(); var2 != null; var2 = (class146) this.field2376.field2415.method3325()) {
            if ((arg0 < 0 || var2.field2454 == arg0) && var2.field2438 < 0) {
                this.field2393[var2.field2454][var2.field2457] = null;
                var2.field2438 = 0;
            }
        }
    }

    @ObfuscatedName("es.s(B)V")
    public void method2800() {
        this.method2737(-1);
        this.method2756(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2390[var1] = this.field2371[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2379[var2] = this.field2371[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("es.as(IB)V")
    public void method2758(int arg0) {
        if ((this.field2384[arg0] & 0x2) == 0) {
            return;
        }
        for (class146 var2 = (class146) this.field2376.field2415.method3314(); var2 != null; var2 = (class146) this.field2376.field2415.method3325()) {
            if (var2.field2454 == arg0 && this.field2393[arg0][var2.field2457] == null && var2.field2438 < 0) {
                var2.field2438 = 0;
            }
        }
    }

    @ObfuscatedName("es.ax(IB)V")
    public void method2759(int arg0) {
        if ((this.field2384[arg0] & 0x4) == 0) {
            return;
        }
        for (class146 var2 = (class146) this.field2376.field2415.method3314(); var2 != null; var2 = (class146) this.field2376.field2415.method3325()) {
            if (var2.field2454 == arg0) {
                var2.field2455 = 0;
            }
        }
    }

    @ObfuscatedName("es.ao(IB)V")
    public void method2760(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2751(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2749(var6, var7, var8);
            } else {
                this.method2751(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2752(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2379[var12] = (var14 << 14) + (this.field2379[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2379[var12] = (var14 << 7) + (this.field2379[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2381[var12] = (var14 << 7) + (this.field2381[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2381[var12] = (this.field2381[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2382[var12] = (var14 << 7) + (this.field2382[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2382[var12] = (this.field2382[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2374[var12] = (var14 << 7) + (this.field2374[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2374[var12] = (this.field2374[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2380[var12] = (var14 << 7) + (this.field2380[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2380[var12] = (this.field2380[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2396[var12] = (var14 << 7) + (this.field2396[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2396[var12] = (this.field2396[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2384[var12] |= 0x1;
                } else {
                    this.field2384[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2384[var12] |= 0x2;
                } else {
                    this.method2758(var12);
                    this.field2384[var12] &= 0xFFFFFFFD;
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
                this.method2737(var12);
            }
            if (var13 == 121) {
                this.method2756(var12);
            }
            if (var13 == 123) {
                this.method2838(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2378[var12];
                if (var15 == 16384) {
                    this.field2386[var12] = (var14 << 7) + (this.field2386[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2378[var12];
                if (var16 == 16384) {
                    this.field2386[var12] = (this.field2386[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2387[var12] = (var14 << 7) + (this.field2387[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2387[var12] = (this.field2387[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2384[var12] |= 0x4;
                } else {
                    this.method2759(var12);
                    this.field2384[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2745(var12, (var14 << 7) + (this.field2388[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2745(var12, (this.field2388[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2748(var17, this.field2379[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2753(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method2754(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2800();
            }
        }
    }

    @ObfuscatedName("es.aq(III)V")
    public void method2745(int arg0, int arg1) {
        this.field2388[arg0] = arg1;
        this.field2389[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("es.am(Let;B)I")
    public int method2817(class146 arg0) {
        int var2 = (arg0.field2444 * arg0.field2440 >> 12) + arg0.field2443;
        int var3 = ((this.field2377[arg0.field2454] - 8192) * this.field2386[arg0.field2454] >> 12) + var2;
        class143 var4 = arg0.field2436;
        if (var4.field2408 > 0 && (var4.field2407 > 0 || this.field2381[arg0.field2454] > 0)) {
            int var5 = var4.field2407 << 2;
            int var6 = var4.field2410 << 1;
            if (arg0.field2451 < var6) {
                var5 = arg0.field2451 * var5 / var6;
            }
            int var7 = (this.field2381[arg0.field2454] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2452 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2437.field1227 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1093 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("es.al(Let;I)I")
    public int method2763(class146 arg0) {
        class143 var2 = arg0.field2436;
        int var3 = this.field2396[arg0.field2454] * this.field2374[arg0.field2454] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2441 * var4 + 16384 >> 15;
        int var6 = this.field2372 * var5 + 128 >> 8;
        if (var2.field2402 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2446 * 1.953125E-5D * (double) var2.field2402) + 0.5D);
        }
        if (var2.field2411 != null) {
            int var7 = arg0.field2447;
            int var8 = var2.field2411[arg0.field2448 + 1];
            if (arg0.field2448 < var2.field2411.length - 2) {
                int var9 = (var2.field2411[arg0.field2448] & 0xFF) << 8;
                int var10 = (var2.field2411[arg0.field2448 + 2] & 0xFF) << 8;
                var8 += (var2.field2411[arg0.field2448 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2438 > 0 && var2.field2403 != null) {
            int var11 = arg0.field2438;
            int var12 = var2.field2403[arg0.field2450 + 1];
            if (arg0.field2450 < var2.field2403.length - 2) {
                int var13 = (var2.field2403[arg0.field2450] & 0xFF) << 8;
                int var14 = (var2.field2403[arg0.field2450 + 2] & 0xFF) << 8;
                var12 += (var2.field2403[arg0.field2450 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("es.ab(Let;I)I")
    public int method2764(class146 arg0) {
        int var2 = this.field2380[arg0.field2454];
        return var2 < 8192 ? arg0.field2442 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2442) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("es.m()Lai;")
    public synchronized class48 method942() {
        return this.field2376;
    }

    @ObfuscatedName("es.c()Lai;")
    public synchronized class48 method943() {
        return null;
    }

    @ObfuscatedName("es.i()I")
    public synchronized int method957() {
        return 0;
    }

    @ObfuscatedName("es.u([III)V")
    public synchronized void method984(int[] arg0, int arg1, int arg2) {
        if (this.field2392.method2865()) {
            int var4 = this.field2373 * this.field2392.field2422 / Statics.field1093;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2375;
                if (this.field2397 - var5 >= 0L) {
                    this.field2375 = var5;
                    break;
                }
                int var7 = (int) ((this.field2397 - this.field2375 + (long) var4 - 1L) / (long) var4);
                this.field2375 += (long) var4 * (long) var7;
                this.field2376.method984(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2766();
            } while (this.field2392.method2865());
        }
        this.field2376.method984(arg0, arg1, arg2);
    }

    @ObfuscatedName("es.at(I)V")
    public synchronized void method945(int arg0) {
        if (this.field2392.method2865()) {
            int var2 = this.field2373 * this.field2392.field2422 / Statics.field1093;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2375;
                if (this.field2397 - var3 >= 0L) {
                    this.field2375 = var3;
                    break;
                }
                int var5 = (int) ((this.field2397 - this.field2375 + (long) var2 - 1L) / (long) var2);
                this.field2375 += (long) var2 * (long) var5;
                this.field2376.method945(var5);
                arg0 -= var5;
                this.method2766();
            } while (this.field2392.method2865());
        }
        this.field2376.method945(arg0);
    }

    @ObfuscatedName("es.aw(I)V")
    public void method2766() {
        int var1 = this.field2394;
        int var2 = this.field2398;
        long var3 = this.field2397;
        while (this.field2398 == var2) {
            while (this.field2392.field2425[var1] == var2) {
                this.field2392.method2907(var1);
                int var5 = this.field2392.method2871(var1);
                if (var5 == 1) {
                    this.field2392.method2869();
                    this.field2392.method2882(var1);
                    if (this.field2392.method2876()) {
                        if (!this.field2385 || var2 == 0) {
                            this.method2800();
                            this.field2392.method2906();
                            return;
                        }
                        this.field2392.method2877(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2760(var5);
                }
                this.field2392.method2889(var1);
                this.field2392.method2882(var1);
            }
            var1 = this.field2392.method2888();
            var2 = this.field2392.field2425[var1];
            var3 = this.field2392.method2867(var2);
        }
        this.field2394 = var1;
        this.field2398 = var2;
        this.field2397 = var3;
    }

    @ObfuscatedName("es.ah(Let;I)Z")
    public boolean method2767(class146 arg0) {
        if (arg0.field2453 != null) {
            return false;
        }
        if (arg0.field2438 >= 0) {
            arg0.method3341();
            if (arg0.field2439 > 0 && this.field2391[arg0.field2454][arg0.field2439] == arg0) {
                this.field2391[arg0.field2454][arg0.field2439] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("es.aa(Let;[IIIB)Z")
    public boolean method2807(class146 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2445 = Statics.field1093 / 100;
        if (arg0.field2438 >= 0 && arg0.field2453 == null || arg0.field2453.method940()) {
            arg0.method2913();
            arg0.method3341();
            if (arg0.field2439 > 0 && this.field2391[arg0.field2454][arg0.field2439] == arg0) {
                this.field2391[arg0.field2454][arg0.field2439] = null;
            }
            return true;
        }
        int var5 = arg0.field2440;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2382[arg0.field2454] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2440 = var6;
        }
        arg0.field2453.method938(this.method2817(arg0));
        class143 var7 = arg0.field2436;
        boolean var8 = false;
        arg0.field2451++;
        arg0.field2452 += var7.field2408;
        double var9 = (double) ((arg0.field2457 - 60 << 8) + (arg0.field2444 * arg0.field2440 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2402 > 0) {
            if (var7.field2404 > 0) {
                arg0.field2446 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2404 * var9) + 0.5D);
            } else {
                arg0.field2446 += 128;
            }
        }
        if (var7.field2411 != null) {
            if (var7.field2405 > 0) {
                arg0.field2447 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2405 * var9) + 0.5D);
            } else {
                arg0.field2447 += 128;
            }
            while (arg0.field2448 < var7.field2411.length - 2 && arg0.field2447 > (var7.field2411[arg0.field2448 + 2] & 0xFF) << 8) {
                arg0.field2448 += 2;
            }
            if (arg0.field2448 == var7.field2411.length - 2 && var7.field2411[arg0.field2448 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2438 >= 0 && var7.field2403 != null && (this.field2384[arg0.field2454] & 0x1) == 0 && (arg0.field2439 < 0 || this.field2391[arg0.field2454][arg0.field2439] != arg0)) {
            if (var7.field2406 > 0) {
                arg0.field2438 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2406 * var9) + 0.5D);
            } else {
                arg0.field2438 += 128;
            }
            while (arg0.field2450 < var7.field2403.length - 2 && arg0.field2438 > (var7.field2403[arg0.field2450 + 2] & 0xFF) << 8) {
                arg0.field2450 += 2;
            }
            if (arg0.field2450 == var7.field2403.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2453.method936(arg0.field2445, this.method2763(arg0), this.method2764(arg0));
            return false;
        }
        arg0.field2453.method937(arg0.field2445);
        if (arg1 == null) {
            arg0.field2453.method945(arg3);
        } else {
            arg0.field2453.method984(arg1, arg2, arg3);
        }
        if (arg0.field2453.method941()) {
            this.field2376.field2416.method1084(arg0.field2453);
        }
        arg0.method2913();
        if (arg0.field2438 >= 0) {
            arg0.method3341();
            if (arg0.field2439 > 0 && this.field2391[arg0.field2454][arg0.field2439] == arg0) {
                this.field2391[arg0.field2454][arg0.field2439] = null;
            }
        }
        return true;
    }
}
