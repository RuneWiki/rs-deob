package deob;

@ObfuscatedName("gf")
public class class208 extends class125 {

    @ObfuscatedName("gf.h")
    public class329 field2432 = new class329(128);

    @ObfuscatedName("gf.v")
    public int field2430 = 256;

    @ObfuscatedName("gf.x")
    public int field2438 = 1000000;

    @ObfuscatedName("gf.t")
    public int[] field2447 = new int[16];

    @ObfuscatedName("gf.j")
    public int[] field2433 = new int[16];

    @ObfuscatedName("gf.n")
    public int[] field2434 = new int[16];

    @ObfuscatedName("gf.p")
    public int[] field2444 = new int[16];

    @ObfuscatedName("gf.l")
    public int[] field2436 = new int[16];

    @ObfuscatedName("gf.z")
    public int[] field2437 = new int[16];

    @ObfuscatedName("gf.u")
    public int[] field2442 = new int[16];

    @ObfuscatedName("gf.e")
    public int[] field2439 = new int[16];

    @ObfuscatedName("gf.m")
    public int[] field2440 = new int[16];

    @ObfuscatedName("gf.r")
    public int[] field2455 = new int[16];

    @ObfuscatedName("gf.q")
    public int[] field2441 = new int[16];

    @ObfuscatedName("gf.g")
    public int[] field2435 = new int[16];

    @ObfuscatedName("gf.s")
    public int[] field2431 = new int[16];

    @ObfuscatedName("gf.o")
    public int[] field2445 = new int[16];

    @ObfuscatedName("gf.k")
    public int[] field2443 = new int[16];

    @ObfuscatedName("gf.d")
    public class209[][] field2429 = new class209[16][128];

    @ObfuscatedName("gf.an")
    public class209[][] field2448 = new class209[16][128];

    @ObfuscatedName("gf.aj")
    public class210 field2446 = new class210();

    @ObfuscatedName("gf.ax")
    public boolean field2450;

    @ObfuscatedName("gf.ag")
    public int field2451;

    @ObfuscatedName("gf.au")
    public int field2452;

    @ObfuscatedName("gf.as")
    public long field2453;

    @ObfuscatedName("gf.ae")
    public long field2454;

    @ObfuscatedName("gf.ac")
    public class212 field2449 = new class212(this);

    public class208() {
        this.method3517();
    }

    @ObfuscatedName("gf.h(IS)V")
    public synchronized void method3444(int arg0) {
        this.field2430 = arg0;
    }

    @ObfuscatedName("gf.v(I)I")
    public int method3492() {
        return this.field2430;
    }

