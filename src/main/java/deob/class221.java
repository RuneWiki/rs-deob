package deob;

@ObfuscatedName("hb")
public class class221 extends class108 {

    @ObfuscatedName("hb.f")
    public class205 field2535 = new class205(128);

    @ObfuscatedName("hb.h")
    public int field2528 = 256;

    @ObfuscatedName("hb.e")
    public int field2529 = 1000000;

    @ObfuscatedName("hb.b")
    public int[] field2552 = new int[16];

    @ObfuscatedName("hb.l")
    public int[] field2549 = new int[16];

    @ObfuscatedName("hb.d")
    public int[] field2532 = new int[16];

    @ObfuscatedName("hb.n")
    public int[] field2553 = new int[16];

    @ObfuscatedName("hb.s")
    public int[] field2534 = new int[16];

    @ObfuscatedName("hb.g")
    public int[] field2547 = new int[16];

    @ObfuscatedName("hb.a")
    public int[] field2536 = new int[16];

    @ObfuscatedName("hb.r")
    public int[] field2537 = new int[16];

    @ObfuscatedName("hb.k")
    public int[] field2538 = new int[16];

    @ObfuscatedName("hb.v")
    public int[] field2539 = new int[16];

    @ObfuscatedName("hb.p")
    public int[] field2540 = new int[16];

    @ObfuscatedName("hb.z")
    public int[] field2546 = new int[16];

    @ObfuscatedName("hb.j")
    public int[] field2542 = new int[16];

    @ObfuscatedName("hb.i")
    public int[] field2543 = new int[16];

    @ObfuscatedName("hb.c")
    public int[] field2544 = new int[16];

    @ObfuscatedName("hb.y")
    public class222[][] field2545 = new class222[16][128];

    @ObfuscatedName("hb.av")
    public class222[][] field2533 = new class222[16][128];

    @ObfuscatedName("hb.as")
    public class223 field2531 = new class223();

    @ObfuscatedName("hb.al")
    public boolean field2548;

    @ObfuscatedName("hb.ax")
    public int field2550;

    @ObfuscatedName("hb.ay")
    public int field2527;

    @ObfuscatedName("hb.aa")
    public long field2551;

    @ObfuscatedName("hb.ag")
    public long field2541;

    @ObfuscatedName("hb.aj")
    public class225 field2530 = new class225(this);

    public class221() {
        this.method3929();
    }

    @ObfuscatedName("hb.f(IB)V")
    public synchronized void method3910(int arg0) {
        this.field2528 = arg0;
    }

    @ObfuscatedName("hb.h(I)I")
    public int method3911() {
        return this.field2528;
    }

