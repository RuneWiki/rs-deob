package deob;

@ObfuscatedName("ga")
public class class199 extends class116 {

    @ObfuscatedName("ga.q")
    public class319 field2418 = new class319(128);

    @ObfuscatedName("ga.e")
    public int field2410 = 256;

    @ObfuscatedName("ga.p")
    public int field2427 = 1000000;

    @ObfuscatedName("ga.k")
    public int[] field2412 = new int[16];

    @ObfuscatedName("ga.l")
    public int[] field2413 = new int[16];

    @ObfuscatedName("ga.b")
    public int[] field2423 = new int[16];

    @ObfuscatedName("ga.i")
    public int[] field2415 = new int[16];

    @ObfuscatedName("ga.c")
    public int[] field2414 = new int[16];

    @ObfuscatedName("ga.f")
    public int[] field2416 = new int[16];

    @ObfuscatedName("ga.m")
    public int[] field2430 = new int[16];

    @ObfuscatedName("ga.u")
    public int[] field2419 = new int[16];

    @ObfuscatedName("ga.x")
    public int[] field2420 = new int[16];

    @ObfuscatedName("ga.t")
    public int[] field2422 = new int[16];

    @ObfuscatedName("ga.h")
    public int[] field2425 = new int[16];

    @ObfuscatedName("ga.o")
    public int[] field2424 = new int[16];

    @ObfuscatedName("ga.n")
    public int[] field2411 = new int[16];

    @ObfuscatedName("ga.d")
    public int[] field2426 = new int[16];

    @ObfuscatedName("ga.s")
    public int[] field2409 = new int[16];

    @ObfuscatedName("ga.z")
    public class200[][] field2428 = new class200[16][128];

    @ObfuscatedName("ga.al")
    public class200[][] field2429 = new class200[16][128];

    @ObfuscatedName("ga.av")
    public class201 field2417 = new class201();

    @ObfuscatedName("ga.as")
    public boolean field2431;

    @ObfuscatedName("ga.aw")
    public int field2432;

    @ObfuscatedName("ga.ad")
    public int field2433;

    @ObfuscatedName("ga.ag")
    public long field2434;

    @ObfuscatedName("ga.ar")
    public long field2435;

    @ObfuscatedName("ga.ax")
    public class203 field2436 = new class203(this);

    public class199() {
        this.method3399();
    }

    @ObfuscatedName("ga.q(II)V")
    public synchronized void method3379(int arg0) {
        this.field2410 = arg0;
    }

    @ObfuscatedName("ga.w(I)I")
    public int method3380() {
        return this.field2410;
    }

