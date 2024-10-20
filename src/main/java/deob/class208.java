package deob;

@ObfuscatedName("gi")
public class class208 extends class125 {

    @ObfuscatedName("gi.x")
    public class328 field2427 = new class328(128);

    @ObfuscatedName("gi.m")
    public int field2416 = 256;

    @ObfuscatedName("gi.k")
    public int field2420 = 1000000;

    @ObfuscatedName("gi.d")
    public int[] field2444 = new int[16];

    @ObfuscatedName("gi.v")
    public int[] field2417 = new int[16];

    @ObfuscatedName("gi.q")
    public int[] field2418 = new int[16];

    @ObfuscatedName("gi.z")
    public int[] field2421 = new int[16];

    @ObfuscatedName("gi.t")
    public int[] field2422 = new int[16];

    @ObfuscatedName("gi.e")
    public int[] field2423 = new int[16];

    @ObfuscatedName("gi.s")
    public int[] field2424 = new int[16];

    @ObfuscatedName("gi.p")
    public int[] field2425 = new int[16];

    @ObfuscatedName("gi.n")
    public int[] field2438 = new int[16];

    @ObfuscatedName("gi.l")
    public int[] field2429 = new int[16];

    @ObfuscatedName("gi.r")
    public int[] field2430 = new int[16];

    @ObfuscatedName("gi.o")
    public int[] field2431 = new int[16];

    @ObfuscatedName("gi.c")
    public int[] field2432 = new int[16];

    @ObfuscatedName("gi.j")
    public int[] field2433 = new int[16];

    @ObfuscatedName("gi.y")
    public int[] field2434 = new int[16];

    @ObfuscatedName("gi.f")
    public class209[][] field2442 = new class209[16][128];

    @ObfuscatedName("gi.ae")
    public class209[][] field2436 = new class209[16][128];

    @ObfuscatedName("gi.an")
    public class210 field2437 = new class210();

    @ObfuscatedName("gi.ai")
    public boolean field2419;

    @ObfuscatedName("gi.ap")
    public int field2443;

    @ObfuscatedName("gi.ab")
    public int field2440;

    @ObfuscatedName("gi.ar")
    public long field2441;

    @ObfuscatedName("gi.af")
    public long field2426;

    @ObfuscatedName("gi.at")
    public class212 field2439 = new class212(this);

    public class208() {
        this.method3480();
    }

    @ObfuscatedName("gi.x(II)V")
    public synchronized void method3482(int arg0) {
        this.field2416 = arg0;
    }

    @ObfuscatedName("gi.m(I)I")
    public int method3461() {
        return this.field2416;
    }

