package deob;

@ObfuscatedName("et")
public class class142 extends class48 {

    @ObfuscatedName("et.j")
    public class175 field2387 = new class175(128);

    @ObfuscatedName("et.f")
    public int field2383 = 256;

    @ObfuscatedName("et.o")
    public int field2366 = 1000000;

    @ObfuscatedName("et.h")
    public int[] field2367 = new int[16];

    @ObfuscatedName("et.u")
    public int[] field2372 = new int[16];

    @ObfuscatedName("et.a")
    public int[] field2369 = new int[16];

    @ObfuscatedName("et.q")
    public int[] field2370 = new int[16];

    @ObfuscatedName("et.t")
    public int[] field2376 = new int[16];

    @ObfuscatedName("et.n")
    public int[] field2375 = new int[16];

    @ObfuscatedName("et.i")
    public int[] field2374 = new int[16];

    @ObfuscatedName("et.c")
    public int[] field2371 = new int[16];

    @ObfuscatedName("et.b")
    public int[] field2373 = new int[16];

    @ObfuscatedName("et.w")
    public int[] field2378 = new int[16];

    @ObfuscatedName("et.z")
    public int[] field2379 = new int[16];

    @ObfuscatedName("et.p")
    public int[] field2380 = new int[16];

    @ObfuscatedName("et.v")
    public int[] field2381 = new int[16];

    @ObfuscatedName("et.d")
    public int[] field2382 = new int[16];

    @ObfuscatedName("et.e")
    public int[] field2392 = new int[16];

    @ObfuscatedName("et.y")
    public class146[][] field2384 = new class146[16][128];

    @ObfuscatedName("et.aw")
    public class146[][] field2388 = new class146[16][128];

    @ObfuscatedName("et.ai")
    public class145 field2386 = new class145();

    @ObfuscatedName("et.ah")
    public boolean field2393;

    @ObfuscatedName("et.ad")
    public int field2377;

    @ObfuscatedName("et.ak")
    public int field2389;

    @ObfuscatedName("et.ap")
    public long field2390;

    @ObfuscatedName("et.al")
    public long field2391;

    @ObfuscatedName("et.am")
    public class144 field2385 = new class144(this);

    public class142() {
        this.method2864();
    }

    @ObfuscatedName("et.j(IB)V")
    public synchronized void method2782(int arg0) {
        this.field2383 = arg0;
    }

    @ObfuscatedName("et.f(I)I")
    public int method2800() {
        return this.field2383;
    }

