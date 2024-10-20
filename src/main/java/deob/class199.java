package deob;

@ObfuscatedName("gm")
public class class199 extends class114 {

    @ObfuscatedName("gm.f")
    public class318 field2422 = new class318(128);

    @ObfuscatedName("gm.i")
    public int field2402 = 256;

    @ObfuscatedName("gm.y")
    public int field2403 = 1000000;

    @ObfuscatedName("gm.p")
    public int[] field2406 = new int[16];

    @ObfuscatedName("gm.b")
    public int[] field2405 = new int[16];

    @ObfuscatedName("gm.e")
    public int[] field2409 = new int[16];

    @ObfuscatedName("gm.x")
    public int[] field2407 = new int[16];

    @ObfuscatedName("gm.a")
    public int[] field2408 = new int[16];

    @ObfuscatedName("gm.d")
    public int[] field2415 = new int[16];

    @ObfuscatedName("gm.c")
    public int[] field2411 = new int[16];

    @ObfuscatedName("gm.o")
    public int[] field2427 = new int[16];

    @ObfuscatedName("gm.v")
    public int[] field2412 = new int[16];

    @ObfuscatedName("gm.u")
    public int[] field2413 = new int[16];

    @ObfuscatedName("gm.z")
    public int[] field2414 = new int[16];

    @ObfuscatedName("gm.h")
    public int[] field2418 = new int[16];

    @ObfuscatedName("gm.m")
    public int[] field2416 = new int[16];

    @ObfuscatedName("gm.g")
    public int[] field2417 = new int[16];

    @ObfuscatedName("gm.r")
    public int[] field2426 = new int[16];

    @ObfuscatedName("gm.q")
    public class200[][] field2419 = new class200[16][128];

    @ObfuscatedName("gm.aa")
    public class200[][] field2420 = new class200[16][128];

    @ObfuscatedName("gm.av")
    public class201 field2421 = new class201();

    @ObfuscatedName("gm.aw")
    public boolean field2404;

    @ObfuscatedName("gm.as")
    public int field2423;

    @ObfuscatedName("gm.ak")
    public int field2424;

    @ObfuscatedName("gm.au")
    public long field2410;

    @ObfuscatedName("gm.ah")
    public long field2401;

    @ObfuscatedName("gm.aq")
    public class203 field2425 = new class203(this);

    public class199() {
        this.method3390();
    }

    @ObfuscatedName("gm.f(IB)V")
    public synchronized void method3374(int arg0) {
        this.field2402 = arg0;
    }

    @ObfuscatedName("gm.i(I)I")
    public int method3373() {
        return this.field2402;
    }

