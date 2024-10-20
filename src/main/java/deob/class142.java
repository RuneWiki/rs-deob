package deob;

@ObfuscatedName("ej")
public class class142 extends class48 {

    @ObfuscatedName("ej.c")
    public class175 field2399 = new class175(128);

    @ObfuscatedName("ej.q")
    public int field2417 = 256;

    @ObfuscatedName("ej.y")
    public int field2397 = 1000000;

    @ObfuscatedName("ej.v")
    public int[] field2398 = new int[16];

    @ObfuscatedName("ej.g")
    public int[] field2403 = new int[16];

    @ObfuscatedName("ej.x")
    public int[] field2413 = new int[16];

    @ObfuscatedName("ej.u")
    public int[] field2401 = new int[16];

    @ObfuscatedName("ej.l")
    public int[] field2402 = new int[16];

    @ObfuscatedName("ej.a")
    public int[] field2406 = new int[16];

    @ObfuscatedName("ej.h")
    public int[] field2404 = new int[16];

    @ObfuscatedName("ej.t")
    public int[] field2405 = new int[16];

    @ObfuscatedName("ej.m")
    public int[] field2400 = new int[16];

    @ObfuscatedName("ej.o")
    public int[] field2395 = new int[16];

    @ObfuscatedName("ej.r")
    public int[] field2396 = new int[16];

    @ObfuscatedName("ej.k")
    public int[] field2409 = new int[16];

    @ObfuscatedName("ej.w")
    public int[] field2410 = new int[16];

    @ObfuscatedName("ej.e")
    public int[] field2411 = new int[16];

    @ObfuscatedName("ej.p")
    public int[] field2412 = new int[16];

    @ObfuscatedName("ej.i")
    public class146[][] field2408 = new class146[16][128];

    @ObfuscatedName("ej.ap")
    public class146[][] field2414 = new class146[16][128];

    @ObfuscatedName("ej.as")
    public class145 field2415 = new class145();

    @ObfuscatedName("ej.ak")
    public boolean field2416;

    @ObfuscatedName("ej.af")
    public int field2407;

    @ObfuscatedName("ej.ag")
    public int field2418;

    @ObfuscatedName("ej.aj")
    public long field2419;

    @ObfuscatedName("ej.ac")
    public long field2420;

    @ObfuscatedName("ej.an")
    public class144 field2421 = new class144(this);

    public class142() {
        this.method2658();
    }

    @ObfuscatedName("ej.c(IB)V")
    public synchronized void method2736(int arg0) {
        this.field2417 = arg0;
    }

    @ObfuscatedName("ej.q(I)I")
    public int method2710() {
        return this.field2417;
    }

