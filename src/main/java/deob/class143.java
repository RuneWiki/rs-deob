package deob;

@ObfuscatedName("ed")
public class class143 extends class48 {

    @ObfuscatedName("ed.l")
    public class176 field2385 = new class176(128);

    @ObfuscatedName("ed.b")
    public int field2383 = 256;

    @ObfuscatedName("ed.o")
    public int field2378 = 1000000;

    @ObfuscatedName("ed.r")
    public int[] field2390 = new int[16];

    @ObfuscatedName("ed.k")
    public int[] field2392 = new int[16];

    @ObfuscatedName("ed.z")
    public int[] field2381 = new int[16];

    @ObfuscatedName("ed.g")
    public int[] field2382 = new int[16];

    @ObfuscatedName("ed.n")
    public int[] field2380 = new int[16];

    @ObfuscatedName("ed.j")
    public int[] field2384 = new int[16];

    @ObfuscatedName("ed.c")
    public int[] field2379 = new int[16];

    @ObfuscatedName("ed.m")
    public int[] field2386 = new int[16];

    @ObfuscatedName("ed.a")
    public int[] field2387 = new int[16];

    @ObfuscatedName("ed.d")
    public int[] field2388 = new int[16];

    @ObfuscatedName("ed.i")
    public int[] field2400 = new int[16];

    @ObfuscatedName("ed.p")
    public int[] field2376 = new int[16];

    @ObfuscatedName("ed.h")
    public int[] field2391 = new int[16];

    @ObfuscatedName("ed.f")
    public int[] field2389 = new int[16];

    @ObfuscatedName("ed.t")
    public int[] field2377 = new int[16];

    @ObfuscatedName("ed.x")
    public class147[][] field2394 = new class147[16][128];

    @ObfuscatedName("ed.ar")
    public class147[][] field2395 = new class147[16][128];

    @ObfuscatedName("ed.au")
    public class146 field2396 = new class146();

    @ObfuscatedName("ed.an")
    public boolean field2397;

    @ObfuscatedName("ed.ad")
    public int field2398;

    @ObfuscatedName("ed.at")
    public int field2399;

    @ObfuscatedName("ed.ay")
    public long field2404;

    @ObfuscatedName("ed.ac")
    public long field2401;

    @ObfuscatedName("ed.av")
    public class145 field2402 = new class145(this);

    public class143() {
        this.method2788();
    }

    @ObfuscatedName("ed.l(IB)V")
    public synchronized void method2783(int arg0) {
        this.field2383 = arg0;
    }

    @ObfuscatedName("ed.b(I)I")
    public int method2770() {
        return this.field2383;
    }