    @ObfuscatedName("gm.y(Lgh;Lhz;Ldx;IB)Z")
    public synchronized boolean method3376(class204 arg0, class234 arg1, class107 arg2, int arg3) {
        arg0.method3556();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class185 var7 = (class185) arg0.field2479.method5501(); var7 != null; var7 = (class185) arg0.field2479.method5500()) {
            int var8 = (int) var7.field2322;
            class202 var9 = (class202) this.field2422.method5499((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3759(var8);
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
                this.field2422.method5502(var11, (long) var8);
            }
            if (!var9.method3532(arg2, var7.field2318, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3549();
        }
        return var5;
    }

    @ObfuscatedName("gm.w(I)V")
    public synchronized void method3392() {
        for (class202 var1 = (class202) this.field2422.method5501(); var1 != null; var1 = (class202) this.field2422.method5500()) {
            var1.method3533();
        }
    }

    @ObfuscatedName("gm.p(I)V")
    public synchronized void method3431() {
        for (class202 var1 = (class202) this.field2422.method5501(); var1 != null; var1 = (class202) this.field2422.method5500()) {
            var1.method3292();
        }
    }

    @ObfuscatedName("gm.d(Lgh;ZI)V")
    public synchronized void method3436(class204 arg0, boolean arg1) {
        this.method3379();
        this.field2421.method3483(arg0.field2480);
        this.field2404 = arg1;
        this.field2410 = 0L;
        int var3 = this.field2421.method3485();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2421.method3486(var4);
            this.field2421.method3489(var4);
            this.field2421.method3487(var4);
        }
        this.field2423 = this.field2421.method3494();
        this.field2424 = this.field2421.field2457[this.field2423];
        this.field2401 = this.field2421.method3493(this.field2424);
    }

    @ObfuscatedName("gm.o(I)V")
    public synchronized void method3379() {
        this.field2421.method3516();
        this.method3390();
    }

    @ObfuscatedName("gm.l(I)Z")
    public synchronized boolean method3380() {
        return this.field2421.method3484();
    }

    @ObfuscatedName("gm.t(III)V")
    public synchronized void method3433(int arg0, int arg1) {
        this.method3451(arg0, arg1);
    }

    @ObfuscatedName("gm.j(IIB)V")
    public void method3451(int arg0, int arg1) {
        this.field2407[arg0] = arg1;
        this.field2415[arg0] = arg1 & 0xFFFFFF80;
        this.method3383(arg0, arg1);
    }

    @ObfuscatedName("gm.n(III)V")
    public void method3383(int arg0, int arg1) {
        if (this.field2408[arg0] != arg1) {
            this.field2408[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2420[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gm.u(IIII)V")
    public void method3384(int arg0, int arg1, int arg2) {
        this.method3406(arg0, arg1, 64);
        if ((this.field2413[arg0] & 0x2) != 0) {
            for (class200 var4 = (class200) this.field2425.field2475.method4532(); var4 != null; var4 = (class200) this.field2425.field2475.method4556()) {
                if (var4.field2445 == arg0 && var4.field2442 < 0) {
                    this.field2419[arg0][var4.field2433] = null;
                    this.field2419[arg0][arg1] = var4;
                    int var5 = (var4.field2438 * var4.field2435 >> 12) + var4.field2436;
                    var4.field2436 += arg1 - var4.field2433 << 8;
                    var4.field2435 = var5 - var4.field2436;
                    var4.field2438 = 4096;
                    var4.field2433 = arg1;
                    return;
                }
            }
        }
        class202 var6 = (class202) this.field2422.method5499((long) this.field2408[arg0]);
        if (var6 == null) {
            return;
        }
        class102 var7 = var6.field2466[arg1];
        if (var7 == null) {
            return;
        }
        class200 var8 = new class200();
        var8.field2445 = arg0;
        var8.field2429 = var6;
        var8.field2430 = var7;
        var8.field2431 = var6.field2463[arg1];
        var8.field2437 = var6.field2469[arg1];
        var8.field2433 = arg1;
        var8.field2434 = var6.field2468 * arg2 * arg2 * var6.field2467[arg1] + 1024 >> 11;
        var8.field2443 = var6.field2471[arg1] & 0xFF;
        var8.field2436 = (arg1 << 8) - (var6.field2465[arg1] & 0x7FFF);
        var8.field2447 = 0;
        var8.field2440 = 0;
        var8.field2441 = 0;
        var8.field2442 = -1;
        var8.field2439 = 0;
        if (this.field2416[arg0] == 0) {
            var8.field2446 = class112.method2357(var7, this.method3407(var8), this.method3396(var8), this.method3397(var8));
        } else {
            var8.field2446 = class112.method2357(var7, this.method3407(var8), 0, this.method3397(var8));
            this.method3432(var8, var6.field2465[arg1] < 0);
        }
        if (var6.field2465[arg1] < 0) {
            var8.field2446.method2329(-1);
        }
        if (var8.field2437 >= 0) {
            class200 var9 = this.field2420[arg0][var8.field2437];
            if (var9 != null && var9.field2442 < 0) {
                this.field2419[arg0][var9.field2433] = null;
                var9.field2442 = 0;
            }
            this.field2420[arg0][var8.field2437] = var8;
        }
        this.field2425.field2475.method4554(var8);
        this.field2419[arg0][arg1] = var8;
    }

    @ObfuscatedName("gm.z(Lgl;ZI)V")
    public void method3432(class200 arg0, boolean arg1) {
        int var3 = arg0.field2430.field1352.length;
        int var5;
        if (arg1 && arg0.field2430.field1353) {
            int var4 = var3 + var3 - arg0.field2430.field1354;
            var5 = (int) ((long) this.field2416[arg0.field2445] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2446.method2336(true);
            }
        } else {
            var5 = (int) ((long) this.field2416[arg0.field2445] * (long) var3 >> 6);
        }
        arg0.field2446.method2335(var5);
    }

    @ObfuscatedName("gm.h(IIII)V")
    public void method3406(int arg0, int arg1, int arg2) {
        class200 var4 = this.field2419[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2419[arg0][arg1] = null;
        if ((this.field2413[arg0] & 0x2) == 0) {
            var4.field2442 = 0;
            return;
        }
        for (class200 var5 = (class200) this.field2425.field2475.method4540(); var5 != null; var5 = (class200) this.field2425.field2475.method4533()) {
            if (var4.field2445 == var5.field2445 && var5.field2442 < 0 && var4 != var5) {
                var4.field2442 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gm.m(IIII)V")
    public void method3385(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gm.aa(IIS)V")
    public void method3403(int arg0, int arg1) {
    }

    @ObfuscatedName("gm.av(III)V")
    public void method3386(int arg0, int arg1) {
        this.field2411[arg0] = arg1;
    }

    @ObfuscatedName("gm.ay(IB)V")
    public void method3459(int arg0) {
        for (class200 var2 = (class200) this.field2425.field2475.method4540(); var2 != null; var2 = (class200) this.field2425.field2475.method4533()) {
            if (arg0 < 0 || var2.field2445 == arg0) {
                if (var2.field2446 != null) {
                    var2.field2446.method2339(Statics.field2491 / 100);
                    if (var2.field2446.method2342()) {
                        this.field2425.field2476.method2107(var2.field2446);
                    }
                    var2.method3473();
                }
                if (var2.field2442 < 0) {
                    this.field2419[var2.field2445][var2.field2433] = null;
                }
                var2.method3292();
            }
        }
    }

    @ObfuscatedName("gm.ag(II)V")
    public void method3388(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3388(var2);
            }
            return;
        }
        this.field2406[arg0] = 12800;
        this.field2405[arg0] = 8192;
        this.field2409[arg0] = 16383;
        this.field2411[arg0] = 8192;
        this.field2427[arg0] = 0;
        this.field2412[arg0] = 8192;
        this.method3391(arg0);
        this.method3470(arg0);
        this.field2413[arg0] = 0;
        this.field2414[arg0] = 32767;
        this.field2418[arg0] = 256;
        this.field2416[arg0] = 0;
        this.method3394(arg0, 8192);
    }

    @ObfuscatedName("gm.ae(II)V")
    public void method3389(int arg0) {
        for (class200 var2 = (class200) this.field2425.field2475.method4540(); var2 != null; var2 = (class200) this.field2425.field2475.method4533()) {
            if ((arg0 < 0 || var2.field2445 == arg0) && var2.field2442 < 0) {
                this.field2419[var2.field2445][var2.field2433] = null;
                var2.field2442 = 0;
            }
        }
    }

    @ObfuscatedName("gm.ad(I)V")
    public void method3390() {
        this.method3459(-1);
        this.method3388(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2408[var1] = this.field2407[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2415[var2] = this.field2407[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gm.aj(II)V")
    public void method3391(int arg0) {
        if ((this.field2413[arg0] & 0x2) == 0) {
            return;
        }
        for (class200 var2 = (class200) this.field2425.field2475.method4540(); var2 != null; var2 = (class200) this.field2425.field2475.method4533()) {
            if (var2.field2445 == arg0 && this.field2419[arg0][var2.field2433] == null && var2.field2442 < 0) {
                var2.field2442 = 0;
            }
        }
    }

    @ObfuscatedName("gm.ax(II)V")
    public void method3470(int arg0) {
        if ((this.field2413[arg0] & 0x4) == 0) {
            return;
        }
        for (class200 var2 = (class200) this.field2425.field2475.method4540(); var2 != null; var2 = (class200) this.field2425.field2475.method4533()) {
            if (var2.field2445 == arg0) {
                var2.field2448 = 0;
            }
        }
    }

    @ObfuscatedName("gm.af(II)V")
    public void method3377(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3406(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3384(var6, var7, var8);
            } else {
                this.method3406(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3385(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2415[var12] = (var14 << 14) + (this.field2415[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2415[var12] = (var14 << 7) + (this.field2415[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2427[var12] = (var14 << 7) + (this.field2427[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2427[var12] = (this.field2427[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2412[var12] = (var14 << 7) + (this.field2412[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2412[var12] = (this.field2412[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2406[var12] = (var14 << 7) + (this.field2406[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2406[var12] = (this.field2406[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2405[var12] = (var14 << 7) + (this.field2405[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2405[var12] = (this.field2405[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2409[var12] = (var14 << 7) + (this.field2409[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2409[var12] = (this.field2409[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2413[var12] |= 0x1;
                } else {
                    this.field2413[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2413[var12] |= 0x2;
                } else {
                    this.method3391(var12);
                    this.field2413[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2414[var12] = (var14 << 7) + (this.field2414[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2414[var12] = (this.field2414[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2414[var12] = (var14 << 7) + (this.field2414[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2414[var12] = (this.field2414[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3459(var12);
            }
            if (var13 == 121) {
                this.method3388(var12);
            }
            if (var13 == 123) {
                this.method3389(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2414[var12];
                if (var15 == 16384) {
                    this.field2418[var12] = (var14 << 7) + (this.field2418[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2414[var12];
                if (var16 == 16384) {
                    this.field2418[var12] = (this.field2418[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2416[var12] = (var14 << 7) + (this.field2416[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2416[var12] = (this.field2416[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2413[var12] |= 0x4;
                } else {
                    this.method3470(var12);
                    this.field2413[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3394(var12, (var14 << 7) + (this.field2417[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3394(var12, (this.field2417[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3383(var17, this.field2415[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3403(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3386(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3390();
            }
        }
    }

    @ObfuscatedName("gm.ap(III)V")
    public void method3394(int arg0, int arg1) {
        this.field2417[arg0] = arg1;
        this.field2426[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gm.ai(Lgl;S)I")
    public int method3407(class200 arg0) {
        int var2 = (arg0.field2438 * arg0.field2435 >> 12) + arg0.field2436;
        int var3 = ((this.field2411[arg0.field2445] - 8192) * this.field2418[arg0.field2445] >> 12) + var2;
        class197 var4 = arg0.field2431;
        if (var4.field2384 > 0 && (var4.field2383 > 0 || this.field2427[arg0.field2445] > 0)) {
            int var5 = var4.field2383 << 2;
            int var6 = var4.field2381 << 1;
            if (arg0.field2444 < var6) {
                var5 = arg0.field2444 * var5 / var6;
            }
            int var7 = (this.field2427[arg0.field2445] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2428 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2430.field1356 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field2491 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gm.am(Lgl;I)I")
    public int method3396(class200 arg0) {
        class197 var2 = arg0.field2431;
        int var3 = this.field2409[arg0.field2445] * this.field2406[arg0.field2445] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2434 * var4 + 16384 >> 15;
        int var6 = this.field2402 * var5 + 128 >> 8;
        if (var2.field2379 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2447 * 1.953125E-5D * (double) var2.field2379) + 0.5D);
        }
        if (var2.field2386 != null) {
            int var7 = arg0.field2440;
            int var8 = var2.field2386[arg0.field2441 + 1];
            if (arg0.field2441 < var2.field2386.length - 2) {
                int var9 = (var2.field2386[arg0.field2441] & 0xFF) << 8;
                int var10 = (var2.field2386[arg0.field2441 + 2] & 0xFF) << 8;
                var8 += (var2.field2386[arg0.field2441 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2442 > 0 && var2.field2378 != null) {
            int var11 = arg0.field2442;
            int var12 = var2.field2378[arg0.field2439 + 1];
            if (arg0.field2439 < var2.field2378.length - 2) {
                int var13 = (var2.field2378[arg0.field2439] & 0xFF) << 8;
                int var14 = (var2.field2378[arg0.field2439 + 2] & 0xFF) << 8;
                var12 += (var2.field2378[arg0.field2439 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gm.ab(Lgl;I)I")
    public int method3397(class200 arg0) {
        int var2 = this.field2405[arg0.field2445];
        return var2 < 8192 ? arg0.field2443 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2443) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gm.b()Ldl;")
    public synchronized class114 method2113() {
        return this.field2425;
    }

    @ObfuscatedName("gm.e()Ldl;")
    public synchronized class114 method2114() {
        return null;
    }

    @ObfuscatedName("gm.x()I")
    public synchronized int method2122() {
        return 0;
    }

    @ObfuscatedName("gm.a([III)V")
    public synchronized void method2134(int[] arg0, int arg1, int arg2) {
        if (this.field2421.method3484()) {
            int var4 = this.field2403 * this.field2421.field2450 / Statics.field2491;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2410;
                if (this.field2401 - var5 >= 0L) {
                    this.field2410 = var5;
                    break;
                }
                int var7 = (int) ((this.field2401 - this.field2410 + (long) var4 - 1L) / (long) var4);
                this.field2410 += (long) var4 * (long) var7;
                this.field2425.method2134(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3400();
            } while (this.field2421.method3484());
        }
        this.field2425.method2134(arg0, arg1, arg2);
    }

    @ObfuscatedName("gm.c(I)V")
    public synchronized void method2111(int arg0) {
        if (this.field2421.method3484()) {
            int var2 = this.field2403 * this.field2421.field2450 / Statics.field2491;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2410;
                if (this.field2401 - var3 >= 0L) {
                    this.field2410 = var3;
                    break;
                }
                int var5 = (int) ((this.field2401 - this.field2410 + (long) var2 - 1L) / (long) var2);
                this.field2410 += (long) var2 * (long) var5;
                this.field2425.method2111(var5);
                arg0 -= var5;
                this.method3400();
            } while (this.field2421.method3484());
        }
        this.field2425.method2111(arg0);
    }

    @ObfuscatedName("gm.bj(I)V")
    public void method3400() {
        int var1 = this.field2423;
        int var2 = this.field2424;
        long var3 = this.field2401;
        while (this.field2424 == var2) {
            while (this.field2421.field2457[var1] == var2) {
                this.field2421.method3486(var1);
                int var5 = this.field2421.method3503(var1);
                if (var5 == 1) {
                    this.field2421.method3519();
                    this.field2421.method3487(var1);
                    if (this.field2421.method3495()) {
                        if (!this.field2404 || var2 == 0) {
                            this.method3390();
                            this.field2421.method3516();
                            return;
                        }
                        this.field2421.method3480(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3377(var5);
                }
                this.field2421.method3489(var1);
                this.field2421.method3487(var1);
            }
            var1 = this.field2421.method3494();
            var2 = this.field2421.field2457[var1];
            var3 = this.field2421.method3493(var2);
        }
        this.field2423 = var1;
        this.field2424 = var2;
        this.field2401 = var3;
    }

    @ObfuscatedName("gm.bg(Lgl;B)Z")
    public boolean method3435(class200 arg0) {
        if (arg0.field2446 != null) {
            return false;
        }
        if (arg0.field2442 >= 0) {
            arg0.method3292();
            if (arg0.field2437 > 0 && this.field2420[arg0.field2445][arg0.field2437] == arg0) {
                this.field2420[arg0.field2445][arg0.field2437] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gm.bw(Lgl;[IIII)Z")
    public boolean method3402(class200 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2432 = Statics.field2491 / 100;
        if (arg0.field2442 >= 0 && arg0.field2446 == null || arg0.field2446.method2418()) {
            arg0.method3473();
            arg0.method3292();
            if (arg0.field2437 > 0 && this.field2420[arg0.field2445][arg0.field2437] == arg0) {
                this.field2420[arg0.field2445][arg0.field2437] = null;
            }
            return true;
        }
        int var5 = arg0.field2438;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2412[arg0.field2445] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2438 = var6;
        }
        arg0.field2446.method2384(this.method3407(arg0));
        class197 var7 = arg0.field2431;
        boolean var8 = false;
        arg0.field2444++;
        arg0.field2428 += var7.field2384;
        double var9 = (double) ((arg0.field2433 - 60 << 8) + (arg0.field2438 * arg0.field2435 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2379 > 0) {
            if (var7.field2385 > 0) {
                arg0.field2447 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2385 * var9) + 0.5D);
            } else {
                arg0.field2447 += 128;
            }
        }
        if (var7.field2386 != null) {
            if (var7.field2388 > 0) {
                arg0.field2440 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2388 * var9) + 0.5D);
            } else {
                arg0.field2440 += 128;
            }
            while (arg0.field2441 < var7.field2386.length - 2 && arg0.field2440 > (var7.field2386[arg0.field2441 + 2] & 0xFF) << 8) {
                arg0.field2441 += 2;
            }
            if (arg0.field2441 == var7.field2386.length - 2 && var7.field2386[arg0.field2441 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2442 >= 0 && var7.field2378 != null && (this.field2413[arg0.field2445] & 0x1) == 0 && (arg0.field2437 < 0 || this.field2420[arg0.field2445][arg0.field2437] != arg0)) {
            if (var7.field2377 > 0) {
                arg0.field2442 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2377 * var9) + 0.5D);
            } else {
                arg0.field2442 += 128;
            }
            while (arg0.field2439 < var7.field2378.length - 2 && arg0.field2442 > (var7.field2378[arg0.field2439 + 2] & 0xFF) << 8) {
                arg0.field2439 += 2;
            }
            if (arg0.field2439 == var7.field2378.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2446.method2433(arg0.field2432, this.method3396(arg0), this.method3397(arg0));
            return false;
        }
        arg0.field2446.method2339(arg0.field2432);
        if (arg1 == null) {
            arg0.field2446.method2111(arg3);
        } else {
            arg0.field2446.method2134(arg1, arg2, arg3);
        }
        if (arg0.field2446.method2342()) {
            this.field2425.field2476.method2107(arg0.field2446);
        }
        arg0.method3473();
        if (arg0.field2442 >= 0) {
            arg0.method3292();
            if (arg0.field2437 > 0 && this.field2420[arg0.field2445][arg0.field2437] == arg0) {
                this.field2420[arg0.field2445][arg0.field2437] = null;
            }
        }
        return true;
    }
}
