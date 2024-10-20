package deob;

@ObfuscatedName("gg")
public class class208 extends class120 {

    @ObfuscatedName("gg.o")
    public class194 field2543 = new class194(128);

    @ObfuscatedName("gg.x")
    public int field2528 = 256;

    @ObfuscatedName("gg.k")
    public int field2529 = 1000000;

    @ObfuscatedName("gg.f")
    public int[] field2530 = new int[16];

    @ObfuscatedName("gg.i")
    public int[] field2531 = new int[16];

    @ObfuscatedName("gg.j")
    public int[] field2541 = new int[16];

    @ObfuscatedName("gg.m")
    public int[] field2533 = new int[16];

    @ObfuscatedName("gg.u")
    public int[] field2534 = new int[16];

    @ObfuscatedName("gg.r")
    public int[] field2545 = new int[16];

    @ObfuscatedName("gg.v")
    public int[] field2536 = new int[16];

    @ObfuscatedName("gg.h")
    public int[] field2537 = new int[16];

    @ObfuscatedName("gg.a")
    public int[] field2547 = new int[16];

    @ObfuscatedName("gg.e")
    public int[] field2539 = new int[16];

    @ObfuscatedName("gg.g")
    public int[] field2552 = new int[16];

    @ObfuscatedName("gg.d")
    public int[] field2548 = new int[16];

    @ObfuscatedName("gg.y")
    public int[] field2532 = new int[16];

    @ObfuscatedName("gg.t")
    public int[] field2527 = new int[16];

    @ObfuscatedName("gg.b")
    public int[] field2544 = new int[16];

    @ObfuscatedName("gg.s")
    public class209[][] field2540 = new class209[16][128];

    @ObfuscatedName("gg.ap")
    public class209[][] field2535 = new class209[16][128];

    @ObfuscatedName("gg.ac")
    public class210 field2546 = new class210();

    @ObfuscatedName("gg.af")
    public boolean field2542;

    @ObfuscatedName("gg.ai")
    public int field2549;

    @ObfuscatedName("gg.ad")
    public int field2550;

    @ObfuscatedName("gg.ar")
    public long field2551;

    @ObfuscatedName("gg.aq")
    public long field2538;

    @ObfuscatedName("gg.ag")
    public class212 field2553 = new class212(this);

    public class208() {
        this.method3415();
    }

    @ObfuscatedName("gg.w(II)V")
    public synchronized void method3397(int arg0) {
        this.field2528 = arg0;
    }

    @ObfuscatedName("gg.o(I)I")
    public int method3398() {
        return this.field2528;
    }

