package deob;

@ObfuscatedName("eo")
public class class141 extends class48 {

    @ObfuscatedName("eo.t")
    public class175 field2391 = new class175(128);

    @ObfuscatedName("eo.l")
    public int field2378 = 256;

    @ObfuscatedName("eo.c")
    public int field2393 = 1000000;

    @ObfuscatedName("eo.d")
    public int[] field2403 = new int[16];

    @ObfuscatedName("eo.b")
    public int[] field2381 = new int[16];

    @ObfuscatedName("eo.i")
    public int[] field2377 = new int[16];

    @ObfuscatedName("eo.p")
    public int[] field2383 = new int[16];

    @ObfuscatedName("eo.y")
    public int[] field2379 = new int[16];

    @ObfuscatedName("eo.u")
    public int[] field2401 = new int[16];

    @ObfuscatedName("eo.z")
    public int[] field2386 = new int[16];

    @ObfuscatedName("eo.j")
    public int[] field2387 = new int[16];

    @ObfuscatedName("eo.h")
    public int[] field2388 = new int[16];

    @ObfuscatedName("eo.s")
    public int[] field2385 = new int[16];

    @ObfuscatedName("eo.g")
    public int[] field2392 = new int[16];

    @ObfuscatedName("eo.m")
    public int[] field2390 = new int[16];

    @ObfuscatedName("eo.a")
    public int[] field2394 = new int[16];

    @ObfuscatedName("eo.n")
    public int[] field2395 = new int[16];

    @ObfuscatedName("eo.v")
    public int[] field2396 = new int[16];

    @ObfuscatedName("eo.e")
    public class145[][] field2397 = new class145[16][128];

    @ObfuscatedName("eo.ar")
    public class145[][] field2398 = new class145[16][128];

    @ObfuscatedName("eo.ak")
    public class144 field2399 = new class144();

    @ObfuscatedName("eo.ap")
    public boolean field2400;

    @ObfuscatedName("eo.aa")
    public int field2384;

    @ObfuscatedName("eo.av")
    public int field2402;

    @ObfuscatedName("eo.aq")
    public long field2380;

    @ObfuscatedName("eo.an")
    public long field2404;

    @ObfuscatedName("eo.al")
    public class143 field2405 = new class143(this);

    public class141() {
        this.method2747();
    }

    @ObfuscatedName("eo.t(II)V")
    public synchronized void method2765(int arg0) {
        this.field2378 = arg0;
    }

    @ObfuscatedName("eo.l(I)I")
    public int method2729() {
        return this.field2378;
    }

