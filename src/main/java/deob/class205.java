package deob;

@ObfuscatedName("gn")
public class class205 extends class122 {

    @ObfuscatedName("gn.d")
    public class191 field2491 = new class191(128);

    @ObfuscatedName("gn.q")
    public int field2485 = 256;

    @ObfuscatedName("gn.x")
    public int field2486 = 1000000;

    @ObfuscatedName("gn.y")
    public int[] field2488 = new int[16];

    @ObfuscatedName("gn.e")
    public int[] field2490 = new int[16];

    @ObfuscatedName("gn.f")
    public int[] field2489 = new int[16];

    @ObfuscatedName("gn.v")
    public int[] field2497 = new int[16];

    @ObfuscatedName("gn.t")
    public int[] field2509 = new int[16];

    @ObfuscatedName("gn.i")
    public int[] field2492 = new int[16];

    @ObfuscatedName("gn.r")
    public int[] field2505 = new int[16];

    @ObfuscatedName("gn.g")
    public int[] field2494 = new int[16];

    @ObfuscatedName("gn.s")
    public int[] field2495 = new int[16];

    @ObfuscatedName("gn.c")
    public int[] field2514 = new int[16];

    @ObfuscatedName("gn.l")
    public int[] field2498 = new int[16];

    @ObfuscatedName("gn.m")
    public int[] field2513 = new int[16];

    @ObfuscatedName("gn.a")
    public int[] field2500 = new int[16];

    @ObfuscatedName("gn.h")
    public int[] field2501 = new int[16];

    @ObfuscatedName("gn.z")
    public int[] field2502 = new int[16];

    @ObfuscatedName("gn.j")
    public class206[][] field2503 = new class206[16][128];

    @ObfuscatedName("gn.am")
    public class206[][] field2504 = new class206[16][128];

    @ObfuscatedName("gn.ac")
    public class207 field2493 = new class207();

    @ObfuscatedName("gn.ax")
    public boolean field2506;

    @ObfuscatedName("gn.at")
    public int field2507;

    @ObfuscatedName("gn.ag")
    public int field2508;

    @ObfuscatedName("gn.ar")
    public long field2487;

    @ObfuscatedName("gn.ae")
    public long field2484;

    @ObfuscatedName("gn.ai")
    public class209 field2511 = new class209(this);

    public class205() {
        this.method3427();
    }

    @ObfuscatedName("gn.d(II)V")
    public synchronized void method3410(int arg0) {
        this.field2485 = arg0;
    }

    @ObfuscatedName("gn.q(I)I")
    public int method3475() {
        return this.field2485;
    }

