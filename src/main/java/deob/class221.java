package deob;

@ObfuscatedName("hz")
public class class221 extends class108 {

    @ObfuscatedName("hz.v")
    public class205 field2513 = new class205(128);

    @ObfuscatedName("hz.s")
    public int field2519 = 256;

    @ObfuscatedName("hz.o")
    public int field2507 = 1000000;

    @ObfuscatedName("hz.k")
    public int[] field2506 = new int[16];

    @ObfuscatedName("hz.u")
    public int[] field2518 = new int[16];

    @ObfuscatedName("hz.i")
    public int[] field2510 = new int[16];

    @ObfuscatedName("hz.t")
    public int[] field2511 = new int[16];

    @ObfuscatedName("hz.p")
    public int[] field2512 = new int[16];

    @ObfuscatedName("hz.l")
    public int[] field2505 = new int[16];

    @ObfuscatedName("hz.b")
    public int[] field2514 = new int[16];

    @ObfuscatedName("hz.c")
    public int[] field2515 = new int[16];

    @ObfuscatedName("hz.d")
    public int[] field2508 = new int[16];

    @ObfuscatedName("hz.m")
    public int[] field2517 = new int[16];

    @ObfuscatedName("hz.h")
    public int[] field2521 = new int[16];

    @ObfuscatedName("hz.x")
    public int[] field2509 = new int[16];

    @ObfuscatedName("hz.f")
    public int[] field2520 = new int[16];

    @ObfuscatedName("hz.r")
    public int[] field2524 = new int[16];

    @ObfuscatedName("hz.n")
    public int[] field2526 = new int[16];

    @ObfuscatedName("hz.g")
    public class222[][] field2523 = new class222[16][128];

    @ObfuscatedName("hz.ac")
    public class222[][] field2516 = new class222[16][128];

    @ObfuscatedName("hz.ab")
    public class223 field2525 = new class223();

    @ObfuscatedName("hz.ao")
    public boolean field2522;

    @ObfuscatedName("hz.an")
    public int field2527;

    @ObfuscatedName("hz.ay")
    public int field2528;

    @ObfuscatedName("hz.av")
    public long field2529;

    @ObfuscatedName("hz.af")
    public long field2530;

    @ObfuscatedName("hz.ar")
    public class225 field2531 = new class225(this);

    public class221() {
        this.method3922();
    }

    @ObfuscatedName("hz.v(IB)V")
    public synchronized void method3926(int arg0) {
        this.field2519 = arg0;
    }

    @ObfuscatedName("hz.s(S)I")
    public int method3970() {
        return this.field2519;
    }