    @ObfuscatedName("ej.v(Les;Ley;Lbm;IB)Z")
    public synchronized boolean method2641(class140 arg0, class153 arg1, class58 arg2, int arg3) {
        arg0.method2627();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class176 var7 = (class176) arg0.field2384.method3155(); var7 != null; var7 = (class176) arg0.field2384.method3139()) {
            int var8 = (int) var7.field2824;
            class141 var9 = (class141) this.field2399.method3138((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method2936(var8);
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
                this.field2399.method3136(var11, (long) var8);
            }
            if (!var9.method2630(arg2, var7.field2819, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2620();
        }
        return var5;
    }

    @ObfuscatedName("ej.g(B)V")
    public synchronized void method2674() {
        for (class141 var1 = (class141) this.field2399.method3155(); var1 != null; var1 = (class141) this.field2399.method3139()) {
            var1.method2631();
        }
    }

    @ObfuscatedName("ej.x(B)V")
    public synchronized void method2716() {
        for (class141 var1 = (class141) this.field2399.method3155(); var1 != null; var1 = (class141) this.field2399.method3139()) {
            var1.method3196();
        }
    }

    @ObfuscatedName("ej.u(Les;ZI)V")
    public synchronized void method2726(class140 arg0, boolean arg1) {
        this.method2686();
        this.field2415.method2781(arg0.field2383);
        this.field2416 = arg1;
        this.field2419 = 0L;
        int var3 = this.field2415.method2760();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2415.method2767(var4);
            this.field2415.method2764(var4);
            this.field2415.method2762(var4);
        }
        this.field2407 = this.field2415.method2799();
        this.field2418 = this.field2415.field2445[this.field2407];
        this.field2420 = this.field2415.method2768(this.field2418);
    }

    @ObfuscatedName("ej.l(B)V")
    public synchronized void method2686() {
        this.field2415.method2758();
        this.method2658();
    }

    @ObfuscatedName("ej.a(I)Z")
    public synchronized boolean method2646() {
        return this.field2415.method2759();
    }

    @ObfuscatedName("ej.h(III)V")
    public synchronized void method2647(int arg0, int arg1) {
        this.method2648(arg0, arg1);
    }

    @ObfuscatedName("ej.t(III)V")
    public void method2648(int arg0, int arg1) {
        this.field2401[arg0] = arg1;
        this.field2406[arg0] = arg1 & 0xFFFFFF80;
        this.method2644(arg0, arg1);
    }

    @ObfuscatedName("ej.m(III)V")
    public void method2644(int arg0, int arg1) {
        if (this.field2402[arg0] != arg1) {
            this.field2402[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2414[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ej.s(IIII)V")
    public void method2742(int arg0, int arg1, int arg2) {
        this.method2688(arg0, arg1, 64);
        if ((this.field2395[arg0] & 0x2) != 0) {
            for (class146 var4 = (class146) this.field2421.field2435.method3178(); var4 != null; var4 = (class146) this.field2421.field2435.method3166()) {
                if (var4.field2462 == arg0 && var4.field2457 < 0) {
                    this.field2408[arg0][var4.field2460] = null;
                    this.field2408[arg0][arg1] = var4;
                    int var5 = (var4.field2469 * var4.field2465 >> 12) + var4.field2463;
                    var4.field2463 += arg1 - var4.field2460 << 8;
                    var4.field2469 = var5 - var4.field2463;
                    var4.field2465 = 4096;
                    var4.field2460 = arg1;
                    return;
                }
            }
        }
        class141 var6 = (class141) this.field2399.method3138((long) this.field2402[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2386[arg1];
        if (var7 == null) {
            return;
        }
        class146 var8 = new class146();
        var8.field2462 = arg0;
        var8.field2456 = var6;
        var8.field2466 = var7;
        var8.field2458 = var6.field2391[arg1];
        var8.field2459 = var6.field2388[arg1];
        var8.field2460 = arg1;
        var8.field2461 = var6.field2385 * arg2 * arg2 * var6.field2390[arg1] + 1024 >> 11;
        var8.field2455 = var6.field2389[arg1] & 0xFF;
        var8.field2463 = (arg1 << 8) - (var6.field2387[arg1] & 0x7FFF);
        var8.field2473 = 0;
        var8.field2467 = 0;
        var8.field2468 = 0;
        var8.field2457 = -1;
        var8.field2470 = 0;
        if (this.field2410[arg0] == 0) {
            var8.field2464 = class45.method915(var7, this.method2665(var8), this.method2664(var8), this.method2745(var8));
        } else {
            var8.field2464 = class45.method915(var7, this.method2665(var8), 0, this.method2745(var8));
            this.method2672(var8, var6.field2387[arg1] < 0);
        }
        if (var6.field2387[arg1] < 0) {
            var8.field2464.method917(-1);
        }
        if (var8.field2459 >= 0) {
            class146 var9 = this.field2414[arg0][var8.field2459];
            if (var9 != null && var9.field2457 < 0) {
                this.field2408[arg0][var9.field2460] = null;
                var9.field2457 = 0;
            }
            this.field2414[arg0][var8.field2459] = var8;
        }
        this.field2421.field2435.method3158(var8);
        this.field2408[arg0][arg1] = var8;
    }

    @ObfuscatedName("ej.j(Leh;ZI)V")
    public void method2672(class146 arg0, boolean arg1) {
        int var3 = arg0.field2466.field1251.length;
        int var5;
        if (arg1 && arg0.field2466.field1254) {
            int var4 = var3 + var3 - arg0.field2466.field1252;
            var5 = (int) ((long) this.field2410[arg0.field2462] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2464.method924(true);
            }
        } else {
            var5 = (int) ((long) this.field2410[arg0.field2462] * (long) var3 >> 6);
        }
        arg0.field2464.method923(var5);
    }

    @ObfuscatedName("ej.b(IIII)V")
    public void method2688(int arg0, int arg1, int arg2) {
        class146 var4 = this.field2408[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2408[arg0][arg1] = null;
        if ((this.field2395[arg0] & 0x2) == 0) {
            var4.field2457 = 0;
            return;
        }
        for (class146 var5 = (class146) this.field2421.field2435.method3163(); var5 != null; var5 = (class146) this.field2421.field2435.method3165()) {
            if (var4.field2462 == var5.field2462 && var5.field2457 < 0 && var4 != var5) {
                var4.field2457 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ej.n(IIII)V")
    public void method2652(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ej.z(III)V")
    public void method2653(int arg0, int arg1) {
    }

    @ObfuscatedName("ej.d(III)V")
    public void method2654(int arg0, int arg1) {
        this.field2404[arg0] = arg1;
    }

    @ObfuscatedName("ej.f(II)V")
    public void method2655(int arg0) {
        for (class146 var2 = (class146) this.field2421.field2435.method3163(); var2 != null; var2 = (class146) this.field2421.field2435.method3165()) {
            if (arg0 < 0 || var2.field2462 == arg0) {
                if (var2.field2464 != null) {
                    var2.field2464.method928(Statics.field1118 / 100);
                    if (var2.field2464.method932()) {
                        this.field2421.field2434.method1057(var2.field2464);
                    }
                    var2.method2814();
                }
                if (var2.field2457 < 0) {
                    this.field2408[var2.field2462][var2.field2460] = null;
                }
                var2.method3196();
            }
        }
    }

    @ObfuscatedName("ej.o(II)V")
    public void method2708(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2708(var2);
            }
            return;
        }
        this.field2398[arg0] = 12800;
        this.field2403[arg0] = 8192;
        this.field2413[arg0] = 16383;
        this.field2404[arg0] = 8192;
        this.field2405[arg0] = 0;
        this.field2400[arg0] = 8192;
        this.method2690(arg0);
        this.method2660(arg0);
        this.field2395[arg0] = 0;
        this.field2396[arg0] = 32767;
        this.field2409[arg0] = 256;
        this.field2410[arg0] = 0;
        this.method2662(arg0, 8192);
    }

    @ObfuscatedName("ej.r(II)V")
    public void method2657(int arg0) {
        for (class146 var2 = (class146) this.field2421.field2435.method3163(); var2 != null; var2 = (class146) this.field2421.field2435.method3165()) {
            if ((arg0 < 0 || var2.field2462 == arg0) && var2.field2457 < 0) {
                this.field2408[var2.field2462][var2.field2460] = null;
                var2.field2457 = 0;
            }
        }
    }

    @ObfuscatedName("ej.k(B)V")
    public void method2658() {
        this.method2655(-1);
        this.method2708(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2402[var1] = this.field2401[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2406[var2] = this.field2401[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ej.as(II)V")
    public void method2690(int arg0) {
        if ((this.field2395[arg0] & 0x2) == 0) {
            return;
        }
        for (class146 var2 = (class146) this.field2421.field2435.method3163(); var2 != null; var2 = (class146) this.field2421.field2435.method3165()) {
            if (var2.field2462 == arg0 && this.field2408[arg0][var2.field2460] == null && var2.field2457 < 0) {
                var2.field2457 = 0;
            }
        }
    }

    @ObfuscatedName("ej.ak(II)V")
    public void method2660(int arg0) {
        if ((this.field2395[arg0] & 0x4) == 0) {
            return;
        }
        for (class146 var2 = (class146) this.field2421.field2435.method3163(); var2 != null; var2 = (class146) this.field2421.field2435.method3165()) {
            if (var2.field2462 == arg0) {
                var2.field2476 = 0;
            }
        }
    }

    @ObfuscatedName("ej.af(II)V")
    public void method2661(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2688(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2742(var6, var7, var8);
            } else {
                this.method2688(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2652(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2406[var12] = (var14 << 14) + (this.field2406[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2406[var12] = (var14 << 7) + (this.field2406[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2405[var12] = (var14 << 7) + (this.field2405[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2405[var12] = (this.field2405[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2400[var12] = (var14 << 7) + (this.field2400[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2400[var12] = (this.field2400[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2398[var12] = (var14 << 7) + (this.field2398[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2398[var12] = (this.field2398[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2403[var12] = (var14 << 7) + (this.field2403[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2403[var12] = (this.field2403[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2413[var12] = (var14 << 7) + (this.field2413[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2413[var12] = (this.field2413[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2395[var12] |= 0x1;
                } else {
                    this.field2395[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2395[var12] |= 0x2;
                } else {
                    this.method2690(var12);
                    this.field2395[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2396[var12] = (var14 << 7) + (this.field2396[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2396[var12] = (this.field2396[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2396[var12] = (var14 << 7) + (this.field2396[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2396[var12] = (this.field2396[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2655(var12);
            }
            if (var13 == 121) {
                this.method2708(var12);
            }
            if (var13 == 123) {
                this.method2657(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2396[var12];
                if (var15 == 16384) {
                    this.field2409[var12] = (var14 << 7) + (this.field2409[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2396[var12];
                if (var16 == 16384) {
                    this.field2409[var12] = (this.field2409[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2410[var12] = (var14 << 7) + (this.field2410[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2410[var12] = (this.field2410[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2395[var12] |= 0x4;
                } else {
                    this.method2660(var12);
                    this.field2395[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2662(var12, (var14 << 7) + (this.field2411[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2662(var12, (this.field2411[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2644(var17, this.field2406[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2653(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method2654(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2658();
            }
        }
    }

    @ObfuscatedName("ej.ag(III)V")
    public void method2662(int arg0, int arg1) {
        this.field2411[arg0] = arg1;
        this.field2412[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ej.aj(Leh;I)I")
    public int method2665(class146 arg0) {
        int var2 = (arg0.field2469 * arg0.field2465 >> 12) + arg0.field2463;
        int var3 = ((this.field2404[arg0.field2462] - 8192) * this.field2409[arg0.field2462] >> 12) + var2;
        class143 var4 = arg0.field2458;
        if (var4.field2430 > 0 && (var4.field2426 > 0 || this.field2405[arg0.field2462] > 0)) {
            int var5 = var4.field2426 << 2;
            int var6 = var4.field2431 << 1;
            if (arg0.field2471 < var6) {
                var5 = arg0.field2471 * var5 / var6;
            }
            int var7 = (this.field2405[arg0.field2462] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2472 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2466.field1250 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1118 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ej.ac(Leh;B)I")
    public int method2664(class146 arg0) {
        class143 var2 = arg0.field2458;
        int var3 = this.field2413[arg0.field2462] * this.field2398[arg0.field2462] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2461 * var4 + 16384 >> 15;
        int var6 = this.field2417 * var5 + 128 >> 8;
        if (var2.field2425 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2473 * 1.953125E-5D * (double) var2.field2425) + 0.5D);
        }
        if (var2.field2423 != null) {
            int var7 = arg0.field2467;
            int var8 = var2.field2423[arg0.field2468 + 1];
            if (arg0.field2468 < var2.field2423.length - 2) {
                int var9 = (var2.field2423[arg0.field2468] & 0xFF) << 8;
                int var10 = (var2.field2423[arg0.field2468 + 2] & 0xFF) << 8;
                var8 += (var2.field2423[arg0.field2468 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2457 > 0 && var2.field2427 != null) {
            int var11 = arg0.field2457;
            int var12 = var2.field2427[arg0.field2470 + 1];
            if (arg0.field2470 < var2.field2427.length - 2) {
                int var13 = (var2.field2427[arg0.field2470] & 0xFF) << 8;
                int var14 = (var2.field2427[arg0.field2470 + 2] & 0xFF) << 8;
                var12 += (var2.field2427[arg0.field2470 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ej.an(Leh;S)I")
    public int method2745(class146 arg0) {
        int var2 = this.field2403[arg0.field2462];
        return var2 < 8192 ? arg0.field2455 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2455) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ej.w()Lab;")
    public synchronized class48 method933() {
        return this.field2421;
    }

    @ObfuscatedName("ej.e()Lab;")
    public synchronized class48 method974() {
        return null;
    }

    @ObfuscatedName("ej.p()I")
    public synchronized int method935() {
        return 0;
    }

    @ObfuscatedName("ej.i([III)V")
    public synchronized void method976(int[] arg0, int arg1, int arg2) {
        if (this.field2415.method2759()) {
            int var4 = this.field2397 * this.field2415.field2449 / Statics.field1118;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2419;
                if (this.field2420 - var5 >= 0L) {
                    this.field2419 = var5;
                    break;
                }
                int var7 = (int) ((this.field2420 - this.field2419 + (long) var4 - 1L) / (long) var4);
                this.field2419 += (long) var4 * (long) var7;
                this.field2421.method976(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2667();
            } while (this.field2415.method2759());
        }
        this.field2421.method976(arg0, arg1, arg2);
    }

    @ObfuscatedName("ej.ap(I)V")
    public synchronized void method937(int arg0) {
        if (this.field2415.method2759()) {
            int var2 = this.field2397 * this.field2415.field2449 / Statics.field1118;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2419;
                if (this.field2420 - var3 >= 0L) {
                    this.field2419 = var3;
                    break;
                }
                int var5 = (int) ((this.field2420 - this.field2419 + (long) var2 - 1L) / (long) var2);
                this.field2419 += (long) var2 * (long) var5;
                this.field2421.method937(var5);
                arg0 -= var5;
                this.method2667();
            } while (this.field2415.method2759());
        }
        this.field2421.method937(arg0);
    }

    @ObfuscatedName("ej.ad(I)V")
    public void method2667() {
        int var1 = this.field2407;
        int var2 = this.field2418;
        long var3 = this.field2420;
        while (this.field2418 == var2) {
            while (this.field2415.field2445[var1] == var2) {
                this.field2415.method2767(var1);
                int var5 = this.field2415.method2773(var1);
                if (var5 == 1) {
                    this.field2415.method2756();
                    this.field2415.method2762(var1);
                    if (this.field2415.method2769()) {
                        if (!this.field2416 || var2 == 0) {
                            this.method2658();
                            this.field2415.method2758();
                            return;
                        }
                        this.field2415.method2757(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2661(var5);
                }
                this.field2415.method2764(var1);
                this.field2415.method2762(var1);
            }
            var1 = this.field2415.method2799();
            var2 = this.field2415.field2445[var1];
            var3 = this.field2415.method2768(var2);
        }
        this.field2407 = var1;
        this.field2418 = var2;
        this.field2420 = var3;
    }

    @ObfuscatedName("ej.ai(Leh;I)Z")
    public boolean method2642(class146 arg0) {
        if (arg0.field2464 != null) {
            return false;
        }
        if (arg0.field2457 >= 0) {
            arg0.method3196();
            if (arg0.field2459 > 0 && this.field2414[arg0.field2462][arg0.field2459] == arg0) {
                this.field2414[arg0.field2462][arg0.field2459] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ej.ae(Leh;[IIII)Z")
    public boolean method2669(class146 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2474 = Statics.field1118 / 100;
        if (arg0.field2457 >= 0 && arg0.field2464 == null || arg0.field2464.method946()) {
            arg0.method2814();
            arg0.method3196();
            if (arg0.field2459 > 0 && this.field2414[arg0.field2462][arg0.field2459] == arg0) {
                this.field2414[arg0.field2462][arg0.field2459] = null;
            }
            return true;
        }
        int var5 = arg0.field2465;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2400[arg0.field2462] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2465 = var6;
        }
        arg0.field2464.method927(this.method2665(arg0));
        class143 var7 = arg0.field2458;
        boolean var8 = false;
        arg0.field2471++;
        arg0.field2472 += var7.field2430;
        double var9 = (double) ((arg0.field2460 - 60 << 8) + (arg0.field2469 * arg0.field2465 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2425 > 0) {
            if (var7.field2428 > 0) {
                arg0.field2473 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2428 * var9) + 0.5D);
            } else {
                arg0.field2473 += 128;
            }
        }
        if (var7.field2423 != null) {
            if (var7.field2429 > 0) {
                arg0.field2467 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2429 * var9) + 0.5D);
            } else {
                arg0.field2467 += 128;
            }
            while (arg0.field2468 < var7.field2423.length - 2 && arg0.field2467 > (var7.field2423[arg0.field2468 + 2] & 0xFF) << 8) {
                arg0.field2468 += 2;
            }
            if (arg0.field2468 == var7.field2423.length - 2 && var7.field2423[arg0.field2468 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2457 >= 0 && var7.field2427 != null && (this.field2395[arg0.field2462] & 0x1) == 0 && (arg0.field2459 < 0 || this.field2414[arg0.field2462][arg0.field2459] != arg0)) {
            if (var7.field2424 > 0) {
                arg0.field2457 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2424 * var9) + 0.5D);
            } else {
                arg0.field2457 += 128;
            }
            while (arg0.field2470 < var7.field2427.length - 2 && arg0.field2457 > (var7.field2427[arg0.field2470 + 2] & 0xFF) << 8) {
                arg0.field2470 += 2;
            }
            if (arg0.field2470 == var7.field2427.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2464.method934(arg0.field2474, this.method2664(arg0), this.method2745(arg0));
            return false;
        }
        arg0.field2464.method928(arg0.field2474);
        if (arg1 == null) {
            arg0.field2464.method937(arg3);
        } else {
            arg0.field2464.method976(arg1, arg2, arg3);
        }
        if (arg0.field2464.method932()) {
            this.field2421.field2434.method1057(arg0.field2464);
        }
        arg0.method2814();
        if (arg0.field2457 >= 0) {
            arg0.method3196();
            if (arg0.field2459 > 0 && this.field2414[arg0.field2462][arg0.field2459] == arg0) {
                this.field2414[arg0.field2462][arg0.field2459] = null;
            }
        }
        return true;
    }
}
