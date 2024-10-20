package deob;

@ObfuscatedName("eg")
public class class142 extends class48 {

    @ObfuscatedName("eg.q")
    public class175 field2407 = new class175(128);

    @ObfuscatedName("eg.c")
    public int field2385 = 256;

    @ObfuscatedName("eg.p")
    public int field2413 = 1000000;

    @ObfuscatedName("eg.z")
    public int[] field2409 = new int[16];

    @ObfuscatedName("eg.m")
    public int[] field2387 = new int[16];

    @ObfuscatedName("eg.k")
    public int[] field2389 = new int[16];

    @ObfuscatedName("eg.v")
    public int[] field2390 = new int[16];

    @ObfuscatedName("eg.y")
    public int[] field2391 = new int[16];

    @ObfuscatedName("eg.d")
    public int[] field2392 = new int[16];

    @ObfuscatedName("eg.l")
    public int[] field2393 = new int[16];

    @ObfuscatedName("eg.h")
    public int[] field2401 = new int[16];

    @ObfuscatedName("eg.b")
    public int[] field2396 = new int[16];

    @ObfuscatedName("eg.a")
    public int[] field2397 = new int[16];

    @ObfuscatedName("eg.f")
    public int[] field2398 = new int[16];

    @ObfuscatedName("eg.s")
    public int[] field2399 = new int[16];

    @ObfuscatedName("eg.w")
    public int[] field2400 = new int[16];

    @ObfuscatedName("eg.x")
    public int[] field2408 = new int[16];

    @ObfuscatedName("eg.j")
    public int[] field2386 = new int[16];

    @ObfuscatedName("eg.i")
    public class146[][] field2384 = new class146[16][128];

    @ObfuscatedName("eg.ap")
    public class146[][] field2404 = new class146[16][128];

    @ObfuscatedName("eg.am")
    public class145 field2405 = new class145();

    @ObfuscatedName("eg.ao")
    public boolean field2406;

    @ObfuscatedName("eg.af")
    public int field2395;

    @ObfuscatedName("eg.ae")
    public int field2414;

    @ObfuscatedName("eg.az")
    public long field2394;

    @ObfuscatedName("eg.al")
    public long field2410;

    @ObfuscatedName("eg.ak")
    public class144 field2411 = new class144(this);

    public class142() {
        this.method2719();
    }

    @ObfuscatedName("eg.q(II)V")
    public synchronized void method2701(int arg0) {
        this.field2385 = arg0;
    }

    @ObfuscatedName("eg.c(I)I")
    public int method2724() {
        return this.field2385;
    }