    @ObfuscatedName("et.h(Lem;Lew;Lbl;II)Z")
    public synchronized boolean method2784(class140 arg0, class153 arg1, class58 arg2, int arg3) {
        arg0.method2763();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class176 var7 = (class176) arg0.field2351.method3298(); var7 != null; var7 = (class176) arg0.field2351.method3299()) {
            int var8 = (int) var7.field2813;
            class141 var9 = (class141) this.field2387.method3296((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3032(var8);
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
                this.field2387.method3297(var11, (long) var8);
            }
            if (!var9.method2780(arg2, var7.field2806, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2764();
        }
        return var5;
    }

    @ObfuscatedName("et.u(I)V")
    public synchronized void method2785() {
        for (class141 var1 = (class141) this.field2387.method3298(); var1 != null; var1 = (class141) this.field2387.method3299()) {
            var1.method2773();
        }
    }

    @ObfuscatedName("et.a(I)V")
    public synchronized void method2819() {
        for (class141 var1 = (class141) this.field2387.method3298(); var1 != null; var1 = (class141) this.field2387.method3299()) {
            var1.method3349();
        }
    }

    @ObfuscatedName("et.q(Lem;ZS)V")
    public synchronized void method2827(class140 arg0, boolean arg1) {
        this.method2850();
        this.field2386.method2896(arg0.field2352);
        this.field2393 = arg1;
        this.field2390 = 0L;
        int var3 = this.field2386.method2886();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2386.method2887(var4);
            this.field2386.method2890(var4);
            this.field2386.method2891(var4);
        }
        this.field2377 = this.field2386.method2895();
        this.field2389 = this.field2386.field2414[this.field2377];
        this.field2391 = this.field2386.method2894(this.field2389);
    }

    @ObfuscatedName("et.t(I)V")
    public synchronized void method2850() {
        this.field2386.method2906();
        this.method2864();
    }

    @ObfuscatedName("et.n(I)Z")
    public synchronized boolean method2870() {
        return this.field2386.method2885();
    }

    @ObfuscatedName("et.i(IIB)V")
    public synchronized void method2790(int arg0, int arg1) {
        this.method2791(arg0, arg1);
    }

    @ObfuscatedName("et.c(IIB)V")
    public void method2791(int arg0, int arg1) {
        this.field2370[arg0] = arg1;
        this.field2375[arg0] = arg1 & 0xFFFFFF80;
        this.method2792(arg0, arg1);
    }

    @ObfuscatedName("et.b(IIS)V")
    public void method2792(int arg0, int arg1) {
        if (this.field2376[arg0] != arg1) {
            this.field2376[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2388[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("et.m(IIIB)V")
    public void method2812(int arg0, int arg1, int arg2) {
        this.method2783(arg0, arg1, 64);
        if ((this.field2378[arg0] & 0x2) != 0) {
            for (class146 var4 = (class146) this.field2385.field2404.method3318(); var4 != null; var4 = (class146) this.field2385.field2404.method3320()) {
                if (var4.field2441 == arg0 && var4.field2438 < 0) {
                    this.field2384[arg0][var4.field2429] = null;
                    this.field2384[arg0][arg1] = var4;
                    int var5 = (var4.field2433 * var4.field2424 >> 12) + var4.field2428;
                    var4.field2428 += arg1 - var4.field2429 << 8;
                    var4.field2433 = var5 - var4.field2428;
                    var4.field2424 = 4096;
                    var4.field2429 = arg1;
                    return;
                }
            }
        }
        class141 var6 = (class141) this.field2387.method3296((long) this.field2376[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2354[arg1];
        if (var7 == null) {
            return;
        }
        class146 var8 = new class146();
        var8.field2441 = arg0;
        var8.field2434 = var6;
        var8.field2426 = var7;
        var8.field2427 = var6.field2358[arg1];
        var8.field2431 = var6.field2359[arg1];
        var8.field2429 = arg1;
        var8.field2430 = var6.field2360 * arg2 * arg2 * var6.field2363[arg1] + 1024 >> 11;
        var8.field2425 = var6.field2357[arg1] & 0xFF;
        var8.field2428 = (arg1 << 8) - (var6.field2356[arg1] & 0x7FFF);
        var8.field2435 = 0;
        var8.field2436 = 0;
        var8.field2446 = 0;
        var8.field2438 = -1;
        var8.field2439 = 0;
        if (this.field2381[arg0] == 0) {
            var8.field2437 = class45.method1002(var7, this.method2805(var8), this.method2806(var8), this.method2807(var8));
        } else {
            var8.field2437 = class45.method1002(var7, this.method2805(var8), 0, this.method2807(var8));
            this.method2814(var8, var6.field2356[arg1] < 0);
        }
        if (var6.field2356[arg1] < 0) {
            var8.field2437.method950(-1);
        }
        if (var8.field2431 >= 0) {
            class146 var9 = this.field2388[arg0][var8.field2431];
            if (var9 != null && var9.field2438 < 0) {
                this.field2384[arg0][var9.field2429] = null;
                var9.field2438 = 0;
            }
            this.field2388[arg0][var8.field2431] = var8;
        }
        this.field2385.field2404.method3312(var8);
        this.field2384[arg0][arg1] = var8;
    }

    @ObfuscatedName("et.g(Lea;ZB)V")
    public void method2814(class146 arg0, boolean arg1) {
        int var3 = arg0.field2426.field1242.length;
        int var5;
        if (arg1 && arg0.field2426.field1243) {
            int var4 = var3 + var3 - arg0.field2426.field1244;
            var5 = (int) ((long) this.field2381[arg0.field2441] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2437.method957(true);
            }
        } else {
            var5 = (int) ((long) this.field2381[arg0.field2441] * (long) var3 >> 6);
        }
        arg0.field2437.method956(var5);
    }

    @ObfuscatedName("et.x(IIII)V")
    public void method2783(int arg0, int arg1, int arg2) {
        class146 var4 = this.field2384[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2384[arg0][arg1] = null;
        if ((this.field2378[arg0] & 0x2) == 0) {
            var4.field2438 = 0;
            return;
        }
        for (class146 var5 = (class146) this.field2385.field2404.method3338(); var5 != null; var5 = (class146) this.field2385.field2404.method3323()) {
            if (var4.field2441 == var5.field2441 && var5.field2438 < 0 && var4 != var5) {
                var4.field2438 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("et.r(IIII)V")
    public void method2794(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("et.s(IIB)V")
    public void method2795(int arg0, int arg1) {
    }

    @ObfuscatedName("et.l(IIB)V")
    public void method2796(int arg0, int arg1) {
        this.field2374[arg0] = arg1;
    }

    @ObfuscatedName("et.k(II)V")
    public void method2829(int arg0) {
        for (class146 var2 = (class146) this.field2385.field2404.method3338(); var2 != null; var2 = (class146) this.field2385.field2404.method3323()) {
            if (arg0 < 0 || var2.field2441 == arg0) {
                if (var2.field2437 != null) {
                    var2.field2437.method960(Statics.field277 / 100);
                    if (var2.field2437.method964()) {
                        this.field2385.field2407.method1107(var2.field2437);
                    }
                    var2.method2931();
                }
                if (var2.field2438 < 0) {
                    this.field2384[var2.field2441][var2.field2429] = null;
                }
                var2.method3349();
            }
        }
    }

    @ObfuscatedName("et.w(II)V")
    public void method2856(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2856(var2);
            }
            return;
        }
        this.field2367[arg0] = 12800;
        this.field2372[arg0] = 8192;
        this.field2369[arg0] = 16383;
        this.field2374[arg0] = 8192;
        this.field2371[arg0] = 0;
        this.field2373[arg0] = 8192;
        this.method2816(arg0);
        this.method2802(arg0);
        this.field2378[arg0] = 0;
        this.field2379[arg0] = 32767;
        this.field2380[arg0] = 256;
        this.field2381[arg0] = 0;
        this.method2801(arg0, 8192);
    }

    @ObfuscatedName("et.z(II)V")
    public void method2799(int arg0) {
        for (class146 var2 = (class146) this.field2385.field2404.method3338(); var2 != null; var2 = (class146) this.field2385.field2404.method3323()) {
            if ((arg0 < 0 || var2.field2441 == arg0) && var2.field2438 < 0) {
                this.field2384[var2.field2441][var2.field2429] = null;
                var2.field2438 = 0;
            }
        }
    }

    @ObfuscatedName("et.p(I)V")
    public void method2864() {
        this.method2829(-1);
        this.method2856(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2376[var1] = this.field2370[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2375[var2] = this.field2370[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("et.ai(IB)V")
    public void method2816(int arg0) {
        if ((this.field2378[arg0] & 0x2) == 0) {
            return;
        }
        for (class146 var2 = (class146) this.field2385.field2404.method3338(); var2 != null; var2 = (class146) this.field2385.field2404.method3323()) {
            if (var2.field2441 == arg0 && this.field2384[arg0][var2.field2429] == null && var2.field2438 < 0) {
                var2.field2438 = 0;
            }
        }
    }

    @ObfuscatedName("et.ah(II)V")
    public void method2802(int arg0) {
        if ((this.field2378[arg0] & 0x4) == 0) {
            return;
        }
        for (class146 var2 = (class146) this.field2385.field2404.method3338(); var2 != null; var2 = (class146) this.field2385.field2404.method3323()) {
            if (var2.field2441 == arg0) {
                var2.field2444 = 0;
            }
        }
    }

    @ObfuscatedName("et.ad(II)V")
    public void method2809(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2783(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2812(var6, var7, var8);
            } else {
                this.method2783(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2794(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2375[var12] = (var14 << 14) + (this.field2375[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2375[var12] = (var14 << 7) + (this.field2375[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2371[var12] = (var14 << 7) + (this.field2371[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2371[var12] = (this.field2371[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2373[var12] = (var14 << 7) + (this.field2373[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2373[var12] = (this.field2373[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2367[var12] = (var14 << 7) + (this.field2367[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2367[var12] = (this.field2367[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2372[var12] = (var14 << 7) + (this.field2372[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2372[var12] = (this.field2372[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2369[var12] = (var14 << 7) + (this.field2369[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2369[var12] = (this.field2369[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2378[var12] |= 0x1;
                } else {
                    this.field2378[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2378[var12] |= 0x2;
                } else {
                    this.method2816(var12);
                    this.field2378[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2379[var12] = (var14 << 7) + (this.field2379[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2379[var12] = (this.field2379[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2379[var12] = (var14 << 7) + (this.field2379[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2379[var12] = (this.field2379[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2829(var12);
            }
            if (var13 == 121) {
                this.method2856(var12);
            }
            if (var13 == 123) {
                this.method2799(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2379[var12];
                if (var15 == 16384) {
                    this.field2380[var12] = (var14 << 7) + (this.field2380[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2379[var12];
                if (var16 == 16384) {
                    this.field2380[var12] = (this.field2380[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2381[var12] = (var14 << 7) + (this.field2381[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2381[var12] = (this.field2381[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2378[var12] |= 0x4;
                } else {
                    this.method2802(var12);
                    this.field2378[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2801(var12, (var14 << 7) + (this.field2382[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2801(var12, (this.field2382[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2792(var17, this.field2375[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2795(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method2796(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2864();
            }
        }
    }

    @ObfuscatedName("et.ak(IIB)V")
    public void method2801(int arg0, int arg1) {
        this.field2382[arg0] = arg1;
        this.field2392[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("et.ap(Lea;B)I")
    public int method2805(class146 arg0) {
        int var2 = (arg0.field2433 * arg0.field2424 >> 12) + arg0.field2428;
        int var3 = ((this.field2374[arg0.field2441] - 8192) * this.field2380[arg0.field2441] >> 12) + var2;
        class143 var4 = arg0.field2427;
        if (var4.field2401 > 0 && (var4.field2394 > 0 || this.field2371[arg0.field2441] > 0)) {
            int var5 = var4.field2394 << 2;
            int var6 = var4.field2395 << 1;
            if (arg0.field2440 < var6) {
                var5 = arg0.field2440 * var5 / var6;
            }
            int var7 = (this.field2371[arg0.field2441] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2442 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2426.field1246 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field277 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("et.al(Lea;I)I")
    public int method2806(class146 arg0) {
        class143 var2 = arg0.field2427;
        int var3 = this.field2369[arg0.field2441] * this.field2367[arg0.field2441] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2430 * var4 + 16384 >> 15;
        int var6 = this.field2383 * var5 + 128 >> 8;
        if (var2.field2400 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2435 * 1.953125E-5D * (double) var2.field2400) + 0.5D);
        }
        if (var2.field2399 != null) {
            int var7 = arg0.field2436;
            int var8 = var2.field2399[arg0.field2446 + 1];
            if (arg0.field2446 < var2.field2399.length - 2) {
                int var9 = (var2.field2399[arg0.field2446] & 0xFF) << 8;
                int var10 = (var2.field2399[arg0.field2446 + 2] & 0xFF) << 8;
                var8 += (var2.field2399[arg0.field2446 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2438 > 0 && var2.field2402 != null) {
            int var11 = arg0.field2438;
            int var12 = var2.field2402[arg0.field2439 + 1];
            if (arg0.field2439 < var2.field2402.length - 2) {
                int var13 = (var2.field2402[arg0.field2439] & 0xFF) << 8;
                int var14 = (var2.field2402[arg0.field2439 + 2] & 0xFF) << 8;
                var12 += (var2.field2402[arg0.field2439 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("et.am(Lea;I)I")
    public int method2807(class146 arg0) {
        int var2 = this.field2372[arg0.field2441];
        return var2 < 8192 ? arg0.field2425 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2425) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("et.v()Lav;")
    public synchronized class48 method1009() {
        return this.field2385;
    }

    @ObfuscatedName("et.d()Lav;")
    public synchronized class48 method966() {
        return null;
    }

    @ObfuscatedName("et.e()I")
    public synchronized int method967() {
        return 0;
    }

    @ObfuscatedName("et.y([III)V")
    public synchronized void method1029(int[] arg0, int arg1, int arg2) {
        if (this.field2386.method2885()) {
            int var4 = this.field2366 * this.field2386.field2411 / Statics.field277;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2390;
                if (this.field2391 - var5 >= 0L) {
                    this.field2390 = var5;
                    break;
                }
                int var7 = (int) ((this.field2391 - this.field2390 + (long) var4 - 1L) / (long) var4);
                this.field2390 += (long) var4 * (long) var7;
                this.field2385.method1029(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2838();
            } while (this.field2386.method2885());
        }
        this.field2385.method1029(arg0, arg1, arg2);
    }

    @ObfuscatedName("et.aw(I)V")
    public synchronized void method969(int arg0) {
        if (this.field2386.method2885()) {
            int var2 = this.field2366 * this.field2386.field2411 / Statics.field277;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2390;
                if (this.field2391 - var3 >= 0L) {
                    this.field2390 = var3;
                    break;
                }
                int var5 = (int) ((this.field2391 - this.field2390 + (long) var2 - 1L) / (long) var2);
                this.field2390 += (long) var2 * (long) var5;
                this.field2385.method969(var5);
                arg0 -= var5;
                this.method2838();
            } while (this.field2386.method2885());
        }
        this.field2385.method969(arg0);
    }

    @ObfuscatedName("et.ab(I)V")
    public void method2838() {
        int var1 = this.field2377;
        int var2 = this.field2389;
        long var3 = this.field2391;
        while (this.field2389 == var2) {
            while (this.field2386.field2414[var1] == var2) {
                this.field2386.method2887(var1);
                int var5 = this.field2386.method2883(var1);
                if (var5 == 1) {
                    this.field2386.method2889();
                    this.field2386.method2891(var1);
                    if (this.field2386.method2898()) {
                        if (!this.field2393 || var2 == 0) {
                            this.method2864();
                            this.field2386.method2906();
                            return;
                        }
                        this.field2386.method2911(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2809(var5);
                }
                this.field2386.method2890(var1);
                this.field2386.method2891(var1);
            }
            var1 = this.field2386.method2895();
            var2 = this.field2386.field2414[var1];
            var3 = this.field2386.method2894(var2);
        }
        this.field2377 = var1;
        this.field2389 = var2;
        this.field2391 = var3;
    }

    @ObfuscatedName("et.ax(Lea;I)Z")
    public boolean method2810(class146 arg0) {
        if (arg0.field2437 != null) {
            return false;
        }
        if (arg0.field2438 >= 0) {
            arg0.method3349();
            if (arg0.field2431 > 0 && this.field2388[arg0.field2441][arg0.field2431] == arg0) {
                this.field2388[arg0.field2441][arg0.field2431] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("et.az(Lea;[IIIB)Z")
    public boolean method2811(class146 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2443 = Statics.field277 / 100;
        if (arg0.field2438 >= 0 && arg0.field2437 == null || arg0.field2437.method963()) {
            arg0.method2931();
            arg0.method3349();
            if (arg0.field2431 > 0 && this.field2388[arg0.field2441][arg0.field2431] == arg0) {
                this.field2388[arg0.field2441][arg0.field2431] = null;
            }
            return true;
        }
        int var5 = arg0.field2424;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2373[arg0.field2441] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2424 = var6;
        }
        arg0.field2437.method961(this.method2805(arg0));
        class143 var7 = arg0.field2427;
        boolean var8 = false;
        arg0.field2440++;
        arg0.field2442 += var7.field2401;
        double var9 = (double) ((arg0.field2429 - 60 << 8) + (arg0.field2433 * arg0.field2424 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2400 > 0) {
            if (var7.field2396 > 0) {
                arg0.field2435 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2396 * var9) + 0.5D);
            } else {
                arg0.field2435 += 128;
            }
        }
        if (var7.field2399 != null) {
            if (var7.field2397 > 0) {
                arg0.field2436 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2397 * var9) + 0.5D);
            } else {
                arg0.field2436 += 128;
            }
            while (arg0.field2446 < var7.field2399.length - 2 && arg0.field2436 > (var7.field2399[arg0.field2446 + 2] & 0xFF) << 8) {
                arg0.field2446 += 2;
            }
            if (arg0.field2446 == var7.field2399.length - 2 && var7.field2399[arg0.field2446 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2438 >= 0 && var7.field2402 != null && (this.field2378[arg0.field2441] & 0x1) == 0 && (arg0.field2431 < 0 || this.field2388[arg0.field2441][arg0.field2431] != arg0)) {
            if (var7.field2398 > 0) {
                arg0.field2438 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2398 * var9) + 0.5D);
            } else {
                arg0.field2438 += 128;
            }
            while (arg0.field2439 < var7.field2402.length - 2 && arg0.field2438 > (var7.field2402[arg0.field2439 + 2] & 0xFF) << 8) {
                arg0.field2439 += 2;
            }
            if (arg0.field2439 == var7.field2402.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2437.method1039(arg0.field2443, this.method2806(arg0), this.method2807(arg0));
            return false;
        }
        arg0.field2437.method960(arg0.field2443);
        if (arg1 == null) {
            arg0.field2437.method969(arg3);
        } else {
            arg0.field2437.method1029(arg1, arg2, arg3);
        }
        if (arg0.field2437.method964()) {
            this.field2385.field2407.method1107(arg0.field2437);
        }
        arg0.method2931();
        if (arg0.field2438 >= 0) {
            arg0.method3349();
            if (arg0.field2431 > 0 && this.field2388[arg0.field2441][arg0.field2431] == arg0) {
                this.field2388[arg0.field2441][arg0.field2431] = null;
            }
        }
        return true;
    }
}
