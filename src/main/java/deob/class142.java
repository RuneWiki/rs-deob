package deob;

@ObfuscatedName("ey")
public class class142 extends class48 {

    @ObfuscatedName("ey.p")
    public class175 field2388 = new class175(128);

    @ObfuscatedName("ey.e")
    public int field2399 = 256;

    @ObfuscatedName("ey.a")
    public int field2377 = 1000000;

    @ObfuscatedName("ey.h")
    public int[] field2378 = new int[16];

    @ObfuscatedName("ey.y")
    public int[] field2379 = new int[16];

    @ObfuscatedName("ey.j")
    public int[] field2403 = new int[16];

    @ObfuscatedName("ey.l")
    public int[] field2381 = new int[16];

    @ObfuscatedName("ey.f")
    public int[] field2382 = new int[16];

    @ObfuscatedName("ey.n")
    public int[] field2383 = new int[16];

    @ObfuscatedName("ey.k")
    public int[] field2384 = new int[16];

    @ObfuscatedName("ey.q")
    public int[] field2385 = new int[16];

    @ObfuscatedName("ey.v")
    public int[] field2386 = new int[16];

    @ObfuscatedName("ey.s")
    public int[] field2391 = new int[16];

    @ObfuscatedName("ey.o")
    public int[] field2393 = new int[16];

    @ObfuscatedName("ey.g")
    public int[] field2390 = new int[16];

    @ObfuscatedName("ey.d")
    public int[] field2396 = new int[16];

    @ObfuscatedName("ey.t")
    public int[] field2392 = new int[16];

    @ObfuscatedName("ey.b")
    public int[] field2389 = new int[16];

    @ObfuscatedName("ey.c")
    public class146[][] field2394 = new class146[16][128];

    @ObfuscatedName("ey.aw")
    public class146[][] field2395 = new class146[16][128];

    @ObfuscatedName("ey.ap")
    public class145 field2376 = new class145();

    @ObfuscatedName("ey.am")
    public boolean field2397;

    @ObfuscatedName("ey.az")
    public int field2398;

    @ObfuscatedName("ey.ax")
    public int field2375;

    @ObfuscatedName("ey.af")
    public long field2400;

    @ObfuscatedName("ey.aa")
    public long field2401;

    @ObfuscatedName("ey.ag")
    public class144 field2402 = new class144(this);

    public class142() {
        this.method2830();
    }

    @ObfuscatedName("ey.p(II)V")
    public synchronized void method2812(int arg0) {
        this.field2399 = arg0;
    }

    @ObfuscatedName("ey.e(B)I")
    public int method2813() {
        return this.field2399;
    }

