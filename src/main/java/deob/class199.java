package deob;

@ObfuscatedName("gw")
public class class199 extends class116 {

    @ObfuscatedName("gw.c")
    public class319 field2425 = new class319(128);

    @ObfuscatedName("gw.t")
    public int field2435 = 256;

    @ObfuscatedName("gw.o")
    public int field2420 = 1000000;

    @ObfuscatedName("gw.e")
    public int[] field2418 = new int[16];

    @ObfuscatedName("gw.i")
    public int[] field2422 = new int[16];

    @ObfuscatedName("gw.g")
    public int[] field2441 = new int[16];

    @ObfuscatedName("gw.d")
    public int[] field2424 = new int[16];

    @ObfuscatedName("gw.l")
    public int[] field2444 = new int[16];

    @ObfuscatedName("gw.j")
    public int[] field2419 = new int[16];

    @ObfuscatedName("gw.m")
    public int[] field2427 = new int[16];

    @ObfuscatedName("gw.p")
    public int[] field2421 = new int[16];

    @ObfuscatedName("gw.h")
    public int[] field2429 = new int[16];

    @ObfuscatedName("gw.y")
    public int[] field2430 = new int[16];

    @ObfuscatedName("gw.f")
    public int[] field2438 = new int[16];

    @ObfuscatedName("gw.b")
    public int[] field2432 = new int[16];

    @ObfuscatedName("gw.r")
    public int[] field2433 = new int[16];

    @ObfuscatedName("gw.s")
    public int[] field2434 = new int[16];

    @ObfuscatedName("gw.a")
    public int[] field2423 = new int[16];

    @ObfuscatedName("gw.u")
    public class200[][] field2436 = new class200[16][128];

    @ObfuscatedName("gw.ae")
    public class200[][] field2437 = new class200[16][128];

    @ObfuscatedName("gw.af")
    public class201 field2426 = new class201();

    @ObfuscatedName("gw.az")
    public boolean field2439;

    @ObfuscatedName("gw.ax")
    public int field2431;

    @ObfuscatedName("gw.aj")
    public int field2440;

    @ObfuscatedName("gw.au")
    public long field2442;

    @ObfuscatedName("gw.ay")
    public long field2443;

    @ObfuscatedName("gw.aa")
    public class203 field2428 = new class203(this);

    public class199() {
        this.method3531();
    }

    @ObfuscatedName("gw.c(IB)V")
    public synchronized void method3433(int arg0) {
        this.field2435 = arg0;
    }

    @ObfuscatedName("gw.t(B)I")
    public int method3434() {
        return this.field2435;
    }