    @ObfuscatedName("eg.z(Let;Ley;Lbt;II)Z")
    public synchronized boolean method2703(class140 arg0, class153 arg1, class58 arg2, int arg3) {
        arg0.method2690();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class176 var7 = (class176) arg0.field2369.method3262(); var7 != null; var7 = (class176) arg0.field2369.method3265()) {
            int var8 = (int) var7.field2830;
            class141 var9 = (class141) this.field2407.method3260((long) var8);
            if (var9 == null) {
                var9 = Statics.method536(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2407.method3261(var9, (long) var8);
            }
            if (!var9.method2695(arg2, var7.field2824, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2691();
        }
        return var5;
    }

    @ObfuscatedName("eg.m(B)V")
    public synchronized void method2734() {
        for (class141 var1 = (class141) this.field2407.method3262(); var1 != null; var1 = (class141) this.field2407.method3265()) {
            var1.method2697();
        }
    }

    @ObfuscatedName("eg.k(B)V")
    public synchronized void method2737() {
        for (class141 var1 = (class141) this.field2407.method3262(); var1 != null; var1 = (class141) this.field2407.method3265()) {
            var1.method3309();
        }
    }

    @ObfuscatedName("eg.v(Let;ZI)V")
    public synchronized void method2706(class140 arg0, boolean arg1) {
        this.method2707();
        this.field2405.method2868(arg0.field2370);
        this.field2406 = arg1;
        this.field2394 = 0L;
        int var3 = this.field2405.method2844();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2405.method2828(var4);
            this.field2405.method2824(var4);
            this.field2405.method2829(var4);
        }
        this.field2395 = this.field2405.method2852();
        this.field2414 = this.field2405.field2439[this.field2395];
        this.field2410 = this.field2405.method2835(this.field2414);
    }

    @ObfuscatedName("eg.y(B)V")
    public synchronized void method2707() {
        this.field2405.method2825();
        this.method2719();
    }

    @ObfuscatedName("eg.d(B)Z")
    public synchronized boolean method2732() {
        return this.field2405.method2826();
    }

    @ObfuscatedName("eg.l(IIB)V")
    public synchronized void method2728(int arg0, int arg1) {
        this.method2700(arg0, arg1);
    }

    @ObfuscatedName("eg.h(IIB)V")
    public void method2700(int arg0, int arg1) {
        this.field2390[arg0] = arg1;
        this.field2392[arg0] = arg1 & 0xFFFFFF80;
        this.method2731(arg0, arg1);
    }

    @ObfuscatedName("eg.b(III)V")
    public void method2731(int arg0, int arg1) {
        if (this.field2391[arg0] != arg1) {
            this.field2391[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2404[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("eg.r(IIII)V")
    public void method2736(int arg0, int arg1, int arg2) {
        this.method2713(arg0, arg1, 64);
        if ((this.field2397[arg0] & 0x2) != 0) {
            for (class146 var4 = (class146) this.field2411.field2426.method3282(); var4 != null; var4 = (class146) this.field2411.field2426.method3284()) {
                if (var4.field2461 == arg0 && var4.field2452 < 0) {
                    this.field2384[arg0][var4.field2450] = null;
                    this.field2384[arg0][arg1] = var4;
                    int var5 = (var4.field2467 * var4.field2455 >> 12) + var4.field2453;
                    var4.field2453 += arg1 - var4.field2450 << 8;
                    var4.field2467 = var5 - var4.field2453;
                    var4.field2455 = 4096;
                    var4.field2450 = arg1;
                    return;
                }
            }
        }
        class141 var6 = (class141) this.field2407.method3260((long) this.field2391[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2372[arg1];
        if (var7 == null) {
            return;
        }
        class146 var8 = new class146();
        var8.field2461 = arg0;
        var8.field2446 = var6;
        var8.field2458 = var7;
        var8.field2448 = var6.field2374[arg1];
        var8.field2449 = var6.field2376[arg1];
        var8.field2450 = arg1;
        var8.field2451 = var6.field2382 * arg2 * arg2 * var6.field2371[arg1] + 1024 >> 11;
        var8.field2447 = var6.field2375[arg1] & 0xFF;
        var8.field2453 = (arg1 << 8) - (var6.field2383[arg1] & 0x7FFF);
        var8.field2456 = 0;
        var8.field2457 = 0;
        var8.field2459 = 0;
        var8.field2452 = -1;
        var8.field2460 = 0;
        if (this.field2400[arg0] == 0) {
            var8.field2463 = class45.method975(var7, this.method2797(var8), this.method2783(var8), this.method2726(var8));
        } else {
            var8.field2463 = class45.method975(var7, this.method2797(var8), 0, this.method2726(var8));
            this.method2712(var8, var6.field2383[arg1] < 0);
        }
        if (var6.field2383[arg1] < 0) {
            var8.field2463.method1108(-1);
        }
        if (var8.field2449 >= 0) {
            class146 var9 = this.field2404[arg0][var8.field2449];
            if (var9 != null && var9.field2452 < 0) {
                this.field2384[arg0][var9.field2450] = null;
                var9.field2452 = 0;
            }
            this.field2404[arg0][var8.field2449] = var8;
        }
        this.field2411.field2426.method3288(var8);
        this.field2384[arg0][arg1] = var8;
    }

    @ObfuscatedName("eg.t(Leq;ZB)V")
    public void method2712(class146 arg0, boolean arg1) {
        int var3 = arg0.field2458.field1226.length;
        int var5;
        if (arg1 && arg0.field2458.field1230) {
            int var4 = var3 + var3 - arg0.field2458.field1227;
            var5 = (int) ((long) this.field2400[arg0.field2461] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2463.method968(true);
            }
        } else {
            var5 = (int) ((long) this.field2400[arg0.field2461] * (long) var3 >> 6);
        }
        arg0.field2463.method967(var5);
    }

    @ObfuscatedName("eg.u(IIII)V")
    public void method2713(int arg0, int arg1, int arg2) {
        class146 var4 = this.field2384[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2384[arg0][arg1] = null;
        if ((this.field2397[arg0] & 0x2) == 0) {
            var4.field2452 = 0;
            return;
        }
        for (class146 var5 = (class146) this.field2411.field2426.method3286(); var5 != null; var5 = (class146) this.field2411.field2426.method3302()) {
            if (var4.field2461 == var5.field2461 && var5.field2452 < 0 && var4 != var5) {
                var4.field2452 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("eg.g(IIIB)V")
    public void method2792(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("eg.e(III)V")
    public void method2715(int arg0, int arg1) {
    }

    @ObfuscatedName("eg.n(IIB)V")
    public void method2794(int arg0, int arg1) {
        this.field2393[arg0] = arg1;
    }

    @ObfuscatedName("eg.o(IB)V")
    public void method2716(int arg0) {
        for (class146 var2 = (class146) this.field2411.field2426.method3286(); var2 != null; var2 = (class146) this.field2411.field2426.method3302()) {
            if (arg0 < 0 || var2.field2461 == arg0) {
                if (var2.field2463 != null) {
                    var2.field2463.method972(Statics.field1097 / 100);
                    if (var2.field2463.method976()) {
                        this.field2411.field2425.method1116(var2.field2463);
                    }
                    var2.method2880();
                }
                if (var2.field2452 < 0) {
                    this.field2384[var2.field2461][var2.field2450] = null;
                }
                var2.method3309();
            }
        }
    }

    @ObfuscatedName("eg.a(II)V")
    public void method2717(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2717(var2);
            }
            return;
        }
        this.field2409[arg0] = 12800;
        this.field2387[arg0] = 8192;
        this.field2389[arg0] = 16383;
        this.field2393[arg0] = 8192;
        this.field2401[arg0] = 0;
        this.field2396[arg0] = 8192;
        this.method2720(arg0);
        this.method2721(arg0);
        this.field2397[arg0] = 0;
        this.field2398[arg0] = 32767;
        this.field2399[arg0] = 256;
        this.field2400[arg0] = 0;
        this.method2723(arg0, 8192);
    }

    @ObfuscatedName("eg.f(II)V")
    public void method2757(int arg0) {
        for (class146 var2 = (class146) this.field2411.field2426.method3286(); var2 != null; var2 = (class146) this.field2411.field2426.method3302()) {
            if ((arg0 < 0 || var2.field2461 == arg0) && var2.field2452 < 0) {
                this.field2384[var2.field2461][var2.field2450] = null;
                var2.field2452 = 0;
            }
        }
    }

    @ObfuscatedName("eg.s(I)V")
    public void method2719() {
        this.method2716(-1);
        this.method2717(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2391[var1] = this.field2390[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2392[var2] = this.field2390[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("eg.am(II)V")
    public void method2720(int arg0) {
        if ((this.field2397[arg0] & 0x2) == 0) {
            return;
        }
        for (class146 var2 = (class146) this.field2411.field2426.method3286(); var2 != null; var2 = (class146) this.field2411.field2426.method3302()) {
            if (var2.field2461 == arg0 && this.field2384[arg0][var2.field2450] == null && var2.field2452 < 0) {
                var2.field2452 = 0;
            }
        }
    }

    @ObfuscatedName("eg.ao(II)V")
    public void method2721(int arg0) {
        if ((this.field2397[arg0] & 0x4) == 0) {
            return;
        }
        for (class146 var2 = (class146) this.field2411.field2426.method3286(); var2 != null; var2 = (class146) this.field2411.field2426.method3302()) {
            if (var2.field2461 == arg0) {
                var2.field2454 = 0;
            }
        }
    }

    @ObfuscatedName("eg.af(II)V")
    public void method2722(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2713(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2736(var6, var7, var8);
            } else {
                this.method2713(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2792(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2392[var12] = (var14 << 14) + (this.field2392[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2392[var12] = (var14 << 7) + (this.field2392[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2401[var12] = (var14 << 7) + (this.field2401[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2401[var12] = (this.field2401[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2396[var12] = (var14 << 7) + (this.field2396[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2396[var12] = (this.field2396[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2409[var12] = (var14 << 7) + (this.field2409[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2409[var12] = (this.field2409[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2387[var12] = (var14 << 7) + (this.field2387[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2387[var12] = (this.field2387[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2389[var12] = (var14 << 7) + (this.field2389[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2389[var12] = (this.field2389[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2397[var12] |= 0x1;
                } else {
                    this.field2397[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2397[var12] |= 0x2;
                } else {
                    this.method2720(var12);
                    this.field2397[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2398[var12] = (var14 << 7) + (this.field2398[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2398[var12] = (this.field2398[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2398[var12] = (var14 << 7) + (this.field2398[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2398[var12] = (this.field2398[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2716(var12);
            }
            if (var13 == 121) {
                this.method2717(var12);
            }
            if (var13 == 123) {
                this.method2757(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2398[var12];
                if (var15 == 16384) {
                    this.field2399[var12] = (var14 << 7) + (this.field2399[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2398[var12];
                if (var16 == 16384) {
                    this.field2399[var12] = (this.field2399[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2400[var12] = (var14 << 7) + (this.field2400[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2400[var12] = (this.field2400[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2397[var12] |= 0x4;
                } else {
                    this.method2721(var12);
                    this.field2397[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2723(var12, (var14 << 7) + (this.field2408[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2723(var12, (this.field2408[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2731(var17, this.field2392[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2715(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method2794(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2719();
            }
        }
    }

    @ObfuscatedName("eg.ae(III)V")
    public void method2723(int arg0, int arg1) {
        this.field2408[arg0] = arg1;
        this.field2386[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("eg.az(Leq;I)I")
    public int method2797(class146 arg0) {
        int var2 = (arg0.field2467 * arg0.field2455 >> 12) + arg0.field2453;
        int var3 = ((this.field2393[arg0.field2461] - 8192) * this.field2399[arg0.field2461] >> 12) + var2;
        class143 var4 = arg0.field2448;
        if (var4.field2422 > 0 && (var4.field2421 > 0 || this.field2401[arg0.field2461] > 0)) {
            int var5 = var4.field2421 << 2;
            int var6 = var4.field2423 << 1;
            if (arg0.field2466 < var6) {
                var5 = arg0.field2466 * var5 / var6;
            }
            int var7 = (this.field2401[arg0.field2461] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2462 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2458.field1229 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1097 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("eg.al(Leq;I)I")
    public int method2783(class146 arg0) {
        class143 var2 = arg0.field2448;
        int var3 = this.field2409[arg0.field2461] * this.field2389[arg0.field2461] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2451 * var4 + 16384 >> 15;
        int var6 = this.field2385 * var5 + 128 >> 8;
        if (var2.field2417 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2456 * 1.953125E-5D * (double) var2.field2417) + 0.5D);
        }
        if (var2.field2419 != null) {
            int var7 = arg0.field2457;
            int var8 = var2.field2419[arg0.field2459 + 1];
            if (arg0.field2459 < var2.field2419.length - 2) {
                int var9 = (var2.field2419[arg0.field2459] & 0xFF) << 8;
                int var10 = (var2.field2419[arg0.field2459 + 2] & 0xFF) << 8;
                var8 += (var2.field2419[arg0.field2459 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2452 > 0 && var2.field2416 != null) {
            int var11 = arg0.field2452;
            int var12 = var2.field2416[arg0.field2460 + 1];
            if (arg0.field2460 < var2.field2416.length - 2) {
                int var13 = (var2.field2416[arg0.field2460] & 0xFF) << 8;
                int var14 = (var2.field2416[arg0.field2460 + 2] & 0xFF) << 8;
                var12 += (var2.field2416[arg0.field2460 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("eg.ak(Leq;I)I")
    public int method2726(class146 arg0) {
        int var2 = this.field2387[arg0.field2461];
        return var2 < 8192 ? arg0.field2447 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2447) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("eg.w()Lav;")
    public synchronized class48 method1006() {
        return this.field2411;
    }

    @ObfuscatedName("eg.x()Lav;")
    public synchronized class48 method1039() {
        return null;
    }

    @ObfuscatedName("eg.j()I")
    public synchronized int method979() {
        return 0;
    }

    @ObfuscatedName("eg.i([III)V")
    public synchronized void method1059(int[] arg0, int arg1, int arg2) {
        if (this.field2405.method2826()) {
            int var4 = this.field2413 * this.field2405.field2432 / Statics.field1097;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2394;
                if (this.field2410 - var5 >= 0L) {
                    this.field2394 = var5;
                    break;
                }
                int var7 = (int) ((this.field2410 - this.field2394 + (long) var4 - 1L) / (long) var4);
                this.field2394 += (long) var4 * (long) var7;
                this.field2411.method1059(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2729();
            } while (this.field2405.method2826());
        }
        this.field2411.method1059(arg0, arg1, arg2);
    }

    @ObfuscatedName("eg.ap(I)V")
    public synchronized void method981(int arg0) {
        if (this.field2405.method2826()) {
            int var2 = this.field2413 * this.field2405.field2432 / Statics.field1097;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2394;
                if (this.field2410 - var3 >= 0L) {
                    this.field2394 = var3;
                    break;
                }
                int var5 = (int) ((this.field2410 - this.field2394 + (long) var2 - 1L) / (long) var2);
                this.field2394 += (long) var2 * (long) var5;
                this.field2411.method981(var5);
                arg0 -= var5;
                this.method2729();
            } while (this.field2405.method2826());
        }
        this.field2411.method981(arg0);
    }

    @ObfuscatedName("eg.ac(I)V")
    public void method2729() {
        int var1 = this.field2395;
        int var2 = this.field2414;
        long var3 = this.field2410;
        while (this.field2414 == var2) {
            while (this.field2405.field2439[var1] == var2) {
                this.field2405.method2828(var1);
                int var5 = this.field2405.method2832(var1);
                if (var5 == 1) {
                    this.field2405.method2830();
                    this.field2405.method2829(var1);
                    if (this.field2405.method2849()) {
                        if (!this.field2406 || var2 == 0) {
                            this.method2719();
                            this.field2405.method2825();
                            return;
                        }
                        this.field2405.method2838(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2722(var5);
                }
                this.field2405.method2824(var1);
                this.field2405.method2829(var1);
            }
            var1 = this.field2405.method2852();
            var2 = this.field2405.field2439[var1];
            var3 = this.field2405.method2835(var2);
        }
        this.field2395 = var1;
        this.field2414 = var2;
        this.field2410 = var3;
    }

    @ObfuscatedName("eg.an(Leq;I)Z")
    public boolean method2742(class146 arg0) {
        if (arg0.field2463 != null) {
            return false;
        }
        if (arg0.field2452 >= 0) {
            arg0.method3309();
            if (arg0.field2449 > 0 && this.field2404[arg0.field2461][arg0.field2449] == arg0) {
                this.field2404[arg0.field2461][arg0.field2449] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("eg.ai(Leq;[IIIB)Z")
    public boolean method2733(class146 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2464 = Statics.field1097 / 100;
        if (arg0.field2452 >= 0 && arg0.field2463 == null || arg0.field2463.method1093()) {
            arg0.method2880();
            arg0.method3309();
            if (arg0.field2449 > 0 && this.field2404[arg0.field2461][arg0.field2449] == arg0) {
                this.field2404[arg0.field2461][arg0.field2449] = null;
            }
            return true;
        }
        int var5 = arg0.field2455;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2396[arg0.field2461] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2455 = var6;
        }
        arg0.field2463.method1021(this.method2797(arg0));
        class143 var7 = arg0.field2448;
        boolean var8 = false;
        arg0.field2466++;
        arg0.field2462 += var7.field2422;
        double var9 = (double) ((arg0.field2450 - 60 << 8) + (arg0.field2467 * arg0.field2455 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2417 > 0) {
            if (var7.field2415 > 0) {
                arg0.field2456 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2415 * var9) + 0.5D);
            } else {
                arg0.field2456 += 128;
            }
        }
        if (var7.field2419 != null) {
            if (var7.field2418 > 0) {
                arg0.field2457 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2418 * var9) + 0.5D);
            } else {
                arg0.field2457 += 128;
            }
            while (arg0.field2459 < var7.field2419.length - 2 && arg0.field2457 > (var7.field2419[arg0.field2459 + 2] & 0xFF) << 8) {
                arg0.field2459 += 2;
            }
            if (arg0.field2459 == var7.field2419.length - 2 && var7.field2419[arg0.field2459 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2452 >= 0 && var7.field2416 != null && (this.field2397[arg0.field2461] & 0x1) == 0 && (arg0.field2449 < 0 || this.field2404[arg0.field2461][arg0.field2449] != arg0)) {
            if (var7.field2420 > 0) {
                arg0.field2452 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2420 * var9) + 0.5D);
            } else {
                arg0.field2452 += 128;
            }
            while (arg0.field2460 < var7.field2416.length - 2 && arg0.field2452 > (var7.field2416[arg0.field2460 + 2] & 0xFF) << 8) {
                arg0.field2460 += 2;
            }
            if (arg0.field2460 == var7.field2416.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2463.method971(arg0.field2464, this.method2783(arg0), this.method2726(arg0));
            return false;
        }
        arg0.field2463.method972(arg0.field2464);
        if (arg1 == null) {
            arg0.field2463.method981(arg3);
        } else {
            arg0.field2463.method1059(arg1, arg2, arg3);
        }
        if (arg0.field2463.method976()) {
            this.field2411.field2425.method1116(arg0.field2463);
        }
        arg0.method2880();
        if (arg0.field2452 >= 0) {
            arg0.method3309();
            if (arg0.field2449 > 0 && this.field2404[arg0.field2461][arg0.field2449] == arg0) {
                this.field2404[arg0.field2461][arg0.field2449] = null;
            }
        }
        return true;
    }
}
