package deob;

@ObfuscatedName("ep")
public class class144 extends class49 {

    @ObfuscatedName("ep.e")
    public class177 field2403 = new class177(128);

    @ObfuscatedName("ep.i")
    public int field2402 = 256;

    @ObfuscatedName("ep.k")
    public int field2401 = 1000000;

    @ObfuscatedName("ep.q")
    public int[] field2404 = new int[16];

    @ObfuscatedName("ep.j")
    public int[] field2405 = new int[16];

    @ObfuscatedName("ep.z")
    public int[] field2410 = new int[16];

    @ObfuscatedName("ep.m")
    public int[] field2407 = new int[16];

    @ObfuscatedName("ep.a")
    public int[] field2427 = new int[16];

    @ObfuscatedName("ep.d")
    public int[] field2409 = new int[16];

    @ObfuscatedName("ep.u")
    public int[] field2428 = new int[16];

    @ObfuscatedName("ep.p")
    public int[] field2411 = new int[16];

    @ObfuscatedName("ep.t")
    public int[] field2408 = new int[16];

    @ObfuscatedName("ep.s")
    public int[] field2414 = new int[16];

    @ObfuscatedName("ep.y")
    public int[] field2415 = new int[16];

    @ObfuscatedName("ep.r")
    public int[] field2416 = new int[16];

    @ObfuscatedName("ep.l")
    public int[] field2417 = new int[16];

    @ObfuscatedName("ep.n")
    public int[] field2418 = new int[16];

    @ObfuscatedName("ep.h")
    public int[] field2406 = new int[16];

    @ObfuscatedName("ep.v")
    public class148[][] field2420 = new class148[16][128];

    @ObfuscatedName("ep.ax")
    public class148[][] field2421 = new class148[16][128];

    @ObfuscatedName("ep.ao")
    public class147 field2422 = new class147();

    @ObfuscatedName("ep.al")
    public boolean field2424;

    @ObfuscatedName("ep.ap")
    public int field2412;

    @ObfuscatedName("ep.ak")
    public int field2425;

    @ObfuscatedName("ep.aw")
    public long field2426;

    @ObfuscatedName("ep.av")
    public long field2423;

    @ObfuscatedName("ep.ah")
    public class146 field2419 = new class146(this);

    public class144() {
        this.method2862();
    }

    @ObfuscatedName("ep.e(II)V")
    public synchronized void method2826(int arg0) {
        this.field2402 = arg0;
    }

    @ObfuscatedName("ep.i(I)I")
    public int method2775() {
        return this.field2402;
    }