    @ObfuscatedName("gw.o(Lgk;Lii;Ldv;II)Z")
    public synchronized boolean method3473(class204 arg0, class235 arg1, class109 arg2, int arg3) {
        arg0.method3623();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class178 var7 = (class178) arg0.field2499.method5529(); var7 != null; var7 = (class178) arg0.field2499.method5530()) {
            int var8 = (int) var7.field2115;
            class202 var9 = (class202) this.field2425.method5527((long) var8);
            if (var9 == null) {
                var9 = class202.method920(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2425.method5535(var9, (long) var8);
            }
            if (!var9.method3602(arg2, var7.field2109, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3620();
        }
        return var5;
    }

    @ObfuscatedName("gw.e(B)V")
    public synchronized void method3436() {
        for (class202 var1 = (class202) this.field2425.method5529(); var1 != null; var1 = (class202) this.field2425.method5530()) {
            var1.method3603();
        }
    }

    @ObfuscatedName("gw.i(I)V")
    public synchronized void method3505() {
        for (class202 var1 = (class202) this.field2425.method5529(); var1 != null; var1 = (class202) this.field2425.method5530()) {
            var1.method3351();
        }
    }

    @ObfuscatedName("gw.m(Lgk;ZI)V")
    public synchronized void method3438(class204 arg0, boolean arg1) {
        this.method3439();
        this.field2426.method3555(arg0.field2498);
        this.field2439 = arg1;
        this.field2442 = 0L;
        int var3 = this.field2426.method3557();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2426.method3558(var4);
            this.field2426.method3561(var4);
            this.field2426.method3585(var4);
        }
        this.field2431 = this.field2426.method3566();
        this.field2440 = this.field2426.field2473[this.field2431];
        this.field2443 = this.field2426.method3567(this.field2440);
    }

    @ObfuscatedName("gw.h(B)V")
    public synchronized void method3439() {
        this.field2426.method3556();
        this.method3531();
    }

    @ObfuscatedName("gw.v(I)Z")
    public synchronized boolean method3440() {
        return this.field2426.method3569();
    }

    @ObfuscatedName("gw.n(IIB)V")
    public synchronized void method3475(int arg0, int arg1) {
        this.method3442(arg0, arg1);
    }

    @ObfuscatedName("gw.x(IIB)V")
    public void method3442(int arg0, int arg1) {
        this.field2424[arg0] = arg1;
        this.field2419[arg0] = arg1 & 0xFFFFFF80;
        this.method3443(arg0, arg1);
    }

    @ObfuscatedName("gw.w(IIS)V")
    public void method3443(int arg0, int arg1) {
        if (this.field2444[arg0] != arg1) {
            this.field2444[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2437[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gw.q(IIII)V")
    public void method3444(int arg0, int arg1, int arg2) {
        this.method3540(arg0, arg1, 64);
        if ((this.field2430[arg0] & 0x2) != 0) {
            for (class200 var4 = (class200) this.field2428.field2494.method4551(); var4 != null; var4 = (class200) this.field2428.field2494.method4553()) {
                if (var4.field2448 == arg0 && var4.field2460 < 0) {
                    this.field2436[arg0][var4.field2451] = null;
                    this.field2436[arg0][arg1] = var4;
                    int var5 = (var4.field2456 * var4.field2455 >> 12) + var4.field2447;
                    var4.field2447 += arg1 - var4.field2451 << 8;
                    var4.field2455 = var5 - var4.field2447;
                    var4.field2456 = 4096;
                    var4.field2451 = arg1;
                    return;
                }
            }
        }
        class202 var6 = (class202) this.field2425.method5527((long) this.field2444[arg0]);
        if (var6 == null) {
            return;
        }
        class104 var7 = var6.field2485[arg1];
        if (var7 == null) {
            return;
        }
        class200 var8 = new class200();
        var8.field2448 = arg0;
        var8.field2453 = var6;
        var8.field2467 = var7;
        var8.field2446 = var6.field2488[arg1];
        var8.field2450 = var6.field2486[arg1];
        var8.field2451 = arg1;
        var8.field2452 = var6.field2489 * arg2 * arg2 * var6.field2487[arg1] + 1024 >> 11;
        var8.field2458 = var6.field2483[arg1] & 0xFF;
        var8.field2447 = (arg1 << 8) - (var6.field2484[arg1] & 0x7FFF);
        var8.field2457 = 0;
        var8.field2449 = 0;
        var8.field2459 = 0;
        var8.field2460 = -1;
        var8.field2461 = 0;
        if (this.field2433[arg0] == 0) {
            var8.field2464 = class114.method2434(var7, this.method3458(var8), this.method3459(var8), this.method3460(var8));
        } else {
            var8.field2464 = class114.method2434(var7, this.method3458(var8), 0, this.method3460(var8));
            this.method3445(var8, var6.field2484[arg1] < 0);
        }
        if (var6.field2484[arg1] < 0) {
            var8.field2464.method2423(-1);
        }
        if (var8.field2450 >= 0) {
            class200 var9 = this.field2437[arg0][var8.field2450];
            if (var9 != null && var9.field2460 < 0) {
                this.field2436[arg0][var9.field2451] = null;
                var9.field2460 = 0;
            }
            this.field2437[arg0][var8.field2450] = var8;
        }
        this.field2428.field2494.method4545(var8);
        this.field2436[arg0][arg1] = var8;
    }

    @ObfuscatedName("gw.z(Lgu;ZI)V")
    public void method3445(class200 arg0, boolean arg1) {
        int var3 = arg0.field2467.field1379.length;
        int var5;
        if (arg1 && arg0.field2467.field1380) {
            int var4 = var3 + var3 - arg0.field2467.field1378;
            var5 = (int) ((long) this.field2433[arg0.field2448] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2464.method2470(true);
            }
        } else {
            var5 = (int) ((long) this.field2433[arg0.field2448] * (long) var3 >> 6);
        }
        arg0.field2464.method2399(var5);
    }

    @ObfuscatedName("gw.y(IIIB)V")
    public void method3540(int arg0, int arg1, int arg2) {
        class200 var4 = this.field2436[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2436[arg0][arg1] = null;
        if ((this.field2430[arg0] & 0x2) == 0) {
            var4.field2460 = 0;
            return;
        }
        for (class200 var5 = (class200) this.field2428.field2494.method4543(); var5 != null; var5 = (class200) this.field2428.field2494.method4564()) {
            if (var4.field2448 == var5.field2448 && var5.field2460 < 0 && var4 != var5) {
                var4.field2460 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gw.f(IIII)V")
    public void method3447(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gw.a(III)V")
    public void method3448(int arg0, int arg1) {
    }

    @ObfuscatedName("gw.u(III)V")
    public void method3449(int arg0, int arg1) {
        this.field2427[arg0] = arg1;
    }

    @ObfuscatedName("gw.ae(II)V")
    public void method3450(int arg0) {
        for (class200 var2 = (class200) this.field2428.field2494.method4543(); var2 != null; var2 = (class200) this.field2428.field2494.method4564()) {
            if (arg0 < 0 || var2.field2448 == arg0) {
                if (var2.field2464 != null) {
                    var2.field2464.method2397(Statics.field1399 / 100);
                    if (var2.field2464.method2472()) {
                        this.field2428.field2496.method2154(var2.field2464);
                    }
                    var2.method3546();
                }
                if (var2.field2460 < 0) {
                    this.field2436[var2.field2448][var2.field2451] = null;
                }
                var2.method3351();
            }
        }
    }

    @ObfuscatedName("gw.af(II)V")
    public void method3457(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3457(var2);
            }
            return;
        }
        this.field2418[arg0] = 12800;
        this.field2422[arg0] = 8192;
        this.field2441[arg0] = 16383;
        this.field2427[arg0] = 8192;
        this.field2421[arg0] = 0;
        this.field2429[arg0] = 8192;
        this.method3454(arg0);
        this.method3455(arg0);
        this.field2430[arg0] = 0;
        this.field2438[arg0] = 32767;
        this.field2432[arg0] = 256;
        this.field2433[arg0] = 0;
        this.method3441(arg0, 8192);
    }

    @ObfuscatedName("gw.av(IB)V")
    public void method3464(int arg0) {
        for (class200 var2 = (class200) this.field2428.field2494.method4543(); var2 != null; var2 = (class200) this.field2428.field2494.method4564()) {
            if ((arg0 < 0 || var2.field2448 == arg0) && var2.field2460 < 0) {
                this.field2436[var2.field2448][var2.field2451] = null;
                var2.field2460 = 0;
            }
        }
    }

    @ObfuscatedName("gw.al(I)V")
    public void method3531() {
        this.method3450(-1);
        this.method3457(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2444[var1] = this.field2424[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2419[var2] = this.field2424[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gw.at(II)V")
    public void method3454(int arg0) {
        if ((this.field2430[arg0] & 0x2) == 0) {
            return;
        }
        for (class200 var2 = (class200) this.field2428.field2494.method4543(); var2 != null; var2 = (class200) this.field2428.field2494.method4564()) {
            if (var2.field2448 == arg0 && this.field2436[arg0][var2.field2451] == null && var2.field2460 < 0) {
                var2.field2460 = 0;
            }
        }
    }

    @ObfuscatedName("gw.an(II)V")
    public void method3455(int arg0) {
        if ((this.field2430[arg0] & 0x4) == 0) {
            return;
        }
        for (class200 var2 = (class200) this.field2428.field2494.method4543(); var2 != null; var2 = (class200) this.field2428.field2494.method4564()) {
            if (var2.field2448 == arg0) {
                var2.field2466 = 0;
            }
        }
    }

    @ObfuscatedName("gw.ai(II)V")
    public void method3456(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3540(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3444(var6, var7, var8);
            } else {
                this.method3540(var6, var7, 64);
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
                this.field2419[var12] = (var14 << 14) + (this.field2419[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2419[var12] = (var14 << 7) + (this.field2419[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2421[var12] = (var14 << 7) + (this.field2421[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2421[var12] = (this.field2421[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2429[var12] = (var14 << 7) + (this.field2429[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2429[var12] = (this.field2429[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2418[var12] = (var14 << 7) + (this.field2418[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2418[var12] = (this.field2418[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2422[var12] = (var14 << 7) + (this.field2422[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2422[var12] = (this.field2422[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2441[var12] = (var14 << 7) + (this.field2441[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2441[var12] = (this.field2441[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2430[var12] |= 0x1;
                } else {
                    this.field2430[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2430[var12] |= 0x2;
                } else {
                    this.method3454(var12);
                    this.field2430[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2438[var12] = (var14 << 7) + (this.field2438[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2438[var12] = (this.field2438[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2438[var12] = (var14 << 7) + (this.field2438[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2438[var12] = (this.field2438[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3450(var12);
            }
            if (var13 == 121) {
                this.method3457(var12);
            }
            if (var13 == 123) {
                this.method3464(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2438[var12];
                if (var15 == 16384) {
                    this.field2432[var12] = (var14 << 7) + (this.field2432[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2438[var12];
                if (var16 == 16384) {
                    this.field2432[var12] = (this.field2432[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2433[var12] = (var14 << 7) + (this.field2433[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2433[var12] = (this.field2433[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2430[var12] |= 0x4;
                } else {
                    this.method3455(var12);
                    this.field2430[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3441(var12, (var14 << 7) + (this.field2434[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3441(var12, (this.field2434[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3443(var17, this.field2419[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3448(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3449(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3531();
            }
        }
    }

    @ObfuscatedName("gw.ab(IIS)V")
    public void method3441(int arg0, int arg1) {
        this.field2434[arg0] = arg1;
        this.field2423[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gw.ap(Lgu;I)I")
    public int method3458(class200 arg0) {
        int var2 = (arg0.field2456 * arg0.field2455 >> 12) + arg0.field2447;
        int var3 = ((this.field2427[arg0.field2448] - 8192) * this.field2432[arg0.field2448] >> 12) + var2;
        class197 var4 = arg0.field2446;
        if (var4.field2406 > 0 && (var4.field2399 > 0 || this.field2421[arg0.field2448] > 0)) {
            int var5 = var4.field2399 << 2;
            int var6 = var4.field2407 << 1;
            if (arg0.field2462 < var6) {
                var5 = arg0.field2462 * var5 / var6;
            }
            int var7 = (this.field2421[arg0.field2448] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2454 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2467.field1377 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1399 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gw.ah(Lgu;I)I")
    public int method3459(class200 arg0) {
        class197 var2 = arg0.field2446;
        int var3 = this.field2441[arg0.field2448] * this.field2418[arg0.field2448] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2452 * var4 + 16384 >> 15;
        int var6 = this.field2435 * var5 + 128 >> 8;
        if (var2.field2405 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2457 * 1.953125E-5D * (double) var2.field2405) + 0.5D);
        }
        if (var2.field2403 != null) {
            int var7 = arg0.field2449;
            int var8 = var2.field2403[arg0.field2459 + 1];
            if (arg0.field2459 < var2.field2403.length - 2) {
                int var9 = (var2.field2403[arg0.field2459] & 0xFF) << 8;
                int var10 = (var2.field2403[arg0.field2459 + 2] & 0xFF) << 8;
                var8 += (var2.field2403[arg0.field2459 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2460 > 0 && var2.field2400 != null) {
            int var11 = arg0.field2460;
            int var12 = var2.field2400[arg0.field2461 + 1];
            if (arg0.field2461 < var2.field2400.length - 2) {
                int var13 = (var2.field2400[arg0.field2461] & 0xFF) << 8;
                int var14 = (var2.field2400[arg0.field2461 + 2] & 0xFF) << 8;
                var12 += (var2.field2400[arg0.field2461 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gw.bq(Lgu;I)I")
    public int method3460(class200 arg0) {
        int var2 = this.field2422[arg0.field2448];
        return var2 < 8192 ? arg0.field2458 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2458) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gw.g()Ldn;")
    public synchronized class116 method2159() {
        return this.field2428;
    }

    @ObfuscatedName("gw.d()Ldn;")
    public synchronized class116 method2160() {
        return null;
    }

    @ObfuscatedName("gw.l()I")
    public synchronized int method2161() {
        return 0;
    }

    @ObfuscatedName("gw.j([III)V")
    public synchronized void method2162(int[] arg0, int arg1, int arg2) {
        if (this.field2426.method3569()) {
            int var4 = this.field2420 * this.field2426.field2470 / Statics.field1399;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2442;
                if (this.field2443 - var5 >= 0L) {
                    this.field2442 = var5;
                    break;
                }
                int var7 = (int) ((this.field2443 - this.field2442 + (long) var4 - 1L) / (long) var4);
                this.field2442 += (long) var4 * (long) var7;
                this.field2428.method2162(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3465();
            } while (this.field2426.method3569());
        }
        this.field2428.method2162(arg0, arg1, arg2);
    }

    @ObfuscatedName("gw.p(I)V")
    public synchronized void method2180(int arg0) {
        if (this.field2426.method3569()) {
            int var2 = this.field2420 * this.field2426.field2470 / Statics.field1399;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2442;
                if (this.field2443 - var3 >= 0L) {
                    this.field2442 = var3;
                    break;
                }
                int var5 = (int) ((this.field2443 - this.field2442 + (long) var2 - 1L) / (long) var2);
                this.field2442 += (long) var2 * (long) var5;
                this.field2428.method2180(var5);
                arg0 -= var5;
                this.method3465();
            } while (this.field2426.method3569());
        }
        this.field2428.method2180(arg0);
    }

    @ObfuscatedName("gw.bf(I)V")
    public void method3465() {
        int var1 = this.field2431;
        int var2 = this.field2440;
        long var3 = this.field2443;
        while (this.field2440 == var2) {
            while (this.field2426.field2473[var1] == var2) {
                this.field2426.method3558(var1);
                int var5 = this.field2426.method3559(var1);
                if (var5 == 1) {
                    this.field2426.method3560();
                    this.field2426.method3585(var1);
                    if (this.field2426.method3563()) {
                        if (!this.field2439 || var2 == 0) {
                            this.method3531();
                            this.field2426.method3556();
                            return;
                        }
                        this.field2426.method3568(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3456(var5);
                }
                this.field2426.method3561(var1);
                this.field2426.method3585(var1);
            }
            var1 = this.field2426.method3566();
            var2 = this.field2426.field2473[var1];
            var3 = this.field2426.method3567(var2);
        }
        this.field2431 = var1;
        this.field2440 = var2;
        this.field2443 = var3;
    }

    @ObfuscatedName("gw.bc(Lgu;B)Z")
    public boolean method3478(class200 arg0) {
        if (arg0.field2464 != null) {
            return false;
        }
        if (arg0.field2460 >= 0) {
            arg0.method3351();
            if (arg0.field2450 > 0 && this.field2437[arg0.field2448][arg0.field2450] == arg0) {
                this.field2437[arg0.field2448][arg0.field2450] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gw.bk(Lgu;[IIIB)Z")
    public boolean method3503(class200 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2465 = Statics.field1399 / 100;
        if (arg0.field2460 >= 0 && arg0.field2464 == null || arg0.field2464.method2435()) {
            arg0.method3546();
            arg0.method3351();
            if (arg0.field2450 > 0 && this.field2437[arg0.field2448][arg0.field2450] == arg0) {
                this.field2437[arg0.field2448][arg0.field2450] = null;
            }
            return true;
        }
        int var5 = arg0.field2456;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2429[arg0.field2448] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2456 = var6;
        }
        arg0.field2464.method2424(this.method3458(arg0));
        class197 var7 = arg0.field2446;
        boolean var8 = false;
        arg0.field2462++;
        arg0.field2454 += var7.field2406;
        double var9 = (double) ((arg0.field2451 - 60 << 8) + (arg0.field2456 * arg0.field2455 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2405 > 0) {
            if (var7.field2404 > 0) {
                arg0.field2457 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2404 * var9) + 0.5D);
            } else {
                arg0.field2457 += 128;
            }
        }
        if (var7.field2403 != null) {
            if (var7.field2402 > 0) {
                arg0.field2449 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2402 * var9) + 0.5D);
            } else {
                arg0.field2449 += 128;
            }
            while (arg0.field2459 < var7.field2403.length - 2 && arg0.field2449 > (var7.field2403[arg0.field2459 + 2] & 0xFF) << 8) {
                arg0.field2459 += 2;
            }
            if (arg0.field2459 == var7.field2403.length - 2 && var7.field2403[arg0.field2459 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2460 >= 0 && var7.field2400 != null && (this.field2430[arg0.field2448] & 0x1) == 0 && (arg0.field2450 < 0 || this.field2437[arg0.field2448][arg0.field2450] != arg0)) {
            if (var7.field2401 > 0) {
                arg0.field2460 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2401 * var9) + 0.5D);
            } else {
                arg0.field2460 += 128;
            }
            while (arg0.field2461 < var7.field2400.length - 2 && arg0.field2460 > (var7.field2400[arg0.field2461 + 2] & 0xFF) << 8) {
                arg0.field2461 += 2;
            }
            if (arg0.field2461 == var7.field2400.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2464.method2396(arg0.field2465, this.method3459(arg0), this.method3460(arg0));
            return false;
        }
        arg0.field2464.method2397(arg0.field2465);
        if (arg1 == null) {
            arg0.field2464.method2180(arg3);
        } else {
            arg0.field2464.method2162(arg1, arg2, arg3);
        }
        if (arg0.field2464.method2472()) {
            this.field2428.field2496.method2154(arg0.field2464);
        }
        arg0.method3546();
        if (arg0.field2460 >= 0) {
            arg0.method3351();
            if (arg0.field2450 > 0 && this.field2437[arg0.field2448][arg0.field2450] == arg0) {
                this.field2437[arg0.field2448][arg0.field2450] = null;
            }
        }
        return true;
    }
}