    @ObfuscatedName("gf.x(Lhg;Lib;Lds;IB)Z")
    public synchronized boolean method3446(class213 arg0, class245 arg1, class118 arg2, int arg3) {
        arg0.method3613();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class187 var7 = (class187) arg0.field2509.method5537(); var7 != null; var7 = (class187) arg0.field2509.method5532()) {
            int var8 = (int) var7.field2138;
            class211 var9 = (class211) this.field2432.method5543((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3841(var8);
                class211 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class211(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2432.method5531(var11, (long) var8);
            }
            if (!var9.method3595(arg2, var7.field2133, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3614();
        }
        return var5;
    }

    @ObfuscatedName("gf.w(B)V")
    public synchronized void method3447() {
        for (class211 var1 = (class211) this.field2432.method5537(); var1 != null; var1 = (class211) this.field2432.method5532()) {
            var1.method3596();
        }
    }

    @ObfuscatedName("gf.t(I)V")
    public synchronized void method3448() {
        for (class211 var1 = (class211) this.field2432.method5537(); var1 != null; var1 = (class211) this.field2432.method5532()) {
            var1.method3359();
        }
    }

    @ObfuscatedName("gf.z(Lhg;ZI)V")
    public synchronized void method3511(class213 arg0, boolean arg1) {
        this.method3505();
        this.field2446.method3593(arg0.field2510);
        this.field2450 = arg1;
        this.field2453 = 0L;
        int var3 = this.field2446.method3545();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2446.method3546(var4);
            this.field2446.method3549(var4);
            this.field2446.method3547(var4);
        }
        this.field2451 = this.field2446.method3554();
        this.field2452 = this.field2446.field2483[this.field2451];
        this.field2454 = this.field2446.method3553(this.field2452);
    }

    @ObfuscatedName("gf.e(S)V")
    public synchronized void method3505() {
        this.field2446.method3543();
        this.method3517();
    }

    @ObfuscatedName("gf.m(I)Z")
    public synchronized boolean method3451() {
        return this.field2446.method3544();
    }

    @ObfuscatedName("gf.c(IIB)V")
    public synchronized void method3452(int arg0, int arg1) {
        this.method3445(arg0, arg1);
    }

    @ObfuscatedName("gf.i(IIS)V")
    public void method3445(int arg0, int arg1) {
        this.field2444[arg0] = arg1;
        this.field2437[arg0] = arg1 & 0xFFFFFF80;
        this.method3454(arg0, arg1);
    }

    @ObfuscatedName("gf.f(III)V")
    public void method3454(int arg0, int arg1) {
        if (this.field2436[arg0] != arg1) {
            this.field2436[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2448[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gf.y(IIIB)V")
    public void method3460(int arg0, int arg1, int arg2) {
        this.method3490(arg0, arg1, 64);
        if ((this.field2455[arg0] & 0x2) != 0) {
            for (class209 var4 = (class209) this.field2449.field2503.method4544(); var4 != null; var4 = (class209) this.field2449.field2503.method4554()) {
                if (var4.field2478 == arg0 && var4.field2471 < 0) {
                    this.field2429[arg0][var4.field2462] = null;
                    this.field2429[arg0][arg1] = var4;
                    int var5 = (var4.field2467 * var4.field2465 >> 12) + var4.field2477;
                    var4.field2477 += arg1 - var4.field2462 << 8;
                    var4.field2465 = var5 - var4.field2477;
                    var4.field2467 = 4096;
                    var4.field2462 = arg1;
                    return;
                }
            }
        }
        class211 var6 = (class211) this.field2432.method5543((long) this.field2436[arg0]);
        if (var6 == null) {
            return;
        }
        class113 var7 = var6.field2494[arg1];
        if (var7 == null) {
            return;
        }
        class209 var8 = new class209();
        var8.field2478 = arg0;
        var8.field2458 = var6;
        var8.field2459 = var7;
        var8.field2460 = var6.field2493[arg1];
        var8.field2461 = var6.field2499[arg1];
        var8.field2462 = arg1;
        var8.field2463 = var6.field2500 * arg2 * arg2 * var6.field2496[arg1] + 1024 >> 11;
        var8.field2464 = var6.field2497[arg1] & 0xFF;
        var8.field2477 = (arg1 << 8) - (var6.field2495[arg1] & 0x7FFF);
        var8.field2468 = 0;
        var8.field2466 = 0;
        var8.field2473 = 0;
        var8.field2471 = -1;
        var8.field2472 = 0;
        if (this.field2431[arg0] == 0) {
            var8.field2475 = class123.method2435(var7, this.method3466(var8), this.method3524(var8), this.method3529(var8));
        } else {
            var8.field2475 = class123.method2435(var7, this.method3466(var8), 0, this.method3529(var8));
            this.method3456(var8, var6.field2495[arg1] < 0);
        }
        if (var6.field2495[arg1] < 0) {
            var8.field2475.method2417(-1);
        }
        if (var8.field2461 >= 0) {
            class209 var9 = this.field2448[arg0][var8.field2461];
            if (var9 != null && var9.field2471 < 0) {
                this.field2429[arg0][var9.field2462] = null;
                var9.field2471 = 0;
            }
            this.field2448[arg0][var8.field2461] = var8;
        }
        this.field2449.field2503.method4549(var8);
        this.field2429[arg0][arg1] = var8;
    }

    @ObfuscatedName("gf.r(Lhn;ZB)V")
    public void method3456(class209 arg0, boolean arg1) {
        int var3 = arg0.field2459.field1406.length;
        int var5;
        if (arg1 && arg0.field2459.field1409) {
            int var4 = var3 + var3 - arg0.field2459.field1405;
            var5 = (int) ((long) this.field2431[arg0.field2478] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2475.method2424(true);
            }
        } else {
            var5 = (int) ((long) this.field2431[arg0.field2478] * (long) var3 >> 6);
        }
        arg0.field2475.method2423(var5);
    }

    @ObfuscatedName("gf.q(IIII)V")
    public void method3490(int arg0, int arg1, int arg2) {
        class209 var4 = this.field2429[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2429[arg0][arg1] = null;
        if ((this.field2455[arg0] & 0x2) == 0) {
            var4.field2471 = 0;
            return;
        }
        for (class209 var5 = (class209) this.field2449.field2503.method4540(); var5 != null; var5 = (class209) this.field2449.field2503.method4545()) {
            if (var4.field2478 == var5.field2478 && var5.field2471 < 0 && var4 != var5) {
                var4.field2471 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gf.g(IIIB)V")
    public void method3458(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gf.o(III)V")
    public void method3467(int arg0, int arg1) {
    }

    @ObfuscatedName("gf.an(IIB)V")
    public void method3459(int arg0, int arg1) {
        this.field2442[arg0] = arg1;
    }

    @ObfuscatedName("gf.aj(II)V")
    public void method3443(int arg0) {
        for (class209 var2 = (class209) this.field2449.field2503.method4540(); var2 != null; var2 = (class209) this.field2449.field2503.method4545()) {
            if (arg0 < 0 || var2.field2478 == arg0) {
                if (var2.field2475 != null) {
                    var2.field2475.method2428(Statics.field1444 / 100);
                    if (var2.field2475.method2432()) {
                        this.field2449.field2505.method2184(var2.field2475);
                    }
                    var2.method3535();
                }
                if (var2.field2471 < 0) {
                    this.field2429[var2.field2478][var2.field2462] = null;
                }
                var2.method3359();
            }
        }
    }

    @ObfuscatedName("gf.aq(II)V")
    public void method3461(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3461(var2);
            }
            return;
        }
        this.field2447[arg0] = 12800;
        this.field2433[arg0] = 8192;
        this.field2434[arg0] = 16383;
        this.field2442[arg0] = 8192;
        this.field2439[arg0] = 0;
        this.field2440[arg0] = 8192;
        this.method3469(arg0);
        this.method3463(arg0);
        this.field2455[arg0] = 0;
        this.field2441[arg0] = 32767;
        this.field2435[arg0] = 256;
        this.field2431[arg0] = 0;
        this.method3465(arg0, 8192);
    }

    @ObfuscatedName("gf.ah(II)V")
    public void method3481(int arg0) {
        for (class209 var2 = (class209) this.field2449.field2503.method4540(); var2 != null; var2 = (class209) this.field2449.field2503.method4545()) {
            if ((arg0 < 0 || var2.field2478 == arg0) && var2.field2471 < 0) {
                this.field2429[var2.field2478][var2.field2462] = null;
                var2.field2471 = 0;
            }
        }
    }

    @ObfuscatedName("gf.am(B)V")
    public void method3517() {
        this.method3443(-1);
        this.method3461(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2436[var1] = this.field2444[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2437[var2] = this.field2444[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gf.ad(II)V")
    public void method3469(int arg0) {
        if ((this.field2455[arg0] & 0x2) == 0) {
            return;
        }
        for (class209 var2 = (class209) this.field2449.field2503.method4540(); var2 != null; var2 = (class209) this.field2449.field2503.method4545()) {
            if (var2.field2478 == arg0 && this.field2429[arg0][var2.field2462] == null && var2.field2471 < 0) {
                var2.field2471 = 0;
            }
        }
    }

    @ObfuscatedName("gf.ai(IB)V")
    public void method3463(int arg0) {
        if ((this.field2455[arg0] & 0x4) == 0) {
            return;
        }
        for (class209 var2 = (class209) this.field2449.field2503.method4540(); var2 != null; var2 = (class209) this.field2449.field2503.method4545()) {
            if (var2.field2478 == arg0) {
                var2.field2457 = 0;
            }
        }
    }

    @ObfuscatedName("gf.al(IB)V")
    public void method3464(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3490(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3460(var6, var7, var8);
            } else {
                this.method3490(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3458(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2437[var12] = (var14 << 14) + (this.field2437[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2437[var12] = (var14 << 7) + (this.field2437[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2439[var12] = (var14 << 7) + (this.field2439[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2439[var12] = (this.field2439[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2440[var12] = (var14 << 7) + (this.field2440[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2440[var12] = (this.field2440[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2447[var12] = (var14 << 7) + (this.field2447[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2447[var12] = (this.field2447[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2433[var12] = (var14 << 7) + (this.field2433[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2433[var12] = (this.field2433[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2434[var12] = (var14 << 7) + (this.field2434[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2434[var12] = (this.field2434[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2455[var12] |= 0x1;
                } else {
                    this.field2455[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2455[var12] |= 0x2;
                } else {
                    this.method3469(var12);
                    this.field2455[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2441[var12] = (var14 << 7) + (this.field2441[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2441[var12] = (this.field2441[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2441[var12] = (var14 << 7) + (this.field2441[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2441[var12] = (this.field2441[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3443(var12);
            }
            if (var13 == 121) {
                this.method3461(var12);
            }
            if (var13 == 123) {
                this.method3481(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2441[var12];
                if (var15 == 16384) {
                    this.field2435[var12] = (var14 << 7) + (this.field2435[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2441[var12];
                if (var16 == 16384) {
                    this.field2435[var12] = (this.field2435[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2431[var12] = (var14 << 7) + (this.field2431[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2431[var12] = (this.field2431[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2455[var12] |= 0x4;
                } else {
                    this.method3463(var12);
                    this.field2455[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3465(var12, (var14 << 7) + (this.field2445[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3465(var12, (this.field2445[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3454(var17, this.field2437[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3467(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3459(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3517();
            }
        }
    }

    @ObfuscatedName("gf.af(III)V")
    public void method3465(int arg0, int arg1) {
        this.field2445[arg0] = arg1;
        this.field2443[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gf.ar(Lhn;I)I")
    public int method3466(class209 arg0) {
        int var2 = (arg0.field2467 * arg0.field2465 >> 12) + arg0.field2477;
        int var3 = ((this.field2442[arg0.field2478] - 8192) * this.field2435[arg0.field2478] >> 12) + var2;
        class206 var4 = arg0.field2460;
        if (var4.field2417 > 0 && (var4.field2416 > 0 || this.field2439[arg0.field2478] > 0)) {
            int var5 = var4.field2416 << 2;
            int var6 = var4.field2410 << 1;
            if (arg0.field2469 < var6) {
                var5 = arg0.field2469 * var5 / var6;
            }
            int var7 = (this.field2439[arg0.field2478] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2470 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2459.field1408 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1444 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gf.az(Lhn;I)I")
    public int method3524(class209 arg0) {
        class206 var2 = arg0.field2460;
        int var3 = this.field2447[arg0.field2478] * this.field2434[arg0.field2478] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2463 * var4 + 16384 >> 15;
        int var6 = this.field2430 * var5 + 128 >> 8;
        if (var2.field2411 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2468 * 1.953125E-5D * (double) var2.field2411) + 0.5D);
        }
        if (var2.field2412 != null) {
            int var7 = arg0.field2466;
            int var8 = var2.field2412[arg0.field2473 + 1];
            if (arg0.field2473 < var2.field2412.length - 2) {
                int var9 = (var2.field2412[arg0.field2473] & 0xFF) << 8;
                int var10 = (var2.field2412[arg0.field2473 + 2] & 0xFF) << 8;
                var8 += (var2.field2412[arg0.field2473 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2471 > 0 && var2.field2413 != null) {
            int var11 = arg0.field2471;
            int var12 = var2.field2413[arg0.field2472 + 1];
            if (arg0.field2472 < var2.field2413.length - 2) {
                int var13 = (var2.field2413[arg0.field2472] & 0xFF) << 8;
                int var14 = (var2.field2413[arg0.field2472 + 2] & 0xFF) << 8;
                var12 += (var2.field2413[arg0.field2472 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gf.at(Lhn;S)I")
    public int method3529(class209 arg0) {
        int var2 = this.field2433[arg0.field2478];
        return var2 < 8192 ? arg0.field2464 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2464) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gf.j()Ldi;")
    public synchronized class125 method2189() {
        return this.field2449;
    }

    @ObfuscatedName("gf.n()Ldi;")
    public synchronized class125 method2188() {
        return null;
    }

    @ObfuscatedName("gf.p()I")
    public synchronized int method2215() {
        return 0;
    }

    @ObfuscatedName("gf.l([III)V")
    public synchronized void method2192(int[] arg0, int arg1, int arg2) {
        if (this.field2446.method3544()) {
            int var4 = this.field2438 * this.field2446.field2488 / Statics.field1444;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2453;
                if (this.field2454 - var5 >= 0L) {
                    this.field2453 = var5;
                    break;
                }
                int var7 = (int) ((this.field2454 - this.field2453 + (long) var4 - 1L) / (long) var4);
                this.field2453 += (long) var4 * (long) var7;
                this.field2449.method2192(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3471();
            } while (this.field2446.method3544());
        }
        this.field2449.method2192(arg0, arg1, arg2);
    }

    @ObfuscatedName("gf.u(I)V")
    public synchronized void method2197(int arg0) {
        if (this.field2446.method3544()) {
            int var2 = this.field2438 * this.field2446.field2488 / Statics.field1444;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2453;
                if (this.field2454 - var3 >= 0L) {
                    this.field2453 = var3;
                    break;
                }
                int var5 = (int) ((this.field2454 - this.field2453 + (long) var2 - 1L) / (long) var2);
                this.field2453 += (long) var2 * (long) var5;
                this.field2449.method2197(var5);
                arg0 -= var5;
                this.method3471();
            } while (this.field2446.method3544());
        }
        this.field2449.method2197(arg0);
    }

    @ObfuscatedName("gf.bh(I)V")
    public void method3471() {
        int var1 = this.field2451;
        int var2 = this.field2452;
        long var3 = this.field2454;
        while (this.field2452 == var2) {
            while (this.field2446.field2483[var1] == var2) {
                this.field2446.method3546(var1);
                int var5 = this.field2446.method3550(var1);
                if (var5 == 1) {
                    this.field2446.method3548();
                    this.field2446.method3547(var1);
                    if (this.field2446.method3566()) {
                        if (!this.field2450 || var2 == 0) {
                            this.method3517();
                            this.field2446.method3543();
                            return;
                        }
                        this.field2446.method3556(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3464(var5);
                }
                this.field2446.method3549(var1);
                this.field2446.method3547(var1);
            }
            var1 = this.field2446.method3554();
            var2 = this.field2446.field2483[var1];
            var3 = this.field2446.method3553(var2);
        }
        this.field2451 = var1;
        this.field2452 = var2;
        this.field2454 = var3;
    }

    @ObfuscatedName("gf.by(Lhn;I)Z")
    public boolean method3526(class209 arg0) {
        if (arg0.field2475 != null) {
            return false;
        }
        if (arg0.field2471 >= 0) {
            arg0.method3359();
            if (arg0.field2461 > 0 && this.field2448[arg0.field2478][arg0.field2461] == arg0) {
                this.field2448[arg0.field2478][arg0.field2461] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gf.bs(Lhn;[IIII)Z")
    public boolean method3473(class209 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2476 = Statics.field1444 / 100;
        if (arg0.field2471 >= 0 && arg0.field2475 == null || arg0.field2475.method2431()) {
            arg0.method3535();
            arg0.method3359();
            if (arg0.field2461 > 0 && this.field2448[arg0.field2478][arg0.field2461] == arg0) {
                this.field2448[arg0.field2478][arg0.field2461] = null;
            }
            return true;
        }
        int var5 = arg0.field2467;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2440[arg0.field2478] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2467 = var6;
        }
        arg0.field2475.method2429(this.method3466(arg0));
        class206 var7 = arg0.field2460;
        boolean var8 = false;
        arg0.field2469++;
        arg0.field2470 += var7.field2417;
        double var9 = (double) ((arg0.field2462 - 60 << 8) + (arg0.field2467 * arg0.field2465 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2411 > 0) {
            if (var7.field2415 > 0) {
                arg0.field2468 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2415 * var9) + 0.5D);
            } else {
                arg0.field2468 += 128;
            }
        }
        if (var7.field2412 != null) {
            if (var7.field2418 > 0) {
                arg0.field2466 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2418 * var9) + 0.5D);
            } else {
                arg0.field2466 += 128;
            }
            while (arg0.field2473 < var7.field2412.length - 2 && arg0.field2466 > (var7.field2412[arg0.field2473 + 2] & 0xFF) << 8) {
                arg0.field2473 += 2;
            }
            if (arg0.field2473 == var7.field2412.length - 2 && var7.field2412[arg0.field2473 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2471 >= 0 && var7.field2413 != null && (this.field2455[arg0.field2478] & 0x1) == 0 && (arg0.field2461 < 0 || this.field2448[arg0.field2478][arg0.field2461] != arg0)) {
            if (var7.field2414 > 0) {
                arg0.field2471 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2414 * var9) + 0.5D);
            } else {
                arg0.field2471 += 128;
            }
            while (arg0.field2472 < var7.field2413.length - 2 && arg0.field2471 > (var7.field2413[arg0.field2472 + 2] & 0xFF) << 8) {
                arg0.field2472 += 2;
            }
            if (arg0.field2472 == var7.field2413.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2475.method2535(arg0.field2476, this.method3524(arg0), this.method3529(arg0));
            return false;
        }
        arg0.field2475.method2428(arg0.field2476);
        if (arg1 == null) {
            arg0.field2475.method2197(arg3);
        } else {
            arg0.field2475.method2192(arg1, arg2, arg3);
        }
        if (arg0.field2475.method2432()) {
            this.field2449.field2505.method2184(arg0.field2475);
        }
        arg0.method3535();
        if (arg0.field2471 >= 0) {
            arg0.method3359();
            if (arg0.field2461 > 0 && this.field2448[arg0.field2478][arg0.field2461] == arg0) {
                this.field2448[arg0.field2478][arg0.field2461] = null;
            }
        }
        return true;
    }
}