    @ObfuscatedName("hz.o(Lhd;Lis;Lcc;II)Z")
    public synchronized boolean method3984(class226 arg0, class250 arg1, class101 arg2, int arg3) {
        arg0.method4089();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class216 var7 = (class216) arg0.field2585.method3741(); var7 != null; var7 = (class216) arg0.field2585.method3734()) {
            int var8 = (int) var7.field2464;
            class224 var9 = (class224) this.field2513.method3735((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method4349(var8);
                class224 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class224(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2513.method3733(var11, (long) var8);
            }
            if (!var9.method4068(arg2, var7.field2482, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method4088();
        }
        return var5;
    }

    @ObfuscatedName("hz.k(I)V")
    public synchronized void method3906() {
        for (class224 var1 = (class224) this.field2513.method3741(); var1 != null; var1 = (class224) this.field2513.method3734()) {
            var1.method4069();
        }
    }

    @ObfuscatedName("hz.u(I)V")
    public synchronized void method3907() {
        for (class224 var1 = (class224) this.field2513.method3741(); var1 != null; var1 = (class224) this.field2513.method3734()) {
            var1.method3787();
        }
    }

    @ObfuscatedName("hz.a(Lhd;ZI)V")
    public synchronized void method3902(class226 arg0, boolean arg1) {
        this.method3946();
        this.field2525.method4017(arg0.field2586);
        this.field2522 = arg1;
        this.field2529 = 0L;
        int var3 = this.field2525.method4019();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2525.method4020(var4);
            this.field2525.method4023(var4);
            this.field2525.method4014(var4);
        }
        this.field2527 = this.field2525.method4028();
        this.field2528 = this.field2525.field2558[this.field2527];
        this.field2530 = this.field2525.method4027(this.field2528);
    }

    @ObfuscatedName("hz.e(I)V")
    public synchronized void method3946() {
        this.field2525.method4048();
        this.method3922();
    }

    @ObfuscatedName("hz.q(I)Z")
    public synchronized boolean method3994() {
        return this.field2525.method4018();
    }

    @ObfuscatedName("hz.j(III)V")
    public synchronized void method3910(int arg0, int arg1) {
        this.method3911(arg0, arg1);
    }

    @ObfuscatedName("hz.y(IIB)V")
    public void method3911(int arg0, int arg1) {
        this.field2511[arg0] = arg1;
        this.field2505[arg0] = arg1 & 0xFFFFFF80;
        this.method4000(arg0, arg1);
    }

    @ObfuscatedName("hz.m(III)V")
    public void method4000(int arg0, int arg1) {
        if (this.field2512[arg0] != arg1) {
            this.field2512[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2516[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("hz.h(IIIB)V")
    public void method3918(int arg0, int arg1, int arg2) {
        this.method3915(arg0, arg1, 64);
        if ((this.field2517[arg0] & 0x2) != 0) {
            for (class222 var4 = (class222) this.field2531.field2582.method3799(); var4 != null; var4 = (class222) this.field2531.field2582.method3801()) {
                if (var4.field2534 == arg0 && var4.field2547 < 0) {
                    this.field2523[arg0][var4.field2533] = null;
                    this.field2523[arg0][arg1] = var4;
                    int var5 = (var4.field2549 * var4.field2546 >> 12) + var4.field2541;
                    var4.field2541 += arg1 - var4.field2533 << 8;
                    var4.field2546 = var5 - var4.field2541;
                    var4.field2549 = 4096;
                    var4.field2533 = arg1;
                    return;
                }
            }
        }
        class224 var6 = (class224) this.field2513.method3735((long) this.field2512[arg0]);
        if (var6 == null) {
            return;
        }
        class96 var7 = var6.field2569[arg1];
        if (var7 == null) {
            return;
        }
        class222 var8 = new class222();
        var8.field2534 = arg0;
        var8.field2543 = var6;
        var8.field2535 = var7;
        var8.field2537 = var6.field2573[arg1];
        var8.field2542 = var6.field2574[arg1];
        var8.field2533 = arg1;
        var8.field2539 = var6.field2576 * arg2 * arg2 * var6.field2571[arg1] + 1024 >> 11;
        var8.field2540 = var6.field2568[arg1] & 0xFF;
        var8.field2541 = (arg1 << 8) - (var6.field2570[arg1] & 0x7FFF);
        var8.field2544 = 0;
        var8.field2545 = 0;
        var8.field2536 = 0;
        var8.field2547 = -1;
        var8.field2548 = 0;
        if (this.field2520[arg0] == 0) {
            var8.field2551 = class106.method2139(var7, this.method3913(var8), this.method3928(var8), this.method3929(var8));
        } else {
            var8.field2551 = class106.method2139(var7, this.method3913(var8), 0, this.method3929(var8));
            this.method3914(var8, var6.field2570[arg1] < 0);
        }
        if (var6.field2570[arg1] < 0) {
            var8.field2551.method2268(-1);
        }
        if (var8.field2542 >= 0) {
            class222 var9 = this.field2516[arg0][var8.field2542];
            if (var9 != null && var9.field2547 < 0) {
                this.field2523[arg0][var9.field2533] = null;
                var9.field2547 = 0;
            }
            this.field2516[arg0][var8.field2542] = var8;
        }
        this.field2531.field2582.method3793(var8);
        this.field2523[arg0][arg1] = var8;
    }

    @ObfuscatedName("hz.x(Lhe;ZI)V")
    public void method3914(class222 arg0, boolean arg1) {
        int var3 = arg0.field2535.field1330.length;
        int var5;
        if (arg1 && arg0.field2535.field1331) {
            int var4 = var3 + var3 - arg0.field2535.field1329;
            var5 = (int) ((long) this.field2520[arg0.field2534] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2551.method2257(true);
            }
        } else {
            var5 = (int) ((long) this.field2520[arg0.field2534] * (long) var3 >> 6);
        }
        arg0.field2551.method2147(var5);
    }

    @ObfuscatedName("hz.f(IIII)V")
    public void method3915(int arg0, int arg1, int arg2) {
        class222 var4 = this.field2523[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2523[arg0][arg1] = null;
        if ((this.field2517[arg0] & 0x2) == 0) {
            var4.field2547 = 0;
            return;
        }
        for (class222 var5 = (class222) this.field2531.field2582.method3792(); var5 != null; var5 = (class222) this.field2531.field2582.method3800()) {
            if (var4.field2534 == var5.field2534 && var5.field2547 < 0 && var4 != var5) {
                var4.field2547 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("hz.r(IIII)V")
    public void method3992(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("hz.n(III)V")
    public void method3917(int arg0, int arg1) {
    }

    @ObfuscatedName("hz.g(III)V")
    public void method3916(int arg0, int arg1) {
        this.field2514[arg0] = arg1;
    }

    @ObfuscatedName("hz.ab(II)V")
    public void method3919(int arg0) {
        for (class222 var2 = (class222) this.field2531.field2582.method3792(); var2 != null; var2 = (class222) this.field2531.field2582.method3800()) {
            if (arg0 < 0 || var2.field2534 == arg0) {
                if (var2.field2551 != null) {
                    var2.field2551.method2253(Statics.field66 / 100);
                    if (var2.field2551.method2155()) {
                        this.field2531.field2579.method1894(var2.field2551);
                    }
                    var2.method4009();
                }
                if (var2.field2547 < 0) {
                    this.field2523[var2.field2534][var2.field2533] = null;
                }
                var2.method3787();
            }
        }
    }

    @ObfuscatedName("hz.ao(II)V")
    public void method3920(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3920(var2);
            }
            return;
        }
        this.field2506[arg0] = 12800;
        this.field2518[arg0] = 8192;
        this.field2510[arg0] = 16383;
        this.field2514[arg0] = 8192;
        this.field2515[arg0] = 0;
        this.field2508[arg0] = 8192;
        this.method3951(arg0);
        this.method3935(arg0);
        this.field2517[arg0] = 0;
        this.field2521[arg0] = 32767;
        this.field2509[arg0] = 256;
        this.field2520[arg0] = 0;
        this.method3938(arg0, 8192);
    }

    @ObfuscatedName("hz.an(II)V")
    public void method3921(int arg0) {
        for (class222 var2 = (class222) this.field2531.field2582.method3792(); var2 != null; var2 = (class222) this.field2531.field2582.method3800()) {
            if ((arg0 < 0 || var2.field2534 == arg0) && var2.field2547 < 0) {
                this.field2523[var2.field2534][var2.field2533] = null;
                var2.field2547 = 0;
            }
        }
    }

    @ObfuscatedName("hz.ay(I)V")
    public void method3922() {
        this.method3919(-1);
        this.method3920(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2512[var1] = this.field2511[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2505[var2] = this.field2511[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("hz.ae(II)V")
    public void method3951(int arg0) {
        if ((this.field2517[arg0] & 0x2) == 0) {
            return;
        }
        for (class222 var2 = (class222) this.field2531.field2582.method3792(); var2 != null; var2 = (class222) this.field2531.field2582.method3800()) {
            if (var2.field2534 == arg0 && this.field2523[arg0][var2.field2533] == null && var2.field2547 < 0) {
                var2.field2547 = 0;
            }
        }
    }

    @ObfuscatedName("hz.ap(II)V")
    public void method3935(int arg0) {
        if ((this.field2517[arg0] & 0x4) == 0) {
            return;
        }
        for (class222 var2 = (class222) this.field2531.field2582.method3792(); var2 != null; var2 = (class222) this.field2531.field2582.method3800()) {
            if (var2.field2534 == arg0) {
                var2.field2553 = 0;
            }
        }
    }

    @ObfuscatedName("hz.ai(II)V")
    public void method3927(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3915(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3918(var6, var7, var8);
            } else {
                this.method3915(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3992(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2505[var12] = (var14 << 14) + (this.field2505[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2505[var12] = (var14 << 7) + (this.field2505[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2515[var12] = (var14 << 7) + (this.field2515[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2515[var12] = (this.field2515[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2508[var12] = (var14 << 7) + (this.field2508[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2508[var12] = (this.field2508[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2506[var12] = (var14 << 7) + (this.field2506[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2506[var12] = (this.field2506[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2518[var12] = (var14 << 7) + (this.field2518[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2518[var12] = (this.field2518[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2510[var12] = (var14 << 7) + (this.field2510[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2510[var12] = (this.field2510[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2517[var12] |= 0x1;
                } else {
                    this.field2517[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2517[var12] |= 0x2;
                } else {
                    this.method3951(var12);
                    this.field2517[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2521[var12] = (var14 << 7) + (this.field2521[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2521[var12] = (this.field2521[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2521[var12] = (var14 << 7) + (this.field2521[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2521[var12] = (this.field2521[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3919(var12);
            }
            if (var13 == 121) {
                this.method3920(var12);
            }
            if (var13 == 123) {
                this.method3921(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2521[var12];
                if (var15 == 16384) {
                    this.field2509[var12] = (var14 << 7) + (this.field2509[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2521[var12];
                if (var16 == 16384) {
                    this.field2509[var12] = (this.field2509[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2520[var12] = (var14 << 7) + (this.field2520[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2520[var12] = (this.field2520[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2517[var12] |= 0x4;
                } else {
                    this.method3935(var12);
                    this.field2517[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3938(var12, (var14 << 7) + (this.field2524[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3938(var12, (this.field2524[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method4000(var17, this.field2505[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3917(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3916(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3922();
            }
        }
    }

    @ObfuscatedName("hz.aa(III)V")
    public void method3938(int arg0, int arg1) {
        this.field2524[arg0] = arg1;
        this.field2526[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("hz.bg(Lhe;B)I")
    public int method3913(class222 arg0) {
        int var2 = (arg0.field2549 * arg0.field2546 >> 12) + arg0.field2541;
        int var3 = ((this.field2514[arg0.field2534] - 8192) * this.field2509[arg0.field2534] >> 12) + var2;
        class219 var4 = arg0.field2537;
        if (var4.field2495 > 0 && (var4.field2488 > 0 || this.field2515[arg0.field2534] > 0)) {
            int var5 = var4.field2488 << 2;
            int var6 = var4.field2492 << 1;
            if (arg0.field2538 < var6) {
                var5 = arg0.field2538 * var5 / var6;
            }
            int var7 = (this.field2515[arg0.field2534] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2550 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2535.field1327 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field66 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("hz.ba(Lhe;I)I")
    public int method3928(class222 arg0) {
        class219 var2 = arg0.field2537;
        int var3 = this.field2510[arg0.field2534] * this.field2506[arg0.field2534] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2539 * var4 + 16384 >> 15;
        int var6 = this.field2519 * var5 + 128 >> 8;
        if (var2.field2490 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2544 * 1.953125E-5D * (double) var2.field2490) + 0.5D);
        }
        if (var2.field2494 != null) {
            int var7 = arg0.field2545;
            int var8 = var2.field2494[arg0.field2536 + 1];
            if (arg0.field2536 < var2.field2494.length - 2) {
                int var9 = (var2.field2494[arg0.field2536] & 0xFF) << 8;
                int var10 = (var2.field2494[arg0.field2536 + 2] & 0xFF) << 8;
                var8 += (var2.field2494[arg0.field2536 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2547 > 0 && var2.field2489 != null) {
            int var11 = arg0.field2547;
            int var12 = var2.field2489[arg0.field2548 + 1];
            if (arg0.field2548 < var2.field2489.length - 2) {
                int var13 = (var2.field2489[arg0.field2548] & 0xFF) << 8;
                int var14 = (var2.field2489[arg0.field2548 + 2] & 0xFF) << 8;
                var12 += (var2.field2489[arg0.field2548 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("hz.bw(Lhe;I)I")
    public int method3929(class222 arg0) {
        int var2 = this.field2518[arg0.field2534];
        return var2 < 8192 ? arg0.field2540 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2540) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("hz.i()Ldm;")
    public synchronized class108 method1899() {
        return this.field2531;
    }

    @ObfuscatedName("hz.t()Ldm;")
    public synchronized class108 method1900() {
        return null;
    }

    @ObfuscatedName("hz.c()I")
    public synchronized int method1901() {
        return 0;
    }

    @ObfuscatedName("hz.w([III)V")
    public synchronized void method1933(int[] arg0, int arg1, int arg2) {
        if (this.field2525.method4018()) {
            int var4 = this.field2507 * this.field2525.field2560 / Statics.field66;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2529;
                if (this.field2530 - var5 >= 0L) {
                    this.field2529 = var5;
                    break;
                }
                int var7 = (int) ((this.field2530 - this.field2529 + (long) var4 - 1L) / (long) var4);
                this.field2529 += (long) var4 * (long) var7;
                this.field2531.method1933(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3930();
            } while (this.field2525.method4018());
        }
        this.field2531.method1933(arg0, arg1, arg2);
    }

    @ObfuscatedName("hz.z(I)V")
    public synchronized void method1904(int arg0) {
        if (this.field2525.method4018()) {
            int var2 = this.field2507 * this.field2525.field2560 / Statics.field66;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2529;
                if (this.field2530 - var3 >= 0L) {
                    this.field2529 = var3;
                    break;
                }
                int var5 = (int) ((this.field2530 - this.field2529 + (long) var2 - 1L) / (long) var2);
                this.field2529 += (long) var2 * (long) var5;
                this.field2531.method1904(var5);
                arg0 -= var5;
                this.method3930();
            } while (this.field2525.method4018());
        }
        this.field2531.method1904(arg0);
    }

    @ObfuscatedName("hz.bh(I)V")
    public void method3930() {
        int var1 = this.field2527;
        int var2 = this.field2528;
        long var3 = this.field2530;
        while (this.field2528 == var2) {
            while (this.field2525.field2558[var1] == var2) {
                this.field2525.method4020(var1);
                int var5 = this.field2525.method4024(var1);
                if (var5 == 1) {
                    this.field2525.method4022();
                    this.field2525.method4014(var1);
                    if (this.field2525.method4059()) {
                        if (!this.field2522 || var2 == 0) {
                            this.method3922();
                            this.field2525.method4048();
                            return;
                        }
                        this.field2525.method4029(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3927(var5);
                }
                this.field2525.method4023(var1);
                this.field2525.method4014(var1);
            }
            var1 = this.field2525.method4028();
            var2 = this.field2525.field2558[var1];
            var3 = this.field2525.method4027(var2);
        }
        this.field2527 = var1;
        this.field2528 = var2;
        this.field2530 = var3;
    }

    @ObfuscatedName("hz.bk(Lhe;I)Z")
    public boolean method3931(class222 arg0) {
        if (arg0.field2551 != null) {
            return false;
        }
        if (arg0.field2547 >= 0) {
            arg0.method3787();
            if (arg0.field2542 > 0 && this.field2516[arg0.field2534][arg0.field2542] == arg0) {
                this.field2516[arg0.field2534][arg0.field2542] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("hz.bp(Lhe;[IIII)Z")
    public boolean method3904(class222 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2552 = Statics.field66 / 100;
        if (arg0.field2547 >= 0 && arg0.field2551 == null || arg0.field2551.method2154()) {
            arg0.method4009();
            arg0.method3787();
            if (arg0.field2542 > 0 && this.field2516[arg0.field2534][arg0.field2542] == arg0) {
                this.field2516[arg0.field2534][arg0.field2542] = null;
            }
            return true;
        }
        int var5 = arg0.field2549;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2508[arg0.field2534] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2549 = var6;
        }
        arg0.field2551.method2153(this.method3913(arg0));
        class219 var7 = arg0.field2537;
        boolean var8 = false;
        arg0.field2538++;
        arg0.field2550 += var7.field2495;
        double var9 = (double) ((arg0.field2533 - 60 << 8) + (arg0.field2549 * arg0.field2546 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2490 > 0) {
            if (var7.field2493 > 0) {
                arg0.field2544 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2493 * var9) + 0.5D);
            } else {
                arg0.field2544 += 128;
            }
        }
        if (var7.field2494 != null) {
            if (var7.field2491 > 0) {
                arg0.field2545 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2491 * var9) + 0.5D);
            } else {
                arg0.field2545 += 128;
            }
            while (arg0.field2536 < var7.field2494.length - 2 && arg0.field2545 > (var7.field2494[arg0.field2536 + 2] & 0xFF) << 8) {
                arg0.field2536 += 2;
            }
            if (arg0.field2536 == var7.field2494.length - 2 && var7.field2494[arg0.field2536 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2547 >= 0 && var7.field2489 != null && (this.field2517[arg0.field2534] & 0x1) == 0 && (arg0.field2542 < 0 || this.field2516[arg0.field2534][arg0.field2542] != arg0)) {
            if (var7.field2496 > 0) {
                arg0.field2547 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2496 * var9) + 0.5D);
            } else {
                arg0.field2547 += 128;
            }
            while (arg0.field2548 < var7.field2489.length - 2 && arg0.field2547 > (var7.field2489[arg0.field2548 + 2] & 0xFF) << 8) {
                arg0.field2548 += 2;
            }
            if (arg0.field2548 == var7.field2489.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2551.method2151(arg0.field2552, this.method3928(arg0), this.method3929(arg0));
            return false;
        }
        arg0.field2551.method2253(arg0.field2552);
        if (arg1 == null) {
            arg0.field2551.method1904(arg3);
        } else {
            arg0.field2551.method1933(arg1, arg2, arg3);
        }
        if (arg0.field2551.method2155()) {
            this.field2531.field2579.method1894(arg0.field2551);
        }
        arg0.method4009();
        if (arg0.field2547 >= 0) {
            arg0.method3787();
            if (arg0.field2542 > 0 && this.field2516[arg0.field2534][arg0.field2542] == arg0) {
                this.field2516[arg0.field2534][arg0.field2542] = null;
            }
        }
        return true;
    }
}
