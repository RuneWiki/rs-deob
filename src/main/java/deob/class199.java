package deob;

@ObfuscatedName("gg")
public class class199 extends class116 {

    @ObfuscatedName("gg.a")
    public class318 field2406 = new class318(128);

    @ObfuscatedName("gg.t")
    public int field2400 = 256;

    @ObfuscatedName("gg.n")
    public int field2388 = 1000000;

    @ObfuscatedName("gg.q")
    public int[] field2389 = new int[16];

    @ObfuscatedName("gg.v")
    public int[] field2399 = new int[16];

    @ObfuscatedName("gg.l")
    public int[] field2391 = new int[16];

    @ObfuscatedName("gg.c")
    public int[] field2392 = new int[16];

    @ObfuscatedName("gg.o")
    public int[] field2414 = new int[16];

    @ObfuscatedName("gg.i")
    public int[] field2394 = new int[16];

    @ObfuscatedName("gg.d")
    public int[] field2397 = new int[16];

    @ObfuscatedName("gg.m")
    public int[] field2396 = new int[16];

    @ObfuscatedName("gg.p")
    public int[] field2390 = new int[16];

    @ObfuscatedName("gg.b")
    public int[] field2387 = new int[16];

    @ObfuscatedName("gg.z")
    public int[] field2395 = new int[16];

    @ObfuscatedName("gg.f")
    public int[] field2401 = new int[16];

    @ObfuscatedName("gg.g")
    public int[] field2402 = new int[16];

    @ObfuscatedName("gg.w")
    public int[] field2393 = new int[16];

    @ObfuscatedName("gg.u")
    public int[] field2404 = new int[16];

    @ObfuscatedName("gg.y")
    public class200[][] field2410 = new class200[16][128];

    @ObfuscatedName("gg.aa")
    public class200[][] field2386 = new class200[16][128];

    @ObfuscatedName("gg.aw")
    public class201 field2407 = new class201();

    @ObfuscatedName("gg.ar")
    public boolean field2408;

    @ObfuscatedName("gg.aq")
    public int field2409;

    @ObfuscatedName("gg.ad")
    public int field2403;

    @ObfuscatedName("gg.ag")
    public long field2411;

    @ObfuscatedName("gg.ak")
    public long field2412;

    @ObfuscatedName("gg.av")
    public class203 field2413 = new class203(this);

    public class199() {
        this.method3489();
    }

    @ObfuscatedName("gg.a(II)V")
    public synchronized void method3552(int arg0) {
        this.field2400 = arg0;
    }

    @ObfuscatedName("gg.t(B)I")
    public int method3474() {
        return this.field2400;
    }