    @ObfuscatedName("ed.w(Leb;Lem;Lbm;II)Z")
    public synchronized boolean method2771(class141 arg0, class154 arg1, class58 arg2, int arg3) {
        arg0.method2751();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class177 var7 = (class177) arg0.field2363.method3317(); var7 != null; var7 = (class177) arg0.field2363.method3299()) {
            int var8 = (int) var7.field2837;
            class142 var9 = (class142) this.field2385.method3300((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3034(var8);
                class142 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class142(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2385.method3301(var11, (long) var8);
            }
            if (!var9.method2765(arg2, var7.field2830, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2752();
        }
        return var5;
    }

    @ObfuscatedName("ed.r(I)V")
    public synchronized void method2803() {
        for (class142 var1 = (class142) this.field2385.method3317(); var1 != null; var1 = (class142) this.field2385.method3299()) {
            var1.method2761();
        }
    }

    @ObfuscatedName("ed.k(B)V")
    public synchronized void method2772() {
        for (class142 var1 = (class142) this.field2385.method3317(); var1 != null; var1 = (class142) this.field2385.method3299()) {
            var1.method3360();
        }
    }

    @ObfuscatedName("ed.z(Leb;ZI)V")
    public synchronized void method2773(class141 arg0, boolean arg1) {
        this.method2774();
        this.field2396.method2919(arg0.field2362);
        this.field2397 = arg1;
        this.field2404 = 0L;
        int var3 = this.field2396.method2904();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2396.method2905(var4);
            this.field2396.method2908(var4);
            this.field2396.method2907(var4);
        }
        this.field2398 = this.field2396.method2913();
        this.field2399 = this.field2396.field2426[this.field2398];
        this.field2401 = this.field2396.method2912(this.field2399);
    }

    @ObfuscatedName("ed.g(I)V")
    public synchronized void method2774() {
        this.field2396.method2936();
        this.method2788();
    }

    @ObfuscatedName("ed.n(I)Z")
    public synchronized boolean method2797() {
        return this.field2396.method2918();
    }

    @ObfuscatedName("ed.j(IIB)V")
    public synchronized void method2882(int arg0, int arg1) {
        this.method2777(arg0, arg1);
    }

    @ObfuscatedName("ed.c(III)V")
    public void method2777(int arg0, int arg1) {
        this.field2382[arg0] = arg1;
        this.field2384[arg0] = arg1 & 0xFFFFFF80;
        this.method2778(arg0, arg1);
    }

    @ObfuscatedName("ed.m(III)V")
    public void method2778(int arg0, int arg1) {
        if (this.field2380[arg0] != arg1) {
            this.field2380[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2395[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ed.a(IIII)V")
    public void method2779(int arg0, int arg1, int arg2) {
        this.method2781(arg0, arg1, 64);
        if ((this.field2388[arg0] & 0x2) != 0) {
            for (class147 var4 = (class147) this.field2402.field2418.method3327(); var4 != null; var4 = (class147) this.field2402.field2418.method3348()) {
                if (var4.field2454 == arg0 && var4.field2450 < 0) {
                    this.field2394[arg0][var4.field2441] = null;
                    this.field2394[arg0][arg1] = var4;
                    int var5 = (var4.field2456 * var4.field2446 >> 12) + var4.field2444;
                    var4.field2444 += arg1 - var4.field2441 << 8;
                    var4.field2456 = var5 - var4.field2444;
                    var4.field2446 = 4096;
                    var4.field2441 = arg1;
                    return;
                }
            }
        }
        class142 var6 = (class142) this.field2385.method3300((long) this.field2380[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2365[arg1];
        if (var7 == null) {
            return;
        }
        class147 var8 = new class147();
        var8.field2454 = arg0;
        var8.field2437 = var6;
        var8.field2438 = var7;
        var8.field2445 = var6.field2366[arg1];
        var8.field2440 = var6.field2370[arg1];
        var8.field2441 = arg1;
        var8.field2459 = var6.field2373 * arg2 * arg2 * var6.field2367[arg1] + 1024 >> 11;
        var8.field2443 = var6.field2364[arg1] & 0xFF;
        var8.field2444 = (arg1 << 8) - (var6.field2368[arg1] & 0x7FFF);
        var8.field2447 = 0;
        var8.field2449 = 0;
        var8.field2439 = 0;
        var8.field2450 = -1;
        var8.field2451 = 0;
        if (this.field2391[arg0] == 0) {
            var8.field2442 = class45.method945(var7, this.method2793(var8), this.method2794(var8), this.method2819(var8));
        } else {
            var8.field2442 = class45.method945(var7, this.method2793(var8), 0, this.method2819(var8));
            this.method2815(var8, var6.field2368[arg1] < 0);
        }
        if (var6.field2368[arg1] < 0) {
            var8.field2442.method947(-1);
        }
        if (var8.field2440 >= 0) {
            class147 var9 = this.field2395[arg0][var8.field2440];
            if (var9 != null && var9.field2450 < 0) {
                this.field2394[arg0][var9.field2441] = null;
                var9.field2450 = 0;
            }
            this.field2395[arg0][var8.field2440] = var8;
        }
        this.field2402.field2418.method3321(var8);
        this.field2394[arg0][arg1] = var8;
    }

    @ObfuscatedName("ed.e(Lej;ZB)V")
    public void method2815(class147 arg0, boolean arg1) {
        int var3 = arg0.field2438.field1228.length;
        int var5;
        if (arg1 && arg0.field2438.field1229) {
            int var4 = var3 + var3 - arg0.field2438.field1230;
            var5 = (int) ((long) this.field2391[arg0.field2454] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2442.method1065(true);
            }
        } else {
            var5 = (int) ((long) this.field2391[arg0.field2454] * (long) var3 >> 6);
        }
        arg0.field2442.method956(var5);
    }

    @ObfuscatedName("ed.q(IIIB)V")
    public void method2781(int arg0, int arg1, int arg2) {
        class147 var4 = this.field2394[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2394[arg0][arg1] = null;
        if ((this.field2388[arg0] & 0x2) == 0) {
            var4.field2450 = 0;
            return;
        }
        for (class147 var5 = (class147) this.field2402.field2418.method3343(); var5 != null; var5 = (class147) this.field2402.field2418.method3328()) {
            if (var4.field2454 == var5.field2454 && var5.field2450 < 0 && var4 != var5) {
                var4.field2450 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ed.y(IIII)V")
    public void method2782(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ed.v(IIB)V")
    public void method2874(int arg0, int arg1) {
    }

    @ObfuscatedName("ed.s(III)V")
    public void method2839(int arg0, int arg1) {
        this.field2379[arg0] = arg1;
    }

    @ObfuscatedName("ed.u(II)V")
    public void method2780(int arg0) {
        for (class147 var2 = (class147) this.field2402.field2418.method3343(); var2 != null; var2 = (class147) this.field2402.field2418.method3328()) {
            if (arg0 < 0 || var2.field2454 == arg0) {
                if (var2.field2442 != null) {
                    var2.field2442.method1052(Statics.field745 / 100);
                    if (var2.field2442.method962()) {
                        this.field2402.field2419.method1101(var2.field2442);
                    }
                    var2.method2952();
                }
                if (var2.field2450 < 0) {
                    this.field2394[var2.field2454][var2.field2441] = null;
                }
                var2.method3360();
            }
        }
    }

    @ObfuscatedName("ed.d(II)V")
    public void method2786(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2786(var2);
            }
            return;
        }
        this.field2390[arg0] = 12800;
        this.field2392[arg0] = 8192;
        this.field2381[arg0] = 16383;
        this.field2379[arg0] = 8192;
        this.field2386[arg0] = 0;
        this.field2387[arg0] = 8192;
        this.method2789(arg0);
        this.method2864(arg0);
        this.field2388[arg0] = 0;
        this.field2400[arg0] = 32767;
        this.field2376[arg0] = 256;
        this.field2391[arg0] = 0;
        this.method2792(arg0, 8192);
    }

    @ObfuscatedName("ed.i(II)V")
    public void method2787(int arg0) {
        for (class147 var2 = (class147) this.field2402.field2418.method3343(); var2 != null; var2 = (class147) this.field2402.field2418.method3328()) {
            if ((arg0 < 0 || var2.field2454 == arg0) && var2.field2450 < 0) {
                this.field2394[var2.field2454][var2.field2441] = null;
                var2.field2450 = 0;
            }
        }
    }

    @ObfuscatedName("ed.p(I)V")
    public void method2788() {
        this.method2780(-1);
        this.method2786(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2380[var1] = this.field2382[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2384[var2] = this.field2382[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ed.au(II)V")
    public void method2789(int arg0) {
        if ((this.field2388[arg0] & 0x2) == 0) {
            return;
        }
        for (class147 var2 = (class147) this.field2402.field2418.method3343(); var2 != null; var2 = (class147) this.field2402.field2418.method3328()) {
            if (var2.field2454 == arg0 && this.field2394[arg0][var2.field2441] == null && var2.field2450 < 0) {
                var2.field2450 = 0;
            }
        }
    }

    @ObfuscatedName("ed.an(II)V")
    public void method2864(int arg0) {
        if ((this.field2388[arg0] & 0x4) == 0) {
            return;
        }
        for (class147 var2 = (class147) this.field2402.field2418.method3343(); var2 != null; var2 = (class147) this.field2402.field2418.method3328()) {
            if (var2.field2454 == arg0) {
                var2.field2436 = 0;
            }
        }
    }

    @ObfuscatedName("ed.ad(II)V")
    public void method2791(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2781(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2779(var6, var7, var8);
            } else {
                this.method2781(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2782(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2384[var12] = (var14 << 14) + (this.field2384[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2384[var12] = (var14 << 7) + (this.field2384[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2386[var12] = (var14 << 7) + (this.field2386[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2386[var12] = (this.field2386[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2387[var12] = (var14 << 7) + (this.field2387[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2387[var12] = (this.field2387[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2390[var12] = (var14 << 7) + (this.field2390[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2390[var12] = (this.field2390[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2392[var12] = (var14 << 7) + (this.field2392[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2392[var12] = (this.field2392[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2381[var12] = (var14 << 7) + (this.field2381[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2381[var12] = (this.field2381[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2388[var12] |= 0x1;
                } else {
                    this.field2388[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2388[var12] |= 0x2;
                } else {
                    this.method2789(var12);
                    this.field2388[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2400[var12] = (var14 << 7) + (this.field2400[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2400[var12] = (this.field2400[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2400[var12] = (var14 << 7) + (this.field2400[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2400[var12] = (this.field2400[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2780(var12);
            }
            if (var13 == 121) {
                this.method2786(var12);
            }
            if (var13 == 123) {
                this.method2787(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2400[var12];
                if (var15 == 16384) {
                    this.field2376[var12] = (var14 << 7) + (this.field2376[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2400[var12];
                if (var16 == 16384) {
                    this.field2376[var12] = (this.field2376[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2391[var12] = (var14 << 7) + (this.field2391[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2391[var12] = (this.field2391[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2388[var12] |= 0x4;
                } else {
                    this.method2864(var12);
                    this.field2388[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2792(var12, (var14 << 7) + (this.field2389[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2792(var12, (this.field2389[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2778(var17, this.field2384[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2874(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method2839(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2788();
            }
        }
    }

    @ObfuscatedName("ed.at(III)V")
    public void method2792(int arg0, int arg1) {
        this.field2389[arg0] = arg1;
        this.field2377[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ed.ay(Lej;I)I")
    public int method2793(class147 arg0) {
        int var2 = (arg0.field2456 * arg0.field2446 >> 12) + arg0.field2444;
        int var3 = ((this.field2379[arg0.field2454] - 8192) * this.field2376[arg0.field2454] >> 12) + var2;
        class144 var4 = arg0.field2445;
        if (var4.field2408 > 0 && (var4.field2412 > 0 || this.field2386[arg0.field2454] > 0)) {
            int var5 = var4.field2412 << 2;
            int var6 = var4.field2414 << 1;
            if (arg0.field2452 < var6) {
                var5 = arg0.field2452 * var5 / var6;
            }
            int var7 = (this.field2386[arg0.field2454] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2453 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2438.field1231 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field745 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ed.ac(Lej;B)I")
    public int method2794(class147 arg0) {
        class144 var2 = arg0.field2445;
        int var3 = this.field2390[arg0.field2454] * this.field2381[arg0.field2454] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2459 * var4 + 16384 >> 15;
        int var6 = this.field2383 * var5 + 128 >> 8;
        if (var2.field2410 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2447 * 1.953125E-5D * (double) var2.field2410) + 0.5D);
        }
        if (var2.field2406 != null) {
            int var7 = arg0.field2449;
            int var8 = var2.field2406[arg0.field2439 + 1];
            if (arg0.field2439 < var2.field2406.length - 2) {
                int var9 = (var2.field2406[arg0.field2439] & 0xFF) << 8;
                int var10 = (var2.field2406[arg0.field2439 + 2] & 0xFF) << 8;
                var8 += (var2.field2406[arg0.field2439 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2450 > 0 && var2.field2407 != null) {
            int var11 = arg0.field2450;
            int var12 = var2.field2407[arg0.field2451 + 1];
            if (arg0.field2451 < var2.field2407.length - 2) {
                int var13 = (var2.field2407[arg0.field2451] & 0xFF) << 8;
                int var14 = (var2.field2407[arg0.field2451 + 2] & 0xFF) << 8;
                var12 += (var2.field2407[arg0.field2451 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ed.av(Lej;B)I")
    public int method2819(class147 arg0) {
        int var2 = this.field2392[arg0.field2454];
        return var2 < 8192 ? arg0.field2443 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2443) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ed.h()Las;")
    public synchronized class48 method963() {
        return this.field2402;
    }

    @ObfuscatedName("ed.f()Las;")
    public synchronized class48 method1090() {
        return null;
    }

    @ObfuscatedName("ed.t()I")
    public synchronized int method965() {
        return 0;
    }

    @ObfuscatedName("ed.x([III)V")
    public synchronized void method1095(int[] arg0, int arg1, int arg2) {
        if (this.field2396.method2918()) {
            int var4 = this.field2378 * this.field2396.field2423 / Statics.field745;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2404;
                if (this.field2401 - var5 >= 0L) {
                    this.field2404 = var5;
                    break;
                }
                int var7 = (int) ((this.field2401 - this.field2404 + (long) var4 - 1L) / (long) var4);
                this.field2404 += (long) var4 * (long) var7;
                this.field2402.method1095(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2886();
            } while (this.field2396.method2918());
        }
        this.field2402.method1095(arg0, arg1, arg2);
    }

    @ObfuscatedName("ed.ar(I)V")
    public synchronized void method967(int arg0) {
        if (this.field2396.method2918()) {
            int var2 = this.field2378 * this.field2396.field2423 / Statics.field745;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2404;
                if (this.field2401 - var3 >= 0L) {
                    this.field2404 = var3;
                    break;
                }
                int var5 = (int) ((this.field2401 - this.field2404 + (long) var2 - 1L) / (long) var2);
                this.field2404 += (long) var2 * (long) var5;
                this.field2402.method967(var5);
                arg0 -= var5;
                this.method2886();
            } while (this.field2396.method2918());
        }
        this.field2402.method967(arg0);
    }

    @ObfuscatedName("ed.ae(I)V")
    public void method2886() {
        int var1 = this.field2398;
        int var2 = this.field2399;
        long var3 = this.field2401;
        while (this.field2399 == var2) {
            while (this.field2396.field2426[var1] == var2) {
                this.field2396.method2905(var1);
                int var5 = this.field2396.method2910(var1);
                if (var5 == 1) {
                    this.field2396.method2900();
                    this.field2396.method2907(var1);
                    if (this.field2396.method2909()) {
                        if (!this.field2397 || var2 == 0) {
                            this.method2788();
                            this.field2396.method2936();
                            return;
                        }
                        this.field2396.method2915(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2791(var5);
                }
                this.field2396.method2908(var1);
                this.field2396.method2907(var1);
            }
            var1 = this.field2396.method2913();
            var2 = this.field2396.field2426[var1];
            var3 = this.field2396.method2912(var2);
        }
        this.field2398 = var1;
        this.field2399 = var2;
        this.field2401 = var3;
    }

    @ObfuscatedName("ed.ah(Lej;I)Z")
    public boolean method2799(class147 arg0) {
        if (arg0.field2442 != null) {
            return false;
        }
        if (arg0.field2450 >= 0) {
            arg0.method3360();
            if (arg0.field2440 > 0 && this.field2395[arg0.field2454][arg0.field2440] == arg0) {
                this.field2395[arg0.field2454][arg0.field2440] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ed.aq(Lej;[IIIB)Z")
    public boolean method2800(class147 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2455 = Statics.field745 / 100;
        if (arg0.field2450 >= 0 && arg0.field2442 == null || arg0.field2442.method961()) {
            arg0.method2952();
            arg0.method3360();
            if (arg0.field2440 > 0 && this.field2395[arg0.field2454][arg0.field2440] == arg0) {
                this.field2395[arg0.field2454][arg0.field2440] = null;
            }
            return true;
        }
        int var5 = arg0.field2446;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2387[arg0.field2454] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2446 = var6;
        }
        arg0.field2442.method959(this.method2793(arg0));
        class144 var7 = arg0.field2445;
        boolean var8 = false;
        arg0.field2452++;
        arg0.field2453 += var7.field2408;
        double var9 = (double) ((arg0.field2441 - 60 << 8) + (arg0.field2456 * arg0.field2446 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2410 > 0) {
            if (var7.field2413 > 0) {
                arg0.field2447 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2413 * var9) + 0.5D);
            } else {
                arg0.field2447 += 128;
            }
        }
        if (var7.field2406 != null) {
            if (var7.field2409 > 0) {
                arg0.field2449 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2409 * var9) + 0.5D);
            } else {
                arg0.field2449 += 128;
            }
            while (arg0.field2439 < var7.field2406.length - 2 && arg0.field2449 > (var7.field2406[arg0.field2439 + 2] & 0xFF) << 8) {
                arg0.field2439 += 2;
            }
            if (arg0.field2439 == var7.field2406.length - 2 && var7.field2406[arg0.field2439 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2450 >= 0 && var7.field2407 != null && (this.field2388[arg0.field2454] & 0x1) == 0 && (arg0.field2440 < 0 || this.field2395[arg0.field2454][arg0.field2440] != arg0)) {
            if (var7.field2411 > 0) {
                arg0.field2450 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2411 * var9) + 0.5D);
            } else {
                arg0.field2450 += 128;
            }
            while (arg0.field2451 < var7.field2407.length - 2 && arg0.field2450 > (var7.field2407[arg0.field2451 + 2] & 0xFF) << 8) {
                arg0.field2451 += 2;
            }
            if (arg0.field2451 == var7.field2407.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2442.method949(arg0.field2455, this.method2794(arg0), this.method2819(arg0));
            return false;
        }
        arg0.field2442.method1052(arg0.field2455);
        if (arg1 == null) {
            arg0.field2442.method967(arg3);
        } else {
            arg0.field2442.method1095(arg1, arg2, arg3);
        }
        if (arg0.field2442.method962()) {
            this.field2402.field2419.method1101(arg0.field2442);
        }
        arg0.method2952();
        if (arg0.field2450 >= 0) {
            arg0.method3360();
            if (arg0.field2440 > 0 && this.field2395[arg0.field2454][arg0.field2440] == arg0) {
                this.field2395[arg0.field2454][arg0.field2440] = null;
            }
        }
        return true;
    }
}