    @ObfuscatedName("gn.x(Lhb;Lim;Ldp;II)Z")
    public synchronized boolean method3414(class210 arg0, class236 arg1, class115 arg2, int arg3) {
        arg0.method3578();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class200 var7 = (class200) arg0.field2576.method3265(); var7 != null; var7 = (class200) arg0.field2576.method3266()) {
            int var8 = (int) var7.field2441;
            class208 var9 = (class208) this.field2491.method3263((long) var8);
            if (var9 == null) {
                var9 = class208.method2719(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2491.method3269(var9, (long) var8);
            }
            if (!var9.method3563(arg2, var7.field2455, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3579();
        }
        return var5;
    }

    @ObfuscatedName("gn.y(B)V")
    public synchronized void method3412() {
        for (class208 var1 = (class208) this.field2491.method3265(); var1 != null; var1 = (class208) this.field2491.method3266()) {
            var1.method3564();
        }
    }

    @ObfuscatedName("gn.e(I)V")
    public synchronized void method3426() {
        for (class208 var1 = (class208) this.field2491.method3265(); var1 != null; var1 = (class208) this.field2491.method3266()) {
            var1.method3312();
        }
    }

    @ObfuscatedName("gn.r(Lhb;ZI)V")
    public synchronized void method3459(class210 arg0, boolean arg1) {
        this.method3499();
        this.field2493.method3516(arg0.field2577);
        this.field2506 = arg1;
        this.field2487 = 0L;
        int var3 = this.field2493.method3519();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2493.method3520(var4);
            this.field2493.method3539(var4);
            this.field2493.method3521(var4);
        }
        this.field2507 = this.field2493.method3528();
        this.field2508 = this.field2493.field2551[this.field2507];
        this.field2484 = this.field2493.method3527(this.field2508);
    }

    @ObfuscatedName("gn.s(I)V")
    public synchronized void method3499() {
        this.field2493.method3551();
        this.method3427();
    }

    @ObfuscatedName("gn.o(I)Z")
    public synchronized boolean method3415() {
        return this.field2493.method3549();
    }

    @ObfuscatedName("gn.p(III)V")
    public synchronized void method3492(int arg0, int arg1) {
        this.method3470(arg0, arg1);
    }

    @ObfuscatedName("gn.u(III)V")
    public void method3470(int arg0, int arg1) {
        this.field2497[arg0] = arg1;
        this.field2492[arg0] = arg1 & 0xFFFFFF80;
        this.method3417(arg0, arg1);
    }

    @ObfuscatedName("gn.b(IIB)V")
    public void method3417(int arg0, int arg1) {
        if (this.field2509[arg0] != arg1) {
            this.field2509[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2504[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gn.w(IIII)V")
    public void method3425(int arg0, int arg1, int arg2) {
        this.method3496(arg0, arg1, 64);
        if ((this.field2514[arg0] & 0x2) != 0) {
            for (class206 var4 = (class206) this.field2511.field2569.method3337(); var4 != null; var4 = (class206) this.field2511.field2569.method3326()) {
                if (var4.field2534 == arg0 && var4.field2529 < 0) {
                    this.field2503[arg0][var4.field2520] = null;
                    this.field2503[arg0][arg1] = var4;
                    int var5 = (var4.field2525 * var4.field2524 >> 12) + var4.field2535;
                    var4.field2535 += arg1 - var4.field2520 << 8;
                    var4.field2524 = var5 - var4.field2535;
                    var4.field2525 = 4096;
                    var4.field2520 = arg1;
                    return;
                }
            }
        }
        class208 var6 = (class208) this.field2491.method3263((long) this.field2509[arg0]);
        if (var6 == null) {
            return;
        }
        class110 var7 = var6.field2553[arg1];
        if (var7 == null) {
            return;
        }
        class206 var8 = new class206();
        var8.field2534 = arg0;
        var8.field2516 = var6;
        var8.field2517 = var7;
        var8.field2521 = var6.field2557[arg1];
        var8.field2519 = var6.field2558[arg1];
        var8.field2520 = arg1;
        var8.field2515 = var6.field2567 * arg2 * arg2 * var6.field2564[arg1] + 1024 >> 11;
        var8.field2522 = var6.field2561[arg1] & 0xFF;
        var8.field2535 = (arg1 << 8) - (var6.field2554[arg1] & 0x7FFF);
        var8.field2526 = 0;
        var8.field2527 = 0;
        var8.field2518 = 0;
        var8.field2529 = -1;
        var8.field2530 = 0;
        if (this.field2500[arg0] == 0) {
            var8.field2533 = class120.method2005(var7, this.method3432(var8), this.method3433(var8), this.method3434(var8));
        } else {
            var8.field2533 = class120.method2005(var7, this.method3432(var8), 0, this.method3434(var8));
            this.method3419(var8, var6.field2554[arg1] < 0);
        }
        if (var6.field2554[arg1] < 0) {
            var8.field2533.method2007(-1);
        }
        if (var8.field2519 >= 0) {
            class206 var9 = this.field2504[arg0][var8.field2519];
            if (var9 != null && var9.field2529 < 0) {
                this.field2503[arg0][var9.field2520] = null;
                var9.field2529 = 0;
            }
            this.field2504[arg0][var8.field2519] = var8;
        }
        this.field2511.field2569.method3318(var8);
        this.field2503[arg0][arg1] = var8;
    }

    @ObfuscatedName("gn.k(Lgd;ZI)V")
    public void method3419(class206 arg0, boolean arg1) {
        int var3 = arg0.field2517.field1599.length;
        int var5;
        if (arg1 && arg0.field2517.field1602) {
            int var4 = var3 + var3 - arg0.field2517.field1598;
            var5 = (int) ((long) this.field2500[arg0.field2534] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2533.method2014(true);
            }
        } else {
            var5 = (int) ((long) this.field2500[arg0.field2534] * (long) var3 >> 6);
        }
        arg0.field2533.method2013(var5);
    }

    @ObfuscatedName("gn.c(IIII)V")
    public void method3496(int arg0, int arg1, int arg2) {
        class206 var4 = this.field2503[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2503[arg0][arg1] = null;
        if ((this.field2514[arg0] & 0x2) == 0) {
            var4.field2529 = 0;
            return;
        }
        for (class206 var5 = (class206) this.field2511.field2569.method3323(); var5 != null; var5 = (class206) this.field2511.field2569.method3325()) {
            if (var4.field2534 == var5.field2534 && var5.field2529 < 0 && var4 != var5) {
                var4.field2529 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gn.h(IIII)V")
    public void method3421(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gn.z(III)V")
    public void method3452(int arg0, int arg1) {
    }

    @ObfuscatedName("gn.j(III)V")
    public void method3423(int arg0, int arg1) {
        this.field2505[arg0] = arg1;
    }

    @ObfuscatedName("gn.am(II)V")
    public void method3424(int arg0) {
        for (class206 var2 = (class206) this.field2511.field2569.method3323(); var2 != null; var2 = (class206) this.field2511.field2569.method3325()) {
            if (arg0 < 0 || var2.field2534 == arg0) {
                if (var2.field2533 != null) {
                    var2.field2533.method2039(Statics.field1634 / 100);
                    if (var2.field2533.method2021()) {
                        this.field2511.field2570.method1774(var2.field2533);
                    }
                    var2.method3513();
                }
                if (var2.field2529 < 0) {
                    this.field2503[var2.field2534][var2.field2520] = null;
                }
                var2.method3312();
            }
        }
    }

    @ObfuscatedName("gn.ac(II)V")
    public void method3422(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3422(var2);
            }
            return;
        }
        this.field2488[arg0] = 12800;
        this.field2490[arg0] = 8192;
        this.field2489[arg0] = 16383;
        this.field2505[arg0] = 8192;
        this.field2494[arg0] = 0;
        this.field2495[arg0] = 8192;
        this.method3428(arg0);
        this.method3429(arg0);
        this.field2514[arg0] = 0;
        this.field2498[arg0] = 32767;
        this.field2513[arg0] = 256;
        this.field2500[arg0] = 0;
        this.method3431(arg0, 8192);
    }

    @ObfuscatedName("gn.ax(IB)V")
    public void method3494(int arg0) {
        for (class206 var2 = (class206) this.field2511.field2569.method3323(); var2 != null; var2 = (class206) this.field2511.field2569.method3325()) {
            if ((arg0 < 0 || var2.field2534 == arg0) && var2.field2529 < 0) {
                this.field2503[var2.field2534][var2.field2520] = null;
                var2.field2529 = 0;
            }
        }
    }

    @ObfuscatedName("gn.at(I)V")
    public void method3427() {
        this.method3424(-1);
        this.method3422(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2509[var1] = this.field2497[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2492[var2] = this.field2497[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gn.ag(IB)V")
    public void method3428(int arg0) {
        if ((this.field2514[arg0] & 0x2) == 0) {
            return;
        }
        for (class206 var2 = (class206) this.field2511.field2569.method3323(); var2 != null; var2 = (class206) this.field2511.field2569.method3325()) {
            if (var2.field2534 == arg0 && this.field2503[arg0][var2.field2520] == null && var2.field2529 < 0) {
                var2.field2529 = 0;
            }
        }
    }

    @ObfuscatedName("gn.ak(II)V")
    public void method3429(int arg0) {
        if ((this.field2514[arg0] & 0x4) == 0) {
            return;
        }
        for (class206 var2 = (class206) this.field2511.field2569.method3323(); var2 != null; var2 = (class206) this.field2511.field2569.method3325()) {
            if (var2.field2534 == arg0) {
                var2.field2528 = 0;
            }
        }
    }

    @ObfuscatedName("gn.as(II)V")
    public void method3430(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3496(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3425(var6, var7, var8);
            } else {
                this.method3496(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3421(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2492[var12] = (var14 << 14) + (this.field2492[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2492[var12] = (var14 << 7) + (this.field2492[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2494[var12] = (var14 << 7) + (this.field2494[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2494[var12] = (this.field2494[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2495[var12] = (var14 << 7) + (this.field2495[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2495[var12] = (this.field2495[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2488[var12] = (var14 << 7) + (this.field2488[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2488[var12] = (this.field2488[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2490[var12] = (var14 << 7) + (this.field2490[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2490[var12] = (this.field2490[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2489[var12] = (var14 << 7) + (this.field2489[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2489[var12] = (this.field2489[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2514[var12] |= 0x1;
                } else {
                    this.field2514[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2514[var12] |= 0x2;
                } else {
                    this.method3428(var12);
                    this.field2514[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2498[var12] = (var14 << 7) + (this.field2498[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2498[var12] = (this.field2498[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2498[var12] = (var14 << 7) + (this.field2498[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2498[var12] = (this.field2498[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3424(var12);
            }
            if (var13 == 121) {
                this.method3422(var12);
            }
            if (var13 == 123) {
                this.method3494(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2498[var12];
                if (var15 == 16384) {
                    this.field2513[var12] = (var14 << 7) + (this.field2513[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2498[var12];
                if (var16 == 16384) {
                    this.field2513[var12] = (this.field2513[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2500[var12] = (var14 << 7) + (this.field2500[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2500[var12] = (this.field2500[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2514[var12] |= 0x4;
                } else {
                    this.method3429(var12);
                    this.field2514[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3431(var12, (var14 << 7) + (this.field2501[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3431(var12, (this.field2501[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3417(var17, this.field2492[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3452(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3423(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3427();
            }
        }
    }

    @ObfuscatedName("gn.ap(III)V")
    public void method3431(int arg0, int arg1) {
        this.field2501[arg0] = arg1;
        this.field2502[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gn.aj(Lgd;I)I")
    public int method3432(class206 arg0) {
        int var2 = (arg0.field2525 * arg0.field2524 >> 12) + arg0.field2535;
        int var3 = ((this.field2505[arg0.field2534] - 8192) * this.field2513[arg0.field2534] >> 12) + var2;
        class203 var4 = arg0.field2521;
        if (var4.field2467 > 0 && (var4.field2466 > 0 || this.field2494[arg0.field2534] > 0)) {
            int var5 = var4.field2466 << 2;
            int var6 = var4.field2461 << 1;
            if (arg0.field2531 < var6) {
                var5 = arg0.field2531 * var5 / var6;
            }
            int var7 = (this.field2494[arg0.field2534] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2532 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2517.field1600 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1634 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gn.bz(Lgd;I)I")
    public int method3433(class206 arg0) {
        class203 var2 = arg0.field2521;
        int var3 = this.field2488[arg0.field2534] * this.field2489[arg0.field2534] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2515 * var4 + 16384 >> 15;
        int var6 = this.field2485 * var5 + 128 >> 8;
        if (var2.field2462 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2526 * 1.953125E-5D * (double) var2.field2462) + 0.5D);
        }
        if (var2.field2463 != null) {
            int var7 = arg0.field2527;
            int var8 = var2.field2463[arg0.field2518 + 1];
            if (arg0.field2518 < var2.field2463.length - 2) {
                int var9 = (var2.field2463[arg0.field2518] & 0xFF) << 8;
                int var10 = (var2.field2463[arg0.field2518 + 2] & 0xFF) << 8;
                var8 += (var2.field2463[arg0.field2518 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2529 > 0 && var2.field2460 != null) {
            int var11 = arg0.field2529;
            int var12 = var2.field2460[arg0.field2530 + 1];
            if (arg0.field2530 < var2.field2460.length - 2) {
                int var13 = (var2.field2460[arg0.field2530] & 0xFF) << 8;
                int var14 = (var2.field2460[arg0.field2530 + 2] & 0xFF) << 8;
                var12 += (var2.field2460[arg0.field2530 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gn.bu(Lgd;B)I")
    public int method3434(class206 arg0) {
        int var2 = this.field2490[arg0.field2534];
        return var2 < 8192 ? arg0.field2522 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2522) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gn.f()Ldz;")
    public synchronized class122 method1779() {
        return this.field2511;
    }

    @ObfuscatedName("gn.v()Ldz;")
    public synchronized class122 method1780() {
        return null;
    }

    @ObfuscatedName("gn.t()I")
    public synchronized int method1781() {
        return 0;
    }

    @ObfuscatedName("gn.i([III)V")
    public synchronized void method1782(int[] arg0, int arg1, int arg2) {
        if (this.field2493.method3549()) {
            int var4 = this.field2486 * this.field2493.field2539 / Statics.field1634;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2487;
                if (this.field2484 - var5 >= 0L) {
                    this.field2487 = var5;
                    break;
                }
                int var7 = (int) ((this.field2484 - this.field2487 + (long) var4 - 1L) / (long) var4);
                this.field2487 += (long) var4 * (long) var7;
                this.field2511.method1782(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3437();
            } while (this.field2493.method3549());
        }
        this.field2511.method1782(arg0, arg1, arg2);
    }

    @ObfuscatedName("gn.g(I)V")
    public synchronized void method1778(int arg0) {
        if (this.field2493.method3549()) {
            int var2 = this.field2486 * this.field2493.field2539 / Statics.field1634;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2487;
                if (this.field2484 - var3 >= 0L) {
                    this.field2487 = var3;
                    break;
                }
                int var5 = (int) ((this.field2484 - this.field2487 + (long) var2 - 1L) / (long) var2);
                this.field2487 += (long) var2 * (long) var5;
                this.field2511.method1778(var5);
                arg0 -= var5;
                this.method3437();
            } while (this.field2493.method3549());
        }
        this.field2511.method1778(arg0);
    }

    @ObfuscatedName("gn.bq(S)V")
    public void method3437() {
        int var1 = this.field2507;
        int var2 = this.field2508;
        long var3 = this.field2484;
        while (this.field2508 == var2) {
            while (this.field2493.field2551[var1] == var2) {
                this.field2493.method3520(var1);
                int var5 = this.field2493.method3515(var1);
                if (var5 == 1) {
                    this.field2493.method3522();
                    this.field2493.method3521(var1);
                    if (this.field2493.method3529()) {
                        if (!this.field2506 || var2 == 0) {
                            this.method3427();
                            this.field2493.method3551();
                            return;
                        }
                        this.field2493.method3530(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3430(var5);
                }
                this.field2493.method3539(var1);
                this.field2493.method3521(var1);
            }
            var1 = this.field2493.method3528();
            var2 = this.field2493.field2551[var1];
            var3 = this.field2493.method3527(var2);
        }
        this.field2507 = var1;
        this.field2508 = var2;
        this.field2484 = var3;
    }

    @ObfuscatedName("gn.bs(Lgd;B)Z")
    public boolean method3508(class206 arg0) {
        if (arg0.field2533 != null) {
            return false;
        }
        if (arg0.field2529 >= 0) {
            arg0.method3312();
            if (arg0.field2519 > 0 && this.field2504[arg0.field2534][arg0.field2519] == arg0) {
                this.field2504[arg0.field2534][arg0.field2519] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gn.bv(Lgd;[IIII)Z")
    public boolean method3436(class206 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2523 = Statics.field1634 / 100;
        if (arg0.field2529 >= 0 && arg0.field2533 == null || arg0.field2533.method2020()) {
            arg0.method3513();
            arg0.method3312();
            if (arg0.field2519 > 0 && this.field2504[arg0.field2534][arg0.field2519] == arg0) {
                this.field2504[arg0.field2534][arg0.field2519] = null;
            }
            return true;
        }
        int var5 = arg0.field2525;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2495[arg0.field2534] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2525 = var6;
        }
        arg0.field2533.method2015(this.method3432(arg0));
        class203 var7 = arg0.field2521;
        boolean var8 = false;
        arg0.field2531++;
        arg0.field2532 += var7.field2467;
        double var9 = (double) ((arg0.field2520 - 60 << 8) + (arg0.field2525 * arg0.field2524 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2462 > 0) {
            if (var7.field2465 > 0) {
                arg0.field2526 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2465 * var9) + 0.5D);
            } else {
                arg0.field2526 += 128;
            }
        }
        if (var7.field2463 != null) {
            if (var7.field2468 > 0) {
                arg0.field2527 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2468 * var9) + 0.5D);
            } else {
                arg0.field2527 += 128;
            }
            while (arg0.field2518 < var7.field2463.length - 2 && arg0.field2527 > (var7.field2463[arg0.field2518 + 2] & 0xFF) << 8) {
                arg0.field2518 += 2;
            }
            if (arg0.field2518 == var7.field2463.length - 2 && var7.field2463[arg0.field2518 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2529 >= 0 && var7.field2460 != null && (this.field2514[arg0.field2534] & 0x1) == 0 && (arg0.field2519 < 0 || this.field2504[arg0.field2534][arg0.field2519] != arg0)) {
            if (var7.field2464 > 0) {
                arg0.field2529 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2464 * var9) + 0.5D);
            } else {
                arg0.field2529 += 128;
            }
            while (arg0.field2530 < var7.field2460.length - 2 && arg0.field2529 > (var7.field2460[arg0.field2530 + 2] & 0xFF) << 8) {
                arg0.field2530 += 2;
            }
            if (arg0.field2530 == var7.field2460.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2533.method2059(arg0.field2523, this.method3433(arg0), this.method3434(arg0));
            return false;
        }
        arg0.field2533.method2039(arg0.field2523);
        if (arg1 == null) {
            arg0.field2533.method1778(arg3);
        } else {
            arg0.field2533.method1782(arg1, arg2, arg3);
        }
        if (arg0.field2533.method2021()) {
            this.field2511.field2570.method1774(arg0.field2533);
        }
        arg0.method3513();
        if (arg0.field2529 >= 0) {
            arg0.method3312();
            if (arg0.field2519 > 0 && this.field2504[arg0.field2534][arg0.field2519] == arg0) {
                this.field2504[arg0.field2534][arg0.field2519] = null;
            }
        }
        return true;
    }
}
