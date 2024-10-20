package deob;

@ObfuscatedName("hc")
public class class221 extends class108 {

    @ObfuscatedName("hc.f")
    public class205 field2548 = new class205(128);

    @ObfuscatedName("hc.l")
    public int field2539 = 256;

    @ObfuscatedName("hc.s")
    public int field2560 = 1000000;

    @ObfuscatedName("hc.e")
    public int[] field2541 = new int[16];

    @ObfuscatedName("hc.a")
    public int[] field2542 = new int[16];

    @ObfuscatedName("hc.c")
    public int[] field2543 = new int[16];

    @ObfuscatedName("hc.p")
    public int[] field2544 = new int[16];

    @ObfuscatedName("hc.r")
    public int[] field2561 = new int[16];

    @ObfuscatedName("hc.m")
    public int[] field2546 = new int[16];

    @ObfuscatedName("hc.d")
    public int[] field2547 = new int[16];

    @ObfuscatedName("hc.z")
    public int[] field2545 = new int[16];

    @ObfuscatedName("hc.x")
    public int[] field2549 = new int[16];

    @ObfuscatedName("hc.n")
    public int[] field2551 = new int[16];

    @ObfuscatedName("hc.h")
    public int[] field2538 = new int[16];

    @ObfuscatedName("hc.o")
    public int[] field2553 = new int[16];

    @ObfuscatedName("hc.i")
    public int[] field2554 = new int[16];

    @ObfuscatedName("hc.k")
    public int[] field2555 = new int[16];

    @ObfuscatedName("hc.q")
    public int[] field2556 = new int[16];

    @ObfuscatedName("hc.y")
    public class222[][] field2557 = new class222[16][128];

    @ObfuscatedName("hc.av")
    public class222[][] field2558 = new class222[16][128];

    @ObfuscatedName("hc.ag")
    public class223 field2559 = new class223();

    @ObfuscatedName("hc.af")
    public boolean field2552;

    @ObfuscatedName("hc.az")
    public int field2563;

    @ObfuscatedName("hc.at")
    public int field2562;

    @ObfuscatedName("hc.ac")
    public long field2540;

    @ObfuscatedName("hc.am")
    public long field2564;

    @ObfuscatedName("hc.aw")
    public class225 field2565 = new class225(this);

    public class221() {
        this.method3957();
    }

    @ObfuscatedName("hc.f(II)V")
    public synchronized void method3941(int arg0) {
        this.field2539 = arg0;
    }

    @ObfuscatedName("hc.l(I)I")
    public int method3963() {
        return this.field2539;
    }

