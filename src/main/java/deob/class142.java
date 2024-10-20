package deob;

@ObfuscatedName("em")
public class class142 extends class48 {

    @ObfuscatedName("em.g")
    public class175 field2394 = new class175(128);

    @ObfuscatedName("em.h")
    public int field2404 = 256;

    @ObfuscatedName("em.s")
    public int field2401 = 1000000;

    @ObfuscatedName("em.o")
    public int[] field2379 = new int[16];

    @ObfuscatedName("em.p")
    public int[] field2380 = new int[16];

    @ObfuscatedName("em.x")
    public int[] field2391 = new int[16];

    @ObfuscatedName("em.k")
    public int[] field2382 = new int[16];

    @ObfuscatedName("em.r")
    public int[] field2383 = new int[16];

    @ObfuscatedName("em.z")
    public int[] field2384 = new int[16];

    @ObfuscatedName("em.n")
    public int[] field2385 = new int[16];

    @ObfuscatedName("em.j")
    public int[] field2386 = new int[16];

    @ObfuscatedName("em.b")
    public int[] field2387 = new int[16];

    @ObfuscatedName("em.f")
    public int[] field2377 = new int[16];

    @ObfuscatedName("em.y")
    public int[] field2390 = new int[16];

    @ObfuscatedName("em.v")
    public int[] field2402 = new int[16];

    @ObfuscatedName("em.w")
    public int[] field2392 = new int[16];

    @ObfuscatedName("em.d")
    public int[] field2393 = new int[16];

    @ObfuscatedName("em.i")
    public int[] field2397 = new int[16];

    @ObfuscatedName("em.c")
    public class146[][] field2395 = new class146[16][128];

    @ObfuscatedName("em.af")
    public class146[][] field2396 = new class146[16][128];

    @ObfuscatedName("em.aq")
    public class145 field2376 = new class145();

    @ObfuscatedName("em.at")
    public boolean field2398;

    @ObfuscatedName("em.aw")
    public int field2399;

    @ObfuscatedName("em.ax")
    public int field2381;

    @ObfuscatedName("em.ak")
    public long field2400;

    @ObfuscatedName("em.ar")
    public long field2389;

    @ObfuscatedName("em.az")
    public class144 field2403 = new class144(this);

    public class142() {
        this.method2860();
    }

    @ObfuscatedName("em.g(IB)V")
    public synchronized void method2832(int arg0) {
        this.field2404 = arg0;
    }

    @ObfuscatedName("em.h(I)I")
    public int method2815() {
        return this.field2404;
    }