    @ObfuscatedName("ep.q(Lev;Lea;Lbk;II)Z")
    public synchronized boolean method2776(class142 arg0, class155 arg1, class59 arg2, int arg3) {
        arg0.method2749();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class178 var7 = (class178) arg0.field2386.method3313(); var7 != null; var7 = (class178) arg0.field2386.method3323()) {
            int var8 = (int) var7.field2839;
            class143 var9 = (class143) this.field2403.method3314((long) var8);
            if (var9 == null) {
                var9 = class143.method1884(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2403.method3311(var9, (long) var8);
            }
            if (!var9.method2763(arg2, var7.field2834, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2753();
        }
        return var5;
    }

    @ObfuscatedName("ep.j(I)V")
    public synchronized void method2777() {
        for (class143 var1 = (class143) this.field2403.method3313(); var1 != null; var1 = (class143) this.field2403.method3323()) {
            var1.method2761();
        }
    }

    @ObfuscatedName("ep.z(I)V")
    public synchronized void method2778() {
        for (class143 var1 = (class143) this.field2403.method3313(); var1 != null; var1 = (class143) this.field2403.method3323()) {
            var1.method3366();
        }
    }

    @ObfuscatedName("ep.m(Lev;ZB)V")
    public synchronized void method2779(class142 arg0, boolean arg1) {
        this.method2797();
        this.field2422.method2903(arg0.field2387);
        this.field2424 = arg1;
        this.field2426 = 0L;
        int var3 = this.field2422.method2904();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2422.method2906(var4);
            this.field2422.method2909(var4);
            this.field2422.method2934(var4);
        }
        this.field2412 = this.field2422.method2914();
        this.field2425 = this.field2422.field2455[this.field2412];
        this.field2423 = this.field2422.method2913(this.field2425);
    }

    @ObfuscatedName("ep.w(B)V")
    public synchronized void method2797() {
        this.field2422.method2942();
        this.method2862();
    }

    @ObfuscatedName("ep.a(I)Z")
    public synchronized boolean method2781() {
        return this.field2422.method2905();
    }

    @ObfuscatedName("ep.d(III)V")
    public synchronized void method2782(int arg0, int arg1) {
        this.method2832(arg0, arg1);
    }

    @ObfuscatedName("ep.u(III)V")
    public void method2832(int arg0, int arg1) {
        this.field2407[arg0] = arg1;
        this.field2409[arg0] = arg1 & 0xFFFFFF80;
        this.method2784(arg0, arg1);
    }

    @ObfuscatedName("ep.p(IIB)V")
    public void method2784(int arg0, int arg1) {
        if (this.field2427[arg0] != arg1) {
            this.field2427[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2421[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ep.t(IIII)V")
    public void method2785(int arg0, int arg1, int arg2) {
        this.method2787(arg0, arg1, 64);
        if ((this.field2414[arg0] & 0x2) != 0) {
            for (class148 var4 = (class148) this.field2419.field2443.method3332(); var4 != null; var4 = (class148) this.field2419.field2443.method3356()) {
                if (var4.field2470 == arg0 && var4.field2479 < 0) {
                    this.field2420[arg0][var4.field2481] = null;
                    this.field2420[arg0][arg1] = var4;
                    int var5 = (var4.field2485 * var4.field2475 >> 12) + var4.field2473;
                    var4.field2473 += arg1 - var4.field2481 << 8;
                    var4.field2485 = var5 - var4.field2473;
                    var4.field2475 = 4096;
                    var4.field2481 = arg1;
                    return;
                }
            }
        }
        class143 var6 = (class143) this.field2403.method3314((long) this.field2427[arg0]);
        if (var6 == null) {
            return;
        }
        class64 var7 = var6.field2392[arg1];
        if (var7 == null) {
            return;
        }
        class148 var8 = new class148();
        var8.field2470 = arg0;
        var8.field2474 = var6;
        var8.field2480 = var7;
        var8.field2468 = var6.field2393[arg1];
        var8.field2469 = var6.field2394[arg1];
        var8.field2481 = arg1;
        var8.field2465 = var6.field2399 * arg2 * arg2 * var6.field2391[arg1] + 1024 >> 11;
        var8.field2472 = var6.field2389[arg1] & 0xFF;
        var8.field2473 = (arg1 << 8) - (var6.field2390[arg1] & 0x7FFF);
        var8.field2476 = 0;
        var8.field2477 = 0;
        var8.field2478 = 0;
        var8.field2479 = -1;
        var8.field2482 = 0;
        if (this.field2417[arg0] == 0) {
            var8.field2483 = class46.method1141(var7, this.method2833(var8), this.method2800(var8), this.method2801(var8));
        } else {
            var8.field2483 = class46.method1141(var7, this.method2833(var8), 0, this.method2801(var8));
            this.method2786(var8, var6.field2390[arg1] < 0);
        }
        if (var6.field2390[arg1] < 0) {
            var8.field2483.method996(-1);
        }
        if (var8.field2469 >= 0) {
            class148 var9 = this.field2421[arg0][var8.field2469];
            if (var9 != null && var9.field2479 < 0) {
                this.field2420[arg0][var9.field2481] = null;
                var9.field2479 = 0;
            }
            this.field2421[arg0][var8.field2469] = var8;
        }
        this.field2419.field2443.method3328(var8);
        this.field2420[arg0][arg1] = var8;
    }

    @ObfuscatedName("ep.g(Lei;ZS)V")
    public void method2786(class148 arg0, boolean arg1) {
        int var3 = arg0.field2480.field1256.length;
        int var5;
        if (arg1 && arg0.field2480.field1252) {
            int var4 = var3 + var3 - arg0.field2480.field1254;
            var5 = (int) ((long) this.field2417[arg0.field2470] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2483.method1003(true);
            }
        } else {
            var5 = (int) ((long) this.field2417[arg0.field2470] * (long) var3 >> 6);
        }
        arg0.field2483.method1113(var5);
    }

    @ObfuscatedName("ep.o(IIIB)V")
    public void method2787(int arg0, int arg1, int arg2) {
        class148 var4 = this.field2420[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2420[arg0][arg1] = null;
        if ((this.field2414[arg0] & 0x2) == 0) {
            var4.field2479 = 0;
            return;
        }
        for (class148 var5 = (class148) this.field2419.field2443.method3331(); var5 != null; var5 = (class148) this.field2419.field2443.method3333()) {
            if (var4.field2470 == var5.field2470 && var5.field2479 < 0 && var4 != var5) {
                var4.field2479 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ep.x(IIII)V")
    public void method2885(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ep.c(III)V")
    public void method2858(int arg0, int arg1) {
    }

    @ObfuscatedName("ep.b(III)V")
    public void method2790(int arg0, int arg1) {
        this.field2428[arg0] = arg1;
    }

    @ObfuscatedName("ep.f(II)V")
    public void method2791(int arg0) {
        for (class148 var2 = (class148) this.field2419.field2443.method3331(); var2 != null; var2 = (class148) this.field2419.field2443.method3333()) {
            if (arg0 < 0 || var2.field2470 == arg0) {
                if (var2.field2483 != null) {
                    var2.field2483.method1015(Statics.field1126 / 100);
                    if (var2.field2483.method1010()) {
                        this.field2419.field2449.method1148(var2.field2483);
                    }
                    var2.method2952();
                }
                if (var2.field2479 < 0) {
                    this.field2420[var2.field2470][var2.field2481] = null;
                }
                var2.method3366();
            }
        }
    }

    @ObfuscatedName("ep.s(IB)V")
    public void method2792(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2792(var2);
            }
            return;
        }
        this.field2404[arg0] = 12800;
        this.field2405[arg0] = 8192;
        this.field2410[arg0] = 16383;
        this.field2428[arg0] = 8192;
        this.field2411[arg0] = 0;
        this.field2408[arg0] = 8192;
        this.method2795(arg0);
        this.method2814(arg0);
        this.field2414[arg0] = 0;
        this.field2415[arg0] = 32767;
        this.field2416[arg0] = 256;
        this.field2417[arg0] = 0;
        this.method2798(arg0, 8192);
    }

    @ObfuscatedName("ep.y(IB)V")
    public void method2866(int arg0) {
        for (class148 var2 = (class148) this.field2419.field2443.method3331(); var2 != null; var2 = (class148) this.field2419.field2443.method3333()) {
            if ((arg0 < 0 || var2.field2470 == arg0) && var2.field2479 < 0) {
                this.field2420[var2.field2470][var2.field2481] = null;
                var2.field2479 = 0;
            }
        }
    }

    @ObfuscatedName("ep.r(I)V")
    public void method2862() {
        this.method2791(-1);
        this.method2792(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2427[var1] = this.field2407[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2409[var2] = this.field2407[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ep.ao(II)V")
    public void method2795(int arg0) {
        if ((this.field2414[arg0] & 0x2) == 0) {
            return;
        }
        for (class148 var2 = (class148) this.field2419.field2443.method3331(); var2 != null; var2 = (class148) this.field2419.field2443.method3333()) {
            if (var2.field2470 == arg0 && this.field2420[arg0][var2.field2481] == null && var2.field2479 < 0) {
                var2.field2479 = 0;
            }
        }
    }

    @ObfuscatedName("ep.al(II)V")
    public void method2814(int arg0) {
        if ((this.field2414[arg0] & 0x4) == 0) {
            return;
        }
        for (class148 var2 = (class148) this.field2419.field2443.method3331(); var2 != null; var2 = (class148) this.field2419.field2443.method3333()) {
            if (var2.field2470 == arg0) {
                var2.field2467 = 0;
            }
        }
    }

    @ObfuscatedName("ep.ap(II)V")
    public void method2812(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2787(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2785(var6, var7, var8);
            } else {
                this.method2787(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2885(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2409[var12] = (var14 << 14) + (this.field2409[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2409[var12] = (var14 << 7) + (this.field2409[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2411[var12] = (var14 << 7) + (this.field2411[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2411[var12] = (this.field2411[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2408[var12] = (var14 << 7) + (this.field2408[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2408[var12] = (this.field2408[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2404[var12] = (var14 << 7) + (this.field2404[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2404[var12] = (this.field2404[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2405[var12] = (var14 << 7) + (this.field2405[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2405[var12] = (this.field2405[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2410[var12] = (var14 << 7) + (this.field2410[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2410[var12] = (this.field2410[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2414[var12] |= 0x1;
                } else {
                    this.field2414[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2414[var12] |= 0x2;
                } else {
                    this.method2795(var12);
                    this.field2414[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2415[var12] = (var14 << 7) + (this.field2415[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2415[var12] = (this.field2415[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2415[var12] = (var14 << 7) + (this.field2415[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2415[var12] = (this.field2415[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2791(var12);
            }
            if (var13 == 121) {
                this.method2792(var12);
            }
            if (var13 == 123) {
                this.method2866(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2415[var12];
                if (var15 == 16384) {
                    this.field2416[var12] = (var14 << 7) + (this.field2416[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2415[var12];
                if (var16 == 16384) {
                    this.field2416[var12] = (this.field2416[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2417[var12] = (var14 << 7) + (this.field2417[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2417[var12] = (this.field2417[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2414[var12] |= 0x4;
                } else {
                    this.method2814(var12);
                    this.field2414[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2798(var12, (var14 << 7) + (this.field2418[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2798(var12, (this.field2418[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2784(var17, this.field2409[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2858(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method2790(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2862();
            }
        }
    }

    @ObfuscatedName("ep.ak(IIB)V")
    public void method2798(int arg0, int arg1) {
        this.field2418[arg0] = arg1;
        this.field2406[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ep.aw(Lei;B)I")
    public int method2833(class148 arg0) {
        int var2 = (arg0.field2485 * arg0.field2475 >> 12) + arg0.field2473;
        int var3 = ((this.field2428[arg0.field2470] - 8192) * this.field2416[arg0.field2470] >> 12) + var2;
        class145 var4 = arg0.field2468;
        if (var4.field2433 > 0 && (var4.field2435 > 0 || this.field2411[arg0.field2470] > 0)) {
            int var5 = var4.field2435 << 2;
            int var6 = var4.field2437 << 1;
            if (arg0.field2466 < var6) {
                var5 = arg0.field2466 * var5 / var6;
            }
            int var7 = (this.field2411[arg0.field2470] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2471 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2480.field1253 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1126 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ep.av(Lei;B)I")
    public int method2800(class148 arg0) {
        class145 var2 = arg0.field2468;
        int var3 = this.field2410[arg0.field2470] * this.field2404[arg0.field2470] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2465 * var4 + 16384 >> 15;
        int var6 = this.field2402 * var5 + 128 >> 8;
        if (var2.field2431 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2476 * 1.953125E-5D * (double) var2.field2431) + 0.5D);
        }
        if (var2.field2440 != null) {
            int var7 = arg0.field2477;
            int var8 = var2.field2440[arg0.field2478 + 1];
            if (arg0.field2478 < var2.field2440.length - 2) {
                int var9 = (var2.field2440[arg0.field2478] & 0xFF) << 8;
                int var10 = (var2.field2440[arg0.field2478 + 2] & 0xFF) << 8;
                var8 += (var2.field2440[arg0.field2478 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2479 > 0 && var2.field2430 != null) {
            int var11 = arg0.field2479;
            int var12 = var2.field2430[arg0.field2482 + 1];
            if (arg0.field2482 < var2.field2430.length - 2) {
                int var13 = (var2.field2430[arg0.field2482] & 0xFF) << 8;
                int var14 = (var2.field2430[arg0.field2482 + 2] & 0xFF) << 8;
                var12 += (var2.field2430[arg0.field2482 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ep.ah(Lei;B)I")
    public int method2801(class148 arg0) {
        int var2 = this.field2405[arg0.field2470];
        return var2 < 8192 ? arg0.field2472 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2472) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ep.l()Lac;")
    public synchronized class49 method1100() {
        return this.field2419;
    }

    @ObfuscatedName("ep.n()Lac;")
    public synchronized class49 method1012() {
        return null;
    }

    @ObfuscatedName("ep.h()I")
    public synchronized int method1006() {
        return 0;
    }

    @ObfuscatedName("ep.v([III)V")
    public synchronized void method1014(int[] arg0, int arg1, int arg2) {
        if (this.field2422.method2905()) {
            int var4 = this.field2401 * this.field2422.field2457 / Statics.field1126;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2426;
                if (this.field2423 - var5 >= 0L) {
                    this.field2426 = var5;
                    break;
                }
                int var7 = (int) ((this.field2423 - this.field2426 + (long) var4 - 1L) / (long) var4);
                this.field2426 += (long) var4 * (long) var7;
                this.field2419.method1014(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2803();
            } while (this.field2422.method2905());
        }
        this.field2419.method1014(arg0, arg1, arg2);
    }

    @ObfuscatedName("ep.ax(I)V")
    public synchronized void method1055(int arg0) {
        if (this.field2422.method2905()) {
            int var2 = this.field2401 * this.field2422.field2457 / Statics.field1126;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2426;
                if (this.field2423 - var3 >= 0L) {
                    this.field2426 = var3;
                    break;
                }
                int var5 = (int) ((this.field2423 - this.field2426 + (long) var2 - 1L) / (long) var2);
                this.field2426 += (long) var2 * (long) var5;
                this.field2419.method1055(var5);
                arg0 -= var5;
                this.method2803();
            } while (this.field2422.method2905());
        }
        this.field2419.method1055(arg0);
    }

    @ObfuscatedName("ep.ae(B)V")
    public void method2803() {
        int var1 = this.field2412;
        int var2 = this.field2425;
        long var3 = this.field2423;
        while (this.field2425 == var2) {
            while (this.field2422.field2455[var1] == var2) {
                this.field2422.method2906(var1);
                int var5 = this.field2422.method2910(var1);
                if (var5 == 1) {
                    this.field2422.method2908();
                    this.field2422.method2934(var1);
                    if (this.field2422.method2915()) {
                        if (!this.field2424 || var2 == 0) {
                            this.method2862();
                            this.field2422.method2942();
                            return;
                        }
                        this.field2422.method2916(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2812(var5);
                }
                this.field2422.method2909(var1);
                this.field2422.method2934(var1);
            }
            var1 = this.field2422.method2914();
            var2 = this.field2422.field2455[var1];
            var3 = this.field2422.method2913(var2);
        }
        this.field2412 = var1;
        this.field2425 = var2;
        this.field2423 = var3;
    }

    @ObfuscatedName("ep.am(Lei;I)Z")
    public boolean method2788(class148 arg0) {
        if (arg0.field2483 != null) {
            return false;
        }
        if (arg0.field2479 >= 0) {
            arg0.method3366();
            if (arg0.field2469 > 0 && this.field2421[arg0.field2470][arg0.field2469] == arg0) {
                this.field2421[arg0.field2470][arg0.field2469] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ep.aq(Lei;[IIII)Z")
    public boolean method2891(class148 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2484 = Statics.field1126 / 100;
        if (arg0.field2479 >= 0 && arg0.field2483 == null || arg0.field2483.method1009()) {
            arg0.method2952();
            arg0.method3366();
            if (arg0.field2469 > 0 && this.field2421[arg0.field2470][arg0.field2469] == arg0) {
                this.field2421[arg0.field2470][arg0.field2469] = null;
            }
            return true;
        }
        int var5 = arg0.field2475;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2408[arg0.field2470] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2475 = var6;
        }
        arg0.field2483.method1007(this.method2833(arg0));
        class145 var7 = arg0.field2468;
        boolean var8 = false;
        arg0.field2466++;
        arg0.field2471 += var7.field2433;
        double var9 = (double) ((arg0.field2481 - 60 << 8) + (arg0.field2485 * arg0.field2475 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2431 > 0) {
            if (var7.field2434 > 0) {
                arg0.field2476 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2434 * var9) + 0.5D);
            } else {
                arg0.field2476 += 128;
            }
        }
        if (var7.field2440 != null) {
            if (var7.field2432 > 0) {
                arg0.field2477 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2432 * var9) + 0.5D);
            } else {
                arg0.field2477 += 128;
            }
            while (arg0.field2478 < var7.field2440.length - 2 && arg0.field2477 > (var7.field2440[arg0.field2478 + 2] & 0xFF) << 8) {
                arg0.field2478 += 2;
            }
            if (arg0.field2478 == var7.field2440.length - 2 && var7.field2440[arg0.field2478 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2479 >= 0 && var7.field2430 != null && (this.field2414[arg0.field2470] & 0x1) == 0 && (arg0.field2469 < 0 || this.field2421[arg0.field2470][arg0.field2469] != arg0)) {
            if (var7.field2438 > 0) {
                arg0.field2479 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2438 * var9) + 0.5D);
            } else {
                arg0.field2479 += 128;
            }
            while (arg0.field2482 < var7.field2430.length - 2 && arg0.field2479 > (var7.field2430[arg0.field2482 + 2] & 0xFF) << 8) {
                arg0.field2482 += 2;
            }
            if (arg0.field2482 == var7.field2430.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2483.method1005(arg0.field2484, this.method2800(arg0), this.method2801(arg0));
            return false;
        }
        arg0.field2483.method1015(arg0.field2484);
        if (arg1 == null) {
            arg0.field2483.method1055(arg3);
        } else {
            arg0.field2483.method1014(arg1, arg2, arg3);
        }
        if (arg0.field2483.method1010()) {
            this.field2419.field2449.method1148(arg0.field2483);
        }
        arg0.method2952();
        if (arg0.field2479 >= 0) {
            arg0.method3366();
            if (arg0.field2469 > 0 && this.field2421[arg0.field2470][arg0.field2469] == arg0) {
                this.field2421[arg0.field2470][arg0.field2469] = null;
            }
        }
        return true;
    }
}