    @ObfuscatedName("ey.h(Len;Leu;Lba;II)Z")
    public synchronized boolean method2884(class140 arg0, class153 arg1, class58 arg2, int arg3) {
        arg0.method2800();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class176 var7 = (class176) arg0.field2362.method3312(); var7 != null; var7 = (class176) arg0.field2362.method3313()) {
            int var8 = (int) var7.field2813;
            class141 var9 = (class141) this.field2388.method3311((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3053(var8);
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
                this.field2388.method3310(var11, (long) var8);
            }
            if (!var9.method2804(arg2, var7.field2807, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2794();
        }
        return var5;
    }

    @ObfuscatedName("ey.y(I)V")
    public synchronized void method2815() {
        for (class141 var1 = (class141) this.field2388.method3312(); var1 != null; var1 = (class141) this.field2388.method3313()) {
            var1.method2805();
        }
    }

    @ObfuscatedName("ey.j(I)V")
    public synchronized void method2816() {
        for (class141 var1 = (class141) this.field2388.method3312(); var1 != null; var1 = (class141) this.field2388.method3313()) {
            var1.method3360();
        }
    }

    @ObfuscatedName("ey.l(Len;ZB)V")
    public synchronized void method2817(class140 arg0, boolean arg1) {
        this.method2909();
        this.field2376.method2922(arg0.field2361);
        this.field2397 = arg1;
        this.field2400 = 0L;
        int var3 = this.field2376.method2925();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2376.method2926(var4);
            this.field2376.method2960(var4);
            this.field2376.method2941(var4);
        }
        this.field2398 = this.field2376.method2933();
        this.field2375 = this.field2376.field2430[this.field2398];
        this.field2401 = this.field2376.method2934(this.field2375);
    }

    @ObfuscatedName("ey.f(B)V")
    public synchronized void method2909() {
        this.field2376.method2964();
        this.method2830();
    }

    @ObfuscatedName("ey.n(I)Z")
    public synchronized boolean method2819() {
        return this.field2376.method2938();
    }

    @ObfuscatedName("ey.k(III)V")
    public synchronized void method2820(int arg0, int arg1) {
        this.method2821(arg0, arg1);
    }

    @ObfuscatedName("ey.q(III)V")
    public void method2821(int arg0, int arg1) {
        this.field2381[arg0] = arg1;
        this.field2383[arg0] = arg1 & 0xFFFFFF80;
        this.method2822(arg0, arg1);
    }

    @ObfuscatedName("ey.w(IIB)V")
    public void method2822(int arg0, int arg1) {
        if (this.field2382[arg0] != arg1) {
            this.field2382[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2395[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ey.v(IIII)V")
    public void method2823(int arg0, int arg1, int arg2) {
        this.method2825(arg0, arg1, 64);
        if ((this.field2391[arg0] & 0x2) != 0) {
            for (class146 var4 = (class146) this.field2402.field2416.method3331(); var4 != null; var4 = (class146) this.field2402.field2416.method3350()) {
                if (var4.field2443 == arg0 && var4.field2438 < 0) {
                    this.field2394[arg0][var4.field2439] = null;
                    this.field2394[arg0][arg1] = var4;
                    int var5 = (var4.field2444 * var4.field2434 >> 12) + var4.field2442;
                    var4.field2442 += arg1 - var4.field2439 << 8;
                    var4.field2434 = var5 - var4.field2442;
                    var4.field2444 = 4096;
                    var4.field2439 = arg1;
                    return;
                }
            }
        }
        class141 var6 = (class141) this.field2388.method3311((long) this.field2382[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2364[arg1];
        if (var7 == null) {
            return;
        }
        class146 var8 = new class146();
        var8.field2443 = arg0;
        var8.field2454 = var6;
        var8.field2436 = var7;
        var8.field2448 = var6.field2369[arg1];
        var8.field2451 = var6.field2366[arg1];
        var8.field2439 = arg1;
        var8.field2435 = var6.field2374 * arg2 * arg2 * var6.field2368[arg1] + 1024 >> 11;
        var8.field2441 = var6.field2367[arg1] & 0xFF;
        var8.field2442 = (arg1 << 8) - (var6.field2365[arg1] & 0x7FFF);
        var8.field2445 = 0;
        var8.field2447 = 0;
        var8.field2440 = 0;
        var8.field2438 = -1;
        var8.field2449 = 0;
        if (this.field2396[arg0] == 0) {
            var8.field2452 = class45.method968(var7, this.method2885(var8), this.method2850(var8), this.method2836(var8));
        } else {
            var8.field2452 = class45.method968(var7, this.method2885(var8), 0, this.method2836(var8));
            this.method2824(var8, var6.field2365[arg1] < 0);
        }
        if (var6.field2365[arg1] < 0) {
            var8.field2452.method970(-1);
        }
        if (var8.field2451 >= 0) {
            class146 var9 = this.field2395[arg0][var8.field2451];
            if (var9 != null && var9.field2438 < 0) {
                this.field2394[arg0][var9.field2439] = null;
                var9.field2438 = 0;
            }
            this.field2395[arg0][var8.field2451] = var8;
        }
        this.field2402.field2416.method3332(var8);
        this.field2394[arg0][arg1] = var8;
    }

    @ObfuscatedName("ey.z(Lek;ZI)V")
    public void method2824(class146 arg0, boolean arg1) {
        int var3 = arg0.field2436.field1236.length;
        int var5;
        if (arg1 && arg0.field2436.field1235) {
            int var4 = var3 + var3 - arg0.field2436.field1237;
            var5 = (int) ((long) this.field2396[arg0.field2443] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2452.method1042(true);
            }
        } else {
            var5 = (int) ((long) this.field2396[arg0.field2443] * (long) var3 >> 6);
        }
        arg0.field2452.method1039(var5);
    }

    @ObfuscatedName("ey.m(IIII)V")
    public void method2825(int arg0, int arg1, int arg2) {
        class146 var4 = this.field2394[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2394[arg0][arg1] = null;
        if ((this.field2391[arg0] & 0x2) == 0) {
            var4.field2438 = 0;
            return;
        }
        for (class146 var5 = (class146) this.field2402.field2416.method3325(); var5 != null; var5 = (class146) this.field2402.field2416.method3333()) {
            if (var4.field2443 == var5.field2443 && var5.field2438 < 0 && var4 != var5) {
                var4.field2438 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ey.r(IIII)V")
    public void method2826(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ey.u(III)V")
    public void method2847(int arg0, int arg1) {
    }

    @ObfuscatedName("ey.i(III)V")
    public void method2866(int arg0, int arg1) {
        this.field2384[arg0] = arg1;
    }

    @ObfuscatedName("ey.x(IB)V")
    public void method2828(int arg0) {
        for (class146 var2 = (class146) this.field2402.field2416.method3325(); var2 != null; var2 = (class146) this.field2402.field2416.method3333()) {
            if (arg0 < 0 || var2.field2443 == arg0) {
                if (var2.field2452 != null) {
                    var2.field2452.method980(Statics.field2457 / 100);
                    if (var2.field2452.method984()) {
                        this.field2402.field2418.method1121(var2.field2452);
                    }
                    var2.method2977();
                }
                if (var2.field2438 < 0) {
                    this.field2394[var2.field2443][var2.field2439] = null;
                }
                var2.method3360();
            }
        }
    }

    @ObfuscatedName("ey.s(II)V")
    public void method2814(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2814(var2);
            }
            return;
        }
        this.field2378[arg0] = 12800;
        this.field2379[arg0] = 8192;
        this.field2403[arg0] = 16383;
        this.field2384[arg0] = 8192;
        this.field2385[arg0] = 0;
        this.field2386[arg0] = 8192;
        this.method2831(arg0);
        this.method2832(arg0);
        this.field2391[arg0] = 0;
        this.field2393[arg0] = 32767;
        this.field2390[arg0] = 256;
        this.field2396[arg0] = 0;
        this.method2833(arg0, 8192);
    }

    @ObfuscatedName("ey.o(II)V")
    public void method2829(int arg0) {
        for (class146 var2 = (class146) this.field2402.field2416.method3325(); var2 != null; var2 = (class146) this.field2402.field2416.method3333()) {
            if ((arg0 < 0 || var2.field2443 == arg0) && var2.field2438 < 0) {
                this.field2394[var2.field2443][var2.field2439] = null;
                var2.field2438 = 0;
            }
        }
    }

    @ObfuscatedName("ey.g(I)V")
    public void method2830() {
        this.method2828(-1);
        this.method2814(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2382[var1] = this.field2381[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2383[var2] = this.field2381[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ey.ap(IB)V")
    public void method2831(int arg0) {
        if ((this.field2391[arg0] & 0x2) == 0) {
            return;
        }
        for (class146 var2 = (class146) this.field2402.field2416.method3325(); var2 != null; var2 = (class146) this.field2402.field2416.method3333()) {
            if (var2.field2443 == arg0 && this.field2394[arg0][var2.field2439] == null && var2.field2438 < 0) {
                var2.field2438 = 0;
            }
        }
    }

    @ObfuscatedName("ey.am(II)V")
    public void method2832(int arg0) {
        if ((this.field2391[arg0] & 0x4) == 0) {
            return;
        }
        for (class146 var2 = (class146) this.field2402.field2416.method3325(); var2 != null; var2 = (class146) this.field2402.field2416.method3333()) {
            if (var2.field2443 == arg0) {
                var2.field2446 = 0;
            }
        }
    }

    @ObfuscatedName("ey.az(II)V")
    public void method2875(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2825(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2823(var6, var7, var8);
            } else {
                this.method2825(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2826(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2383[var12] = (var14 << 14) + (this.field2383[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2383[var12] = (var14 << 7) + (this.field2383[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2385[var12] = (var14 << 7) + (this.field2385[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2385[var12] = (this.field2385[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2386[var12] = (var14 << 7) + (this.field2386[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2386[var12] = (this.field2386[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2378[var12] = (var14 << 7) + (this.field2378[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2378[var12] = (this.field2378[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2379[var12] = (var14 << 7) + (this.field2379[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2379[var12] = (this.field2379[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2403[var12] = (var14 << 7) + (this.field2403[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2403[var12] = (this.field2403[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2391[var12] |= 0x1;
                } else {
                    this.field2391[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2391[var12] |= 0x2;
                } else {
                    this.method2831(var12);
                    this.field2391[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2393[var12] = (var14 << 7) + (this.field2393[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2393[var12] = (this.field2393[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2393[var12] = (var14 << 7) + (this.field2393[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2393[var12] = (this.field2393[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2828(var12);
            }
            if (var13 == 121) {
                this.method2814(var12);
            }
            if (var13 == 123) {
                this.method2829(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2393[var12];
                if (var15 == 16384) {
                    this.field2390[var12] = (var14 << 7) + (this.field2390[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2393[var12];
                if (var16 == 16384) {
                    this.field2390[var12] = (this.field2390[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2396[var12] = (var14 << 7) + (this.field2396[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2396[var12] = (this.field2396[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2391[var12] |= 0x4;
                } else {
                    this.method2832(var12);
                    this.field2391[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2833(var12, (var14 << 7) + (this.field2392[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2833(var12, (this.field2392[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2822(var17, this.field2383[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2847(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method2866(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2830();
            }
        }
    }

    @ObfuscatedName("ey.ax(III)V")
    public void method2833(int arg0, int arg1) {
        this.field2392[arg0] = arg1;
        this.field2389[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ey.af(Lek;I)I")
    public int method2885(class146 arg0) {
        int var2 = (arg0.field2444 * arg0.field2434 >> 12) + arg0.field2442;
        int var3 = ((this.field2384[arg0.field2443] - 8192) * this.field2390[arg0.field2443] >> 12) + var2;
        class143 var4 = arg0.field2448;
        if (var4.field2411 > 0 && (var4.field2412 > 0 || this.field2385[arg0.field2443] > 0)) {
            int var5 = var4.field2412 << 2;
            int var6 = var4.field2413 << 1;
            if (arg0.field2450 < var6) {
                var5 = arg0.field2450 * var5 / var6;
            }
            int var7 = (this.field2385[arg0.field2443] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2437 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2436.field1239 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field2457 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ey.aa(Lek;I)I")
    public int method2850(class146 arg0) {
        class143 var2 = arg0.field2448;
        int var3 = this.field2403[arg0.field2443] * this.field2378[arg0.field2443] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2435 * var4 + 16384 >> 15;
        int var6 = this.field2399 * var5 + 128 >> 8;
        if (var2.field2408 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2445 * 1.953125E-5D * (double) var2.field2408) + 0.5D);
        }
        if (var2.field2406 != null) {
            int var7 = arg0.field2447;
            int var8 = var2.field2406[arg0.field2440 + 1];
            if (arg0.field2440 < var2.field2406.length - 2) {
                int var9 = (var2.field2406[arg0.field2440] & 0xFF) << 8;
                int var10 = (var2.field2406[arg0.field2440 + 2] & 0xFF) << 8;
                var8 += (var2.field2406[arg0.field2440 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2438 > 0 && var2.field2407 != null) {
            int var11 = arg0.field2438;
            int var12 = var2.field2407[arg0.field2449 + 1];
            if (arg0.field2449 < var2.field2407.length - 2) {
                int var13 = (var2.field2407[arg0.field2449] & 0xFF) << 8;
                int var14 = (var2.field2407[arg0.field2449 + 2] & 0xFF) << 8;
                var12 += (var2.field2407[arg0.field2449 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ey.ag(Lek;B)I")
    public int method2836(class146 arg0) {
        int var2 = this.field2379[arg0.field2443];
        return var2 < 8192 ? arg0.field2441 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2441) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ey.d()Las;")
    public synchronized class48 method985() {
        return this.field2402;
    }

    @ObfuscatedName("ey.t()Las;")
    public synchronized class48 method986() {
        return null;
    }

    @ObfuscatedName("ey.b()I")
    public synchronized int method1041() {
        return 0;
    }

    @ObfuscatedName("ey.c([III)V")
    public synchronized void method994(int[] arg0, int arg1, int arg2) {
        if (this.field2376.method2938()) {
            int var4 = this.field2377 * this.field2376.field2421 / Statics.field2457;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2400;
                if (this.field2401 - var5 >= 0L) {
                    this.field2400 = var5;
                    break;
                }
                int var7 = (int) ((this.field2401 - this.field2400 + (long) var4 - 1L) / (long) var4);
                this.field2400 += (long) var4 * (long) var7;
                this.field2402.method994(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2863();
            } while (this.field2376.method2938());
        }
        this.field2402.method994(arg0, arg1, arg2);
    }

    @ObfuscatedName("ey.aw(I)V")
    public synchronized void method1061(int arg0) {
        if (this.field2376.method2938()) {
            int var2 = this.field2377 * this.field2376.field2421 / Statics.field2457;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2400;
                if (this.field2401 - var3 >= 0L) {
                    this.field2400 = var3;
                    break;
                }
                int var5 = (int) ((this.field2401 - this.field2400 + (long) var2 - 1L) / (long) var2);
                this.field2400 += (long) var2 * (long) var5;
                this.field2402.method1061(var5);
                arg0 -= var5;
                this.method2863();
            } while (this.field2376.method2938());
        }
        this.field2402.method1061(arg0);
    }

    @ObfuscatedName("ey.aj(I)V")
    public void method2863() {
        int var1 = this.field2398;
        int var2 = this.field2375;
        long var3 = this.field2401;
        while (this.field2375 == var2) {
            while (this.field2376.field2430[var1] == var2) {
                this.field2376.method2926(var1);
                int var5 = this.field2376.method2931(var1);
                if (var5 == 1) {
                    this.field2376.method2929();
                    this.field2376.method2941(var1);
                    if (this.field2376.method2936()) {
                        if (!this.field2397 || var2 == 0) {
                            this.method2830();
                            this.field2376.method2964();
                            return;
                        }
                        this.field2376.method2937(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2875(var5);
                }
                this.field2376.method2960(var1);
                this.field2376.method2941(var1);
            }
            var1 = this.field2376.method2933();
            var2 = this.field2376.field2430[var1];
            var3 = this.field2376.method2934(var2);
        }
        this.field2398 = var1;
        this.field2375 = var2;
        this.field2401 = var3;
    }

    @ObfuscatedName("ey.aq(Lek;I)Z")
    public boolean method2839(class146 arg0) {
        if (arg0.field2452 != null) {
            return false;
        }
        if (arg0.field2438 >= 0) {
            arg0.method3360();
            if (arg0.field2451 > 0 && this.field2395[arg0.field2443][arg0.field2451] == arg0) {
                this.field2395[arg0.field2443][arg0.field2451] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ey.ah(Lek;[IIII)Z")
    public boolean method2840(class146 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2453 = Statics.field2457 / 100;
        if (arg0.field2438 >= 0 && arg0.field2452 == null || arg0.field2452.method983()) {
            arg0.method2977();
            arg0.method3360();
            if (arg0.field2451 > 0 && this.field2395[arg0.field2443][arg0.field2451] == arg0) {
                this.field2395[arg0.field2443][arg0.field2451] = null;
            }
            return true;
        }
        int var5 = arg0.field2444;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2386[arg0.field2443] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2444 = var6;
        }
        arg0.field2452.method981(this.method2885(arg0));
        class143 var7 = arg0.field2448;
        boolean var8 = false;
        arg0.field2450++;
        arg0.field2437 += var7.field2411;
        double var9 = (double) ((arg0.field2439 - 60 << 8) + (arg0.field2444 * arg0.field2434 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2408 > 0) {
            if (var7.field2410 > 0) {
                arg0.field2445 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2410 * var9) + 0.5D);
            } else {
                arg0.field2445 += 128;
            }
        }
        if (var7.field2406 != null) {
            if (var7.field2409 > 0) {
                arg0.field2447 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2409 * var9) + 0.5D);
            } else {
                arg0.field2447 += 128;
            }
            while (arg0.field2440 < var7.field2406.length - 2 && arg0.field2447 > (var7.field2406[arg0.field2440 + 2] & 0xFF) << 8) {
                arg0.field2440 += 2;
            }
            if (arg0.field2440 == var7.field2406.length - 2 && var7.field2406[arg0.field2440 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2438 >= 0 && var7.field2407 != null && (this.field2391[arg0.field2443] & 0x1) == 0 && (arg0.field2451 < 0 || this.field2395[arg0.field2443][arg0.field2451] != arg0)) {
            if (var7.field2414 > 0) {
                arg0.field2438 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2414 * var9) + 0.5D);
            } else {
                arg0.field2438 += 128;
            }
            while (arg0.field2449 < var7.field2407.length - 2 && arg0.field2438 > (var7.field2407[arg0.field2449 + 2] & 0xFF) << 8) {
                arg0.field2449 += 2;
            }
            if (arg0.field2449 == var7.field2407.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2452.method979(arg0.field2453, this.method2850(arg0), this.method2836(arg0));
            return false;
        }
        arg0.field2452.method980(arg0.field2453);
        if (arg1 == null) {
            arg0.field2452.method1061(arg3);
        } else {
            arg0.field2452.method994(arg1, arg2, arg3);
        }
        if (arg0.field2452.method984()) {
            this.field2402.field2418.method1121(arg0.field2452);
        }
        arg0.method2977();
        if (arg0.field2438 >= 0) {
            arg0.method3360();
            if (arg0.field2451 > 0 && this.field2395[arg0.field2443][arg0.field2451] == arg0) {
                this.field2395[arg0.field2443][arg0.field2451] = null;
            }
        }
        return true;
    }
}