    @ObfuscatedName("gg.x(Lhm;Liq;Lda;II)Z")
    public synchronized boolean method3399(class213 arg0, class239 arg1, class113 arg2, int arg3) {
        arg0.method3574();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class203 var7 = (class203) arg0.field2608.method3251(); var7 != null; var7 = (class203) arg0.field2608.method3256()) {
            int var8 = (int) var7.field2490;
            class211 var9 = (class211) this.field2543.method3252((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3732(var8);
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
                this.field2543.method3253(var11, (long) var8);
            }
            if (!var9.method3552(arg2, var7.field2504, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3579();
        }
        return var5;
    }

    @ObfuscatedName("gg.k(I)V")
    public synchronized void method3400() {
        for (class211 var1 = (class211) this.field2543.method3251(); var1 != null; var1 = (class211) this.field2543.method3256()) {
            var1.method3553();
        }
    }

    @ObfuscatedName("gg.f(I)V")
    public synchronized void method3430() {
        for (class211 var1 = (class211) this.field2543.method3251(); var1 != null; var1 = (class211) this.field2543.method3256()) {
            var1.method3294();
        }
    }

    @ObfuscatedName("gg.h(Lhm;ZB)V")
    public synchronized void method3402(class213 arg0, boolean arg1) {
        this.method3403();
        this.field2546.method3505(arg0.field2609);
        this.field2542 = arg1;
        this.field2551 = 0L;
        int var3 = this.field2546.method3496();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2546.method3506(var4);
            this.field2546.method3500(var4);
            this.field2546.method3498(var4);
        }
        this.field2549 = this.field2546.method3519();
        this.field2550 = this.field2546.field2583[this.field2549];
        this.field2538 = this.field2546.method3510(this.field2550);
    }

    @ObfuscatedName("gg.p(I)V")
    public synchronized void method3403() {
        this.field2546.method3494();
        this.method3415();
    }

    @ObfuscatedName("gg.q(I)Z")
    public synchronized boolean method3404() {
        return this.field2546.method3495();
    }

    @ObfuscatedName("gg.l(IIB)V")
    public synchronized void method3405(int arg0, int arg1) {
        this.method3410(arg0, arg1);
    }

    @ObfuscatedName("gg.c(IIB)V")
    public void method3410(int arg0, int arg1) {
        this.field2533[arg0] = arg1;
        this.field2545[arg0] = arg1 & 0xFFFFFF80;
        this.method3487(arg0, arg1);
    }

    @ObfuscatedName("gg.n(III)V")
    public void method3487(int arg0, int arg1) {
        if (this.field2534[arg0] != arg1) {
            this.field2534[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2535[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gg.z(IIII)V")
    public void method3408(int arg0, int arg1, int arg2) {
        this.method3479(arg0, arg1, 64);
        if ((this.field2539[arg0] & 0x2) != 0) {
            for (class209 var4 = (class209) this.field2553.field2607.method3305(); var4 != null; var4 = (class209) this.field2553.field2607.method3317()) {
                if (var4.field2564 == arg0 && var4.field2568 < 0) {
                    this.field2540[arg0][var4.field2571] = null;
                    this.field2540[arg0][arg1] = var4;
                    int var5 = (var4.field2570 * var4.field2563 >> 12) + var4.field2562;
                    var4.field2562 += arg1 - var4.field2571 << 8;
                    var4.field2563 = var5 - var4.field2562;
                    var4.field2570 = 4096;
                    var4.field2571 = arg1;
                    return;
                }
            }
        }
        class211 var6 = (class211) this.field2543.method3252((long) this.field2534[arg0]);
        if (var6 == null) {
            return;
        }
        class108 var7 = var6.field2594[arg1];
        if (var7 == null) {
            return;
        }
        class209 var8 = new class209();
        var8.field2564 = arg0;
        var8.field2555 = var6;
        var8.field2565 = var7;
        var8.field2561 = var6.field2597[arg1];
        var8.field2554 = var6.field2593[arg1];
        var8.field2571 = arg1;
        var8.field2560 = var6.field2598 * arg2 * arg2 * var6.field2596[arg1] + 1024 >> 11;
        var8.field2578 = var6.field2602[arg1] & 0xFF;
        var8.field2562 = (arg1 << 8) - (var6.field2595[arg1] & 0x7FFF);
        var8.field2573 = 0;
        var8.field2566 = 0;
        var8.field2567 = 0;
        var8.field2568 = -1;
        var8.field2569 = 0;
        if (this.field2532[arg0] == 0) {
            var8.field2572 = class118.method2009(var7, this.method3420(var8), this.method3421(var8), this.method3422(var8));
        } else {
            var8.field2572 = class118.method2009(var7, this.method3420(var8), 0, this.method3422(var8));
            this.method3435(var8, var6.field2595[arg1] < 0);
        }
        if (var6.field2595[arg1] < 0) {
            var8.field2572.method1918(-1);
        }
        if (var8.field2554 >= 0) {
            class209 var9 = this.field2535[arg0][var8.field2554];
            if (var9 != null && var9.field2568 < 0) {
                this.field2540[arg0][var9.field2571] = null;
                var9.field2568 = 0;
            }
            this.field2535[arg0][var8.field2554] = var8;
        }
        this.field2553.field2607.method3299(var8);
        this.field2540[arg0][arg1] = var8;
    }

    @ObfuscatedName("gg.e(Lhj;ZI)V")
    public void method3435(class209 arg0, boolean arg1) {
        int var3 = arg0.field2565.field1619.length;
        int var5;
        if (arg1 && arg0.field2565.field1621) {
            int var4 = var3 + var3 - arg0.field2565.field1622;
            var5 = (int) ((long) this.field2532[arg0.field2564] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2572.method1933(true);
            }
        } else {
            var5 = (int) ((long) this.field2532[arg0.field2564] * (long) var3 >> 6);
        }
        arg0.field2572.method1924(var5);
    }

    @ObfuscatedName("gg.t(IIII)V")
    public void method3479(int arg0, int arg1, int arg2) {
        class209 var4 = this.field2540[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2540[arg0][arg1] = null;
        if ((this.field2539[arg0] & 0x2) == 0) {
            var4.field2568 = 0;
            return;
        }
        for (class209 var5 = (class209) this.field2553.field2607.method3304(); var5 != null; var5 = (class209) this.field2553.field2607.method3306()) {
            if (var4.field2564 == var5.field2564 && var5.field2568 < 0 && var4 != var5) {
                var4.field2568 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gg.b(IIII)V")
    public void method3453(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gg.s(III)V")
    public void method3425(int arg0, int arg1) {
    }

    @ObfuscatedName("gg.ap(III)V")
    public void method3411(int arg0, int arg1) {
        this.field2536[arg0] = arg1;
    }

    @ObfuscatedName("gg.ac(IB)V")
    public void method3432(int arg0) {
        for (class209 var2 = (class209) this.field2553.field2607.method3304(); var2 != null; var2 = (class209) this.field2553.field2607.method3306()) {
            if (arg0 < 0 || var2.field2564 == arg0) {
                if (var2.field2572 != null) {
                    var2.field2572.method2027(Statics.field3411 / 100);
                    if (var2.field2572.method1917()) {
                        this.field2553.field2604.method1686(var2.field2572);
                    }
                    var2.method3491();
                }
                if (var2.field2568 < 0) {
                    this.field2540[var2.field2564][var2.field2571] = null;
                }
                var2.method3294();
            }
        }
    }

    @ObfuscatedName("gg.af(II)V")
    public void method3413(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3413(var2);
            }
            return;
        }
        this.field2530[arg0] = 12800;
        this.field2531[arg0] = 8192;
        this.field2541[arg0] = 16383;
        this.field2536[arg0] = 8192;
        this.field2537[arg0] = 0;
        this.field2547[arg0] = 8192;
        this.method3412(arg0);
        this.method3431(arg0);
        this.field2539[arg0] = 0;
        this.field2552[arg0] = 32767;
        this.field2548[arg0] = 256;
        this.field2532[arg0] = 0;
        this.method3419(arg0, 8192);
    }

    @ObfuscatedName("gg.aw(II)V")
    public void method3414(int arg0) {
        for (class209 var2 = (class209) this.field2553.field2607.method3304(); var2 != null; var2 = (class209) this.field2553.field2607.method3306()) {
            if ((arg0 < 0 || var2.field2564 == arg0) && var2.field2568 < 0) {
                this.field2540[var2.field2564][var2.field2571] = null;
                var2.field2568 = 0;
            }
        }
    }

    @ObfuscatedName("gg.at(I)V")
    public void method3415() {
        this.method3432(-1);
        this.method3413(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2534[var1] = this.field2533[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2545[var2] = this.field2533[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gg.aj(IB)V")
    public void method3412(int arg0) {
        if ((this.field2539[arg0] & 0x2) == 0) {
            return;
        }
        for (class209 var2 = (class209) this.field2553.field2607.method3304(); var2 != null; var2 = (class209) this.field2553.field2607.method3306()) {
            if (var2.field2564 == arg0 && this.field2540[arg0][var2.field2571] == null && var2.field2568 < 0) {
                var2.field2568 = 0;
            }
        }
    }

    @ObfuscatedName("gg.al(IB)V")
    public void method3431(int arg0) {
        if ((this.field2539[arg0] & 0x4) == 0) {
            return;
        }
        for (class209 var2 = (class209) this.field2553.field2607.method3304(); var2 != null; var2 = (class209) this.field2553.field2607.method3306()) {
            if (var2.field2564 == arg0) {
                var2.field2574 = 0;
            }
        }
    }

    @ObfuscatedName("gg.au(IB)V")
    public void method3418(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3479(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3408(var6, var7, var8);
            } else {
                this.method3479(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3453(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2545[var12] = (var14 << 14) + (this.field2545[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2545[var12] = (var14 << 7) + (this.field2545[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2537[var12] = (var14 << 7) + (this.field2537[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2537[var12] = (this.field2537[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2547[var12] = (var14 << 7) + (this.field2547[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2547[var12] = (this.field2547[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2530[var12] = (var14 << 7) + (this.field2530[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2530[var12] = (this.field2530[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2531[var12] = (var14 << 7) + (this.field2531[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2531[var12] = (this.field2531[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2541[var12] = (var14 << 7) + (this.field2541[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2541[var12] = (this.field2541[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2539[var12] |= 0x1;
                } else {
                    this.field2539[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2539[var12] |= 0x2;
                } else {
                    this.method3412(var12);
                    this.field2539[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2552[var12] = (var14 << 7) + (this.field2552[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2552[var12] = (this.field2552[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2552[var12] = (var14 << 7) + (this.field2552[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2552[var12] = (this.field2552[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3432(var12);
            }
            if (var13 == 121) {
                this.method3413(var12);
            }
            if (var13 == 123) {
                this.method3414(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2552[var12];
                if (var15 == 16384) {
                    this.field2548[var12] = (var14 << 7) + (this.field2548[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2552[var12];
                if (var16 == 16384) {
                    this.field2548[var12] = (this.field2548[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2532[var12] = (var14 << 7) + (this.field2532[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2532[var12] = (this.field2532[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2539[var12] |= 0x4;
                } else {
                    this.method3431(var12);
                    this.field2539[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3419(var12, (var14 << 7) + (this.field2527[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3419(var12, (this.field2527[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3487(var17, this.field2545[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3425(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3411(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3415();
            }
        }
    }

    @ObfuscatedName("gg.aa(IIB)V")
    public void method3419(int arg0, int arg1) {
        this.field2527[arg0] = arg1;
        this.field2544[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gg.ao(Lhj;B)I")
    public int method3420(class209 arg0) {
        int var2 = (arg0.field2570 * arg0.field2563 >> 12) + arg0.field2562;
        int var3 = ((this.field2536[arg0.field2564] - 8192) * this.field2548[arg0.field2564] >> 12) + var2;
        class206 var4 = arg0.field2561;
        if (var4.field2516 > 0 && (var4.field2512 > 0 || this.field2537[arg0.field2564] > 0)) {
            int var5 = var4.field2512 << 2;
            int var6 = var4.field2511 << 1;
            if (arg0.field2556 < var6) {
                var5 = arg0.field2556 * var5 / var6;
            }
            int var7 = (this.field2537[arg0.field2564] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2559 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2565.field1620 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field3411 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gg.bm(Lhj;I)I")
    public int method3421(class209 arg0) {
        class206 var2 = arg0.field2561;
        int var3 = this.field2530[arg0.field2564] * this.field2541[arg0.field2564] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2560 * var4 + 16384 >> 15;
        int var6 = this.field2528 * var5 + 128 >> 8;
        if (var2.field2513 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2573 * 1.953125E-5D * (double) var2.field2513) + 0.5D);
        }
        if (var2.field2515 != null) {
            int var7 = arg0.field2566;
            int var8 = var2.field2515[arg0.field2567 + 1];
            if (arg0.field2567 < var2.field2515.length - 2) {
                int var9 = (var2.field2515[arg0.field2567] & 0xFF) << 8;
                int var10 = (var2.field2515[arg0.field2567 + 2] & 0xFF) << 8;
                var8 += (var2.field2515[arg0.field2567 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2568 > 0 && var2.field2509 != null) {
            int var11 = arg0.field2568;
            int var12 = var2.field2509[arg0.field2569 + 1];
            if (arg0.field2569 < var2.field2509.length - 2) {
                int var13 = (var2.field2509[arg0.field2569] & 0xFF) << 8;
                int var14 = (var2.field2509[arg0.field2569 + 2] & 0xFF) << 8;
                var12 += (var2.field2509[arg0.field2569 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gg.bd(Lhj;I)I")
    public int method3422(class209 arg0) {
        int var2 = this.field2531[arg0.field2564];
        return var2 < 8192 ? arg0.field2578 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2578) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gg.i()Ldj;")
    public synchronized class120 method1691() {
        return this.field2553;
    }

    @ObfuscatedName("gg.j()Ldj;")
    public synchronized class120 method1716() {
        return null;
    }

    @ObfuscatedName("gg.m()I")
    public synchronized int method1693() {
        return 0;
    }

    @ObfuscatedName("gg.u([III)V")
    public synchronized void method1726(int[] arg0, int arg1, int arg2) {
        if (this.field2546.method3495()) {
            int var4 = this.field2529 * this.field2546.field2586 / Statics.field3411;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2551;
                if (this.field2538 - var5 >= 0L) {
                    this.field2551 = var5;
                    break;
                }
                int var7 = (int) ((this.field2538 - this.field2551 + (long) var4 - 1L) / (long) var4);
                this.field2551 += (long) var4 * (long) var7;
                this.field2553.method1726(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3459();
            } while (this.field2546.method3495());
        }
        this.field2553.method1726(arg0, arg1, arg2);
    }

    @ObfuscatedName("gg.a(I)V")
    public synchronized void method1696(int arg0) {
        if (this.field2546.method3495()) {
            int var2 = this.field2529 * this.field2546.field2586 / Statics.field3411;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2551;
                if (this.field2538 - var3 >= 0L) {
                    this.field2551 = var3;
                    break;
                }
                int var5 = (int) ((this.field2538 - this.field2551 + (long) var2 - 1L) / (long) var2);
                this.field2551 += (long) var2 * (long) var5;
                this.field2553.method1696(var5);
                arg0 -= var5;
                this.method3459();
            } while (this.field2546.method3495());
        }
        this.field2553.method1696(arg0);
    }

    @ObfuscatedName("gg.bn(I)V")
    public void method3459() {
        int var1 = this.field2549;
        int var2 = this.field2550;
        long var3 = this.field2538;
        while (this.field2550 == var2) {
            while (this.field2546.field2583[var1] == var2) {
                this.field2546.method3506(var1);
                int var5 = this.field2546.method3539(var1);
                if (var5 == 1) {
                    this.field2546.method3499();
                    this.field2546.method3498(var1);
                    if (this.field2546.method3502()) {
                        if (!this.field2542 || var2 == 0) {
                            this.method3415();
                            this.field2546.method3494();
                            return;
                        }
                        this.field2546.method3537(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3418(var5);
                }
                this.field2546.method3500(var1);
                this.field2546.method3498(var1);
            }
            var1 = this.field2546.method3519();
            var2 = this.field2546.field2583[var1];
            var3 = this.field2546.method3510(var2);
        }
        this.field2549 = var1;
        this.field2550 = var2;
        this.field2538 = var3;
    }

    @ObfuscatedName("gg.by(Lhj;I)Z")
    public boolean method3426(class209 arg0) {
        if (arg0.field2572 != null) {
            return false;
        }
        if (arg0.field2568 >= 0) {
            arg0.method3294();
            if (arg0.field2554 > 0 && this.field2535[arg0.field2564][arg0.field2554] == arg0) {
                this.field2535[arg0.field2564][arg0.field2554] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gg.bo(Lhj;[IIII)Z")
    public boolean method3447(class209 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2577 = Statics.field3411 / 100;
        if (arg0.field2568 >= 0 && arg0.field2572 == null || arg0.field2572.method1987()) {
            arg0.method3491();
            arg0.method3294();
            if (arg0.field2554 > 0 && this.field2535[arg0.field2564][arg0.field2554] == arg0) {
                this.field2535[arg0.field2564][arg0.field2554] = null;
            }
            return true;
        }
        int var5 = arg0.field2570;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2547[arg0.field2564] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2570 = var6;
        }
        arg0.field2572.method1911(this.method3420(arg0));
        class206 var7 = arg0.field2561;
        boolean var8 = false;
        arg0.field2556++;
        arg0.field2559 += var7.field2516;
        double var9 = (double) ((arg0.field2571 - 60 << 8) + (arg0.field2570 * arg0.field2563 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2513 > 0) {
            if (var7.field2514 > 0) {
                arg0.field2573 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2514 * var9) + 0.5D);
            } else {
                arg0.field2573 += 128;
            }
        }
        if (var7.field2515 != null) {
            if (var7.field2517 > 0) {
                arg0.field2566 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2517 * var9) + 0.5D);
            } else {
                arg0.field2566 += 128;
            }
            while (arg0.field2567 < var7.field2515.length - 2 && arg0.field2566 > (var7.field2515[arg0.field2567 + 2] & 0xFF) << 8) {
                arg0.field2567 += 2;
            }
            if (arg0.field2567 == var7.field2515.length - 2 && var7.field2515[arg0.field2567 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2568 >= 0 && var7.field2509 != null && (this.field2539[arg0.field2564] & 0x1) == 0 && (arg0.field2554 < 0 || this.field2535[arg0.field2564][arg0.field2554] != arg0)) {
            if (var7.field2510 > 0) {
                arg0.field2568 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2510 * var9) + 0.5D);
            } else {
                arg0.field2568 += 128;
            }
            while (arg0.field2569 < var7.field2509.length - 2 && arg0.field2568 > (var7.field2509[arg0.field2569 + 2] & 0xFF) << 8) {
                arg0.field2569 += 2;
            }
            if (arg0.field2569 == var7.field2509.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2572.method1925(arg0.field2577, this.method3421(arg0), this.method3422(arg0));
            return false;
        }
        arg0.field2572.method2027(arg0.field2577);
        if (arg1 == null) {
            arg0.field2572.method1696(arg3);
        } else {
            arg0.field2572.method1726(arg1, arg2, arg3);
        }
        if (arg0.field2572.method1917()) {
            this.field2553.field2604.method1686(arg0.field2572);
        }
        arg0.method3491();
        if (arg0.field2568 >= 0) {
            arg0.method3294();
            if (arg0.field2554 > 0 && this.field2535[arg0.field2564][arg0.field2554] == arg0) {
                this.field2535[arg0.field2564][arg0.field2554] = null;
            }
        }
        return true;
    }
}
