package deob;

@ObfuscatedName("gt")
public class class199 extends class116 {

    @ObfuscatedName("gt.c")
    public class318 field2397 = new class318(128);

    @ObfuscatedName("gt.x")
    public int field2395 = 256;

    @ObfuscatedName("gt.t")
    public int field2402 = 1000000;

    @ObfuscatedName("gt.g")
    public int[] field2386 = new int[16];

    @ObfuscatedName("gt.l")
    public int[] field2387 = new int[16];

    @ObfuscatedName("gt.u")
    public int[] field2388 = new int[16];

    @ObfuscatedName("gt.j")
    public int[] field2389 = new int[16];

    @ObfuscatedName("gt.v")
    public int[] field2390 = new int[16];

    @ObfuscatedName("gt.d")
    public int[] field2391 = new int[16];

    @ObfuscatedName("gt.z")
    public int[] field2385 = new int[16];

    @ObfuscatedName("gt.n")
    public int[] field2393 = new int[16];

    @ObfuscatedName("gt.h")
    public int[] field2394 = new int[16];

    @ObfuscatedName("gt.r")
    public int[] field2396 = new int[16];

    @ObfuscatedName("gt.k")
    public int[] field2407 = new int[16];

    @ObfuscatedName("gt.w")
    public int[] field2406 = new int[16];

    @ObfuscatedName("gt.m")
    public int[] field2399 = new int[16];

    @ObfuscatedName("gt.o")
    public int[] field2384 = new int[16];

    @ObfuscatedName("gt.a")
    public int[] field2401 = new int[16];

    @ObfuscatedName("gt.b")
    public class200[][] field2392 = new class200[16][128];

    @ObfuscatedName("gt.ag")
    public class200[][] field2403 = new class200[16][128];

    @ObfuscatedName("gt.at")
    public class201 field2404 = new class201();

    @ObfuscatedName("gt.ao")
    public boolean field2405;

    @ObfuscatedName("gt.av")
    public int field2400;

    @ObfuscatedName("gt.an")
    public int field2398;

    @ObfuscatedName("gt.al")
    public long field2408;

    @ObfuscatedName("gt.as")
    public long field2409;

    @ObfuscatedName("gt.ad")
    public class203 field2410 = new class203(this);

    public class199() {
        this.method3435();
    }

    @ObfuscatedName("gt.c(IB)V")
    public synchronized void method3416(int arg0) {
        this.field2395 = arg0;
    }

    @ObfuscatedName("gt.x(I)I")
    public int method3417() {
        return this.field2395;
    }