    @ObfuscatedName("hc.w(Lhg;Lik;Lct;II)Z")
    public synchronized boolean method3943(class226 arg0, class250 arg1, class101 arg2, int arg3) {
        arg0.method4112();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class216 var7 = (class216) arg0.field2617.method3781(); var7 != null; var7 = (class216) arg0.field2617.method3777()) {
            int var8 = (int) var7.field2497;
            class224 var9 = (class224) this.field2548.method3774((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method4296(var8);
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
                this.field2548.method3773(var11, (long) var8);
            }
            if (!var9.method4093(arg2, var7.field2514, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method4120();
        }
        return var5;
    }

    @ObfuscatedName("hc.s(B)V")
    public synchronized void method3981() {
        for (class224 var1 = (class224) this.field2548.method3781(); var1 != null; var1 = (class224) this.field2548.method3777()) {
            var1.method4091();
        }
    }

    @ObfuscatedName("hc.e(B)V")
    public synchronized void method3969() {
        for (class224 var1 = (class224) this.field2548.method3781(); var1 != null; var1 = (class224) this.field2548.method3777()) {
            var1.method3818();
        }
    }

    @ObfuscatedName("hc.d(Lhg;ZB)V")
    public synchronized void method4001(class226 arg0, boolean arg1) {
        this.method3945();
        this.field2559.method4045(arg0.field2618);
        this.field2552 = arg1;
        this.field2540 = 0L;
        int var3 = this.field2559.method4079();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2559.method4058(var4);
            this.field2559.method4052(var4);
            this.field2559.method4050(var4);
        }
        this.field2563 = this.field2559.method4057();
        this.field2562 = this.field2559.field2595[this.field2563];
        this.field2564 = this.field2559.method4056(this.field2562);
    }

    @ObfuscatedName("hc.x(I)V")
    public synchronized void method3945() {
        this.field2559.method4046();
        this.method3957();
    }

    @ObfuscatedName("hc.v(I)Z")
    public synchronized boolean method3986() {
        return this.field2559.method4064();
    }

    @ObfuscatedName("hc.g(IIB)V")
    public synchronized void method3947(int arg0, int arg1) {
        this.method3948(arg0, arg1);
    }

    @ObfuscatedName("hc.u(III)V")
    public void method3948(int arg0, int arg1) {
        this.field2544[arg0] = arg1;
        this.field2546[arg0] = arg1 & 0xFFFFFF80;
        this.method3949(arg0, arg1);
    }

    @ObfuscatedName("hc.o(III)V")
    public void method3949(int arg0, int arg1) {
        if (this.field2561[arg0] != arg1) {
            this.field2561[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2558[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("hc.i(IIII)V")
    public void method3975(int arg0, int arg1, int arg2) {
        this.method3942(arg0, arg1, 64);
        if ((this.field2551[arg0] & 0x2) != 0) {
            for (class222 var4 = (class222) this.field2565.field2613.method3828(); var4 != null; var4 = (class222) this.field2565.field2613.method3830()) {
                if (var4.field2572 == arg0 && var4.field2580 < 0) {
                    this.field2557[arg0][var4.field2571] = null;
                    this.field2557[arg0][arg1] = var4;
                    int var5 = (var4.field2576 * var4.field2575 >> 12) + var4.field2574;
                    var4.field2574 += arg1 - var4.field2571 << 8;
                    var4.field2575 = var5 - var4.field2574;
                    var4.field2576 = 4096;
                    var4.field2571 = arg1;
                    return;
                }
            }
        }
        class224 var6 = (class224) this.field2548.method3774((long) this.field2561[arg0]);
        if (var6 == null) {
            return;
        }
        class96 var7 = var6.field2603[arg1];
        if (var7 == null) {
            return;
        }
        class222 var8 = new class222();
        var8.field2572 = arg0;
        var8.field2573 = var6;
        var8.field2568 = var7;
        var8.field2584 = var6.field2607[arg1];
        var8.field2570 = var6.field2608[arg1];
        var8.field2571 = arg1;
        var8.field2582 = var6.field2612 * arg2 * arg2 * var6.field2605[arg1] + 1024 >> 11;
        var8.field2585 = var6.field2606[arg1] & 0xFF;
        var8.field2574 = (arg1 << 8) - (var6.field2602[arg1] & 0x7FFF);
        var8.field2577 = 0;
        var8.field2567 = 0;
        var8.field2583 = 0;
        var8.field2580 = -1;
        var8.field2579 = 0;
        if (this.field2554[arg0] == 0) {
            var8.field2581 = class106.method2182(var7, this.method3962(var8), this.method3952(var8), this.method3964(var8));
        } else {
            var8.field2581 = class106.method2182(var7, this.method3962(var8), 0, this.method3964(var8));
            this.method3951(var8, var6.field2602[arg1] < 0);
        }
        if (var6.field2602[arg1] < 0) {
            var8.field2581.method2183(-1);
        }
        if (var8.field2570 >= 0) {
            class222 var9 = this.field2558[arg0][var8.field2570];
            if (var9 != null && var9.field2580 < 0) {
                this.field2557[arg0][var9.field2571] = null;
                var9.field2580 = 0;
            }
            this.field2558[arg0][var8.field2570] = var8;
        }
        this.field2565.field2613.method3823(var8);
        this.field2557[arg0][arg1] = var8;
    }

    @ObfuscatedName("hc.k(Lhz;ZI)V")
    public void method3951(class222 arg0, boolean arg1) {
        int var3 = arg0.field2568.field1340.length;
        int var5;
        if (arg1 && arg0.field2568.field1342) {
            int var4 = var3 + var3 - arg0.field2568.field1341;
            var5 = (int) ((long) this.field2554[arg0.field2572] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2581.method2224(true);
            }
        } else {
            var5 = (int) ((long) this.field2554[arg0.field2572] * (long) var3 >> 6);
        }
        arg0.field2581.method2189(var5);
    }

    @ObfuscatedName("hc.q(IIII)V")
    public void method3942(int arg0, int arg1, int arg2) {
        class222 var4 = this.field2557[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2557[arg0][arg1] = null;
        if ((this.field2551[arg0] & 0x2) == 0) {
            var4.field2580 = 0;
            return;
        }
        for (class222 var5 = (class222) this.field2565.field2613.method3827(); var5 != null; var5 = (class222) this.field2565.field2613.method3829()) {
            if (var4.field2572 == var5.field2572 && var5.field2580 < 0 && var4 != var5) {
                var4.field2580 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("hc.y(IIIB)V")
    public void method3953(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("hc.av(IIB)V")
    public void method3954(int arg0, int arg1) {
    }

    @ObfuscatedName("hc.ae(IIB)V")
    public void method4020(int arg0, int arg1) {
        this.field2547[arg0] = arg1;
    }

    @ObfuscatedName("hc.ap(II)V")
    public void method3956(int arg0) {
        for (class222 var2 = (class222) this.field2565.field2613.method3827(); var2 != null; var2 = (class222) this.field2565.field2613.method3829()) {
            if (arg0 < 0 || var2.field2572 == arg0) {
                if (var2.field2581 != null) {
                    var2.field2581.method2194(Statics.field1356 / 100);
                    if (var2.field2581.method2255()) {
                        this.field2565.field2615.method1967(var2.field2581);
                    }
                    var2.method4038();
                }
                if (var2.field2580 < 0) {
                    this.field2557[var2.field2572][var2.field2571] = null;
                }
                var2.method3818();
            }
        }
    }

    @ObfuscatedName("hc.au(IB)V")
    public void method4028(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method4028(var2);
            }
            return;
        }
        this.field2541[arg0] = 12800;
        this.field2542[arg0] = 8192;
        this.field2543[arg0] = 16383;
        this.field2547[arg0] = 8192;
        this.field2545[arg0] = 0;
        this.field2549[arg0] = 8192;
        this.method3958(arg0);
        this.method3959(arg0);
        this.field2551[arg0] = 0;
        this.field2538[arg0] = 32767;
        this.field2553[arg0] = 256;
        this.field2554[arg0] = 0;
        this.method3961(arg0, 8192);
    }

    @ObfuscatedName("hc.aj(II)V")
    public void method3991(int arg0) {
        for (class222 var2 = (class222) this.field2565.field2613.method3827(); var2 != null; var2 = (class222) this.field2565.field2613.method3829()) {
            if ((arg0 < 0 || var2.field2572 == arg0) && var2.field2580 < 0) {
                this.field2557[var2.field2572][var2.field2571] = null;
                var2.field2580 = 0;
            }
        }
    }

    @ObfuscatedName("hc.ai(B)V")
    public void method3957() {
        this.method3956(-1);
        this.method4028(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2561[var1] = this.field2544[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2546[var2] = this.field2544[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("hc.an(II)V")
    public void method3958(int arg0) {
        if ((this.field2551[arg0] & 0x2) == 0) {
            return;
        }
        for (class222 var2 = (class222) this.field2565.field2613.method3827(); var2 != null; var2 = (class222) this.field2565.field2613.method3829()) {
            if (var2.field2572 == arg0 && this.field2557[arg0][var2.field2571] == null && var2.field2580 < 0) {
                var2.field2580 = 0;
            }
        }
    }

    @ObfuscatedName("hc.ay(II)V")
    public void method3959(int arg0) {
        if ((this.field2551[arg0] & 0x4) == 0) {
            return;
        }
        for (class222 var2 = (class222) this.field2565.field2613.method3827(); var2 != null; var2 = (class222) this.field2565.field2613.method3829()) {
            if (var2.field2572 == arg0) {
                var2.field2586 = 0;
            }
        }
    }

    @ObfuscatedName("hc.ak(IB)V")
    public void method3960(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3942(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3975(var6, var7, var8);
            } else {
                this.method3942(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3953(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2546[var12] = (var14 << 14) + (this.field2546[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2546[var12] = (var14 << 7) + (this.field2546[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2545[var12] = (var14 << 7) + (this.field2545[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2545[var12] = (this.field2545[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2549[var12] = (var14 << 7) + (this.field2549[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2549[var12] = (this.field2549[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2541[var12] = (var14 << 7) + (this.field2541[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2541[var12] = (this.field2541[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2542[var12] = (var14 << 7) + (this.field2542[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2542[var12] = (this.field2542[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2543[var12] = (var14 << 7) + (this.field2543[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2543[var12] = (this.field2543[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2551[var12] |= 0x1;
                } else {
                    this.field2551[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2551[var12] |= 0x2;
                } else {
                    this.method3958(var12);
                    this.field2551[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2538[var12] = (var14 << 7) + (this.field2538[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2538[var12] = (this.field2538[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2538[var12] = (var14 << 7) + (this.field2538[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2538[var12] = (this.field2538[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3956(var12);
            }
            if (var13 == 121) {
                this.method4028(var12);
            }
            if (var13 == 123) {
                this.method3991(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2538[var12];
                if (var15 == 16384) {
                    this.field2553[var12] = (var14 << 7) + (this.field2553[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2538[var12];
                if (var16 == 16384) {
                    this.field2553[var12] = (this.field2553[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2554[var12] = (var14 << 7) + (this.field2554[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2554[var12] = (this.field2554[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2551[var12] |= 0x4;
                } else {
                    this.method3959(var12);
                    this.field2551[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3961(var12, (var14 << 7) + (this.field2555[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3961(var12, (this.field2555[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3949(var17, this.field2546[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3954(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method4020(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3957();
            }
        }
    }

    @ObfuscatedName("hc.be(III)V")
    public void method3961(int arg0, int arg1) {
        this.field2555[arg0] = arg1;
        this.field2556[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("hc.bo(Lhz;I)I")
    public int method3962(class222 arg0) {
        int var2 = (arg0.field2576 * arg0.field2575 >> 12) + arg0.field2574;
        int var3 = ((this.field2547[arg0.field2572] - 8192) * this.field2553[arg0.field2572] >> 12) + var2;
        class219 var4 = arg0.field2584;
        if (var4.field2527 > 0 && (var4.field2522 > 0 || this.field2545[arg0.field2572] > 0)) {
            int var5 = var4.field2522 << 2;
            int var6 = var4.field2528 << 1;
            if (arg0.field2566 < var6) {
                var5 = arg0.field2566 * var5 / var6;
            }
            int var7 = (this.field2545[arg0.field2572] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2578 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2568.field1343 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1356 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("hc.bx(Lhz;B)I")
    public int method3952(class222 arg0) {
        class219 var2 = arg0.field2584;
        int var3 = this.field2543[arg0.field2572] * this.field2541[arg0.field2572] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2582 * var4 + 16384 >> 15;
        int var6 = this.field2539 * var5 + 128 >> 8;
        if (var2.field2529 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2577 * 1.953125E-5D * (double) var2.field2529) + 0.5D);
        }
        if (var2.field2520 != null) {
            int var7 = arg0.field2567;
            int var8 = var2.field2520[arg0.field2583 + 1];
            if (arg0.field2583 < var2.field2520.length - 2) {
                int var9 = (var2.field2520[arg0.field2583] & 0xFF) << 8;
                int var10 = (var2.field2520[arg0.field2583 + 2] & 0xFF) << 8;
                var8 += (var2.field2520[arg0.field2583 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2580 > 0 && var2.field2521 != null) {
            int var11 = arg0.field2580;
            int var12 = var2.field2521[arg0.field2579 + 1];
            if (arg0.field2579 < var2.field2521.length - 2) {
                int var13 = (var2.field2521[arg0.field2579] & 0xFF) << 8;
                int var14 = (var2.field2521[arg0.field2579 + 2] & 0xFF) << 8;
                var12 += (var2.field2521[arg0.field2579 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("hc.bf(Lhz;I)I")
    public int method3964(class222 arg0) {
        int var2 = this.field2542[arg0.field2572];
        return var2 < 8192 ? arg0.field2585 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2585) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("hc.c()Ldm;")
    public synchronized class108 method1972() {
        return this.field2565;
    }

    @ObfuscatedName("hc.p()Ldm;")
    public synchronized class108 method1982() {
        return null;
    }

    @ObfuscatedName("hc.r()I")
    public synchronized int method1974() {
        return 0;
    }

    @ObfuscatedName("hc.m([III)V")
    public synchronized void method1975(int[] arg0, int arg1, int arg2) {
        if (this.field2559.method4064()) {
            int var4 = this.field2560 * this.field2559.field2589 / Statics.field1356;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2540;
                if (this.field2564 - var5 >= 0L) {
                    this.field2540 = var5;
                    break;
                }
                int var7 = (int) ((this.field2564 - this.field2540 + (long) var4 - 1L) / (long) var4);
                this.field2540 += (long) var4 * (long) var7;
                this.field2565.method1975(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3972();
            } while (this.field2559.method4064());
        }
        this.field2565.method1975(arg0, arg1, arg2);
    }

    @ObfuscatedName("hc.z(I)V")
    public synchronized void method1977(int arg0) {
        if (this.field2559.method4064()) {
            int var2 = this.field2560 * this.field2559.field2589 / Statics.field1356;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2540;
                if (this.field2564 - var3 >= 0L) {
                    this.field2540 = var3;
                    break;
                }
                int var5 = (int) ((this.field2564 - this.field2540 + (long) var2 - 1L) / (long) var2);
                this.field2540 += (long) var2 * (long) var5;
                this.field2565.method1977(var5);
                arg0 -= var5;
                this.method3972();
            } while (this.field2559.method4064());
        }
        this.field2565.method1977(arg0);
    }

    @ObfuscatedName("hc.bl(I)V")
    public void method3972() {
        int var1 = this.field2563;
        int var2 = this.field2562;
        long var3 = this.field2564;
        while (this.field2562 == var2) {
            while (this.field2559.field2595[var1] == var2) {
                this.field2559.method4058(var1);
                int var5 = this.field2559.method4053(var1);
                if (var5 == 1) {
                    this.field2559.method4043();
                    this.field2559.method4050(var1);
                    if (this.field2559.method4066()) {
                        if (!this.field2552 || var2 == 0) {
                            this.method3957();
                            this.field2559.method4046();
                            return;
                        }
                        this.field2559.method4059(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3960(var5);
                }
                this.field2559.method4052(var1);
                this.field2559.method4050(var1);
            }
            var1 = this.field2559.method4057();
            var2 = this.field2559.field2595[var1];
            var3 = this.field2559.method4056(var2);
        }
        this.field2563 = var1;
        this.field2562 = var2;
        this.field2564 = var3;
    }

    @ObfuscatedName("hc.bs(Lhz;B)Z")
    public boolean method3968(class222 arg0) {
        if (arg0.field2581 != null) {
            return false;
        }
        if (arg0.field2580 >= 0) {
            arg0.method3818();
            if (arg0.field2570 > 0 && this.field2558[arg0.field2572][arg0.field2570] == arg0) {
                this.field2558[arg0.field2572][arg0.field2570] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("hc.ba(Lhz;[IIII)Z")
    public boolean method4027(class222 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2569 = Statics.field1356 / 100;
        if (arg0.field2580 >= 0 && arg0.field2581 == null || arg0.field2581.method2197()) {
            arg0.method4038();
            arg0.method3818();
            if (arg0.field2570 > 0 && this.field2558[arg0.field2572][arg0.field2570] == arg0) {
                this.field2558[arg0.field2572][arg0.field2570] = null;
            }
            return true;
        }
        int var5 = arg0.field2576;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2549[arg0.field2572] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2576 = var6;
        }
        arg0.field2581.method2195(this.method3962(arg0));
        class219 var7 = arg0.field2584;
        boolean var8 = false;
        arg0.field2566++;
        arg0.field2578 += var7.field2527;
        double var9 = (double) ((arg0.field2571 - 60 << 8) + (arg0.field2576 * arg0.field2575 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2529 > 0) {
            if (var7.field2525 > 0) {
                arg0.field2577 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2525 * var9) + 0.5D);
            } else {
                arg0.field2577 += 128;
            }
        }
        if (var7.field2520 != null) {
            if (var7.field2523 > 0) {
                arg0.field2567 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2523 * var9) + 0.5D);
            } else {
                arg0.field2567 += 128;
            }
            while (arg0.field2583 < var7.field2520.length - 2 && arg0.field2567 > (var7.field2520[arg0.field2583 + 2] & 0xFF) << 8) {
                arg0.field2583 += 2;
            }
            if (arg0.field2583 == var7.field2520.length - 2 && var7.field2520[arg0.field2583 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2580 >= 0 && var7.field2521 != null && (this.field2551[arg0.field2572] & 0x1) == 0 && (arg0.field2570 < 0 || this.field2558[arg0.field2572][arg0.field2570] != arg0)) {
            if (var7.field2524 > 0) {
                arg0.field2580 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2524 * var9) + 0.5D);
            } else {
                arg0.field2580 += 128;
            }
            while (arg0.field2579 < var7.field2521.length - 2 && arg0.field2580 > (var7.field2521[arg0.field2579 + 2] & 0xFF) << 8) {
                arg0.field2579 += 2;
            }
            if (arg0.field2579 == var7.field2521.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2581.method2258(arg0.field2569, this.method3952(arg0), this.method3964(arg0));
            return false;
        }
        arg0.field2581.method2194(arg0.field2569);
        if (arg1 == null) {
            arg0.field2581.method1977(arg3);
        } else {
            arg0.field2581.method1975(arg1, arg2, arg3);
        }
        if (arg0.field2581.method2255()) {
            this.field2565.field2615.method1967(arg0.field2581);
        }
        arg0.method4038();
        if (arg0.field2580 >= 0) {
            arg0.method3818();
            if (arg0.field2570 > 0 && this.field2558[arg0.field2572][arg0.field2570] == arg0) {
                this.field2558[arg0.field2572][arg0.field2570] = null;
            }
        }
        return true;
    }
}
