package deob;

@ObfuscatedName("ho")
public class class219 extends class106 {

    @ObfuscatedName("ho.m")
    public class203 field2515 = new class203(128);

    @ObfuscatedName("ho.q")
    public int field2493 = 256;

    @ObfuscatedName("ho.b")
    public int field2514 = 1000000;

    @ObfuscatedName("ho.f")
    public int[] field2492 = new int[16];

    @ObfuscatedName("ho.n")
    public int[] field2496 = new int[16];

    @ObfuscatedName("ho.h")
    public int[] field2497 = new int[16];

    @ObfuscatedName("ho.x")
    public int[] field2498 = new int[16];

    @ObfuscatedName("ho.j")
    public int[] field2494 = new int[16];

    @ObfuscatedName("ho.a")
    public int[] field2500 = new int[16];

    @ObfuscatedName("ho.l")
    public int[] field2501 = new int[16];

    @ObfuscatedName("ho.d")
    public int[] field2502 = new int[16];

    @ObfuscatedName("ho.s")
    public int[] field2503 = new int[16];

    @ObfuscatedName("ho.u")
    public int[] field2504 = new int[16];

    @ObfuscatedName("ho.i")
    public int[] field2505 = new int[16];

    @ObfuscatedName("ho.z")
    public int[] field2506 = new int[16];

    @ObfuscatedName("ho.k")
    public int[] field2507 = new int[16];

    @ObfuscatedName("ho.r")
    public int[] field2516 = new int[16];

    @ObfuscatedName("ho.v")
    public int[] field2517 = new int[16];

    @ObfuscatedName("ho.o")
    public class220[][] field2510 = new class220[16][128];

    @ObfuscatedName("ho.ai")
    public class220[][] field2511 = new class220[16][128];

    @ObfuscatedName("ho.at")
    public class221 field2512 = new class221();

    @ObfuscatedName("ho.ad")
    public boolean field2513;

    @ObfuscatedName("ho.ac")
    public int field2509;

    @ObfuscatedName("ho.ay")
    public int field2495;

    @ObfuscatedName("ho.an")
    public long field2499;

    @ObfuscatedName("ho.as")
    public long field2508;

    @ObfuscatedName("ho.aw")
    public class223 field2518 = new class223(this);

    public class219() {
        this.method3921();
    }

    @ObfuscatedName("ho.w(IB)V")
    public synchronized void method3954(int arg0) {
        this.field2493 = arg0;
    }

    @ObfuscatedName("ho.m(B)I")
    public int method3896() {
        return this.field2493;
    }