    @ObfuscatedName("em.o(Len;Leu;Lbg;II)Z")
    public synchronized boolean method2816(class140 arg0, class153 arg1, class58 arg2, int arg3) {
        arg0.method2800();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class176 var7 = (class176) arg0.field2363.method3352(); var7 != null; var7 = (class176) arg0.field2363.method3353()) {
            int var8 = (int) var7.field2823;
            class141 var9 = (class141) this.field2394.method3354((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3087(var8);
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
                this.field2394.method3364(var11, (long) var8);
            }
            if (!var9.method2812(arg2, var7.field2817, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2801();
        }
        return var5;
    }

    @ObfuscatedName("em.p(B)V")
    public synchronized void method2817() {
        for (class141 var1 = (class141) this.field2394.method3352(); var1 != null; var1 = (class141) this.field2394.method3353()) {
            var1.method2807();
        }
    }

    @ObfuscatedName("em.x(I)V")
    public synchronized void method2866() {
        for (class141 var1 = (class141) this.field2394.method3352(); var1 != null; var1 = (class141) this.field2394.method3353()) {
            var1.method3404();
        }
    }

    @ObfuscatedName("em.k(Len;ZI)V")
    public synchronized void method2819(class140 arg0, boolean arg1) {
        this.method2863();
        this.field2376.method2983(arg0.field2364);
        this.field2398 = arg1;
        this.field2400 = 0L;
        int var3 = this.field2376.method2929();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2376.method2930(var4);
            this.field2376.method2933(var4);
            this.field2376.method2931(var4);
        }
        this.field2399 = this.field2376.method2979();
        this.field2381 = this.field2376.field2427[this.field2399];
        this.field2389 = this.field2376.method2937(this.field2381);
    }

    @ObfuscatedName("em.r(I)V")
    public synchronized void method2863() {
        this.field2376.method2984();
        this.method2860();
    }

    @ObfuscatedName("em.z(I)Z")
    public synchronized boolean method2821() {
        return this.field2376.method2925();
    }

    @ObfuscatedName("em.n(III)V")
    public synchronized void method2822(int arg0, int arg1) {
        this.method2823(arg0, arg1);
    }

    @ObfuscatedName("em.j(III)V")
    public void method2823(int arg0, int arg1) {
        this.field2382[arg0] = arg1;
        this.field2384[arg0] = arg1 & 0xFFFFFF80;
        this.method2824(arg0, arg1);
    }

    @ObfuscatedName("em.b(III)V")
    public void method2824(int arg0, int arg1) {
        if (this.field2383[arg0] != arg1) {
            this.field2383[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2396[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("em.t(IIII)V")
    public void method2825(int arg0, int arg1, int arg2) {
        this.method2904(arg0, arg1, 64);
        if ((this.field2377[arg0] & 0x2) != 0) {
            for (class146 var4 = (class146) this.field2403.field2421.method3374(); var4 != null; var4 = (class146) this.field2403.field2421.method3376()) {
                if (var4.field2451 == arg0 && var4.field2454 < 0) {
                    this.field2395[arg0][var4.field2445] = null;
                    this.field2395[arg0][arg1] = var4;
                    int var5 = (var4.field2450 * var4.field2448 >> 12) + var4.field2457;
                    var4.field2457 += arg1 - var4.field2445 << 8;
                    var4.field2448 = var5 - var4.field2457;
                    var4.field2450 = 4096;
                    var4.field2445 = arg1;
                    return;
                }
            }
        }
        class141 var6 = (class141) this.field2394.method3354((long) this.field2383[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2366[arg1];
        if (var7 == null) {
            return;
        }
        class146 var8 = new class146();
        var8.field2451 = arg0;
        var8.field2441 = var6;
        var8.field2442 = var7;
        var8.field2449 = var6.field2374[arg1];
        var8.field2444 = var6.field2371[arg1];
        var8.field2445 = arg1;
        var8.field2446 = var6.field2370 * arg2 * arg2 * var6.field2372[arg1] + 1024 >> 11;
        var8.field2447 = var6.field2369[arg1] & 0xFF;
        var8.field2457 = (arg1 << 8) - (var6.field2367[arg1] & 0x7FFF);
        var8.field2463 = 0;
        var8.field2440 = 0;
        var8.field2453 = 0;
        var8.field2454 = -1;
        var8.field2455 = 0;
        if (this.field2392[arg0] == 0) {
            var8.field2458 = class45.method965(var7, this.method2869(var8), this.method2840(var8), this.method2841(var8));
        } else {
            var8.field2458 = class45.method965(var7, this.method2869(var8), 0, this.method2841(var8));
            this.method2909(var8, var6.field2367[arg1] < 0);
        }
        if (var6.field2367[arg1] < 0) {
            var8.field2458.method967(-1);
        }
        if (var8.field2444 >= 0) {
            class146 var9 = this.field2396[arg0][var8.field2444];
            if (var9 != null && var9.field2454 < 0) {
                this.field2395[arg0][var9.field2445] = null;
                var9.field2454 = 0;
            }
            this.field2396[arg0][var8.field2444] = var8;
        }
        this.field2403.field2421.method3381(var8);
        this.field2395[arg0][arg1] = var8;
    }

    @ObfuscatedName("em.q(Lev;ZI)V")
    public void method2909(class146 arg0, boolean arg1) {
        int var3 = arg0.field2442.field1242.length;
        int var5;
        if (arg1 && arg0.field2442.field1244) {
            int var4 = var3 + var3 - arg0.field2442.field1240;
            var5 = (int) ((long) this.field2392[arg0.field2451] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2458.method1106(true);
            }
        } else {
            var5 = (int) ((long) this.field2392[arg0.field2451] * (long) var3 >> 6);
        }
        arg0.field2458.method973(var5);
    }

    @ObfuscatedName("em.e(IIII)V")
    public void method2904(int arg0, int arg1, int arg2) {
        class146 var4 = this.field2395[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2395[arg0][arg1] = null;
        if ((this.field2377[arg0] & 0x2) == 0) {
            var4.field2454 = 0;
            return;
        }
        for (class146 var5 = (class146) this.field2403.field2421.method3373(); var5 != null; var5 = (class146) this.field2403.field2421.method3375()) {
            if (var4.field2451 == var5.field2451 && var5.field2454 < 0 && var4 != var5) {
                var4.field2454 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("em.l(IIII)V")
    public void method2828(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("em.u(III)V")
    public void method2829(int arg0, int arg1) {
    }

    @ObfuscatedName("em.m(III)V")
    public void method2830(int arg0, int arg1) {
        this.field2385[arg0] = arg1;
    }

    @ObfuscatedName("em.a(II)V")
    public void method2831(int arg0) {
        for (class146 var2 = (class146) this.field2403.field2421.method3373(); var2 != null; var2 = (class146) this.field2403.field2421.method3375()) {
            if (arg0 < 0 || var2.field2451 == arg0) {
                if (var2.field2458 != null) {
                    var2.field2458.method1031(Statics.field1105 / 100);
                    if (var2.field2458.method1120()) {
                        this.field2403.field2422.method1137(var2.field2458);
                    }
                    var2.method2985();
                }
                if (var2.field2454 < 0) {
                    this.field2395[var2.field2451][var2.field2445] = null;
                }
                var2.method3404();
            }
        }
    }

    @ObfuscatedName("em.f(IB)V")
    public void method2891(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2891(var2);
            }
            return;
        }
        this.field2379[arg0] = 12800;
        this.field2380[arg0] = 8192;
        this.field2391[arg0] = 16383;
        this.field2385[arg0] = 8192;
        this.field2386[arg0] = 0;
        this.field2387[arg0] = 8192;
        this.method2826(arg0);
        this.method2893(arg0);
        this.field2377[arg0] = 0;
        this.field2390[arg0] = 32767;
        this.field2402[arg0] = 256;
        this.field2392[arg0] = 0;
        this.method2838(arg0, 8192);
    }

    @ObfuscatedName("em.y(II)V")
    public void method2833(int arg0) {
        for (class146 var2 = (class146) this.field2403.field2421.method3373(); var2 != null; var2 = (class146) this.field2403.field2421.method3375()) {
            if ((arg0 < 0 || var2.field2451 == arg0) && var2.field2454 < 0) {
                this.field2395[var2.field2451][var2.field2445] = null;
                var2.field2454 = 0;
            }
        }
    }

    @ObfuscatedName("em.v(I)V")
    public void method2860() {
        this.method2831(-1);
        this.method2891(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2383[var1] = this.field2382[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2384[var2] = this.field2382[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("em.aq(IB)V")
    public void method2826(int arg0) {
        if ((this.field2377[arg0] & 0x2) == 0) {
            return;
        }
        for (class146 var2 = (class146) this.field2403.field2421.method3373(); var2 != null; var2 = (class146) this.field2403.field2421.method3375()) {
            if (var2.field2451 == arg0 && this.field2395[arg0][var2.field2445] == null && var2.field2454 < 0) {
                var2.field2454 = 0;
            }
        }
    }

    @ObfuscatedName("em.at(IB)V")
    public void method2893(int arg0) {
        if ((this.field2377[arg0] & 0x4) == 0) {
            return;
        }
        for (class146 var2 = (class146) this.field2403.field2421.method3373(); var2 != null; var2 = (class146) this.field2403.field2421.method3375()) {
            if (var2.field2451 == arg0) {
                var2.field2460 = 0;
            }
        }
    }

    @ObfuscatedName("em.aw(II)V")
    public void method2892(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2904(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2825(var6, var7, var8);
            } else {
                this.method2904(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2828(var9, var10, var11);
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
                this.field2379[var12] = (var14 << 7) + (this.field2379[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2379[var12] = (this.field2379[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2380[var12] = (var14 << 7) + (this.field2380[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2380[var12] = (this.field2380[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2391[var12] = (var14 << 7) + (this.field2391[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2391[var12] = (this.field2391[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2377[var12] |= 0x1;
                } else {
                    this.field2377[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2377[var12] |= 0x2;
                } else {
                    this.method2826(var12);
                    this.field2377[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2390[var12] = (var14 << 7) + (this.field2390[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2390[var12] = (this.field2390[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2390[var12] = (var14 << 7) + (this.field2390[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2390[var12] = (this.field2390[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2831(var12);
            }
            if (var13 == 121) {
                this.method2891(var12);
            }
            if (var13 == 123) {
                this.method2833(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2390[var12];
                if (var15 == 16384) {
                    this.field2402[var12] = (var14 << 7) + (this.field2402[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2390[var12];
                if (var16 == 16384) {
                    this.field2402[var12] = (this.field2402[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2392[var12] = (var14 << 7) + (this.field2392[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2392[var12] = (this.field2392[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2377[var12] |= 0x4;
                } else {
                    this.method2893(var12);
                    this.field2377[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2838(var12, (var14 << 7) + (this.field2393[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2838(var12, (this.field2393[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2824(var17, this.field2384[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2829(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method2830(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2860();
            }
        }
    }

    @ObfuscatedName("em.ax(IIB)V")
    public void method2838(int arg0, int arg1) {
        this.field2393[arg0] = arg1;
        this.field2397[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("em.ak(Lev;I)I")
    public int method2869(class146 arg0) {
        int var2 = (arg0.field2450 * arg0.field2448 >> 12) + arg0.field2457;
        int var3 = ((this.field2385[arg0.field2451] - 8192) * this.field2402[arg0.field2451] >> 12) + var2;
        class143 var4 = arg0.field2449;
        if (var4.field2417 > 0 && (var4.field2413 > 0 || this.field2386[arg0.field2451] > 0)) {
            int var5 = var4.field2413 << 2;
            int var6 = var4.field2412 << 1;
            if (arg0.field2456 < var6) {
                var5 = arg0.field2456 * var5 / var6;
            }
            int var7 = (this.field2386[arg0.field2451] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2452 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2442.field1241 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1105 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("em.ar(Lev;I)I")
    public int method2840(class146 arg0) {
        class143 var2 = arg0.field2449;
        int var3 = this.field2391[arg0.field2451] * this.field2379[arg0.field2451] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2446 * var4 + 16384 >> 15;
        int var6 = this.field2404 * var5 + 128 >> 8;
        if (var2.field2409 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2463 * 1.953125E-5D * (double) var2.field2409) + 0.5D);
        }
        if (var2.field2414 != null) {
            int var7 = arg0.field2440;
            int var8 = var2.field2414[arg0.field2453 + 1];
            if (arg0.field2453 < var2.field2414.length - 2) {
                int var9 = (var2.field2414[arg0.field2453] & 0xFF) << 8;
                int var10 = (var2.field2414[arg0.field2453 + 2] & 0xFF) << 8;
                var8 += (var2.field2414[arg0.field2453 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2454 > 0 && var2.field2407 != null) {
            int var11 = arg0.field2454;
            int var12 = var2.field2407[arg0.field2455 + 1];
            if (arg0.field2455 < var2.field2407.length - 2) {
                int var13 = (var2.field2407[arg0.field2455] & 0xFF) << 8;
                int var14 = (var2.field2407[arg0.field2455 + 2] & 0xFF) << 8;
                var12 += (var2.field2407[arg0.field2455 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("em.az(Lev;I)I")
    public int method2841(class146 arg0) {
        int var2 = this.field2380[arg0.field2451];
        return var2 < 8192 ? arg0.field2447 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2447) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("em.w()Lao;")
    public synchronized class48 method983() {
        return this.field2403;
    }

    @ObfuscatedName("em.d()Lao;")
    public synchronized class48 method982() {
        return null;
    }

    @ObfuscatedName("em.i()I")
    public synchronized int method985() {
        return 0;
    }

    @ObfuscatedName("em.c([III)V")
    public synchronized void method986(int[] arg0, int arg1, int arg2) {
        if (this.field2376.method2925()) {
            int var4 = this.field2401 * this.field2376.field2428 / Statics.field1105;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2400;
                if (this.field2389 - var5 >= 0L) {
                    this.field2400 = var5;
                    break;
                }
                int var7 = (int) ((this.field2389 - this.field2400 + (long) var4 - 1L) / (long) var4);
                this.field2400 += (long) var4 * (long) var7;
                this.field2403.method986(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2834();
            } while (this.field2376.method2925());
        }
        this.field2403.method986(arg0, arg1, arg2);
    }

    @ObfuscatedName("em.af(I)V")
    public synchronized void method991(int arg0) {
        if (this.field2376.method2925()) {
            int var2 = this.field2401 * this.field2376.field2428 / Statics.field1105;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2400;
                if (this.field2389 - var3 >= 0L) {
                    this.field2400 = var3;
                    break;
                }
                int var5 = (int) ((this.field2389 - this.field2400 + (long) var2 - 1L) / (long) var2);
                this.field2400 += (long) var2 * (long) var5;
                this.field2403.method991(var5);
                arg0 -= var5;
                this.method2834();
            } while (this.field2376.method2925());
        }
        this.field2403.method991(arg0);
    }

    @ObfuscatedName("em.ai(I)V")
    public void method2834() {
        int var1 = this.field2399;
        int var2 = this.field2381;
        long var3 = this.field2389;
        while (this.field2381 == var2) {
            while (this.field2376.field2427[var1] == var2) {
                this.field2376.method2930(var1);
                int var5 = this.field2376.method2940(var1);
                if (var5 == 1) {
                    this.field2376.method2932();
                    this.field2376.method2931(var1);
                    if (this.field2376.method2926()) {
                        if (!this.field2398 || var2 == 0) {
                            this.method2860();
                            this.field2376.method2984();
                            return;
                        }
                        this.field2376.method2954(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2892(var5);
                }
                this.field2376.method2933(var1);
                this.field2376.method2931(var1);
            }
            var1 = this.field2376.method2979();
            var2 = this.field2376.field2427[var1];
            var3 = this.field2376.method2937(var2);
        }
        this.field2399 = var1;
        this.field2381 = var2;
        this.field2389 = var3;
    }

    @ObfuscatedName("em.aj(Lev;I)Z")
    public boolean method2882(class146 arg0) {
        if (arg0.field2458 != null) {
            return false;
        }
        if (arg0.field2454 >= 0) {
            arg0.method3404();
            if (arg0.field2444 > 0 && this.field2396[arg0.field2451][arg0.field2444] == arg0) {
                this.field2396[arg0.field2451][arg0.field2444] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("em.ap(Lev;[IIIB)Z")
    public boolean method2844(class146 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2459 = Statics.field1105 / 100;
        if (arg0.field2454 >= 0 && arg0.field2458 == null || arg0.field2458.method981()) {
            arg0.method2985();
            arg0.method3404();
            if (arg0.field2444 > 0 && this.field2396[arg0.field2451][arg0.field2444] == arg0) {
                this.field2396[arg0.field2451][arg0.field2444] = null;
            }
            return true;
        }
        int var5 = arg0.field2450;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2387[arg0.field2451] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2450 = var6;
        }
        arg0.field2458.method1087(this.method2869(arg0));
        class143 var7 = arg0.field2449;
        boolean var8 = false;
        arg0.field2456++;
        arg0.field2452 += var7.field2417;
        double var9 = (double) ((arg0.field2445 - 60 << 8) + (arg0.field2450 * arg0.field2448 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2409 > 0) {
            if (var7.field2408 > 0) {
                arg0.field2463 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2408 * var9) + 0.5D);
            } else {
                arg0.field2463 += 128;
            }
        }
        if (var7.field2414 != null) {
            if (var7.field2410 > 0) {
                arg0.field2440 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2410 * var9) + 0.5D);
            } else {
                arg0.field2440 += 128;
            }
            while (arg0.field2453 < var7.field2414.length - 2 && arg0.field2440 > (var7.field2414[arg0.field2453 + 2] & 0xFF) << 8) {
                arg0.field2453 += 2;
            }
            if (arg0.field2453 == var7.field2414.length - 2 && var7.field2414[arg0.field2453 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2454 >= 0 && var7.field2407 != null && (this.field2377[arg0.field2451] & 0x1) == 0 && (arg0.field2444 < 0 || this.field2396[arg0.field2451][arg0.field2444] != arg0)) {
            if (var7.field2411 > 0) {
                arg0.field2454 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2411 * var9) + 0.5D);
            } else {
                arg0.field2454 += 128;
            }
            while (arg0.field2455 < var7.field2407.length - 2 && arg0.field2454 > (var7.field2407[arg0.field2455 + 2] & 0xFF) << 8) {
                arg0.field2455 += 2;
            }
            if (arg0.field2455 == var7.field2407.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2458.method977(arg0.field2459, this.method2840(arg0), this.method2841(arg0));
            return false;
        }
        arg0.field2458.method1031(arg0.field2459);
        if (arg1 == null) {
            arg0.field2458.method991(arg3);
        } else {
            arg0.field2458.method986(arg1, arg2, arg3);
        }
        if (arg0.field2458.method1120()) {
            this.field2403.field2422.method1137(arg0.field2458);
        }
        arg0.method2985();
        if (arg0.field2454 >= 0) {
            arg0.method3404();
            if (arg0.field2444 > 0 && this.field2396[arg0.field2451][arg0.field2444] == arg0) {
                this.field2396[arg0.field2451][arg0.field2444] = null;
            }
        }
        return true;
    }
}