    @ObfuscatedName("gg.n(Lgb;Lhq;Ldm;II)Z")
    public synchronized boolean method3475(class204 arg0, class234 arg1, class109 arg2, int arg3) {
        arg0.method3661();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class178 var7 = (class178) arg0.field2470.method5536(); var7 != null; var7 = (class178) arg0.field2470.method5530()) {
            int var8 = (int) var7.field2091;
            class202 var9 = (class202) this.field2406.method5528((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3880(var8);
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
                this.field2406.method5529(var11, (long) var8);
            }
            if (!var9.method3642(arg2, var7.field2085, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3663();
        }
        return var5;
    }

    @ObfuscatedName("gg.q(I)V")
    public synchronized void method3476() {
        for (class202 var1 = (class202) this.field2406.method5536(); var1 != null; var1 = (class202) this.field2406.method5530()) {
            var1.method3643();
        }
    }

    @ObfuscatedName("gg.v(I)V")
    public synchronized void method3535() {
        for (class202 var1 = (class202) this.field2406.method5536(); var1 != null; var1 = (class202) this.field2406.method5530()) {
            var1.method3386();
        }
    }

    @ObfuscatedName("gg.d(Lgb;ZI)V")
    public synchronized void method3504(class204 arg0, boolean arg1) {
        this.method3478();
        this.field2407.method3593(arg0.field2469);
        this.field2408 = arg1;
        this.field2411 = 0L;
        int var3 = this.field2407.method3587();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2407.method3588(var4);
            this.field2407.method3591(var4);
            this.field2407.method3589(var4);
        }
        this.field2409 = this.field2407.method3596();
        this.field2403 = this.field2407.field2444[this.field2409];
        this.field2412 = this.field2407.method3595(this.field2403);
    }

    @ObfuscatedName("gg.p(B)V")
    public synchronized void method3478() {
        this.field2407.method3585();
        this.method3489();
    }

    @ObfuscatedName("gg.h(I)Z")
    public synchronized boolean method3479() {
        return this.field2407.method3636();
    }

    @ObfuscatedName("gg.k(III)V")
    public synchronized void method3510(int arg0, int arg1) {
        this.method3481(arg0, arg1);
    }

    @ObfuscatedName("gg.x(III)V")
    public void method3481(int arg0, int arg1) {
        this.field2392[arg0] = arg1;
        this.field2394[arg0] = arg1 & 0xFFFFFF80;
        this.method3576(arg0, arg1);
    }

    @ObfuscatedName("gg.j(III)V")
    public void method3576(int arg0, int arg1) {
        if (this.field2414[arg0] != arg1) {
            this.field2414[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2386[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gg.r(IIII)V")
    public void method3482(int arg0, int arg1, int arg2) {
        this.method3484(arg0, arg1, 64);
        if ((this.field2387[arg0] & 0x2) != 0) {
            for (class200 var4 = (class200) this.field2413.field2465.method4582(); var4 != null; var4 = (class200) this.field2413.field2465.method4584()) {
                if (var4.field2426 == arg0 && var4.field2429 < 0) {
                    this.field2410[arg0][var4.field2420] = null;
                    this.field2410[arg0][arg1] = var4;
                    int var5 = (var4.field2425 * var4.field2424 >> 12) + var4.field2417;
                    var4.field2417 += arg1 - var4.field2420 << 8;
                    var4.field2424 = var5 - var4.field2417;
                    var4.field2425 = 4096;
                    var4.field2420 = arg1;
                    return;
                }
            }
        }
        class202 var6 = (class202) this.field2406.method5528((long) this.field2414[arg0]);
        if (var6 == null) {
            return;
        }
        class104 var7 = var6.field2457[arg1];
        if (var7 == null) {
            return;
        }
        class200 var8 = new class200();
        var8.field2426 = arg0;
        var8.field2416 = var6;
        var8.field2419 = var7;
        var8.field2418 = var6.field2459[arg1];
        var8.field2423 = var6.field2460[arg1];
        var8.field2420 = arg1;
        var8.field2431 = var6.field2455 * arg2 * arg2 * var6.field2454[arg1] + 1024 >> 11;
        var8.field2422 = var6.field2458[arg1] & 0xFF;
        var8.field2417 = (arg1 << 8) - (var6.field2461[arg1] & 0x7FFF);
        var8.field2421 = 0;
        var8.field2432 = 0;
        var8.field2428 = 0;
        var8.field2429 = -1;
        var8.field2430 = 0;
        if (this.field2402[arg0] == 0) {
            var8.field2433 = class114.method2498(var7, this.method3544(var8), this.method3496(var8), this.method3495(var8));
        } else {
            var8.field2433 = class114.method2498(var7, this.method3544(var8), 0, this.method3495(var8));
            this.method3502(var8, var6.field2461[arg1] < 0);
        }
        if (var6.field2461[arg1] < 0) {
            var8.field2433.method2440(-1);
        }
        if (var8.field2423 >= 0) {
            class200 var9 = this.field2386[arg0][var8.field2423];
            if (var9 != null && var9.field2429 < 0) {
                this.field2410[arg0][var9.field2420] = null;
                var9.field2429 = 0;
            }
            this.field2386[arg0][var8.field2423] = var8;
        }
        this.field2413.field2465.method4576(var8);
        this.field2410[arg0][arg1] = var8;
    }

    @ObfuscatedName("gg.e(Lgq;ZI)V")
    public void method3502(class200 arg0, boolean arg1) {
        int var3 = arg0.field2419.field1365.length;
        int var5;
        if (arg1 && arg0.field2419.field1364) {
            int var4 = var3 + var3 - arg0.field2419.field1366;
            var5 = (int) ((long) this.field2402[arg0.field2426] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2433.method2452(true);
            }
        } else {
            var5 = (int) ((long) this.field2402[arg0.field2426] * (long) var3 >> 6);
        }
        arg0.field2433.method2451(var5);
    }

    @ObfuscatedName("gg.s(IIII)V")
    public void method3484(int arg0, int arg1, int arg2) {
        class200 var4 = this.field2410[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2410[arg0][arg1] = null;
        if ((this.field2387[arg0] & 0x2) == 0) {
            var4.field2429 = 0;
            return;
        }
        for (class200 var5 = (class200) this.field2413.field2465.method4581(); var5 != null; var5 = (class200) this.field2413.field2465.method4589()) {
            if (var4.field2426 == var5.field2426 && var5.field2429 < 0 && var4 != var5) {
                var4.field2429 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gg.b(IIII)V")
    public void method3553(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gg.w(IIB)V")
    public void method3485(int arg0, int arg1) {
    }

    @ObfuscatedName("gg.u(III)V")
    public void method3559(int arg0, int arg1) {
        this.field2397[arg0] = arg1;
    }

    @ObfuscatedName("gg.ad(II)V")
    public void method3487(int arg0) {
        for (class200 var2 = (class200) this.field2413.field2465.method4581(); var2 != null; var2 = (class200) this.field2413.field2465.method4589()) {
            if (arg0 < 0 || var2.field2426 == arg0) {
                if (var2.field2433 != null) {
                    var2.field2433.method2463(Statics.field1392 / 100);
                    if (var2.field2433.method2460()) {
                        this.field2413.field2463.method2214(var2.field2433);
                    }
                    var2.method3582();
                }
                if (var2.field2429 < 0) {
                    this.field2410[var2.field2426][var2.field2420] = null;
                }
                var2.method3386();
            }
        }
    }

    @ObfuscatedName("gg.ah(II)V")
    public void method3488(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3488(var2);
            }
            return;
        }
        this.field2389[arg0] = 12800;
        this.field2399[arg0] = 8192;
        this.field2391[arg0] = 16383;
        this.field2397[arg0] = 8192;
        this.field2396[arg0] = 0;
        this.field2390[arg0] = 8192;
        this.method3509(arg0);
        this.method3491(arg0);
        this.field2387[arg0] = 0;
        this.field2395[arg0] = 32767;
        this.field2401[arg0] = 256;
        this.field2402[arg0] = 0;
        this.method3493(arg0, 8192);
    }

    @ObfuscatedName("gg.an(II)V")
    public void method3519(int arg0) {
        for (class200 var2 = (class200) this.field2413.field2465.method4581(); var2 != null; var2 = (class200) this.field2413.field2465.method4589()) {
            if ((arg0 < 0 || var2.field2426 == arg0) && var2.field2429 < 0) {
                this.field2410[var2.field2426][var2.field2420] = null;
                var2.field2429 = 0;
            }
        }
    }

    @ObfuscatedName("gg.af(I)V")
    public void method3489() {
        this.method3487(-1);
        this.method3488(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2414[var1] = this.field2392[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2394[var2] = this.field2392[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gg.ai(II)V")
    public void method3509(int arg0) {
        if ((this.field2387[arg0] & 0x2) == 0) {
            return;
        }
        for (class200 var2 = (class200) this.field2413.field2465.method4581(); var2 != null; var2 = (class200) this.field2413.field2465.method4589()) {
            if (var2.field2426 == arg0 && this.field2410[arg0][var2.field2420] == null && var2.field2429 < 0) {
                var2.field2429 = 0;
            }
        }
    }

    @ObfuscatedName("gg.ac(II)V")
    public void method3491(int arg0) {
        if ((this.field2387[arg0] & 0x4) == 0) {
            return;
        }
        for (class200 var2 = (class200) this.field2413.field2465.method4581(); var2 != null; var2 = (class200) this.field2413.field2465.method4589()) {
            if (var2.field2426 == arg0) {
                var2.field2435 = 0;
            }
        }
    }

    @ObfuscatedName("gg.at(II)V")
    public void method3492(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3484(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3482(var6, var7, var8);
            } else {
                this.method3484(var6, var7, 64);
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
                this.field2394[var12] = (var14 << 14) + (this.field2394[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2394[var12] = (var14 << 7) + (this.field2394[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2396[var12] = (var14 << 7) + (this.field2396[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2396[var12] = (this.field2396[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2390[var12] = (var14 << 7) + (this.field2390[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2390[var12] = (this.field2390[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2389[var12] = (var14 << 7) + (this.field2389[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2389[var12] = (this.field2389[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2399[var12] = (var14 << 7) + (this.field2399[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2399[var12] = (this.field2399[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2391[var12] = (var14 << 7) + (this.field2391[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2391[var12] = (this.field2391[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2387[var12] |= 0x1;
                } else {
                    this.field2387[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2387[var12] |= 0x2;
                } else {
                    this.method3509(var12);
                    this.field2387[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2395[var12] = (var14 << 7) + (this.field2395[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2395[var12] = (this.field2395[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2395[var12] = (var14 << 7) + (this.field2395[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2395[var12] = (this.field2395[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3487(var12);
            }
            if (var13 == 121) {
                this.method3488(var12);
            }
            if (var13 == 123) {
                this.method3519(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2395[var12];
                if (var15 == 16384) {
                    this.field2401[var12] = (var14 << 7) + (this.field2401[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2395[var12];
                if (var16 == 16384) {
                    this.field2401[var12] = (this.field2401[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2402[var12] = (var14 << 7) + (this.field2402[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2402[var12] = (this.field2402[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2387[var12] |= 0x4;
                } else {
                    this.method3491(var12);
                    this.field2387[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3493(var12, (var14 << 7) + (this.field2393[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3493(var12, (this.field2393[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3576(var17, this.field2394[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3485(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3559(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3489();
            }
        }
    }

    @ObfuscatedName("gg.ba(III)V")
    public void method3493(int arg0, int arg1) {
        this.field2393[arg0] = arg1;
        this.field2404[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gg.bg(Lgq;I)I")
    public int method3544(class200 arg0) {
        int var2 = (arg0.field2425 * arg0.field2424 >> 12) + arg0.field2417;
        int var3 = ((this.field2397[arg0.field2426] - 8192) * this.field2401[arg0.field2426] >> 12) + var2;
        class197 var4 = arg0.field2418;
        if (var4.field2368 > 0 && (var4.field2361 > 0 || this.field2396[arg0.field2426] > 0)) {
            int var5 = var4.field2361 << 2;
            int var6 = var4.field2369 << 1;
            if (arg0.field2427 < var6) {
                var5 = arg0.field2427 * var5 / var6;
            }
            int var7 = (this.field2396[arg0.field2426] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2415 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2419.field1368 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1392 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gg.bc(Lgq;B)I")
    public int method3496(class200 arg0) {
        class197 var2 = arg0.field2418;
        int var3 = this.field2391[arg0.field2426] * this.field2389[arg0.field2426] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2431 * var4 + 16384 >> 15;
        int var6 = this.field2400 * var5 + 128 >> 8;
        if (var2.field2372 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2421 * 1.953125E-5D * (double) var2.field2372) + 0.5D);
        }
        if (var2.field2365 != null) {
            int var7 = arg0.field2432;
            int var8 = var2.field2365[arg0.field2428 + 1];
            if (arg0.field2428 < var2.field2365.length - 2) {
                int var9 = (var2.field2365[arg0.field2428] & 0xFF) << 8;
                int var10 = (var2.field2365[arg0.field2428 + 2] & 0xFF) << 8;
                var8 += (var2.field2365[arg0.field2428 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2429 > 0 && var2.field2362 != null) {
            int var11 = arg0.field2429;
            int var12 = var2.field2362[arg0.field2430 + 1];
            if (arg0.field2430 < var2.field2362.length - 2) {
                int var13 = (var2.field2362[arg0.field2430] & 0xFF) << 8;
                int var14 = (var2.field2362[arg0.field2430 + 2] & 0xFF) << 8;
                var12 += (var2.field2362[arg0.field2430 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gg.bd(Lgq;B)I")
    public int method3495(class200 arg0) {
        int var2 = this.field2399[arg0.field2426];
        return var2 < 8192 ? arg0.field2422 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2422) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gg.l()Ldj;")
    public synchronized class116 method2215() {
        return this.field2413;
    }

    @ObfuscatedName("gg.c()Ldj;")
    public synchronized class116 method2223() {
        return null;
    }

    @ObfuscatedName("gg.o()I")
    public synchronized int method2217() {
        return 0;
    }

    @ObfuscatedName("gg.i([III)V")
    public synchronized void method2218(int[] arg0, int arg1, int arg2) {
        if (this.field2407.method3636()) {
            int var4 = this.field2388 * this.field2407.field2441 / Statics.field1392;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2411;
                if (this.field2412 - var5 >= 0L) {
                    this.field2411 = var5;
                    break;
                }
                int var7 = (int) ((this.field2412 - this.field2411 + (long) var4 - 1L) / (long) var4);
                this.field2411 += (long) var4 * (long) var7;
                this.field2413.method2218(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3555();
            } while (this.field2407.method3636());
        }
        this.field2413.method2218(arg0, arg1, arg2);
    }

    @ObfuscatedName("gg.m(I)V")
    public synchronized void method2224(int arg0) {
        if (this.field2407.method3636()) {
            int var2 = this.field2388 * this.field2407.field2441 / Statics.field1392;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2411;
                if (this.field2412 - var3 >= 0L) {
                    this.field2411 = var3;
                    break;
                }
                int var5 = (int) ((this.field2412 - this.field2411 + (long) var2 - 1L) / (long) var2);
                this.field2411 += (long) var2 * (long) var5;
                this.field2413.method2224(var5);
                arg0 -= var5;
                this.method3555();
            } while (this.field2407.method3636());
        }
        this.field2413.method2224(arg0);
    }

    @ObfuscatedName("gg.bx(I)V")
    public void method3555() {
        int var1 = this.field2409;
        int var2 = this.field2403;
        long var3 = this.field2412;
        while (this.field2403 == var2) {
            while (this.field2407.field2444[var1] == var2) {
                this.field2407.method3588(var1);
                int var5 = this.field2407.method3592(var1);
                if (var5 == 1) {
                    this.field2407.method3590();
                    this.field2407.method3589(var1);
                    if (this.field2407.method3584()) {
                        if (!this.field2408 || var2 == 0) {
                            this.method3489();
                            this.field2407.method3585();
                            return;
                        }
                        this.field2407.method3598(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3492(var5);
                }
                this.field2407.method3591(var1);
                this.field2407.method3589(var1);
            }
            var1 = this.field2407.method3596();
            var2 = this.field2407.field2444[var1];
            var3 = this.field2407.method3595(var2);
        }
        this.field2409 = var1;
        this.field2403 = var2;
        this.field2412 = var3;
    }

    @ObfuscatedName("gg.bl(Lgq;I)Z")
    public boolean method3499(class200 arg0) {
        if (arg0.field2433 != null) {
            return false;
        }
        if (arg0.field2429 >= 0) {
            arg0.method3386();
            if (arg0.field2423 > 0 && this.field2386[arg0.field2426][arg0.field2423] == arg0) {
                this.field2386[arg0.field2426][arg0.field2423] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gg.bh(Lgq;[IIII)Z")
    public boolean method3500(class200 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2434 = Statics.field1392 / 100;
        if (arg0.field2429 >= 0 && arg0.field2433 == null || arg0.field2433.method2520()) {
            arg0.method3582();
            arg0.method3386();
            if (arg0.field2423 > 0 && this.field2386[arg0.field2426][arg0.field2423] == arg0) {
                this.field2386[arg0.field2426][arg0.field2423] = null;
            }
            return true;
        }
        int var5 = arg0.field2425;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2390[arg0.field2426] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2425 = var6;
        }
        arg0.field2433.method2482(this.method3544(arg0));
        class197 var7 = arg0.field2418;
        boolean var8 = false;
        arg0.field2427++;
        arg0.field2415 += var7.field2368;
        double var9 = (double) ((arg0.field2420 - 60 << 8) + (arg0.field2425 * arg0.field2424 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2372 > 0) {
            if (var7.field2366 > 0) {
                arg0.field2421 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2366 * var9) + 0.5D);
            } else {
                arg0.field2421 += 128;
            }
        }
        if (var7.field2365 != null) {
            if (var7.field2367 > 0) {
                arg0.field2432 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2367 * var9) + 0.5D);
            } else {
                arg0.field2432 += 128;
            }
            while (arg0.field2428 < var7.field2365.length - 2 && arg0.field2432 > (var7.field2365[arg0.field2428 + 2] & 0xFF) << 8) {
                arg0.field2428 += 2;
            }
            if (arg0.field2428 == var7.field2365.length - 2 && var7.field2365[arg0.field2428 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2429 >= 0 && var7.field2362 != null && (this.field2387[arg0.field2426] & 0x1) == 0 && (arg0.field2423 < 0 || this.field2386[arg0.field2426][arg0.field2423] != arg0)) {
            if (var7.field2364 > 0) {
                arg0.field2429 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2364 * var9) + 0.5D);
            } else {
                arg0.field2429 += 128;
            }
            while (arg0.field2430 < var7.field2362.length - 2 && arg0.field2429 > (var7.field2362[arg0.field2430 + 2] & 0xFF) << 8) {
                arg0.field2430 += 2;
            }
            if (arg0.field2430 == var7.field2362.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2433.method2455(arg0.field2434, this.method3496(arg0), this.method3495(arg0));
            return false;
        }
        arg0.field2433.method2463(arg0.field2434);
        if (arg1 == null) {
            arg0.field2433.method2224(arg3);
        } else {
            arg0.field2433.method2218(arg1, arg2, arg3);
        }
        if (arg0.field2433.method2460()) {
            this.field2413.field2463.method2214(arg0.field2433);
        }
        arg0.method3582();
        if (arg0.field2429 >= 0) {
            arg0.method3386();
            if (arg0.field2423 > 0 && this.field2386[arg0.field2426][arg0.field2423] == arg0) {
                this.field2386[arg0.field2426][arg0.field2423] = null;
            }
        }
        return true;
    }
}