    @ObfuscatedName("gi.k(Lhh;Liy;Ldk;II)Z")
    public synchronized boolean method3462(class213 arg0, class244 arg1, class118 arg2, int arg3) {
        arg0.method3645();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class187 var7 = (class187) arg0.field2498.method5546(); var7 != null; var7 = (class187) arg0.field2498.method5554()) {
            int var8 = (int) var7.field2117;
            class211 var9 = (class211) this.field2427.method5561((long) var8);
            if (var9 == null) {
                var9 = class211.method4914(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2427.method5548(var9, (long) var8);
            }
            if (!var9.method3623(arg2, var7.field2112, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3646();
        }
        return var5;
    }

    @ObfuscatedName("gi.d(I)V")
    public synchronized void method3527() {
        for (class211 var1 = (class211) this.field2427.method5546(); var1 != null; var1 = (class211) this.field2427.method5554()) {
            var1.method3624();
        }
    }

    @ObfuscatedName("gi.w(I)V")
    public synchronized void method3471() {
        for (class211 var1 = (class211) this.field2427.method5546(); var1 != null; var1 = (class211) this.field2427.method5554()) {
            var1.method3355();
        }
    }

    @ObfuscatedName("gi.e(Lhh;ZI)V")
    public synchronized void method3491(class213 arg0, boolean arg1) {
        this.method3535();
        this.field2437.method3589(arg0.field2499);
        this.field2419 = arg1;
        this.field2441 = 0L;
        int var3 = this.field2437.method3580();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2437.method3581(var4);
            this.field2437.method3584(var4);
            this.field2437.method3618(var4);
        }
        this.field2443 = this.field2437.method3576();
        this.field2440 = this.field2437.field2477[this.field2443];
        this.field2426 = this.field2437.method3588(this.field2440);
    }

    @ObfuscatedName("gi.p(I)V")
    public synchronized void method3535() {
        this.field2437.method3594();
        this.method3480();
    }

    @ObfuscatedName("gi.n(I)Z")
    public synchronized boolean method3556() {
        return this.field2437.method3579();
    }

    @ObfuscatedName("gi.u(IIB)V")
    public synchronized void method3468(int arg0, int arg1) {
        this.method3469(arg0, arg1);
    }

    @ObfuscatedName("gi.h(III)V")
    public void method3469(int arg0, int arg1) {
        this.field2421[arg0] = arg1;
        this.field2423[arg0] = arg1 & 0xFFFFFF80;
        this.method3470(arg0, arg1);
    }

    @ObfuscatedName("gi.g(III)V")
    public void method3470(int arg0, int arg1) {
        if (this.field2422[arg0] != arg1) {
            this.field2422[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2436[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gi.i(IIII)V")
    public void method3476(int arg0, int arg1, int arg2) {
        this.method3473(arg0, arg1, 64);
        if ((this.field2429[arg0] & 0x2) != 0) {
            for (class209 var4 = (class209) this.field2439.field2493.method4563(); var4 != null; var4 = (class209) this.field2439.field2493.method4560()) {
                if (var4.field2453 == arg0 && var4.field2460 < 0) {
                    this.field2442[arg0][var4.field2465] = null;
                    this.field2442[arg0][arg1] = var4;
                    int var5 = (var4.field2456 * var4.field2455 >> 12) + var4.field2446;
                    var4.field2446 += arg1 - var4.field2465 << 8;
                    var4.field2455 = var5 - var4.field2446;
                    var4.field2456 = 4096;
                    var4.field2465 = arg1;
                    return;
                }
            }
        }
        class211 var6 = (class211) this.field2427.method5561((long) this.field2422[arg0]);
        if (var6 == null) {
            return;
        }
        class113 var7 = var6.field2484[arg1];
        if (var7 == null) {
            return;
        }
        class209 var8 = new class209();
        var8.field2453 = arg0;
        var8.field2447 = var6;
        var8.field2448 = var7;
        var8.field2461 = var6.field2489[arg1];
        var8.field2468 = var6.field2490[arg1];
        var8.field2465 = arg1;
        var8.field2452 = var6.field2485 * arg2 * arg2 * var6.field2488[arg1] + 1024 >> 11;
        var8.field2466 = var6.field2491[arg1] & 0xFF;
        var8.field2446 = (arg1 << 8) - (var6.field2486[arg1] & 0x7FFF);
        var8.field2457 = 0;
        var8.field2458 = 0;
        var8.field2459 = 0;
        var8.field2460 = -1;
        var8.field2449 = 0;
        if (this.field2432[arg0] == 0) {
            var8.field2464 = class123.method2450(var7, this.method3517(var8), this.method3486(var8), this.method3487(var8));
        } else {
            var8.field2464 = class123.method2450(var7, this.method3517(var8), 0, this.method3487(var8));
            this.method3505(var8, var6.field2486[arg1] < 0);
        }
        if (var6.field2486[arg1] < 0) {
            var8.field2464.method2454(-1);
        }
        if (var8.field2468 >= 0) {
            class209 var9 = this.field2436[arg0][var8.field2468];
            if (var9 != null && var9.field2460 < 0) {
                this.field2442[arg0][var9.field2465] = null;
                var9.field2460 = 0;
            }
            this.field2436[arg0][var8.field2468] = var8;
        }
        this.field2439.field2493.method4580(var8);
        this.field2442[arg0][arg1] = var8;
    }

    @ObfuscatedName("gi.a(Lhz;ZI)V")
    public void method3505(class209 arg0, boolean arg1) {
        int var3 = arg0.field2448.field1405.length;
        int var5;
        if (arg1 && arg0.field2448.field1408) {
            int var4 = var3 + var3 - arg0.field2448.field1406;
            var5 = (int) ((long) this.field2432[arg0.field2453] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2464.method2425(true);
            }
        } else {
            var5 = (int) ((long) this.field2432[arg0.field2453] * (long) var3 >> 6);
        }
        arg0.field2464.method2434(var5);
    }

    @ObfuscatedName("gi.o(IIII)V")
    public void method3473(int arg0, int arg1, int arg2) {
        class209 var4 = this.field2442[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2442[arg0][arg1] = null;
        if ((this.field2429[arg0] & 0x2) == 0) {
            var4.field2460 = 0;
            return;
        }
        for (class209 var5 = (class209) this.field2439.field2493.method4559(); var5 != null; var5 = (class209) this.field2439.field2493.method4577()) {
            if (var4.field2453 == var5.field2453 && var5.field2460 < 0 && var4 != var5) {
                var4.field2460 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gi.c(IIII)V")
    public void method3553(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gi.f(III)V")
    public void method3485(int arg0, int arg1) {
    }

    @ObfuscatedName("gi.ae(III)V")
    public void method3467(int arg0, int arg1) {
        this.field2424[arg0] = arg1;
    }

    @ObfuscatedName("gi.an(II)V")
    public void method3477(int arg0) {
        for (class209 var2 = (class209) this.field2439.field2493.method4559(); var2 != null; var2 = (class209) this.field2439.field2493.method4577()) {
            if (arg0 < 0 || var2.field2453 == arg0) {
                if (var2.field2464 != null) {
                    var2.field2464.method2463(Statics.field1422 / 100);
                    if (var2.field2464.method2442()) {
                        this.field2439.field2494.method2195(var2.field2464);
                    }
                    var2.method3570();
                }
                if (var2.field2460 < 0) {
                    this.field2442[var2.field2453][var2.field2465] = null;
                }
                var2.method3355();
            }
        }
    }

    @ObfuscatedName("gi.ai(II)V")
    public void method3478(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3478(var2);
            }
            return;
        }
        this.field2444[arg0] = 12800;
        this.field2417[arg0] = 8192;
        this.field2418[arg0] = 16383;
        this.field2424[arg0] = 8192;
        this.field2425[arg0] = 0;
        this.field2438[arg0] = 8192;
        this.method3481(arg0);
        this.method3569(arg0);
        this.field2429[arg0] = 0;
        this.field2430[arg0] = 32767;
        this.field2431[arg0] = 256;
        this.field2432[arg0] = 0;
        this.method3552(arg0, 8192);
    }

    @ObfuscatedName("gi.ap(IB)V")
    public void method3495(int arg0) {
        for (class209 var2 = (class209) this.field2439.field2493.method4559(); var2 != null; var2 = (class209) this.field2439.field2493.method4577()) {
            if ((arg0 < 0 || var2.field2453 == arg0) && var2.field2460 < 0) {
                this.field2442[var2.field2453][var2.field2465] = null;
                var2.field2460 = 0;
            }
        }
    }

    @ObfuscatedName("gi.av(B)V")
    public void method3480() {
        this.method3477(-1);
        this.method3478(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2422[var1] = this.field2421[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2423[var2] = this.field2421[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gi.ak(II)V")
    public void method3481(int arg0) {
        if ((this.field2429[arg0] & 0x2) == 0) {
            return;
        }
        for (class209 var2 = (class209) this.field2439.field2493.method4559(); var2 != null; var2 = (class209) this.field2439.field2493.method4577()) {
            if (var2.field2453 == arg0 && this.field2442[arg0][var2.field2465] == null && var2.field2460 < 0) {
                var2.field2460 = 0;
            }
        }
    }

    @ObfuscatedName("gi.aa(IB)V")
    public void method3569(int arg0) {
        if ((this.field2429[arg0] & 0x4) == 0) {
            return;
        }
        for (class209 var2 = (class209) this.field2439.field2493.method4559(); var2 != null; var2 = (class209) this.field2439.field2493.method4577()) {
            if (var2.field2453 == arg0) {
                var2.field2463 = 0;
            }
        }
    }

    @ObfuscatedName("gi.ax(II)V")
    public void method3483(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3473(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3476(var6, var7, var8);
            } else {
                this.method3473(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3553(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2423[var12] = (var14 << 14) + (this.field2423[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2423[var12] = (var14 << 7) + (this.field2423[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2425[var12] = (var14 << 7) + (this.field2425[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2425[var12] = (this.field2425[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2438[var12] = (var14 << 7) + (this.field2438[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2438[var12] = (this.field2438[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2444[var12] = (var14 << 7) + (this.field2444[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2444[var12] = (this.field2444[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2417[var12] = (var14 << 7) + (this.field2417[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2417[var12] = (this.field2417[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2418[var12] = (var14 << 7) + (this.field2418[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2418[var12] = (this.field2418[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2429[var12] |= 0x1;
                } else {
                    this.field2429[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2429[var12] |= 0x2;
                } else {
                    this.method3481(var12);
                    this.field2429[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2430[var12] = (var14 << 7) + (this.field2430[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2430[var12] = (this.field2430[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2430[var12] = (var14 << 7) + (this.field2430[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2430[var12] = (this.field2430[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3477(var12);
            }
            if (var13 == 121) {
                this.method3478(var12);
            }
            if (var13 == 123) {
                this.method3495(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2430[var12];
                if (var15 == 16384) {
                    this.field2431[var12] = (var14 << 7) + (this.field2431[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2430[var12];
                if (var16 == 16384) {
                    this.field2431[var12] = (this.field2431[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2432[var12] = (var14 << 7) + (this.field2432[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2432[var12] = (this.field2432[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2429[var12] |= 0x4;
                } else {
                    this.method3569(var12);
                    this.field2429[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3552(var12, (var14 << 7) + (this.field2433[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3552(var12, (this.field2433[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3470(var17, this.field2423[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3485(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3467(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3480();
            }
        }
    }

    @ObfuscatedName("gi.az(IIB)V")
    public void method3552(int arg0, int arg1) {
        this.field2433[arg0] = arg1;
        this.field2434[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gi.ay(Lhz;I)I")
    public int method3517(class209 arg0) {
        int var2 = (arg0.field2456 * arg0.field2455 >> 12) + arg0.field2446;
        int var3 = ((this.field2424[arg0.field2453] - 8192) * this.field2431[arg0.field2453] >> 12) + var2;
        class206 var4 = arg0.field2461;
        if (var4.field2402 > 0 && (var4.field2396 > 0 || this.field2425[arg0.field2453] > 0)) {
            int var5 = var4.field2396 << 2;
            int var6 = var4.field2395 << 1;
            if (arg0.field2462 < var6) {
                var5 = arg0.field2462 * var5 / var6;
            }
            int var7 = (this.field2425[arg0.field2453] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2450 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2448.field1407 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1422 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gi.ad(Lhz;I)I")
    public int method3486(class209 arg0) {
        class206 var2 = arg0.field2461;
        int var3 = this.field2444[arg0.field2453] * this.field2418[arg0.field2453] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2452 * var4 + 16384 >> 15;
        int var6 = this.field2416 * var5 + 128 >> 8;
        if (var2.field2397 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2457 * 1.953125E-5D * (double) var2.field2397) + 0.5D);
        }
        if (var2.field2403 != null) {
            int var7 = arg0.field2458;
            int var8 = var2.field2403[arg0.field2459 + 1];
            if (arg0.field2459 < var2.field2403.length - 2) {
                int var9 = (var2.field2403[arg0.field2459] & 0xFF) << 8;
                int var10 = (var2.field2403[arg0.field2459 + 2] & 0xFF) << 8;
                var8 += (var2.field2403[arg0.field2459 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2460 > 0 && var2.field2399 != null) {
            int var11 = arg0.field2460;
            int var12 = var2.field2399[arg0.field2449 + 1];
            if (arg0.field2449 < var2.field2399.length - 2) {
                int var13 = (var2.field2399[arg0.field2449] & 0xFF) << 8;
                int var14 = (var2.field2399[arg0.field2449 + 2] & 0xFF) << 8;
                var12 += (var2.field2399[arg0.field2449 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gi.ah(Lhz;I)I")
    public int method3487(class209 arg0) {
        int var2 = this.field2417[arg0.field2453];
        return var2 < 8192 ? arg0.field2466 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2466) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gi.v()Lds;")
    public synchronized class125 method2200() {
        return this.field2439;
    }

    @ObfuscatedName("gi.q()Lds;")
    public synchronized class125 method2201() {
        return null;
    }

    @ObfuscatedName("gi.z()I")
    public synchronized int method2202() {
        return 0;
    }

    @ObfuscatedName("gi.t([III)V")
    public synchronized void method2203(int[] arg0, int arg1, int arg2) {
        if (this.field2437.method3579()) {
            int var4 = this.field2420 * this.field2437.field2476 / Statics.field1422;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2441;
                if (this.field2426 - var5 >= 0L) {
                    this.field2441 = var5;
                    break;
                }
                int var7 = (int) ((this.field2426 - this.field2441 + (long) var4 - 1L) / (long) var4);
                this.field2441 += (long) var4 * (long) var7;
                this.field2439.method2203(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3489();
            } while (this.field2437.method3579());
        }
        this.field2439.method2203(arg0, arg1, arg2);
    }

    @ObfuscatedName("gi.s(I)V")
    public synchronized void method2205(int arg0) {
        if (this.field2437.method3579()) {
            int var2 = this.field2420 * this.field2437.field2476 / Statics.field1422;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2441;
                if (this.field2426 - var3 >= 0L) {
                    this.field2441 = var3;
                    break;
                }
                int var5 = (int) ((this.field2426 - this.field2441 + (long) var2 - 1L) / (long) var2);
                this.field2441 += (long) var2 * (long) var5;
                this.field2439.method2205(var5);
                arg0 -= var5;
                this.method3489();
            } while (this.field2437.method3579());
        }
        this.field2439.method2205(arg0);
    }

    @ObfuscatedName("gi.ag(B)V")
    public void method3489() {
        int var1 = this.field2443;
        int var2 = this.field2440;
        long var3 = this.field2426;
        while (this.field2440 == var2) {
            while (this.field2437.field2477[var1] == var2) {
                this.field2437.method3581(var1);
                int var5 = this.field2437.method3585(var1);
                if (var5 == 1) {
                    this.field2437.method3583();
                    this.field2437.method3618(var1);
                    if (this.field2437.method3590()) {
                        if (!this.field2419 || var2 == 0) {
                            this.method3480();
                            this.field2437.method3594();
                            return;
                        }
                        this.field2437.method3591(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3483(var5);
                }
                this.field2437.method3584(var1);
                this.field2437.method3618(var1);
            }
            var1 = this.field2437.method3576();
            var2 = this.field2437.field2477[var1];
            var3 = this.field2437.method3588(var2);
        }
        this.field2443 = var1;
        this.field2440 = var2;
        this.field2426 = var3;
    }

    @ObfuscatedName("gi.aw(Lhz;I)Z")
    public boolean method3490(class209 arg0) {
        if (arg0.field2464 != null) {
            return false;
        }
        if (arg0.field2460 >= 0) {
            arg0.method3355();
            if (arg0.field2468 > 0 && this.field2436[arg0.field2453][arg0.field2468] == arg0) {
                this.field2436[arg0.field2453][arg0.field2468] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gi.bf(Lhz;[IIIB)Z")
    public boolean method3537(class209 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2454 = Statics.field1422 / 100;
        if (arg0.field2460 >= 0 && arg0.field2464 == null || arg0.field2464.method2441()) {
            arg0.method3570();
            arg0.method3355();
            if (arg0.field2468 > 0 && this.field2436[arg0.field2453][arg0.field2468] == arg0) {
                this.field2436[arg0.field2453][arg0.field2468] = null;
            }
            return true;
        }
        int var5 = arg0.field2456;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2438[arg0.field2453] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2456 = var6;
        }
        arg0.field2464.method2439(this.method3517(arg0));
        class206 var7 = arg0.field2461;
        boolean var8 = false;
        arg0.field2462++;
        arg0.field2450 += var7.field2402;
        double var9 = (double) ((arg0.field2465 - 60 << 8) + (arg0.field2456 * arg0.field2455 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2397 > 0) {
            if (var7.field2400 > 0) {
                arg0.field2457 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2400 * var9) + 0.5D);
            } else {
                arg0.field2457 += 128;
            }
        }
        if (var7.field2403 != null) {
            if (var7.field2398 > 0) {
                arg0.field2458 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2398 * var9) + 0.5D);
            } else {
                arg0.field2458 += 128;
            }
            while (arg0.field2459 < var7.field2403.length - 2 && arg0.field2458 > (var7.field2403[arg0.field2459 + 2] & 0xFF) << 8) {
                arg0.field2459 += 2;
            }
            if (arg0.field2459 == var7.field2403.length - 2 && var7.field2403[arg0.field2459 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2460 >= 0 && var7.field2399 != null && (this.field2429[arg0.field2453] & 0x1) == 0 && (arg0.field2468 < 0 || this.field2436[arg0.field2453][arg0.field2468] != arg0)) {
            if (var7.field2401 > 0) {
                arg0.field2460 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2401 * var9) + 0.5D);
            } else {
                arg0.field2460 += 128;
            }
            while (arg0.field2449 < var7.field2399.length - 2 && arg0.field2460 > (var7.field2399[arg0.field2449 + 2] & 0xFF) << 8) {
                arg0.field2449 += 2;
            }
            if (arg0.field2449 == var7.field2399.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2464.method2462(arg0.field2454, this.method3486(arg0), this.method3487(arg0));
            return false;
        }
        arg0.field2464.method2463(arg0.field2454);
        if (arg1 == null) {
            arg0.field2464.method2205(arg3);
        } else {
            arg0.field2464.method2203(arg1, arg2, arg3);
        }
        if (arg0.field2464.method2442()) {
            this.field2439.field2494.method2195(arg0.field2464);
        }
        arg0.method3570();
        if (arg0.field2460 >= 0) {
            arg0.method3355();
            if (arg0.field2468 > 0 && this.field2436[arg0.field2453][arg0.field2468] == arg0) {
                this.field2436[arg0.field2453][arg0.field2468] = null;
            }
        }
        return true;
    }
}