    @ObfuscatedName("eo.d(Lem;Lev;Lbi;II)Z")
    public synchronized boolean method2754(class139 arg0, class152 arg1, class58 arg2, int arg3) {
        arg0.method2711();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class176 var7 = (class176) arg0.field2366.method3310(); var7 != null; var7 = (class176) arg0.field2366.method3305()) {
            int var8 = (int) var7.field2821;
            class140 var9 = (class140) this.field2391.method3301((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3017(var8);
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
                this.field2391.method3302(var11, (long) var8);
            }
            if (!var9.method2718(arg2, var7.field2814, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2713();
        }
        return var5;
    }

    @ObfuscatedName("eo.b(I)V")
    public synchronized void method2731() {
        for (class140 var1 = (class140) this.field2391.method3310(); var1 != null; var1 = (class140) this.field2391.method3305()) {
            var1.method2720();
        }
    }

    @ObfuscatedName("eo.i(I)V")
    public synchronized void method2732() {
        for (class140 var1 = (class140) this.field2391.method3310(); var1 != null; var1 = (class140) this.field2391.method3305()) {
            var1.method3361();
        }
    }

    @ObfuscatedName("eo.p(Lem;ZB)V")
    public synchronized void method2780(class139 arg0, boolean arg1) {
        this.method2734();
        this.field2399.method2869(arg0.field2367);
        this.field2400 = arg1;
        this.field2380 = 0L;
        int var3 = this.field2399.method2876();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2399.method2846(var4);
            this.field2399.method2849(var4);
            this.field2399.method2863(var4);
        }
        this.field2384 = this.field2399.method2854();
        this.field2402 = this.field2399.field2430[this.field2384];
        this.field2404 = this.field2399.method2878(this.field2402);
    }

    @ObfuscatedName("eo.y(B)V")
    public synchronized void method2734() {
        this.field2399.method2871();
        this.method2747();
    }

    @ObfuscatedName("eo.u(I)Z")
    public synchronized boolean method2735() {
        return this.field2399.method2844();
    }

    @ObfuscatedName("eo.z(IIB)V")
    public synchronized void method2736(int arg0, int arg1) {
        this.method2760(arg0, arg1);
    }

    @ObfuscatedName("eo.j(III)V")
    public void method2760(int arg0, int arg1) {
        this.field2383[arg0] = arg1;
        this.field2401[arg0] = arg1 & 0xFFFFFF80;
        this.method2738(arg0, arg1);
    }

    @ObfuscatedName("eo.h(IIB)V")
    public void method2738(int arg0, int arg1) {
        if (this.field2379[arg0] != arg1) {
            this.field2379[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2398[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("eo.x(IIIB)V")
    public void method2755(int arg0, int arg1, int arg2) {
        this.method2740(arg0, arg1, 64);
        if ((this.field2385[arg0] & 0x2) != 0) {
            for (class145 var4 = (class145) this.field2405.field2418.method3323(); var4 != null; var4 = (class145) this.field2405.field2418.method3325()) {
                if (var4.field2440 == arg0 && var4.field2458 < 0) {
                    this.field2397[arg0][var4.field2448] = null;
                    this.field2397[arg0][arg1] = var4;
                    int var5 = (var4.field2445 * var4.field2444 >> 12) + var4.field2443;
                    var4.field2443 += arg1 - var4.field2448 << 8;
                    var4.field2445 = var5 - var4.field2443;
                    var4.field2444 = 4096;
                    var4.field2448 = arg1;
                    return;
                }
            }
        }
        class140 var6 = (class140) this.field2391.method3301((long) this.field2379[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2369[arg1];
        if (var7 == null) {
            return;
        }
        class145 var8 = new class145();
        var8.field2440 = arg0;
        var8.field2437 = var6;
        var8.field2438 = var7;
        var8.field2439 = var6.field2373[arg1];
        var8.field2441 = var6.field2374[arg1];
        var8.field2448 = arg1;
        var8.field2442 = var6.field2370 * arg2 * arg2 * var6.field2368[arg1] + 1024 >> 11;
        var8.field2447 = var6.field2371[arg1] & 0xFF;
        var8.field2443 = (arg1 << 8) - (var6.field2372[arg1] & 0x7FFF);
        var8.field2452 = 0;
        var8.field2454 = 0;
        var8.field2449 = 0;
        var8.field2458 = -1;
        var8.field2451 = 0;
        if (this.field2394[arg0] == 0) {
            var8.field2450 = class45.method979(var7, this.method2741(var8), this.method2753(var8), this.method2775(var8));
        } else {
            var8.field2450 = class45.method979(var7, this.method2741(var8), 0, this.method2775(var8));
            this.method2739(var8, var6.field2372[arg1] < 0);
        }
        if (var6.field2372[arg1] < 0) {
            var8.field2450.method981(-1);
        }
        if (var8.field2441 >= 0) {
            class145 var9 = this.field2398[arg0][var8.field2441];
            if (var9 != null && var9.field2458 < 0) {
                this.field2397[arg0][var9.field2448] = null;
                var9.field2458 = 0;
            }
            this.field2398[arg0][var8.field2441] = var8;
        }
        this.field2405.field2418.method3317(var8);
        this.field2397[arg0][arg1] = var8;
    }

    @ObfuscatedName("eo.q(Lep;ZI)V")
    public void method2739(class145 arg0, boolean arg1) {
        int var3 = arg0.field2438.field1271.length;
        int var5;
        if (arg1 && arg0.field2438.field1274) {
            int var4 = var3 + var3 - arg0.field2438.field1270;
            var5 = (int) ((long) this.field2394[arg0.field2440] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2450.method1047(true);
            }
        } else {
            var5 = (int) ((long) this.field2394[arg0.field2440] * (long) var3 >> 6);
        }
        arg0.field2450.method987(var5);
    }

    @ObfuscatedName("eo.w(IIII)V")
    public void method2740(int arg0, int arg1, int arg2) {
        class145 var4 = this.field2397[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2397[arg0][arg1] = null;
        if ((this.field2385[arg0] & 0x2) == 0) {
            var4.field2458 = 0;
            return;
        }
        for (class145 var5 = (class145) this.field2405.field2418.method3345(); var5 != null; var5 = (class145) this.field2405.field2418.method3324()) {
            if (var4.field2440 == var5.field2440 && var5.field2458 < 0 && var4 != var5) {
                var4.field2458 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("eo.k(IIII)V")
    public void method2801(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("eo.o(III)V")
    public void method2750(int arg0, int arg1) {
    }

    @ObfuscatedName("eo.f(III)V")
    public void method2759(int arg0, int arg1) {
        this.field2386[arg0] = arg1;
    }

    @ObfuscatedName("eo.r(IB)V")
    public void method2773(int arg0) {
        for (class145 var2 = (class145) this.field2405.field2418.method3345(); var2 != null; var2 = (class145) this.field2405.field2418.method3324()) {
            if (arg0 < 0 || var2.field2440 == arg0) {
                if (var2.field2450 != null) {
                    var2.field2450.method992(Statics.field2051 / 100);
                    if (var2.field2450.method1044()) {
                        this.field2405.field2417.method1123(var2.field2450);
                    }
                    var2.method2887();
                }
                if (var2.field2458 < 0) {
                    this.field2397[var2.field2440][var2.field2448] = null;
                }
                var2.method3361();
            }
        }
    }

    @ObfuscatedName("eo.s(IB)V")
    public void method2745(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2745(var2);
            }
            return;
        }
        this.field2403[arg0] = 12800;
        this.field2381[arg0] = 8192;
        this.field2377[arg0] = 16383;
        this.field2386[arg0] = 8192;
        this.field2387[arg0] = 0;
        this.field2388[arg0] = 8192;
        this.method2748(arg0);
        this.method2749(arg0);
        this.field2385[arg0] = 0;
        this.field2392[arg0] = 32767;
        this.field2390[arg0] = 256;
        this.field2394[arg0] = 0;
        this.method2751(arg0, 8192);
    }

    @ObfuscatedName("eo.g(II)V")
    public void method2832(int arg0) {
        for (class145 var2 = (class145) this.field2405.field2418.method3345(); var2 != null; var2 = (class145) this.field2405.field2418.method3324()) {
            if ((arg0 < 0 || var2.field2440 == arg0) && var2.field2458 < 0) {
                this.field2397[var2.field2440][var2.field2448] = null;
                var2.field2458 = 0;
            }
        }
    }

    @ObfuscatedName("eo.m(I)V")
    public void method2747() {
        this.method2773(-1);
        this.method2745(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2379[var1] = this.field2383[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2401[var2] = this.field2383[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("eo.ak(II)V")
    public void method2748(int arg0) {
        if ((this.field2385[arg0] & 0x2) == 0) {
            return;
        }
        for (class145 var2 = (class145) this.field2405.field2418.method3345(); var2 != null; var2 = (class145) this.field2405.field2418.method3324()) {
            if (var2.field2440 == arg0 && this.field2397[arg0][var2.field2448] == null && var2.field2458 < 0) {
                var2.field2458 = 0;
            }
        }
    }

    @ObfuscatedName("eo.ap(II)V")
    public void method2749(int arg0) {
        if ((this.field2385[arg0] & 0x4) == 0) {
            return;
        }
        for (class145 var2 = (class145) this.field2405.field2418.method3345(); var2 != null; var2 = (class145) this.field2405.field2418.method3324()) {
            if (var2.field2440 == arg0) {
                var2.field2456 = 0;
            }
        }
    }

    @ObfuscatedName("eo.aa(II)V")
    public void method2768(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2740(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2755(var6, var7, var8);
            } else {
                this.method2740(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2801(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2401[var12] = (var14 << 14) + (this.field2401[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2401[var12] = (var14 << 7) + (this.field2401[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2387[var12] = (var14 << 7) + (this.field2387[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2387[var12] = (this.field2387[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2388[var12] = (var14 << 7) + (this.field2388[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2388[var12] = (this.field2388[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2403[var12] = (var14 << 7) + (this.field2403[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2403[var12] = (this.field2403[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2381[var12] = (var14 << 7) + (this.field2381[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2381[var12] = (this.field2381[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2377[var12] = (var14 << 7) + (this.field2377[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2377[var12] = (this.field2377[var12] & 0xFFFFFF80) + var14;
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
                    this.method2748(var12);
                    this.field2385[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2392[var12] = (var14 << 7) + (this.field2392[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2392[var12] = (this.field2392[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2392[var12] = (var14 << 7) + (this.field2392[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2392[var12] = (this.field2392[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2773(var12);
            }
            if (var13 == 121) {
                this.method2745(var12);
            }
            if (var13 == 123) {
                this.method2832(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2392[var12];
                if (var15 == 16384) {
                    this.field2390[var12] = (var14 << 7) + (this.field2390[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2392[var12];
                if (var16 == 16384) {
                    this.field2390[var12] = (this.field2390[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2394[var12] = (var14 << 7) + (this.field2394[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2394[var12] = (this.field2394[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2385[var12] |= 0x4;
                } else {
                    this.method2749(var12);
                    this.field2385[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2751(var12, (var14 << 7) + (this.field2395[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2751(var12, (this.field2395[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2738(var17, this.field2401[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2750(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method2759(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2747();
            }
        }
    }

    @ObfuscatedName("eo.av(IIB)V")
    public void method2751(int arg0, int arg1) {
        this.field2395[arg0] = arg1;
        this.field2396[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("eo.aq(Lep;B)I")
    public int method2741(class145 arg0) {
        int var2 = (arg0.field2445 * arg0.field2444 >> 12) + arg0.field2443;
        int var3 = ((this.field2386[arg0.field2440] - 8192) * this.field2390[arg0.field2440] >> 12) + var2;
        class142 var4 = arg0.field2439;
        if (var4.field2415 > 0 && (var4.field2414 > 0 || this.field2387[arg0.field2440] > 0)) {
            int var5 = var4.field2414 << 2;
            int var6 = var4.field2411 << 1;
            if (arg0.field2436 < var6) {
                var5 = arg0.field2436 * var5 / var6;
            }
            int var7 = (this.field2387[arg0.field2440] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2453 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2438.field1272 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field2051 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("eo.an(Lep;I)I")
    public int method2753(class145 arg0) {
        class142 var2 = arg0.field2439;
        int var3 = this.field2403[arg0.field2440] * this.field2377[arg0.field2440] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2442 * var4 + 16384 >> 15;
        int var6 = this.field2378 * var5 + 128 >> 8;
        if (var2.field2408 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2452 * 1.953125E-5D * (double) var2.field2408) + 0.5D);
        }
        if (var2.field2409 != null) {
            int var7 = arg0.field2454;
            int var8 = var2.field2409[arg0.field2449 + 1];
            if (arg0.field2449 < var2.field2409.length - 2) {
                int var9 = (var2.field2409[arg0.field2449] & 0xFF) << 8;
                int var10 = (var2.field2409[arg0.field2449 + 2] & 0xFF) << 8;
                var8 += (var2.field2409[arg0.field2449 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2458 > 0 && var2.field2416 != null) {
            int var11 = arg0.field2458;
            int var12 = var2.field2416[arg0.field2451 + 1];
            if (arg0.field2451 < var2.field2416.length - 2) {
                int var13 = (var2.field2416[arg0.field2451] & 0xFF) << 8;
                int var14 = (var2.field2416[arg0.field2451 + 2] & 0xFF) << 8;
                var12 += (var2.field2416[arg0.field2451 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("eo.al(Lep;I)I")
    public int method2775(class145 arg0) {
        int var2 = this.field2381[arg0.field2440];
        return var2 < 8192 ? arg0.field2447 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2447) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("eo.a()Lai;")
    public synchronized class48 method1033() {
        return this.field2405;
    }

    @ObfuscatedName("eo.n()Lai;")
    public synchronized class48 method1005() {
        return null;
    }

    @ObfuscatedName("eo.v()I")
    public synchronized int method999() {
        return 0;
    }

    @ObfuscatedName("eo.e([III)V")
    public synchronized void method1000(int[] arg0, int arg1, int arg2) {
        if (this.field2399.method2844()) {
            int var4 = this.field2393 * this.field2399.field2426 / Statics.field2051;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2380;
                if (this.field2404 - var5 >= 0L) {
                    this.field2380 = var5;
                    break;
                }
                int var7 = (int) ((this.field2404 - this.field2380 + (long) var4 - 1L) / (long) var4);
                this.field2380 += (long) var4 * (long) var7;
                this.field2405.method1000(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2789();
            } while (this.field2399.method2844());
        }
        this.field2405.method1000(arg0, arg1, arg2);
    }

    @ObfuscatedName("eo.ar(I)V")
    public synchronized void method1031(int arg0) {
        if (this.field2399.method2844()) {
            int var2 = this.field2393 * this.field2399.field2426 / Statics.field2051;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2380;
                if (this.field2404 - var3 >= 0L) {
                    this.field2380 = var3;
                    break;
                }
                int var5 = (int) ((this.field2404 - this.field2380 + (long) var2 - 1L) / (long) var2);
                this.field2380 += (long) var2 * (long) var5;
                this.field2405.method1031(var5);
                arg0 -= var5;
                this.method2789();
            } while (this.field2399.method2844());
        }
        this.field2405.method1031(arg0);
    }

    @ObfuscatedName("eo.ax(I)V")
    public void method2789() {
        int var1 = this.field2384;
        int var2 = this.field2402;
        long var3 = this.field2404;
        while (this.field2402 == var2) {
            while (this.field2399.field2430[var1] == var2) {
                this.field2399.method2846(var1);
                int var5 = this.field2399.method2850(var1);
                if (var5 == 1) {
                    this.field2399.method2848();
                    this.field2399.method2863(var1);
                    if (this.field2399.method2855()) {
                        if (!this.field2400 || var2 == 0) {
                            this.method2747();
                            this.field2399.method2871();
                            return;
                        }
                        this.field2399.method2856(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2768(var5);
                }
                this.field2399.method2849(var1);
                this.field2399.method2863(var1);
            }
            var1 = this.field2399.method2854();
            var2 = this.field2399.field2430[var1];
            var3 = this.field2399.method2878(var2);
        }
        this.field2384 = var1;
        this.field2402 = var2;
        this.field2404 = var3;
    }

    @ObfuscatedName("eo.as(Lep;I)Z")
    public boolean method2743(class145 arg0) {
        if (arg0.field2450 != null) {
            return false;
        }
        if (arg0.field2458 >= 0) {
            arg0.method3361();
            if (arg0.field2441 > 0 && this.field2398[arg0.field2440][arg0.field2441] == arg0) {
                this.field2398[arg0.field2440][arg0.field2441] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("eo.ah(Lep;[IIII)Z")
    public boolean method2821(class145 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2455 = Statics.field2051 / 100;
        if (arg0.field2458 >= 0 && arg0.field2450 == null || arg0.field2450.method1043()) {
            arg0.method2887();
            arg0.method3361();
            if (arg0.field2441 > 0 && this.field2398[arg0.field2440][arg0.field2441] == arg0) {
                this.field2398[arg0.field2440][arg0.field2441] = null;
            }
            return true;
        }
        int var5 = arg0.field2444;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2388[arg0.field2440] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2444 = var6;
        }
        arg0.field2450.method993(this.method2741(arg0));
        class142 var7 = arg0.field2439;
        boolean var8 = false;
        arg0.field2436++;
        arg0.field2453 += var7.field2415;
        double var9 = (double) ((arg0.field2448 - 60 << 8) + (arg0.field2445 * arg0.field2444 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2408 > 0) {
            if (var7.field2413 > 0) {
                arg0.field2452 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2413 * var9) + 0.5D);
            } else {
                arg0.field2452 += 128;
            }
        }
        if (var7.field2409 != null) {
            if (var7.field2410 > 0) {
                arg0.field2454 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2410 * var9) + 0.5D);
            } else {
                arg0.field2454 += 128;
            }
            while (arg0.field2449 < var7.field2409.length - 2 && arg0.field2454 > (var7.field2409[arg0.field2449 + 2] & 0xFF) << 8) {
                arg0.field2449 += 2;
            }
            if (arg0.field2449 == var7.field2409.length - 2 && var7.field2409[arg0.field2449 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2458 >= 0 && var7.field2416 != null && (this.field2385[arg0.field2440] & 0x1) == 0 && (arg0.field2441 < 0 || this.field2398[arg0.field2440][arg0.field2441] != arg0)) {
            if (var7.field2412 > 0) {
                arg0.field2458 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2412 * var9) + 0.5D);
            } else {
                arg0.field2458 += 128;
            }
            while (arg0.field2451 < var7.field2416.length - 2 && arg0.field2458 > (var7.field2416[arg0.field2451 + 2] & 0xFF) << 8) {
                arg0.field2451 += 2;
            }
            if (arg0.field2451 == var7.field2416.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2450.method991(arg0.field2455, this.method2753(arg0), this.method2775(arg0));
            return false;
        }
        arg0.field2450.method992(arg0.field2455);
        if (arg1 == null) {
            arg0.field2450.method1031(arg3);
        } else {
            arg0.field2450.method1000(arg1, arg2, arg3);
        }
        if (arg0.field2450.method1044()) {
            this.field2405.field2417.method1123(arg0.field2450);
        }
        arg0.method2887();
        if (arg0.field2458 >= 0) {
            arg0.method3361();
            if (arg0.field2441 > 0 && this.field2398[arg0.field2440][arg0.field2441] == arg0) {
                this.field2398[arg0.field2440][arg0.field2441] = null;
            }
        }
        return true;
    }
}