    @ObfuscatedName("ho.q(Lhc;Liv;Lcv;II)Z")
    public synchronized boolean method3897(class224 arg0, class248 arg1, class99 arg2, int arg3) {
        arg0.method4082();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class214 var7 = (class214) arg0.field2569.method3739(); var7 != null; var7 = (class214) arg0.field2569.method3740()) {
            int var8 = (int) var7.field2450;
            class222 var9 = (class222) this.field2515.method3748((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method4342(var8);
                class222 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class222(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2515.method3747(var11, (long) var8);
            }
            if (!var9.method4064(arg2, var7.field2467, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method4081();
        }
        return var5;
    }

    @ObfuscatedName("ho.x(I)V")
    public synchronized void method3898() {
        for (class222 var1 = (class222) this.field2515.method3739(); var1 != null; var1 = (class222) this.field2515.method3740()) {
            var1.method4067();
        }
    }

    @ObfuscatedName("ho.j(I)V")
    public synchronized void method3899() {
        for (class222 var1 = (class222) this.field2515.method3739(); var1 != null; var1 = (class222) this.field2515.method3740()) {
            var1.method3782();
        }
    }

    @ObfuscatedName("ho.p(Lhc;ZB)V")
    public synchronized void method3977(class224 arg0, boolean arg1) {
        this.method3903();
        this.field2512.method4014(arg0.field2570);
        this.field2513 = arg1;
        this.field2499 = 0L;
        int var3 = this.field2512.method4017();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2512.method4061(var4);
            this.field2512.method4021(var4);
            this.field2512.method4052(var4);
        }
        this.field2509 = this.field2512.method4059();
        this.field2495 = this.field2512.field2542[this.field2509];
        this.field2508 = this.field2512.method4025(this.field2495);
    }

    @ObfuscatedName("ho.y(I)V")
    public synchronized void method3903() {
        this.field2512.method4015();
        this.method3921();
    }

    @ObfuscatedName("ho.c(I)Z")
    public synchronized boolean method4004() {
        return this.field2512.method4056();
    }

    @ObfuscatedName("ho.e(IIB)V")
    public synchronized void method3902(int arg0, int arg1) {
        this.method3900(arg0, arg1);
    }

    @ObfuscatedName("ho.t(IIB)V")
    public void method3900(int arg0, int arg1) {
        this.field2498[arg0] = arg1;
        this.field2500[arg0] = arg1 & 0xFFFFFF80;
        this.method3904(arg0, arg1);
    }

    @ObfuscatedName("ho.u(III)V")
    public void method3904(int arg0, int arg1) {
        if (this.field2494[arg0] != arg1) {
            this.field2494[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2511[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ho.i(IIII)V")
    public void method3905(int arg0, int arg1, int arg2) {
        this.method3936(arg0, arg1, 64);
        if ((this.field2504[arg0] & 0x2) != 0) {
            for (class220 var4 = (class220) this.field2518.field2566.method3796(); var4 != null; var4 = (class220) this.field2518.field2566.method3798()) {
                if (var4.field2519 == arg0 && var4.field2533 < 0) {
                    this.field2510[arg0][var4.field2524] = null;
                    this.field2510[arg0][arg1] = var4;
                    int var5 = (var4.field2529 * var4.field2522 >> 12) + var4.field2527;
                    var4.field2527 += arg1 - var4.field2524 << 8;
                    var4.field2522 = var5 - var4.field2527;
                    var4.field2529 = 4096;
                    var4.field2524 = arg1;
                    return;
                }
            }
        }
        class222 var6 = (class222) this.field2515.method3748((long) this.field2494[arg0]);
        if (var6 == null) {
            return;
        }
        class94 var7 = var6.field2554[arg1];
        if (var7 == null) {
            return;
        }
        class220 var8 = new class220();
        var8.field2519 = arg0;
        var8.field2520 = var6;
        var8.field2525 = var7;
        var8.field2534 = var6.field2558[arg1];
        var8.field2523 = var6.field2561[arg1];
        var8.field2524 = arg1;
        var8.field2536 = var6.field2562 * arg2 * arg2 * var6.field2557[arg1] + 1024 >> 11;
        var8.field2526 = var6.field2555[arg1] & 0xFF;
        var8.field2527 = (arg1 << 8) - (var6.field2556[arg1] & 0x7FFF);
        var8.field2530 = 0;
        var8.field2531 = 0;
        var8.field2532 = 0;
        var8.field2533 = -1;
        var8.field2528 = 0;
        if (this.field2507[arg0] == 0) {
            var8.field2537 = class104.method2142(var7, this.method3950(var8), this.method3919(var8), this.method3972(var8));
        } else {
            var8.field2537 = class104.method2142(var7, this.method3950(var8), 0, this.method3972(var8));
            this.method3906(var8, var6.field2556[arg1] < 0);
        }
        if (var6.field2556[arg1] < 0) {
            var8.field2537.method2144(-1);
        }
        if (var8.field2523 >= 0) {
            class220 var9 = this.field2511[arg0][var8.field2523];
            if (var9 != null && var9.field2533 < 0) {
                this.field2510[arg0][var9.field2524] = null;
                var9.field2533 = 0;
            }
            this.field2511[arg0][var8.field2523] = var8;
        }
        this.field2518.field2566.method3810(var8);
        this.field2510[arg0][arg1] = var8;
    }

    @ObfuscatedName("ho.r(Lhy;ZI)V")
    public void method3906(class220 arg0, boolean arg1) {
        int var3 = arg0.field2525.field1306.length;
        int var5;
        if (arg1 && arg0.field2525.field1305) {
            int var4 = var3 + var3 - arg0.field2525.field1304;
            var5 = (int) ((long) this.field2507[arg0.field2519] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2537.method2151(true);
            }
        } else {
            var5 = (int) ((long) this.field2507[arg0.field2519] * (long) var3 >> 6);
        }
        arg0.field2537.method2150(var5);
    }

    @ObfuscatedName("ho.v(IIIS)V")
    public void method3936(int arg0, int arg1, int arg2) {
        class220 var4 = this.field2510[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2510[arg0][arg1] = null;
        if ((this.field2504[arg0] & 0x2) == 0) {
            var4.field2533 = 0;
            return;
        }
        for (class220 var5 = (class220) this.field2518.field2566.method3797(); var5 != null; var5 = (class220) this.field2518.field2566.method3788()) {
            if (var4.field2519 == var5.field2519 && var5.field2533 < 0 && var4 != var5) {
                var4.field2533 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ho.o(IIII)V")
    public void method3908(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ho.ai(IIB)V")
    public void method3909(int arg0, int arg1) {
    }

    @ObfuscatedName("ho.at(IIB)V")
    public void method3988(int arg0, int arg1) {
        this.field2501[arg0] = arg1;
    }

    @ObfuscatedName("ho.ad(IB)V")
    public void method3911(int arg0) {
        for (class220 var2 = (class220) this.field2518.field2566.method3797(); var2 != null; var2 = (class220) this.field2518.field2566.method3788()) {
            if (arg0 < 0 || var2.field2519 == arg0) {
                if (var2.field2537 != null) {
                    var2.field2537.method2155(Statics.field1331 / 100);
                    if (var2.field2537.method2159()) {
                        this.field2518.field2565.method1903(var2.field2537);
                    }
                    var2.method4010();
                }
                if (var2.field2533 < 0) {
                    this.field2510[var2.field2519][var2.field2524] = null;
                }
                var2.method3782();
            }
        }
    }

    @ObfuscatedName("ho.ac(II)V")
    public void method3982(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3982(var2);
            }
            return;
        }
        this.field2492[arg0] = 12800;
        this.field2496[arg0] = 8192;
        this.field2497[arg0] = 16383;
        this.field2501[arg0] = 8192;
        this.field2502[arg0] = 0;
        this.field2503[arg0] = 8192;
        this.method3914(arg0);
        this.method3926(arg0);
        this.field2504[arg0] = 0;
        this.field2505[arg0] = 32767;
        this.field2506[arg0] = 256;
        this.field2507[arg0] = 0;
        this.method3917(arg0, 8192);
    }

    @ObfuscatedName("ho.ay(II)V")
    public void method3913(int arg0) {
        for (class220 var2 = (class220) this.field2518.field2566.method3797(); var2 != null; var2 = (class220) this.field2518.field2566.method3788()) {
            if ((arg0 < 0 || var2.field2519 == arg0) && var2.field2533 < 0) {
                this.field2510[var2.field2519][var2.field2524] = null;
                var2.field2533 = 0;
            }
        }
    }

    @ObfuscatedName("ho.an(I)V")
    public void method3921() {
        this.method3911(-1);
        this.method3982(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2494[var1] = this.field2498[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2500[var2] = this.field2498[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ho.ae(II)V")
    public void method3914(int arg0) {
        if ((this.field2504[arg0] & 0x2) == 0) {
            return;
        }
        for (class220 var2 = (class220) this.field2518.field2566.method3797(); var2 != null; var2 = (class220) this.field2518.field2566.method3788()) {
            if (var2.field2519 == arg0 && this.field2510[arg0][var2.field2524] == null && var2.field2533 < 0) {
                var2.field2533 = 0;
            }
        }
    }

    @ObfuscatedName("ho.au(II)V")
    public void method3926(int arg0) {
        if ((this.field2504[arg0] & 0x4) == 0) {
            return;
        }
        for (class220 var2 = (class220) this.field2518.field2566.method3797(); var2 != null; var2 = (class220) this.field2518.field2566.method3788()) {
            if (var2.field2519 == arg0) {
                var2.field2539 = 0;
            }
        }
    }

    @ObfuscatedName("ho.av(II)V")
    public void method3959(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3936(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3905(var6, var7, var8);
            } else {
                this.method3936(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3908(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2500[var12] = (var14 << 14) + (this.field2500[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2500[var12] = (var14 << 7) + (this.field2500[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2502[var12] = (var14 << 7) + (this.field2502[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2502[var12] = (this.field2502[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2503[var12] = (var14 << 7) + (this.field2503[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2503[var12] = (this.field2503[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2492[var12] = (var14 << 7) + (this.field2492[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2492[var12] = (this.field2492[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2496[var12] = (var14 << 7) + (this.field2496[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2496[var12] = (this.field2496[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2497[var12] = (var14 << 7) + (this.field2497[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2497[var12] = (this.field2497[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2504[var12] |= 0x1;
                } else {
                    this.field2504[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2504[var12] |= 0x2;
                } else {
                    this.method3914(var12);
                    this.field2504[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2505[var12] = (var14 << 7) + (this.field2505[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2505[var12] = (this.field2505[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2505[var12] = (var14 << 7) + (this.field2505[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2505[var12] = (this.field2505[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3911(var12);
            }
            if (var13 == 121) {
                this.method3982(var12);
            }
            if (var13 == 123) {
                this.method3913(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2505[var12];
                if (var15 == 16384) {
                    this.field2506[var12] = (var14 << 7) + (this.field2506[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2505[var12];
                if (var16 == 16384) {
                    this.field2506[var12] = (this.field2506[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2507[var12] = (var14 << 7) + (this.field2507[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2507[var12] = (this.field2507[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2504[var12] |= 0x4;
                } else {
                    this.method3926(var12);
                    this.field2504[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3917(var12, (var14 << 7) + (this.field2516[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3917(var12, (this.field2516[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3904(var17, this.field2500[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3909(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3988(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3921();
            }
        }
    }

    @ObfuscatedName("ho.ab(IIB)V")
    public void method3917(int arg0, int arg1) {
        this.field2516[arg0] = arg1;
        this.field2517[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ho.aa(Lhy;I)I")
    public int method3950(class220 arg0) {
        int var2 = (arg0.field2529 * arg0.field2522 >> 12) + arg0.field2527;
        int var3 = ((this.field2501[arg0.field2519] - 8192) * this.field2506[arg0.field2519] >> 12) + var2;
        class217 var4 = arg0.field2534;
        if (var4.field2480 > 0 && (var4.field2473 > 0 || this.field2502[arg0.field2519] > 0)) {
            int var5 = var4.field2473 << 2;
            int var6 = var4.field2481 << 1;
            if (arg0.field2535 < var6) {
                var5 = arg0.field2535 * var5 / var6;
            }
            int var7 = (this.field2502[arg0.field2519] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2521 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2525.field1308 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1331 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ho.al(Lhy;I)I")
    public int method3919(class220 arg0) {
        class217 var2 = arg0.field2534;
        int var3 = this.field2497[arg0.field2519] * this.field2492[arg0.field2519] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2536 * var4 + 16384 >> 15;
        int var6 = this.field2493 * var5 + 128 >> 8;
        if (var2.field2475 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2530 * 1.953125E-5D * (double) var2.field2475) + 0.5D);
        }
        if (var2.field2479 != null) {
            int var7 = arg0.field2531;
            int var8 = var2.field2479[arg0.field2532 + 1];
            if (arg0.field2532 < var2.field2479.length - 2) {
                int var9 = (var2.field2479[arg0.field2532] & 0xFF) << 8;
                int var10 = (var2.field2479[arg0.field2532 + 2] & 0xFF) << 8;
                var8 += (var2.field2479[arg0.field2532 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2533 > 0 && var2.field2474 != null) {
            int var11 = arg0.field2533;
            int var12 = var2.field2474[arg0.field2528 + 1];
            if (arg0.field2528 < var2.field2474.length - 2) {
                int var13 = (var2.field2474[arg0.field2528] & 0xFF) << 8;
                int var14 = (var2.field2474[arg0.field2528 + 2] & 0xFF) << 8;
                var12 += (var2.field2474[arg0.field2528 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ho.bc(Lhy;I)I")
    public int method3972(class220 arg0) {
        int var2 = this.field2496[arg0.field2519];
        return var2 < 8192 ? arg0.field2526 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2526) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ho.a()Ldu;")
    public synchronized class106 method1908() {
        return this.field2518;
    }

    @ObfuscatedName("ho.l()Ldu;")
    public synchronized class106 method1909() {
        return null;
    }

    @ObfuscatedName("ho.d()I")
    public synchronized int method1910() {
        return 0;
    }

    @ObfuscatedName("ho.s([III)V")
    public synchronized void method1945(int[] arg0, int arg1, int arg2) {
        if (this.field2512.method4056()) {
            int var4 = this.field2514 * this.field2512.field2541 / Statics.field1331;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2499;
                if (this.field2508 - var5 >= 0L) {
                    this.field2499 = var5;
                    break;
                }
                int var7 = (int) ((this.field2508 - this.field2499 + (long) var4 - 1L) / (long) var4);
                this.field2499 += (long) var4 * (long) var7;
                this.field2518.method1945(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3925();
            } while (this.field2512.method4056());
        }
        this.field2518.method1945(arg0, arg1, arg2);
    }

    @ObfuscatedName("ho.g(I)V")
    public synchronized void method1917(int arg0) {
        if (this.field2512.method4056()) {
            int var2 = this.field2514 * this.field2512.field2541 / Statics.field1331;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2499;
                if (this.field2508 - var3 >= 0L) {
                    this.field2499 = var3;
                    break;
                }
                int var5 = (int) ((this.field2508 - this.field2499 + (long) var2 - 1L) / (long) var2);
                this.field2499 += (long) var2 * (long) var5;
                this.field2518.method1917(var5);
                arg0 -= var5;
                this.method3925();
            } while (this.field2512.method4056());
        }
        this.field2518.method1917(arg0);
    }

    @ObfuscatedName("ho.bo(I)V")
    public void method3925() {
        int var1 = this.field2509;
        int var2 = this.field2495;
        long var3 = this.field2508;
        while (this.field2495 == var2) {
            while (this.field2512.field2542[var1] == var2) {
                this.field2512.method4061(var1);
                int var5 = this.field2512.method4022(var1);
                if (var5 == 1) {
                    this.field2512.method4020();
                    this.field2512.method4052(var1);
                    if (this.field2512.method4040()) {
                        if (!this.field2513 || var2 == 0) {
                            this.method3921();
                            this.field2512.method4015();
                            return;
                        }
                        this.field2512.method4028(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3959(var5);
                }
                this.field2512.method4021(var1);
                this.field2512.method4052(var1);
            }
            var1 = this.field2512.method4059();
            var2 = this.field2512.field2542[var1];
            var3 = this.field2512.method4025(var2);
        }
        this.field2509 = var1;
        this.field2495 = var2;
        this.field2508 = var3;
    }

    @ObfuscatedName("ho.bx(Lhy;I)Z")
    public boolean method3923(class220 arg0) {
        if (arg0.field2537 != null) {
            return false;
        }
        if (arg0.field2533 >= 0) {
            arg0.method3782();
            if (arg0.field2523 > 0 && this.field2511[arg0.field2519][arg0.field2523] == arg0) {
                this.field2511[arg0.field2519][arg0.field2523] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ho.be(Lhy;[IIII)Z")
    public boolean method3901(class220 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2538 = Statics.field1331 / 100;
        if (arg0.field2533 >= 0 && arg0.field2537 == null || arg0.field2537.method2251()) {
            arg0.method4010();
            arg0.method3782();
            if (arg0.field2523 > 0 && this.field2511[arg0.field2519][arg0.field2523] == arg0) {
                this.field2511[arg0.field2519][arg0.field2523] = null;
            }
            return true;
        }
        int var5 = arg0.field2529;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2503[arg0.field2519] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2529 = var6;
        }
        arg0.field2537.method2156(this.method3950(arg0));
        class217 var7 = arg0.field2534;
        boolean var8 = false;
        arg0.field2535++;
        arg0.field2521 += var7.field2480;
        double var9 = (double) ((arg0.field2524 - 60 << 8) + (arg0.field2529 * arg0.field2522 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2475 > 0) {
            if (var7.field2477 > 0) {
                arg0.field2530 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2477 * var9) + 0.5D);
            } else {
                arg0.field2530 += 128;
            }
        }
        if (var7.field2479 != null) {
            if (var7.field2476 > 0) {
                arg0.field2531 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2476 * var9) + 0.5D);
            } else {
                arg0.field2531 += 128;
            }
            while (arg0.field2532 < var7.field2479.length - 2 && arg0.field2531 > (var7.field2479[arg0.field2532 + 2] & 0xFF) << 8) {
                arg0.field2532 += 2;
            }
            if (arg0.field2532 == var7.field2479.length - 2 && var7.field2479[arg0.field2532 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2533 >= 0 && var7.field2474 != null && (this.field2504[arg0.field2519] & 0x1) == 0 && (arg0.field2523 < 0 || this.field2511[arg0.field2519][arg0.field2523] != arg0)) {
            if (var7.field2482 > 0) {
                arg0.field2533 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2482 * var9) + 0.5D);
            } else {
                arg0.field2533 += 128;
            }
            while (arg0.field2528 < var7.field2474.length - 2 && arg0.field2533 > (var7.field2474[arg0.field2528 + 2] & 0xFF) << 8) {
                arg0.field2528 += 2;
            }
            if (arg0.field2528 == var7.field2474.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2537.method2154(arg0.field2538, this.method3919(arg0), this.method3972(arg0));
            return false;
        }
        arg0.field2537.method2155(arg0.field2538);
        if (arg1 == null) {
            arg0.field2537.method1917(arg3);
        } else {
            arg0.field2537.method1945(arg1, arg2, arg3);
        }
        if (arg0.field2537.method2159()) {
            this.field2518.field2565.method1903(arg0.field2537);
        }
        arg0.method4010();
        if (arg0.field2533 >= 0) {
            arg0.method3782();
            if (arg0.field2523 > 0 && this.field2511[arg0.field2519][arg0.field2523] == arg0) {
                this.field2511[arg0.field2519][arg0.field2523] = null;
            }
        }
        return true;
    }
}