    @ObfuscatedName("ga.e(Lgl;Lhp;Ldf;II)Z")
    public synchronized boolean method3392(class204 arg0, class234 arg1, class109 arg2, int arg3) {
        arg0.method3566();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class178 var7 = (class178) arg0.field2493.method5477(); var7 != null; var7 = (class178) arg0.field2493.method5480()) {
            int var8 = (int) var7.field2114;
            class202 var9 = (class202) this.field2418.method5479((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3839(var8);
                class202 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class202(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2418.method5478(var11, (long) var8);
            }
            if (!var9.method3540(arg2, var7.field2109, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3563();
        }
        return var5;
    }

    @ObfuscatedName("ga.p(I)V")
    public synchronized void method3434() {
        for (class202 var1 = (class202) this.field2418.method5477(); var1 != null; var1 = (class202) this.field2418.method5480()) {
            var1.method3546();
        }
    }

    @ObfuscatedName("ga.k(I)V")
    public synchronized void method3383() {
        for (class202 var1 = (class202) this.field2418.method5477(); var1 != null; var1 = (class202) this.field2418.method5480()) {
            var1.method3286();
        }
    }

    @ObfuscatedName("ga.u(Lgl;ZI)V")
    public synchronized void method3461(class204 arg0, boolean arg1) {
        this.method3385();
        this.field2417.method3534(arg0.field2492);
        this.field2431 = arg1;
        this.field2434 = 0L;
        int var3 = this.field2417.method3506();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2417.method3492(var4);
            this.field2417.method3522(var4);
            this.field2417.method3493(var4);
        }
        this.field2432 = this.field2417.method3499();
        this.field2433 = this.field2417.field2466[this.field2432];
        this.field2435 = this.field2417.method3518(this.field2433);
    }

    @ObfuscatedName("ga.r(I)V")
    public synchronized void method3385() {
        this.field2417.method3488();
        this.method3399();
    }

    @ObfuscatedName("ga.v(I)Z")
    public synchronized boolean method3386() {
        return this.field2417.method3490();
    }

    @ObfuscatedName("ga.y(III)V")
    public synchronized void method3393(int arg0, int arg1) {
        this.method3482(arg0, arg1);
    }

    @ObfuscatedName("ga.g(III)V")
    public void method3482(int arg0, int arg1) {
        this.field2415[arg0] = arg1;
        this.field2416[arg0] = arg1 & 0xFFFFFF80;
        this.method3389(arg0, arg1);
    }

    @ObfuscatedName("ga.a(IIB)V")
    public void method3389(int arg0, int arg1) {
        if (this.field2414[arg0] != arg1) {
            this.field2414[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2429[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ga.j(IIII)V")
    public void method3390(int arg0, int arg1, int arg2) {
        this.method3402(arg0, arg1, 64);
        if ((this.field2422[arg0] & 0x2) != 0) {
            for (class200 var4 = (class200) this.field2436.field2485.method4508(); var4 != null; var4 = (class200) this.field2436.field2485.method4502()) {
                if (var4.field2441 == arg0 && var4.field2437 < 0) {
                    this.field2428[arg0][var4.field2451] = null;
                    this.field2428[arg0][arg1] = var4;
                    int var5 = (var4.field2447 * var4.field2446 >> 12) + var4.field2442;
                    var4.field2442 += arg1 - var4.field2451 << 8;
                    var4.field2446 = var5 - var4.field2442;
                    var4.field2447 = 4096;
                    var4.field2451 = arg1;
                    return;
                }
            }
        }
        class202 var6 = (class202) this.field2418.method5479((long) this.field2414[arg0]);
        if (var6 == null) {
            return;
        }
        class104 var7 = var6.field2475[arg1];
        if (var7 == null) {
            return;
        }
        class200 var8 = new class200();
        var8.field2441 = arg0;
        var8.field2438 = var6;
        var8.field2440 = var7;
        var8.field2453 = var6.field2482[arg1];
        var8.field2439 = var6.field2480[arg1];
        var8.field2451 = arg1;
        var8.field2443 = var6.field2476 * arg2 * arg2 * var6.field2477[arg1] + 1024 >> 11;
        var8.field2444 = var6.field2478[arg1] & 0xFF;
        var8.field2442 = (arg1 << 8) - (var6.field2483[arg1] & 0x7FFF);
        var8.field2448 = 0;
        var8.field2449 = 0;
        var8.field2450 = 0;
        var8.field2437 = -1;
        var8.field2452 = 0;
        if (this.field2411[arg0] == 0) {
            var8.field2455 = class114.method2304(var7, this.method3403(var8), this.method3404(var8), this.method3405(var8));
        } else {
            var8.field2455 = class114.method2304(var7, this.method3403(var8), 0, this.method3405(var8));
            this.method3426(var8, var6.field2483[arg1] < 0);
        }
        if (var6.field2483[arg1] < 0) {
            var8.field2455.method2393(-1);
        }
        if (var8.field2439 >= 0) {
            class200 var9 = this.field2429[arg0][var8.field2439];
            if (var9 != null && var9.field2437 < 0) {
                this.field2428[arg0][var9.field2451] = null;
                var9.field2437 = 0;
            }
            this.field2429[arg0][var8.field2439] = var8;
        }
        this.field2436.field2485.method4532(var8);
        this.field2428[arg0][arg1] = var8;
    }

    @ObfuscatedName("ga.o(Lgi;ZB)V")
    public void method3426(class200 arg0, boolean arg1) {
        int var3 = arg0.field2440.field1391.length;
        int var5;
        if (arg1 && arg0.field2440.field1394) {
            int var4 = var3 + var3 - arg0.field2440.field1392;
            var5 = (int) ((long) this.field2411[arg0.field2441] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2455.method2381(true);
            }
        } else {
            var5 = (int) ((long) this.field2411[arg0.field2441] * (long) var3 >> 6);
        }
        arg0.field2455.method2363(var5);
    }

    @ObfuscatedName("ga.d(IIII)V")
    public void method3402(int arg0, int arg1, int arg2) {
        class200 var4 = this.field2428[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2428[arg0][arg1] = null;
        if ((this.field2422[arg0] & 0x2) == 0) {
            var4.field2437 = 0;
            return;
        }
        for (class200 var5 = (class200) this.field2436.field2485.method4507(); var5 != null; var5 = (class200) this.field2436.field2485.method4509()) {
            if (var4.field2441 == var5.field2441 && var5.field2437 < 0 && var4 != var5) {
                var4.field2437 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ga.s(IIII)V")
    public void method3447(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ga.z(IIB)V")
    public void method3452(int arg0, int arg1) {
    }

    @ObfuscatedName("ga.al(III)V")
    public void method3395(int arg0, int arg1) {
        this.field2430[arg0] = arg1;
    }

    @ObfuscatedName("ga.av(II)V")
    public void method3396(int arg0) {
        for (class200 var2 = (class200) this.field2436.field2485.method4507(); var2 != null; var2 = (class200) this.field2436.field2485.method4509()) {
            if (arg0 < 0 || var2.field2441 == arg0) {
                if (var2.field2455 != null) {
                    var2.field2455.method2319(Statics.field2079 / 100);
                    if (var2.field2455.method2352()) {
                        this.field2436.field2488.method2090(var2.field2455);
                    }
                    var2.method3483();
                }
                if (var2.field2437 < 0) {
                    this.field2428[var2.field2441][var2.field2451] = null;
                }
                var2.method3286();
            }
        }
    }

    @ObfuscatedName("ga.as(IB)V")
    public void method3397(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3397(var2);
            }
            return;
        }
        this.field2412[arg0] = 12800;
        this.field2413[arg0] = 8192;
        this.field2423[arg0] = 16383;
        this.field2430[arg0] = 8192;
        this.field2419[arg0] = 0;
        this.field2420[arg0] = 8192;
        this.method3388(arg0);
        this.method3443(arg0);
        this.field2422[arg0] = 0;
        this.field2425[arg0] = 32767;
        this.field2424[arg0] = 256;
        this.field2411[arg0] = 0;
        this.method3415(arg0, 8192);
    }

    @ObfuscatedName("ga.aw(II)V")
    public void method3387(int arg0) {
        for (class200 var2 = (class200) this.field2436.field2485.method4507(); var2 != null; var2 = (class200) this.field2436.field2485.method4509()) {
            if ((arg0 < 0 || var2.field2441 == arg0) && var2.field2437 < 0) {
                this.field2428[var2.field2441][var2.field2451] = null;
                var2.field2437 = 0;
            }
        }
    }

    @ObfuscatedName("ga.ad(S)V")
    public void method3399() {
        this.method3396(-1);
        this.method3397(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2414[var1] = this.field2415[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2416[var2] = this.field2415[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ga.ag(II)V")
    public void method3388(int arg0) {
        if ((this.field2422[arg0] & 0x2) == 0) {
            return;
        }
        for (class200 var2 = (class200) this.field2436.field2485.method4507(); var2 != null; var2 = (class200) this.field2436.field2485.method4509()) {
            if (var2.field2441 == arg0 && this.field2428[arg0][var2.field2451] == null && var2.field2437 < 0) {
                var2.field2437 = 0;
            }
        }
    }

    @ObfuscatedName("ga.ar(II)V")
    public void method3443(int arg0) {
        if ((this.field2422[arg0] & 0x4) == 0) {
            return;
        }
        for (class200 var2 = (class200) this.field2436.field2485.method4507(); var2 != null; var2 = (class200) this.field2436.field2485.method4509()) {
            if (var2.field2441 == arg0) {
                var2.field2445 = 0;
            }
        }
    }

    @ObfuscatedName("ga.ax(II)V")
    public void method3401(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3402(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3390(var6, var7, var8);
            } else {
                this.method3402(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3447(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2416[var12] = (var14 << 14) + (this.field2416[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2416[var12] = (var14 << 7) + (this.field2416[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2419[var12] = (var14 << 7) + (this.field2419[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2419[var12] = (this.field2419[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2420[var12] = (var14 << 7) + (this.field2420[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2420[var12] = (this.field2420[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2412[var12] = (var14 << 7) + (this.field2412[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2412[var12] = (this.field2412[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2413[var12] = (var14 << 7) + (this.field2413[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2413[var12] = (this.field2413[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2423[var12] = (var14 << 7) + (this.field2423[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2423[var12] = (this.field2423[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2422[var12] |= 0x1;
                } else {
                    this.field2422[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2422[var12] |= 0x2;
                } else {
                    this.method3388(var12);
                    this.field2422[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2425[var12] = (var14 << 7) + (this.field2425[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2425[var12] = (this.field2425[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2425[var12] = (var14 << 7) + (this.field2425[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2425[var12] = (this.field2425[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3396(var12);
            }
            if (var13 == 121) {
                this.method3397(var12);
            }
            if (var13 == 123) {
                this.method3387(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2425[var12];
                if (var15 == 16384) {
                    this.field2424[var12] = (var14 << 7) + (this.field2424[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2425[var12];
                if (var16 == 16384) {
                    this.field2424[var12] = (this.field2424[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2411[var12] = (var14 << 7) + (this.field2411[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2411[var12] = (this.field2411[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2422[var12] |= 0x4;
                } else {
                    this.method3443(var12);
                    this.field2422[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3415(var12, (var14 << 7) + (this.field2426[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3415(var12, (this.field2426[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3389(var17, this.field2416[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3452(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3395(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3399();
            }
        }
    }

    @ObfuscatedName("ga.ai(IIB)V")
    public void method3415(int arg0, int arg1) {
        this.field2426[arg0] = arg1;
        this.field2409[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ga.ak(Lgi;I)I")
    public int method3403(class200 arg0) {
        int var2 = (arg0.field2447 * arg0.field2446 >> 12) + arg0.field2442;
        int var3 = ((this.field2430[arg0.field2441] - 8192) * this.field2424[arg0.field2441] >> 12) + var2;
        class197 var4 = arg0.field2453;
        if (var4.field2395 > 0 && (var4.field2394 > 0 || this.field2419[arg0.field2441] > 0)) {
            int var5 = var4.field2394 << 2;
            int var6 = var4.field2396 << 1;
            if (arg0.field2459 < var6) {
                var5 = arg0.field2459 * var5 / var6;
            }
            int var7 = (this.field2419[arg0.field2441] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2454 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2440.field1390 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field2079 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ga.ah(Lgi;B)I")
    public int method3404(class200 arg0) {
        class197 var2 = arg0.field2453;
        int var3 = this.field2423[arg0.field2441] * this.field2412[arg0.field2441] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2443 * var4 + 16384 >> 15;
        int var6 = this.field2410 * var5 + 128 >> 8;
        if (var2.field2393 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2448 * 1.953125E-5D * (double) var2.field2393) + 0.5D);
        }
        if (var2.field2388 != null) {
            int var7 = arg0.field2449;
            int var8 = var2.field2388[arg0.field2450 + 1];
            if (arg0.field2450 < var2.field2388.length - 2) {
                int var9 = (var2.field2388[arg0.field2450] & 0xFF) << 8;
                int var10 = (var2.field2388[arg0.field2450 + 2] & 0xFF) << 8;
                var8 += (var2.field2388[arg0.field2450 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2437 > 0 && var2.field2389 != null) {
            int var11 = arg0.field2437;
            int var12 = var2.field2389[arg0.field2452 + 1];
            if (arg0.field2452 < var2.field2389.length - 2) {
                int var13 = (var2.field2389[arg0.field2452] & 0xFF) << 8;
                int var14 = (var2.field2389[arg0.field2452 + 2] & 0xFF) << 8;
                var12 += (var2.field2389[arg0.field2452 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ga.am(Lgi;I)I")
    public int method3405(class200 arg0) {
        int var2 = this.field2413[arg0.field2441];
        return var2 < 8192 ? arg0.field2444 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2444) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ga.l()Ldx;")
    public synchronized class116 method2079() {
        return this.field2436;
    }

    @ObfuscatedName("ga.b()Ldx;")
    public synchronized class116 method2080() {
        return null;
    }

    @ObfuscatedName("ga.i()I")
    public synchronized int method2081() {
        return 0;
    }

    @ObfuscatedName("ga.c([III)V")
    public synchronized void method2082(int[] arg0, int arg1, int arg2) {
        if (this.field2417.method3490()) {
            int var4 = this.field2427 * this.field2417.field2464 / Statics.field2079;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2434;
                if (this.field2435 - var5 >= 0L) {
                    this.field2434 = var5;
                    break;
                }
                int var7 = (int) ((this.field2435 - this.field2434 + (long) var4 - 1L) / (long) var4);
                this.field2434 += (long) var4 * (long) var7;
                this.field2436.method2082(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3408();
            } while (this.field2417.method3490());
        }
        this.field2436.method2082(arg0, arg1, arg2);
    }

    @ObfuscatedName("ga.x(I)V")
    public synchronized void method2084(int arg0) {
        if (this.field2417.method3490()) {
            int var2 = this.field2427 * this.field2417.field2464 / Statics.field2079;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2434;
                if (this.field2435 - var3 >= 0L) {
                    this.field2434 = var3;
                    break;
                }
                int var5 = (int) ((this.field2435 - this.field2434 + (long) var2 - 1L) / (long) var2);
                this.field2434 += (long) var2 * (long) var5;
                this.field2436.method2084(var5);
                arg0 -= var5;
                this.method3408();
            } while (this.field2417.method3490());
        }
        this.field2436.method2084(arg0);
    }

    @ObfuscatedName("ga.af(I)V")
    public void method3408() {
        int var1 = this.field2432;
        int var2 = this.field2433;
        long var3 = this.field2435;
        while (this.field2433 == var2) {
            while (this.field2417.field2466[var1] == var2) {
                this.field2417.method3492(var1);
                int var5 = this.field2417.method3526(var1);
                if (var5 == 1) {
                    this.field2417.method3504();
                    this.field2417.method3493(var1);
                    if (this.field2417.method3513()) {
                        if (!this.field2431 || var2 == 0) {
                            this.method3399();
                            this.field2417.method3488();
                            return;
                        }
                        this.field2417.method3501(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3401(var5);
                }
                this.field2417.method3522(var1);
                this.field2417.method3493(var1);
            }
            var1 = this.field2417.method3499();
            var2 = this.field2417.field2466[var1];
            var3 = this.field2417.method3518(var2);
        }
        this.field2432 = var1;
        this.field2433 = var2;
        this.field2435 = var3;
    }

    @ObfuscatedName("ga.ab(Lgi;I)Z")
    public boolean method3409(class200 arg0) {
        if (arg0.field2455 != null) {
            return false;
        }
        if (arg0.field2437 >= 0) {
            arg0.method3286();
            if (arg0.field2439 > 0 && this.field2429[arg0.field2441][arg0.field2439] == arg0) {
                this.field2429[arg0.field2441][arg0.field2439] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ga.bp(Lgi;[IIII)Z")
    public boolean method3410(class200 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2456 = Statics.field2079 / 100;
        if (arg0.field2437 >= 0 && arg0.field2455 == null || arg0.field2455.method2333()) {
            arg0.method3483();
            arg0.method3286();
            if (arg0.field2439 > 0 && this.field2429[arg0.field2441][arg0.field2439] == arg0) {
                this.field2429[arg0.field2441][arg0.field2439] = null;
            }
            return true;
        }
        int var5 = arg0.field2447;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2420[arg0.field2441] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2447 = var6;
        }
        arg0.field2455.method2317(this.method3403(arg0));
        class197 var7 = arg0.field2453;
        boolean var8 = false;
        arg0.field2459++;
        arg0.field2454 += var7.field2395;
        double var9 = (double) ((arg0.field2451 - 60 << 8) + (arg0.field2447 * arg0.field2446 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2393 > 0) {
            if (var7.field2392 > 0) {
                arg0.field2448 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2392 * var9) + 0.5D);
            } else {
                arg0.field2448 += 128;
            }
        }
        if (var7.field2388 != null) {
            if (var7.field2391 > 0) {
                arg0.field2449 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2391 * var9) + 0.5D);
            } else {
                arg0.field2449 += 128;
            }
            while (arg0.field2450 < var7.field2388.length - 2 && arg0.field2449 > (var7.field2388[arg0.field2450 + 2] & 0xFF) << 8) {
                arg0.field2450 += 2;
            }
            if (arg0.field2450 == var7.field2388.length - 2 && var7.field2388[arg0.field2450 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2437 >= 0 && var7.field2389 != null && (this.field2422[arg0.field2441] & 0x1) == 0 && (arg0.field2439 < 0 || this.field2429[arg0.field2441][arg0.field2439] != arg0)) {
            if (var7.field2399 > 0) {
                arg0.field2437 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2399 * var9) + 0.5D);
            } else {
                arg0.field2437 += 128;
            }
            while (arg0.field2452 < var7.field2389.length - 2 && arg0.field2437 > (var7.field2389[arg0.field2452 + 2] & 0xFF) << 8) {
                arg0.field2452 += 2;
            }
            if (arg0.field2452 == var7.field2389.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2455.method2315(arg0.field2456, this.method3404(arg0), this.method3405(arg0));
            return false;
        }
        arg0.field2455.method2319(arg0.field2456);
        if (arg1 == null) {
            arg0.field2455.method2084(arg3);
        } else {
            arg0.field2455.method2082(arg1, arg2, arg3);
        }
        if (arg0.field2455.method2352()) {
            this.field2436.field2488.method2090(arg0.field2455);
        }
        arg0.method3483();
        if (arg0.field2437 >= 0) {
            arg0.method3286();
            if (arg0.field2439 > 0 && this.field2429[arg0.field2441][arg0.field2439] == arg0) {
                this.field2429[arg0.field2441][arg0.field2439] = null;
            }
        }
        return true;
    }
}