    @ObfuscatedName("hb.e(Lhv;Lie;Lcv;IB)Z")
    public synchronized boolean method3928(class226 arg0, class250 arg1, class101 arg2, int arg3) {
        arg0.method4085();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class216 var7 = (class216) arg0.field2605.method3766(); var7 != null; var7 = (class216) arg0.field2605.method3764()) {
            int var8 = (int) var7.field2486;
            class224 var9 = (class224) this.field2535.method3759((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method4333(var8);
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
                this.field2535.method3761(var11, (long) var8);
            }
            if (!var9.method4066(arg2, var7.field2504, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method4086();
        }
        return var5;
    }

    @ObfuscatedName("hb.b(I)V")
    public synchronized void method3932() {
        for (class224 var1 = (class224) this.field2535.method3766(); var1 != null; var1 = (class224) this.field2535.method3764()) {
            var1.method4067();
        }
    }

    @ObfuscatedName("hb.l(B)V")
    public synchronized void method3992() {
        for (class224 var1 = (class224) this.field2535.method3766(); var1 != null; var1 = (class224) this.field2535.method3764()) {
            var1.method3812();
        }
    }

    @ObfuscatedName("hb.g(Lhv;ZI)V")
    public synchronized void method3934(class226 arg0, boolean arg1) {
        this.method3925();
        this.field2531.method4017(arg0.field2606);
        this.field2548 = arg1;
        this.field2551 = 0L;
        int var3 = this.field2531.method4019();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2531.method4059(var4);
            this.field2531.method4023(var4);
            this.field2531.method4016(var4);
        }
        this.field2550 = this.field2531.method4028();
        this.field2527 = this.field2531.field2581[this.field2550];
        this.field2541 = this.field2531.method4025(this.field2527);
    }

    @ObfuscatedName("hb.m(I)V")
    public synchronized void method3925() {
        this.field2531.method4026();
        this.method3929();
    }

    @ObfuscatedName("hb.q(I)Z")
    public synchronized boolean method3916() {
        return this.field2531.method4018();
    }

    @ObfuscatedName("hb.x(III)V")
    public synchronized void method3913(int arg0, int arg1) {
        this.method3918(arg0, arg1);
    }

    @ObfuscatedName("hb.u(III)V")
    public void method3918(int arg0, int arg1) {
        this.field2553[arg0] = arg1;
        this.field2547[arg0] = arg1 & 0xFFFFFF80;
        this.method3919(arg0, arg1);
    }

    @ObfuscatedName("hb.o(III)V")
    public void method3919(int arg0, int arg1) {
        if (this.field2534[arg0] != arg1) {
            this.field2534[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2533[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("hb.t(IIII)V")
    public void method3945(int arg0, int arg1, int arg2) {
        this.method3917(arg0, arg1, 64);
        if ((this.field2539[arg0] & 0x2) != 0) {
            for (class222 var4 = (class222) this.field2530.field2600.method3821(); var4 != null; var4 = (class222) this.field2530.field2600.method3813()) {
                if (var4.field2554 == arg0 && var4.field2568 < 0) {
                    this.field2545[arg0][var4.field2571] = null;
                    this.field2545[arg0][arg1] = var4;
                    int var5 = (var4.field2564 * var4.field2563 >> 12) + var4.field2562;
                    var4.field2562 += arg1 - var4.field2571 << 8;
                    var4.field2563 = var5 - var4.field2562;
                    var4.field2564 = 4096;
                    var4.field2571 = arg1;
                    return;
                }
            }
        }
        class224 var6 = (class224) this.field2535.method3759((long) this.field2534[arg0]);
        if (var6 == null) {
            return;
        }
        class96 var7 = var6.field2596[arg1];
        if (var7 == null) {
            return;
        }
        class222 var8 = new class222();
        var8.field2554 = arg0;
        var8.field2572 = var6;
        var8.field2565 = var7;
        var8.field2557 = var6.field2594[arg1];
        var8.field2558 = var6.field2597[arg1];
        var8.field2571 = arg1;
        var8.field2560 = var6.field2592 * arg2 * arg2 * var6.field2595[arg1] + 1024 >> 11;
        var8.field2561 = var6.field2593[arg1] & 0xFF;
        var8.field2562 = (arg1 << 8) - (var6.field2591[arg1] & 0x7FFF);
        var8.field2559 = 0;
        var8.field2566 = 0;
        var8.field2567 = 0;
        var8.field2568 = -1;
        var8.field2569 = 0;
        if (this.field2542[arg0] == 0) {
            var8.field2555 = class106.method2135(var7, this.method3948(var8), this.method3995(var8), this.method3936(var8));
        } else {
            var8.field2555 = class106.method2135(var7, this.method3948(var8), 0, this.method3936(var8));
            this.method3921(var8, var6.field2591[arg1] < 0);
        }
        if (var6.field2591[arg1] < 0) {
            var8.field2555.method2252(-1);
        }
        if (var8.field2558 >= 0) {
            class222 var9 = this.field2533[arg0][var8.field2558];
            if (var9 != null && var9.field2568 < 0) {
                this.field2545[arg0][var9.field2571] = null;
                var9.field2568 = 0;
            }
            this.field2533[arg0][var8.field2558] = var8;
        }
        this.field2530.field2600.method3831(var8);
        this.field2545[arg0][arg1] = var8;
    }

    @ObfuscatedName("hb.v(Lhe;ZI)V")
    public void method3921(class222 arg0, boolean arg1) {
        int var3 = arg0.field2565.field1324.length;
        int var5;
        if (arg1 && arg0.field2565.field1327) {
            int var4 = var3 + var3 - arg0.field2565.field1325;
            var5 = (int) ((long) this.field2542[arg0.field2554] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2555.method2143(true);
            }
        } else {
            var5 = (int) ((long) this.field2542[arg0.field2554] * (long) var3 >> 6);
        }
        arg0.field2555.method2142(var5);
    }

    @ObfuscatedName("hb.p(IIII)V")
    public void method3917(int arg0, int arg1, int arg2) {
        class222 var4 = this.field2545[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2545[arg0][arg1] = null;
        if ((this.field2539[arg0] & 0x2) == 0) {
            var4.field2568 = 0;
            return;
        }
        for (class222 var5 = (class222) this.field2530.field2600.method3823(); var5 != null; var5 = (class222) this.field2530.field2600.method3822()) {
            if (var4.field2554 == var5.field2554 && var5.field2568 < 0 && var4 != var5) {
                var4.field2568 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("hb.z(IIII)V")
    public void method3923(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("hb.j(III)V")
    public void method3924(int arg0, int arg1) {
    }

    @ObfuscatedName("hb.c(III)V")
    public void method3941(int arg0, int arg1) {
        this.field2536[arg0] = arg1;
    }

    @ObfuscatedName("hb.am(II)V")
    public void method3926(int arg0) {
        for (class222 var2 = (class222) this.field2530.field2600.method3823(); var2 != null; var2 = (class222) this.field2530.field2600.method3822()) {
            if (arg0 < 0 || var2.field2554 == arg0) {
                if (var2.field2555 != null) {
                    var2.field2555.method2216(Statics.field3801 / 100);
                    if (var2.field2555.method2151()) {
                        this.field2530.field2603.method1916(var2.field2555);
                    }
                    var2.method4015();
                }
                if (var2.field2568 < 0) {
                    this.field2545[var2.field2554][var2.field2571] = null;
                }
                var2.method3812();
            }
        }
    }

    @ObfuscatedName("hb.ae(II)V")
    public void method3927(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3927(var2);
            }
            return;
        }
        this.field2552[arg0] = 12800;
        this.field2549[arg0] = 8192;
        this.field2532[arg0] = 16383;
        this.field2536[arg0] = 8192;
        this.field2537[arg0] = 0;
        this.field2538[arg0] = 8192;
        this.method3930(arg0);
        this.method3976(arg0);
        this.field2539[arg0] = 0;
        this.field2540[arg0] = 32767;
        this.field2546[arg0] = 256;
        this.field2542[arg0] = 0;
        this.method3933(arg0, 8192);
    }

    @ObfuscatedName("hb.ah(II)V")
    public void method4007(int arg0) {
        for (class222 var2 = (class222) this.field2530.field2600.method3823(); var2 != null; var2 = (class222) this.field2530.field2600.method3822()) {
            if ((arg0 < 0 || var2.field2554 == arg0) && var2.field2568 < 0) {
                this.field2545[var2.field2554][var2.field2571] = null;
                var2.field2568 = 0;
            }
        }
    }

    @ObfuscatedName("hb.aq(I)V")
    public void method3929() {
        this.method3926(-1);
        this.method3927(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2534[var1] = this.field2553[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2547[var2] = this.field2553[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("hb.ab(II)V")
    public void method3930(int arg0) {
        if ((this.field2539[arg0] & 0x2) == 0) {
            return;
        }
        for (class222 var2 = (class222) this.field2530.field2600.method3823(); var2 != null; var2 = (class222) this.field2530.field2600.method3822()) {
            if (var2.field2554 == arg0 && this.field2545[arg0][var2.field2571] == null && var2.field2568 < 0) {
                var2.field2568 = 0;
            }
        }
    }

    @ObfuscatedName("hb.ar(II)V")
    public void method3976(int arg0) {
        if ((this.field2539[arg0] & 0x4) == 0) {
            return;
        }
        for (class222 var2 = (class222) this.field2530.field2600.method3823(); var2 != null; var2 = (class222) this.field2530.field2600.method3822()) {
            if (var2.field2554 == arg0) {
                var2.field2575 = 0;
            }
        }
    }

    @ObfuscatedName("hb.ao(IB)V")
    public void method3951(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3917(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3945(var6, var7, var8);
            } else {
                this.method3917(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3923(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2547[var12] = (var14 << 14) + (this.field2547[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2547[var12] = (var14 << 7) + (this.field2547[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2537[var12] = (var14 << 7) + (this.field2537[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2537[var12] = (this.field2537[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2538[var12] = (var14 << 7) + (this.field2538[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2538[var12] = (this.field2538[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2552[var12] = (var14 << 7) + (this.field2552[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2552[var12] = (this.field2552[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2549[var12] = (var14 << 7) + (this.field2549[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2549[var12] = (this.field2549[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2532[var12] = (var14 << 7) + (this.field2532[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2532[var12] = (this.field2532[var12] & 0xFFFFFF80) + var14;
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
                    this.method3930(var12);
                    this.field2539[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2540[var12] = (var14 << 7) + (this.field2540[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2540[var12] = (this.field2540[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2540[var12] = (var14 << 7) + (this.field2540[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2540[var12] = (this.field2540[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3926(var12);
            }
            if (var13 == 121) {
                this.method3927(var12);
            }
            if (var13 == 123) {
                this.method4007(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2540[var12];
                if (var15 == 16384) {
                    this.field2546[var12] = (var14 << 7) + (this.field2546[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2540[var12];
                if (var16 == 16384) {
                    this.field2546[var12] = (this.field2546[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2542[var12] = (var14 << 7) + (this.field2542[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2542[var12] = (this.field2542[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2539[var12] |= 0x4;
                } else {
                    this.method3976(var12);
                    this.field2539[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3933(var12, (var14 << 7) + (this.field2543[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3933(var12, (this.field2543[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3919(var17, this.field2547[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3924(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3941(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3929();
            }
        }
    }

    @ObfuscatedName("hb.at(III)V")
    public void method3933(int arg0, int arg1) {
        this.field2543[arg0] = arg1;
        this.field2544[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("hb.ad(Lhe;I)I")
    public int method3948(class222 arg0) {
        int var2 = (arg0.field2564 * arg0.field2563 >> 12) + arg0.field2562;
        int var3 = ((this.field2536[arg0.field2554] - 8192) * this.field2546[arg0.field2554] >> 12) + var2;
        class219 var4 = arg0.field2557;
        if (var4.field2517 > 0 && (var4.field2516 > 0 || this.field2537[arg0.field2554] > 0)) {
            int var5 = var4.field2516 << 2;
            int var6 = var4.field2518 << 1;
            if (arg0.field2570 < var6) {
                var5 = arg0.field2570 * var5 / var6;
            }
            int var7 = (this.field2537[arg0.field2554] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2556 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2565.field1323 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field3801 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("hb.ai(Lhe;I)I")
    public int method3995(class222 arg0) {
        class219 var2 = arg0.field2557;
        int var3 = this.field2552[arg0.field2554] * this.field2532[arg0.field2554] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2560 * var4 + 16384 >> 15;
        int var6 = this.field2528 * var5 + 128 >> 8;
        if (var2.field2510 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2559 * 1.953125E-5D * (double) var2.field2510) + 0.5D);
        }
        if (var2.field2519 != null) {
            int var7 = arg0.field2566;
            int var8 = var2.field2519[arg0.field2567 + 1];
            if (arg0.field2567 < var2.field2519.length - 2) {
                int var9 = (var2.field2519[arg0.field2567] & 0xFF) << 8;
                int var10 = (var2.field2519[arg0.field2567 + 2] & 0xFF) << 8;
                var8 += (var2.field2519[arg0.field2567 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2568 > 0 && var2.field2511 != null) {
            int var11 = arg0.field2568;
            int var12 = var2.field2511[arg0.field2569 + 1];
            if (arg0.field2569 < var2.field2511.length - 2) {
                int var13 = (var2.field2511[arg0.field2569] & 0xFF) << 8;
                int var14 = (var2.field2511[arg0.field2569 + 2] & 0xFF) << 8;
                var12 += (var2.field2511[arg0.field2569 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("hb.ak(Lhe;B)I")
    public int method3936(class222 arg0) {
        int var2 = this.field2549[arg0.field2554];
        return var2 < 8192 ? arg0.field2561 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2561) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("hb.w()Lde;")
    public synchronized class108 method1914() {
        return this.field2530;
    }

    @ObfuscatedName("hb.d()Lde;")
    public synchronized class108 method1915() {
        return null;
    }

    @ObfuscatedName("hb.n()I")
    public synchronized int method1908() {
        return 0;
    }

    @ObfuscatedName("hb.s([III)V")
    public synchronized void method1917(int[] arg0, int arg1, int arg2) {
        if (this.field2531.method4018()) {
            int var4 = this.field2529 * this.field2531.field2583 / Statics.field3801;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2551;
                if (this.field2541 - var5 >= 0L) {
                    this.field2551 = var5;
                    break;
                }
                int var7 = (int) ((this.field2541 - this.field2551 + (long) var4 - 1L) / (long) var4);
                this.field2551 += (long) var4 * (long) var7;
                this.field2530.method1917(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3937();
            } while (this.field2531.method4018());
        }
        this.field2530.method1917(arg0, arg1, arg2);
    }

    @ObfuscatedName("hb.k(I)V")
    public synchronized void method1919(int arg0) {
        if (this.field2531.method4018()) {
            int var2 = this.field2529 * this.field2531.field2583 / Statics.field3801;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2551;
                if (this.field2541 - var3 >= 0L) {
                    this.field2551 = var3;
                    break;
                }
                int var5 = (int) ((this.field2541 - this.field2551 + (long) var2 - 1L) / (long) var2);
                this.field2551 += (long) var2 * (long) var5;
                this.field2530.method1919(var5);
                arg0 -= var5;
                this.method3937();
            } while (this.field2531.method4018());
        }
        this.field2530.method1919(arg0);
    }

    @ObfuscatedName("hb.au(I)V")
    public void method3937() {
        int var1 = this.field2550;
        int var2 = this.field2527;
        long var3 = this.field2541;
        while (this.field2527 == var2) {
            while (this.field2531.field2581[var1] == var2) {
                this.field2531.method4059(var1);
                int var5 = this.field2531.method4022(var1);
                if (var5 == 1) {
                    this.field2531.method4060();
                    this.field2531.method4016(var1);
                    if (this.field2531.method4043()) {
                        if (!this.field2548 || var2 == 0) {
                            this.method3929();
                            this.field2531.method4026();
                            return;
                        }
                        this.field2531.method4030(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3951(var5);
                }
                this.field2531.method4023(var1);
                this.field2531.method4016(var1);
            }
            var1 = this.field2531.method4028();
            var2 = this.field2531.field2581[var1];
            var3 = this.field2531.method4025(var2);
        }
        this.field2550 = var1;
        this.field2527 = var2;
        this.field2541 = var3;
    }

    @ObfuscatedName("hb.az(Lhe;I)Z")
    public boolean method4009(class222 arg0) {
        if (arg0.field2555 != null) {
            return false;
        }
        if (arg0.field2568 >= 0) {
            arg0.method3812();
            if (arg0.field2558 > 0 && this.field2533[arg0.field2554][arg0.field2558] == arg0) {
                this.field2533[arg0.field2554][arg0.field2558] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("hb.aw(Lhe;[IIIB)Z")
    public boolean method3989(class222 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2573 = Statics.field3801 / 100;
        if (arg0.field2568 >= 0 && arg0.field2555 == null || arg0.field2555.method2150()) {
            arg0.method4015();
            arg0.method3812();
            if (arg0.field2558 > 0 && this.field2533[arg0.field2554][arg0.field2558] == arg0) {
                this.field2533[arg0.field2554][arg0.field2558] = null;
            }
            return true;
        }
        int var5 = arg0.field2564;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2538[arg0.field2554] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2564 = var6;
        }
        arg0.field2555.method2189(this.method3948(arg0));
        class219 var7 = arg0.field2557;
        boolean var8 = false;
        arg0.field2570++;
        arg0.field2556 += var7.field2517;
        double var9 = (double) ((arg0.field2571 - 60 << 8) + (arg0.field2564 * arg0.field2563 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2510 > 0) {
            if (var7.field2515 > 0) {
                arg0.field2559 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2515 * var9) + 0.5D);
            } else {
                arg0.field2559 += 128;
            }
        }
        if (var7.field2519 != null) {
            if (var7.field2513 > 0) {
                arg0.field2566 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2513 * var9) + 0.5D);
            } else {
                arg0.field2566 += 128;
            }
            while (arg0.field2567 < var7.field2519.length - 2 && arg0.field2566 > (var7.field2519[arg0.field2567 + 2] & 0xFF) << 8) {
                arg0.field2567 += 2;
            }
            if (arg0.field2567 == var7.field2519.length - 2 && var7.field2519[arg0.field2567 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2568 >= 0 && var7.field2511 != null && (this.field2539[arg0.field2554] & 0x1) == 0 && (arg0.field2558 < 0 || this.field2533[arg0.field2554][arg0.field2558] != arg0)) {
            if (var7.field2514 > 0) {
                arg0.field2568 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2514 * var9) + 0.5D);
            } else {
                arg0.field2568 += 128;
            }
            while (arg0.field2569 < var7.field2511.length - 2 && arg0.field2568 > (var7.field2511[arg0.field2569 + 2] & 0xFF) << 8) {
                arg0.field2569 += 2;
            }
            if (arg0.field2569 == var7.field2511.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2555.method2146(arg0.field2573, this.method3995(arg0), this.method3936(arg0));
            return false;
        }
        arg0.field2555.method2216(arg0.field2573);
        if (arg1 == null) {
            arg0.field2555.method1919(arg3);
        } else {
            arg0.field2555.method1917(arg1, arg2, arg3);
        }
        if (arg0.field2555.method2151()) {
            this.field2530.field2603.method1916(arg0.field2555);
        }
        arg0.method4015();
        if (arg0.field2568 >= 0) {
            arg0.method3812();
            if (arg0.field2558 > 0 && this.field2533[arg0.field2554][arg0.field2558] == arg0) {
                this.field2533[arg0.field2554][arg0.field2558] = null;
            }
        }
        return true;
    }
}