    @ObfuscatedName("gt.t(Lgy;Lhz;Ldy;IB)Z")
    public synchronized boolean method3418(class204 arg0, class234 arg1, class109 arg2, int arg3) {
        arg0.method3606();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class178 var7 = (class178) arg0.field2465.method5516(); var7 != null; var7 = (class178) arg0.field2465.method5518()) {
            int var8 = (int) var7.field2096;
            class202 var9 = (class202) this.field2397.method5524((long) var8);
            if (var9 == null) {
                var9 = class202.method33(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2397.method5517(var9, (long) var8);
            }
            if (!var9.method3585(arg2, var7.field2090, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3609();
        }
        return var5;
    }

    @ObfuscatedName("gt.g(B)V")
    public synchronized void method3519() {
        for (class202 var1 = (class202) this.field2397.method5516(); var1 != null; var1 = (class202) this.field2397.method5518()) {
            var1.method3587();
        }
    }

    @ObfuscatedName("gt.l(B)V")
    public synchronized void method3420() {
        for (class202 var1 = (class202) this.field2397.method5516(); var1 != null; var1 = (class202) this.field2397.method5518()) {
            var1.method3326();
        }
    }

    @ObfuscatedName("gt.z(Lgy;ZI)V")
    public synchronized void method3421(class204 arg0, boolean arg1) {
        this.method3422();
        this.field2404.method3533(arg0.field2464);
        this.field2405 = arg1;
        this.field2408 = 0L;
        int var3 = this.field2404.method3536();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2404.method3584(var4);
            this.field2404.method3540(var4);
            this.field2404.method3538(var4);
        }
        this.field2400 = this.field2404.method3544();
        this.field2398 = this.field2404.field2440[this.field2400];
        this.field2409 = this.field2404.method3574(this.field2398);
    }

    @ObfuscatedName("gt.p(B)V")
    public synchronized void method3422() {
        this.field2404.method3534();
        this.method3435();
    }

    @ObfuscatedName("gt.e(I)Z")
    public synchronized boolean method3434() {
        return this.field2404.method3568();
    }

    @ObfuscatedName("gt.i(III)V")
    public synchronized void method3451(int arg0, int arg1) {
        this.method3425(arg0, arg1);
    }

    @ObfuscatedName("gt.q(IIB)V")
    public void method3425(int arg0, int arg1) {
        this.field2389[arg0] = arg1;
        this.field2391[arg0] = arg1 & 0xFFFFFF80;
        this.method3438(arg0, arg1);
    }

    @ObfuscatedName("gt.r(III)V")
    public void method3438(int arg0, int arg1) {
        if (this.field2390[arg0] != arg1) {
            this.field2390[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2403[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gt.k(IIIB)V")
    public void method3427(int arg0, int arg1, int arg2) {
        this.method3429(arg0, arg1, 64);
        if ((this.field2396[arg0] & 0x2) != 0) {
            for (class200 var4 = (class200) this.field2410.field2460.method4551(); var4 != null; var4 = (class200) this.field2410.field2460.method4553()) {
                if (var4.field2432 == arg0 && var4.field2426 < 0) {
                    this.field2392[arg0][var4.field2414] = null;
                    this.field2392[arg0][arg1] = var4;
                    int var5 = (var4.field2434 * var4.field2421 >> 12) + var4.field2420;
                    var4.field2420 += arg1 - var4.field2414 << 8;
                    var4.field2421 = var5 - var4.field2420;
                    var4.field2434 = 4096;
                    var4.field2414 = arg1;
                    return;
                }
            }
        }
        class202 var6 = (class202) this.field2397.method5524((long) this.field2390[arg0]);
        if (var6 == null) {
            return;
        }
        class104 var7 = var6.field2449[arg1];
        if (var7 == null) {
            return;
        }
        class200 var8 = new class200();
        var8.field2432 = arg0;
        var8.field2413 = var6;
        var8.field2412 = var7;
        var8.field2416 = var6.field2450[arg1];
        var8.field2427 = var6.field2455[arg1];
        var8.field2414 = arg1;
        var8.field2418 = var6.field2454 * arg2 * arg2 * var6.field2452[arg1] + 1024 >> 11;
        var8.field2419 = var6.field2453[arg1] & 0xFF;
        var8.field2420 = (arg1 << 8) - (var6.field2451[arg1] & 0x7FFF);
        var8.field2415 = 0;
        var8.field2424 = 0;
        var8.field2425 = 0;
        var8.field2426 = -1;
        var8.field2417 = 0;
        if (this.field2399[arg0] == 0) {
            var8.field2430 = class114.method2334(var7, this.method3506(var8), this.method3504(var8), this.method3486(var8));
        } else {
            var8.field2430 = class114.method2334(var7, this.method3506(var8), 0, this.method3486(var8));
            this.method3428(var8, var6.field2451[arg1] < 0);
        }
        if (var6.field2451[arg1] < 0) {
            var8.field2430.method2336(-1);
        }
        if (var8.field2427 >= 0) {
            class200 var9 = this.field2403[arg0][var8.field2427];
            if (var9 != null && var9.field2426 < 0) {
                this.field2392[arg0][var9.field2414] = null;
                var9.field2426 = 0;
            }
            this.field2403[arg0][var8.field2427] = var8;
        }
        this.field2410.field2460.method4572(var8);
        this.field2392[arg0][arg1] = var8;
    }

    @ObfuscatedName("gt.w(Lgs;ZI)V")
    public void method3428(class200 arg0, boolean arg1) {
        int var3 = arg0.field2412.field1357.length;
        int var5;
        if (arg1 && arg0.field2412.field1359) {
            int var4 = var3 + var3 - arg0.field2412.field1355;
            var5 = (int) ((long) this.field2399[arg0.field2432] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2430.method2366(true);
            }
        } else {
            var5 = (int) ((long) this.field2399[arg0.field2432] * (long) var3 >> 6);
        }
        arg0.field2430.method2382(var5);
    }

    @ObfuscatedName("gt.m(IIII)V")
    public void method3429(int arg0, int arg1, int arg2) {
        class200 var4 = this.field2392[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2392[arg0][arg1] = null;
        if ((this.field2396[arg0] & 0x2) == 0) {
            var4.field2426 = 0;
            return;
        }
        for (class200 var5 = (class200) this.field2410.field2460.method4550(); var5 != null; var5 = (class200) this.field2410.field2460.method4573()) {
            if (var4.field2432 == var5.field2432 && var5.field2426 < 0 && var4 != var5) {
                var4.field2426 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gt.o(IIII)V")
    public void method3430(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gt.a(III)V")
    public void method3431(int arg0, int arg1) {
    }

    @ObfuscatedName("gt.b(III)V")
    public void method3518(int arg0, int arg1) {
        this.field2385[arg0] = arg1;
    }

    @ObfuscatedName("gt.ag(II)V")
    public void method3460(int arg0) {
        for (class200 var2 = (class200) this.field2410.field2460.method4550(); var2 != null; var2 = (class200) this.field2410.field2460.method4573()) {
            if (arg0 < 0 || var2.field2432 == arg0) {
                if (var2.field2430 != null) {
                    var2.field2430.method2359(Statics.field29 / 100);
                    if (var2.field2430.method2417()) {
                        this.field2410.field2459.method2144(var2.field2430);
                    }
                    var2.method3527();
                }
                if (var2.field2426 < 0) {
                    this.field2392[var2.field2432][var2.field2414] = null;
                }
                var2.method3326();
            }
        }
    }

    @ObfuscatedName("gt.at(IS)V")
    public void method3481(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3481(var2);
            }
            return;
        }
        this.field2386[arg0] = 12800;
        this.field2387[arg0] = 8192;
        this.field2388[arg0] = 16383;
        this.field2385[arg0] = 8192;
        this.field2393[arg0] = 0;
        this.field2394[arg0] = 8192;
        this.method3436(arg0);
        this.method3437(arg0);
        this.field2396[arg0] = 0;
        this.field2407[arg0] = 32767;
        this.field2406[arg0] = 256;
        this.field2399[arg0] = 0;
        this.method3511(arg0, 8192);
    }

    @ObfuscatedName("gt.ax(IB)V")
    public void method3432(int arg0) {
        for (class200 var2 = (class200) this.field2410.field2460.method4550(); var2 != null; var2 = (class200) this.field2410.field2460.method4573()) {
            if ((arg0 < 0 || var2.field2432 == arg0) && var2.field2426 < 0) {
                this.field2392[var2.field2432][var2.field2414] = null;
                var2.field2426 = 0;
            }
        }
    }

    @ObfuscatedName("gt.aj(I)V")
    public void method3435() {
        this.method3460(-1);
        this.method3481(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2390[var1] = this.field2389[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2391[var2] = this.field2389[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gt.ab(IB)V")
    public void method3436(int arg0) {
        if ((this.field2396[arg0] & 0x2) == 0) {
            return;
        }
        for (class200 var2 = (class200) this.field2410.field2460.method4550(); var2 != null; var2 = (class200) this.field2410.field2460.method4573()) {
            if (var2.field2432 == arg0 && this.field2392[arg0][var2.field2414] == null && var2.field2426 < 0) {
                var2.field2426 = 0;
            }
        }
    }

    @ObfuscatedName("gt.ak(II)V")
    public void method3437(int arg0) {
        if ((this.field2396[arg0] & 0x4) == 0) {
            return;
        }
        for (class200 var2 = (class200) this.field2410.field2460.method4550(); var2 != null; var2 = (class200) this.field2410.field2460.method4573()) {
            if (var2.field2432 == arg0) {
                var2.field2423 = 0;
            }
        }
    }

    @ObfuscatedName("gt.ay(II)V")
    public void method3454(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3429(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3427(var6, var7, var8);
            } else {
                this.method3429(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3430(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2391[var12] = (var14 << 14) + (this.field2391[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2391[var12] = (var14 << 7) + (this.field2391[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2393[var12] = (var14 << 7) + (this.field2393[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2393[var12] = (this.field2393[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2394[var12] = (var14 << 7) + (this.field2394[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2394[var12] = (this.field2394[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2386[var12] = (var14 << 7) + (this.field2386[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2386[var12] = (this.field2386[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2387[var12] = (var14 << 7) + (this.field2387[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2387[var12] = (this.field2387[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2388[var12] = (var14 << 7) + (this.field2388[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2388[var12] = (this.field2388[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2396[var12] |= 0x1;
                } else {
                    this.field2396[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2396[var12] |= 0x2;
                } else {
                    this.method3436(var12);
                    this.field2396[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2407[var12] = (var14 << 7) + (this.field2407[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2407[var12] = (this.field2407[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2407[var12] = (var14 << 7) + (this.field2407[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2407[var12] = (this.field2407[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3460(var12);
            }
            if (var13 == 121) {
                this.method3481(var12);
            }
            if (var13 == 123) {
                this.method3432(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2407[var12];
                if (var15 == 16384) {
                    this.field2406[var12] = (var14 << 7) + (this.field2406[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2407[var12];
                if (var16 == 16384) {
                    this.field2406[var12] = (this.field2406[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2399[var12] = (var14 << 7) + (this.field2399[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2399[var12] = (this.field2399[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2396[var12] |= 0x4;
                } else {
                    this.method3437(var12);
                    this.field2396[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3511(var12, (var14 << 7) + (this.field2384[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3511(var12, (this.field2384[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3438(var17, this.field2391[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3431(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3518(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3435();
            }
        }
    }

    @ObfuscatedName("gt.ae(III)V")
    public void method3511(int arg0, int arg1) {
        this.field2384[arg0] = arg1;
        this.field2401[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gt.aa(Lgs;B)I")
    public int method3506(class200 arg0) {
        int var2 = (arg0.field2434 * arg0.field2421 >> 12) + arg0.field2420;
        int var3 = ((this.field2385[arg0.field2432] - 8192) * this.field2406[arg0.field2432] >> 12) + var2;
        class197 var4 = arg0.field2416;
        if (var4.field2368 > 0 && (var4.field2367 > 0 || this.field2393[arg0.field2432] > 0)) {
            int var5 = var4.field2367 << 2;
            int var6 = var4.field2371 << 1;
            if (arg0.field2428 < var6) {
                var5 = arg0.field2428 * var5 / var6;
            }
            int var7 = (this.field2393[arg0.field2432] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2429 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2412.field1356 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field29 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gt.aq(Lgs;I)I")
    public int method3504(class200 arg0) {
        class197 var2 = arg0.field2416;
        int var3 = this.field2386[arg0.field2432] * this.field2388[arg0.field2432] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2418 * var4 + 16384 >> 15;
        int var6 = this.field2395 * var5 + 128 >> 8;
        if (var2.field2369 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2415 * 1.953125E-5D * (double) var2.field2369) + 0.5D);
        }
        if (var2.field2366 != null) {
            int var7 = arg0.field2424;
            int var8 = var2.field2366[arg0.field2425 + 1];
            if (arg0.field2425 < var2.field2366.length - 2) {
                int var9 = (var2.field2366[arg0.field2425] & 0xFF) << 8;
                int var10 = (var2.field2366[arg0.field2425 + 2] & 0xFF) << 8;
                var8 += (var2.field2366[arg0.field2425 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2426 > 0 && var2.field2362 != null) {
            int var11 = arg0.field2426;
            int var12 = var2.field2362[arg0.field2417 + 1];
            if (arg0.field2417 < var2.field2362.length - 2) {
                int var13 = (var2.field2362[arg0.field2417] & 0xFF) << 8;
                int var14 = (var2.field2362[arg0.field2417 + 2] & 0xFF) << 8;
                var12 += (var2.field2362[arg0.field2417 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gt.ar(Lgs;B)I")
    public int method3486(class200 arg0) {
        int var2 = this.field2387[arg0.field2432];
        return var2 < 8192 ? arg0.field2419 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2419) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gt.u()Ldg;")
    public synchronized class116 method2118() {
        return this.field2410;
    }

    @ObfuscatedName("gt.j()Ldg;")
    public synchronized class116 method2119() {
        return null;
    }

    @ObfuscatedName("gt.v()I")
    public synchronized int method2120() {
        return 0;
    }

    @ObfuscatedName("gt.d([III)V")
    public synchronized void method2121(int[] arg0, int arg1, int arg2) {
        if (this.field2404.method3568()) {
            int var4 = this.field2402 * this.field2404.field2439 / Statics.field29;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2408;
                if (this.field2409 - var5 >= 0L) {
                    this.field2408 = var5;
                    break;
                }
                int var7 = (int) ((this.field2409 - this.field2408 + (long) var4 - 1L) / (long) var4);
                this.field2408 += (long) var4 * (long) var7;
                this.field2410.method2121(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3443();
            } while (this.field2404.method3568());
        }
        this.field2410.method2121(arg0, arg1, arg2);
    }

    @ObfuscatedName("gt.s(I)V")
    public synchronized void method2139(int arg0) {
        if (this.field2404.method3568()) {
            int var2 = this.field2402 * this.field2404.field2439 / Statics.field29;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2408;
                if (this.field2409 - var3 >= 0L) {
                    this.field2408 = var3;
                    break;
                }
                int var5 = (int) ((this.field2409 - this.field2408 + (long) var2 - 1L) / (long) var2);
                this.field2408 += (long) var2 * (long) var5;
                this.field2410.method2139(var5);
                arg0 -= var5;
                this.method3443();
            } while (this.field2404.method3568());
        }
        this.field2410.method2139(arg0);
    }

    @ObfuscatedName("gt.ac(I)V")
    public void method3443() {
        int var1 = this.field2400;
        int var2 = this.field2398;
        long var3 = this.field2409;
        while (this.field2398 == var2) {
            while (this.field2404.field2440[var1] == var2) {
                this.field2404.method3584(var1);
                int var5 = this.field2404.method3556(var1);
                if (var5 == 1) {
                    this.field2404.method3539();
                    this.field2404.method3538(var1);
                    if (this.field2404.method3545()) {
                        if (!this.field2405 || var2 == 0) {
                            this.method3435();
                            this.field2404.method3534();
                            return;
                        }
                        this.field2404.method3546(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3454(var5);
                }
                this.field2404.method3540(var1);
                this.field2404.method3538(var1);
            }
            var1 = this.field2404.method3544();
            var2 = this.field2404.field2440[var1];
            var3 = this.field2404.method3574(var2);
        }
        this.field2400 = var1;
        this.field2398 = var2;
        this.field2409 = var3;
    }

    @ObfuscatedName("gt.az(Lgs;I)Z")
    public boolean method3444(class200 arg0) {
        if (arg0.field2430 != null) {
            return false;
        }
        if (arg0.field2426 >= 0) {
            arg0.method3326();
            if (arg0.field2427 > 0 && this.field2403[arg0.field2432][arg0.field2427] == arg0) {
                this.field2403[arg0.field2432][arg0.field2427] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gt.ai(Lgs;[IIII)Z")
    public boolean method3445(class200 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2431 = Statics.field29 / 100;
        if (arg0.field2426 >= 0 && arg0.field2430 == null || arg0.field2430.method2395()) {
            arg0.method3527();
            arg0.method3326();
            if (arg0.field2427 > 0 && this.field2403[arg0.field2432][arg0.field2427] == arg0) {
                this.field2403[arg0.field2432][arg0.field2427] = null;
            }
            return true;
        }
        int var5 = arg0.field2434;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2394[arg0.field2432] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2434 = var6;
        }
        arg0.field2430.method2347(this.method3506(arg0));
        class197 var7 = arg0.field2416;
        boolean var8 = false;
        arg0.field2428++;
        arg0.field2429 += var7.field2368;
        double var9 = (double) ((arg0.field2414 - 60 << 8) + (arg0.field2434 * arg0.field2421 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2369 > 0) {
            if (var7.field2364 > 0) {
                arg0.field2415 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2364 * var9) + 0.5D);
            } else {
                arg0.field2415 += 128;
            }
        }
        if (var7.field2366 != null) {
            if (var7.field2361 > 0) {
                arg0.field2424 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2361 * var9) + 0.5D);
            } else {
                arg0.field2424 += 128;
            }
            while (arg0.field2425 < var7.field2366.length - 2 && arg0.field2424 > (var7.field2366[arg0.field2425 + 2] & 0xFF) << 8) {
                arg0.field2425 += 2;
            }
            if (arg0.field2425 == var7.field2366.length - 2 && var7.field2366[arg0.field2425 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2426 >= 0 && var7.field2362 != null && (this.field2396[arg0.field2432] & 0x1) == 0 && (arg0.field2427 < 0 || this.field2403[arg0.field2432][arg0.field2427] != arg0)) {
            if (var7.field2365 > 0) {
                arg0.field2426 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2365 * var9) + 0.5D);
            } else {
                arg0.field2426 += 128;
            }
            while (arg0.field2417 < var7.field2362.length - 2 && arg0.field2426 > (var7.field2362[arg0.field2417 + 2] & 0xFF) << 8) {
                arg0.field2417 += 2;
            }
            if (arg0.field2417 == var7.field2362.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2430.method2345(arg0.field2431, this.method3504(arg0), this.method3486(arg0));
            return false;
        }
        arg0.field2430.method2359(arg0.field2431);
        if (arg1 == null) {
            arg0.field2430.method2139(arg3);
        } else {
            arg0.field2430.method2121(arg1, arg2, arg3);
        }
        if (arg0.field2430.method2417()) {
            this.field2410.field2459.method2144(arg0.field2430);
        }
        arg0.method3527();
        if (arg0.field2426 >= 0) {
            arg0.method3326();
            if (arg0.field2427 > 0 && this.field2403[arg0.field2432][arg0.field2427] == arg0) {
                this.field2403[arg0.field2432][arg0.field2427] = null;
            }
        }
        return true;
    }
}
